package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2m4  reason: invalid class name and case insensitive filesystem */
public class C59292m4 {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C59292m4 r7 = (C59292m4) obj;
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02) || !C42171xk.A00(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        C17890vO.A1L(objArr, this.A00);
        objArr[1] = this.A02;
        return AnonymousClass000.A0P(this.A01, objArr, 2);
    }

    public C59292m4(UserJid userJid, String str, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLink[rowId=");
        A10.append(this.A00);
        A10.append(", token='");
        A10.append(this.A02);
        A10.append(", creatorJid=");
        return C17900vP.A09(this.A01, A10);
    }
}
