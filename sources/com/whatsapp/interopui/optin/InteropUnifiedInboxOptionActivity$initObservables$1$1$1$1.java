package com.whatsapp.interopui.optin;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3WZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1", f = "InteropUnifiedInboxOptionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3WZ $adapter;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ InteropUnifiedInboxOptionActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1(AnonymousClass3WZ r2, InteropUnifiedInboxOptionActivity interopUnifiedInboxOptionActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = interopUnifiedInboxOptionActivity;
        this.$adapter = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1 interopUnifiedInboxOptionActivity$initObservables$1$1$1$1 = new InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1(this.$adapter, this.this$0, r5);
        interopUnifiedInboxOptionActivity$initObservables$1$1$1$1.I$0 = AnonymousClass000.A0M(obj);
        return interopUnifiedInboxOptionActivity$initObservables$1$1$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0074
            X.C30691eM.A01(r7)
            int r5 = r6.I$0
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r3 = 0
            r4 = 1
            if (r5 == r4) goto L_0x0056
            r0 = 2
            if (r5 == r0) goto L_0x0044
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InteropUnifiedInboxOptionActivity interop/unifiedinbox/invalid option "
            X.C17900vP.A0i(r0, r1, r5)
            X.4Db r1 = X.C83024Db.A02
            X.4Tm r0 = new X.4Tm
            r0.<init>(r1, r3)
            r2.add(r0)
            X.4Db r1 = X.C83024Db.A03
            X.4Tm r0 = new X.4Tm
            r0.<init>(r1, r3)
            r2.add(r0)
            com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity r0 = r6.this$0
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A03
            if (r0 == 0) goto L_0x003a
            r0.setEnabled(r3)
        L_0x003a:
            X.3WZ r0 = r6.$adapter
            r0.A00 = r2
            r0.notifyDataSetChanged()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0044:
            X.4Db r1 = X.C83024Db.A02
            X.4Tm r0 = new X.4Tm
            r0.<init>(r1, r3)
            r2.add(r0)
            X.4Db r0 = X.C83024Db.A03
            X.4Tm r1 = new X.4Tm
            r1.<init>(r0, r4)
            goto L_0x0067
        L_0x0056:
            X.4Db r1 = X.C83024Db.A02
            X.4Tm r0 = new X.4Tm
            r0.<init>(r1, r4)
            r2.add(r0)
            X.4Db r0 = X.C83024Db.A03
            X.4Tm r1 = new X.4Tm
            r1.<init>(r0, r3)
        L_0x0067:
            r2.add(r1)
            com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity r0 = r6.this$0
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A03
            if (r0 == 0) goto L_0x003a
            r0.setEnabled(r4)
            goto L_0x003a
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropUnifiedInboxOptionActivity$initObservables$1$1$1$1) C72473Md.A0l(obj, obj2, this)).invokeSuspend(C27621Wu.A00);
    }
}
