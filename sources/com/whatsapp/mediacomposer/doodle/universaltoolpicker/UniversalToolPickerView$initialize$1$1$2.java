package com.whatsapp.mediacomposer.doodle.universaltoolpicker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass89A;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView$initialize$1$1$2", f = "UniversalToolPickerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UniversalToolPickerView$initialize$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass89A $callback;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ UniversalToolPickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalToolPickerView$initialize$1$1$2(AnonymousClass89A r2, UniversalToolPickerView universalToolPickerView, C30391dr r4) {
        super(2, r4);
        this.this$0 = universalToolPickerView;
        this.$callback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        UniversalToolPickerView$initialize$1$1$2 universalToolPickerView$initialize$1$1$2 = new UniversalToolPickerView$initialize$1$1$2(this.$callback, this.this$0, r5);
        universalToolPickerView$initialize$1$1$2.I$0 = AnonymousClass000.A0M(obj);
        return universalToolPickerView$initialize$1$1$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UniversalToolPickerView.A02(this.this$0, this.I$0);
            this.$callback.C8q(this.this$0.getViewModel().A04);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UniversalToolPickerView$initialize$1$1$2) create(Integer.valueOf(AnonymousClass000.A0M(obj)), (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }
}
