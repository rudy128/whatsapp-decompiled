package X;

/* renamed from: X.38v  reason: invalid class name and case insensitive filesystem */
public final class C698638v implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public C698638v(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r11) {
        /*
            r10 = this;
            r7 = 0
            X.C18070vi.A0d(r11, r7)
            X.00H r0 = r10.A00
            java.lang.Object r1 = r0.get()
            X.2Zd r1 = (X.C51662Zd) r1
            boolean r0 = r11 instanceof X.AnonymousClass24B
            if (r0 == 0) goto L_0x009e
            X.1Cd r0 = r1.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0097 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "SELECT bot_feedback_kind, bot_feedback_text, bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id, bot_feedback_kind_negative, bot_feedback_kind_positive FROM message_bot_feedback WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x0097 }
            X.24B r11 = (X.AnonymousClass24B) r11     // Catch:{ all -> 0x0097 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0097 }
            X.C17880vN.A1V(r3, r7, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "GET_MESSAGE_BOT_FEEDBACK"
            android.database.Cursor r3 = r6.A0A(r4, r0, r3)     // Catch:{ all -> 0x0097 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0090 }
            r9 = 0
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "bot_feedback_kind"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "bot_feedback_text"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "bot_feedback_key_remote_jid"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "bot_feedback_key_from_me"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "bot_feedback_key_id"
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x0090 }
            X.9Ka r0 = X.C179819Ka.A00(r0)     // Catch:{ all -> 0x0090 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0090 }
            r11.A01 = r0     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x006b
            int r0 = r1.length()     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r1 = r9
        L_0x006c:
            r11.A04 = r1     // Catch:{ all -> 0x0090 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x0090 }
            X.1BI r1 = X.C22931Dv.A01(r0)     // Catch:{ all -> 0x0090 }
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x0090 }
            if (r0 == r5) goto L_0x007f
            r5 = 0
        L_0x007f:
            java.lang.String r0 = r3.getString(r4)     // Catch:{ all -> 0x0090 }
            X.205 r0 = X.AnonymousClass205.A01(r1, r0, r5)     // Catch:{ all -> 0x0090 }
            r11.A03 = r0     // Catch:{ all -> 0x0090 }
        L_0x0089:
            r3.close()     // Catch:{ all -> 0x0097 }
            r2.close()
            return
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698638v.BL9(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdY(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.00H r0 = r6.A00
            java.lang.Object r1 = r0.get()
            X.2Zd r1 = (X.C51662Zd) r1
            boolean r0 = r7 instanceof X.AnonymousClass24B
            if (r0 == 0) goto L_0x008d
            X.24B r7 = (X.AnonymousClass24B) r7
            X.205 r2 = r7.A03
            if (r2 == 0) goto L_0x0084
            X.1BI r0 = r2.A00
            if (r0 == 0) goto L_0x0084
            X.1Cd r0 = r1.A00
            X.1au r5 = r0.A05()
            r0 = 8
            android.content.ContentValues r4 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x007d }
            X.AnonymousClass206.A04(r4, r7)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "bot_feedback_kind"
            X.9Ka r0 = r7.A01     // Catch:{ all -> 0x007d }
            int r0 = r0.value     // Catch:{ all -> 0x007d }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "bot_feedback_text"
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = ""
        L_0x003a:
            r4.put(r1, r0)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "bot_feedback_key_remote_jid"
            X.1BI r0 = r2.A00     // Catch:{ all -> 0x007d }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x007d }
            r4.put(r1, r0)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "bot_feedback_key_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x007d }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "bot_feedback_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x007d }
            r4.put(r1, r0)     // Catch:{ all -> 0x007d }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x007d }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "message_bot_feedback"
            java.lang.String r1 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x007d }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage/insert error, rowId="
            X.AnonymousClass206.A06(r7, r0, r1)     // Catch:{ all -> 0x007d }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x007d }
        L_0x0079:
            r5.close()
            return
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotFeedbackMessageStore/insertOrUpdateBotFeedbackMessage feedbackMsgKey is "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698638v.BdY(X.206):void");
    }

    public void CQL(AnonymousClass206 r1) {
    }
}
