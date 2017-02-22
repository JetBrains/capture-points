# IDEA debugger Capture Points


Read more about the feature in the [Jetbrains blog](https://blog.jetbrains.com/idea/2017/02/intellij-idea-2017-1-eap-extends-debugger-with-async-stacktraces/).

## To use the capture points
 1. download the xml settings file:
  1. click on the required xml file
  2. right click on Raw and choose "save link as..."
 2. go to IDEA Settings | Build, Execution, Deployment | Debugger | Capture and use the Import action
 4. enable the points you need
 5. start debugging

## How to write your own
**Capture point** is a place in your program where debugger collects and saves the stack frames for later use.
It is specified by the method name (and containing class) and the key expression which is evaluated and the resulting object is used later to get the information.
So first go to your IDEA Settings | Build, Execution, Deployment | Debugger | Capture and create a new capture point.
Specify the method and the key expression. Usually the key expression is just a parameter name.

```
For example, javax.swing.SwingUtilities.invokeLater with the key "doRun"
will capture all invocations of the invokeLater and associate them with the Runnable instance parameter
```

When the debugger stops it starts matching stack frames with **insertion point**, which is another method and expression. If the method is matched, it evalautes the expression and if the value has some related stack information, it replaces the rest of the stack with it. This way you see what "was happening" at the related capture point.

```
For example, java.awt.event.InvocationEvent.dispatch with the insert key "runnable"
will insert information captured for invokeLater to the place where the Runnable is executed
```

more implementation details [here](https://blog.jetbrains.com/idea/2017/02/intellij-idea-2017-1-eap-extends-debugger-with-async-stacktraces/#comment-403133)
