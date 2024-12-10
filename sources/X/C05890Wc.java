package X;

/* renamed from: X.0Wc  reason: invalid class name and case insensitive filesystem */
public final class C05890Wc implements C16800tF {
    public final /* synthetic */ AnonymousClass0t6 A00;

    public C05890Wc(AnonymousClass0t6 r1) {
        this.A00 = r1;
    }

    public void BF0(float f, float f2, float f3, float f4, int i) {
        this.A00.BOJ().BF0(f, f2, f3, f4, i);
    }

    public void Bdg(float f, float f2, float f3, float f4) {
        AnonymousClass0t6 r5 = this.A00;
        C16960tV BOJ = r5.BOJ();
        long BZL = r5.BZL();
        long A0p = AnonymousClass001.A0p(AnonymousClass0QG.A02(BZL) - (f3 + f), AnonymousClass0QG.A00(BZL) - (f4 + f2));
        if (AnonymousClass0QG.A02(A0p) < 0.0f || AnonymousClass0QG.A00(A0p) < 0.0f) {
            throw AnonymousClass000.A0k("Width and height must be greater than or equal to zero");
        }
        r5.CKn(A0p);
        BOJ.CPp(f, f2);
    }

    public void CG8(float f, long j) {
        C16960tV BOJ = this.A00.BOJ();
        BOJ.CPp(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
        BOJ.CG7(f);
        BOJ.CPp(-AnonymousClass0QY.A01(j), -AnonymousClass0QY.A02(j));
    }

    public void CGs(float f, float f2, long j) {
        C16960tV BOJ = this.A00.BOJ();
        BOJ.CPp(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
        BOJ.CGr(f, f2);
        BOJ.CPp(-AnonymousClass0QY.A01(j), -AnonymousClass0QY.A02(j));
    }
}
