package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04950Pq;
import X.C07150aS;
import X.C08080eW;
import X.C16300s2;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q3 $animatable;
    public final /* synthetic */ C16300s2 $targetValue$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(AnonymousClass0Q3 r2, C16300s2 r3, C30391dr r4) {
        super(2, r4);
        this.$targetValue$delegate = r3;
        this.$animatable = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$animatable, this.$targetValue$delegate, r5);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C23421Fz A05 = C04950Pq.A05(new C08080eW(this.$targetValue$delegate));
            C07150aS r0 = new C07150aS((Object) this.$animatable, obj2, 3);
            this.label = 1;
            if (A05.BFC(this, r0) == A03) {
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
