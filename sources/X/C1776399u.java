package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.99u  reason: invalid class name and case insensitive filesystem */
public final class C1776399u extends C89264cB {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final File A02;

    public C1776399u(File file, int i, int i2) {
        C18070vi.A0d(file, 1);
        this.A02 = file;
        this.A01 = i;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1776399u) {
                C1776399u r5 = (C1776399u) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Image(file=");
        A10.append(this.A02);
        A10.append(", width=");
        A10.append(this.A01);
        A10.append(", height=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
