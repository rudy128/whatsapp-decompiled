package X;

import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.1ku  reason: invalid class name and case insensitive filesystem */
public final class C34681ku implements C23501Gn {
    public final /* synthetic */ UpdatesFragment A00;

    public C34681ku(UpdatesFragment updatesFragment) {
        this.A00 = updatesFragment;
    }

    private final void A00() {
        Integer num;
        int i;
        UpdatesFragment updatesFragment = this.A00;
        AnonymousClass00H r0 = updatesFragment.A0v;
        if (r0 != null) {
            r0.get();
            if (AnonymousClass11Z.A00()) {
                num = 2131894959;
                i = 2131894957;
            } else {
                num = 2131894960;
                i = 2131894958;
            }
            Integer valueOf = Integer.valueOf(i);
            UpdatesFragment.A09(updatesFragment, new Object[0], num.intValue(), valueOf.intValue());
            return;
        }
        C18070vi.A11("storageUtilsLazy");
        throw null;
    }

    public void C2W() {
        UpdatesFragment.A09(this.A00, new Object[0], 2131886637, 2131894421);
    }

    public void C9S() {
        UpdatesFragment.A09(this.A00, new Object[0], 2131886637, 2131894421);
    }

    public void C2V() {
        A00();
    }

    public void C9R() {
        A00();
    }
}
