package X;

import com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.6Nb  reason: invalid class name */
public abstract class AnonymousClass6Nb extends WaBloksActivity {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AvatarEditorLauncherFSActivity avatarEditorLauncherFSActivity = (AvatarEditorLauncherFSActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, avatarEditorLauncherFSActivity);
            AnonymousClass1FB.A0M(A0A, avatarEditorLauncherFSActivity);
            AnonymousClass10G r2 = A0A.A00;
            C109005cf.A0d(A0A, r2, avatarEditorLauncherFSActivity);
            C109005cf.A0e(A0A, r2, avatarEditorLauncherFSActivity, r2.A5A);
            C114935sU.A03(r4, A0A, r2, avatarEditorLauncherFSActivity);
            avatarEditorLauncherFSActivity.A08 = A0A.A0R;
            avatarEditorLauncherFSActivity.A01 = (C125546bF) r4.A08.get();
            avatarEditorLauncherFSActivity.A05 = C000200d.A00(r2.AFj);
            avatarEditorLauncherFSActivity.A06 = C000200d.A00(A0A.ADn);
            avatarEditorLauncherFSActivity.A09 = A0A.A0V;
            avatarEditorLauncherFSActivity.A07 = C000200d.A00(A0A.ADu);
            avatarEditorLauncherFSActivity.A02 = (AvatarPrefetchController) r2.A6M.get();
            avatarEditorLauncherFSActivity.A03 = (C132586n5) r2.A6N.get();
            avatarEditorLauncherFSActivity.A0A = A0A.A0W;
            avatarEditorLauncherFSActivity.A00 = (C24997CSx) r2.AFi.get();
            avatarEditorLauncherFSActivity.A0B = C27011Uj.A00();
        }
    }

    public AnonymousClass6Nb() {
        AnonymousClass79Z.A00(this, 14);
    }
}
