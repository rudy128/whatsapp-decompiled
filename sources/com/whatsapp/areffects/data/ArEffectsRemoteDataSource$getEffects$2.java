package com.whatsapp.areffects.data;

import X.AnonymousClass1OS;
import X.AnonymousClass4D9;
import X.C115255te;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getEffects$2", f = "ArEffectsRemoteDataSource.kt", i = {0}, l = {63, 74}, m = "invokeSuspend", n = {"deliveryTier"}, s = {"L$0"})
public final class ArEffectsRemoteDataSource$getEffects$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $accessToken;
    public final /* synthetic */ Set $categories;
    public final /* synthetic */ AnonymousClass4D9 $surface;
    public Object L$0;
    public int label;
    public final /* synthetic */ C115255te this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsRemoteDataSource$getEffects$2(C115255te r2, AnonymousClass4D9 r3, String str, Set set, C30391dr r6) {
        super(2, r6);
        this.this$0 = r2;
        this.$surface = r3;
        this.$accessToken = str;
        this.$categories = set;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ArEffectsRemoteDataSource$getEffects$2(this.this$0, this.$surface, this.$accessToken, this.$categories, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r8.add(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a A[Catch:{ UnsupportedOperationException -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016e A[Catch:{ UnsupportedOperationException -> 0x01a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r10 = r22
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r4 = r21
            int r0 = r4.label
            java.lang.String r5 = "ArEffectsRemoteDataSource/getEffects"
            r8 = 1
            r6 = 0
            r1 = 10
            r2 = 2
            if (r0 == 0) goto L_0x0021
            if (r0 == r8) goto L_0x001c
            if (r0 != r2) goto L_0x0017
            goto L_0x00ff
        L_0x0017:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001c:
            java.lang.Object r11 = r4.L$0
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x003f
        L_0x0021:
            X.C30691eM.A01(r10)
            X.5te r0 = r4.this$0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            com.whatsapp.areffects.util.ArEffectsGatingUtil r7 = r0.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.4D9 r0 = r4.$surface     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r11 = r7.A02(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.5te r0 = r4.this$0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            com.whatsapp.areffects.util.ArEffectsGatingUtil r7 = r0.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.4D9 r0 = r4.$surface     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r4.L$0 = r11     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r4.label = r8     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r10 = r7.A01(r0, r4)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r10 != r3) goto L_0x0042
            return r3
        L_0x003f:
            X.C30691eM.A01(r10)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0042:
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.5te r0 = r4.this$0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.00H r0 = r0.A01     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r9 = r0.get()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6dd r9 = (X.C126996dd) r9     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = r4.$accessToken     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.4D9 r12 = r4.$surface     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r7 = 0
            int r8 = X.C108955ca.A04(r12, r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r8 == r7) goto L_0x0061
            r7 = 1
            if (r8 == r7) goto L_0x0064
            if (r8 != r2) goto L_0x0196
            java.lang.Integer r16 = X.AnonymousClass00R.A0C     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0066
        L_0x0061:
            java.lang.Integer r16 = X.AnonymousClass00R.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0066
        L_0x0064:
            java.lang.Integer r16 = X.AnonymousClass00R.A01     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0066:
            java.util.Set r7 = r4.$categories     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.ArrayList r8 = X.C29351c6.A0E(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0070:
            boolean r7 = r13.hasNext()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r7 == 0) goto L_0x00ad
            java.lang.Object r12 = r13.next()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.4DE r12 = (X.AnonymousClass4DE) r12     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r7 = 0
            int r7 = X.C108955ca.A04(r12, r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            switch(r7) {
                case 0: goto L_0x009c;
                case 1: goto L_0x009c;
                case 2: goto L_0x0096;
                case 3: goto L_0x0093;
                case 4: goto L_0x0090;
                case 5: goto L_0x008d;
                case 6: goto L_0x008a;
                default: goto L_0x0084;
            }     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0084:
            X.3EW r1 = X.AnonymousClass3MW.A14()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x01a5
        L_0x008a:
            X.6R3 r7 = X.AnonymousClass6R3.FILTER     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0098
        L_0x008d:
            X.6R3 r7 = X.AnonymousClass6R3.PERSONALIZED_AVATAR     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0098
        L_0x0090:
            X.6R3 r7 = X.AnonymousClass6R3.AVATAR_PRESET     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0098
        L_0x0093:
            X.6R3 r7 = X.AnonymousClass6R3.FUN_EFFECT     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0098
        L_0x0096:
            X.6R3 r7 = X.AnonymousClass6R3.BACKGROUND     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0098:
            r8.add(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0070
        L_0x009c:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r12)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = " is not a supported category"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x01a5
        L_0x00ad:
            boolean r13 = X.C108975cc.A1K(r11)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.00H r7 = r9.A01     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r7 = r7.get()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.CVR r7 = (X.CVR) r7     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.9uH r15 = r7.A00()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6Qn[] r12 = new X.C122476Qn[r2]     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r14 = 0
            X.6Qn r7 = X.C122476Qn.NONE     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r12[r14] = r7     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6Qn r7 = X.C122476Qn.ZIP     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.List r20 = X.C18070vi.A0O(r7, r12, r13)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6tH r14 = new X.6tH     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r19 = r8
            r18 = r11
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6aq r7 = r9.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.10H r7 = r7.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.10E r7 = r7.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.0ve r11 = X.AnonymousClass10E.A8r(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.181 r8 = X.C108965cb.A0H(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.0z4 r10 = X.AnonymousClass3Ma.A0c(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.00H r12 = X.C108945cZ.A14(r7)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.67J r7 = new X.67J     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r9 = r14
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.5te r0 = r4.this$0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r4.L$0 = r6     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r4.label = r2     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r10 = r0.A00(r7, r5, r4)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r10 != r3) goto L_0x0102
            return r3
        L_0x00ff:
            X.C30691eM.A01(r10)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0102:
            X.6xC r10 = (X.C138506xC) r10     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.5te r0 = r4.this$0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r2 = r0.A01(r10, r5)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6qJ r2 = (X.C134266qJ) r2     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.Set r0 = r4.$categories     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            int r3 = r0.size()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.List r2 = r2.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            int r0 = r2.size()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r3 != r0) goto L_0x016e
            java.util.Set r0 = r4.$categories     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.ArrayList r2 = X.C29431cG.A0j(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            int r0 = X.C29351c6.A0C(r2, r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            int r1 = X.C200610r.A03(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r0 = 16
            if (r1 >= r0) goto L_0x012e
            r1 = 16
        L_0x012e:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r3.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0137:
            boolean r0 = r5.hasNext()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r5.next()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r4 = r0.first     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.Object r0 = r0.second     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6qI r0 = (X.C134256qI) r0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.6qe r0 = r0.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.List r0 = r0.A00     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.ArrayList r2 = X.C29351c6.A0E(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x0155:
            boolean r0 = r1.hasNext()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r1.next()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.9sG r0 = (X.C194769sG) r0     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.AM8 r0 = X.AnonymousClass9PA.A00(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r2.add(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0155
        L_0x0169:
            r3.put(r4, r2)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x0137
        L_0x016d:
            return r3
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = "Expected "
            r1.append(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.util.Set r0 = r4.$categories     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            int r0 = r0.size()     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r1.append(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = " categories, received "
            X.C17890vO.A15(r0, r1, r2)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = " categories"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.5td r0 = new X.5td     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r0.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            X.3hg r1 = new X.3hg     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            goto L_0x01a5
        L_0x0196:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r12)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.String r0 = " is not a supported surface"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ UnsupportedOperationException -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x01a5:
            throw r1     // Catch:{ UnsupportedOperationException -> 0x01a6 }
        L_0x01a6:
            r1 = move-exception
            X.3hg r0 = new X.3hg
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getEffects$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsRemoteDataSource$getEffects$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
