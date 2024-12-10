package X;

import android.os.Parcelable;
import java.util.List;

/* renamed from: X.8pc  reason: invalid class name and case insensitive filesystem */
public final class C170288pc extends AnonymousClass8pG {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public String A01;

    public String A04() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A07(List list) {
        C18070vi.A0d(list, 1);
        String str = this.A01;
        if (str != null) {
            AnonymousClass8BT.A1S("psp_transaction_id", str, list);
        }
    }

    public void A05(AnonymousClass1KI r2, C29621ca r3, int i) {
        String A02;
        if (r3 != null && (A02 = C29621ca.A02(r3, "psp_transaction_id")) != null) {
            this.A01 = A02;
        }
    }
}
