package X;

public abstract class AUL implements C437020o, C22512BAt {
    public void BDZ(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        AnonymousClass23N r72;
        boolean A15 = C18070vi.A15(r7, r6);
        if (!(r7 instanceof AnonymousClass23N) || (r72 = (AnonymousClass23N) r7) == null) {
            throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
        }
        AnonymousClass1BI A0H = r72.A0H();
        if (A0H != null) {
            r6.A0K(A0H.getRawString());
        } else {
            r6.A0G();
        }
        long A04 = C17880vN.A04(r72.A00);
        C166388co A0X = C17880vN.A0X(r6);
        A0X.bitField1_ |= 32;
        A0X.revokeMessageTimestamp_ = A04;
    }

    public final Integer BSW() {
        return AnonymousClass00R.A01;
    }
}
