En este proyecto construimos una aplicación Java con interfaz Swing para gestionar NPCs, aplicando de forma combinada los patrones Builder y Prototype. Con Builder definimos una forma ordenada de crear personajes complejos a partir de plantillas (como soldado básico, élite o arquero), separando claramente la construcción de la representación final. Luego, con Prototype, habilitamos la duplicación rápida de NPCs ya creados mediante un método copy(), lo que permite generar variantes sin reconstruir cada objeto desde cero. Además, implementamos copia profunda en habilidades para que los clones sean totalmente independientes del original. Como resultado, obtuvimos una solución más limpia, reutilizable y escalable para crear y clonar personajes en la interfaz.

https://github.com/user-attachments/assets/b1a0a214-0c23-4608-b367-ff79b290f8b1

repo del proyecto: https://github.com/franbz1/patrones2
