package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class A1A {
    public static final long A05 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final C49372Qf A01;
    public final AnonymousClass1E2 A02;
    public final UserJid A03;
    public final Map A04;

    public A1A(C49372Qf r2, AnonymousClass1E2 r3, UserJid userJid, Map map, long j) {
        C18070vi.A0d(r2, 3);
        this.A03 = userJid;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = j;
        this.A04 = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1A)) {
            return false;
        }
        A1A a1a = (A1A) obj;
        return C18070vi.A18(this.A03.getRawString(), a1a.A03.getRawString()) && C18070vi.A18(this.A02, a1a.A02) && this.A01 == a1a.A01 && C18070vi.A18(this.A04, a1a.A04);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A03.getRawString();
        objArr[1] = this.A02;
        objArr[2] = this.A01;
        C17890vO.A1O(objArr, this.A00);
        AnonymousClass3Ma.A1T(objArr, this.A04.hashCode());
        return Arrays.hashCode(objArr);
    }
}
