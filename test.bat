@echo off
java -cp .;C:/AtomicGames/gson-2.7.jar;C:/AtomicGames/AtomicGamesReal/bin/ TestParse %*
EXIT /B %ERRORLEVEL%