package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.WaImageButton;

/* renamed from: X.4fS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91294fS implements AnonymousClass1GV {
    public final /* synthetic */ Menu A00;
    public final /* synthetic */ MenuItem A01;
    public final /* synthetic */ WaImageButton A02;
    public final /* synthetic */ C77843ra A03;

    public final void accept(Object obj) {
        C77843ra r3 = this.A03;
        Menu menu = this.A00;
        WaImageButton waImageButton = this.A02;
        MenuItem menuItem = this.A01;
        AnonymousClass1E7 r5 = (AnonymousClass1E7) obj;
        if (r5 == null) {
            menu.removeItem(32);
            return;
        }
        C77843ra.A06(waImageButton, r3, r5);
        r3.A0I(menuItem, 2131886300, true);
    }

    public /* synthetic */ C91294fS(Menu menu, MenuItem menuItem, WaImageButton waImageButton, C77843ra r4) {
        this.A03 = r4;
        this.A00 = menu;
        this.A02 = waImageButton;
        this.A01 = menuItem;
    }
}
