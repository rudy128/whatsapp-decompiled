package X;

import android.os.Trace;

/* renamed from: X.Cuq  reason: case insensitive filesystem */
public final class C26212Cuq {
    public static C9H A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.C9H, java.lang.Object] */
    public static final void A02() {
        if (A00 == null) {
            synchronized (C26212Cuq.class) {
                A00 = new Object();
            }
        }
    }

    public static void A00() {
        if (A04()) {
            A01();
        }
    }

    public static final void A01() {
        A02();
        if (C24665CEf.A00) {
            Trace.endSection();
        }
    }

    public static final void A03(String str) {
        A02();
        if (C24665CEf.A00) {
            Trace.beginSection(str);
        }
    }

    public static final boolean A04() {
        A02();
        return AnonymousClass000.A1O(C24665CEf.A00 ? 1 : 0);
    }
}
