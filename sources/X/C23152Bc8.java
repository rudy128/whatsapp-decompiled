package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bc8  reason: case insensitive filesystem */
public final class C23152Bc8 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23152Bc8) {
                C23152Bc8 bc8 = (C23152Bc8) obj;
                if (!(this.A02 == bc8.A02 && this.A00 == bc8.A00 && this.A01 == bc8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A0u = BE6.A0u("CollectForDebugParcelable[skipPersistentStorage: ");
        A0u.append(this.A02);
        A0u.append(",collectForDebugStartTimeMillis: ");
        A0u.append(this.A00);
        A0u.append(",collectForDebugExpiryTimeMillis: ");
        A0u.append(this.A01);
        return AnonymousClass000.A0z(A0u);
    }

    public C23152Bc8(long j, boolean z, long j2) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1N(A1a, this.A02);
        C17890vO.A1M(A1a, this.A00);
        C17890vO.A1N(A1a, this.A01);
        return Arrays.hashCode(A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A02);
        C26293Cx2.A07(parcel, 2, this.A01);
        C26293Cx2.A07(parcel, 3, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
