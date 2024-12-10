package X;

import java.io.File;

/* renamed from: X.6L1  reason: invalid class name */
public final class AnonymousClass6L1 extends C24741Lm {
    public final C002100z A00;
    public final C002100z A01;
    public final C002100z A02;
    public final C002100z A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C134976rS A01(X.AnonymousClass6L1 r10, java.io.InputStream r11, java.lang.String r12, long r13) {
        /*
            java.lang.String r2 = "LottieCache/getJsonObjectFromStream failed to create lottie json"
            java.lang.String r0 = "LottieCache/getJsonObjectFromStream"
            X.1Ez r1 = new X.1Ez
            r1.<init>((java.lang.String) r0)
            r1.A04()
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()
            java.io.ByteArrayOutputStream r6 = X.C108945cZ.A15()
            r9 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r3.<init>(r11)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.00H r0 = r10.A06     // Catch:{ all -> 0x0119 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0119 }
            X.64b r0 = (X.C1185964b) r0     // Catch:{ all -> 0x0119 }
            boolean r0 = r0.A01(r5, r6, r3)     // Catch:{ all -> 0x0119 }
            r6.close()     // Catch:{ all -> 0x0120 }
            r5.close()     // Catch:{ all -> 0x0127 }
            r3.close()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            if (r0 != 0) goto L_0x0042
            X.628 r1 = new X.628     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r1.<init>()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.18K r0 = r10.A05     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0.CC7(r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            return r9
        L_0x0042:
            long r3 = r1.A02()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.62n r7 = new X.62n     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r7.<init>()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r7.A00 = r0     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r7.A02 = r0     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            double r0 = (double) r13     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r3 = 4662219572839972864(0x40b3880000000000, double:5000.0)
            double r0 = r0 / r3
            double r3 = java.lang.Math.ceil(r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r3 = r3 * r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r0
            long r0 = (long) r3     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r7.A01 = r0     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.18K r0 = r10.A05     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0.CC7(r7)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            byte[] r0 = r5.toByteArray()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.nio.charset.Charset r1 = X.C26571Sq.A05     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r4 = new java.lang.String     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r4.<init>(r0, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            byte[] r0 = r6.toByteArray()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r5 = new java.lang.String     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r5.<init>(r0, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            boolean r0 = X.AnonymousClass1YF.A0T(r5)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x00ac
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            org.json.JSONObject r1 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r0 = "customProps"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            goto L_0x0104
        L_0x00ac:
            java.lang.String r0 = "\"customProps\"\\s*:\\s*\\{"
            X.1wr r1 = new X.1wr     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r1.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0 = 0
            X.6pE r1 = r1.A02(r4, r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            if (r1 == 0) goto L_0x0107
            X.1Oc r0 = r1.A00()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            int r8 = r0.A00     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.1Oc r0 = r1.A00()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            int r7 = r0.A01     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r1 = 1
        L_0x00c7:
            int r7 = r7 + 1
            r6 = 125(0x7d, float:1.75E-43)
            r5 = 123(0x7b, float:1.72E-43)
            if (r1 == 0) goto L_0x00e3
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            if (r7 >= r0) goto L_0x00e3
            char r0 = r4.charAt(r7)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            if (r0 != r5) goto L_0x00de
            int r1 = r1 + 1
            goto L_0x00c7
        L_0x00de:
            if (r0 != r6) goto L_0x00c7
            int r1 = r1 + -1
            goto L_0x00c7
        L_0x00e3:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.1Oc r0 = X.C28851b7.A08(r8, r7)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            int r1 = r0.A00     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            int r0 = r0.A01     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            int r0 = r0 + 1
            java.lang.String r1 = X.C108955ca.A0q(r1, r0, r4)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r0 = X.C17890vO.A0Z(r1, r0, r5)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r3.append(r0)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            java.lang.String r1 = X.C17890vO.A0c(r3, r6)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
        L_0x0104:
            if (r1 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r1 = r9
            goto L_0x010e
        L_0x0109:
            X.00z r0 = r10.A02     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0.A08(r12, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
        L_0x010e:
            X.00z r0 = r10.A01     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0.A08(r12, r4)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            X.6rS r0 = new X.6rS     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            r0.<init>(r4, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            return r0
        L_0x0119:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
            throw r0     // Catch:{ JSONException -> 0x0133, IOException -> 0x012e }
        L_0x012e:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r9
        L_0x0133:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L1.A01(X.6L1, java.io.InputStream, java.lang.String, long):X.6rS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(X.AnonymousClass6L1 r3, java.io.File r4) {
        /*
            X.00z r3 = r3.A03
            java.lang.String r0 = r4.getAbsolutePath()
            X.C18070vi.A0X(r0)
            java.lang.Object r1 = r3.A04(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003c
            java.io.FileInputStream r2 = X.C108945cZ.A18(r4)
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x0035 }
            X.C1402370n.A02(r2, r0)     // Catch:{ all -> 0x0035 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x0035 }
            r2.close()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r4.getAbsolutePath()
            X.C18070vi.A0X(r0)
            r3.A08(r0, r1)
            return r1
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L1.A02(X.6L1, java.io.File):java.lang.String");
    }

    public final C39801tf A0A(File file, String str) {
        if (C18020vd.A05(C18040vf.A02, this.A04, 8743)) {
            return null;
        }
        if (str == null) {
            str = A02(this, file);
        }
        C002100z r2 = this.A00;
        C39801tf r1 = (C39801tf) r2.A04(str);
        if (r1 != null) {
            return r1;
        }
        String str2 = (String) this.A01.A04(str);
        if (str2 == null) {
            C134976rS A002 = A00(this, file, str);
            if (A002 == null) {
                return null;
            }
            str2 = A002.A00;
        }
        C39801tf r0 = (C39801tf) C39771tc.A05(str2).A00;
        if (r0 == null) {
            return null;
        }
        r2.A08(str, r0);
        return r0;
    }

    public void C9L(C122516Qr r3, boolean z) {
        this.A00.A07(-1);
        this.A01.A07(-1);
        this.A02.A07(-1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6L1(C18030ve r3, AnonymousClass18K r4, C24571Kv r5, AnonymousClass00H r6) {
        super(r5);
        C18070vi.A0s(r5, r3, r4, r6);
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r6;
        int A002 = C18020vd.A00(C18040vf.A02, r3, 7185);
        A002 = A002 <= 0 ? 20 : A002;
        this.A00 = new C002100z(A002);
        this.A01 = new C002100z(A002);
        this.A02 = new C002100z(A002);
        this.A03 = new C002100z(A002);
        A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C134976rS A00(X.AnonymousClass6L1 r3, java.io.File r4, java.lang.String r5) {
        /*
            java.io.FileInputStream r2 = X.C108945cZ.A18(r4)
            long r0 = r4.length()     // Catch:{ all -> 0x0010 }
            X.6rS r0 = A01(r3, r2, r5, r0)     // Catch:{ all -> 0x0010 }
            r2.close()
            return r0
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L1.A00(X.6L1, java.io.File, java.lang.String):X.6rS");
    }

    public String BZc() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LottieCache - ");
        A10.append(this.A01.A02());
        return AnonymousClass000.A0y(" items", A10);
    }
}
