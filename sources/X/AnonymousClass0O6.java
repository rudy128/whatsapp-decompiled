package X;

import androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0O6  reason: invalid class name */
public abstract class AnonymousClass0O6 {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);
    public static final AtomicBoolean A01 = new AtomicBoolean(false);

    public static final void A00() {
        if (A01.compareAndSet(false, true)) {
            C27178DXn A002 = AnonymousClass4W8.A01(C25691Pg.A04, 1);
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new GlobalSnapshotManager$ensureStarted$1((C30391dr) null, A002), AnonymousClass1OW.A02(C04270Mn.A00()), 3);
            A01(new C10890j4(A002));
        }
    }

    public static final void A01(C22821Di r2) {
        synchronized (C05200Qx.A08) {
            C05200Qx.A02 = C29431cG.A0l(r2, C05200Qx.A02);
        }
        C05200Qx.A0R();
        new AnonymousClass0W4(r2, 1);
    }
}
