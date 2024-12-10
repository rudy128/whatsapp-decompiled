package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s2  reason: invalid class name and case insensitive filesystem */
public final class C171638s2 extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C171638s2() {
        super(5384, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A09);
        r3.CHf(3, this.A0A);
        r3.CHf(4, this.A06);
        r3.CHf(5, this.A01);
        r3.CHf(6, this.A07);
        r3.CHf(7, this.A0B);
        r3.CHf(8, this.A02);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A05);
        r3.CHf(15, this.A08);
        r3.CHf(12, this.A0C);
        r3.CHf(13, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 14);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0H(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A09, A13), this.A0A, A13), this.A06, A13), this.A01, A13), this.A07, A13), this.A0B, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A08, A13), this.A0C, A13), this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGoogleDbRestore {");
        AnonymousClass186.A00(this.A00, "backupRestoreChatdbSize", A10);
        AnonymousClass186.A00(this.A09, "backupRestoreEncryptionVersion", A10);
        AnonymousClass186.A00(this.A0A, "backupRestoreIsWifi", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "backupRestoreMode", A10);
        AnonymousClass186.A00(this.A01, "backupRestoreNetworkRequestCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "backupRestoreResult", A10);
        AnonymousClass186.A00(this.A0B, "backupRestoreT", A10);
        AnonymousClass186.A00(this.A02, "backupRestoreTotalSize", A10);
        AnonymousClass186.A00(this.A03, "backupRestoreTransferFailedSize", A10);
        AnonymousClass186.A00(this.A04, "backupRestoreTransferSize", A10);
        AnonymousClass186.A00(this.A05, "backupRestoreUserSettingsSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "essentialFilesDownloadResult", A10);
        AnonymousClass186.A00(this.A0C, "incrementalRestoreFileCount", A10);
        return AnonymousClass184.A0S(this.A0D, "restoreConcurrentReadsCount", A10);
    }
}
