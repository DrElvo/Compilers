@echo off
echo ============================================
echo Cleaning old builds... 
echo(
cmd /c "gradlew -q :task2:clean"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Building the project...
echo( 
cmd /c "gradlew -q :task2:build"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Input: Demo1.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task2\Demo1.dl | .\gradlew -q :task2:run | java -cp "H:\Uni Year 2 - part 1\232560\rars_27a7c1f.jar" "H:\Uni Year 2 - part 1\232560\RARSInterface.java"
