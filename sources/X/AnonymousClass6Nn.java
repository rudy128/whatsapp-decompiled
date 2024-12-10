package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.6Nn  reason: invalid class name */
public final class AnonymousClass6Nn extends AnonymousClass6No {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        super.onActivityCreated(activity, bundle);
        C28281Zt.A05(activity, AnonymousClass4Z9.A01(activity, false));
        WaBloksActivity waBloksActivity = this.A03;
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(waBloksActivity, 2131436960);
        C74743cP A00 = AnonymousClass3NL.A00(waBloksActivity, this.A02, 2131231675);
        A00.setColorFilter(AnonymousClass3Ma.A00(activity, 2130971957, 2131103410), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) A00);
        toolbar.setTitleTextColor(AnonymousClass3Ma.A00(activity, 2130971068, 2131102412));
        AnonymousClass3MX.A1A(activity, toolbar, AnonymousClass4Z9.A01(activity, false));
    }

    public void A03(Intent intent, Bundle bundle) {
        C115075tM.A00(this);
        C115075tM.A00(this);
    }

    public void A04(AnonymousClass86W r2) {
        super.A04(r2);
        this.A01 = C108985cd.A0k(r2);
        C115075tM.A00(this);
    }
}
