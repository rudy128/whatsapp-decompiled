package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.760  reason: invalid class name */
public final class AnonymousClass760 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.76o, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        HashSet hashSet;
        int A0A = C72453Mb.A0A(parcel);
        HashMap hashMap = new HashMap(A0A);
        for (int i = 0; i != A0A; i++) {
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                hashSet = null;
            } else {
                int readInt = parcel.readInt();
                hashSet = new HashSet(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    C17880vN.A1R(hashSet, parcel.readLong());
                }
            }
            hashMap.put(readString, hashSet);
        }
        ? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1416876o[i];
    }
}
