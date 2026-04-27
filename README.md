
---

# Penalty Shootout Game (Java Console)

Simulación de una tanda de penales en consola desarrollada en Java.
El proyecto busca aplicar fundamentos de programación estructurada mediante una lógica simple pero completa de juego.

---

## Características

* Sistema de turnos (5 rondas obligatorias)
* Mecánica de tiro y atajada
* IA basada en generación aleatoria
* Validación de entradas del usuario (zonas 1–9)
* Resultado final con conteo de goles

---

## Conceptos aplicados

Este proyecto utiliza varios pilares básicos de Java:

### 🔹 Estructuras condicionales (`if / else`)

Se emplean para determinar si un tiro resulta en gol o es atajado, comparando la elección del jugador con la de la máquina.

### 🔹 Estructuras iterativas (`do / while`)

* Controlan los 5 turnos del juego
* Validan que el usuario ingrese valores correctos (1–9)

### 🔹 Generación aleatoria

Uso de `ThreadLocalRandom` para simular decisiones de la IA.

### 🔹 Entrada y salida por consola

Uso de `Scanner` para interacción con el jugador.

---

## Cómo jugar

1. El juego consta de 5 turnos.
2. En cada turno:

    * Realizas un tiro (eliges una zona del 1 al 9)
    * Luego intentas atajar
3. Si eliges la misma zona que la máquina → **Atajada**
4. Si no coinciden → **Gol**
5. Al final, gana quien tenga más goles.

---

## 🛠Cómo ejecutar

1. Clona el repositorio
2. Compila el archivo:

```bash
javac Main.java
```

3. Ejecuta el programa:

```bash
java Main
```

---

## Roadmap

* [ ] Migrar a Programación Orientada a Objetos (clases como `Jugador`, `Partida`)
* [ ] Implementar manejo de excepciones (`try-catch`) para entradas inválidas
* [ ] Añadir sistema de **Muerte Súbita** en caso de empate
* [ ] Mejorar feedback visual en consola (marcador más claro)

---
