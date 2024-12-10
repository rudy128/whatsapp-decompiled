package X;

/* renamed from: X.0OO  reason: invalid class name */
public final class AnonymousClass0OO {
    public int A00;
    public C03210Hb A01;
    public final C06970a9 A02 = C06970a9.A02(new C03210Hb[16]);

    public static final int A00(C06970a9 r5, int i) {
        int i2 = r5.A00 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = r5.A01;
            int i5 = ((C03210Hb) objArr[i4]).A01;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C03210Hb) objArr[i3]).A01) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    private final void A01(int i) {
        if (i < 0 || i >= this.A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Index ");
            A10.append(i);
            A10.append(", size ");
            A10.append(this.A00);
            throw new IndexOutOfBoundsException(A10.toString());
        }
    }

    public C03210Hb A02(int i) {
        A01(i);
        C03210Hb r0 = this.A01;
        if (r0 != null) {
            int i2 = r0.A01;
            if (i < r0.A00 + i2 && i2 <= i) {
                return r0;
            }
        }
        C06970a9 r02 = this.A02;
        C03210Hb r03 = (C03210Hb) r02.A01[A00(r02, i)];
        this.A01 = r03;
        return r03;
    }

    public void A03(C22821Di r5, int i, int i2) {
        A01(i);
        A01(i2);
        if (i2 >= i) {
            C06970a9 r3 = this.A02;
            int A002 = A00(r3, i);
            int i3 = ((C03210Hb) r3.A01[A002]).A01;
            while (i3 <= i2) {
                C03210Hb r0 = (C03210Hb) r3.A01[A002];
                r5.invoke(r0);
                i3 += r0.A00;
                A002++;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("toIndex (");
        A10.append(i2);
        A10.append(") should be not smaller than fromIndex (");
        throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, i));
    }
}
