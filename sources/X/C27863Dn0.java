package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.Dn0  reason: case insensitive filesystem */
public final class C27863Dn0 extends AnonymousClass11G implements C18090vk {
    public static final C27863Dn0 A00 = new C27863Dn0();

    public C27863Dn0() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(BE7.A0G(new HandlerThread("FrescoAnimationWorker")));
    }
}
