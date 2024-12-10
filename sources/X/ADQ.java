package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ADQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final List A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0r = C108985cd.A0r(parcel, list);
        while (A0r.hasNext()) {
            ((C20265ADx) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public final C20264ADw A00() {
        List<C20264ADw> list;
        ARR arr;
        List list2 = this.A01;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        } else {
            list = ((C20265ADx) C108955ca.A0p(C21486Akr.A00(list2, 40))).A01;
        }
        if (list != null && !list.isEmpty()) {
            int A08 = C108955ca.A08(list, this.A00);
            for (C20264ADw aDw : list) {
                if (A08 == aDw.A00 && (arr = aDw.A01) != null && arr.A02 != null) {
                    return aDw;
                }
            }
        }
        return null;
    }

    public ADQ(int i, List list, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = list;
    }
}
