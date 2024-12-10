package X;

import android.os.Parcel;
import android.os.Parcelable;

public class BL3 extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(6);
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public BL3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = true;
        this.A04 = AnonymousClass000.A1O(parcel.readByte());
        this.A03 = AnonymousClass000.A1O(parcel.readByte());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readByte() == 0 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }
}
