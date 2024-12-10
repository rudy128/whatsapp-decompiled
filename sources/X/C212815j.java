package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.15j  reason: invalid class name and case insensitive filesystem */
public final class C212815j implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("status_crossposting_v3", "status_crossposting_v3_state_idx", "CREATE INDEX IF NOT EXISTS status_crossposting_v3_state_idx ON status_crossposting_v3 (state)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "status_message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A02 = "crossposting_session_id";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "crossposting_status_unique_id";
        obj.A00 = r5;
        obj.A02 = "state";
        obj.A00 = r3;
        obj.A02 = "media_file_path";
        obj.A00 = r5;
        obj.A02 = "direct_url_path";
        obj.A00 = r5;
        obj.A02 = "destination";
        obj.A00 = r3;
        List asList = Arrays.asList(new C25031Mp[]{obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B()});
        C18070vi.A0X(asList);
        r7.CE5("status_crossposting_v3", asList, Collections.singletonList("PRIMARY KEY (status_message_row_id, destination)"));
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message", "status_crossposting_v3", (String) null, "status_message_row_id=old._id");
        r5.CE8("status_crossposting_v3", (String) A01.first, (String) A01.second);
    }
}
