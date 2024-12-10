package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8oP  reason: invalid class name */
public final class AnonymousClass8oP extends AnonymousClass8oT {
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass8oP(UserJid userJid, String str, String str2, long j) {
        super(userJid, 0);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass8oP r7 = (AnonymousClass8oP) obj;
            if (this.A00 != r7.A00 || !C18070vi.A18(this.A00.getRawString(), r7.A00.getRawString()) || !C18070vi.A18(this.A01, r7.A01) || !C18070vi.A18(this.A02, r7.A02) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A01;
        objArr[3] = this.A02;
        C17890vO.A1P(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    static {
        TimeUnit.DAYS.toMillis(7);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n        OptimisedDeliveryTokens(\n            businessRemoteJid = ");
        A10.append(this.A00);
        A10.append(",\n            disclosedToken = ");
        A10.append(this.A01);
        A10.append(",\n            unDisclosedToken = ");
        A10.append(this.A02);
        A10.append(",\n            creationTimeMs = ");
        A10.append(this.A00);
        return AnonymousClass8BW.A0k(",\n        )\n    ", A10);
    }
}
