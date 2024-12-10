package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass482;
import X.AnonymousClass4U0;
import X.AnonymousClass6IR;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C95784mn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$uiState$1", f = "OneOnOneCallConfirmationSheetViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class OneOnOneCallConfirmationSheetViewModel$uiState$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ OneOnOneCallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneOnOneCallConfirmationSheetViewModel$uiState$1(OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = oneOnOneCallConfirmationSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        OneOnOneCallConfirmationSheetViewModel$uiState$1 oneOnOneCallConfirmationSheetViewModel$uiState$1 = new OneOnOneCallConfirmationSheetViewModel$uiState$1(this.this$0, r4);
        oneOnOneCallConfirmationSheetViewModel$uiState$1.L$0 = obj;
        return oneOnOneCallConfirmationSheetViewModel$uiState$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r4 = (AnonymousClass1G2) this.L$0;
            OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel = this.this$0;
            String A0q = AnonymousClass3MY.A0q(oneOnOneCallConfirmationSheetViewModel.A04, oneOnOneCallConfirmationSheetViewModel.A03.A0H(oneOnOneCallConfirmationSheetViewModel.A05));
            if (A0q == null) {
                A0q = "";
            }
            AnonymousClass482 r3 = new AnonymousClass482(A0q);
            AnonymousClass6IR A0q2 = C72453Mb.A0q(2131887611);
            int i2 = 2131231623;
            if (this.this$0.A0A) {
                i2 = 2131231646;
            }
            AnonymousClass4U0 r0 = new AnonymousClass4U0(new C95784mn(i2), r3, A0q2);
            this.label = 1;
            if (r4.BJt(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OneOnOneCallConfirmationSheetViewModel$uiState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
