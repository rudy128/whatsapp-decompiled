package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.14u  reason: invalid class name and case insensitive filesystem */
public final class C211314u implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter", "newsletter_membership_index", "CREATE INDEX IF NOT EXISTS newsletter_membership_index ON newsletter (membership)");
        r5.CDx("newsletter", "newsletter_code_index", "CREATE INDEX IF NOT EXISTS newsletter_code_index ON newsletter (invite_code)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "chat_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "name_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "description";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "description_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "picture_url";
        obj.A00 = r5;
        obj.A02 = "picture_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "preview_url";
        obj.A00 = r5;
        obj.A02 = "preview_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "invite_code";
        obj.A00 = r5;
        obj.A02 = "handle";
        obj.A00 = r5;
        obj.A02 = "subscribers_count";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "membership";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "privacy";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "verified";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "muted";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "oldest_message_retrieved";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "suspended";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "deleted";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "show_enforced_update_banner";
        obj.A00 = r3;
        obj.A02 = "reaction_setting";
        obj.A00 = r3;
        obj.A02 = "reaction_setting_blocklist";
        obj.A00 = C25041Mq.STRING;
        obj.A02 = "reaction_setting_update_ts";
        obj.A00 = r3;
        obj.A02 = "verification_source";
        obj.A00 = r3;
        obj.A02 = "admin_count";
        obj.A00 = r3;
        obj.A02 = "capabilities";
        obj.A00 = r3;
        obj.A02 = "wamo_sub_plan_id";
        obj.A00 = r3;
        obj.A02 = "wamo_sub_status";
        obj.A00 = r3;
        r8.CE6("newsletter", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("chat", "newsletter", (String) null, "chat_row_id=old._id");
        C18070vi.A0b(A01);
        r5.CE8("newsletter", (String) A01.first, (String) A01.second);
    }
}
