package X;

import java.util.Set;

/* renamed from: X.32g  reason: invalid class name and case insensitive filesystem */
public final class C681532g implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681532g(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2.A0z(512);
    }

    public Set BZv() {
        return C18070vi.A0P(C20955Ac9.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ed, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r14) {
        /*
            r13 = this;
            X.206 r5 = X.C18070vi.A08(r14)
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r5.A0z(r0)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "FMessageBotSuggestedPromptMetadataLazyLoader/loadData called for message which doesn't have look table flag 512 set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Class<X.Ac9> r4 = X.C20955Ac9.class
            X.25F r0 = X.C18070vi.A09(r5, r4)
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "FMessageBotSuggestedPromptMetadataLazyLoader/loadData already loaded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0022:
            X.00H r0 = r13.A00
            java.lang.Object r2 = r0.get()
            X.2Zc r2 = (X.C51652Zc) r2
            long r0 = r5.A0x
            X.1Cd r2 = r2.A00
            X.1at r3 = r2.get()
            r2 = r3
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x00ee }
            X.1Ev r8 = r2.A02     // Catch:{ all -> 0x00ee }
            java.lang.String r7 = "\n        SELECT prompts, impression_logged\n        FROM bot_message_prompts\n        WHERE message_row_id = ?\n        LIMIT 1\n      "
            r6 = 1
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x00ee }
            X.C17890vO.A1J(r2, r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "BotMessagePromptsStore/getPrompts"
            android.database.Cursor r2 = r8.A0A(r7, r0, r2)     // Catch:{ all -> 0x00ee }
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x00e7 }
            r0 = 0
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = "prompts"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x005f
            X.0wS r7 = X.C18460wS.A00     // Catch:{ all -> 0x00e7 }
        L_0x0056:
            java.lang.String r0 = "impression_logged"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x00e7 }
            if (r0 == r6) goto L_0x00bb
            goto L_0x00ba
        L_0x005f:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ all -> 0x00e7 }
            r11.<init>(r0)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00e7 }
            int r10 = r11.length()     // Catch:{ all -> 0x00e7 }
            r8 = 0
        L_0x006d:
            if (r8 >= r10) goto L_0x0096
            org.json.JSONObject r12 = r11.getJSONObject(r8)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "index"
            r0 = -1
            int r7 = r12.optInt(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "prompt"
            java.lang.String r0 = ""
            java.lang.String r1 = r12.optString(r1, r0)     // Catch:{ all -> 0x00e7 }
            if (r7 < 0) goto L_0x0093
            if (r1 == 0) goto L_0x0093
            int r0 = r1.length()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0093
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00e7 }
            X.AnonymousClass1D6.A02(r0, r1, r9)     // Catch:{ all -> 0x00e7 }
        L_0x0093:
            int r8 = r8 + 1
            goto L_0x006d
        L_0x0096:
            r1 = 3
            X.Akr r0 = new X.Akr     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            java.util.List r0 = X.C29431cG.A0y(r9, r0)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)     // Catch:{ all -> 0x00e7 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x00a8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e7 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x00e7 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x00e7 }
            r7.add(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00a8
        L_0x00ba:
            r6 = 0
        L_0x00bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00e7 }
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r0)     // Catch:{ all -> 0x00e7 }
        L_0x00c3:
            r2.close()     // Catch:{ all -> 0x00ee }
            r3.close()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r6 = r0.first
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0011
            X.25F r1 = X.C18070vi.A09(r5, r4)
            java.lang.Object r0 = r0.second
            boolean r8 = X.AnonymousClass000.A1Y(r0)
            r4 = 0
            X.Ac9 r3 = new X.Ac9
            r7 = r4
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A02(r3)
            return
        L_0x00e7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C681532g.Bhl(X.25F):void");
    }
}
