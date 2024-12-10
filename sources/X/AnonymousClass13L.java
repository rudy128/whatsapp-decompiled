package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.13L  reason: invalid class name */
public class AnonymousClass13L implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("labels", "labels_sort_id", "CREATE INDEX IF NOT EXISTS labels_sort_id ON labels (sort_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "label_name";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "predefined_id";
        obj.A00 = r3;
        obj.A02 = "color_id";
        obj.A00 = r3;
        obj.A02 = "sort_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "hidden";
        obj.A00 = r3;
        r8.CE6("labels", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
