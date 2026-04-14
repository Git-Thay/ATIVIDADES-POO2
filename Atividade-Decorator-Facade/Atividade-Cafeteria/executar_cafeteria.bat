@echo off
SETLOCAL

set SRC_DIR=src
set OUT_DIR=out
set MAIN_CLASS=br.edu.ifg.cafeteria.Main

echo [1/3] Criando diretorio de saida...
if not exist %OUT_DIR% mkdir %OUT_DIR%

echo [2/3] Compilando o projeto Java...
:: Este comando busca todos os .java recursivamente na pasta src
dir /s /b %SRC_DIR%\*.java > sources.txt
javac -d %OUT_DIR% -sourcepath %SRC_DIR% @sources.txt
del sources.txt

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo Erro na compilacao! Verifique o codigo.
    pause
    exit /b %ERRORLEVEL%
)

echo [3/3] Executando a aplicacao...
echo ------------------------------------
java -cp %OUT_DIR% %MAIN_CLASS%
echo ------------------------------------

echo.
echo Processo concluido.
pause