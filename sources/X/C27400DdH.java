package X;

import com.whatsapp.calling.dialer.DialerDataSourceRemote;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerDataSourceRemote", f = "DialerDataSourceRemote.kt", i = {0}, l = {53}, m = "updateContactDetailsFetchPhotoFromServerIfNeeded", n = {"contactDetails"}, s = {"L$0"})
/* renamed from: X.DdH  reason: case insensitive filesystem */
public final class C27400DdH extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerDataSourceRemote this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27400DdH(DialerDataSourceRemote dialerDataSourceRemote, C30391dr r2) {
        super(r2);
        this.this$0 = dialerDataSourceRemote;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C26023Cqh) null, this);
    }
}
