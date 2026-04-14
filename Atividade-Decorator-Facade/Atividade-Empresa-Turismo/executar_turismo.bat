@echo off
SETLOCAL
set SRC_DIR=src
set OUT_DIR=out_turismo
set MAIN_CLASS=br.edu.ifg.turismo.MainFacade

if not exist %OUT_DIR% mkdir %OUT_DIR%

dir /s /b %SRC_DIR%\br\edu\ifg\turismo\*.java > sources_turismo.txt
javac -d %OUT_DIR% @sources_turismo.txt
del sources_turismo.txt

echo ------------------------------------
java -cp %OUT_DIR% %MAIN_CLASS%
echo ------------------------------------
pause