package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABA implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.ADC, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        C18070vi.A0w(A0y, readString, readString2, readString3, readString4);
        C18070vi.A0l(readString5, readString6);
        ? obj = new Object();
        obj.A04 = A0y;
        obj.A00 = readString;
        obj.A01 = readString2;
        obj.A02 = readString3;
        obj.A06 = readString4;
        obj.A03 = readString5;
        obj.A05 = readString6;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADC[i];
    }
}
