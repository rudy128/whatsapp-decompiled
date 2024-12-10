package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzF  reason: case insensitive filesystem */
public final class C26414CzF implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Integer num2;
        Parcel parcel2 = parcel;
        String A0y = C72453Mb.A0y(parcel2);
        String readString = parcel2.readString();
        if (readString.equals("ONE_SIDE")) {
            num = AnonymousClass00R.A00;
        } else if (readString.equals("TWO_SIDES")) {
            num = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(readString);
        }
        Class<C26548D3k> cls = C26548D3k.class;
        BVV bvv = (BVV) AnonymousClass3Ma.A08(parcel2, cls);
        parcel2.readParcelable(cls.getClassLoader());
        String readString2 = parcel2.readString();
        if (readString2.equals("APP_DEFAULT")) {
            num2 = AnonymousClass00R.A00;
        } else if (readString2.equals("XMDS")) {
            num2 = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(readString2);
        }
        parcel2.readParcelable(cls.getClassLoader());
        Integer A00 = C25323CdU.A00(parcel2.readString());
        String readString3 = parcel2.readString();
        boolean A1R = C72473Md.A1R(parcel2);
        boolean A1R2 = C72473Md.A1R(parcel2);
        boolean A1R3 = C72473Md.A1R(parcel2);
        parcel2.readParcelable(cls.getClassLoader());
        String readString4 = parcel2.readString();
        long readLong = parcel2.readLong();
        parcel2.readParcelable(cls.getClassLoader());
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        ECW ecw = (ECW) AnonymousClass3Ma.A08(parcel2, cls);
        long readLong2 = parcel2.readLong();
        return new C26548D3k(BE8.A0K(parcel2, cls), (C26544D3f) AnonymousClass3Ma.A08(parcel2, cls), ecw, bvv, (BVX) AnonymousClass3Ma.A08(parcel2, cls), num, num2, A00, A0y, readString3, readString4, readString5, readString6, readString7, parcel2.readInt(), readLong, readLong2, A1R, A1R2, A1R3);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C26548D3k[i];
    }
}
