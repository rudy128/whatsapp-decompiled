package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BJj  reason: case insensitive filesystem */
public class C22668BJj extends AnonymousClass1XU {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final DFL A01;
    public final DOZ A02;
    public final DFL A03;
    public final Map A04;

    public boolean A1Y(View view, int i, Bundle bundle) {
        E8A e8a;
        String str;
        C5O c5o = (C5O) AnonymousClass000.A0w(this.A04, i);
        if (c5o == null || (e8a = c5o.A01) == null) {
            return super.A1Y(view, i, bundle);
        }
        DFL dfl = this.A03;
        Object A032 = C25681CkC.A03(this.A02, dfl, BE7.A0R(new C20046A4p(), dfl, 0), e8a);
        if ((A032 instanceof Number) || (A032 instanceof Boolean)) {
            return C25343Ce2.A01(A032);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        if (A032 != null) {
            str = "Got a non-boolean result while evaluating action ";
        } else {
            str = "Got a null result while evaluating action ";
        }
        C25913CoX.A01("bk.components.AndroidNativeAccessibilityExtension", AnonymousClass001.A1I(str, A10, i));
        return false;
    }

    public void A1Z(View view, C26228CvK cvK) {
        Number A1E;
        Number A1E2;
        C26228CvK cvK2 = cvK;
        super.A1Z(view, cvK2);
        DFL dfl = this.A01;
        boolean A0I = dfl.A0I(41, false);
        boolean A0I2 = dfl.A0I(49, false);
        boolean A0I3 = dfl.A0I(51, false);
        boolean A0I4 = dfl.A0I(36, false);
        String A0D = dfl.A0D(50);
        String A0D2 = dfl.A0D(45);
        String A0D3 = dfl.A0D(46);
        String A0D4 = dfl.A0D(58);
        String A0D5 = dfl.A0D(57);
        String A0D6 = dfl.A0D(67);
        String A0D7 = dfl.A0D(66);
        DFL A09 = dfl.A09(52);
        DFL A092 = dfl.A09(53);
        DFL A093 = dfl.A09(54);
        if (A09 != null) {
            String A0D8 = A09.A0D(40);
            float A032 = A09.A03(38, -1.0f);
            float A033 = A09.A03(36, -1.0f);
            float A034 = A09.A03(35, -1.0f);
            if (A032 >= 0.0f && A034 >= 0.0f && A033 >= 0.0f && (A1E2 = C108945cZ.A1E(A0D8, A07)) != null) {
                cvK2.A0N(C25477CgW.A00(A032, A033, A034, A1E2.intValue()));
            }
        }
        if (A092 != null) {
            int A042 = A092.A04(35, -1);
            int A043 = A092.A04(38, -1);
            boolean A0I5 = A092.A0I(36, false);
            String str = "none";
            String A0D9 = A092.A0D(40);
            if (A0D9 != null) {
                str = A0D9;
            }
            if (A042 >= -1 && A043 >= -1 && (A1E = C108945cZ.A1E(str, A06)) != null) {
                cvK2.A0Z(C25475CgU.A00(A043, A042, A1E.intValue(), A0I5));
            }
        }
        if (A093 != null) {
            int A044 = A093.A04(35, -1);
            int A045 = A093.A04(38, -1);
            int A046 = A093.A04(36, -1);
            int A047 = A093.A04(40, -1);
            if (A044 >= 0 && A045 >= 0 && A046 >= 0 && A047 >= 0) {
                cvK2.A0a(C25476CgV.A00(A045, A047, A044, A046, A0I, A0I2));
            }
        }
        Iterator A0l = C17890vO.A0l(this.A04);
        while (A0l.hasNext()) {
            C5O c5o = (C5O) A0l.next();
            int i = c5o.A00;
            Map map = A05;
            if (map.containsKey("click") && i == BE9.A0F("click", map)) {
                cvK2.A0f(true);
            } else if (map.containsKey("long_click") && i == BE9.A0F("long_click", map)) {
                cvK2.A0m(true);
            }
            String str2 = c5o.A02;
            if (str2 != null) {
                cvK2.A0L(new C26137Ct0(i, (CharSequence) str2));
            } else {
                cvK2.A0A(i);
            }
        }
        if (A0I3) {
            cvK2.A0d(true);
            cvK2.A0e(A0I4);
        }
        if (A0D != null) {
            cvK2.A0Y(A0D);
        }
        if (A0D2 != null && !A0D2.equals("none")) {
            Map map2 = A08;
            if (map2.containsKey(A0D2)) {
                cvK2.A0O((CharSequence) map2.get(A0D2));
            }
        }
        if (A0D3 != null) {
            cvK2.A0V(A0D3);
        }
        if (A0D4 != null) {
            cvK2.A0W(A0D4);
        }
        if (A0D5 != null && !A0D5.isEmpty()) {
            cvK2.A09();
            cvK2.A0R(A0D5);
        }
        if (A0D6 != null) {
            cvK2.A0U(A0D6);
        }
        if (A0D7 != null) {
            cvK2.A0P(A0D7);
        }
    }

    static {
        HashMap A11 = C17880vN.A11();
        A11.put("button", "android.widget.Button");
        A11.put("checkbox", "android.widget.CompoundButton");
        A11.put("checked_text_view", "android.widget.CheckedTextView");
        A11.put("drop_down_list", "android.widget.Spinner");
        A11.put("edit_text", "android.widget.EditText");
        A11.put("grid", "android.widget.GridView");
        A11.put("image", "android.widget.ImageView");
        A11.put("list", "android.widget.AbsListView");
        A11.put("pager", "androidx.viewpager.widget.ViewPager");
        A11.put("radio_button", "android.widget.RadioButton");
        A11.put("seek_control", "android.widget.SeekBar");
        A11.put("switch", "android.widget.Switch");
        A11.put("tab_bar", "android.widget.TabWidget");
        A11.put("toggle_button", "android.widget.ToggleButton");
        A11.put("view_group", "android.view.ViewGroup");
        A11.put("web_view", "android.webkit.WebView");
        A11.put("progress_bar", "android.widget.ProgressBar");
        A11.put("action_bar_tab", "android.app.ActionBar$Tab");
        A11.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A11.put("sliding_drawer", "android.widget.SlidingDrawer");
        A11.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A11.put("toast", "android.widget.Toast$TN");
        A11.put("alert_dialog", "android.app.AlertDialog");
        A11.put("date_picker_dialog", "android.app.DatePickerDialog");
        A11.put("time_picker_dialog", "android.app.TimePickerDialog");
        A11.put("date_picker", "android.widget.DatePicker");
        A11.put("time_picker", "android.widget.TimePicker");
        A11.put("number_picker", "android.widget.NumberPicker");
        A11.put("scroll_view", "android.widget.ScrollView");
        A11.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A11.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A11.put("none", "");
        A08 = Collections.unmodifiableMap(A11);
        HashMap A112 = C17880vN.A11();
        A112.put("click", A00(C26137Ct0.A08));
        A112.put("long_click", A00(C26137Ct0.A0L));
        A112.put("scroll_forward", A00(C26137Ct0.A0Z));
        A112.put("scroll_backward", A00(C26137Ct0.A0X));
        A112.put("expand", A00(C26137Ct0.A0H));
        A112.put("collapse", A00(C26137Ct0.A09));
        A112.put("dismiss", A00(C26137Ct0.A0D));
        A112.put("scroll_up", A00(C26137Ct0.A0e));
        A112.put("scroll_left", A00(C26137Ct0.A0b));
        A112.put("scroll_down", A00(C26137Ct0.A0Y));
        A112.put("scroll_right", A00(C26137Ct0.A0c));
        A112.put("custom", BE7.A0Z());
        A05 = Collections.unmodifiableMap(A112);
        HashMap A113 = C17880vN.A11();
        Integer A0i = C17880vN.A0i();
        A113.put("percent", A0i);
        Integer A0h = C17880vN.A0h();
        A113.put("float", A0h);
        Integer A0f = AnonymousClass3MY.A0f();
        A113.put("int", A0f);
        A07 = Collections.unmodifiableMap(A113);
        HashMap A114 = C17880vN.A11();
        A114.put("none", A0f);
        A114.put("single", A0h);
        A114.put("multiple", A0i);
        A06 = Collections.unmodifiableMap(A114);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.C5O] */
    public C22668BJj(DOZ doz, DFL dfl, DFL dfl2) {
        this.A01 = dfl;
        this.A03 = dfl2;
        this.A02 = doz;
        HashMap A11 = C17880vN.A11();
        List A0F = dfl.A0F(55);
        if (A0F != null && !A0F.isEmpty()) {
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                DFL A0d = BE6.A0d(it);
                String A0d2 = BE7.A0d(A0d);
                String A0e = BE7.A0e(A0d);
                E8A A0A = A0d.A0A(38);
                if (A0d2 != null) {
                    Map map = A05;
                    if (map.containsKey(A0d2)) {
                        int A0F2 = BE9.A0F(A0d2, map);
                        if (map.containsKey("custom") && A0F2 == BE9.A0F("custom", map)) {
                            A0F2 = this.A00;
                            this.A00 = A0F2 + 1;
                        }
                        Integer valueOf = Integer.valueOf(A0F2);
                        ? obj = new Object();
                        obj.A02 = A0e;
                        obj.A00 = A0F2;
                        obj.A01 = A0A;
                        A11.put(valueOf, obj);
                    }
                }
            }
        }
        this.A04 = A11;
    }

    public static Integer A00(C26137Ct0 ct0) {
        C221718w.A00(ct0);
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId());
    }
}
