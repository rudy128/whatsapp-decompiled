package com.whatsapp.flows.network.metadata;

import X.A5U;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2", f = "FlowsMetadataManager.kt", i = {0}, l = {176}, m = "invokeSuspend", n = {"phoneUserJid"}, s = {"L$5"})
public final class FlowsMetadataManager$fetchFlowsMetaData$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Integer $instanceKey;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ boolean $shouldDownloadPSL;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ A5U this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMetadataManager$fetchFlowsMetaData$2(A5U a5u, UserJid userJid, Integer num, String str, String str2, String str3, C30391dr r8, boolean z) {
        super(2, r8);
        this.this$0 = a5u;
        this.$instanceKey = num;
        this.$bizJid = userJid;
        this.$flowId = str;
        this.$shouldDownloadPSL = z;
        this.$messageId = str2;
        this.$sessionId = str3;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        A5U a5u = this.this$0;
        Integer num = this.$instanceKey;
        FlowsMetadataManager$fetchFlowsMetaData$2 flowsMetadataManager$fetchFlowsMetaData$2 = new FlowsMetadataManager$fetchFlowsMetaData$2(a5u, this.$bizJid, num, this.$flowId, this.$messageId, this.$sessionId, r11, this.$shouldDownloadPSL);
        flowsMetadataManager$fetchFlowsMetaData$2.L$0 = obj;
        return flowsMetadataManager$fetchFlowsMetaData$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r16
            java.lang.String r1 = "metadata_network_start"
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x002a
            boolean r14 = r15.Z$0
            java.lang.Object r9 = r15.L$5
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r12 = r15.L$4
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r15.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r13 = r15.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r15.L$1
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r7 = r15.L$0
            X.A5U r7 = (X.A5U) r7
            goto L_0x00bf
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            X.C30691eM.A01(r8)
            X.A5U r7 = r15.this$0
            java.lang.Integer r10 = r15.$instanceKey
            com.whatsapp.jid.UserJid r4 = r15.$bizJid
            java.lang.String r13 = r15.$flowId
            boolean r14 = r15.$shouldDownloadPSL
            java.lang.String r11 = r15.$messageId
            java.lang.String r12 = r15.$sessionId
            boolean r0 = r7.A07(r10)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r2 = "extensions-metadata-response-error"
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            X.9sY r4 = new X.9sY     // Catch:{ all -> 0x00c9 }
            r4.<init>(r6, r0, r2, r3)     // Catch:{ all -> 0x00c9 }
            goto L_0x00ce
        L_0x0054:
            X.00H r0 = r7.A05     // Catch:{ all -> 0x00c9 }
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass8BV.A0F(r4, r0)     // Catch:{ all -> 0x00c9 }
            X.00H r5 = r7.A04     // Catch:{ all -> 0x00c9 }
            X.8sh r0 = X.AnonymousClass8BR.A0U(r5)     // Catch:{ all -> 0x00c9 }
            r0.A0B(r10, r1)     // Catch:{ all -> 0x00c9 }
            X.00H r0 = r7.A03     // Catch:{ all -> 0x00c9 }
            X.8si r4 = X.AnonymousClass8BR.A0T(r0)     // Catch:{ all -> 0x00c9 }
            int r0 = r13.hashCode()     // Catch:{ all -> 0x00c9 }
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ all -> 0x00c9 }
            r4.A0B(r0, r1)     // Catch:{ all -> 0x00c9 }
            if (r10 == 0) goto L_0x0083
            X.8sh r4 = X.AnonymousClass8BR.A0U(r5)     // Catch:{ all -> 0x00c9 }
            int r1 = r10.intValue()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "flow_id"
            r4.A06(r1, r0, r13)     // Catch:{ all -> 0x00c9 }
        L_0x0083:
            X.8sh r5 = X.AnonymousClass8BR.A0U(r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = "optional"
            if (r10 == 0) goto L_0x0094
            int r1 = r10.intValue()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "endpoint_public_key_fetch_mode"
            r5.A06(r1, r0, r4)     // Catch:{ all -> 0x00c9 }
        L_0x0094:
            X.9io r5 = r7.A00     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = r9.getRawString()     // Catch:{ all -> 0x00c9 }
            X.C18070vi.A0d(r4, r3)     // Catch:{ all -> 0x00c9 }
            r0 = 7930724213641500(0x1c2cf39f90d11c, double:3.9182983806016E-308)
            X.8tZ r1 = r5.A00(r4, r13, r0)     // Catch:{ all -> 0x00c9 }
            r15.L$0 = r7     // Catch:{ all -> 0x00c9 }
            r15.L$1 = r10     // Catch:{ all -> 0x00c9 }
            r15.L$2 = r13     // Catch:{ all -> 0x00c9 }
            r15.L$3 = r11     // Catch:{ all -> 0x00c9 }
            r15.L$4 = r12     // Catch:{ all -> 0x00c9 }
            r15.L$5 = r9     // Catch:{ all -> 0x00c9 }
            r15.Z$0 = r14     // Catch:{ all -> 0x00c9 }
            r15.label = r3     // Catch:{ all -> 0x00c9 }
            X.1Ho r0 = X.C23761Hn.A01     // Catch:{ all -> 0x00c9 }
            java.lang.Object r8 = r1.CBx(r15, r0)     // Catch:{ all -> 0x00c9 }
            if (r8 != r2) goto L_0x00c2
            return r2
        L_0x00bf:
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x00c9 }
        L_0x00c2:
            X.6xC r8 = (X.C138506xC) r8     // Catch:{ all -> 0x00c9 }
            X.9sY r4 = X.A5U.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x00ce:
            X.A5U r3 = r15.this$0
            java.lang.Integer r2 = r15.$instanceKey
            java.lang.String r1 = r15.$flowId
            java.lang.Throwable r0 = X.C30671eK.A00(r4)
            if (r0 == 0) goto L_0x00de
            X.9sY r4 = X.A5U.A01(r6, r3, r2, r1, r0)
        L_0x00de:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMetadataManager$fetchFlowsMetaData$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
