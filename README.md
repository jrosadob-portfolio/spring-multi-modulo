# WebMath

- Run & Debug
- Click in "> Solution:6701"
- See: webmath.http for run every endpoint
- Click in "Testing"
- Click in "Webmath"

# Features

- Use lombok for @Slf4j
- Use @Value to retrieve server.port from properties
- Can't use private static Environment env in main, becaus can't initialize static var in constructor.
- Test de cada endpoint
- Test de cobertura usando JaCoCo (Excluye la class: WebmathApplication.class)
- Para generar el archivo de cobertura: site/jacoco/index.html use:
  ```bash
  mvn clean test
  ```

# Componentes

- math. Libreria matematica (simulación). Contiene servicios y entidades
- webmath. Servicio web que utiliza la libreria matematica
- Se requiere el pom.xml externo al nivel de solution

# Package notes

- El package se forma sin incluir src/main/java
- El package para math seria: com.math
- El package para webmath seria: com.webmath
- Requiere @ComonentScan() en el main para incluir los beans de com.math y así poderlos inyectar

  ```java
  @ComponentScan(basePackages = { "com.webmath", "com.math" })
  ```
