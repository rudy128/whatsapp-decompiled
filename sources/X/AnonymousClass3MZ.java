package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.calling.dialer.DialerActivity;
import com.whatsapp.calling.dialer.DialerViewModel;
import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.3MZ  reason: invalid class name */
public abstract class AnonymousClass3MZ {
    public static int A00(Context context) {
        return C19740yt.A00(context, AnonymousClass4Z9.A01(context, false));
    }

    public static Paint A0A() {
        return new Paint(1);
    }

    public static C27183DXs A0L(AnonymousClass1OS r2, C23421Fz r3) {
        return new C27183DXs(r2, r3, 7);
    }

    public static void A1F(View view, ViewGroup.LayoutParams layoutParams) {
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
    }

    public static void A1G(View view, ViewGroup.LayoutParams layoutParams, float f, float f2) {
        layoutParams.height = (int) (f * f2);
        view.setLayoutParams(layoutParams);
    }

    public static int A04(AnonymousClass1D6 r0) {
        return ((Number) r0.first).intValue();
    }

    public static AttributeSet A0C(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static AnonymousClass1L9 A0N(AnonymousClass10E r0) {
        return (AnonymousClass1L9) r0.A0E.get();
    }

    public static AnonymousClass1FU A0P(Context context) {
        return (AnonymousClass1FU) AnonymousClass1L9.A01(context, AnonymousClass1FU.class);
    }

    public static C34531kd A0R(AnonymousClass10E r0) {
        return (C34531kd) r0.A9m.get();
    }

    public static AnonymousClass18O A0S(AnonymousClass10E r0) {
        return (AnonymousClass18O) r0.A9p.get();
    }

    public static C72043Kk A0T(AnonymousClass10G r0) {
        return (C72043Kk) r0.A1j.get();
    }

    public static C33251iW A0U(AnonymousClass10E r0) {
        return (C33251iW) r0.ABA.get();
    }

    public static C108355bZ A0V(AnonymousClass1K1 r0) {
        return (C108355bZ) r0.A5a.get();
    }

    public static AnonymousClass1VP A0W(AnonymousClass10E r0) {
        return (AnonymousClass1VP) r0.A1l.get();
    }

    public static DialerViewModel A0X(DialerActivity dialerActivity) {
        return (DialerViewModel) dialerActivity.A0H.getValue();
    }

    public static FavoritePickerViewModel A0Y(FavoritePicker favoritePicker) {
        return (FavoritePickerViewModel) favoritePicker.A04.getValue();
    }

    public static AnonymousClass1HS A0Z(AnonymousClass10E r0) {
        return (AnonymousClass1HS) r0.A98.get();
    }

    public static AnonymousClass4R4 A0a(AnonymousClass4aY r0) {
        return (AnonymousClass4R4) r0.A69.get();
    }

    public static C34511kb A0b(AnonymousClass10E r0) {
        return (C34511kb) r0.A2L.get();
    }

    public static C40371ub A0c(C77063pI r0) {
        return (C40371ub) r0.A0F.get();
    }

    public static AnonymousClass11E A0d(AnonymousClass10E r0) {
        return (AnonymousClass11E) r0.A2X.get();
    }

    public static AnonymousClass1VW A0e(AnonymousClass10E r0) {
        return (AnonymousClass1VW) r0.A2d.get();
    }

    public static AnonymousClass1PM A0f(AnonymousClass10E r0) {
        return (AnonymousClass1PM) r0.ABM.get();
    }

    public static C24921Me A0g(AnonymousClass10E r0) {
        return (C24921Me) r0.ABX.get();
    }

    public static C25491Ok A0h(AnonymousClass10E r0) {
        return (C25491Ok) r0.A1F.get();
    }

    public static C27201Vd A0i(AnonymousClass10E r0) {
        return (C27201Vd) r0.A2j.get();
    }

    public static C27191Vc A0j(AnonymousClass10E r0) {
        return (C27191Vc) r0.A2i.get();
    }

    public static C56252hA A0k(AnonymousClass4aY r0) {
        return (C56252hA) r0.A4u.get();
    }

    public static AnonymousClass118 A0l(AnonymousClass10E r0) {
        return (AnonymousClass118) r0.ABY.get();
    }

    public static C25181Nf A0m(AnonymousClass10E r0) {
        return (C25181Nf) r0.A2o.get();
    }

    public static AnonymousClass122 A0n(AnonymousClass10E r0) {
        return (AnonymousClass122) r0.A2y.get();
    }

    public static C24681Lg A0o(AnonymousClass10E r0) {
        return (C24681Lg) r0.A6Y.get();
    }

    public static AnonymousClass1MW A0p(AnonymousClass10E r0) {
        return (AnonymousClass1MW) r0.A7u.get();
    }

    public static C24751Ln A0q(AnonymousClass10E r0) {
        return (C24751Ln) r0.ABe.get();
    }

    public static AnonymousClass1RK A0r(AnonymousClass10E r0) {
        return (AnonymousClass1RK) r0.A2R.get();
    }

    public static AnonymousClass1VU A0s(AnonymousClass10E r0) {
        return (AnonymousClass1VU) r0.A7y.get();
    }

    public static C1193267r A0t(AnonymousClass10E r0) {
        return (C1193267r) r0.A9P.get();
    }

    public static AnonymousClass12L A0u(AnonymousClass10E r0) {
        return (AnonymousClass12L) r0.A90.get();
    }

    public static InAppBugReportingViewModel A0v(InAppBugReportingActivity inAppBugReportingActivity) {
        return (InAppBugReportingViewModel) inAppBugReportingActivity.A0R.getValue();
    }

    public static UserJid A0w(AnonymousClass1E7 r0) {
        return C22941Dw.A01(r0.A0J);
    }

    public static UserJid A0x(AnonymousClass1E7 r1) {
        return (UserJid) r1.A06(UserJid.class);
    }

    public static C25011Mn A0y(AnonymousClass10E r0) {
        return (C25011Mn) r0.A9o.get();
    }

    public static AnonymousClass1QS A0z(AnonymousClass10E r0) {
        return (AnonymousClass1QS) r0.A8J.get();
    }

    public static AnonymousClass1Nb A11(AnonymousClass10E r0) {
        return (AnonymousClass1Nb) r0.A2E.get();
    }

    public static AnonymousClass1PU A12(AnonymousClass10E r0) {
        return (AnonymousClass1PU) r0.A4j.get();
    }

    public static AnonymousClass1DC A13(AnonymousClass10E r0) {
        return (AnonymousClass1DC) r0.A95.get();
    }

    public static Boolean A15(C18020vd r1, int i) {
        return Boolean.valueOf(C18020vd.A05(C18040vf.A02, r1, i));
    }

    public static C18600wl A1B(AnonymousClass10E r0) {
        return (C18600wl) r0.A9E.get();
    }

    public static C18600wl A1C(AnonymousClass10E r0) {
        return (C18600wl) r0.A9F.get();
    }

    public static void A1E(View view, int i, int i2) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i, i2));
    }

    public static void A1H(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass782(obj, i));
    }

    public static void A1I(View view, Object obj, int i) {
        view.setOnClickListener(new AFB(obj, i));
    }

    public static void A1J(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass78J(obj, i));
    }

    public static void A1K(View view, Object obj, int i) {
        AnonymousClass1HF.A0f(view, new AnonymousClass3SS(obj, i));
    }

    public static void A1L(View view, Object obj, int i) {
        view.setOnClickListener(new AFS(obj, i));
    }

    public static void A1M(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass785(obj, i));
    }

    public static void A1N(View view, Object obj, int i) {
        view.setOnClickListener(new AFE(obj, i));
    }

    public static void A1O(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass787(obj, obj2, i));
    }

    public static void A1P(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass786(obj, obj2, i));
    }

    public static void A1Q(TextView textView, AnonymousClass11C r2) {
        AnonymousClass1HF.A0f(textView, new C39411t2(textView, r2));
    }

    public static void A1R(AnonymousClass1DS r1, C22801Dg r2, Object obj, int i) {
        r2.A0H(r1, new C65042vk(obj, i));
    }

    public static void A1S(AnonymousClass4aY r1) {
        r1.A0D.setVisibility(8);
    }

    public static void A1T(C47192Hl r1, Integer num) {
        r1.A05 = num;
        r1.A0E = C50542Uv.A00();
    }

    public static void A1U(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C146777Qo(obj, i));
    }

    public static void A1V(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static boolean A1W(AnonymousClass4aY r0) {
        return C22971Dz.A0V(r0.A35.A0J);
    }

    public static boolean A1Y(AnonymousClass1E7 r0, Object obj) {
        return C18070vi.A18(obj, r0.A0J);
    }

    public static boolean A1Z(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0J.A0K(groupChatInfoActivity.A1K);
    }

    public static boolean A1a(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0J.A0J(groupChatInfoActivity.A1K);
    }

    public static int A01(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A02(Context context, Context context2, int i, int i2) {
        return C19740yt.A00(context2, AnonymousClass1YL.A00(context, i, i2));
    }

    public static int A03(DisplayMetrics displayMetrics, float f, int i) {
        return C22339B3q.A01(TypedValue.applyDimension(i, f, displayMetrics));
    }

    public static long A05(AnonymousClass11P r3, AnonymousClass206 r4) {
        return AnonymousClass11P.A01(r3) - r4.A0I;
    }

    public static Intent A06(AnonymousClass00H r0) {
        r0.get();
        return new Intent();
    }

    public static Intent A07(Object obj, int i) {
        C18070vi.A0d(obj, i);
        return new Intent();
    }

    public static SharedPreferences.Editor A08(AnonymousClass1VE r0) {
        return AnonymousClass1VE.A00(r0).edit();
    }

    public static Resources A09(Fragment fragment) {
        return fragment.A14().getResources();
    }

    public static Drawable A0B(View view, int i) {
        return C24261Jm.A00(view.getContext(), i);
    }

    public static LayoutInflater A0D(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static LayoutInflater A0E(Fragment fragment) {
        return fragment.A1D().getLayoutInflater();
    }

    public static View A0F(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static C37581pm A0G(Fragment fragment) {
        return AnonymousClass2SS.A00(fragment.A1G());
    }

    public static C37581pm A0H(AnonymousClass1F9 r0) {
        return C37561pk.A00(r0.getLifecycle());
    }

    public static C24051Ir A0I(Fragment fragment) {
        return fragment.A1D().BQR();
    }

    public static C24081Iu A0J(Fragment fragment) {
        return fragment.A1D().Bba();
    }

    public static C24091Iv A0K(Fragment fragment) {
        return fragment.A1D().BQQ();
    }

    public static C23631Ha A0M(C18140vp r0) {
        return C19880zA.A01(r0.get());
    }

    public static AnonymousClass10E A0O(AnonymousClass1K1 r1, AnonymousClass1FO r2) {
        r2.A01 = AnonymousClass1K1.A1X(r1);
        return r1.AAQ;
    }

    public static AnonymousClass1E8 A0Q(AnonymousClass11S r0) {
        r0.A0I();
        AnonymousClass1E8 r02 = r0.A0D;
        C17960vV.A07(r02);
        return r02;
    }

    public static AnonymousClass205 A10(Iterator it) {
        return ((AnonymousClass206) it.next()).A0v;
    }

    public static AnonymousClass00H A14(AnonymousClass10E r0) {
        return C000200d.A00(r0.A62);
    }

    public static String A16() {
        return Locale.getDefault().getLanguage();
    }

    public static String A17(EditText editText) {
        return String.valueOf(editText.getText());
    }

    public static String A18(TextView textView) {
        return textView.getText().toString();
    }

    public static StringBuilder A19(Object obj, int i) {
        C18070vi.A0d(obj, i);
        return new StringBuilder();
    }

    public static ArrayList A1A(Bundle bundle, Class cls, String str) {
        return C22971Dz.A0A(cls, bundle.getStringArrayList(str));
    }

    public static void A1D(int i, Paint paint) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public static boolean A1X(AnonymousClass1E7 r0) {
        return TextUtils.isEmpty(r0.A0K());
    }

    public static boolean A1b(AnonymousClass21V r0) {
        return TextUtils.isEmpty(r0.A18());
    }
}
