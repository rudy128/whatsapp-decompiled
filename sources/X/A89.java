package X;

import java.util.Iterator;
import java.util.List;

public class A89 {
    public final C18030ve A00;
    public final AnonymousClass190 A01;
    public final C192299o8 A02;
    public final C193209pi A03;
    public final C198969zD A04;
    public final C19969A1e A05;

    public static C166248ca A01(C166348ck r2) {
        Object obj;
        if (r2.formatCase_ == 1) {
            C165628bV A0R = r2.A0R();
            if (A0R.titleCase_ == 4) {
                obj = A0R.title_;
            }
            return C166248ca.DEFAULT_INSTANCE;
        }
        C165868bt A0K = AnonymousClass8BS.A0K(r2);
        if (A0K.titleCase_ == 4) {
            obj = A0K.title_;
        }
        return C166248ca.DEFAULT_INSTANCE;
        return (C166248ca) obj;
    }

    public static boolean A04(C166348ck r3) {
        Integer A0S;
        if (C17890vO.A1R(r3.formatCase_)) {
            A0S = AnonymousClass8BY.A0S(r3.A0R().titleCase_);
        } else {
            A0S = AnonymousClass8BY.A0S(AnonymousClass8BS.A0K(r3).titleCase_);
        }
        if (A0S != AnonymousClass00R.A0N) {
            return false;
        }
        return true;
    }

    public A89(AnonymousClass190 r1, C18030ve r2, C192299o8 r3, C193209pi r4, C198969zD r5, C19969A1e a1e) {
        this.A00 = r2;
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = a1e;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static C166398cp A00(C166418cr r3) {
        if (r3.A0R()) {
            C166348ck r0 = r3.templateMessage_;
            C166348ck r2 = r0;
            if (r0 == null) {
                r0 = C166348ck.DEFAULT_INSTANCE;
            }
            if (r0.formatCase_ == 5) {
                if (r2 == null) {
                    r2 = C166348ck.DEFAULT_INSTANCE;
                }
                if (r2.formatCase_ == 5) {
                    return (C166398cp) r2.format_;
                }
                return C166398cp.DEFAULT_INSTANCE;
            }
        }
        C166398cp r02 = r3.interactiveMessage_;
        if (r02 != null) {
            return r02;
        }
        return C166398cp.DEFAULT_INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.C18030ve r11, X.C165868bt r12) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r10 = 0
        L_0x0005:
            X.EE9 r0 = r12.hydratedButtons_
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x00e9
            X.EE9 r0 = r12.hydratedButtons_
            java.lang.Object r2 = r0.get(r10)
            X.8ch r2 = (X.C166318ch) r2
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x00cb
            java.lang.Object r0 = r2.hydratedButton_
            X.8Yv r0 = (X.C164438Yv) r0
            java.lang.String r3 = r0.displayText_
        L_0x0020:
            r0 = 50
            java.lang.String r6 = X.AnonymousClass1EG.A0F(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x009f
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x00ab
            r9 = 1
            java.lang.Object r0 = r2.hydratedButton_
            X.8Yv r0 = (X.C164438Yv) r0
            java.lang.String r7 = r0.id_
        L_0x0038:
            java.lang.String r8 = ""
        L_0x003a:
            X.2qD r5 = new X.2qD
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = 5970(0x1752, float:8.366E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r11, r4)
            if (r0 == 0) goto L_0x0083
            boolean r0 = X.C18020vd.A05(r3, r11, r4)
            if (r0 == 0) goto L_0x00a9
            int r3 = r2.hydratedButtonCase_
            r0 = 2
            if (r3 != r0) goto L_0x00a9
            X.8bH r0 = r2.A0R()
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00a9
            X.8bH r0 = r2.A0R()
            int r0 = r0.webviewPresentation_
            X.2RE r0 = X.AnonymousClass2RE.A00(r0)
            if (r0 != 0) goto L_0x006c
            X.2RE r0 = X.AnonymousClass2RE.FULL
        L_0x006c:
            int r3 = r0.ordinal()
            r0 = 0
            if (r3 == r0) goto L_0x00a6
            r0 = 1
            if (r3 == r0) goto L_0x00a3
            r0 = 2
            if (r3 != r0) goto L_0x00e4
            java.lang.String r3 = "compact"
        L_0x007b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0083
            r5.A03 = r3
        L_0x0083:
            r3 = 2
            if (r9 != r3) goto L_0x009c
            int r0 = r2.hydratedButtonCase_
            if (r0 != r3) goto L_0x009c
            X.8bH r0 = r2.A0R()
            int r0 = r0.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x009c
            X.8bH r0 = r2.A0R()
            boolean r0 = r0.webviewInteraction_
            r5.A05 = r0
        L_0x009c:
            r1.add(r5)
        L_0x009f:
            int r10 = r10 + 1
            goto L_0x0005
        L_0x00a3:
            java.lang.String r3 = "tall"
            goto L_0x007b
        L_0x00a6:
            java.lang.String r3 = "full"
            goto L_0x007b
        L_0x00a9:
            r3 = 0
            goto L_0x007b
        L_0x00ab:
            r0 = 2
            if (r3 != r0) goto L_0x00bd
            r9 = 2
            X.8bH r0 = r2.A0R()
            java.lang.String r7 = r0.url_
            X.8bH r0 = r2.A0R()
            java.lang.String r8 = r0.consentedUsersUrl_
            goto L_0x003a
        L_0x00bd:
            r9 = 3
            if (r3 != r9) goto L_0x00c8
            java.lang.Object r0 = r2.hydratedButton_
            X.8Yu r0 = (X.C164428Yu) r0
        L_0x00c4:
            java.lang.String r7 = r0.phoneNumber_
            goto L_0x0038
        L_0x00c8:
            X.8Yu r0 = X.C164428Yu.DEFAULT_INSTANCE
            goto L_0x00c4
        L_0x00cb:
            r0 = 2
            if (r3 != r0) goto L_0x00d6
            X.8bH r0 = r2.A0R()
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00d6:
            r0 = 3
            if (r3 != r0) goto L_0x00e1
            java.lang.Object r0 = r2.hydratedButton_
            X.8Yu r0 = (X.C164428Yu) r0
        L_0x00dd:
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00e1:
            X.8Yu r0 = X.C164428Yu.DEFAULT_INSTANCE
            goto L_0x00dd
        L_0x00e4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00e9:
            int r0 = r1.size()
            if (r0 > 0) goto L_0x00f0
            r1 = 0
        L_0x00f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A89.A02(X.0ve, X.8bt):java.util.ArrayList");
    }

    public static void A03(A89 a89, String str, List list) {
        Iterator it = list.iterator();
        C61762qD r1 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            C61762qD r4 = (C61762qD) it.next();
            if (r4 == null) {
                i++;
            } else {
                if (r4.A09.isEmpty()) {
                    i2++;
                }
                int i6 = r4.A07;
                if (i6 == 2) {
                    i3++;
                } else if (i6 == 3) {
                    i4++;
                }
                if (!(r1 == null || C17890vO.A1R(r1.A07) == C17890vO.A1R(i6))) {
                    i5++;
                }
                r1 = r4;
            }
        }
        if (list.size() > 10) {
            a89.A01.A0G("TemplateMessageHasMoreThanTenTemplateButtons", String.format("%s: FMessage field of templateInfo has more than 10 templateButtons", new Object[]{str}), true);
        }
        if (i > 0) {
            a89.A01.A0G("TemplateMessageHasNullInButtonList", String.format("%s: FMessage field of templateInfo has at least 1 null templateButton", new Object[]{str}), true);
        }
        if (i2 > 0) {
            a89.A01.A0G("TemplateMessageHasTemplateButtonWithEmptyText", String.format("%s: FMessage field of templateInfo has at least 1 button with empty text", new Object[]{str}), true);
        }
        if (i3 > 2) {
            a89.A01.A0G("TemplateMessageHasMoreThanTwoURLButtons", String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed URL buttons of 2", new Object[]{str}), true);
        }
        if (i4 > 1) {
            a89.A01.A0G("TemplateMessageHasMoreThanOneCallButton", AnonymousClass8BS.A0l(str, "%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[1], 0), true);
        }
        if (i5 > 1) {
            a89.A01.A0G("TemplateMessageHasStaggeredTemplateButtons", AnonymousClass8BS.A0l(str, "%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[1], 0), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0.formatCase_ == 5) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C166418cr r2) {
        /*
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x0013
            X.8ck r0 = r2.templateMessage_
            if (r0 != 0) goto L_0x000c
            X.8ck r0 = X.C166348ck.DEFAULT_INSTANCE
        L_0x000c:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0013
        L_0x0011:
            r1 = 1
        L_0x0012:
            return r1
        L_0x0013:
            int r0 = r2.bitField1_
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A89.A05(X.8cr):boolean");
    }
}
