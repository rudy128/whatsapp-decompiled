package X;

import com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity;
import com.whatsapp.util.Log;

/* renamed from: X.7LB  reason: invalid class name */
public final class AnonymousClass7LB implements AnonymousClass89J {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AvatarEditorLauncherFSActivity A01;
    public final /* synthetic */ C136936ue A02;
    public final /* synthetic */ AnonymousClass70I A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public void onFailure(Exception exc) {
        C18070vi.A0d(exc, 0);
        Log.e("Failed to create an avatar user:", exc);
        AnonymousClass70I r2 = this.A03;
        int i = this.A00;
        r2.A03(i, "user_creation_failed");
        r2.A02(i, AnonymousClass00R.A01);
        AvatarEditorLauncherFSActivity avatarEditorLauncherFSActivity = this.A01;
        C136936ue r4 = this.A02;
        C18070vi.A0b(r4);
        r4.A04(C17880vN.A0h(), exc.getMessage(), 7, this.A05);
        avatarEditorLauncherFSActivity.CEx();
        avatarEditorLauncherFSActivity.CMx((Integer) null, 2131886840, (Integer) null, (Integer) null, (Integer) null, "launcher_error_dialog_tag", (String) null, (Object[]) null);
        Log.e("AvatarEditorLauncher/unable to load avatar", exc);
    }

    public AnonymousClass7LB(AvatarEditorLauncherFSActivity avatarEditorLauncherFSActivity, C136936ue r2, AnonymousClass70I r3, String str, int i, boolean z) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = avatarEditorLauncherFSActivity;
        this.A04 = str;
        this.A05 = z;
        this.A02 = r2;
    }

    public void onSuccess() {
        AnonymousClass70I r1 = this.A03;
        int i = this.A00;
        r1.A03(i, "user_created");
        AvatarEditorLauncherFSActivity.A0c(this.A01, this.A04, i, this.A05);
    }
}
