package com.example.david.simplefirebase.implementation;

import com.example.david.simplefirebase.dao.UserDao;
import com.example.david.simplefirebase.model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.LinkedList;
import java.util.List;


public class DaoUserImplementation implements UserDao {
    private DatabaseReference mDatabase;
    private String userId;
    private List<User> users;


    public DaoUserImplementation(){
        mDatabase = FirebaseDatabase.getInstance().getReference("users");
        users = new LinkedList<>();
    }

    @Override
    public List<User> select() {
        return users;
    }

    @Override
    public void insert(User user) {
        String userId = mDatabase.push().getKey();
        mDatabase.child(userId).setValue(user);

        addUserChangeListener();
    }

    @Override
    public void update(User user) {
        mDatabase.child(user.getUserId()).setValue(user);
    }

    @Override
    public void delete(User user) {
        mDatabase.child(user.getUserId()).removeValue();
    }

    private void addUserChangeListener(){
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(users.size() != 0){
                    users.clear();
                }

                DataSnapshot userSnapshot = dataSnapshot.child("users");
                Iterable<DataSnapshot> userChildren = userSnapshot.getChildren();

                for(DataSnapshot userChild : userChildren){
                    User user = userChild.getValue(User.class);
                    user.setUserId(userChild.getKey());
                    users.add(user);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
