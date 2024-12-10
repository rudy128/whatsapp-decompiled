package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63N  reason: invalid class name */
public final class AnonymousClass63N extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63N() {
        super(5190, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
        r3.CHf(6, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A01);
        AnonymousClass184.A0X(A13, 7);
        A13.put(C17880vN.A0i(), this.A00);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0m(), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerSearchResult {");
        AnonymousClass186.A00(this.A01, "giphyResultsCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "stickerProviderOnSend", A10);
        AnonymousClass186.A00(this.A02, "totalResultsCount", A10);
        AnonymousClass186.A00(this.A03, "totalTimeFirstLoad", A10);
        return AnonymousClass184.A0S(this.A04, "wa1pResultsCount", A10);
    }
}
