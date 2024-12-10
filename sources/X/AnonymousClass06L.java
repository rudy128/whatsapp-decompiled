package X;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: X.06L  reason: invalid class name */
public class AnonymousClass06L extends AnonymousClass0Rj {
    public final /* synthetic */ ActionMenuItemView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06L(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.A00 = actionMenuItemView;
    }

    public AnonymousClass0t8 A01() {
        C02060Co r0 = this.A00.A00;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public boolean A03() {
        AnonymousClass0t8 A01;
        ActionMenuItemView actionMenuItemView = this.A00;
        C004501y r2 = actionMenuItemView.A01;
        if (r2 == null || !r2.Bdt(actionMenuItemView.A02) || (A01 = A01()) == null || !A01.BgV()) {
            return false;
        }
        return true;
    }
}
