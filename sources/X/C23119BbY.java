package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BbY  reason: case insensitive filesystem */
public final class C23119BbY extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23119BbY) || this.A00 != ((C23119BbY) obj).A00) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, z);
        C26293Cx2.A05(parcel, A002);
    }

    public C23119BbY(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C18210vx.A00(valueOf);
        this.A00 = valueOf.booleanValue();
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1N(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
