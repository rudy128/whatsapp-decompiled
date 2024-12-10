package com.whatsapp.mediacomposer.doodle.universaltoolpicker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass71Q;
import X.AnonymousClass89A;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView$initialize$1", f = "UniversalToolPickerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UniversalToolPickerView$initialize$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass89A $callback;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ UniversalToolPickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalToolPickerView$initialize$1(AnonymousClass89A r2, UniversalToolPickerView universalToolPickerView, C30391dr r4) {
        super(2, r4);
        this.this$0 = universalToolPickerView;
        this.$callback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        UniversalToolPickerView$initialize$1 universalToolPickerView$initialize$1 = new UniversalToolPickerView$initialize$1(this.$callback, this.this$0, r5);
        universalToolPickerView$initialize$1.L$0 = obj;
        return universalToolPickerView$initialize$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
            AnonymousClass71Q viewModel = this.this$0.getViewModel();
            UniversalToolPickerView universalToolPickerView = this.this$0;
            AnonymousClass89A r3 = this.$callback;
            C88604aC.A04(new UniversalToolPickerView$initialize$1$1$1(universalToolPickerView, (C30391dr) null), r6, viewModel.A09);
            C88604aC.A04(new UniversalToolPickerView$initialize$1$1$2(r3, universalToolPickerView, (C30391dr) null), r6, viewModel.A0B);
            C88604aC.A04(new UniversalToolPickerView$initialize$1$1$3(r3, (C30391dr) null), r6, viewModel.A0A);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UniversalToolPickerView$initialize$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
