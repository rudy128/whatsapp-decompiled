package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.688  reason: invalid class name */
public final class AnonymousClass688 extends AnonymousClass1BI implements Parcelable {
    public static final AnonymousClass688 A00 = new AnonymousClass688();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 9;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public AnonymousClass688() {
        super("gdpr");
    }

    public String getServer() {
        return "s.whatsapp.net";
    }
}
