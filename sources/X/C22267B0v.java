package X;

import com.whatsapp.group.batch.FetchTruncatedGroupsJob;
import java.util.Map;

/* renamed from: X.B0v  reason: case insensitive filesystem */
public final class C22267B0v extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;
    public final /* synthetic */ FetchTruncatedGroupsJob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22267B0v(FetchTruncatedGroupsJob fetchTruncatedGroupsJob, C26981Ug r3) {
        super(1);
        this.this$0 = fetchTruncatedGroupsJob;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C180449Mp r12 = (C180449Mp) obj;
        C18070vi.A0d(r12, 0);
        FetchTruncatedGroupsJob fetchTruncatedGroupsJob = this.this$0;
        C26981Ug r3 = this.$callbackFuture;
        if (r12 instanceof AnonymousClass9HL) {
            C19984A1u a1u = (C19984A1u) ((AnonymousClass9HL) r12).A00;
            Map map = a1u.A03;
            if (AnonymousClass8BR.A1Y(map)) {
                AnonymousClass190 r9 = fetchTruncatedGroupsJob.A00;
                if (r9 != null) {
                    String A0s = AnonymousClass8BV.A0s(AnonymousClass1Y7.A02("GroupInfoBatchProcessor/FetchTruncatedGroupJob some groups\n          | failed to be fetched due to errors"), "\n");
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Failed: ");
                    A10.append(map.size());
                    A10.append(", Errors: [");
                    A10.append(C29431cG.A0h(", ", map.values(), B31.A00));
                    r9.A0G(A0s, C17890vO.A0c(A10, ']'), false);
                } else {
                    str = "crashLogs";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            C199369zs r6 = fetchTruncatedGroupsJob.A05;
            if (r6 != null) {
                int i = fetchTruncatedGroupsJob.round;
                int i2 = fetchTruncatedGroupsJob.params;
                C194449rk A01 = r6.A01(fetchTruncatedGroupsJob.batchGetGroupInfoContext, a1u.A02, i, i2);
                C194449rk r2 = new C194449rk(map, A01.A01, A01.A02);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/sent fetched group info for further\n                | processing; round=");
                AnonymousClass8BV.A0s(AnonymousClass1Y7.A02(C17880vN.A0t(A102, fetchTruncatedGroupsJob.round)), "\n");
                r3.BrF(r2);
            } else {
                str = "groupInfoProcessor";
                C18070vi.A11(str);
                throw null;
            }
        } else if (r12 instanceof AnonymousClass9HK) {
            AnonymousClass9HK r122 = (AnonymousClass9HK) r12;
            C22265B0t b0t = new C22265B0t(fetchTruncatedGroupsJob, r3);
            if (r122 instanceof AnonymousClass9HI) {
                b0t.invoke(((AnonymousClass9HI) r122).A00);
            }
            C22266B0u b0u = new C22266B0u(fetchTruncatedGroupsJob, r3);
            if (r122 instanceof AnonymousClass9HJ) {
                b0u.invoke(((AnonymousClass9HJ) r122).A00);
            }
        }
        return C27621Wu.A00;
    }
}
