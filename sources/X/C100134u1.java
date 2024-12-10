package X;

import com.whatsapp.areffects.arclass.ArClassManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.arclass.ArClassManager", f = "ArClassManager.kt", i = {0}, l = {115}, m = "refreshArClass", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u1  reason: invalid class name and case insensitive filesystem */
public final class C100134u1 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArClassManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100134u1(ArClassManager arClassManager, C30391dr r2) {
        super(r2);
        this.this$0 = arClassManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this, (C18600wl) null);
    }
}
