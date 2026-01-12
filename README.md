📖 Creador de Historias Cortas en Java

📌 Descripción del proyecto
Este proyecto es un Generador de Narrativas Procedimentales desarrollado en Java. Su objetivo es crear historias coherentes de forma aleatoria o personalizada mediante la interacción con el usuario por consola.

El sistema destaca por resolver problemas comunes de concordancia gramatical en la generación de texto, asegurando que los personajes, lugares y situaciones encajen de forma natural independientemente de las combinaciones elegidas.

🧠 Funcionalidades
🎲 Generación Aleatoria: Crea historias instantáneas combinando elementos predefinidos.

✍️ Creación Libre: Permite al usuario definir cada detalle (protagonista, ambiente, conflicto y desenlace).

💾 Almacenamiento en Memoria: Guarda las historias personalizadas creadas durante la sesión para consultarlas después.

🌐 Soporte Multilingüe (UTF-8): Configuración especial para el manejo correcto de tildes y la letra "ñ" en consola.

🛡️ Validación de Datos: Control de excepciones para evitar cierres inesperados por entradas incorrectas.

🧱 Conceptos aplicados
Programación Orientada a Objetos (POO): Modelado de entidades reales (Personaje, Lugar, Situacion, Final).

Encapsulamiento: Uso de atributos privados y métodos getters/setters.

Manejo de Colecciones: Uso de ArrayList para gestionar la base de datos dinámica y el historial.

Lógica de Cohesión: Estructura de plantillas de texto diseñadas para mantener la coherencia gramatical.

Manejo de Excepciones: Bloques try-catch para robustez del programa.

🛠️ Tecnologías utilizadas
Lenguaje: Java 21

Entorno: Visual Studio Code 

Codificación: UTF-8

📂 Estructura del proyecto
Plaintext

📁 HistoriasCortas
 ┣ 📄 Principal.java     // Clase con el método main y control de menú
 ┣ 📄 Historia.java      // Lógica de armado de relatos y gestión de listas
 ┣ 📄 Personaje.java     // Entidad para el protagonista
 ┣ 📄 Lugar.java         // Entidad para el escenario
 ┣ 📄 Situacion.java     // Entidad para el nudo/conflicto
 ┣ 📄 Final.java         // Entidad para el desenlace
 ┗ 📄 README.md          // Documentación del proyecto
🔜 Próximas mejoras
💾 Persistencia: Implementar guardado en archivos .txt para no perder las historias al cerrar.

🎭 Más Arquetipos: Expandir la base de datos de ítems aleatorios con más géneros (terror, comedia).

👤 Autor
Proyecto desarrollado por [YoungJuan-Dev] Estudiante de programación :)
