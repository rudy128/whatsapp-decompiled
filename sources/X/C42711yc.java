package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1yc  reason: invalid class name and case insensitive filesystem */
public final class C42711yc extends AnonymousClass1E1 implements Parcelable {
    public static final C62192qw A01 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42711yc(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length < 1 || length > 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid BotJid: ");
            sb.append(str);
            sb.append(" - length must be between 1 and 20");
            throw new AnonymousClass11T(sb.toString());
        }
        if (!str.startsWith("0")) {
            char[] charArray = str.toCharArray();
            C18070vi.A0X(charArray);
            for (char c : charArray) {
                if (C18070vi.A00(c, 48) < 0 || C18070vi.A00(c, 57) > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid BotJid: ");
                    sb2.append(str);
                    sb2.append(" - must be numeric only");
                    throw new AnonymousClass11T(sb2.toString());
                }
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid BotJid: ");
        sb3.append(str);
        sb3.append(" - cannot start with 0");
        throw new AnonymousClass11T(sb3.toString());
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 26;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getServer() {
        return "bot";
    }
}
