# Formulario Spinner - Android Project

Este es un proyecto de Android Studio que consiste en un formulario de registro interactivo con navegación dinámica basada en la selección del usuario mediante un `Spinner`.

## 🚀 Características

*   **Formulario de Registro**: Captura de nombre completo y edad con validación de campos.
*   **Selección de Intereses**: Uso de un componente `Spinner` para elegir entre diferentes categorías (Deportes, Música, Cine).
*   **Persistencia de Datos**: Los datos del usuario se guardan localmente utilizando `SharedPreferences`.
*   **Navegación Inteligente**: Dependiendo de la categoría seleccionada, la aplicación dirige al usuario a una actividad específica personalizada (DeportesActivity, MusicaActivity o CineActivity).
*   **Diseño Moderno**: Interfaz de usuario con un fondo azul vibrante (`#2148C7`) y elementos de alto contraste para una mejor legibilidad.
*   **Icono Personalizado**: Cuenta con un icono de aplicación generado siguiendo las guías de diseño de Android.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje**: Java / Android SDK
*   **Layouts**: XML (LinearLayout)
*   **Componentes**: 
    *   `EditText` para entrada de texto y números.
    *   `Spinner` con adaptador de arreglos (`string-array`).
    *   `SharedPreferences` para almacenamiento local ligero.
    *   `Intent` para la navegación entre actividades.
*   **Estilo**: Temas personalizados y gestión de colores en `values/colors.xml`.

## 📸 Estructura del Proyecto

*   `MainActivity`: Gestiona el formulario y la lógica de guardado.
*   `DeportesActivity`: Pantalla de bienvenida para los amantes del deporte.
*   `MusicaActivity`: Pantalla temática para la categoría de música.
*   `CineActivity`: Pantalla temática para la categoría de cine.
*   `res/layout`: Contiene los archivos de diseño visual.

## ⚙️ Requisitos

*   Android Studio Giraffe o superior.
*   SDK de Android (API nivel 24+ recomendado).
*   Dispositivo físico o emulador con Android 7.0 o superior.

## ✒️ Autor

*   **Josimar Acosta Martínez** - *Desarrollo Inicial*
