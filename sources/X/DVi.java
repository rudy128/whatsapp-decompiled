package X;

import java.util.concurrent.Callable;

public class DVi implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public DVi(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.CAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.CAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.CAM} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.Cjg, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r8.A03
            X.EAT r2 = (X.EAT) r2
            int r0 = r8.A01
            r2.BFX(r0)
            r2.start()
            r2.CS4()
        L_0x0013:
            return r2
        L_0x0014:
            java.lang.Object r3 = r8.A03
            X.CrM r3 = (X.C26052CrM) r3
            r2 = 0
            if (r3 == 0) goto L_0x0060
            X.BzJ r1 = X.C24322BzJ.AUDIO
            int r0 = r8.A01
            X.Cmm r0 = r3.A03(r1, r0)
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = r0.A04
            X.CcJ r0 = X.BE9.A0Q(r0)
            java.io.File r0 = r0.A05
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x004d }
            X.Bzp r0 = X.C24354Bzp.CODEC_ANDROID_AUDIO_AAC     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = r0.value     // Catch:{ IOException -> 0x004d }
            r0 = 1
            X.C18070vi.A0d(r1, r0)     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = X.C180949Oo.A00(r3, r1, r2)     // Catch:{ IOException -> 0x004d }
            goto L_0x0044
        L_0x0040:
            X.Bzp r0 = X.C24354Bzp.CODEC_ANDROID_AUDIO_AAC     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = r0.value     // Catch:{ IOException -> 0x004d }
        L_0x0044:
            X.Bzp r0 = X.C24354Bzp.CODEC_AUDIO_MP3     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = r0.value     // Catch:{ IOException -> 0x004d }
            boolean r2 = r1.equals(r0)     // Catch:{ IOException -> 0x004d }
            goto L_0x0060
        L_0x004d:
            r1 = move-exception
            X.Cjg r0 = new X.Cjg
            r0.<init>()
            X.C25650Cjg.A00(r0, r1)
            java.lang.Throwable r1 = r0.A01
            if (r1 == 0) goto L_0x0060
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0060:
            java.lang.Object r0 = r8.A02
            X.CvW r0 = (X.C26236CvW) r0
            X.CXE r1 = r0.A0I
            X.CUT r7 = r0.A08
            X.CSu r3 = r0.A0F
            java.nio.ByteBuffer r0 = X.C26870DHb.A0K
            X.E55 r5 = r1.A04
            X.E7q r4 = r1.A03
            if (r2 == 0) goto L_0x007d
            X.CAM r6 = new X.CAM
            r6.<init>()
        L_0x0077:
            X.DHb r2 = new X.DHb
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0080
        L_0x007d:
            X.CAM r6 = r1.A05
            goto L_0x0077
        L_0x0080:
            int r0 = r8.A01     // Catch:{ all -> 0x0086 }
            r2.BFX(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x00a0
        L_0x0086:
            r0 = move-exception
            X.Cjg r1 = new X.Cjg
            r1.<init>()
            X.C25650Cjg.A00(r1, r0)
            X.CVE r0 = r1.A01(r2)
            r0.A00()
            java.lang.Throwable r1 = r1.A01
            if (r1 == 0) goto L_0x0013
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVi.call():java.lang.Object");
    }
}
