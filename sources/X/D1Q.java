package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1Q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = "";
        String str2 = str;
        String str3 = str;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str2 = C26300CxD.A0D(parcel, readInt);
            } else if (c != 2) {
                str = C26300CxD.A0E(parcel, str, c, 5, readInt);
            } else {
                str3 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23071Bam(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23071Bam[i];
    }
}
