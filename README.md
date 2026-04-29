# Android Firebase Example Lab

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Firebase](https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

A native Android example project for practicing Firebase integration. It keeps the Android/Firebase Gradle setup and source structure while excluding project-specific Firebase credentials.

## What It Does

- Demonstrates Firebase-enabled Android project configuration
- Uses the Google Services Gradle plugin
- Keeps a standard Android app layout and activity structure
- Shows how Firebase configuration fits into a native Android project

## Tech Stack

- Android
- Kotlin / Java project structure
- Firebase
- Gradle

## Firebase Setup

The original `google-services.json` file was excluded before publishing. To run the project:

1. Create or select a Firebase project.
2. Add an Android app in Firebase Console.
3. Download `google-services.json`.
4. Place it under `app/google-services.json`.
5. Sync Gradle in Android Studio.

## Repository Notes

Firebase config files, local SDK settings, build folders, and APK outputs are intentionally excluded.

## License

MIT License.
