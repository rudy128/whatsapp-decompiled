package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Animatable$snapTo$2 extends C30431dv implements C22821Di {
    public final /* synthetic */ Object $targetValue;
    public int label;
    public final /* synthetic */ AnonymousClass0Q3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(AnonymousClass0Q3 r2, Object obj, C30391dr r4) {
        super(1, r4);
        this.this$0 = r2;
        this.$targetValue = obj;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3) {
        return ((Animatable$snapTo$2) create(r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(C30391dr r4) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, r4);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass0Q3.A04(this.this$0);
            Object A02 = AnonymousClass0Q3.A02(this.this$0, this.$targetValue);
            this.this$0.A04.A05.setValue(A02);
            this.this$0.A07.setValue(A02);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
