package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cz8  reason: case insensitive filesystem */
public final class C26407Cz8 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(A0A);
        for (int i = 0; i != A0A; i++) {
            BE7.A1H(parcel.readString(), concurrentHashMap, parcel.readFloat());
        }
        int readInt = parcel.readInt();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(readInt);
        for (int i2 = 0; i2 != readInt; i2++) {
            concurrentHashMap2.put(parcel.readString(), parcel.createFloatArray());
        }
        int readInt2 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(readInt2);
        for (int i3 = 0; i3 != readInt2; i3++) {
            C17890vO.A0z(parcel.readString(), concurrentHashMap3, parcel.readInt());
        }
        int readInt3 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap(readInt3);
        for (int i4 = 0; i4 != readInt3; i4++) {
            concurrentHashMap4.put(parcel.readString(), Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt())));
        }
        int readInt4 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap5 = new ConcurrentHashMap(readInt4);
        for (int i5 = 0; i5 != readInt4; i5++) {
            concurrentHashMap5.put(parcel.readString(), parcel.readString());
        }
        int readInt5 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap(readInt5);
        for (int i6 = 0; i6 != readInt5; i6++) {
            concurrentHashMap6.put(parcel.readString(), parcel.readString());
        }
        int readInt6 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap7 = new ConcurrentHashMap(readInt6);
        for (int i7 = 0; i7 != readInt6; i7++) {
            concurrentHashMap7.put(parcel.readString(), parcel.readString());
        }
        int readInt7 = parcel.readInt();
        ConcurrentHashMap concurrentHashMap8 = new ConcurrentHashMap(readInt7);
        for (int i8 = 0; i8 != readInt7; i8++) {
            concurrentHashMap8.put(parcel.readString(), AnonymousClass3Ma.A08(parcel, C26558D3y.class));
        }
        return new C26558D3y(concurrentHashMap, concurrentHashMap2, concurrentHashMap3, concurrentHashMap4, concurrentHashMap5, concurrentHashMap6, concurrentHashMap7, concurrentHashMap8);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C26558D3y[i];
    }
}
