package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAn  reason: case insensitive filesystem */
public final class C20177AAn implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        String A0y = C72453Mb.A0y(parcel2);
        double readDouble = parcel2.readDouble();
        double readDouble2 = parcel2.readDouble();
        boolean A01 = A3Y.A01(parcel2);
        double readDouble3 = parcel2.readDouble();
        Class<C20291AEz> cls = C20291AEz.class;
        AF0 af0 = (AF0) AnonymousClass3Ma.A08(parcel2, cls);
        double readDouble4 = parcel2.readDouble();
        return new C20291AEz(af0, (AnonymousClass8nD) AnonymousClass3Ma.A08(parcel2, cls), Double.valueOf(parcel2.readDouble()), Double.valueOf(parcel2.readDouble()), A0y, readDouble, readDouble2, readDouble3, readDouble4, parcel2.readInt(), parcel2.readInt(), A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20291AEz[i];
    }
}
