package X;

/* renamed from: X.2rG  reason: invalid class name and case insensitive filesystem */
public final class C62352rG {
    public final AnonymousClass1P3 A00;
    public final AnonymousClass1N5 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11S A05;
    public final C25001Mm A06;
    public final C32331h1 A07;
    public final C32321h0 A08;
    public final C54822el A09;
    public final C26111Qw A0A;
    public final C33231iU A0B;
    public final AnonymousClass1N9 A0C;
    public final C25011Mn A0D;
    public final AnonymousClass1N7 A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public final C26981Ug A01(AnonymousClass3M9 r10, long j) {
        C18070vi.A0d(r10, 0);
        C26981Ug r5 = new C26981Ug();
        C17880vN.A0L(this.A0F).A02(new AnonymousClass3C8(this, r10, r5, 11, j), 13);
        return r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0190 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass3M9 r33, long r34) {
        /*
            r32 = this;
            r1 = 0
            r31 = r33
            r0 = r31
            X.C18070vi.A0d(r0, r1)
            com.whatsapp.jid.Jid r24 = r31.CES()
            r6 = r32
            X.00H r0 = r6.A0F
            X.1gM r0 = X.C17880vN.A0L(r0)
            r0.A00()
            X.2nR r5 = r31.CNb()
            X.1N7 r3 = r6.A0E
            if (r5 == 0) goto L_0x033f
            long r1 = r5.A00
        L_0x0021:
            r0 = 1
            X.2tQ r4 = X.AnonymousClass1N7.A00(r3, r0, r1)
            X.8vK r4 = (X.C173588vK) r4
            r0 = 3
            if (r4 == 0) goto L_0x002e
            r4.A05(r0)
        L_0x002e:
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            java.util.HashSet r22 = X.C17880vN.A12()
            java.util.ArrayList r21 = X.AnonymousClass000.A13()
            java.util.HashSet r20 = X.C17880vN.A12()
            java.util.HashMap r19 = X.C17880vN.A11()
            r18 = 0
            if (r5 == 0) goto L_0x004a
            com.whatsapp.jid.UserJid r0 = r5.A03
            r18 = r0
        L_0x004a:
            r1 = 0
            X.1Ez r17 = new X.1Ez
            r0 = r17
            r0.<init>((boolean) r1)
            r17.A04()
            int r3 = r31.size()
            if (r4 == 0) goto L_0x005e
            long r0 = (long) r3
            r4.A02 = r0
        L_0x005e:
            r2 = 0
        L_0x005f:
            r9 = 1
            if (r2 >= r3) goto L_0x009d
            long r7 = r17.A01()
            int r0 = (r7 > r34 ? 1 : (r7 == r34 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            if (r4 == 0) goto L_0x006f
            long r0 = (long) r2
            r4.A01 = r0
        L_0x006f:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageStatusUpdateHelper/onMessageStatusUpdate: processed "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " items in "
            r5.append(r0)
            long r0 = r17.A01()
            r5.append(r0)
            java.lang.String r0 = " msec.  Requeuing "
            r5.append(r0)
            int r0 = r3 - r2
            r5.append(r0)
            java.lang.String r0 = " items."
            X.C17890vO.A1B(r5, r0)
            X.1Mm r1 = r6.A06
            r0 = r31
            r0.CGx(r1, r2)
        L_0x009d:
            if (r2 < r3) goto L_0x00a4
            if (r4 == 0) goto L_0x00a4
            long r0 = (long) r3
            r4.A01 = r0
        L_0x00a4:
            boolean r0 = X.C17880vN.A1X(r23)
            if (r0 == 0) goto L_0x00b1
            X.1h1 r1 = r6.A07
            r0 = r23
            r1.A02(r0)
        L_0x00b1:
            boolean r0 = X.C17880vN.A1X(r22)
            if (r0 == 0) goto L_0x0348
            X.1iU r7 = r6.A0B
            X.1WM r2 = r7.A0A
            r1 = r22
            r0 = r19
            r2.A0K(r0, r1)
            java.util.Iterator r5 = X.C17890vO.A0i(r19)
        L_0x00c6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0343
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            X.1gx r4 = r7.A0F
            java.lang.Object r3 = r0.getKey()
            android.os.Handler r2 = r4.A03()
            r1 = 9
            X.3Bz r0 = new X.3Bz
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            goto L_0x00c6
        L_0x00e5:
            r0 = r31
            com.whatsapp.jid.DeviceJid r1 = r0.CBI(r2)
            long r15 = r0.CP8(r2)
            X.205 r8 = r0.BhG(r2)
            X.1BI r7 = r8.A00
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 != 0) goto L_0x0117
            boolean r0 = X.C22971Dz.A0a(r7)
            if (r0 != 0) goto L_0x0117
            boolean r0 = X.C22971Dz.A0N(r7)
            if (r0 != 0) goto L_0x0117
            boolean r0 = X.C22971Dz.A0V(r7)
            if (r0 != 0) goto L_0x0117
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0339
            boolean r0 = X.C22971Dz.A0O(r24)
            if (r0 == 0) goto L_0x0339
        L_0x0117:
            int r0 = r31.COT()
            if (r1 == 0) goto L_0x0133
            com.whatsapp.jid.UserJid r7 = r1.userJid
            boolean r7 = X.C42701yb.A01(r7)
            if (r7 == 0) goto L_0x0133
            boolean r7 = X.C22971Dz.A0d(r18)
            if (r7 == 0) goto L_0x0133
            java.lang.String r8 = r8.A01
            r7 = r18
            X.205 r8 = X.AnonymousClass205.A01(r7, r8, r9)
        L_0x0133:
            X.00H r7 = r6.A03
            java.lang.Object r7 = r7.get()
            X.2ip r7 = (X.C57282ip) r7
            X.206 r7 = r7.A00(r8, r9)
            if (r7 != 0) goto L_0x023c
            X.00H r7 = r6.A02
            X.1W6 r7 = X.C17880vN.A0c(r7)
            X.1BI r11 = r8.A00
            java.lang.String r14 = r8.A01
            r10 = 0
            X.205 r10 = X.AnonymousClass205.A01(r11, r14, r10)
            X.1W2 r7 = r7.A01
            X.206 r7 = r7.A05(r10)
            if (r7 != 0) goto L_0x023c
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r7 = "MessageStatusUpdateHelper/updatetargetstatus/nosuchmessage: "
            X.C17900vP.A0Z(r8, r7, r10)
            boolean r7 = X.C446824j.A01(r0)
            if (r7 == 0) goto L_0x018c
            X.1h0 r10 = r6.A08
            X.C17960vV.A07(r1)
            X.2mT r7 = new X.2mT
            r25 = r7
            r26 = r1
            r27 = r18
            r28 = r0
            r29 = r15
            r25.<init>(r26, r27, r28, r29)
            long r0 = r7.A01
            r15 = 0
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x0194
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r7 = "orphanedreceiptstore/addorphanedreceiptsformessage/invalid timestamp: "
            X.C17900vP.A0l(r7, r8, r0)
        L_0x018c:
            if (r4 == 0) goto L_0x0190
            r4.A05 = r9
        L_0x0190:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0194:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r12 = "orphanedreceiptstore/addorphanedreceiptsformessage key:"
            r13.append(r12)
            r13.append(r8)
            java.lang.String r12 = ";receipt:"
            X.C17900vP.A0Y(r7, r12, r13)
            r12 = 6
            android.content.ContentValues r13 = X.C17880vN.A09(r12)
            X.1LW r12 = r10.A01
            X.C17960vV.A07(r11)
            long r11 = r12.A09(r11)
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "chat_row_id"
            r13.put(r11, r12)
            java.lang.String r11 = "key_id"
            r13.put(r11, r14)
            boolean r11 = r8.A02
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "from_me"
            r13.put(r11, r12)
            X.1DL r14 = r10.A02
            com.whatsapp.jid.DeviceJid r12 = r7.A02
            java.lang.Long r15 = X.AnonymousClass1DL.A04(r14, r12)
            java.lang.String r11 = "receipt_device_jid_row_id"
            r13.put(r11, r15)
            com.whatsapp.jid.UserJid r11 = r7.A03
            if (r11 == 0) goto L_0x01e6
            java.lang.Long r15 = X.AnonymousClass1DL.A04(r14, r11)
            java.lang.String r14 = "receipt_recipient_jid_row_id"
            r13.put(r14, r15)
        L_0x01e6:
            int r15 = r7.A00
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            java.lang.String r7 = "status"
            r13.put(r7, r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r13.put(r0, r1)
            X.1Cd r0 = r10.A03     // Catch:{ SQLiteConstraintException -> 0x021d }
            X.1au r10 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x021d }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0213 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = "receipt_orphaned"
            java.lang.String r0 = "addOrphanedReceiptsForMessage/INSERT_RECEIPT_ORPHANED"
            r7.A06(r1, r0, r13)     // Catch:{ all -> 0x0213 }
            r10.close()     // Catch:{ SQLiteConstraintException -> 0x021d }
            goto L_0x018c
        L_0x0213:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0218 }
            goto L_0x021c
        L_0x0218:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x021d }
        L_0x021c:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x021d }
        L_0x021d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "orphanedreceiptstore/addorphanedreceiptsformessage/failed "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r12)
            r1.append(r0)
            r1.append(r11)
            X.C17900vP.A0i(r0, r1, r15)
            goto L_0x018c
        L_0x023c:
            if (r18 == 0) goto L_0x026d
            boolean r9 = X.C22971Dz.A0f(r7)
            if (r9 == 0) goto L_0x026d
            X.1BI r10 = r7.A0H()
            r9 = r18
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x026d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageStatusUpdateHelper/onMessageStatusUpdate: invalid message update. StanzaKey="
            X.C17900vP.A0X(r5, r0, r1)
            X.190 r8 = r6.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StanzaKey="
            java.lang.String r7 = X.AnonymousClass001.A1E(r5, r0, r1)
            java.lang.String r1 = "invalid_message_status_update"
            r0 = 0
            r8.A0G(r1, r7, r0)
            goto L_0x0190
        L_0x026d:
            boolean r9 = r7.A0w()
            if (r9 != 0) goto L_0x031e
            boolean r9 = r7 instanceof X.AnonymousClass212
            if (r9 == 0) goto L_0x02dd
            r8 = 5
            if (r0 == r8) goto L_0x02d0
            r8 = 15
            if (r0 == r8) goto L_0x02d0
            r9 = 17
            if (r0 != r9) goto L_0x0190
            r10 = r7
            X.212 r10 = (X.AnonymousClass212) r10
            X.205 r1 = r10.A0v
            X.C18070vi.A0W(r1)
            r0 = r22
            r0.add(r1)
            X.1BI r8 = r1.A00
            r0 = r19
            java.lang.Object r11 = r0.get(r8)
            java.lang.Number r11 = (java.lang.Number) r11
            if (r11 == 0) goto L_0x02a5
            long r13 = r11.longValue()
            long r0 = r7.A0x
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x02ab
        L_0x02a5:
            long r0 = r7.A0x
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x02ab:
            int r0 = r10.A0u
            java.util.List r1 = X.C63792th.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0190
            X.205 r1 = r10.A18()
            int r0 = r7.A0D()
            if (r0 == r9) goto L_0x0190
            if (r1 == 0) goto L_0x0190
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0190
            r0 = r19
            r0.put(r8, r11)
            goto L_0x0190
        L_0x02d0:
            X.1ya r13 = r31.CDV()
            r10 = r6
            r11 = r1
            r12 = r7
            r14 = r0
            r10.A00(r11, r12, r13, r14, r15)
            goto L_0x0190
        L_0x02dd:
            r9 = 17
            if (r0 != r9) goto L_0x0303
            X.205 r9 = r7.A0v
            X.1BI r9 = r9.A00
            boolean r9 = X.C22971Dz.A0Z(r9)
            if (r9 != 0) goto L_0x031e
            X.1BI r9 = r7.A0H()
            boolean r9 = X.C42701yb.A01(r9)
            if (r9 != 0) goto L_0x031e
            X.1N5 r9 = r6.A01
            boolean r9 = r9.A06(r7)
            if (r9 == 0) goto L_0x031e
            r1 = r21
            r1.add(r7)
            goto L_0x032c
        L_0x0303:
            r9 = 18
            if (r0 != r9) goto L_0x031e
            X.1ya r13 = r31.CDV()
            r14 = 8
            r10 = r6
            r11 = r1
            r12 = r7
            boolean r0 = r10.A00(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0190
            r0 = r20
            r0.add(r7)
            r0 = 18
            goto L_0x032c
        L_0x031e:
            X.1ya r13 = r31.CDV()
            r10 = r6
            r11 = r1
            r12 = r7
            r14 = r0
            boolean r1 = r10.A00(r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0190
        L_0x032c:
            boolean r0 = X.C32331h1.A00(r8, r0)
            if (r0 == 0) goto L_0x0190
            r0 = r23
            r0.add(r8)
            goto L_0x0190
        L_0x0339:
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass1E0.A00(r24)
            goto L_0x0117
        L_0x033f:
            r1 = 0
            goto L_0x0021
        L_0x0343:
            X.1gx r0 = r7.A0F
            r0.A08()
        L_0x0348:
            boolean r0 = X.C17880vN.A1X(r21)
            if (r0 == 0) goto L_0x0355
            X.1N9 r1 = r6.A0C
            r0 = r21
            r1.A0G(r0)
        L_0x0355:
            boolean r0 = X.C17880vN.A1X(r20)
            if (r0 == 0) goto L_0x0362
            X.1Mn r1 = r6.A0D
            r0 = r20
            r1.A03(r0, r9)
        L_0x0362:
            r17.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62352rG.A02(X.3M9, long):void");
    }

    public C62352rG(AnonymousClass190 r20, AnonymousClass11S r21, C25001Mm r22, AnonymousClass1P3 r23, C32331h1 r24, C32321h0 r25, C54822el r26, C26111Qw r27, C33231iU r28, AnonymousClass1N5 r29, AnonymousClass1N9 r30, C25011Mn r31, AnonymousClass1N7 r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36) {
        C25011Mn r7 = r31;
        AnonymousClass1N9 r8 = r30;
        C25001Mm r16 = r22;
        AnonymousClass190 r18 = r20;
        AnonymousClass11S r17 = r21;
        C18070vi.A0w(r18, r17, r7, r8, r16);
        AnonymousClass00H r4 = r34;
        AnonymousClass00H r3 = r35;
        AnonymousClass00H r5 = r33;
        AnonymousClass1N5 r9 = r29;
        AnonymousClass1P3 r15 = r23;
        C18070vi.A0x(r5, r4, r9, r3, r15);
        AnonymousClass00H r2 = r36;
        AnonymousClass1N7 r6 = r32;
        C32321h0 r13 = r25;
        C26111Qw r11 = r27;
        C32331h1 r14 = r24;
        C18070vi.A0y(r2, r14, r6, r13, r11);
        C33231iU r10 = r28;
        C54822el r12 = r26;
        C18070vi.A0m(r12, r10);
        this.A04 = r18;
        this.A05 = r17;
        this.A0D = r7;
        this.A0C = r8;
        this.A06 = r16;
        this.A0G = r5;
        this.A02 = r4;
        this.A01 = r9;
        this.A03 = r3;
        this.A00 = r15;
        this.A0F = r2;
        this.A07 = r14;
        this.A0E = r6;
        this.A08 = r13;
        this.A0A = r11;
        this.A09 = r12;
        this.A0B = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bd, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c3, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c6, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:53:0x0184, B:66:0x01b9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(com.whatsapp.jid.DeviceJid r21, X.AnonymousClass206 r22, X.C42691ya r23, int r24, long r25) {
        /*
            r20 = this;
            r7 = r20
            X.00H r0 = r7.A0F
            X.1gM r0 = X.C17880vN.A0L(r0)
            r0.A00()
            r8 = r22
            int r1 = r8.A0D()
            r0 = 21
            r12 = 1
            if (r1 != r0) goto L_0x002c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageStatusUpdateHelper/onMessageStatusUpdate: "
            r1.append(r0)
            X.205 r0 = r8.A0v
            java.lang.String r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = " Ignoring status update as the message has permanent send failure"
            X.C17890vO.A1A(r1, r0)
        L_0x002b:
            return r12
        L_0x002c:
            X.205 r6 = r8.A0v
            X.C18070vi.A0W(r6)
            r18 = r24
            boolean r0 = X.C446824j.A01(r18)
            if (r0 == 0) goto L_0x01c7
            boolean r0 = r8 instanceof X.AnonymousClass212
            r19 = r21
            r4 = r25
            if (r0 == 0) goto L_0x006d
            X.1Qw r1 = r7.A0A
            X.C17960vV.A07(r19)
            X.C18070vi.A0X(r19)
            r0 = r19
            r1.A04(r0, r8, r4)
        L_0x004e:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x005a
            X.11S r0 = r7.A05
            boolean r0 = X.AnonymousClass25A.A0R(r0, r8)
            if (r0 == 0) goto L_0x002b
        L_0x005a:
            X.C17960vV.A07(r19)
            X.2nE r3 = X.C63962tz.A02(r19)
            X.1P3 r1 = r7.A00
            boolean r0 = r1.A0Y()
            if (r0 == 0) goto L_0x019b
            r1.A0U(r3, r6)
            return r12
        L_0x006d:
            X.2el r9 = r7.A09
            X.00H r0 = r9.A02
            X.1gM r0 = X.C17880vN.A0L(r0)
            r0.A00()
            X.00H r0 = r9.A03
            X.206 r3 = X.AnonymousClass1W2.A01(r6, r0)
            if (r3 != 0) goto L_0x00a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt/fMsg not found for messageKey="
            X.C17900vP.A0X(r6, r0, r1)
        L_0x0089:
            X.1h1 r1 = r7.A07
            X.C17960vV.A07(r19)
            X.00H r0 = r1.A09
            X.1gM r0 = X.C17880vN.A0L(r0)
            r0.A00()
            java.util.Map r0 = r1.A0A
            r0.remove(r6)
            r12 = r18
            r13 = r4
            r9 = r1
            r10 = r19
            r11 = r8
            boolean r12 = r9.A04(r10, r11, r12, r13)
            goto L_0x004e
        L_0x00a8:
            X.2j9 r2 = r9.A01
            long r0 = r3.A0x
            X.2ds r10 = r2.A00(r0)
            r11 = r23
            if (r10 == 0) goto L_0x00f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt/"
            X.C17900vP.A0Y(r6, r0, r1)
            X.1ya r13 = r10.A00
        L_0x00bf:
            boolean r0 = X.C60622oL.A01(r13, r11)
            if (r0 == 0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt/privacy mismatch. jid="
            r1.append(r0)
            X.205 r0 = r3.A0v
            X.1BI r10 = r0.A00
            r1.append(r10)
            java.lang.String r0 = " privacy mode="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " row id="
            X.AnonymousClass206.A06(r3, r0, r1)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r23 == 0) goto L_0x017b
            X.1Cd r0 = r2.A02
            X.1au r17 = r0.A05()
            goto L_0x00ff
        L_0x00f2:
            if (r23 == 0) goto L_0x00fd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt (ent upgrade)/"
            X.C17900vP.A0Y(r6, r0, r1)
        L_0x00fd:
            r13 = 0
            goto L_0x00bf
        L_0x00ff:
            X.1xA r16 = r17.BD0()     // Catch:{ all -> 0x01b8 }
            android.content.ContentValues r12 = X.C17880vN.A08()     // Catch:{ all -> 0x01ae }
            X.AnonymousClass206.A04(r12, r3)     // Catch:{ all -> 0x01ae }
            java.lang.String r1 = "host_storage"
            int r0 = r11.hostStorage     // Catch:{ all -> 0x01ae }
            X.C17880vN.A18(r12, r1, r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r1 = "actual_actors"
            int r0 = r11.actualActors     // Catch:{ all -> 0x01ae }
            X.C17880vN.A18(r12, r1, r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r14 = "privacy_mode_ts"
            long r0 = r11.privacyModeTs     // Catch:{ all -> 0x01ae }
            X.C17880vN.A19(r12, r14, r0)     // Catch:{ all -> 0x01ae }
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01ae }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x01ae }
            java.lang.String r14 = "message_privacy_state"
            java.lang.String r1 = "INSERT_PRIVACY_STATE_INFO"
            r0 = 5
            r15.A09(r14, r1, r12, r0)     // Catch:{ all -> 0x01ae }
            r0 = 4096(0x1000, double:2.0237E-320)
            r3.A0b(r0)     // Catch:{ all -> 0x01ae }
            X.1N3 r1 = r2.A01     // Catch:{ IOException -> 0x013c }
            r0 = 0
            r1.A04(r3, r0)     // Catch:{ IOException -> 0x013c }
            r16.A00()     // Catch:{ IOException -> 0x013c }
            goto L_0x0149
        L_0x013c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "Failed to update msg privacy flag for "
            X.AnonymousClass206.A06(r3, r0, r1)     // Catch:{ all -> 0x01ae }
            X.C17880vN.A1M(r1, r2)     // Catch:{ all -> 0x01ae }
        L_0x0149:
            r16.close()     // Catch:{ all -> 0x01b8 }
            r17.close()
            if (r13 == 0) goto L_0x0159
            long r2 = r13.privacyModeTs
            long r0 = r11.privacyModeTs
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0089
        L_0x0159:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt/GetVNameCertificateJob. UserJid="
            X.C17900vP.A0Z(r10, r0, r1)
            if (r10 == 0) goto L_0x0089
            boolean r0 = r10 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x0089
            X.1Mm r2 = r9.A00
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r10)
            r1.getClass()
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x0089
        L_0x017b:
            long r0 = r3.A0x
            X.1Cd r2 = r2.A02
            X.1au r11 = r2.A05()
            r2 = r11
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x01bd }
            X.1Ev r10 = r2.A02     // Catch:{ all -> 0x01bd }
            java.lang.String r9 = "message_privacy_state"
            java.lang.String r3 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x01bd }
            X.C17890vO.A1J(r2, r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "DELETE_MESSAGE_PRIVACY_STATE_FOR_ID_SQL"
            r10.A04(r9, r3, r0, r2)     // Catch:{ all -> 0x01bd }
            r11.close()
            goto L_0x0089
        L_0x019b:
            X.00H r0 = r7.A0G
            java.lang.Object r2 = r0.get()
            X.1Ot r2 = (X.C25581Ot) r2
            r1 = 18
            X.3C5 r0 = new X.3C5
            r0.<init>(r7, r3, r6, r1)
            r2.A02(r0)
            return r12
        L_0x01ae:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x01b3 }
            goto L_0x01b7
        L_0x01b3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01b8 }
        L_0x01b7:
            throw r1     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x01c2 }
            throw r1
        L_0x01bd:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x01c2 }
            throw r1
        L_0x01c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x01c7:
            X.1h1 r2 = r7.A07
            r1 = 0
            r0 = r18
            boolean r12 = r2.A03(r1, r6, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62352rG.A00(com.whatsapp.jid.DeviceJid, X.206, X.1ya, int, long):boolean");
    }
}
