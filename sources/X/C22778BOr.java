package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.BOr  reason: case insensitive filesystem */
public final class C22778BOr extends D9F {
    public static final Parcelable.Creator CREATOR = D3B.A00(18);
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C22778BOr bOr = (C22778BOr) obj;
            if (!Util.A0D(this.A00, bOr.A00) || !Util.A0D(this.A01, bOr.A01) || !Util.A0D(this.A02, bOr.A02)) {
                return false;
            }
        }
        return true;
    }

    public C22778BOr(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public int hashCode() {
        int i = 0;
        int A022 = (((527 + AnonymousClass8BW.A02(this.A01)) * 31) + AnonymousClass8BW.A02(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A022 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(": domain=");
        A10.append(this.A01);
        A10.append(", description=");
        return AnonymousClass000.A0y(this.A00, A10);
    }

    public C22778BOr(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
