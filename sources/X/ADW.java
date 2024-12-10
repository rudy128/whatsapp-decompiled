package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ADW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ADW) && C18070vi.A18(this.A00, ((ADW) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0r = C108985cd.A0r(parcel, list);
        while (A0r.hasNext()) {
            ((C20256ADo) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public ADW(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVariantAvailability(listings=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
