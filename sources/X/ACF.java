package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACF implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        String A0y = C72453Mb.A0y(parcel);
        if (A0y.equals("NONE")) {
            num = AnonymousClass00R.A00;
        } else if (A0y.equals("ORDER_NOT_FOUND")) {
            num = AnonymousClass00R.A01;
        } else if (A0y.equals("GET_PAYMENT_CONFIG_FAILED")) {
            num = AnonymousClass00R.A0C;
        } else {
            throw AnonymousClass000.A0k(A0y);
        }
        return new C20281AEp(num, parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20281AEp[i];
    }
}
