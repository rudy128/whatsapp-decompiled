package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.7xg  reason: invalid class name and case insensitive filesystem */
public final class C157547xg extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157547xg(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122416Qe r5 = (C122416Qe) obj;
        if (r5 != null) {
            int ordinal = r5.ordinal();
            if (ordinal == 0) {
                AvatarProfilePhotoActivity avatarProfilePhotoActivity = this.this$0;
                AnonymousClass00H r0 = avatarProfilePhotoActivity.A09;
                if (r0 != null) {
                    ((AnonymousClass73V) C18070vi.A0E(r0)).A04(avatarProfilePhotoActivity, "avatar_profile_photo_tool", (String) null);
                } else {
                    C18070vi.A11("avatarEditorLauncher");
                    throw null;
                }
            } else if (ordinal == 1) {
                this.this$0.finish();
            }
        }
        return C27621Wu.A00;
    }
}
