package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.C0a  reason: case insensitive filesystem */
public enum C24365C0a implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    /* access modifiers changed from: public */
    C24365C0a() {
        this.zzb = "public-key";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    public static C24365C0a A00(String str) {
        for (C24365C0a c0a : values()) {
            if (str.equals(c0a.zzb)) {
                return c0a;
            }
        }
        throw new C24381C1a(String.format("PublicKeyCredentialType %s not supported", BE7.A1b(str)));
    }
}
