package X;

import java.util.Map;

/* renamed from: X.9ne  reason: invalid class name and case insensitive filesystem */
public final class C192029ne {
    public final AnonymousClass00H A00;

    public C192029ne(AnonymousClass00H r1) {
        this.A00 = r1;
    }

    public final C196289ul A00(C166418cr r4, String str) {
        EE9 ee9;
        AnonymousClass8Z3 r0;
        String str2;
        C164818a7 A0S = A89.A00(r4).A0S();
        String str3 = null;
        if (!(A0S == null || (ee9 = A0S.buttons_) == null || (r0 = (AnonymousClass8Z3) C29431cG.A0c(ee9)) == null || (str2 = r0.buttonParamsJson_) == null || str2.length() == 0)) {
            str3 = str2;
        }
        return A01(str, str3);
    }

    public final C196289ul A01(String str, String str2) {
        Object obj;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "galaxy_message";
        if (!C29431cG.A18(C18070vi.A0O("messageless_flow", A1Z, 1), str)) {
            obj = ((Map) C18070vi.A0E(this.A00)).get(str);
        } else {
            String A002 = AnonymousClass9Q6.A00(A3M.A01(str2));
            if (A002 == null || A002.equals("1")) {
                obj = ((Map) this.A00.get()).get("galaxy_message");
            } else {
                obj = ((Map) this.A00.get()).get("extensions_message_v2");
            }
        }
        return (C196289ul) obj;
    }
}
