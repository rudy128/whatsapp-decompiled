package X;

import java.util.Locale;

/* renamed from: X.A6m  reason: case insensitive filesystem */
public abstract class C20085A6m {
    public static final String A04(int i) {
        if (i == 1) {
            return "Visa";
        }
        if (i == 2) {
            return "MasterCard";
        }
        if (i == 3) {
            return "American Express";
        }
        if (i == 4) {
            return "Discover";
        }
        if (i != 5) {
            return null;
        }
        return "Elo";
    }

    public static final int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            switch (str.hashCode()) {
                case -1352291591:
                    z = str.equals("credit");
                    i = 4;
                    break;
                case -318370833:
                    z = str.equals("prepaid");
                    i = 8;
                    break;
                case 94843278:
                    z = str.equals("combo");
                    i = 6;
                    break;
                case 95458540:
                    z = str.equals("debit");
                    i = 1;
                    break;
                case 433141802:
                    z = str.equals("UNKNOWN");
                    i = 7;
                    break;
            }
            if (!z) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    public static final int A01(String str) {
        String str2;
        if (str != null) {
            str2 = C108975cc.A0d(str);
        } else {
            str2 = null;
        }
        Locale locale = Locale.ROOT;
        if (C18070vi.A18(str2, AnonymousClass8BS.A0p(locale, "visa"))) {
            return 1;
        }
        if (C18070vi.A18(str2, AnonymousClass8BS.A0p(locale, "mastercard"))) {
            return 2;
        }
        if (C18070vi.A18(str2, AnonymousClass8BS.A0p(locale, "amex"))) {
            return 3;
        }
        if (C18070vi.A18(str2, AnonymousClass8BS.A0p(locale, "discover"))) {
            return 4;
        }
        if (C18070vi.A18(str2, AnonymousClass8BS.A0p(locale, "elo"))) {
            return 5;
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8pK, X.AEs] */
    public static final AnonymousClass8pK A02(C63572tK r2, C170278pb r3, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        String str3;
        int i7;
        int i8;
        C1418477e r0;
        if (r3 != null) {
            if ((r3 instanceof AnonymousClass8pJ) || (r3 instanceof AnonymousClass8pX)) {
                r0 = null;
            } else if (r3 instanceof AnonymousClass8pY) {
                r0 = ((AnonymousClass8pY) r3).A08;
            } else {
                r0 = ((AnonymousClass8pW) r3).A01;
            }
            str3 = (String) AnonymousClass8BT.A0q(r0);
        } else {
            str3 = null;
        }
        ? aEs = new C20284AEs();
        aEs.A01 = i6;
        aEs.A00 = i;
        aEs.A0B = str3;
        C17960vV.A07(r2);
        aEs.A07 = r2;
        aEs.A08(i2);
        aEs.A07(i3);
        if (i4 != 1 || aEs.A07.A00 == (i8 = aEs.A00)) {
            aEs.A03 = i4;
            if (i5 != 1 || aEs.A07.A01 == (i7 = aEs.A00)) {
                aEs.A02 = i5;
                aEs.A0A = str;
                if (str2 != null) {
                    aEs.A0B(str2);
                }
                aEs.A05 = j;
                aEs.A08 = r3;
                return aEs;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: ");
            A10.append(i7);
            throw AnonymousClass001.A12(" in country cannot be primary account type", A10);
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("PAY: ");
        A102.append(i8);
        throw AnonymousClass001.A12(" in country cannot be primary account type", A102);
    }

    public static final String A03(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "visa";
        }
        if (i == 2) {
            return "mastercard";
        }
        if (i == 3) {
            return "amex";
        }
        if (i != 4) {
            return i == 5 ? "elo" : "unknown";
        }
        return "discover";
    }
}
