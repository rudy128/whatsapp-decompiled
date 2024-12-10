package X;

/* renamed from: X.CaN  reason: case insensitive filesystem */
public final class C25171CaN {
    public int A00;
    public final byte[] A01;

    public final Object A00() {
        int i = this.A00;
        byte[] bArr = this.A01;
        if (i >= bArr.length) {
            return C30691eM.A00(BE6.A0l("Not enough data."));
        }
        byte b = bArr[i];
        this.A00 = i + 1;
        return new DSD(b);
    }

    public final Object A01() {
        Object A1J;
        long j = 0;
        int i = 0;
        while (true) {
            Object A002 = A00();
            Throwable A003 = C30671eK.A00(A002);
            if (A003 != null) {
                A1J = C108945cZ.A1J(A003);
                break;
            }
            byte b = ((DSD) A002).A00;
            long j2 = 255 & ((long) b);
            if (AnonymousClass1XO.A00((b & 255) ^ -2147483648, -2147483520) < 0) {
                A1J = new C42731ye(j | (j2 << i));
                break;
            }
            j |= (j2 & 127) << i;
            i += 7;
            if (i > 63) {
                A1J = C30691eM.A00(new C23916BsC());
                break;
            }
        }
        if (!(A1J instanceof AnonymousClass1IU)) {
            A1J = Long.valueOf(((C42731ye) A1J).A00);
        }
        if (!(!(A1J instanceof AnonymousClass1IU))) {
            return A1J;
        }
        long A05 = C17880vN.A05(A1J);
        return Long.valueOf((-(A05 & 1)) ^ (A05 >> 1));
    }

    public final Object A02(int i) {
        if (i < 0) {
            return C30691eM.A00(BE6.A0l("Length is out of bounds."));
        }
        int i2 = this.A00;
        int i3 = i2 + i;
        byte[] bArr = this.A01;
        if (i3 > bArr.length) {
            return C30691eM.A00(BE6.A0l("Not enough data."));
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] A0W = C200410p.A0W(C28851b7.A08(i2, i3), bArr);
        this.A00 += i;
        return A0W;
    }

    public C25171CaN(byte[] bArr) {
        this.A01 = bArr;
    }
}
