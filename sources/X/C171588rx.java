package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rx  reason: invalid class name and case insensitive filesystem */
public final class C171588rx extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(12, this.A04);
        r3.CHf(13, this.A05);
        r3.CHf(10, this.A01);
        r3.CHf(11, this.A02);
        r3.CHf(1, this.A06);
        r3.CHf(6, this.A00);
        r3.CHf(3, this.A07);
        r3.CHf(8, this.A08);
        r3.CHf(5, this.A09);
        r3.CHf(9, this.A03);
        r3.CHf(7, this.A0A);
        r3.CHf(4, this.A0B);
    }

    public C171588rx() {
        super(2496, new C18180vt(1000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0F(C108955ca.A0h(), this.A04, A13), this.A05);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A06(AnonymousClass184.A09(AnonymousClass184.A0B(AnonymousClass184.A07(AnonymousClass184.A0A(AnonymousClass184.A05(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass184.A0D(AnonymousClass8BS.A0U(), this.A01, A13), this.A02, A13), this.A06, A13), this.A00, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A03, A13), this.A0A, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReceiptStanzaReceive {");
        AnonymousClass186.A00(this.A04, "dbReadsCount", A10);
        AnonymousClass186.A00(this.A05, "dbWritesCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "messageType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "receiptAggregation", A10);
        AnonymousClass186.A00(this.A06, "receiptStanzaDuration", A10);
        AnonymousClass186.A00(this.A00, "receiptStanzaHasOrphaned", A10);
        AnonymousClass186.A00(this.A07, "receiptStanzaOfflineCount", A10);
        AnonymousClass186.A00(this.A08, "receiptStanzaProcessedCount", A10);
        AnonymousClass186.A00(this.A09, "receiptStanzaRetryVer", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "receiptStanzaStage", A10);
        AnonymousClass186.A00(this.A0A, "receiptStanzaTotalCount", A10);
        return AnonymousClass184.A0S(this.A0B, "receiptStanzaType", A10);
    }
}
