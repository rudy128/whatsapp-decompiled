package X;

/* renamed from: X.7rv  reason: invalid class name and case insensitive filesystem */
public final class C154927rv extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C130256j8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154927rv(C130256j8 r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0128, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            X.6j8 r6 = r8.this$0
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x012c }
            r4.<init>()     // Catch:{ JSONException -> 0x012c }
            java.util.List r0 = r6.A02     // Catch:{ JSONException -> 0x012c }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x012c }
        L_0x000d:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x012c }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r5.next()     // Catch:{ JSONException -> 0x012c }
            X.6zb r3 = (X.C139886zb) r3     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "waffle_di"
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "waffle_da"
            X.6Re r0 = r3.A00     // Catch:{ JSONException -> 0x012c }
            java.lang.String r0 = r0.iqValue     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "waffle_ds"
            java.lang.String r0 = "STORY"
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            r4.put(r0)     // Catch:{ JSONException -> 0x012c }
            goto L_0x000d
        L_0x003b:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x012c }
            r3.<init>()     // Catch:{ JSONException -> 0x012c }
            java.util.List r0 = r6.A03     // Catch:{ JSONException -> 0x012c }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x012c }
        L_0x0046:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x012c }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r5 = r7.next()     // Catch:{ JSONException -> 0x012c }
            X.6tk r5 = (X.C136396tk) r5     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "media_everstore_direct_path"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "message"
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "link_url"
            java.lang.String r0 = r5.A01     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "wa_status_id"
            java.lang.String r0 = r5.A06     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "media_type"
            java.lang.String r0 = r5.A03     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "dispatch_timestamp"
            java.lang.Long r0 = r5.A00     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = r5.A05     // Catch:{ JSONException -> 0x012c }
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "wa_music_content_media_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x012c }
        L_0x008f:
            r3.put(r2)     // Catch:{ JSONException -> 0x012c }
            goto L_0x0046
        L_0x0093:
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x012c }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x012c }
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r0 = "destinations"
            org.json.JSONObject r1 = r1.put(r0, r4)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r0 = "statuses"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch:{ JSONException -> 0x012c }
            X.C18070vi.A0b(r0)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r0 = X.C18070vi.A0H(r0)
            byte[] r4 = X.C108975cc.A1O(r0)
            int r0 = r4.length
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>(r0)
            r2 = 1
            r1 = 0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ all -> 0x0125 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0125 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0125 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0125 }
            r2.write(r4)     // Catch:{ all -> 0x011e }
            r2.close()     // Catch:{ all -> 0x011e }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x011e }
            r5 = 2
            byte[] r0 = android.util.Base64.encode(r0, r5)     // Catch:{ all -> 0x011e }
            r4 = 0
            r2.close()     // Catch:{ all -> 0x0125 }
            r3.close()
            X.C18070vi.A0X(r0)
            X.6lj r2 = r6.A00
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0111 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0111 }
            r0 = 24
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x010a }
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            r0.nextBytes(r1)     // Catch:{ all -> 0x010a }
            X.6QZ r2 = r2.A00(r3, r1)     // Catch:{ all -> 0x010a }
            byte[] r0 = X.AnonymousClass1EY.A04(r2)     // Catch:{ all -> 0x0103 }
            r2.close()     // Catch:{ all -> 0x010a }
            r3.close()     // Catch:{ IOException -> 0x0111 }
            goto L_0x0117
        L_0x0103:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            java.lang.String r0 = "CrosspostPurposeEncryptionClient/encrypt IOException: data cannot be encrypted"
            X.C31081ez.A01(r0)
            r0 = r4
        L_0x0117:
            if (r0 == 0) goto L_0x011d
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r5)
        L_0x011d:
            return r4
        L_0x011e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x012c:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154927rv.invoke():java.lang.Object");
    }
}
