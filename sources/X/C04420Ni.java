package X;

/* renamed from: X.0Ni  reason: invalid class name and case insensitive filesystem */
public abstract class C04420Ni {
    public static final AnonymousClass0NU A01(C26227CvJ cvJ, C25262Cc3 cc3, C28644ECa eCa, int i, int i2, boolean z) {
        AnonymousClass0NU r5;
        float f;
        float f2;
        if (cvJ != null) {
            r5 = cvJ.A0K(cc3.A01().CB1(i));
        } else {
            r5 = AnonymousClass0NU.A04;
        }
        C16000rY r0 = C03990Lk.A00;
        int CG9 = eCa.CG9(2.0f);
        if (z) {
            f2 = ((float) i2) - r5.A01;
            f = f2 - ((float) CG9);
        } else {
            f = r5.A01;
            f2 = f + ((float) CG9);
        }
        return new AnonymousClass0NU(f, r5.A03, f2, r5.A00);
    }

    public static final C17090tj A00(C17210uI r2, AnonymousClass0OP r3, C17090tj r4, boolean z) {
        return C04470Nn.A01(r4, AnonymousClass0O1.A01(), new C15060q1(r2, r3, z));
    }
}
