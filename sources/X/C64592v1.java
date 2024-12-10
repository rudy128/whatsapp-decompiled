package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
public final class C64592v1 implements Parcelable {
    public static final C64322ua CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final Parcelable A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64592v1(android.os.Parcel r5) {
        /*
            r4 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.Class<X.2v1> r1 = X.C64592v1.class
            java.lang.ClassLoader r0 = r1.getClassLoader()
            if (r3 < r2) goto L_0x001e
            java.lang.Object r2 = r5.readParcelable(r0, r1)
        L_0x0010:
            X.2v1 r2 = (X.C64592v1) r2
            int r1 = r5.readInt()
            int r0 = r5.readInt()
            r4.<init>(r2, r1, r0)
            return
        L_0x001e:
            android.os.Parcelable r2 = r5.readParcelable(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64592v1.<init>(android.os.Parcel):void");
    }

    public C64592v1(Parcelable parcelable, int i, int i2) {
        this.A02 = parcelable;
        this.A01 = i;
        this.A00 = i2;
    }
}
