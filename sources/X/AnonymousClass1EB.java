package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1EB  reason: invalid class name */
public final class AnonymousClass1EB extends GroupJid implements Parcelable {
    public static final C56292hE A01 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EB(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        if (!AnonymousClass1YF.A0Y(str, "-", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid group id: ");
            sb.append(str);
            throw new AnonymousClass11T(sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        String substring = getRawString().substring(AnonymousClass1YF.A0F(getRawString(), "-", 0, false) + 1);
        C18070vi.A0X(substring);
        return substring;
    }

    public String getServer() {
        return "temp";
    }
}
