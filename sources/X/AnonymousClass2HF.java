package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HF  reason: invalid class name */
public final class AnonymousClass2HF extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public AnonymousClass2HF() {
        super(976, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(17, this.A05);
        r3.CHf(4, this.A04);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A07);
        r3.CHf(6, this.A08);
        r3.CHf(12, this.A00);
        r3.CHf(10, this.A0C);
        r3.CHf(18, this.A0D);
        r3.CHf(19, this.A0E);
        r3.CHf(13, this.A01);
        r3.CHf(3, this.A09);
        r3.CHf(14, this.A0A);
        r3.CHf(9, this.A0F);
        r3.CHf(15, this.A02);
        r3.CHf(5, this.A0B);
        r3.CHf(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(17, this.A05);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0C(AnonymousClass184.A0E(AnonymousClass184.A08(AnonymousClass184.A04(AnonymousClass184.A03(C17880vN.A0k(), this.A04, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A01);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A07(AnonymousClass184.A0H(AnonymousClass184.A0B(AnonymousClass184.A0G(C17880vN.A0j(), this.A09, A13), this.A0A, A13), this.A0F, A13), this.A02, A13), this.A0B, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatDatabaseBackupEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A05), "backupType", A10);
        AnonymousClass186.A00(this.A04, "compressionRatio", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "databaseBackupOverallResult", A10);
        AnonymousClass186.A00(this.A07, "databaseBackupVersion", A10);
        AnonymousClass186.A00(this.A08, "freeDiskSpace", A10);
        AnonymousClass186.A00(this.A00, "ftsCleaned", A10);
        AnonymousClass186.A00(this.A0C, "genericBackupFailureReason", A10);
        AnonymousClass186.A00(this.A0D, "incrementalBackupFailedSystemMsgTypes", A10);
        AnonymousClass186.A00(this.A0E, "incrementalBackupFailedUsrMsgTypes", A10);
        AnonymousClass186.A00(this.A01, "indexesCleaned", A10);
        AnonymousClass186.A00(this.A09, "msgstoreBackupSize", A10);
        AnonymousClass186.A00(this.A0A, "savingsPercentageFromCleaning", A10);
        AnonymousClass186.A00(this.A0F, "sqliteVersion", A10);
        AnonymousClass186.A00(this.A02, "thumbnailsCleaned", A10);
        AnonymousClass186.A00(this.A0B, "totalBackupT", A10);
        return AnonymousClass184.A0S(this.A03, "vacuumed", A10);
    }
}
