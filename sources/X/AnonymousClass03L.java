package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.03L  reason: invalid class name */
public class AnonymousClass03L extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R5(1);
    public int A00;
    public boolean A01;

    public AnonymousClass03L(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public AnonymousClass03L(Parcelable parcelable) {
        super(parcelable);
    }
}
