package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class ARU implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("backups", "backup_account_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS backup_account_jid_index on backups (account_name, jid_user)");
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r3 = new C25031Mp[4];
        A06.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        C25041Mq r2 = C25041Mq.INTEGER;
        A06.A00 = r2;
        A06.A0D();
        A06.A0C();
        C25021Mo.A09(A06, r3);
        A06.A02 = "account_name";
        C25041Mq r1 = C25041Mq.TEXT;
        A06.A00 = r1;
        C25021Mo.A07(A06, r3);
        A06.A02 = "jid_user";
        C25021Mo.A04(A06, r1, r3);
        AnonymousClass8BR.A1F(A06, r2, "update_time");
        C25021Mo.A08(A06, r3);
        r6.CE6("backups", r3);
    }
}
