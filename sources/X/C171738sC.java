package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sC  reason: invalid class name and case insensitive filesystem */
public final class C171738sC extends AnonymousClass184 {
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
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;

    public C171738sC() {
        super(4224, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(34, this.A00);
        r3.CHf(36, this.A01);
        r3.CHf(37, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A07);
        r3.CHf(7, this.A08);
        r3.CHf(8, this.A09);
        r3.CHf(40, this.A0A);
        r3.CHf(9, this.A0B);
        r3.CHf(41, this.A0C);
        r3.CHf(10, this.A0D);
        r3.CHf(13, this.A0E);
        r3.CHf(14, this.A0F);
        r3.CHf(15, this.A0G);
        r3.CHf(16, this.A0H);
        r3.CHf(17, this.A0I);
        r3.CHf(20, this.A0J);
        r3.CHf(21, this.A0K);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(34, this.A00);
        AnonymousClass184.A0X(A13, 35);
        A13.put(36, this.A01);
        A13.put(37, this.A02);
        AnonymousClass184.A0X(A13, 38);
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(C17880vN.A0k(), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09);
        A13.put(AnonymousClass184.A0B(40, this.A0A, A13), this.A0B);
        AnonymousClass184.A0X(A13, 39);
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(41, this.A0C, A13), this.A0D, A13), (Object) null, A13), (Object) null, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I);
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A0M(19, AnonymousClass184.A0R(A13, 18), A13), this.A0J, A13), this.A0K);
        AnonymousClass184.A0X(A13, 22);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamScreenShareInfo {");
        AnonymousClass186.A00(this.A00, "audShareDialogCount", A10);
        AnonymousClass186.A00(this.A01, "audShareIssue", A10);
        AnonymousClass186.A00(this.A02, "audShareLastIssue", A10);
        AnonymousClass186.A00(this.A03, "ssAvgCaptureFps", A10);
        AnonymousClass186.A00(this.A04, "ssFreezeCount", A10);
        AnonymousClass186.A00(this.A05, "ssIssue", A10);
        AnonymousClass186.A00(this.A06, "ssLastIssue", A10);
        AnonymousClass186.A00(this.A07, "ssPermission", A10);
        AnonymousClass186.A00(this.A08, "ssPinchToZoom", A10);
        AnonymousClass186.A00(this.A09, "ssReceiverLandscapeDuration", A10);
        AnonymousClass186.A00(this.A0A, "ssReceiverMaxConnectedParticipants", A10);
        AnonymousClass186.A00(this.A0B, "ssReceiverPipDuration", A10);
        AnonymousClass186.A00(this.A0C, "ssSharerMaxConnectedParticipants", A10);
        AnonymousClass186.A00(this.A0D, "ssSharerPipDuration", A10);
        AnonymousClass186.A00(this.A0E, "ssSharerStopReason", A10);
        AnonymousClass186.A00(this.A0F, "ssStartDuration", A10);
        AnonymousClass186.A00(this.A0G, "ssStopDuration", A10);
        AnonymousClass186.A00(this.A0H, "ssTimeToFirstFrame", A10);
        AnonymousClass186.A00(this.A0I, "ssUserOpenedPickerCount", A10);
        AnonymousClass186.A00(this.A0J, "ssUserStartScreenShareCount", A10);
        return AnonymousClass184.A0S(this.A0K, "ssUserStopScreenShareCount", A10);
    }
}
