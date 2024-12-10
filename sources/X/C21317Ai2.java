package X;

/* renamed from: X.Ai2  reason: case insensitive filesystem */
public final class C21317Ai2 implements C22486B9s {
    public final AnonymousClass11P A00;
    public final A6F A01;

    public C21317Ai2(AnonymousClass11P r1, A6F a6f) {
        this.A01 = a6f;
        this.A00 = r1;
    }

    public boolean BCL(C186309dz r10, C22484B9q b9q, AnonymousClass5YR r12) {
        boolean A16 = C18070vi.A16(r12, r10);
        C21319Ai4 ai4 = (C21319Ai4) r12;
        String str = ai4.A0F;
        A6F a6f = this.A01;
        long A05 = C17890vO.A05(a6f.A00, A6F.A01(str, "eligibilityDurationAfterFirstImpression"));
        int i = ai4.A00;
        if (i <= 0 || A05 <= 0 || AnonymousClass8BR.A04(A05) > ((long) i)) {
            Object obj = r10.A01.get("param");
            if (obj != null) {
                if (System.currentTimeMillis() < a6f.A04(C179549Ik.IMPRESSION, str) + AnonymousClass8BW.A08((String) obj)) {
                    return false;
                }
            } else {
                throw C17880vN.A0g();
            }
        }
        return A16;
    }
}
