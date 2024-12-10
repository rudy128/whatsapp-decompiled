package X;

import android.content.ContentValues;

/* renamed from: X.31X  reason: invalid class name */
public class AnonymousClass31X implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r4) {
        ? obj = new Object();
        C25031Mp[] r1 = new C25031Mp[3];
        obj.A02 = "_id";
        C25021Mo.A06(obj, C25021Mo.A03(obj, C25021Mo.A00(obj, C25041Mq.INTEGER), r1), r1);
        r4.CE6("wa_props", r1);
    }

    public static void A00(C23141Ev r5) {
        ContentValues A08 = C17890vO.A08();
        A08.put("prop_name", "wa_db_schema_version");
        A08.put("prop_value", "ConsumerRelease-a57e79967fd57aa08a5d22f0369c7c5d");
        r5.A08("wa_props", AnonymousClass2TU.A00("WaDatabaseHelper", "setProp", "WADB_REPLACE_PROPS_STRING"), A08);
    }
}
