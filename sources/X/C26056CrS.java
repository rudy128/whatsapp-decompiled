package X;

/* renamed from: X.CrS  reason: case insensitive filesystem */
public abstract class C26056CrS {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            Object[] A1a = AnonymousClass8BR.A1a();
            C17880vN.A1T(A1a, i, 0);
            C17880vN.A1T(A1a, 0, 1);
            BE8.A1M(A1a, i2);
            throw BE6.A0l(String.format("Index: %d. Start: %d. Limit: %d", A1a));
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw BE6.A0m();
        }
    }

    public static void A02(boolean z) {
        if (!z) {
            throw BE6.A0j();
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw BE6.A0k();
        }
    }
}
