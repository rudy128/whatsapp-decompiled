package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.AAq  reason: case insensitive filesystem */
public final class C20180AAq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt2);
        int i = 0;
        while (i != readInt2) {
            i = AnonymousClass8BV.A01(parcel, C20247ADf.CREATOR, A0z, i);
        }
        return new AEK(A0z, readFloat, readFloat2, readInt, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEK[i];
    }
}
