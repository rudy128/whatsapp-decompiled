package X;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;

/* renamed from: X.0Bh  reason: invalid class name */
public abstract class AnonymousClass0Bh extends C60172nV {
    public final ActionProvider A00;
    public final /* synthetic */ AnonymousClass067 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Bh(Context context, ActionProvider actionProvider, AnonymousClass067 r3) {
        super(context);
        this.A01 = r3;
        this.A00 = actionProvider;
    }

    public void A02(SubMenu subMenu) {
        this.A00.onPrepareSubMenu(subMenu);
    }

    public boolean A05() {
        return this.A00.hasSubMenu();
    }

    public boolean A07() {
        return this.A00.onPerformDefaultAction();
    }
}
