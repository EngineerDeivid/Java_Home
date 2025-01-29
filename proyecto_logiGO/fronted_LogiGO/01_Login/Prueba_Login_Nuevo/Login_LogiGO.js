$(document).ready(function () {
    // Cuando se envía el formulario
    $(document).on('click', '#Validar_usuario', function (event) {
        event.preventDefault(); // Evita la recarga de la página al enviar el formulario

        // Obtener los valores de los campos
        var emailUsuario = $("#nombre_usuario").val();
        var contrasenaUsuario = $("#password_usuario").val();

        // Mostrar los datos que se van a enviar (para depuración)
        console.log("Datos enviados al servidor:");
        console.log("Email de usuario:", emailUsuario);
        console.log("Contraseña:", contrasenaUsuario);

        // Realizar la llamada AJAX
        $.ajax({
            url: 'http://localhost:8080/login', // URL del endpoint de login en el backend
            type: 'POST',
            contentType: 'application/x-www-form-urlencoded',
            data: {
                emailUsuario: emailUsuario,
                contrasenaUsuario: contrasenaUsuario
            },
            success: function (response) {
                console.log("Respuesta del servidor:", response);
                try {
                    // Intentar parsear la respuesta como JSON si no lo es
                    response = typeof response === "string" ? JSON.parse(response) : response;

                    if (response.status === "success") {
                        // Redirigir según el rol del usuario
                        switch (response.role) {
                            case 'Admin':
                                window.location.href = '../../02_Perfil_Admin/admin_perfil/inicio_Admin.html';
                                break;
                            case 'Auxiliar':
                                window.location.href = '/Fronted LogiGO/03_Auxiliar/ui_auxiliar.html';
                                break;
                            case 'Conductor':
                                window.location.href = '/Fronted LogiGO/04_Conductor/inicio_conductor.html';
                                break;
                            default:
                                alert("Usuario no válido, inexistente o bloqueado.");
                        }
                    } else {
                        alert(response.message || "Credenciales incorrectas.");
                    }
                } catch (error) {
                    console.error("Error procesando la respuesta:", error, response);
                    alert("Hubo un error procesando la respuesta del servidor.");
                }
            },
            error: function (xhr, status, error) {
                console.error("Error de conexión:", xhr, status, error);
                alert("No se pudo conectar al servidor, error de conexión");
            }
        });
    });
});
