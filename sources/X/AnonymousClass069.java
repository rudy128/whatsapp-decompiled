package X;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.069  reason: invalid class name */
public class AnonymousClass069 extends AnonymousClass0Bh implements ActionProvider.VisibilityListener {
    public AnonymousClass3KZ A00;
    public final /* synthetic */ AnonymousClass067 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass069(Context context, ActionProvider actionProvider, AnonymousClass067 r3) {
        super(context, actionProvider, r3);
        this.A01 = r3;
    }

    public View A00(MenuItem menuItem) {
        return this.A00.onCreateActionView(menuItem);
    }

    public void A04(AnonymousClass3KZ r2) {
        this.A00 = r2;
        this.A00.setVisibilityListener(this);
    }

    public boolean A06() {
        return this.A00.isVisible();
    }

    public boolean A08() {
        return this.A00.overridesItemVisibility();
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        AnonymousClass3KZ r0 = this.A00;
        if (r0 != null) {
            r0.Bkt();
        }
    }
}
