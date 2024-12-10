package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1RR  reason: invalid class name */
public final class AnonymousClass1RR {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18100vl A0B = new C18110vm(new C71023Dm(this, 28));
    public final C18100vl A0C = new C18110vm(new C71023Dm(this, 29));
    public final C18100vl A0D = new C18110vm(new C71023Dm(this, 31));
    public final C18100vl A0E = new C18110vm(new C71023Dm(this, 26));
    public final C18100vl A0F = new C18110vm(new C71023Dm(this, 27));
    public final C18100vl A0G = new C18110vm(new C71023Dm(this, 35));
    public final C18100vl A0H = new C18110vm(new C71023Dm(this, 34));
    public final C18100vl A0I = new C18110vm(new C71023Dm(this, 30));
    public final C18100vl A0J = new C18110vm(new C71023Dm(this, 32));
    public final C18100vl A0K = new C18110vm(new C71023Dm(this, 33));
    public final C18100vl A0L = new C18110vm(new C71023Dm(this, 25));

    public AnonymousClass1RR(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r10, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r12, 10);
        C18070vi.A0d(r13, 11);
        this.A0A = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A07 = r6;
        this.A02 = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A06 = r10;
        this.A05 = r11;
        this.A03 = r12;
        this.A04 = r13;
    }

    public final C29691ci A03(C442622t r12) {
        C29691ci A012 = A01(this, r12);
        if (A012 == null) {
            Log.e("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/no chat");
            return null;
        }
        int i = 0;
        if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A0B.getValue(), 4131)) {
            int i2 = r12.A00;
            if (i2 == 1) {
                i = 2;
            } else if (i2 == 2) {
                i = 1;
            }
            Log.i("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/flip initiator");
        }
        int i3 = r12.A00;
        long j = r12.A01;
        A02(A012, this, r12.A0Q, i3, i, r12.A04, j);
        StringBuilder sb = new StringBuilder();
        sb.append("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/update ephemeral info ");
        sb.append(A012.A0e);
        Log.i(sb.toString());
        return A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A04(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r8 = 0
            X.0vl r0 = r9.A0C
            java.lang.Object r1 = r0.getValue()
            X.1LW r1 = (X.AnonymousClass1LW) r1
            X.205 r0 = r10.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x0069
            long r6 = r1.A09(r0)
            X.0vl r0 = r9.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0062 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "SELECT setting_duration FROM message_ephemeral_setting INNER JOIN message ON message_ephemeral_setting.message_row_id=message._id WHERE chat_row_id == ? AND sort_id < ? ORDER BY sort_id DESC LIMIT 1"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0062 }
            r2[r8] = r0     // Catch:{ all -> 0x0062 }
            long r0 = r10.A0y     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0062 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_BEFORE_MESSAGE"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x0062 }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "setting_duration"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005b }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x005b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005b }
        L_0x0054:
            r2.close()     // Catch:{ all -> 0x0062 }
            r3.close()
            return r0
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0069:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RR.A04(X.206):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.AnonymousClass1RR r5, long r6) {
        /*
            X.0vl r0 = r5.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0049 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0049 }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_DURATION"
            android.database.Cursor r2 = r5.A0A(r3, r0, r2)     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "setting_duration"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0042 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0042 }
            r2.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r0
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r1
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RR.A00(X.1RR, long):int");
    }

    public static final C29691ci A01(AnonymousClass1RR r3, AnonymousClass206 r4) {
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(r4.A0v.A00);
        if (A012 == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        C29691ci A002 = AnonymousClass1CJ.A00((AnonymousClass1CJ) r3.A0D.getValue(), A012);
        if (A002 != null) {
            return A002;
        }
        Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r2 <= r2) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C29691ci r20, X.C442822v r21) {
        /*
            r19 = this;
            r7 = r20
            r11 = 0
            r8 = r19
            r4 = r21
            if (r20 != 0) goto L_0x0010
            X.1ci r7 = A01(r8, r4)
            if (r7 != 0) goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            X.1cl r14 = r7.A0e
            X.C18070vi.A0X(r14)
            X.0vl r6 = r8.A0G
            r6.getValue()
            int r1 = r4.A00
            int r0 = r14.expiration
            if (r1 != r0) goto L_0x0038
            long r2 = r4.A0I
            long r0 = r14.ephemeralSettingTimestamp
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0038
            int r0 = (r2 > r2 ? 1 : (r2 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0038
        L_0x002c:
            int r10 = r4.A00
            long r13 = r4.A0I
            int r12 = r4.A04
            java.lang.Boolean r9 = r4.A0Q
            A02(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0038:
            int r1 = r4.A0E()
            r0 = 1
            if (r1 != r0) goto L_0x000f
            java.lang.Object r12 = r6.getValue()
            X.1Qy r12 = (X.C26131Qy) r12
            X.205 r0 = r4.A0v
            X.1BI r13 = r0.A00
            long r0 = r4.A0I
            int r2 = r4.A00
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r17 = r0
            r16 = r2
            boolean r0 = X.C26131Qy.A00(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x000f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RR.A05(X.1ci, X.22v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.Boolean r7, int r8, int r9, int r10, long r11) {
        /*
            r6 = this;
            X.0vl r0 = r6.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1au r4 = r0.A05()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0061 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "setting_duration"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0061 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "setting_reason"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0061 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0061 }
            X.0vl r0 = r6.A0B     // Catch:{ all -> 0x0061 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0061 }
            X.0ve r2 = (X.C18030ve) r2     // Catch:{ all -> 0x0061 }
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0061 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = "ephemeral_trigger"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0061 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0050
            java.lang.String r0 = "ephemeral_initiated_by_me"
            r5.put(r0, r7)     // Catch:{ all -> 0x0061 }
        L_0x0050:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0061 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "message_ephemeral_setting"
            java.lang.String r1 = "INSERT_EPHEMERAL_SETTING_DURATION"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x0061 }
            r4.close()
            return
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RR.A06(java.lang.Boolean, int, int, int, long):void");
    }

    public static final void A02(C29691ci r5, AnonymousClass1RR r6, Boolean bool, int i, int i2, int i3, long j) {
        ContentValues contentValues;
        r5.A0E(i, j, i2);
        AnonymousClass1LW r4 = (AnonymousClass1LW) r6.A0C.getValue();
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("ephemeral_expiration", Integer.valueOf(r5.A0e.expiration));
            contentValues.put("ephemeral_setting_timestamp", Long.valueOf(r5.A0e.ephemeralSettingTimestamp));
            contentValues.put("ephemeral_disappearing_messages_initiator", Integer.valueOf(r5.A0e.disappearingMessagesInitiator));
        }
        r4.A05(contentValues, r5);
        if (C18020vd.A05(C18040vf.A02, (C18020vd) r6.A0B.getValue(), 5309) && r5.A0L(bool, i3)) {
            ((C57182if) r6.A0F.getValue()).A00(r5);
        }
    }
}
