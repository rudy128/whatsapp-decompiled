package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uv  reason: invalid class name and case insensitive filesystem */
public final class C64532uv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C64562uy A00;
    public final Integer A01;
    public final String A02;

    public C64532uv(C64562uy r2, Integer num, String str) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = num;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        C64562uy r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r0.writeToParcel(parcel, i);
    }
}
