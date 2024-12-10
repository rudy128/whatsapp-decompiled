package X;

import android.os.CancellationSignal;
import java.util.Map;

/* renamed from: X.BSs  reason: case insensitive filesystem */
public class C22864BSs extends C22814BQp {
    public final /* synthetic */ CancellationSignal A00;
    public final /* synthetic */ DD5 A01;
    public final /* synthetic */ ECs A02;
    public final /* synthetic */ C28605E9w A03;
    public final /* synthetic */ C25256Cbv A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22864BSs(CancellationSignal cancellationSignal, C25268CcD ccD, DD5 dd5, ECs eCs, ECs eCs2, C28605E9w e9w, C28605E9w e9w2, C25256Cbv cbv) {
        super(ccD, eCs, e9w, "LocalThumbnailBitmapSdk29Producer");
        this.A01 = dd5;
        this.A03 = e9w2;
        this.A02 = eCs2;
        this.A04 = cbv;
        this.A00 = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.DBJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00() {
        /*
            r7 = this;
            X.Cbv r6 = r7.A04
            r0 = 2048(0x800, float:2.87E-42)
            android.util.Size r4 = new android.util.Size
            r4.<init>(r0, r0)
            r5 = 0
            X.DD5 r0 = r7.A01     // Catch:{ IllegalArgumentException -> 0x0031 }
            android.net.Uri r1 = r6.A03     // Catch:{ IllegalArgumentException -> 0x0031 }
            android.content.ContentResolver r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0031 }
            java.lang.String r3 = X.C20012A3c.A00(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0031 }
            if (r3 == 0) goto L_0x0031
            java.lang.String r1 = X.C197109wA.A00(r3)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "video/"
            boolean r2 = X.AnonymousClass1YE.A0A(r1, r0, r2)
        L_0x0023:
            java.io.File r1 = X.C108945cZ.A17(r3)
            android.os.CancellationSignal r0 = r7.A00
            if (r2 == 0) goto L_0x0040
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.createVideoThumbnail(r1, r4, r0)
        L_0x002f:
            if (r2 != 0) goto L_0x0045
        L_0x0031:
            X.DD5 r0 = r7.A01
            android.content.ContentResolver r2 = r0.A00
            android.net.Uri r1 = r6.A03
            android.os.CancellationSignal r0 = r7.A00
            android.graphics.Bitmap r2 = r2.loadThumbnail(r1, r4, r0)
            if (r2 != 0) goto L_0x0045
            return r5
        L_0x0040:
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.createImageThumbnail(r1, r4, r0)
            goto L_0x002f
        L_0x0045:
            X.DBJ r1 = X.DBJ.A00
            if (r1 != 0) goto L_0x0050
            X.DBJ r1 = new X.DBJ
            r1.<init>()
            X.DBJ.A00 = r1
        L_0x0050:
            X.CYh r0 = X.C25112CYh.A03
            X.BSE r3 = new X.BSE
            r3.<init>(r2, r1, r0)
            X.ECs r2 = r7.A02
            java.lang.String r1 = "image_format"
            java.lang.String r0 = "thumbnail"
            r2.CD2(r1, r0)
            java.util.Map r0 = r2.BRV()
            r3.CD3(r0)
            X.DRN r5 = X.DRN.A01(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22864BSs.A00():java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A03(Object obj) {
        DRN drn = (DRN) obj;
        if (drn != null) {
            drn.close();
        }
    }

    public void A01() {
        super.A01();
        this.A00.cancel();
    }

    public void A02(Exception exc) {
        super.A02(exc);
        C28605E9w e9w = this.A03;
        ECs eCs = this.A02;
        e9w.C9Q(eCs, "LocalThumbnailBitmapSdk29Producer", false);
        eCs.CD4("local", "thumbnail_bitmap");
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        super.A04(obj);
        C28605E9w e9w = this.A03;
        ECs eCs = this.A02;
        e9w.C9Q(eCs, "LocalThumbnailBitmapSdk29Producer", AnonymousClass000.A1W(obj));
        eCs.CD4("local", "thumbnail_bitmap");
    }

    public /* bridge */ /* synthetic */ Map A05(Object obj) {
        return C27311Dbi.A00("createdThumbnail", String.valueOf(AnonymousClass000.A1W(obj)));
    }
}
