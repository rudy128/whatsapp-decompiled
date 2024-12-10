package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.0Ov  reason: invalid class name and case insensitive filesystem */
public abstract class C04790Ov {
    public static final Object A02(C18090vk r9, C22821Di r10) {
        Snapshot snapshot;
        Snapshot A02;
        AnonymousClass08M r4;
        C22821Di r5 = r10;
        if (r10 == null) {
            return r9.invoke();
        }
        AnonymousClass0N4 r2 = C05200Qx.A05;
        Snapshot snapshot2 = (Snapshot) r2.A01();
        if (snapshot2 == null || (snapshot2 instanceof AnonymousClass08M)) {
            if (snapshot2 instanceof AnonymousClass08M) {
                r4 = (AnonymousClass08M) snapshot2;
            } else {
                r4 = null;
            }
            snapshot = new AnonymousClass08I(r4, r5, (C22821Di) null, true, false);
        } else {
            snapshot = snapshot2.A09(r10);
        }
        try {
            A02 = snapshot.A02();
            Object invoke = r9.invoke();
            r2.A02(A02);
            snapshot.A0D();
            return invoke;
        } catch (Throwable th) {
            snapshot.A0D();
            throw th;
        }
    }

    public static final Snapshot A00() {
        return C05200Qx.A04((Snapshot) C05200Qx.A05.A01(), (C22821Di) null, false);
    }

    public static final void A03() {
        boolean z;
        synchronized (C05200Qx.A08) {
            C06990aB A0L = ((AnonymousClass08H) C05200Qx.A09.get()).A0L();
            z = false;
            if (A0L != null && A0L.A03()) {
                z = true;
            }
        }
        if (z) {
            C05200Qx.A0R();
        }
    }

    public static final AnonymousClass0W4 A01(AnonymousClass1OS r2) {
        C05200Qx.A0I(C05200Qx.A0B);
        synchronized (C05200Qx.A08) {
            C05200Qx.A01 = C29431cG.A0l(r2, C05200Qx.A01);
        }
        return new AnonymousClass0W4(r2, 0);
    }
}
