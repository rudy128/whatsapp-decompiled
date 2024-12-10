package X;

import android.view.View;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.5u0  reason: invalid class name and case insensitive filesystem */
public final class C115435u0 extends C112785m2 {
    public final AvatarProfilePhotoImageView A00;
    public final float A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115435u0(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = (AvatarProfilePhotoImageView) view;
        this.A01 = view.getResources().getDimension(2131165423);
    }

    public static final void A00(C115435u0 r3, int i, boolean z) {
        C122406Qd r2;
        if (z) {
            r2 = C122406Qd.SELECTED;
        } else if (!z) {
            r2 = C122406Qd.IDLE;
        } else {
            throw AnonymousClass3MW.A14();
        }
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = r3.A00;
        avatarProfilePhotoImageView.setSelected(z);
        avatarProfilePhotoImageView.A06(r2, r3.A01, i);
    }
}
