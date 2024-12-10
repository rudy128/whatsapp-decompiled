package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Jn  reason: invalid class name and case insensitive filesystem */
public final class C47702Jn extends AnonymousClass1EE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C42711yc A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47702Jn(C42711yc r4, int i) {
        super(r4, i);
        C18070vi.A0d(r4, 1);
        this.A01 = r4;
        this.A00 = i;
        C17960vV.A0F(AnonymousClass000.A1P(i), AnonymousClass001.A1I("Bot device JIDs must have device index 0; had: ", AnonymousClass000.A10(), i));
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 27;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public String getRawString() {
        String str = this.user;
        int i = this.A00;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(':');
        A11.append(i);
        return C17890vO.A0Z("bot", A11, '@');
    }

    public int getDevice() {
        return this.A00;
    }

    public String getServer() {
        return "bot";
    }
}
