package com.whatsapp.communitymedia;

import X.AnonymousClass20I;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C73373Vg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.communitymedia.CommunityMediaViewModel$itemListFlow$1", f = "CommunityMediaViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaViewModel$itemListFlow$1 extends C30431dv implements AnonymousClass20I {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaViewModel$itemListFlow$1(C73373Vg r2, C30391dr r3) {
        super(6, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        CommunityMediaViewModel$itemListFlow$1 communityMediaViewModel$itemListFlow$1 = new CommunityMediaViewModel$itemListFlow$1(this.this$0, (C30391dr) obj6);
        communityMediaViewModel$itemListFlow$1.L$0 = obj;
        communityMediaViewModel$itemListFlow$1.L$1 = obj2;
        communityMediaViewModel$itemListFlow$1.L$2 = obj3;
        communityMediaViewModel$itemListFlow$1.L$3 = obj4;
        return communityMediaViewModel$itemListFlow$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r3 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r1.intValue() != 109) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        if ((!r2.isEmpty()) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0280, code lost:
        if (r15 == false) goto L_0x0282;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r3 = r25
            int r0 = r3.label
            if (r0 != 0) goto L_0x02d3
            X.C30691eM.A01(r26)
            java.lang.Object r4 = r3.L$0
            X.6yD r4 = (X.C139096yD) r4
            java.lang.Object r1 = r3.L$1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r6 = r3.L$2
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r3.L$3
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0031
            boolean r0 = X.AnonymousClass3MX.A1a(r1)
            if (r0 == 0) goto L_0x0031
            X.3pw r0 = new X.3pw
            r0.<init>()
        L_0x002c:
            java.util.List r0 = X.C18070vi.A0M(r0)
            return r0
        L_0x0031:
            X.3Vg r0 = r3.this$0
            X.1Dg r1 = r0.A03
            java.lang.Object r1 = r1.A06()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 0
            if (r1 == 0) goto L_0x0045
            int r3 = r1.length()
            r1 = 0
            if (r3 != 0) goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            r17 = r1 ^ 1
            X.1DT r1 = r0.A07
            java.lang.Object r1 = r1.A06()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x005c
            int r3 = r1.intValue()
            r1 = 109(0x6d, float:1.53E-43)
            r16 = 0
            if (r3 == r1) goto L_0x005e
        L_0x005c:
            r16 = 1
        L_0x005e:
            X.1G4 r1 = r0.A0p
            java.lang.Object r3 = r1.getValue()
            X.4Cq r1 = X.C82914Cq.SEARCH
            if (r3 == r1) goto L_0x0071
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            r15 = 0
            if (r1 == 0) goto L_0x0072
        L_0x0071:
            r15 = 1
        L_0x0072:
            X.0vl r1 = r0.A0T
            java.lang.Object r1 = r1.getValue()
            X.6q8 r1 = (X.C134156q8) r1
            X.1jz r1 = r1.A0D
            java.util.List r21 = r1.A04()
            X.C18070vi.A0X(r21)
            if (r17 != 0) goto L_0x00b3
            if (r16 != 0) goto L_0x00b3
            if (r15 != 0) goto L_0x00b3
            boolean r1 = r0.A0w
            java.util.List r8 = r4.A02
            if (r1 == 0) goto L_0x00a5
            X.C18070vi.A0W(r8)
            java.util.ArrayList r4 = X.C17880vN.A10(r8)
        L_0x0096:
            X.C18070vi.A0b(r4)
            int r1 = r4.size()
            if (r1 != 0) goto L_0x00b7
            X.3px r0 = new X.3px
            r0.<init>()
            goto L_0x002c
        L_0x00a5:
            r3 = 5
            int r1 = r8.size()
            int r1 = java.lang.Math.min(r3, r1)
            java.util.List r4 = r8.subList(r5, r1)
            goto L_0x0096
        L_0x00b3:
            java.util.List r4 = r4.A02
            r8 = r4
            goto L_0x0096
        L_0x00b7:
            X.DcQ r1 = X.AnonymousClass1ZT.A01()
            X.3py r3 = r0.A0I
            r1.add(r3)
            if (r16 != 0) goto L_0x0280
            if (r15 == 0) goto L_0x0282
            X.3q4 r3 = r0.A0H
        L_0x00c6:
            r1.add(r3)
        L_0x00c9:
            java.util.List r7 = X.C29431cG.A0t(r4)
            java.util.ArrayList r3 = X.C29351c6.A0E(r7)
            java.util.Iterator r14 = r7.iterator()
        L_0x00d5:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0286
            X.206 r7 = X.C17880vN.A0Y(r14)
            X.C18070vi.A0b(r7)
            boolean r9 = r7 instanceof X.C438921i
            if (r9 == 0) goto L_0x012c
            X.21V r7 = (X.AnonymousClass21V) r7
            java.lang.String r9 = r7.A19()
            if (r9 == 0) goto L_0x0124
            X.482 r11 = new X.482
            r11.<init>(r9)
        L_0x00f3:
            r10 = 0
            X.6sZ r9 = new X.6sZ
            r9.<init>(r11, r10, r10, r7)
            r10 = 26
            X.5Am r22 = X.AnonymousClass3MW.A16(r0, r10)
            r10 = 27
            X.5Am r23 = X.AnonymousClass3MW.A16(r0, r10)
            X.4ZN r20 = r0.A0U(r7)
            X.205 r7 = r7.A0v
            X.C18070vi.A0W(r7)
            boolean r24 = r2.containsKey(r7)
            X.4jq r7 = new X.4jq
            r18 = r7
            r19 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.3pz r10 = new X.3pz
            r10.<init>(r7)
        L_0x0120:
            r3.add(r10)
            goto L_0x00d5
        L_0x0124:
            r9 = 2131897363(0x7f122c13, float:1.9429613E38)
            X.6IR r11 = X.C72453Mb.A0q(r9)
            goto L_0x00f3
        L_0x012c:
            boolean r9 = r7 instanceof X.AnonymousClass210
            if (r9 == 0) goto L_0x01ac
            r9 = r7
            X.210 r9 = (X.AnonymousClass210) r9
            X.1gU r11 = r0.A0R
            java.lang.String r12 = r9.A0P()
            r10 = 1
            java.util.ArrayList r10 = r11.A04(r12, r10)
            if (r10 == 0) goto L_0x01ac
            X.118 r7 = r0.A0M
            android.content.Context r10 = r7.A00
            X.1no r7 = r0.A0P
            X.4Wu r10 = X.C87744Wu.A00(r10, r7, r11, r9, r5)
            java.lang.String r11 = r10.A04
            if (r11 == 0) goto L_0x018c
            int r7 = r11.length()
            if (r7 <= 0) goto L_0x018c
        L_0x0154:
            X.482 r12 = new X.482
            r12.<init>(r11)
        L_0x0159:
            X.4TL r11 = new X.4TL
            r11.<init>(r9, r10)
            r7 = 0
            X.6sZ r10 = new X.6sZ
            r10.<init>(r12, r7, r7, r11)
            r7 = 30
            X.5Am r22 = X.AnonymousClass3MW.A16(r0, r7)
            r7 = 31
            X.5Am r23 = X.AnonymousClass3MW.A16(r0, r7)
            X.4ZN r20 = r0.A0U(r9)
            X.205 r7 = r9.A0v
            X.C18070vi.A0W(r7)
            boolean r24 = r2.containsKey(r7)
            X.4js r7 = new X.4js
            r18 = r7
            r19 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.3q3 r10 = new X.3q3
            r10.<init>(r7)
            goto L_0x0120
        L_0x018c:
            java.lang.String r11 = r10.A03
            if (r11 == 0) goto L_0x0197
            int r7 = r11.length()
            if (r7 <= 0) goto L_0x0197
            goto L_0x0154
        L_0x0197:
            X.4NY r7 = r10.A00
            java.lang.String r11 = r7.A01
            if (r11 == 0) goto L_0x01a4
            int r7 = r11.length()
            if (r7 <= 0) goto L_0x01a4
            goto L_0x0154
        L_0x01a4:
            r7 = 2131888620(0x7f1209ec, float:1.941188E38)
            X.6IR r12 = X.AnonymousClass3MX.A0t(r7)
            goto L_0x0159
        L_0x01ac:
            boolean r9 = r7 instanceof X.C438421d
            if (r9 == 0) goto L_0x020e
            X.21V r7 = (X.AnonymousClass21V) r7
            java.lang.String r9 = r7.A18()
            if (r9 == 0) goto L_0x0206
            X.482 r13 = new X.482
            r13.<init>(r9)
        L_0x01bd:
            X.1BI r12 = r7.A0H()
            X.205 r11 = r7.A0v
            X.1BI r10 = r11.A00
            if (r12 == 0) goto L_0x0203
            if (r10 == 0) goto L_0x0203
            X.5VN r9 = new X.5VN
            r9.<init>(r0, r12, r10)
        L_0x01ce:
            X.481 r12 = new X.481
            r12.<init>(r9)
            r9 = 2131231993(0x7f0804f9, float:1.8080083E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            X.6sZ r9 = new X.6sZ
            r9.<init>(r13, r12, r10, r7)
            r10 = 28
            X.5Am r22 = X.AnonymousClass3MW.A16(r0, r10)
            r10 = 29
            X.5Am r23 = X.AnonymousClass3MW.A16(r0, r10)
            X.4ZN r20 = r0.A0U(r7)
            boolean r24 = r2.containsKey(r11)
            X.4jr r7 = new X.4jr
            r18 = r7
            r19 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.3q2 r10 = new X.3q2
            r10.<init>(r7)
            goto L_0x0120
        L_0x0203:
            X.5Vs r9 = X.C106405Vs.A00
            goto L_0x01ce
        L_0x0206:
            r9 = 2131889027(0x7f120b83, float:1.9412706E38)
            X.6IR r13 = X.C72453Mb.A0q(r9)
            goto L_0x01bd
        L_0x020e:
            boolean r9 = r7 instanceof X.AnonymousClass21Y
            if (r9 == 0) goto L_0x0270
            X.21V r7 = (X.AnonymousClass21V) r7
            java.lang.String r9 = r7.A18()
            if (r9 == 0) goto L_0x0268
            X.482 r13 = new X.482
            r13.<init>(r9)
        L_0x021f:
            X.1BI r12 = r7.A0H()
            X.205 r11 = r7.A0v
            X.1BI r10 = r11.A00
            if (r12 == 0) goto L_0x0265
            if (r10 == 0) goto L_0x0265
            X.5VO r9 = new X.5VO
            r9.<init>(r0, r12, r10)
        L_0x0230:
            X.481 r12 = new X.481
            r12.<init>(r9)
            r9 = 2131232402(0x7f080692, float:1.8080912E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            X.6sZ r9 = new X.6sZ
            r9.<init>(r13, r12, r10, r7)
            r10 = 32
            X.5Am r22 = X.AnonymousClass3MW.A16(r0, r10)
            r10 = 33
            X.5Am r23 = X.AnonymousClass3MW.A16(r0, r10)
            X.4ZN r20 = r0.A0U(r7)
            boolean r24 = r2.containsKey(r11)
            X.4jt r7 = new X.4jt
            r18 = r7
            r19 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.3q6 r10 = new X.3q6
            r10.<init>(r7)
            goto L_0x0120
        L_0x0265:
            X.5Vt r9 = X.C106415Vt.A00
            goto L_0x0230
        L_0x0268:
            r9 = 2131889038(0x7f120b8e, float:1.9412728E38)
            X.6IR r13 = X.C72453Mb.A0q(r9)
            goto L_0x021f
        L_0x0270:
            X.4ZN r10 = r0.A0U(r7)
            X.4jy r9 = new X.4jy
            r9.<init>(r7, r10)
            X.3q5 r10 = new X.3q5
            r10.<init>(r9)
            goto L_0x0120
        L_0x0280:
            if (r15 != 0) goto L_0x00c9
        L_0x0282:
            X.3q1 r3 = r0.A0G
            goto L_0x00c6
        L_0x0286:
            r1.addAll(r3)
            if (r17 != 0) goto L_0x02ce
            if (r16 != 0) goto L_0x02ce
            if (r15 != 0) goto L_0x02ce
            int r3 = r8.size()
            int r2 = r4.size()
            if (r3 <= r2) goto L_0x029e
            X.3q7 r2 = r0.A0J
            r1.add(r2)
        L_0x029e:
            boolean r2 = X.AnonymousClass000.A1a(r6)
            if (r2 == 0) goto L_0x02ce
            X.3pv r2 = r0.A0E
            r1.add(r2)
            X.3q1 r0 = r0.A0F
            r1.add(r0)
            java.util.ArrayList r4 = X.C29351c6.A0E(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x02b6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r2 = r3.next()
            X.4jz r2 = (X.C94064jz) r2
            X.3q0 r0 = new X.3q0
            r0.<init>(r2)
            r4.add(r0)
            goto L_0x02b6
        L_0x02cb:
            r1.addAll(r4)
        L_0x02ce:
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r1)
            return r0
        L_0x02d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.communitymedia.CommunityMediaViewModel$itemListFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
