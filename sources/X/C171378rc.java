package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rc  reason: invalid class name and case insensitive filesystem */
public final class C171378rc extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C171378rc() {
        super(2900, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(10, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(5, this.A00);
        r3.CHf(7, this.A05);
        r3.CHf(1, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(4, this.A01);
        r3.CHf(6, this.A08);
        r3.CHf(9, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A06(AnonymousClass184.A0A(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A07(C108975cc.A0S(AnonymousClass8BS.A0U(), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A01, A13), this.A08, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEncryptedBackupsInitial {");
        AnonymousClass186.A00(this.A03, "backupRestoreInSessionRetryCount", A10);
        AnonymousClass186.A00(this.A04, "reencryptionMediaFilesEncrypted", A10);
        AnonymousClass186.A00(this.A00, "reencryptionMediaProgress", A10);
        AnonymousClass186.A00(this.A05, "reencryptionMediaTime", A10);
        AnonymousClass186.A00(this.A06, "reencryptionOverallFilesEncrypted", A10);
        AnonymousClass186.A00(this.A07, "reencryptionOverallMibytes", A10);
        AnonymousClass186.A00(this.A01, "reencryptionOverallProgress", A10);
        AnonymousClass186.A00(this.A08, "reencryptionOverallTime", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "reencryptionResult", A10);
    }
}
