package X;

import android.graphics.Point;
import com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase", f = "FloatingViewUseCase.kt", i = {0}, l = {107}, m = "invoke", n = {"this"}, s = {"L$0"})
/* renamed from: X.7Th  reason: invalid class name and case insensitive filesystem */
public final class C147477Th extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FloatingViewUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147477Th(FloatingViewUseCase floatingViewUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = floatingViewUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Point) null, (C106595Wl) null, (C86534Sa) null, (C122686Ri) null, (C134556qm) null, this, 0, 0, false, false, false);
    }
}
