package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;

public final class D15 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bcb, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C26300CxD.A0A(parcel, ParcelFileDescriptor.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A01 = new byte[0];
        obj.A00 = parcelFileDescriptor;
        if (parcelFileDescriptor != null) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                C23181Bcb.A00(dataInputStream);
                obj.A01 = bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                C23181Bcb.A00(dataInputStream);
                throw th;
            }
        }
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23181Bcb[i];
    }
}
