package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.6Nq  reason: invalid class name */
public final class AnonymousClass6Nq extends C115075tM {
    public final C133976po A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Nq(C18000vb r2, WaBloksActivity waBloksActivity, C133976po r4) {
        super(r2, waBloksActivity);
        C18070vi.A0d(r4, 3);
        this.A00 = r4;
    }

    public void A03(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        C115075tM.A00(this);
        if (intent != null) {
            this.A00.A01(this.A03, this.A00, new AnonymousClass7OZ(this, 1), intent.getStringExtra("fds_on_back"), intent.getStringExtra("fds_on_back_params"), intent.getStringExtra("fds_button_style"));
        }
    }

    public void A04(AnonymousClass86W r2) {
        this.A01 = C108985cd.A0k(r2);
        C115075tM.A00(this);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C18070vi.A0h(activity, bundle);
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }
}
