package com.whatsapp.media.share;

import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.share.ShareMediaViewModel$sendSticker$1", f = "ShareMediaViewModel.kt", i = {}, l = {98, 100, 104, 137}, m = "invokeSuspend", n = {}, s = {})
public final class ShareMediaViewModel$sendSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $hasNumberFromUrl;
    public final /* synthetic */ boolean $isWamoSubMessage;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ int $position;
    public final /* synthetic */ AnonymousClass206 $quotedMessage;
    public final /* synthetic */ C1418377d $sticker;
    public final /* synthetic */ Integer $stickerSendOriginType;
    public final /* synthetic */ AnonymousClass1E7 $waContact;
    public int label;
    public final /* synthetic */ ShareMediaViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMediaViewModel$sendSticker$1(AnonymousClass1E7 r2, AnonymousClass1BI r3, ShareMediaViewModel shareMediaViewModel, AnonymousClass206 r5, C1418377d r6, Integer num, C30391dr r8, int i, boolean z, boolean z2) {
        super(2, r8);
        this.$jid = r3;
        this.$sticker = r6;
        this.this$0 = shareMediaViewModel;
        this.$waContact = r2;
        this.$stickerSendOriginType = num;
        this.$quotedMessage = r5;
        this.$hasNumberFromUrl = z;
        this.$isWamoSubMessage = z2;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r13) {
        AnonymousClass1BI r2 = this.$jid;
        C1418377d r5 = this.$sticker;
        ShareMediaViewModel shareMediaViewModel = this.this$0;
        AnonymousClass1E7 r1 = this.$waContact;
        Integer num = this.$stickerSendOriginType;
        return new ShareMediaViewModel$sendSticker$1(r1, r2, shareMediaViewModel, this.$quotedMessage, r5, num, r13, this.$position, this.$hasNumberFromUrl, this.$isWamoSubMessage);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        if ((r11 - r7) > 300) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r5 = 4
            r3 = 3
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x001c
            if (r0 == r6) goto L_0x0017
            if (r0 == r2) goto L_0x0017
            if (r0 == r3) goto L_0x0017
            if (r0 == r5) goto L_0x0017
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0017:
            X.C30691eM.A01(r14)     // Catch:{ CancellationException -> 0x017a }
            goto L_0x0180
        L_0x001c:
            X.C30691eM.A01(r14)
            X.1BI r0 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            if (r0 == 0) goto L_0x016d
            X.77d r0 = r13.$sticker     // Catch:{ CancellationException -> 0x017a }
            if (r0 == 0) goto L_0x016d
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A0A     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.17x r0 = (X.C219217x) r0     // Catch:{ CancellationException -> 0x017a }
            boolean r0 = r0.A0D()     // Catch:{ CancellationException -> 0x017a }
            if (r0 != 0) goto L_0x0044
            com.whatsapp.media.share.ShareMediaViewModel r1 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.42v r0 = X.AnonymousClass42v.A00     // Catch:{ CancellationException -> 0x017a }
            r13.label = r2     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = com.whatsapp.media.share.ShareMediaViewModel.A00(r0, r1, r13)     // Catch:{ CancellationException -> 0x017a }
            if (r0 != r4) goto L_0x0180
            return r4
        L_0x0044:
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A04     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r2 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.4mY r2 = (X.C95634mY) r2     // Catch:{ CancellationException -> 0x017a }
            X.1E7 r0 = r13.$waContact     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0x(r0)     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r2.A00     // Catch:{ CancellationException -> 0x017a }
            boolean r0 = X.C72463Mc.A1U(r1, r0)     // Catch:{ CancellationException -> 0x017a }
            if (r0 == 0) goto L_0x0069
            com.whatsapp.media.share.ShareMediaViewModel r1 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.42w r0 = X.AnonymousClass42w.A00     // Catch:{ CancellationException -> 0x017a }
            r13.label = r3     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = com.whatsapp.media.share.ShareMediaViewModel.A00(r0, r1, r13)     // Catch:{ CancellationException -> 0x017a }
            if (r0 != r4) goto L_0x0180
            return r4
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = "ShareMediaViewModel/sendSticker/origin = "
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            java.lang.Integer r0 = r13.$stickerSendOriginType     // Catch:{ CancellationException -> 0x017a }
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = " / address = "
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.C17900vP.A0b(r0, r1)     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A05     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r1 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.4md r1 = (X.C95684md) r1     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            boolean r0 = r1.A01(r0)     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r3 = "ShareMediaViewModel/Invalid send sticker"
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "ShareMediaViewModel/sendSticker/cannot share a sticker in a read only chat."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A06     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r2 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.190 r2 = (X.AnonymousClass190) r2     // Catch:{ CancellationException -> 0x017a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = "Cannot share sticker into a read only chat "
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            r0 = 46
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)     // Catch:{ CancellationException -> 0x017a }
            r2.A0G(r3, r0, r6)     // Catch:{ CancellationException -> 0x017a }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x017a }
            return r0
        L_0x00be:
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A08     // Catch:{ CancellationException -> 0x017a }
            r0.get()     // Catch:{ CancellationException -> 0x017a }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ CancellationException -> 0x017a }
            long r7 = X.AnonymousClass4F8.A00     // Catch:{ CancellationException -> 0x017a }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            long r9 = r11 - r7
            r7 = 300(0x12c, double:1.48E-321)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x00db
        L_0x00da:
            r0 = 1
        L_0x00db:
            X.AnonymousClass4F8.A00 = r11     // Catch:{ CancellationException -> 0x017a }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "ShareMediaViewModel/sendSticker/can't send stickers too fast"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ CancellationException -> 0x017a }
            X.1BI r1 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r0.A00     // Catch:{ CancellationException -> 0x017a }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ CancellationException -> 0x017a }
            if (r0 != 0) goto L_0x0118
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r0.A06     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r2 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.190 r2 = (X.AnonymousClass190) r2     // Catch:{ CancellationException -> 0x017a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = "Fast. Sent to "
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r0.A00     // Catch:{ CancellationException -> 0x017a }
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = " now to "
            r1.append(r0)     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ CancellationException -> 0x017a }
            r2.A0G(r3, r0, r6)     // Catch:{ CancellationException -> 0x017a }
        L_0x0118:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x017a }
            return r0
        L_0x011b:
            com.whatsapp.media.share.ShareMediaViewModel r2 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.77d r9 = r13.$sticker     // Catch:{ CancellationException -> 0x017a }
            X.1BI r7 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            X.206 r8 = r13.$quotedMessage     // Catch:{ CancellationException -> 0x017a }
            boolean r11 = r13.$hasNumberFromUrl     // Catch:{ CancellationException -> 0x017a }
            boolean r12 = r13.$isWamoSubMessage     // Catch:{ CancellationException -> 0x017a }
            java.lang.Integer r10 = r13.$stickerSendOriginType     // Catch:{ CancellationException -> 0x017a }
            X.00H r0 = r2.A03     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r3 = X.C18070vi.A0E(r0)     // Catch:{ CancellationException -> 0x017a }
            X.0vd r3 = (X.C18020vd) r3     // Catch:{ CancellationException -> 0x017a }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ CancellationException -> 0x017a }
            r1 = 11628(0x2d6c, float:1.6294E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x017a }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ CancellationException -> 0x017a }
            if (r0 == 0) goto L_0x014a
            X.00H r0 = r2.A07     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.72H r0 = (X.AnonymousClass72H) r0     // Catch:{ CancellationException -> 0x017a }
            r0.A05(r9)     // Catch:{ CancellationException -> 0x017a }
        L_0x014a:
            X.00H r0 = r2.A09     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r6 = r0.get()     // Catch:{ CancellationException -> 0x017a }
            X.1iW r6 = (X.C33251iW) r6     // Catch:{ CancellationException -> 0x017a }
            r6.A0R(r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x017a }
            com.whatsapp.media.share.ShareMediaViewModel r3 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.1BI r0 = r13.$jid     // Catch:{ CancellationException -> 0x017a }
            r3.A00 = r0     // Catch:{ CancellationException -> 0x017a }
            java.lang.Integer r2 = r13.$stickerSendOriginType     // Catch:{ CancellationException -> 0x017a }
            int r1 = r13.$position     // Catch:{ CancellationException -> 0x017a }
            X.42t r0 = new X.42t     // Catch:{ CancellationException -> 0x017a }
            r0.<init>(r1, r2)     // Catch:{ CancellationException -> 0x017a }
            r13.label = r5     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = com.whatsapp.media.share.ShareMediaViewModel.A00(r0, r3, r13)     // Catch:{ CancellationException -> 0x017a }
            if (r0 != r4) goto L_0x0180
            return r4
        L_0x016d:
            com.whatsapp.media.share.ShareMediaViewModel r1 = r13.this$0     // Catch:{ CancellationException -> 0x017a }
            X.42u r0 = X.C821342u.A00     // Catch:{ CancellationException -> 0x017a }
            r13.label = r6     // Catch:{ CancellationException -> 0x017a }
            java.lang.Object r0 = com.whatsapp.media.share.ShareMediaViewModel.A00(r0, r1, r13)     // Catch:{ CancellationException -> 0x017a }
            if (r0 != r4) goto L_0x0180
            return r4
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "ShareMediaViewModel/sendSticker/cancelled"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0180:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.share.ShareMediaViewModel$sendSticker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShareMediaViewModel$sendSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
