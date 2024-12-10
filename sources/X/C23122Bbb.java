package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.Bbb  reason: case insensitive filesystem */
public final class C23122Bbb extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C23122Bbb) {
            List list = this.A00;
            List list2 = ((C23122Bbb) obj).A00;
            if (!list.containsAll(list2) || !list2.containsAll(list)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0C(parcel, list, 1, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23122Bbb(List list) {
        C18210vx.A00(list);
        this.A00 = list;
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(AnonymousClass8BR.A12(this.A00), AnonymousClass3MW.A1a(), 0);
    }
}
