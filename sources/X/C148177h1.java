package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.7h1  reason: invalid class name and case insensitive filesystem */
public final class C148177h1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148177h1(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(0);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view = this.this$0.A02;
        if (view != null) {
            int width = view.getWidth();
            View view2 = this.this$0.A02;
            if (view2 != null) {
                int height = view2.getHeight();
                if (width >= height) {
                    width = height;
                }
                int i = (int) (((double) width) * 0.65d);
                AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.this$0.A07;
                if (avatarProfilePhotoImageView != null) {
                    ViewGroup.LayoutParams layoutParams = avatarProfilePhotoImageView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i;
                        layoutParams.height = i;
                    } else {
                        layoutParams = null;
                    }
                    avatarProfilePhotoImageView.setLayoutParams(layoutParams);
                }
            }
        }
        return C27621Wu.A00;
    }
}
