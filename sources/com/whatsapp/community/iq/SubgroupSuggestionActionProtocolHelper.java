package com.whatsapp.community.iq;

import X.AnonymousClass1OZ;
import X.C18070vi;

public final class SubgroupSuggestionActionProtocolHelper {
    public final AnonymousClass1OZ A00;

    public SubgroupSuggestionActionProtocolHelper(AnonymousClass1OZ r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r20, java.util.List r21, java.util.List r22, java.util.List r23, X.C30391dr r24) {
        /*
            r19 = this;
            r3 = r24
            boolean r0 = r3 instanceof X.C100354uN
            r4 = r19
            if (r0 == 0) goto L_0x010c
            r12 = r3
            X.4uN r12 = (X.C100354uN) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010c
            int r2 = r2 - r1
            r12.label = r2
        L_0x0016:
            java.lang.Object r2 = r12.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 1
            if (r0 == 0) goto L_0x005e
            if (r0 != r6) goto L_0x01e7
            java.lang.Object r1 = r12.L$0
            X.9F7 r1 = (X.AnonymousClass9F7) r1
            X.C30691eM.A01(r2)
        L_0x0028:
            X.9MQ r2 = (X.AnonymousClass9MQ) r2
            boolean r0 = r2 instanceof X.C173548vG
            if (r0 == 0) goto L_0x01d7
            X.8vG r2 = (X.C173548vG) r2
            X.1ca r0 = r2.A00
            X.9FO r6 = new X.9FO
            r6.<init>((X.C29621ca) r0, (X.AnonymousClass9F7) r1)
            java.lang.Object r0 = r6.A02
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9DL r0 = (X.AnonymousClass9DL) r0
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0049
            r3.add(r1)
            goto L_0x0049
        L_0x005e:
            X.C30691eM.A01(r2)
            X.1OZ r9 = r4.A00
            java.lang.String r11 = r9.A0B()
            r2 = 0
            if (r21 == 0) goto L_0x0093
            java.util.ArrayList r5 = X.C29351c6.A0E(r21)
            java.util.Iterator r7 = r21.iterator()
        L_0x0072:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r7.next()
            X.4TG r0 = (X.AnonymousClass4TG) r0
            X.1EC r4 = r0.A00
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.9Ed r0 = new X.9Ed
            r0.<init>((X.AnonymousClass1EC) r4, (com.whatsapp.jid.UserJid) r1)
            r5.add(r0)
            goto L_0x0072
        L_0x008b:
            r0 = 20
            X.9Ed r7 = new X.9Ed
            r7.<init>((java.util.List) r5, (int) r0)
            goto L_0x0094
        L_0x0093:
            r7 = r2
        L_0x0094:
            if (r22 == 0) goto L_0x00bf
            java.util.ArrayList r5 = X.C29351c6.A0E(r22)
            java.util.Iterator r8 = r22.iterator()
        L_0x009e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r8.next()
            X.4TG r0 = (X.AnonymousClass4TG) r0
            X.1EC r4 = r0.A00
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.9Ed r0 = new X.9Ed
            r0.<init>((X.AnonymousClass1EC) r4, (com.whatsapp.jid.UserJid) r1)
            r5.add(r0)
            goto L_0x009e
        L_0x00b7:
            r0 = 24
            X.9Ed r8 = new X.9Ed
            r8.<init>((java.util.List) r5, (int) r0)
            goto L_0x00c0
        L_0x00bf:
            r8 = r2
        L_0x00c0:
            if (r23 == 0) goto L_0x00e8
            java.util.ArrayList r5 = X.C29351c6.A0E(r23)
            java.util.Iterator r4 = r23.iterator()
        L_0x00ca:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r2 = r4.next()
            X.1EC r2 = (X.AnonymousClass1EC) r2
            r1 = 23
            X.9Ed r0 = new X.9Ed
            r0.<init>((X.AnonymousClass1EC) r2, (int) r1)
            r5.add(r0)
            goto L_0x00ca
        L_0x00e1:
            r0 = 22
            X.9Ed r2 = new X.9Ed
            r2.<init>((java.util.List) r5, (int) r0)
        L_0x00e8:
            X.9F7 r1 = new X.9F7
            r14 = r20
            r15 = r7
            r16 = r8
            r17 = r2
            r18 = r11
            r13 = r1
            r13.<init>((X.AnonymousClass1EC) r14, (X.C178709Ed) r15, (X.C178709Ed) r16, (X.C178709Ed) r17, (java.lang.String) r18)
            java.lang.Object r10 = r1.A00
            X.1ca r10 = (X.C29621ca) r10
            r12.L$0 = r1
            r12.label = r6
            r13 = 391(0x187, float:5.48E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r16 = 0
            java.lang.Object r2 = r9.A0A(r10, r11, r12, r13, r14, r16)
            if (r2 != r3) goto L_0x0028
            return r3
        L_0x010c:
            X.4uN r12 = new X.4uN
            r12.<init>(r4, r3)
            goto L_0x0016
        L_0x0113:
            java.util.ArrayList r5 = X.C29351c6.A0E(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x011b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r1.next()
            X.9DL r0 = (X.AnonymousClass9DL) r0
            java.lang.Object r0 = r0.A03
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A00
            r5.add(r0)
            goto L_0x011b
        L_0x0131:
            X.0wS r5 = X.C18460wS.A00
        L_0x0133:
            java.lang.Object r0 = r6.A01
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0145:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0145
            r3.add(r1)
            goto L_0x0145
        L_0x015a:
            java.util.ArrayList r4 = X.C29351c6.A0E(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0162:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r1.next()
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r0 = r0.A02
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r0 = r0.A02
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A00
            r4.add(r0)
            goto L_0x0162
        L_0x017c:
            X.0wS r4 = X.C18460wS.A00
        L_0x017e:
            java.lang.Object r0 = r6.A04
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0190:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9DL r0 = (X.AnonymousClass9DL) r0
            java.lang.Object r0 = r0.A03
            if (r0 == 0) goto L_0x0190
            r3.add(r1)
            goto L_0x0190
        L_0x01a5:
            java.util.ArrayList r2 = X.C29351c6.A0E(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x01ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r0 = r1.next()
            X.9DL r0 = (X.AnonymousClass9DL) r0
            java.lang.Object r0 = r0.A02
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r0 = r0.A02
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x01ad
        L_0x01c7:
            X.0wS r2 = X.C18460wS.A00
        L_0x01c9:
            java.util.ArrayList r0 = X.C29431cG.A0k(r4, r5)
            java.util.ArrayList r1 = X.C29431cG.A0k(r2, r0)
            X.3pg r0 = new X.3pg
            r0.<init>(r1)
            return r0
        L_0x01d7:
            boolean r0 = r2 instanceof X.C173538vF
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r2 instanceof X.C173558vH
            if (r0 != 0) goto L_0x01e4
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x01e4:
            X.3ph r0 = X.C77233ph.A00
            return r0
        L_0x01e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper.A00(X.1EC, java.util.List, java.util.List, java.util.List, X.1dr):java.lang.Object");
    }
}
