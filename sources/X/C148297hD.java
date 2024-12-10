package X;

import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel;

/* renamed from: X.7hD  reason: invalid class name and case insensitive filesystem */
public final class C148297hD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AvatarCoinFlipProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148297hD(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel) {
        super(0);
        this.this$0 = avatarCoinFlipProfilePhotoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = this.this$0;
        C17880vN.A0V(avatarCoinFlipProfilePhotoViewModel.A06).registerObserver(avatarCoinFlipProfilePhotoViewModel.A01);
        AvatarCoinFlipProfilePhotoViewModel.A04(avatarCoinFlipProfilePhotoViewModel);
        if (C108975cc.A1I(avatarCoinFlipProfilePhotoViewModel.A05)) {
            AvatarCoinFlipProfilePhotoViewModel.A05(avatarCoinFlipProfilePhotoViewModel, "profile_photo_tool", 0, false);
        } else {
            avatarCoinFlipProfilePhotoViewModel.A04.A0F(C122486Qo.AVATAR_EDITOR);
        }
        return this.this$0.A00;
    }
}
