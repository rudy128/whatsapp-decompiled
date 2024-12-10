package com.whatsapp.ml.v2;

import X.AnonymousClass00H;
import X.C18070vi;
import com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher;

public final class MLModelDownloaderManagerV2 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final MLModelMetadataGraphqlFetcher A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.ml.v2.MLModelDownloaderManagerV2 r8, X.AnonymousClass8Ak r9, java.lang.String r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.AnonymousClass7UQ
            if (r0 == 0) goto L_0x008d
            r7 = r11
            X.7UQ r7 = (X.AnonymousClass7UQ) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r3 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r1 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r1) goto L_0x0093
            java.lang.Object r10 = r7.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r7.L$0
            X.6gK r5 = (X.C128566gK) r5
            X.C30691eM.A01(r3)
        L_0x0028:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            r4 = 0
            if (r3 != 0) goto L_0x0053
            X.1D9 r1 = r5.A01
            X.18j r0 = r5.A02
            X.AUZ r3 = r1.A05(r4, r0, r10, r4)
        L_0x0037:
            X.C18070vi.A0b(r3)
            java.net.HttpURLConnection r0 = r3.A01
            int r0 = r0.getContentLength()
            long r1 = (long) r0
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.181 r1 = r5.A00
            r0 = 36
            X.9Hb r0 = X.C108955ca.A0N(r1, r3, r4, r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r2, r0)
            return r0
        L_0x0053:
            X.1D9 r2 = r5.A01
            X.18j r1 = r5.A02
            r0 = -1
            android.util.Pair r0 = X.C17890vO.A0E(r3, r0)
            X.AUZ r3 = r2.A05(r0, r1, r10, r4)
            goto L_0x0037
        L_0x0061:
            X.C30691eM.A01(r3)
            X.00H r0 = r8.A03
            java.lang.Object r5 = r0.get()
            X.6gK r5 = (X.C128566gK) r5
            r7.L$0 = r5
            r7.L$1 = r10
            r7.label = r1
            X.00H r0 = r8.A01
            java.lang.Object r4 = r0.get()
            com.whatsapp.ml.v2.MLModelUtilV2 r4 = (com.whatsapp.ml.v2.MLModelUtilV2) r4
            X.708 r3 = r9.BV1()
            X.0wl r2 = r4.A03
            r1 = 0
            com.whatsapp.ml.v2.MLModelUtilV2$getPartialDownloadedModelFileSizeOrNull$2 r0 = new com.whatsapp.ml.v2.MLModelUtilV2$getPartialDownloadedModelFileSizeOrNull$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r3 = X.C30451dy.A00(r7, r2, r0)
            if (r3 != r6) goto L_0x0028
            return r6
        L_0x008d:
            X.7UQ r7 = new X.7UQ
            r7.<init>(r8, r11)
            goto L_0x0012
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelDownloaderManagerV2.A00(com.whatsapp.ml.v2.MLModelDownloaderManagerV2, X.8Ak, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.ml.v2.MLModelDownloaderManagerV2 r8, X.AnonymousClass8Ak r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.AnonymousClass7TP
            if (r0 == 0) goto L_0x0048
            r7 = r10
            X.7TP r7 = (X.AnonymousClass7TP) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0048
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r5) goto L_0x004e
            X.C30691eM.A01(r1)
        L_0x0020:
            if (r1 != 0) goto L_0x0023
            r5 = 0
        L_0x0023:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x0028:
            X.C30691eM.A01(r1)
            r7.label = r5
            X.00H r0 = r8.A01
            java.lang.Object r4 = r0.get()
            com.whatsapp.ml.v2.MLModelUtilV2 r4 = (com.whatsapp.ml.v2.MLModelUtilV2) r4
            X.708 r3 = r9.BV1()
            X.0wl r2 = r4.A03
            r1 = 0
            com.whatsapp.ml.v2.MLModelUtilV2$getPartialDownloadedModelFileSizeOrNull$2 r0 = new com.whatsapp.ml.v2.MLModelUtilV2$getPartialDownloadedModelFileSizeOrNull$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r1 = X.C30451dy.A00(r7, r2, r0)
            if (r1 != r6) goto L_0x0020
            return r6
        L_0x0048:
            X.7TP r7 = new X.7TP
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelDownloaderManagerV2.A01(com.whatsapp.ml.v2.MLModelDownloaderManagerV2, X.8Ak, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r6 != r4) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass8Ak r14, java.lang.String r15, X.C30391dr r16, X.C36001nB r17) {
        /*
            r13 = this;
            r3 = r16
            r7 = r17
            boolean r0 = r3 instanceof X.AnonymousClass7V3
            if (r0 == 0) goto L_0x00a9
            r10 = r3
            X.7V3 r10 = (X.AnonymousClass7V3) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r10.label = r2
        L_0x0016:
            java.lang.Object r6 = r10.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r10.label
            r3 = 3
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r0) goto L_0x0041
            if (r1 == r5) goto L_0x0080
            if (r1 != r3) goto L_0x00b0
            X.C30691eM.A01(r6)
        L_0x002a:
            return r6
        L_0x002b:
            X.C30691eM.A01(r6)
            r10.L$0 = r13
            r10.L$1 = r14
            r10.L$2 = r7
            r10.L$3 = r14
            r10.label = r0
            java.lang.Object r6 = A00(r13, r14, r15, r10)
            if (r6 == r4) goto L_0x007f
            r1 = r13
            r2 = r14
            goto L_0x0054
        L_0x0041:
            java.lang.Object r2 = r10.L$3
            X.8Ak r2 = (X.AnonymousClass8Ak) r2
            java.lang.Object r7 = r10.L$2
            X.1nB r7 = (X.C36001nB) r7
            java.lang.Object r14 = r10.L$1
            X.8Ak r14 = (X.AnonymousClass8Ak) r14
            java.lang.Object r1 = r10.L$0
            com.whatsapp.ml.v2.MLModelDownloaderManagerV2 r1 = (com.whatsapp.ml.v2.MLModelDownloaderManagerV2) r1
            X.C30691eM.A01(r6)
        L_0x0054:
            X.1D6 r6 = (X.AnonymousClass1D6) r6
            int r0 = X.AnonymousClass3MZ.A04(r6)
            java.lang.Object r9 = r6.second
            java.io.InputStream r9 = (java.io.InputStream) r9
            X.82r r11 = new X.82r
            r11.<init>(r14, r7, r0)
            X.00H r0 = r1.A01
            java.lang.Object r7 = r0.get()
            com.whatsapp.ml.v2.MLModelUtilV2 r7 = (com.whatsapp.ml.v2.MLModelUtilV2) r7
            X.708 r8 = r2.BV1()
            r10.L$0 = r11
            r10.L$1 = r8
            r10.L$2 = r9
            r10.L$3 = r7
            r10.label = r5
            java.lang.Object r6 = A01(r1, r14, r10)
            if (r6 != r4) goto L_0x0093
        L_0x007f:
            return r4
        L_0x0080:
            java.lang.Object r7 = r10.L$3
            com.whatsapp.ml.v2.MLModelUtilV2 r7 = (com.whatsapp.ml.v2.MLModelUtilV2) r7
            java.lang.Object r9 = r10.L$2
            java.io.InputStream r9 = (java.io.InputStream) r9
            java.lang.Object r8 = r10.L$1
            X.708 r8 = (X.AnonymousClass708) r8
            java.lang.Object r11 = r10.L$0
            X.1Di r11 = (X.C22821Di) r11
            X.C30691eM.A01(r6)
        L_0x0093:
            boolean r12 = X.AnonymousClass000.A1Y(r6)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.label = r3
            java.lang.Object r6 = r7.A02(r8, r9, r10, r11, r12)
            if (r6 != r4) goto L_0x002a
            return r4
        L_0x00a9:
            X.7V3 r10 = new X.7V3
            r10.<init>(r13, r3)
            goto L_0x0016
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelDownloaderManagerV2.A02(X.8Ak, java.lang.String, X.1dr, X.1nB):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass8Ak r8, X.C30391dr r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.AnonymousClass7TQ
            if (r0 == 0) goto L_0x004d
            r6 = r9
            X.7TQ r6 = (X.AnonymousClass7TQ) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0022
            if (r0 != r4) goto L_0x0053
            java.lang.Object r0 = X.C108955ca.A0n(r1)
        L_0x0021:
            return r0
        L_0x0022:
            X.C30691eM.A01(r1)
            com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher r3 = r7.A02
            X.708 r0 = r8.BV1()
            java.lang.String r2 = r0.A06
            X.708 r0 = r8.BV1()
            int r1 = r0.A01
            X.708 r0 = r8.BV1()
            java.lang.Integer r0 = r0.A03
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "TAR_BROTLI"
        L_0x0041:
            r6.label = r4
            java.lang.Object r0 = r3.A00(r2, r0, r6, r1)
            if (r0 != r5) goto L_0x0021
            return r5
        L_0x004a:
            java.lang.String r0 = "NONE"
            goto L_0x0041
        L_0x004d:
            X.7TQ r6 = new X.7TQ
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelDownloaderManagerV2.A03(X.8Ak, X.1dr):java.lang.Object");
    }

    public MLModelDownloaderManagerV2(MLModelMetadataGraphqlFetcher mLModelMetadataGraphqlFetcher, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = mLModelMetadataGraphqlFetcher;
    }
}
