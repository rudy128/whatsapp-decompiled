package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.13F  reason: invalid class name */
public class AnonymousClass13F implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("jid", "jid_key_new_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_key_new_index ON jid (user, server, agent, device, type)");
        r5.CDx("jid", "jid_raw_string_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_raw_string_index ON jid (raw_string)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "server";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "agent";
        obj.A00 = r5;
        obj.A02 = "device";
        obj.A00 = r5;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r5;
        obj.A02 = "raw_string";
        obj.A00 = r3;
        r8.CE6("jid", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
