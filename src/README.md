## Revisão — Casa de Sucos

As classes e os testes JUnit 6 estão neste projeto. Abra a pasta `ProgMod_Lab_Sucos` no VS Code.

Para executar os testes pelo terminal na raiz do projeto:

```bash
javac -cp "lib/junit-platform-console-standalone-6.1.3.jar" -d bin src/*.java src/test/*.java
java -jar lib/junit-platform-console-standalone-6.1.3.jar execute --class-path bin --scan-class-path
```

Observação: o enunciado não informa valores numéricos para as frutas; foram usados valores-base de exemplo em `EFruta.java`. Ajuste-os caso o professor tenha fornecido valores em aula.
