package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63A  reason: invalid class name */
public final class AnonymousClass63A extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public AnonymousClass63A() {
        super(3802, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A00, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUrlReceive {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "inlineVideoType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messageType", A10);
        AnonymousClass186.A00(this.A00, "mmsThumbnailUrlAvail", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "urlPreviewState", A10);
    }
}
