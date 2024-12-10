package X;

/* renamed from: X.2xp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66222xp implements C72053Kl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C72053Kl A02;

    public final void BE3(Object obj) {
        C72053Kl r3 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        Number number = (Number) obj;
        if (r3 != null) {
            r3.BE3(Integer.valueOf(i + ((number.intValue() * (i2 - i)) / 100)));
        }
    }

    public /* synthetic */ C66222xp(C72053Kl r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
