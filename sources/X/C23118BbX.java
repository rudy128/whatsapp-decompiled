package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BbX  reason: case insensitive filesystem */
public final class C23118BbX extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23118BbX) || this.A00 != ((C23118BbX) obj).A00) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 1, j);
        C26293Cx2.A05(parcel, A002);
    }

    public C23118BbX(long j) {
        Long valueOf = Long.valueOf(j);
        C18210vx.A00(valueOf);
        this.A00 = valueOf.longValue();
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        C17890vO.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
