package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class D2Z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) C26300CxD.A0A(parcel, ConnectionConfiguration.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23059Baa(connectionConfiguration, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23059Baa[i];
    }
}
