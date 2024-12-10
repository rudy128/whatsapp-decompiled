package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.8oQ  reason: invalid class name */
public final class AnonymousClass8oQ extends AnonymousClass8oT {
    public static final long A03 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final AnonymousClass1E2 A01;
    public final Map A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8oQ(AnonymousClass1E2 r2, UserJid userJid, Map map, long j) {
        super(userJid, 3);
        C18070vi.A0d(userJid, 1);
        this.A01 = r2;
        this.A00 = j;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass8oQ r7 = (AnonymousClass8oQ) obj;
            if (!C18070vi.A18(this.A00.getRawString(), r7.A00.getRawString()) || !C18070vi.A18(this.A01, r7.A01) || this.A00 != r7.A00 || this.A00 != r7.A00 || !C18070vi.A18(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00.getRawString();
        objArr[1] = this.A01;
        C17890vO.A1N(objArr, this.A00);
        C17890vO.A1G(objArr, this.A02.hashCode());
        return Arrays.hashCode(objArr);
    }

    public final JSONObject A02() {
        JSONObject A15 = C17880vN.A15();
        A15.put("ab", "Android");
        for (C179569Im r3 : C179569Im.A00) {
            Map map = this.A02;
            if (map.containsKey(r3)) {
                A15.put(String.valueOf(r3.jsonKey), map.get(r3));
            }
        }
        return A15;
    }
}
