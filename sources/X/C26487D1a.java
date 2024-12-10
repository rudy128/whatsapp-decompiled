package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.D1a  reason: case insensitive filesystem */
public final class C26487D1a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.BbF] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        CLL cll;
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = DJ0.A0D(parcel2, readInt);
                    break;
                case 3:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 4:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C26300CxD.A09(parcel2, readInt);
                    break;
                case 6:
                    f = C26300CxD.A01(parcel2, readInt);
                    break;
                case 7:
                    f2 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 10:
                    z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 11:
                    f3 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 12:
                    f4 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 13:
                    f5 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 14:
                    f6 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 15:
                    f7 = C26300CxD.A01(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        ? obj = new Object();
        obj.A00 = 0.5f;
        obj.A01 = 1.0f;
        obj.A0C = true;
        obj.A0D = false;
        obj.A02 = 0.0f;
        obj.A03 = 0.5f;
        obj.A04 = 0.0f;
        obj.A05 = 1.0f;
        obj.A08 = latLng;
        obj.A09 = str;
        obj.A0A = str2;
        if (iBinder == null) {
            cll = null;
        } else {
            cll = new CLL(C23331BfJ.A01(iBinder));
        }
        obj.A07 = cll;
        obj.A00 = f;
        obj.A01 = f2;
        obj.A0B = z;
        obj.A0C = z2;
        obj.A0D = z3;
        obj.A02 = f3;
        obj.A03 = f4;
        obj.A04 = f5;
        obj.A05 = f6;
        obj.A06 = f7;
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23100BbF[i];
    }
}
