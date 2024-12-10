package X;

import android.os.HandlerThread;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.1EL  reason: invalid class name */
public class AnonymousClass1EL extends AnonymousClass1EJ {
    public final AnonymousClass1EM A00;
    public final AnonymousClass1EO A01 = new AnonymousClass1EO(this);
    public final WeakHashMap A02 = new WeakHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EL(HandlerThread handlerThread, AnonymousClass10N r4, Executor executor) {
        super(r4, executor, 2);
        AnonymousClass1EM r1 = new AnonymousClass1EM(handlerThread);
        this.A00 = r1;
    }
}
