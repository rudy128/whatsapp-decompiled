package X;

/* renamed from: X.9jo  reason: invalid class name and case insensitive filesystem */
public final class C189769jo {
    public final C20104A7i A00;

    public C189769jo(C20104A7i a7i) {
        C18070vi.A0d(a7i, 1);
        this.A00 = a7i;
    }

    public int A00(Integer num, int i) {
        if (!C20104A7i.A00(this.A00, i).A04) {
            return C72463Mc.A0B(num);
        }
        if (num == null) {
            return i;
        }
        int intValue = num.intValue();
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            i2 |= ((intValue >> i3) & 1) << (31 - i3);
        }
        return i ^ i2;
    }
}
