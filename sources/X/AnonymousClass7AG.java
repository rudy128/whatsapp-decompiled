package X;

import android.content.DialogInterface;
import com.whatsapp.userban.ui.BanAppealActivity;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

/* renamed from: X.7AG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7AG implements C22851Dl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BanAppealActivity A01;

    public final void Bo9(Object obj) {
        BanAppealViewModel banAppealViewModel;
        boolean z;
        BanAppealActivity banAppealActivity = this.A01;
        int i = this.A00;
        ((DialogInterface) obj).dismiss();
        if (i == -2) {
            banAppealViewModel = banAppealActivity.A00;
            z = true;
        } else if (i == 3) {
            banAppealViewModel = banAppealActivity.A00;
            z = false;
        } else if (i == 4) {
            C132896np r1 = banAppealActivity.A00.A03.A00;
            C18070vi.A0d("blocked_ban_appeals", 1);
            banAppealActivity.startActivity(C109005cf.A07(r1.A00.A00, "blocked_ban_appeals", (String) null));
            return;
        } else {
            return;
        }
        banAppealViewModel.A0W(banAppealActivity, z);
    }

    public /* synthetic */ AnonymousClass7AG(BanAppealActivity banAppealActivity, int i) {
        this.A01 = banAppealActivity;
        this.A00 = i;
    }
}
