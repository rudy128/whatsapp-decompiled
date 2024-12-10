package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sF  reason: invalid class name and case insensitive filesystem */
public final class C171768sF extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
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
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;

    public C171768sF() {
        super(5534, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A09);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A0A);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A0B);
        r3.CHf(6, this.A02);
        r3.CHf(7, this.A0C);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A0D);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A0E);
        r3.CHf(12, this.A0F);
        r3.CHf(13, this.A0G);
        r3.CHf(27, this.A05);
        r3.CHf(16, this.A0H);
        r3.CHf(17, this.A0I);
        r3.CHf(18, this.A0J);
        r3.CHf(19, this.A0K);
        r3.CHf(20, this.A06);
        r3.CHf(21, this.A0L);
        r3.CHf(22, this.A0M);
        r3.CHf(23, this.A07);
        r3.CHf(24, this.A0N);
        r3.CHf(25, this.A0O);
        r3.CHf(26, this.A0P);
        r3.CHf(28, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass8BV.A0S(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A09, A13), this.A00, A13), this.A0A, A13), this.A01, A13), this.A0B, A13), this.A02, A13), this.A0C, A13), this.A03, A13), this.A0D, A13), this.A04, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A05);
        A13.put(AnonymousClass8BV.A0T(AnonymousClass8BV.A0R(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(15, AnonymousClass184.A0R(A13, 14), A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A06, A13), this.A0L, A13), this.A0M, A13), this.A07, A13), this.A0N, A13), this.A0O, A13), this.A0P, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEssentialBackupsRestore {");
        AnonymousClass186.A00(this.A09, "avatarRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "avatarRestoreResult", A10);
        AnonymousClass186.A00(this.A0A, "backupSettingsRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "backupSettingsRestoreResult", A10);
        AnonymousClass186.A00(this.A0B, "chatLockRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "chatLockRestoreResult", A10);
        AnonymousClass186.A00(this.A0C, "chatSettingsDbRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "chatSettingsDbRestoreResult", A10);
        AnonymousClass186.A00(this.A0D, "commerceDbRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "commerceDbRestoreResult", A10);
        AnonymousClass186.A00(this.A0E, "paymentBackgroundMediaRestoreDuration", A10);
        AnonymousClass186.A00(this.A0F, "paymentBackgroundMediaRestoreFailedCount", A10);
        AnonymousClass186.A00(this.A0G, "paymentBackgroundMediaRestoreSucceededCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "paymentBackgroundRestoreResult", A10);
        AnonymousClass186.A00(this.A0H, "stickerMediaRestoreDuration", A10);
        AnonymousClass186.A00(this.A0I, "stickerMediaRestoreFailedCount", A10);
        AnonymousClass186.A00(this.A0J, "stickerMediaRestoreSucceededCount", A10);
        AnonymousClass186.A00(this.A0K, "stickersDbRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "stickersDbRestoreResult", A10);
        AnonymousClass186.A00(this.A0L, "totalRestoreDuration", A10);
        AnonymousClass186.A00(this.A0M, "waDbRestoreDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "waDbRestoreResult", A10);
        AnonymousClass186.A00(this.A0N, "wallpaperMediaRestoreDuration", A10);
        AnonymousClass186.A00(this.A0O, "wallpaperMediaRestoreFailedCount", A10);
        AnonymousClass186.A00(this.A0P, "wallpaperMediaRestoreSucceededCount", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A08), "wallpaperRestoreResult", A10);
    }
}
