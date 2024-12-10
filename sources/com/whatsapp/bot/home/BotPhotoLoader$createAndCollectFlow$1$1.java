package com.whatsapp.bot.home;

import X.AnonymousClass1OS;
import X.C136486tt;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C42971z2;
import android.widget.ImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.BotPhotoLoader$createAndCollectFlow$1$1", f = "BotPhotoLoader.kt", i = {0, 1}, l = {76, 83}, m = "invokeSuspend", n = {"key", "key"}, s = {"L$0", "L$0"})
public final class BotPhotoLoader$createAndCollectFlow$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $botGetter;
    public final /* synthetic */ C42971z2 $displayer;
    public final /* synthetic */ ImageView $imageView;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C136486tt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPhotoLoader$createAndCollectFlow$1$1(ImageView imageView, C136486tt r3, C42971z2 r4, C30391dr r5, C18090vk r6) {
        super(2, r5);
        this.$botGetter = r6;
        this.this$0 = r3;
        this.$displayer = r4;
        this.$imageView = imageView;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C18090vk r5 = this.$botGetter;
        BotPhotoLoader$createAndCollectFlow$1$1 botPhotoLoader$createAndCollectFlow$1$1 = new BotPhotoLoader$createAndCollectFlow$1$1(this.$imageView, this.this$0, this.$displayer, r8, r5);
        botPhotoLoader$createAndCollectFlow$1$1.L$0 = obj;
        return botPhotoLoader$createAndCollectFlow$1$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2.A02 != X.C122626Rc.A04) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r5 = 0
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 == r1) goto L_0x00c3
            if (r0 != r8) goto L_0x00d3
            java.lang.Object r7 = r9.L$0
            X.C30691eM.A01(r10)
        L_0x0012:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L_0x002a
            X.6tt r2 = r9.this$0
            X.6Rc r1 = r2.A02
            X.6Rc r0 = X.C122626Rc.A04
            if (r1 == r0) goto L_0x0029
        L_0x001e:
            X.0vl r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.1Mz r0 = (X.C25131Mz) r0
            r0.A0F(r7, r10)
        L_0x0029:
            r5 = r10
        L_0x002a:
            X.1z2 r2 = r9.$displayer
            android.widget.ImageView r1 = r9.$imageView
            if (r5 != 0) goto L_0x0036
            r2.CN5(r1)
        L_0x0033:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0036:
            r0 = 0
            r2.CMZ(r5, r1, r0)
            goto L_0x0033
        L_0x003b:
            X.C30691eM.A01(r10)
            java.lang.Object r7 = r9.L$0
            X.1D6 r7 = (X.AnonymousClass1D6) r7
            X.0vk r0 = r9.$botGetter
            java.lang.Object r4 = r0.invoke()
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBot r4 = (com.whatsapp.infra.graphql.generated.aihome.AiHomeBot) r4
            if (r7 == 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            java.lang.Object r3 = r7.first
            r2 = r4
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A0F(r0)
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 == 0) goto L_0x0033
            int r0 = X.C108955ca.A09(r7)
            if (r0 == r1) goto L_0x0095
            if (r0 != r8) goto L_0x002a
            X.6tt r0 = r9.this$0
            X.6Rb r3 = X.C122616Rb.A02
            java.lang.String r7 = r0.A00(r3, r4)
            X.6tt r0 = r9.this$0
            X.0vl r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.1Mz r0 = (X.C25131Mz) r0
            java.lang.Object r0 = r0.A0A(r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x00d0
            X.6tt r2 = r9.this$0
            r9.L$0 = r7
            r9.label = r8
            X.0wl r1 = r2.A07
            com.whatsapp.bot.home.BotPhotoLoader$getBitmapFromFile$2 r0 = new com.whatsapp.bot.home.BotPhotoLoader$getBitmapFromFile$2
            r0.<init>(r2, r3, r4, r5)
            java.lang.Object r10 = X.C30451dy.A00(r9, r1, r0)
            if (r10 != r6) goto L_0x0012
            return r6
        L_0x0095:
            X.6tt r0 = r9.this$0
            X.6Rb r3 = X.C122616Rb.A03
            java.lang.String r7 = r0.A00(r3, r4)
            X.6tt r0 = r9.this$0
            X.0vl r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.1Mz r0 = (X.C25131Mz) r0
            java.lang.Object r0 = r0.A0A(r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x00d0
            X.6tt r2 = r9.this$0
            r9.L$0 = r7
            r9.label = r1
            X.0wl r1 = r2.A07
            com.whatsapp.bot.home.BotPhotoLoader$getBitmapFromFile$2 r0 = new com.whatsapp.bot.home.BotPhotoLoader$getBitmapFromFile$2
            r0.<init>(r2, r3, r4, r5)
            java.lang.Object r10 = X.C30451dy.A00(r9, r1, r0)
            if (r10 != r6) goto L_0x00c8
            return r6
        L_0x00c3:
            java.lang.Object r7 = r9.L$0
            X.C30691eM.A01(r10)
        L_0x00c8:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L_0x002a
            X.6tt r2 = r9.this$0
            goto L_0x001e
        L_0x00d0:
            r5 = r0
            goto L_0x002a
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.BotPhotoLoader$createAndCollectFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPhotoLoader$createAndCollectFlow$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
