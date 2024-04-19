# PLAYBALLS

## Descripción
Este proyecto esta orientado al proceso de aprendizaje del manejo de hilos y reforzar la utilización del patrón de diseño MVP.

### Juego:
Este juego tiene varias versiones:
Versión 1: La desarrollada por el profesor, Una única figura se mueve de derecha a izquierda en la pantalla, y se podrá detener o iniciar  el moviemiento con los botanes de la interface GUI.
Versión 2: Desarrollada por los estudiantes 

## Prerequisitos
Jdk 17

## Actividades a realizar por parte de los estudiantes

- Realizar modificaciones que mueva n elementos de tal manera que queden rebotando, unos de manera horizontal y otros de manera vertical.

- El tipo de elemento seran selecionados de manera a aleatoria, entre: circulo, cuadrado, imagen y texto.   

- La posición inicial de cada elemento debera ser aleatorio dentro del área del componente gráfico.

- El movimiento horizontal o vertical, se definirá también de manera aleatoria.

- Cada elemento se debe mover a velocidades diferentes, en el rango de 80 milisegundos y 1 segundo.

- Modificar programa para que no queden datos quemados en el código.

- Acorde a como esta definido el área WorkPanel, el tamaño puede ser modificado con el mouse, por lo tanto, cada elemento deberá rebotar hasta el tamaño máximo del componente gráfico.


## Recomendaciones
- En la capa del presenter no puede adicionarse lógica de la vista ni del modelo, solo elementos que permitan la comunicación entre estos.

- No olvidar que el patrón MVP, tiene como objetivo principal el bajo acoplamiento entre las capas.





