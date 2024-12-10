package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Parcel;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.email.UpdateEmailActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Mb  reason: invalid class name and case insensitive filesystem */
public abstract class C72453Mb {
    public static int A01(int i) {
        return i != 0 ? 8 : 0;
    }

    public static int A02(int i) {
        return i == 0 ? 8 : 0;
    }

    public static int A03(int i) {
        return i != 0 ? 2 : 1;
    }

    public static int A04(int i) {
        return i != 0 ? 1 : 2;
    }

    public static int A05(int i) {
        return i != 0 ? 3 : 2;
    }

    public static int A06(int i) {
        return i != 0 ? 0 : 4;
    }

    public static int A0A(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return parcel.readInt();
    }

    public static int A0B(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        return menuItem.getItemId();
    }

    public static int A0F(Object obj) {
        return obj == null ? 8 : 0;
    }

    public static Resources A0N(Context context) {
        C18070vi.A0d(context, 0);
        return context.getResources();
    }

    public static TextView A0V(View view, int i) {
        TextView textView = (TextView) AnonymousClass1HF.A06(view, i);
        textView.setVisibility(0);
        return textView;
    }

    public static AnonymousClass1J2 A0a(C24051Ir r1, Class cls) {
        C18070vi.A0d(cls, 1);
        return r1.BG9(cls);
    }

    public static AnonymousClass6IR A0q(int i) {
        return C1402670q.A02(new Object[0], i);
    }

    public static String A0y(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return parcel.readString();
    }

    public static AnonymousClass1OX A12(AnonymousClass1J2 r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return C41561wd.A00(r1);
    }

    public static void A13(Activity activity) {
        activity.setResult(0, (Intent) null);
        activity.finish();
    }

    public static void A14(Activity activity) {
        activity.setResult(-1);
        activity.finish();
    }

    public static void A15(Activity activity, int i, int i2) {
        AnonymousClass74O.A0A(activity, i, i2, 150, false);
    }

    public static void A16(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A1E(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, -1, -2);
    }

    public static void A1L(TextEmojiLabel textEmojiLabel, CharSequence charSequence) {
        textEmojiLabel.A0S(charSequence, (List) null, 0, false);
    }

    public static void A1N(C139436yq r1) {
        C18070vi.A0d(r1, 0);
        r1.A01(false);
    }

    public static void A1T(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
    }

    public static boolean A1Z(Object obj) {
        C18070vi.A0d(obj, 1);
        return false;
    }

    public static int A07(int i) {
        return i != 0 ? 0 : 8;
    }

    public static int A0D(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static int A0J(boolean z) {
        return z ? 0 : 8;
    }

    public static SharedPreferences A0M(AnonymousClass1FU r0) {
        return (SharedPreferences) r0.A0A.A00.get();
    }

    public static ShapeDrawable A0P() {
        return new ShapeDrawable(new OvalShape());
    }

    public static LayoutInflater A0Q(LayoutInflater layoutInflater, Fragment fragment) {
        return layoutInflater.cloneInContext(new C008603v(layoutInflater, fragment));
    }

    public static AnonymousClass1FY A0e(AnonymousClass4aY r0) {
        AnonymousClass1FY CFa = r0.A2Q.CFa();
        C18070vi.A0X(CFa);
        return CFa;
    }

    public static Jid A0m(AnonymousClass1E7 r1) {
        Jid A06 = r1.A06(UserJid.class);
        C17960vV.A07(A06);
        return A06;
    }

    public static String A0z(C20125A8k a8k, String str) {
        String optString = a8k.A00.optString(str);
        C18070vi.A0X(optString);
        return optString;
    }

    public static void A1B(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A1C(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A1D(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A1H(TextView textView, InputFilter[] inputFilterArr, int i, int i2) {
        inputFilterArr[i2] = new C1418577f(i);
        textView.setFilters(inputFilterArr);
    }

    public static void A1M(C28931bI r1) {
        if (r1 != null) {
            r1.A04(8);
        }
    }

    public static boolean A1V(AnonymousClass1FU r2) {
        return C18020vd.A05(C18040vf.A02, r2.A0E, 9156);
    }

    public static boolean A1Y(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static float A00(C18100vl r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A08(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static int A09(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int A0C(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A0E(Number number, String str) {
        return str.hashCode() + number.intValue();
    }

    public static int A0G(Object obj, Object obj2, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 2);
        return 2;
    }

    public static int A0H(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static int A0I(C18100vl r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static long A0K(C18100vl r1) {
        return ((Number) r1.getValue()).longValue();
    }

    public static Activity A0L(View view) {
        return AnonymousClass1L9.A01(view.getContext(), AnonymousClass1FY.class);
    }

    public static Bitmap A0O(Point point, InputStream inputStream, boolean z) {
        return AnonymousClass204.A0B(AnonymousClass4aW.A04(point, z), inputStream).A02;
    }

    public static View A0R(View view) {
        return new View(view.getContext());
    }

    public static View A0S(View view, int i) {
        return ((ViewStub) AnonymousClass1HF.A06(view, i)).inflate();
    }

    public static View A0T(C18100vl r0) {
        Object value = r0.getValue();
        C18070vi.A0X(value);
        return (View) value;
    }

    public static ImageView A0U(View view) {
        return new ImageView(view.getContext());
    }

    public static TextView A0W(View view, int i) {
        View findViewById = view.findViewById(i);
        C18070vi.A0X(findViewById);
        return (TextView) findViewById;
    }

    public static TextView A0X(C18100vl r0) {
        Object value = r0.getValue();
        C18070vi.A0X(value);
        return (TextView) value;
    }

    public static C34001jj A0Y(Fragment fragment) {
        return new C34001jj(fragment.A1E());
    }

    public static AnonymousClass1FL A0Z(Fragment fragment) {
        AnonymousClass1FL A1D = fragment.A1D();
        C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return A1D;
    }

    public static AnonymousClass1LA A0b(AnonymousClass10E r0) {
        return (AnonymousClass1LA) r0.AeS.get();
    }

    public static TextEmojiLabel A0c(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        C18070vi.A0X(A06);
        return (TextEmojiLabel) A06;
    }

    public static C40751vD A0d(AnonymousClass10E r0) {
        return (C40751vD) r0.AB7.get();
    }

    public static WaImageView A0f(View view) {
        return new WaImageView(view.getContext());
    }

    public static WaTextView A0g(View view, int i) {
        View findViewById = view.findViewById(i);
        C18070vi.A0X(findViewById);
        return (WaTextView) findViewById;
    }

    public static C76783oH A0h(AnonymousClass01E r1) {
        return (C76783oH) r1.findViewById(2131429510);
    }

    public static AnonymousClass4VN A0i(AnonymousClass10E r0) {
        return (AnonymousClass4VN) r0.AIy.get();
    }

    public static C108875cR A0j(Fragment fragment) {
        AnonymousClass1FL A1B = fragment.A1B();
        C17960vV.A07(A1B);
        return (C108875cR) A1B;
    }

    public static C190059kJ A0k(UpdateEmailActivity updateEmailActivity) {
        return (C190059kJ) updateEmailActivity.A4b().get();
    }

    public static AnonymousClass1BI A0l(Iterator it) {
        return ((AnonymousClass1E7) it.next()).A0J;
    }

    public static AnonymousClass1EC A0n(AnonymousClass1EC r1, AnonymousClass00H r2) {
        return ((C34511kb) r2.get()).A05(r1);
    }

    public static AnonymousClass74D A0o(NewsletterInfoActivity newsletterInfoActivity) {
        return (AnonymousClass74D) newsletterInfoActivity.A4o().get();
    }

    public static C27071Up A0p(AnonymousClass10E r0) {
        return (C27071Up) r0.Ae9.get();
    }

    public static C28931bI A0r(Activity activity, int i) {
        return new C28931bI(C110885hR.A0A(activity, i));
    }

    public static C28931bI A0s(View view, int i) {
        return new C28931bI(view.findViewById(i));
    }

    public static C28931bI A0t(C108865cQ r0, int i) {
        return new C28931bI(r0.findViewById(i));
    }

    public static String A0u(Activity activity) {
        return activity.getIntent().getStringExtra("jid");
    }

    public static String A0v(Activity activity) {
        return activity.getIntent().getStringExtra("session_id");
    }

    public static String A0w(Activity activity) {
        return activity.getIntent().getStringExtra("search_result_key");
    }

    public static String A0x(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }

    public static String A10(AnonymousClass00H r0) {
        return ((C59932n7) r0.get()).A00();
    }

    public static ArrayList A11(Map map) {
        return new ArrayList(map.size());
    }

    public static void A17(Context context, View view, int i) {
        Drawable A00 = C24261Jm.A00(context, i);
        C17960vV.A07(A00);
        view.setBackground(A00);
    }

    public static void A18(Context context, C36361nl r3, String str) {
        r3.CGU(context, Uri.parse(str), (AnonymousClass206) null);
    }

    public static void A19(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public static void A1A(View view) {
        C17960vV.A05(view);
        view.setVisibility(8);
    }

    public static void A1F(View view, CharSequence charSequence, int i) {
        ((TextView) view.findViewById(i)).setText(charSequence);
    }

    public static void A1G(TextView textView, C18100vl r2) {
        textView.setText((String) r2.getValue());
    }

    public static void A1I(DialogFragment dialogFragment, AnonymousClass1FL r3) {
        dialogFragment.A2C(r3.getSupportFragmentManager(), (String) null);
    }

    public static void A1J(C38391rD r0, Collection collection, List list) {
        list.clear();
        list.addAll(collection);
        r0.notifyDataSetChanged();
    }

    public static void A1K(AnonymousClass10G r0, AnonymousClass1FU r1) {
        r1.A0G = C000200d.A00(r0.A5A);
    }

    public static void A1O(AnonymousClass00H r0) {
        ((C37721q1) r0.get()).A02();
    }

    public static void A1P(AnonymousClass00H r0) {
        ((C195199sx) r0.get()).A01();
    }

    public static void A1Q(AnonymousClass00H r0, Object obj) {
        ((AnonymousClass10T) r0.get()).registerObserver(obj);
    }

    public static void A1R(Object obj) {
        C18070vi.A0b(obj);
        C18070vi.A0d(obj, 0);
    }

    public static void A1S(Object obj) {
        C18070vi.A0b(obj);
        C18070vi.A0d(obj, 1);
    }

    public static void A1U(C18100vl r0, int i) {
        ((View) r0.getValue()).setVisibility(i);
    }

    public static boolean A1W(AnonymousClass00H r0) {
        return ((C38501rO) r0.get()).A07();
    }

    public static boolean A1X(AnonymousClass00H r0) {
        return ((AnonymousClass1c4) r0.get()).A08();
    }

    public static boolean A1a(C18100vl r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static boolean A1b(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
        return false;
    }
}
