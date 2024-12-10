package X;

/* renamed from: X.3CN  reason: invalid class name */
public class AnonymousClass3CN implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public AnonymousClass3CN(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = j;
        this.A05 = obj3;
        this.A06 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05a0, code lost:
        if (r4.compareTo((com.whatsapp.jid.Jid) r3) < 0) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0689, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        X.CDX.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0209, code lost:
        if (r18 >= (X.AnonymousClass11P.A01(r8.A01) - ((long) (X.C18020vd.A00(X.C18040vf.A02, r8.A03, 12106) * 1000)))) goto L_0x020b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0438 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x047d A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x04b7 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04c5 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0537 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0566 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c5 A[Catch:{ all -> 0x06a2, all -> 0x06a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r2 = r30
            int r0 = r2.A00
            if (r0 == 0) goto L_0x003a
            java.lang.Object r7 = r2.A03
            X.1NI r7 = (X.AnonymousClass1NI) r7
            java.lang.Object r6 = r2.A04
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.String r5 = r2.A06
            long r0 = r2.A02
            java.lang.Object r4 = r2.A05
            X.1cn r4 = (X.C29741cn) r4
            int r3 = r2.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.1CJ r1 = r7.A01
            X.1ci r0 = r1.A0A(r6)
            if (r0 != 0) goto L_0x002e
            X.1ci r0 = new X.1ci
            r0.<init>((X.AnonymousClass1BI) r6)
            r0.A0k = r5
            r1.A0K(r0, r6)
        L_0x002e:
            r0.A0k = r5
            r0.A03 = r3
            if (r4 == 0) goto L_0x0036
            r0.A0h = r4
        L_0x0036:
            X.AnonymousClass1NI.A00(r0, r7, r6, r2)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r1 = r2.A03
            X.122 r1 = (X.AnonymousClass122) r1
            java.lang.Object r7 = r2.A04
            X.205 r7 = (X.AnonymousClass205) r7
            int r5 = r2.A01
            long r3 = r2.A02
            java.lang.Object r9 = r2.A05
            X.206 r9 = (X.AnonymousClass206) r9
            java.lang.String r0 = r2.A06
            r29 = r0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.00H r0 = r1.A1E
            X.206 r0 = X.AnonymousClass1W2.A01(r7, r0)
            if (r0 != 0) goto L_0x0093
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/nosuchmessage: "
            r3.append(r0)
            r3.append(r7)
        L_0x0066:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x006d:
            if (r9 == 0) goto L_0x0039
            X.00H r0 = r1.A1B
            java.lang.Object r0 = r0.get()
            X.2iE r0 = (X.C56912iE) r0
            boolean r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            if (r0 != 0) goto L_0x0039
            X.210 r9 = (X.AnonymousClass210) r9
            r0 = r29
            r9.A04 = r0
            X.1QU r0 = r1.A0j
            X.1Cd r0 = r0.A00
            X.1au r2 = r0.A05()
            goto L_0x0655
        L_0x0093:
            boolean r2 = r7.A02
            if (r2 != 0) goto L_0x00b8
            X.11S r2 = r1.A06
            boolean r2 = X.AnonymousClass25A.A0R(r2, r0)
            if (r2 != 0) goto L_0x00b8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/error "
            r2.append(r0)
            X.1BI r0 = r7.A00
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r7.A01
            X.C17890vO.A19(r2, r0)
            goto L_0x006d
        L_0x00b8:
            int r2 = r0.A0D()
            r6 = 4
            boolean r2 = X.C446824j.A02(r2, r6)
            if (r2 == 0) goto L_0x00e4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CoreMessageStore/receivedbyserver/statusdowngrade: "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = " current:"
            r3.append(r2)
            int r0 = r0.A0D()
            r3.append(r0)
            java.lang.String r0 = " new:"
            r3.append(r0)
            r3.append(r6)
            goto L_0x0066
        L_0x00e4:
            X.11S r2 = r1.A06
            boolean r2 = X.AnonymousClass25A.A0T(r2, r0)
            if (r2 == 0) goto L_0x01d4
            r2 = 13
            r0.A0a(r2)
        L_0x00f1:
            r0.A0H = r3
            X.00H r2 = r1.A18
            java.lang.Object r2 = r2.get()
            X.1PW r2 = (X.AnonymousClass1PW) r2
            boolean r2 = r2.A0B(r0)
            r7 = 1
            if (r2 == 0) goto L_0x01d0
            if (r5 != 0) goto L_0x01ce
            X.205 r2 = r0.A0v
            X.1BI r2 = r2.A00
            boolean r2 = X.C22971Dz.A0d(r2)
            if (r2 == 0) goto L_0x01ce
            r2 = 2
            r0.A0A = r2
        L_0x0111:
            X.205 r2 = r0.A0v
            X.1BI r5 = r2.A00
            r28 = r5
            boolean r5 = X.C22971Dz.A0a(r28)
            r10 = 0
            if (r5 == 0) goto L_0x01d9
            boolean r5 = r0 instanceof X.C442522s
            if (r5 != 0) goto L_0x01d9
            X.1Le r5 = r1.A0g
            X.2sx r13 = r5.A07()
            if (r13 == 0) goto L_0x01ca
            long r11 = r13.A03()
            long r5 = r0.A0y
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            r13.A0B(r3)
            r20 = 1
        L_0x0139:
            X.00H r5 = r1.A1K
            java.lang.Object r15 = r5.get()
            X.2lE r15 = (X.C58772lE) r15
            boolean r5 = X.AnonymousClass25A.A0p(r0)
            if (r5 != 0) goto L_0x020b
            X.36j r5 = X.C63672tV.A02(r0)
            if (r5 == 0) goto L_0x01dc
            java.util.Set r5 = r5.A05
            if (r5 == 0) goto L_0x01dc
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 != r7) goto L_0x01dc
            X.00H r5 = r15.A06
            java.lang.Object r5 = r5.get()
            X.1Lc r5 = (X.C24641Lc) r5
            boolean r5 = r5.A03()
            if (r5 == 0) goto L_0x01dc
            X.00H r5 = r15.A07
            java.lang.Object r14 = r5.get()
            X.2fD r14 = (X.C55102fD) r14
            X.36j r5 = X.C63672tV.A02(r0)
            r13 = 0
            if (r5 == 0) goto L_0x01c8
            java.util.Set r6 = r5.A05
        L_0x0178:
            com.whatsapp.jid.UserJid r5 = r0.A0I()
            boolean r5 = X.C22971Dz.A0b(r5)
            if (r5 == 0) goto L_0x01dc
            if (r6 == 0) goto L_0x01dc
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x01dc
            X.1Lc r5 = r14.A03
            boolean r5 = r5.A03()
            if (r5 == 0) goto L_0x01dc
            java.util.Iterator r18 = r6.iterator()
        L_0x0196:
            boolean r5 = r18.hasNext()
            if (r5 == 0) goto L_0x01dc
            X.1BI r6 = X.C17880vN.A0Q(r18)
            X.1PP r5 = r14.A01
            X.205 r12 = r5.A01(r6, r7)
            long r5 = r0.A0I
            r11 = 103(0x67, float:1.44E-43)
            X.24L r8 = new X.24L
            r8.<init>(r12, r11, r5)
            X.1R0 r5 = r14.A02
            r5.A00(r8, r0)
            X.206 r5 = r8.A0K()
            if (r5 == 0) goto L_0x01bd
            X.C63672tV.A03(r5, r13)
        L_0x01bd:
            X.1iW r5 = r14.A00
            r5.A0b(r8)
            X.122 r5 = r5.A0U
            r5.BBM(r8)
            goto L_0x0196
        L_0x01c8:
            r6 = r13
            goto L_0x0178
        L_0x01ca:
            r20 = 0
            goto L_0x0139
        L_0x01ce:
            int r5 = r5 + 1
        L_0x01d0:
            r0.A0A = r5
            goto L_0x0111
        L_0x01d4:
            r0.A0a(r6)
            goto L_0x00f1
        L_0x01d9:
            r20 = 0
            goto L_0x020b
        L_0x01dc:
            X.2ft r8 = r15.A04
            X.COe r5 = r8.A04
            X.0vl r12 = r5.A01
            android.content.SharedPreferences r13 = X.C17880vN.A0C(r12)
            java.lang.String r11 = "status_reminder_alarm_last_timestamp"
            r5 = 0
            long r18 = r13.getLong(r11, r5)
            int r13 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r13 == 0) goto L_0x024b
            X.11P r5 = r8.A01
            long r14 = X.AnonymousClass11P.A01(r5)
            X.0ve r13 = r8.A03
            r6 = 12106(0x2f4a, float:1.6964E-41)
            X.0vf r5 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r5, r13, r6)
            int r5 = r5 * 1000
            long r5 = (long) r5
            long r14 = r14 - r5
            int r5 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x024b
        L_0x020b:
            X.1O2 r5 = r1.A0v
            java.util.Set r13 = r5.A04
            boolean r12 = r13.contains(r2)
            X.1Qw r5 = r1.A0Z
            X.1Qt r5 = X.C26111Qw.A01(r5, r2)
            java.util.Set r11 = r5.A05(r2)
            X.1PT r6 = r1.A0w
            X.2qt r5 = new X.2qt
            r5.<init>(r0)
            r5.A04 = r7
            int r8 = r1.BYx(r0)
            r5.A03 = r8
            X.190 r8 = r1.A04
            X.C22971Dz.A0E(r8, r5, r11)
            r5.A0D = r7
            r5.A0C = r12
            X.C62162qt.A00(r5, r6, r11)
            if (r12 == 0) goto L_0x023d
            r13.remove(r2)
        L_0x023d:
            X.1Q2 r6 = r1.A0O
            r5 = 24
            r6.A01(r0, r5)
            X.1Cd r5 = r1.A0V
            X.1au r19 = r5.A05()
            goto L_0x02b5
        L_0x024b:
            X.11P r5 = r8.A01
            long r5 = X.AnonymousClass11P.A01(r5)
            android.content.SharedPreferences$Editor r13 = X.C17890vO.A0A(r12)
            X.C17880vN.A1D(r13, r11, r5)
            java.lang.String r11 = r2.A01
            if (r11 != 0) goto L_0x025e
            java.lang.String r11 = ""
        L_0x025e:
            android.content.SharedPreferences$Editor r6 = X.C17890vO.A0A(r12)
            java.lang.String r5 = "status_playback_message_id"
            X.C17880vN.A1E(r6, r5, r11)
            java.lang.String r5 = "com.whatsapp.alarm.STATUS_REMINDER_NOTIFICATION"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            java.lang.String r5 = "com.whatsapp"
            android.content.Intent r11 = r6.setPackage(r5)
            java.lang.StringBuilder r6 = X.C17900vP.A0G()
            java.lang.String r5 = "_status_views_reminder"
            java.lang.String r6 = X.AnonymousClass000.A0y(r5, r6)
            java.lang.String r5 = "EXTRA_LOGGING_NOTIFICATION_ID"
            android.content.Intent r6 = r11.putExtra(r5, r6)
            X.C18070vi.A0X(r6)
            X.AnonymousClass4aU.A00(r6, r2)
            X.118 r5 = r8.A02
            android.content.Context r5 = r5.A00
            android.app.PendingIntent r22 = X.C17880vN.A06(r5, r6, r10)
            X.1R8 r11 = r8.A00
            long r24 = android.os.SystemClock.elapsedRealtime()
            X.0ve r8 = r8.A03
            r6 = 12106(0x2f4a, float:1.6964E-41)
            X.0vf r5 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r5, r8, r6)
            int r5 = r5 * 1000
            long r5 = (long) r5
            long r24 = r24 + r5
            r23 = 2
            X.1R9 r5 = r11.A00
            r21 = r5
            r26 = r10
            r21.A02(r22, r23, r24, r26)
            goto L_0x020b
        L_0x02b5:
            X.1xA r18 = r19.BD0()     // Catch:{ all -> 0x06af }
            boolean r5 = X.C22971Dz.A0N(r28)     // Catch:{ all -> 0x06a5 }
            if (r5 == 0) goto L_0x0438
            boolean r5 = X.C22971Dz.A0a(r28)     // Catch:{ all -> 0x06a5 }
            if (r5 != 0) goto L_0x0438
            java.util.List r11 = r0.A0T()     // Catch:{ all -> 0x06a5 }
            if (r11 == 0) goto L_0x0329
            int r6 = r11.size()     // Catch:{ all -> 0x06a5 }
            int r5 = r0.A0A     // Catch:{ all -> 0x06a5 }
            if (r6 < r5) goto L_0x0329
            r5 = 3
            android.content.ContentValues r5 = X.C17880vN.A09(r5)     // Catch:{ all -> 0x06a5 }
            int r6 = r0.A0D()     // Catch:{ all -> 0x06a5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x06a5 }
            java.lang.String r6 = "status"
            r5.put(r6, r8)     // Catch:{ all -> 0x06a5 }
            java.lang.String r8 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x06a5 }
            r5.put(r8, r3)     // Catch:{ all -> 0x06a5 }
            int r4 = r0.A0A     // Catch:{ all -> 0x06a5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "recipient_count"
            r5.put(r4, r8)     // Catch:{ all -> 0x06a5 }
            java.util.ArrayList r11 = X.C17880vN.A10(r11)     // Catch:{ all -> 0x06a5 }
            r4 = r28
            r11.add(r4)     // Catch:{ all -> 0x06a5 }
            int r4 = r11.size()     // Catch:{ all -> 0x06a5 }
            int r4 = r4 + 1
            java.util.ArrayList r8 = X.C17880vN.A0z(r4)     // Catch:{ all -> 0x06a5 }
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x06a5 }
        L_0x0311:
            boolean r4 = r13.hasNext()     // Catch:{ all -> 0x06a5 }
            if (r4 == 0) goto L_0x0386
            X.1BI r11 = X.C17880vN.A0Q(r13)     // Catch:{ all -> 0x06a5 }
            X.1LW r4 = r1.A0C     // Catch:{ all -> 0x06a5 }
            long r11 = r4.A09(r11)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x06a5 }
            r8.add(r4)     // Catch:{ all -> 0x06a5 }
            goto L_0x0311
        L_0x0329:
            java.lang.String r6 = "message-table-scan"
            java.lang.String r5 = "broadcast-ack"
            r8.A0G(r6, r5, r7)     // Catch:{ all -> 0x06a5 }
            java.lang.String r5 = "CoreMessageStore/updateMessageTableForBroadcastAck falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x06a5 }
            X.1N3 r5 = r1.A0P     // Catch:{ all -> 0x06a5 }
            X.1Cd r5 = r5.A03     // Catch:{ all -> 0x06a5 }
            X.1au r12 = r5.A05()     // Catch:{ all -> 0x06a5 }
            android.content.ContentValues r8 = X.C17880vN.A08()     // Catch:{ all -> 0x0698 }
            java.lang.String r6 = "status"
            int r5 = r0.A0D()     // Catch:{ all -> 0x0698 }
            X.C17880vN.A18(r8, r6, r5)     // Catch:{ all -> 0x0698 }
            java.lang.String r5 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0698 }
            r8.put(r5, r3)     // Catch:{ all -> 0x0698 }
            java.lang.String r5 = "recipient_count"
            int r4 = r0.A0A     // Catch:{ all -> 0x0698 }
            X.C17880vN.A18(r8, r5, r4)     // Catch:{ all -> 0x0698 }
            r4 = 3
            java.lang.String[] r11 = new java.lang.String[r4]     // Catch:{ all -> 0x0698 }
            long r4 = r0.A0I     // Catch:{ all -> 0x0698 }
            X.C17880vN.A1V(r11, r10, r4)     // Catch:{ all -> 0x0698 }
            boolean r4 = r2.A02     // Catch:{ all -> 0x0698 }
            X.C17880vN.A1S(r11, r4, r7)     // Catch:{ all -> 0x0698 }
            java.lang.String r5 = r2.A01     // Catch:{ all -> 0x0698 }
            r4 = 2
            r11[r4] = r5     // Catch:{ all -> 0x0698 }
            r4 = r12
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0698 }
            X.1Ev r4 = r4.A02     // Catch:{ all -> 0x0698 }
            java.lang.String r23 = "message"
            java.lang.String r24 = "timestamp = ? AND from_me = ? AND key_id = ?"
            java.lang.String r25 = "UPDATE_RCV_BROADCAST_SERVER_SQL"
            r21 = r4
            r22 = r8
            r26 = r11
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0698 }
            r12.close()     // Catch:{ all -> 0x06a5 }
            goto L_0x03c5
        L_0x0386:
            java.lang.String r4 = r2.A01     // Catch:{ all -> 0x06a5 }
            r8.add(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "chat_row_id IN "
            r12.append(r4)     // Catch:{ all -> 0x06a5 }
            int r4 = r8.size()     // Catch:{ all -> 0x06a5 }
            int r4 = r4 - r7
            java.lang.String r4 = X.AnonymousClass1H2.A00(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.String r11 = X.C17890vO.A0X(r4, r12)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "from_me = 1"
            r12.append(r4)     // Catch:{ all -> 0x06a5 }
            r12.append(r11)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "key_id = ?"
            java.lang.String r24 = X.AnonymousClass000.A0y(r4, r12)     // Catch:{ all -> 0x06a5 }
            r4 = r19
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x06a5 }
            X.1Ev r4 = r4.A02     // Catch:{ all -> 0x06a5 }
            java.lang.String[] r26 = X.C17890vO.A1b(r8, r10)     // Catch:{ all -> 0x06a5 }
            java.lang.String r25 = "updateBroadcastAckInMessageTable/UPDATE_MESSAGE"
            java.lang.String r23 = "message"
            r21 = r4
            r22 = r5
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x06a5 }
        L_0x03c5:
            X.1Qz r4 = r1.A0J     // Catch:{ all -> 0x06a5 }
            X.1Qx r4 = r4.A06     // Catch:{ all -> 0x06a5 }
            X.0yx r8 = r4.A04(r0)     // Catch:{ all -> 0x06a5 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "SELECT _id FROM message"
            r5.append(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.Object r4 = r8.A00     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x06a5 }
            java.lang.String r5 = X.AnonymousClass000.A0y(r4, r5)     // Catch:{ all -> 0x06a5 }
            java.lang.Object r4 = r8.A01     // Catch:{ all -> 0x06a5 }
            X.0yx r8 = new X.0yx     // Catch:{ all -> 0x06a5 }
            r8.<init>(r5, r4)     // Catch:{ all -> 0x06a5 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "UPDATE message_ephemeral SET expire_timestamp=? + ?*(SELECT duration FROM message_ephemeral t2 WHERE message_ephemeral.message_row_id=t2.message_row_id)"
            r5.append(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = " WHERE message_row_id IN ("
            r5.append(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.Object r4 = r8.A00     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x06a5 }
            r5.append(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = ")"
            java.lang.String r5 = X.AnonymousClass000.A0y(r4, r5)     // Catch:{ all -> 0x06a5 }
            java.lang.Object r4 = r8.A01     // Catch:{ all -> 0x06a5 }
            X.0yx r11 = new X.0yx     // Catch:{ all -> 0x06a5 }
            r11.<init>(r5, r4)     // Catch:{ all -> 0x06a5 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x06a5 }
            long r4 = r0.A0H     // Catch:{ all -> 0x06a5 }
            X.C17880vN.A1R(r8, r4)     // Catch:{ all -> 0x06a5 }
            r4 = 1000(0x3e8, double:4.94E-321)
            X.C17880vN.A1R(r8, r4)     // Catch:{ all -> 0x06a5 }
            java.lang.Object r4 = r11.A01     // Catch:{ all -> 0x06a5 }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x06a5 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x06a5 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x06a5 }
            r8.addAll(r4)     // Catch:{ all -> 0x06a5 }
            r4 = r19
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x06a5 }
            X.1Ev r12 = r4.A02     // Catch:{ all -> 0x06a5 }
            java.lang.Object r11 = r11.A00     // Catch:{ all -> 0x06a5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x06a5 }
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ all -> 0x06a5 }
            java.lang.Object[] r5 = r8.toArray(r4)     // Catch:{ all -> 0x06a5 }
            java.lang.String r4 = "UPDATE_TIMESTAMPS_FOR_BROADCAST_MESSAGE_CLONES"
            r12.A0F(r11, r4, r5)     // Catch:{ all -> 0x06a5 }
            goto L_0x047a
        L_0x0438:
            X.1N3 r8 = r1.A0P     // Catch:{ all -> 0x06a5 }
            X.1Cd r5 = r8.A03     // Catch:{ all -> 0x06a5 }
            X.1au r12 = r5.A05()     // Catch:{ all -> 0x06a5 }
            r5 = 3
            android.content.ContentValues r5 = X.C17880vN.A09(r5)     // Catch:{ all -> 0x0698 }
            java.lang.String r6 = "status"
            int r11 = r0.A0D()     // Catch:{ all -> 0x0698 }
            X.C17880vN.A18(r5, r6, r11)     // Catch:{ all -> 0x0698 }
            java.lang.String r11 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0698 }
            r5.put(r11, r3)     // Catch:{ all -> 0x0698 }
            java.lang.String r11 = "recipient_count"
            int r4 = r0.A0A     // Catch:{ all -> 0x0698 }
            X.C17880vN.A18(r5, r11, r4)     // Catch:{ all -> 0x0698 }
            r4 = r12
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0698 }
            X.1Ev r4 = r4.A02     // Catch:{ all -> 0x0698 }
            java.lang.String r23 = "message"
            java.lang.String r24 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String[] r26 = X.AnonymousClass1N3.A02(r8, r2)     // Catch:{ all -> 0x0698 }
            java.lang.String r25 = "UPDATE_RCV_SERVER_SQL"
            r21 = r4
            r22 = r5
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0698 }
            r12.close()     // Catch:{ all -> 0x06a5 }
            r4 = 0
            goto L_0x047b
        L_0x047a:
            r4 = 1
        L_0x047b:
            if (r20 == 0) goto L_0x04af
            X.1Le r11 = r1.A0g     // Catch:{ all -> 0x06a5 }
            X.1Cd r5 = r11.A03     // Catch:{ all -> 0x06a5 }
            X.1au r12 = r5.A05()     // Catch:{ all -> 0x06a5 }
            android.content.ContentValues r5 = X.C17880vN.A09(r7)     // Catch:{ all -> 0x0698 }
            java.lang.String r8 = "timestamp"
            r5.put(r8, r3)     // Catch:{ all -> 0x0698 }
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0698 }
            X.1Ev r8 = r3.A02     // Catch:{ all -> 0x0698 }
            java.lang.String r23 = "jid_row_id=?"
            X.1E5 r3 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0698 }
            java.lang.String[] r25 = X.C24661Le.A04(r11, r3)     // Catch:{ all -> 0x0698 }
            java.lang.String r3 = "updateMyTimestamp/UPDATE"
            java.lang.String r24 = X.C24661Le.A00(r3)     // Catch:{ all -> 0x0698 }
            r20 = r8
            r21 = r5
            r22 = r6
            r20.A02(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0698 }
            r12.close()     // Catch:{ all -> 0x06a5 }
        L_0x04af:
            int r6 = r0.A0u     // Catch:{ all -> 0x06a5 }
            boolean r3 = X.AnonymousClass25A.A0I(r6)     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x04bf
            X.1Nt r5 = r1.A0Q     // Catch:{ all -> 0x06a5 }
            r3 = r0
            X.21V r3 = (X.AnonymousClass21V) r3     // Catch:{ all -> 0x06a5 }
            r5.A06(r3, r7, r10)     // Catch:{ all -> 0x06a5 }
        L_0x04bf:
            boolean r3 = X.C22971Dz.A0N(r28)     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x0533
            X.1Q6 r8 = r1.A0R     // Catch:{ all -> 0x06a5 }
            X.1Q7 r10 = r8.A01     // Catch:{ all -> 0x06a5 }
            monitor-enter(r10)     // Catch:{ all -> 0x06a5 }
            X.00z r3 = r10.A01     // Catch:{ all -> 0x06a2 }
            java.util.LinkedHashMap r3 = r3.A06()     // Catch:{ all -> 0x06a2 }
            java.util.Iterator r5 = X.C17890vO.A0l(r3)     // Catch:{ all -> 0x06a2 }
        L_0x04d4:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x06a2 }
            if (r3 == 0) goto L_0x04e2
            X.206 r3 = X.C17880vN.A0Y(r5)     // Catch:{ all -> 0x06a2 }
            X.AnonymousClass122.A09(r0, r3, r4)     // Catch:{ all -> 0x06a2 }
            goto L_0x04d4
        L_0x04e2:
            java.util.Map r3 = r10.A02     // Catch:{ all -> 0x06a2 }
            java.util.Iterator r5 = X.AnonymousClass000.A15(r3)     // Catch:{ all -> 0x06a2 }
        L_0x04e8:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x06a2 }
            if (r3 == 0) goto L_0x0500
            java.lang.Object r3 = X.C17890vO.A0P(r5)     // Catch:{ all -> 0x06a2 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x06a2 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x06a2 }
            X.206 r3 = (X.AnonymousClass206) r3     // Catch:{ all -> 0x06a2 }
            if (r3 == 0) goto L_0x04e8
            X.AnonymousClass122.A09(r0, r3, r4)     // Catch:{ all -> 0x06a2 }
            goto L_0x04e8
        L_0x0500:
            monitor-exit(r10)     // Catch:{ all -> 0x06a5 }
            java.util.Map r3 = r8.A02     // Catch:{ all -> 0x06a5 }
            java.util.Iterator r5 = X.C17890vO.A0l(r3)     // Catch:{ all -> 0x06a5 }
        L_0x0507:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x0515
            X.206 r3 = X.C17880vN.A0Y(r5)     // Catch:{ all -> 0x06a5 }
            X.AnonymousClass122.A09(r0, r3, r4)     // Catch:{ all -> 0x06a5 }
            goto L_0x0507
        L_0x0515:
            X.1CJ r3 = r8.A00     // Catch:{ all -> 0x06a5 }
            java.util.Collection r3 = r3.A0H()     // Catch:{ all -> 0x06a5 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x06a5 }
        L_0x051f:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x0533
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x06a5 }
            X.1ci r3 = (X.C29691ci) r3     // Catch:{ all -> 0x06a5 }
            X.206 r3 = r3.A0g     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x051f
            X.AnonymousClass122.A09(r0, r3, r4)     // Catch:{ all -> 0x06a5 }
            goto L_0x051f
        L_0x0533:
            r3 = 36
            if (r6 != r3) goto L_0x0566
            r13 = r0
            X.22v r13 = (X.C442822v) r13     // Catch:{ all -> 0x06a5 }
            X.1RR r12 = r1.A0K     // Catch:{ all -> 0x06a5 }
            r11 = 0
            X.C18070vi.A0d(r13, r11)     // Catch:{ all -> 0x06a5 }
            X.1ci r10 = X.AnonymousClass1RR.A01(r12, r13)     // Catch:{ all -> 0x06a5 }
            if (r10 == 0) goto L_0x05a2
            X.0vl r3 = r12.A0G     // Catch:{ all -> 0x06a5 }
            java.lang.Object r14 = r3.getValue()     // Catch:{ all -> 0x06a5 }
            X.1Qy r14 = (X.C26131Qy) r14     // Catch:{ all -> 0x06a5 }
            X.1cl r3 = r10.A0e     // Catch:{ all -> 0x06a5 }
            X.C18070vi.A0W(r3)     // Catch:{ all -> 0x06a5 }
            X.205 r8 = r13.A0v     // Catch:{ all -> 0x06a5 }
            boolean r4 = r8.A02     // Catch:{ all -> 0x06a5 }
            if (r4 == 0) goto L_0x05a2
            long r5 = r13.A0H     // Catch:{ all -> 0x06a5 }
            long r3 = r3.ephemeralSettingTimestamp     // Catch:{ all -> 0x06a5 }
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 > 0) goto L_0x05a6
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 != 0) goto L_0x05a2
            goto L_0x058e
        L_0x0566:
            int r3 = r0.A05     // Catch:{ all -> 0x06a5 }
            if (r3 <= 0) goto L_0x05a2
            X.1Qz r10 = r1.A0J     // Catch:{ all -> 0x06a5 }
            boolean r3 = r2.A02     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x05a2
            X.1Cd r3 = r10.A04     // Catch:{ all -> 0x06a5 }
            X.1au r8 = r3.A05()     // Catch:{ all -> 0x06a5 }
            long r5 = r0.A0H     // Catch:{ all -> 0x0687 }
            int r3 = r0.A05     // Catch:{ all -> 0x0687 }
            long r3 = X.C17890vO.A03(r3)     // Catch:{ all -> 0x0687 }
            java.lang.Long r3 = X.C17880vN.A0o(r5, r3)     // Catch:{ all -> 0x0687 }
            r0.A0U = r3     // Catch:{ all -> 0x0687 }
            X.C18070vi.A0b(r8)     // Catch:{ all -> 0x0687 }
            X.C26141Qz.A00(r10, r8, r0)     // Catch:{ all -> 0x0687 }
            r8.close()     // Catch:{ all -> 0x06a5 }
            goto L_0x05a2
        L_0x058e:
            X.1BI r4 = r8.A00     // Catch:{ all -> 0x06a5 }
            if (r4 == 0) goto L_0x0693
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x06a5 }
            X.11S r3 = r14.A00     // Catch:{ all -> 0x06a5 }
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r3)     // Catch:{ all -> 0x06a5 }
            if (r3 == 0) goto L_0x05a6
            int r3 = r4.compareTo((com.whatsapp.jid.Jid) r3)     // Catch:{ all -> 0x06a5 }
            if (r3 >= 0) goto L_0x05a6
        L_0x05a2:
            r18.A00()     // Catch:{ all -> 0x06a5 }
            goto L_0x05cc
        L_0x05a6:
            X.1cl r3 = r10.A0e     // Catch:{ all -> 0x06a5 }
            int r3 = r3.expiration     // Catch:{ all -> 0x06a5 }
            int r8 = r13.A00     // Catch:{ all -> 0x06a5 }
            if (r3 == r8) goto L_0x05b4
            long r3 = r0.A0H     // Catch:{ all -> 0x06a5 }
            X.AnonymousClass122.A0C(r1, r0, r3)     // Catch:{ all -> 0x06a5 }
            goto L_0x05a2
        L_0x05b4:
            long r3 = r13.A0H     // Catch:{ all -> 0x06a5 }
            int r6 = r13.A04     // Catch:{ all -> 0x06a5 }
            java.lang.Boolean r5 = r13.A0Q     // Catch:{ all -> 0x06a5 }
            r20 = r10
            r21 = r12
            r22 = r5
            r23 = r8
            r24 = r11
            r25 = r6
            r26 = r3
            X.AnonymousClass1RR.A02(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x06a5 }
            goto L_0x05a2
        L_0x05cc:
            r18.close()     // Catch:{ all -> 0x06af }
            r19.close()
            X.AW0 r3 = X.AnonymousClass25B.A00(r0)
            if (r3 == 0) goto L_0x0624
            X.AW0 r3 = X.AnonymousClass25B.A00(r0)
            X.8pG r3 = r3.A0A
            if (r3 == 0) goto L_0x0624
            X.AW0 r3 = X.AnonymousClass25B.A00(r0)
            X.8pG r3 = r3.A0A
            java.lang.String r3 = r3.A0F()
            if (r3 == 0) goto L_0x0624
            X.1KH r4 = r1.A0o
            X.AW0 r3 = X.AnonymousClass25B.A00(r0)
            X.8pG r3 = r3.A0A
            java.lang.String r12 = r3.A0F()
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            r11 = 0
            if (r3 != 0) goto L_0x0624
            X.2Di r3 = r4.A00
            X.1au r10 = r3.A06()
            r3 = r10
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x068e }
            X.1Ev r8 = r3.A02     // Catch:{ all -> 0x068e }
            java.lang.String r6 = "tmp_transactions"
            java.lang.String r5 = "tmp_id=?"
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ all -> 0x068e }
            r4[r11] = r12     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "removePaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP"
            int r3 = r8.A04(r6, r5, r3, r4)     // Catch:{ all -> 0x068e }
            if (r3 == r7) goto L_0x0621
            java.lang.String r3 = "PAY: PaymentStore removePaymentTransactionTmpInfo could not delete"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x068e }
        L_0x0621:
            r10.close()
        L_0x0624:
            boolean r3 = X.C22971Dz.A0a(r28)
            if (r3 == 0) goto L_0x0646
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x0646
            boolean r2 = X.AnonymousClass25A.A0p(r0)
            if (r2 == 0) goto L_0x0646
            r3 = 4
            int r2 = r0.A0D()
            boolean r2 = X.C446824j.A02(r2, r3)
            if (r2 == 0) goto L_0x0646
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0U(r0)
        L_0x0646:
            X.1LY r4 = r1.A0H
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r16
            java.lang.String r0 = "CoreMessageStore/updateMessageReceivedByServerInBackground"
            r4.A01(r0, r2)
            goto L_0x006d
        L_0x0655:
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x0682 }
            java.lang.String r1 = r9.A04     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = "counter_abuse_token"
            if (r1 == 0) goto L_0x067a
            r4.put(r0, r1)     // Catch:{ all -> 0x0682 }
        L_0x0662:
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0682 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0682 }
            java.lang.String r5 = "message_text"
            java.lang.String r6 = "message_row_id = ?"
            java.lang.String[] r8 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0682 }
            long r0 = r9.A0x     // Catch:{ all -> 0x0682 }
            X.C17890vO.A1J(r8, r0)     // Catch:{ all -> 0x0682 }
            java.lang.String r7 = "UPDATE_CONTENT_BINDING_SQL"
            r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0682 }
            goto L_0x067e
        L_0x067a:
            r4.putNull(r0)     // Catch:{ all -> 0x0682 }
            goto L_0x0662
        L_0x067e:
            r2.close()
            return
        L_0x0682:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x06b4 }
            throw r1
        L_0x0687:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0689 }
        L_0x0689:
            r1 = move-exception
            X.CDX.A00(r8, r0)     // Catch:{ all -> 0x06a5 }
            goto L_0x06a4
        L_0x068e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x06b4 }
            throw r1
        L_0x0693:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()     // Catch:{ all -> 0x06a5 }
            goto L_0x06a4
        L_0x0698:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x069d }
            goto L_0x06a4
        L_0x069d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x06a5 }
            goto L_0x06a4
        L_0x06a2:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x06a5 }
        L_0x06a4:
            throw r1     // Catch:{ all -> 0x06a5 }
        L_0x06a5:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x06aa }
            goto L_0x06ae
        L_0x06aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x06af }
        L_0x06ae:
            throw r1     // Catch:{ all -> 0x06af }
        L_0x06af:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x06b4 }
            throw r1
        L_0x06b4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CN.run():void");
    }
}
