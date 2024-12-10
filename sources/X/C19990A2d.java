package X;

/* renamed from: X.A2d  reason: case insensitive filesystem */
public final class C19990A2d {
    public final long A00;
    public final long A01;
    public final A55 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C19990A2d a2d = (C19990A2d) obj;
            if (this.A00 != a2d.A00 || this.A01 != a2d.A01 || !this.A05.equals(a2d.A05) || !this.A06.equals(a2d.A06) || !this.A04.equals(a2d.A04) || !this.A03.equals(a2d.A03) || !C42171xk.A00(this.A02, a2d.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        objArr[2] = this.A04;
        objArr[3] = this.A03;
        C17890vO.A1P(objArr, this.A00);
        C17890vO.A1Q(objArr, this.A01);
        return AnonymousClass000.A0P(this.A02, objArr, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r24 != null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C19990A2d A00(X.AnonymousClass1NT r22, java.lang.String r23, java.lang.String r24, org.json.JSONObject r25, long r26) {
        /*
            r12 = r24
            if (r23 != 0) goto L_0x0007
            r1 = 0
            if (r24 == 0) goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            java.lang.String r0 = "Either prefix or file upload path must be non-null"
            X.C17960vV.A0G(r1, r0)
            java.lang.String r6 = "name"
            r3 = r25
            java.lang.String r13 = r3.optString(r6)
            java.lang.String r0 = "mimeType"
            java.lang.String r14 = r3.optString(r0)
            java.lang.String r5 = "md5Hash"
            java.lang.String r1 = r3.optString(r5)
            java.lang.String r4 = "sizeBytes"
            java.lang.String r7 = r3.optString(r4)
            java.lang.String r2 = "updateTime"
            java.lang.String r8 = r3.optString(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00c0
            byte[] r0 = X.AnonymousClass8BT.A1a(r1)
            java.lang.String r15 = X.C17970vW.A07(r0)
            if (r24 != 0) goto L_0x0057
            int r0 = r23.length()
            java.lang.String r12 = r13.substring(r0)
        L_0x0057:
            r0 = r26
            long r16 = X.C20099A7c.A04(r7, r0)
            long r18 = X.AnonymousClass8BX.A09(r8)
            java.lang.String r0 = "metadata"
            java.lang.String r7 = r3.optString(r0)
            java.lang.String r1 = "\""
            java.lang.String r10 = "gdrive/file-metadata/failed to parse metadata \""
            r9 = 0
            r8 = r22
            java.lang.String r0 = r8.A00(r7)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b9
            org.json.JSONObject r3 = X.C17880vN.A16(r0)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            java.lang.String r22 = r3.optString(r6)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            java.lang.String r23 = r3.optString(r5)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            long r24 = r3.optLong(r4)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            java.lang.String r3 = r3.optString(r2)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            boolean r2 = android.text.TextUtils.isEmpty(r22)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            if (r2 != 0) goto L_0x00b9
            boolean r2 = android.text.TextUtils.isEmpty(r23)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            if (r2 != 0) goto L_0x00b9
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            if (r2 != 0) goto L_0x00b9
            long r26 = X.AnonymousClass8BX.A09(r3)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            X.A55 r11 = new X.A55     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            r20 = r11
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r26)     // Catch:{ TimeFormatException | JSONException -> 0x00a8 }
            goto L_0x00ba
        L_0x00a8:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r10)     // Catch:{ Exception -> 0x00b1 }
            X.C17900vP.A0h(r0, r1, r2, r3)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b9
        L_0x00b1:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r10)
            X.C17900vP.A0h(r7, r1, r0, r2)
        L_0x00b9:
            r11 = r9
        L_0x00ba:
            X.A2d r10 = new X.A2d
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)
            return r10
        L_0x00c0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19990A2d.A00(X.1NT, java.lang.String, java.lang.String, org.json.JSONObject, long):X.A2d");
    }

    public String A01() {
        A55 a55 = this.A02;
        if (a55 != null) {
            return a55.A04;
        }
        return this.A06;
    }

    public C19990A2d(A55 a55, String str, String str2, String str3, String str4, long j, long j2) {
        C17960vV.A07(str);
        this.A06 = str;
        C17960vV.A07(str2);
        this.A05 = str2;
        C17960vV.A07(str3);
        this.A04 = str3;
        C17960vV.A07(str4);
        this.A03 = str4;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = a55;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoteFile{name='");
        A10.append(this.A05);
        A10.append('\'');
        A10.append(", uploadTitle='");
        A10.append(this.A06);
        A10.append('\'');
        A10.append(", mimeType='");
        A10.append(this.A04);
        A10.append('\'');
        A10.append(", md5Hash='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", sizeBytes=");
        A10.append(this.A00);
        A10.append(", updateTime=");
        A10.append(this.A01);
        A10.append(", metadata=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
