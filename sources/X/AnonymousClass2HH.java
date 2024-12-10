package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HH  reason: invalid class name */
public final class AnonymousClass2HH extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;

    public AnonymousClass2HH() {
        super(4454, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0G);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A08);
        r3.CHf(11, this.A09);
        r3.CHf(12, this.A0A);
        r3.CHf(13, this.A0B);
        r3.CHf(14, this.A0C);
        r3.CHf(15, this.A0D);
        r3.CHf(16, this.A0E);
        r3.CHf(17, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A0G, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPaymentsAnonymousDaily {");
        AnonymousClass186.A00(this.A0G, "bizQrCodePhotoReceived", A10);
        AnonymousClass186.A00(this.A00, "invitedUserCnt", A10);
        AnonymousClass186.A00(this.A01, "invitedUserRegisteredCnt", A10);
        AnonymousClass186.A00(this.A02, "inviterUserCnt", A10);
        AnonymousClass186.A00(this.A03, "invitesReceivedToUserCnt", A10);
        AnonymousClass186.A00(this.A04, "invitesSentToUserCnt", A10);
        AnonymousClass186.A00(this.A05, "startTs", A10);
        AnonymousClass186.A00(this.A06, "totalOneTimeMandateCnt", A10);
        AnonymousClass186.A00(this.A07, "totalRecurringMandateCnt", A10);
        AnonymousClass186.A00(this.A08, "totalTransactionReceivedCnt", A10);
        AnonymousClass186.A00(this.A09, "totalTransactionSentCnt", A10);
        AnonymousClass186.A00(this.A0A, "transactionReceivedWithBackgroundAndStickerCnt", A10);
        AnonymousClass186.A00(this.A0B, "transactionReceivedWithBackgroundCnt", A10);
        AnonymousClass186.A00(this.A0C, "transactionReceivedWithStickerCnt", A10);
        AnonymousClass186.A00(this.A0D, "transactionSentWithBackgroundAndStickerCnt", A10);
        AnonymousClass186.A00(this.A0E, "transactionSentWithBackgroundCnt", A10);
        return AnonymousClass184.A0S(this.A0F, "transactionSentWithStickerCnt", A10);
    }
}
