package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

public final class D22 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, X.BbJ] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        C23085Bb0 bb0 = null;
        C23047BaO baO = null;
        C23048BaP baP = null;
        C23075Baq baq = null;
        C23049BaQ baQ = null;
        C23046BaN baN = null;
        C23094Bb9 bb9 = null;
        C23095BbA bbA = null;
        C23101BbG bbG = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = A02;
            if (parcel2.dataPosition() < i3) {
                int readInt = parcel2.readInt();
                switch ((char) readInt) {
                    case 2:
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 3:
                        str = C26300CxD.A0D(parcel2, readInt);
                        break;
                    case 4:
                        str2 = C26300CxD.A0D(parcel2, readInt);
                        break;
                    case 5:
                        i2 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 6:
                        pointArr = (Point[]) C26300CxD.A0R(parcel2, Point.CREATOR, readInt);
                        break;
                    case 7:
                        bb0 = (C23085Bb0) C26300CxD.A0A(parcel2, C23085Bb0.CREATOR, readInt);
                        break;
                    case 8:
                        baO = (C23047BaO) C26300CxD.A0A(parcel2, C23047BaO.CREATOR, readInt);
                        break;
                    case 9:
                        baP = (C23048BaP) C26300CxD.A0A(parcel2, C23048BaP.CREATOR, readInt);
                        break;
                    case 10:
                        baq = (C23075Baq) C26300CxD.A0A(parcel2, C23075Baq.CREATOR, readInt);
                        break;
                    case 11:
                        baQ = (C23049BaQ) C26300CxD.A0A(parcel2, C23049BaQ.CREATOR, readInt);
                        break;
                    case 12:
                        baN = (C23046BaN) C26300CxD.A0A(parcel2, C23046BaN.CREATOR, readInt);
                        break;
                    case 13:
                        bb9 = (C23094Bb9) C26300CxD.A0A(parcel2, C23094Bb9.CREATOR, readInt);
                        break;
                    case 14:
                        bbA = (C23095BbA) C26300CxD.A0A(parcel2, C23095BbA.CREATOR, readInt);
                        break;
                    case 15:
                        bbG = (C23101BbG) C26300CxD.A0A(parcel2, C23101BbG.CREATOR, readInt);
                        break;
                    case 16:
                        bArr = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 17:
                        z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i3);
                ? obj = new Object();
                obj.A00 = i;
                obj.A0C = str;
                obj.A0E = bArr;
                obj.A0B = str2;
                obj.A01 = i2;
                obj.A0F = pointArr;
                obj.A0D = z;
                obj.A05 = bb0;
                obj.A07 = baO;
                obj.A08 = baP;
                obj.A0A = baq;
                obj.A09 = baQ;
                obj.A06 = baN;
                obj.A02 = bb9;
                obj.A03 = bbA;
                obj.A04 = bbG;
                return obj;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23104BbJ[i];
    }
}
