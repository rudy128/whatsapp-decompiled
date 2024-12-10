package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5VX  reason: invalid class name */
public final class AnonymousClass5VX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C108125bA $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ List $results;
    public final /* synthetic */ C86164Qm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VX(C108125bA r2, C86164Qm r3, List list, List list2) {
        super(1);
        this.$results = list;
        this.$inviteeJids = list2;
        this.this$0 = r3;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        this.$results.add(obj);
        if (this.$results.size() == this.$inviteeJids.size()) {
            C86164Qm r2 = this.this$0;
            AnonymousClass3Ma.A1J(r2.A01, r2, 34);
            List list = this.$results;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (next instanceof C821843p) {
                    A13.add(next);
                }
            }
            boolean A1a = AnonymousClass000.A1a(A13);
            C108125bA r1 = this.$callback;
            if (A1a) {
                if (r1 != null) {
                    r1.C7U(this.$results);
                }
            } else if (r1 != null) {
                r1.Bt4(this.$results);
            }
        }
        return C27621Wu.A00;
    }
}
