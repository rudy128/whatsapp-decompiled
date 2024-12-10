package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass09V;
import X.AnonymousClass0tA;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04460Nm;
import X.C11780kf;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$draw$1", f = "Magnifier.android.kt", i = {}, l = {447}, m = "invokeSuspend", n = {}, s = {})
public final class MagnifierNode$draw$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass09V this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierNode$draw$1(AnonymousClass09V r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((MagnifierNode$draw$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MagnifierNode$draw$1(this.this$0, r4);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C11780kf r0 = C11780kf.A00;
            this.label = 1;
            if (C04460Nm.A01(this, r0) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass0tA r02 = this.this$0.A02;
        if (r02 != null) {
            r02.CQd();
        }
        return C27621Wu.A00;
    }
}
