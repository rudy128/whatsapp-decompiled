package X;

import android.content.Context;
import android.view.TextureView;

public final class CX1 {
    public final CQP A00;
    public final AnonymousClass11P A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(C27900Dnb.A00);
    public final C18100vl A03 = AnonymousClass1DF.A01(new C27612DiI(this));
    public final CQQ A04;

    /* JADX WARNING: type inference failed for: r13v0, types: [X.E94, java.lang.Object] */
    public final DAT A00(Context context, AnonymousClass4D9 r34, C18030ve r35, String str, boolean z) {
        C26706DAf dAf = new C26706DAf(0);
        boolean z2 = z;
        C17900vP.A0n("LiteCameraArFactory/createArCameraController/useCamera1 = ", AnonymousClass000.A10(), z2);
        Context context2 = context;
        TextureView textureView = new TextureView(context2);
        int A002 = AnonymousClass4ZO.A00(r34);
        CQQ cqq = this.A04;
        ? obj = new Object();
        C26704DAd dAd = new C26704DAd(this, 0);
        C18040vf r0 = C18040vf.A02;
        C18030ve r1 = r35;
        String str2 = str;
        CQQ cqq2 = cqq;
        boolean z3 = z2;
        C26706DAf dAf2 = dAf;
        C26704DAd dAd2 = dAd;
        TextureView textureView2 = textureView;
        BTP btp = new BTP(context2, textureView2, dAd2, dAf2, obj, cqq2, str2, A002, z3, !C18020vd.A05(r0, r1, 11831), C18020vd.A05(r0, r1, 12269), !C18020vd.A05(r0, r1, 12787), C18020vd.A05(r0, r1, 12786), C18020vd.A05(r0, r1, 12824), C18020vd.A05(r0, r1, 12826), C18020vd.A05(r0, r1, 12825), C18020vd.A05(r0, r1, 12788), C18020vd.A05(r0, r1, 12845), C18020vd.A05(r0, r1, 12851), C18020vd.A05(r0, r1, 12849), C18020vd.A05(r0, r1, 12850), C18020vd.A05(r0, r1, 12907), C18020vd.A05(r0, r1, 12844));
        TextureView textureView3 = btp.A03;
        E49 e49 = btp.A05;
        boolean z4 = btp.A0C;
        boolean z5 = btp.A0K;
        boolean z6 = btp.A0L;
        boolean z7 = btp.A00;
        boolean z8 = btp.A0H;
        boolean z9 = btp.A0J;
        boolean z10 = btp.A0I;
        boolean z11 = btp.A0F;
        boolean z12 = btp.A0B;
        boolean z13 = btp.A0M;
        boolean z14 = btp.A0G;
        boolean z15 = btp.A0A;
        boolean z16 = z4;
        String str3 = btp.A08;
        TextureView textureView4 = textureView3;
        C25511Ch9 A003 = C8J.A00(textureView4, e49, str3, z16, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15);
        C28552E7c deh = new DEH(btp.A04, 1);
        C28552E7c dei = new DEI(btp.A09, btp.A0D, btp.A0E);
        C28552E7c deh2 = new DEH(btp, 0);
        return new DAT(C25629CjF.A00.A00(btp.A02, A003, deh, dei, deh2));
    }

    public CX1(CQP cqp, CQQ cqq, AnonymousClass11P r4) {
        C18070vi.A0o(r4, cqp, cqq);
        this.A01 = r4;
        this.A00 = cqp;
        this.A04 = cqq;
    }
}
