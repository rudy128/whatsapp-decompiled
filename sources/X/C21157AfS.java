package X;

/* renamed from: X.AfS  reason: case insensitive filesystem */
public final class C21157AfS implements AnonymousClass8A2 {
    public final /* synthetic */ C185429cZ A00;
    public final /* synthetic */ AnonymousClass86X A01;
    public final /* synthetic */ AnonymousClass86X A02;
    public final /* synthetic */ Object A03;

    public C21157AfS(C185429cZ r1, AnonymousClass86X r2, AnonymousClass86X r3, Object obj) {
        this.A00 = r1;
        this.A03 = obj;
        this.A02 = r2;
        this.A01 = r3;
    }

    private final void A00() {
        AnonymousClass00H r0 = this.A00.A02;
        if (r0 != null) {
            C17880vN.A0d(r0).CGP(new C21451AkI(this.A03, this.A01.BM3(), 15));
        } else {
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = "bloks_response"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0072 }
            X.C18070vi.A0b(r0)     // Catch:{ JSONException -> 0x0072 }
            byte[] r0 = X.AnonymousClass8BT.A1a(r0)
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x006c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006c }
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x0065 }
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()     // Catch:{ all -> 0x005e }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0057 }
            java.nio.charset.Charset r0 = X.C19620yd.A0C     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r2.toString(r0)     // Catch:{ all -> 0x0057 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x0057 }
            r2.close()     // Catch:{ all -> 0x005e }
            r3.close()     // Catch:{ all -> 0x0065 }
            r4.close()     // Catch:{ IOException -> 0x006c }
            X.9cZ r0 = r6.A00
            X.9WP r4 = r0.A00
            if (r4 == 0) goto L_0x0050
            java.lang.Object r3 = r6.A03
            X.86X r2 = r6.A02
            X.86X r0 = r6.A01
            X.AOU r1 = new X.AOU
            r1.<init>(r4, r2, r0, r3)
            r0 = 0
            X.C196529vD.A00(r1, r0, r5)
            return
        L_0x0050:
            java.lang.String r0 = "accountLinkingExtensionsHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x006c }
            throw r0     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0072:
            r6.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21157AfS.onSuccess(java.lang.Object):void");
    }

    public void BrA() {
        A00();
    }

    public void Bsx(Exception exc, Integer num) {
        A00();
    }
}
