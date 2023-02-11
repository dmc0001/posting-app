# posting-app
## Overview
This is an Android application that showcases the usage of RxJava with Retrofit for fetching data from an API. The app fetches posts from a RESTful API and displays them in a list.

## Features
Display a list of posts
Show the title, body, and user of each post
## Technical details
#### Architecture
- The app uses the MVVM (Model-View-ViewModel) architecture pattern. following libraries:
- Retrofit: for making HTTP requests
- RxJava: for asynchronous and event-based programming
- AndroidX: for backwards compatibility
- It fetches the data from a REST API hosted at https://jsonplaceholder.typicode.com/.
- The data is displayed in a CardView inside a RecyclerView.
## Code structure
The code is organized into three main packages:
- `data` : contains the implementation of Retrofit and RxJava for fetching the posts from the API.
- `pojo` : contains the model class PostModel used to map the response from the API.
- `ui.main` : contains the implementation of the ViewModel class PostViewModel used to handle the data and pass it to the UI.

## Prerequisites
- Android Studio 3.0 or later
- An Android device or emulator with API level 21 or higher
## Getting started
1. Clone or download the repository ``` $ git clone https://github.com/[username]/[repository].git ```
2. Open the project in Android Studio
3. Connect an Android device or start an emulator
4. Click on the "Run" button in Android Studio to install and run the app on the device/emulator.
## Conclusion
This app serves as a simple example of how to fetch data from a REST API and display it in an Android app using Retrofit and Gson. With a few modifications, it can serve as a starting point for a more complex application.
