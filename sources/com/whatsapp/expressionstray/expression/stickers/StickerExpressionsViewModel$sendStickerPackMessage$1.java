package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass725;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$sendStickerPackMessage$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1164}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$sendStickerPackMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass725 $stickerPackInput;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$sendStickerPackMessage$1(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass1BI r3, AnonymousClass725 r4, C30391dr r5) {
        super(2, r5);
        this.$stickerPackInput = r4;
        this.this$0 = stickerExpressionsViewModel;
        this.$chatJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerExpressionsViewModel$sendStickerPackMessage$1(this.this$0, this.$chatJid, this.$stickerPackInput, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (r2 == null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r5) goto L_0x00e7
            X.C30691eM.A01(r13)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r13)
            X.725 r7 = r12.$stickerPackInput
            boolean r0 = r7.A0U
            if (r0 != 0) goto L_0x0046
            java.util.List r0 = r7.A07
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0046
            java.util.List r0 = r7.A07
            java.lang.Object r1 = r0.get(r3)
            X.77d r1 = (X.C1418377d) r1
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x0046
            int r0 = r1.A01
            if (r0 == r5) goto L_0x0046
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.00H r0 = r0.A0W
            java.lang.Object r2 = r0.get()
            X.1SB r2 = (X.AnonymousClass1SB) r2
            java.lang.String r1 = r7.A0H
            r0 = 0
            X.725 r7 = r2.A06(r0, r1, r3, r5)
            if (r7 != 0) goto L_0x0046
            X.725 r7 = r12.$stickerPackInput
        L_0x0046:
            boolean r0 = r7.A0U
            r3 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x00a0
            java.io.File r2 = X.C108945cZ.A17(r0)
        L_0x0053:
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.00H r0 = r0.A0V
            java.lang.Object r0 = r0.get()
            X.71v r0 = (X.C1405271v) r0
            java.io.File r8 = r0.A02(r7, r2)
            if (r8 != 0) goto L_0x007a
            java.lang.String r0 = "StickerExpressionsViewModel/sendStickerPackMessage/stickerPackFileInternal is null"
        L_0x0065:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = r12.this$0
            X.00H r0 = r2.A0O
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 12
            X.7Ql r0 = X.C146747Ql.A00(r2, r0)
            r1.A0J(r0)
            goto L_0x000c
        L_0x007a:
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.00H r0 = r0.A0V
            java.lang.Object r0 = r0.get()
            X.71v r0 = (X.C1405271v) r0
            byte[] r11 = r0.A03(r7)
            if (r11 != 0) goto L_0x00b2
            java.lang.String r0 = "StickerExpressionsViewModel/sendStickerPackMessage/failed to generate thumbnail"
            goto L_0x0065
        L_0x008d:
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.00H r0 = r0.A0W
            java.lang.Object r1 = r0.get()
            X.1SB r1 = (X.AnonymousClass1SB) r1
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "StickerRepository/retrieveThirdPartyTrayIconFile attempted to get tray icon of non-third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00a0:
            java.lang.String r0 = "StickerExpressionsViewModel/sendStickerPackMessage/failed to retrieve tray icon"
            goto L_0x0065
        L_0x00a3:
            X.00H r0 = r1.A0M
            java.lang.Object r0 = r0.get()
            X.6pr r0 = (X.C134006pr) r0
            java.io.File r2 = r0.A01(r7)
            if (r2 != 0) goto L_0x0053
            goto L_0x00a0
        L_0x00b2:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.1BI r0 = r12.$chatJid
            r10.add(r0)
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.00H r0 = r0.A0R
            java.lang.Object r1 = r0.get()
            X.1kd r1 = (X.C34531kd) r1
            java.lang.String r9 = r2.getName()
            java.lang.String r0 = "SendMedia/sendStickerPackMessage/sending pack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1iW r6 = r1.A03
            r6.A0m(r7, r8, r9, r10, r11)
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r12.this$0
            X.1G3 r2 = r0.A0j
            X.1BI r1 = r12.$chatJid
            X.5zL r0 = new X.5zL
            r0.<init>(r1, r3)
            r12.label = r5
            java.lang.Object r0 = r2.BJt(r0, r12)
            if (r0 != r4) goto L_0x000c
            return r4
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$sendStickerPackMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$sendStickerPackMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
