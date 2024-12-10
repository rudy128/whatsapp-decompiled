package X;

import android.content.Context;
import android.view.TextureView;

public final class CX2 {
    public final CQP A00;
    public final CQQ A01;
    public final AnonymousClass11P A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(C27911Dnm.A00);
    public final C18100vl A04 = AnonymousClass1DF.A01(new C27706Djo(this));

    /* JADX WARNING: type inference failed for: r11v0, types: [X.E94, java.lang.Object] */
    public final DAT A00(Context context, C18030ve r32, String str, boolean z) {
        Context context2 = context;
        C18070vi.A0d(context2, 0);
        AnonymousClass4D9 r4 = AnonymousClass4D9.PRE_CAPTURE;
        C26706DAf dAf = new C26706DAf(2);
        boolean z2 = z;
        C17900vP.A0n("LiteCameraFactory/createCameraController/useCamera1 = ", AnonymousClass000.A10(), z2);
        TextureView textureView = new TextureView(context2);
        int A002 = AnonymousClass4ZO.A00(r4);
        CQQ cqq = this.A01;
        ? obj = new Object();
        C26704DAd dAd = new C26704DAd(this, 2);
        C18040vf r0 = C18040vf.A02;
        C18030ve r1 = r32;
        String str2 = str;
        boolean z3 = z2;
        CQQ cqq2 = cqq;
        C26704DAd dAd2 = dAd;
        C26706DAf dAf2 = dAf;
        Context context3 = context2;
        TextureView textureView2 = textureView;
        BTP btp = new BTP(context3, textureView2, dAd2, dAf2, obj, cqq2, str2, A002, z3, !C18020vd.A05(r0, r1, 11831), C18020vd.A05(r0, r1, 12269), !C18020vd.A05(r0, r1, 12787), C18020vd.A05(r0, r1, 12786), C18020vd.A05(r0, r1, 12824), C18020vd.A05(r0, r1, 12826), C18020vd.A05(r0, r1, 12825), C18020vd.A05(r0, r1, 12788), C18020vd.A05(r0, r1, 12845), C18020vd.A05(r0, r1, 12851), C18020vd.A05(r0, r1, 12849), C18020vd.A05(r0, r1, 12850), C18020vd.A05(r0, r1, 12907), C18020vd.A05(r0, r1, 12844));
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
        boolean z16 = z5;
        boolean z17 = z6;
        TextureView textureView4 = textureView3;
        E49 e492 = e49;
        C25511Ch9 A003 = C8J.A00(textureView4, e492, btp.A08, z4, z16, z17, z7, z8, z9, z10, z11, z12, z13, z14, z15);
        C28552E7c deh = new DEH(btp.A04, 1);
        C28552E7c dei = new DEI(btp.A09, btp.A0D, btp.A0E);
        return new DAT(C25629CjF.A00.A00(btp.A02, A003, deh, dei));
    }

    public CX2(CQP cqp, CQQ cqq, AnonymousClass11P r4) {
        C18070vi.A0o(r4, cqp, cqq);
        this.A02 = r4;
        this.A00 = cqp;
        this.A01 = cqq;
    }
}
