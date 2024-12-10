package X;

import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.7xV  reason: invalid class name */
public final class AnonymousClass7xV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7xV(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C18070vi.A0d(obj, 0);
        if (obj.equals(C115365tt.A00)) {
            AvatarHomeActivity avatarHomeActivity = this.this$0;
            if (C72453Mb.A1a(avatarHomeActivity.A0P)) {
                str = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity";
            } else {
                str = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity";
            }
            avatarHomeActivity.startActivity(C72473Md.A0B(avatarHomeActivity, str));
        } else if (obj.equals(C115355ts.A00)) {
            AvatarHomeActivity avatarHomeActivity2 = this.this$0;
            AnonymousClass00H r0 = avatarHomeActivity2.A0L;
            if (r0 != null) {
                ((AnonymousClass73V) C18070vi.A0E(r0)).A04(avatarHomeActivity2, "avatar_home", (String) null);
            } else {
                C18070vi.A11("avatarEditorLauncher");
                throw null;
            }
        } else if (obj.equals(C115375tu.A00)) {
            AvatarHomeActivity avatarHomeActivity3 = this.this$0;
            avatarHomeActivity3.startActivity(AnonymousClass1LU.A0W(avatarHomeActivity3, AnonymousClass6RG.AVATAR_EDITOR, "meta-avatar", (String) null));
        } else if (obj.equals(C115385tv.A00)) {
            AnonymousClass4HO.A00(this.this$0);
        }
        return C27621Wu.A00;
    }
}
