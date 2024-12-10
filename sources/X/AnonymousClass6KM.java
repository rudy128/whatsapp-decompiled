package X;

import android.view.MenuItem;
import android.view.View;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.6KM  reason: invalid class name */
public final class AnonymousClass6KM extends C113585nK implements C15930rR {
    public final C24641Lc A00;
    public final AnonymousClass1DC A01;
    public final C18100vl A02;
    public final UpdatesFragment A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KM(View view, C18000vb r5, C24641Lc r6, UpdatesFragment updatesFragment, AnonymousClass1DC r8) {
        super(view);
        WDSSectionHeader wDSSectionHeader;
        C72473Md.A1M(r5, r6, r8, 1);
        this.A03 = updatesFragment;
        this.A00 = r6;
        this.A01 = r8;
        this.A02 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass7wE(view, r5, this));
        if ((view instanceof WDSSectionHeader) && (wDSSectionHeader = (WDSSectionHeader) view) != null) {
            wDSSectionHeader.setHeaderText(2131896390);
            AnonymousClass1Y5.A0A(wDSSectionHeader, true);
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (Integer.valueOf(itemId) != null) {
                if (itemId == 2) {
                    this.A03.A2B();
                    return true;
                } else if (itemId == 2131432640) {
                    this.A03.A2E();
                    return true;
                } else if (itemId == 0) {
                    this.A03.C14(11, 59);
                    return true;
                } else if (itemId == 1) {
                    this.A03.C1D();
                    return true;
                } else if (itemId == 2131432531) {
                    this.A03.A2A();
                    return true;
                }
            }
        }
        throw AnonymousClass000.A0n("Could not handle menu item click");
    }
}
