package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class D16 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.Bbw] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        C23181Bcb bcb = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = -1;
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = A02;
            if (parcel2.dataPosition() < i2) {
                int readInt = parcel2.readInt();
                switch ((char) readInt) {
                    case 1:
                        j = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 2:
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 3:
                        bArr = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 4:
                        parcelFileDescriptor = (ParcelFileDescriptor) C26300CxD.A0A(parcel2, ParcelFileDescriptor.CREATOR, readInt);
                        break;
                    case 5:
                        str = C26300CxD.A0D(parcel2, readInt);
                        break;
                    case 6:
                        j4 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 7:
                        parcelFileDescriptor2 = (ParcelFileDescriptor) C26300CxD.A0A(parcel2, ParcelFileDescriptor.CREATOR, readInt);
                        break;
                    case 8:
                        uri = (Uri) C26300CxD.A0A(parcel2, Uri.CREATOR, readInt);
                        break;
                    case 9:
                        j2 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 10:
                        z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 11:
                        bcb = (C23181Bcb) C26300CxD.A0A(parcel2, C23181Bcb.CREATOR, readInt);
                        break;
                    case 12:
                        j3 = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 13:
                        str2 = C26300CxD.A0D(parcel2, readInt);
                        break;
                    case 14:
                        str3 = C26300CxD.A0D(parcel2, readInt);
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i2);
                ? obj = new Object();
                obj.A01 = j;
                obj.A00 = i;
                obj.A0D = bArr;
                obj.A06 = parcelFileDescriptor;
                obj.A09 = str;
                obj.A02 = j4;
                obj.A07 = parcelFileDescriptor2;
                obj.A05 = uri;
                obj.A03 = j2;
                obj.A0C = z;
                obj.A08 = bcb;
                obj.A04 = j3;
                obj.A0A = str2;
                obj.A0B = str3;
                return obj;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23143Bbw[i];
    }
}
