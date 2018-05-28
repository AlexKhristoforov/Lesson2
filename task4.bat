@>nul MD ".\dist
javac -encoding utf8 -d dist src/task4.java
java -cp dist task4
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist