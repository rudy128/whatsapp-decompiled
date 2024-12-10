package X;

import com.whatsapp.reportinfra.repo.SpamReportRepo;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo", f = "SpamReportRepo.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {86, 88, 90, 92}, m = "triggerReport", n = {"this", "reportOrigin", "this", "reportOrigin", "this", "reportOrigin", "this", "reportOrigin"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.7UZ  reason: invalid class name */
public final class AnonymousClass7UZ extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UZ(SpamReportRepo spamReportRepo, C30391dr r2) {
        super(r2);
        this.this$0 = spamReportRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1E7) null, (String) null, (List) null, this);
    }
}
