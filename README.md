# Simple Firebase
This project is a simple example of Firebase being used as a Realtime Database using Android. For more information on Firebase please visit the [Official Site](https://firebase.google.com/).

Firebase realtime database is a schemaless database in which the data is stored in JSON format. Basically the entire database is a big JSON tree with multiple nodes.

## Getting Started
After you download the project you would need to register the project with Firebase, it will generate a google-services.json file which you need to include in your project.

Go to the [Firebase Console](https://console.firebase.google.com/) to register you project. You will need to create a google account if you don't already have one.

Once on the Firebase Console, go ahead and click on Create Project and enter your project Name.

![Create a Project](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/Add-a-Project.png)

Once created, you will be sent to a Get Started Here page and select **Add Firebase to you Android App**

![Get Started Here](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/get-started-here.png)

Include the **Android package name** for the optional boxes you can leave blank.

![Package Name](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/package-name.png)

Download the google-services.json file and include it in your project's app directory.

![Google Services](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/google-services.png)

Follow the instructions to add the correct dependencies to you project (This project will already have the dependencies, therefore you can skip this step).

![Dependencies](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/dependencies.png)

To see your database click on the hamburger icon on the top left corner and select **Database** and select **Get Started** for the Realtime Database.

![Database](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/database.png)

Right now, you database contains nothing. Run the Simple Firebase Application in Android Studio and create a user.

![Create User](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/create-user.png)

You should see the entry in you Firebase database.

![User](https://github.com/dvdprr6/SimpleFirebase/blob/master/images/user.png)

This Simple Firebase project you be enough to get you started.
