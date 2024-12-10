package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public final class D1W implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BbE, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = DJ0.A0D(parcel, readInt);
                    break;
                case 3:
                    d = C26300CxD.A00(parcel, readInt);
                    break;
                case 4:
                    f = C26300CxD.A01(parcel, readInt);
                    break;
                case 5:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 7:
                    f2 = C26300CxD.A01(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 10:
                    arrayList = C26300CxD.A0G(parcel, Bc5.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A05 = latLng;
        obj.A00 = d;
        obj.A01 = f;
        obj.A03 = i;
        obj.A04 = i2;
        obj.A02 = f2;
        obj.A07 = z;
        obj.A08 = z2;
        obj.A06 = arrayList;
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23099BbE[i];
    }
}
