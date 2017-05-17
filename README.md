# Ultimate Gems Mod

This is the Ultimate Gems Mod, designed to make existing gems more useful (if they weren't useful already) while also adding new ores to find, gems and ingots to use, new mobs to fight, and someday, an entirely new dimension to explore and live in.

Releases are available in the releases tab (if there are any), but if you wish to build this mod from source code, please follow these instructions.

## Prerequisites

You need these to start working on this mod:
* Java Development Kit 7 or 8 (JDK). Using JDK 8 is recommended.
* An IDE (must be Eclipse or IntelliJ IDEA).
* Some knowledge of how to program in Java.

## Windows

1. On Windows 10 or 8.1, go to the search bar and type "cmd". On Windows 7, go to "Run", and then type "cmd" and press "Enter." A command prompt should load.
2. Use cd to enter the directory for this project. An example is shown below:

`cd C:\Users\<username>\Downloads\UltimateGemsMod-master\ `

3. Type this into the prompt:

` gradlew setupdecompworkspace`

Only move on to step 4 if everything is successful. If it fails, check your network connection and try again.

4. Type one of these into the command prompt:

    Eclipse users:
    
    `gradlew eclipse`
    
    IntelliJ IDEA users, the steps are different.
    * First, start up IntelliJ IDEA.
    * Next, you need to import this. Go to File > New > Project from existing sources...
    * Click on "build.gradle". Click "Finish" and allow the IDE to import the project.
    * Close the IDE when it is complete.
    * Type this into the command prompt:
    
    `gradlew genIntellijRuns`
    
5. If you're on Eclipse, switch your workspace to /eclipse/. On IntelliJ IDEA, go to Run > Edit Configurations, and set "Use classpath of module" to one with the "_main" ending on it.

## Mac or Linux

1. Start a Terminal. On Linux, you can find this by searching for it in your start menu. For Mac users, go to Launchpad > Utilties.

2. Use cd to enter the directory for this project. An exmple is shown below:

`cd ~/Desktop/UltimateGemsMod-master`

3. Type this into the terminal:

`./gradlew setupdecompworkspace`

Do not move on to step 4 if step 3 fails. Try again, and then move on if it succeeds.

4. Type one of these into the Terminal:
    
    Eclipse users:
    
    `./gradlew eclipse `
    
    IntelliJ IDEA users, the steps are different:
    * First, start up IntelliJ IDEA.
    * Next, you need to import this. Go to File > New > Project from existing sources...
    * Click on "build.gradle". Click "Finish" and allow the IDE to import the project.
    * Close the IDE when it is complete.
    * Type this into the Terminal:
    
    `./gradlew genIntellijRuns`
    
5. If you're on Eclipse, switch your workspace to /eclipse/. On IntelliJ IDAE, go to Run > Edit Configurations, and set "Use classpath of module" to one with the "_main" ending on it.

## Building the project

Use this to build the project.

* Windows users, use this in the command prompt:

` gradlew build`

* Mac or Linux users, use this in the Terminal:

` ./gradlew build`

Make sure you're in the same directory as build.gradle before you type this in. Your product will most likely be called "modid.jar".

## Issues

If you find any errors with the code or problems while using the mod, you may [submit an issue ticket here.](https://www.github.com/tangalbert919/UltimateGemsMod/issues)

Your issue ticket must have the following for me to figure out how to fix this problem:
* A full crash report (if the mod crashed). If the mod did not crash, then you do not need to do this.
* A screenshot for any weird glitches or rendering problems (so I know what I need to do).
* If this is a new feature, please explain what this feature is and why I should add it.

Your issue will be closed if:
* It is a duplicate issue that was fixed long ago.
* It does not fulfill any of the requirements listed above.

## Pull requests

If you have added in anything and wish to merge your work with mine, you can [create a pull request here.](https://www.github.com/tangalbert919/UltimateGemsMod/pulls)

## TODO
* Make this work with Tinkers' Construct.
* Add more metals and other shiny gems.
* Create a beta build for the general public.
* Add more translations.