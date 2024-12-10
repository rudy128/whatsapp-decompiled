package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9oR  reason: invalid class name and case insensitive filesystem */
public class C192469oR {
    public final C191129m4 A00;
    public final AnonymousClass1KH A01;
    public final C30931ek A02;

    public C192469oR(AnonymousClass1KH r1, C191129m4 r2, C30931ek r3) {
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r2;
    }

    public C21132Af0 A00(B9C b9c, B9G b9g, B9H b9h, String str) {
        HashMap A11 = C17880vN.A11();
        A11.put("action", "start");
        A11.put("presentation_style_type", "modal");
        HashMap A112 = C17880vN.A11();
        A112.put("device_id", this.A02.A01());
        C191129m4 r5 = this.A00;
        C20130A8q a8q = r5.A01;
        a8q.A0F(A112);
        C194579rx r8 = new C194579rx("br_p2m_checkout_add_card", (String) null, A11);
        C21132Af0 af0 = new C21132Af0();
        a8q.A0L.put("PaymentData", b9h);
        r5.A00(b9g, new C20905AbL(this, b9c, af0, 4), r8, str, (Map) null);
        return af0;
    }

    public C21132Af0 A01(B9C b9c, B9G b9g, B9H b9h, String str, String str2) {
        HashMap A11 = C17880vN.A11();
        A11.put("action", "start");
        A11.put("credential_id", str);
        AnonymousClass8pK r0 = (AnonymousClass8pK) this.A01.A08(str);
        if (r0 != null) {
            A11.put("network", C20085A6m.A03(r0.A01));
        }
        A11.put("device_id", this.A02.A01());
        C194579rx r6 = new C194579rx("br_p2p_verify_card", "CardAddedScreen", A11);
        C21132Af0 af0 = new C21132Af0();
        C191129m4 r3 = this.A00;
        r3.A01.A0L.put("PaymentData", b9h);
        r3.A00(b9g, new C20905AbL(this, b9c, af0, 4), r6, str2, (Map) null);
        return af0;
    }
}
