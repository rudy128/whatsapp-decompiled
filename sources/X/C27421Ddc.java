package X;

import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue", f = "ActionFeedbackPriorityQueue.kt", i = {0, 0, 0, 1}, l = {140, 58}, m = "enqueue", n = {"this", "actionFeedback", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* renamed from: X.Ddc  reason: case insensitive filesystem */
public final class C27421Ddc extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActionFeedbackPriorityQueue this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27421Ddc(ActionFeedbackPriorityQueue actionFeedbackPriorityQueue, C30391dr r2) {
        super(r2);
        this.this$0 = actionFeedbackPriorityQueue;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((E8B) null, this);
    }
}
