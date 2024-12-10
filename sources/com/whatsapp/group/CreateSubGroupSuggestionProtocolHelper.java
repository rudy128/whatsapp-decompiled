package com.whatsapp.group;

import X.AnonymousClass00H;
import X.C18070vi;

public final class CreateSubGroupSuggestionProtocolHelper {
    public final AnonymousClass00H A00;

    public CreateSubGroupSuggestionProtocolHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
        if (r27 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r27 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        if (r27 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C19982A1s r27, X.AnonymousClass1EC r28, java.lang.String r29, java.lang.String r30, X.C30391dr r31, boolean r32) {
        /*
            r26 = this;
            r4 = r31
            r15 = r28
            r2 = r29
            r8 = r30
            boolean r0 = r4 instanceof X.C21710Aod
            r12 = r26
            if (r0 == 0) goto L_0x0154
            r9 = r4
            X.Aod r9 = (X.C21710Aod) r9
            int r3 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0154
            int r3 = r3 - r1
            r9.label = r3
        L_0x001c:
            java.lang.Object r3 = r9.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r11 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r11) goto L_0x016b
            java.lang.Object r1 = r9.L$4
            X.9F6 r1 = (X.AnonymousClass9F6) r1
            java.lang.Object r8 = r9.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r9.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r15 = r9.L$1
            X.1EC r15 = (X.AnonymousClass1EC) r15
            X.C30691eM.A01(r3)
        L_0x003a:
            X.9MQ r3 = (X.AnonymousClass9MQ) r3
            boolean r0 = r3 instanceof X.C173548vG
            if (r0 == 0) goto L_0x015b
            X.8vG r3 = (X.C173548vG) r3
            X.1ca r0 = r3.A00
            X.9FL r5 = new X.9FL
            r5.<init>(r0, r1)
            X.9CY r0 = r5.A03
            r19 = 0
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0072
        L_0x0053:
            X.1EC r4 = r5.A01
            com.whatsapp.jid.UserJid r3 = r5.A02
            long r0 = r5.A00
            r24 = 0
            r22 = 0
            X.2mu r14 = new X.2mu
            r25 = r24
            r17 = r3
            r18 = r2
            r20 = r0
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24, r25)
            X.40V r0 = new X.40V
            r0.<init>(r14)
            return r0
        L_0x0072:
            r19 = r8
            goto L_0x0053
        L_0x0075:
            X.C30691eM.A01(r3)
            X.00H r14 = r12.A00
            java.lang.String r6 = X.C17890vO.A0T(r14)
            r10 = 0
            if (r30 == 0) goto L_0x0151
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0151
            r0 = 29
            X.9Ed r5 = new X.9Ed
            r5.<init>((java.lang.String) r8, (int) r0)
        L_0x008e:
            r13 = r27
            if (r27 == 0) goto L_0x0140
            java.lang.Boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0140
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x013d
            r0 = 28
            X.9Ed r4 = new X.9Ed
            r4.<init>((int) r0)
        L_0x00a3:
            java.lang.Boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0145
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x013a
            X.9Ee r3 = new X.9Ee
            r3.<init>((int) r11)
        L_0x00b2:
            java.lang.Boolean r0 = r13.A03
            if (r0 == 0) goto L_0x014a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0133
            X.9Eq r1 = new X.9Eq
            r1.<init>(r11)
        L_0x00c1:
            X.9Ei r0 = new X.9Ei
            r0.<init>((X.C178839Eq) r1)
            X.9Ee r1 = new X.9Ee
            r1.<init>((X.C178759Ei) r0)
        L_0x00cb:
            java.lang.Boolean r0 = r13.A00
            if (r0 == 0) goto L_0x014f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012c
            X.9Ep r13 = new X.9Ep
            r13.<init>(r11)
        L_0x00da:
            X.9Ei r0 = new X.9Ei
            r0.<init>((X.C178829Ep) r13)
        L_0x00df:
            if (r32 == 0) goto L_0x00e7
            r13 = 0
            X.9Ee r10 = new X.9Ee
            r10.<init>((int) r13)
        L_0x00e7:
            X.9Er r13 = new X.9Er
            r22 = r1
            r23 = r2
            r18 = r5
            r19 = r4
            r20 = r3
            r21 = r10
            r17 = r0
            r16 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.9F6 r1 = new X.9F6
            r1.<init>((X.AnonymousClass1EC) r15, (X.C178849Er) r13, (java.lang.String) r6)
            java.lang.Object r3 = X.C18070vi.A0E(r14)
            X.1OZ r3 = (X.AnonymousClass1OZ) r3
            java.lang.Object r0 = r1.A00
            X.1ca r0 = (X.C29621ca) r0
            r9.L$0 = r12
            r9.L$1 = r15
            r9.L$2 = r2
            r9.L$3 = r8
            r9.L$4 = r1
            r9.label = r11
            r20 = 391(0x187, float:5.48E-43)
            r21 = 32000(0x7d00, double:1.581E-319)
            r23 = 0
            r18 = r6
            r19 = r9
            r16 = r3
            r17 = r0
            java.lang.Object r3 = r16.A0A(r17, r18, r19, r20, r21, r23)
            if (r3 != r7) goto L_0x003a
            return r7
        L_0x012c:
            r0 = 0
            X.9Ep r13 = new X.9Ep
            r13.<init>(r0)
            goto L_0x00da
        L_0x0133:
            r0 = 0
            X.9Eq r1 = new X.9Eq
            r1.<init>(r0)
            goto L_0x00c1
        L_0x013a:
            r3 = r10
            goto L_0x00b2
        L_0x013d:
            r4 = r10
            goto L_0x00a3
        L_0x0140:
            r4 = r10
            if (r27 == 0) goto L_0x0145
            goto L_0x00a3
        L_0x0145:
            r3 = r10
            if (r27 == 0) goto L_0x014a
            goto L_0x00b2
        L_0x014a:
            r1 = r10
            if (r27 == 0) goto L_0x014f
            goto L_0x00cb
        L_0x014f:
            r0 = r10
            goto L_0x00df
        L_0x0151:
            r5 = r10
            goto L_0x008e
        L_0x0154:
            X.Aod r9 = new X.Aod
            r9.<init>(r12, r4)
            goto L_0x001c
        L_0x015b:
            boolean r0 = r3 instanceof X.C173538vF
            if (r0 != 0) goto L_0x0168
            boolean r0 = r3 instanceof X.C173558vH
            if (r0 != 0) goto L_0x0168
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0168:
            X.40W r0 = X.AnonymousClass40W.A00
            return r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A00(X.A1s, X.1EC, java.lang.String, java.lang.String, X.1dr, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass1EC r15, java.util.List r16, java.util.List r17, X.C30391dr r18) {
        /*
            r14 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C21683AoC
            if (r0 == 0) goto L_0x00b9
            r9 = r3
            X.AoC r9 = (X.C21683AoC) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b9
            int r2 = r2 - r1
            r9.label = r2
        L_0x0014:
            java.lang.Object r4 = r9.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r2 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r2) goto L_0x00d6
            java.lang.Object r1 = r9.L$1
            X.9F6 r1 = (X.AnonymousClass9F6) r1
            X.C30691eM.A01(r4)
        L_0x0026:
            X.9MQ r4 = (X.AnonymousClass9MQ) r4
            boolean r0 = r4 instanceof X.C173548vG
            if (r0 == 0) goto L_0x00c6
            X.8vG r4 = (X.C173548vG) r4
            X.1ca r3 = r4.A00
            X.9FP r0 = new X.9FP
            r0.<init>((X.C29621ca) r3, (X.AnonymousClass9F6) r1, (int) r2)
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r0 = r0.A01
            X.9Cl r0 = (X.C178269Cl) r0
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0041
            r3.add(r1)
            goto L_0x0041
        L_0x005c:
            X.C30691eM.A01(r4)
            X.00H r6 = r14.A00
            java.lang.String r8 = X.C17890vO.A0T(r6)
            java.util.ArrayList r5 = X.C29351c6.A0D(r16)
            java.util.Iterator r7 = r16.iterator()
        L_0x006d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r4 = r7.next()
            X.1EC r4 = (X.AnonymousClass1EC) r4
            r0 = r17
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0091
            r0 = 27
            X.9Ed r1 = new X.9Ed
            r1.<init>((int) r0)
        L_0x0088:
            X.9Ed r0 = new X.9Ed
            r0.<init>((X.AnonymousClass1EC) r4, (X.C178709Ed) r1)
            r5.add(r0)
            goto L_0x006d
        L_0x0091:
            r1 = 0
            goto L_0x0088
        L_0x0093:
            r13 = 0
            X.9Er r0 = new X.9Er
            r0.<init>(r5)
            X.9F6 r1 = new X.9F6
            r1.<init>((X.AnonymousClass1EC) r15, (X.C178849Er) r0, (java.lang.String) r8)
            java.lang.Object r6 = X.C18070vi.A0E(r6)
            X.1OZ r6 = (X.AnonymousClass1OZ) r6
            java.lang.Object r7 = r1.A00
            X.1ca r7 = (X.C29621ca) r7
            r9.L$0 = r14
            r9.L$1 = r1
            r9.label = r2
            r10 = 391(0x187, float:5.48E-43)
            r11 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r4 = r6.A0A(r7, r8, r9, r10, r11, r13)
            if (r4 != r3) goto L_0x0026
            return r3
        L_0x00b9:
            X.AoC r9 = new X.AoC
            r9.<init>(r14, r3)
            goto L_0x0014
        L_0x00c0:
            X.40T r0 = new X.40T
            r0.<init>(r3)
            return r0
        L_0x00c6:
            boolean r0 = r4 instanceof X.C173538vF
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r4 instanceof X.C173558vH
            if (r0 != 0) goto L_0x00d3
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00d3:
            X.40U r0 = X.AnonymousClass40U.A00
            return r0
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A01(X.1EC, java.util.List, java.util.List, X.1dr):java.lang.Object");
    }
}
