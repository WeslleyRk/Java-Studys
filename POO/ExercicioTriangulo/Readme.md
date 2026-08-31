# Exercício - Triângulos

## Sobre o exercício

Neste exercício, o objetivo é criar um programa em Java que trabalhe com dois triângulos: **X** e **Y**.

Cada triângulo possui três medidas de lados (`a`, `b` e `c`).

O programa deve:

- Ler as medidas dos lados do triângulo X;
- Ler as medidas dos lados do triângulo Y;
- Calcular a área de cada triângulo;
- Comparar as duas áreas;
- Informar qual triângulo possui a maior área.

## Fórmula utilizada

Para calcular a área, é utilizada a **Fórmula de Heron**.

Primeiro é calculado o semiperímetro:

`p = (a + b + c) / 2`

Depois, a área:

`area = √(p × (p - a) × (p - b) × (p - c))`

## Objetivo do exercício

Praticar conceitos básicos de **Programação Orientada a Objetos (POO)** em Java, como:

- Criação de classes;
- Criação de objetos;
- Atributos;
- Métodos;
- Uso de `Scanner`;
- Cálculos e comparação de valores.