package X;

import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.8pP  reason: invalid class name */
public final class AnonymousClass8pP extends C20284AEs {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public LinkedHashSet A01;
    public AnonymousClass1KN A02;

    public int describeContents() {
        return 0;
    }

    public final AnonymousClass1KN A0C() {
        AnonymousClass1KN r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("balance");
        throw null;
    }

    public final void A0D(C63572tK r5, BigDecimal bigDecimal) {
        AnonymousClass1KJ r1;
        if (bigDecimal != null) {
            LinkedHashSet linkedHashSet = r5.A05;
            LinkedHashSet linkedHashSet2 = this.A01;
            if (linkedHashSet2 != null) {
                Iterator it = linkedHashSet2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r1 = (AnonymousClass1KJ) it.next();
                    if (linkedHashSet.contains(r1)) {
                        C18070vi.A0b(r1);
                        break;
                    }
                }
                this.A02 = AnonymousClass8BU.A0H(r1, bigDecimal);
            }
            r1 = AnonymousClass1KL.A0C;
            this.A02 = AnonymousClass8BU.A0H(r1, bigDecimal);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ WALLET: ");
        A10.append(super.toString());
        A10.append(" balance: ");
        A10.append(A0C());
        return AnonymousClass000.A0y(" ]", A10);
    }
}
