package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity;
import com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView;

/* renamed from: X.7hA  reason: invalid class name and case insensitive filesystem */
public final class C148267hA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AvatarCoinFlipProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148267hA(AvatarCoinFlipProfilePhotoActivity avatarCoinFlipProfilePhotoActivity) {
        super(0);
        this.this$0 = avatarCoinFlipProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view = this.this$0.A00;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            int width = view.getWidth();
            View view2 = this.this$0.A00;
            if (view2 != null) {
                int height = view2.getHeight();
                if (width >= height) {
                    width = height;
                }
                int i = (int) (((double) width) * 0.65d);
                AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView = this.this$0.A04;
                if (avatarCoinFlipProfilePhotoImageView == null) {
                    C18070vi.A11("avatarPose");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = avatarCoinFlipProfilePhotoImageView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i;
                    layoutParams2.height = i;
                    layoutParams = layoutParams2;
                }
                avatarCoinFlipProfilePhotoImageView.setLayoutParams(layoutParams);
                return C27621Wu.A00;
            }
        }
        C18070vi.A11("poseLayout");
        throw null;
    }
}
