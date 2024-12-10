package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cg  reason: invalid class name and case insensitive filesystem */
public final class C29671cg extends C29661cf implements Parcelable {
    public static final C29671cg A00 = new C29671cg();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public C29671cg() {
        super("status");
    }

    public String getServer() {
        return "broadcast";
    }
}
