package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;

/* renamed from: X.CyB  reason: case insensitive filesystem */
public class C26349CyB implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Rect A02;
    public final /* synthetic */ C26810DEs A03;
    public final /* synthetic */ E9C A04;
    public final /* synthetic */ C25729Ckz A05;
    public final /* synthetic */ CZR A06;

    public C26349CyB(Rect rect, C26810DEs dEs, E9C e9c, C25729Ckz ckz, CZR czr, int i, int i2) {
        this.A03 = dEs;
        this.A00 = i;
        this.A02 = rect;
        this.A05 = ckz;
        this.A01 = i2;
        this.A04 = e9c;
        this.A06 = czr;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Rect rect;
        Rect A07;
        int i;
        Integer valueOf;
        Float valueOf2;
        Float valueOf3;
        byte[] bArr2 = bArr;
        if (C25921Cof.A00()) {
            bArr2 = C25921Cof.A01();
        } else if (this.A03.A0T.get()) {
            Log.d("Camera1Device", "Photo capture took too long, not invoking photo capture callback");
            return;
        }
        if (bArr2 != null) {
            int A002 = C25317CdN.A00(bArr2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
            rect = new Rect(0, 0, options.outWidth, options.outHeight);
            C24557C9d.A00(rect, this.A02, this.A00, A002);
            A07 = rect;
        } else {
            rect = null;
            A07 = AnonymousClass3MW.A07();
        }
        Rect rect2 = this.A02;
        int i2 = this.A00;
        C26810DEs dEs = this.A03;
        CZR czr = new CZR(A07, rect2, i2, dEs.A00);
        CKO cko = C25751ClL.A0d;
        C25729Ckz ckz = this.A05;
        czr.A01(cko, ckz.A00(C25729Ckz.A08));
        czr.A01(C25751ClL.A0X, bArr2);
        Cy7 cy7 = dEs.A0N;
        CKO cko2 = C25751ClL.A0e;
        if (cy7.A0B) {
            i = cy7.A09;
        } else {
            i = 0;
        }
        czr.A01(cko2, Integer.valueOf(i));
        czr.A01(C25751ClL.A0c, Integer.valueOf(this.A01));
        C25751ClL clL = new C25751ClL(czr);
        E9C e9c = this.A04;
        dEs.A0S.A05(new C27076DTa(clL, e9c, 12), dEs.A0R.A03);
        EBS ebs = dEs.A06;
        C28111Yx.A02(ebs);
        if (!BE9.A1S(EBS.A0I, ebs) && bArr2 != null) {
            boolean z = C26120Csi.A05;
            C26120Csi csi = new C26120Csi(BE6.A0h(bArr2));
            CZR czr2 = this.A06;
            CKO cko3 = C25751ClL.A0T;
            Long l = null;
            double A022 = csi.A02("ExposureTime");
            if (A022 != -1.0d) {
                l = Long.valueOf((long) (A022 * Math.pow(10.0d, 9.0d)));
            }
            czr2.A01(cko3, l);
            CKO cko4 = C25751ClL.A0Z;
            Integer num = null;
            int A032 = csi.A03("PhotographicSensitivity", -1);
            if (A032 == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(A032);
            }
            czr2.A01(cko4, valueOf);
            CKO cko5 = C25751ClL.A0O;
            double A023 = csi.A02("ApertureValue");
            if (A023 == -1.0d) {
                valueOf2 = null;
            } else {
                valueOf2 = Float.valueOf((float) A023);
            }
            czr2.A01(cko5, valueOf2);
            CKO cko6 = C25751ClL.A0V;
            double A024 = csi.A02("FocalLength");
            if (A024 == -1.0d) {
                valueOf3 = null;
            } else {
                valueOf3 = Float.valueOf((float) A024);
            }
            czr2.A01(cko6, valueOf3);
            CKO cko7 = C25751ClL.A0P;
            int A033 = csi.A03("WhiteBalance", -1);
            if (A033 != -1) {
                num = Integer.valueOf(A033);
            }
            czr2.A01(cko7, num);
        }
        C26810DEs dEs2 = dEs;
        dEs2.A0B(dEs.A06, e9c, ckz, this.A06, clL);
        BE9.A1M(dEs.A0M.A00);
        if (rect != null) {
            C26175Cts.A01((Object) null, 21, rect.width() * rect.height());
        } else {
            C26175Cts.A01(AnonymousClass000.A0n("JPEG byte array was null."), 22, 0);
        }
    }
}
