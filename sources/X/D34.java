package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D34 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.D3j] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        int readInt8 = parcel.readInt();
        int readInt9 = parcel.readInt();
        int readInt10 = parcel.readInt();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        long readLong4 = parcel.readLong();
        long readLong5 = parcel.readLong();
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        long readLong8 = parcel.readLong();
        ? obj = new Object();
        obj.A06 = A0A;
        obj.A0I = readLong;
        obj.A03 = readInt;
        obj.A09 = readInt2;
        obj.A00 = readInt3;
        obj.A04 = readInt4;
        obj.A07 = readInt5;
        obj.A0A = readInt6;
        obj.A01 = readInt7;
        obj.A02 = readInt8;
        obj.A05 = readInt9;
        obj.A08 = readInt10;
        obj.A0D = readLong2;
        obj.A0B = readLong3;
        obj.A0E = readLong4;
        obj.A0F = readLong5;
        obj.A0H = readLong6;
        obj.A0C = readLong7;
        obj.A0G = readLong8;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D3j[i];
    }
}
