package X;

import android.net.Uri;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.CYp  reason: case insensitive filesystem */
public abstract class C25116CYp {
    public final Uri A00;
    public final List A01;
    public final List A02;
    @Deprecated
    public final List A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25116CYp)) {
            return false;
        }
        C25116CYp cYp = (C25116CYp) obj;
        return this.A00.equals(cYp.A00) && this.A01.equals(cYp.A01) && this.A02.equals(cYp.A02);
    }

    public int hashCode() {
        return (BE6.A06(AnonymousClass000.A0L(this.A00) * 31 * 31 * 31, this.A01.hashCode()) + this.A02.hashCode()) * 31;
    }

    public C25116CYp(Uri uri, List list, List list2) {
        this.A00 = uri;
        this.A01 = list;
        this.A02 = list2;
        LinkedList A14 = AnonymousClass8BR.A14();
        if (0 < list2.size()) {
            list2.get(0);
            throw AnonymousClass000.A0s("buildUpon");
        } else {
            this.A03 = C17880vN.A10(A14);
        }
    }
}
