package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.766  reason: invalid class name */
public final class AnonymousClass766 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.77I] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        boolean z = false;
        boolean A1O = AnonymousClass000.A1O(parcel.readInt());
        if (parcel.readInt() != 0) {
            z = true;
        }
        ? obj = new Object();
        obj.A01 = A0A;
        obj.A00 = readInt;
        obj.A02 = readInt2;
        obj.A03 = readString;
        obj.A04 = A1O;
        obj.A05 = z;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77I[i];
    }
}
