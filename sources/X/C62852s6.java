package X;

/* renamed from: X.2s6  reason: invalid class name and case insensitive filesystem */
public abstract class C62852s6 {
    public static final Integer A01(AnonymousClass206 r1) {
        int i;
        int i2 = r1.A0u;
        if (i2 != 55) {
            if (i2 != 57) {
                if (i2 != 85) {
                    if (i2 != 62) {
                        if (i2 != 63) {
                            switch (i2) {
                                case 25:
                                    break;
                                case 26:
                                    break;
                                case 27:
                                    break;
                                case 28:
                                    break;
                                case 29:
                                    i = 5;
                                    break;
                                case 30:
                                    break;
                                default:
                                    return null;
                            }
                        }
                        i = 4;
                        return Integer.valueOf(i);
                    }
                    i = 2;
                    return Integer.valueOf(i);
                }
                i = 3;
                return Integer.valueOf(i);
            }
            i = 1;
            return Integer.valueOf(i);
        }
        i = 0;
        return Integer.valueOf(i);
    }

    public static final String A02(C18030ve r2, AnonymousClass206 r3) {
        if (!C18020vd.A05(C18040vf.A02, r2, 6748)) {
            return null;
        }
        AnonymousClass1BI r1 = C20120A8f.A00(r3).A0v.A00;
        if (r1 == null) {
            return "ZZ";
        }
        try {
            C42811ym A0H = C42771yi.A00().A0H(AnonymousClass17K.A00(C42771yi.A00(), r1), (String) null);
            return AnonymousClass1K3.A01(Integer.toString(A0H.countryCode_), C42771yi.A03(A0H));
        } catch (C24931Mf e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InteractiveMessageUtil/retrieveSenderCountryFromPhoneNumber: Couldn't parse the contact number: ");
            C17890vO.A19(A10, e.message);
            return "ZZ";
        }
    }

    public static final int A00(AnonymousClass206 r2) {
        C20285AEt BPK;
        if (C20120A8f.A07(r2) || C20120A8f.A06(r2)) {
            return 0;
        }
        if (!(r2 instanceof AnonymousClass21K) || (BPK = ((AnonymousClass21K) r2).BPK()) == null || BPK.A00 != 6 || BPK.A07 == null) {
            return 2;
        }
        return 1;
    }
}
