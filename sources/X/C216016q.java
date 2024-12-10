package X;

import java.util.List;

/* renamed from: X.16q  reason: invalid class name and case insensitive filesystem */
public class C216016q extends AnonymousClass16Z {
    public C216016q() {
        super("receipt");
        C61662q3 r0 = new C61662q3("receipt_user", "_id");
        List list = this.A01;
        list.add(r0);
        list.add(new C61662q3("receipt_device", "_id"));
        list.add(new C61662q3("message_add_on_receipt_device", "receipt_device_id"));
        list.add(new C61662q3("receipt_orphaned", "_id"));
        list.add(new C61662q3("played_self_receipt", "message_row_id"));
    }
}
