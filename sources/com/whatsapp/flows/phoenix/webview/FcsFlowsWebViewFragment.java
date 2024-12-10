package com.whatsapp.flows.phoenix.webview;

import X.A0M;
import X.A25;
import X.A2M;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1PM;
import X.AnonymousClass1RK;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C200410p;
import X.C29431cG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class FcsFlowsWebViewFragment extends Hilt_FcsFlowsWebViewFragment {
    public static final Set A0A = C200410p.A0S(new String[]{"string", "integer", "boolean", "number"});
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1PM A02;
    public AnonymousClass122 A03;
    public AnonymousClass1RK A04;
    public AnonymousClass10I A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            ((A2M) C18070vi.A0E(r0)).A02((Boolean) null, C17890vO.A0L(), "WEBVIEW", (String) null, (String) null, (String) null);
            return super.A1q(bundle, layoutInflater, viewGroup);
        }
        C18070vi.A11("wamFlowsScreenProgressReporter");
        throw null;
    }

    public static final void A00(FcsFlowsWebViewFragment fcsFlowsWebViewFragment, String str) {
        String str2;
        C18030ve r2 = fcsFlowsWebViewFragment.A01;
        if (r2 == null) {
            str2 = "abProps";
        } else if (C18020vd.A05(C18040vf.A02, r2, 5910)) {
            AnonymousClass00H r0 = fcsFlowsWebViewFragment.A07;
            if (r0 != null) {
                A25 a25 = (A25) r0.get();
                AnonymousClass1FL A1B = fcsFlowsWebViewFragment.A1B();
                AnonymousClass1PM r1 = fcsFlowsWebViewFragment.A02;
                if (r1 != null) {
                    AnonymousClass00H r02 = fcsFlowsWebViewFragment.A09;
                    if (r02 != null) {
                        a25.A01(A1B, r1, (A0M) C18070vi.A0E(r02), str);
                        return;
                    }
                    str2 = "wamFlowsStructuredMessageInteractionReporter";
                } else {
                    str2 = "verifiedNameManager";
                }
            } else {
                str2 = "flowsDataUtil";
            }
        } else {
            return;
        }
        C18070vi.A11(str2);
        throw null;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(android.net.Uri r7, com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment r8, java.util.HashMap r9, java.util.Map r10) {
        /*
            java.util.Iterator r6 = X.AnonymousClass000.A15(r10)
        L_0x0004:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0090
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r6)
            java.lang.String r4 = X.C17880vN.A0x(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            r5 = 0
            java.lang.String r3 = "phoenix-webview-payload-validation-error"
            if (r0 == 0) goto L_0x003b
            java.util.HashMap r0 = X.C17880vN.A11()
            r9.put(r4, r0)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }"
            X.C18070vi.A0z(r1, r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = A01(r7, r8, r1, r2)
            if (r0 != 0) goto L_0x0004
        L_0x0037:
            A00(r8, r3)
            return r5
        L_0x003b:
            java.lang.String r1 = r7.getQueryParameter(r4)
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "integer"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r1 = X.AnonymousClass1YD.A03(r1)
        L_0x004d:
            if (r1 != 0) goto L_0x007f
            goto L_0x0037
        L_0x0050:
            java.lang.String r0 = "number"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x006b
            r2 = 0
            X.1wr r0 = X.C182189Tk.A00     // Catch:{ NumberFormatException -> 0x0069 }
            boolean r0 = r0.A03(r1)     // Catch:{ NumberFormatException -> 0x0069 }
            if (r0 == 0) goto L_0x0037
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0069 }
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0069 }
        L_0x0069:
            r1 = r2
            goto L_0x004d
        L_0x006b:
            java.lang.String r0 = "boolean"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0083
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
        L_0x007f:
            r9.put(r4, r1)
            goto L_0x0004
        L_0x0083:
            java.lang.String r0 = "false"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x007f
        L_0x0090:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment.A01(android.net.Uri, com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment, java.util.HashMap, java.util.Map):boolean");
    }

    public static final boolean A02(FcsFlowsWebViewFragment fcsFlowsWebViewFragment, Map map) {
        boolean A18;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Object A0P = C17890vO.A0P(A15);
            if (A0P instanceof Map) {
                A18 = A02(fcsFlowsWebViewFragment, (Map) A0P);
                continue;
            } else {
                A18 = C29431cG.A18(A0A, A0P);
                continue;
            }
            if (!A18) {
                return false;
            }
        }
        return true;
    }
}
