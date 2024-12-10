package X;

import com.whatsapp.newsletter.iq.GetNewsletterMessagesJob;
import java.util.Set;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
public final class C62312rC {
    public final C25001Mm A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final Set A04 = C17880vN.A14();
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r22.isEmpty() != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C29681ch r20, X.C62312rC r21, java.lang.Integer r22, java.lang.Long r23, java.lang.Long r24, java.lang.String r25, java.lang.String r26, java.util.List r27, java.util.List r28, byte[] r29, long r30, long r32, long r34, long r36, boolean r38, boolean r39) {
        /*
            r8 = 0
            java.lang.Long r19 = java.lang.Long.valueOf(r32)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r38)
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r10 = r20
            r20 = r25
            r9 = r8
            X.2sw r5 = X.C50342Ub.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6 = 0
            if (r23 == 0) goto L_0x0038
            if (r24 == 0) goto L_0x0038
            if (r22 == 0) goto L_0x0038
            int r0 = r22.intValue()
            r5.A01 = r0
            long r2 = r23.longValue()
            long r0 = r24.longValue()
            X.2lg r7 = new X.2lg
            r7.<init>(r2, r0)
        L_0x0035:
            if (r29 == 0) goto L_0x0046
            goto L_0x003a
        L_0x0038:
            r7 = r8
            goto L_0x0035
        L_0x003a:
            X.8cr r0 = X.C166418cr.A01(r29)     // Catch:{ 1PN -> 0x00e4 }
            if (r0 == 0) goto L_0x0046
            X.2lP r2 = new X.2lP
            r2.<init>(r0)
            goto L_0x0047
        L_0x0046:
            r2 = r8
        L_0x0047:
            java.lang.String r0 = "true"
            r1 = r26
            boolean r4 = X.C18070vi.A18(r1, r0)
            if (r26 == 0) goto L_0x0057
            X.2lQ r6 = new X.2lQ
            r6.<init>(r4)
        L_0x0057:
            X.34z r1 = new X.34z
            r17 = r30
            r11 = r1
            r12 = r7
            r13 = r2
            r14 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.A08(r1)
            r2 = r21
            X.00H r0 = r2.A07     // Catch:{ 1hd -> 0x00e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1hd -> 0x00e0 }
            X.2qg r0 = (X.C62032qg) r0     // Catch:{ 1hd -> 0x00e0 }
            X.206 r12 = r0.A01(r1, r5)     // Catch:{ 1hd -> 0x00e0 }
            r0 = 1048576(0x100000, double:5.180654E-318)
            r12.A0b(r0)
            X.00H r3 = r2.A05
            java.lang.Object r11 = X.C18070vi.A0E(r3)
            X.2nT r11 = (X.C60152nT) r11
            r22 = r27
            if (r27 == 0) goto L_0x008c
            boolean r1 = r22.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            r19 = r0 ^ 1
            java.lang.Long r14 = java.lang.Long.valueOf(r36)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            r4 = 0
            r17 = r34
            r20 = r4
            r11.A03(r12, r13, r14, r15, r16, r17, r19, r20)
            java.lang.Object r0 = r3.get()
            X.2nT r0 = (X.C60152nT) r0
            r23 = r28
            r19 = r0
            r20 = r10
            r21 = r12
            r24 = r17
            r19.A00(r20, r21, r22, r23, r24)
            java.lang.Object r0 = r3.get()
            X.2nT r0 = (X.C60152nT) r0
            boolean r0 = r0.A04(r10, r12)
            if (r0 == 0) goto L_0x00ea
            X.00H r3 = r2.A06
            java.lang.Object r2 = r3.get()
            X.2jH r2 = (X.C57562jH) r2
            X.00H r0 = r2.A02
            X.11A r1 = X.C17880vN.A0d(r0)
            X.3Bz r0 = new X.3Bz
            r0.<init>(r2, r12, r4)
            r1.A00(r0)
            if (r39 == 0) goto L_0x00ea
            java.lang.Object r0 = r3.get()
            X.2jH r0 = (X.C57562jH) r0
            r0.A00(r12)
            return
        L_0x00e0:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/BadE2eMessageException historical message "
            goto L_0x00e7
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/invalid historical message"
        L_0x00e7:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62312rC.A00(X.1ch, X.2rC, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, byte[], long, long, long, long, boolean, boolean):void");
    }

    public final synchronized void A01(C29681ch r13, B8R b8r, Long l, Long l2, long j, boolean z) {
        C29681ch r4 = r13;
        StringBuilder A0K = C18070vi.A0K(r13);
        A0K.append(r13.getRawString());
        long j2 = j;
        A0K.append(j2);
        Long l3 = l;
        A0K.append(l);
        Long l4 = l2;
        String A0V = C17890vO.A0V(l4, A0K);
        Set set = this.A04;
        if (!set.contains(A0V) && AnonymousClass4aS.A09(this.A01, r13, (AnonymousClass1c4) C18070vi.A0E(this.A03))) {
            this.A00.A01(new GetNewsletterMessagesJob(r4, new AnonymousClass35A(b8r, this, 1), l3, l4, A0V, j2, z));
            set.add(A0V);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if (r15.isEmpty() != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C29681ch r38, X.AnonymousClass9DM r39, long r40, boolean r42) {
        /*
            r37 = this;
            r0 = 0
            r1 = r39
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r6 = r1.A00
            X.2Q7 r6 = (X.AnonymousClass2Q7) r6
            X.2Q8 r4 = r6.A03
            java.lang.String r14 = r4.A05
            if (r14 != 0) goto L_0x0012
            java.lang.String r14 = ""
        L_0x0012:
            long r2 = r4.A00
            java.lang.Long r0 = r4.A04
            r10 = 0
            long r19 = X.C17900vP.A01(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r8
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "true"
            boolean r25 = r0.equals(r1)
            X.9DM r0 = r6.A02
            r13 = 0
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r15 = r0.A01
            java.util.List r15 = (java.util.List) r15
        L_0x0032:
            X.9DM r0 = r6.A01
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
        L_0x003a:
            X.9CX r0 = r6.A00
            if (r0 == 0) goto L_0x00df
            long r6 = r0.A00
        L_0x0040:
            X.9CX r0 = r4.A02
            if (r0 == 0) goto L_0x00dc
            long r0 = r0.A00
            long r0 = r0 * r8
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x004b:
            X.9CX r0 = r4.A01
            if (r0 == 0) goto L_0x0055
            long r0 = r0.A00
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
        L_0x0055:
            r33 = r40
            int r0 = (r40 > r10 ? 1 : (r40 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00d9
            r21 = r19
        L_0x005d:
            X.3LR r0 = r4.A03
            r11 = r37
            r10 = r38
            r26 = r42
            if (r0 != 0) goto L_0x00e9
            X.00H r0 = r11.A05
            java.lang.Object r4 = r0.get()
            X.2nT r4 = (X.C60152nT) r4
            X.00H r8 = r4.A0A
            java.lang.Object r0 = r8.get()
            X.1hF r0 = (X.C32471hF) r0
            X.206 r3 = r0.A02(r10, r2)
            r2 = 0
            if (r3 == 0) goto L_0x008a
            X.36a r0 = X.C50382Uf.A00(r3)
            if (r0 == 0) goto L_0x009a
            long r0 = r0.A02
            int r9 = (r0 > r40 ? 1 : (r0 == r40 ? 0 : -1))
            if (r9 <= 0) goto L_0x009a
        L_0x008a:
            if (r42 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            X.00H r0 = r11.A06
            java.lang.Object r0 = r0.get()
            X.2jH r0 = (X.C57562jH) r0
            r0.A00(r2)
        L_0x0099:
            return
        L_0x009a:
            if (r15 == 0) goto L_0x00a3
            boolean r1 = r15.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            r35 = r0 ^ 1
            java.lang.Long r30 = java.lang.Long.valueOf(r6)
            r36 = 0
            r31 = r2
            r32 = r2
            r27 = r4
            r28 = r3
            r29 = r2
            r27.A03(r28, r29, r30, r31, r32, r33, r35, r36)
            r12 = r4
            r13 = r10
            r14 = r3
            r16 = r5
            r17 = r33
            r12.A00(r13, r14, r15, r16, r17)
            java.lang.Object r0 = r8.get()
            X.1hF r0 = (X.C32471hF) r0
            r0.A05(r3)
            X.00H r0 = r4.A08
            java.lang.Object r0 = r0.get()
            X.1W1 r0 = (X.AnonymousClass1W1) r0
            r0.CQy(r3)
            r2 = r3
            goto L_0x008a
        L_0x00d9:
            r21 = r33
            goto L_0x005d
        L_0x00dc:
            r12 = r13
            goto L_0x004b
        L_0x00df:
            r6 = 0
            goto L_0x0040
        L_0x00e3:
            r5 = r13
            goto L_0x003a
        L_0x00e6:
            r15 = r13
            goto L_0x0032
        L_0x00e9:
            X.CUF r9 = new X.CUF
            r17 = r2
            r23 = r6
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r26)
            r0.BAY(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62312rC.A02(X.1ch, X.9DM, long, boolean):void");
    }

    public C62312rC(C25001Mm r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r3, r2, r5, r6);
        C18070vi.A0l(r7, r8);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
    }
}
