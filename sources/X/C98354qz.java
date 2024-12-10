package X;

import android.view.View;

/* renamed from: X.4qz  reason: invalid class name and case insensitive filesystem */
public class C98354qz implements AnonymousClass88O {
    public final int A00;
    public final Object A01;

    public C98354qz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bmq(AnonymousClass70X r4, boolean z) {
        int i;
        C62572rc r0;
        if (this.A00 != 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A01;
            C18070vi.A0d(r2, 0);
            View A0A = AnonymousClass3MW.A0A(r2.A0S);
            if (A0A != null) {
                if (!z || ((r0 = r2.A0O.A02) != null && r0.A0V)) {
                    i = 8;
                } else {
                    i = 0;
                }
                A0A.setVisibility(i);
                return;
            }
            return;
        }
        AnonymousClass88O r02 = ((C827349n) this.A01).A01;
        if (r02 != null) {
            r02.Bmq(r4, z);
        }
    }
}
