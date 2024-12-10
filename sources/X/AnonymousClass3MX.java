package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3MX  reason: invalid class name */
public abstract class AnonymousClass3MX {
    public static MenuItem A07(Menu menu, int i, int i2) {
        return menu.add(0, i, 0, i2);
    }

    public static View A08(Context context, int i) {
        return View.inflate(context, i, (ViewGroup) null);
    }

    public static View A09(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static View A0A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, true);
    }

    public static AnonymousClass6IR A0t(int i) {
        return C1402670q.A02(new Object[0], i);
    }

    public static boolean A1T(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, true);
    }

    public static Object[] A1b(Object obj, int i) {
        Object[] objArr = new Object[2];
        objArr[i] = obj;
        return objArr;
    }

    public static int A03(boolean z) {
        int i = 1237;
        if (z) {
            i = 1231;
        }
        return i * 31;
    }

    public static AnonymousClass1F9 A0P(AnonymousClass4aY r0) {
        return r0.A2Q.getLifecycleOwner();
    }

    public static AnonymousClass1KB A0U(AnonymousClass4aY r0) {
        return r0.A2Q.getGlobalUI();
    }

    public static C33251iW A0X(AnonymousClass4aY r0) {
        return r0.A2Q.getUserActions();
    }

    public static C73103Oz A0c(AnonymousClass4aY r0) {
        return r0.A2B.getConversationCursorAdapter();
    }

    public static C18030ve A0h(AnonymousClass4aY r0) {
        return r0.A2Q.getAbProps();
    }

    public static AnonymousClass1BI A0l(String str) {
        return AnonymousClass1BI.A00.A02(str);
    }

    public static Jid A0n(String str) {
        return Jid.Companion.A02(str);
    }

    public static AnonymousClass10I A0w(AnonymousClass4aY r0) {
        return r0.A2Q.getWaWorkers();
    }

    public static AnonymousClass00H A0z(AnonymousClass10E r0) {
        return C000200d.A00(r0.A5n);
    }

    public static AnonymousClass00H A10(AnonymousClass10E r0) {
        return C000200d.A00(r0.A2n);
    }

    public static AnonymousClass00H A11(AnonymousClass10E r0) {
        return C000200d.A00(r0.A74);
    }

    public static AnonymousClass00H A12(AnonymousClass10E r0) {
        return C000200d.A00(r0.A3w);
    }

    public static Object A13(Object obj) {
        if (obj == C31751g4.COROUTINE_SUSPENDED) {
            return obj;
        }
        return C27621Wu.A00;
    }

    public static String A16(Fragment fragment, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return fragment.A1I(i2, objArr);
    }

    public static void A1O(Object obj) {
        List list = C42011xT.A0I;
        C18070vi.A0d(obj, 0);
    }

    public static void A1P(Object obj) {
        List list = C42011xT.A0I;
        C18070vi.A0d(obj, 1);
    }

    public static void A1Q(AnonymousClass1OS r2, AnonymousClass1OX r3) {
        C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, r2, r3);
    }

    public static boolean A1U(AnonymousClass1FU r0) {
        return AnonymousClass1J8.A05(r0.A0E);
    }

    public static boolean A1V(AnonymousClass1FY r0) {
        return r0.A02.A0N();
    }

    public static boolean A1W(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 5868);
    }

    public static boolean A1X(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 6187);
    }

    public static boolean A1Y(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 7608);
    }

    public static boolean A1Z(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 8530);
    }

    public static int A00(Resources resources, int i, int i2) {
        return i2 + resources.getDimensionPixelSize(i);
    }

    public static int A01(List list) {
        return list.size() - 1;
    }

    public static int A02(List list, int i) {
        return list.size() - i;
    }

    public static Context A04(View view, View view2, int i) {
        view.setVisibility(i);
        return view2.getContext();
    }

    public static Resources A05(View view) {
        Resources resources = view.getResources();
        C18070vi.A0X(resources);
        return resources;
    }

    public static Drawable A06(Context context, int i) {
        Drawable A00 = C24261Jm.A00(context, i);
        C17960vV.A07(A00);
        return A00;
    }

    public static View A0B(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C18070vi.A0X(inflate);
        return inflate;
    }

    public static View A0C(View view, int i) {
        View findViewById = view.findViewById(i);
        C18070vi.A0X(findViewById);
        return findViewById;
    }

    public static View A0D(C28931bI r0) {
        View A02 = r0.A02();
        C18070vi.A0X(A02);
        return A02;
    }

    public static View A0E(Iterator it) {
        return (View) it.next();
    }

    public static ViewGroup A0F(AnonymousClass01E r0, int i) {
        return (ViewGroup) r0.findViewById(i);
    }

    public static ViewStub A0G(Activity activity, int i) {
        return (ViewStub) C110885hR.A0A(activity, i);
    }

    public static ViewStub A0H(AnonymousClass01E r0, int i) {
        return (ViewStub) r0.findViewById(i);
    }

    public static ImageView A0I(AnonymousClass01E r0, int i) {
        return (ImageView) r0.findViewById(i);
    }

    public static ImageView A0J(C18100vl r0) {
        return (ImageView) r0.getValue();
    }

    public static LinearLayout A0K(View view, int i) {
        return (LinearLayout) AnonymousClass1HF.A06(view, i);
    }

    public static TextView A0L(AnonymousClass01E r0, int i) {
        return (TextView) r0.findViewById(i);
    }

    public static TextView A0M(C28931bI r0) {
        return (TextView) r0.A02();
    }

    public static C010105w A0N(DialogInterface.OnClickListener onClickListener, AlertDialog$Builder alertDialog$Builder, int i) {
        alertDialog$Builder.setNegativeButton(i, onClickListener);
        return alertDialog$Builder.create();
    }

    public static AnonymousClass1GP A0O(AnonymousClass1FL r0) {
        AnonymousClass1GP supportFragmentManager = r0.getSupportFragmentManager();
        C18070vi.A0X(supportFragmentManager);
        return supportFragmentManager;
    }

    public static RecyclerView A0Q(View view, int i) {
        return (RecyclerView) view.findViewById(i);
    }

    public static C006602x A0R(AnonymousClass009 r0) {
        return (C006602x) r0.generatedComponent();
    }

    public static C008903z A0S(AnonymousClass009 r0) {
        return (C008903z) r0.generatedComponent();
    }

    public static AnonymousClass033 A0T(AnonymousClass009 r0) {
        return (AnonymousClass033) r0.generatedComponent();
    }

    public static TextEmojiLabel A0V(View view, int i) {
        return (TextEmojiLabel) AnonymousClass1HF.A06(view, i);
    }

    public static TextEmojiLabel A0W(View view, int i) {
        return (TextEmojiLabel) view.findViewById(i);
    }

    public static BaseArEffectsViewModel A0Y(C18100vl r0) {
        return (BaseArEffectsViewModel) r0.getValue();
    }

    public static CallRatingViewModel A0Z(C18100vl r0) {
        return (CallRatingViewModel) r0.getValue();
    }

    public static AnonymousClass4VV A0a(AnonymousClass00H r0) {
        return (AnonymousClass4VV) r0.get();
    }

    public static C32111gf A0b(AnonymousClass00H r0) {
        return (C32111gf) r0.get();
    }

    public static C216616x A0d(AnonymousClass00H r0) {
        return (C216616x) r0.get();
    }

    public static C88134Yl A0e(AnonymousClass1DS r0) {
        return (C88134Yl) r0.A06();
    }

    public static C88324Zf A0f(AnonymousClass1G1 r0) {
        return (C88324Zf) r0.getValue();
    }

    public static AnonymousClass1UN A0g(AnonymousClass00H r0) {
        return (AnonymousClass1UN) r0.get();
    }

    public static C42211xo A0i(AnonymousClass00H r0) {
        return (C42211xo) r0.get();
    }

    public static C24001Il A0j(AnonymousClass00H r0) {
        return (C24001Il) r0.get();
    }

    public static C33971jg A0k(AnonymousClass00H r0) {
        return (C33971jg) r0.get();
    }

    public static AnonymousClass1BI A0m(C18100vl r0) {
        return (AnonymousClass1BI) r0.getValue();
    }

    public static C29681ch A0o(C18100vl r0) {
        return (C29681ch) r0.getValue();
    }

    public static AnonymousClass1EC A0p(C18100vl r0) {
        return (AnonymousClass1EC) r0.getValue();
    }

    public static ListsHomeViewModel A0q(C18100vl r0) {
        return (ListsHomeViewModel) r0.getValue();
    }

    public static AnonymousClass206 A0r(AnonymousClass1DS r0) {
        return (AnonymousClass206) r0.A06();
    }

    public static AnonymousClass206 A0s(Iterable iterable) {
        return (AnonymousClass206) C29431cG.A0X(iterable);
    }

    public static C30361do A0u(AnonymousClass00H r0) {
        return (C30361do) r0.get();
    }

    public static C28931bI A0v(C18100vl r0) {
        return (C28931bI) r0.getValue();
    }

    public static AnonymousClass10I A0x(AnonymousClass00H r0) {
        return (AnonymousClass10I) r0.get();
    }

    public static C88534a3 A0y(AnonymousClass00H r0) {
        return (C88534a3) r0.get();
    }

    public static Object A14(C18100vl r0) {
        Object value = r0.getValue();
        C18070vi.A0X(value);
        return value;
    }

    public static String A15(Context context, int i) {
        String string = context.getString(i);
        C18070vi.A0b(string);
        return string;
    }

    public static String A17(C24921Me r1, AnonymousClass1E7 r2) {
        return C24921Me.A03(r1, r2, 2131898919);
    }

    public static C23421Fz A18(C18100vl r0) {
        return (C23421Fz) r0.getValue();
    }

    public static void A19(Context context, Paint paint, int i) {
        paint.setColor(C19740yt.A00(context, i));
    }

    public static void A1A(Context context, View view, int i) {
        view.setBackgroundColor(C19740yt.A00(context, i));
    }

    public static void A1B(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(C24261Jm.A00(context, i));
    }

    public static void A1C(Context context, TextView textView, int i) {
        textView.setTextColor(C19740yt.A00(context, i));
    }

    public static void A1D(Resources resources, View view, int i) {
        view.setContentDescription(resources.getString(i));
    }

    public static void A1E(Resources resources, TextView textView, Object[] objArr, int i, int i2) {
        textView.setText(resources.getQuantityString(i, i2, objArr));
    }

    public static void A1F(View view, int i) {
        view.getLayoutParams().height = i;
    }

    public static void A1G(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A1H(AnonymousClass01E r0, int i, int i2) {
        r0.findViewById(i).setVisibility(i2);
    }

    public static void A1I(Fragment fragment, AnonymousClass1D6[] r2) {
        fragment.A1R(AnonymousClass9O6.A00(r2));
    }

    public static void A1J(AnonymousClass1DS r1, int i) {
        r1.A0F(Integer.valueOf(i));
    }

    public static void A1K(AnonymousClass1DS r1, int i) {
        r1.A0E(Integer.valueOf(i));
    }

    public static void A1L(AnonymousClass10G r0, WaDialogFragment waDialogFragment) {
        C63402t1.A02(waDialogFragment, AnonymousClass10G.A8i(r0));
    }

    public static void A1M(AnonymousClass10G r0, WaFragment waFragment) {
        C34701kw.A00(waFragment, AnonymousClass10G.A8i(r0));
    }

    public static void A1N(C24921Me r0, AnonymousClass1E7 r1, Object[] objArr, int i) {
        objArr[i] = r0.A0I(r1);
    }

    public static void A1R(Object[] objArr, int i) {
        objArr[i] = Integer.valueOf(i);
    }

    public static void A1S(Object[] objArr, int i, long j) {
        objArr[i] = Long.valueOf(j);
    }

    public static boolean A1a(Boolean bool) {
        C18070vi.A0b(bool);
        return bool.booleanValue();
    }
}
