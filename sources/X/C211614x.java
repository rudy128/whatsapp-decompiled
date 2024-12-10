package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.14x  reason: invalid class name and case insensitive filesystem */
public class C211614x implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("pay_transaction", "message_payment_transaction_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transaction_id_index ON pay_transaction (id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "remote_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "key_id";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "interop_id";
        obj.A00 = r5;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        obj.A00 = r5;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A02 = "status";
        obj.A00 = r3;
        obj.A02 = "error_code";
        obj.A00 = r5;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "receiver_jid_row_id";
        obj.A00 = r3;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r3;
        obj.A02 = "currency_code";
        obj.A00 = r5;
        obj.A02 = "amount_1000";
        obj.A00 = C25041Mq.UNSPECIFIED;
        obj.A02 = "credential_id";
        obj.A00 = r5;
        obj.A02 = "methods";
        obj.A00 = r5;
        obj.A02 = "bank_transaction_id";
        obj.A00 = r5;
        obj.A02 = "metadata";
        obj.A00 = r5;
        obj.A02 = "init_timestamp";
        obj.A00 = r3;
        obj.A02 = "request_key_id";
        obj.A00 = r5;
        obj.A02 = "country";
        obj.A00 = r5;
        obj.A02 = "version";
        obj.A00 = r3;
        obj.A02 = "future_data";
        obj.A00 = C25041Mq.BLOB;
        obj.A02 = "service_id";
        obj.A00 = r3;
        obj.A02 = "background_id";
        obj.A00 = r5;
        obj.A02 = "purchase_initiator";
        obj.A00 = r3;
        r7.CE6("pay_transaction", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
