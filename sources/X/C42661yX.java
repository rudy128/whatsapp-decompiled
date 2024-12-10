package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1yX  reason: invalid class name and case insensitive filesystem */
public class C42661yX {
    public static final C42661yX A05 = new C42661yX((PhoneUserJid) null, (UserJid) null, (String) null, (String) null, 0);
    public final long A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C42661yX r7 = (C42661yX) obj;
            if (this.A00 != r7.A00 || !C42171xk.A00(this.A04, r7.A04) || !C42171xk.A00(this.A02, r7.A02) || !C42171xk.A00(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Long.valueOf(this.A00), this.A02, this.A03});
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("GroupDescription{id=");
        sb.append(this.A04);
        sb.append(", time=");
        sb.append(this.A00);
        sb.append(", setterJid='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", len(description)='");
        String str = this.A03;
        if (str == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(str.length());
        }
        sb.append(valueOf);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C42661yX(PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2, long j) {
        this.A04 = str;
        this.A00 = j;
        this.A02 = userJid;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }
}
