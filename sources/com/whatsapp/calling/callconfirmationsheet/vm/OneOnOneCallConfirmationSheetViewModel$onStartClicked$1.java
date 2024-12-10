package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C83614Fz;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$onStartClicked$1", f = "OneOnOneCallConfirmationSheetViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class OneOnOneCallConfirmationSheetViewModel$onStartClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ OneOnOneCallConfirmationSheetViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$onStartClicked$1$1", f = "OneOnOneCallConfirmationSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$onStartClicked$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(context, oneOnOneCallConfirmationSheetViewModel2, A0H, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel = oneOnOneCallConfirmationSheetViewModel2;
                oneOnOneCallConfirmationSheetViewModel.A02.CNw(context, A0H, oneOnOneCallConfirmationSheetViewModel.A01, oneOnOneCallConfirmationSheetViewModel.A0A);
                AnonymousClass1G4 r1 = oneOnOneCallConfirmationSheetViewModel2.A09;
                C27621Wu r0 = C27621Wu.A00;
                r1.setValue(r0);
                return r0;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneOnOneCallConfirmationSheetViewModel$onStartClicked$1(Context context, OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = oneOnOneCallConfirmationSheetViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new OneOnOneCallConfirmationSheetViewModel$onStartClicked$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (C83614Fz.A00(this.this$0.A01)) {
                this.this$0.A02.BiX(AnonymousClass3MW.A0v(15), (Integer) null, 4, false);
            }
            OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel = this.this$0;
            final AnonymousClass1E7 A0H = oneOnOneCallConfirmationSheetViewModel.A03.A0H(oneOnOneCallConfirmationSheetViewModel.A05);
            final OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel2 = this.this$0;
            C18600wl r3 = oneOnOneCallConfirmationSheetViewModel2.A07;
            final Context context = this.$context;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OneOnOneCallConfirmationSheetViewModel$onStartClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
