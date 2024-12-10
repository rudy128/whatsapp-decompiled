package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.14o  reason: invalid class name and case insensitive filesystem */
public final class C210714o implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter_linked_account", "newsletter_linked_account_chat_index", "CREATE INDEX IF NOT EXISTS newsletter_linked_account_chat_index ON newsletter_linked_account (chat_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r1 = C25041Mq.INTEGER;
        obj.A00 = r1;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "link";
        obj.A00 = r2;
        obj.A04 = true;
        r7.CE6("newsletter_linked_account", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("chat", "newsletter_linked_account", (String) null, "chat_row_id=old._id");
        C18070vi.A0b(A01);
        r5.CE8("newsletter_linked_account", (String) A01.first, (String) A01.second);
    }
}
