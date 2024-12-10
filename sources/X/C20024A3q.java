package X;

/* renamed from: X.A3q  reason: case insensitive filesystem */
public abstract class C20024A3q {
    public static final Object A00 = C17880vN.A0p();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = X.C164628Zo.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r2.A00(X.C20065A5o.A00(r0.public_));
        r6 = r2.A00;
        r7 = r8.A00();
        r3 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r3 <= r6) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r1 = r8.A00.senderMessageKeys_.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1.hasNext() == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (((X.C164618Zn) r1.next()).iteration_ != r6) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r9 = new java.util.LinkedList(r8.A00.senderMessageKeys_);
        r1 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r1.hasNext() == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r7 = (X.C164618Zn) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r7.iteration_ != r6) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r6 = X.AnonymousClass8BS.A07(r8.A00);
        ((X.AnonymousClass8b3) r6.A00).senderMessageKeys_ = X.C23579Bm9.A02;
        r3 = (X.AnonymousClass8b3) X.C17880vN.A0G(r6);
        r1 = r3.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (((X.C27296DbR) r1).A00 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r1 = X.C23577Bm6.A09(r1);
        r3.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        X.DND.A09(r9, r1);
        r8.A00 = (X.AnonymousClass8b3) r6.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        if (r7 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r4 = new X.C187059fC(r7.iteration_, r7.seed_.A06());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Received message with old counter: ");
        r1.append(r3);
        r1 = new X.AnonymousClass1P6(X.AnonymousClass001.A1I(" , ", r1, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if ((r6 - r3) <= 2000) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        if (r7.A00 >= r6) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r9 = r7.A01();
        r4 = X.C164618Zn.DEFAULT_INSTANCE.A0N();
        r3 = r9.A00;
        r1 = (X.C164618Zn) X.C17880vN.A0G(r4);
        r1.bitField0_ |= 1;
        r1.iteration_ = r3;
        r3 = X.C17900vP.A03(r4, r9.A03);
        r1 = (X.C164618Zn) r4.A00;
        r1.bitField0_ |= 2;
        r1.seed_ = r3;
        r4 = r4.A0C();
        r9 = X.AnonymousClass8BS.A07(r8.A00);
        r3 = (X.AnonymousClass8b3) r9.A00;
        r4.getClass();
        r1 = r3.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0128, code lost:
        if (((X.C27296DbR) r1).A00 != false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        r1 = X.C23577Bm6.A09(r1);
        r3.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0130, code lost:
        r1.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013f, code lost:
        if (((X.AnonymousClass8b3) r9.A00).senderMessageKeys_.size() <= 2000) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0141, code lost:
        r4 = (X.AnonymousClass8b3) X.C17880vN.A0G(r9);
        r1 = r4.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014f, code lost:
        if (((X.C27296DbR) r1).A00 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0151, code lost:
        r1 = X.C23577Bm6.A09(r1);
        r4.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0157, code lost:
        r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015a, code lost:
        r8.A00 = (X.AnonymousClass8b3) r9.A0C();
        r7 = r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0168, code lost:
        r8.A01(r7.A00());
        r4 = r7.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0173, code lost:
        r0 = r4.A02;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = X.AnonymousClass8BS.A1Q(X.AnonymousClass8BS.A0v(r1), X.AnonymousClass8BR.A19(r0), javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding"), r2.A02, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r11.BcN(r0);
        r10.A04(r12, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0192, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c0, code lost:
        r1 = new X.AnonymousClass1P5("Over 2000 messages into the future!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ce, code lost:
        throw new X.AnonymousClass1P5(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0 = r1.senderSigningKey_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c8 A[ExcHandler: 1P8 | 1P9 (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(X.C25631Oy r10, X.C22490B9w r11, X.C58462kj r12, byte[] r13) {
        /*
            X.2bX r5 = r10.A02(r12)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.LinkedList r0 = r5.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            boolean r0 = r0.isEmpty()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != 0) goto L_0x01b0
            X.AmO r2 = new X.AmO     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r2.<init>(r13)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r4 = r2.A01     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.LinkedList r0 = r5.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0019:
            boolean r0 = r3.hasNext()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r8 = r3.next()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.9ns r8 = (X.C192139ns) r8     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r1 = r8.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r0 = r1.senderKeyId_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != r4) goto L_0x0019
            X.8Zo r0 = r1.senderSigningKey_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != 0) goto L_0x0031
            X.8Zo r0 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0031:
            X.DSQ r0 = r0.public_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.AiX r0 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r2.A00(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r6 = r2.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.A0k r7 = r8.A00()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r3 = r7.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r3 <= r6) goto L_0x00d8
            X.8b3 r0 = r8.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.EE9 r0 = r0.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x004c:
            boolean r0 = r1.hasNext()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r1.next()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8Zn r0 = (X.C164618Zn) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r0 = r0.iteration_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != r6) goto L_0x004c
            X.8b3 r0 = r8.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.EE9 r0 = r0.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r9.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0069:
            boolean r0 = r1.hasNext()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r4 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r7 = r1.next()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8Zn r7 = (X.C164618Zn) r7     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r0 = r7.iteration_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != r6) goto L_0x0069
            r1.remove()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x007d:
            X.8b3 r0 = r8.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bmt r6 = X.AnonymousClass8BS.A07(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r1 = r6.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r1 = (X.AnonymousClass8b3) r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm9 r0 = X.C23579Bm9.A02     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.senderMessageKeys_ = r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r3 = X.C17880vN.A0G(r6)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r3 = (X.AnonymousClass8b3) r3     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.EE9 r1 = r3.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            boolean r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != 0) goto L_0x00a0
            X.EE9 r1 = X.C23577Bm6.A09(r1)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r3.senderMessageKeys_ = r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x00a0:
            X.DND.A09(r9, r1)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r0 = r6.A0C()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r0 = (X.AnonymousClass8b3) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r8.A00 = r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x00ae
        L_0x00ac:
            r7 = r4
            goto L_0x007d
        L_0x00ae:
            if (r7 == 0) goto L_0x0173
            int r1 = r7.iteration_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.DSQ r0 = r7.seed_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            byte[] r0 = r0.A06()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.9fC r4 = new X.9fC     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r4.<init>(r1, r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x0173
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.lang.String r0 = "Received message with old counter: "
            r1.append(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.append(r3)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.1P6 r1 = new X.1P6     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x01c7
        L_0x00d8:
            int r1 = r6 - r3
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 <= r0) goto L_0x00e0
            goto L_0x01c0
        L_0x00e0:
            int r0 = r7.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 >= r6) goto L_0x0168
            X.9fC r9 = r7.A01()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8Zn r0 = X.C164618Zn.DEFAULT_INSTANCE     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bmt r4 = r0.A0N()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r3 = r9.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r1 = X.C17880vN.A0G(r4)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8Zn r1 = (X.C164618Zn) r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r0 = r1.bitField0_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.iteration_ = r3     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            byte[] r0 = r9.A03     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.BmB r3 = X.C17900vP.A03(r4, r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r1 = r4.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8Zn r1 = (X.C164618Zn) r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r0 = r1.bitField0_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.seed_ = r3     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r4 = r4.A0C()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r0 = r8.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bmt r9 = X.AnonymousClass8BS.A07(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r3 = r9.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r3 = (X.AnonymousClass8b3) r3     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r4.getClass()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.EE9 r1 = r3.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            boolean r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != 0) goto L_0x0130
            X.EE9 r1 = X.C23577Bm6.A09(r1)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r3.senderMessageKeys_ = r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0130:
            r1.add(r4)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.Bm6 r0 = r9.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r0 = (X.AnonymousClass8b3) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.EE9 r0 = r0.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            int r1 = r0.size()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 <= r0) goto L_0x015a
            X.Bm6 r4 = X.C17880vN.A0G(r9)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r4 = (X.AnonymousClass8b3) r4     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r3 = 0
            X.EE9 r1 = r4.senderMessageKeys_     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            boolean r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            if (r0 != 0) goto L_0x0157
            X.EE9 r1 = X.C23577Bm6.A09(r1)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r4.senderMessageKeys_ = r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0157:
            r1.remove(r3)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x015a:
            X.Bm6 r0 = r9.A0C()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.8b3 r0 = (X.AnonymousClass8b3) r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r8.A00 = r0     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.A0k r7 = r7.A00()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x00e0
        L_0x0168:
            X.A0k r0 = r7.A00()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r8.A01(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.9fC r4 = r7.A01()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x0173:
            byte[] r0 = r4.A02     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            byte[] r1 = r4.A01     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            byte[] r4 = r2.A02     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            javax.crypto.spec.IvParameterSpec r3 = X.AnonymousClass8BR.A19(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019a, BadPaddingException | IllegalBlockSizeException -> 0x0193, 1P8 | 1P9 -> 0x01c8 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019a, BadPaddingException | IllegalBlockSizeException -> 0x0193, 1P8 | 1P9 -> 0x01c8 }
            javax.crypto.spec.SecretKeySpec r1 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019a, BadPaddingException | IllegalBlockSizeException -> 0x0193, 1P8 | 1P9 -> 0x01c8 }
            r0 = 2
            byte[] r0 = X.AnonymousClass8BS.A1Q(r1, r3, r2, r4, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019a, BadPaddingException | IllegalBlockSizeException -> 0x0193, 1P8 | 1P9 -> 0x01c8 }
            r11.BcN(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r10.A04(r12, r5)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            return r0
        L_0x0193:
            r0 = move-exception
            X.1P5 r1 = new X.1P5     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x01c7
        L_0x019a:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x01c7
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.lang.String r0 = "No keys for: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.1P9 r1 = new X.1P9     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x01c7
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            java.lang.String r0 = "No sender key for: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r12, r0, r1)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            X.1P7 r1 = new X.1P7     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            goto L_0x01c7
        L_0x01c0:
            java.lang.String r0 = "Over 2000 messages into the future!"
            X.1P5 r1 = new X.1P5     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x01c7:
            throw r1     // Catch:{ 1P8 | 1P9 -> 0x01c8 }
        L_0x01c8:
            r1 = move-exception
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024A3q.A00(X.1Oy, X.B9w, X.2kj, byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[SYNTHETIC, Splitter:B:19:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ 1P9 -> 0x008c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C25631Oy r8, X.C58462kj r9, byte[] r10) {
        /*
            X.2bX r5 = r8.A02(r9)     // Catch:{ 1P9 -> 0x008c }
            java.util.LinkedList r1 = r5.A00     // Catch:{ 1P9 -> 0x008c }
            boolean r0 = r1.isEmpty()     // Catch:{ 1P9 -> 0x008c }
            if (r0 != 0) goto L_0x007e
            java.lang.Object r4 = X.AnonymousClass8BS.A0Y(r1)     // Catch:{ 1P9 -> 0x008c }
            X.9ns r4 = (X.C192139ns) r4     // Catch:{ 1P9 -> 0x008c }
            X.A0k r0 = r4.A00()     // Catch:{ 1P9 -> 0x008c }
            X.9fC r7 = r0.A01()     // Catch:{ 1P9 -> 0x008c }
            X.8b3 r1 = r4.A00     // Catch:{ 1P9 -> 0x008c }
            int r0 = r1.bitField0_     // Catch:{ 1P9 -> 0x008c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0032
            X.8Zo r0 = r1.senderSigningKey_     // Catch:{ 1P9 -> 0x008c }
            r1 = r0
            if (r0 != 0) goto L_0x0029
            X.8Zo r0 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P9 -> 0x008c }
        L_0x0029:
            int r0 = r0.bitField0_     // Catch:{ 1P9 -> 0x008c }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0032
            if (r1 != 0) goto L_0x0036
            goto L_0x0034
        L_0x0032:
            r6 = 0
            goto L_0x0041
        L_0x0034:
            X.8Zo r1 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P9 -> 0x008c }
        L_0x0036:
            X.DSQ r0 = r1.private_     // Catch:{ 1P9 -> 0x008c }
            byte[] r0 = r0.A06()     // Catch:{ 1P9 -> 0x008c }
            X.9ZN r6 = new X.9ZN     // Catch:{ 1P9 -> 0x008c }
            r6.<init>(r0)     // Catch:{ 1P9 -> 0x008c }
        L_0x0041:
            byte[] r0 = r7.A02     // Catch:{ 1P9 -> 0x008c }
            byte[] r1 = r7.A01     // Catch:{ 1P9 -> 0x008c }
            javax.crypto.spec.IvParameterSpec r3 = X.AnonymousClass8BR.A19(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            javax.crypto.spec.SecretKeySpec r1 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            r0 = 1
            byte[] r3 = X.AnonymousClass8BS.A1Q(r1, r3, r2, r10, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            if (r6 == 0) goto L_0x0076
            X.8b3 r0 = r4.A00     // Catch:{ 1P9 -> 0x008c }
            int r2 = r0.senderKeyId_     // Catch:{ 1P9 -> 0x008c }
            int r0 = r7.A00     // Catch:{ 1P9 -> 0x008c }
            X.AmO r1 = new X.AmO     // Catch:{ 1P9 -> 0x008c }
            r1.<init>(r6, r3, r2, r0)     // Catch:{ 1P9 -> 0x008c }
            X.A0k r0 = r4.A00()     // Catch:{ 1P9 -> 0x008c }
            X.A0k r0 = r0.A00()     // Catch:{ 1P9 -> 0x008c }
            r4.A01(r0)     // Catch:{ 1P9 -> 0x008c }
            r8.A04(r9, r5)     // Catch:{ 1P9 -> 0x008c }
            byte[] r0 = r1.A03     // Catch:{ 1P9 -> 0x008c }
            return r0
        L_0x0076:
            java.lang.String r0 = "Session missing signature key!"
            X.1P8 r1 = new X.1P8     // Catch:{ 1P9 -> 0x008c }
            r1.<init>(r0)     // Catch:{ 1P9 -> 0x008c }
            goto L_0x008b
        L_0x007e:
            java.lang.String r0 = "No key state in record!"
            X.1P9 r1 = new X.1P9     // Catch:{ 1P9 -> 0x008c }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P9 -> 0x008c }
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P9 -> 0x008c }
        L_0x008b:
            throw r1     // Catch:{ 1P9 -> 0x008c }
        L_0x008c:
            r1 = move-exception
            X.1P7 r0 = new X.1P7
            r0.<init>((java.lang.Exception) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024A3q.A01(X.1Oy, X.2kj, byte[]):byte[]");
    }
}
