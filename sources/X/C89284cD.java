package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.4cD  reason: invalid class name and case insensitive filesystem */
public final class C89284cD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringList(this.A00);
    }

    public C89284cD(List list, boolean z) {
        this.A01 = z;
        this.A00 = list;
    }
}
