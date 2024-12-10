package com.whatsapp.updates.viewmodels;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C131026kO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1", f = "UpdatesViewModelObservers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $jid;
    public int label;
    public final /* synthetic */ C131026kO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(AnonymousClass1BI r2, C131026kO r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(this.$jid, this.this$0, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.6Jf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.6Jf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.6Jf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.6Jf} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (X.AnonymousClass72J.A01(r4, r1.A05) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x00e3
            X.C30691eM.A01(r10)
            X.6kO r0 = r9.this$0
            com.whatsapp.updates.viewmodels.UpdatesViewModel r8 = r0.A0A
            X.1M9 r1 = r0.A04
            X.1BI r0 = r9.$jid
            X.1E7 r4 = r1.A0H(r0)
            X.1E7 r0 = r4.A05()
            if (r0 == 0) goto L_0x001a
            r4 = r0
        L_0x001a:
            X.1BI r6 = r4.A0J
            boolean r0 = X.C22971Dz.A0V(r6)
            r7 = 1
            if (r0 == 0) goto L_0x00c0
            java.util.List r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A05(r8)
            java.util.Iterator r2 = r0.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6Jh r0 = (X.C121346Jh) r0
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x002b
        L_0x0043:
            X.6Jh r1 = (X.C121346Jh) r1
            if (r1 == 0) goto L_0x004e
            r1.A00 = r4
            X.1DT r0 = r8.A0P
            X.C137196v4.A00(r0)
        L_0x004e:
            X.1DT r3 = r8.A0R
            java.util.List r0 = X.AnonymousClass3MW.A10(r3)
            if (r0 == 0) goto L_0x007a
            java.util.Iterator r2 = r0.iterator()
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6s7 r0 = (X.C135386s7) r0
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x005a
        L_0x0071:
            X.6s7 r1 = (X.C135386s7) r1
            if (r1 == 0) goto L_0x007a
            r1.A00 = r4
            X.C137196v4.A00(r3)
        L_0x007a:
            X.1Dg r3 = r8.A0M
            java.lang.Object r0 = r3.A06()
            X.6u6 r0 = (X.C136616u6) r0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.A0A
            if (r0 != r7) goto L_0x00b9
            java.lang.Object r0 = r3.A06()
            X.6u6 r0 = (X.C136616u6) r0
            if (r0 == 0) goto L_0x00b9
            java.util.List r0 = r0.A09
            if (r0 == 0) goto L_0x00b9
            java.util.Iterator r2 = r0.iterator()
        L_0x0098:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6Jf r0 = (X.C121326Jf) r0
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x0098
            r5 = r1
        L_0x00b0:
            X.6Jf r5 = (X.C121326Jf) r5
            if (r5 == 0) goto L_0x00b9
            r5.A00 = r4
        L_0x00b6:
            X.C137196v4.A00(r3)
        L_0x00b9:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00bc:
            r1 = r5
            goto L_0x0071
        L_0x00be:
            r1 = r5
            goto L_0x0043
        L_0x00c0:
            X.1Dg r3 = r8.A0N
            java.lang.Object r1 = r3.A06()
            X.72J r1 = (X.AnonymousClass72J) r1
            if (r1 == 0) goto L_0x00b9
            java.util.List r0 = r1.A06
            boolean r0 = X.AnonymousClass72J.A01(r4, r0)
            if (r0 != 0) goto L_0x00b6
            java.util.List r0 = r1.A07
            boolean r0 = X.AnonymousClass72J.A01(r4, r0)
            if (r0 != 0) goto L_0x00b6
            java.util.List r0 = r1.A05
            boolean r0 = X.AnonymousClass72J.A01(r4, r0)
            if (r0 == 0) goto L_0x00b9
            goto L_0x00b6
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
