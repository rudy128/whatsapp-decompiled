package X;

import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession", f = "ArEffectSession.kt", i = {0}, l = {323}, m = "handleDebugSettings", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u3  reason: invalid class name and case insensitive filesystem */
public final class C100154u3 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100154u3(ArEffectSession arEffectSession, C30391dr r2) {
        super(r2);
        this.this$0 = arEffectSession;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ArEffectSession.A04(this.this$0, this);
    }
}
