package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.BOp  reason: case insensitive filesystem */
public final class C22776BOp extends D9F {
    public static final Parcelable.Creator CREATOR = D3B.A00(19);
    public final String A00;
    public final String A01;

    public C22776BOp(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C22776BOp bOp = (C22776BOp) obj;
            if (!this.A00.equals(bOp.A00) || !Util.A0D(this.A00, bOp.A00) || !Util.A0D(this.A01, bOp.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (C17890vO.A02(this.A00, 527) + AnonymousClass8BW.A02(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A02 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(": description=");
        A10.append(this.A00);
        A10.append(": value=");
        return AnonymousClass000.A0y(this.A01, A10);
    }

    public C22776BOp(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
