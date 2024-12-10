package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.Bd5  reason: case insensitive filesystem */
public final class C23210Bd5 extends DJ0 implements E5A {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;

    public final Status BZg() {
        if (this.A00 != null) {
            return Status.A08;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A01;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0B(parcel, list, 1);
        C26293Cx2.A0A(parcel, this.A00, 2, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23210Bd5(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
