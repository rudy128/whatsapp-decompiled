package X;

import android.os.Parcel;
import android.os.Parcelable;

public enum C0Z implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    C0Z(String str) {
        this.zzb = str;
    }

    public static C0Z A00(String str) {
        for (C0Z c0z : values()) {
            if (str.equals(c0z.zzb)) {
                return c0z;
            }
        }
        throw new C1W(str);
    }
}
