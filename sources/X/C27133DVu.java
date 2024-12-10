package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.DVu  reason: case insensitive filesystem */
public class C27133DVu implements Executor {
    public final Handler A00;

    public void execute(Runnable runnable) {
        Handler handler = this.A00;
        C28111Yx.A02(runnable);
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(AnonymousClass000.A0y(" is shutting down", C17890vO.A0f(handler)));
        }
    }

    public C27133DVu(Handler handler) {
        C28111Yx.A02(handler);
        this.A00 = handler;
    }
}
