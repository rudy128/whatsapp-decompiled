package X;

import com.whatsapp.account.remove.RemoveAccountActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Acx  reason: case insensitive filesystem */
public final class C21005Acx implements C22523BBg {
    public final /* synthetic */ RemoveAccountActivity A00;

    public C21005Acx(RemoveAccountActivity removeAccountActivity) {
        this.A00 = removeAccountActivity;
    }

    public void Bti() {
        RemoveAccountActivity removeAccountActivity = this.A00;
        AnonymousClass00H r0 = removeAccountActivity.A07;
        if (r0 != null) {
            C17880vN.A0d(r0).A00(new C70613Bu(removeAccountActivity, 19));
        } else {
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
    }

    public void onSuccess() {
        Log.i("RemoveAccountActivity/startRemoveAccount/launch switch and remove activity");
        RemoveAccountActivity removeAccountActivity = this.A00;
        removeAccountActivity.A05.CGv(new C70613Bu(removeAccountActivity, 21), TimeUnit.SECONDS.toMillis(2));
    }
}
