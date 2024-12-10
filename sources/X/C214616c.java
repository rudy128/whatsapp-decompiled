package X;

import java.util.List;

/* renamed from: X.16c  reason: invalid class name and case insensitive filesystem */
public class C214616c extends AnonymousClass16Z {
    public C214616c() {
        super("call_log");
        C61662q3 r0 = new C61662q3("call_log", "_id");
        List list = this.A01;
        list.add(r0);
        list.add(new C61662q3("call_link", "_id"));
        list.add(new C61662q3("call_log_participant_v2", "_id"));
        list.add(new C61662q3("joinable_call_log", "call_log_row_id"));
    }
}
