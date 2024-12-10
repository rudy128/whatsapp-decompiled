package X;

import android.content.Context;

/* renamed from: X.0Z8  reason: invalid class name */
public final class AnonymousClass0Z8 implements Runnable {
    public final /* synthetic */ Context A00;

    public AnonymousClass0Z8(Context context) {
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass1F9 r0 = (AnonymousClass1F9) this.A00;
        r0.getLifecycle().A05(new AnonymousClass0Y4(r0.getLifecycle().A04()));
    }
}
