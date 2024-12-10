package X;

/* renamed from: X.1W1  reason: invalid class name */
public final class AnonymousClass1W1 implements AnonymousClass1QA {
    public final C25001Mm A00;
    public final C18000vb A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass00H A04;
    public final C18030ve A05;

    public AnonymousClass1W1(C25001Mm r2, C18000vb r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C18030ve r6, AnonymousClass00H r7) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r6, 6);
        this.A04 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0182, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0186, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C61482pl BLE(X.AnonymousClass206 r12, X.C34141jz r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            r7 = 2
            java.lang.String r0 = "NewsletterFtsMessageStore/searchForJid"
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            X.1BI r0 = r13.A03
            X.C17960vV.A07(r0)
            long r0 = X.AnonymousClass25A.A03(r12)
            r4 = -9223372036854775808
            r10 = -4
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "NewsletterFtsMessageStore/searchForJid/startSortId < 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x001d:
            X.2pl r0 = X.C61482pl.A00(r10)
            return r0
        L_0x0022:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "start:"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = " up:"
            r4.append(r3)
            r4.append(r14)
            java.lang.String r3 = " includeStartMessage:"
            r4.append(r3)
            r4.append(r15)
            java.lang.String r3 = r4.toString()
            r2.A03(r3)
            java.util.List r3 = r13.A04()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x001d
            X.0ve r5 = r11.A05
            r4 = 6261(0x1875, float:8.774E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 == 0) goto L_0x0141
            java.lang.String r3 = X.AnonymousClass2WM.A01
        L_0x0061:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            X.C26121Qx.A03(r4, r14, r15)
            java.lang.String r3 = " LIMIT 1"
            r4.append(r3)
            java.lang.String r5 = r4.toString()
            X.C18070vi.A0X(r5)
            java.util.List r3 = r13.A04()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x013d
            java.lang.String r6 = r13.A02()
            X.C18070vi.A0X(r6)
            java.lang.String r4 = "\""
            boolean r3 = r6.startsWith(r4)
            if (r3 == 0) goto L_0x00ec
            boolean r3 = r6.endsWith(r4)
            if (r3 == 0) goto L_0x00ec
            int r3 = r6.length()
            if (r3 <= r7) goto L_0x00ec
        L_0x009c:
            X.1BI r4 = r13.A03
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r3 = 32
            r8.append(r3)
            X.1DL r3 = r11.A02
            long r3 = r3.A09(r4)
            r6 = 36
            java.lang.String r6 = java.lang.Long.toString(r3, r6)
            X.C18070vi.A0X(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "fts_jid:"
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            r8.append(r3)
            java.lang.String r4 = r8.toString()
            java.lang.String[] r6 = new java.lang.String[r7]
            r3 = 0
            r6[r3] = r4
            r8 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6[r8] = r0
            java.lang.String r0 = "compiled"
            r2.A03(r0)
            java.lang.String r3 = "FIND_FTS_NEWSLETTER_MESSAGE_FOR_JID"
            goto L_0x0145
        L_0x00ec:
            java.util.List r4 = r13.A04()
            X.C18070vi.A0X(r4)
            int r3 = r4.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            java.util.Iterator r8 = r4.iterator()
        L_0x0100:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0121
            java.lang.Object r6 = r8.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "content:"
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            r9.add(r3)
            goto L_0x0100
        L_0x0121:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = " "
            r4 = 0
            java.lang.String r3 = ""
            java.lang.String r3 = X.C29431cG.A0g(r6, r3, r3, r9, r4)
            r8.append(r3)
            r3 = 42
            r8.append(r3)
            java.lang.String r6 = r8.toString()
            goto L_0x009c
        L_0x013d:
            java.lang.String r6 = ""
            goto L_0x009c
        L_0x0141:
            java.lang.String r3 = X.AnonymousClass2WM.A00
            goto L_0x0061
        L_0x0145:
            X.1Cd r0 = r11.A03     // Catch:{ SQLiteException -> 0x0187 }
            X.1at r4 = r0.get()     // Catch:{ SQLiteException -> 0x0187 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0180 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0180 }
            android.database.Cursor r1 = r0.A0A(r5, r3, r6)     // Catch:{ all -> 0x0180 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0180 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "sort_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0180 }
            long r6 = r1.getLong(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0180 }
            long r9 = r1.getLong(r0)     // Catch:{ all -> 0x0180 }
            X.2pl r5 = new X.2pl     // Catch:{ all -> 0x0180 }
            r5.<init>(r6, r8, r9)     // Catch:{ all -> 0x0180 }
            goto L_0x017c
        L_0x0178:
            X.2pl r5 = X.C61482pl.A00(r10)     // Catch:{ all -> 0x0180 }
        L_0x017c:
            r4.close()     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x01b0
        L_0x0180:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteException -> 0x0187 }
            throw r0     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0187:
            r5 = move-exception
            java.lang.String r4 = r5.getMessage()
            if (r4 == 0) goto L_0x01ca
            java.lang.String r1 = "FTS expression tree is too large"
            r0 = 0
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r1, r0)
            if (r0 == 0) goto L_0x01ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FtsMessageStore/getRowIdForJidSearch/too-large/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r5)
            r0 = -2
        L_0x01ac:
            X.2pl r5 = X.C61482pl.A00(r0)
        L_0x01b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "found: "
            r3.append(r0)
            long r0 = r5.A01
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.A03(r0)
            r2.A02()
            return r5
        L_0x01ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FtsMessageStore/getRowIdForJidSearch/error/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r5)
            r0 = -3
            goto L_0x01ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W1.BLE(X.206, X.1jz, boolean, boolean):X.2pl");
    }

    public long BS5() {
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQy(X.AnonymousClass206 r16) {
        /*
            r15 = this;
            X.0ve r2 = r15.A05
            r1 = 11266(0x2c02, float:1.5787E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00f9
            X.AnonymousClass1D7.A0I()
            r8 = r16
            X.205 r0 = r8.A0v
            X.1BI r2 = r0.A00
            if (r2 == 0) goto L_0x00f9
            boolean r0 = X.C22971Dz.A0V(r2)
            if (r0 == 0) goto L_0x00f9
            int r1 = r8.A0u
            r0 = 35
            if (r1 == r0) goto L_0x00f9
            boolean r0 = r8 instanceof X.C436420i
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r8 instanceof X.AnonymousClass215
            if (r0 != 0) goto L_0x00f9
            X.00H r0 = r15.A04
            java.lang.Object r0 = r0.get()
            X.2fn r0 = (X.C55452fn) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            X.20A r0 = r0.A00(r1)
            X.20t r0 = (X.C437420t) r0
            X.3KT r1 = r0.BXT(r8)
            boolean r0 = r1 instanceof X.C690335q
            if (r0 == 0) goto L_0x00a1
            X.35q r1 = (X.C690335q) r1
            java.lang.CharSequence r0 = r1.A00
            java.lang.String r3 = r0.toString()
        L_0x0051:
            int r1 = r3.length()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L_0x0092
            java.util.regex.Pattern r0 = X.AnonymousClass2W6.A00
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.find()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0092
            X.0vb r0 = r15.A01
            java.lang.String r3 = X.C20103A7h.A01(r0, r3)
            X.C18070vi.A0X(r3)
        L_0x0070:
            long r10 = r8.A0y
            long r13 = r8.A0x
            r12 = 1
            X.2pl r9 = new X.2pl
            r9.<init>(r10, r12, r13)
            java.lang.String r6 = "docid"
            X.1DL r0 = r15.A02
            long r0 = r0.A09(r2)
            r2 = 36
            java.lang.String r1 = java.lang.Long.toString(r0, r2)
            X.C18070vi.A0X(r1)
            X.1Cd r0 = r15.A03
            X.1au r2 = r0.A05()
            goto L_0x00a4
        L_0x0092:
            X.1Mm r7 = r15.A00
            long r4 = r8.A0x
            long r0 = r8.A0y
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r6 = new com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob
            r6.<init>(r4, r0)
            r7.A01(r6)
            goto L_0x0070
        L_0x00a1:
            java.lang.String r3 = ""
            goto L_0x0051
        L_0x00a4:
            r0 = 3
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00f2 }
            r7.<init>(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "content"
            r7.put(r0, r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "fts_jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x00f2 }
            long r0 = r9.A01     // Catch:{ all -> 0x00f2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            r7.put(r6, r3)     // Catch:{ all -> 0x00f2 }
            r3 = r2
            X.1av r3 = (X.C28801av) r3     // Catch:{ SQLiteConstraintException -> 0x00ca }
            X.1Ev r5 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x00ca }
            java.lang.String r4 = "message_newsletter_fts"
            java.lang.String r3 = "INSERT_NEWSLETTER_FTS_MESSAGE"
            r5.A06(r4, r3, r7)     // Catch:{ SQLiteConstraintException -> 0x00ca }
            goto L_0x00ee
        L_0x00ca:
            r4 = move-exception
            r7.remove(r6)     // Catch:{ all -> 0x00f2 }
            r3 = r2
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x00f2 }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x00f2 }
            java.lang.String r8 = "message_newsletter_fts"
            java.lang.String r9 = "docid = ?"
            java.lang.String[] r11 = new java.lang.String[r12]     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            r0 = 0
            r11[r0] = r1     // Catch:{ all -> 0x00f2 }
            java.lang.String r10 = "UPDATE_NEWSLETTER_FTS_MESSAGE"
            int r0 = r6.A02(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00f2 }
            if (r0 == r12) goto L_0x00ee
            java.lang.String r0 = "NewsletterFtsMessageStore/insertOrUpdateFtsMessage/update failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f2 }
            throw r4     // Catch:{ all -> 0x00f2 }
        L_0x00ee:
            r2.close()
            return
        L_0x00f2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W1.CQy(X.206):void");
    }
}
