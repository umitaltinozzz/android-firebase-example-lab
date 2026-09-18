# Android Firebase Example Lab

**Android Firebase integration coursework example.**

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Firebase](https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Archived-gray?style=for-the-badge)

---

## Overview

A native Android example project for practicing Firebase integration. It keeps the Android/Firebase Gradle setup and source structure while excluding project-specific Firebase credentials.

## Project Status

Completed coursework project, archived as part of my portfolio. Not actively maintained.

## Features

- Demonstrates Firebase-enabled Android project configuration
- Uses the Google Services Gradle plugin
- Keeps a standard Android app layout and activity structure
- Shows how Firebase configuration fits into a native Android project

## Tech Stack

| Layer | Technology |
|---|---|
| Platform | Android |
| Language | Kotlin / Java project structure |
| Backend | Firebase |
| Build | Gradle |

## Getting Started

### Firebase Setup

The original `google-services.json` file was excluded before publishing. To run the project:

1. Create or select a Firebase project.
2. Add an Android app in Firebase Console.
3. Download `google-services.json`.
4. Place it under `app/google-services.json`.
5. Sync Gradle in Android Studio.

## Project Structure

```
android-firebase-example-lab/
├── app/
│   ├── src/
├── gradle/wrapper/
├── LICENSE
├── README.md
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
```

Firebase config files, local SDK settings, build folders, and APK outputs are intentionally excluded.

## License

[MIT License](./LICENSE)
