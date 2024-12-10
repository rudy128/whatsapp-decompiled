package com.whatsapp.expressionstray.search;

import X.AnonymousClass1OS;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onStickerSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {358, 366}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onStickerSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C1418377d $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onStickerSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, C1418377d r3, Integer num, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = expressionsSearchViewModel;
        this.$position = i;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ExpressionsSearchViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r4 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r10) goto L_0x0069
            if (r0 != r4) goto L_0x0084
            X.C30691eM.A01(r12)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r12)
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = r11.this$0
            r1.A06 = r10
            int r0 = r11.$position
            r1.A01 = r0
            X.00H r0 = r1.A0J
            java.lang.Object r1 = r0.get()
            X.6yO r1 = (X.C139196yO) r1
            X.77d r0 = r11.$sticker
            X.77d r7 = r1.A01(r0)
            if (r7 == 0) goto L_0x000f
            boolean r1 = r7.A0N
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r11.this$0
            X.00H r0 = r0.A0G
            X.A59 r2 = X.C108945cZ.A0e(r0)
            if (r1 == 0) goto L_0x005d
            r0 = 3
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r2.A03(r0, r10, r4)
        L_0x0041:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r11.this$0
            X.1G3 r1 = r0.A0L
            java.lang.Integer r8 = r11.$stickerSendOrigin
            int r9 = r11.$position
            X.00H r0 = r0.A0F
            X.1BI r6 = X.C137836w6.A00(r0)
            X.5zP r5 = new X.5zP
            r5.<init>(r6, r7, r8, r9, r10)
            r11.label = r10
            java.lang.Object r0 = r1.BJt(r5, r11)
            if (r0 != r3) goto L_0x006c
            return r3
        L_0x005d:
            r0 = 32
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
            r0 = 9
            r2.A03(r1, r10, r0)
            goto L_0x0041
        L_0x0069:
            X.C30691eM.A01(r12)
        L_0x006c:
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r0 = r11.this$0
            X.1G3 r2 = r0.A0L
            X.00H r0 = r0.A0F
            X.1BI r1 = X.C137836w6.A00(r0)
            X.5zA r0 = new X.5zA
            r0.<init>(r1)
            r11.label = r4
            java.lang.Object r0 = r2.BJt(r0, r11)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onStickerSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onStickerSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
