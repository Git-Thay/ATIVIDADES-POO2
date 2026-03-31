@echo off
setlocal

:: 1. Nome da classe principal (com o pacote)
set MAIN_CLASS=br.edu.ifg.atividades.Main

:: 2. Limpando e criando a pasta bin
if exist bin rd /s /q bin
mkdir bin

echo [1/2] Compilando o projeto...
:: O comando abaixo busca TODOS os arquivos .java dentro de subpastas do src
dir /s /b src\*.java > lista_arquivos.txt
javac -d bin @lista_arquivos.txt
del lista_arquivos.txt

if %errorlevel% neq 0 (
    echo.
    echo [ERRO] Falha na compilacao! Verifique se os nomes dos pacotes estao corretos.
    pause
    exit /b
)

echo [2/2] Executando %MAIN_CLASS%...
echo ---------------------------------------
:: Executa apontando para a pasta bin
java -cp bin %MAIN_CLASS%
echo ---------------------------------------

pause