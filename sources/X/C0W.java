package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public enum C0W implements Parcelable {
    UNKNOWN(0),
    GREEN(1),
    YELLOW(2),
    RED(3);
    
    public static final SparseArray A00 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int mValue;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = BE6.A0Q();
        for (C0W c0w : values()) {
            A00.put(c0w.mValue, c0w);
        }
        CREATOR = D3B.A00(44);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    /* access modifiers changed from: public */
    C0W(int i) {
        this.mValue = i;
    }
}
