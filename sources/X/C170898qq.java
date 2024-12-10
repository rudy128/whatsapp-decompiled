package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qq  reason: invalid class name and case insensitive filesystem */
public final class C170898qq extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Long A02;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A00);
    }

    public C170898qq() {
        super(3738, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCallReplayerUpload {");
        AnonymousClass186.A00(this.A01, "compressionGain", A10);
        AnonymousClass186.A00(this.A02, "sizeAfterCompression", A10);
        return AnonymousClass184.A0S(this.A00, "uploadSuccess", A10);
    }
}
