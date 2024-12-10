package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Coe  reason: case insensitive filesystem */
public abstract class C25920Coe {
    public static final Map A00;
    public static final Map A01;

    public static void A00(View view, DOZ doz, DFL dfl, DFL dfl2) {
        int isFocusable;
        DOZ doz2 = doz;
        DFL dfl3 = dfl;
        CU4 cu4 = (CU4) C26272CwJ.A04(doz2, dfl3);
        if (cu4 != null) {
            View view2 = view;
            cu4.A04 = (String) view.getContentDescription();
            cu4.A01 = Integer.valueOf(view.getImportantForAccessibility());
            cu4.A02 = Integer.valueOf(view.getAccessibilityLiveRegion());
            cu4.A08 = view.isSelected();
            cu4.A05 = view.isEnabled();
            cu4.A06 = AnonymousClass1HF.A0s(view);
            cu4.A07 = AnonymousClass1HF.A0t(view);
            AnonymousClass1HF.A0f(view, new C22668BJj(doz2, dfl3, dfl2));
            String str = cu4.A04;
            int i = 35;
            String A0D = dfl3.A0D(35);
            if (A0D != null) {
                str = A0D;
            }
            Number A1E = C108945cZ.A1E(BE7.A0i(dfl3), A00);
            Number A1E2 = C108945cZ.A1E(dfl3.A0D(44), A01);
            boolean A0I = dfl3.A0I(49, cu4.A08);
            boolean A0I2 = dfl3.A0I(38, cu4.A05);
            boolean A0I3 = dfl3.A0I(41, cu4.A06);
            boolean A0I4 = dfl3.A0I(48, cu4.A07);
            Object A002 = DFL.A00(dfl3, 43);
            List A0G = dfl3.A0G(55);
            if (A0G != null && !A0G.isEmpty()) {
                Iterator it = A0G.iterator();
                while (it.hasNext()) {
                    DFL A0d = BE6.A0d(it);
                    String A0D2 = A0d.A0D(i);
                    E8A A0A = A0d.A0A(38);
                    if (A0D2 != null) {
                        Map map = C22668BJj.A05;
                        if (map.containsKey(A0D2)) {
                            int A0F = BE9.A0F(A0D2, map);
                            Object obj = map.get("click");
                            C221718w.A00(obj);
                            int A0M = AnonymousClass000.A0M(obj);
                            Object obj2 = map.get("long_click");
                            C221718w.A00(obj2);
                            int A0M2 = AnonymousClass000.A0M(obj2);
                            if (A0F == A0M) {
                                if (A0A != null && Build.VERSION.SDK_INT <= 25) {
                                    cu4.A09 = true;
                                    view2.setOnClickListener(new C26571D4l(A0M));
                                }
                            } else if (A0F == A0M2 && A0A != null) {
                                cu4.A0A = true;
                                view2.setOnLongClickListener(new C26584D4y(A0M2));
                            }
                        }
                    }
                    i = 35;
                }
            }
            String str2 = cu4.A03;
            view2.setContentDescription(str);
            cu4.A03 = str;
            if ((A1E2 == null || A1E2.intValue() == 0) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && view2.isAccessibilityFocused()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                obtain.setContentChangeTypes(4);
                obtain.setContentDescription(str);
                view2.sendAccessibilityEventUnchecked(obtain);
            }
            if (A1E == null) {
                A1E = cu4.A01;
            }
            view2.setImportantForAccessibility(A1E.intValue());
            if (A1E2 == null) {
                A1E2 = cu4.A02;
            }
            view2.setAccessibilityLiveRegion(A1E2.intValue());
            Boolean A003 = CCG.A00(DFL.A00(dfl3, 40));
            if (A003 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    isFocusable = view2.getFocusable();
                } else {
                    isFocusable = view2.isFocusable();
                }
                cu4.A00 = Integer.valueOf(isFocusable);
                view2.setFocusable(A003.booleanValue());
            }
            if (A002 != null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    new Handler(myLooper).post(new C27081DTg(view2, A002, doz2, 13));
                } else {
                    throw C17880vN.A0g();
                }
            }
            view2.setSelected(A0I);
            view2.setEnabled(A0I2);
            AnonymousClass1HF.A0q(view2, A0I3);
            AnonymousClass1HF.A0r(view2, A0I4);
            C25302Cd6.A01(doz2, dfl2, dfl3.A0G(56));
            if (dfl3.A0I(68, false) && cu4.A0B && !view2.isFocused() && view2.isFocusable()) {
                view2.requestFocus();
            }
        }
    }

    static {
        HashMap A11 = C17880vN.A11();
        Integer A0f = AnonymousClass3MY.A0f();
        A11.put("auto", A0f);
        Integer A0h = C17880vN.A0h();
        A11.put("yes", A0h);
        Integer A0i = C17880vN.A0i();
        A11.put("no", A0i);
        A11.put("no_hide_descendants", C17880vN.A0k());
        A00 = Collections.unmodifiableMap(A11);
        HashMap A112 = C17880vN.A11();
        A112.put("none", A0f);
        A112.put("polite", A0h);
        A112.put("assertive", A0i);
        A01 = Collections.unmodifiableMap(A112);
    }

    public static void A01(View view, DOZ doz, DFL dfl, DFL dfl2) {
        CU4 cu4 = (CU4) C26272CwJ.A04(doz, dfl);
        if (cu4 != null) {
            cu4.A0B = view.isFocused();
            AnonymousClass1HF.A0f(view, (AnonymousClass1XU) null);
            view.setContentDescription(cu4.A04);
            view.setImportantForAccessibility(cu4.A01.intValue());
            view.setAccessibilityLiveRegion(cu4.A02.intValue());
            Integer num = cu4.A00;
            if (num != null) {
                int i = Build.VERSION.SDK_INT;
                int intValue = num.intValue();
                if (i >= 26) {
                    view.setFocusable(intValue);
                } else {
                    view.setFocusable(C17890vO.A1R(intValue));
                }
            }
            view.setSelected(cu4.A08);
            view.setEnabled(cu4.A05);
            AnonymousClass1HF.A0q(view, cu4.A06);
            AnonymousClass1HF.A0r(view, cu4.A07);
            if (cu4.A09) {
                view.setOnClickListener((View.OnClickListener) null);
            }
            if (cu4.A0A) {
                view.setOnLongClickListener((View.OnLongClickListener) null);
            }
            C25302Cd6.A00(doz, dfl2, dfl.A0G(56));
            view.setLabelFor(-1);
        }
    }
}
