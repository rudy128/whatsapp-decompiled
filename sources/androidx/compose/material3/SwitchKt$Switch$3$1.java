package androidx.compose.material3;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass0QL;
import X.AnonymousClass0Tx;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.SwitchKt$Switch$3$1", f = "Switch.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class SwitchKt$Switch$3$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $offset;
    public final /* synthetic */ float $targetValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$3$1(AnonymousClass0Q3 r2, C30391dr r3, float f) {
        super(2, r3);
        this.$offset = r2;
        this.$targetValue = f;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SwitchKt$Switch$3$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SwitchKt$Switch$3$1(this.$offset, r5, this.$targetValue);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0Q3 r2 = this.$offset;
            Float f = new Float(this.$targetValue);
            AnonymousClass0Tx r0 = AnonymousClass0QL.A00;
            this.label = 1;
            if (r2.A06(r0, f, r2.A05(), this) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
