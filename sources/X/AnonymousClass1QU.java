package X;

/* renamed from: X.1QU  reason: invalid class name */
public class AnonymousClass1QU {
    public final AnonymousClass1Cd A00;
    public final C25331Nu A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r15.A04 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1QU r14, X.AnonymousClass210 r15, boolean r16) {
        /*
            java.lang.String r0 = r15.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.TextData r0 = r15.A02
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A01
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r15.A04
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            java.lang.String r10 = "message_text"
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0107
            X.1Cd r0 = r14.A00
            X.1au r6 = r0.A05()
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0126 }
            r9.<init>()     // Catch:{ all -> 0x0126 }
            long r0 = r15.A0x     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r0 = "message_row_id"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r0 = r15.A05     // Catch:{ SQLiteConstraintException -> 0x00ec }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r1 = "description"
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = r15.A05     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
        L_0x0055:
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00ec }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r1 = "page_title"
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
        L_0x0064:
            java.lang.String r0 = r15.A07     // Catch:{ SQLiteConstraintException -> 0x00ec }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r1 = "url"
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = r15.A07     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
        L_0x0074:
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r3 = "background_color"
            java.lang.String r4 = "text_color"
            java.lang.String r1 = "font_style"
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.fontStyle     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00ec }
            int r0 = r0.textColor     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r4, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00ec }
            int r0 = r0.backgroundColor     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r3, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
        L_0x009e:
            int r0 = r15.A01     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r0 = "preview_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            int r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r0 = "invite_link_group_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r0 = r15.A04     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ SQLiteConstraintException -> 0x00ec }
            X.1Ev r1 = r0.A02     // Catch:{ SQLiteConstraintException -> 0x00ec }
            java.lang.String r0 = "INSERT_MESSAGE_TEXT_SQL"
            long r4 = r1.A06(r10, r0, r9)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            long r0 = r15.A0x     // Catch:{ SQLiteConstraintException -> 0x00ec }
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r3 != 0) goto L_0x00e6
            goto L_0x00e5
        L_0x00ce:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.putNull(r4)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            r9.putNull(r3)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            goto L_0x009e
        L_0x00d8:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            goto L_0x0074
        L_0x00dc:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            goto L_0x0064
        L_0x00e0:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            goto L_0x0055
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateTextMessage/inserted row should has same row_id"
            X.C17960vV.A0H(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00ec }
            goto L_0x0130
        L_0x00ec:
            r3 = move-exception
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0126 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0126 }
            java.lang.String r11 = "message_row_id = ?"
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x0126 }
            long r0 = r15.A0x     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0126 }
            r13[r7] = r0     // Catch:{ all -> 0x0126 }
            java.lang.String r12 = "UPDATE_MESSAGE_TEXT_SQL"
            int r0 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0126 }
            if (r0 == r2) goto L_0x0130
            throw r3     // Catch:{ all -> 0x0126 }
        L_0x0107:
            if (r16 == 0) goto L_0x0133
            X.1Cd r0 = r14.A00
            X.1au r6 = r0.A05()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0126 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0126 }
            long r0 = r15.A0x     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0126 }
            r2[r7] = r0     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "DELETE_MESSAGE_TEXT_SQL"
            r4.A04(r10, r3, r0, r2)     // Catch:{ all -> 0x0126 }
            goto L_0x0130
        L_0x0126:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x012b }
            throw r1
        L_0x012b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0130:
            r6.close()
        L_0x0133:
            byte[] r1 = r15.A1A()
            if (r1 == 0) goto L_0x0142
            int r0 = r1.length
            if (r0 == 0) goto L_0x0142
            X.1Nu r0 = r14.A01
            r0.A03(r15, r1)
        L_0x0141:
            return
        L_0x0142:
            if (r16 == 0) goto L_0x0141
            X.1Nu r0 = r14.A01
            r0.A02(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QU.A00(X.1QU, X.210, boolean):void");
    }

    public static void A01(AnonymousClass210 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A0x > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TextMessageStore/isValidMessage/message must have row_id set; key=");
        AnonymousClass205 r2 = r8.A0v;
        sb.append(r2);
        C17960vV.A0G(z2, sb.toString());
        if (r8.A0E() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextMessageStore/isValidMessage/message in main storage; key=");
        sb2.append(r2);
        C17960vV.A0G(z, sb2.toString());
    }

    public AnonymousClass1QU(AnonymousClass1Cd r1, C25331Nu r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
