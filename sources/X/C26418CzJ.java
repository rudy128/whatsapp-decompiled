package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.CzJ  reason: case insensitive filesystem */
public final class C26418CzJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList = C26300CxD.A0F(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = C26300CxD.A0F(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = C26300CxD.A0F(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = C26300CxD.A0F(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = C26300CxD.A0F(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23256Be6(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23256Be6[i];
    }
}
