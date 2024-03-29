Toy Robot Simulator
===================

Description
-----------
- The application is a simulation of a toy robot moving on a square tabletop,of dimensions 5 units x 5 units.
- There are no other obstructions on the table surface.
- Application can read in commands of the following form:
              
      PLACE X,Y,F
      MOVE
      LEFT
      RIGHT
      REPORT
      
- PLACE will put the toy robot on the table in position X,Y and facing NORTH,
  SOUTH, EAST or WEST.
- The origin (0,0) can be considered to be the SOUTH WEST most corner.
- The first valid command to the robot is a PLACE command, after that, any
  sequence of commands may be issued, in any order, including another PLACE
  command. The application should discard all commands in the sequence until
  a valid PLACE command has been executed.
- MOVE will move the toy robot one unit forward in the direction it is
  currently facing.
- LEFT and RIGHT will rotate the robot 90 degrees in the specified direction
  without changing the position of the robot.
- REPORT will announce the X,Y and F of the robot. This can be in any form,
  but standard output is sufficient.

- A robot that is not on the table can choose the ignore the MOVE, LEFT, RIGHT
  and REPORT commands.
  
Build and Play
--------------

* JDK 1.8 required
* Build and Play (Mac or Linux)
```bash
    $ cd {PROJECT_DIR}
    $ ./gradlew clean build
    $ java -jar build/libs/toyrobot-simulator-1.0-SNAPSHOT.jar
    $ Welcome to ToyRobotSimulator, Lets play.
      Valid command to operate Robot are : 
      PLACE X,Y,F
      MOVE
      LEFT
      RIGHT
      REPORT
      
      PLACE 3,2,NORTH
      MOVE
      LEFT
      MOVE
      REPORT
      Robot's current position (x,y,Facing) is : 2,3,WEST
```