package X;

import com.whatsapp.group.batch.FetchTruncatedGroupsJob;

/* renamed from: X.B0u  reason: case insensitive filesystem */
public final class C22266B0u extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;
    public final /* synthetic */ FetchTruncatedGroupsJob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22266B0u(FetchTruncatedGroupsJob fetchTruncatedGroupsJob, C26981Ug r3) {
        super(1);
        this.this$0 = fetchTruncatedGroupsJob;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        FetchTruncatedGroupsJob fetchTruncatedGroupsJob = this.this$0;
        AnonymousClass190 r2 = fetchTruncatedGroupsJob.A00;
        if (r2 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("retry=");
            A10.append(fetchTruncatedGroupsJob.parameters.retryCount);
            r2.A0E("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/GetGroupInfo", C17900vP.A0C("; message=", A10, th), th);
            this.$callbackFuture.BrC(new AnonymousClass9LO(th));
            return C27621Wu.A00;
        }
        C18070vi.A11("crashLogs");
        throw null;
    }
}
