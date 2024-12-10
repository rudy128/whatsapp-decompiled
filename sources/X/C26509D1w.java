package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.D1w  reason: case insensitive filesystem */
public final class C26509D1w implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Bb4, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 3) {
                dataHolder = (DataHolder) C26300CxD.A0A(parcel, DataHolder.CREATOR, readInt);
            } else if (c == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C26300CxD.A0A(parcel, ParcelFileDescriptor.CREATOR, readInt);
            } else if (c != 5) {
                bArr = C26300CxD.A0P(parcel, bArr, c, 6, readInt);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A03 = str;
        obj.A02 = dataHolder;
        obj.A01 = parcelFileDescriptor;
        obj.A00 = j;
        obj.A04 = bArr;
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23089Bb4[i];
    }
}
