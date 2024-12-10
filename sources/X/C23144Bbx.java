package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bbx  reason: case insensitive filesystem */
public class C23144Bbx extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C23144Bbx)) {
            return false;
        }
        return this.A00.equals(((C23144Bbx) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(AnonymousClass8BV.A1b(this.A00));
    }

    public C23144Bbx(String str) {
        C18210vx.A00(str);
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FidoAppIdExtension{appid='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        DJ0.A0G(parcel, this.A00, C26293Cx2.A00(parcel));
    }
}
