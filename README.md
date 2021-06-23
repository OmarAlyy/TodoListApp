# TodoListApp
Kotlin-Mvvm-Hilt-Room-RX

Main Goals:
- User can write simple todo (title, body)
- User can save the todo item , the todo item is saved in database
- User can find his todo item in todo list
- User can tap on the todo item to check it or update it
- User can swipe to delete
- Show notification to user, 10 min before todo item time



# Screenshots
|  |  |  |
|:-:|:-:|:-:|
| ![Fist](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404738_google-pixel4-justblack-portrait.png?raw=true) | ![3](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404778_google-pixel4-justblack-portrait.png?raw=true) | ![3](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404835_google-pixel4-justblack-portrait.png?raw=true) |
|  |  |  |
| ![4](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404827_google--pixel4-justblack-portrait.png?raw=true) | ![5](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404964_google-pixel4-justblack-portrait.png?raw=true) | ![6](https://github.com/OmarAlyy/TodoListApp/blob/main/readme-images/Screenshot_1624404997_google-pixel4-justblack-portrait.png?raw=true) |


## Libraries used

- [Kotlin](https://kotlinlang.org/docs/reference/) 
- [MVVM](https://developer.android.com/jetpack/docs/guide) (Architecture) and DataBinding
- [Room](https://developer.android.com/topic/libraries/architecture/room) (Persistence)
- [RxAndroid](https://github.com/ReactiveX/RxAndroid) (Reactive)
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) (Dependency injection)
- [WorkManager](https://developer.android.com/topic/libraries/architecture/workmanager) (Schedule tasks)
- [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started) (Navigation)
- [ViewBinding](https://developer.android.com/topic/libraries/view-binding) (generates a binding class for each XML layout file)
- [Extension Functions](https://kotlinlang.org/docs/extensions.html) (extend a class with new functionality without having to inherit)
- [Espresso](https://developer.android.com/training/testing/espresso) (Android UI tests)


**MVVM**

**ViewModel:** Provides data to the UI. Acts as a communication center between the Repository and the UI. Hides where the data originates from the UI. ViewModel instances survive configuration changes.


<img src="https://i.imgur.com/UsNsFfN.png" />

