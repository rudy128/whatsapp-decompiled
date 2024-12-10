package X;

import com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager", f = "GroupMemberSuggestionsManager.kt", i = {0}, l = {53, 90}, m = "loadSuggestionsBucketsResults", n = {"suggestedBucketQueryJobs"}, s = {"L$0"})
/* renamed from: X.4uR  reason: invalid class name and case insensitive filesystem */
public final class C100394uR extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GroupMemberSuggestionsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100394uR(GroupMemberSuggestionsManager groupMemberSuggestionsManager, C30391dr r2) {
        super(r2);
        this.this$0 = groupMemberSuggestionsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Set) null, this, 0);
    }
}
