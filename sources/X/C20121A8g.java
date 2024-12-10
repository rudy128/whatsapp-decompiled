package X;

import java.util.List;

/* renamed from: X.A8g  reason: case insensitive filesystem */
public abstract class C20121A8g {
    public static C29621ca A03(C29621ca r1, C20121A8g a8g) {
        C29621ca.A04(r1, "iq");
        return a8g.BVP();
    }

    public static C29591cX A04(C178759Ei r2, String str) {
        C29591cX r1 = new C29591cX(str);
        r1.A06((C29621ca) r2.A00);
        return r1;
    }

    public static C29591cX A05(String str) {
        C29591cX r1 = new C29591cX("fbid");
        if (C29601cY.A04(str, 1, 20, false)) {
            r1.A07(str);
        }
        return r1;
    }

    public static C29591cX A06(String str, byte[] bArr) {
        C29591cX r2 = new C29591cX(str);
        C29601cY.A02(bArr, 1, 128);
        return r2;
    }

    public static C29591cX A07(String str, byte[] bArr) {
        C29591cX r4 = new C29591cX(str);
        C29601cY.A02(bArr, 1, 1024);
        r4.A01 = bArr;
        return r4;
    }

    public static void A08(C29591cX r1, int i, long j) {
        if (i != 0) {
            r1.A07(String.valueOf(j));
        }
    }

    public static void A0B(C29591cX r1, C178709Ed r2) {
        if (r2 != null) {
            r1.A05((C29621ca) r2.A00);
        }
    }

    public static boolean A0C(List list) {
        return C29601cY.A05(list, 1, 1000);
    }

    public C29621ca BVP() {
        Object obj;
        if (this instanceof AnonymousClass9EZ) {
            return ((AnonymousClass9EZ) this).A00;
        }
        if (this instanceof C178679Ea) {
            return ((C178679Ea) this).A00;
        }
        if (this instanceof C178689Eb) {
            return ((C178689Eb) this).A00;
        }
        if (this instanceof AnonymousClass9F1) {
            return ((AnonymousClass9F1) this).A00;
        }
        if (this instanceof AnonymousClass9F5) {
            AnonymousClass9F5 r1 = (AnonymousClass9F5) this;
            switch (r1.A00) {
                case 3:
                case 4:
                case 8:
                case 15:
                    obj = r1.A01;
                    break;
                default:
                    obj = r1.A02;
                    break;
            }
        } else if (this instanceof AnonymousClass9F2) {
            obj = ((AnonymousClass9F2) this).A02;
        } else if (this instanceof AnonymousClass9F4) {
            obj = ((AnonymousClass9F4) this).A00;
        } else if (this instanceof AnonymousClass9F7) {
            obj = ((AnonymousClass9F7) this).A00;
        } else if (this instanceof AnonymousClass9F6) {
            obj = ((AnonymousClass9F6) this).A00;
        } else if (this instanceof AnonymousClass9F3) {
            obj = ((AnonymousClass9F3) this).A04;
        } else if (this instanceof C178699Ec) {
            C178699Ec r12 = (C178699Ec) this;
            switch (r12.A00) {
                case 3:
                case 4:
                    obj = r12.A02;
                    break;
                default:
                    obj = r12.A01;
                    break;
            }
        } else if (this instanceof C178719Ee) {
            obj = ((C178719Ee) this).A00;
        } else {
            obj = ((C178709Ed) this).A00;
        }
        return (C29621ca) obj;
    }

    public static void A09(C29591cX r1, C20121A8g a8g) {
        r1.A06(a8g.BVP());
    }

    public static void A0A(C29591cX r1, C22469B9b b9b) {
        r1.A06(b9b.BVP());
    }
}
