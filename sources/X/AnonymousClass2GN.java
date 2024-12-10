package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GN  reason: invalid class name */
public final class AnonymousClass2GN extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2GN() {
        super(5602, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(8, this.A04);
        r3.CHf(9, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaFsSingleEmojiMessageDaily {");
        AnonymousClass186.A00(this.A00, "animatedEmojiEnabled", A10);
        AnonymousClass186.A00(this.A01, "animatedEmojiReceiveCnt", A10);
        AnonymousClass186.A00(this.A02, "animatedEmojiSendCnt", A10);
        AnonymousClass186.A00(this.A03, "emojiReplyCount", A10);
        AnonymousClass186.A00(this.A04, "singleEmojiReceiveCnt", A10);
        return AnonymousClass184.A0S(this.A05, "singleEmojiSendCnt", A10);
    }
}
