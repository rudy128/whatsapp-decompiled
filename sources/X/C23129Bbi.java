package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbi  reason: case insensitive filesystem */
public class C23129Bbi extends DJ0 {
    public static final C23129Bbi A02 = new C23129Bbi(C0Y.NOT_SUPPORTED.toString(), (String) null);
    public static final C23129Bbi A03 = new C23129Bbi(C0Y.SUPPORTED.toString(), (String) null);
    public static final Parcelable.Creator CREATOR = new Object();
    public final C0Y A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj instanceof C23129Bbi) {
            C23129Bbi bbi = (C23129Bbi) obj;
            if (!CBA.A00(this.A00, bbi.A00) || !CBA.A00(this.A01, bbi.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C23129Bbi(String str, String str2) {
        C18210vx.A00(str);
        try {
            for (C0Y c0y : C0Y.values()) {
                if (str.equals(c0y.zzb)) {
                    this.A00 = c0y;
                    this.A01 = str2;
                    return;
                }
            }
            throw new C24383C1c(str);
        } catch (C24383C1c e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A01, 3, DJ0.A0L(parcel, this.A00.toString()));
        C26293Cx2.A05(parcel, A002);
    }
}
