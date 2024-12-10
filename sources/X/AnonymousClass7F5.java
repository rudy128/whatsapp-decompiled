package X;

/* renamed from: X.7F5  reason: invalid class name */
public final class AnonymousClass7F5 implements C72113Kr {
    public final C128426fy A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final AnonymousClass1OX A04;
    public final AnonymousClass11P A05;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r6 = this;
            X.0ve r2 = r6.A01
            r0 = 4010(0xfaa, float:5.619E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 8100(0x1fa4, float:1.135E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            int r2 = r0 * 1000
            long r3 = java.lang.System.currentTimeMillis()
            X.6fy r0 = r6.A00
            X.0vl r5 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r5)
            java.lang.String r0 = "empty_state_search_suggestions_last_save_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r3 = r3 - r0
            long r1 = (long) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            X.1OX r2 = r6.A04
            r1 = 0
            com.whatsapp.data.repository.MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1 r0 = new com.whatsapp.data.repository.MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1
            r0.<init>(r6, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
        L_0x0037:
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r5)
            java.lang.String r0 = "typeahead_search_suggestions_last_save_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r3 = r3 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            com.whatsapp.data.repository.MetaAISearchRepository r0 = (com.whatsapp.data.repository.MetaAISearchRepository) r0
            X.6L0 r2 = r0.A02
            monitor-enter(r2)
            X.17r r1 = r2.A03     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            java.lang.String r0 = "ai_search_typeahead_suggestions"
            java.io.File r0 = r1.A0b(r0)     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            r0.delete()     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0067:
            monitor-exit(r2)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F5.Bqf():void");
    }

    public AnonymousClass7F5(AnonymousClass11P r2, C128426fy r3, C18030ve r4, AnonymousClass00H r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0w(r2, r4, r3, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r2;
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
    }
}
