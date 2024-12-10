package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.registration.email.RegisterEmail;
import com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Mc  reason: invalid class name and case insensitive filesystem */
public abstract class C72463Mc {
    public static Context A0E(C108015az r1) {
        C18070vi.A0d(r1, 0);
        return (Context) ((C94964lT) r1).A01;
    }

    public static Intent A0G(Object obj) {
        C18070vi.A0d(obj, 0);
        return new Intent();
    }

    public static Bundle A0J(Object obj) {
        C18070vi.A0d(obj, 0);
        return new Bundle();
    }

    public static View A0N(C28931bI r1) {
        r1.A04(0);
        return r1.A02();
    }

    public static AlphaAnimation A0Q() {
        return new AlphaAnimation(0.0f, 1.0f);
    }

    public static LinearLayout.LayoutParams A0R() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public static Integer A0k(Object obj, int i) {
        C18070vi.A0d(obj, 0);
        return Integer.valueOf(i);
    }

    public static Object A0l(C41251w3 r1, Object obj, int i) {
        C18070vi.A0d(obj, 0);
        Object A0U = r1.A0U(i);
        C18070vi.A0X(A0U);
        return A0U;
    }

    public static Object A0m(C18140vp r1) {
        C18070vi.A0d(r1, 0);
        return r1.get();
    }

    public static ArrayList A0s(Object obj) {
        C18070vi.A0d(obj, 0);
        return new ArrayList();
    }

    public static void A12(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1B(AnonymousClass1DS r1) {
        r1.A0E(true);
    }

    public static boolean A1Y(Object obj) {
        return C18070vi.A18(obj, true);
    }

    public static int A0B(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A0C(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static Resources A0I(AnonymousClass4aY r0) {
        return r0.A2Q.getActivityNullable().getResources();
    }

    public static C24071It A0U(AnonymousClass4aY r1) {
        return new C24071It(r1.A2Q.getViewModelStoreOwner());
    }

    public static A8Q A0Z(AnonymousClass4aY r0) {
        return ((C55742gI) r0.A51.get()).A02;
    }

    public static AnonymousClass74J A0d(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        AnonymousClass00H r0 = selectedMediaCaptionFragment.A05;
        if (r0 != null) {
            return (AnonymousClass74J) r0.get();
        }
        C18070vi.A11("expressionsTrayController");
        throw null;
    }

    public static AnonymousClass1BI A0g(AnonymousClass1E7 r1) {
        Jid A06 = r1.A06(AnonymousClass1BI.class);
        C17960vV.A07(A06);
        return (AnonymousClass1BI) A06;
    }

    public static String A0n(Jid jid) {
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public static String A0q(Object obj) {
        return ((CharSequence) obj).toString().trim();
    }

    public static ArrayList A0r(Intent intent, Class cls) {
        return C22971Dz.A0A(cls, intent.getStringArrayListExtra("jids"));
    }

    public static void A0z(Context context, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.A1Z(i);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public static void A10(BaseBundle baseBundle, Number number) {
        if (number != null) {
            baseBundle.putInt("arg_entry_point", number.intValue());
        }
    }

    public static void A1C(AnonymousClass4aY r1) {
        MentionableEntry mentionableEntry = r1.A3Z;
        if (mentionableEntry != null) {
            mentionableEntry.A0I(false);
        }
    }

    public static void A1D(AnonymousClass1E7 r1, Set set) {
        r1.A0y = set.contains(r1.A06(AnonymousClass1BI.class));
    }

    public static void A1H(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1I(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1J(Object obj, Object obj2, Object[] objArr) {
        objArr[3] = new AnonymousClass1D6(obj, obj2);
    }

    public static boolean A1P(ContactInfoActivity contactInfoActivity) {
        return contactInfoActivity.A19.A03(contactInfoActivity.A4l());
    }

    public static boolean A1Q(ContactInfoActivity contactInfoActivity) {
        return C42761yh.A01(contactInfoActivity.A14, contactInfoActivity.A4l());
    }

    public static boolean A1R(AnonymousClass4aY r1) {
        r1.A2Q.getImeUtils();
        return AnonymousClass1L4.A00(r1.A0D);
    }

    public static boolean A1S(AnonymousClass126 r0, AnonymousClass1EC r1, C24901Mc r2) {
        return r2.A09(r1, r0.A0O.A0O(r1));
    }

    public static float A00(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int A01(Context context) {
        return AnonymousClass1YL.A00(context, 2130971113, 2131102439);
    }

    public static int A02(Context context) {
        return AnonymousClass1YL.A00(context, 2130971981, 2131101293);
    }

    public static int A03(Context context) {
        return AnonymousClass1YL.A00(context, 2130972007, 2131103383);
    }

    public static int A04(View view) {
        return view.getResources().getDimensionPixelSize(2131168530);
    }

    public static int A05(View view) {
        return view.getResources().getDimensionPixelSize(2131168774);
    }

    public static int A06(View view) {
        return view.getResources().getDimensionPixelSize(2131168779);
    }

    public static int A07(View view) {
        return view.getResources().getDimensionPixelSize(2131168790);
    }

    public static int A08(View view) {
        return view.getResources().getDimensionPixelOffset(2131168774);
    }

    public static int A09(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static int A0A(AnonymousClass1DS r0) {
        return ((Number) r0.A06()).intValue();
    }

    public static int A0D(C18100vl r0) {
        return ((List) r0.getValue()).size();
    }

    public static Intent A0F(Context context, UserJid userJid, int i) {
        return AnonymousClass1LU.A1D(context, userJid, Integer.valueOf(i), true, true);
    }

    public static Resources A0H(Context context, Object obj) {
        C18070vi.A0X(obj);
        Resources resources = context.getResources();
        C18070vi.A0X(resources);
        return resources;
    }

    public static LayoutInflater A0K(View view, int i) {
        C18070vi.A0d(view, i);
        return LayoutInflater.from(view.getContext());
    }

    public static View A0L(View view) {
        ViewParent parent = view.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    public static View A0M(View view, int i) {
        return ((ViewStub) view.findViewById(i)).inflate();
    }

    public static View A0O(C18100vl r0) {
        return ((C28931bI) r0.getValue()).A02();
    }

    public static ViewGroup.MarginLayoutParams A0P(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static C003401n A0S(AnonymousClass01E r0, Toolbar toolbar) {
        r0.setSupportActionBar(toolbar);
        C003401n supportActionBar = r0.getSupportActionBar();
        C17960vV.A07(supportActionBar);
        return supportActionBar;
    }

    public static Toolbar A0T(AnonymousClass01E r1) {
        View findViewById = r1.findViewById(2131436270);
        C18070vi.A0X(findViewById);
        return (Toolbar) findViewById;
    }

    public static C24081Iu A0V(C18100vl r0) {
        return ((AnonymousClass1FD) r0.getValue()).Bba();
    }

    public static AnonymousClass10E A0W(AnonymousClass009 r0) {
        return ((C36241nZ) ((C008903z) r0.generatedComponent())).A2Q;
    }

    public static AnonymousClass10E A0X(AnonymousClass009 r0) {
        return ((C27691Xc) ((AnonymousClass033) r0.generatedComponent())).A10;
    }

    public static AnonymousClass1LC A0Y(AnonymousClass10G r0) {
        return (AnonymousClass1LC) r0.A5B.get();
    }

    public static C29691ci A0a(AnonymousClass1CJ r0, Object obj) {
        return (C29691ci) AnonymousClass1CJ.A01(r0).get(obj);
    }

    public static C190059kJ A0b(RegisterEmail registerEmail) {
        return (C190059kJ) registerEmail.A4e().get();
    }

    public static AnonymousClass1L2 A0c(AnonymousClass10G r0) {
        return (AnonymousClass1L2) r0.A40.get();
    }

    public static AnonymousClass19D A0e(AnonymousClass10E r0) {
        return (AnonymousClass19D) r0.A02.get();
    }

    public static AnonymousClass1BI A0f(BaseBundle baseBundle, String str) {
        return AnonymousClass1BI.A00.A02(baseBundle.getString(str));
    }

    public static AnonymousClass206 A0h(Cursor cursor, AnonymousClass1BI r2, AnonymousClass00H r3) {
        return ((AnonymousClass1W6) r3.get()).A02(cursor, r2);
    }

    public static C57352iw A0i(AnonymousClass10G r0) {
        return (C57352iw) r0.ACl.get();
    }

    public static C74393Zu A0j(ThemesThemePreviewActivity themesThemePreviewActivity) {
        return (C74393Zu) themesThemePreviewActivity.A4l().getAdapter();
    }

    public static String A0o(AnonymousClass00H r0) {
        return ((AnonymousClass17C) r0.get()).A00();
    }

    public static String A0p(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        C18070vi.A0X(simpleName);
        return simpleName;
    }

    public static void A0t(Activity activity) {
        C28281Zt.A06(activity, AnonymousClass4Z9.A00(activity, 2130970286));
    }

    public static void A0u(Activity activity, Point point) {
        activity.getWindowManager().getDefaultDisplay().getSize(point);
    }

    public static void A0v(Context context, Context context2, View view, int i, int i2) {
        view.setBackgroundColor(C19740yt.A00(context2, AnonymousClass1YL.A00(context, i, i2)));
    }

    public static void A0w(Context context, Context context2, TextView textView, int i, int i2) {
        textView.setTextColor(C19740yt.A00(context2, AnonymousClass1YL.A00(context, i, i2)));
    }

    public static void A0x(Context context, Resources resources, View view, int i, int i2) {
        view.setBackgroundColor(resources.getColor(AnonymousClass1YL.A00(context, i, i2)));
    }

    public static void A0y(Context context, TextView textView, int i, int i2) {
        textView.setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, i, i2)));
    }

    public static void A11(Bundle bundle, Fragment fragment, Jid jid, String str) {
        bundle.putString(str, jid.getRawString());
        fragment.A1R(bundle);
    }

    public static void A13(View view, int i) {
        AnonymousClass1HF.A06(view, i).setVisibility(8);
    }

    public static void A14(View view, int i, int i2) {
        view.setPadding(i, i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A15(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A16(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public static void A17(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new DecelerateInterpolator());
    }

    public static void A18(AnonymousClass01E r0, int i) {
        r0.findViewById(i).setVisibility(0);
    }

    public static void A19(AnonymousClass01E r0, int i) {
        r0.findViewById(i).setVisibility(8);
    }

    public static void A1A(Fragment fragment) {
        AnonymousClass1FL A1B = fragment.A1B();
        if (A1B != null) {
            A1B.finish();
        }
    }

    public static void A1E(C81673zc r2, C88474Zv r3, int i, int i2, boolean z) {
        C88474Zv.A00(r2, r3, i, i2, z);
        r3.A01.CC6(r2, C88474Zv.A05);
    }

    public static void A1F(C20050A4v a4v, int i, int i2) {
        a4v.A02(Integer.valueOf(i), 1, i2);
    }

    public static void A1G(C28931bI r1) {
        r1.A02().setVisibility(8);
    }

    public static void A1K(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((A2B) it.next()).A02);
    }

    public static void A1L(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass206) it.next()).A0v);
    }

    public static void A1M(C18100vl r0, int i) {
        View view = (View) r0.getValue();
        C18070vi.A0X(view);
        view.setVisibility(i);
    }

    public static void A1N(Object[] objArr, int i, int i2, Object obj) {
        objArr[i2] = new AnonymousClass1D6(obj, Integer.valueOf(i));
    }

    public static boolean A1O(AnonymousClass1DS r0) {
        return ((Boolean) r0.A06()).booleanValue();
    }

    public static boolean A1T(AnonymousClass1BI r1, AnonymousClass00H r2) {
        return ((C42211xo) r2.get()).A03(r1);
    }

    public static boolean A1U(UserJid userJid, AnonymousClass00H r2) {
        return ((C37551pj) r2.get()).A0P(userJid);
    }

    public static boolean A1V(AnonymousClass00H r0) {
        return ((AnonymousClass73F) r0.get()).A07();
    }

    public static boolean A1W(AnonymousClass00H r0) {
        return ((C30191dX) r0.get()).A00();
    }

    public static boolean A1X(AnonymousClass00H r0) {
        return ((C41461wR) r0.get()).A00();
    }

    public static boolean A1Z(C18140vp r0) {
        return ((Boolean) r0.get()).booleanValue();
    }

    public static boolean A1a(AnonymousClass1G1 r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static Object[] A1b(Iterable iterable, int i) {
        return C29431cG.A0t(iterable).toArray(new C23421Fz[i]);
    }
}
