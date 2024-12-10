package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AWX implements C22516BAz {
    public C107095Yj A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final WeakReference A03;

    public /* synthetic */ void Bsq(C21598Amm amm) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if ((!r1.A03.A02(((X.C133836pa) r1.A04.get()).A00(), X.AnonymousClass8BR.A05(r1.A02, 4309))) == false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r59) {
        /*
            r58 = this;
            r8 = r58
            X.5Yj r0 = r8.A00
            if (r0 == 0) goto L_0x0009
            r0.cancel()
        L_0x0009:
            X.00H r0 = r8.A02
            java.lang.Object r3 = r0.get()
            X.1md r3 = (X.C35681md) r3
            X.00H r0 = r3.A0P
            boolean r0 = X.C72453Mb.A1X(r0)
            r7 = 0
            if (r0 == 0) goto L_0x00c9
            X.00H r11 = r3.A0Y
            java.lang.Object r1 = r11.get()
            X.9my r1 = (X.C191669my) r1
            X.9qs r4 = r1.A03
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6pa r0 = (X.C133836pa) r0
            java.lang.String r2 = r0.A00()
            X.0ve r1 = r1.A02
            r0 = 4271(0x10af, float:5.985E-42)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            boolean r0 = r4.A02(r2, r0)
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r1 = r11.get()
            X.9my r1 = (X.C191669my) r1
            java.util.List r4 = r1.A06
            monitor-enter(r4)
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x031f }
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            long r9 = r9 - r5
            long r5 = r1.A00     // Catch:{ all -> 0x031f }
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            X.0wS r6 = X.C18460wS.A00     // Catch:{ all -> 0x031f }
        L_0x0057:
            java.util.List r2 = r1.A00(r6)     // Catch:{ all -> 0x031f }
            goto L_0x0082
        L_0x005c:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x031f }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x031f }
        L_0x0064:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x031f }
            X.1ch r2 = (X.C29681ch) r2     // Catch:{ all -> 0x031f }
            X.1CJ r0 = r1.A01     // Catch:{ all -> 0x031f }
            X.1ci r2 = r0.A0A(r2)     // Catch:{ all -> 0x031f }
            boolean r0 = r2 instanceof X.C46162Dk     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x0064
            X.2Dk r2 = (X.C46162Dk) r2     // Catch:{ all -> 0x031f }
            if (r2 == 0) goto L_0x0064
            r6.add(r2)     // Catch:{ all -> 0x031f }
            goto L_0x0064
        L_0x0082:
            monitor-exit(r4)
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0122
            r2.size()
        L_0x008c:
            boolean r0 = r2.isEmpty()
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cc
            X.00H r0 = r3.A0M
            X.1KB r4 = X.C108945cZ.A0a(r0)
            r1 = 19
            X.AkP r0 = new X.AkP
            r0.<init>(r8, r2, r1)
            r4.A0J(r0)
            java.lang.Object r1 = r11.get()
            X.9my r1 = (X.C191669my) r1
            X.9qs r4 = r1.A03
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6pa r0 = (X.C133836pa) r0
            java.lang.String r2 = r0.A00()
            X.0ve r1 = r1.A02
            r0 = 4309(0x10d5, float:6.038E-42)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            boolean r0 = r4.A02(r2, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00cd
        L_0x00c9:
            r8.A00 = r7
            return
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            java.lang.Object r0 = X.C18070vi.A0E(r11)
            X.9my r0 = (X.C191669my) r0
            X.AWW r4 = new X.AWW
            r4.<init>(r0, r8)
            X.00H r0 = r3.A0N
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "NewsletterManager/getRecommendedNewsletters/not connected -> skipping"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.8xu r0 = new X.8xu
            r0.<init>()
            r4.Bsq(r0)
            goto L_0x00c9
        L_0x00f2:
            if (r5 != 0) goto L_0x0106
            if (r59 != 0) goto L_0x0106
            X.11P r0 = r3.A0D
            long r5 = X.AnonymousClass11P.A01(r0)
            long r0 = r3.A00
            long r5 = r5 - r0
            r1 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            goto L_0x00c9
        L_0x0106:
            X.11P r0 = r3.A0D
            long r0 = X.AnonymousClass11P.A01(r0)
            r3.A00 = r0
            r1 = 20
            r0 = 1
            com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob r7 = new com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob
            r7.<init>(r4, r1, r0)
            X.00H r0 = r3.A0Z
            java.lang.Object r0 = r0.get()
            X.1Mm r0 = (X.C25001Mm) r0
            r0.A01(r7)
            goto L_0x00c9
        L_0x0122:
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6pa r0 = (X.C133836pa) r0
            java.lang.String r16 = r0.A00()
            X.9qs r10 = r1.A03
            X.0ve r2 = r1.A02
            r0 = 4271(0x10af, float:5.985E-42)
            long r14 = X.AnonymousClass8BR.A05(r2, r0)
            X.00H r2 = r10.A01
            java.lang.Object r6 = r2.get()
            X.2lK r6 = (X.C58832lK) r6
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r16)
            java.lang.String r0 = "_timestamp"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r5)
            java.lang.String r0 = r6.A00(r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Long r0 = X.C108965cb.A0m(r0)
        L_0x0154:
            r9 = 0
            if (r0 == 0) goto L_0x0183
            long r12 = r0.longValue()
            r5 = -1
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            X.11P r0 = r10.A00
            long r5 = r0.A05()
            long r5 = r5 - r12
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0183
        L_0x016c:
            java.lang.Object r5 = r2.get()
            X.2lK r5 = (X.C58832lK) r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r16)
            java.lang.String r0 = "_data"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.String r9 = r5.A00(r0)
            goto L_0x0183
        L_0x0181:
            r0 = 0
            goto L_0x0154
        L_0x0183:
            X.00H r0 = r1.A05     // Catch:{ all -> 0x0282 }
            r0.get()     // Catch:{ all -> 0x0282 }
            if (r9 != 0) goto L_0x018e
            X.0wS r2 = X.C18460wS.A00     // Catch:{ all -> 0x0282 }
            goto L_0x0287
        L_0x018e:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0282 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x0282 }
            r0.<init>(r9)     // Catch:{ all -> 0x0282 }
            X.Akx r16 = X.A6n.A04(r0)     // Catch:{ all -> 0x0282 }
        L_0x019b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0287
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0282 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x0282 }
            X.25J r6 = X.C29681ch.A03     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "jid"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ all -> 0x0282 }
            X.1ch r5 = r6.A01(r5)     // Catch:{ all -> 0x0282 }
            r30 = 0
            if (r5 == 0) goto L_0x019b
            X.1ci r10 = new X.1ci     // Catch:{ all -> 0x0282 }
            r10.<init>((X.AnonymousClass1BI) r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "name"
            java.lang.String r31 = r0.optString(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "name_id"
            long r43 = r0.getLong(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "desc"
            java.lang.String r32 = r0.optString(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "desc_id"
            long r45 = r0.getLong(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "pic"
            java.lang.String r33 = r0.optString(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "pic_id"
            long r47 = r0.getLong(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "pic_preview"
            java.lang.String r34 = r0.optString(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "pic_preview_id"
            long r49 = r0.getLong(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "verified"
            int r9 = r0.getInt(r5)     // Catch:{ all -> 0x0282 }
            X.0z2 r5 = X.AnonymousClass9IW.A00     // Catch:{ all -> 0x0282 }
            java.util.Iterator r12 = r5.iterator()     // Catch:{ all -> 0x0282 }
        L_0x01f8:
            boolean r5 = r12.hasNext()     // Catch:{ all -> 0x0282 }
            if (r5 == 0) goto L_0x027a
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x0282 }
            X.9IW r5 = (X.AnonymousClass9IW) r5     // Catch:{ all -> 0x0282 }
            int r6 = r5.value     // Catch:{ all -> 0x0282 }
            if (r6 != r9) goto L_0x01f8
            java.lang.String r6 = "verification_source"
            java.lang.Integer r6 = X.AnonymousClass8BT.A0k(r6, r0)     // Catch:{ all -> 0x0282 }
            X.9IZ r22 = X.AnonymousClass9QJ.A00(r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "membership"
            int r6 = r0.getInt(r6)     // Catch:{ all -> 0x0282 }
            X.9Ig r20 = X.AnonymousClass9QH.A00(r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "subscribers"
            long r53 = r0.getLong(r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "creation"
            long r51 = r0.getLong(r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "invite_code"
            java.lang.String r36 = r0.optString(r6)     // Catch:{ all -> 0x0282 }
            X.9IR r23 = X.AnonymousClass9IR.PUBLIC     // Catch:{ all -> 0x0282 }
            X.9Ia r24 = X.C179459Ia.NOT_ENFORCED     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "wamo_sub_plan_id"
            long r14 = r0.optLong(r6)     // Catch:{ all -> 0x0282 }
            r12 = 0
            int r6 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0242
            java.lang.Long r30 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0282 }
        L_0x0242:
            java.lang.String r6 = "wamo_sub_status"
            java.lang.Integer r0 = X.AnonymousClass8BT.A0k(r6, r0)     // Catch:{ all -> 0x0282 }
            X.9Ib r26 = X.AnonymousClass9QK.A00(r0)     // Catch:{ all -> 0x0282 }
            r41 = -1
            r39 = 0
            r40 = 1
            java.util.ArrayList r37 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0282 }
            X.9Ih r21 = X.C179519Ih.DEFAULT     // Catch:{ all -> 0x0282 }
            java.lang.Integer r28 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0282 }
            X.1Om r38 = X.C25511Om.A00     // Catch:{ all -> 0x0282 }
            X.2Dk r0 = new X.2Dk     // Catch:{ all -> 0x0282 }
            r29 = r7
            r35 = r7
            r57 = r39
            r18 = r7
            r19 = r10
            r25 = r5
            r27 = r7
            r55 = r40
            r56 = r39
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49, r51, r53, r55, r56, r57)     // Catch:{ all -> 0x0282 }
            r2.add(r0)     // Catch:{ all -> 0x0282 }
            goto L_0x019b
        L_0x027a:
            java.lang.String r2 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0282 }
            r0.<init>(r2)     // Catch:{ all -> 0x0282 }
            throw r0     // Catch:{ all -> 0x0282 }
        L_0x0282:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0287:
            boolean r5 = r2 instanceof X.AnonymousClass1IU
            r0 = r5 ^ 1
            if (r0 == 0) goto L_0x030b
            java.util.List r2 = (java.util.List) r2
            r2.size()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r2.iterator()
        L_0x029a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r6 = r9.next()
            r0 = r6
            X.1ci r0 = (X.C29691ci) r0
            X.1CJ r5 = r1.A01
            X.1BI r0 = r0.A08()
            X.1ci r0 = r5.A0A(r0)
            if (r0 != 0) goto L_0x029a
            r10.add(r6)
            goto L_0x029a
        L_0x02b7:
            r10.size()
            java.util.Iterator r9 = r10.iterator()
        L_0x02be:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r6 = r9.next()
            X.1ci r6 = (X.C29691ci) r6
            X.1CJ r5 = r1.A01
            X.1BI r0 = r6.A08()
            r5.A0K(r6, r0)
            goto L_0x02be
        L_0x02d4:
            monitor-enter(r4)
            r2.size()     // Catch:{ all -> 0x031f }
            r4.clear()     // Catch:{ all -> 0x031f }
            r5 = 0
            r1.A00 = r5     // Catch:{ all -> 0x031f }
            java.util.ArrayList r6 = X.C29351c6.A0D(r2)     // Catch:{ all -> 0x031f }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x031f }
        L_0x02e7:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x031f }
            X.2Dk r0 = (X.C46162Dk) r0     // Catch:{ all -> 0x031f }
            X.1ch r0 = r0.A0M()     // Catch:{ all -> 0x031f }
            r6.add(r0)     // Catch:{ all -> 0x031f }
            goto L_0x02e7
        L_0x02fb:
            r4.addAll(r6)     // Catch:{ all -> 0x031f }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x031f }
            r1.A00 = r5     // Catch:{ all -> 0x031f }
            monitor-exit(r4)
            java.util.List r2 = r1.A00(r2)
            goto L_0x008c
        L_0x030b:
            java.lang.Throwable r1 = X.C30671eK.A00(r2)
            if (r1 == 0) goto L_0x0316
            java.lang.String r0 = "RecommendedCache Failed to deserialize"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0316:
            X.0wS r0 = X.C18460wS.A00
            if (r5 == 0) goto L_0x031b
            r2 = r0
        L_0x031b:
            java.util.List r2 = (java.util.List) r2
            goto L_0x008c
        L_0x031f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWX.A00(boolean):void");
    }

    public AWX(B8T b8t, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r4, b8t);
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = AnonymousClass3MW.A0z(b8t);
    }

    public void CDZ(List list, String str) {
        list.size();
        B8T b8t = (B8T) this.A03.get();
        if (b8t != null) {
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C46162Dk r3 = (C46162Dk) it.next();
                AnonymousClass1E7 A0H = ((AnonymousClass1M9) this.A01.get()).A0H(r3.A08());
                AnonymousClass1E7 A05 = A0H.A05();
                if (A05 != null) {
                    A0H = A05;
                }
                A0D.add(new C135386s7(r3, A0H, false));
            }
            b8t.Bwl(A0D);
        }
    }
}
