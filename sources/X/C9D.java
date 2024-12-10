package X;

public abstract class C9D {
    public static final void A00(int i, int i2, int i3, int i4, int i5) {
        boolean A1Q = AnonymousClass000.A1Q(i4);
        Integer valueOf = Integer.valueOf(i4);
        C26208Cuj.A03("count (%d) ! >= 0", new Object[]{valueOf}, A1Q);
        boolean A1Q2 = AnonymousClass000.A1Q(i);
        Integer valueOf2 = Integer.valueOf(i);
        C26208Cuj.A03("offset (%d) ! >= 0", new Object[]{valueOf2}, A1Q2);
        Integer valueOf3 = Integer.valueOf(i3);
        boolean A1U = BE8.A1U(i + i4, i5);
        Object[] A1a = C108945cZ.A1a(valueOf2, valueOf, 3, 1);
        A1a[2] = Integer.valueOf(i5);
        C26208Cuj.A03("offset (%d) + count (%d) ! <= %d", A1a, A1U);
        boolean A1U2 = BE8.A1U(i3 + i4, i2);
        Object[] objArr = new Object[3];
        objArr[0] = valueOf3;
        BE8.A1A(valueOf, objArr, 1, i2, 2);
        C26208Cuj.A03("otherOffset (%d) + count (%d) ! <= %d", objArr, A1U2);
    }
}
