package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellView;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellViewController;

/* renamed from: X.7ur  reason: invalid class name and case insensitive filesystem */
public final class C156747ur extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarSquidUpsellView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156747ur(Context context, AvatarSquidUpsellView avatarSquidUpsellView) {
        super(0);
        this.$context = context;
        this.this$0 = avatarSquidUpsellView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Activity A00 = AnonymousClass1L9.A00(this.$context);
        AvatarSquidUpsellView avatarSquidUpsellView = this.this$0;
        C18600wl mainDispatcher = avatarSquidUpsellView.getMainDispatcher();
        return new AvatarSquidUpsellViewController(A00, avatarSquidUpsellView, this.this$0.getAvatarSharedPreferences(), this.this$0.getAvatarEditorLauncher(), this.this$0.getAvatarSquidConfiguration(), mainDispatcher);
    }
}
