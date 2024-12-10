package X;

import com.whatsapp.base.WDSSearchViewFragment;

/* renamed from: X.6Pm  reason: invalid class name */
public final class AnonymousClass6Pm extends C89574cg {
    public final /* synthetic */ WDSSearchViewFragment A00;

    public AnonymousClass6Pm(WDSSearchViewFragment wDSSearchViewFragment) {
        this.A00 = wDSSearchViewFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C111075i9 r2 = this.A00.A01;
        if (r2 != null) {
            String valueOf = String.valueOf(charSequence);
            C18070vi.A0d(valueOf, 0);
            r2.A00.A0F(valueOf);
        }
    }
}
