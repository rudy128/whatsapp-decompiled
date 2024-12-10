package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;

/* renamed from: X.7us  reason: invalid class name and case insensitive filesystem */
public final class C156757us extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarStickerUpsellView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156757us(Context context, AvatarStickerUpsellView avatarStickerUpsellView) {
        super(0);
        this.$context = context;
        this.this$0 = avatarStickerUpsellView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Activity A00 = AnonymousClass1L9.A00(this.$context);
        C27031Ul A0o = C108945cZ.A0o(this.this$0.getAvatarSharedPreferences());
        AnonymousClass73V r5 = (AnonymousClass73V) this.this$0.getAvatarEditorLauncher().get();
        C136936ue A0p = C108945cZ.A0p(this.this$0.getAvatarLogger());
        C27021Uk r3 = (C27021Uk) this.this$0.getAvatarConfigRepository().get();
        C18600wl mainDispatcher = this.this$0.getMainDispatcher();
        AvatarStickerUpsellView avatarStickerUpsellView = this.this$0;
        C108995ce.A1H(A0p, r3, A0o, r5);
        return new AvatarStickerUpsellViewController(A00, avatarStickerUpsellView, r3, A0o, r5, A0p, mainDispatcher);
    }
}
