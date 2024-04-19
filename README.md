# Command Pattern Example 🛠️

## Overview ℹ️
This repository contains a simple example of the Command Pattern implemented in Java. The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

## Components 🔧
- **Command**: Defines an interface for executing an operation.
- **Concrete Commands**: Implement the Command interface and encapsulate specific actions to be executed.
- **Receiver**: Represents the object that performs the action associated with a command.
- **Invoker**: Holds a reference to a command object and invokes the command when needed.

## Usage 🚀
1. Create instances of receivers (e.g., `Camera`) and commands (e.g., `CameraRight`, `CameraLeft`).
2. Configure invokers (e.g., `CameraControl`) with appropriate commands.
3. Invoke commands through invokers to perform actions on receivers.


