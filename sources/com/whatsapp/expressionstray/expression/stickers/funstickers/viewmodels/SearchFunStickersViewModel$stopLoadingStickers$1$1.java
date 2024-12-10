package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {557, 559, 560}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$stopLoadingStickers$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isRequestCancelled;
    public final /* synthetic */ AnonymousClass1OB $it;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$stopLoadingStickers$1$1(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r3, AnonymousClass1OB r4, boolean z) {
        super(2, r3);
        this.$isRequestCancelled = z;
        this.this$0 = searchFunStickersViewModel;
        this.$it = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SearchFunStickersViewModel$stopLoadingStickers$1$1(this.this$0, r6, this.$it, this.$isRequestCancelled);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r2) goto L_0x0028
            if (r0 == r3) goto L_0x0036
            if (r0 != r4) goto L_0x0044
            X.C30691eM.A01(r7)
        L_0x0012:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0015:
            X.C30691eM.A01(r7)
            boolean r0 = r6.$isRequestCancelled
            if (r0 == 0) goto L_0x002b
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r6.this$0
            r6.label = r2
            r0 = 6
            java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A07(r1, r6, r0)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x0028:
            X.C30691eM.A01(r7)
        L_0x002b:
            X.1OB r0 = r6.$it
            r6.label = r3
            java.lang.Object r0 = X.C30551e8.A00(r6, r0)
            if (r0 != r5) goto L_0x0039
            return r5
        L_0x0036:
            X.C30691eM.A01(r7)
        L_0x0039:
            r6.label = r4
            r0 = 150(0x96, double:7.4E-322)
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r5) goto L_0x0012
            return r5
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$stopLoadingStickers$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
