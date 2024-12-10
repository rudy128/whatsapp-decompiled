package X;

/* renamed from: X.7Nm  reason: invalid class name and case insensitive filesystem */
public class C146017Nm implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C146017Nm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A06 = str;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0225, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0229, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x022c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022d, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0230, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0233, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0234, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0237, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r33) {
        /*
            r32 = this;
            r9 = r33
            r1 = r32
            int r0 = r1.A00
            java.lang.Object r3 = r1.A01
            if (r0 == 0) goto L_0x006e
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r6 = r1.A02
            X.3w2 r6 = (X.C79793w2) r6
            java.lang.Object r5 = r1.A03
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.String r8 = r1.A06
            java.lang.Object r7 = r1.A04
            X.206 r7 = (X.AnonymousClass206) r7
            java.lang.Object r4 = r1.A05
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r0 = 6
            X.C18070vi.A0d(r9, r0)
            boolean r0 = r3.Bed()
            if (r0 != 0) goto L_0x006d
            X.0ve r1 = r6.A02
            boolean r0 = r9.booleanValue()
            X.6q6 r2 = new X.6q6
            r2.<init>(r1, r5, r8, r0)
            r0 = 0
            r2.A00 = r0
            r2.A09 = r0
            com.whatsapp.jid.UserJid r0 = r7.A0I()
            r2.A01 = r0
            r0 = 0
            r2.A06 = r0
            r2.A08 = r0
            X.205 r0 = r7.A0v
            r2.A02 = r0
            r1 = 1
            X.7M2 r0 = new X.7M2
            r0.<init>(r4, r1)
            r2.A03 = r0
            boolean r0 = X.C22971Dz.A0V(r5)
            if (r0 == 0) goto L_0x0066
            X.1CJ r0 = r6.A00
            X.1ci r1 = r0.A0A(r5)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0066
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x0066
            r2.A01(r1)
        L_0x0066:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r2.A00()
            r3.CMl(r0)
        L_0x006d:
            return
        L_0x006e:
            X.1lj r3 = (X.C35151lj) r3
            java.lang.Object r5 = r1.A02
            X.34B r5 = (X.AnonymousClass34B) r5
            java.lang.String r0 = r1.A06
            r31 = r0
            java.lang.Object r2 = r1.A03
            X.77d r2 = (X.C1418377d) r2
            java.lang.Object r8 = r1.A04
            byte[] r8 = (byte[]) r8
            java.lang.Object r1 = r1.A05
            X.2k9 r1 = (X.C58102k9) r1
            java.lang.Number r9 = (java.lang.Number) r9
            X.2g5 r7 = r5.A03()
            r5.A05()
            int r4 = r9.intValue()
            if (r4 != 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            X.9un r11 = r7.A02
            java.lang.String r0 = r11.A03()
            if (r0 == 0) goto L_0x026d
            X.1hn r0 = r3.A0H
            X.2h4 r6 = r5.A0N
            long r4 = java.lang.System.currentTimeMillis()
            r6.A05 = r4
            X.1SS r0 = r0.A00
            r0.A04(r6)
            java.lang.String r0 = r2.A0F
            X.C17960vV.A07(r0)
            r6 = 0
            java.lang.String r16 = android.util.Base64.encodeToString(r8, r6)
            java.lang.String r4 = r11.A07()
            r2.A0I = r4
            java.lang.String r4 = r11.A03()
            r2.A08 = r4
            r4 = r16
            r2.A0D = r4
            java.lang.String r4 = r11.A05()
            r2.A0A = r4
            X.00H r5 = r3.A0P
            X.67t r4 = X.C108945cZ.A0w(r5)
            boolean r4 = r4.A0N(r0)
            if (r4 == 0) goto L_0x011e
            X.67t r17 = X.C108945cZ.A0w(r5)
            java.lang.String r18 = r11.A06()
            java.lang.String r19 = r11.A07()
            java.lang.String r20 = r11.A05()
            java.lang.String r21 = r11.A03()
            java.lang.String r10 = r2.A0E
            X.2rU r4 = r7.A01
            X.2h8 r4 = r4.A02
            long r4 = r4.A03
            int r9 = (int) r4
            java.lang.Integer r4 = r11.A02()
            if (r4 != 0) goto L_0x01ca
            r27 = 0
        L_0x00fd:
            java.lang.Integer r4 = r11.A01()
            if (r4 != 0) goto L_0x01c0
            r28 = 0
        L_0x0105:
            java.lang.String r8 = r2.A09
            boolean r5 = r2.A0P
            boolean r30 = r2.A02()
            java.lang.String r4 = r2.A06
            r22 = r10
            r23 = r16
            r24 = r8
            r25 = r4
            r26 = r9
            r29 = r5
            r17.A0M(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x011e:
            X.00H r4 = r3.A0R
            r20 = r4
            java.lang.Object r4 = r20.get()
            X.6zr r4 = (X.C140046zr) r4
            boolean r4 = r4.A03(r0)
            if (r4 == 0) goto L_0x024d
            java.lang.Object r14 = r20.get()
            X.6zr r14 = (X.C140046zr) r14
            java.lang.String r8 = r11.A06()
            java.lang.String r12 = r11.A07()
            java.lang.String r10 = r11.A05()
            java.lang.String r15 = r11.A03()
            java.lang.String r4 = r2.A0E
            r19 = r4
            X.2rU r4 = r7.A01
            X.2h8 r4 = r4.A02
            long r4 = r4.A03
            int r9 = (int) r4
            java.lang.Integer r4 = r11.A02()
            if (r4 != 0) goto L_0x01b7
            r13 = 0
        L_0x0156:
            java.lang.Integer r4 = r11.A01()
            if (r4 == 0) goto L_0x0164
            java.lang.Integer r4 = r11.A01()
            int r6 = r4.intValue()
        L_0x0164:
            java.lang.String r11 = r2.A09
            boolean r4 = r2.A0P
            r18 = r4
            r7 = 0
            X.C18070vi.A0d(r8, r7)
            X.6zY r14 = r14.A05
            java.lang.String r17 = "plaintext_hash = ?"
            android.content.ContentValues r5 = X.C17880vN.A08()
            java.lang.String r4 = "url"
            r5.put(r4, r12)
            java.lang.String r4 = "enc_hash"
            r5.put(r4, r10)
            java.lang.String r10 = "direct_path"
            r5.put(r10, r15)
            java.lang.String r10 = "mimetype"
            r4 = r19
            r5.put(r10, r4)
            java.lang.String r10 = "media_key"
            r4 = r16
            r5.put(r10, r4)
            java.lang.String r4 = "file_size"
            X.C17880vN.A18(r5, r4, r9)
            java.lang.String r4 = "width"
            X.C17880vN.A18(r5, r4, r13)
            java.lang.String r4 = "height"
            X.C17880vN.A18(r5, r4, r6)
            java.lang.String r4 = "emojis"
            r5.put(r4, r11)
            java.lang.String r6 = "is_first_party"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r18)
            r5.put(r6, r4)
            X.00H r4 = r14.A00
            X.1au r9 = X.C108985cd.A0S(r4)
            goto L_0x01d4
        L_0x01b7:
            java.lang.Integer r4 = r11.A02()
            int r13 = r4.intValue()
            goto L_0x0156
        L_0x01c0:
            java.lang.Integer r4 = r11.A01()
            int r28 = r4.intValue()
            goto L_0x0105
        L_0x01ca:
            java.lang.Integer r4 = r11.A02()
            int r27 = r4.intValue()
            goto L_0x00fd
        L_0x01d4:
            r4 = r9
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0231 }
            X.1Ev r14 = r4.A02     // Catch:{ all -> 0x0231 }
            java.lang.String r16 = "starred_stickers"
            r6 = 1
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x0231 }
            r4[r7] = r8     // Catch:{ all -> 0x0231 }
            java.lang.String r18 = "updateStickerAttrsByFileHash/UPDATE_STARRED_STICKERS"
            r15 = r5
            r19 = r4
            r14.A02(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0231 }
            r9.close()
            java.lang.Object r4 = r20.get()
            X.6zr r4 = (X.C140046zr) r4
            X.C18070vi.A0d(r0, r7)
            X.C17960vV.A00()
            X.6zY r4 = r4.A05
            java.lang.String[] r8 = new java.lang.String[r6]
            r8[r7] = r0
            X.00H r4 = r4.A00
            X.1at r7 = X.C108975cc.A0F(r4)
            r4 = r7
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x022a }
            X.1Ev r6 = r4.A02     // Catch:{ all -> 0x022a }
            java.lang.String r5 = "SELECT timestamp FROM starred_stickers WHERE plaintext_hash = ?"
            java.lang.String r4 = "getStickerStarredTimestamp/GET_STARRED_STICKER_TIMESTAMP_BY_PLAIN_HASH "
            android.database.Cursor r6 = r6.A0A(r5, r4, r8)     // Catch:{ all -> 0x022a }
            boolean r4 = r6.moveToNext()     // Catch:{ all -> 0x0223 }
            if (r4 == 0) goto L_0x021d
            java.lang.String r4 = "timestamp"
            long r4 = X.C17890vO.A06(r6, r4)     // Catch:{ all -> 0x0223 }
            goto L_0x021f
        L_0x021d:
            r4 = -1
        L_0x021f:
            r6.close()     // Catch:{ all -> 0x022a }
            goto L_0x0238
        L_0x0223:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0225 }
        L_0x0225:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x022a }
            throw r0     // Catch:{ all -> 0x022a }
        L_0x022a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022c }
        L_0x022c:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x0231:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r1 = move-exception
            X.CDX.A00(r9, r0)
            throw r1
        L_0x0238:
            r7.close()
            X.1To r9 = r3.A06
            if (r9 == 0) goto L_0x024d
            r7 = 0
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x024d
            r6 = 1
            java.util.Set r4 = r9.A0B(r2, r4, r6)
            r9.A0R(r4)
        L_0x024d:
            X.1lC r5 = r3.A0J
            monitor-enter(r5)
            X.00z r4 = r5.A00     // Catch:{ all -> 0x026a }
            if (r4 != 0) goto L_0x025d
            r3 = 60
            X.00z r4 = new X.00z     // Catch:{ all -> 0x026a }
            r4.<init>(r3)     // Catch:{ all -> 0x026a }
            r5.A00 = r4     // Catch:{ all -> 0x026a }
        L_0x025d:
            r4.A08(r0, r2)     // Catch:{ all -> 0x026a }
            monitor-exit(r5)
            X.9KN r4 = X.AnonymousClass9KN.SUCCESS
            r3 = 1
            r0 = r31
            r1.A00(r4, r2, r0, r3)
            return
        L_0x026a:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x026d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NonMessageDataRequestManager/uploadSticker/failed to upload, error:"
            r2.append(r0)
            java.lang.String r0 = X.C137266vB.A00(r4)
            X.C17890vO.A19(r2, r0)
            X.9KN r4 = X.AnonymousClass9KN.GENERAL_ERROR
            r3 = 0
            r2 = 0
            r0 = r31
            r1.A00(r4, r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146017Nm.accept(java.lang.Object):void");
    }
}
