package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sL  reason: invalid class name and case insensitive filesystem */
public final class C171828sL extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
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
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;

    public C171828sL() {
        super(3534, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A0E);
        r3.CHf(8, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(9, this.A0F);
        r3.CHf(10, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(11, this.A0G);
        r3.CHf(12, this.A05);
        r3.CHf(13, this.A0H);
        r3.CHf(14, this.A06);
        r3.CHf(15, this.A0I);
        r3.CHf(16, this.A07);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A08);
        r3.CHf(4, this.A0J);
        r3.CHf(5, this.A09);
        r3.CHf(36, this.A0A);
        r3.CHf(17, this.A0K);
        r3.CHf(18, this.A0L);
        r3.CHf(19, this.A0M);
        r3.CHf(20, this.A0N);
        r3.CHf(23, this.A0O);
        r3.CHf(24, this.A0P);
        r3.CHf(25, this.A0Q);
        r3.CHf(26, this.A0R);
        r3.CHf(27, this.A0S);
        r3.CHf(28, this.A0B);
        r3.CHf(29, this.A0T);
        r3.CHf(30, this.A0C);
        r3.CHf(37, this.A0D);
        r3.CHf(31, this.A0U);
        r3.CHf(32, this.A0V);
        r3.CHf(33, this.A0W);
        r3.CHf(34, this.A0X);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A08(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A03(AnonymousClass184.A0A(C108955ca.A0e(), this.A0E, A13), this.A01, A13), this.A02, A13), this.A0F, A13), this.A03, A13), this.A04, A13), this.A0G, A13), this.A05, A13), this.A0H, A13), this.A06, A13), this.A0I, A13), this.A07);
        AnonymousClass184.A0X(A13, 35);
        A13.put(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass8BV.A0Z(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A00, A13), this.A08, A13), this.A0J, A13), this.A09, A13), this.A0A, A13), this.A0K, A13), this.A0L, A13), this.A0M, A13), this.A0N);
        A13.put(C108975cc.A0V(AnonymousClass8BV.A0U(AnonymousClass8BV.A0T(AnonymousClass8BV.A0S(AnonymousClass8BV.A0R(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0P(22, AnonymousClass184.A0R(A13, 21), A13), this.A0O, A13), this.A0P, A13), this.A0Q, A13), this.A0R, A13), this.A0S, A13), this.A0B, A13), this.A0T, A13), this.A0C);
        A13.put(AnonymousClass8BV.A0X(AnonymousClass8BV.A0W(AnonymousClass8BV.A0V(C108975cc.A0W(37, this.A0D, A13), this.A0U, A13), this.A0V, A13), this.A0W, A13), this.A0X);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamLocalBackup {");
        AnonymousClass186.A00(this.A0E, "avatarBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "avatarBackupResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "backupSchedule", A10);
        AnonymousClass186.A00(this.A0F, "backupSettingsBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "backupSettingsBackupResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "backupType", A10);
        AnonymousClass186.A00(this.A0G, "chatLockBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "chatLockBackupResult", A10);
        AnonymousClass186.A00(this.A0H, "chatSettingsDbBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "chatSettingsDbBackupResult", A10);
        AnonymousClass186.A00(this.A0I, "commerceDbBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "commerceDbBackupResult", A10);
        AnonymousClass186.A00(this.A00, "localBackupGoogleBackupScheduled", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "localBackupResult", A10);
        AnonymousClass186.A00(this.A0J, "localBackupStartTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "localBackupTriggerType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "paymentBackgroundBackupResult", A10);
        AnonymousClass186.A00(this.A0K, "paymentBackgroundMediaBackupDuration", A10);
        AnonymousClass186.A00(this.A0L, "paymentBackgroundMediaBackupFailedCount", A10);
        AnonymousClass186.A00(this.A0M, "paymentBackgroundMediaBackupSkippedCount", A10);
        AnonymousClass186.A00(this.A0N, "paymentBackgroundMediaBackupSucceededCount", A10);
        AnonymousClass186.A00(this.A0O, "stickerMediaBackupDuration", A10);
        AnonymousClass186.A00(this.A0P, "stickerMediaBackupFailedCount", A10);
        AnonymousClass186.A00(this.A0Q, "stickerMediaBackupSkippedCount", A10);
        AnonymousClass186.A00(this.A0R, "stickerMediaBackupSucceededCount", A10);
        AnonymousClass186.A00(this.A0S, "stickersDbBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "stickersDbBackupResult", A10);
        AnonymousClass186.A00(this.A0T, "waDbBackupDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "waDbBackupResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0D), "wallpaperBackupResult", A10);
        AnonymousClass186.A00(this.A0U, "wallpaperMediaBackupDuration", A10);
        AnonymousClass186.A00(this.A0V, "wallpaperMediaBackupFailedCount", A10);
        AnonymousClass186.A00(this.A0W, "wallpaperMediaBackupSkippedCount", A10);
        return AnonymousClass184.A0S(this.A0X, "wallpaperMediaBackupSucceededCount", A10);
    }
}
