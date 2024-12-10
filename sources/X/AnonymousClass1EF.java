package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1EF  reason: invalid class name */
public final class AnonymousClass1EF extends AnonymousClass1EE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass1ED A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EF(AnonymousClass1ED r3, int i) {
        super(r3, i);
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = i;
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interop device JIDs must have device index 0; had: ");
            sb.append(i);
            throw new AnonymousClass11T(sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 23;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public String getRawString() {
        String str = this.user;
        int i = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(i);
        sb.append('@');
        sb.append("interop");
        return sb.toString();
    }

    public int getDevice() {
        return this.A00;
    }

    public String getServer() {
        return "interop";
    }
}
