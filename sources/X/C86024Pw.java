package X;

/* renamed from: X.4Pw  reason: invalid class name and case insensitive filesystem */
public class C86024Pw {
    public final /* synthetic */ AnonymousClass4ZL A00;

    public C86024Pw(AnonymousClass4ZL r1) {
        this.A00 = r1;
    }

    public boolean A00() {
        boolean z;
        AnonymousClass4ZL r4 = this.A00;
        int i = r4.A01;
        int i2 = r4.A00;
        if (i2 == -1) {
            if (C18020vd.A05(C18040vf.A02, r4.A07, 12285)) {
                i2 = 4;
            } else {
                i2 = AnonymousClass4ZL.A0E;
            }
            r4.A00 = i2;
        }
        if (i < i2) {
            r4.A01++;
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
