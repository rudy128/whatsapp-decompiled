package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3yt  reason: invalid class name and case insensitive filesystem */
public final class C81223yt extends AnonymousClass184 {
    public Integer A00;
    public Long A01;

    public C81223yt() {
        super(3918, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDmInterstitialScreenImpression {");
        AnonymousClass186.A00(this.A01, "accountEphemeralityDuration", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "dmScreenEntryPoint", A10);
    }
}
