package X;

import android.content.ContentValues;

/* renamed from: X.125  reason: invalid class name */
public class AnonymousClass125 implements C201511a {
    public final AnonymousClass190 A00;
    public final AnonymousClass1QZ A01;
    public final AnonymousClass1LW A02;
    public final C25961Qh A03;
    public final C25951Qg A04;
    public final AnonymousClass1DL A05;
    public final C25901Qb A06;
    public final AnonymousClass1N3 A07;
    public final C25321Nt A08;
    public final C25891Qa A09;
    public final AnonymousClass1Q6 A0A;
    public final AnonymousClass1Cd A0B;
    public final AnonymousClass1QX A0C;
    public final C25971Qi A0D;
    public final AnonymousClass1QR A0E;
    public final C25911Qc A0F;
    public final AnonymousClass1QU A0G;
    public final AnonymousClass1QY A0H;
    public final C25921Qd A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass1L7 A0N;
    public final C24621La A0O;
    public final AnonymousClass00H A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        X.CDX.A00(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02db, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0352, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        X.CDX.A00(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0356, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x038f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0393, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06cf, code lost:
        if (r6 == 0) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x086d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x086e, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0871, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0881, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0882, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0885, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x026f, B:131:0x037d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass125 r25, X.AnonymousClass206 r26, boolean r27) {
        /*
            r1 = r26
            X.206 r0 = r1.A0K()
            boolean r3 = r0 instanceof X.AnonymousClass218
            r2 = r25
            if (r3 == 0) goto L_0x00d8
            X.1Qb r10 = r2.A06
            r9 = r0
            X.218 r9 = (X.AnonymousClass218) r9
            long r3 = r1.A0x
            int r6 = r9.A0E()
            r5 = 2
            r13 = 0
            r7 = 1
            r8 = 0
            if (r6 != r5) goto L_0x001e
            r8 = 1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key="
            r6.append(r5)
            X.205 r5 = r9.A0v
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            X.C17960vV.A0G(r8, r5)
            X.1Cd r5 = r10.A01
            X.1au r14 = r5.A05()
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0648 }
            r8.<init>()     // Catch:{ all -> 0x0648 }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r8.put(r6, r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            double r5 = r9.A00     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.Double r6 = java.lang.Double.valueOf(r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = "latitude"
            r8.put(r5, r6)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            double r5 = r9.A01     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.Double r6 = java.lang.Double.valueOf(r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = "longitude"
            r8.put(r5, r6)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            boolean r5 = r9 instanceof X.AnonymousClass21B     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r11 = "url"
            java.lang.String r12 = "place_address"
            java.lang.String r10 = "place_name"
            if (r5 == 0) goto L_0x009c
            r6 = r9
            X.21B r6 = (X.AnonymousClass21B) r6     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = r6.A01     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            X.C63432t4.A01(r8, r10, r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = r6.A00     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            X.C63432t4.A01(r8, r12, r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = r6.A02     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            X.C63432t4.A01(r8, r11, r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
        L_0x007b:
            X.36u r5 = r9.A0O()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            byte[] r6 = r5.A01()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r5 = "thumbnail"
            X.C63432t4.A03(r8, r5, r6)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r5 = r14
            X.1av r5 = (X.C28801av) r5     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            X.1Ev r9 = r5.A02     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r6 = "message_quoted_location"
            java.lang.String r5 = "INSERT_MESSAGE_QUOTED_LOCATION_SQL"
            long r9 = r9.A06(r6, r5, r8)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L_0x00ab
            goto L_0x00aa
        L_0x009c:
            boolean r5 = r9 instanceof X.AnonymousClass219     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            if (r5 == 0) goto L_0x007b
            r8.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r8.putNull(r12)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r8.putNull(r11)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            goto L_0x007b
        L_0x00aa:
            r6 = 1
        L_0x00ab:
            java.lang.String r5 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r6, r5)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            goto L_0x00d5
        L_0x00b1:
            r6 = move-exception
            java.lang.String r5 = "message_row_id"
            r8.remove(r5)     // Catch:{ all -> 0x0648 }
            r5 = r14
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x0648 }
            X.1Ev r15 = r5.A02     // Catch:{ all -> 0x0648 }
            java.lang.String r17 = "message_quoted_location"
            java.lang.String r18 = "message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ all -> 0x0648 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0648 }
            r5[r13] = r3     // Catch:{ all -> 0x0648 }
            java.lang.String r19 = "UPDATE_MESSAGE_QUOTED_LOCATION_SQL"
            r20 = r5
            r16 = r8
            int r3 = r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0648 }
            if (r3 == r7) goto L_0x00d5
            throw r6     // Catch:{ all -> 0x0648 }
        L_0x00d5:
            r14.close()
        L_0x00d8:
            boolean r3 = r0 instanceof X.AnonymousClass21V
            if (r3 == 0) goto L_0x0276
            X.1Nt r9 = r2.A08
            r11 = r0
            X.21V r11 = (X.AnonymousClass21V) r11
            long r3 = r1.A0x
            r19 = r3
            int r4 = r11.A0E()
            r3 = 2
            r8 = 0
            r7 = 1
            r5 = 0
            if (r4 != r3) goto L_0x00f0
            r5 = 1
        L_0x00f0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/message in main storage; key="
            r4.append(r3)
            X.205 r6 = r11.A0v
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            X.C17960vV.A0G(r5, r3)
            X.1Cd r3 = r9.A02
            X.1au r18 = r3.A05()
            X.1xA r17 = r18.BD0()     // Catch:{ all -> 0x026e }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0264 }
            r5.<init>()     // Catch:{ all -> 0x0264 }
            boolean r3 = r11 instanceof X.C438921i     // Catch:{ all -> 0x0264 }
            r13 = 0
            if (r3 == 0) goto L_0x0219
            r4 = r11
            X.21i r4 = (X.C438921i) r4     // Catch:{ all -> 0x0264 }
            int r3 = r4.A00     // Catch:{ all -> 0x0264 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = r4.A01     // Catch:{ all -> 0x0264 }
            r26 = r3
            r16 = 0
        L_0x0129:
            X.36u r3 = r11.A0O()     // Catch:{ all -> 0x0264 }
            if (r3 == 0) goto L_0x0133
            byte[] r13 = r3.A01()     // Catch:{ all -> 0x0264 }
        L_0x0133:
            java.lang.String r3 = r11.A07     // Catch:{ all -> 0x0264 }
            r25 = r3
            java.lang.String r3 = r11.A06     // Catch:{ all -> 0x0264 }
            r24 = r3
            long r3 = r11.A01     // Catch:{ all -> 0x0264 }
            r22 = r3
            java.lang.String r15 = r11.A19()     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = r11.A05     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = r11.A08     // Catch:{ all -> 0x0264 }
            r21 = r3
            java.lang.String r10 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0264 }
            r5.put(r10, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r14 = "message_url"
            r3 = r25
            X.C63432t4.A01(r5, r14, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r14 = "mime_type"
            r3 = r24
            X.C63432t4.A01(r5, r14, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r14 = "file_length"
            java.lang.Long r3 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0264 }
            r5.put(r14, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "media_name"
            X.C63432t4.A01(r5, r3, r15)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "file_hash"
            X.C63432t4.A01(r5, r3, r4)     // Catch:{ all -> 0x0264 }
            java.lang.String r14 = "media_duration"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "page_count"
            if (r12 == 0) goto L_0x0210
            r5.put(r3, r12)     // Catch:{ all -> 0x0264 }
        L_0x0180:
            r5.put(r14, r4)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "enc_file_hash"
            r3 = r21
            X.C63432t4.A01(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "thumbnail"
            X.C63432t4.A03(r5, r3, r13)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "media_caption"
            r3 = r26
            X.C63432t4.A01(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            X.2rc r11 = r11.A02     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x01f7
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "media_job_uuid"
            java.lang.String r3 = r11.A0L     // Catch:{ all -> 0x0264 }
            X.C63432t4.A01(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "transferred"
            boolean r3 = r11.A0V     // Catch:{ all -> 0x0264 }
            X.C63432t4.A02(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            long r3 = r11.A0A     // Catch:{ all -> 0x0264 }
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "file_size"
            r5.put(r3, r4)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "media_key"
            byte[] r3 = r11.A0a     // Catch:{ all -> 0x0264 }
            X.C63432t4.A03(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            long r3 = r11.A0B     // Catch:{ all -> 0x0264 }
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "media_key_timestamp"
            r5.put(r3, r4)     // Catch:{ all -> 0x0264 }
            int r3 = r11.A08     // Catch:{ all -> 0x0264 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "width"
            r5.put(r3, r4)     // Catch:{ all -> 0x0264 }
            int r3 = r11.A06     // Catch:{ all -> 0x0264 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "height"
            r5.put(r3, r4)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "direct_path"
            java.lang.String r3 = r11.A0J     // Catch:{ all -> 0x0264 }
            X.C63432t4.A01(r5, r4, r3)     // Catch:{ all -> 0x0264 }
            java.io.File r11 = r11.A0G     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "file_path"
            if (r11 == 0) goto L_0x020c
            X.1L7 r3 = r9.A00     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = r3.A09(r11)     // Catch:{ all -> 0x0264 }
            r5.put(r4, r3)     // Catch:{ all -> 0x0264 }
        L_0x01f7:
            r3 = r18
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0264 }
            X.1Ev r11 = r3.A02     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = "message_quoted_media"
            java.lang.String r3 = "INSERT_MESSAGE_QUOTED_MEDIA_SQL"
            long r14 = r11.A05(r9, r3, r5)     // Catch:{ all -> 0x0264 }
            r12 = 0
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x0228
            goto L_0x0222
        L_0x020c:
            r5.putNull(r4)     // Catch:{ all -> 0x0264 }
            goto L_0x01f7
        L_0x0210:
            r5.put(r3, r4)     // Catch:{ all -> 0x0264 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0264 }
            goto L_0x0180
        L_0x0219:
            int r3 = r11.A0D     // Catch:{ all -> 0x0264 }
            r16 = r3
            r12 = r13
            r26 = r13
            goto L_0x0129
        L_0x0222:
            int r3 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0258
            r8 = 1
            goto L_0x0258
        L_0x0228:
            r5.remove(r10)     // Catch:{ all -> 0x0264 }
            java.lang.String r13 = "message_row_id = ?"
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0264 }
            r4[r8] = r3     // Catch:{ all -> 0x0264 }
            java.lang.String r14 = "UPDATE_MESSAGE_QUOTED_MEDIA_SQL"
            r10 = r11
            r11 = r5
            r12 = r9
            r15 = r4
            int r3 = r10.A02(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0264 }
            if (r3 == r7) goto L_0x025d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            r1.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/Failed to insert / update quoted media data; key="
            r1.append(r0)     // Catch:{ all -> 0x0264 }
            r1.append(r6)     // Catch:{ all -> 0x0264 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0264 }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0264 }
            r0.<init>(r1)     // Catch:{ all -> 0x0264 }
            throw r0     // Catch:{ all -> 0x0264 }
        L_0x0258:
            java.lang.String r3 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r8, r3)     // Catch:{ all -> 0x0264 }
        L_0x025d:
            r17.A00()     // Catch:{ all -> 0x0264 }
            r17.close()     // Catch:{ all -> 0x026e }
            goto L_0x0273
        L_0x0264:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0269 }
            goto L_0x026d
        L_0x0269:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x026e }
        L_0x026d:
            throw r1     // Catch:{ all -> 0x026e }
        L_0x026e:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0881 }
            throw r1
        L_0x0273:
            r18.close()
        L_0x0276:
            boolean r3 = r0 instanceof X.AnonymousClass22Q
            if (r3 == 0) goto L_0x02f1
            X.00H r3 = r2.A0M
            java.lang.Object r9 = r3.get()
            X.2sc r9 = (X.C63162sc) r9
            r7 = r0
            X.22Q r7 = (X.AnonymousClass22Q) r7
            long r3 = r1.A0x
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            int r6 = r7.A0E()
            r5 = 2
            r10 = 1
            r8 = 0
            if (r6 != r5) goto L_0x0295
            r8 = 1
        L_0x0295:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key="
            r6.append(r5)
            X.205 r5 = r7.A0v
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            X.C17960vV.A0G(r8, r5)
            X.1Cd r5 = r9.A00     // Catch:{ SQLiteConstraintException -> 0x02dc }
            X.1au r8 = r5.A05()     // Catch:{ SQLiteConstraintException -> 0x02dc }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x02d5 }
            r11.<init>()     // Catch:{ all -> 0x02d5 }
            X.C63162sc.A00(r11, r9, r7, r3)     // Catch:{ all -> 0x02d5 }
            r5 = r8
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x02d5 }
            X.1Ev r9 = r5.A02     // Catch:{ all -> 0x02d5 }
            java.lang.String r7 = "message_quoted_product"
            java.lang.String r6 = "INSERT_MESSAGE_QUOTED_PRODUCT_SQL"
            r5 = 5
            long r6 = r9.A09(r7, r6, r11, r5)     // Catch:{ all -> 0x02d5 }
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02cc
            r10 = 0
        L_0x02cc:
            java.lang.String r3 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r10, r3)     // Catch:{ all -> 0x02d5 }
            r8.close()     // Catch:{ SQLiteConstraintException -> 0x02dc }
            goto L_0x02f1
        L_0x02d5:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x02d7 }
        L_0x02d7:
            r3 = move-exception
            X.CDX.A00(r8, r4)     // Catch:{ SQLiteConstraintException -> 0x02dc }
            throw r3     // Catch:{ SQLiteConstraintException -> 0x02dc }
        L_0x02dc:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x02f1:
            boolean r3 = r0 instanceof X.AnonymousClass22S
            if (r3 == 0) goto L_0x036c
            X.00H r3 = r2.A0J
            java.lang.Object r9 = r3.get()
            X.2sN r9 = (X.C63022sN) r9
            r7 = r0
            X.22S r7 = (X.AnonymousClass22S) r7
            long r3 = r1.A0x
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            int r6 = r7.A0E()
            r5 = 2
            r10 = 1
            r8 = 0
            if (r6 != r5) goto L_0x0310
            r8 = 1
        L_0x0310:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key="
            r6.append(r5)
            X.205 r5 = r7.A0v
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            X.C17960vV.A0G(r8, r5)
            X.1Cd r5 = r9.A00     // Catch:{ SQLiteConstraintException -> 0x0357 }
            X.1au r8 = r5.A05()     // Catch:{ SQLiteConstraintException -> 0x0357 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0350 }
            r11.<init>()     // Catch:{ all -> 0x0350 }
            X.C63022sN.A00(r11, r9, r7, r3)     // Catch:{ all -> 0x0350 }
            r5 = r8
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x0350 }
            X.1Ev r9 = r5.A02     // Catch:{ all -> 0x0350 }
            java.lang.String r7 = "message_quoted_product"
            java.lang.String r6 = "INSERT_MESSAGE_QUOTED_CATALOG_SQL"
            r5 = 5
            long r6 = r9.A09(r7, r6, r11, r5)     // Catch:{ all -> 0x0350 }
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0347
            r10 = 0
        L_0x0347:
            java.lang.String r3 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r10, r3)     // Catch:{ all -> 0x0350 }
            r8.close()     // Catch:{ SQLiteConstraintException -> 0x0357 }
            goto L_0x036c
        L_0x0350:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r3 = move-exception
            X.CDX.A00(r8, r4)     // Catch:{ SQLiteConstraintException -> 0x0357 }
            throw r3     // Catch:{ SQLiteConstraintException -> 0x0357 }
        L_0x0357:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x036c:
            boolean r3 = r0 instanceof X.AnonymousClass23S
            if (r3 == 0) goto L_0x0397
            X.1Qh r7 = r2.A03
            r6 = r0
            X.23S r6 = (X.AnonymousClass23S) r6
            long r3 = r1.A0x
            X.1Cd r5 = r7.A01
            X.1au r8 = r5.A05()
            android.content.ContentValues r7 = X.C25961Qh.A00(r7, r6, r3)     // Catch:{ all -> 0x038f }
            r3 = r8
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x038f }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x038f }
            java.lang.String r5 = "message_quoted_group_invite"
            java.lang.String r4 = "INSERT_QUOTED_GROUP_INVITE_MESSAGE_SQL"
            r3 = 5
            r6.A09(r5, r4, r7, r3)     // Catch:{ all -> 0x038f }
            goto L_0x0394
        L_0x038f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0881 }
            throw r1
        L_0x0394:
            r8.close()
        L_0x0397:
            boolean r3 = r0 instanceof X.AnonymousClass22U
            if (r3 == 0) goto L_0x04b1
            X.1QX r10 = r2.A0C
            r7 = r0
            X.22U r7 = (X.AnonymousClass22U) r7
            long r4 = r1.A0x
            int r6 = r7.A0E()
            r3 = 2
            r8 = 1
            r9 = 0
            if (r6 != r3) goto L_0x03ac
            r9 = 1
        L_0x03ac:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/message in main storage; key="
            r6.append(r3)
            X.205 r3 = r7.A0v
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            X.C17960vV.A0G(r9, r3)
            X.1Cd r3 = r10.A01     // Catch:{ SQLiteConstraintException -> 0x049c }
            X.1au r12 = r3.A05()     // Catch:{ SQLiteConstraintException -> 0x049c }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0492 }
            r9.<init>()     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0492 }
            r9.put(r6, r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "order_id"
            java.lang.String r3 = r7.A08     // Catch:{ all -> 0x0492 }
            X.C63432t4.A01(r9, r6, r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "order_title"
            java.lang.String r3 = r7.A09     // Catch:{ all -> 0x0492 }
            X.C63432t4.A01(r9, r6, r3)     // Catch:{ all -> 0x0492 }
            int r3 = r7.A00     // Catch:{ all -> 0x0492 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "item_count"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
            int r3 = r7.A01     // Catch:{ all -> 0x0492 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "message_version"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
            int r3 = r7.A02     // Catch:{ all -> 0x0492 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "status"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
            int r3 = r7.A03     // Catch:{ all -> 0x0492 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "surface"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "catalog_type"
            java.lang.String r3 = r7.A05     // Catch:{ all -> 0x0492 }
            r9.put(r6, r3)     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "message"
            java.lang.String r3 = r7.A07     // Catch:{ all -> 0x0492 }
            X.C63432t4.A01(r9, r6, r3)     // Catch:{ all -> 0x0492 }
            com.whatsapp.jid.UserJid r3 = r7.A04     // Catch:{ all -> 0x0492 }
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass1QX.A00(r10, r3)     // Catch:{ all -> 0x0492 }
            if (r6 == 0) goto L_0x0438
            X.1DL r3 = r10.A00     // Catch:{ all -> 0x0492 }
            long r10 = r3.A09(r6)     // Catch:{ all -> 0x0492 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "seller_jid"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
        L_0x0438:
            java.lang.String r6 = "token"
            java.lang.String r3 = r7.A0A     // Catch:{ all -> 0x0492 }
            X.C63432t4.A01(r9, r6, r3)     // Catch:{ all -> 0x0492 }
            X.36u r3 = r7.A0O()     // Catch:{ all -> 0x0492 }
            if (r3 == 0) goto L_0x0454
            X.36u r3 = r7.A0O()     // Catch:{ all -> 0x0492 }
            byte[] r6 = r3.A01()     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "thumbnail"
            X.C63432t4.A03(r9, r3, r6)     // Catch:{ all -> 0x0492 }
        L_0x0454:
            java.lang.String r6 = r7.A06     // Catch:{ all -> 0x0492 }
            if (r6 == 0) goto L_0x0477
            java.math.BigDecimal r3 = r7.A0B     // Catch:{ all -> 0x0492 }
            if (r3 == 0) goto L_0x0477
            java.lang.String r3 = "currency_code"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
            java.math.BigDecimal r6 = r7.A0B     // Catch:{ all -> 0x0492 }
            java.math.BigDecimal r3 = X.C197309wU.A00     // Catch:{ all -> 0x0492 }
            java.math.BigDecimal r3 = r6.multiply(r3)     // Catch:{ all -> 0x0492 }
            long r6 = r3.longValue()     // Catch:{ all -> 0x0492 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0492 }
            java.lang.String r3 = "total_amount_1000"
            r9.put(r3, r6)     // Catch:{ all -> 0x0492 }
        L_0x0477:
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0492 }
            X.1Ev r7 = r3.A02     // Catch:{ all -> 0x0492 }
            java.lang.String r6 = "message_quoted_order"
            java.lang.String r3 = "INSERT_MESSAGE_QUOTED_ORDER_SQL"
            long r6 = r7.A06(r6, r3, r9)     // Catch:{ all -> 0x0492 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0489
            r8 = 0
        L_0x0489:
            java.lang.String r3 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r8, r3)     // Catch:{ all -> 0x0492 }
            r12.close()     // Catch:{ SQLiteConstraintException -> 0x049c }
            goto L_0x04b1
        L_0x0492:
            r4 = move-exception
            r12.close()     // Catch:{ all -> 0x0497 }
            goto L_0x049b
        L_0x0497:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r4, r3)     // Catch:{ SQLiteConstraintException -> 0x049c }
        L_0x049b:
            throw r4     // Catch:{ SQLiteConstraintException -> 0x049c }
        L_0x049c:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/fail to insert. Error message is: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x04b1:
            boolean r3 = r0 instanceof X.AnonymousClass21K
            if (r3 == 0) goto L_0x0543
            X.1Qg r10 = r2.A04
            r5 = r0
            X.21K r5 = (X.AnonymousClass21K) r5
            long r14 = r1.A0x
            X.AEt r3 = r5.BPK()
            if (r3 == 0) goto L_0x0543
            X.1Cd r3 = r10.A01     // Catch:{ SQLiteConstraintException -> 0x052e }
            X.1au r8 = r3.A05()     // Catch:{ SQLiteConstraintException -> 0x052e }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0524 }
            r9.<init>()     // Catch:{ all -> 0x0524 }
            java.lang.String r4 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0524 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0524 }
            java.lang.String r4 = "element_type"
            X.AEt r3 = r5.BPK()     // Catch:{ all -> 0x0524 }
            int r3 = r10.A0B(r3)     // Catch:{ all -> 0x0524 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0524 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0524 }
            X.AEt r7 = r5.BPK()     // Catch:{ all -> 0x0524 }
            X.0ve r6 = r10.A02     // Catch:{ all -> 0x0524 }
            r4 = 10208(0x27e0, float:1.4304E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ all -> 0x0524 }
            boolean r4 = X.C18020vd.A05(r3, r6, r4)     // Catch:{ all -> 0x0524 }
            r3 = 0
            X.C18070vi.A0d(r7, r3)     // Catch:{ all -> 0x0524 }
            org.json.JSONObject r3 = X.AnonymousClass9QU.A00(r7, r4)     // Catch:{ all -> 0x0524 }
            if (r3 == 0) goto L_0x051e
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x0524 }
        L_0x0503:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0524 }
            if (r3 != 0) goto L_0x050e
            java.lang.String r3 = "element_content"
            r9.put(r3, r4)     // Catch:{ all -> 0x0524 }
        L_0x050e:
            java.lang.String r11 = "message_quoted_ui_elements"
            java.lang.String r12 = "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage"
            X.AEt r3 = r5.BPK()     // Catch:{ all -> 0x0524 }
            int r13 = r10.A0B(r3)     // Catch:{ all -> 0x0524 }
            X.C25951Qg.A04(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0524 }
            goto L_0x0520
        L_0x051e:
            r4 = 0
            goto L_0x0503
        L_0x0520:
            r8.close()     // Catch:{ SQLiteConstraintException -> 0x052e }
            goto L_0x0543
        L_0x0524:
            r4 = move-exception
            r8.close()     // Catch:{ all -> 0x0529 }
            goto L_0x052d
        L_0x0529:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r4, r3)     // Catch:{ SQLiteConstraintException -> 0x052e }
        L_0x052d:
            throw r4     // Catch:{ SQLiteConstraintException -> 0x052e }
        L_0x052e:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/fail to insert. Error quotedMessage is: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x0543:
            boolean r3 = r0 instanceof X.C438721g
            if (r3 == 0) goto L_0x0594
            X.1Qg r9 = r2.A04
            r5 = r0
            X.21g r5 = (X.C438721g) r5
            long r13 = r1.A0x
            java.lang.String r10 = "message_quoted_ui_elements_reply"
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            X.AEb r6 = r5.A00
            if (r6 == 0) goto L_0x0582
            int r7 = X.C25951Qg.A00(r5)
            java.lang.String r4 = "element_type"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r8.put(r4, r3)
            java.lang.String r4 = "reply_values"
            java.lang.String r3 = r6.A05
            r8.put(r4, r3)
            r3 = 8
            java.lang.String r4 = "reply_description"
            if (r7 != r3) goto L_0x05ec
            X.00H r3 = r9.A04
            java.lang.Object r3 = r3.get()
            X.166 r3 = (X.AnonymousClass166) r3
            java.lang.String r3 = r3.A01(r6)
        L_0x057f:
            r8.put(r4, r3)
        L_0x0582:
            java.lang.String r4 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r8.put(r4, r3)
            java.lang.String r11 = "MessageUIElementsStore/insertOrUpdateQuoteResponseMessage"
            int r12 = X.C25951Qg.A00(r5)
            X.C25951Qg.A04(r8, r9, r10, r11, r12, r13)
        L_0x0594:
            boolean r3 = r0 instanceof X.AnonymousClass21T
            if (r3 == 0) goto L_0x05cf
            X.1Qg r7 = r2.A04
            r5 = r0
            X.21T r5 = (X.AnonymousClass21T) r5
            long r11 = r1.A0x
            java.lang.String r8 = "message_quoted_ui_elements_reply"
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "element_type"
            r6.put(r3, r4)
            java.lang.String r4 = "reply_values"
            java.lang.String r3 = r5.A0P()
            r6.put(r4, r3)
            java.lang.String r4 = "reply_description"
            java.lang.String r3 = r5.A00
            r6.put(r4, r3)
            java.lang.String r4 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r6.put(r4, r3)
            java.lang.String r9 = "MessageUIElementsStore/insertOrUpdateQuoteButtonsResponseMessage"
            r10 = 2
            X.C25951Qg.A04(r6, r7, r8, r9, r10, r11)
        L_0x05cf:
            if (r0 == 0) goto L_0x0667
            boolean r3 = r0.A0s()
            if (r3 == 0) goto L_0x0650
            X.1Qa r10 = r2.A09
            long r4 = r1.A0x
            java.util.List r6 = r0.A0h
            if (r6 == 0) goto L_0x0650
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x0650
            X.1Cd r3 = r10.A03
            X.1au r14 = r3.A05()
            goto L_0x05ef
        L_0x05ec:
            java.lang.String r3 = r6.A04
            goto L_0x057f
        L_0x05ef:
            X.1xA r13 = r14.BD0()     // Catch:{ all -> 0x0648 }
            java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x063e }
        L_0x05f7:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x063e }
            if (r3 == 0) goto L_0x0637
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x063e }
            X.3Bi r11 = (X.C70503Bi) r11     // Catch:{ all -> 0x063e }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x063e }
            r9.<init>()     // Catch:{ all -> 0x063e }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x063e }
            r9.put(r6, r3)     // Catch:{ all -> 0x063e }
            java.lang.String r8 = "jid_row_id"
            X.1DL r6 = r10.A02     // Catch:{ all -> 0x063e }
            X.1BI r3 = r11.A00     // Catch:{ all -> 0x063e }
            long r6 = r6.A09(r3)     // Catch:{ all -> 0x063e }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x063e }
            r9.put(r8, r3)     // Catch:{ all -> 0x063e }
            java.lang.String r6 = "display_name"
            java.lang.String r3 = r11.A01     // Catch:{ all -> 0x063e }
            r9.put(r6, r3)     // Catch:{ all -> 0x063e }
            r3 = r14
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x063e }
            X.1Ev r8 = r3.A02     // Catch:{ all -> 0x063e }
            java.lang.String r7 = "message_quoted_mentions"
            java.lang.String r6 = "INSERT_TABLE_QUOTED_MESSAGE_MENTIONS"
            r3 = 4
            r8.A09(r7, r6, r9, r3)     // Catch:{ all -> 0x063e }
            goto L_0x05f7
        L_0x0637:
            r13.A00()     // Catch:{ all -> 0x063e }
            r13.close()     // Catch:{ all -> 0x0648 }
            goto L_0x064d
        L_0x063e:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0643 }
            goto L_0x0647
        L_0x0643:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0648 }
        L_0x0647:
            throw r1     // Catch:{ all -> 0x0648 }
        L_0x0648:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0881 }
            throw r1
        L_0x064d:
            r14.close()
        L_0x0650:
            r3 = 8
            boolean r3 = r0.A0z(r3)
            if (r3 == 0) goto L_0x0667
            X.1Qg r7 = r2.A04
            X.2b7 r3 = r0.A0L()
            X.9rz r6 = r3.A00
            long r3 = r1.A0x
            java.lang.String r5 = "message_quoted_ui_elements"
            X.C25951Qg.A06(r7, r6, r5, r3)
        L_0x0667:
            boolean r3 = r0 instanceof X.C442222p
            if (r3 == 0) goto L_0x06df
            X.1QY r7 = r2.A0H
            r5 = r0
            X.22p r5 = (X.C442222p) r5
            long r3 = r1.A0x
            java.lang.String r6 = r5.A17()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x067f
            X.AnonymousClass1QY.A01(r7, r6, r3)
        L_0x067f:
            boolean r3 = r0 instanceof X.AnonymousClass210
            if (r3 == 0) goto L_0x0784
            X.1QU r10 = r2.A0G
            long r3 = r1.A0x
            X.205 r8 = r0.A0v
            java.lang.Boolean r5 = X.C17960vV.A01
            r11 = 0
            r7 = 1
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r9 = 0
            if (r5 <= 0) goto L_0x0694
            r9 = 1
        L_0x0694:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key="
            r6.append(r5)
            r6.append(r8)
            java.lang.String r5 = r6.toString()
            X.C17960vV.A0G(r9, r5)
            int r6 = r0.A0E()
            r5 = 2
            if (r6 == r5) goto L_0x06b0
            r7 = 0
        L_0x06b0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="
            r6.append(r5)
            r6.append(r8)
            java.lang.String r5 = r6.toString()
            X.C17960vV.A0G(r7, r5)
            r7 = r0
            X.210 r7 = (X.AnonymousClass210) r7
            byte[] r5 = r7.A1A()
            if (r5 == 0) goto L_0x06d1
            int r6 = r5.length
            r5 = 1
            if (r6 != 0) goto L_0x06d2
        L_0x06d1:
            r5 = 0
        L_0x06d2:
            java.lang.String r13 = "message_quoted_text"
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x075f
            X.1Cd r5 = r10.A00
            X.1au r10 = r5.A05()
            goto L_0x071d
        L_0x06df:
            boolean r3 = r0 instanceof X.C442022n
            if (r3 == 0) goto L_0x067f
            X.1QY r8 = r2.A0H
            r5 = r0
            X.22n r5 = (X.C442022n) r5
            long r3 = r1.A0x
            java.util.List r6 = r5.A17()
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x067f
            X.1Cd r5 = r8.A06
            X.1au r9 = r5.A05()
            X.1xA r7 = r9.BD0()     // Catch:{ all -> 0x087c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0872 }
        L_0x0702:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x0872 }
            if (r5 == 0) goto L_0x0712
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0872 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0872 }
            X.AnonymousClass1QY.A01(r8, r5, r3)     // Catch:{ all -> 0x0872 }
            goto L_0x0702
        L_0x0712:
            r7.A00()     // Catch:{ all -> 0x0872 }
            r7.close()     // Catch:{ all -> 0x087c }
            r9.close()
            goto L_0x067f
        L_0x071d:
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x077c }
            r12.<init>()     // Catch:{ all -> 0x077c }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x077c }
            r12.put(r6, r5)     // Catch:{ all -> 0x077c }
            java.lang.String r6 = "thumbnail"
            byte[] r5 = r7.A1A()     // Catch:{ all -> 0x077c }
            X.C63432t4.A03(r12, r6, r5)     // Catch:{ all -> 0x077c }
            r5 = r10
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x077c }
            X.1Ev r11 = r5.A02     // Catch:{ all -> 0x077c }
            java.lang.String r14 = "message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x077c }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x077c }
            r6[r8] = r5     // Catch:{ all -> 0x077c }
            java.lang.String r15 = "UPDATE_MESSAGE_QUOTED_TEXT_SQL"
            r16 = r6
            int r5 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x077c }
            if (r5 == r9) goto L_0x0781
            java.lang.String r5 = "INSERT_MESSAGE_QUOTED_TEXT_SQL"
            long r6 = r11.A06(r13, r5, r12)     // Catch:{ all -> 0x077c }
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0759
            r8 = 1
        L_0x0759:
            java.lang.String r3 = "TextMessageStore/insertOrUpdateQuotedTextMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r8, r3)     // Catch:{ all -> 0x077c }
            goto L_0x0781
        L_0x075f:
            if (r27 == 0) goto L_0x0784
            X.1Cd r5 = r10.A00
            X.1au r10 = r5.A05()
            r5 = r10
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x077c }
            X.1Ev r7 = r5.A02     // Catch:{ all -> 0x077c }
            java.lang.String r6 = "message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x077c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x077c }
            r5[r8] = r3     // Catch:{ all -> 0x077c }
            java.lang.String r3 = "DELETE_MESSAGE_QUOTED_TEXT_SQL"
            r7.A04(r13, r6, r3, r5)     // Catch:{ all -> 0x077c }
            goto L_0x0781
        L_0x077c:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0881 }
            throw r1
        L_0x0781:
            r10.close()
        L_0x0784:
            boolean r3 = r0 instanceof X.AnonymousClass21D
            if (r3 == 0) goto L_0x079a
            X.1Qi r4 = r2.A0D
            r3 = r0
            X.21D r3 = (X.AnonymousClass21D) r3
            long r8 = r1.A0x
            int r7 = r3.A00
            long r10 = r3.A01
            java.lang.String r6 = "INSERT_QUOTED_PAYMENT_INVITE"
            java.lang.String r5 = "message_quoted_payment_invite"
            X.C25971Qi.A01(r4, r5, r6, r7, r8, r10)
        L_0x079a:
            boolean r3 = r0 instanceof X.AnonymousClass23W
            if (r3 == 0) goto L_0x07e7
            X.1Qd r3 = r2.A0I
            r8 = r0
            X.23W r8 = (X.AnonymousClass23W) r8
            long r5 = r1.A0x
            X.1Cd r3 = r3.A00
            X.1au r9 = r3.A05()
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x087c }
            r7.<init>()     // Catch:{ all -> 0x087c }
            java.lang.String r4 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x087c }
            r7.put(r4, r3)     // Catch:{ all -> 0x087c }
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x087c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x087c }
            if (r3 != 0) goto L_0x07c8
            java.lang.String r4 = "parent_group_jid"
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x087c }
            r7.put(r4, r3)     // Catch:{ all -> 0x087c }
        L_0x07c8:
            java.lang.String r3 = r8.A00     // Catch:{ all -> 0x087c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x087c }
            if (r3 != 0) goto L_0x07d7
            java.lang.String r4 = "group_subject"
            java.lang.String r3 = r8.A00     // Catch:{ all -> 0x087c }
            r7.put(r4, r3)     // Catch:{ all -> 0x087c }
        L_0x07d7:
            r3 = r9
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x087c }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x087c }
            java.lang.String r5 = "message_quoted_blank_reply"
            java.lang.String r4 = "INSERT_QUOTED_BLANK_REPLY"
            r3 = 5
            r6.A09(r5, r4, r7, r3)     // Catch:{ all -> 0x087c }
            r9.close()
        L_0x07e7:
            boolean r3 = r0 instanceof X.AnonymousClass22M
            if (r3 == 0) goto L_0x0810
            X.00H r2 = r2.A0L
            java.lang.Object r2 = r2.get()
            X.2jc r2 = (X.C57772jc) r2
            X.22M r0 = (X.AnonymousClass22M) r0
            long r3 = r1.A0x
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.00H r1 = r2.A04
            java.lang.Object r2 = r1.get()
            X.2hx r2 = (X.C56742hx) r2
            X.25F r1 = r0.A00
            X.229 r7 = r1.A02
            X.9Bw r7 = (X.C178119Bw) r7
            if (r7 != 0) goto L_0x0811
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0810:
            return
        L_0x0811:
            X.1Cd r1 = r2.A00
            X.1au r6 = r1.A05()
            r1 = 3
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x086b }
            r5.<init>(r1)     // Catch:{ all -> 0x086b }
            java.lang.String r2 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x086b }
            r5.put(r2, r1)     // Catch:{ all -> 0x086b }
            java.lang.String r2 = "video_call"
            boolean r1 = r7.A0J     // Catch:{ all -> 0x086b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x086b }
            r5.put(r2, r1)     // Catch:{ all -> 0x086b }
            java.lang.String r2 = "call_result"
            int r1 = r7.A06     // Catch:{ all -> 0x086b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x086b }
            r5.put(r2, r1)     // Catch:{ all -> 0x086b }
            r1 = r6
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x086b }
            X.1Ev r4 = r1.A02     // Catch:{ all -> 0x086b }
            java.lang.String r3 = "message_quoted_call_log"
            java.lang.String r2 = "INSERT_OR_UPDATE_QUOTED_CALL_LOG_MESSAGE"
            r1 = 5
            long r4 = r4.A09(r3, r2, r5, r1)     // Catch:{ all -> 0x086b }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0867
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x086b }
            r2.<init>()     // Catch:{ all -> 0x086b }
            java.lang.String r1 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog/insert error, rowId="
            r2.append(r1)     // Catch:{ all -> 0x086b }
            long r0 = r0.A0x     // Catch:{ all -> 0x086b }
            r2.append(r0)     // Catch:{ all -> 0x086b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x086b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x086b }
        L_0x0867:
            r6.close()
            return
        L_0x086b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x086d }
        L_0x086d:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0872:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0877 }
            goto L_0x087b
        L_0x0877:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x087c }
        L_0x087b:
            throw r1     // Catch:{ all -> 0x087c }
        L_0x087c:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0881 }
            throw r1
        L_0x0881:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass125.A00(X.125, X.206, boolean):void");
    }

    public AnonymousClass125(AnonymousClass190 r2, AnonymousClass1QZ r3, AnonymousClass1L7 r4, AnonymousClass1LW r5, C25961Qh r6, C25951Qg r7, AnonymousClass1DL r8, C25901Qb r9, AnonymousClass1N3 r10, C25321Nt r11, C25891Qa r12, AnonymousClass1Q6 r13, AnonymousClass1Cd r14, AnonymousClass1QX r15, C25971Qi r16, AnonymousClass1QR r17, C24621La r18, C25911Qc r19, AnonymousClass1QU r20, AnonymousClass1QY r21, C25921Qd r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27) {
        this.A05 = r8;
        this.A02 = r5;
        this.A00 = r2;
        this.A0N = r4;
        this.A07 = r10;
        this.A0G = r20;
        this.A0P = r23;
        this.A0C = r15;
        this.A0O = r18;
        this.A0H = r21;
        this.A01 = r3;
        this.A0J = r24;
        this.A09 = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A0M = r25;
        this.A06 = r9;
        this.A0F = r19;
        this.A08 = r11;
        this.A0I = r22;
        this.A04 = r7;
        this.A03 = r6;
        this.A0E = r17;
        this.A0K = r26;
        this.A0D = r16;
        this.A0L = r27;
    }

    public void A01(AnonymousClass206 r14) {
        long j;
        C28791au A052;
        AnonymousClass206 A0K2 = r14.A0K();
        if (A0K2 != null) {
            boolean z = false;
            if (A0K2.A0E() == 2) {
                z = true;
            }
            C17960vV.A0D(z);
            C28791au A053 = this.A0B.A05();
            try {
                C41851xA BD0 = A053.BD0();
                try {
                    long j2 = r14.A0x;
                    AnonymousClass1BI r10 = r14.A0v.A00;
                    C17960vV.A07(r10);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(j2));
                    AnonymousClass1LW r8 = this.A02;
                    long A092 = r8.A09(r10);
                    contentValues.put("parent_message_chat_row_id", Long.valueOf(A092));
                    AnonymousClass205 r2 = A0K2.A0v;
                    AnonymousClass1BI r0 = r2.A00;
                    if (r0 != null) {
                        C17960vV.A07(r0);
                        A092 = r8.A09(r0);
                    } else {
                        C17960vV.A0F(C22971Dz.A0d(r10), "Quoted message chatJid is not specified, parentJid is not a UserJid.");
                    }
                    contentValues.put("chat_row_id", Long.valueOf(A092));
                    contentValues.put("from_me", Integer.valueOf(r2.A02 ? 1 : 0));
                    AnonymousClass1BI A0H2 = A0K2.A0H();
                    if (A0H2 == null) {
                        j = 0;
                    } else {
                        j = this.A05.A09(A0H2);
                    }
                    contentValues.put("sender_jid_row_id", Long.valueOf(j));
                    contentValues.put("key_id", r2.A01);
                    contentValues.put("timestamp", Long.valueOf(A0K2.A0I));
                    contentValues.put("message_type", Integer.valueOf(A0K2.A0u));
                    contentValues.put("origin", Integer.valueOf(A0K2.A09));
                    contentValues.put("text_data", A0K2.A0R());
                    contentValues.put("payment_transaction_id", AnonymousClass25B.A01(A0K2));
                    contentValues.put("lookup_tables", Long.valueOf(A0K2.A0F()));
                    ((C28801av) A053).A02.A08("message_quoted", "INSERT_TABLE_MESSAGE_QUOTED", contentValues);
                    A00(this, r14, false);
                    if (A0K2 instanceof C439421n) {
                        C25911Qc r7 = this.A0F;
                        C439421n r9 = (C439421n) A0K2;
                        long j3 = r14.A0x;
                        boolean z2 = true;
                        boolean z3 = false;
                        if (j3 > 0) {
                            z3 = true;
                        }
                        C17960vV.A0G(z3, "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
                        A052 = r7.A00.A05();
                        C58072k6 BaE = r9.BaE();
                        ContentValues contentValues2 = new ContentValues(3);
                        contentValues2.put("message_row_id", Long.valueOf(j3));
                        contentValues2.put("content_text_data", BaE.A02);
                        contentValues2.put("footer_text_data", BaE.A03);
                        if (j3 != ((C28801av) A052).A02.A09("message_template_quoted", "INSERT_TEMPLATE_QUOTED_SQL", contentValues2, 5)) {
                            z2 = false;
                        }
                        C17960vV.A0H(z2, "TemplateMessageStore/insertOrUpdateTemplateQuotedData/inserted row should have same row_id");
                        A052.close();
                    }
                    BD0.A00();
                    BD0.close();
                    A053.close();
                    return;
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A053.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
