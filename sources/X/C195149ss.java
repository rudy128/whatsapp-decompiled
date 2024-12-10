package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.9ss  reason: invalid class name and case insensitive filesystem */
public final class C195149ss {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final String A03;
    public final Set A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195149ss) {
                C195149ss r5 = (C195149ss) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, AnonymousClass000.A0N(this.A04, (((AnonymousClass000.A0L(this.A02) + this.A01) * 31) + this.A00) * 31));
    }

    public C195149ss(UserJid userJid, String str, Set set, int i, int i2) {
        this.A02 = userJid;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = set;
        this.A03 = str;
    }

    public String toString() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A02;
        A1b[1] = this.A04;
        String format = String.format("GetCategoriesRequest{bizJid=%s, categoryIds=%s'}", Arrays.copyOf(A1b, 2));
        C18070vi.A0X(format);
        return format;
    }
}
