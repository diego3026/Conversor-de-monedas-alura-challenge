# Conversor de Monedas en Java

Este proyecto es un conversor de monedas desarrollado en Java. El programa se conecta a la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio en tiempo real y permite convertir cantidades entre diferentes monedas.

## Estructura del Proyecto

La estructura del proyecto sigue un diseño modular para que sea fácil de mantener y extender. Aquí están las clases principales:

### Descripción de las Clases Principales

- **`ApiService`**: Gestiona la comunicación con la API de tasas de cambio y obtiene los datos en tiempo real.
- **`Coin`**: Clase modelo que representa la estructura de respuesta de la API.
- **`CoinService`**: Procesa la lógica de conversión entre monedas.
- **`Main`**: Punto de entrada principal para ejecutar el programa.

## Configuración

### Prerrequisitos

- **Java 11** o superior
- Dependencia de `Gson` (para deserializar JSON) y `HttpClient` (nativo en Java 11+)
