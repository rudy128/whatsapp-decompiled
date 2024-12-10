package X;

import com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7xk  reason: invalid class name and case insensitive filesystem */
public final class C157587xk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarCoinFlipProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157587xk(AvatarCoinFlipProfilePhotoActivity avatarCoinFlipProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarCoinFlipProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        UserJid userJid;
        C122486Qo r5 = (C122486Qo) obj;
        if (r5 != null) {
            int ordinal = r5.ordinal();
            if (ordinal == 0) {
                AvatarCoinFlipProfilePhotoActivity avatarCoinFlipProfilePhotoActivity = this.this$0;
                AnonymousClass00H r0 = avatarCoinFlipProfilePhotoActivity.A06;
                if (r0 != null) {
                    ((AnonymousClass73V) C18070vi.A0E(r0)).A04(avatarCoinFlipProfilePhotoActivity, "avatar_profile_photo_tool", (String) null);
                } else {
                    str = "avatarEditorLauncher";
                }
            } else if (ordinal == 1) {
                this.this$0.finish();
            } else if (ordinal == 2) {
                AvatarCoinFlipProfilePhotoActivity avatarCoinFlipProfilePhotoActivity2 = this.this$0;
                AnonymousClass11S r02 = avatarCoinFlipProfilePhotoActivity2.A02;
                r02.A0I();
                AnonymousClass1E8 r03 = r02.A0D;
                if (!(r03 == null || (userJid = (UserJid) r03.A0J) == null)) {
                    AnonymousClass00H r04 = avatarCoinFlipProfilePhotoActivity2.A07;
                    if (r04 != null) {
                        C108955ca.A1S(r04);
                        avatarCoinFlipProfilePhotoActivity2.startActivity(AnonymousClass1LU.A1F(avatarCoinFlipProfilePhotoActivity2, userJid, true, false));
                    } else {
                        str = "waIntents";
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
