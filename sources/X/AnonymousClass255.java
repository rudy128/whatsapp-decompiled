package X;

/* renamed from: X.255  reason: invalid class name */
public final class AnonymousClass255 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass255(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:305:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r31, X.C49702Rn r32) {
        /*
            r30 = this;
            r0 = 0
            r8 = r31
            X.C18070vi.A0d(r8, r0)
            long r1 = r8.A0F
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            long r3 = r8.A11
            r1 = 2
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0691
        L_0x0017:
            r0 = r30
            X.00H r0 = r0.A00
            java.lang.Object r7 = r0.get()
            X.125 r7 = (X.AnonymousClass125) r7
            X.1Cd r4 = r7.A0B     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0670 }
            X.1at r18 = r4.get()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0670 }
            long r2 = r8.A0x     // Catch:{ all -> 0x0666 }
            X.1at r14 = r4.get()     // Catch:{ all -> 0x0666 }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x065c }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x065c }
            java.lang.String r6 = "SELECT chat_row_id, from_me, sender_jid_row_id, key_id, timestamp, message_type, origin, text_data, payment_transaction_id, lookup_tables FROM message_quoted WHERE message_row_id = ?"
            r12 = 1
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ all -> 0x065c }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x065c }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x065c }
            java.lang.String r0 = "GET_QUOTED_CORE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r5 = r9.A0A(r6, r0, r5)     // Catch:{ all -> 0x065c }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0650 }
            if (r0 == 0) goto L_0x0632
            X.1LW r6 = r7.A02     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "chat_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0650 }
            X.1BI r13 = r6.A0B(r0)     // Catch:{ all -> 0x0650 }
            if (r13 == 0) goto L_0x0646
            java.lang.String r0 = "from_me"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0650 }
            if (r0 > 0) goto L_0x0069
            r12 = 0
        L_0x0069:
            java.lang.String r0 = "key_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r11 = r5.getString(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "timestamp"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r6 = "message_type"
            int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0650 }
            int r6 = r5.getInt(r6)     // Catch:{ all -> 0x0650 }
            byte r10 = (byte) r6     // Catch:{ all -> 0x0650 }
            X.00H r6 = r7.A0K     // Catch:{ all -> 0x0650 }
            java.lang.Object r9 = r6.get()     // Catch:{ all -> 0x0650 }
            X.207 r9 = (X.AnonymousClass207) r9     // Catch:{ all -> 0x0650 }
            X.205 r6 = new X.205     // Catch:{ all -> 0x0650 }
            r6.<init>(r13, r11, r12)     // Catch:{ all -> 0x0650 }
            X.206 r6 = r9.A00(r6, r10, r0)     // Catch:{ all -> 0x0650 }
            X.1DL r9 = r7.A05     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0650 }
            com.whatsapp.jid.Jid r1 = r9.A0B(r0)     // Catch:{ all -> 0x0650 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0650 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x0650 }
            r6.A0d(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "origin"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0650 }
            r6.A09 = r0     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "text_data"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0650 }
            r6.A0j(r0)     // Catch:{ all -> 0x0650 }
            r6.A0x = r2     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "payment_transaction_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0650 }
            X.AnonymousClass25B.A04(r6, r0)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "lookup_tables"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0650 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0650 }
            r6.A11 = r0     // Catch:{ all -> 0x0650 }
            r5.close()     // Catch:{ all -> 0x065c }
            r14.close()     // Catch:{ all -> 0x0666 }
            X.205 r0 = r6.A0v     // Catch:{ all -> 0x0666 }
            r29 = r0
            r0 = 2
            r6.A14(r0)     // Catch:{ all -> 0x0666 }
            r8.A0f(r6)     // Catch:{ all -> 0x0666 }
            java.lang.String r0 = X.AnonymousClass25B.A01(r6)     // Catch:{ all -> 0x0666 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0666 }
            if (r0 != 0) goto L_0x0117
            X.1QR r5 = r7.A0E     // Catch:{ all -> 0x0666 }
            r0 = r29
            java.lang.String r3 = r0.A01     // Catch:{ all -> 0x0666 }
            java.lang.String r2 = X.AnonymousClass25B.A01(r6)     // Catch:{ all -> 0x0666 }
            r0 = -1
            X.AW0 r0 = r5.A0N(r3, r2, r0)     // Catch:{ all -> 0x0666 }
            X.AnonymousClass25B.A02(r0, r6)     // Catch:{ all -> 0x0666 }
        L_0x0117:
            long r0 = r8.A0x     // Catch:{ all -> 0x0666 }
            X.1at r19 = r4.get()     // Catch:{ all -> 0x0666 }
            boolean r2 = r6 instanceof X.C439421n     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x019e
            X.1Qc r9 = r7.A0F     // Catch:{ all -> 0x062d }
            r2 = r6
            X.21n r2 = (X.C439421n) r2     // Catch:{ all -> 0x062d }
            r4 = 1
            r28 = 0
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            r5 = 0
            if (r3 <= 0) goto L_0x012f
            r5 = 1
        L_0x012f:
            java.lang.String r3 = "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set"
            X.C17960vV.A0G(r5, r3)     // Catch:{ all -> 0x062d }
            X.1Cd r3 = r9.A00     // Catch:{ all -> 0x062d }
            X.1at r10 = r3.get()     // Catch:{ all -> 0x062d }
            r3 = r10
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0543 }
            X.1Ev r9 = r3.A02     // Catch:{ all -> 0x0543 }
            java.lang.String r5 = "SELECT content_text_data, footer_text_data FROM message_template_quoted WHERE message_row_id = ?"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0543 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0543 }
            r4[r28] = r3     // Catch:{ all -> 0x0543 }
            java.lang.String r3 = "GET_TEMPLATE_MESSAGE_QUOTED_SQL"
            android.database.Cursor r3 = r9.A0A(r5, r3, r4)     // Catch:{ all -> 0x0543 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x0537 }
            if (r4 == 0) goto L_0x0175
            java.lang.String r4 = "content_text_data"
            int r4 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0537 }
            java.lang.String r22 = r3.getString(r4)     // Catch:{ all -> 0x0537 }
            java.lang.String r4 = "footer_text_data"
            int r4 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0537 }
            java.lang.String r23 = r3.getString(r4)     // Catch:{ all -> 0x0537 }
            r3.close()     // Catch:{ all -> 0x0543 }
            r10.close()     // Catch:{ all -> 0x062d }
            X.C17960vV.A07(r22)     // Catch:{ all -> 0x062d }
            r21 = 0
            goto L_0x018c
        L_0x0175:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0537 }
            r4.<init>()     // Catch:{ all -> 0x0537 }
            java.lang.String r2 = "TemplateMessageStore/fillQuotedTemplateData/missing template info for quoted message; rowId="
            r4.append(r2)     // Catch:{ all -> 0x0537 }
            r4.append(r0)     // Catch:{ all -> 0x0537 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0537 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0537 }
            r0.<init>(r1)     // Catch:{ all -> 0x0537 }
            throw r0     // Catch:{ all -> 0x0537 }
        L_0x018c:
            X.2k6 r3 = new X.2k6     // Catch:{ all -> 0x062d }
            r25 = r21
            r26 = r21
            r27 = r21
            r20 = r3
            r24 = r21
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x062d }
            r2.CL3(r3)     // Catch:{ all -> 0x062d }
        L_0x019e:
            r2 = 8
            boolean r2 = r6.A0z(r2)     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x01af
            X.1Qg r5 = r7.A04     // Catch:{ all -> 0x062d }
            java.lang.String r4 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            long r2 = r6.A0x     // Catch:{ all -> 0x062d }
            X.C25951Qg.A05(r5, r6, r4, r2)     // Catch:{ all -> 0x062d }
        L_0x01af:
            long r2 = r6.A11     // Catch:{ all -> 0x062d }
            r9 = 1
            long r2 = r2 & r9
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0227
            X.1Qa r13 = r7.A09     // Catch:{ all -> 0x062d }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x062d }
            r12.<init>()     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r13.A03     // Catch:{ all -> 0x062d }
            X.1at r14 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r14
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x021b }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x021b }
            java.lang.String r4 = "SELECT jid_row_id, display_name FROM message_quoted_mentions WHERE message_row_id = ?"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x021b }
            java.lang.String r9 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x021b }
            r2 = 0
            r3[r2] = r9     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "GET_JIDS_FROM_MESSAGE_QUOTED_MENTIONS_TABLE_SQL"
            android.database.Cursor r11 = r5.A0A(r4, r2, r3)     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "jid_row_id"
            int r10 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x020f }
            java.lang.String r2 = "display_name"
            int r9 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x020f }
        L_0x01e8:
            boolean r2 = r11.moveToNext()     // Catch:{ all -> 0x020f }
            if (r2 == 0) goto L_0x020b
            long r2 = r11.getLong(r10)     // Catch:{ all -> 0x020f }
            java.lang.String r5 = r11.getString(r9)     // Catch:{ all -> 0x020f }
            X.1DL r4 = r13.A02     // Catch:{ all -> 0x020f }
            com.whatsapp.jid.Jid r2 = r4.A0B(r2)     // Catch:{ all -> 0x020f }
            X.1BI r3 = X.C22931Dv.A00(r2)     // Catch:{ all -> 0x020f }
            if (r3 == 0) goto L_0x01e8
            X.3Bi r2 = new X.3Bi     // Catch:{ all -> 0x020f }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x020f }
            r12.add(r2)     // Catch:{ all -> 0x020f }
            goto L_0x01e8
        L_0x020b:
            r11.close()     // Catch:{ all -> 0x021b }
            goto L_0x0221
        L_0x020f:
            r1 = move-exception
            if (r11 == 0) goto L_0x021a
            r11.close()     // Catch:{ all -> 0x0216 }
            goto L_0x021a
        L_0x0216:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x021b }
        L_0x021a:
            throw r1     // Catch:{ all -> 0x021b }
        L_0x021b:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x0221:
            r14.close()     // Catch:{ all -> 0x062d }
            r6.A0l(r12)     // Catch:{ all -> 0x062d }
        L_0x0227:
            boolean r2 = r6 instanceof X.AnonymousClass22Q     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x0241
            X.00H r2 = r7.A0M     // Catch:{ all -> 0x062d }
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x062d }
            X.2sc r5 = (X.C63162sc) r5     // Catch:{ all -> 0x062d }
            r4 = r6
            X.22Q r4 = (X.AnonymousClass22Q) r4     // Catch:{ all -> 0x062d }
            r2 = 0
            X.C18070vi.A0d(r4, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, signed_url, product_image_count, sale_amount_1000, body, footer FROM message_quoted_product WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_PRODUCT_MESSAGE_SQL"
            X.C63162sc.A01(r5, r4, r3, r2)     // Catch:{ all -> 0x062d }
        L_0x0241:
            boolean r2 = r6 instanceof X.AnonymousClass22S     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x025b
            X.00H r2 = r7.A0J     // Catch:{ all -> 0x062d }
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x062d }
            X.2sN r5 = (X.C63022sN) r5     // Catch:{ all -> 0x062d }
            r4 = r6
            X.22S r4 = (X.AnonymousClass22S) r4     // Catch:{ all -> 0x062d }
            r2 = 0
            X.C18070vi.A0d(r4, r2)     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, title, description FROM message_quoted_product WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_CATALOG_MESSAGE_SQL_DEPRECATED"
            X.C63022sN.A01(r5, r4, r3, r2)     // Catch:{ all -> 0x062d }
        L_0x025b:
            boolean r2 = r6 instanceof X.AnonymousClass23S     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x031b
            X.1Qh r11 = r7.A03     // Catch:{ all -> 0x062d }
            r12 = r6
            X.23S r12 = (X.AnonymousClass23S) r12     // Catch:{ all -> 0x062d }
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x062d }
            long r2 = r12.A0x     // Catch:{ all -> 0x062d }
            java.lang.String r3 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x062d }
            r2 = 0
            r4[r2] = r3     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r11.A01     // Catch:{ all -> 0x062d }
            X.1at r23 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r23
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0312 }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x0312 }
            java.lang.String r3 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r13 = r5.A0A(r3, r2, r4)     // Catch:{ all -> 0x0312 }
            boolean r2 = r13.moveToNext()     // Catch:{ all -> 0x0306 }
            if (r2 == 0) goto L_0x0302
            java.lang.String r2 = "expiration"
            int r2 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0306 }
            long r9 = r13.getLong(r2)     // Catch:{ all -> 0x0306 }
            java.lang.String r2 = "group_jid_row_id"
            int r2 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0306 }
            long r4 = r13.getLong(r2)     // Catch:{ all -> 0x0306 }
            java.lang.String r2 = "admin_jid_row_id"
            int r2 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0306 }
            long r2 = r13.getLong(r2)     // Catch:{ all -> 0x0306 }
            java.lang.String r14 = "group_name"
            int r14 = r13.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0306 }
            java.lang.String r22 = r13.getString(r14)     // Catch:{ all -> 0x0306 }
            java.lang.String r14 = "invite_code"
            int r14 = r13.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0306 }
            java.lang.String r21 = r13.getString(r14)     // Catch:{ all -> 0x0306 }
            java.lang.String r14 = "expired"
            int r14 = r13.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0306 }
            int r20 = r13.getInt(r14)     // Catch:{ all -> 0x0306 }
            java.lang.String r14 = "group_type"
            int r14 = r13.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0306 }
            int r15 = r13.getInt(r14)     // Catch:{ all -> 0x0306 }
            X.1DL r14 = r11.A00     // Catch:{ all -> 0x0306 }
            java.lang.Class<X.1EC> r11 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r4 = r14.A0E(r11, r4)     // Catch:{ all -> 0x0306 }
            X.1EC r4 = (X.AnonymousClass1EC) r4     // Catch:{ all -> 0x0306 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r14.A0E(r5, r2)     // Catch:{ all -> 0x0306 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0306 }
            if (r4 == 0) goto L_0x02fd
            if (r2 == 0) goto L_0x02fd
            r3 = 0
            if (r20 == 0) goto L_0x02ea
            r3 = 1
        L_0x02ea:
            r12.A02 = r4     // Catch:{ all -> 0x0306 }
            r12.A03 = r2     // Catch:{ all -> 0x0306 }
            r2 = r22
            r12.A05 = r2     // Catch:{ all -> 0x0306 }
            r2 = r21
            r12.A06 = r2     // Catch:{ all -> 0x0306 }
            r12.A01 = r9     // Catch:{ all -> 0x0306 }
            r12.A07 = r3     // Catch:{ all -> 0x0306 }
            r12.A00 = r15     // Catch:{ all -> 0x0306 }
            goto L_0x0302
        L_0x02fd:
            java.lang.String r2 = "GroupInviteMessageStore/fillQuotedGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0306 }
        L_0x0302:
            r13.close()     // Catch:{ all -> 0x0312 }
            goto L_0x0318
        L_0x0306:
            r1 = move-exception
            if (r13 == 0) goto L_0x0311
            r13.close()     // Catch:{ all -> 0x030d }
            goto L_0x0311
        L_0x030d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0312 }
        L_0x0311:
            throw r1     // Catch:{ all -> 0x0312 }
        L_0x0312:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x0318:
            r23.close()     // Catch:{ all -> 0x062d }
        L_0x031b:
            boolean r2 = r6 instanceof X.AnonymousClass22U     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x032c
            X.1QX r9 = r7.A0C     // Catch:{ all -> 0x062d }
            r5 = r6
            X.22U r5 = (X.AnonymousClass22U) r5     // Catch:{ all -> 0x062d }
            java.lang.String r4 = "GET_QUOTED_ORDER_MESSAGE_SQL"
            r3 = 1
            java.lang.String r2 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version, catalog_type FROM message_quoted_order WHERE message_row_id=?"
            X.AnonymousClass1QX.A01(r9, r5, r2, r4, r3)     // Catch:{ all -> 0x062d }
        L_0x032c:
            boolean r2 = r6 instanceof X.AnonymousClass21K     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x0343
            X.1Qg r9 = r7.A04     // Catch:{ all -> 0x062d }
            r5 = r6
            X.21K r5 = (X.AnonymousClass21K) r5     // Catch:{ all -> 0x062d }
            long r2 = r6.A0x     // Catch:{ all -> 0x062d }
            java.lang.String r4 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            X.C25951Qg.A09(r9, r5, r4, r2)     // Catch:{ SQLiteBlobTooBigException -> 0x033d }
            goto L_0x0343
        L_0x033d:
            r3 = move-exception
            java.lang.String r2 = "InteractiveMessageStore/fillMessageMultiElement/failed to load message"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ all -> 0x062d }
        L_0x0343:
            boolean r2 = r6 instanceof X.C438721g     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x0353
            X.1Qg r5 = r7.A04     // Catch:{ all -> 0x062d }
            r4 = r6
            X.21g r4 = (X.C438721g) r4     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_REPLY_MESSAGE_SQL"
            X.C25951Qg.A08(r5, r4, r3, r2)     // Catch:{ all -> 0x062d }
        L_0x0353:
            boolean r2 = r6 instanceof X.AnonymousClass21T     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x0363
            X.1Qg r5 = r7.A04     // Catch:{ all -> 0x062d }
            r4 = r6
            X.21T r4 = (X.AnonymousClass21T) r4     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_RESPONSE_BUTTONS_MESSAGE_SQL"
            X.C25951Qg.A07(r5, r4, r3, r2)     // Catch:{ all -> 0x062d }
        L_0x0363:
            boolean r2 = r6 instanceof X.AnonymousClass218     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x03b8
            X.1Qb r5 = r7.A06     // Catch:{ all -> 0x062d }
            r4 = r6
            X.218 r4 = (X.AnonymousClass218) r4     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            r9 = 1
            r11 = 0
            int r10 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r3 = 0
            if (r10 <= 0) goto L_0x0376
            r3 = 1
        L_0x0376:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r10.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "LocationMessageStore/fillLocationInfoForQuotedMessage/message must have row_id set; key="
            r10.append(r2)     // Catch:{ all -> 0x062d }
            X.205 r2 = r4.A0v     // Catch:{ all -> 0x062d }
            r10.append(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x062d }
            X.C17960vV.A0G(r3, r2)     // Catch:{ all -> 0x062d }
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x062d }
            r9[r11] = r2     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r5.A01     // Catch:{ all -> 0x062d }
            X.1at r10 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r10
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0543 }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x0543 }
            java.lang.String r3 = "SELECT latitude, longitude, place_name, place_address, url, thumbnail FROM message_quoted_location WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_LOCATION_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r5.A0A(r3, r2, r9)     // Catch:{ all -> 0x0543 }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0537 }
            if (r2 == 0) goto L_0x03b2
            r4.A17(r3)     // Catch:{ all -> 0x0537 }
        L_0x03b2:
            r3.close()     // Catch:{ all -> 0x0543 }
            r10.close()     // Catch:{ all -> 0x062d }
        L_0x03b8:
            boolean r2 = r6 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x04a2
            X.1Nt r5 = r7.A08     // Catch:{ all -> 0x062d }
            r4 = r6
            X.21V r4 = (X.AnonymousClass21V) r4     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            r9 = 1
            r12 = 0
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r10 = 0
            if (r11 <= 0) goto L_0x03cb
            r10 = 1
        L_0x03cb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r3.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "MediaCoreMessageStore/fillMediaInfoForQuotedMessage/message must have row_id set; key="
            r3.append(r2)     // Catch:{ all -> 0x062d }
            X.205 r2 = r4.A0v     // Catch:{ all -> 0x062d }
            r3.append(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x062d }
            X.C17960vV.A0G(r10, r2)     // Catch:{ all -> 0x062d }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x062d }
            r10[r12] = r2     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r5.A02     // Catch:{ all -> 0x062d }
            X.1at r11 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r11
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0499 }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x0499 }
            java.lang.String r3 = "SELECT message_row_id, media_job_uuid, transferred, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, thumbnail, media_caption FROM message_quoted_media WHERE message_row_id= ?"
            java.lang.String r2 = "GET_QUOTED_MESSAGE_MEDIA_SQL"
            android.database.Cursor r9 = r9.A0A(r3, r2, r10)     // Catch:{ all -> 0x0499 }
            boolean r2 = r9.moveToNext()     // Catch:{ all -> 0x048d }
            if (r2 == 0) goto L_0x0489
            X.2rc r10 = new X.2rc     // Catch:{ all -> 0x048d }
            r10.<init>()     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "media_job_uuid"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ all -> 0x048d }
            r10.A0L = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "transferred"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            boolean r2 = X.AnonymousClass1Eu.A06(r9, r2)     // Catch:{ all -> 0x048d }
            r10.A0V = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "file_size"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            long r2 = r9.getLong(r2)     // Catch:{ all -> 0x048d }
            r10.A0A = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "media_key"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            byte[] r2 = r9.getBlob(r2)     // Catch:{ all -> 0x048d }
            r10.A0a = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "media_key_timestamp"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            long r2 = r9.getLong(r2)     // Catch:{ all -> 0x048d }
            r10.A0B = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "width"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            int r2 = r9.getInt(r2)     // Catch:{ all -> 0x048d }
            r10.A08 = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "height"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            int r2 = r9.getInt(r2)     // Catch:{ all -> 0x048d }
            r10.A06 = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "direct_path"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ all -> 0x048d }
            r10.A0J = r2     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "file_path"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x048d }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ all -> 0x048d }
            if (r2 != 0) goto L_0x0479
            r3 = 0
            goto L_0x047e
        L_0x0479:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x048d }
            r3.<init>(r2)     // Catch:{ all -> 0x048d }
        L_0x047e:
            X.1L7 r2 = r5.A00     // Catch:{ all -> 0x048d }
            java.io.File r2 = r2.A07(r3)     // Catch:{ all -> 0x048d }
            r10.A0G = r2     // Catch:{ all -> 0x048d }
            r4.A1B(r9, r10)     // Catch:{ all -> 0x048d }
        L_0x0489:
            r9.close()     // Catch:{ all -> 0x0499 }
            goto L_0x049f
        L_0x048d:
            r1 = move-exception
            if (r9 == 0) goto L_0x0498
            r9.close()     // Catch:{ all -> 0x0494 }
            goto L_0x0498
        L_0x0494:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0499 }
        L_0x0498:
            throw r1     // Catch:{ all -> 0x0499 }
        L_0x0499:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x049f:
            r11.close()     // Catch:{ all -> 0x062d }
        L_0x04a2:
            boolean r2 = r6 instanceof X.C442222p     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x04d3
            X.1QY r3 = r7.A0H     // Catch:{ all -> 0x062d }
            r4 = r6
            X.22p r4 = (X.C442222p) r4     // Catch:{ all -> 0x062d }
            r2 = 1
            java.util.ArrayList r3 = X.AnonymousClass1QY.A00(r3, r0, r2)     // Catch:{ all -> 0x062d }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x062d }
            if (r2 != 0) goto L_0x04c0
            r2 = 0
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x062d }
            r4.A18(r2)     // Catch:{ all -> 0x062d }
        L_0x04c0:
            boolean r2 = r6 instanceof X.AnonymousClass210     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x054b
            X.1QU r5 = r7.A0G     // Catch:{ all -> 0x062d }
            r4 = r6
            X.210 r4 = (X.AnonymousClass210) r4     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            r10 = 1
            r12 = 0
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r9 = 0
            if (r11 <= 0) goto L_0x04ec
            goto L_0x04eb
        L_0x04d3:
            boolean r2 = r6 instanceof X.C442022n     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x04c0
            X.1QY r3 = r7.A0H     // Catch:{ all -> 0x062d }
            r4 = r6
            X.22n r4 = (X.C442022n) r4     // Catch:{ all -> 0x062d }
            r2 = 1
            java.util.ArrayList r3 = X.AnonymousClass1QY.A00(r3, r0, r2)     // Catch:{ all -> 0x062d }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x062d }
            if (r2 != 0) goto L_0x04c0
            r4.A18(r3)     // Catch:{ all -> 0x062d }
            goto L_0x04c0
        L_0x04eb:
            r9 = 1
        L_0x04ec:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r3.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r2 = "TextMessageStore/fillTextInfoForQuotedMessage/message must have row_id set; key="
            r3.append(r2)     // Catch:{ all -> 0x062d }
            X.205 r2 = r4.A0v     // Catch:{ all -> 0x062d }
            r3.append(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x062d }
            X.C17960vV.A0G(r9, r2)     // Catch:{ all -> 0x062d }
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x062d }
            long r2 = r4.A0x     // Catch:{ all -> 0x062d }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x062d }
            r9[r12] = r2     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r5.A00     // Catch:{ all -> 0x062d }
            X.1at r10 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r10
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0543 }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x0543 }
            java.lang.String r3 = "SELECT thumbnail FROM message_quoted_text WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_TEXT_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r5.A0A(r3, r2, r9)     // Catch:{ all -> 0x0543 }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0537 }
            if (r2 == 0) goto L_0x0533
            java.lang.String r2 = "thumbnail"
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0537 }
            byte[] r2 = r3.getBlob(r2)     // Catch:{ all -> 0x0537 }
            r4.A19(r2)     // Catch:{ all -> 0x0537 }
        L_0x0533:
            r3.close()     // Catch:{ all -> 0x0543 }
            goto L_0x0548
        L_0x0537:
            r1 = move-exception
            if (r3 == 0) goto L_0x0542
            r3.close()     // Catch:{ all -> 0x053e }
            goto L_0x0542
        L_0x053e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0543 }
        L_0x0542:
            throw r1     // Catch:{ all -> 0x0543 }
        L_0x0543:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x0548:
            r10.close()     // Catch:{ all -> 0x062d }
        L_0x054b:
            boolean r2 = r6 instanceof X.AnonymousClass21D     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x055b
            X.1Qi r5 = r7.A0D     // Catch:{ all -> 0x062d }
            r4 = r6
            X.21D r4 = (X.AnonymousClass21D) r4     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_PAYMENT_INVITE"
            X.C25971Qi.A00(r5, r4, r3, r2)     // Catch:{ all -> 0x062d }
        L_0x055b:
            boolean r2 = r6 instanceof X.AnonymousClass23W     // Catch:{ all -> 0x062d }
            if (r2 == 0) goto L_0x05bc
            X.1Qd r2 = r7.A0I     // Catch:{ all -> 0x062d }
            r3 = r6
            X.23W r3 = (X.AnonymousClass23W) r3     // Catch:{ all -> 0x062d }
            X.1Cd r2 = r2.A00     // Catch:{ all -> 0x062d }
            X.1at r9 = r2.get()     // Catch:{ all -> 0x062d }
            r2 = r9
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x05af }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x05af }
            java.lang.String r4 = "SELECT message_row_id, parent_group_jid, group_subject FROM message_quoted_blank_reply WHERE message_row_id = ?"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x05af }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x05af }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x05af }
            java.lang.String r0 = "GET_QUOTED_BLANK_REPLY_MESSAGE"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x05af }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x05a3 }
            if (r0 == 0) goto L_0x059f
            java.lang.String r0 = "parent_group_jid"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x05a3 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05a3 }
            r3.A01 = r0     // Catch:{ all -> 0x05a3 }
            java.lang.String r0 = "group_subject"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x05a3 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05a3 }
            r3.A00 = r0     // Catch:{ all -> 0x05a3 }
        L_0x059f:
            r2.close()     // Catch:{ all -> 0x05af }
            goto L_0x05b9
        L_0x05a3:
            r1 = move-exception
            if (r2 == 0) goto L_0x05ae
            r2.close()     // Catch:{ all -> 0x05aa }
            goto L_0x05ae
        L_0x05aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x05af }
        L_0x05ae:
            throw r1     // Catch:{ all -> 0x05af }
        L_0x05af:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x05b4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x062d }
        L_0x05b8:
            throw r1     // Catch:{ all -> 0x062d }
        L_0x05b9:
            r9.close()     // Catch:{ all -> 0x062d }
        L_0x05bc:
            boolean r0 = r6 instanceof X.AnonymousClass22M     // Catch:{ all -> 0x062d }
            if (r0 == 0) goto L_0x060e
            X.00H r0 = r7.A0L     // Catch:{ all -> 0x062d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x062d }
            X.2jc r1 = (X.C57772jc) r1     // Catch:{ all -> 0x062d }
            r9 = r6
            X.22M r9 = (X.AnonymousClass22M) r9     // Catch:{ all -> 0x062d }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ all -> 0x062d }
            X.00H r0 = r1.A02     // Catch:{ all -> 0x062d }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x062d }
            X.2dh r5 = (X.C54162dh) r5     // Catch:{ all -> 0x062d }
            X.00H r0 = r1.A04     // Catch:{ all -> 0x062d }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x062d }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x062d }
            X.2hx r4 = (X.C56742hx) r4     // Catch:{ all -> 0x062d }
            X.00H r0 = r1.A03     // Catch:{ all -> 0x062d }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x062d }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x062d }
            X.1W6 r3 = (X.AnonymousClass1W6) r3     // Catch:{ all -> 0x062d }
            X.3Ho r2 = new X.3Ho     // Catch:{ all -> 0x062d }
            r2.<init>(r1, r8)     // Catch:{ all -> 0x062d }
            r0 = 1
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x062d }
            r0 = 2
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x062d }
            X.10I r1 = r5.A01     // Catch:{ all -> 0x062d }
            r17 = 6
            X.Akd r0 = new X.Akd     // Catch:{ all -> 0x062d }
            r10 = r0
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r9
            r15 = r8
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x062d }
            r1.CGN(r0)     // Catch:{ all -> 0x062d }
        L_0x060e:
            boolean r0 = r6 instanceof X.AnonymousClass247     // Catch:{ all -> 0x062d }
            if (r0 == 0) goto L_0x0629
            X.1N3 r2 = r7.A07     // Catch:{ all -> 0x062d }
            r1 = r19
            r0 = r29
            java.lang.Long r0 = r2.A03(r1, r0)     // Catch:{ all -> 0x062d }
            if (r0 == 0) goto L_0x0629
            X.1QZ r2 = r7.A01     // Catch:{ all -> 0x062d }
            X.247 r6 = (X.AnonymousClass247) r6     // Catch:{ all -> 0x062d }
            long r0 = r0.longValue()     // Catch:{ all -> 0x062d }
            r2.A01(r6, r0)     // Catch:{ all -> 0x062d }
        L_0x0629:
            r19.close()     // Catch:{ all -> 0x0666 }
            goto L_0x064c
        L_0x062d:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0661 }
            goto L_0x0665
        L_0x0632:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0650 }
            r1.<init>()     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = "QuotedMessageStore/readQuotedMessage/no quote; rowId="
            r1.append(r0)     // Catch:{ all -> 0x0650 }
            r1.append(r2)     // Catch:{ all -> 0x0650 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0650 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0650 }
        L_0x0646:
            r5.close()     // Catch:{ all -> 0x065c }
            r14.close()     // Catch:{ all -> 0x0666 }
        L_0x064c:
            r18.close()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0670 }
            goto L_0x0680
        L_0x0650:
            r1 = move-exception
            if (r5 == 0) goto L_0x065b
            r5.close()     // Catch:{ all -> 0x0657 }
            goto L_0x065b
        L_0x0657:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x065c }
        L_0x065b:
            throw r1     // Catch:{ all -> 0x065c }
        L_0x065c:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0661 }
            goto L_0x0665
        L_0x0661:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0666 }
        L_0x0665:
            throw r1     // Catch:{ all -> 0x0666 }
        L_0x0666:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x066b }
            goto L_0x066f
        L_0x066b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0670 }
        L_0x066f:
            throw r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0670 }
        L_0x0670:
            r1 = move-exception
            r0 = 0
            r8.A0L = r0
            X.190 r3 = r7.A00
            java.lang.String r2 = r1.toString()
            r1 = 1
            java.lang.String r0 = "QuotedMessageStore/fillQuotedMessage/failed to load quoted message"
            r3.A0G(r0, r2, r1)
        L_0x0680:
            if (r32 == 0) goto L_0x0691
            java.lang.Class<X.255> r1 = X.AnonymousClass255.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0691:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass255.CCZ(X.206, X.2Rn):void");
    }
}
