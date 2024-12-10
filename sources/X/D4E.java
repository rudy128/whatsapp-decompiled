package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public final class D4E implements Parcelable, ECW {
    public static final C26416CzH CREATOR = new Object();
    public final Map A00;

    public D4E(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeMap(this.A00);
    }

    public C72023Ki BGC() {
        return new DG2(this.A00);
    }
}
