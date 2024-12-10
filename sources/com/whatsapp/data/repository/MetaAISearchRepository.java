package com.whatsapp.data.repository;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass6L0;
import X.C125316as;
import X.C128426fy;
import X.C18070vi;

public final class MetaAISearchRepository extends MetaAiTypeaheadRepository {
    public final C125316as A00;
    public final C128426fy A01;
    public final AnonymousClass6L0 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass10I A04;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C1417676w A02(java.lang.String r11) {
        /*
            r10 = this;
            r5 = 0
            X.C18070vi.A0d(r11, r5)
            X.6L0 r4 = r10.A02
            monitor-enter(r4)
            boolean r0 = r4.A01     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x007a
            X.17r r1 = r4.A03     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.lang.String r0 = "ai_search_typeahead_suggestions"
            java.io.File r1 = r1.A0b(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.lang.String r0 = X.AnonymousClass3Gr.A00(r1, r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            int r6 = r8.length()     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r3 = 0
        L_0x0027:
            if (r3 >= r6) goto L_0x0054
            org.json.JSONObject r9 = r8.getJSONObject(r3)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.lang.String r0 = "query"
            java.lang.String r2 = r9.getString(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            X.71U r1 = X.AnonymousClass71U.A00     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.lang.String r0 = "suggestions"
            org.json.JSONArray r0 = r9.getJSONArray(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.util.ArrayList r0 = r1.A01(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            if (r0 == 0) goto L_0x0051
            X.76w r1 = new X.76w     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            X.C18070vi.A0b(r2)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            X.6qN r0 = new X.6qN     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x0054:
            java.util.Iterator r3 = X.C17890vO.A0i(r7)     // Catch:{ all -> 0x0078 }
        L_0x0058:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0070
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x0078 }
            X.00z r2 = r4.A02     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0078 }
            r2.A08(r1, r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0058
        L_0x0070:
            r0 = 1
            r4.A01 = r0     // Catch:{ all -> 0x0078 }
            r4.A00 = r5     // Catch:{ all -> 0x0078 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x007a:
            X.00z r1 = r4.A02     // Catch:{ all -> 0x0089 }
            X.6qN r0 = new X.6qN     // Catch:{ all -> 0x0089 }
            r0.<init>(r11)     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = r1.A04(r0)     // Catch:{ all -> 0x0089 }
            X.76w r0 = (X.C1417676w) r0     // Catch:{ all -> 0x0089 }
            monitor-exit(r4)
            return r0
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.repository.MetaAISearchRepository.A02(java.lang.String):X.76w");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C30391dr r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C147517Tl
            if (r0 == 0) goto L_0x0023
            r7 = r9
            X.7Tl r7 = (X.C147517Tl) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r4 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r3) goto L_0x0029
            java.lang.Object r0 = r7.L$0
            com.whatsapp.data.repository.MetaAISearchRepository r0 = (com.whatsapp.data.repository.MetaAISearchRepository) r0
            goto L_0x007e
        L_0x0023:
            X.7Tl r7 = new X.7Tl
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002e:
            X.C30691eM.A01(r4)
            X.6fy r0 = r8.A01
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "empty_state_search_suggestions"
            java.lang.String r2 = r1.getString(r0, r5)
            if (r2 == 0) goto L_0x0054
            X.71U r1 = X.AnonymousClass71U.A00
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r2)
            java.util.ArrayList r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0054
            X.76w r4 = new X.76w
            r4.<init>(r0)
            return r4
        L_0x0054:
            r7.L$0 = r8     // Catch:{ Exception -> 0x00a9 }
            r7.label = r3     // Catch:{ Exception -> 0x00a9 }
            X.1g7 r4 = X.C72473Md.A0m(r7)     // Catch:{ Exception -> 0x00a9 }
            X.00H r0 = r8.A03     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r3 = X.C18070vi.A0E(r0)     // Catch:{ Exception -> 0x00a9 }
            X.8AB r3 = (X.AnonymousClass8AB) r3     // Catch:{ Exception -> 0x00a9 }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ Exception -> 0x00a9 }
            X.4rF r2 = X.C98494rF.A00()     // Catch:{ Exception -> 0x00a9 }
            r1 = 0
            X.7I1 r0 = new X.7I1     // Catch:{ Exception -> 0x00a9 }
            r0.<init>(r8, r2, r4, r1)     // Catch:{ Exception -> 0x00a9 }
            r3.CBv(r0)     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r4 = r4.A0C()     // Catch:{ Exception -> 0x00a9 }
            if (r4 != r6) goto L_0x007c
            return r6
        L_0x007c:
            r0 = r8
            goto L_0x0081
        L_0x007e:
            X.C30691eM.A01(r4)     // Catch:{ Exception -> 0x00a9 }
        L_0x0081:
            X.76w r4 = (X.C1417676w) r4     // Catch:{ Exception -> 0x00a9 }
            X.6fy r1 = r0.A01     // Catch:{ Exception -> 0x00a8 }
            java.util.List r0 = r4.A00     // Catch:{ Exception -> 0x00a8 }
            X.0vl r3 = r1.A01     // Catch:{ Exception -> 0x00a8 }
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r3)     // Catch:{ Exception -> 0x00a8 }
            org.json.JSONArray r0 = X.AnonymousClass71U.A00(r0)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "empty_state_search_suggestions"
            X.C17880vN.A1E(r2, r0, r1)     // Catch:{ Exception -> 0x00a8 }
            android.content.SharedPreferences$Editor r3 = X.C17890vO.A0A(r3)     // Catch:{ Exception -> 0x00a8 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "empty_state_search_suggestions_last_save_time"
            X.C17880vN.A1D(r3, r0, r1)     // Catch:{ Exception -> 0x00a8 }
            return r4
        L_0x00a8:
            return r4
        L_0x00a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.repository.MetaAISearchRepository.A03(X.1dr):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAISearchRepository(C125316as r1, C128426fy r2, AnonymousClass6L0 r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        super(r4);
        C18070vi.A0w(r4, r2, r3, r1, r5);
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r5;
    }
}
