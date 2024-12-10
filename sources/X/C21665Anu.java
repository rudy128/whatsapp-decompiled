package X;

import com.whatsapp.registration.autoconf.AutoconfUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.autoconf.AutoconfUseCase", f = "AutoconfUseCase.kt", i = {0}, l = {87, 98}, m = "verifyAutoconf", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anu  reason: case insensitive filesystem */
public final class C21665Anu extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AutoconfUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21665Anu(AutoconfUseCase autoconfUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = autoconfUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AutoconfUseCase.A00((C194629s2) null, this.this$0, (String) null, this);
    }
}
