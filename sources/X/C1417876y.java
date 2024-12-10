package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.76y  reason: invalid class name and case insensitive filesystem */
public final class C1417876y implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1417876y) && C18070vi.A18(this.A00, ((C1417876y) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0r = C108985cd.A0r(parcel, list);
        while (A0r.hasNext()) {
            ((AnonymousClass777) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C1417876y(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGetProfilePhotoPosesEntity(poses=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
