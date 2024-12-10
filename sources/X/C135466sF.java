package X;

import java.security.PublicKey;
import org.json.JSONObject;

/* renamed from: X.6sF  reason: invalid class name and case insensitive filesystem */
public final class C135466sF {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final String A00(String str, PublicKey publicKey, int i) {
        C18070vi.A0d(str, 0);
        this.A02.get();
        String A002 = A0V.A00(Integer.valueOf(i), str, (String) null, publicKey);
        StringBuilder A15 = C108955ca.A15(A002);
        A15.append("#PWD_WA:11:");
        A15.append(AnonymousClass11P.A00(this.A00));
        return C17890vO.A0Z(A002, A15, ':');
    }

    public final void A02(C1606789m r9, C29621ca r10, String str, C22821Di r12, C22821Di r13) {
        C18070vi.A0d(r10, 1);
        ((AnonymousClass1OZ) this.A01.get()).A0N(new AnonymousClass7LL(r9, r12, r13, 4), r10, str, 264, 32000);
    }

    public final JSONObject A01(String str, String str2) {
        C18070vi.A0d(str2, 1);
        JSONObject A15 = C17880vN.A15();
        A15.put("version", 1);
        A15.put("timestamp", AnonymousClass11P.A00(this.A00));
        A15.put("password", str2);
        C108985cd.A1J(str, A15);
        return A15;
    }

    public C135466sF(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
