package X;

public final class AWW implements C22516BAz {
    public final C191669my A00;
    public final C22516BAz A01;

    public AWW(C191669my r2, C22516BAz bAz) {
        C18070vi.A0d(r2, 2);
        this.A01 = bAz;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CDZ(java.util.List r11, java.lang.String r12) {
        /*
            r10 = this;
            r7 = 0
            X.9my r4 = r10.A00
            X.00H r0 = r4.A04
            java.lang.Object r0 = r0.get()
            X.6pa r0 = (X.C133836pa) r0
            java.lang.String r6 = r0.A00()
            X.00H r0 = r4.A05     // Catch:{ all -> 0x00c4 }
            r0.get()     // Catch:{ all -> 0x00c4 }
            org.json.JSONArray r5 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x00ca }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x00ca }
        L_0x001c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00ca }
            X.2Dk r3 = (X.C46162Dk) r3     // Catch:{ all -> 0x00ca }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "creation"
            long r0 = r3.A0E     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "desc"
            java.lang.String r0 = r3.A0Q     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "desc_id"
            long r0 = r3.A0F     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "subscribers"
            long r0 = r3.A0G     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "invite_code"
            java.lang.String r0 = r3.A0S     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            X.1BI r0 = r3.A08()     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ca }
            X.9Ig r0 = r3.A02     // Catch:{ all -> 0x00ca }
            int r1 = r0.value     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "membership"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "name"
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "name_id"
            long r0 = r3.A0H     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "pic_id"
            long r0 = r3.A0I     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "pic_preview"
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "pic_preview_id"
            long r0 = r3.A0J     // Catch:{ all -> 0x00ca }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "pic"
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            X.9IW r0 = r3.A05     // Catch:{ all -> 0x00ca }
            int r1 = r0.value     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "verified"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ca }
            X.9IZ r0 = r3.A0M     // Catch:{ all -> 0x00ca }
            int r1 = r0.value     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "verification_source"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "wamo_sub_plan_id"
            java.lang.Long r0 = r3.A08     // Catch:{ all -> 0x00ca }
            r2.put(r1, r0)     // Catch:{ all -> 0x00ca }
            X.9Ib r0 = r3.A06     // Catch:{ all -> 0x00ca }
            int r1 = r0.value     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "wamo_sub_status"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ca }
            r5.put(r2)     // Catch:{ all -> 0x00ca }
            goto L_0x001c
        L_0x00b6:
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00ca
            X.9qs r0 = r4.A03     // Catch:{ all -> 0x00c4 }
            r0.A01(r6, r1)     // Catch:{ all -> 0x00c4 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x00c4 }
            goto L_0x00cb
        L_0x00c4:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = "RecommendedCache Failed to serialize"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00d6:
            X.BAz r1 = r10.A01
            java.util.List r0 = r4.A00(r11)
            r1.CDZ(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWW.CDZ(java.util.List, java.lang.String):void");
    }

    public void Bsq(C21598Amm amm) {
        this.A01.Bsq(amm);
    }
}
