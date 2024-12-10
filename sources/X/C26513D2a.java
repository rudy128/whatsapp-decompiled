package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2a  reason: case insensitive filesystem */
public final class C26513D2a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                iBinder = C26300CxD.A09(parcel, readInt);
            } else if (c == 3) {
                intentFilterArr = (IntentFilter[]) C26300CxD.A0R(parcel, IntentFilter.CREATOR, readInt);
            } else if (c != 4) {
                str2 = C26300CxD.A0E(parcel, str2, c, 5, readInt);
            } else {
                str = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23180Bca(iBinder, str, str2, intentFilterArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23180Bca[i];
    }
}
