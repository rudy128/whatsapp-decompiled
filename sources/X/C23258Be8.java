package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Be8  reason: case insensitive filesystem */
public final class C23258Be8 extends C23219BdV {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public byte[] A02;
    public PendingIntent A03;
    public C23080Bav A04;
    public final int A05;
    public final Set A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        HashMap A11 = C17880vN.A11();
        A07 = A11;
        A11.put("accountType", new C23196Bcq((Class) null, "accountType", 7, 7, 2, false, false));
        A11.put("status", new C23196Bcq((Class) null, "status", 0, 0, 3, false, false));
        A11.put("transferBytes", new C23196Bcq((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public C23258Be8(PendingIntent pendingIntent, C23080Bav bav, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A02 = bArr;
        this.A03 = pendingIntent;
        this.A04 = bav;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        Set set = this.A06;
        if (C108965cb.A1b(set, 1)) {
            C26293Cx2.A06(parcel, 1, this.A05);
        }
        if (C108965cb.A1b(set, 2)) {
            C26293Cx2.A0A(parcel, this.A01, 2, true);
        }
        if (C108965cb.A1b(set, 3)) {
            C26293Cx2.A06(parcel, 3, this.A00);
        }
        if (C108965cb.A1b(set, 4)) {
            C26293Cx2.A0D(parcel, this.A02, 4, true);
        }
        if (C108965cb.A1b(set, 5)) {
            C26293Cx2.A09(parcel, this.A03, 5, i, true);
        }
        if (C108965cb.A1b(set, 6)) {
            C26293Cx2.A09(parcel, this.A04, 6, i, true);
        }
        C26293Cx2.A05(parcel, A002);
    }

    public C23258Be8() {
        this.A06 = new AnonymousClass016(3);
        this.A05 = 1;
    }
}
