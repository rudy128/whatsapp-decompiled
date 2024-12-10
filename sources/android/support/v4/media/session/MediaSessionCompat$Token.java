package android.support.v4.media.session;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(6);
    public final Object A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionCompat$Token) {
            Object obj2 = this.A00;
            Object obj3 = ((MediaSessionCompat$Token) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 != null) {
                return obj2.equals(obj3);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.A00, i);
    }

    public MediaSessionCompat$Token(Object obj) {
        this.A00 = obj;
    }
}
