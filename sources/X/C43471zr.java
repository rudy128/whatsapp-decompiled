package X;

/* renamed from: X.1zr  reason: invalid class name and case insensitive filesystem */
public abstract class C43471zr {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        if (r10.A08() != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        if (r1 != null) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass25M A00(X.C42621yT r14, X.AnonymousClass11S r15, X.AnonymousClass1PW r16, X.C34511kb r17, X.AnonymousClass1M9 r18, X.AnonymousClass1CJ r19, X.AnonymousClass1R3 r20, X.AnonymousClass1WM r21, X.C18030ve r22, X.AnonymousClass1BI r23, X.C42431yA r24, X.AnonymousClass206 r25, X.AnonymousClass1Nb r26, X.AnonymousClass00H r27) {
        /*
            r3 = r25
            r0 = 0
            r13 = r22
            X.C18070vi.A0d(r13, r0)
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            r0 = 2
            r10 = r16
            X.C18070vi.A0d(r10, r0)
            r0 = 3
            r6 = r19
            X.C18070vi.A0d(r6, r0)
            r0 = 4
            r5 = r18
            X.C18070vi.A0d(r5, r0)
            r0 = 5
            r11 = r20
            X.C18070vi.A0d(r11, r0)
            r0 = 6
            r4 = r26
            X.C18070vi.A0d(r4, r0)
            r0 = 7
            r9 = r21
            X.C18070vi.A0d(r9, r0)
            r0 = 8
            r2 = r17
            X.C18070vi.A0d(r2, r0)
            r0 = 9
            r7 = r24
            X.C18070vi.A0d(r7, r0)
            r0 = 10
            r1 = r27
            X.C18070vi.A0d(r1, r0)
            r0 = 11
            X.C18070vi.A0d(r14, r0)
            r0 = 12
            r12 = r23
            X.C18070vi.A0d(r12, r0)
            X.1yM r19 = r4.A0a(r12)
            r4 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r13, r4)
            r13 = 0
            if (r0 == 0) goto L_0x017d
            boolean r0 = r2.A0Q(r12)
            X.1E7 r4 = r5.A0H(r12)
            if (r0 == 0) goto L_0x0176
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r0 = X.C42941yz.A00(r12)
            com.whatsapp.jid.GroupJid r2 = r2.A03(r0)
            if (r2 == 0) goto L_0x016c
            boolean r0 = X.C42561yN.A00(r2, r1)
            if (r0 == 0) goto L_0x0166
            java.lang.Object r0 = r1.get()
            X.1yO r0 = (X.C42571yO) r0
            X.1TD r0 = r0.A03
            java.util.Map r0 = r0.A0H
            java.lang.Object r3 = r0.get(r2)
            X.206 r3 = (X.AnonymousClass206) r3
        L_0x008c:
            if (r3 == 0) goto L_0x016d
            X.1BI r1 = r3.A0H()
            if (r1 == 0) goto L_0x016d
            boolean r0 = X.C42701yb.A01(r1)
            if (r0 == 0) goto L_0x016d
            boolean r0 = r10.A08()
            if (r0 == 0) goto L_0x016d
        L_0x00a0:
            X.1E7 r12 = r5.A0H(r1)
        L_0x00a4:
            r14.A02()
            if (r3 == 0) goto L_0x0162
            X.205 r0 = r3.A0v
            X.1BI r4 = r0.A00
            if (r4 == 0) goto L_0x015f
            X.25L r15 = r7.BQr(r4)
        L_0x00b3:
            X.1ci r0 = r6.A0A(r4)
            if (r0 == 0) goto L_0x015d
            r0.A0v = r15
            r10 = 0
            long r6 = r0.A03()
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x015d
            if (r4 != 0) goto L_0x00ee
            java.lang.String r0 = "MessageAddOnManager/getChatInfo/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListDisplayedMessageAddOnPreview/no chat for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 0
        L_0x00e1:
            r14 = 0
            X.25M r11 = new X.25M
            r17 = r3
            r18 = r1
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return r11
        L_0x00ee:
            X.1CJ r0 = r9.A05
            X.1ci r6 = X.AnonymousClass1CJ.A00(r0, r4)
            if (r6 != 0) goto L_0x010b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnManager/getChatInfo/no chat for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00cc
        L_0x010b:
            X.2d8 r1 = r6.A0i
            if (r1 != 0) goto L_0x0150
            long r7 = r6.A03()
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
            X.1Cd r0 = r9.A09
            X.1at r4 = r0.get()
            long r0 = r6.A03()     // Catch:{ all -> 0x0181 }
            X.212 r8 = r9.A0A(r4, r0)     // Catch:{ all -> 0x0181 }
            r7 = 0
            if (r8 == 0) goto L_0x0147
            boolean r0 = r9.A0L(r8)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x0147
            X.00H r0 = r9.A0F     // Catch:{ all -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0181 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x0181 }
            X.205 r1 = r8.A18()     // Catch:{ all -> 0x0181 }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x0181 }
            X.206 r0 = r0.A05(r1)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x0147
            X.2d8 r7 = new X.2d8     // Catch:{ all -> 0x0181 }
            r7.<init>(r0, r8)     // Catch:{ all -> 0x0181 }
        L_0x0147:
            r6.A0i = r7     // Catch:{ all -> 0x0181 }
            r4.close()
        L_0x014c:
            X.2d8 r1 = r6.A0i
            if (r1 == 0) goto L_0x00e1
        L_0x0150:
            X.212 r0 = r1.A01
            com.whatsapp.jid.UserJid r0 = r0.A0I()
            if (r0 == 0) goto L_0x00e1
            X.1E7 r13 = r5.A0H(r0)
            goto L_0x00e1
        L_0x015d:
            r1 = r13
            goto L_0x00e1
        L_0x015f:
            r15 = r13
            goto L_0x00b3
        L_0x0162:
            r1 = r13
            r15 = r13
            goto L_0x00e1
        L_0x0166:
            X.206 r3 = r11.A05(r2)
            goto L_0x008c
        L_0x016c:
            r3 = r13
        L_0x016d:
            X.1BI r1 = X.AnonymousClass25G.A01(r15, r4, r3)
            if (r1 != 0) goto L_0x00a0
            r12 = 0
            goto L_0x00a4
        L_0x0176:
            X.206 r3 = r11.A05(r12)
            r2 = r13
            goto L_0x008c
        L_0x017d:
            r12 = r13
            r2 = r13
            goto L_0x00a4
        L_0x0181:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0186 }
            throw r1
        L_0x0186:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43471zr.A00(X.1yT, X.11S, X.1PW, X.1kb, X.1M9, X.1CJ, X.1R3, X.1WM, X.0ve, X.1BI, X.1yA, X.206, X.1Nb, X.00H):X.25M");
    }
}
