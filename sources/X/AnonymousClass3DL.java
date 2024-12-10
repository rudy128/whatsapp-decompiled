package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.3DL  reason: invalid class name */
public class AnonymousClass3DL implements Executor {
    public final int A00;
    public final Object A01;

    public AnonymousClass3DL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void execute(Runnable runnable) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((AnonymousClass1KB) obj).A0J(runnable);
                return;
            case 2:
                AnonymousClass10I r0 = (AnonymousClass10I) obj;
                if (runnable != null) {
                    r0.CGF(runnable);
                    return;
                }
                throw C17890vO.A0K();
            default:
                AnonymousClass1KB r02 = (AnonymousClass1KB) obj;
                if (runnable != null) {
                    r02.CGP(runnable);
                    return;
                }
                throw C17890vO.A0K();
        }
    }
}
