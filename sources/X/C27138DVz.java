package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: X.DVz  reason: case insensitive filesystem */
public class C27138DVz implements Executor {
    public final int A00;
    public final Object A01;

    public C27138DVz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void execute(Runnable runnable) {
        if (this.A00 != 0) {
            Handler A002 = AnonymousClass0PG.A00();
            Object obj = ((C25813CmQ) this.A01).A02;
            A002.removeCallbacksAndMessages(obj);
            A002.postAtTime(runnable, obj, 0);
            return;
        }
        ((Choreographer) this.A01).postFrameCallback(new C26560D4a(runnable, 0));
    }
}
