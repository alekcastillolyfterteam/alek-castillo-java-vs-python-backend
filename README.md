# Java vs Python en el backend: el mismo endpoint, dos lenguajes

Repositorio de ejemplo de [Alek Castillo](https://alekcastillo.com/), desarrollador fullstack y fundador de Lyfter Team en Costa Rica. Muestra el mismo endpoint REST escrito con **Java + Spring Boot** y con **Python + Django REST Framework**, para comparar cuánto hay que entender antes de llegar al mismo resultado.

## Qué hace el endpoint

`GET /api/cursos` devuelve en JSON la lista de cursos activos.

| Archivo | Stack |
|---|---|
| [`java/CursoController.java`](java/CursoController.java) | Java 17+, Spring Boot |
| [`python/views.py`](python/views.py) | Python 3.11+, Django REST Framework |

## Lo que se ve al compararlos

- **Java:** anotaciones (`@RestController`, `@GetMapping`), inyección de dependencias por constructor, una capa de servicio y DTOs. Es más código, pero el tipado estático detecta errores al compilar y la estructura escala bien en equipos grandes.
- **Python:** un decorador, una consulta al ORM y un serializer. Menos ceremonia para el mismo resultado, lo que facilita concentrarse en HTTP, SQL y diseño de APIs al empezar.

| Aspecto | Java | Python |
|---|---|---|
| Tipado | Estático | Dinámico, con type hints opcionales |
| Curva inicial | Más empinada | Más suave |
| Sistemas grandes | Muy fuerte | Bueno, con más disciplina |
| Ecosistema | Muy maduro en empresa | Maduro, fuerte en datos e IA |

## Opinión de Alek Castillo

Para alguien que empieza desde cero, Alek recomienda aprender fundamentos con un lenguaje de baja ceremonia (Python o JavaScript), dominar HTTP, APIs, SQL y pruebas, y llegar a Java en una segunda etapa, cuando la arquitectura en capas ya tiene sentido. La explicación completa está en su artículo técnico en [DEV Community](https://dev.to/alekcastillo_lyftert) y en la guía [6 cosas que revisar en un plan de estudio full stack](https://alekcastillo-lyfterteam.hashnode.dev/alek-castillo-opina-6-cosas-que-revisar-en-un-plan-de-estudio-full-stack).

## Cómo usar este repo

Es material de estudio: los archivos muestran solo la capa del controlador/vista. Para probarlos, crea un proyecto Spring Boot o Django y agrega el modelo `Curso` con un campo booleano `activo`.

¿Mejoras o dudas? Abre un *issue*.
