package X;

import android.view.KeyEvent;

/* renamed from: X.08q  reason: invalid class name and case insensitive filesystem */
public final class C014808q extends AnonymousClass0XW implements C17630uy {
    public C22821Di A00;
    public C22821Di A01;

    public boolean BwR(KeyEvent keyEvent) {
        C22821Di r1 = this.A00;
        if (r1 != null) {
            return AnonymousClass000.A1Y(r1.invoke(new AnonymousClass0NA(keyEvent)));
        }
        return false;
    }

    public boolean C1L(KeyEvent keyEvent) {
        C22821Di r1 = this.A01;
        if (r1 != null) {
            return AnonymousClass000.A1Y(r1.invoke(new AnonymousClass0NA(keyEvent)));
        }
        return false;
    }

    public C014808q(C22821Di r1, C22821Di r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A0N(C22821Di r1) {
        this.A00 = r1;
    }

    public final void A0O(C22821Di r1) {
        this.A01 = r1;
    }
}
