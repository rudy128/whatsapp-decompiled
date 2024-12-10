package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.620  reason: invalid class name */
public final class AnonymousClass620 extends AnonymousClass184 {
    public Integer A00;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
    }

    public AnonymousClass620() {
        super(1124, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGifFromProviderSent {");
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "gifSearchProvider", A10);
    }
}
