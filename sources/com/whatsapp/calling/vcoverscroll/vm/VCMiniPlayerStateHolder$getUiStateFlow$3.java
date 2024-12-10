package com.whatsapp.calling.vcoverscroll.vm;

import X.AnonymousClass000;
import X.AnonymousClass20H;
import X.AnonymousClass4PJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCMiniPlayerStateHolder$getUiStateFlow$3", f = "VCMiniPlayerStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VCMiniPlayerStateHolder$getUiStateFlow$3 extends C30431dv implements AnonymousClass20H {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;
    public final /* synthetic */ AnonymousClass4PJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerStateHolder$getUiStateFlow$3(AnonymousClass4PJ r2, C30391dr r3) {
        super(5, r3);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0178, code lost:
        if (r4.A0I != true) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            r8 = r33
            int r0 = r8.label
            if (r0 != 0) goto L_0x02bf
            X.C30691eM.A01(r34)
            boolean r0 = r8.Z$0
            r17 = r0
            boolean r5 = r8.Z$1
            java.lang.Object r4 = r8.L$0
            X.9Bw r4 = (X.C178119Bw) r4
            java.lang.Object r0 = r8.L$1
            X.4Sa r0 = (X.C86534Sa) r0
            X.4PJ r2 = r8.this$0
            com.whatsapp.voipcalling.CallState r1 = r0.A0B
            X.C18070vi.A0W(r1)
            r2.A0G = r1
            com.whatsapp.voipcalling.CallState r3 = r0.A0B
            X.C18070vi.A0W(r3)
            boolean r1 = X.AnonymousClass72U.A01(r3)
            r2 = 0
            if (r1 != 0) goto L_0x0032
            boolean r1 = X.AnonymousClass72U.A03(r3)
            if (r1 == 0) goto L_0x01a8
        L_0x0032:
            X.4PJ r1 = r8.this$0
            X.1EC r1 = r1.A00
            X.1EC r7 = r0.A08
            boolean r1 = X.C42171xk.A00(r1, r7)
            if (r1 == 0) goto L_0x01a8
            X.4PJ r4 = r8.this$0
            r4.A01 = r2
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r1 = 1
            if (r3 != r2) goto L_0x004c
            X.1G4 r2 = r4.A0D
            X.AnonymousClass3MY.A1Y(r2, r1)
        L_0x004c:
            if (r17 != 0) goto L_0x0080
            if (r5 != 0) goto L_0x0080
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
        L_0x0052:
            X.4PJ r6 = r8.this$0
            java.lang.Integer r4 = r6.A02
            java.lang.Integer r5 = X.AnonymousClass00R.A0N
            if (r4 == r5) goto L_0x0078
            if (r2 != r5) goto L_0x007d
            java.lang.Integer r18 = X.AnonymousClass00R.A01
        L_0x005e:
            r6.A02 = r2
            X.00H r4 = r6.A07
            java.lang.Object r4 = r4.get()
            X.4jI r4 = (X.C93634jI) r4
            r4.A03(r0, r1)
            X.4PJ r4 = r8.this$0
            X.4Qf r15 = r4.A05
            r14 = 0
            if (r7 != 0) goto L_0x0083
            X.C17960vV.A07(r7)
            X.3ni r14 = X.C76643ni.A00
            return r14
        L_0x0078:
            if (r2 == r5) goto L_0x007d
            java.lang.Integer r18 = X.AnonymousClass00R.A0C
            goto L_0x005e
        L_0x007d:
            java.lang.Integer r18 = X.AnonymousClass00R.A00
            goto L_0x005e
        L_0x0080:
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            goto L_0x0052
        L_0x0083:
            boolean r13 = r0.A0M
            r24 = 1
            if (r13 == 0) goto L_0x0091
            X.6qE r4 = r0.A07
            if (r4 == 0) goto L_0x00e5
            boolean r4 = r4.A0I
            if (r4 != r1) goto L_0x00e5
        L_0x0091:
            java.lang.Integer r28 = X.AnonymousClass00R.A01
        L_0x0093:
            r20 = 2131169214(0x7f070fbe, float:1.7952752E38)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.6qE r4 = r0.A07
            if (r4 == 0) goto L_0x00b4
            com.whatsapp.jid.UserJid r8 = r4.A0A
            if (r8 == 0) goto L_0x00b4
            r29 = -4632222432728197366(0xbfb70a3d70a3d70a, double:-0.09)
            r25 = r15
            r26 = r7
            r27 = r8
            X.4iR r8 = r25.A00(r26, r27, r28, r29)
            r6.add(r8)
        L_0x00b4:
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 != r8) goto L_0x015b
            X.10w r8 = r0.A06
            java.util.Collection r8 = r8.values()
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r8.iterator()
        L_0x00c6:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r11 = r16.next()
            r10 = r11
            X.6qE r10 = (X.C134216qE) r10
            X.11S r9 = r15.A00
            com.whatsapp.jid.UserJid r8 = r10.A0A
            boolean r8 = r9.A0O(r8)
            if (r8 != 0) goto L_0x00c6
            int r8 = r10.A04
            if (r8 != r1) goto L_0x00c6
            r12.add(r11)
            goto L_0x00c6
        L_0x00e5:
            java.lang.Integer r28 = X.AnonymousClass00R.A0C
            goto L_0x0093
        L_0x00e8:
            int r9 = r12.size()
            r8 = 3
            if (r9 > r8) goto L_0x0125
            java.lang.Integer r8 = X.AnonymousClass00R.A0C
            if (r2 == r8) goto L_0x0125
            r29 = -4632222432728197366(0xbfb70a3d70a3d70a, double:-0.09)
        L_0x00f8:
            java.util.Iterator r12 = r12.iterator()
            r9 = 1
        L_0x00fd:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r12.next()
            X.6qE r8 = (X.C134216qE) r8
            int r11 = r6.size()
            r10 = 5
            if (r11 >= r10) goto L_0x0122
            com.whatsapp.jid.UserJid r8 = r8.A0A
            X.C18070vi.A0X(r8)
            r25 = r15
            r26 = r7
            r27 = r8
            X.4iR r8 = r25.A00(r26, r27, r28, r29)
            r6.add(r8)
        L_0x0122:
            int r9 = r9 + 1
            goto L_0x00fd
        L_0x0125:
            r20 = 2131169215(0x7f070fbf, float:1.7952754E38)
            r29 = -4629700416936869888(0xbfc0000000000000, double:-0.125)
            goto L_0x00f8
        L_0x012b:
            int r7 = r9 + -5
            if (r7 <= 0) goto L_0x015b
            int r7 = r6.size()
            int r7 = r7 - r1
            r6.remove(r7)
            r10 = 2131894262(0x7f121ff6, float:1.9423324E38)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            int r7 = r6.size()
            int r9 = r9 - r7
            X.C17880vN.A1T(r8, r9, r14)
            X.6IR r26 = X.C1402670q.A02(r8, r10)
            r31 = 2131103368(0x7f060e88, float:1.78192E38)
            r27 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r29 = -4629700416936869888(0xbfc0000000000000, double:-0.125)
            X.4iS r7 = new X.4iS
            r25 = r7
            r32 = r1
            r25.<init>(r26, r27, r29, r31, r32)
            r6.add(r7)
        L_0x015b:
            X.3ng r15 = X.C76623ng.A00
            boolean r7 = X.AnonymousClass72U.A03(r3)
            if (r7 != 0) goto L_0x01a4
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r7) goto L_0x01a4
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r7) goto L_0x01a1
            r3 = 2131898234(0x7f122f7a, float:1.943138E38)
        L_0x016e:
            X.6IR r16 = X.AnonymousClass3MX.A0t(r3)
        L_0x0172:
            if (r4 == 0) goto L_0x017a
            boolean r3 = r4.A0I
            r23 = 1
            if (r3 == r1) goto L_0x017c
        L_0x017a:
            r23 = 0
        L_0x017c:
            r21 = 0
            if (r2 != r5) goto L_0x0183
            r21 = 2131169217(0x7f070fc1, float:1.7952758E38)
        L_0x0183:
            if (r13 == 0) goto L_0x019e
            int r1 = r0.A04
            r0 = 2
            if (r1 != r0) goto L_0x019e
        L_0x018a:
            r22 = 2131169216(0x7f070fc0, float:1.7952756E38)
            if (r16 != 0) goto L_0x0192
            r22 = 2131169532(0x7f0710fc, float:1.7953397E38)
        L_0x0192:
            X.3nj r14 = new X.3nj
            r25 = r17
            r17 = r2
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x019e:
            r24 = 0
            goto L_0x018a
        L_0x01a1:
            r16 = 0
            goto L_0x0172
        L_0x01a4:
            r3 = 2131898019(0x7f122ea3, float:1.9430944E38)
            goto L_0x016e
        L_0x01a8:
            X.4PJ r0 = r8.this$0
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.4jI r0 = (X.C93634jI) r0
            X.C93634jI.A00(r0, r2)
            if (r4 == 0) goto L_0x029f
            com.whatsapp.jid.GroupJid r0 = r4.A0C
            if (r0 == 0) goto L_0x029f
            com.whatsapp.jid.GroupJid r1 = r4.A0C
            X.4PJ r0 = r8.this$0
            X.1EC r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x029f
            int r1 = r4.A07
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x029f
            X.2Q4 r0 = r4.A0E
            if (r0 == 0) goto L_0x029f
            X.4PJ r1 = r8.this$0
            r1.A01 = r4
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A02 = r0
            X.00H r1 = r1.A0B
            java.lang.Object r6 = r1.get()
            X.4Kr r6 = (X.C84744Kr) r6
            X.4PJ r1 = r8.this$0
            java.lang.Integer r2 = r1.A02
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            if (r2 != r1) goto L_0x0221
            java.lang.Integer r18 = X.AnonymousClass00R.A0C
        L_0x01ee:
            r9 = 0
            r5 = 1
            com.whatsapp.jid.GroupJid r11 = r4.A0C
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r11, r1)
            X.C17960vV.A07(r11)
            X.C18070vi.A0X(r11)
            X.1EC r11 = (X.AnonymousClass1EC) r11
            java.util.ArrayList r1 = r4.A0B()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r1.iterator()
        L_0x020b:
            boolean r1 = r7.hasNext()
            r3 = 5
            if (r1 == 0) goto L_0x0224
            java.lang.Object r2 = r7.next()
            r1 = r2
            X.9Bv r1 = (X.C178109Bv) r1
            int r1 = r1.A01
            if (r1 != r3) goto L_0x020b
            r4.add(r2)
            goto L_0x020b
        L_0x0221:
            java.lang.Integer r18 = X.AnonymousClass00R.A00
            goto L_0x01ee
        L_0x0224:
            java.util.List r1 = X.C29431cG.A0v(r4, r3)
            java.util.ArrayList r2 = X.C29351c6.A0D(r1)
            java.util.Iterator r7 = r1.iterator()
        L_0x0230:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0253
            java.lang.Object r1 = r7.next()
            X.9Bv r1 = (X.C178109Bv) r1
            X.4Qf r10 = r6.A00
            com.whatsapp.jid.UserJid r1 = r1.A00
            X.C18070vi.A0W(r1)
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            r14 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r12 = r1
            X.4iR r1 = r10.A00(r11, r12, r13, r14)
            r2.add(r1)
            goto L_0x0230
        L_0x0253:
            java.util.ArrayList r1 = X.C29431cG.A0m(r2)
            int r4 = X.AnonymousClass3MX.A02(r4, r3)
            if (r4 <= 0) goto L_0x0283
            int r2 = r1.size()
            int r2 = r2 - r5
            r1.remove(r2)
            r3 = 2131894262(0x7f121ff6, float:1.9423324E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.C17880vN.A1T(r2, r4, r9)
            X.6IR r3 = X.C1402670q.A02(r2, r3)
            r8 = 2131103234(0x7f060e02, float:1.7818928E38)
            r4 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iS r2 = new X.4iS
            r2.<init>(r3, r4, r6, r8, r9)
            r1.add(r2)
        L_0x0283:
            X.3nh r15 = X.C76633nh.A00
            r16 = 0
            r20 = 2131169215(0x7f070fbf, float:1.7952754E38)
            r22 = 2131169532(0x7f0710fc, float:1.7953397E38)
            X.3nj r14 = new X.3nj
            r23 = r9
            r24 = r9
            r21 = r9
            r25 = r17
            r17 = r0
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x029f:
            X.4PJ r1 = r8.this$0
            r1.A01 = r2
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A02 = r0
            X.0wS r5 = X.C18460wS.A00
            X.3nf r1 = X.C76613nf.A00
            r7 = 0
            r6 = 2131169214(0x7f070fbe, float:1.7952752E38)
            r8 = 2131169532(0x7f0710fc, float:1.7953397E38)
            X.3nj r14 = new X.3nj
            r10 = r7
            r3 = r0
            r9 = r7
            r11 = r17
            r4 = r0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.vm.VCMiniPlayerStateHolder$getUiStateFlow$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        boolean A1Y2 = AnonymousClass000.A1Y(obj2);
        VCMiniPlayerStateHolder$getUiStateFlow$3 vCMiniPlayerStateHolder$getUiStateFlow$3 = new VCMiniPlayerStateHolder$getUiStateFlow$3(this.this$0, (C30391dr) obj5);
        vCMiniPlayerStateHolder$getUiStateFlow$3.Z$0 = A1Y;
        vCMiniPlayerStateHolder$getUiStateFlow$3.Z$1 = A1Y2;
        vCMiniPlayerStateHolder$getUiStateFlow$3.L$0 = obj3;
        vCMiniPlayerStateHolder$getUiStateFlow$3.L$1 = obj4;
        return vCMiniPlayerStateHolder$getUiStateFlow$3.invokeSuspend(C27621Wu.A00);
    }
}
