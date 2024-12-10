package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* renamed from: X.8Gt  reason: invalid class name and case insensitive filesystem */
public class C161628Gt extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(2);
    public Set A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00.size());
        Set set = this.A00;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }
}
