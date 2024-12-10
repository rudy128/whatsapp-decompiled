package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class ARW implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("remote_files", "remote_files_backup_id_upload_title_index", "CREATE INDEX IF NOT EXISTS remote_files_backup_id_upload_title_index on remote_files (backup_id, upload_title)");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25071Mt.A00("remote_files"), "remote_files");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C25021Mo A06 = C18070vi.A06(r7);
        C25031Mp[] r2 = new C25031Mp[11];
        A06.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        C25041Mq r5 = C25041Mq.INTEGER;
        A06.A00 = r5;
        A06.A0D();
        A06.A0C();
        C25021Mo.A09(A06, r2);
        A06.A02 = "backup_id";
        A06.A00 = r5;
        C25021Mo.A07(A06, r2);
        A06.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C25041Mq r3 = C25041Mq.TEXT;
        C25021Mo.A04(A06, r3, r2);
        AnonymousClass8BR.A1F(A06, r3, "upload_title");
        C25021Mo.A08(A06, r2);
        A06.A02 = "mime_type";
        C25021Mo.A05(A06, r3, r2);
        AnonymousClass8BR.A1F(A06, r3, "md5_hash");
        r2[5] = A06.A0B();
        AnonymousClass8BR.A1F(A06, r5, "size_bytes");
        r2[6] = A06.A0B();
        AnonymousClass8BR.A1F(A06, r5, "upload_time");
        r2[7] = A06.A0B();
        r2[8] = C25021Mo.A02(A06, r3, "metadata");
        r2[9] = C25021Mo.A02(A06, r5, "state");
        r2[10] = C25021Mo.A02(A06, r3, "transaction_id");
        r7.CE6("remote_files", r2);
    }
}
