function validateForm() {
    var nombres = document.getElementById("nombres").value.trim();
    var apellidos = document.getElementById("apellidos").value.trim();
    var correo = document.getElementById("correo").value.trim();
    var semestre = document.getElementById("semestre").value.trim();
    var descripcion = document.getElementById("descripcion").value.trim();

    // Validación de Nombres
    if (nombres === "" || nombres.length > 100) {
        markInvalid("nombres");
        return false;
    } else {
        markValid("nombres");
    }

    // Validación de Apellidos
    if (apellidos === "" || apellidos.length > 100) {
        markInvalid("apellidos");
        return false;
    } else {
        markValid("apellidos");
    }

    // Validación de Correo
    var correoRegex = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i;
    if (correo === "" || correo.length > 100 || !correoRegex.test(correo)) {
        markInvalid("correo");
        return false;
    } else {
        markValid("correo");
    }

    // Validación de Semestre
    var semestreNumber = parseInt(semestre);
    if (isNaN(semestreNumber) || semestreNumber < 0 || semestreNumber > 16) {
        markInvalid("semestre");
        return false;
    } else {
        markValid("semestre");
    }

    // Validación de Descripción
    if (descripcion === "") {
        markInvalid("descripcion");
        return false;
    } else {
        markValid("descripcion");
    }

    // Si todo está bien, se envía el formulario
    return true;
}

function markInvalid(elementId) {
    // Marcar el cuadro de texto en rojo
    document.getElementById(elementId).style.borderColor = "red";

    // Notificar en la parte inferior que no cumplió
    alert("El campo " + elementId + " no cumple con los requisitos.");
}

function markValid(elementId) {
    // Restablecer el borde a su estado original (sin color)
    document.getElementById(elementId).style.borderColor = "";
}
