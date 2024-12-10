package X;

import android.net.Uri;

/* renamed from: X.4gt  reason: invalid class name and case insensitive filesystem */
public class C92184gt implements C72433Ly {
    public final int A00;
    public final Object A01;

    public C92184gt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean BE8() {
        if (this.A00 != 0) {
            return true;
        }
        return false;
    }

    public void Bti() {
        if (this.A00 == 0) {
            C26982DOe dOe = (C26982DOe) this.A01;
            dOe.A03.A08(2131896086, 0);
            C26982DOe.A00(dOe, "send_media_failure");
        }
    }

    public void C9g(Uri uri) {
        if (this.A00 != 0) {
            ((AnonymousClass4aY) this.A01).A3H.A01(new C91254fO(1), 107);
        }
    }

    public void C9f(Uri uri) {
    }
}
