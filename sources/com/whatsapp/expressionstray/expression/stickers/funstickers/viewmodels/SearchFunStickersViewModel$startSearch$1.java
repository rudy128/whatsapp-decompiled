package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1", f = "SearchFunStickersViewModel.kt", i = {0, 1}, l = {241, 285}, m = "invokeSuspend", n = {"$this$launch", "finalException"}, s = {"L$0", "L$0"})
public final class SearchFunStickersViewModel$startSearch$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$startSearch$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$prompt = str;
        this.$shouldTriggerWithDelay = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        SearchFunStickersViewModel$startSearch$1 searchFunStickersViewModel$startSearch$1 = new SearchFunStickersViewModel$startSearch$1(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
        searchFunStickersViewModel$startSearch$1.L$0 = obj;
        return searchFunStickersViewModel$startSearch$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (r13 == r3) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 == r8) goto L_0x003c
            if (r0 != r5) goto L_0x0223
            java.lang.Object r4 = r12.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            X.C30691eM.A01(r13)
        L_0x0013:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.00H r0 = r0.A0O
            java.lang.Object r0 = r0.get()
            X.71o r0 = (X.C1404771o) r0
            X.C1404771o.A01(r0)
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.1DT r1 = r0.A09
            java.util.List r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A08(r0)
            r1.A0F(r0)
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.1DT r2 = r0.A0A
            java.lang.String r1 = r12.$prompt
            X.60K r0 = new X.60K
            r0.<init>(r1, r4)
            r2.A0F(r0)
        L_0x0039:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x003c:
            java.lang.Object r4 = r12.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            goto L_0x00f8
        L_0x0042:
            X.C30691eM.A01(r13)
            java.lang.Object r4 = r12.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r7 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.String r0 = r12.$prompt     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r7.A04 = r0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A0C(r7)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0092
            java.util.List r6 = r7.A05     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = X.AnonymousClass000.A1a(r6)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r1 = X.C29431cG.A0d(r6)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.6TF r1 = (X.AnonymousClass6TF) r1     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x0063:
            boolean r0 = r1 instanceof X.AnonymousClass60I     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 != 0) goto L_0x0092
            boolean r0 = r1 instanceof X.AnonymousClass60H     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0082
            X.60H r1 = (X.AnonymousClass60H) r1     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.77V r0 = r1.A01     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.String r2 = r0.A03     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r2 != 0) goto L_0x0075
            java.lang.String r2 = ""
        L_0x0075:
            int r1 = r1.A00     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.60G r0 = new X.60G     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0.<init>(r2, r1)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r6.add(r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x0082
        L_0x0080:
            r1 = 0
            goto L_0x0063
        L_0x0082:
            r1 = 0
        L_0x0083:
            X.60I r0 = X.AnonymousClass60I.A00     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r6.add(r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            int r1 = r1 + 1
            r0 = 4
            if (r1 < r0) goto L_0x0083
            X.1DT r0 = r7.A09     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0.A0E(r6)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x0092:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r9 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r7 = r12.$shouldTriggerWithDelay     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.String r6 = r12.$prompt     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r12.L$0 = r4     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r12.label = r8     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.0wl r2 = r9.A0S     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r1 = 0
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2 r0 = new com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0.<init>(r9, r6, r1, r7)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.Object r13 = X.C30451dy.A00(r12, r2, r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x00f5
        L_0x00a9:
            r2 = move-exception
            boolean r0 = X.AnonymousClass1OW.A05(r4)
            if (r0 == 0) goto L_0x0216
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.1DT r0 = r0.A0A
            java.lang.Object r1 = r0.A06()
            X.60M r0 = X.AnonymousClass60M.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0216
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.11E r0 = r0.A0F
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0213
            X.6S5 r4 = new X.6S5
            r4.<init>()
        L_0x00cf:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r12.this$0
            r12.L$0 = r4
            r12.label = r5
            boolean r0 = r2 instanceof X.AnonymousClass6SV
            if (r0 == 0) goto L_0x0199
            X.6SV r2 = (X.AnonymousClass6SV) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 7
        L_0x00e2:
            X.00H r0 = r1.A0O
            java.lang.Object r0 = r0.get()
            X.71o r0 = (X.C1404771o) r0
            java.lang.Object r0 = r0.A02(r5, r12, r2)
            if (r0 == r3) goto L_0x00f7
            X.1Wu r0 = X.C27621Wu.A00
        L_0x00f2:
            if (r0 != r3) goto L_0x0013
            return r3
        L_0x00f5:
            if (r13 != r3) goto L_0x00fb
        L_0x00f7:
            return r3
        L_0x00f8:
            X.C30691eM.A01(r13)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x00fb:
            java.util.List r13 = (java.util.List) r13     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.0wh r0 = r4.getCoroutineContext()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.C30551e8.A05(r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = r13.isEmpty()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x011f
            java.lang.String r1 = r12.$prompt     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0 = 0
            X.60K r7 = new X.60K     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r7.<init>(r1, r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x0112:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.0ve r0 = r0.A0I     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r6 = 7190(0x1c16, float:1.0075E-41)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = X.C18020vd.A05(r2, r0, r6)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x0128
        L_0x011f:
            java.lang.String r1 = r12.$prompt     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0 = 0
            X.60L r7 = new X.60L     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r7.<init>(r1, r13, r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x0112
        L_0x0128:
            if (r0 == 0) goto L_0x012b
            goto L_0x0139
        L_0x012b:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.String r1 = r0.A03     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x014d
            X.6Ky r0 = r0.A0H     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.Map r0 = r0.A00     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0.remove(r1)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x014d
        L_0x0139:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.1DT r1 = r0.A09     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = r13.isEmpty()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0190
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.List r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A09(r0, r13)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x014a:
            r1.A0F(r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x014d:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.1DT r0 = r0.A0A     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r0.A0F(r7)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.0ve r0 = r0.A0I     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = X.C18020vd.A05(r2, r0, r6)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0162
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.List r13 = r0.A05     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x0162:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r7 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
        L_0x0168:
            boolean r0 = r2.hasNext()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.6TF r1 = (X.AnonymousClass6TF) r1     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            boolean r0 = r1 instanceof X.AnonymousClass60H     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0168
            X.60H r1 = (X.AnonymousClass60H) r1     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.77V r8 = r1.A01     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            int r11 = r1.A00     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.lang.String r9 = r8.A06     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            if (r9 == 0) goto L_0x0168
            X.1OX r0 = X.C41561wd.A00(r7)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r10 = 0
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1 r6 = new com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            X.AnonymousClass3MX.A1Q(r6, r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x0168
        L_0x0190:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.List r0 = r0.A05     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            java.util.List r0 = X.C29431cG.A0t(r0)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x00a9 }
            goto L_0x014a
        L_0x0199:
            boolean r0 = r2 instanceof X.AnonymousClass6SU
            if (r0 == 0) goto L_0x01a9
            X.6SU r2 = (X.AnonymousClass6SU) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 8
            goto L_0x00e2
        L_0x01a9:
            boolean r0 = r2 instanceof X.AnonymousClass6SW
            if (r0 == 0) goto L_0x01b9
            X.6SW r2 = (X.AnonymousClass6SW) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 15
            goto L_0x00e2
        L_0x01b9:
            boolean r0 = r2 instanceof X.AnonymousClass6SX
            if (r0 == 0) goto L_0x01c9
            X.6SX r2 = (X.AnonymousClass6SX) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 12
            goto L_0x00e2
        L_0x01c9:
            boolean r0 = r2 instanceof X.AnonymousClass6SY
            if (r0 == 0) goto L_0x01d9
            X.6SY r2 = (X.AnonymousClass6SY) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 14
            goto L_0x00e2
        L_0x01d9:
            boolean r0 = r2 instanceof X.AnonymousClass6SZ
            if (r0 == 0) goto L_0x01e9
            X.6SZ r2 = (X.AnonymousClass6SZ) r2
            int r0 = r2.errorCode
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r0)
            r2 = 13
            goto L_0x00e2
        L_0x01e9:
            boolean r0 = r2 instanceof X.C122826Sb
            if (r0 == 0) goto L_0x01f2
            r5 = 0
            r2 = 16
            goto L_0x00e2
        L_0x01f2:
            boolean r0 = r2 instanceof X.AnonymousClass6ST
            if (r0 == 0) goto L_0x01fe
            X.6ST r2 = (X.AnonymousClass6ST) r2
            java.lang.Integer r5 = r2.errorCode
            r2 = 9
            goto L_0x00e2
        L_0x01fe:
            boolean r0 = r2 instanceof X.AnonymousClass6S5
            if (r0 != 0) goto L_0x0013
            X.00H r0 = r1.A0O
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.71o r2 = (X.C1404771o) r2
            r1 = 0
            r0 = 9
            java.lang.Object r0 = r2.A02(r1, r12, r0)
            goto L_0x00f2
        L_0x0213:
            r4 = r2
            goto L_0x00cf
        L_0x0216:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.1DT r1 = r0.A09
            java.util.List r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A08(r0)
            r1.A0F(r0)
            goto L_0x0039
        L_0x0223:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$startSearch$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
