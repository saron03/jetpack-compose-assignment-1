# Jetpack Compose Academic Course List App

This project demonstrates the creation of a simple Android application using Jetpack Compose, which displays a list of academic courses. The app follows Material 3 Design principles and incorporates state management, animations, and theming to provide a modern user experience.

- Name: Saron Yitbareck 
- ID: UGR/3774/15
- Section: 04

## Features

- **Course List**: Displays a list of academic courses with essential information (Course Title, Code, and Credit Hours).
- **Expandable Course Cards**: Each course card can be expanded to reveal more detailed information (Description and Prerequisites).
- **State Management**: Each CourseCard maintains its expanded/collapsed state individually using `rememberSaveable` for persistent state across recompositions.
- **Animations**: The transition between the expanded and collapsed states of each course is animated with `animateContentSize`.
- **Material 3 Design**: The app uses Material 3 components such as `Card`, `Text`, and `Icon`, along with appropriate theming and styling.
- **Lazy Column**: Uses `LazyColumn` to efficiently display the list of courses, ensuring optimal performance for longer lists.
- **Onboarding Screen**: A simple onboarding screen is shown when the app is first launched, with a button to proceed to the course list.

## Requirements

- Android Studio (Arctic Fox or higher)
- Kotlin 1.5 or higher
- Jetpack Compose (1.0 or higher)
- Android API Level 21 (Lollipop) or higher

## Setup

1. Clone the repository:
    ```bash
    git clone git@github.com:saron03/jetpack-compose-assignment-1.git
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Build and run the project on an emulator or device.

## Key Concepts

- **Composable Functions**: The app's UI is entirely built using composable functions with the `@Composable` annotation.
- **State Management**: The expanded state of each `CourseCard` is managed using `rememberSaveable` and updated via a `clickable` modifier.
- **Animations**: The `animateContentSize` modifier is used to animate the expansion and collapse of course details.
- **Performance**: The `LazyColumn` composable is used for efficient rendering of the course list.
- **Material 3 Theming**: The app uses Material 3 components and theming to ensure a consistent and modern look across devices.

