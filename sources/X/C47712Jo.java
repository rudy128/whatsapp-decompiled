package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Jo  reason: invalid class name and case insensitive filesystem */
public final class C47712Jo extends C29661cf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47712Jo(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length != 0 && length <= 20) {
            char charAt = str.charAt(0);
            if (C18070vi.A00(charAt, 49) >= 0 && C18070vi.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    i = (C18070vi.A00(charAt2, 48) >= 0 && C18070vi.A00(charAt2, 57) <= 0) ? i + 1 : i;
                }
                return;
            }
        }
        throw new AnonymousClass11T(str);
    }

    public static final C47712Jo A00(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Object A002 = C22911Dt.A00(str);
            if (!(A002 instanceof C47712Jo) || (obj = (C47712Jo) A002) == null) {
                throw new AnonymousClass11T(str);
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                obj2 = obj;
            }
            return (C47712Jo) obj2;
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass1EG.A0B(this.user, 4));
        A10.append('@');
        return AnonymousClass000.A0y("broadcast", A10);
    }

    public String getServer() {
        return "broadcast";
    }
}
