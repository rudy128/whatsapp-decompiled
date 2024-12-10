package X;

import com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper", f = "SubgroupSuggestionActionProtocolHelper.kt", i = {0}, l = {64}, m = "setAction", n = {"setPropertyRequest"}, s = {"L$0"})
/* renamed from: X.4uN  reason: invalid class name and case insensitive filesystem */
public final class C100354uN extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SubgroupSuggestionActionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100354uN(SubgroupSuggestionActionProtocolHelper subgroupSuggestionActionProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = subgroupSuggestionActionProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1EC) null, (List) null, (List) null, (List) null, this);
    }
}
