package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACx  reason: case insensitive filesystem */
public final class C20239ACx implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.ADF, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        ? obj = new Object();
        obj.A02 = A0y;
        obj.A00 = readInt;
        obj.A01 = readInt2;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADF[i];
    }
}
