package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Bd6  reason: case insensitive filesystem */
public final class C23211Bd6 extends DJ0 implements E5A {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status BZg() {
        if (this.A00 == 0) {
            return Status.A08;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A02);
        C26293Cx2.A06(parcel, 2, this.A00);
        DJ0.A0F(parcel, this.A01, i, A012);
    }

    public C23211Bd6(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public C23211Bd6() {
        this(2, 0, (Intent) null);
    }
}
