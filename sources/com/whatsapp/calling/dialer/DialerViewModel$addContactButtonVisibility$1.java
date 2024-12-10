package com.whatsapp.calling.dialer;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel$addContactButtonVisibility$1", f = "DialerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerViewModel$addContactButtonVisibility$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DialerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerViewModel$addContactButtonVisibility$1(DialerViewModel dialerViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = dialerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DialerViewModel$addContactButtonVisibility$1 dialerViewModel$addContactButtonVisibility$1 = new DialerViewModel$addContactButtonVisibility$1(this.this$0, r4);
        dialerViewModel$addContactButtonVisibility$1.L$0 = obj;
        return dialerViewModel$addContactButtonVisibility$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (((java.lang.CharSequence) r1.first).length() <= 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.label
            if (r0 != 0) goto L_0x0026
            X.C30691eM.A01(r3)
            java.lang.Object r1 = r2.L$0
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            com.whatsapp.calling.dialer.DialerViewModel r0 = r2.this$0
            X.0vl r0 = r0.A0D
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            r0 = 1
            if (r1 > 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0026:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.dialer.DialerViewModel$addContactButtonVisibility$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerViewModel$addContactButtonVisibility$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
