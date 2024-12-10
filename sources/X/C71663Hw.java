package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;

/* renamed from: X.3Hw  reason: invalid class name and case insensitive filesystem */
public final class C71663Hw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62562rb $currentAccount;
    public final /* synthetic */ C98494rF $makeActiveLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71663Hw(AccountSwitchingContentProvider accountSwitchingContentProvider, C62562rb r3, C98494rF r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$currentAccount = r3;
        this.$makeActiveLid = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (X.AnonymousClass11G.A0J(r9.this$0).A0O(r0.A07) != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r9.this$0
            X.2u4 r6 = X.AnonymousClass11G.A0J(r0)
            X.2rb r7 = r9.$currentAccount
            X.4rF r0 = r9.$makeActiveLid
            java.lang.Object r8 = r0.element
            if (r8 == 0) goto L_0x00d2
            java.lang.String r8 = (java.lang.String) r8
            X.C18070vi.A0h(r7, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingDataRepo/removeAndAddAccount/addAccount:"
            r1.append(r0)
            java.lang.String r0 = X.C49842Sd.A00(r7)
            r1.append(r0)
            java.lang.String r0 = ",removeLid:"
            r1.append(r0)
            java.lang.String r0 = X.C60322np.A01(r8)
            X.C17890vO.A1A(r1, r0)
            X.2mj r5 = X.C64012u4.A01(r6)
            java.util.ArrayList r1 = X.C64012u4.A04(r5)
            boolean r0 = X.C64012u4.A0A(r8, r1)
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account doesn't exist"
        L_0x003f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/success: "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 != 0) goto L_0x008c
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r9.this$0
            X.2u4 r0 = X.AnonymousClass11G.A0J(r0)
            X.2rb r0 = r0.A0B()
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r0.A07
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r9.this$0
            X.2u4 r0 = X.AnonymousClass11G.A0J(r0)
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x008c
        L_0x006d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file/adding account "
            r1.append(r0)
            X.2rb r0 = r9.$currentAccount
            java.lang.String r0 = r0.A07
            java.lang.String r0 = X.C60322np.A01(r0)
            X.C17890vO.A1A(r1, r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r9.this$0
            X.2u4 r1 = X.AnonymousClass11G.A0J(r0)
            X.2rb r0 = r9.$currentAccount
            r1.A0G(r0)
        L_0x008c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008f:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x009b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2rb r0 = (X.C62562rb) r0
            java.lang.String r0 = r0.A07
            boolean r0 = X.C18070vi.A18(r0, r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009b
            r3.add(r1)
            goto L_0x009b
        L_0x00b6:
            r4.addAll(r3)
            java.lang.String r0 = r7.A07
            boolean r0 = X.C64012u4.A0A(r0, r4)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account already exists"
            goto L_0x003f
        L_0x00c5:
            r4.add(r7)
            X.2mj r0 = X.C64012u4.A00(r5, r4)
            boolean r2 = X.C64012u4.A08(r0, r6)
            goto L_0x0043
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71663Hw.invoke():java.lang.Object");
    }
}
