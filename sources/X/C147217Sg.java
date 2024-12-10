package X;

/* renamed from: X.7Sg  reason: invalid class name and case insensitive filesystem */
public class C147217Sg implements C23421Fz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C147217Sg(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public Object BFC(C30391dr r6, AnonymousClass1G2 r7) {
        C23421Fz r4;
        C147247Sj r3;
        if (this.A00 != 0) {
            r4 = (C23421Fz) this.A02;
            r3 = new C147247Sj(r7, this.A01, this.A03, 1);
        } else {
            r4 = (C23421Fz) this.A01;
            r3 = new C147247Sj(this.A02, r7, this.A03, 0);
        }
        return AnonymousClass3MX.A13(r4.BFC(r6, r3));
    }
}
