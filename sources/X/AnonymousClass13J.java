package X;

import android.text.TextUtils;

@Deprecated
/* renamed from: X.13J  reason: invalid class name */
public class AnonymousClass13J implements AnonymousClass12T, AnonymousClass137 {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public void BHt(C23141Ev r3) {
        if (TextUtils.isEmpty(C28331Zy.A00(r3, "table", "labeled_messages_fts"))) {
            r3.A0E("CREATE VIRTUAL TABLE labeled_messages_fts USING FTS3()", "CREATE_LABELED_MESSAGES_FTS_TABLE");
        }
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r2) {
        r2.CE7(this, "labeled_messages_fts");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message", "labeled_messages_fts", (String) null, "docid=old._id"), "labeled_messages_fts");
    }
}
