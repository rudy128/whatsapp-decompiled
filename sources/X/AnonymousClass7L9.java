package X;

import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.7L9  reason: invalid class name */
public class AnonymousClass7L9 implements AnonymousClass89J {
    public final int A00;
    public final Object A01;

    public AnonymousClass7L9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFailure(Exception exc) {
        if (this.A00 != 0) {
            C18070vi.A0d(exc, 0);
            Log.e("AvatarUserManagementHelper/generateTokenAfterMigration failed", exc);
            return;
        }
        Log.i("onConfirmDeleteAvatarClicked/error");
        ((AvatarHomeViewModel) this.A01).A00.A0E(new C115415ty(C115345tr.A00, false, true, false));
    }

    public void onSuccess() {
        if (this.A00 != 0) {
            C136796uQ r3 = (C136796uQ) this.A01;
            r3.A00.A0J(new C146757Qm((Object) r3, 17));
            return;
        }
        Log.i("onConfirmDeleteAvatarClicked/success");
        ((AvatarHomeViewModel) this.A01).A00.A0E(new C115405tx(true));
    }
}
