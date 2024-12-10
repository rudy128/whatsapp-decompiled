package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7SK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SK implements C18090vk {
    public final /* synthetic */ C129466hq A00;
    public final /* synthetic */ AnonymousClass6Pp A01;
    public final /* synthetic */ C18090vk A02;

    public static final JSONObject A00(AnonymousClass71P r9) {
        Object obj;
        boolean z;
        View view;
        View view2;
        C18070vi.A0d(r9, 0);
        JSONObject A15 = C17880vN.A15();
        Object obj2 = r9.A03;
        boolean z2 = obj2 instanceof View;
        Integer num = null;
        if (!z2 || (view2 = (View) obj2) == null) {
            obj = null;
        } else {
            obj = view2.getTag(2131436825);
        }
        A15.put("node_class", r9.getClass().getCanonicalName());
        if (obj == null) {
            Class<?> cls = obj2.getClass();
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null || AnonymousClass1YF.A0T(canonicalName)) {
                obj = cls.getName();
            } else {
                obj = cls.getCanonicalName();
            }
        }
        A15.put("class", obj);
        if (z2 && (view = (View) obj2) != null) {
            num = Integer.valueOf(view.getId());
        }
        if (!(num == null || num.intValue() == -1)) {
            A15.put("view_id", C108955ca.A12(Locale.US, "0x%08x", C108945cZ.A1b(num, new Object[1], 0, 1)));
        }
        A15.put("ui_type", "VIEW");
        if (r9 instanceof C28624EAx) {
            AnonymousClass71P r3 = (AnonymousClass71P) ((C28624EAx) r9);
            Object obj3 = r3.A03;
            if (C18070vi.A18(obj3.getClass(), View.class)) {
                View view3 = (View) obj3;
                if (view3.getBackground() == null && (!AnonymousClass112.A01() || view3.getForeground() == null)) {
                    z = false;
                    View view4 = (View) obj3;
                    C18070vi.A0d(view4, 0);
                    int[] iArr = AnonymousClass71P.A0B;
                    view4.getLocationOnScreen(iArr);
                    Rect A09 = C109005cf.A09(view4);
                    A09.offsetTo(iArr[0], iArr[1]);
                    C135096re r32 = new C135096re(A09, z);
                    JSONObject A152 = C17880vN.A15();
                    A152.put("is_visible", r32.A01);
                    A152.put("bounds_on_screen", r32.A00.flattenToString());
                    A15.put("leaf_data", A152);
                }
            }
            z = C72453Mb.A1a(r3.A07);
            View view42 = (View) obj3;
            C18070vi.A0d(view42, 0);
            int[] iArr2 = AnonymousClass71P.A0B;
            view42.getLocationOnScreen(iArr2);
            Rect A092 = C109005cf.A09(view42);
            A092.offsetTo(iArr2[0], iArr2[1]);
            C135096re r322 = new C135096re(A092, z);
            JSONObject A1522 = C17880vN.A15();
            A1522.put("is_visible", r322.A01);
            A1522.put("bounds_on_screen", r322.A00.flattenToString());
            A15.put("leaf_data", A1522);
        }
        List<AnonymousClass71P> list = r9.A04;
        if (true ^ list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (AnonymousClass71P A002 : list) {
                JSONObject A003 = A00(A002);
                if (A003.has("class")) {
                    jSONArray.put(A003);
                }
            }
            A15.put("children", jSONArray);
        }
        return A15;
    }

    public final Object invoke() {
        List list;
        File[] listFiles;
        View findViewById;
        Context context;
        AnonymousClass1FL r13;
        List A04;
        C129466hq r11 = this.A00;
        AnonymousClass6Pp r9 = this.A01;
        C18090vk r3 = this.A02;
        C139036y6 r2 = (C139036y6) r11.A03.get();
        JSONObject A15 = C17880vN.A15();
        A15.put("app_id", C197569wu.A0D);
        JSONObject A152 = C17880vN.A15();
        A152.put("pipeline", "whatsapp_android");
        A152.put("client_current_tag", r11.A00.A0A);
        Object obj = r9.A03;
        View view = null;
        if (obj instanceof View) {
            view = (View) obj;
        }
        String str = "unknownModule";
        if (!(view == null || (findViewById = view.findViewById(16908290)) == null || (context = findViewById.getContext()) == null)) {
            Activity A002 = AnonymousClass1L9.A00(context);
            if ((A002 instanceof AnonymousClass01E) && (r13 = (AnonymousClass1FL) A002) != null) {
                AnonymousClass1GP supportFragmentManager = r13.getSupportFragmentManager();
                if (supportFragmentManager != null && (A04 = supportFragmentManager.A0U.A04()) != null) {
                    Iterator it = A04.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Fragment fragment = (Fragment) it.next();
                        if (fragment != null && fragment.A1e() && fragment.A0n) {
                            String A0U = C17890vO.A0U(fragment);
                            if (A0U != null) {
                                str = A0U;
                            }
                        }
                    }
                }
                str = C17890vO.A0U(r13);
                C18070vi.A0X(str);
            }
        }
        A152.put("client_current_module", str);
        A152.put("logging_version", 0);
        View view2 = (View) obj;
        C18070vi.A0d(view2, 0);
        int[] iArr = AnonymousClass71P.A0B;
        view2.getLocationOnScreen(iArr);
        Rect A09 = C109005cf.A09(view2);
        A09.offsetTo(iArr[0], iArr[1]);
        A152.put("root_view_bounds_on_screen", A09.flattenToString());
        A152.put("client_sample_rate", C72453Mb.A0I(((C130776jz) r11.A02.get()).A06));
        String jSONObject = A00(r9).toString(0);
        C18070vi.A0X(jSONObject);
        A152.put("tree", jSONObject);
        A15.put("data", A152);
        A15.put("app_ver", "2.24.24.78");
        A15.put("app_build_id", 670735092);
        A15.put("os_build_number", Build.ID);
        try {
            Context context2 = r2.A00;
            C17880vN.A0e(context2.getCacheDir(), "wds_metrics2").mkdir();
            File A0e = C17880vN.A0e(context2.getCacheDir(), "wds_metrics2");
            File A0e2 = C17880vN.A0e(context2.getCacheDir(), "wds_metrics2");
            if (!A0e2.exists() || !A0e2.isDirectory() || (listFiles = A0e2.listFiles(new AnonymousClass3BU(1))) == null) {
                list = C18460wS.A00;
            } else {
                list = C200410p.A0Q(listFiles);
            }
            int A0I = C72453Mb.A0I(((C130776jz) r2.A01.get()).A04);
            if (list.size() >= A0I) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                C108985cd.A1S(list, objArr, 0);
                C17880vN.A1T(objArr, A0I, 1);
                C108955ca.A1W("Max cached logs. allowed=%d, current=%d", locale, Arrays.copyOf(objArr, 2));
                r3.invoke();
                return C27621Wu.A00;
            }
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr2 = new Object[1];
            C108985cd.A1S(list, objArr2, 0);
            FileWriter fileWriter = new FileWriter(C17880vN.A0e(A0e, C108955ca.A12(locale2, "wds_metric_event_%d.json", Arrays.copyOf(objArr2, 1))));
            fileWriter.write(A15.toString());
            fileWriter.close();
            return C27621Wu.A00;
        } catch (Exception e) {
            C108955ca.A1W("Failed to cache hierarchy event", Locale.ENGLISH, C108945cZ.A1b(e, new Object[1], 0, 1));
        }
    }

    public /* synthetic */ AnonymousClass7SK(C129466hq r1, AnonymousClass6Pp r2, C18090vk r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
