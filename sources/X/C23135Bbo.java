package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: X.Bbo  reason: case insensitive filesystem */
public final class C23135Bbo extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final C23207Bd1 A03;

    public final void A00(E9I e9i) {
        int i = this.A00;
        if (i == 1) {
            e9i.BoC(this.A03);
        } else if (i == 2) {
            e9i.BoB(this.A03);
        } else if (i == 3) {
            e9i.Bvz(this.A03);
        } else if (i != 4) {
            StringBuilder A0t = BE6.A0t(25);
            A0t.append("Unknown type: ");
            A0t.append(i);
            Log.w("ChannelEventParcelable", A0t.toString());
        } else {
            e9i.Bzm(this.A03);
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.A03);
        int i = this.A00;
        if (i == 1) {
            str = "CHANNEL_OPENED";
        } else if (i == 2) {
            str = "CHANNEL_CLOSED";
        } else if (i == 3) {
            str = "INPUT_CLOSED";
        } else if (i != 4) {
            str = Integer.toString(i);
        } else {
            str = "OUTPUT_CLOSED";
        }
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            str2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 == 2) {
            str2 = "CLOSE_REASON_REMOTE_CLOSE";
        } else if (i2 != 3) {
            str2 = Integer.toString(i2);
        } else {
            str2 = "CLOSE_REASON_LOCAL_CLOSE";
        }
        int i3 = this.A02;
        int A0C = BE8.A0C(valueOf);
        StringBuilder A0q = BE7.A0q(A0C + 81 + BE8.A0C(str), BE8.A0C(str2));
        A0q.append("ChannelEventParcelable[, channel=");
        A0q.append(valueOf);
        A0q.append(", type=");
        A0q.append(str);
        A0q.append(", closeReason=");
        A0q.append(str2);
        A0q.append(", appErrorCode=");
        A0q.append(i3);
        return AnonymousClass000.A0z(A0q);
    }

    public C23135Bbo(C23207Bd1 bd1, int i, int i2, int i3) {
        this.A03 = bd1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A03, 2, i, false);
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A06(parcel, 4, this.A01);
        C26293Cx2.A06(parcel, 5, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
