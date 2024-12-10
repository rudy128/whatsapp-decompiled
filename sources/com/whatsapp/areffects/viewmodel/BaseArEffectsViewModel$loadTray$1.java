package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$loadTray$1", f = "BaseArEffectsViewModel.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 4, 4}, l = {1016, 453, 456, 1033, 1053}, m = "invokeSuspend", n = {"$this$launch", "categoriesToLoad", "$this$withLock_u24default$iv", "$this$launch", "categoriesToLoad", "categoriesToLoad", "categoriesToLoad", "$this$withLock_u24default$iv", "effectMap", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1"})
public final class BaseArEffectsViewModel$loadTray$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$loadTray$1(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        BaseArEffectsViewModel$loadTray$1 baseArEffectsViewModel$loadTray$1 = new BaseArEffectsViewModel$loadTray$1(this.this$0, r4);
        baseArEffectsViewModel$loadTray$1.L$0 = obj;
        return baseArEffectsViewModel$loadTray$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r9.Bhx(r3) == r4) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024a A[Catch:{ all -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0275 A[Catch:{ all -> 0x0299 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r7 = r18
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r3 = r17
            int r8 = r3.label
            r2 = 5
            r1 = 4
            r5 = 3
            r0 = 2
            r6 = 1
            r15 = 0
            if (r8 == 0) goto L_0x0062
            if (r8 == r6) goto L_0x004e
            if (r8 == r0) goto L_0x0041
            if (r8 == r5) goto L_0x0129
            if (r8 == r1) goto L_0x0030
            if (r8 != r2) goto L_0x002b
            java.lang.Object r6 = r3.L$2
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r6
            java.lang.Object r5 = r3.L$1
            X.1n2 r5 = (X.C35911n2) r5
            java.lang.Object r0 = r3.L$0
            java.util.Map r0 = (java.util.Map) r0
            X.C30691eM.A01(r7)
            goto L_0x026b
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0030:
            java.lang.Object r6 = r3.L$2
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r6
            java.lang.Object r5 = r3.L$1
            X.1n2 r5 = (X.C35911n2) r5
            java.lang.Object r1 = r3.L$0
            X.4rF r1 = (X.C98494rF) r1
            X.C30691eM.A01(r7)
            goto L_0x023c
        L_0x0041:
            java.lang.Object r1 = r3.L$1
            X.4rF r1 = (X.C98494rF) r1
            java.lang.Object r8 = r3.L$0
            X.1OX r8 = (X.AnonymousClass1OX) r8
            X.C30691eM.A01(r7)
            goto L_0x0101
        L_0x004e:
            java.lang.Object r10 = r3.L$3
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r10 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r10
            java.lang.Object r9 = r3.L$2
            X.1n2 r9 = (X.C35911n2) r9
            java.lang.Object r1 = r3.L$1
            X.4rF r1 = (X.C98494rF) r1
            java.lang.Object r8 = r3.L$0
            X.1OX r8 = (X.AnonymousClass1OX) r8
            X.C30691eM.A01(r7)
            goto L_0x0082
        L_0x0062:
            X.C30691eM.A01(r7)
            java.lang.Object r8 = r3.L$0
            X.1OX r8 = (X.AnonymousClass1OX) r8
            X.4rF r1 = X.C98494rF.A00()
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r10 = r3.this$0
            X.1n2 r9 = r10.A0P
            r3.L$0 = r8
            r3.L$1 = r1
            r3.L$2 = r9
            r3.L$3 = r10
            r3.label = r6
            java.lang.Object r0 = r9.Bhx(r3)
            if (r0 != r4) goto L_0x0082
        L_0x0081:
            return r4
        L_0x0082:
            X.0vl r0 = r10.A0H     // Catch:{ all -> 0x029e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x029e }
            X.4VF r0 = (X.AnonymousClass4VF) r0     // Catch:{ all -> 0x029e }
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x029e }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x029e }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x029e }
        L_0x0094:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x029e }
            r7 = r11
            X.4DE r7 = (X.AnonymousClass4DE) r7     // Catch:{ all -> 0x029e }
            X.0vl r0 = r10.A0J     // Catch:{ all -> 0x029e }
            X.4S8 r0 = X.C72473Md.A0P(r7, r0)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x0094
            X.1G4 r0 = r0.A03     // Catch:{ all -> 0x029e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x029e }
            X.4D3 r0 = (X.AnonymousClass4D3) r0     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x0094
            int r7 = r0.ordinal()     // Catch:{ all -> 0x029e }
            r0 = 0
            if (r7 == r0) goto L_0x00bd
            if (r7 == r5) goto L_0x00bd
            goto L_0x0094
        L_0x00bd:
            r12.add(r11)     // Catch:{ all -> 0x029e }
            goto L_0x0094
        L_0x00c1:
            java.util.Set r0 = X.C29431cG.A12(r12)     // Catch:{ all -> 0x029e }
            r1.element = r0     // Catch:{ all -> 0x029e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x00d1
            X.1Wu r4 = X.C27621Wu.A00     // Catch:{ all -> 0x029e }
            goto L_0x0238
        L_0x00d1:
            java.lang.Object r0 = r1.element     // Catch:{ all -> 0x029e }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x029e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x029e }
        L_0x00d9:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x029e }
            X.4DE r7 = (X.AnonymousClass4DE) r7     // Catch:{ all -> 0x029e }
            X.0vl r0 = r10.A0J     // Catch:{ all -> 0x029e }
            X.4S8 r0 = X.C72473Md.A0P(r7, r0)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x00d9
            X.4D3 r7 = X.AnonymousClass4D3.LOADING     // Catch:{ all -> 0x029e }
            X.1G4 r0 = r0.A03     // Catch:{ all -> 0x029e }
            r0.setValue(r7)     // Catch:{ all -> 0x029e }
            goto L_0x00d9
        L_0x00f5:
            r9.CQ9(r15)
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r3.this$0
            X.00H r0 = r0.A05
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
        L_0x0101:
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r3.this$0
            X.9Zt r12 = r0.A02
            X.4D9 r13 = r0.A0T()
            java.lang.Object r14 = r1.element
            java.util.Set r14 = (java.util.Set) r14
            X.0wh r0 = r8.getCoroutineContext()
            r3.L$0 = r1
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.label = r5
            com.whatsapp.areffects.data.ArEffectsRepository$getEffects$2 r11 = new com.whatsapp.areffects.data.ArEffectsRepository$getEffects$2
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r7 = X.C30451dy.A00(r3, r0, r11)
            if (r7 != r4) goto L_0x0130
            return r4
        L_0x0129:
            java.lang.Object r1 = r3.L$0
            X.4rF r1 = (X.C98494rF) r1
            X.C30691eM.A01(r7)
        L_0x0130:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r5 = r1.element
            java.util.Set r5 = (java.util.Set) r5
            java.util.Set r0 = r7.keySet()
            java.util.Set r0 = X.C41841x9.A06(r0, r5)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0162
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0176
            java.util.Iterator r5 = X.AnonymousClass000.A15(r7)
        L_0x0150:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = X.C17890vO.A0P(r5)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0150
        L_0x0162:
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = r3.this$0
            X.1n2 r5 = r6.A0P
            r3.L$0 = r1
            r3.L$1 = r5
            r3.L$2 = r6
            r0 = 4
            r3.label = r0
            java.lang.Object r0 = r5.Bhx(r3)
            if (r0 != r4) goto L_0x023c
            return r4
        L_0x0176:
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r3.this$0
            X.00H r0 = r0.A05
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r3.this$0
            X.0vl r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            X.0vk r0 = r0.A06
            java.lang.Object r0 = r0.invoke()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.4hI r10 = new X.4hI
            r10.<init>(r0)
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r9 = r3.this$0
            java.util.Iterator r14 = X.AnonymousClass000.A15(r7)
        L_0x019c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01e7
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r14)
            java.lang.Object r8 = r0.getKey()
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
            X.0vl r0 = r9.A0J
            X.4S8 r8 = X.C72473Md.A0P(r8, r0)
            if (r8 == 0) goto L_0x019c
            java.util.List r13 = X.C18070vi.A0M(r10)
            java.util.ArrayList r12 = X.C29351c6.A0D(r5)
            java.util.Iterator r11 = r5.iterator()
        L_0x01c4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r5 = r11.next()
            X.5aj r5 = (X.C107855aj) r5
            X.4hH r0 = new X.4hH
            r0.<init>(r5)
            r12.add(r0)
            goto L_0x01c4
        L_0x01d9:
            java.util.ArrayList r5 = X.C29431cG.A0k(r12, r13)
            X.1G4 r0 = r8.A02
            r0.setValue(r5)
            r0 = 0
            r8.A00(r0)
            goto L_0x019c
        L_0x01e7:
            java.lang.Object r1 = r1.element
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r8 = r3.this$0
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x020e
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x020e
        L_0x01fa:
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = r3.this$0
            X.1n2 r5 = r6.A0P
            r3.L$0 = r7
            r3.L$1 = r5
            r3.L$2 = r6
            r3.label = r2
            java.lang.Object r0 = r5.Bhx(r3)
            if (r0 == r4) goto L_0x0081
            r0 = r7
            goto L_0x026b
        L_0x020e:
            java.util.Iterator r5 = r1.iterator()
        L_0x0212:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r1 = r5.next()
            X.0vl r0 = r8.A0J
            X.4S8 r0 = X.C72473Md.A0P(r1, r0)
            if (r0 == 0) goto L_0x0212
            boolean r0 = r0.A01()
            if (r0 != r6) goto L_0x0212
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r3.this$0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r0 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r0
            r0.A01()
            goto L_0x01fa
        L_0x0238:
            r9.CQ9(r15)
            return r4
        L_0x023c:
            java.lang.Object r0 = r1.element     // Catch:{ all -> 0x0266 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0266 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0266 }
        L_0x0244:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x0260
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0266 }
            X.4DE r1 = (X.AnonymousClass4DE) r1     // Catch:{ all -> 0x0266 }
            X.0vl r0 = r6.A0J     // Catch:{ all -> 0x0266 }
            X.4S8 r0 = X.C72473Md.A0P(r1, r0)     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x0244
            X.4D3 r1 = X.AnonymousClass4D3.LOAD_FAILED     // Catch:{ all -> 0x0266 }
            X.1G4 r0 = r0.A03     // Catch:{ all -> 0x0266 }
            r0.setValue(r1)     // Catch:{ all -> 0x0266 }
            goto L_0x0244
        L_0x0260:
            X.1Wu r4 = X.C27621Wu.A00     // Catch:{ all -> 0x0266 }
            r5.CQ9(r15)
            return r4
        L_0x0266:
            r0 = move-exception
            r5.CQ9(r15)
            throw r0
        L_0x026b:
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x0299 }
        L_0x026f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x0293
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x0299 }
            X.0vl r0 = r6.A0J     // Catch:{ all -> 0x0299 }
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)     // Catch:{ all -> 0x0299 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0299 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0299 }
            X.4S8 r0 = (X.AnonymousClass4S8) r0     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x026f
            X.4D3 r1 = X.AnonymousClass4D3.LOADED     // Catch:{ all -> 0x0299 }
            X.1G4 r0 = r0.A03     // Catch:{ all -> 0x0299 }
            r0.setValue(r1)     // Catch:{ all -> 0x0299 }
            goto L_0x026f
        L_0x0293:
            X.1Wu r4 = X.C27621Wu.A00     // Catch:{ all -> 0x0299 }
            r5.CQ9(r15)
            return r4
        L_0x0299:
            r0 = move-exception
            r5.CQ9(r15)
            throw r0
        L_0x029e:
            r0 = move-exception
            r9.CQ9(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$loadTray$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$loadTray$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
