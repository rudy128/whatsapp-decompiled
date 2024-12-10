package X;

/* renamed from: X.2zd  reason: invalid class name and case insensitive filesystem */
public final class C67342zd implements AnonymousClass1L0 {
    public final C24891Mb A00;
    public final AnonymousClass11P A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        if (r4 >= r12.getLong("tb_expired_ts")) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (r4 >= (r12.getLong("tb_last_action_ts") + r12.getLong("tb_cooldown"))) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r17 = this;
            r0 = r17
            X.1Mb r7 = r0.A00
            X.11P r0 = r0.A01
            long r4 = X.AnonymousClass11P.A01(r0)
            X.0vl r8 = r7.A02
            android.content.SharedPreferences r2 = X.C18070vi.A03(r8)
            r0 = 0
            java.lang.String r6 = "tb_purge_last_ts"
            long r2 = r2.getLong(r6, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00fd
            android.content.SharedPreferences r0 = X.C18070vi.A03(r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r4)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "triggered-block/purgeIfNeeded unable to commit last purge ts."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0039:
            java.lang.String r11 = "tb_expired_ts"
            java.lang.String r10 = "tb_last_action_ts"
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x00fd }
            X.0vl r9 = r7.A01     // Catch:{ JSONException -> 0x00fd }
            android.content.SharedPreferences r0 = X.C18070vi.A03(r9)     // Catch:{ JSONException -> 0x00fd }
            java.util.Map r0 = r0.getAll()     // Catch:{ JSONException -> 0x00fd }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00fd }
            java.util.Iterator r16 = X.AnonymousClass000.A15(r0)     // Catch:{ JSONException -> 0x00fd }
        L_0x0054:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x00fd }
            if (r0 == 0) goto L_0x00cc
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r16)     // Catch:{ JSONException -> 0x00fd }
            java.lang.Object r8 = r0.getKey()     // Catch:{ JSONException -> 0x00fd }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x00fd }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r1, r0)     // Catch:{ JSONException -> 0x00fd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x00fd }
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00fd }
            if (r0 == 0) goto L_0x00c8
            org.json.JSONObject r12 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x00fd }
            boolean r0 = r12.has(r11)     // Catch:{ JSONException -> 0x00fd }
            r15 = 1
            if (r0 == 0) goto L_0x0087
            long r1 = r12.getLong(r11)     // Catch:{ JSONException -> 0x00fd }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r14 = 1
            if (r0 < 0) goto L_0x0088
        L_0x0087:
            r14 = 0
        L_0x0088:
            boolean r0 = r12.has(r10)     // Catch:{ JSONException -> 0x00fd }
            java.lang.String r13 = "tb_cooldown"
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r12.has(r13)     // Catch:{ JSONException -> 0x00fd }
            if (r0 == 0) goto L_0x00a5
            long r2 = r12.getLong(r10)     // Catch:{ JSONException -> 0x00fd }
            long r0 = r12.getLong(r13)     // Catch:{ JSONException -> 0x00fd }
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r7 = 1
            if (r0 < 0) goto L_0x00a6
        L_0x00a5:
            r7 = 0
        L_0x00a6:
            boolean r0 = r12.has(r10)     // Catch:{ JSONException -> 0x00fd }
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r12.has(r13)     // Catch:{ JSONException -> 0x00fd }
            if (r0 != 0) goto L_0x00c1
            long r2 = r12.getLong(r10)     // Catch:{ JSONException -> 0x00fd }
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r15 = 0
        L_0x00c2:
            if (r14 != 0) goto L_0x0054
            if (r7 != 0) goto L_0x0054
            if (r15 != 0) goto L_0x0054
        L_0x00c8:
            r6.add(r8)     // Catch:{ JSONException -> 0x00fd }
            goto L_0x0054
        L_0x00cc:
            android.content.SharedPreferences r0 = X.C18070vi.A03(r9)     // Catch:{ JSONException -> 0x00fd }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ JSONException -> 0x00fd }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ JSONException -> 0x00fd }
            X.C18070vi.A0X(r1)     // Catch:{ JSONException -> 0x00fd }
        L_0x00db:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x00fd }
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x00fd }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00fd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00fd }
            r2.remove(r0)     // Catch:{ JSONException -> 0x00fd }
            goto L_0x00db
        L_0x00ee:
            boolean r0 = r2.commit()     // Catch:{ JSONException -> 0x00fd }
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "triggered-block/purge unable to commit after purge."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x00fd }
        L_0x00fa:
            r6.size()     // Catch:{ JSONException -> 0x00fd }
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67342zd.Bqh():void");
    }

    public C67342zd(C24891Mb r1, AnonymousClass11P r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
