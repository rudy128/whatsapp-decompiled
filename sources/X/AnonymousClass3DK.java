package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.3DK  reason: invalid class name */
public class AnonymousClass3DK implements Executor {
    public final Handler A00 = C17890vO.A0D();

    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
