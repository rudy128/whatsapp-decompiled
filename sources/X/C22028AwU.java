package X;

/* renamed from: X.AwU  reason: case insensitive filesystem */
public final class C22028AwU extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C20905AbL $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public final /* synthetic */ C170018ny this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22028AwU(C20905AbL abL, C170018ny r3, A2N a2n) {
        super(0);
        this.this$0 = r3;
        this.$flowsContextParams = a2n;
        this.$flowTerminationCallback = abL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.9tm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r22 = this;
            r3 = r22
            X.8ny r0 = r3.this$0
            X.00H r0 = r0.A00
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 5764(0x1684, float:8.077E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r2, r1, r0)
            X.8ny r0 = r3.this$0
            if (r1 == 0) goto L_0x0035
            X.00H r0 = r0.A0E
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r5
            X.A2N r4 = r3.$flowsContextParams
            X.AbL r7 = r3.$flowTerminationCallback
            r6 = 0
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1OX r0 = r5.A0R
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlow$1 r3 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlow$1
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass3MX.A1Q(r3, r0)
        L_0x0032:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0035:
            X.00H r0 = r0.A0D
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.A8c r4 = (X.C20119A8c) r4
            X.A2N r6 = r3.$flowsContextParams
            X.AbL r5 = r3.$flowTerminationCallback
            r18 = 0
            r3 = 0
            X.C18070vi.A0d(r6, r3)
            X.0ve r8 = r4.A0B
            r0 = 5333(0x14d5, float:7.473E-42)
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 == 0) goto L_0x005f
            boolean r0 = X.AnonymousClass8BS.A1N(r8)
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = "extensions-features-disabled"
            java.lang.String r0 = r6.A05
            X.C20119A8c.A05(r4, r5, r1, r0)
            goto L_0x0032
        L_0x005f:
            int r0 = r6.hashCode()
            r4.A00 = r0
            X.00H r9 = r4.A0L
            X.A6h r2 = X.AnonymousClass8BR.A0V(r9)
            int r1 = r4.A00
            java.lang.String r0 = "phoenixExtensionFlow"
            r2.A04(r1, r0)
            X.A6h r10 = X.AnonymousClass8BR.A0V(r9)
            int r7 = r4.A00
            java.lang.String r0 = r6.A08
            r21 = r0
            java.lang.String r0 = r6.A09
            r20 = r0
            com.whatsapp.jid.UserJid r2 = r6.A02
            java.lang.String r1 = r6.A05
            r11 = r2
            r12 = r21
            r13 = r0
            r14 = r1
            r15 = r7
            r10.A09(r11, r12, r13, r14, r15)
            X.A6h r10 = X.AnonymousClass8BR.A0V(r9)
            int r0 = r4.A00
            java.lang.String r12 = "is_resumed"
            boolean r7 = r6.A0C
            r10.A07(r0, r12, r7)
            X.11P r0 = r4.A07
            long r15 = X.AnonymousClass11P.A01(r0)
            X.9uT r10 = r4.A09
            java.lang.String r0 = r2.user
            long r13 = r10.A02(r0, r1)
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00b5
            r0 = 2892(0xb4c, float:4.053E-42)
            long r10 = X.AnonymousClass8BW.A07(r8, r0)
            long r10 = r10 + r13
        L_0x00b5:
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
            java.lang.String r3 = "extensions-banned-id-error"
            X.C20119A8c.A05(r4, r5, r3, r1)
            X.00H r0 = r4.A0F
            java.lang.Object r8 = r0.get()
            X.A25 r8 = (X.A25) r8
            X.1PM r9 = r4.A05
            X.00H r0 = r4.A0Q
            java.lang.Object r10 = X.C18070vi.A0E(r0)
            X.A0M r10 = (X.A0M) r10
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r7)
            java.lang.String r13 = "galaxy_message"
            r16 = r20
            r17 = r3
            r11 = r2
            r14 = r1
            r15 = r21
            r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0032
        L_0x00e3:
            X.00H r0 = r4.A0K
            r19 = r0
            X.8sh r8 = X.AnonymousClass8BR.A0U(r19)
            java.lang.String r0 = "user_interaction"
            r11 = 0
            int r8 = r8.A0E(r2, r0)
            X.A6h r13 = X.AnonymousClass8BR.A0V(r19)
            r14 = r2
            r15 = r21
            r16 = r20
            r17 = r1
            r18 = r8
            r13.A09(r14, r15, r16, r17, r18)
            X.00H r0 = r4.A0G
            r16 = r0
            X.A5U r0 = X.AnonymousClass8BR.A0S(r16)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            X.9dK r13 = r0.A03(r10, r1)
            if (r13 == 0) goto L_0x01b3
            java.util.List r0 = r13.A02
            java.util.Iterator r15 = r0.iterator()
        L_0x011a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x011a
            r11 = r14
        L_0x0130:
            X.9tm r11 = (X.C195709tm) r11
            if (r11 == 0) goto L_0x01b3
            X.A6h r9 = X.AnonymousClass8BR.A0V(r9)
            java.lang.String r15 = r11.A00
            int r0 = r4.A00
            r9.A0C(r15, r0)
            X.00H r14 = r4.A0I
            X.A6h r9 = X.AnonymousClass8BR.A0V(r14)
            java.lang.String r0 = r11.A04
            int r0 = r0.hashCode()
            r9.A0C(r15, r0)
            X.A6h r0 = X.AnonymousClass8BR.A0V(r14)
            int r9 = r1.hashCode()
            r0.A07(r9, r12, r7)
            java.lang.String r0 = "DRAFT"
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 != 0) goto L_0x0190
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r6.A04
            boolean r0 = X.C20119A8c.A07(r1, r0)
            if (r0 != 0) goto L_0x0175
            X.8si r2 = X.AnonymousClass8BR.A0T(r14)
            r1 = 1
            java.lang.String r0 = "metadata_cache_hit"
            r2.A07(r9, r0, r1)
        L_0x0175:
            X.8sh r1 = X.AnonymousClass8BR.A0U(r19)
            r0 = 2
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r1.A0G(r10, r0)
            java.lang.String r0 = r11.A03
            r6.A00 = r0
            boolean r0 = X.C20119A8c.A06(r4, r6, r11, r13, r5)
            if (r0 != 0) goto L_0x0032
            X.C20119A8c.A02(r4, r6, r11, r5)
            goto L_0x0032
        L_0x0190:
            X.8si r7 = X.AnonymousClass8BR.A0T(r14)
            java.lang.String r0 = "metadata_cache_hit"
            r7.A07(r9, r0, r3)
            X.8sh r7 = X.AnonymousClass8BR.A0U(r19)
            java.lang.String r0 = "draft"
            r7.A0F(r8, r0)
            X.A5U r11 = X.AnonymousClass8BR.A0S(r16)
            X.ASA r12 = new X.ASA
            r13 = r4
            r14 = r6
            r15 = r5
            r16 = r8
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x01db
        L_0x01b3:
            X.00H r0 = r4.A0I
            X.8si r9 = X.AnonymousClass8BR.A0T(r0)
            int r7 = r1.hashCode()
            java.lang.String r0 = "metadata_cache_hit"
            r9.A07(r7, r0, r3)
            X.8sh r7 = X.AnonymousClass8BR.A0U(r19)
            java.lang.String r0 = "unknown_extension"
            r7.A0F(r8, r0)
            X.A5U r11 = X.AnonymousClass8BR.A0S(r16)
            r17 = 1
            X.ASA r12 = new X.ASA
            r13 = r4
            r14 = r6
            r15 = r5
            r16 = r8
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x01db:
            r13 = r2
            r14 = r10
            r15 = r21
            r16 = r20
            r17 = r1
            r18 = r3
            r11.A04(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22028AwU.invoke():java.lang.Object");
    }
}
