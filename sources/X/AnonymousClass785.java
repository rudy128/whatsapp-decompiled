package X;

import android.view.View;

/* renamed from: X.785  reason: invalid class name */
public class AnonymousClass785 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass785(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b9, code lost:
        r0 = "xFamilyUserFlowLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ca, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ce, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        r1.BAK(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x016b;
                case 1: goto L_0x016b;
                case 2: goto L_0x012c;
                case 3: goto L_0x0174;
                case 4: goto L_0x018b;
                case 5: goto L_0x0193;
                case 6: goto L_0x0033;
                case 7: goto L_0x01ad;
                case 8: goto L_0x01b9;
                case 9: goto L_0x0070;
                case 10: goto L_0x01c1;
                case 11: goto L_0x01c1;
                case 12: goto L_0x0084;
                case 13: goto L_0x01c7;
                case 14: goto L_0x01cf;
                case 15: goto L_0x01d8;
                case 16: goto L_0x01e0;
                case 17: goto L_0x01e8;
                case 18: goto L_0x01f5;
                case 19: goto L_0x0096;
                case 20: goto L_0x00b8;
                case 21: goto L_0x0278;
                case 22: goto L_0x028b;
                case 23: goto L_0x0210;
                case 24: goto L_0x00da;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0220;
                case 28: goto L_0x0239;
                case 29: goto L_0x00f6;
                case 30: goto L_0x0101;
                case 31: goto L_0x010b;
                case 32: goto L_0x0249;
                case 33: goto L_0x0257;
                case 34: goto L_0x0119;
                case 35: goto L_0x025d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A01
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r4 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r4
            X.00H r0 = r4.A0A
            if (r0 == 0) goto L_0x0167
            r0.get()
            java.lang.String r3 = r4.A0C
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "event_name"
            r2.putExtra(r0, r3)
            r0 = 11
            r4.CNh(r2, r0)
            X.1dO r1 = r4.A03
            if (r1 == 0) goto L_0x02b9
            java.lang.String r0 = "TAP_NEW_GROUP"
            r1.A04(r0)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Object r5 = r10.A01
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r5 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment) r5
            X.0vl r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.6oa r0 = (X.C133336oa) r0
            if (r0 == 0) goto L_0x0032
            X.DFL r4 = r0.A00
            r3 = 45
            X.E8A r0 = r4.A0A(r3)
            if (r0 == 0) goto L_0x0056
            X.CXY r2 = r5.A03
            X.9zJ r1 = X.C199029zJ.A01
            X.E8A r0 = r4.A0A(r3)
            X.C26209Cul.A05(r1, r0, r2)
        L_0x0056:
            androidx.fragment.app.Fragment r1 = r5.A0E
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment
            if (r0 == 0) goto L_0x0032
            X.0vl r0 = r5.A05
            java.lang.Object r2 = X.AnonymousClass3MX.A14(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.1GP r1 = r1.A1E()
            X.C18070vi.A0X(r1)
            r0 = 1
            r1.A0v(r2, r0)
            return
        L_0x0070:
            java.lang.Object r0 = r10.A01
            X.6yQ r0 = (X.C139216yQ) r0
            X.6d5 r2 = r0.A01
            if (r2 == 0) goto L_0x0032
            X.00H r0 = r0.A03
            java.util.ArrayList r1 = X.AnonymousClass7FM.A00(r0)
            com.whatsapp.updates.ui.UpdatesFragment r0 = r2.A00
            com.whatsapp.updates.ui.UpdatesFragment.A08(r0, r1)
            return
        L_0x0084:
            java.lang.Object r0 = r10.A01
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            android.widget.RadioButton r1 = r0.A02
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x0096:
            java.lang.Object r3 = r10.A01
            com.whatsapp.webview.ui.views.WebViewNavigationBarView r3 = (com.whatsapp.webview.ui.views.WebViewNavigationBarView) r3
            X.6oO r0 = r3.getWebViewViewModel()
            X.5ey r2 = r0.A00
            if (r2 == 0) goto L_0x0032
            boolean r1 = r2.canGoBack()
            r0 = 1
            if (r1 != r0) goto L_0x0032
            X.6oO r0 = r3.getWebViewViewModel()
            r1 = 27
            X.1DT r0 = r0.A0B
            X.AnonymousClass3MX.A1J(r0, r1)
            r2.goBack()
            return
        L_0x00b8:
            java.lang.Object r3 = r10.A01
            com.whatsapp.webview.ui.views.WebViewNavigationBarView r3 = (com.whatsapp.webview.ui.views.WebViewNavigationBarView) r3
            X.6oO r0 = r3.getWebViewViewModel()
            X.5ey r2 = r0.A00
            if (r2 == 0) goto L_0x0032
            boolean r1 = r2.canGoForward()
            r0 = 1
            if (r1 != r0) goto L_0x0032
            X.6oO r0 = r3.getWebViewViewModel()
            r1 = 26
            X.1DT r0 = r0.A0B
            X.AnonymousClass3MX.A1J(r0, r1)
            r2.goForward()
            return
        L_0x00da:
            java.lang.Object r0 = r10.A01
            X.2gV r0 = (X.C55872gV) r0
            X.86I r1 = r0.A01
            if (r1 == 0) goto L_0x0032
            X.00H r0 = r0.A04
            java.util.ArrayList r2 = X.AnonymousClass7FM.A00(r0)
            X.7PJ r1 = (X.AnonymousClass7PJ) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r0 = r1.A01
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            com.whatsapp.updates.ui.UpdatesFragment.A08(r0, r2)
            return
        L_0x00f6:
            java.lang.Object r0 = r10.A01
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.88l r1 = r0.A04
            if (r1 == 0) goto L_0x0032
            r0 = 67
            goto L_0x0115
        L_0x0101:
            java.lang.Object r0 = r10.A01
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.88l r1 = r0.A04
            if (r1 == 0) goto L_0x0032
            r0 = 7
            goto L_0x0115
        L_0x010b:
            java.lang.Object r0 = r10.A01
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.88l r1 = r0.A04
            if (r1 == 0) goto L_0x0032
            r0 = 66
        L_0x0115:
            r1.BAK(r0)
            return
        L_0x0119:
            java.lang.Object r1 = r10.A01
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r1 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r1
            int r0 = X.AnonymousClass3Ma.A03(r1)
            r1.setSelection(r0)
            android.view.View$OnClickListener r0 = r1.A0B
            if (r0 == 0) goto L_0x0032
            r0.onClick(r11)
            return
        L_0x012c:
            java.lang.Object r0 = r10.A01
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r0 = (com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment) r0
            com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload r2 = r0.A01
            if (r2 == 0) goto L_0x02c5
            X.1wy r1 = r2.A00
            X.6NJ r0 = X.AnonymousClass6NJ.A00
            r1.A0E(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0032
            X.6i2 r0 = r2.A00
            if (r0 == 0) goto L_0x0032
            X.1DT r0 = r2.A01
            if (r0 == 0) goto L_0x0032
            X.00H r0 = r2.A01
            java.lang.Object r3 = r0.get()
            X.A2i r3 = (X.C19995A2i) r3
            X.6i2 r0 = r2.A00
            java.lang.String r7 = r0.A03
            java.lang.String r8 = r0.A02
            X.ADL r4 = r0.A01
            java.lang.String r9 = r0.A04
            X.1DT r1 = r2.A01
            X.CXY r0 = r0.A00
            X.7OR r5 = new X.7OR
            r5.<init>(r1, r0)
            r6 = 0
            r3.A03(r4, r5, r6, r7, r8, r9)
            return
        L_0x0167:
            java.lang.String r0 = "waIntents"
            goto L_0x02ca
        L_0x016b:
            java.lang.Object r1 = r10.A01
            X.1gi r1 = (X.C32141gi) r1
            r0 = 1
            r1.CAw(r0)
            return
        L_0x0174:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            X.1GP r2 = r0.getSupportFragmentManager()
            com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet r1 = new com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet
            r1.<init>()
            java.lang.String r0 = "webview_learn_more"
            X.C20098A7b.A04(r1, r2, r0)
            return
        L_0x018b:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            return
        L_0x0193:
            java.lang.Object r0 = r10.A01
            X.86A r0 = (X.AnonymousClass86A) r0
            X.7OZ r0 = (X.AnonymousClass7OZ) r0
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r1 == 0) goto L_0x01a7
            X.5tM r0 = (X.C115075tM) r0
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = r0.A03
            r0.onBackPressed()
            return
        L_0x01a7:
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r0
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer.A01(r0)
            return
        L_0x01ad:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1GP r0 = r0.A1E()
            r0.A0b()
            return
        L_0x01b9:
            java.lang.Object r0 = r10.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
            return
        L_0x01c1:
            java.lang.Object r0 = r10.A01
            X.C108945cZ.A1Q(r0)
            return
        L_0x01c7:
            java.lang.Object r0 = r10.A01
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            com.whatsapp.wds.components.search.WDSConversationSearchView.setUpClearButton$lambda$5(r0, r11)
            return
        L_0x01cf:
            java.lang.Object r1 = r10.A01
            com.whatsapp.wds.components.search.WDSSearchBar r1 = (com.whatsapp.wds.components.search.WDSSearchBar) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x01d8:
            java.lang.Object r0 = r10.A01
            com.whatsapp.wds.components.search.WDSSearchView r0 = (com.whatsapp.wds.components.search.WDSSearchView) r0
            com.whatsapp.wds.components.search.WDSSearchView.setUpTrailingButtonIcon$lambda$4$lambda$3(r0, r11)
            return
        L_0x01e0:
            java.lang.Object r0 = r10.A01
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r0 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r0
            r0.onBackPressed()
            return
        L_0x01e8:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet r0 = new com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet
            r0.<init>()
            r1.CMl(r0)
            return
        L_0x01f5:
            java.lang.Object r1 = r10.A01
            com.whatsapp.webview.ui.views.WebViewNavigationBarView r1 = (com.whatsapp.webview.ui.views.WebViewNavigationBarView) r1
            X.6oO r0 = r1.getWebViewViewModel()
            X.5ey r0 = r0.A00
            if (r0 == 0) goto L_0x0204
            r0.reload()
        L_0x0204:
            X.6oO r0 = r1.getWebViewViewModel()
            r1 = 25
            X.1DT r0 = r0.A0B
            X.AnonymousClass3MX.A1J(r0, r1)
            return
        L_0x0210:
            java.lang.Object r0 = r10.A01
            X.2gV r0 = (X.C55872gV) r0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.6uW r0 = (X.C136856uW) r0
            r0.A00()
            return
        L_0x0220:
            java.lang.Object r3 = r10.A01
            android.app.Activity r3 = (android.app.Activity) r3
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "error"
            java.lang.String r0 = "USER_ABORTED"
            r2.putString(r1, r0)
            android.os.ResultReceiver r1 = X.C188559hc.A0B
            r0 = 0
            r1.send(r0, r2)
            r3.finish()
            return
        L_0x0239:
            java.lang.Object r1 = r10.A01
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            android.view.View r0 = r1.A04
            boolean r0 = X.C108995ce.A1U(r0)
            r0 = r0 ^ 1
            org.npci.upi.security.pinactivitycomponent.GetCredential.A03(r1, r0)
            return
        L_0x0249:
            java.lang.Object r1 = r10.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r1.startActivity(r0)
            return
        L_0x0257:
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x025d:
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r1 = "action"
            java.lang.String r0 = "FORGOT_UPI_PIN"
            r3.putString(r1, r0)
            java.lang.Object r0 = r10.A01
            X.8Do r0 = (X.AnonymousClass8Do) r0
            android.content.Context r2 = r0.A03
            android.os.ResultReceiver r1 = X.C188559hc.A0B
            r0 = 3
            r1.send(r0, r3)
            X.AnonymousClass3MW.A1U(r2)
            return
        L_0x0278:
            java.lang.Object r3 = r10.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            r2 = 0
            X.1dR r1 = r3.A05
            if (r1 == 0) goto L_0x02b9
            java.lang.String r0 = "EXIT_NATIVE_AUTH"
            r1.A04(r0)
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A0Q(r3, r0, r0, r2)
            return
        L_0x028b:
            java.lang.Object r3 = r10.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            X.1dR r1 = r3.A05
            if (r1 == 0) goto L_0x02b9
            java.lang.String r0 = "TAP_NATIVE_AUTH_AGREE"
            r1.A04(r0)
            X.1mM r1 = r3.A04
            if (r1 == 0) goto L_0x02c8
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.A03(r0)
            X.1KB r0 = r3.A05
            X.C18070vi.A0W(r0)
            X.6p4 r2 = new X.6p4
            r2.<init>(r0)
            r0 = 2131886423(0x7f120157, float:1.9407424E38)
            r2.A01(r0)
            X.10I r1 = r3.A05
            r0 = 46
            X.AnonymousClass7RN.A02(r1, r3, r2, r0)
            return
        L_0x02b9:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            goto L_0x02ca
        L_0x02bc:
            java.lang.Object r1 = r1.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            com.whatsapp.status.StatusesFragment.A0B(r1, r2, r0)
            return
        L_0x02c5:
            java.lang.String r0 = "viewModel"
            goto L_0x02ca
        L_0x02c8:
            java.lang.String r0 = "fbAccountManager"
        L_0x02ca:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass785.onClick(android.view.View):void");
    }
}
