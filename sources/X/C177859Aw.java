package X;

import java.util.HashMap;

/* renamed from: X.9Aw  reason: invalid class name and case insensitive filesystem */
public class C177859Aw extends A34 {
    public final C194839sN A00;
    public final AnonymousClass1QS A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        C19760yx r6 = (C19760yx) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            C17960vV.A07(obj2);
            C20284AEs aEs = (C20284AEs) obj2;
            HashMap A11 = C17880vN.A11();
            A11.put("credential_id", aEs.A0A);
            A11.put("last4", C20284AEs.A02(aEs));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("");
            A11.put("remaining_cards", C17890vO.A0V(r6.A00, A10));
            AnonymousClass8pY r0 = (AnonymousClass8pY) aEs.A08;
            if (r0 != null) {
                str = C17880vN.A0t(AnonymousClass000.A11(""), r0.A04);
            } else {
                str = "-1";
            }
            A11.put("remaining_retries", str);
            this.A00.A01("on_success", A11);
            return;
        }
        this.A00.A00("on_failure");
    }

    public C177859Aw(C194839sN r1, AnonymousClass1QS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
