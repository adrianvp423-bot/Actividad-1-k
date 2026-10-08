enum class Rol {
    ADMIN, EDITOR, VISITANTE
}

interface Autenticable {
    fun autenticar()
}

data class Usuario(
    val nombre: String,
    val email: String,
    val rol: Rol
) : Autenticable {
    override fun autenticar() {
        println("El usuario '$nombre' con rol $rol ha sido autenticado exitosamente.")
    }
}

fun main() {
    val usuario = Usuario("carlos", "carlos@mail.com", Rol.ADMIN)

    when (usuario.rol) {
        Rol.ADMIN -> println("El usuario es Administrador")
        Rol.EDITOR -> println("El usuario es Editor")
        Rol.VISITANTE -> println("El usuario es Visitante")
    }

    usuario.autenticar()
}