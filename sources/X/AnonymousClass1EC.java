package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1EC  reason: invalid class name */
public final class AnonymousClass1EC extends GroupJid implements Parcelable {
    public static final C42941yz A01 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EC(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        if (!C36321nh.A02(str)) {
            int A0C = AnonymousClass1YF.A0C(str, '-', 0, false);
            if (A0C > 0 && A0C != str.length()) {
                String substring = str.substring(0, A0C);
                C18070vi.A0X(substring);
                Parcelable.Creator creator = PhoneUserJid.CREATOR;
                if (C22951Dx.A02(substring)) {
                    String substring2 = str.substring(A0C + 1);
                    C18070vi.A0X(substring2);
                    int length = substring2.length();
                    if (length == 10) {
                        char charAt = substring2.charAt(0);
                        if (C18070vi.A00(charAt, 49) >= 0 && C18070vi.A00(charAt, 57) <= 0) {
                            int i = 1;
                            do {
                                char charAt2 = substring2.charAt(i);
                                if (C18070vi.A00(charAt2, 48) >= 0 && C18070vi.A00(charAt2, 57) <= 0) {
                                    i++;
                                }
                            } while (i < length);
                            return;
                        }
                    }
                }
            }
            throw new AnonymousClass11T(str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        String str = this.user;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        if (C36321nh.A02(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AnonymousClass1EG.A0B(this.user, 15));
            sb2.append(obj);
            return sb2.toString();
        }
        int A0C = AnonymousClass1YF.A0C(str, '-', 0, false);
        if (A0C == -1) {
            return obj;
        }
        int max = Math.max(0, A0C - 4);
        StringBuilder sb3 = new StringBuilder();
        String substring = str.substring(max);
        C18070vi.A0X(substring);
        sb3.append(substring);
        sb3.append(obj);
        return sb3.toString();
    }

    public String getServer() {
        return "g.us";
    }
}
