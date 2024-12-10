package X;

/* renamed from: X.6Oz  reason: invalid class name and case insensitive filesystem */
public final class C122366Oz extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C125646bQ A00;

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
        if (X.C18070vi.A18(X.C108965cb.A0o(r3, X.AnonymousClass6RZ.INVOKE_BR_TOS.noticeId), true) != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        if (X.C18070vi.A18(X.C108965cb.A0o(r3, X.AnonymousClass6RZ.META_AI_SHORTCUT_BR_TOS.noticeId), true) != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C125646bQ r18, X.C29621ca r19, X.AnonymousClass9F7 r20) {
        /*
            r5 = 0
            r2 = 1
            r8 = r20
            X.C18070vi.A0d(r8, r2)
            r0 = 2
            r9 = r18
            java.util.ArrayList r7 = X.C108955ca.A16(r9, r0)
            r14 = r19
            X.C108945cZ.A1N(r14)     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r8.A00     // Catch:{ 1UI -> 0x018a }
            X.2rm r13 = new X.2rm     // Catch:{ 1UI -> 0x018a }
            r13.<init>()     // Catch:{ 1UI -> 0x018a }
            X.A3p r4 = X.C20023A3p.A00     // Catch:{ 1UI -> 0x018a }
            r3 = 6
            X.AfV r1 = new X.AfV     // Catch:{ 1UI -> 0x018a }
            r1.<init>(r0, r4, r3)     // Catch:{ 1UI -> 0x018a }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r13.A03(r14, r1, r0)     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x0180
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x018a }
            java.lang.String r0 = "notice"
            r1[r5] = r0     // Catch:{ 1UI -> 0x018a }
            X.AfU r15 = X.C108945cZ.A0W(r4, r3)     // Catch:{ 1UI -> 0x018a }
            r17 = 0
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r1
            java.util.ArrayList r6 = r13.A08(r14, r15, r16, r17, r19)     // Catch:{ 1UI -> 0x018a }
            if (r6 == 0) goto L_0x0185
            X.86f r4 = r9.A00     // Catch:{ 1UI -> 0x018a }
            r0 = 10
            int r0 = X.C29351c6.A0C(r6, r0)     // Catch:{ 1UI -> 0x018a }
            int r1 = X.C200610r.A03(r0)     // Catch:{ 1UI -> 0x018a }
            r0 = 16
            if (r1 >= r0) goto L_0x0055
            r1 = 16
        L_0x0055:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ 1UI -> 0x018a }
            r3.<init>(r1)     // Catch:{ 1UI -> 0x018a }
            java.util.Iterator r13 = r6.iterator()     // Catch:{ 1UI -> 0x018a }
        L_0x005e:
            boolean r0 = r13.hasNext()     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r13.next()     // Catch:{ 1UI -> 0x018a }
            X.6Ov r0 = (X.C122326Ov) r0     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r6 = r0.A02     // Catch:{ 1UI -> 0x018a }
            X.9Ch r6 = (X.C178229Ch) r6     // Catch:{ 1UI -> 0x018a }
            long r0 = r6.A00     // Catch:{ 1UI -> 0x018a }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ 1UI -> 0x018a }
            long r0 = r6.A01     // Catch:{ 1UI -> 0x018a }
            r10 = 5
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r6)
            X.1D6 r0 = X.C108975cc.A0i(r12, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r1 = r0.first     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.second     // Catch:{ 1UI -> 0x018a }
            r3.put(r1, r0)     // Catch:{ 1UI -> 0x018a }
            goto L_0x005e
        L_0x008a:
            X.7DD r4 = (X.AnonymousClass7DD) r4     // Catch:{ 1UI -> 0x018a }
            int r0 = r4.A00     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "WabaiConsentManager/sync/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1UI -> 0x018a }
            r0 = 20231027(0x134b373, double:9.9954554E-317)
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.booleanValue()     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "yes"
            java.lang.Object r0 = r4.A02     // Catch:{ 1UI -> 0x018a }
            X.6xO r0 = (X.C138616xO) r0     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r0.A04     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            r0.A04(r1, r2)     // Catch:{ 1UI -> 0x018a }
        L_0x00b7:
            java.lang.Object r0 = r4.A01     // Catch:{ 1UI -> 0x018a }
            X.88b r0 = (X.C1603388b) r0     // Catch:{ 1UI -> 0x018a }
            r0.C3p(r2)     // Catch:{ 1UI -> 0x018a }
            return
        L_0x00bf:
            java.lang.String r0 = "BonsaiTos/sync/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1UI -> 0x018a }
            X.6RZ r0 = X.AnonymousClass6RZ.INVOKE_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)     // Catch:{ 1UI -> 0x018a }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ 1UI -> 0x018a }
            if (r0 != 0) goto L_0x00e5
            X.6RZ r0 = X.AnonymousClass6RZ.INVOKE_BR_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ 1UI -> 0x018a }
            r6 = 0
            if (r0 == 0) goto L_0x00e6
        L_0x00e5:
            r6 = 1
        L_0x00e6:
            X.6RZ r0 = X.AnonymousClass6RZ.META_AI_SHORTCUT_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ 1UI -> 0x018a }
            if (r0 != 0) goto L_0x0103
            X.6RZ r0 = X.AnonymousClass6RZ.META_AI_SHORTCUT_BR_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ 1UI -> 0x018a }
            r10 = 0
            if (r0 == 0) goto L_0x0104
        L_0x0103:
            r10 = 1
        L_0x0104:
            X.6RZ r0 = X.AnonymousClass6RZ.AGENT_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x017d
            boolean r12 = r0.booleanValue()     // Catch:{ 1UI -> 0x018a }
        L_0x0114:
            X.6RZ r0 = X.AnonymousClass6RZ.IMAGINE_ME_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x017b
            boolean r11 = r0.booleanValue()     // Catch:{ 1UI -> 0x018a }
        L_0x0124:
            X.6RZ r0 = X.AnonymousClass6RZ.AI_STUDIO_TOS     // Catch:{ 1UI -> 0x018a }
            long r0 = r0.noticeId     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = X.C108965cb.A0o(r3, r0)     // Catch:{ 1UI -> 0x018a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 1UI -> 0x018a }
            if (r0 == 0) goto L_0x0179
            boolean r1 = r0.booleanValue()     // Catch:{ 1UI -> 0x018a }
        L_0x0134:
            java.lang.Object r0 = r4.A02     // Catch:{ 1UI -> 0x018a }
            X.73d r0 = (X.C1408073d) r0     // Catch:{ 1UI -> 0x018a }
            X.1rq r3 = X.C1408073d.A01(r0)     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r3.A03     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            X.C38761rq.A00(r0, r6)     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r3.A01     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            X.C38761rq.A00(r0, r12)     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r3.A06     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            X.C38761rq.A00(r0, r10)     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r3.A05     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            X.C38761rq.A00(r0, r11)     // Catch:{ 1UI -> 0x018a }
            X.0vl r0 = r3.A02     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1UI -> 0x018a }
            X.1H7 r0 = (X.AnonymousClass1H7) r0     // Catch:{ 1UI -> 0x018a }
            X.C38761rq.A00(r0, r1)     // Catch:{ 1UI -> 0x018a }
            java.lang.Object r0 = r4.A01     // Catch:{ 1UI -> 0x018a }
            X.C108945cZ.A1Q(r0)     // Catch:{ 1UI -> 0x018a }
            goto L_0x017f
        L_0x0179:
            r1 = 0
            goto L_0x0134
        L_0x017b:
            r11 = 0
            goto L_0x0124
        L_0x017d:
            r12 = 0
            goto L_0x0114
        L_0x017f:
            return
        L_0x0180:
            X.1UI r0 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x018a }
            goto L_0x0189
        L_0x0185:
            X.1UI r0 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x018a }
        L_0x0189:
            throw r0     // Catch:{ 1UI -> 0x018a }
        L_0x018a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetDisclosureStageByIdsResponseClientSuccess: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            r7.add(r0)
            X.C108945cZ.A1N(r14)     // Catch:{ 1UI -> 0x01d2 }
            java.lang.Object r11 = r8.A00     // Catch:{ 1UI -> 0x01d2 }
            X.2rm r10 = new X.2rm     // Catch:{ 1UI -> 0x01d2 }
            r10.<init>()     // Catch:{ 1UI -> 0x01d2 }
            X.A3p r6 = X.C20023A3p.A00     // Catch:{ 1UI -> 0x01d2 }
            r4 = 5
            X.AfU r3 = X.C108945cZ.A0W(r6, r4)     // Catch:{ 1UI -> 0x01d2 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x01d2 }
            java.lang.String r0 = "error"
            r1[r5] = r0     // Catch:{ 1UI -> 0x01d2 }
            java.lang.Object r0 = r10.A03(r14, r3, r1)     // Catch:{ 1UI -> 0x01d2 }
            if (r0 == 0) goto L_0x01c8
            X.AfV r1 = new X.AfV     // Catch:{ 1UI -> 0x01d2 }
            r1.<init>(r11, r6, r4)     // Catch:{ 1UI -> 0x01d2 }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x01d2 }
            java.lang.Object r0 = r10.A03(r14, r1, r0)     // Catch:{ 1UI -> 0x01d2 }
            if (r0 == 0) goto L_0x01cd
            X.86f r0 = r9.A00     // Catch:{ 1UI -> 0x01d2 }
            r0.Bti()     // Catch:{ 1UI -> 0x01d2 }
            return
        L_0x01c8:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01d2 }
            goto L_0x01d1
        L_0x01cd:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01d2 }
        L_0x01d1:
            throw r0     // Catch:{ 1UI -> 0x01d2 }
        L_0x01d2:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetDisclosureStageByIdsResponseClientError: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            r7.add(r0)
            X.C108945cZ.A1N(r14)     // Catch:{ 1UI -> 0x021a }
            java.lang.Object r10 = r8.A00     // Catch:{ 1UI -> 0x021a }
            X.2rm r8 = new X.2rm     // Catch:{ 1UI -> 0x021a }
            r8.<init>()     // Catch:{ 1UI -> 0x021a }
            X.A3p r6 = X.C20023A3p.A00     // Catch:{ 1UI -> 0x021a }
            r4 = 7
            X.AfU r3 = X.C108945cZ.A0W(r6, r4)     // Catch:{ 1UI -> 0x021a }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x021a }
            java.lang.String r0 = "error"
            r1[r5] = r0     // Catch:{ 1UI -> 0x021a }
            java.lang.Object r0 = r8.A03(r14, r3, r1)     // Catch:{ 1UI -> 0x021a }
            if (r0 == 0) goto L_0x0210
            X.AfV r1 = new X.AfV     // Catch:{ 1UI -> 0x021a }
            r1.<init>(r10, r6, r4)     // Catch:{ 1UI -> 0x021a }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x021a }
            java.lang.Object r0 = r8.A03(r14, r1, r0)     // Catch:{ 1UI -> 0x021a }
            if (r0 == 0) goto L_0x0215
            X.86f r0 = r9.A00     // Catch:{ 1UI -> 0x021a }
            r0.Bti()     // Catch:{ 1UI -> 0x021a }
            return
        L_0x0210:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x021a }
            goto L_0x0219
        L_0x0215:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x021a }
        L_0x0219:
            throw r0     // Catch:{ 1UI -> 0x021a }
        L_0x021a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetDisclosureStageByIdsResponseServerError: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            java.lang.StringBuilder r1 = X.C108995ce.A0a(r0, r7)
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C108995ce.A0X(r0, r7)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122366Oz.A00(X.6bQ, X.1ca, X.9F7):void");
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A00.A00.Bti();
    }

    public C122366Oz(C125646bQ r1, AnonymousClass9F7 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
