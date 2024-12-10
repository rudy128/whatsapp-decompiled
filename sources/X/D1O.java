package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

public final class D1O implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.location.LocationRequest, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (true) {
            int i3 = A02;
            if (parcel2.dataPosition() < i3) {
                int readInt = parcel2.readInt();
                switch ((char) readInt) {
                    case 1:
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 2:
                        j = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 3:
                        j2 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 4:
                        z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 5:
                        j3 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 6:
                        i2 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 7:
                        f = C26300CxD.A01(parcel2, readInt);
                        break;
                    case 8:
                        j4 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 9:
                        z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i3);
                ? obj = new Object();
                obj.A01 = i;
                obj.A03 = j;
                obj.A04 = j2;
                obj.A07 = z;
                obj.A05 = j3;
                obj.A02 = i2;
                obj.A00 = f;
                obj.A06 = j4;
                obj.A08 = z2;
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
