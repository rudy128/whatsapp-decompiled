package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4c6  reason: invalid class name */
public final class AnonymousClass4c6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        C18070vi.A0d(parcel, 0);
        Intent intent = (Intent) AnonymousClass3Ma.A08(parcel, C89464cV.class);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        boolean booleanValue = A3Y.A00(parcel).booleanValue();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new C89464cV(intent, valueOf, num, readInt, readInt2, readInt3, readInt4, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89464cV[i];
    }
}
