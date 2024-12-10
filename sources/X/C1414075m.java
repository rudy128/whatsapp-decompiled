package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.75m  reason: invalid class name and case insensitive filesystem */
public final class C1414075m implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i++) {
            A0z.add(AnonymousClass3Ma.A08(parcel, AnonymousClass77B.class));
        }
        int readInt2 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            linkedHashMap.put(parcel.readSerializable(), AnonymousClass3Ma.A08(parcel, AnonymousClass77B.class));
        }
        int readInt3 = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
        for (int i3 = 0; i3 != readInt3; i3++) {
            linkedHashMap2.put(AnonymousClass3Ma.A08(parcel, AnonymousClass77B.class), parcel.readSerializable());
        }
        return new AnonymousClass77B(A0y, A0z, linkedHashMap, linkedHashMap2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77B[i];
    }
}
