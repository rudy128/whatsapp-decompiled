package X;

/* renamed from: X.4jk  reason: invalid class name and case insensitive filesystem */
public final class C93914jk implements C108695c9 {
    public final C88114Yj A00;
    public final C108695c9 A01 = AnonymousClass4WM.A00;

    public C93914jk(C88114Yj r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean CP4(int i, Object obj) {
        boolean z;
        if (i == 1) {
            z = this.A00.A08;
        } else if (i == 3) {
            z = this.A00.A0F;
        } else if (i == 4) {
            z = this.A00.A0E;
        } else if (i == 10) {
            z = this.A00.A04;
        } else if (i == 11) {
            z = this.A00.A05;
        } else if (i != 20) {
            C88114Yj r0 = this.A00;
            if (i != 21) {
                switch (i) {
                    case 14:
                        z = r0.A09;
                        break;
                    case 15:
                        z = r0.A0G;
                        break;
                    case 16:
                        z = r0.A0C;
                        break;
                    case 17:
                        z = r0.A0A;
                        break;
                    case 18:
                        z = r0.A02;
                        break;
                    default:
                        z = r0.A06;
                        break;
                }
            } else {
                z = r0.A01;
            }
        } else {
            C88114Yj r1 = this.A00;
            if (r1.A03) {
                z = r1.A02;
            }
            return false;
        }
        if (!z || !this.A01.CP4(i, obj)) {
            return false;
        }
        return true;
    }
}
