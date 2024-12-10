package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

public class BL4 extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(12);
    public final int A00;

    public BL4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public BL4(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.A00 = sideSheetBehavior.A05;
    }
}
