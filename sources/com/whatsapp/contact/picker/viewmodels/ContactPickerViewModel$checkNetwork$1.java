package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$checkNetwork$1", f = "ContactPickerViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class ContactPickerViewModel$checkNetwork$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public Object L$0;
    public int label;
    public final /* synthetic */ ContactPickerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$checkNetwork$1$1", f = "ContactPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$checkNetwork$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                return Boolean.valueOf(ContactPickerViewModel.this.A00.A09());
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPickerViewModel$checkNetwork$1(ContactPickerViewModel contactPickerViewModel, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.$callback = r4;
        this.this$0 = contactPickerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactPickerViewModel$checkNetwork$1(this.this$0, r5, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C22821Di r4;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r4 = this.$callback;
            final ContactPickerViewModel contactPickerViewModel = this.this$0;
            C18600wl r2 = contactPickerViewModel.A03;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.L$0 = r4;
            this.label = 1;
            obj = C30451dy.A00(this, r2, r0);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r4 = (C22821Di) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r4.invoke(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactPickerViewModel$checkNetwork$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
