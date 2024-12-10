package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class D3K implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(41);
    public CharSequence A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.A00, parcel, 0);
    }
}
