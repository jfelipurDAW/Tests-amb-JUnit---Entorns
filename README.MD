<div style="padding:10px"></div>

![Logo](header.png)

<div style="padding:10px"></div>

###
<img src="https://institutopax.es/wp-content/uploads/2025/01/1_Logo-1024x218.png" height="40" alt="ilerna logo"  />

![GitHub repo size](https://img.shields.io/github/repo-size/jfelipurDAW/Tests-amb-JUnit---Entorns)
![GitHub last commit](https://img.shields.io/github/last-commit/jfelipurDAW/Tests-amb-JUnit---Entorns)
![GitHub license](https://img.shields.io/github/license/jfelipurDAW/Tests-amb-JUnit---Entorns)

###

<h2 align="left">Sobre el projecte</h2>

###

> [!WARNING] Aquest espai ha estat creat respondre una activitat d'Entorns de Desenvolupament.

# Parte 1: Entender el código
### Antes de escribir tests, responde brevemente:

- ¿Qué devuelve el método si la contraseña es null?
- ¿Qué devuelve si la contraseña tiene menos de 8 caracteres?
- ¿Qué devuelve si no tiene ningún número?
- Escribe un ejemplo de contraseña válida.
- Escribe un ejemplo de contraseña inválida.


# Parte 2: Crear la clase de test
### Crea una clase llamada `PasswordValidatorTest`.
Dentro de esta clase deberás crear tests para comprobar los siguientes casos:

- Una contraseña null no es válida.
- Una contraseña de menos de 8 caracteres no es válida.
- Una contraseña sin números no es válida.
- Una contraseña de 8 o más caracteres y con al menos un número sí es válida.


# Parte 3: Tests obligatorios
**Crea los siguientes métodos de test:**

```java
@Test
void nullPasswordShouldBeInvalid() {
    
}
 
 
@Test
void shortPasswordShouldBeInvalid() {
    
}
 
 
@Test
void passwordWithoutNumbersShouldBeInvalid() {
    
}
 
 
@Test
void validPasswordShouldReturnTrue() {
    
} 
```
**Dentro de cada test deberás:**

- Crear un objeto PasswordValidator.
- Llamar al método isValid.
- Comprobar el resultado con assertTrue o assertFalse.


# Parte 4: Provocar errores
Cuando todos los tests estén en verde, modifica temporalmente la clase `PasswordValidator` para provocar errores.

Por ejemplo:
```java
if (password.length() < 8){
  return true;
}
```
Ejecuta los tests otra vez y responde:

- ¿Qué test falla?
- ¿Por qué falla?
- ¿Qué resultado esperábamos?
- ¿Qué resultado ha dado realmente?

Después, vuelve a dejar la clase correctamente.



# Entrega
Entrega un proyecto Java con:

La clase `PasswordValidator`.
La clase `PasswordValidatorTest`.
Un documento mostrando todos los tests ejecutándose correctamente en verde.

---
#### Pistas
- No hace falta usar `main`. Los tests se ejecutan desde `JUnit`.
`
###

<div style="padding:20px"></div>

## 🔗 Adreces d'interès
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://jan-felip.github.io)

<div style="padding:20px"></div>

