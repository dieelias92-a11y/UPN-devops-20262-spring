# 🚀 Proyecto Spring Boot

Breve descripción del propósito de la aplicación, su función principal o el problema que resuelve en el ámbito académico/profesional.

---

## 👨‍💻 Autor

- **Nombre:** Diego Inga
- **Universidad:** Universidad Privada del Norte (UPN)
- **Perfil de GitHub:** [@diegolnga](https://github.com/) <!-- Reemplaza con tu usuario exacto de GitHub -->
- **LinkedIn:** [Diego Inga](https://linkedin.com/in/) <!-- Enlace opcional a tu perfil -->

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java (versión 17 o 21 recomendada)
- **Framework:** [Spring Boot](https://spring.io/projects/spring-boot) (Spring Web, Spring Data JPA, Spring Security, etc.)
- **Gestor de Dependencias:** Maven / Gradle
- **Base de Datos:** MySQL / PostgreSQL / H2 (en memoria)
- **Documentación de API:** Swagger / OpenAPI (Springdoc)
- **Control de Versiones:** Git & GitHub

---

## 📋 Requisitos Previos

Antes de ejecutar el proyecto localmente, asegúrate de contar con lo siguiente instalado:

* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (v17+)
* [Maven](https://maven.apache.org/) (o el wrapper `./mvnw` incluido en el repositorio)
* Un gestor de base de datos (por ejemplo, PostgreSQL o MySQL) o Docker
* Un IDE de preferencia: IntelliJ IDEA, VS Code o Eclipse

---

## ⚙️ Instalación y Configuración

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/nombre-del-repositorio.git
   cd nombre-del-repositorio
   ```

2. **Configurar las variables de entorno / base de datos:**
   Modifica el archivo `src/main/resources/application.properties` (o `application.yml`) con tus credenciales locales:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nombre_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Compilar y construir el proyecto:**
   ```bash
   # En Linux/macOS:
   ./mvnw clean install

   # En Windows:
   mvnw.cmd clean install
   ```

4. **Ejecutar la aplicación:**
   ```bash
   # En Linux/macOS:
   ./mvnw spring-boot:run

   # En Windows:
   mvnw.cmd spring-boot:run
   ```

La aplicación iniciará por defecto en `http://localhost:8080`.

---

## 📌 Endpoints Principales (Ejemplo)

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/api/v1/recursos` | Listar todos los registros |
| `GET` | `/api/v1/recursos/{id}` | Obtener detalle de un recurso |
| `POST` | `/api/v1/recursos` | Crear un nuevo recurso |
| `PUT` | `/api/v1/recursos/{id}` | Actualizar un recurso existente |
| `DELETE` | `/api/v1/recursos/{id}` | Eliminar un registro |

> **Documentación interactiva:** Si tienes Swagger integrado, puedes acceder a la interfaz web en:  
> `http://localhost:8080/swagger-ui.html`

---

## 🎓 Contexto Académico

Proyecto desarrollado por **Diego Inga** como parte de las actividades formativas en la **Universidad Privada del Norte (UPN)**, enfocado en el desarrollo de arquitecturas backend robustas y escalables utilizando el ecosistema Spring.

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más información.