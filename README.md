# TaskMadar

TaskMadar is a simple Android application built with modern development tools. It allows users to manage a list of people by adding their information and storing it locally using a Room database.

## Features

- **Add User:** A screen to input user details including Name, Age, Job Title, and Gender.
- **User List:** A screen to display all added users fetched from the local database.
- **Delete User:** Capability to remove users from the list.
- **Persistent Storage:** Data is saved locally using Room, ensuring it persists across app restarts.

## Tech Stack

- **Language:** [Kotlin](https://kotlinlang.org/)
- **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Architecture:** MVVM (Model-View-ViewModel) with Clean Architecture principles (Use Cases).
- **Dependency Injection:** [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- **Database:** [Room SQLite](https://developer.android.com/training/data-storage/room)
- **Asynchronous Programming:** [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
- **Navigation:** Jetpack Compose Navigation

## Project Structure

The project follows a clean architecture pattern:
- **Domain:** Contains the `UserModel` and Use Cases (`AddUserUseCase`, `GetUsersUseCase`, `DeleteUserUseCase`).
- **Data (implied):** Room Database, DAOs, and Repository implementations.
- **Presentation:** UI components (Compose) and `UsersViewModel` for state management.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/IbrahimAbdin/TaskMadar.git
   ```
2. Open the project in **Android Studio (Ladybug or newer)**.
3. Sync the project with Gradle files.
4. Run the app on an emulator or a physical device.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
