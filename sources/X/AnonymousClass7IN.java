package X;

import android.view.View;

/* renamed from: X.7IN  reason: invalid class name */
public class AnonymousClass7IN implements AnonymousClass87I {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7IN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C4o(boolean z) {
        if (this.A00 != 0) {
            C117015z4 r4 = (C117015z4) this.A01;
            r4.A06.A0J(new C146797Qq(r4, this.A02, 22));
            return;
        }
        Object obj = this.A01;
        View view = (View) this.A02;
        view.post(new AnonymousClass7RF(obj, view, 47, z));
    }
}
