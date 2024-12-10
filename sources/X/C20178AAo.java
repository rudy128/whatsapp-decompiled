package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.AAo  reason: case insensitive filesystem */
public final class C20178AAo implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        double readDouble = parcel.readDouble();
        int readInt = parcel.readInt();
        float readFloat = parcel.readFloat();
        int readInt2 = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt2);
        int i = 0;
        for (int i2 = 0; i2 != readInt2; i2++) {
            A0z.add(Float.valueOf(parcel.readFloat()));
        }
        int readInt3 = parcel.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt3);
        while (i != readInt3) {
            i = AnonymousClass8BV.A01(parcel, AEK.CREATOR, A0z2, i);
        }
        return new C20272AEf(A0z, A0z2, readDouble, readFloat, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20272AEf[i];
    }
}
