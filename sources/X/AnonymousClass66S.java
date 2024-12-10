package X;

/* renamed from: X.66S  reason: invalid class name */
public final class AnonymousClass66S extends C140126zz {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022d, code lost:
        if (r16 == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0238, code lost:
        if (r17 == null) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x023a, code lost:
        r25 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02cb, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        X.CDX.A00(r21, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02d1, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02d2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02d6, code lost:
        r2 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:139:0x0267, B:155:0x02ca] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:175:0x02f5=Splitter:B:175:0x02f5, B:172:0x02ea=Splitter:B:172:0x02ea, B:169:0x02df=Splitter:B:169:0x02df} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C19760yx A00(X.C1185363v r27, X.AnonymousClass66S r28, java.lang.String r29) {
        /*
            r6 = r28
            X.11P r5 = r6.A03
            long r0 = X.AnonymousClass11P.A01(r5)
            r2 = 10
            r4 = 0
            r7 = r27
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.net.URL r3 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r2 = r29
            r3.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r10 = r3.openConnection()     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            X.C18070vi.A0z(r10, r2)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            X.C18070vi.A0z(r10, r2)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            X.11W r2 = r6.A09     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            X.C109005cf.A0o(r2, r10)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r10.connect()     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            long r2 = X.AnonymousClass11P.A01(r5)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.lang.Long r2 = X.C108945cZ.A1B(r2, r0)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r7.A03 = r2     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            long r14 = X.AnonymousClass11P.A01(r5)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            int r8 = r10.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            long r2 = X.AnonymousClass11P.A01(r5)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.lang.Long r2 = X.C108945cZ.A1B(r2, r14)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r7.A02 = r2     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.lang.Long r2 = X.C17880vN.A0n(r8)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r7.A04 = r2     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 == r2) goto L_0x0060
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            java.lang.String r2 = "gif/search/giphy/request failed "
            X.C17900vP.A0i(r2, r3, r8)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            X.C140126zz.A02(r5, r7, r6, r0)
            return r4
        L_0x0060:
            X.AnonymousClass11P.A01(r5)     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r9 = 0
            r22 = 0
            r8 = 0
            X.181 r3 = r6.A02     // Catch:{ SocketTimeoutException -> 0x02f4, IOException -> 0x02e9, IllegalStateException -> 0x02de }
            r2 = 0
            X.9Hb r2 = X.C108995ce.A0N(r3, r10, r2)     // Catch:{ SocketTimeoutException -> 0x02dc, IOException -> 0x02da, IllegalStateException -> 0x02d8 }
            android.util.JsonReader r21 = X.C108985cd.A0E(r2)     // Catch:{ SocketTimeoutException -> 0x02dc, IOException -> 0x02da, IllegalStateException -> 0x02d8 }
            r21.beginObject()     // Catch:{ all -> 0x02c9 }
        L_0x0075:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x02c9 }
            if (r2 == 0) goto L_0x0264
            java.lang.String r10 = r21.nextName()     // Catch:{ all -> 0x02c9 }
            if (r10 == 0) goto L_0x0256
            int r3 = r10.hashCode()     // Catch:{ all -> 0x02c9 }
            r2 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r3 == r2) goto L_0x00ae
            r2 = 3347973(0x331605, float:4.69151E-39)
            if (r3 == r2) goto L_0x00a1
            r2 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r3 != r2) goto L_0x0256
            java.lang.String r2 = "pagination"
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x02c9 }
            if (r2 == 0) goto L_0x0256
            java.lang.String r22 = X.AnonymousClass73P.A02(r21)     // Catch:{ all -> 0x02c9 }
            goto L_0x0075
        L_0x00a1:
            java.lang.String r2 = "meta"
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x02c9 }
            if (r2 == 0) goto L_0x0256
            X.0yx r9 = X.AnonymousClass73P.A00(r21)     // Catch:{ all -> 0x02c9 }
            goto L_0x0075
        L_0x00ae:
            java.lang.String r2 = "data"
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x02c9 }
            if (r2 == 0) goto L_0x0256
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02c7 }
            r21.beginArray()     // Catch:{ all -> 0x02c7 }
        L_0x00bd:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0251
            r21.beginObject()     // Catch:{ all -> 0x02c7 }
            r28 = 0
            r20 = r4
            r19 = r4
            r27 = r4
            r10 = r4
            r3 = r4
            r25 = r4
            r18 = r4
            r17 = r4
            r16 = r4
        L_0x00d8:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0203
            java.lang.String r11 = r21.nextName()     // Catch:{ all -> 0x02c7 }
            if (r11 == 0) goto L_0x01fe
            int r12 = r11.hashCode()     // Catch:{ all -> 0x02c7 }
            r2 = -1185250696(0xffffffffb95a8278, float:-2.0838703E-4)
            if (r12 == r2) goto L_0x0122
            r2 = 3355(0xd1b, float:4.701E-42)
            if (r12 == r2) goto L_0x0115
            r2 = 110371416(0x6942258, float:5.5721876E-35)
            if (r12 == r2) goto L_0x0108
            r2 = 2027300355(0x78d62603, float:3.4747578E34)
            if (r12 != r2) goto L_0x01fe
            java.lang.String r2 = "alt_text"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01fe
            java.lang.String r20 = r21.nextString()     // Catch:{ all -> 0x02c7 }
            goto L_0x00d8
        L_0x0108:
            java.lang.String r2 = "title"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01fe
            java.lang.String r19 = r21.nextString()     // Catch:{ all -> 0x02c7 }
            goto L_0x00d8
        L_0x0115:
            java.lang.String r2 = "id"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01fe
            java.lang.String r27 = r21.nextString()     // Catch:{ all -> 0x02c7 }
            goto L_0x00d8
        L_0x0122:
            java.lang.String r2 = "images"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01fe
            r21.beginObject()     // Catch:{ all -> 0x02c7 }
        L_0x012d:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01f9
            java.lang.String r11 = r21.nextName()     // Catch:{ all -> 0x02c7 }
            if (r11 == 0) goto L_0x0140
            int r2 = r11.hashCode()     // Catch:{ all -> 0x02c7 }
            switch(r2) {
                case -1762572285: goto L_0x0144;
                case -511616133: goto L_0x0151;
                case 1408438587: goto L_0x015e;
                case 1723279212: goto L_0x01dd;
                case 1968782756: goto L_0x01eb;
                default: goto L_0x0140;
            }     // Catch:{ all -> 0x02c7 }
        L_0x0140:
            r21.skipValue()     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x0144:
            java.lang.String r2 = "fixed_height_small_still"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0140
            X.77C r18 = X.AnonymousClass73P.A01(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x0151:
            java.lang.String r2 = "fixed_height_still"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0140
            X.77C r16 = X.AnonymousClass73P.A01(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x015e:
            java.lang.String r2 = "fixed_width"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0140
            r21.beginObject()     // Catch:{ all -> 0x02c7 }
            r12 = -1
            r2 = r4
            r13 = r4
            r11 = -1
        L_0x016d:
            boolean r3 = r21.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x01b8
            java.lang.String r3 = r21.nextName()     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0180
            int r10 = r3.hashCode()     // Catch:{ all -> 0x02c7 }
            switch(r10) {
                case -1221029593: goto L_0x01ab;
                case 108273: goto L_0x019e;
                case 116079: goto L_0x0191;
                case 113126854: goto L_0x0184;
                default: goto L_0x0180;
            }     // Catch:{ all -> 0x02c7 }
        L_0x0180:
            r21.skipValue()     // Catch:{ all -> 0x02c7 }
            goto L_0x016d
        L_0x0184:
            java.lang.String r10 = "width"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0180
            int r12 = X.C108985cd.A02(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x016d
        L_0x0191:
            java.lang.String r10 = "url"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0180
            java.lang.String r2 = r21.nextString()     // Catch:{ all -> 0x02c7 }
            goto L_0x016d
        L_0x019e:
            java.lang.String r10 = "mp4"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0180
            java.lang.String r13 = r21.nextString()     // Catch:{ all -> 0x02c7 }
            goto L_0x016d
        L_0x01ab:
            java.lang.String r10 = "height"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0180
            int r11 = X.C108985cd.A02(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x016d
        L_0x01b8:
            r21.endObject()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x01d9
            if (r13 == 0) goto L_0x01d9
            r10 = -1
            X.77C r3 = new X.77C     // Catch:{ all -> 0x02c7 }
            r3.<init>(r12, r11, r2, r10)     // Catch:{ all -> 0x02c7 }
            X.77C r2 = new X.77C     // Catch:{ all -> 0x02c7 }
            r2.<init>(r12, r11, r13, r10)     // Catch:{ all -> 0x02c7 }
            X.0yx r11 = new X.0yx     // Catch:{ all -> 0x02c7 }
            r11.<init>(r3, r2)     // Catch:{ all -> 0x02c7 }
            java.lang.Object r10 = r11.A00     // Catch:{ all -> 0x02c7 }
            X.77C r10 = (X.AnonymousClass77C) r10     // Catch:{ all -> 0x02c7 }
            java.lang.Object r3 = r11.A01     // Catch:{ all -> 0x02c7 }
            X.77C r3 = (X.AnonymousClass77C) r3     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x01d9:
            r10 = r4
            r3 = r4
            goto L_0x012d
        L_0x01dd:
            java.lang.String r2 = "fixed_width_small_still"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0140
            X.77C r25 = X.AnonymousClass73P.A01(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x01eb:
            java.lang.String r2 = "fixed_width_still"
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x0140
            X.77C r17 = X.AnonymousClass73P.A01(r21)     // Catch:{ all -> 0x02c7 }
            goto L_0x012d
        L_0x01f9:
            r21.endObject()     // Catch:{ all -> 0x02c7 }
            goto L_0x00d8
        L_0x01fe:
            r21.skipValue()     // Catch:{ all -> 0x02c7 }
            goto L_0x00d8
        L_0x0203:
            r21.endObject()     // Catch:{ all -> 0x02c7 }
            if (r20 == 0) goto L_0x020f
            int r2 = r20.length()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x020f
            goto L_0x021a
        L_0x020f:
            if (r19 == 0) goto L_0x021c
            int r2 = r19.length()     // Catch:{ all -> 0x02c7 }
            if (r2 == 0) goto L_0x021c
            r28 = r19
            goto L_0x021c
        L_0x021a:
            r28 = r20
        L_0x021c:
            if (r27 == 0) goto L_0x00bd
            if (r10 == 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00bd
            int r11 = r3.A02     // Catch:{ all -> 0x02c7 }
            int r2 = r3.A00     // Catch:{ all -> 0x02c7 }
            if (r11 <= r2) goto L_0x0229
            goto L_0x0234
        L_0x0229:
            if (r18 != 0) goto L_0x023d
            if (r25 != 0) goto L_0x023f
            if (r16 != 0) goto L_0x023a
        L_0x022f:
            r25 = r17
        L_0x0231:
            if (r25 == 0) goto L_0x00bd
            goto L_0x023f
        L_0x0234:
            if (r25 != 0) goto L_0x023f
            if (r18 != 0) goto L_0x023d
            if (r17 != 0) goto L_0x022f
        L_0x023a:
            r25 = r16
            goto L_0x0231
        L_0x023d:
            r25 = r18
        L_0x023f:
            r29 = 1
            X.77J r2 = new X.77J     // Catch:{ all -> 0x02c7 }
            r23 = r2
            r24 = r10
            r26 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x02c7 }
            r8.add(r2)     // Catch:{ all -> 0x02c7 }
            goto L_0x00bd
        L_0x0251:
            r21.endArray()     // Catch:{ all -> 0x02c7 }
            goto L_0x0075
        L_0x0256:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02c7 }
            java.lang.String r2 = "gif/search/giphy/unexpected key - "
            X.C17900vP.A0g(r2, r10, r3)     // Catch:{ all -> 0x02c7 }
            r21.skipValue()     // Catch:{ all -> 0x02c7 }
            goto L_0x0075
        L_0x0264:
            r21.endObject()     // Catch:{ all -> 0x02c7 }
            r21.close()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            long r2 = X.AnonymousClass11P.A01(r5)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Long r2 = X.C108945cZ.A1B(r2, r14)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r7.A06 = r2     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            if (r9 == 0) goto L_0x02a8
            java.lang.Object r10 = r9.A00     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            if (r10 == 0) goto L_0x0285
            int r3 = r10.intValue()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x0285
            goto L_0x02a8
        L_0x0285:
            java.lang.StringBuilder r3 = X.C17890vO.A0f(r10)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r2 = 40
            r3.append(r2)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Object r2 = r9.A01     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.String r8 = X.C17900vP.A0B(r2, r3)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.String r2 = "gif/search/giphy/got error: "
            X.C17900vP.A0g(r2, r8, r3)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Integer r2 = X.C17880vN.A0l()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r7.A01 = r2     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r7.A07 = r8     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            goto L_0x02fe
        L_0x02a8:
            if (r8 != 0) goto L_0x02b6
            X.0yx r3 = new X.0yx     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r3.<init>(r4, r4)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Integer r2 = X.C17880vN.A0i()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r7.A01 = r2     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            goto L_0x02c3
        L_0x02b6:
            X.0yx r3 = new X.0yx     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r2 = r22
            r3.<init>(r2, r8)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            java.lang.Integer r2 = X.C17880vN.A0h()     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            r7.A01 = r2     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
        L_0x02c3:
            X.C140126zz.A02(r5, r7, r6, r0)
            return r3
        L_0x02c7:
            r8 = move-exception
            goto L_0x02ca
        L_0x02c9:
            r8 = move-exception
        L_0x02ca:
            throw r8     // Catch:{ all -> 0x02cb }
        L_0x02cb:
            r3 = move-exception
            r2 = r21
            X.CDX.A00(r2, r8)     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
            throw r3     // Catch:{ SocketTimeoutException -> 0x02d6, IOException -> 0x02d4, IllegalStateException -> 0x02d2 }
        L_0x02d2:
            r2 = move-exception
            goto L_0x02df
        L_0x02d4:
            r2 = move-exception
            goto L_0x02ea
        L_0x02d6:
            r2 = move-exception
            goto L_0x02f5
        L_0x02d8:
            r2 = move-exception
            goto L_0x02df
        L_0x02da:
            r2 = move-exception
            goto L_0x02ea
        L_0x02dc:
            r2 = move-exception
            goto L_0x02f5
        L_0x02de:
            r2 = move-exception
        L_0x02df:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0302 }
            java.lang.Integer r2 = X.C17880vN.A0i()     // Catch:{ all -> 0x0302 }
            r7.A01 = r2     // Catch:{ all -> 0x0302 }
            goto L_0x02fe
        L_0x02e9:
            r2 = move-exception
        L_0x02ea:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0302 }
            java.lang.Integer r2 = X.C17880vN.A0i()     // Catch:{ all -> 0x0302 }
            r7.A01 = r2     // Catch:{ all -> 0x0302 }
            goto L_0x02fe
        L_0x02f4:
            r2 = move-exception
        L_0x02f5:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0302 }
            java.lang.Integer r2 = X.C17880vN.A0j()     // Catch:{ all -> 0x0302 }
            r7.A01 = r2     // Catch:{ all -> 0x0302 }
        L_0x02fe:
            X.C140126zz.A02(r5, r7, r6, r0)
            return r4
        L_0x0302:
            r2 = move-exception
            X.C140126zz.A02(r5, r7, r6, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass66S.A00(X.63v, X.66S, java.lang.String):X.0yx");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66S(AnonymousClass181 r1, AnonymousClass11P r2, C18000vb r3, C22631Cp r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass736 r7, C19960A0r a0r, AnonymousClass11W r9, AnonymousClass10I r10) {
        super(r1, r2, r3, r4, r5, r6, r7, a0r, r9, r10);
        C18070vi.A0w(r2, r5, r4, r7, r9);
        C18070vi.A0x(r10, r1, r6, r3, a0r);
    }
}
