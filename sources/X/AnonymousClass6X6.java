package X;

/* renamed from: X.6X6  reason: invalid class name */
public abstract class AnonymousClass6X6 {
    /* JADX WARNING: type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent A00(android.app.Activity r8, X.C18030ve r9, com.whatsapp.jid.UserJid r10, java.lang.String r11) {
        /*
            r4 = 0
            boolean r2 = X.C108975cc.A1K(r9)
            r0 = 4609(0x1201, float:6.459E-42)
            java.lang.String r1 = X.C108955ca.A0v(r9, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r3 = ","
            r0[r4] = r3
            r5 = 0
            java.util.List r0 = X.AnonymousClass1YF.A0S(r1, r0, r4)
            r7 = 0
            java.util.List r6 = X.C29431cG.A0t(r0)
            r0 = 4375(0x1117, float:6.13E-42)
            java.lang.String r1 = X.C108955ca.A0v(r9, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            r0[r4] = r3
            java.util.List r0 = X.AnonymousClass1YF.A0S(r1, r0, r4)
            java.util.List r3 = X.C29431cG.A0t(r0)
            java.lang.String r0 = "*"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0051
            android.net.Uri r1 = android.net.Uri.parse(r11)
            java.lang.String r0 = r1.getHost()
            boolean r0 = X.C29431cG.A18(r3, r0)
            if (r0 != 0) goto L_0x0051
            java.lang.String r1 = r1.getScheme()
            java.lang.String r0 = "file"
            X.C18070vi.A18(r1, r0)
        L_0x004c:
            android.content.Intent r0 = X.C72473Md.A0D(r11)
            return r0
        L_0x0051:
            if (r10 == 0) goto L_0x0055
            java.lang.String r7 = r10.user
        L_0x0055:
            boolean r0 = X.C29431cG.A18(r6, r7)
            if (r0 == r2) goto L_0x004c
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.CheckoutLiteWebViewActivity"
            r3.setClassName(r1, r0)
            X.C17960vV.A07(r11)
            java.lang.String r0 = "webview_url"
            r3.putExtra(r0, r11)
            java.lang.String r0 = "webview_javascript_enabled"
            r3.putExtra(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "webview_callback"
            r3.putExtra(r0, r5)
        L_0x0080:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "webview_cancel_callback"
            r3.putExtra(r0, r5)
        L_0x008b:
            java.lang.String r0 = "webview_should_ask_before_close"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_hide_url"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "webview_open_new_tab_in_external_browser"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "deep_link_type_support"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_deeplink_enabled"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_title_show_domain_only"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_toolbar_v2"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_can_navigate_back"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "webview_fallback_to_external_browser_on_webview_errors"
            r3.putExtra(r0, r2)
            java.lang.String r1 = "message_cta_type"
            java.lang.String r0 = "checkout_lite"
            android.content.Intent r0 = r3.putExtra(r1, r0)
            X.C18070vi.A0b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X6.A00(android.app.Activity, X.0ve, com.whatsapp.jid.UserJid, java.lang.String):android.content.Intent");
    }
}
