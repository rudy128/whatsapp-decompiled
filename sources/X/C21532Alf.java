package X;

/* renamed from: X.Alf  reason: case insensitive filesystem */
public class C21532Alf implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final Object invoke(Object obj) {
        byte[] bArr;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                byte[] bArr2 = (byte[]) this.A03;
                byte[] bArr3 = (byte[]) obj2;
                C18070vi.A0k(bArr2, bArr3);
                C183189Xh r6 = ((C184579bB) this.A01).A01;
                Integer num = ((C187949gd) this.A02).A03;
                int length = bArr2.length;
                return new C187299fa(r6, num, bArr3, bArr2, C200310o.A09(bArr2, length - 32, length));
            case 1:
                C187949gd r7 = (C187949gd) this.A01;
                C198109xn r9 = (C198109xn) this.A02;
                C184579bB r10 = (C184579bB) this.A03;
                C187289fZ r8 = (C187289fZ) obj2;
                AnonymousClass8BX.A1J(r7, r10, r8, 0);
                byte[] A1O = C108975cc.A1O(r7.A04);
                AnonymousClass9XM r0 = r7.A01;
                if (r0 != null) {
                    bArr = r0.A00.A0M();
                } else {
                    bArr = new byte[0];
                }
                A1R a1r = r9.A00;
                byte[] A022 = a1r.A02(16);
                C165438b9 A002 = r7.A06.A00(a1r.A02(Math.max(0, (-A1O.length) - bArr.length)));
                C18070vi.A0d(A002, 0);
                return a1r.A01(AnonymousClass00R.A00, A022, new AnonymousClass9XL(A002).A00.A0M(), r8.A03).A00(new C21534Alh(r7, r8, r9, r10, A022, A1O, 2));
            default:
                C198109xn r72 = (C198109xn) this.A01;
                C187299fa r4 = (C187299fa) this.A02;
                C187289fZ r62 = (C187289fZ) this.A03;
                byte[] bArr4 = (byte[]) obj2;
                C18070vi.A0d(bArr4, 3);
                C183189Xh r02 = r4.A00;
                Integer num2 = r4.A01;
                byte[] bArr5 = r4.A04;
                try {
                    C187949gd r5 = new C187949gd(A6U.A07.A02(C196659vQ.A00(num2), new C19999A2n(r02.A00), bArr4, bArr5));
                    C21535Ali.A00(r4, 24).invoke(r72.A00.A00(AnonymousClass00R.A00, C108975cc.A1O(r5.A04), r62.A00).A00);
                    return r5;
                } catch (Exception e) {
                    throw new AnonymousClass9LI(e);
                }
        }
    }

    public C21532Alf(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
