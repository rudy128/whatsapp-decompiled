package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.6Np  reason: invalid class name */
public abstract class AnonymousClass6Np extends C115075tM {
    public AnonymousClass86X A00;

    public void A03(Intent intent, Bundle bundle) {
        if (intent != null) {
            this.A01 = intent.getStringExtra("bk_phoenix_navbar_title");
            intent.getStringExtra("bk_phoenix_navbar_leading_button_icon");
        }
        A05();
    }

    public void A04(AnonymousClass86W r4) {
        try {
            this.A01 = C108985cd.A0k(r4);
            C129406hk r2 = new C129406hk(r4.BM2().A09(40));
            if (AnonymousClass1EG.A0H(this.A01)) {
                this.A01 = r2.A03;
            }
            if (r2.A00 != null) {
                this.A00 = new C143157Cf(r2, 9);
            }
            A05();
        } catch (ClassCastException e) {
            C17900vP.A0X(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A10());
        }
    }

    public void A05() {
        C115075tM.A00(this);
        WaBloksActivity waBloksActivity = this.A03;
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(waBloksActivity, 2131436960);
        C74743cP r0 = new C74743cP(AnonymousClass4aX.A08(C108955ca.A0D(waBloksActivity).getDrawable(2131231675), AnonymousClass3Ma.A01(waBloksActivity, C108955ca.A0D(waBloksActivity), 2130971957, 2131103410)), this.A02);
        r0.clearColorFilter();
        toolbar.setNavigationIcon((Drawable) r0);
        toolbar.setBackgroundColor(C108955ca.A0D(waBloksActivity).getColor(C108955ca.A02(waBloksActivity)));
        toolbar.setTitleTextColor(AnonymousClass3Ma.A01(waBloksActivity, C108955ca.A0D(waBloksActivity), 2130971068, 2131102412));
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            Drawable A02 = C27831Xu.A02(overflowIcon);
            C27831Xu.A0C(A02.mutate(), AnonymousClass3Ma.A01(waBloksActivity, C108955ca.A0D(waBloksActivity), 2130971957, 2131103410));
            toolbar.setOverflowIcon(A02);
        }
        C137506vZ.A00(toolbar);
    }
}
