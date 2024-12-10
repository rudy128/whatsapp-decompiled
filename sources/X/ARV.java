package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class ARV implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("local_files", "local_files_backup_id_upload_title_index", "CREATE INDEX IF NOT EXISTS local_files_backup_id_upload_title_index on local_files (backup_id, upload_title)");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25071Mt.A00("local_files"), "local_files");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r5) {
        C25021Mo A06 = C18070vi.A06(r5);
        C25031Mp[] r2 = new C25031Mp[6];
        A06.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        C25041Mq r1 = C25041Mq.INTEGER;
        A06.A00 = r1;
        A06.A0D();
        A06.A0C();
        C25021Mo.A09(A06, r2);
        A06.A02 = "backup_id";
        A06.A00 = r1;
        C25021Mo.A07(A06, r2);
        A06.A02 = "upload_title";
        C25041Mq r12 = C25041Mq.TEXT;
        C25021Mo.A04(A06, r12, r2);
        A06.A02 = "transaction_id";
        A06.A00 = r12;
        C25021Mo.A08(A06, r2);
        r2[4] = C25021Mo.A02(A06, r12, "metadata");
        A06.A02 = "media_decryption_hash";
        A06.A00 = C25041Mq.BLOB;
        r2[5] = A06.A0B();
        r5.CE6("local_files", r2);
    }
}
