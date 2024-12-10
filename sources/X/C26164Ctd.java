package X;

/* renamed from: X.Ctd  reason: case insensitive filesystem */
public abstract class C26164Ctd {
    public static int A02(int i) {
        return C23301Bep.A00(i << 3);
    }

    public static void A04(C23301Bep bep, int i) {
        bep.A03((i << 3) | 2);
    }

    public static void A05(C23301Bep bep, int i, int i2) {
        bep.A03(i2 << 3);
        bep.A03((i >> 31) ^ (i << 1));
    }

    public static void A06(C23301Bep bep, int i, long j) {
        bep.A03(i << 3);
        bep.A09(j);
    }

    public static int A03(int i, int i2) {
        return i2 + C23301Bep.A00(i) + i;
    }
}
