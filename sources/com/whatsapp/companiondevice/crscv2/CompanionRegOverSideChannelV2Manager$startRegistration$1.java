package com.whatsapp.companiondevice.crscv2;

import X.AnonymousClass1OS;
import X.AnonymousClass2BC;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$startRegistration$1", f = "CompanionRegOverSideChannelV2Manager.kt", i = {0, 0}, l = {335, 93, 98}, m = "invokeSuspend", n = {"intermediateKeyMaterial", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
public final class CompanionRegOverSideChannelV2Manager$startRegistration$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass2BC $companionEphemeralIdentity;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CompanionRegOverSideChannelV2Manager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionRegOverSideChannelV2Manager$startRegistration$1(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, AnonymousClass2BC r3, C30391dr r4) {
        super(2, r4);
        this.$companionEphemeralIdentity = r3;
        this.this$0 = companionRegOverSideChannelV2Manager;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CompanionRegOverSideChannelV2Manager$startRegistration$1(this.this$0, this.$companionEphemeralIdentity, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0105 A[Catch:{ all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0121 A[Catch:{ all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 3
            r7 = 2
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 == r2) goto L_0x0016
            if (r0 == r7) goto L_0x017c
            if (r0 != r5) goto L_0x0194
            X.C30691eM.A01(r13)
        L_0x0013:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            java.lang.Object r10 = r12.L$2
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r10 = (com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager) r10
            java.lang.Object r9 = r12.L$1
            X.1n2 r9 = (X.C35911n2) r9
            java.lang.Object r8 = r12.L$0
            X.2mS r8 = (X.C59532mS) r8
            X.C30691eM.A01(r13)
            goto L_0x00ef
        L_0x0027:
            X.C30691eM.A01(r13)
            X.2BC r10 = r12.$companionEphemeralIdentity
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.2cF r8 = X.C63962tz.A00()
            X.8Yi r0 = X.C164308Yi.DEFAULT_INSTANCE
            X.Bmt r9 = r0.A0N()
            X.1jP r0 = r8.A01
            byte[] r0 = r0.A00
            X.BmB r3 = X.C17900vP.A03(r9, r0)
            X.Bm6 r1 = r9.A00
            X.8Yi r1 = (X.C164308Yi) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.publicKey_ = r3
            X.Bm6 r9 = r9.A0C()
            X.8Yi r9 = (X.C164308Yi) r9
            X.DSQ r0 = r10.publicKey_
            byte[] r0 = r0.A06()
            r3 = 5
            X.1jP r1 = new X.1jP
            r1.<init>(r0)
            X.2kN r0 = r8.A00
            byte[] r11 = X.C63962tz.A08(r0, r1)
            X.C18070vi.A0X(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Companion Pairing "
            r1.append(r0)
            int r0 = r10.deviceType_
            X.2RG r0 = X.AnonymousClass2RG.A00(r0)
            if (r0 != 0) goto L_0x007c
            X.2RG r0 = X.AnonymousClass2RG.UNKNOWN
        L_0x007c:
            int r0 = r0.value
            r1.append(r0)
            java.lang.String r0 = " with ref "
            r1.append(r0)
            java.lang.String r0 = r10.ref_
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.nio.charset.Charset r1 = X.C26571Sq.A05
            byte[] r8 = X.C18070vi.A1A(r0, r1)
            java.lang.String r0 = "Verification Code"
            byte[] r0 = X.C18070vi.A1A(r0, r1)
            byte[] r0 = X.C20058A5h.A02(r11, r8, r0, r3)
            java.lang.String r3 = X.C60732oW.A00(r0)
            if (r3 != 0) goto L_0x00a9
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/startRegistration/failed to generate intermediate key material"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0013
        L_0x00a9:
            java.lang.String r0 = "Pairing Information Encryption Key"
            byte[] r1 = X.C18070vi.A1A(r0, r1)
            r0 = 32
            byte[] r0 = X.C20058A5h.A02(r11, r8, r1, r0)
            X.C18070vi.A0b(r9)
            X.C18070vi.A0b(r0)
            X.2mS r8 = new X.2mS
            r8.<init>(r10, r9, r3, r0)
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r9 = r12.this$0
            X.1my r0 = r9.A01
            X.0ve r3 = r0.A00
            r1 = 9361(0x2491, float:1.3118E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            java.lang.String r1 = "CompanionRegOverSideChannelV2Manager/verifyFeatureEnabled/feature not enabled"
            if (r0 == 0) goto L_0x018c
            X.1HV r0 = r9.A03
            X.0z4 r0 = r0.A01
            boolean r0 = r0.A2S()
            if (r0 == 0) goto L_0x018c
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r10 = r12.this$0
            X.1n2 r9 = r10.A07
            r12.L$0 = r8
            r12.L$1 = r9
            r12.L$2 = r10
            r12.label = r2
            java.lang.Object r0 = r9.Bhx(r12)
            if (r0 != r4) goto L_0x00ef
            return r4
        L_0x00ef:
            X.1HV r0 = r10.A03     // Catch:{ all -> 0x019d }
            X.18O r1 = r0.A00     // Catch:{ all -> 0x019d }
            X.18Q r0 = X.AnonymousClass18O.A0r     // Catch:{ all -> 0x019d }
            int r2 = r1.A04(r0)     // Catch:{ all -> 0x019d }
            X.1RK r0 = r10.A02     // Catch:{ all -> 0x019d }
            java.util.ArrayList r0 = r0.A07()     // Catch:{ all -> 0x019d }
            int r0 = r0.size()     // Catch:{ all -> 0x019d }
            if (r0 < r2) goto L_0x0121
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/verifyLinkedDevicesLimitNotExceeded limit reached ("
            r1.append(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r2)     // Catch:{ all -> 0x019d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x019d }
            r1 = 1
            X.AWr r0 = new X.AWr     // Catch:{ all -> 0x019d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x019d }
            r10.notifyAllObservers(r0)     // Catch:{ all -> 0x019d }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x019d }
            goto L_0x0199
        L_0x0121:
            X.1nD r1 = r10.A00     // Catch:{ all -> 0x019d }
            X.1nE r0 = X.C36031nE.A00     // Catch:{ all -> 0x019d }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x0136
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/startRegistration/not in ready state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x019d }
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A02(r10)     // Catch:{ all -> 0x019d }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x019d }
            goto L_0x0199
        L_0x0136:
            java.lang.String r2 = r8.A02     // Catch:{ all -> 0x019d }
            r1 = 5
            X.AWt r0 = new X.AWt     // Catch:{ all -> 0x019d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x019d }
            r10.notifyAllObservers(r0)     // Catch:{ all -> 0x019d }
            X.1OX r3 = r10.A06     // Catch:{ all -> 0x019d }
            X.0wl r2 = r10.A05     // Catch:{ all -> 0x019d }
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1 r1 = new com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1     // Catch:{ all -> 0x019d }
            r1.<init>(r10, r6)     // Catch:{ all -> 0x019d }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x019d }
            X.1e4 r1 = X.C30451dy.A02(r0, r2, r1, r3)     // Catch:{ all -> 0x019d }
            X.2Cd r0 = new X.2Cd     // Catch:{ all -> 0x019d }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x019d }
            r10.A00 = r0     // Catch:{ all -> 0x019d }
            r9.CQ9(r6)
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r0 = r12.this$0
            com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager r3 = r0.A04
            X.2BC r0 = r12.$companionEphemeralIdentity
            java.lang.String r2 = r0.ref_
            X.C18070vi.A0X(r2)
            X.8Yi r0 = r8.A01
            byte[] r1 = r0.A0M()
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r6
            r12.label = r7
            r0 = 452(0x1c4, float:6.33E-43)
            java.lang.Object r13 = r3.A00(r2, r12, r1, r0)
            if (r13 != r4) goto L_0x017f
            return r4
        L_0x017c:
            X.C30691eM.A01(r13)
        L_0x017f:
            X.3KW r13 = (X.AnonymousClass3KW) r13
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r0 = r12.this$0
            r12.label = r5
            java.lang.Object r0 = com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A00(r0, r13, r12)
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x018c:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A02(r9)
            goto L_0x0013
        L_0x0194:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0199:
            r9.CQ9(r6)
            return r0
        L_0x019d:
            r0 = move-exception
            r9.CQ9(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$startRegistration$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompanionRegOverSideChannelV2Manager$startRegistration$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
