package X;

import com.whatsapp.group.batch.FetchTruncatedGroupsJob;

/* renamed from: X.B0t  reason: case insensitive filesystem */
public final class C22265B0t extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;
    public final /* synthetic */ FetchTruncatedGroupsJob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22265B0t(FetchTruncatedGroupsJob fetchTruncatedGroupsJob, C26981Ug r3) {
        super(1);
        this.this$0 = fetchTruncatedGroupsJob;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C19984A1u a1u = (C19984A1u) obj;
        C18070vi.A0d(a1u, 0);
        FetchTruncatedGroupsJob fetchTruncatedGroupsJob = this.this$0;
        AnonymousClass190 r2 = fetchTruncatedGroupsJob.A00;
        if (r2 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("retry=");
            A10.append(fetchTruncatedGroupsJob.parameters.retryCount);
            A10.append("; errorText=");
            r2.A0G("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/GetGroupInfo - | error;", AnonymousClass000.A0y(a1u.A01, A10), false);
            this.$callbackFuture.BrC(new AnonymousClass9LO());
            return C27621Wu.A00;
        }
        C18070vi.A11("crashLogs");
        throw null;
    }
}
