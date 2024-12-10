package X;

import com.whatsapp.avatar.editor.AvatarEditorLauncherActivity;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController;

/* renamed from: X.5s3  reason: invalid class name and case insensitive filesystem */
public abstract class C114825s3 extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AvatarEditorLauncherActivity avatarEditorLauncherActivity = (AvatarEditorLauncherActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, avatarEditorLauncherActivity);
            AnonymousClass1FB.A0M(A0A, avatarEditorLauncherActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, avatarEditorLauncherActivity);
            C109005cf.A0e(A0A, r1, avatarEditorLauncherActivity, r1.A5A);
            avatarEditorLauncherActivity.A03 = C000200d.A00(r4.A09);
            avatarEditorLauncherActivity.A01 = (AvatarPrefetchController) r1.A6M.get();
            avatarEditorLauncherActivity.A02 = (C132586n5) r1.A6N.get();
            avatarEditorLauncherActivity.A00 = (C24997CSx) r1.AFi.get();
        }
    }

    public C114825s3() {
        AnonymousClass79Z.A00(this, 13);
    }
}
