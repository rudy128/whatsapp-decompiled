package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEp  reason: case insensitive filesystem */
public final class C20281AEp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final Integer A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20281AEp) {
                C20281AEp aEp = (C20281AEp) obj;
                if (!(this.A02 == aEp.A02 && this.A01 == aEp.A01 && this.A00 == aEp.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(A00(this.A02));
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        Integer num = this.A02;
        return (((C72453Mb.A0E(num, A00(num)) * 31) + this.A01) * 31) + this.A00;
    }

    public C20281AEp(Integer num, int i, int i2) {
        this.A02 = num;
        this.A01 = i;
        this.A00 = i2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NONE";
            case 1:
                return "ORDER_NOT_FOUND";
            default:
                return "GET_PAYMENT_CONFIG_FAILED";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutErrorContent(code=");
        A10.append(A00(this.A02));
        A10.append(", titleRes=");
        A10.append(this.A01);
        A10.append(", descriptionRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C20281AEp() {
        this(AnonymousClass00R.A00, -1, -1);
    }
}
