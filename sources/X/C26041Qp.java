package X;

/* renamed from: X.1Qp  reason: invalid class name and case insensitive filesystem */
public final class C26041Qp {
    public final C26031Qo A00;
    public final AnonymousClass1Cd A01;
    public final C18030ve A02;

    public C26041Qp(C26031Qo r2, AnonymousClass1Cd r3, C18030ve r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C20948Ac2 A00(X.C26041Qp r15, X.AnonymousClass206 r16) {
        /*
            r7 = 0
            r2 = r15
            X.1Cd r0 = r15.A01     // Catch:{ all -> 0x00cd }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x00cd }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c6 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "SELECT reporting_info.reporting_tag, COALESCE(reporting_info.stanza_id_text,reporting_info.stanza_id) as S_ID_TEXT, reporting_info.send_timestamp, reporting_info_content.reporting_token, reporting_info_content.reporting_token_content, reporting_info_content.reporting_token_version, reporting_info_content.reporting_token_key  FROM reporting_info LEFT JOIN reporting_info_content ON reporting_info._id = reporting_info_content.reporting_info_row_id WHERE message_row_id = ? AND S_ID_TEXT = ? AND send_timestamp = ?"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x00c6 }
            r8 = r16
            long r0 = r8.A0x     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = r15.A02(r8)     // Catch:{ all -> 0x00c6 }
            r0 = 1
            r4[r0] = r1     // Catch:{ all -> 0x00c6 }
            long r0 = r8.A0I     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "GET_REPORTING_INFO"
            android.database.Cursor r4 = r6.A0A(r5, r0, r4)     // Catch:{ all -> 0x00c6 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "reporting_tag"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            byte[] r11 = r4.getBlob(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "reporting_token"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            byte[] r12 = r4.getBlob(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "reporting_token_content"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            byte[] r13 = r4.getBlob(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "reporting_token_version"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0065
            r9 = r7
            goto L_0x006d
        L_0x0065:
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x00bf }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00bf }
        L_0x006d:
            java.lang.String r0 = "reporting_token_key"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            byte[] r14 = r4.getBlob(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "S_ID_TEXT"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0089
            java.lang.String r10 = r4.getString(r1)     // Catch:{ all -> 0x00bf }
            if (r10 != 0) goto L_0x008b
        L_0x0089:
            java.lang.String r10 = ""
        L_0x008b:
            java.lang.String r0 = "send_timestamp"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x00a3
            long r15 = r4.getLong(r1)     // Catch:{ all -> 0x00bf }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r15 = 0
        L_0x00a5:
            if (r11 == 0) goto L_0x00b6
            int r0 = r11.length     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b6
            X.Ac2 r8 = new X.Ac2     // Catch:{ all -> 0x00bf }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00bf }
            r4.close()     // Catch:{ all -> 0x00c6 }
            r3.close()     // Catch:{ all -> 0x00cd }
            return r8
        L_0x00b6:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x00bf }
            r4.close()     // Catch:{ all -> 0x00c6 }
            r3.close()     // Catch:{ all -> 0x00cd }
            goto L_0x00d3
        L_0x00bf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x00d3:
            java.lang.Throwable r3 = X.C30671eK.A00(r1)
            if (r3 == 0) goto L_0x00e2
            X.1Qo r2 = r2.A00
            X.8oI r1 = X.AnonymousClass8oI.A09
            java.lang.String r0 = "getReportingInfoFromNewTable"
            r2.A01(r1, r0, r3)
        L_0x00e2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Qp.A00(X.1Qp, X.206):X.Ac2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C20948Ac2 A01(X.C26041Qp r13, X.AnonymousClass206 r14) {
        /*
            r8 = 0
            X.1Cd r0 = r13.A01     // Catch:{ all -> 0x0081 }
            X.1at r2 = r0.get()     // Catch:{ all -> 0x0081 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x007a }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "SELECT reporting_tag, reporting_token_content, version FROM reporting_token WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x007a }
            long r0 = r14.A0x     // Catch:{ all -> 0x007a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x007a }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "GET_REPORTING_TOKEN_INFO"
            android.database.Cursor r3 = r5.A0A(r4, r0, r3)     // Catch:{ all -> 0x007a }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "reporting_token_content"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0073 }
            byte[] r9 = r3.getBlob(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "reporting_tag"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0073 }
            byte[] r7 = r3.getBlob(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "version"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0073 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0048
            goto L_0x0051
        L_0x0048:
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x0073 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0052
        L_0x0051:
            r5 = r8
        L_0x0052:
            if (r7 == 0) goto L_0x006a
            int r0 = r7.length     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r6 = r13.A02(r14)     // Catch:{ all -> 0x0073 }
            long r11 = r14.A0I     // Catch:{ all -> 0x0073 }
            X.Ac2 r4 = new X.Ac2     // Catch:{ all -> 0x0073 }
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0073 }
            r3.close()     // Catch:{ all -> 0x007a }
            r2.close()     // Catch:{ all -> 0x0081 }
            return r4
        L_0x006a:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x0073 }
            r3.close()     // Catch:{ all -> 0x007a }
            r2.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0087:
            java.lang.Throwable r3 = X.C30671eK.A00(r1)
            if (r3 == 0) goto L_0x0096
            X.1Qo r2 = r13.A00
            X.8oI r1 = X.AnonymousClass8oI.A09
            java.lang.String r0 = "getReportingInfoFromOldTable"
            r2.A01(r1, r0, r3)
        L_0x0096:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Qp.A01(X.1Qp, X.206):X.Ac2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.util.Set r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r8.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r2, r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r5 = r6.next()
            java.lang.String[] r5 = (java.lang.String[]) r5
            X.C18070vi.A0b(r5)
            X.1Cd r0 = r7.A01     // Catch:{ all -> 0x0059 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0059 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0052 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0052 }
            int r2 = r5.length     // Catch:{ all -> 0x0052 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "DELETE FROM reporting_info_content WHERE reporting_info_row_id IN (SELECT _id FROM reporting_info WHERE message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r2)     // Catch:{ all -> 0x0052 }
            r1.append(r0)     // Catch:{ all -> 0x0052 }
            r0 = 41
            r1.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "DELETE_REPORTING_INFO_CONTENT_FOR_MESSAGES"
            r3.A0F(r1, r0, r5)     // Catch:{ all -> 0x0052 }
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x0052 }
            r4.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005f
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x005f:
            java.lang.Throwable r3 = X.C30671eK.A00(r1)
            if (r3 == 0) goto L_0x0012
            X.1Qo r2 = r7.A00
            X.8oI r1 = X.AnonymousClass8oI.A09
            java.lang.String r0 = "deleteReportingInfoContentFor"
            r2.A01(r1, r0, r3)
            goto L_0x0012
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Qp.A05(java.util.Set):void");
    }

    private final String A02(AnonymousClass206 r4) {
        AnonymousClass205 r0;
        if (r4 instanceof AnonymousClass23N) {
            String str = ((AnonymousClass23N) r4).A01;
            if (str != null) {
                return str;
            }
            this.A00.A00(AnonymousClass8oI.A07, (String) null);
        }
        C691536c A002 = C60492o7.A00(r4);
        if (A002 != null) {
            r0 = A002.A02;
        } else {
            r0 = r4.A0v;
        }
        String str2 = r0.A01;
        C18070vi.A0X(str2);
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass206 r12) {
        /*
            r11 = this;
            java.lang.String r6 = "receive_timestamp"
            X.0ve r2 = r11.A02
            r1 = 5718(0x1656, float:8.013E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00bb
            X.Ac2 r5 = X.C196899vp.A00(r12)
            if (r5 == 0) goto L_0x00bb
            X.1Cd r0 = r11.A01     // Catch:{ all -> 0x00b1 }
            X.1au r2 = r0.A05()     // Catch:{ all -> 0x00b1 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00aa }
            r3.<init>()     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "message_row_id"
            long r0 = r12.A0x     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r3.put(r4, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_tag"
            byte[] r0 = r5.A03     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "stanza_id_text"
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "send_timestamp"
            long r0 = r5.A00     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r3.put(r4, r0)     // Catch:{ all -> 0x00aa }
            long r0 = r12.A0G     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r3.put(r6, r0)     // Catch:{ all -> 0x00aa }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00aa }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_info"
            java.lang.String r0 = "ReportingTokenStore/insertReportingInfo"
            long r9 = r4.A05(r1, r0, r3)     // Catch:{ all -> 0x00aa }
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
            byte[] r7 = r5.A04     // Catch:{ all -> 0x00aa }
            if (r7 != 0) goto L_0x006e
            byte[] r0 = r5.A05     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x006e
            java.lang.Integer r0 = r5.A01     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x006e
            goto L_0x00a6
        L_0x006e:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00aa }
            r3.<init>()     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_info_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "reporting_token"
            r3.put(r0, r7)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_token_content"
            byte[] r0 = r5.A05     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_token_version"
            java.lang.Integer r0 = r5.A01     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            long r0 = r12.A0G     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r3.put(r6, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_token_key"
            byte[] r0 = r5.A06     // Catch:{ all -> 0x00aa }
            r3.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "reporting_info_content"
            java.lang.String r0 = "ReportingTokenStore/insertReportingInfoContent"
            r4.A05(r1, r0, r3)     // Catch:{ all -> 0x00aa }
        L_0x00a6:
            r2.close()     // Catch:{ all -> 0x00b1 }
            return
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r3 = move-exception
            X.1Qo r2 = r11.A00
            X.8oI r1 = X.AnonymousClass8oI.A09
            java.lang.String r0 = "insertReportingInfo"
            r2.A01(r1, r0, r3)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Qp.A03(X.206):void");
    }

    public final void A04(AnonymousClass206 r4) {
        if (C18020vd.A05(C18040vf.A02, this.A02, 5718)) {
            C20948Ac2 A002 = A00(this, r4);
            if (A002 != null || (A002 = A01(this, r4)) != null) {
                C196899vp.A01(r4, A002);
            }
        }
    }
}
