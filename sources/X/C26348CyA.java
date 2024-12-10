package X;

import android.hardware.Camera;

/* renamed from: X.CyA  reason: case insensitive filesystem */
public final /* synthetic */ class C26348CyA implements Camera.PictureCallback {
    public final /* synthetic */ C26810DEs A00;
    public final /* synthetic */ E9C A01;
    public final /* synthetic */ C25729Ckz A02;
    public final /* synthetic */ CZR A03;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C26810DEs dEs = this.A00;
        CZR czr = this.A03;
        C25729Ckz ckz = this.A02;
        E9C e9c = this.A01;
        czr.A01(C25751ClL.A0b, bArr);
        EBS ebs = dEs.A06;
        C28111Yx.A02(ebs);
        dEs.A0B(ebs, e9c, ckz, czr, (C25751ClL) null);
        BE9.A1M(dEs.A0M.A00);
    }

    public /* synthetic */ C26348CyA(C26810DEs dEs, E9C e9c, C25729Ckz ckz, CZR czr) {
        this.A00 = dEs;
        this.A03 = czr;
        this.A02 = ckz;
        this.A01 = e9c;
    }
}
