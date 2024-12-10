package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5tM  reason: invalid class name and case insensitive filesystem */
public abstract class C115075tM extends C23701Hh {
    public Toolbar A00;
    public String A01;
    public final C18000vb A02;
    public final WaBloksActivity A03;

    public abstract void A03(Intent intent, Bundle bundle);

    public abstract void A04(AnonymousClass86W r1);

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C74743cP A002;
        boolean z = false;
        C18070vi.A0d(activity, 0);
        WaBloksActivity waBloksActivity = this.A03;
        if (activity == waBloksActivity) {
            z = true;
        }
        C17960vV.A0D(z);
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        Toolbar toolbar = (Toolbar) C110885hR.A0A(waBloksActivity, 2131436960);
        this.A00 = toolbar;
        if (toolbar != null) {
            toolbar.setTitle((CharSequence) "");
        }
        Toolbar toolbar2 = this.A00;
        if (toolbar2 != null) {
            toolbar2.A0L();
        }
        waBloksActivity.setSupportActionBar(toolbar2);
        A02().A0W(true);
        Toolbar toolbar3 = this.A00;
        if (toolbar3 != null) {
            if (this instanceof AnonymousClass6Nq) {
                A002 = ((AnonymousClass6Nq) this).A00.A00();
            } else {
                A002 = AnonymousClass3NL.A00(waBloksActivity, this.A02, 2131231675);
                A002.setColorFilter(AnonymousClass3Ma.A01(activity, C108955ca.A0D(waBloksActivity), 2130971620, 2131102722), PorterDuff.Mode.SRC_ATOP);
            }
            toolbar3.setNavigationIcon((Drawable) A002);
            C72463Mc.A0x(toolbar3.getContext(), toolbar3.getResources(), toolbar3, 2130971792, 2131102910);
            toolbar3.setNavigationOnClickListener(new AnonymousClass785(activity, 4));
        }
        A03(activity.getIntent(), bundle);
    }

    public final C003401n A02() {
        C003401n A0J = AnonymousClass3MY.A0J(this.A03);
        C18070vi.A0X(A0J);
        return A0J;
    }

    public C115075tM(C18000vb r1, WaBloksActivity waBloksActivity) {
        this.A02 = r1;
        this.A03 = waBloksActivity;
    }

    public static void A00(C115075tM r2) {
        r2.A02().A0S(r2.A01);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C18070vi.A0h(activity, bundle);
        bundle.putString("bk_navigation_bar_title", this.A01);
    }
}
