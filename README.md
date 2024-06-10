# NumberSetAnalyzer
This app is use to find intersection, union and max number of sets.

## Features
Three Input Text Boxes: Users can enter three lists of comma-separated numbers.
Calculate Button: A button that calculates and displays:
The intersection of the three lists.
The union of the three lists.
The highest number from all the lists.
ViewModel Integration: Uses ViewModel to handle configuration changes and maintain UI-related data.
SOLID Principles: Adheres to SOLID principles for clean and maintainable code.

## ScreenShots
https://github.com/abhinavsingh1998/NumberSetAnalyzer/assets/88830847/fc3c3aa7-9465-4230-b21c-6524c6462a5b



## Architecture
The app follows the MVVM (Model-View-ViewModel) architecture pattern to separate concerns and improve testability and maintainability.

## Main Components
Activity: Hosts the UI components and interacts with the ViewModel.
ViewModel: Maintains the UI-related data and handles the business logic.
Model: Includes the data classes and utility functions for parsing and calculating the results.

## Key Classes
MainActivity: The main activity that hosts the UI.
MainViewModel: The ViewModel that handles the business logic and interacts with the Calculator and InputParser.
Calculator: An interface defining the contract for calculating intersection, union, and the highest number.
CalculatorImpl: Implementation of the Calculator interface.
InputParser: An interface for parsing the input strings into sets of integers.
InputParserImpl: Implementation of the InputParser interface.
Installation

## Usage
Enter Numbers:
Enter comma-separated numbers in each of the three input text boxes.

Calculate:
Press the "Calculate" button to see the intersection, union, and highest number displayed on the screen.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contributing
Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature-branch).
Open a pull request.

## Acknowledgements
Thanks to the contributors of Kotlin and Android Jetpack libraries.
Icons by Material Design Icons.

## Contact
For any questions or suggestions, feel free to open an issue or contact me at apratap0123@gmail.com
