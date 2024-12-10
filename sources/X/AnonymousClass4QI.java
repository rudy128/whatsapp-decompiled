package X;

/* renamed from: X.4QI  reason: invalid class name */
public final class AnonymousClass4QI {
    public final AnonymousClass18K A00;
    public final C18030ve A01;

    public final C81513zM A00(Integer num, Integer num2, Integer num3, int i) {
        Integer num4;
        int i2;
        C81513zM r3 = new C81513zM();
        int intValue = num.intValue();
        int i3 = 1;
        if (intValue == 0) {
            i3 = 0;
        } else if (intValue != 1) {
            i3 = 3;
            if (intValue == 4) {
                i3 = 2;
            } else if (intValue != 2) {
                if (intValue == 3) {
                    i3 = 4;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        r3.A03 = Integer.valueOf(i3);
        r3.A00 = Integer.valueOf(i);
        r3.A04 = 1L;
        if (C18020vd.A05(C18040vf.A02, this.A01, 9846)) {
            Integer num5 = null;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    case 9:
                        i2 = 9;
                        break;
                    case 10:
                        i2 = 10;
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        i2 = 12;
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 15;
                        break;
                    case 16:
                        i2 = 16;
                        break;
                    case 17:
                        i2 = 17;
                        break;
                    case 18:
                        i2 = 18;
                        break;
                    case 19:
                        i2 = 19;
                        break;
                    case 20:
                        i2 = 20;
                        break;
                    default:
                        throw AnonymousClass3MW.A14();
                }
                num4 = Integer.valueOf(i2);
            } else {
                num4 = null;
            }
            r3.A02 = num4;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                int i4 = 1;
                if (intValue2 == 0) {
                    i4 = 0;
                } else if (intValue2 != 1) {
                    i4 = 3;
                    if (intValue2 == 2) {
                        i4 = 2;
                    } else if (intValue2 != 3) {
                        throw AnonymousClass3MW.A14();
                    }
                }
                num5 = Integer.valueOf(i4);
            }
            r3.A01 = num5;
        }
        return r3;
    }

    public AnonymousClass4QI(C18030ve r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
