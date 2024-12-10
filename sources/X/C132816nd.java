package X;

import android.view.View;

/* renamed from: X.6nd  reason: invalid class name and case insensitive filesystem */
public final class C132816nd {
    public final int A00;
    public final C29681ch A01;
    public final View A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6X0, java.lang.Object] */
    public final void A00() {
        Object obj;
        if (C108955ca.A0W(this.A03).A09()) {
            C134246qH r6 = new C134246qH();
            View view = this.A02;
            ((C138876xq) this.A04.get()).A01(new C142847Ba(this, 0), new C142887Be(view, r6, "recommended unit", "recommended unit", this.A01.toString()), new Object());
            try {
                obj = AnonymousClass3Ma.A05(view);
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            if (!(obj instanceof AnonymousClass1IU) && obj != null) {
                C147117Rw r0 = C147117Rw.A01;
                C147117Rw.A00 = AnonymousClass3MW.A0z(obj);
            }
        }
    }

    public C132816nd(View view, C29681ch r3, AnonymousClass00H r4, AnonymousClass00H r5, int i) {
        C18070vi.A0j(r4, r5);
        C18070vi.A0d(r3, 5);
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A02 = view;
        this.A01 = r3;
    }
}
