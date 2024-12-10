package X;

import android.os.Parcel;
import android.os.Parcelable;

public enum C0V implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zze;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }

    /* access modifiers changed from: public */
    C0V(String str) {
        this.zze = str;
    }
}
