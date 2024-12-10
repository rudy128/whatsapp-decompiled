package X;

import android.app.Activity;

/* renamed from: X.41J  reason: invalid class name */
public abstract class AnonymousClass41J extends AnonymousClass3OH {
    public Activity A00;
    public AnonymousClass1GV A01;
    public AnonymousClass00H A02;

    public abstract void A06(boolean z);

    public final void setSplitWindowManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final Activity getActivity() {
        return this.A00;
    }

    public final AnonymousClass00H getSplitWindowManager() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("splitWindowManager");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass3MX.A0j(getSplitWindowManager()).A05(this.A01);
    }

    public final void setActivity(Activity activity) {
        this.A00 = activity;
    }
}
