package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.136  reason: invalid class name */
public class AnonymousClass136 implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("frequent", "frequent_index", "CREATE UNIQUE INDEX IF NOT EXISTS frequent_index ON frequent (jid_row_id, type)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "message_count";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("frequent", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
