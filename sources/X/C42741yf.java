package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1yf  reason: invalid class name and case insensitive filesystem */
public class C42741yf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C42741yf r7 = (C42741yf) obj;
            if (!(C42171xk.A00(this.A06, r7.A06) && this.A05 == r7.A05 && C42171xk.A00(this.A07, r7.A07) && C42171xk.A00(this.A08, r7.A08) && this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04)) {
                return false;
            }
        }
        return true;
    }

    public C42691ya A00() {
        return new C42691ya(this.A01, this.A04, this.A00);
    }

    public boolean A01() {
        if (this.A01 == 2) {
            return true;
        }
        return false;
    }

    public boolean A02() {
        String str = this.A07;
        if (str == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        String str = this.A07;
        if (str == null || !str.startsWith("smb:")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, Long.valueOf(this.A05), this.A07, this.A08, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A04)});
    }

    public C42741yf(UserJid userJid, C42691ya r4, String str, String str2, int i, int i2, long j, boolean z) {
        this.A09 = z;
        this.A06 = userJid;
        this.A05 = j;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = r4.hostStorage;
        this.A00 = r4.actualActors;
        this.A04 = r4.privacyModeTs;
    }
}
