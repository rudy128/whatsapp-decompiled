package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s7  reason: invalid class name and case insensitive filesystem */
public final class C171688s7 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;

    public C171688s7() {
        super(486, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A02);
        r3.CHf(19, this.A0B);
        r3.CHf(5, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A0C);
        r3.CHf(12, this.A03);
        r3.CHf(9, this.A04);
        r3.CHf(22, this.A09);
        r3.CHf(13, this.A05);
        r3.CHf(1, this.A0A);
        r3.CHf(6, this.A0D);
        r3.CHf(7, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(10, this.A08);
        r3.CHf(23, this.A0E);
        r3.CHf(14, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 16);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A0L(AnonymousClass3MY.A0g(), this.A02, A13), this.A0B, A13), this.A00, A13), this.A01, A13), this.A0C, A13), this.A03);
        AnonymousClass184.A0X(A13, 20);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0F(AnonymousClass184.A0O(C108955ca.A0f(), this.A04, A13), this.A09, A13), this.A05, A13), this.A0A);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0D(AnonymousClass184.A09(C17880vN.A0m(), this.A0D, A13), this.A06, A13), this.A07, A13), this.A08);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0P(17, AnonymousClass184.A0R(A13, 21), A13), this.A0E, A13), this.A0F);
        AnonymousClass184.A0X(A13, 15);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamRestore {");
        AnonymousClass186.A00(this.A02, "backupRestoreChatdbSize", A10);
        AnonymousClass186.A00(this.A0B, "backupRestoreEncryptionVersion", A10);
        AnonymousClass186.A00(this.A00, "backupRestoreIncludeVideos", A10);
        AnonymousClass186.A00(this.A01, "backupRestoreIsFull", A10);
        AnonymousClass186.A00(this.A0C, "backupRestoreIsWifi", A10);
        AnonymousClass186.A00(this.A03, "backupRestoreMediaFileCount", A10);
        AnonymousClass186.A00(this.A04, "backupRestoreMediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "backupRestoreMode", A10);
        AnonymousClass186.A00(this.A05, "backupRestoreNetworkRequestCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "backupRestoreResult", A10);
        AnonymousClass186.A00(this.A0D, "backupRestoreT", A10);
        AnonymousClass186.A00(this.A06, "backupRestoreTotalSize", A10);
        AnonymousClass186.A00(this.A07, "backupRestoreTransferFailedSize", A10);
        AnonymousClass186.A00(this.A08, "backupRestoreTransferSize", A10);
        AnonymousClass186.A00(this.A0E, "incrementalBackupRestoreFileCount", A10);
        return AnonymousClass184.A0S(this.A0F, "restoreConcurrentReadsCount", A10);
    }
}
