package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1", f = "DialerActivity.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
public final class DialerActivity$initObservables$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DialerActivity this$0;

    @DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1", f = "DialerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
                DialerActivity dialerActivity = DialerActivity.this;
                ArrayList arrayList = DialerActivity.A0I;
                DialerViewModel A0X = AnonymousClass3MZ.A0X(dialerActivity);
                DialerActivity dialerActivity2 = DialerActivity.this;
                DialerActivity$initObservables$1$1$1$1 dialerActivity$initObservables$1$1$1$1 = new DialerActivity$initObservables$1$1$1$1(dialerActivity2, A0X, (C30391dr) null);
                AnonymousClass1OR r2 = AnonymousClass1OR.A00;
                Integer A0w = AnonymousClass3MW.A0w(r2, dialerActivity$initObservables$1$1$1$1, r6);
                C30451dy.A02(A0w, r2, new DialerActivity$initObservables$1$1$1$2(dialerActivity2, A0X, (C30391dr) null), r6);
                C30451dy.A02(A0w, r2, new DialerActivity$initObservables$1$1$1$3(dialerActivity2, A0X, (C30391dr) null), r6);
                C30451dy.A02(A0w, r2, new DialerActivity$initObservables$1$1$1$4(dialerActivity2, A0X, (C30391dr) null), r6);
                C30451dy.A02(A0w, r2, new DialerActivity$initObservables$1$1$1$5(dialerActivity2, A0X, (C30391dr) null), r6);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerActivity$initObservables$1(DialerActivity dialerActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = dialerActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DialerActivity$initObservables$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DialerActivity$initObservables$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final DialerActivity dialerActivity = this.this$0;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, dialerActivity, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
