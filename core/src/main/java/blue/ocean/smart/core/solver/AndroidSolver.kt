package blue.ocean.smart.core.solver
import net.mamoe.mirai.utils.LoginSolver
interface AndroidSolver {
    fun onSolveSliderCaptcha(url: String): String?
    fun onSolveDeviceVerification(phone: String):String?
}