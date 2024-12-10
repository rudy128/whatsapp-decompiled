package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass1OS;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$onStickerSelected$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {243, 255}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$onStickerSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C1418377d $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$onStickerSelected$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C1418377d r3, Integer num, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = avatarExpressionsViewModel;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AvatarExpressionsViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x007d
            if (r0 != r3) goto L_0x00cf
            X.C30691eM.A01(r12)
        L_0x000f:
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.00H r0 = r0.A0E
            X.A59 r3 = X.C108945cZ.A0e(r0)
            r1 = 3
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r1)
            r3.A03(r0, r2, r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0022:
            X.C30691eM.A01(r12)
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.6y1 r1 = (X.C138986y1) r1
            X.77d r0 = r11.$sticker
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x009b
            X.00H r0 = r1.A02
            android.content.SharedPreferences r1 = X.C108995ce.A0F(r0)
            java.lang.String r0 = "pref_key_avatar_soc_warning_shown"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x009b
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.6y1 r0 = (X.C138986y1) r0
            X.0ve r5 = r0.A00
            r1 = 7757(0x1e4d, float:1.087E-41)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r7 = X.C18020vd.A01(r0, r5, r1)
            int r0 = X.C108955ca.A05(r7)
            if (r0 == 0) goto L_0x009b
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.1G3 r6 = r0.A0K
            X.00H r1 = r0.A0D
            X.1BI r5 = X.C137836w6.A00(r1)
            X.5zN r1 = new X.5zN
            r1.<init>(r5, r7)
            r11.L$0 = r7
            r11.L$1 = r0
            r11.label = r2
            java.lang.Object r1 = r6.BJt(r1, r11)
            if (r1 != r4) goto L_0x0084
            return r4
        L_0x007d:
            java.lang.Object r0 = r11.L$1
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel) r0
            X.C30691eM.A01(r12)
        L_0x0084:
            X.00H r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.6y1 r0 = (X.C138986y1) r0
            X.00H r0 = r0.A02
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_key_avatar_soc_warning_shown"
            X.C17880vN.A1F(r1, r0, r2)
        L_0x009b:
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.00H r0 = r0.A0G
            java.lang.Object r1 = r0.get()
            X.6yO r1 = (X.C139196yO) r1
            X.77d r0 = r11.$sticker
            X.77d r7 = r1.A01(r0)
            if (r7 == 0) goto L_0x000f
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r11.this$0
            X.1G3 r1 = r0.A0K
            java.lang.Integer r8 = r11.$stickerSendOrigin
            int r9 = r11.$position
            X.00H r0 = r0.A0D
            X.1BI r6 = X.C137836w6.A00(r0)
            r0 = 0
            r10 = 0
            X.5zP r5 = new X.5zP
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r3
            java.lang.Object r0 = r1.BJt(r5, r11)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$onStickerSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$onStickerSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
