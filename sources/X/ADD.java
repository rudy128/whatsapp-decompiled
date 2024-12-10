package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ADD) && C18070vi.A18(((ADD) obj).A00, this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        return this.A00;
    }
}
