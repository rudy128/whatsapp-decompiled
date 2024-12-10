package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2qv  reason: invalid class name and case insensitive filesystem */
public class C62182qv {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C218617r A03;
    public final AnonymousClass11S A04;
    public final C32191gn A05;
    public final AnonymousClass1M9 A06;
    public final C24921Me A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass118 A09;
    public final C18000vb A0A;
    public final AnonymousClass1LW A0B;
    public final AnonymousClass1Cd A0C;
    public final AnonymousClass1QR A0D;
    public final C18030ve A0E;
    public final AnonymousClass1R2 A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public static void A00(AnonymousClass118 r2, StringBuilder sb, Object[] objArr, int i) {
        sb.append(r2.A02(i, objArr));
        sb.append("\n");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0197, code lost:
        if (r4.contains(r14) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x022d, code lost:
        if (r8 == null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0414, code lost:
        X.C17880vN.A1A(r5.A09.A00, r3, 2131889225);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06b0, code lost:
        if (r0 != null) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x07be, code lost:
        if (r20 == null) goto L_0x07c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x086b, code lost:
        if (r0 == false) goto L_0x086d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0192 A[Catch:{ IOException -> 0x01c6, all -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01bf A[Catch:{ IOException -> 0x01c6, all -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01e7 A[SYNTHETIC, Splitter:B:140:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x024b A[SYNTHETIC, Splitter:B:185:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x067b A[Catch:{ IOException -> 0x0788, all -> 0x07b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06ed A[Catch:{ IOException -> 0x0788, all -> 0x07b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x077a A[SYNTHETIC, Splitter:B:408:0x077a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C61372pZ A01(X.AnonymousClass1BI r31, java.lang.String r32, boolean r33) {
        /*
            r30 = this;
            X.1Ez r25 = new X.1Ez
            r6 = 0
            r0 = r25
            r0.<init>((boolean) r6)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "EmailMessageStore/loadMessagesForEmail/"
            r29 = r31
            r0 = r29
            java.lang.String r1 = X.AnonymousClass001.A1E(r0, r1, r2)
            r0 = r25
            r0.A05(r1)
            r5 = r30
            X.17r r11 = r5.A03
            r0 = r32
            java.io.File r15 = r11.A0U(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r10 = 0
            if (r33 == 0) goto L_0x0034
            int r9 = r5.A00
        L_0x002e:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0037
        L_0x0034:
            int r9 = r5.A01
            goto L_0x002e
        L_0x0037:
            X.1Cd r0 = r5.A0C     // Catch:{ SQLiteException -> 0x0242 }
            X.1at r28 = r0.get()     // Catch:{ SQLiteException -> 0x0242 }
            r0 = r28
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0238 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0238 }
            java.lang.String r2 = X.AnonymousClass203.A09     // Catch:{ all -> 0x0238 }
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0238 }
            X.1LW r7 = r5.A0B     // Catch:{ all -> 0x0238 }
            r0 = r29
            X.AnonymousClass1LW.A03(r7, r0, r1, r6)     // Catch:{ all -> 0x0238 }
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0238 }
            r0 = 1
            r1[r0] = r7     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SAMPLE_SQL"
            android.database.Cursor r8 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0238 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0225
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ all -> 0x022c }
            r18 = 0
            r3 = 0
        L_0x006a:
            X.00H r0 = r5.A0G     // Catch:{ all -> 0x022c }
            X.1W6 r1 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x022c }
            r0 = r29
            X.206 r2 = r1.A02(r8, r0)     // Catch:{ all -> 0x022c }
            if (r2 == 0) goto L_0x021a
            int r1 = r2.A0u     // Catch:{ all -> 0x022c }
            r0 = 88
            if (r1 == r0) goto L_0x021a
            r0 = 87
            if (r1 == r0) goto L_0x021a
            int r3 = r3 + 1
            r12 = 128(0x80, double:6.32E-322)
            long r18 = r18 + r12
            r0 = 1
            r24 = 0
            r26 = 0
            if (r1 == r0) goto L_0x019c
            r0 = 2
            if (r1 == r0) goto L_0x019c
            r0 = 3
            if (r1 == r0) goto L_0x019c
            r0 = 4
            if (r1 == r0) goto L_0x00d6
            r0 = 9
            if (r1 == r0) goto L_0x019c
            r0 = 20
            if (r1 == r0) goto L_0x019c
            r0 = 23
            if (r1 == r0) goto L_0x019c
            r0 = 37
            if (r1 == r0) goto L_0x019c
            r0 = 81
            if (r1 == r0) goto L_0x01cc
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x019c
            r0 = 13
            if (r1 == r0) goto L_0x019c
            r0 = 14
            if (r1 == r0) goto L_0x00d6
            r0 = 25
            if (r1 == r0) goto L_0x019c
            r0 = 26
            if (r1 == r0) goto L_0x019c
            r0 = 28
            if (r1 == r0) goto L_0x019c
            r0 = 29
            if (r1 == r0) goto L_0x019c
            boolean r0 = r2.A0r()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x01cc
            byte[] r0 = r2.A12()     // Catch:{ all -> 0x022c }
            int r0 = r0.length     // Catch:{ all -> 0x022c }
            long r0 = (long) r0     // Catch:{ all -> 0x022c }
            goto L_0x01c3
        L_0x00d6:
            boolean r13 = r2 instanceof X.C442222p     // Catch:{ all -> 0x022c }
            if (r13 == 0) goto L_0x011f
            r0 = r2
            X.22p r0 = (X.C442222p) r0     // Catch:{ all -> 0x022c }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x022c }
        L_0x00df:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x022c }
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x00ed
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r14.replaceAll(r0, r1)     // Catch:{ all -> 0x022c }
        L_0x00ed:
            r12.append(r1)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = ".vcf"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r12)     // Catch:{ all -> 0x022c }
            java.io.File r0 = r11.A0G()     // Catch:{ all -> 0x022c }
            java.io.File r14 = X.C218617r.A02(r0, r1)     // Catch:{ all -> 0x022c }
            boolean r0 = r14.exists()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0118
            long r22 = r14.lastModified()     // Catch:{ all -> 0x022c }
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022c }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r20 = r20 - r0
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x0118
            X.C64062u9.A0Q(r14)     // Catch:{ all -> 0x022c }
        L_0x0118:
            boolean r0 = r14.exists()     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x0193
            goto L_0x012c
        L_0x011f:
            boolean r0 = r2 instanceof X.C442022n     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0129
            r0 = r2
            X.22n r0 = (X.C442022n) r0     // Catch:{ all -> 0x022c }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x022c }
            goto L_0x00df
        L_0x0129:
            r14 = r24
            goto L_0x00df
        L_0x012c:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0186 }
            r12.<init>(r14)     // Catch:{ IOException -> 0x0186 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x017c }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x017c }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x017c }
            if (r13 == 0) goto L_0x013b
            goto L_0x0158
        L_0x013b:
            boolean r1 = r2 instanceof X.C442022n     // Catch:{ all -> 0x0172 }
            if (r1 == 0) goto L_0x0168
            r1 = r2
            X.22n r1 = (X.C442022n) r1     // Catch:{ all -> 0x0172 }
            java.util.List r1 = r1.A17()     // Catch:{ all -> 0x0172 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0172 }
        L_0x014a:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0172 }
            if (r1 == 0) goto L_0x0168
            java.lang.String r1 = X.C17880vN.A0v(r13)     // Catch:{ all -> 0x0172 }
            r0.write(r1)     // Catch:{ all -> 0x0172 }
            goto L_0x014a
        L_0x0158:
            r1 = r2
            X.22p r1 = (X.C442222p) r1     // Catch:{ all -> 0x0172 }
            java.lang.String r13 = r1.A17()     // Catch:{ all -> 0x0172 }
            if (r13 == 0) goto L_0x013b
            java.lang.String r1 = r1.A17()     // Catch:{ all -> 0x0172 }
            r0.write(r1)     // Catch:{ all -> 0x0172 }
        L_0x0168:
            r0.flush()     // Catch:{ all -> 0x0172 }
            r0.close()     // Catch:{ all -> 0x017c }
            r12.close()     // Catch:{ IOException -> 0x0186 }
            goto L_0x018c
        L_0x0172:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0177 }
            goto L_0x017b
        L_0x0177:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x017c }
        L_0x017b:
            throw r1     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0181 }
            goto L_0x0185
        L_0x0181:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ IOException -> 0x0186 }
        L_0x0185:
            throw r0     // Catch:{ IOException -> 0x0186 }
        L_0x0186:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/vcard-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x022c }
        L_0x018c:
            boolean r0 = r4.contains(r14)     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x01cc
            goto L_0x0199
        L_0x0193:
            boolean r0 = r4.contains(r14)     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x01cc
        L_0x0199:
            r24 = r14
            goto L_0x01b9
        L_0x019c:
            if (r33 == 0) goto L_0x01cc
            boolean r0 = r2 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x01cc
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x022c }
            X.2rc r0 = r0.A02     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x01cc
            java.io.File r1 = r0.A0G     // Catch:{ all -> 0x022c }
            if (r1 == 0) goto L_0x01cc
            boolean r0 = r0.A0V     // Catch:{ IOException -> 0x01c6 }
            if (r0 != 0) goto L_0x01b7
            boolean r0 = r11.A0l(r1)     // Catch:{ IOException -> 0x01c6 }
            if (r0 == 0) goto L_0x01cc
        L_0x01b7:
            r24 = r1
        L_0x01b9:
            boolean r0 = r24.exists()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x01cc
            long r0 = r24.length()     // Catch:{ all -> 0x022c }
        L_0x01c3:
            long r26 = r26 + r0
            goto L_0x01cc
        L_0x01c6:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x022c }
        L_0x01cc:
            java.lang.Long r12 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x022c }
            X.0yx r1 = new X.0yx     // Catch:{ all -> 0x022c }
            r0 = r24
            r1.<init>(r0, r12)     // Catch:{ all -> 0x022c }
            java.lang.Object r12 = r1.A00     // Catch:{ all -> 0x022c }
            java.io.File r12 = (java.io.File) r12     // Catch:{ all -> 0x022c }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x022c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x022c }
            long r0 = r0.longValue()     // Catch:{ all -> 0x022c }
            long r18 = r18 + r0
            if (r3 >= r9) goto L_0x0225
            long r0 = r5.A02     // Catch:{ all -> 0x0223 }
            int r13 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0225
            java.lang.String r0 = "_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0223 }
            long r16 = r8.getLong(r0)     // Catch:{ all -> 0x0223 }
            if (r12 == 0) goto L_0x021a
            boolean r0 = r12.exists()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x021a
            boolean r0 = r7.contains(r12)     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x021a
            r4.add(r6, r12)     // Catch:{ all -> 0x022c }
            r7.add(r12)     // Catch:{ all -> 0x022c }
            boolean r0 = r2 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x021a
            X.21V r2 = (X.AnonymousClass21V) r2     // Catch:{ all -> 0x022c }
            X.2rc r0 = r2.A02     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x021a
            boolean r0 = r0.A0f     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x021a
            goto L_0x0221
        L_0x021a:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x006a
            goto L_0x0225
        L_0x0221:
            r10 = 2
            goto L_0x0225
        L_0x0223:
            r1 = move-exception
            goto L_0x022f
        L_0x0225:
            r8.close()     // Catch:{ all -> 0x0238 }
            r28.close()     // Catch:{ SQLiteException -> 0x0242 }
            goto L_0x0248
        L_0x022c:
            r1 = move-exception
            if (r8 == 0) goto L_0x0237
        L_0x022f:
            r8.close()     // Catch:{ all -> 0x0233 }
            goto L_0x0237
        L_0x0233:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0238 }
        L_0x0237:
            throw r1     // Catch:{ all -> 0x0238 }
        L_0x0238:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x023d }
            goto L_0x0241
        L_0x023d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteException -> 0x0242 }
        L_0x0241:
            throw r1     // Catch:{ SQLiteException -> 0x0242 }
        L_0x0242:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getStartIdAndCollectFiles/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0248:
            r1 = 2
            if (r10 == r1) goto L_0x086e
            java.io.FileOutputStream r24 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0850, IOException -> 0x085d }
            r0 = r24
            r0.<init>(r15)     // Catch:{ FileNotFoundException -> 0x0850, IOException -> 0x085d }
            java.lang.String r2 = X.C19620yd.A0A     // Catch:{ all -> 0x0846 }
            java.io.OutputStreamWriter r23 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0846 }
            r1 = r23
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0846 }
            r18 = 0
            r22 = 0
            X.1Cd r0 = r5.A0C     // Catch:{ SQLiteException -> 0x07d3 }
            X.1at r21 = r0.get()     // Catch:{ SQLiteException -> 0x07d3 }
            r0 = r21
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x07c9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = X.AnonymousClass203.A0A     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x07c9 }
            X.1LW r1 = r5.A0B     // Catch:{ all -> 0x07c9 }
            r0 = r29
            X.AnonymousClass1LW.A03(r1, r0, r2, r6)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x07c9 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SQL"
            android.database.Cursor r20 = r7.A0A(r3, r0, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r20.moveToFirst()     // Catch:{ all -> 0x07bd }
            if (r0 == 0) goto L_0x07b6
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07bd }
        L_0x028f:
            X.00H r0 = r5.A0G     // Catch:{ all -> 0x07b4 }
            X.1W6 r1 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x07b4 }
            r2 = r20
            r0 = r29
            X.206 r2 = r1.A02(r2, r0)     // Catch:{ all -> 0x07b4 }
            if (r2 == 0) goto L_0x07ad
            int r7 = r2.A0u     // Catch:{ all -> 0x07b4 }
            r0 = 88
            if (r7 == r0) goto L_0x07ad
            r0 = 87
            if (r7 == r0) goto L_0x07ad
            int r22 = r22 + 1
            boolean r10 = X.C22971Dz.A0e(r29)     // Catch:{ all -> 0x07b4 }
            X.0vb r11 = r5.A0A     // Catch:{ all -> 0x07b4 }
            X.11P r8 = r5.A08     // Catch:{ all -> 0x07b4 }
            long r0 = r2.A0I     // Catch:{ all -> 0x07b4 }
            long r0 = r8.A09(r0)     // Catch:{ all -> 0x07b4 }
            X.11Y r8 = X.AnonymousClass11X.A00     // Catch:{ all -> 0x07b4 }
            java.lang.String r8 = r8.A0B(r11, r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.A8I.A00(r11, r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.A87.A03(r11, r8, r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = " - "
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            boolean r0 = X.AnonymousClass25A.A0r(r2)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x02e9
            X.205 r9 = r2.A0v     // Catch:{ all -> 0x07b4 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x02f2
            X.11S r0 = r5.A04     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A0D()     // Catch:{ all -> 0x07b4 }
        L_0x02e1:
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = ": "
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
        L_0x02e9:
            r10 = 0
            java.lang.String r8 = "\n"
            r9 = 1
            r16 = 0
            if (r7 == r9) goto L_0x0639
            goto L_0x032a
        L_0x02f2:
            if (r10 == 0) goto L_0x031b
            X.1BI r0 = r2.A0H()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x02ff
            X.1Me r8 = r5.A07     // Catch:{ all -> 0x07b4 }
            X.1M9 r1 = r5.A06     // Catch:{ all -> 0x07b4 }
            goto L_0x0321
        L_0x02ff:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "EmailMessageStore/appendDateTimeAndName/missing_rmt_src:"
            r1.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.AnonymousClass25A.A0D(r2)     // Catch:{ all -> 0x07b4 }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x07b4 }
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x02e1
        L_0x031b:
            X.1Me r8 = r5.A07     // Catch:{ all -> 0x07b4 }
            X.1M9 r1 = r5.A06     // Catch:{ all -> 0x07b4 }
            X.1BI r0 = r9.A00     // Catch:{ all -> 0x07b4 }
        L_0x0321:
            X.1E7 r0 = r1.A0H(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r8.A0I(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x02e1
        L_0x032a:
            r0 = 2
            if (r7 == r0) goto L_0x0639
            r0 = 3
            if (r7 == r0) goto L_0x0639
            r0 = 4
            if (r7 == r0) goto L_0x05fd
            r0 = 5
            if (r7 == r0) goto L_0x05b8
            r0 = 20
            if (r7 == r0) goto L_0x0639
            r0 = 21
            if (r7 == r0) goto L_0x0598
            r0 = 25
            if (r7 == r0) goto L_0x0639
            r0 = 26
            if (r7 == r0) goto L_0x0639
            r0 = 36
            if (r7 == r0) goto L_0x0577
            r0 = 37
            if (r7 == r0) goto L_0x0639
            r0 = 54
            if (r7 == r0) goto L_0x055d
            r0 = 55
            if (r7 == r0) goto L_0x055d
            r0 = 62
            if (r7 == r0) goto L_0x055d
            r0 = 63
            if (r7 == r0) goto L_0x055d
            r0 = 81
            if (r7 == r0) goto L_0x0551
            r0 = 82
            if (r7 == r0) goto L_0x0545
            switch(r7) {
                case 9: goto L_0x0639;
                case 10: goto L_0x03ef;
                case 11: goto L_0x0414;
                case 12: goto L_0x0420;
                case 13: goto L_0x0639;
                case 14: goto L_0x05fd;
                case 15: goto L_0x042c;
                case 16: goto L_0x06a1;
                case 23: goto L_0x0639;
                case 52: goto L_0x055d;
                case 57: goto L_0x055d;
                case 66: goto L_0x0450;
                case 78: goto L_0x04b6;
                case 85: goto L_0x055d;
                case 92: goto L_0x04c2;
                case 105: goto L_0x0639;
                default: goto L_0x0369;
            }     // Catch:{ all -> 0x07b4 }
        L_0x0369:
            switch(r7) {
                case 28: goto L_0x0639;
                case 29: goto L_0x0639;
                case 30: goto L_0x05b8;
                case 31: goto L_0x0414;
                default: goto L_0x036c;
            }     // Catch:{ all -> 0x07b4 }
        L_0x036c:
            switch(r7) {
                case 44: goto L_0x03c5;
                case 45: goto L_0x055d;
                case 46: goto L_0x06b9;
                default: goto L_0x036f;
            }     // Catch:{ all -> 0x07b4 }
        L_0x036f:
            if (r7 == 0) goto L_0x0382
            r0 = 27
            if (r7 == r0) goto L_0x0382
            r0 = 32
            if (r7 == r0) goto L_0x0382
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "EmailMessageStore/processmessage/type/unknown: "
            X.C17900vP.A0k(r0, r1, r7)     // Catch:{ all -> 0x07b4 }
        L_0x0382:
            X.AW0 r0 = X.AnonymousClass25B.A00(r2)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0394
            X.1R2 r0 = r5.A0F     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A0d(r2)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
        L_0x0394:
            boolean r0 = r2 instanceof X.C436420i     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x03a6
            X.1gn r1 = r5.A05     // Catch:{ all -> 0x07b4 }
            r0 = r2
            X.20i r0 = (X.C436420i) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r1.A0S(r0, r6)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x03a6:
            boolean r0 = r2 instanceof X.C439521o     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x03b6
            r0 = r2
            X.21o r0 = (X.C439521o) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A1B()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x03b6:
            int r0 = r2.A0B()     // Catch:{ all -> 0x07b4 }
            if (r0 == r9) goto L_0x06dd
            java.lang.String r0 = r2.A0P()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x03c5:
            r1 = r2
            X.22U r1 = (X.AnonymousClass22U) r1     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.C63752td.A02(r11, r1)     // Catch:{ all -> 0x07b4 }
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07b4 }
            if (r9 != 0) goto L_0x03dd
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
        L_0x03dd:
            java.lang.String r0 = r1.A07     // Catch:{ all -> 0x07b4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x06dd
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r1.A07     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x03ef:
            r0 = r2
            X.22O r0 = (X.AnonymousClass22O) r0     // Catch:{ all -> 0x07b4 }
            int r11 = r0.A17()     // Catch:{ all -> 0x07b4 }
            if (r11 == 0) goto L_0x0408
            if (r11 == r9) goto L_0x0404
            r1 = 2
            r0 = 2131898076(0x7f122edc, float:1.943106E38)
            if (r11 == r1) goto L_0x040b
            r0 = 2131897852(0x7f122dfc, float:1.9430605E38)
            goto L_0x040b
        L_0x0404:
            r0 = 2131897849(0x7f122df9, float:1.94306E38)
            goto L_0x040b
        L_0x0408:
            r0 = 2131898074(0x7f122eda, float:1.9431055E38)
        L_0x040b:
            X.118 r1 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x07b4 }
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0414:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131889225(0x7f120c49, float:1.9413108E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0420:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131889044(0x7f120b94, float:1.941274E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x042c:
            boolean r9 = r2.A0w()     // Catch:{ all -> 0x07b4 }
            X.205 r0 = r2.A0v     // Catch:{ all -> 0x07b4 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x043f
            r1 = 2131895353(0x7f122439, float:1.9425537E38)
            if (r9 == 0) goto L_0x0447
            r1 = 2131895354(0x7f12243a, float:1.9425539E38)
            goto L_0x0447
        L_0x043f:
            r1 = 2131895351(0x7f122437, float:1.9425533E38)
            if (r9 == 0) goto L_0x0447
            r1 = 2131895352(0x7f122438, float:1.9425535E38)
        L_0x0447:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x07b4 }
            X.C17880vN.A1A(r0, r3, r1)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0450:
            r1 = r2
            X.22H r1 = (X.AnonymousClass22H) r1     // Catch:{ all -> 0x07b4 }
            X.118 r13 = r5.A09     // Catch:{ all -> 0x07b4 }
            r0 = 2131894696(0x7f1221a8, float:1.9424204E38)
            java.lang.String r0 = r13.A01(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            java.util.List r0 = r1.A07     // Catch:{ all -> 0x07b4 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x07b4 }
        L_0x0470:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x07b4 }
            X.A18 r1 = (X.A18) r1     // Catch:{ all -> 0x07b4 }
            r12 = 2131893171(0x7f121bb3, float:1.942111E38)
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x07b4 }
            r11[r6] = r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r13.A02(r12, r11)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = " "
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "("
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            android.content.Context r0 = r13.A00     // Catch:{ all -> 0x07b4 }
            android.content.res.Resources r12 = r0.getResources()     // Catch:{ all -> 0x07b4 }
            r11 = 2131755268(0x7f100104, float:1.914141E38)
            int r1 = r1.A00     // Catch:{ all -> 0x07b4 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            X.C17880vN.A1T(r0, r1, r6)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r12.getQuantityString(r11, r1, r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            goto L_0x0470
        L_0x04b6:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131897945(0x7f122e59, float:1.9430794E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x04c2:
            boolean r0 = r2 instanceof X.C445823z     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
            r12 = r2
            X.23z r12 = (X.C445823z) r12     // Catch:{ all -> 0x07b4 }
            X.118 r11 = r5.A09     // Catch:{ all -> 0x07b4 }
            r13 = 2131890144(0x7f120fe0, float:1.9414972E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x07b4 }
            r1[r6] = r0     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r1, r13)     // Catch:{ all -> 0x07b4 }
            long r13 = r12.A00     // Catch:{ all -> 0x07b4 }
            r1 = 2131890141(0x7f120fdd, float:1.9414965E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x07b4 }
            r0[r6] = r13     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
            boolean r13 = r12.A08     // Catch:{ all -> 0x07b4 }
            r1 = 2131890065(0x7f120f91, float:1.9414811E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x07b4 }
            r0[r6] = r14     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
            if (r13 != 0) goto L_0x06dd
            java.lang.String r13 = r12.A04     // Catch:{ all -> 0x07b4 }
            if (r13 == 0) goto L_0x0507
            r1 = 2131890082(0x7f120fa2, float:1.9414846E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            r0[r6] = r13     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x0507:
            java.lang.String r13 = r12.A05     // Catch:{ all -> 0x07b4 }
            if (r13 == 0) goto L_0x0515
            r1 = 2131890099(0x7f120fb3, float:1.941488E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            r0[r6] = r13     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x0515:
            X.9rg r13 = r12.A01     // Catch:{ all -> 0x07b4 }
            if (r13 == 0) goto L_0x06dd
            java.lang.String r12 = r13.A02     // Catch:{ all -> 0x07b4 }
            if (r12 == 0) goto L_0x0527
            r1 = 2131890104(0x7f120fb8, float:1.941489E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            r0[r6] = r12     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x0527:
            java.lang.String r12 = r13.A01     // Catch:{ all -> 0x07b4 }
            if (r12 == 0) goto L_0x0535
            r1 = 2131890101(0x7f120fb5, float:1.9414884E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            r0[r6] = r12     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x0535:
            X.9qf r1 = r13.A00     // Catch:{ all -> 0x07b4 }
            if (r1 == 0) goto L_0x06dd
            r0 = 2131890105(0x7f120fb9, float:1.9414892E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            r9[r6] = r1     // Catch:{ all -> 0x07b4 }
            A00(r11, r3, r9, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0545:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131897912(0x7f122e38, float:1.9430727E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0551:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131890248(0x7f121048, float:1.9415182E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x055d:
            r1 = r2
            X.21K r1 = (X.AnonymousClass21K) r1     // Catch:{ all -> 0x07b4 }
            X.00H r0 = r5.A0H     // Catch:{ all -> 0x07b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07b4 }
            X.1y1 r0 = (X.C42341y1) r0     // Catch:{ all -> 0x07b4 }
            X.A6j r0 = r0.A01(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
            java.lang.String r0 = r0.A0B()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0577:
            r13 = r2
            X.22v r13 = (X.C442822v) r13     // Catch:{ all -> 0x07b4 }
            X.1gn r12 = r5.A05     // Catch:{ all -> 0x07b4 }
            X.205 r1 = r2.A0v     // Catch:{ all -> 0x07b4 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0595
            X.11S r0 = r5.A04     // Catch:{ all -> 0x07b4 }
            com.whatsapp.jid.PhoneUserJid r11 = X.AnonymousClass11S.A00(r0)     // Catch:{ all -> 0x07b4 }
        L_0x0588:
            int r1 = r13.A00     // Catch:{ all -> 0x07b4 }
            int r0 = r13.A04     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r12.A0M(r11, r1, r0, r9)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x0595:
            X.1BI r11 = r1.A00     // Catch:{ all -> 0x07b4 }
            goto L_0x0588
        L_0x0598:
            r0 = r2
            X.21G r0 = (X.AnonymousClass21G) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r11 = r0.A00     // Catch:{ all -> 0x07b4 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x06dd
            X.1QR r9 = r5.A0D     // Catch:{ all -> 0x07b4 }
            r0 = -1
            X.AW0 r1 = r9.A0N(r11, r10, r0)     // Catch:{ all -> 0x07b4 }
            if (r1 == 0) goto L_0x06dd
            X.1R2 r0 = r5.A0F     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A0Z(r1, r2)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x05b8:
            r14 = r2
            X.21B r14 = (X.AnonymousClass21B) r14     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r14.A1A()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x05cb
            java.lang.String r0 = r14.A1A()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
        L_0x05cb:
            java.lang.String r0 = r14.A02     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x06b5
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x07b4 }
            r12 = 2131889651(0x7f120df3, float:1.9413972E38)
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "https://maps.google.com/?q="
            r9.append(r0)     // Catch:{ all -> 0x07b4 }
            double r0 = r14.A00     // Catch:{ all -> 0x07b4 }
            r9.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = ","
            r9.append(r0)     // Catch:{ all -> 0x07b4 }
            double r0 = r14.A01     // Catch:{ all -> 0x07b4 }
            r9.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.C17880vN.A0q(r13, r0, r11, r6, r12)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x05fd:
            boolean r0 = r2 instanceof X.C442222p     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x062d
            r0 = r2
            X.22p r0 = (X.C442222p) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r12 = r0.A00     // Catch:{ all -> 0x07b4 }
        L_0x0606:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07b4 }
            java.lang.String r1 = ""
            if (r12 == 0) goto L_0x0614
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r12.replaceAll(r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x0614:
            r11.append(r1)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = ".vcf"
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r11)     // Catch:{ all -> 0x07b4 }
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131889646(0x7f120dee, float:1.9413961E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r11, r9, r6, r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x062d:
            boolean r0 = r2 instanceof X.C442022n     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0637
            r0 = r2
            X.22n r0 = (X.C442022n) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r12 = r0.A00     // Catch:{ all -> 0x07b4 }
            goto L_0x0606
        L_0x0637:
            r12 = r10
            goto L_0x0606
        L_0x0639:
            r13 = r2
            X.21V r13 = (X.AnonymousClass21V) r13     // Catch:{ all -> 0x07b4 }
            if (r33 == 0) goto L_0x0695
            boolean r0 = r13.A1E()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0689
            X.2rc r0 = X.AnonymousClass206.A00(r13)     // Catch:{ all -> 0x07b4 }
            java.io.File r0 = r0.A0G     // Catch:{ all -> 0x07b4 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x07b4 }
            long r16 = r0.length()     // Catch:{ all -> 0x07b4 }
            X.118 r1 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r12 = r1.A00     // Catch:{ all -> 0x07b4 }
            r11 = 2131889646(0x7f120dee, float:1.9413961E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.C17880vN.A0q(r12, r0, r1, r6, r11)     // Catch:{ all -> 0x07b4 }
        L_0x0662:
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r13.A18()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0677
            boolean r1 = X.C20097A7a.A05(r13)     // Catch:{ all -> 0x07b4 }
            if (r1 != 0) goto L_0x0677
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
        L_0x0674:
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
        L_0x0677:
            boolean r0 = r2 instanceof X.AnonymousClass22Q     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
            r0 = r2
            X.22Q r0 = (X.AnonymousClass22Q) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A1G()     // Catch:{ all -> 0x07b4 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07b4 }
            if (r1 != 0) goto L_0x06dd
            goto L_0x06b2
        L_0x0689:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131890238(0x7f12103e, float:1.9415162E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x0662
        L_0x0695:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131890238(0x7f12103e, float:1.9415162E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x0674
        L_0x06a1:
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x07b4 }
            r0 = 2131889650(0x7f120df2, float:1.941397E38)
            X.C17880vN.A1A(r1, r3, r0)     // Catch:{ all -> 0x07b4 }
            r0 = r2
            X.219 r0 = (X.AnonymousClass219) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
        L_0x06b2:
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
        L_0x06b5:
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x06b9:
            boolean r0 = r2 instanceof X.C438721g     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x070c
            r1 = r2
            X.21g r1 = (X.C438721g) r1     // Catch:{ all -> 0x07b4 }
            X.0ve r0 = r5.A0E     // Catch:{ all -> 0x07b4 }
            boolean r0 = r1.A1D(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x070c
            X.00H r0 = r5.A0I     // Catch:{ all -> 0x07b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07b4 }
            X.9lY r0 = (X.C190809lY) r0     // Catch:{ all -> 0x07b4 }
            X.3M5 r0 = r0.A00(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x06dd
            java.lang.String r0 = r0.BRB()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
        L_0x06dd:
            X.2b7 r0 = r2.A0L()     // Catch:{ all -> 0x07b4 }
            X.9rz r0 = r0.A00     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = X.C20097A7a.A03(r0, r10)     // Catch:{ all -> 0x07b4 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07b4 }
            if (r1 != 0) goto L_0x074c
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x07b4 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x07b4 }
            if (r1 != 0) goto L_0x06fa
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
        L_0x06fa:
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            X.2b7 r0 = r2.A0L()     // Catch:{ all -> 0x07b4 }
            X.9rz r0 = r0.A00     // Catch:{ all -> 0x07b4 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x07b4 }
            java.util.List r10 = r0.A02     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            goto L_0x071a
        L_0x070c:
            int r0 = r2.A0B()     // Catch:{ all -> 0x07b4 }
            if (r0 == r9) goto L_0x06dd
            java.lang.String r0 = r2.A0P()     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x06dd
        L_0x071a:
            r9 = 0
        L_0x071b:
            int r0 = r10.size()     // Catch:{ all -> 0x07b4 }
            if (r9 >= r0) goto L_0x074c
            int r1 = r9 + 1
            X.118 r0 = r5.A09     // Catch:{ all -> 0x07b4 }
            android.content.Context r12 = r0.A00     // Catch:{ all -> 0x07b4 }
            r11 = 2131887597(0x7f1205ed, float:1.9409806E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x07b4 }
            X.C17880vN.A1S(r0, r1, r6)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r12.getString(r11, r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = " "
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x07b4 }
            X.9t8 r0 = (X.C195309t8) r0     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r8)     // Catch:{ all -> 0x07b4 }
            r9 = r1
            goto L_0x071b
        L_0x074c:
            if (r7 != 0) goto L_0x0772
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r2.A11(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0772
            com.whatsapp.jid.UserJid r0 = r2.A0I()     // Catch:{ all -> 0x07b4 }
            boolean r0 = X.C42701yb.A01(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x0772
            java.lang.String r0 = " "
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
            X.118 r1 = r5.A09     // Catch:{ all -> 0x07b4 }
            r0 = 2131890239(0x7f12103f, float:1.9415164E38)
            java.lang.String r0 = r1.A01(r0)     // Catch:{ all -> 0x07b4 }
            r3.append(r0)     // Catch:{ all -> 0x07b4 }
        L_0x0772:
            long r18 = r18 + r16
            int r0 = r3.length()     // Catch:{ all -> 0x07b4 }
            if (r0 <= 0) goto L_0x07ad
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r3)     // Catch:{ IOException -> 0x0788 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r8, r0)     // Catch:{ IOException -> 0x0788 }
            r0 = r23
            r0.write(r1)     // Catch:{ IOException -> 0x0788 }
            goto L_0x07a6
        L_0x0788:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x07a1
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x07a1
            java.lang.String r0 = "loadforemail/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07b4 }
            throw r2     // Catch:{ all -> 0x07b4 }
        L_0x07a1:
            java.lang.String r0 = "EmailMessageStore/collectMessages/txt-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x07b4 }
        L_0x07a6:
            int r0 = r3.length()     // Catch:{ all -> 0x07b4 }
            r3.delete(r6, r0)     // Catch:{ all -> 0x07b4 }
        L_0x07ad:
            boolean r0 = r20.moveToNext()     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x028f
            goto L_0x07b6
        L_0x07b4:
            r1 = move-exception
            goto L_0x07c0
        L_0x07b6:
            r20.close()     // Catch:{ all -> 0x07c9 }
            r21.close()     // Catch:{ SQLiteException -> 0x07d3 }
            goto L_0x07d9
        L_0x07bd:
            r1 = move-exception
            if (r20 == 0) goto L_0x07c8
        L_0x07c0:
            r20.close()     // Catch:{ all -> 0x07c4 }
            goto L_0x07c8
        L_0x07c4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x07c9 }
        L_0x07c8:
            throw r1     // Catch:{ all -> 0x07c9 }
        L_0x07c9:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x07ce }
            goto L_0x07d2
        L_0x07ce:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteException -> 0x07d3 }
        L_0x07d2:
            throw r1     // Catch:{ SQLiteException -> 0x07d3 }
        L_0x07d3:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/collectMessages/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x083c }
        L_0x07d9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x083c }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x083c }
            X.0yx r2 = new X.0yx     // Catch:{ all -> 0x083c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x083c }
            r23.flush()     // Catch:{ all -> 0x083c }
            r23.close()     // Catch:{ all -> 0x0846 }
            r24.close()     // Catch:{ FileNotFoundException -> 0x0850, IOException -> 0x085d }
            X.11P r0 = r5.A08
            long r0 = X.AnonymousClass11P.A01(r0)
            boolean r0 = r15.setLastModified(r0)
            if (r0 != 0) goto L_0x0804
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail failed to set timestamp for "
            X.C17900vP.A0X(r15, r0, r1)
        L_0x0804:
            java.lang.Object r0 = r2.A00
            int r5 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r2.A01
            long r0 = X.C17880vN.A05(r0)
            long r2 = r15.length()
            long r0 = r0 + r2
            r4.add(r6, r15)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "EmailMessageStore/loadMessagesForEmail/total count:"
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = "/total attach file:"
            X.C17890vO.A14(r2, r3, r4)
            java.lang.String r2 = "/total size:"
            X.C17900vP.A0m(r2, r3, r0)
            r25.A02()
            if (r5 != 0) goto L_0x0836
            r4.clear()
        L_0x0836:
            X.2pZ r0 = new X.2pZ
            r0.<init>((java.util.List) r4)
            return r0
        L_0x083c:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0841 }
            goto L_0x0845
        L_0x0841:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0846 }
        L_0x0845:
            throw r1     // Catch:{ all -> 0x0846 }
        L_0x0846:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x084b }
            goto L_0x084f
        L_0x084b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0850, IOException -> 0x085d }
        L_0x084f:
            throw r1     // Catch:{ FileNotFoundException -> 0x0850, IOException -> 0x085d }
        L_0x0850:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail cannot create attachment file"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 1
            X.2pZ r0 = new X.2pZ
            r0.<init>((int) r1)
            return r0
        L_0x085d:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x086d
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            r1 = 3
            if (r0 != 0) goto L_0x086e
        L_0x086d:
            r1 = 4
        L_0x086e:
            X.2pZ r0 = new X.2pZ
            r0.<init>((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62182qv.A01(X.1BI, java.lang.String, boolean):X.2pZ");
    }

    public C62182qv(C218617r r5, AnonymousClass11S r6, C32191gn r7, AnonymousClass1M9 r8, C24921Me r9, AnonymousClass11P r10, AnonymousClass118 r11, C18000vb r12, AnonymousClass1LW r13, AnonymousClass1Cd r14, AnonymousClass1QR r15, C18030ve r16, AnonymousClass1R2 r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20) {
        this.A09 = r11;
        this.A08 = r10;
        this.A0B = r13;
        this.A04 = r6;
        this.A03 = r5;
        this.A0F = r17;
        this.A06 = r8;
        this.A07 = r9;
        this.A0A = r12;
        this.A0G = r18;
        this.A0C = r14;
        this.A0D = r15;
        this.A05 = r7;
        this.A0H = r19;
        this.A0I = r20;
        C18030ve r2 = r16;
        this.A0E = r2;
        C18040vf r1 = C18040vf.A02;
        this.A00 = C18020vd.A00(r1, r2, 7604);
        this.A01 = C18020vd.A00(r1, r2, 7605);
        this.A02 = ((long) C18020vd.A00(r1, r2, 7606)) * SearchActionVerificationClientService.MS_TO_NS;
    }
}
