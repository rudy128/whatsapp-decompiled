package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Pl  reason: invalid class name and case insensitive filesystem */
public final class C25741Pl {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = new C18110vm(C25751Pm.A00);
    public final C18100vl A02 = new C18110vm(C25761Pn.A00);

    public C25741Pl(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        Boolean bool = C17960vV.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        X.CDX.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C446324e A00(com.whatsapp.jid.UserJid r31) {
        /*
            r30 = this;
            r0 = 0
            r10 = r31
            X.C18070vi.A0d(r10, r0)
            r1 = r30
            X.0vl r3 = r1.A02
            java.lang.Object r0 = r3.getValue()
            X.00z r0 = (X.C002100z) r0
            java.lang.Object r0 = r0.A04(r10)
            r8 = 0
            if (r0 != 0) goto L_0x00fa
            X.0vl r2 = r1.A01
            java.lang.Object r0 = r2.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r10)
            X.24e r0 = (X.C446324e) r0
            if (r0 == 0) goto L_0x0028
            return r0
        L_0x0028:
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.23Y r0 = (X.AnonymousClass23Y) r0
            r7 = 0
            X.1Lt r0 = r0.A00
            X.1at r0 = r0.get()
            r1 = r0
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x00f3 }
            X.1Ev r6 = r1.A02     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "\n            SELECT\n              tag,\n              name,\n              is_default,\n              attributes,\n              description,\n              category,\n              prompts,\n              persona_id,\n              commands_description,\n              commands,\n              avatar_url,\n              is_meta_created,\n              creator_name,\n              creator_profile_url,\n              card_title,\n              count,\n              capabilities,\n              last_updated_time_ms,\n              created_by_me\n            FROM\n              wa_bot_profiles\n            WHERE\n              jid = ?\n        "
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r10.getRawString()     // Catch:{ all -> 0x00f3 }
            r4[r7] = r1     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "GET_BOT_PROFILE_BY_JID"
            android.database.Cursor r9 = r6.A0A(r5, r1, r4)     // Catch:{ all -> 0x00f3 }
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x00ec }
            r1 = 0
            if (r4 == 0) goto L_0x00cb
            java.lang.String r1 = "tag"
            int r11 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "name"
            int r12 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "is_default"
            int r13 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "attributes"
            int r14 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "description"
            int r15 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "category"
            int r16 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "prompts"
            int r17 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "persona_id"
            int r18 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "commands_description"
            int r19 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "commands"
            int r20 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "avatar_url"
            int r21 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "is_meta_created"
            int r22 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "creator_name"
            int r23 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "creator_profile_url"
            int r24 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "card_title"
            int r25 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "count"
            int r26 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "capabilities"
            int r27 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "last_updated_time_ms"
            int r28 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "created_by_me"
            int r29 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ec }
            X.24e r1 = X.AnonymousClass23Y.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00ec }
        L_0x00cb:
            r9.close()     // Catch:{ all -> 0x00f3 }
            r0.close()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r0 = r2.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r10, r1)
            return r1
        L_0x00dd:
            java.lang.Object r1 = r3.getValue()
            X.00z r1 = (X.C002100z) r1
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A08(r10, r0)
            return r8
        L_0x00ec:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r1 = move-exception
            X.CDX.A00(r9, r2)     // Catch:{ all -> 0x00f3 }
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r1 = move-exception
            X.CDX.A00(r0, r2)
            throw r1
        L_0x00fa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25741Pl.A00(com.whatsapp.jid.UserJid):X.24e");
    }

    public C446324e A01(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        return A00(userJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00fc, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ff, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C446324e r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.23Y r0 = (X.AnonymousClass23Y) r0
            X.1Lt r0 = r0.A00
            X.1au r5 = r0.A06()
            r0 = 10
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00f9 }
            r6.<init>(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r4 = r8.A04     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "tag"
            int r0 = r8.A01     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r8.A0E     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "is_default"
            boolean r0 = r8.A0I     // Catch:{ all -> 0x00f9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "attributes"
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "description"
            java.lang.String r0 = r8.A0D     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "category"
            java.lang.String r0 = r8.A09     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "prompts"
            java.util.List r0 = r8.A0H     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = X.AnonymousClass24Y.A00(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "persona_id"
            java.lang.String r0 = r8.A0F     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "commands_description"
            java.lang.String r0 = r8.A0A     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "commands"
            java.util.List r0 = r8.A0G     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = X.C446024b.A00(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "avatar_url"
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "is_meta_created"
            boolean r0 = r8.A0J     // Catch:{ all -> 0x00f9 }
            X.C50072Ta.A00(r6, r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "creator_name"
            java.lang.String r0 = r8.A0B     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "creator_profile_url"
            java.lang.String r0 = r8.A0C     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "card_title"
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "count"
            int r0 = r8.A00     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "capabilities"
            long r0 = r8.A02     // Catch:{ all -> 0x00f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r2, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "last_updated_time_ms"
            long r0 = r8.A03     // Catch:{ all -> 0x00f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r6.put(r2, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "created_by_me"
            java.lang.Boolean r1 = r8.A05     // Catch:{ all -> 0x00f9 }
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f9 }
        L_0x00ce:
            r6.put(r2, r0)     // Catch:{ all -> 0x00f9 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "wa_bot_profiles"
            java.lang.String r1 = "INSERT_OR_UPDATE_BOT_PROFILE"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x00f9 }
            r5.close()
            X.0vl r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r4, r8)
            X.0vl r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            X.00z r0 = (X.C002100z) r0
            r0.A05(r4)
            return
        L_0x00f9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25741Pl.A02(X.24e):void");
    }
}
