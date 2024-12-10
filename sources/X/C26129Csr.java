package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.Csr  reason: case insensitive filesystem */
public final class C26129Csr {
    public static final C26129Csr A00 = new Object();

    public final boolean A02(Activity activity, C25148CZz cZz) {
        ComponentName componentName = activity.getComponentName();
        C18070vi.A0X(componentName);
        if (A04(new C25148CZz(componentName), cZz)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return A00.A03(intent, cZz);
        }
        return false;
    }

    public final boolean A03(Intent intent, C25148CZz cZz) {
        C25148CZz cZz2;
        String str;
        ComponentName component = intent.getComponent();
        if (component != null) {
            cZz2 = new C25148CZz(component);
        } else {
            cZz2 = null;
        }
        if (A04(cZz2, cZz)) {
            return true;
        }
        if (intent.getComponent() != null || (str = intent.getPackage()) == null) {
            return false;
        }
        String str2 = cZz.A01;
        if ((str.equals(str2) || A01(str, str2)) && C18070vi.A18(cZz.A00, "*")) {
            return true;
        }
        return false;
    }

    public static final boolean A01(String str, String str2) {
        if (!AnonymousClass1YF.A0Y(str2, "*", false)) {
            return false;
        }
        if (C18070vi.A18(str2, "*")) {
            return true;
        }
        int A0F = AnonymousClass1YF.A0F(str2, "*", 0, false);
        int length = str2.length();
        if (A0F == AnonymousClass1YF.A0E(str2, "*", length - 1) && str2.endsWith("*")) {
            return AnonymousClass1YE.A0A(str, C108955ca.A0q(0, length - 1, str2), false);
        }
        throw AnonymousClass000.A0k("Name pattern with a wildcard must only contain a single wildcard in the end");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (A01(r2, r1) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C25148CZz r6, X.C25148CZz r7) {
        /*
            r5 = this;
            java.lang.String r1 = "*"
            r4 = 1
            if (r6 != 0) goto L_0x0016
            java.lang.String r0 = r7.A01
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r7.A00
            boolean r1 = X.C18070vi.A18(r0, r1)
        L_0x0013:
            if (r1 == 0) goto L_0x0049
            return r4
        L_0x0016:
            java.lang.String r0 = r6.toString()
            boolean r0 = X.AnonymousClass1YF.A0V(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004b
            java.lang.String r2 = r6.A01
            java.lang.String r1 = r7.A01
            boolean r0 = X.C18070vi.A18(r2, r1)
            if (r0 != 0) goto L_0x0033
            boolean r0 = A01(r2, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            java.lang.String r2 = r6.A00
            java.lang.String r1 = r7.A00
            boolean r0 = X.C18070vi.A18(r2, r1)
            if (r0 != 0) goto L_0x0045
            boolean r0 = A01(r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            goto L_0x0013
        L_0x0049:
            r4 = 0
            return r4
        L_0x004b:
            java.lang.String r0 = "Wildcard can only be part of the rule."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26129Csr.A04(X.CZz, X.CZz):boolean");
    }

    public static final void A00(String str, String str2) {
        int length = str.length();
        if (length > 0) {
            int length2 = str2.length();
            if (length2 <= 0) {
                throw AnonymousClass000.A0k("Activity class name must not be empty");
            } else if (AnonymousClass1YF.A0V(str, "*") && AnonymousClass1YF.A0F(str, "*", 0, false) != length - 1) {
                throw AnonymousClass000.A0k("Wildcard in package name is only allowed at the end.");
            } else if (AnonymousClass1YF.A0V(str2, "*") && AnonymousClass1YF.A0F(str2, "*", 0, false) != length2 - 1) {
                throw AnonymousClass000.A0k("Wildcard in class name is only allowed at the end.");
            }
        } else {
            throw AnonymousClass000.A0k("Package name must not be empty");
        }
    }
}
