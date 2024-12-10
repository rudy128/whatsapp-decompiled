package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.14Y  reason: invalid class name */
public class AnonymousClass14Y implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "subgroup_raw_jid";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "subgroup_subject";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "parent_group_jid_row_id";
        obj.A00 = r3;
        r7.CE5("message_system_sibling_group_link_change", Arrays.asList(new C25031Mp[]{obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B()}), Collections.singletonList("PRIMARY KEY (message_row_id, subgroup_raw_jid)"));
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_system", "message_system_sibling_group_link_change", (String) null, "message_row_id=old.message_row_id"), "message_system_sibling_group_link_change");
    }
}
