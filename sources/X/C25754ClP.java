package X;

import android.util.SparseArray;
import com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil;
import java.util.LinkedList;

/* renamed from: X.ClP  reason: case insensitive filesystem */
public abstract class C25754ClP {
    public static boolean A01(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13566:
            case 13656:
            case 13688:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 16310:
            case 16515:
            case 16529:
            case 16913:
                return true;
            default:
                return false;
        }
    }

    public static AnonymousClass7RK A00(SparseArray sparseArray, DOZ doz, Runnable runnable) {
        doz.A02.A01.BNU();
        AnonymousClass7RK r2 = new AnonymousClass7RK(runnable);
        C25594CiZ ciZ = (C25594CiZ) sparseArray.get(2131428176);
        if (ciZ != null && C26176Ctu.A03() && !ciZ.A00 && !ciZ.A01) {
            LinkedList linkedList = ciZ.A04;
            linkedList.isEmpty();
            linkedList.add(r2);
        }
        return r2;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.DNR] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.CIs, java.lang.Object] */
    public Object A02(DOZ doz, DFL dfl) {
        int i = dfl.A05;
        if (!A01(i)) {
            return null;
        }
        switch (i) {
            case 13313:
                return new Object();
            case 13337:
                String A0d = BE7.A0d(dfl);
                if (A0d == null || A0d.length() <= 0) {
                    return null;
                }
                return new D4M(A0d);
            case 13566:
            case 13656:
            case 16515:
            case 16913:
                return null;
            case 13688:
                ? obj = new Object();
                obj.A00(dfl);
                return obj;
            case 13762:
                return new Object();
            case 13768:
                return BKBloksComponentsBKSTextInputFormatterBinderUtil.createController(doz, dfl);
            case 13774:
                return new C24834CMc();
            case 13914:
                ? obj2 = new Object();
                obj2.A00 = false;
                return obj2;
            case 13981:
                return new D8K();
            case 14001:
                return new Object();
            case 15833:
                return new D8L();
            case 16310:
                return new C25079CWo(doz, dfl);
            case 16529:
                return new Object();
            default:
                throw BEB.A0S(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0261, code lost:
        X.C25913CoX.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0264, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026c, code lost:
        r12.setTag(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e8, code lost:
        r12.setOnKeyListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020e, code lost:
        if (r2 != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.DOZ r19, X.DFL r20, X.DFL r21, java.lang.Object r22) {
        /*
            r18 = this;
            r10 = r20
            r12 = r22
            int r1 = r10.A05
            boolean r0 = A01(r1)
            if (r0 == 0) goto L_0x036e
            android.view.View r12 = (android.view.View) r12
            r9 = r19
            r7 = r21
            switch(r1) {
                case 13313: goto L_0x001a;
                case 13337: goto L_0x030a;
                case 13566: goto L_0x0079;
                case 13656: goto L_0x0082;
                case 13688: goto L_0x00a4;
                case 13762: goto L_0x0117;
                case 13768: goto L_0x0290;
                case 13774: goto L_0x015d;
                case 13914: goto L_0x01a6;
                case 13981: goto L_0x01d2;
                case 14001: goto L_0x0294;
                case 15833: goto L_0x0298;
                case 16310: goto L_0x01ec;
                case 16515: goto L_0x024f;
                case 16529: goto L_0x0270;
                case 16913: goto L_0x029c;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r1)
            throw r0
        L_0x001a:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r5 = 1
            r1 = 2
            java.lang.Object r4 = X.C26272CwJ.A04(r9, r10)
            X.CP2 r4 = (X.CP2) r4
            if (r4 == 0) goto L_0x036e
            int r0 = r12.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            boolean r0 = r12.isFocusable()
            r4.A01 = r0
            r0 = 35
            boolean r0 = r10.A0I(r0, r5)
            r3 = 0
            if (r0 != 0) goto L_0x0077
            r12.setImportantForAccessibility(r1)
            r2 = 0
        L_0x0045:
            java.lang.String r1 = X.BE7.A0e(r10)
            java.lang.String r0 = X.BE7.A0f(r10)
            if (r1 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r3 = 1
        L_0x0052:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x0062
            r12.setImportantForAccessibility(r5)
            r12.setFocusable(r5)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0062
            r12.requestFocus()
        L_0x0062:
            X.BJe r0 = new X.BJe
            r0.<init>(r10)
            X.AnonymousClass1HF.A0f(r12, r0)
            X.C18070vi.A0b(r7)
            r0 = 45
            java.util.List r0 = X.BE7.A0s(r10, r0)
            X.C25302Cd6.A01(r9, r7, r0)
            return
        L_0x0077:
            r2 = 1
            goto L_0x0045
        L_0x0079:
            r1 = 2131436043(0x7f0b220b, float:1.8493945E38)
            java.lang.String r0 = X.BE7.A0d(r10)
            goto L_0x026c
        L_0x0082:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r1 = 2131428256(0x7f0b03a0, float:1.8478151E38)
            android.util.SparseArray r0 = r9.A01
            java.lang.Object r16 = r0.get(r1)
            r17 = 2
            X.AkZ r11 = new X.AkZ
            r13 = r7
            r14 = r10
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.7RK r1 = A00(r0, r9, r11)
            r0 = 2131434499(0x7f0b1c03, float:1.8490814E38)
            r12.setTag(r0, r1)
            return
        L_0x00a4:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r3 = 1
            java.lang.Object r2 = X.C26272CwJ.A04(r9, r10)
            X.DNR r2 = (X.DNR) r2
            if (r2 != 0) goto L_0x00b7
            java.lang.String r1 = "ViewTransformsExtensionBinderUtils"
            java.lang.String r0 = "Null controller while binding ViewTransformsExtension"
            goto L_0x0261
        L_0x00b7:
            boolean r5 = X.C26272CwJ.A08(r9)
            if (r5 == 0) goto L_0x00c0
            r2.A00(r10)
        L_0x00c0:
            r2.A0B = r12
            float r0 = r2.A00
            r12.setAlpha(r0)
            float r0 = r2.A04
            r12.setRotation(r0)
            float r0 = r2.A05
            r12.setRotationX(r0)
            float r0 = r2.A06
            r12.setRotationY(r0)
            android.content.Context r1 = r9.A00
            float r4 = r2.A01
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00e1
            r4 = 1325400064(0x4f000000, float:2.14748365E9)
        L_0x00e1:
            float r1 = X.C72463Mc.A00(r1)
            float r1 = r1 * r1
            float r0 = -r4
            float r1 = r1 * r0
            float r0 = X.C26089Cs7.A00
            float r1 = r1 * r0
            r12.setCameraDistance(r1)
            float r0 = r2.A07
            r12.setScaleX(r0)
            float r0 = r2.A08
            r12.setScaleY(r0)
            r2.A0E = r3
            if (r5 == 0) goto L_0x0104
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0104
            X.C26089Cs7.A01(r12, r2)
            return
        L_0x0104:
            X.D5G r0 = new X.D5G
            r0.<init>(r12, r2)
            r2.A0C = r0
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.A0C
            r1.addOnPreDrawListener(r0)
            r2.A0D = r3
            return
        L_0x0117:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            int r1 = r7.A05
            r0 = 13323(0x340b, float:1.867E-41)
            if (r1 == r0) goto L_0x0129
            java.lang.String r1 = "invalid_extension_used"
            java.lang.String r0 = "bk.components.AvatarImageExtension should only be used for image components"
            android.util.Log.e(r1, r0)
            return
        L_0x0129:
            r1 = 35
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.A03(r1, r0)
            r1 = 38
            r0 = 0
            float r2 = r10.A03(r1, r0)
            r12.setScaleX(r3)
            r12.setScaleY(r3)
            float r0 = X.C108945cZ.A04(r12)
            float r0 = r0 * r2
            float r0 = r0 * r3
            r12.setTranslationY(r0)
            X.D4u r1 = new X.D4u
            r1.<init>(r3, r2)
            r12.addOnLayoutChangeListener(r1)
            X.C18070vi.A0b(r9)
            java.lang.Object r0 = X.C26272CwJ.A04(r9, r10)
            X.CIk r0 = (X.C24748CIk) r0
            if (r0 == 0) goto L_0x036e
            r0.A00 = r1
            return
        L_0x015d:
            java.lang.Object r4 = X.C26272CwJ.A04(r9, r10)
            X.CMc r4 = (X.C24834CMc) r4
            if (r4 == 0) goto L_0x018b
            X.D5D r0 = r4.A00
            if (r0 != 0) goto L_0x018b
            android.content.Context r3 = r9.A00
            android.app.Activity r1 = X.C20101A7f.A00(r3)
            if (r1 == 0) goto L_0x01a1
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0178:
            boolean r0 = r4.A01
            X.D5D r2 = new X.D5D
            r2.<init>(r1, r0)
            X.D8N r1 = new X.D8N
            r1.<init>(r3, r9, r10, r7)
            java.util.List r0 = r2.A03
            r0.add(r1)
            r4.A00 = r2
        L_0x018b:
            r0 = 53
            X.E8A r1 = r10.A0A(r0)
            r0 = 54
            X.E8A r0 = r10.A0A(r0)
            if (r1 != 0) goto L_0x019b
            if (r0 == 0) goto L_0x036e
        L_0x019b:
            X.D4t r2 = new X.D4t
            r2.<init>(r9, r7, r1, r0)
            goto L_0x01e8
        L_0x01a1:
            android.view.View r1 = r12.getRootView()
            goto L_0x0178
        L_0x01a6:
            r2 = 1
            java.lang.Object r1 = X.BE9.A0l(r9, r10)
            X.CIs r1 = (X.C24755CIs) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x01c2
            r1.A00 = r2
            r0 = 41
            X.E8A r1 = r10.A0A(r0)
            if (r1 == 0) goto L_0x01c2
            X.A4p r0 = X.BE7.A0Q(r7)
            X.C26209Cul.A04(r9, r10, r0, r1, r2)
        L_0x01c2:
            r0 = 42
            X.E8A r1 = r10.A0A(r0)
            if (r1 == 0) goto L_0x036e
            X.A4p r0 = X.BE7.A0Q(r7)
            X.C26209Cul.A04(r9, r10, r0, r1, r2)
            return
        L_0x01d2:
            X.D53 r0 = new X.D53
            r0.<init>(r9, r10, r7)
            r12.setOnTouchListener(r0)
            java.lang.Object r0 = X.C26272CwJ.A04(r9, r10)
            X.C28111Yx.A02(r0)
            X.E3q r0 = (X.C28486E3q) r0
            X.D4r r2 = new X.D4r
            r2.<init>(r0)
        L_0x01e8:
            r12.setOnKeyListener(r2)
            return
        L_0x01ec:
            java.lang.Object r4 = X.C26272CwJ.A04(r9, r10)
            X.C28111Yx.A02(r4)
            X.CWo r4 = (X.C25079CWo) r4
            android.os.Handler r1 = X.CEG.A00
            java.lang.Runnable r0 = r4.A03
            r1.removeCallbacks(r0)
            r0 = 41
            java.lang.Object r5 = X.DFL.A00(r10, r0)
            r0 = 42
            r3 = 1
            boolean r2 = r10.A0I(r0, r3)
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0210
            r1 = 0
            if (r2 == 0) goto L_0x0211
        L_0x0210:
            r1 = 1
        L_0x0211:
            java.lang.ref.WeakReference r0 = r4.A00
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r0.get()
        L_0x0219:
            if (r1 == 0) goto L_0x0242
            boolean r0 = X.C25337Cdw.A00(r5, r0)
            if (r0 != 0) goto L_0x0242
            r4.A00()
            r0 = 35
            X.E8A r2 = r10.A0A(r0)
            if (r2 == 0) goto L_0x0242
            X.A4p r1 = X.BE7.A0Q(r9)
            java.lang.ref.WeakReference r0 = r4.A00
            if (r0 == 0) goto L_0x024b
            java.lang.Object r0 = r0.get()
        L_0x0238:
            r1.A03(r0, r3)
            r0 = 2
            r1.A03(r5, r0)
            X.C26209Cul.A03(r9, r10, r1, r2)
        L_0x0242:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r5)
            r4.A00 = r0
            r4.A01 = r3
            return
        L_0x024b:
            r0 = 0
            goto L_0x0238
        L_0x024d:
            r0 = 0
            goto L_0x0219
        L_0x024f:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r0 = 35
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r10.A04(r0, r1)
            if (r0 != r1) goto L_0x0265
            java.lang.String r1 = "BloksViewTagExtension"
            java.lang.String r0 = "ViewTagExtension is used, but no actual tag value is provided or FALLBACK_INT_TAG is found. This redundantly forces parent component for have a View"
        L_0x0261:
            X.C25913CoX.A01(r1, r0)
            return
        L_0x0265:
            r1 = 2131428188(0x7f0b035c, float:1.8478013E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x026c:
            r12.setTag(r1, r0)
            return
        L_0x0270:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r1 = 2131428256(0x7f0b03a0, float:1.8478151E38)
            android.util.SparseArray r0 = r9.A01
            java.lang.Object r6 = r0.get(r1)
            java.lang.Object r8 = X.BE9.A0l(r9, r10)
            X.9Zb r8 = (X.C183649Zb) r8
            r11 = 3
            X.AkZ r5 = new X.AkZ
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.7RK r0 = A00(r0, r9, r5)
            r8.A00 = r0
            return
        L_0x0290:
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.bind(r12, r9, r10, r7)
            return
        L_0x0294:
            X.C25920Coe.A00(r12, r9, r10, r7)
            return
        L_0x0298:
            X.C25371CeW.A00(r12, r9, r10, r7)
            return
        L_0x029c:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            r1 = 1
            r0 = 38
            boolean r0 = r10.A0I(r0, r1)
            if (r0 == 0) goto L_0x036e
            boolean r0 = r12 instanceof X.E1I
            if (r0 == 0) goto L_0x036e
            r0 = 36
            X.E8A r2 = r10.A0A(r0)
            if (r2 == 0) goto L_0x036e
            X.E1I r12 = (X.E1I) r12
            java.lang.String r6 = X.BE7.A0d(r10)
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "image/*"
            r5 = 0
            r3[r5] = r0
            if (r6 == 0) goto L_0x02ef
            int r4 = r6.hashCode()
            r0 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r0) goto L_0x02ef
            r0 = 102340(0x18fc4, float:1.43409E-40)
            if (r4 == r0) goto L_0x02fb
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r4 != r0) goto L_0x02ef
            java.lang.String r0 = "image"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x02ef
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "image/png"
            r3[r5] = r0
            java.lang.String r0 = "image/jpeg"
            r3[r1] = r0
            r1 = 2
            java.lang.String r0 = "image/webp"
            r3[r1] = r0
        L_0x02ef:
            com.facebook.primitive.textinput.TextInputView r12 = (com.facebook.primitive.textinput.TextInputView) r12
            r12.A02 = r3
            X.DF5 r0 = new X.DF5
            r0.<init>(r9, r7, r2)
            r12.A00 = r0
            return
        L_0x02fb:
            java.lang.String r0 = "gif"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x02ef
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "image/gif"
            r3[r5] = r0
            goto L_0x02ef
        L_0x030a:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            boolean r0 = r12 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x036e
            android.widget.EditText r12 = (android.widget.EditText) r12
            if (r12 == 0) goto L_0x036e
            java.lang.Object r4 = X.C26272CwJ.A04(r9, r10)
            X.D4M r4 = (X.D4M) r4
            if (r4 == 0) goto L_0x036e
            r4.A00 = r12
            java.lang.String r1 = X.BE7.A0d(r10)
            if (r1 == 0) goto L_0x0349
            java.lang.String r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x035b
            r4.A01 = r1
            int r3 = r1.length()
            r2 = 0
        L_0x0335:
            if (r2 >= r3) goto L_0x034e
            java.lang.String r0 = r4.A01
            char r1 = r0.charAt(r2)
            r0 = 35
            if (r1 == r0) goto L_0x0346
            java.util.ArrayList r0 = r4.A04
            X.C17890vO.A1D(r0, r2)
        L_0x0346:
            int r2 = r2 + 1
            goto L_0x0335
        L_0x0349:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x034e:
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L_0x035b
            android.text.Editable r0 = r0.getEditableText()
            if (r0 == 0) goto L_0x035b
            r4.afterTextChanged(r0)
        L_0x035b:
            java.lang.Object r1 = X.C26272CwJ.A04(r9, r7)
            X.CTH r1 = (X.CTH) r1
            if (r1 == 0) goto L_0x036e
            r0 = 0
            X.C26176Ctu.A02(r0)
            X.D4K r0 = r1.A01
            java.util.List r0 = r0.A02
            r0.add(r4)
        L_0x036e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25754ClP.A03(X.DOZ, X.DFL, X.DFL, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r8.setTag(r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r1.post(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        if ((r3 instanceof X.AnonymousClass7RK) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        r1 = (X.AnonymousClass7RK) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (r1.A01 != 2) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r1.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
        r8.removeCallbacks(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.DOZ r5, X.DFL r6, X.DFL r7, java.lang.Object r8) {
        /*
            r4 = this;
            int r1 = r6.A05
            boolean r0 = A01(r1)
            if (r0 == 0) goto L_0x0153
            android.view.View r8 = (android.view.View) r8
            switch(r1) {
                case 13313: goto L_0x0123;
                case 13337: goto L_0x0105;
                case 13566: goto L_0x001a;
                case 13656: goto L_0x00e4;
                case 13688: goto L_0x0026;
                case 13762: goto L_0x00c6;
                case 13768: goto L_0x0022;
                case 13774: goto L_0x009b;
                case 13914: goto L_0x008b;
                case 13981: goto L_0x0012;
                case 14001: goto L_0x001e;
                case 15833: goto L_0x006d;
                case 16310: goto L_0x005f;
                case 16515: goto L_0x0053;
                case 16529: goto L_0x0045;
                case 16913: goto L_0x002a;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r1)
            throw r0
        L_0x0012:
            r0 = 0
            r8.setOnTouchListener(r0)
            r8.setOnKeyListener(r0)
            return
        L_0x001a:
            r1 = 2131436043(0x7f0b220b, float:1.8493945E38)
            goto L_0x005a
        L_0x001e:
            X.C25920Coe.A01(r8, r5, r6, r7)
            return
        L_0x0022:
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.unbind(r8, r5, r6, r7)
            return
        L_0x0026:
            X.C26089Cs7.A00(r8, r5, r6)
            return
        L_0x002a:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r1 = 1
            r0 = 38
            boolean r0 = r6.A0I(r0, r1)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r8 instanceof X.E1I
            if (r0 == 0) goto L_0x0153
            X.E1I r8 = (X.E1I) r8
            r0 = 0
            com.facebook.primitive.textinput.TextInputView r8 = (com.facebook.primitive.textinput.TextInputView) r8
            r8.A02 = r0
            r8.A00 = r0
            return
        L_0x0045:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = X.BE9.A0l(r5, r6)
            X.9Zb r0 = (X.C183649Zb) r0
            java.lang.Runnable r3 = r0.A00
            goto L_0x00f1
        L_0x0053:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r1 = 2131428188(0x7f0b035c, float:1.8478013E38)
        L_0x005a:
            r0 = 0
            r8.setTag(r1, r0)
            return
        L_0x005f:
            java.lang.Object r0 = X.C26272CwJ.A04(r5, r6)
            X.C28111Yx.A02(r0)
            X.CWo r0 = (X.C25079CWo) r0
            android.os.Handler r1 = X.CEG.A00
            java.lang.Runnable r0 = r0.A03
            goto L_0x0087
        L_0x006d:
            r1 = 0
            r8.setOnTouchListener(r1)
            r8.setOnKeyListener(r1)
            java.lang.Object r2 = X.C26272CwJ.A04(r5, r6)
            X.C28111Yx.A02(r2)
            X.D8L r2 = (X.D8L) r2
            X.BH5 r0 = r2.A01
            if (r0 == 0) goto L_0x0083
            r0.A01 = r1
        L_0x0083:
            android.os.Handler r1 = X.C25371CeW.A00
            java.lang.Runnable r0 = r2.A03
        L_0x0087:
            r1.post(r0)
            return
        L_0x008b:
            r0 = 43
            X.E8A r1 = r6.A0A(r0)
            if (r1 == 0) goto L_0x0153
            X.A4p r0 = X.C108985cd.A0J(r7)
            X.C26209Cul.A03(r5, r6, r0, r1)
            return
        L_0x009b:
            java.lang.Object r3 = X.C26272CwJ.A04(r5, r6)
            X.CMc r3 = (X.C24834CMc) r3
            r2 = 0
            if (r3 == 0) goto L_0x00c2
            X.D5D r1 = r3.A00
            if (r1 != 0) goto L_0x00ac
            r0 = 0
            r3.A01 = r0
            return
        L_0x00ac:
            boolean r0 = r1.A00
            r3.A01 = r0
            java.util.List r0 = r1.A03
            r0.clear()
            android.view.View r0 = r1.A02
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x00c0
            r0.removeOnGlobalLayoutListener(r1)
        L_0x00c0:
            r3.A00 = r2
        L_0x00c2:
            r8.setOnKeyListener(r2)
            return
        L_0x00c6:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = X.C26272CwJ.A04(r5, r6)
            X.CIk r0 = (X.C24748CIk) r0
            if (r0 == 0) goto L_0x0153
            android.view.View$OnLayoutChangeListener r0 = r0.A00
            r8.removeOnLayoutChangeListener(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setScaleX(r0)
            r8.setScaleY(r0)
            r0 = 0
            r8.setTranslationY(r0)
            return
        L_0x00e4:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r0 = 2131434499(0x7f0b1c03, float:1.8490814E38)
            java.lang.Object r3 = r8.getTag(r0)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L_0x00f1:
            r2 = 2
            boolean r0 = r3 instanceof X.AnonymousClass7RK
            if (r0 == 0) goto L_0x0101
            r1 = r3
            X.7RK r1 = (X.AnonymousClass7RK) r1
            int r0 = r1.A01
            if (r0 != r2) goto L_0x0101
            r0 = 1
            r1.A00 = r0
            return
        L_0x0101:
            r8.removeCallbacks(r3)
            return
        L_0x0105:
            java.lang.Object r2 = X.C26272CwJ.A04(r5, r6)
            X.D4M r2 = (X.D4M) r2
            if (r2 == 0) goto L_0x0153
            r1 = 0
            r2.A00 = r1
            java.lang.Object r0 = X.C26272CwJ.A04(r5, r7)
            X.CTH r0 = (X.CTH) r0
            if (r0 == 0) goto L_0x0153
            X.C26176Ctu.A02(r1)
            X.D4K r0 = r0.A01
            java.util.List r0 = r0.A02
            r0.remove(r2)
            return
        L_0x0123:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r1 = X.C26272CwJ.A04(r5, r6)
            X.CP2 r1 = (X.CP2) r1
            if (r1 == 0) goto L_0x0153
            boolean r0 = r8.isFocused()
            r1.A02 = r0
            r0 = 0
            X.AnonymousClass1HF.A0f(r8, r0)
            java.lang.Integer r0 = r1.A00
            int r0 = X.AnonymousClass3MY.A03(r0)
            r8.setImportantForAccessibility(r0)
            boolean r0 = r1.A01
            r8.setFocusable(r0)
            X.C18070vi.A0b(r7)
            r0 = 45
            java.util.List r0 = X.BE7.A0s(r6, r0)
            X.C25302Cd6.A00(r5, r7, r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25754ClP.A04(X.DOZ, X.DFL, X.DFL, java.lang.Object):void");
    }
}
