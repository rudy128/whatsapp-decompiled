package X;

import android.content.Context;
import com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder", f = "VCOverscrollEntryPointStateHolder.kt", i = {0, 0, 0, 0}, l = {364, 368}, m = "maybeStartVC", n = {"this", "context", "groupJid", "isConfirmed"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* renamed from: X.4vA  reason: invalid class name and case insensitive filesystem */
public final class C100844vA extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VCOverscrollEntryPointStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100844vA(VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder, C30391dr r2) {
        super(r2);
        this.this$0 = vCOverscrollEntryPointStateHolder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((Context) null, (AnonymousClass1EC) null, this, false);
    }
}
