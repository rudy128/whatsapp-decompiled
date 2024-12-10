package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class D3A implements Parcelable.Creator {
    public static Boolean A00(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, com.google.android.gms.maps.GoogleMapOptions] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    b = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 3:
                    b2 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 4:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C26300CxD.A0A(parcel2, CameraPosition.CREATOR, readInt);
                    break;
                case 6:
                    b3 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 7:
                    b4 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 8:
                    b5 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 9:
                    b6 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 10:
                    b7 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 11:
                    b8 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 12:
                    b9 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 14:
                    b10 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 15:
                    b11 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                case 16:
                    f = C26300CxD.A0C(parcel2, readInt);
                    break;
                case 17:
                    f2 = C26300CxD.A0C(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C26300CxD.A0A(parcel2, LatLngBounds.CREATOR, readInt);
                    break;
                case 19:
                    b12 = (byte) C26300CxD.A03(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        ? obj = new Object();
        obj.A00 = -1;
        obj.A0F = null;
        obj.A0G = null;
        obj.A02 = null;
        obj.A03 = A00(b);
        obj.A04 = A00(b2);
        obj.A00 = i;
        obj.A01 = cameraPosition;
        obj.A05 = A00(b3);
        obj.A06 = A00(b4);
        obj.A07 = A00(b5);
        obj.A08 = A00(b6);
        obj.A09 = A00(b7);
        obj.A0A = A00(b8);
        obj.A0B = A00(b9);
        obj.A0C = A00(b10);
        obj.A0D = A00(b11);
        obj.A0F = f;
        obj.A0G = f2;
        obj.A02 = latLngBounds;
        obj.A0E = A00(b12);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
