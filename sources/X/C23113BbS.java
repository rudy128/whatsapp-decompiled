package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: X.BbS  reason: case insensitive filesystem */
public class C23113BbS extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final PendingIntent A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C23113BbS)) {
            return false;
        }
        return C25332Cdd.A01(this.A00, ((C23113BbS) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(AnonymousClass8BV.A1b(this.A00));
    }

    public C23113BbS(PendingIntent pendingIntent) {
        C18210vx.A00(pendingIntent);
        this.A00 = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 1, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
