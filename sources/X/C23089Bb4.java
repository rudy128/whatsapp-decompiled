package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.Bb4  reason: case insensitive filesystem */
public class C23089Bb4 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00 = 0;
    public ParcelFileDescriptor A01 = null;
    public DataHolder A02 = null;
    public String A03 = null;
    public byte[] A04 = null;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A03);
        C26293Cx2.A09(parcel, this.A02, 3, i, A0L);
        C26293Cx2.A09(parcel, this.A01, 4, i, A0L);
        C26293Cx2.A07(parcel, 5, this.A00);
        C26293Cx2.A0D(parcel, this.A04, 6, A0L);
        C26293Cx2.A05(parcel, A002);
        this.A01 = null;
    }
}
