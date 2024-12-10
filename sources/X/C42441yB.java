package X;

import com.whatsapp.messagedrafts.MessageDraftsManagerImpl$deleteDraftMessage$1;
import com.whatsapp.messagedrafts.MessageDraftsManagerImpl$saveDraftMessage$1;
import com.whatsapp.messagedrafts.MessageDraftsManagerImpl$updateLastSeenTimestamp$2;

/* renamed from: X.1yB  reason: invalid class name and case insensitive filesystem */
public final class C42441yB implements C42431yA {
    public final AnonymousClass190 A00;
    public final AnonymousClass1Q1 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1R3 A03;
    public final AnonymousClass1N3 A04;
    public final AnonymousClass1Cd A05;
    public final C18030ve A06;
    public final C42421y9 A07;
    public final C42411y8 A08;
    public final C42391y6 A09;
    public final AnonymousClass1W6 A0A;
    public final C18600wl A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass1CJ A0D;
    public final C42401y7 A0E;
    public final AnonymousClass1OX A0F;

    public C42441yB(AnonymousClass190 r17, AnonymousClass11P r18, AnonymousClass1Q1 r19, AnonymousClass1LW r20, AnonymousClass1CJ r21, AnonymousClass1R3 r22, AnonymousClass1N3 r23, AnonymousClass1Cd r24, C18030ve r25, C42421y9 r26, C42411y8 r27, C42391y6 r28, C42401y7 r29, AnonymousClass1W6 r30, C18600wl r31, AnonymousClass1OX r32) {
        AnonymousClass1CJ r11 = r21;
        C18070vi.A0d(r11, 1);
        AnonymousClass1Q1 r13 = r19;
        C18070vi.A0d(r13, 2);
        C18030ve r7 = r25;
        C18070vi.A0d(r7, 3);
        C42391y6 r4 = r28;
        C18070vi.A0d(r4, 4);
        AnonymousClass1OX r1 = r32;
        C18070vi.A0d(r1, 6);
        C18600wl r2 = r31;
        C18070vi.A0d(r2, 7);
        AnonymousClass1Cd r8 = r24;
        C18070vi.A0d(r8, 8);
        AnonymousClass1LW r12 = r20;
        C18070vi.A0d(r12, 9);
        AnonymousClass1R3 r10 = r22;
        C18070vi.A0d(r10, 10);
        C42411y8 r5 = r27;
        C18070vi.A0d(r5, 11);
        AnonymousClass1W6 r3 = r30;
        C18070vi.A0d(r3, 12);
        AnonymousClass1N3 r9 = r23;
        C18070vi.A0d(r9, 13);
        C42421y9 r6 = r26;
        C18070vi.A0d(r6, 14);
        AnonymousClass11P r14 = r18;
        C18070vi.A0d(r14, 15);
        AnonymousClass190 r15 = r17;
        C18070vi.A0d(r15, 16);
        this.A0D = r11;
        this.A01 = r13;
        this.A06 = r7;
        this.A09 = r4;
        this.A0E = r29;
        this.A0F = r1;
        this.A0B = r2;
        this.A05 = r8;
        this.A02 = r12;
        this.A03 = r10;
        this.A08 = r5;
        this.A0A = r3;
        this.A04 = r9;
        this.A07 = r6;
        this.A0C = r14;
        this.A00 = r15;
    }

    public void BIH(AnonymousClass1BI r10) {
        AnonymousClass25L r5;
        AnonymousClass1BI r6 = r10;
        C18070vi.A0d(r10, 0);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A0D, r10);
        if (A002 != null) {
            r5 = A002.A0v;
            A002.A0v = null;
        } else {
            r5 = null;
        }
        this.A01.A03(r10, false);
        C30451dy.A02(AnonymousClass00R.A00, this.A0B, new MessageDraftsManagerImpl$deleteDraftMessage$1(A002, r5, r6, this, (C30391dr) null), this.A0F);
    }

    public AnonymousClass25L BQq(AnonymousClass1BI r3) {
        C29691ci A002;
        C18070vi.A0d(r3, 0);
        if (!BeW() || (A002 = AnonymousClass1CJ.A00(this.A0D, r3)) == null) {
            return null;
        }
        return A002.A0v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.CDX.A00(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0172, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0175, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        X.CDX.A00(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0179, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass25L BQr(X.AnonymousClass1BI r29) {
        /*
            r28 = this;
            r0 = 0
            r3 = r29
            X.C18070vi.A0d(r3, r0)
            r2 = r28
            boolean r0 = r2.BeW()
            if (r0 != 0) goto L_0x0010
            r1 = 0
        L_0x000f:
            return r1
        L_0x0010:
            X.25L r1 = r2.BQq(r3)
            if (r1 != 0) goto L_0x000f
            r1 = 0
            X.1y6 r0 = r2.A09     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.25H r15 = X.AnonymousClass25H.DRAFT     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.util.ArrayList r0 = r0.A00(r15, r3)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.lang.Object r13 = X.C29431cG.A0c(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.25L r13 = (X.AnonymousClass25L) r13     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r13 == 0) goto L_0x000f
            boolean r6 = r13 instanceof X.AnonymousClass2Dr     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r5 = 0
            if (r6 == 0) goto L_0x00d6
            r7 = r13
            X.2Dr r7 = (X.AnonymousClass2Dr) r7     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r3 = 2
            int r0 = r7.A01()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00d6
            X.1y8 r11 = r2.A08     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r12 = 0
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r9.<init>()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1Cd r0 = r11.A01     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1at r8 = r0.get()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b0 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "\n        SELECT \n          composition_row_id,\n          jid_row_id\n        FROM composition_mention\n        WHERE composition_row_id = ?\n        "
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00b0 }
            int r0 = r7.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b0 }
            r3[r12] = r0     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "GET_MENTION_SQL"
            android.database.Cursor r10 = r10.A0A(r4, r0, r3)     // Catch:{ all -> 0x00b0 }
        L_0x005d:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "jid_row_id"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            long r3 = r10.getLong(r0)     // Catch:{ all -> 0x00a9 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x00a9 }
            X.1DL r0 = r11.A00     // Catch:{ all -> 0x00a9 }
            com.whatsapp.jid.Jid r0 = r0.A0B(r3)     // Catch:{ all -> 0x00a9 }
            X.1BI r0 = X.C22931Dv.A00(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x005d
            r9.add(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x005d
        L_0x007f:
            r10.close()     // Catch:{ all -> 0x00b0 }
            r8.close()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0 = 10
            int r0 = X.C29351c6.A0C(r9, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r8.<init>(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.util.Iterator r4 = r9.iterator()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x0094:
            boolean r0 = r4.hasNext()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r3 = r4.next()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.3Bi r0 = new X.3Bi     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0.<init>(r3, r1)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r8.add(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            goto L_0x0094
        L_0x00a9:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r10, r3)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.CDX.A00(r8, r3)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            goto L_0x0179
        L_0x00b8:
            java.util.List r4 = r7.A08     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r4.clear()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            int r3 = r7.A01()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0 = -3
            r0 = r0 & r3
            r7.A00 = r0     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            boolean r0 = r8.isEmpty()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r0 != 0) goto L_0x00d6
            r4.addAll(r8)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r3 = 2
            int r0 = r7.A01()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r3 = r3 | r0
            r7.A00 = r3     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x00d6:
            r3 = 1
            int r0 = r13.A01()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r3 = r3 & r0
            if (r3 == 0) goto L_0x017d
            X.1y9 r0 = r2.A07     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r23 = 0
            X.1Cd r0 = r0.A00     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1at r3 = r0.get()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0173 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "\n        SELECT \n          composition_row_id, \n          media_uri, \n          media_duration_in_seconds,\n          media_name,\n          file_length\n         FROM composition_media\n         WHERE composition_row_id = ?\n        "
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0173 }
            int r21 = r13.A00()     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0173 }
            r4[r23] = r0     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "GET_MEDIA_SQL"
            android.database.Cursor r0 = r8.A0A(r7, r0, r4)     // Catch:{ all -> 0x0173 }
            boolean r4 = r0.moveToFirst()     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x0168
            java.lang.String r4 = "media_uri"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r19 = r0.getString(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "media_name"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r20 = r0.getString(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "file_length"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x016c }
            long r26 = r0.getLong(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "media_duration_in_seconds"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x016c }
            int r22 = r0.getInt(r4)     // Catch:{ all -> 0x016c }
            X.C18070vi.A0b(r20)     // Catch:{ all -> 0x016c }
            X.2Qp r14 = X.C49472Qp.AUDIO     // Catch:{ all -> 0x016c }
            long r24 = r13.A02()     // Catch:{ all -> 0x016c }
            java.lang.String r18 = r13.A04()     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x014d
            X.2Dr r13 = (X.AnonymousClass2Dr) r13     // Catch:{ all -> 0x016c }
            X.1BI r4 = r13.A06     // Catch:{ all -> 0x016c }
        L_0x0143:
            X.2Dp r13 = new X.2Dp     // Catch:{ all -> 0x016c }
            r17 = r1
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x016c }
            goto L_0x0152
        L_0x014d:
            X.2Dp r13 = (X.C46212Dp) r13     // Catch:{ all -> 0x016c }
            X.1BI r4 = r13.A08     // Catch:{ all -> 0x016c }
            goto L_0x0143
        L_0x0152:
            r0.close()     // Catch:{ all -> 0x0173 }
            r3.close()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.lang.String r3 = r13.A0A     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r3 == 0) goto L_0x017d
            java.io.File r0 = new java.io.File     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            r0.<init>(r3)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            boolean r0 = r0.exists()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r0 != 0) goto L_0x017d
            return r1
        L_0x0168:
            r0.close()     // Catch:{ all -> 0x0173 }
            goto L_0x017a
        L_0x016c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x016e }
        L_0x016e:
            r4 = move-exception
            X.CDX.A00(r0, r5)     // Catch:{ all -> 0x0173 }
            throw r4     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            X.CDX.A00(r3, r4)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x0179:
            throw r0     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x017a:
            r3.close()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x017d:
            boolean r0 = r13 instanceof X.AnonymousClass2Dr     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            if (r0 == 0) goto L_0x0187
            r0 = r13
            X.2Dr r0 = (X.AnonymousClass2Dr) r0     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.lang.Long r0 = r0.A01     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            goto L_0x018c
        L_0x0187:
            r0 = r13
            X.2Dp r0 = (X.C46212Dp) r0     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            java.lang.Long r0 = r0.A01     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x018c:
            if (r0 == 0) goto L_0x019a
            long r3 = r0.longValue()     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1W6 r0 = r2.A0A     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.1W2 r0 = r0.A01     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            X.206 r5 = r0.A03(r3)     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
        L_0x019a:
            r13.A01 = r5     // Catch:{ SQLiteBlobTooBigException -> 0x019d }
            return r13
        L_0x019d:
            r3 = move-exception
            X.190 r2 = r2.A00
            java.lang.String r0 = "MessageDraftsManagerImpl/getDraftMessageFromDb/unable to get draft message from db"
            r2.A0E(r0, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42441yB.BQr(X.1BI):X.25L");
    }

    public AnonymousClass206 BRW(AnonymousClass25L r12) {
        Object obj;
        AnonymousClass25L r0 = r12;
        C42401y7 r2 = this.A0E;
        if (r12 instanceof AnonymousClass2Dr) {
            AnonymousClass2Dr r02 = (AnonymousClass2Dr) r0;
            C32551hN r1 = r2.A01;
            AnonymousClass1BI r22 = r02.A06;
            String str = r02.A07;
            if (str == null) {
                str = "";
            }
            obj = r1.A00(r22, (AnonymousClass206) null, (AnonymousClass3LT) null, str, C29431cG.A0t(r02.A08), r02.A03);
        } else {
            if (r12 instanceof C46212Dp) {
                C46212Dp r03 = (C46212Dp) r0;
                C32721he r13 = r2.A00;
                AnonymousClass1BI r3 = r03.A08;
                C441822l A002 = r13.A00(new C62572rc(), r3, (AnonymousClass206) null, r03.A09, r03.A05, 0, false);
                A002.A0D = r03.A02;
                obj = A002;
            }
            return null;
        }
        AnonymousClass206 r23 = (AnonymousClass206) obj;
        if (r23 != null) {
            r23.A0a(6);
            r23.A0b(2147483648L);
            return r23;
        }
        return null;
    }

    public void CGi(AnonymousClass25L r11, AnonymousClass1BI r12) {
        AnonymousClass1BI r7 = r12;
        C18070vi.A0d(r12, 0);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A0D, r12);
        if (BeW() && A002 != null) {
            A002.A0v = r11;
            AnonymousClass1OX r2 = this.A0F;
            C30451dy.A02(AnonymousClass00R.A00, this.A0B, new MessageDraftsManagerImpl$saveDraftMessage$1(A002, r11, r7, this, (C30391dr) null), r2);
            this.A01.A03(r12, false);
        }
    }

    public void CQo(AnonymousClass25L r11, long j) {
        AnonymousClass1BI r1;
        if (BeW()) {
            AnonymousClass1CJ r2 = this.A0D;
            AnonymousClass25L r5 = r11;
            if (r11 instanceof AnonymousClass2Dr) {
                r1 = ((AnonymousClass2Dr) r5).A06;
            } else {
                r1 = ((C46212Dp) r5).A08;
            }
            C29691ci A0A2 = r2.A0A(r1);
            long j2 = j;
            if (A0A2 != null) {
                r11.A00 = j;
                A0A2.A0v = r11;
            }
            this.A01.A03(r1, false);
            AnonymousClass1OX r22 = this.A0F;
            C30451dy.A02(AnonymousClass00R.A00, this.A0B, new MessageDraftsManagerImpl$updateLastSeenTimestamp$2(A0A2, r5, this, (C30391dr) null, j2), r22);
        }
    }

    public static final AnonymousClass25L A00(AnonymousClass25L r22, int i) {
        AnonymousClass25L r9 = r22;
        int i2 = i;
        if (r9 instanceof AnonymousClass2Dr) {
            AnonymousClass2Dr r92 = (AnonymousClass2Dr) r9;
            AnonymousClass1BI r8 = r92.A06;
            String str = r92.A07;
            long j = r92.A03;
            AnonymousClass25H r6 = r92.A05;
            return new AnonymousClass2Dr(r92.A04, r6, r8, r92.A01, str, r92.A08, i2, r92.A00, j);
        } else if (!(r9 instanceof C46212Dp)) {
            return r9;
        } else {
            C46212Dp r93 = (C46212Dp) r9;
            AnonymousClass1BI r12 = r93.A08;
            String str2 = r93.A0B;
            long j2 = r93.A05;
            AnonymousClass25H r11 = r93.A07;
            long j3 = r93.A04;
            return new C46212Dp(r93.A06, r11, r12, r93.A01, str2, r93.A0A, r93.A09, i2, r93.A02, r93.A00, j2, j3);
        }
    }

    public boolean BeW() {
        return C36301nf.A02(this.A06, C18040vf.A02, 10172);
    }
}
