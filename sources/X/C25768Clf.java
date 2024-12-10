package X;

/* renamed from: X.Clf  reason: case insensitive filesystem */
public final class C25768Clf {
    public final AnonymousClass18K A00;

    public C25768Clf(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(int i, int i2) {
        int i3;
        switch (i2) {
            case 0:
                i3 = 1014;
                break;
            case 1:
                i3 = 1015;
                break;
            case 2:
                i3 = 1016;
                break;
            case 3:
                i3 = 1017;
                break;
            case 4:
                i3 = 1018;
                break;
            case 5:
                i3 = 1019;
                break;
            case 6:
                i3 = 1020;
                break;
            case 7:
                i3 = 1021;
                break;
            case 8:
                i3 = 1022;
                break;
            case 9:
                i3 = 1023;
                break;
            default:
                return;
        }
        A00(C138126wZ.A06, i, Integer.valueOf(i3).intValue(), 1);
    }

    public final void A03(C138126wZ r3, int i, int i2, int i3) {
        C18070vi.A0d(r3, 3);
        int i4 = 1;
        if (i2 != 1) {
            i4 = 175;
            if (i2 != 5) {
                i4 = 100;
                if (i2 != 100) {
                    i4 = 105;
                    if (i2 != 105) {
                        i4 = 145;
                        if (i2 != 145) {
                            i4 = 155;
                            if (i2 != 155) {
                                i4 = 160;
                                if (i2 != 160) {
                                    i4 = 162;
                                    if (i2 != 162) {
                                        i4 = 165;
                                        if (i2 != 165) {
                                            switch (i2) {
                                                case 111:
                                                    i4 = 111;
                                                    break;
                                                case 112:
                                                    i4 = 112;
                                                    break;
                                                case 113:
                                                    i4 = 113;
                                                    break;
                                                case 114:
                                                    i4 = 114;
                                                    break;
                                                case 115:
                                                    i4 = 115;
                                                    break;
                                                case 116:
                                                    i4 = 116;
                                                    break;
                                                case 117:
                                                    i4 = 117;
                                                    break;
                                                case 118:
                                                    i4 = 118;
                                                    break;
                                                case 119:
                                                    i4 = 119;
                                                    break;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Integer valueOf = Integer.valueOf(i4);
        if (valueOf != null) {
            A00(r3, i, valueOf.intValue(), i3);
        }
    }

    private final void A00(C138126wZ r3, int i, int i2, int i3) {
        C23834Bqr bqr = new C23834Bqr();
        bqr.A02 = Integer.valueOf(i2);
        bqr.A01 = C17880vN.A0i();
        bqr.A03 = C17880vN.A0n(i3);
        bqr.A04 = C17880vN.A0n(i);
        Integer num = r3.A00;
        if (num != null) {
            bqr.A00 = num;
        }
        this.A00.CC7(bqr);
    }

    public final void A02(int i, Integer num) {
        C23830Bqn bqn = new C23830Bqn();
        bqn.A03 = C17880vN.A0n(i);
        bqn.A02 = 1L;
        bqn.A01 = num;
        bqn.A00 = C17880vN.A0i();
        this.A00.CC7(bqn);
    }
}
