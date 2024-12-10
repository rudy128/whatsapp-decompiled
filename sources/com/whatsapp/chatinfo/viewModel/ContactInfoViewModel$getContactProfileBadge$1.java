package com.whatsapp.chatinfo.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34651kr;
import X.C72463Mc;
import X.C76813oT;
import X.C85144Mg;
import X.C89514ca;
import X.C97994qO;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1", f = "ContactInfoViewModel.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
public final class ContactInfoViewModel$getContactProfileBadge$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C76813oT this$0;

    @DebugMetadata(c = "com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1$1", f = "ContactInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r3, r4, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C89514ca r0 = r4;
                C76813oT r4 = r3;
                r4.A0U.A01(new C97994qO(r4, 0), r0.A04);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactInfoViewModel$getContactProfileBadge$1(C76813oT r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ContactInfoViewModel$getContactProfileBadge$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ContactInfoViewModel$getContactProfileBadge$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            C76813oT r0 = this.this$0;
            C85144Mg r2 = r0.A0T;
            C29691ci A0a = C72463Mc.A0a(r2.A00, r0.A0F);
            if (A0a != null) {
                i = A0a.A05;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            final C89514ca r4 = (C89514ca) ((C34651kr) r2.A01.get()).A01(C18070vi.A0M(valueOf)).get(valueOf);
            if (r4 != null) {
                final C76813oT r3 = this.this$0;
                C18600wl r22 = r3.A0f;
                AnonymousClass1 r02 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r22, r02) == r5) {
                    return r5;
                }
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
