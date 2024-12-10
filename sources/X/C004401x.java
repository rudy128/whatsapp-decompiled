package X;

import android.view.Window;

/* renamed from: X.01x  reason: invalid class name and case insensitive filesystem */
public final class C004401x implements C004301w {
    public final /* synthetic */ AnonymousClass01V A00;

    public C004401x(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void Bp9(C003301m r6, boolean z) {
        C003301m A06 = r6.A06();
        boolean z2 = false;
        if (A06 != r6) {
            z2 = true;
        }
        AnonymousClass01V r2 = this.A00;
        if (z2) {
            r6 = A06;
        }
        C003201l A0n = r2.A0n(r6);
        if (A0n == null) {
            return;
        }
        if (z2) {
            r2.A0v(A06, A0n, A0n.A01);
            r2.A0w(A0n, true);
            return;
        }
        r2.A0w(A0n, z);
    }

    public boolean Bzb(C003301m r4) {
        Window.Callback callback;
        if (r4 != r4.A06()) {
            return true;
        }
        AnonymousClass01V r2 = this.A00;
        if (!r2.A0L || (callback = r2.A06.getCallback()) == null || r2.A0K) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass74N.A03, r4);
        return true;
    }
}
