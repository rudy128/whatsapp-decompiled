package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rw  reason: invalid class name and case insensitive filesystem */
public final class C171578rw extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public C171578rw() {
        super(5178, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(10, this.A07);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A08);
        r3.CHf(11, this.A09);
        r3.CHf(7, this.A0A);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A0B);
        r3.CHf(12, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0D(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass8BS.A0U(), this.A07, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A05, A13), this.A06, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A03, A13), this.A0B, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamQbmMessageClick {");
        AnonymousClass186.A00(this.A07, "bizTrustTier", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "buttonClickedType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "chatsFolderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "contactType", A10);
        AnonymousClass186.A00(this.A05, "deltaTime", A10);
        AnonymousClass186.A00(this.A06, "deltaTimeReceived", A10);
        AnonymousClass186.A00(this.A08, "hsmTagStr", A10);
        AnonymousClass186.A00(this.A09, "messageIdHmac", A10);
        AnonymousClass186.A00(this.A0A, "messageTypeStr", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "qbmFlag", A10);
        AnonymousClass186.A00(this.A0B, "threadIdHmac", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "thumbnailType", A10);
    }
}
