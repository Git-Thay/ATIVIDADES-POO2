@echo off
echo --- COMPILANDO O PROJETO SINGLETON (IFG) ---

:: Entra na pasta src onde os pacotes realmente começam
cd src

:: Compila as classes usando o caminho correto das pastas
javac br/edu/ifg/singleton/model/Logger.java br/edu/ifg/singleton/main/Main.java

if %errorlevel% neq 0 (
    echo.
    echo [ERRO] Falha na compilacao. Verifique se os arquivos estao nas pastas corretas.
    pause
    exit /b
)

echo [OK] Compilacao concluida!
echo.
echo --- EXECUTANDO O PROGRAMA ---
echo.

:: Executa a Main (o Java entende que deve procurar a partir da pasta src atual)
java br.edu.ifg.singleton.main.Main

echo.
echo --- FIM DA EXECUCAO ---
pause
