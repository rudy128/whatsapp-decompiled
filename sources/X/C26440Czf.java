package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: X.Czf  reason: case insensitive filesystem */
public final class C26440Czf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    int A04 = C26300CxD.A04(parcel, readInt);
                    if (A04 != 0) {
                        C26300CxD.A0J(parcel, A04, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    arrayList = C26300CxD.A0F(parcel, readInt);
                    break;
                case 7:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new TokenData(l, str, str2, arrayList, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
