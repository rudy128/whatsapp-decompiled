package X;

public class C2Q extends Exception {
    public final C26125Csn codecInfo;
    public final String diagnosticInfo;
    public final C2Q fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2Q(X.D48 r9, java.lang.Throwable r10, int r11, boolean r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "], "
            java.lang.String r3 = X.AnonymousClass001.A1E(r9, r0, r1)
            java.lang.String r4 = r9.A0S
            java.lang.String r2 = "neg_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "com.facebook.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r1.append(r0)
            r1.append(r2)
            int r0 = java.lang.Math.abs(r11)
            java.lang.String r5 = X.C17880vN.A0t(r1, r0)
            r1 = 0
            r0 = r8
            r6 = r10
            r7 = r12
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Q.<init>(X.D48, java.lang.Throwable, int, boolean):void");
    }

    public C2Q(C26125Csn csn, C2Q c2q, String str, String str2, String str3, Throwable th, boolean z) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = csn;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = c2q;
    }
}
