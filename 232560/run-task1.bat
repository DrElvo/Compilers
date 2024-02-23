@echo off
echo ============================================
echo Cleaning old builds... 
echo(
cmd /c "gradlew -q :task1:clean"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Building the project...
echo( 
cmd /c "gradlew -q :task1:build"
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
cmd /c "type .\task1\Demo1.dl | .\gradlew -q :task1:run --args="1""
echo(
echo ============================================
echo(
echo Input: Demo2.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo2.dl | .\gradlew -q :task1:run
echo(
echo ============================================
echo(
echo Input: Demo3.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo3.dl | .\gradlew -q :task1:run
echo(
echo ============================================
echo ============================================
echo(
echo Input: Demo4.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo4.dl | .\gradlew -q :task1:run
echo(
echo ============================================
