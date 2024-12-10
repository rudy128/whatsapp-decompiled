package X;

import java.lang.ref.WeakReference;

/* renamed from: X.DQw  reason: case insensitive filesystem */
public final class C27051DQw implements C28676EDt {
    public final C24887COf A00;
    public final C22801Dg A01;
    public final WeakReference A02;

    public C24887COf BOH() {
        return this.A00;
    }

    public void run() {
        C15950rT r0;
        Object apply;
        C24887COf cOf = this.A00;
        C42621yT r2 = cOf.A00;
        if (!r2.A03() && (r0 = (C15950rT) this.A02.get()) != null && (apply = r0.apply(cOf)) != null && !r2.A03()) {
            this.A01.A0E(apply);
        }
    }

    public C27051DQw(C22801Dg r2, Object obj, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = new C24887COf(obj);
    }
}
