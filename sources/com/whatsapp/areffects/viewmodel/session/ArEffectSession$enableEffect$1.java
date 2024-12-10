package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C107855aj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C92384hD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$enableEffect$1", f = "ArEffectSession.kt", i = {1, 2}, l = {76, 82, 458}, m = "invokeSuspend", n = {"logger", "logger"}, s = {"L$0", "L$0"})
public final class ArEffectSession$enableEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public final /* synthetic */ C107855aj $effect;
    public final /* synthetic */ boolean $isFromButton;
    public final /* synthetic */ C92384hD $params;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$enableEffect$1(C107855aj r2, C92384hD r3, ArEffectSession arEffectSession, C30391dr r5, AnonymousClass1OB r6, boolean z) {
        super(2, r5);
        this.$cleanUpJob = r6;
        this.this$0 = arEffectSession;
        this.$effect = r2;
        this.$params = r3;
        this.$isFromButton = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass1OB r5 = this.$cleanUpJob;
        return new ArEffectSession$enableEffect$1(this.$effect, this.$params, this.this$0, r9, r5, this.$isFromButton);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        if (r2 == null) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089 A[Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6 A[Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0 A[Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            r0 = r17
            int r1 = r0.label
            r4 = 3
            r7 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r5) goto L_0x0024
            if (r1 == r7) goto L_0x001c
            if (r1 != r4) goto L_0x0017
            java.lang.Object r12 = r0.L$0
            X.4a4 r12 = (X.C88544a4) r12
            goto L_0x00e1
        L_0x0017:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001c:
            java.lang.Object r12 = r0.L$0
            X.4a4 r12 = (X.C88544a4) r12
            X.C30691eM.A01(r18)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            goto L_0x0068
        L_0x0024:
            X.C30691eM.A01(r18)
            goto L_0x003b
        L_0x0028:
            X.C30691eM.A01(r18)
            java.lang.String r1 = "ArEffectSession/enableEffect Cleaning up currently-running jobs"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1OB r1 = r0.$cleanUpJob
            r0.label = r5
            java.lang.Object r1 = r1.BhB(r0)
            if (r1 != r2) goto L_0x003b
            return r2
        L_0x003b:
            java.lang.String r1 = "ArEffectSession/enableEffect Enabling effect"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r1 = r0.this$0     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4Qs r6 = r1.A03     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.5aj r3 = r0.$effect     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hD r1 = r0.$params     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4a4 r12 = r6.A00(r3, r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r3 = r0.this$0     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.5aj r13 = r0.$effect     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hD r14 = r0.$params     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            boolean r1 = r0.$isFromButton     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r15 = 0
            X.4ha r11 = new X.4ha     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession.A06(r3, r11)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r1 = r0.this$0     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.L$0 = r12     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.label = r7     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession.A04(r1, r0)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
        L_0x0068:
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r1 = r0.this$0     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.5aj r6 = r0.$effect     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hD r8 = r0.$params     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.L$0 = r12     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.L$1 = r1     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.L$2 = r6     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.L$3 = r8     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r0.label = r4     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.1g7 r4 = X.C72473Md.A0m(r0)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hE r7 = new X.4hE     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r7.<init>(r1, r4)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.5Wh r3 = r1.A05     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hX r3 = (X.C92564hX) r3     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            int r1 = r3.A00     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r3 = r3.A01     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.3ho r3 = (X.C75603ho) r3     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r1 = 0
            X.C18070vi.A0d(r3, r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.C18070vi.A0e(r6, r5, r8)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            java.lang.String r1 = "CameraArEffectsViewModel/Enabling effect"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.7DY r1 = r3.A07     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.8Av r1 = r1.A0K     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = "camera"
            X.C18070vi.A11(r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r1 = 0
            throw r1     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
        L_0x00a6:
            java.lang.Object r10 = r3.A01     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r10 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r10     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r1 = 0
            X.C18070vi.A0d(r10, r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.C18070vi.A0e(r6, r5, r8)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            java.lang.String r1 = "CallArEffectsViewModel/Enabling effect"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r11 = 0
            X.E9n r9 = com.whatsapp.calling.areffects.CallArEffectsViewModel.A08(r10, r11)     // Catch:{ UnsatisfiedLinkError -> 0x00c9 }
            r9.start()     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.1OX r1 = r10.A0N     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.calling.areffects.CallArEffectsViewModel$enabler$1$1 r5 = new com.whatsapp.calling.areffects.CallArEffectsViewModel$enabler$1$1     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.AnonymousClass3MX.A1Q(r5, r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            goto L_0x00da
        L_0x00c9:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.3hf r1 = new X.3hf     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r1.<init>(r3)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r7.Btl(r1)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            goto L_0x00da
        L_0x00d7:
            r1.BJw(r6, r7, r8)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
        L_0x00da:
            java.lang.Object r1 = r4.A0C()     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            if (r1 != r2) goto L_0x00e4
            return r2
        L_0x00e1:
            X.C30691eM.A01(r18)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
        L_0x00e4:
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r2 = r0.this$0     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.5aj r13 = r0.$effect     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hD r14 = r0.$params     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            boolean r1 = r0.$isFromButton     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            java.lang.Float r15 = r14.A03     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            X.4hZ r11 = new X.4hZ     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            com.whatsapp.areffects.viewmodel.session.ArEffectSession.A06(r2, r11)     // Catch:{ CancellationException -> 0x013e, 4tK -> 0x00f9 }
            goto L_0x0136
        L_0x00f9:
            r5 = move-exception
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r4 = r0.this$0
            X.4hD r1 = r0.$params
            java.lang.String r0 = "ArEffectSession/enableEffect Error when enabling"
            com.whatsapp.util.Log.e(r0, r5)
            X.5Yi r3 = r4.A04
            X.4D9 r2 = r1.A01
            X.4DE r1 = r1.A00
            X.4hB r0 = new X.4hB
            r0.<init>(r1, r2)
            r3.BIg(r0)
            X.1G4 r0 = r4.A08
            java.lang.Object r2 = r0.getValue()
            boolean r1 = r2 instanceof X.C92594ha
            r0 = 0
            if (r1 == 0) goto L_0x013c
            X.4ha r2 = (X.C92594ha) r2
            r1 = 1
            if (r2 != 0) goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            java.lang.String r0 = "Errors should only occur while enabling"
            X.C17960vV.A0F(r1, r0)
            if (r2 == 0) goto L_0x0139
            X.4hT r1 = new X.4hT
            r1.<init>(r5, r2)
        L_0x012e:
            X.4hc r0 = new X.4hc
            r0.<init>(r1)
            com.whatsapp.areffects.viewmodel.session.ArEffectSession.A06(r4, r0)
        L_0x0136:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0139:
            X.4hU r1 = X.C92534hU.A00
            goto L_0x012e
        L_0x013c:
            r2 = r0
            goto L_0x0121
        L_0x013e:
            r5 = move-exception
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r4 = r0.this$0
            X.4hD r1 = r0.$params
            java.lang.String r0 = "ArEffectSession/enableEffect Cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Wj r6 = com.whatsapp.areffects.viewmodel.session.ArEffectSession.A01(r4)
            boolean r0 = r6 instanceof X.C92594ha
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = "ArEffectSession/enableEffect Disabling effect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Yi r3 = r4.A04
            X.4D9 r2 = r1.A01
            X.4DE r1 = r1.A00
            X.4hB r0 = new X.4hB
            r0.<init>(r1, r2)
            r3.BIg(r0)
            boolean r0 = r5 instanceof X.C75623hr
            if (r0 == 0) goto L_0x0176
            X.4ha r6 = (X.C92594ha) r6
            X.4hZ r1 = r6.A03
            if (r1 == 0) goto L_0x0176
            X.4hb r0 = new X.4hb
            r0.<init>(r1)
        L_0x0172:
            com.whatsapp.areffects.viewmodel.session.ArEffectSession.A06(r4, r0)
        L_0x0175:
            throw r5
        L_0x0176:
            boolean r0 = r5 instanceof X.C99804tU
            if (r0 == 0) goto L_0x0199
            r1 = r5
            X.4tU r1 = (X.C99804tU) r1
            if (r1 == 0) goto L_0x0199
            boolean r0 = r1 instanceof X.C75643ht
            if (r0 != 0) goto L_0x0199
            boolean r0 = r1 instanceof X.C75633hs
            if (r0 == 0) goto L_0x018f
            X.4hQ r1 = X.C92494hQ.A00
        L_0x0189:
            X.4hc r0 = new X.4hc
            r0.<init>(r1)
            goto L_0x0172
        L_0x018f:
            boolean r0 = r1 instanceof X.C75623hr
            if (r0 == 0) goto L_0x0196
            X.4hV r1 = X.C92544hV.A00
            goto L_0x0189
        L_0x0196:
            X.4hP r1 = X.C92484hP.A00
            goto L_0x0189
        L_0x0199:
            X.4hR r1 = X.C92504hR.A00
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.session.ArEffectSession$enableEffect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$enableEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
