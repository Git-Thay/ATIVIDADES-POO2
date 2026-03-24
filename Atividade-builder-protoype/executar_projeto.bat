@echo off
TITLE Executando Projeto IFG - Thays Marques
echo =========================================
echo    COMPILANDO E EXECUTANDO PROJETO
echo =========================================

REM 1. Compilação (entrando na src e apontando para os arquivos)
echo [1/2] Compilando arquivos Java...
javac -d out -sourcepath src src/br/edu/ifg/atividades/Main.java

if %errorlevel% neq 0 (
    echo.
    echo [ERRO] Falha na compilacao. Verifique os erros acima.
    pause
    exit /b
)

REM 2. Execução (apontando para a pasta de saída 'out')
echo [2/2] Compilacao concluida. Iniciando programa...
echo.
java -cp out br.edu.ifg.atividades.Main

echo.
echo =========================================
echo Processo finalizado.
pause