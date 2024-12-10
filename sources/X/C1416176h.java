package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76h  reason: invalid class name and case insensitive filesystem */
public final class C1416176h implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        String A0y = C72453Mb.A0y(parcel);
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
        }
        C29681ch r2 = (C29681ch) AnonymousClass3Ma.A08(parcel, C1418077a.class);
        if (parcel.readInt() != 0) {
            String readString2 = parcel.readString();
            if (readString2.equals("IMAGE")) {
                num = AnonymousClass00R.A00;
            } else if (readString2.equals("VIDEO")) {
                num = AnonymousClass00R.A01;
            } else {
                throw AnonymousClass000.A0k(readString2);
            }
        }
        return new C1418077a(r2, valueOf, num, A0y, readString, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1418077a[i];
    }
}
