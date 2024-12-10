package X;

import android.util.JsonReader;

/* renamed from: X.66T  reason: invalid class name */
public final class AnonymousClass66T extends C140126zz {
    public static final C19760yx A00(JsonReader jsonReader) {
        AnonymousClass77C r3;
        int[] iArr = new int[2];
        jsonReader.beginObject();
        AnonymousClass77C r6 = null;
        String str = null;
        String str2 = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -318184504) {
                    if (hashCode != 116079) {
                        if (hashCode == 3083499 && nextName.equals("dims")) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                if (i < 2) {
                                    iArr[i] = jsonReader.nextInt();
                                    i++;
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endArray();
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("preview")) {
                    str2 = jsonReader.nextString();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str == null || str.length() == 0) {
            return new C19760yx((Object) null, (Object) null);
        }
        if (str2 == null || str2.length() == 0) {
            r3 = new AnonymousClass77C(iArr[0], iArr[1], str, -1);
        } else {
            r3 = new AnonymousClass77C(iArr[0], iArr[1], str, -1);
            r6 = new AnonymousClass77C(iArr[0], iArr[1], str2, -1);
        }
        return new C19760yx(r3, r6);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0289, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        X.CDX.A00(r17, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C19760yx A01(X.C1185363v r28, X.AnonymousClass66T r29, java.lang.String r30) {
        /*
            java.lang.String r22 = "gif/search/tenor/unknown_error"
            r9 = r29
            X.11P r15 = r9.A03
            long r2 = X.AnonymousClass11P.A01(r15)
            r0 = 10
            r11 = 0
            r10 = r28
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.net.URL r0 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r1 = r30
            r0.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.C18070vi.A0z(r12, r1)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.C18070vi.A0z(r12, r1)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.11W r0 = r9.A09     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.C109005cf.A0o(r0, r12)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r12.connect()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            long r0 = X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r2)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A03 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            long r4 = X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            int r6 = r12.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            long r0 = X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r4)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A02 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Long r0 = X.C17880vN.A0n(r6)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A04 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x0060
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.String r0 = "gif/search/tenor/request failed "
            X.C17900vP.A0i(r0, r1, r6)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            goto L_0x0283
        L_0x0060:
            X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r8 = 0
            r20 = -1
            r7 = 0
            r6 = 0
            long r18 = X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.181 r5 = r9.A02     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Integer r4 = X.AnonymousClass3MY.A0f()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r30 = r11
            java.io.InputStream r1 = r12.getInputStream()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            X.9Hb r0 = new X.9Hb     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r0.<init>(r5, r1, r11, r4)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            android.util.JsonReader r17 = X.C108985cd.A0E(r0)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r17.beginObject()     // Catch:{ all -> 0x0287 }
        L_0x0084:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0227
            if (r8 != 0) goto L_0x0227
            java.lang.String r1 = r17.nextName()     // Catch:{ all -> 0x0287 }
            if (r1 == 0) goto L_0x0099
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0287 }
            switch(r0) {
                case -791787109: goto L_0x00cd;
                case 3059181: goto L_0x00c0;
                case 3377907: goto L_0x00b3;
                case 96784904: goto L_0x00a6;
                case 1097546742: goto L_0x00d6;
                default: goto L_0x0099;
            }     // Catch:{ all -> 0x0287 }
        L_0x0099:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = "gif/search/tenor/unexpected key - "
            X.C17900vP.A0g(r0, r1, r4)     // Catch:{ all -> 0x0287 }
        L_0x00a2:
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x0084
        L_0x00a6:
            java.lang.String r0 = "error"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r8 = r17.nextString()     // Catch:{ all -> 0x0287 }
            goto L_0x0084
        L_0x00b3:
            java.lang.String r0 = "next"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r7 = r17.nextString()     // Catch:{ all -> 0x0287 }
            goto L_0x0084
        L_0x00c0:
            java.lang.String r0 = "code"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0099
            long r20 = r17.nextLong()     // Catch:{ all -> 0x0287 }
            goto L_0x0084
        L_0x00cd:
            java.lang.String r0 = "weburl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 != 0) goto L_0x00a2
            goto L_0x0099
        L_0x00d6:
            java.lang.String r0 = "results"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0099
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0287 }
            r17.beginArray()     // Catch:{ all -> 0x0287 }
        L_0x00e5:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0222
            r17.beginObject()     // Catch:{ all -> 0x0287 }
            r28 = 0
            r16 = r30
            r27 = r30
            r5 = r30
            r4 = r5
            r11 = r5
        L_0x00f8:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01f9
            java.lang.String r1 = r17.nextName()     // Catch:{ all -> 0x0287 }
            if (r1 == 0) goto L_0x01f4
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0287 }
            r14 = -2072905215(0xffffffff8471fa01, float:-2.844421E-36)
            java.lang.String r13 = "tinygif"
            java.lang.String r12 = "tinymp4"
            if (r0 == r14) goto L_0x018a
            r14 = -1416025802(0xffffffffab992936, float:-1.0882742E-12)
            if (r0 == r14) goto L_0x017c
            r14 = 3355(0xd1b, float:4.701E-42)
            if (r0 == r14) goto L_0x016e
            r14 = 103772132(0x62f6fe4, float:3.2996046E-35)
            if (r0 != r14) goto L_0x01f4
            java.lang.String r0 = "media"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01f4
            r17.beginArray()     // Catch:{ all -> 0x0287 }
            r17.beginObject()     // Catch:{ all -> 0x0287 }
        L_0x012d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x015d
            java.lang.String r0 = r17.nextName()     // Catch:{ all -> 0x0287 }
            boolean r1 = X.C18070vi.A18(r0, r12)     // Catch:{ all -> 0x0287 }
            if (r1 == 0) goto L_0x0146
            X.0yx r0 = A00(r17)     // Catch:{ all -> 0x0287 }
            java.lang.Object r11 = r0.A00     // Catch:{ all -> 0x0287 }
            X.77C r11 = (X.AnonymousClass77C) r11     // Catch:{ all -> 0x0287 }
            goto L_0x012d
        L_0x0146:
            boolean r0 = X.C18070vi.A18(r0, r13)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0159
            X.0yx r0 = A00(r17)     // Catch:{ all -> 0x0287 }
            java.lang.Object r5 = r0.A00     // Catch:{ all -> 0x0287 }
            X.77C r5 = (X.AnonymousClass77C) r5     // Catch:{ all -> 0x0287 }
            java.lang.Object r4 = r0.A01     // Catch:{ all -> 0x0287 }
            X.77C r4 = (X.AnonymousClass77C) r4     // Catch:{ all -> 0x0287 }
            goto L_0x012d
        L_0x0159:
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x012d
        L_0x015d:
            r17.endObject()     // Catch:{ all -> 0x0287 }
        L_0x0160:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x016a
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x0160
        L_0x016a:
            r17.endArray()     // Catch:{ all -> 0x0287 }
            goto L_0x00f8
        L_0x016e:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r27 = r17.nextString()     // Catch:{ all -> 0x0287 }
            goto L_0x00f8
        L_0x017c:
            java.lang.String r0 = "content_description"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r16 = r17.nextString()     // Catch:{ all -> 0x0287 }
            goto L_0x00f8
        L_0x018a:
            java.lang.String r0 = "media_formats"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01f4
            r17.beginObject()     // Catch:{ all -> 0x0287 }
        L_0x0195:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01e7
            java.lang.String r1 = r17.nextName()     // Catch:{ all -> 0x0287 }
            if (r1 == 0) goto L_0x01e3
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0287 }
            r14 = -1312400188(0xffffffffb1c65cc4, float:-5.7731047E-9)
            if (r0 == r14) goto L_0x01d4
            r14 = -1312394255(0xffffffffb1c673f1, float:-5.7757394E-9)
            if (r0 == r14) goto L_0x01c5
            r14 = 1158242948(0x45096284, float:2198.1572)
            if (r0 != r14) goto L_0x01e3
            java.lang.String r0 = "tinygifpreview"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01e3
            X.0yx r0 = A00(r17)     // Catch:{ all -> 0x0287 }
            java.lang.Object r4 = r0.A00     // Catch:{ all -> 0x0287 }
            X.77C r4 = (X.AnonymousClass77C) r4     // Catch:{ all -> 0x0287 }
            goto L_0x0195
        L_0x01c5:
            boolean r0 = r1.equals(r12)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01e3
            X.0yx r0 = A00(r17)     // Catch:{ all -> 0x0287 }
            java.lang.Object r11 = r0.A00     // Catch:{ all -> 0x0287 }
            X.77C r11 = (X.AnonymousClass77C) r11     // Catch:{ all -> 0x0287 }
            goto L_0x0195
        L_0x01d4:
            boolean r0 = r1.equals(r13)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x01e3
            X.0yx r0 = A00(r17)     // Catch:{ all -> 0x0287 }
            java.lang.Object r5 = r0.A00     // Catch:{ all -> 0x0287 }
            X.77C r5 = (X.AnonymousClass77C) r5     // Catch:{ all -> 0x0287 }
            goto L_0x0195
        L_0x01e3:
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x0195
        L_0x01e7:
            r17.endObject()     // Catch:{ all -> 0x0287 }
        L_0x01ea:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x00f8
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x01ea
        L_0x01f4:
            r17.skipValue()     // Catch:{ all -> 0x0287 }
            goto L_0x00f8
        L_0x01f9:
            r17.endObject()     // Catch:{ all -> 0x0287 }
            if (r27 == 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00e5
            if (r4 == 0) goto L_0x00e5
            if (r11 == 0) goto L_0x00e5
            if (r16 == 0) goto L_0x020e
            int r0 = r16.length()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x020e
            r28 = r16
        L_0x020e:
            r29 = 2
            X.77J r0 = new X.77J     // Catch:{ all -> 0x0287 }
            r24 = r5
            r25 = r4
            r26 = r11
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0287 }
            r6.add(r0)     // Catch:{ all -> 0x0287 }
            goto L_0x00e5
        L_0x0222:
            r17.endArray()     // Catch:{ all -> 0x0287 }
            goto L_0x0084
        L_0x0227:
            r17.endObject()     // Catch:{ all -> 0x0287 }
            r17.close()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            long r4 = X.AnonymousClass11P.A01(r15)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r0 = r18
            java.lang.Long r0 = X.C108945cZ.A1B(r4, r0)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A06 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            if (r8 == 0) goto L_0x025f
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r0 = r20
            r4.append(r0)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r0 = 40
            r4.append(r0)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.String r4 = X.C17900vP.A0B(r8, r4)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.String r0 = "gif/search/tenor/got error: "
            X.C17900vP.A0g(r0, r4, r1)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A07 = r4     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            goto L_0x02b6
        L_0x025f:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r7)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            if (r0 == 0) goto L_0x0268
            r7 = 0
        L_0x0268:
            if (r6 != 0) goto L_0x0278
            X.0yx r11 = new X.0yx     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r1 = r30
            r11.<init>(r1, r1)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            goto L_0x0283
        L_0x0278:
            X.0yx r11 = new X.0yx     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r11.<init>(r7, r6)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            r10.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
        L_0x0283:
            X.C140126zz.A02(r15, r10, r9, r2)
            return r11
        L_0x0287:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0289 }
        L_0x0289:
            r1 = move-exception
            r0 = r17
            X.CDX.A00(r0, r4)     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x02aa, IOException -> 0x029d, IllegalStateException -> 0x0290 }
        L_0x0290:
            r1 = move-exception
            r0 = r22
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02bb }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x02bb }
            r10.A01 = r0     // Catch:{ all -> 0x02bb }
            goto L_0x02b6
        L_0x029d:
            r1 = move-exception
            r0 = r22
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02bb }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x02bb }
            r10.A01 = r0     // Catch:{ all -> 0x02bb }
            goto L_0x02b6
        L_0x02aa:
            r1 = move-exception
            java.lang.String r0 = "gif/search/tenor/timeout"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02bb }
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ all -> 0x02bb }
            r10.A01 = r0     // Catch:{ all -> 0x02bb }
        L_0x02b6:
            X.C140126zz.A02(r15, r10, r9, r2)
            r0 = 0
            return r0
        L_0x02bb:
            r0 = move-exception
            X.C140126zz.A02(r15, r10, r9, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass66T.A01(X.63v, X.66T, java.lang.String):X.0yx");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66T(AnonymousClass181 r1, AnonymousClass11P r2, C18000vb r3, C22631Cp r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass736 r7, C19960A0r a0r, AnonymousClass11W r9, AnonymousClass10I r10) {
        super(r1, r2, r3, r4, r5, r6, r7, a0r, r9, r10);
        C18070vi.A0w(r2, r5, r4, r7, r9);
        C18070vi.A0x(r10, r1, r6, r3, a0r);
    }
}
