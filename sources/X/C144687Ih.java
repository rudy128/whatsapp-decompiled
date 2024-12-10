package X;

/* renamed from: X.7Ih  reason: invalid class name and case insensitive filesystem */
public class C144687Ih implements C72273Lh {
    public final int A00;
    public final Object A01;

    public C144687Ih(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6P(AnonymousClass1BI r4) {
        if (this.A00 != 0) {
            ((AnonymousClass1FU) this.A01).A05.A0J(new AnonymousClass7RA((Object) this, 9));
            return;
        }
        C143087By r1 = (C143087By) this.A01;
        if (r4.equals(r1.A0I)) {
            C143087By.A06(r1);
            r1.A05.invalidateOptionsMenu();
        }
    }

    public void C76(AnonymousClass1BI r4) {
        if (this.A00 != 0) {
            ((AnonymousClass1FU) this.A01).A05.A0J(new AnonymousClass7RA((Object) this, 8));
            return;
        }
        C143087By r2 = (C143087By) this.A01;
        if (r4.equals(r2.A0I)) {
            C60072nL r0 = r2.A0Q;
            if (r0 != null && r2.A0y.A0O(r0.A06)) {
                r2.A0Q = null;
            }
            C143087By.A06(r2);
            r2.A05.invalidateOptionsMenu();
        }
    }
}
