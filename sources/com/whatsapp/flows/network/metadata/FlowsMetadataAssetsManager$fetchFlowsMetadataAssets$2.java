package com.whatsapp.flows.network.metadata;

import X.AnonymousClass1OS;
import X.C188329hF;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2", f = "FlowsMetadataAssetsManager.kt", i = {0}, l = {98, 100}, m = "invokeSuspend", n = {"bizPnJid"}, s = {"L$3"})
public final class FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Integer $instanceKey;
    public final /* synthetic */ boolean $isRequired;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C188329hF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(C188329hF r2, UserJid userJid, Integer num, String str, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = r2;
        this.$instanceKey = num;
        this.$flowId = str;
        this.$isRequired = z;
        this.$bizJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 = new FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(this.this$0, this.$bizJid, this.$instanceKey, this.$flowId, r9, this.$isRequired);
        flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2.L$0 = obj;
        return flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c5 A[Catch:{ all -> 0x01cc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r23
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            r2 = r22
            int r0 = r2.label
            r6 = 2
            r3 = 0
            r8 = 0
            r4 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r4) goto L_0x0019
            if (r0 != r6) goto L_0x0014
            goto L_0x01c6
        L_0x0014:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0019:
            boolean r11 = r2.Z$0
            java.lang.Object r14 = r2.L$3
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            java.lang.Object r12 = r2.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r2.L$1
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r7 = r2.L$0
            X.9hF r7 = (X.C188329hF) r7
            goto L_0x00c0
        L_0x002d:
            X.C30691eM.A01(r1)
            X.9hF r7 = r2.this$0
            java.lang.Integer r9 = r2.$instanceKey
            java.lang.String r12 = r2.$flowId
            boolean r11 = r2.$isRequired
            com.whatsapp.jid.UserJid r14 = r2.$bizJid
            X.00H r0 = r7.A03     // Catch:{ all -> 0x01cc }
            X.A5U r0 = X.AnonymousClass8BR.A0S(r0)     // Catch:{ all -> 0x01cc }
            boolean r0 = r0.A07(r9)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x0055
            java.lang.String r5 = "extensions-public-key-error-response"
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x01cc }
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            X.9sX r1 = new X.9sX     // Catch:{ all -> 0x01cc }
            r1.<init>(r0, r5, r3, r4)     // Catch:{ all -> 0x01cc }
            goto L_0x01d1
        L_0x0055:
            X.00H r15 = r7.A05     // Catch:{ all -> 0x01cc }
            X.8sh r1 = X.AnonymousClass8BR.A0U(r15)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "metadata_network_start"
            r1.A0B(r9, r0)     // Catch:{ all -> 0x01cc }
            X.00H r0 = r7.A04     // Catch:{ all -> 0x01cc }
            X.8si r10 = X.AnonymousClass8BR.A0T(r0)     // Catch:{ all -> 0x01cc }
            if (r12 == 0) goto L_0x0072
            int r1 = r12.hashCode()     // Catch:{ all -> 0x01cc }
        L_0x006c:
            java.lang.String r0 = "fetch_key_network_start"
            X.C20081A6h.A02(r10, r0, r1)     // Catch:{ all -> 0x01cc }
            goto L_0x0074
        L_0x0072:
            r1 = -1
            goto L_0x006c
        L_0x0074:
            if (r11 == 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            java.lang.String r13 = "optional"
            goto L_0x007c
        L_0x007a:
            java.lang.String r13 = "required"
        L_0x007c:
            X.8sh r10 = X.AnonymousClass8BR.A0U(r15)     // Catch:{ all -> 0x01cc }
            if (r9 == 0) goto L_0x008b
            int r1 = r9.intValue()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "endpoint_public_key_fetch_mode"
            r10.A06(r1, r0, r13)     // Catch:{ all -> 0x01cc }
        L_0x008b:
            X.00H r0 = r7.A06     // Catch:{ all -> 0x01cc }
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass8BV.A0F(r14, r0)     // Catch:{ all -> 0x01cc }
            X.9io r13 = r7.A01     // Catch:{ all -> 0x01cc }
            java.lang.String r10 = r14.getRawString()     // Catch:{ all -> 0x01cc }
            X.C18070vi.A0d(r10, r4)     // Catch:{ all -> 0x01cc }
            if (r11 == 0) goto L_0x00a2
            r0 = 6948263101939337(0x18af6891ff3e89, double:3.4328980969345616E-308)
            goto L_0x00a7
        L_0x00a2:
            r0 = 7141081849274528(0x195ec6aef020a0, double:3.528163215867023E-308)
        L_0x00a7:
            X.8tZ r1 = r13.A00(r10, r8, r0)     // Catch:{ all -> 0x01cc }
            r2.L$0 = r7     // Catch:{ all -> 0x01cc }
            r2.L$1 = r9     // Catch:{ all -> 0x01cc }
            r2.L$2 = r12     // Catch:{ all -> 0x01cc }
            r2.L$3 = r14     // Catch:{ all -> 0x01cc }
            r2.Z$0 = r11     // Catch:{ all -> 0x01cc }
            r2.label = r4     // Catch:{ all -> 0x01cc }
            X.1Ho r0 = X.C23761Hn.A01     // Catch:{ all -> 0x01cc }
            java.lang.Object r1 = r1.CBx(r2, r0)     // Catch:{ all -> 0x01cc }
            if (r1 != r5) goto L_0x00c3
            return r5
        L_0x00c0:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x01cc }
        L_0x00c3:
            X.6xC r1 = (X.C138506xC) r1     // Catch:{ all -> 0x01cc }
            r2.L$0 = r8     // Catch:{ all -> 0x01cc }
            r2.L$1 = r8     // Catch:{ all -> 0x01cc }
            r2.L$2 = r8     // Catch:{ all -> 0x01cc }
            r2.L$3 = r8     // Catch:{ all -> 0x01cc }
            r2.label = r6     // Catch:{ all -> 0x01cc }
            X.00H r10 = r7.A05     // Catch:{ all -> 0x01cc }
            X.A6h r13 = X.AnonymousClass8BR.A0V(r10)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "metadata_network_end"
            r13.A0B(r9, r0)     // Catch:{ all -> 0x01cc }
            X.00H r0 = r7.A04     // Catch:{ all -> 0x01cc }
            X.8si r13 = X.AnonymousClass8BR.A0T(r0)     // Catch:{ all -> 0x01cc }
            if (r12 == 0) goto L_0x011f
            int r12 = r12.hashCode()     // Catch:{ all -> 0x01cc }
        L_0x00e6:
            java.lang.String r0 = "fetch_key_network_end"
            X.C20081A6h.A02(r13, r0, r12)     // Catch:{ all -> 0x01cc }
            int r0 = r1.A00     // Catch:{ all -> 0x01cc }
            r13 = 0
            if (r0 != 0) goto L_0x016e
            X.161 r0 = r1.A03     // Catch:{ all -> 0x01cc }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01cc }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x01cc }
            X.9ri r0 = (X.C194429ri) r0     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x00fd
            X.9qg r13 = r0.A01     // Catch:{ all -> 0x01cc }
        L_0x00fd:
            X.00H r0 = r7.A03     // Catch:{ all -> 0x01cc }
            X.A5U r0 = X.AnonymousClass8BR.A0S(r0)     // Catch:{ all -> 0x01cc }
            r0.A05(r1, r9)     // Catch:{ all -> 0x01cc }
            java.lang.String r12 = "endpoint_public_key_received"
            if (r13 == 0) goto L_0x0153
            java.lang.String r15 = r13.A00     // Catch:{ all -> 0x01cc }
            if (r15 == 0) goto L_0x0153
            int r0 = r15.length()     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x0153
            int r1 = r0.length()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x0153
            goto L_0x0121
        L_0x011f:
            r12 = -1
            goto L_0x00e6
        L_0x0121:
            if (r9 == 0) goto L_0x012e
            X.A6h r6 = X.AnonymousClass8BR.A0V(r10)     // Catch:{ all -> 0x01cc }
            int r1 = r9.intValue()     // Catch:{ all -> 0x01cc }
            r6.A07(r1, r12, r4)     // Catch:{ all -> 0x01cc }
        L_0x012e:
            X.3Dp r6 = X.C108975cc.A0k(r2)     // Catch:{ all -> 0x01cc }
            X.00H r1 = r7.A02     // Catch:{ all -> 0x01cc }
            java.lang.Object r12 = r1.get()     // Catch:{ all -> 0x01cc }
            X.A5A r12 = (X.A5A) r12     // Catch:{ all -> 0x01cc }
            X.AS3 r13 = new X.AS3     // Catch:{ all -> 0x01cc }
            r13.<init>(r7, r9, r6, r3)     // Catch:{ all -> 0x01cc }
            r20 = -1
            r19 = r8
            r17 = r8
            r18 = r8
            r21 = r3
            r16 = r0
            r12.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01cc }
            java.lang.Object r1 = r6.A00()     // Catch:{ all -> 0x01cc }
            goto L_0x01c3
        L_0x0153:
            if (r9 == 0) goto L_0x0160
            X.A6h r1 = X.AnonymousClass8BR.A0V(r10)     // Catch:{ all -> 0x01cc }
            int r0 = r9.intValue()     // Catch:{ all -> 0x01cc }
            r1.A07(r0, r12, r3)     // Catch:{ all -> 0x01cc }
        L_0x0160:
            if (r11 == 0) goto L_0x0163
            goto L_0x01ad
        L_0x0163:
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x01cc }
            r0.<init>(r6)     // Catch:{ all -> 0x01cc }
            X.9sX r1 = new X.9sX     // Catch:{ all -> 0x01cc }
            r1.<init>(r0, r8, r4, r3)     // Catch:{ all -> 0x01cc }
            goto L_0x01c3
        L_0x016e:
            X.163 r0 = r1.A04     // Catch:{ all -> 0x01cc }
            java.lang.Object r1 = r0.A00()     // Catch:{ all -> 0x01cc }
            r0 = 2498098(0x261e32, float:3.500581E-39)
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ all -> 0x01cc }
            boolean r1 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = "extensions-public-key-error-response"
            java.lang.Object r0 = r10.get()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x0198
            X.A6h r0 = (X.C20081A6h) r0     // Catch:{ all -> 0x01cc }
            r0.A0A(r9)     // Catch:{ all -> 0x01cc }
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x01cc }
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            X.9sX r1 = new X.9sX     // Catch:{ all -> 0x01cc }
            r1.<init>(r0, r6, r3, r4)     // Catch:{ all -> 0x01cc }
            goto L_0x01c3
        L_0x0198:
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01cc }
            X.8sh r0 = (X.C172048sh) r0     // Catch:{ all -> 0x01cc }
            r0.A0H(r9, r6, r8)     // Catch:{ all -> 0x01cc }
            X.190 r1 = r7.A00     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = ""
            r1.A0G(r6, r0, r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "FlowsLogger/FlowsMetadataAssetsManager/handleAssetsSuccessResponse()/ - Response is not success"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            goto L_0x01b8
        L_0x01ad:
            java.lang.Object r0 = X.C18070vi.A0E(r10)     // Catch:{ all -> 0x01cc }
            X.8sh r0 = (X.C172048sh) r0     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = "extensions-public-key-error-response"
            r0.A0H(r9, r6, r8)     // Catch:{ all -> 0x01cc }
        L_0x01b8:
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x01cc }
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            X.9sX r1 = new X.9sX     // Catch:{ all -> 0x01cc }
            r1.<init>(r0, r6, r3, r3)     // Catch:{ all -> 0x01cc }
        L_0x01c3:
            if (r1 != r5) goto L_0x01c9
            return r5
        L_0x01c6:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x01cc }
        L_0x01c9:
            X.9sX r1 = (X.C194939sX) r1     // Catch:{ all -> 0x01cc }
            goto L_0x01d1
        L_0x01cc:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x01d1:
            X.9hF r9 = r2.this$0
            java.lang.Integer r8 = r2.$instanceKey
            java.lang.String r7 = r2.$flowId
            java.lang.Throwable r6 = X.C30671eK.A00(r1)
            if (r6 == 0) goto L_0x021c
            X.00H r5 = r9.A05
            X.A6h r1 = X.AnonymousClass8BR.A0V(r5)
            java.lang.String r0 = "metadata_network_end"
            r1.A0B(r8, r0)
            X.00H r0 = r9.A04
            X.A6h r2 = X.AnonymousClass8BR.A0V(r0)
            if (r7 == 0) goto L_0x021d
            int r1 = r7.hashCode()
        L_0x01f4:
            java.lang.String r0 = "fetch_key_network_end"
            X.C20081A6h.A02(r2, r0, r1)
            X.8sh r1 = X.AnonymousClass8BR.A0U(r5)
            java.lang.String r0 = r6.getMessage()
            java.lang.String r2 = "extensions-metadata-graphql-response-error"
            r1.A0H(r8, r2, r0)
            X.190 r1 = r9.A00
            java.lang.String r0 = ""
            r1.A0G(r2, r0, r4)
            java.lang.String r0 = "FlowsLogger/FlowsMetadataAssetsManager/handleAssetsErrorResponse()"
            com.whatsapp.util.Log.w(r0, r6)
            r0 = 3
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            X.9sX r1 = new X.9sX
            r1.<init>(r0, r2, r3, r3)
        L_0x021c:
            return r1
        L_0x021d:
            r1 = -1
            goto L_0x01f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
