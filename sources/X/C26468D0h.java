package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0h  reason: case insensitive filesystem */
public final class C26468D0h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        try {
            for (C0X c0x : C0X.values()) {
                if (readInt == c0x.zzb) {
                    return c0x;
                }
            }
            throw new C1Z(readInt);
        } catch (C1Z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0X[i];
    }
}
