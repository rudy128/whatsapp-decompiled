package X;

import android.view.MenuItem;
import com.whatsapp.HomeActivity;

/* renamed from: X.1bg  reason: invalid class name and case insensitive filesystem */
public class C29141bg implements AnonymousClass01U {
    public final /* synthetic */ C28941bJ A00;

    public void ByF(C003301m r1) {
    }

    public C29141bg(C28941bJ r1) {
        this.A00 = r1;
    }

    public boolean ByE(MenuItem menuItem, C003301m r7) {
        C28941bJ r2 = this.A00;
        if (r2.A00 == null || menuItem.getItemId() != r2.A04.A0A) {
            C23591Gw r0 = r2.A01;
            if (r0 == null) {
                return false;
            }
            HomeActivity homeActivity = ((C23601Gx) r0).A00;
            homeActivity.A00 = menuItem.getItemId();
            homeActivity.A0a.A0J(HomeActivity.A0c(menuItem.getItemId()), false);
            homeActivity.A4h();
            homeActivity.A05.A00.A1w("bottom_nav_tooltip_seen", true);
            C28931bI r1 = homeActivity.A0y;
            if (r1 == null) {
                return false;
            }
            r1.A04(8);
            return false;
        }
        ((AnonymousClass1H1) r2.A00).A00.A0a.setCurrentItem(HomeActivity.A0c(menuItem.getItemId()));
        return true;
    }
}
