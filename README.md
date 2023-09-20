# LABORATORIO 5 - SPRING MVC INTRODUCTION

## INTEGRANTES

### Andrés Felipe Arias Ajiaco
### Sergio Daniel Lopez Vargas

## RESPUESTAS

### PARTE 2
> * **¿Por qué MVC obtiene ese nombre?**
MVC se llama así debido a su arquitectura de tres componentes principales:

**Modelo (Model):** Representa los datos y la lógica empresarial de la aplicación.

**Vista (View):** Presenta los datos al usuario y maneja la interfaz de usuario.

**Controlador (Controller):** Controla las solicitudes del usuario, interactúa con el modelo y selecciona la vista adecuada para mostrar los resultados.
> * **¿Cuáles son las ventajas de usar MVC?**
Algunas de las ventajas de utilizar la arquitectura MVC en aplicaciones web incluyen:

**Separación de preocupaciones:** MVC divide la aplicación en componentes separados, lo que facilita la gestión y el mantenimiento del código.

**Reutilización de código:** Los componentes del modelo y la vista pueden reutilizarse en diferentes partes de la aplicación o en proyectos futuros.

**Escalabilidad:** Facilita la escalabilidad de la aplicación al permitir la sustitución o ampliación de componentes sin afectar a otros.

**Pruebas unitarias:** Permite realizar pruebas unitarias más eficaces y facilita la automatización de pruebas.
Colaboración entre equipos: Permite que equipos diferentes trabajen en paralelo en diferentes partes de la aplicación.
> * **¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?**
La estructura de directorios en un proyecto Spring MVC es diferente de la de proyectos Maven y Java EE debido a la naturaleza específica de Spring MVC. En un proyecto Spring MVC, se suelen encontrar carpetas y paquetes como:

**src/main/java:** Contiene las clases Java, incluyendo controladores y modelos.

**src/main/resources:** Contiene recursos como archivos de configuración XML y propiedades.

**src/main/webapp:** Aquí se encuentran los archivos web, como páginas JSP o archivos HTML.

**WEB-INF:** Contiene archivos de configuración de Spring y configuraciones específicas de Servlet.
    Esta estructura está diseñada para facilitar la gestión de componentes MVC y la configuración de Spring.
> * **¿Qué anotaciones usaste y cuál es la diferencia entre ellas?**
En un proyecto Spring MVC, se utilizan diversas anotaciones para configurar y gestionar controladores, vistas y otras partes de la aplicación. Algunas anotaciones comunes incluyen:

**@Controller:** Anota una clase como controlador.

**@RequestMapping:** Define una URL o patrón de URL que se asigna a un método del controlador.

**@ModelAttribute:** Utilizada para asociar un método o parámetro de método con un modelo.

**@GetMapping, @PostMapping, etc.:** Anotaciones para especificar los métodos HTTP que maneja un controlador.

**@Autowired:** Utilizada para inyectar dependencias en los controladores u otros componentes de Spring.

**@RequestMapping:** Permite especificar una URL base para todos los métodos de un controlador.

Estas anotaciones son fundamentales para definir cómo se manejan las solicitudes HTTP y cómo se interactúa con el modelo y la vista en una aplicación Spring MVC.

### PARTE3
> * **¿Qué es RESTful?**

RESTful (Representational State Transfer) es un estilo arquitectónico para el diseño de servicios web que se basa en principios y restricciones bien definidos. Fue propuesto por Roy Fielding en su tesis doctoral en 2000 y se ha convertido en un enfoque ampliamente utilizado para desarrollar servicios web que sean simples, escalables y eficientes.



