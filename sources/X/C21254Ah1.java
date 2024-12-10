package X;

/* renamed from: X.Ah1  reason: case insensitive filesystem */
public final class C21254Ah1 implements C22470B9c {
    public static final C21254Ah1 A00 = new C21254Ah1();

    public final Object BCF(C29621ca r7, C62672rm r8) {
        int A17 = C18070vi.A17(r7, r8);
        if (!r8.A09(r7, "single_serialized_proof")) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[7];
        b9cArr[0] = C21255Ah2.A00;
        b9cArr[A17] = C21256Ah3.A00;
        b9cArr[2] = C21257Ah4.A00;
        b9cArr[3] = C21258Ah5.A00;
        b9cArr[4] = C21259Ah6.A00;
        b9cArr[5] = C21260Ah7.A00;
        Object A06 = r8.A06(r7, "IQErrorInternalServerError|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorRequestTimeout|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorSequencingPending", C18070vi.A0O(C21261Ah8.A00, b9cArr, 6), AnonymousClass8BS.A1b(A17, 0));
        if (A06 != null) {
            return new C122336Ow(r7, (C122306Ot) A06);
        }
        return null;
    }
}
