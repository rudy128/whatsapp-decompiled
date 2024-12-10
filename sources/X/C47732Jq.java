package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Jq  reason: invalid class name and case insensitive filesystem */
public final class C47732Jq extends C42521yJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass1E2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47732Jq(AnonymousClass1E2 r3, int i) {
        super(r3, i);
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = i;
        if (i != 99) {
            throw new AnonymousClass11T("device_id should be 99 for hosted device");
        }
    }

    public int getType() {
        return 25;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.user);
        A10.append(':');
        A10.append(this.A00);
        A10.append('@');
        return AnonymousClass000.A0y("hosted.lid", A10);
    }

    public String getServer() {
        return "hosted.lid";
    }
}
