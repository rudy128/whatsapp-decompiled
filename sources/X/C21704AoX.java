package X;

import com.whatsapp.polls.creator.PollCreatorViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.polls.creator.PollCreatorViewModel", f = "PollCreatorViewModel.kt", i = {0, 0, 0, 0}, l = {349}, m = "sendPoll", n = {"this", "chatJid", "pollOptions", "quotedMessageRowId"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* renamed from: X.AoX  reason: case insensitive filesystem */
public final class C21704AoX extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PollCreatorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21704AoX(PollCreatorViewModel pollCreatorViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = pollCreatorViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0U((AnonymousClass1BI) null, this, 0);
    }
}
