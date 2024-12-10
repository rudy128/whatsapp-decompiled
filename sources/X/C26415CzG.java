package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzG  reason: case insensitive filesystem */
public final class C26415CzG implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Parcel parcel2 = parcel;
        Integer A00 = C25323CdU.A00(C72453Mb.A0y(parcel2));
        Class<D4D> cls = D4D.class;
        BVW bvw = (BVW) AnonymousClass3Ma.A08(parcel2, cls);
        int readInt = parcel2.readInt();
        int readInt2 = parcel2.readInt();
        String readString = parcel2.readString();
        long readLong = parcel2.readLong();
        ECW ecw = (ECW) AnonymousClass3Ma.A08(parcel2, cls);
        D3T d3t = (D3T) AnonymousClass3Ma.A08(parcel2, cls);
        BVX bvx = (BVX) AnonymousClass3Ma.A08(parcel2, cls);
        Integer num2 = null;
        if (parcel2.readInt() == 0) {
            num = null;
        } else {
            String readString2 = parcel2.readString();
            if (readString2.equals("ICON")) {
                num = AnonymousClass00R.A00;
            } else if (readString2.equals("IMAGE")) {
                num = AnonymousClass00R.A01;
            } else if (readString2.equals("VIDEO")) {
                num = AnonymousClass00R.A0C;
            } else if (readString2.equals("VIDEO_AUTOPLAY")) {
                num = AnonymousClass00R.A0N;
            } else if (readString2.equals("NONE")) {
                num = AnonymousClass00R.A0Y;
            } else {
                throw AnonymousClass000.A0k(readString2);
            }
        }
        parcel2.readParcelable(cls.getClassLoader());
        String readString3 = parcel2.readString();
        Bundle A0K = BE8.A0K(parcel2, cls);
        parcel2.readParcelable(cls.getClassLoader());
        if (parcel2.readInt() != 0) {
            String readString4 = parcel2.readString();
            if (readString4.equals("SHORTEST")) {
                num2 = AnonymousClass00R.A00;
            } else if (readString4.equals("LONGEST")) {
                num2 = AnonymousClass00R.A01;
            } else if (readString4.equals("NOT_SET")) {
                num2 = AnonymousClass00R.A0C;
            } else {
                throw AnonymousClass000.A0k(readString4);
            }
        }
        return new D4D(A0K, d3t, (C26553D3t) AnonymousClass3Ma.A08(parcel2, cls), ecw, bvw, bvx, A00, num, num2, readString, readString3, parcel2.readString(), readInt, readInt2, readLong, C72473Md.A1R(parcel2));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D4D[i];
    }
}
