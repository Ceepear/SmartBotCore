package blue.ocean.smart.core.solver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.utils.DeviceVerificationRequests;
import net.mamoe.mirai.utils.DeviceVerificationResult;
import net.mamoe.mirai.utils.LoginSolver;
import kotlin.coroutines.Continuation;

public final class LoginSolverImp extends LoginSolver {
    private AndroidSolver androidSolver = null;
    private AndroidSolver getAndroidSolver() {
        return androidSolver;
    }
    public void setAndroidSolver(AndroidSolver androidSolver) {
        this.androidSolver = androidSolver;
    }
    @Deprecated
    @Nullable
    @Override
    public Object onSolvePicCaptcha(@NonNull Bot bot, @NonNull byte[] bytes, @NonNull Continuation<? super String> continuation) {
        return null;
    }
    @Nullable
    @Override
    public Object onSolveSliderCaptcha(@NonNull Bot bot, @NonNull String s, @NonNull Continuation<? super String> continuation) {
        return null;
    }
    @Nullable
    @Override
    public Object onSolveDeviceVerification(@NonNull Bot bot, @NonNull DeviceVerificationRequests requests, @NonNull Continuation<? super DeviceVerificationResult> $completion) {
        return super.onSolveDeviceVerification(bot, requests, $completion);
    }
}
