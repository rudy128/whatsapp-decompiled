package com.whatsapp.interopui.optin;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3WZ;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity$initObservables$1", f = "InteropUnifiedInboxOptionActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class InteropUnifiedInboxOptionActivity$initObservables$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3WZ $adapter;
    public int label;
    public final /* synthetic */ InteropUnifiedInboxOptionActivity this$0;

    @DebugMetadata(c = "com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity$initObservables$1$1", f = "InteropUnifiedInboxOptionActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, interopUnifiedInboxOptionActivity, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                InteropUnifiedInboxOptionActivity interopUnifiedInboxOptionActivity = interopUnifiedInboxOptionActivity;
                AnonymousClass3WZ r3 = r2;
                AnonymousClass1G1 r2 = ((InteropOptInSelectInboxViewModel) interopUnifiedInboxOptionActivity.A05.getValue()).A06;
                InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1 interopUnifiedInboxOptionActivity$initObservables$1$1$1$1 = new InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1(r3, interopUnifiedInboxOptionActivity, (C30391dr) null);
                this.label = 1;
                if (C88604aC.A00(this, interopUnifiedInboxOptionActivity$initObservables$1$1$1$1, r2) == r6) {
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
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropUnifiedInboxOptionActivity$initObservables$1(AnonymousClass3WZ r2, InteropUnifiedInboxOptionActivity interopUnifiedInboxOptionActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = interopUnifiedInboxOptionActivity;
        this.$adapter = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InteropUnifiedInboxOptionActivity$initObservables$1(this.$adapter, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final InteropUnifiedInboxOptionActivity interopUnifiedInboxOptionActivity = this.this$0;
            C23401Fx r3 = C23401Fx.STARTED;
            final AnonymousClass3WZ r2 = this.$adapter;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, interopUnifiedInboxOptionActivity, this, r0) == r6) {
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
        return ((InteropUnifiedInboxOptionActivity$initObservables$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
