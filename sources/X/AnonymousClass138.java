package X;

import android.text.TextUtils;

/* renamed from: X.138  reason: invalid class name */
public class AnonymousClass138 implements AnonymousClass12T, AnonymousClass137 {
    public static final String[] A00 = {""};

    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public void BHt(C23141Ev r5) {
        if (TextUtils.isEmpty(C28331Zy.A00(r5, "table", "message_ftsv2"))) {
            r5.A0E("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)", "CREATE_MESSAGE_FTS_TABLE");
            C28341Zz.A02(r5, "fts_index_start", "FtsTable", 0);
        }
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r2) {
        r2.CE7(this, "message_ftsv2");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message", "message_ftsv2", (String) null, "docid=old._id"), "message_ftsv2");
    }
}
