package X;

import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue", f = "ActionFeedbackPriorityQueue.kt", i = {0, 0, 0, 0, 0}, l = {108, 114, 131}, m = "enqueueRecursively", n = {"this", "actionFeedback", "existingActionFeedback", "shouldUpdateActionFeedback", "index"}, s = {"L$0", "L$1", "L$3", "Z$0", "I$0"})
/* renamed from: X.Ddq  reason: case insensitive filesystem */
public final class C27434Ddq extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActionFeedbackPriorityQueue this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27434Ddq(ActionFeedbackPriorityQueue actionFeedbackPriorityQueue, C30391dr r2) {
        super(r2);
        this.this$0 = actionFeedbackPriorityQueue;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ActionFeedbackPriorityQueue.A00(this.this$0, (E8B) null, this, false);
    }
}
