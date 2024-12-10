package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HQ  reason: invalid class name */
public final class AnonymousClass2HQ extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;

    public AnonymousClass2HQ() {
        super(932, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(14, this.A0D);
        r3.CHf(26, this.A0A);
        r3.CHf(11, this.A0B);
        r3.CHf(22, this.A00);
        r3.CHf(2, this.A0E);
        r3.CHf(10, this.A0F);
        r3.CHf(5, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(1, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(12, this.A0C);
        r3.CHf(6, this.A06);
        r3.CHf(9, this.A07);
        r3.CHf(20, this.A0M);
        r3.CHf(7, this.A08);
        r3.CHf(23, this.A0G);
        r3.CHf(29, this.A0H);
        r3.CHf(27, this.A0I);
        r3.CHf(28, this.A0J);
        r3.CHf(24, this.A0K);
        r3.CHf(13, this.A0L);
        r3.CHf(25, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 16);
        A13.put(14, this.A0D);
        A13.put(AnonymousClass184.A0D(26, this.A0A, A13), this.A0B);
        AnonymousClass184.A0X(A13, 17);
        A13.put(22, this.A00);
        AnonymousClass184.A0X(A13, 19);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0M(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A0E(AnonymousClass184.A0A(AnonymousClass184.A03(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A0C(C17880vN.A0i(), this.A0E, A13), this.A0F, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A0C, A13), this.A06, A13), this.A07, A13), this.A0M, A13), this.A08);
        AnonymousClass184.A0X(A13, 18);
        A13.put(23, this.A0G);
        A13.put(29, this.A0H);
        A13.put(27, this.A0I);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0Q(28, this.A0J, A13), this.A0K, A13), this.A0L);
        AnonymousClass184.A0X(A13, 15);
        A13.put(25, this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatDatabaseRestoreEvent {");
        AnonymousClass186.A00(this.A0D, "backupFileIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "backupRestoreMode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "backupRestoreStatusOfBackupFoundAtRestoreTime", A10);
        AnonymousClass186.A00(this.A00, "cleanedBackup", A10);
        AnonymousClass186.A00(this.A0E, "databaseBackupVersion", A10);
        AnonymousClass186.A00(this.A0F, "databaseDumpAndRestoreRecoveryPercentage", A10);
        AnonymousClass186.A00(this.A01, "databaseRepairEnabled", A10);
        AnonymousClass186.A00(this.A02, "databaseRestoreCorrectJid", A10);
        AnonymousClass186.A00(this.A03, "databaseRestoreFileIntegrityCheck", A10);
        AnonymousClass186.A00(this.A04, "databaseRestoreOverallResult", A10);
        AnonymousClass186.A00(this.A05, "databaseRestoreReindexingResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "databaseRestoreResultDetails", A10);
        AnonymousClass186.A00(this.A06, "databaseRestoreSqliteIntegrityCheckResult", A10);
        AnonymousClass186.A00(this.A07, "dbDumpAndRestoreResult", A10);
        AnonymousClass186.A00(this.A0M, "genericFailureReason", A10);
        AnonymousClass186.A00(this.A08, "hasOnlyIndexErrors", A10);
        AnonymousClass186.A00(this.A0G, "restoreChatDbTimeSec", A10);
        AnonymousClass186.A00(this.A0H, "restoreFailedIncrementIndex", A10);
        AnonymousClass186.A00(this.A0I, "restoreIncrementFileCount", A10);
        AnonymousClass186.A00(this.A0J, "restoreIncrementsTimeSec", A10);
        AnonymousClass186.A00(this.A0K, "restoreIndexesTimeSec", A10);
        AnonymousClass186.A00(this.A0L, "restoreTimeBackupFilesCount", A10);
        return AnonymousClass184.A0S(this.A09, "restoredIndexes", A10);
    }
}
