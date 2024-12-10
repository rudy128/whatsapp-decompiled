package X;

import android.os.Parcel;

public final class BL0 extends C27741Xj {
    public static final C26405Cz6 CREATOR = new Object();
    public int A00;

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
