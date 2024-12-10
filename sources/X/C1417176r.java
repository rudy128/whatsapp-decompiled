package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.76r  reason: invalid class name and case insensitive filesystem */
public final class C1417176r implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final AnonymousClass77X A02;
    public final File A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03.getAbsolutePath());
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        this.A02.writeToParcel(parcel, i);
    }

    public C1417176r(AnonymousClass77X r1, File file, int i, int i2, boolean z) {
        this.A00 = i;
        this.A03 = file;
        this.A04 = z;
        this.A01 = i2;
        this.A02 = r1;
    }
}
