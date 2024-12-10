package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.Cbv  reason: case insensitive filesystem */
public class C25256Cbv {
    public int A00;
    public File A01;
    public final int A02;
    public final Uri A03;
    public final C25798CmA A04;
    public final C24271ByU A05;
    public final C25786Clx A06;
    public final C24256ByE A07;
    public final C24330BzR A08;
    public final boolean A09;

    public synchronized File A00() {
        File file;
        file = this.A01;
        if (file == null) {
            Uri uri = this.A03;
            C26208Cuj.A01(uri.getPath());
            file = C108945cZ.A17(uri.getPath());
            this.A01 = file;
        }
        return file;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25256Cbv)) {
            return false;
        }
        C25256Cbv cbv = (C25256Cbv) obj;
        if (this.A09 != cbv.A09 || !C24545C8q.A00(this.A03, cbv.A03) || !C24545C8q.A00(this.A07, cbv.A07) || !C24545C8q.A00(this.A01, cbv.A01) || !C24545C8q.A00(this.A04, cbv.A04) || !C24545C8q.A00(this.A05, cbv.A05) || !C24545C8q.A00(this.A08, cbv.A08) || !C24545C8q.A00(Integer.valueOf(this.A00), Integer.valueOf(cbv.A00)) || !C24545C8q.A00(this.A06, cbv.A06)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0l = 0 + AnonymousClass001.A0l(this.A07);
        int hashCode = AnonymousClass000.A0h().hashCode();
        return AnonymousClass000.A0N(AnonymousClass3MY.A0f(), ((((AnonymousClass000.A0O(AnonymousClass000.A0i(), ((((((((((((A0l * 31) + AnonymousClass001.A0l(this.A03)) * 31) + hashCode) * 31 * 31) + AnonymousClass001.A0l(this.A05)) * 31) + AnonymousClass001.A0l(this.A08)) * 31) + AnonymousClass001.A0l(Integer.valueOf(this.A00))) * 31) + AnonymousClass001.A0l(Boolean.valueOf(this.A09))) * 31) * 31) + AnonymousClass001.A0l(this.A04)) * 31 * 31 * 31) + AnonymousClass001.A0l(this.A06)) * 31 * 31 * 31 * 31) + hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (X.C25955CpN.A00(r4.A00) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (X.AnonymousClass1YE.A0A(r2, "video/", false) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if ("android.resource".equals(r2.getScheme()) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25256Cbv(X.C25955CpN r4) {
        /*
            r3 = this;
            r3.<init>()
            X.ByE r0 = r4.A04
            r3.A07 = r0
            android.net.Uri r2 = r4.A00
            r3.A03 = r2
            if (r2 == 0) goto L_0x00b6
            boolean r0 = X.C20012A3c.A01(r2)
            if (r0 == 0) goto L_0x0046
            r1 = 0
        L_0x0014:
            r3.A02 = r1
            X.CmA r0 = r4.A01
            r3.A04 = r0
            X.Clx r0 = r4.A03
            if (r0 != 0) goto L_0x0020
            X.Clx r0 = X.C25786Clx.A02
        L_0x0020:
            r3.A06 = r0
            X.ByU r0 = r4.A02
            r3.A05 = r0
            X.BzR r0 = r4.A05
            r3.A08 = r0
            android.net.Uri r0 = r4.A00
            boolean r0 = X.C20012A3c.A01(r0)
            if (r0 != 0) goto L_0x003b
            android.net.Uri r0 = r4.A00
            boolean r0 = X.C25955CpN.A00(r0)
            r1 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            r3.A09 = r1
            r0 = 0
            if (r1 != 0) goto L_0x0043
            r0 = 48
        L_0x0043:
            r3.A00 = r0
            return
        L_0x0046:
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r2.getPath()
            java.lang.String r2 = X.C197109wA.A00(r0)
            r1 = 0
            if (r2 == 0) goto L_0x006c
            java.lang.String r0 = "video/"
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r0, r1)
            r1 = 2
            if (r0 != 0) goto L_0x0014
        L_0x006c:
            r1 = 3
            goto L_0x0014
        L_0x006e:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 4
            goto L_0x0014
        L_0x007c:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r1 = 5
            goto L_0x0014
        L_0x008a:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "res"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r1 = 6
            goto L_0x0014
        L_0x0099:
            java.lang.String r1 = "data"
            java.lang.String r0 = r2.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r1 = 7
            goto L_0x0014
        L_0x00a8:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)
            r1 = 8
            if (r0 != 0) goto L_0x0014
        L_0x00b6:
            r1 = -1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25256Cbv.<init>(X.CpN):void");
    }

    public String toString() {
        C26004CqL cqL = new C26004CqL(C108955ca.A0x(this));
        C26004CqL.A00(cqL, this.A03, "uri");
        C26004CqL.A00(cqL, this.A07, "cacheChoice");
        C26004CqL.A00(cqL, this.A04, "decodeOptions");
        C26004CqL.A00(cqL, (Object) null, "postprocessor");
        C26004CqL.A00(cqL, this.A05, "priority");
        C26004CqL.A00(cqL, (Object) null, "resizeOptions");
        C26004CqL.A00(cqL, this.A06, "rotationOptions");
        C26004CqL.A00(cqL, (Object) null, "bytesRange");
        C26004CqL.A00(cqL, (Object) null, "resizingAllowedOverride");
        C26004CqL.A00(cqL, (Object) null, "downsampleOverride");
        cqL.A02("progressiveRenderingEnabled", false);
        cqL.A02("localThumbnailPreviewsEnabled", false);
        cqL.A02("loadThumbnailOnly", false);
        C26004CqL.A00(cqL, this.A08, "lowestPermittedRequestLevel");
        C26004CqL.A01(cqL, "cachesDisabled", this.A00);
        cqL.A02("isDiskCacheEnabled", this.A09);
        cqL.A02("isMemoryCacheEnabled", true);
        C26004CqL.A00(cqL, (Object) null, "decodePrefetches");
        C26004CqL.A01(cqL, "delayMs", 0);
        return cqL.toString();
    }
}
