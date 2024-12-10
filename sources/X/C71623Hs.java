package X;

/* renamed from: X.3Hs  reason: invalid class name and case insensitive filesystem */
public final class C71623Hs extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass206 $fMessage;
    public final /* synthetic */ AnonymousClass1W3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71623Hs(AnonymousClass206 r2, AnonymousClass1W3 r3) {
        super(0);
        this.this$0 = r3;
        this.$fMessage = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ba A[Catch:{ SQLException -> 0x01f3, all -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r25 = this;
            r1 = r25
            X.1W3 r0 = r1.this$0
            X.1N3 r6 = r0.A01
            X.206 r8 = r1.$fMessage
            r9 = 1
            r8.A14(r9)
            X.1Cd r7 = r6.A03
            X.1au r18 = r7.A05()
            X.1xA r17 = r18.BD0()     // Catch:{ all -> 0x024c }
            X.1DL r2 = r6.A02     // Catch:{ all -> 0x0242 }
            X.205 r3 = r8.A0v     // Catch:{ all -> 0x0242 }
            X.1BI r10 = r3.A00     // Catch:{ all -> 0x0242 }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0242 }
            r2.A09(r10)     // Catch:{ all -> 0x0242 }
            X.1LW r4 = r6.A01     // Catch:{ all -> 0x0242 }
            long r0 = r4.A0A(r8)     // Catch:{ all -> 0x0242 }
            r13 = 0
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x004b
            boolean r5 = X.C22971Dz.A0T(r10)     // Catch:{ all -> 0x0242 }
            if (r5 == 0) goto L_0x004b
            X.0ve r11 = r6.A05     // Catch:{ all -> 0x0242 }
            r6 = 11653(0x2d85, float:1.633E-41)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ all -> 0x0242 }
            boolean r5 = X.C18020vd.A05(r5, r11, r6)     // Catch:{ all -> 0x0242 }
            if (r5 == 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "MainMessageStore/insertMainMessage/disallow creating chat; chatJid="
            X.C17900vP.A0X(r10, r0, r1)     // Catch:{ all -> 0x0242 }
            goto L_0x0216
        L_0x004b:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x0050
            r9 = 0
        L_0x0050:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0242 }
            java.lang.String r5 = "MainMessageStore/insertMainMessage/Chat row not inserted; chatRowId="
            r6.append(r5)     // Catch:{ all -> 0x0242 }
            r6.append(r0)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r6)     // Catch:{ all -> 0x0242 }
            X.C17960vV.A0F(r9, r0)     // Catch:{ all -> 0x0242 }
            X.1au r16 = r7.A05()     // Catch:{ SQLException -> 0x0233 }
            X.1xA r15 = r16.BD0()     // Catch:{ all -> 0x0229 }
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x021f }
            long r0 = r8.A0y     // Catch:{ all -> 0x021f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r10 = "sort_id"
            r9.put(r10, r0)     // Catch:{ all -> 0x021f }
            long r0 = r4.A0A(r8)     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "chat_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            java.lang.Integer r0 = r8.A0S     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "view_mode"
            if (r0 != 0) goto L_0x0096
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
        L_0x0096:
            r9.put(r1, r0)     // Catch:{ all -> 0x021f }
            boolean r1 = r3.A02     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "from_me"
            X.C63432t4.A02(r9, r0, r1)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = r3.A01     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "key_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            X.1BI r0 = r8.A0H()     // Catch:{ all -> 0x021f }
            if (r0 != 0) goto L_0x00b0
            r0 = 0
            goto L_0x00b4
        L_0x00b0:
            long r0 = r2.A09(r0)     // Catch:{ all -> 0x021f }
        L_0x00b4:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "sender_jid_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            int r0 = r8.A0D()     // Catch:{ all -> 0x021f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "status"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "broadcast"
            boolean r0 = r8.A0l     // Catch:{ all -> 0x021f }
            X.C63432t4.A02(r9, r1, r0)     // Catch:{ all -> 0x021f }
            int r0 = r8.A0A     // Catch:{ all -> 0x021f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "recipient_count"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "participant_hash"
            java.lang.String r0 = r8.A0f     // Catch:{ all -> 0x021f }
            X.C63432t4.A01(r9, r1, r0)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0G()     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "origination_flags"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            int r0 = r8.A09     // Catch:{ all -> 0x021f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "origin"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0I     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0G     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "received_timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0H     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "receipt_server_timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            int r0 = r8.A0u     // Catch:{ all -> 0x021f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "message_type"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "text_data"
            java.lang.String r0 = r8.A0R()     // Catch:{ all -> 0x021f }
            X.C63432t4.A01(r9, r1, r0)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "translated_text"
            java.lang.String r0 = r8.A0S()     // Catch:{ all -> 0x021f }
            X.C63432t4.A01(r9, r1, r0)     // Catch:{ all -> 0x021f }
            java.lang.String r1 = "starred"
            boolean r0 = r8.A0q     // Catch:{ all -> 0x021f }
            X.C63432t4.A02(r9, r1, r0)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0F()     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "lookup_tables"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            int r0 = r8.A08     // Catch:{ all -> 0x021f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "message_add_on_flags"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
            long r1 = r8.A0x     // Catch:{ all -> 0x021f }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x016f
            long r0 = r8.A0x     // Catch:{ all -> 0x021f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x021f }
        L_0x016f:
            long r1 = r8.A0x     // Catch:{ all -> 0x021f }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a4
            java.lang.String r2 = "_id"
            long r0 = r8.A0x     // Catch:{ all -> 0x021f }
            X.C17880vN.A19(r9, r2, r0)     // Catch:{ all -> 0x021f }
            long r1 = r8.A0y     // Catch:{ all -> 0x021f }
            r4 = -1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0188
            long r0 = r8.A0x     // Catch:{ all -> 0x021f }
            r8.A0y = r0     // Catch:{ all -> 0x021f }
        L_0x0188:
            long r0 = r8.A0y     // Catch:{ all -> 0x021f }
            X.C17880vN.A19(r9, r10, r0)     // Catch:{ all -> 0x021f }
            java.lang.String r4 = "INSERT_MESSAGE_MAIN_WITH_ROW_ID_SQL"
        L_0x018f:
            long r0 = r8.A0y     // Catch:{ all -> 0x021f }
            r7 = 1
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x01a7
            boolean r0 = r8.A0u()     // Catch:{ all -> 0x021f }
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r8.A0w()     // Catch:{ all -> 0x021f }
            r12 = 0
            if (r0 == 0) goto L_0x01a8
            goto L_0x01a7
        L_0x01a4:
            java.lang.String r4 = "INSERT_MESSAGE_MAIN_SQL"
            goto L_0x018f
        L_0x01a7:
            r12 = 1
        L_0x01a8:
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021f }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "message"
            long r4 = r6.A06(r2, r4, r9)     // Catch:{ all -> 0x021f }
            long r0 = r8.A0x     // Catch:{ all -> 0x021f }
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x01c3
            long r1 = r8.A0x     // Catch:{ all -> 0x021f }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r0)
            goto L_0x0202
        L_0x01c3:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, row_id for inserted message not set."
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x021f }
            r8.A0x = r4     // Catch:{ all -> 0x021f }
            if (r12 != 0) goto L_0x0207
            r8.A0y = r4     // Catch:{ all -> 0x021f }
            r9.clear()     // Catch:{ SQLException -> 0x01f3 }
            long r0 = r8.A0y     // Catch:{ SQLException -> 0x01f3 }
            X.C17880vN.A19(r9, r10, r0)     // Catch:{ SQLException -> 0x01f3 }
            java.lang.String r22 = "_id = ?"
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLException -> 0x01f3 }
            long r0 = r8.A0x     // Catch:{ SQLException -> 0x01f3 }
            X.C17890vO.A1J(r4, r0)     // Catch:{ SQLException -> 0x01f3 }
            java.lang.String r23 = "UPDATE_MESSAGE_MAIN_SORT_ID_SQL"
            r19 = r6
            r20 = r9
            r21 = r2
            r24 = r4
            r19.A02(r20, r21, r22, r23, r24)     // Catch:{ SQLException -> 0x01f3 }
            goto L_0x0207
        L_0x01f3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, failed to update sortId key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x021f }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x021f }
            throw r2     // Catch:{ all -> 0x021f }
        L_0x0202:
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2/RowId for inserted message doesn't match."
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x021f }
        L_0x0207:
            r8.A14(r7)     // Catch:{ all -> 0x021f }
            r15.A00()     // Catch:{ all -> 0x021f }
            r15.close()     // Catch:{ all -> 0x0229 }
            r16.close()     // Catch:{ SQLException -> 0x0233 }
            r17.A00()     // Catch:{ all -> 0x0242 }
        L_0x0216:
            r17.close()     // Catch:{ all -> 0x024c }
            r18.close()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x021f:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0229 }
        L_0x0228:
            throw r1     // Catch:{ all -> 0x0229 }
        L_0x0229:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x022e }
            goto L_0x0232
        L_0x022e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLException -> 0x0233 }
        L_0x0232:
            throw r1     // Catch:{ SQLException -> 0x0233 }
        L_0x0233:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, unknown error key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x0242 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0242 }
            throw r2     // Catch:{ all -> 0x0242 }
        L_0x0242:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0247 }
            goto L_0x024b
        L_0x0247:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x024c }
        L_0x024b:
            throw r1     // Catch:{ all -> 0x024c }
        L_0x024c:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0251 }
            throw r1
        L_0x0251:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71623Hs.invoke():java.lang.Object");
    }
}
