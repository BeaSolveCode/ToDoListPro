# 𝑇𝑜𝐷𝑜𝐿𝑖𝑠𝑡𝑃𝑟𝑜

Proyecto desarrollado para la gestión de tareas académicas, enfocado en aplicar conocimientos de **2º de DAW**. La aplicación utiliza una arquitectura desacoplada con un backend robusto y una base de datos NoSQL.

## 𝕋𝕖𝕔𝕟𝕠𝕝𝕠𝕘𝕚𝕒𝕤

* **Backend:** Java 17, Spring Boot 3.
* **Base de Datos:** MongoDB (NoSQL) con Spring Data MongoDB.
* **Herramientas de desarrollo:** MongoDB Compass, Postman, Git/GitHub.
* **Frontend:** Angular (Próximamente).

## 🛠️ ℂ𝕠𝕟𝕗𝕚𝕘𝕦𝕣𝕒𝕔𝕚𝕠́𝕟

### ℝ𝕖𝕢𝕦𝕚𝕤𝕚𝕥𝕠𝕤 𝕡𝕣𝕖𝕧𝕚𝕠𝕤
* JDK 17 o superior.
* MongoDB instalado y corriendo en local (puerto 27017).
* Maven.

### 𝕡𝕒𝕤𝕠𝕤 𝕒 𝕖𝕛𝕖𝕔𝕦𝕥𝕒𝕣
1. Clonar el repositorio.
2. Configurar la conexión en `src/main/resources/application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/ToDoListPro
   server.port=9090
