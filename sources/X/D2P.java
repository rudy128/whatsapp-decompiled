package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class D2P implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                uri = (Uri) C26300CxD.A0A(parcel, Uri.CREATOR, readInt);
            } else if (c != 4) {
                bArr = C26300CxD.A0P(parcel, bArr, c, 5, readInt);
            } else {
                bundle = C26300CxD.A08(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23106BbL(uri, bundle, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23106BbL[i];
    }
}
