package com.whatsapp.mediacomposer.doodle.universaltoolpicker;

import X.AnonymousClass000;
import X.AnonymousClass1IX;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C112165l2;
import X.C133706pM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView$initialize$1$1$1", f = "UniversalToolPickerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UniversalToolPickerView$initialize$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ UniversalToolPickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalToolPickerView$initialize$1$1$1(UniversalToolPickerView universalToolPickerView, C30391dr r3) {
        super(2, r3);
        this.this$0 = universalToolPickerView;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        UniversalToolPickerView$initialize$1$1$1 universalToolPickerView$initialize$1$1$1 = new UniversalToolPickerView$initialize$1$1$1(this.this$0, r4);
        universalToolPickerView$initialize$1$1$1.L$0 = obj;
        return universalToolPickerView$initialize$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1IX r4 = (AnonymousClass1IX) this.L$0;
            Iterator it = r4.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C133706pM) it.next()).A01) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            this.this$0.A00 = new C112165l2(r4, i);
            RecyclerView A01 = this.this$0.getRecyclerView();
            C112165l2 r0 = this.this$0.A00;
            if (r0 == null) {
                AnonymousClass3MW.A1B();
                throw null;
            }
            A01.setAdapter(r0);
            if (i != -1) {
                this.this$0.getRecyclerView().A0g(i);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UniversalToolPickerView$initialize$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
