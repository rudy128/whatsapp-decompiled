package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3", f = "AvatarStickerUpsellViewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $hasAvatarConfig;
    public int label;
    public final /* synthetic */ AvatarStickerUpsellViewController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(AvatarStickerUpsellViewController avatarStickerUpsellViewController, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = avatarStickerUpsellViewController;
        this.$hasAvatarConfig = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(this.this$0, r5, this.$hasAvatarConfig);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.setVisibility(C72453Mb.A01(this.$hasAvatarConfig ? 1 : 0));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
