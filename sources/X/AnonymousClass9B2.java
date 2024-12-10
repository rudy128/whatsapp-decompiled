package X;

/* renamed from: X.9B2  reason: invalid class name */
public class AnonymousClass9B2 extends A34 {
    public final /* synthetic */ C191409mY A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public AnonymousClass9B2(C191409mY r1, Runnable runnable, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AW0 aw0 = (AW0) obj;
        if (aw0 != null) {
            C191409mY r1 = this.A00;
            BBS bbs = r1.A03;
            if (bbs.CMK(aw0.A02)) {
                AnonymousClass21K r0 = r1.A00;
                C17960vV.A07(r0);
                AnonymousClass206 r02 = (AnonymousClass206) r0;
                bbs.CMz(aw0, r02.A0v.A00, r02.A0x);
                this.A00.A01 = null;
            }
        }
        this.A01.run();
        this.A00.A01 = null;
    }
}
