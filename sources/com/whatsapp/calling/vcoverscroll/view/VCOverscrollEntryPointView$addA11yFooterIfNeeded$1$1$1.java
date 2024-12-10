package com.whatsapp.calling.vcoverscroll.view;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import android.view.View;
import com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1", f = "VCOverscrollEntryPointView.kt", i = {}, l = {510}, m = "invokeSuspend", n = {}, s = {})
public final class VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View $this_apply;
    public int label;
    public final /* synthetic */ VCOverscrollEntryPointView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1(View view, VCOverscrollEntryPointView vCOverscrollEntryPointView, C30391dr r4) {
        super(2, r4);
        this.this$0 = vCOverscrollEntryPointView;
        this.$this_apply = view;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1(this.$this_apply, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            VCOverscrollEntryPointStateHolder stateHolder = this.this$0.getStateHolder();
            Context A04 = AnonymousClass3MY.A04(this.$this_apply);
            AnonymousClass1EC r1 = this.this$0.A04;
            if (r1 != null) {
                this.label = 1;
                if (stateHolder.A02(A04, r1, this, false) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
