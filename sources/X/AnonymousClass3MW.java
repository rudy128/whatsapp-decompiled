package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.3MW  reason: invalid class name */
public abstract class AnonymousClass3MW {
    public static Object[] A1a() {
        return new Object[1];
    }

    public static Object[] A1b() {
        return new Object[2];
    }

    public static int A03(AnonymousClass1MZ r0, AnonymousClass1E9 r1) {
        return r0.A08.A0A(r1);
    }

    public static Resources A04(AnonymousClass4aY r0) {
        return r0.A2Q.getResources();
    }

    public static Resources A05(AnonymousClass118 r0) {
        return r0.A00.getResources();
    }

    public static Paint A06() {
        return new Paint();
    }

    public static Rect A07() {
        return new Rect();
    }

    public static RectF A08() {
        return new RectF();
    }

    public static SpannableStringBuilder A09(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static AnonymousClass1GP A0K(AnonymousClass4aY r0) {
        return r0.A2Q.getSupportFragmentManager();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1DT, X.1DS] */
    public static AnonymousClass1DT A0L() {
        return new AnonymousClass1DS();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1DT, X.1DS] */
    public static AnonymousClass1DT A0M(Object obj) {
        return new AnonymousClass1DS(obj);
    }

    public static C24071It A0N(AnonymousClass1FD r1) {
        return new C24071It(r1);
    }

    public static AnonymousClass10E A0O(Object obj) {
        return ((C27691Xc) ((AnonymousClass033) obj)).A10;
    }

    public static AnonymousClass1FY A0P(AnonymousClass4aY r0) {
        return r0.A2Q.CFa();
    }

    public static AnonymousClass1FY A0Q(AnonymousClass4aY r0) {
        return r0.A2Q.getActivityNullable();
    }

    public static GroupJid A0f(Jid jid) {
        C36321nh r0 = GroupJid.Companion;
        return C36321nh.A00(jid);
    }

    public static Jid A0g(AnonymousClass1E7 r1) {
        return r1.A06(AnonymousClass1BI.class);
    }

    public static AnonymousClass1EC A0i(Jid jid) {
        C42941yz r0 = AnonymousClass1EC.A01;
        return C42941yz.A00(jid);
    }

    public static UserJid A0j(AnonymousClass4aY r1) {
        AnonymousClass1BI r12 = r1.A3R;
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r12);
    }

    public static C41111vp A0n(Object obj) {
        return new C41111vp(obj);
    }

    public static C41731wy A0o() {
        return new C41731wy();
    }

    public static C28931bI A0p(View view) {
        return new C28931bI(view);
    }

    public static AnonymousClass00H A0s(AnonymousClass10E r0) {
        return C000200d.A00(r0.ABd);
    }

    public static C008603v A0t(Context context, Fragment fragment) {
        return new C008603v(context, fragment);
    }

    public static AnonymousClass031 A0u(View view) {
        return new AnonymousClass031(view);
    }

    public static Integer A0v(int i) {
        return new Integer(i);
    }

    public static Integer A0w(C18560wh r1, AnonymousClass1OS r2, AnonymousClass1OX r3) {
        Integer num = AnonymousClass00R.A00;
        C30451dy.A02(num, r1, r2, r3);
        return num;
    }

    public static String A0x(Resources resources, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return resources.getString(i2, objArr);
    }

    public static WeakReference A0z(Object obj) {
        return new WeakReference(obj);
    }

    public static C147317Sr A13() {
        return new C147317Sr();
    }

    public static AnonymousClass3EW A14() {
        return new AnonymousClass3EW();
    }

    public static AnonymousClass20F A15(Class cls) {
        return new AnonymousClass20F(cls);
    }

    public static C100985Am A16(Object obj, int i) {
        return new C100985Am(obj, i);
    }

    public static AnonymousClass1G7 A18(Object obj) {
        return new AnonymousClass1G7(obj);
    }

    public static void A19() {
        C18070vi.A11("style");
        throw null;
    }

    public static void A1A() {
        C18070vi.A11("abProps");
        throw null;
    }

    public static void A1B() {
        C18070vi.A11("adapter");
        throw null;
    }

    public static void A1C() {
        C18070vi.A11("globalUI");
        throw null;
    }

    public static void A1D() {
        C18070vi.A11("meManager");
        throw null;
    }

    public static void A1E() {
        C18070vi.A11("linkifier");
        throw null;
    }

    public static void A1F() {
        C18070vi.A11("waIntents");
        throw null;
    }

    public static void A1G() {
        C18070vi.A11("waWorkers");
        throw null;
    }

    public static void A1H() {
        C18070vi.A11("viewModel");
        throw null;
    }

    public static void A1I() {
        C18070vi.A11("chatsCache");
        throw null;
    }

    public static void A1J() {
        C18070vi.A11("wamRuntime");
        throw null;
    }

    public static void A1K() {
        C18070vi.A11("ioDispatcher");
        throw null;
    }

    public static void A1L() {
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public static void A1M() {
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public static void A1N() {
        C18070vi.A11("systemServices");
        throw null;
    }

    public static void A1P(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A1Q(View view) {
        AnonymousClass1Y5.A07(view, "Button");
    }

    public static void A1R(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public static void A1S(TextView textView) {
        textView.setText("");
    }

    public static void A1T(A34 a34, AnonymousClass10I r2, int i) {
        r2.CGD(a34, new Void[i]);
    }

    public static void A1U(Object obj) {
        ((Activity) obj).finish();
    }

    public static void A1V(Object obj) {
        ((DialogFragment) obj).A28();
    }

    public static void A1W(Object obj) {
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
    }

    public static void A1X(C18560wh r1, AnonymousClass1OS r2, AnonymousClass1OX r3) {
        C30451dy.A02(AnonymousClass00R.A00, r1, r2, r3);
    }

    public static boolean A1Y(AnonymousClass1FU r0) {
        return r0.A07.A09();
    }

    public static float A00(Resources resources, int i) {
        return (float) resources.getDimensionPixelSize(i);
    }

    public static int A01(Resources resources, int i) {
        return (int) resources.getDimension(i);
    }

    public static int A02(View view, int i) {
        return i + view.getHeight();
    }

    public static View A0A(C18100vl r0) {
        return (View) r0.getValue();
    }

    public static ViewGroup.MarginLayoutParams A0B(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static ViewGroup A0C(View view, int i) {
        return (ViewGroup) AnonymousClass1HF.A06(view, i);
    }

    public static ViewGroup A0D(View view, int i) {
        return (ViewGroup) view.findViewById(i);
    }

    public static ViewStub A0E(View view, int i) {
        return (ViewStub) AnonymousClass1HF.A06(view, i);
    }

    public static ViewStub A0F(View view, int i) {
        return (ViewStub) view.findViewById(i);
    }

    public static ImageView A0G(View view, int i) {
        return (ImageView) AnonymousClass1HF.A06(view, i);
    }

    public static ImageView A0H(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static TextView A0I(Activity activity, int i) {
        return (TextView) C110885hR.A0A(activity, i);
    }

    public static TextView A0J(View view, int i) {
        return (TextView) AnonymousClass1HF.A06(view, i);
    }

    public static WaImageView A0R(View view, int i) {
        return (WaImageView) AnonymousClass1HF.A06(view, i);
    }

    public static WaImageView A0S(View view, int i) {
        return (WaImageView) view.findViewById(i);
    }

    public static WaTextView A0T(View view, int i) {
        return (WaTextView) AnonymousClass1HF.A06(view, i);
    }

    public static WaTextView A0U(View view, int i) {
        return (WaTextView) view.findViewById(i);
    }

    public static C37551pj A0V(AnonymousClass00H r0) {
        return (C37551pj) r0.get();
    }

    public static C25811Ps A0W(AnonymousClass00H r0) {
        return (C25811Ps) r0.get();
    }

    public static AnonymousClass1UD A0X(AnonymousClass00H r0) {
        return (AnonymousClass1UD) r0.get();
    }

    public static C31191fA A0Y(AnonymousClass00H r0) {
        return (C31191fA) r0.get();
    }

    public static C34511kb A0Z(AnonymousClass00H r0) {
        return (C34511kb) r0.get();
    }

    public static C36531o3 A0a(AnonymousClass00H r0) {
        return (C36531o3) r0.get();
    }

    public static C88654aI A0b(AnonymousClass00H r0) {
        return (C88654aI) r0.get();
    }

    public static C219117w A0c(AnonymousClass00H r0) {
        return (C219117w) r0.get();
    }

    public static C88194Yr A0d(AnonymousClass00H r0) {
        return (C88194Yr) r0.get();
    }

    public static C27141Uw A0e(AnonymousClass00H r0) {
        return (C27141Uw) r0.get();
    }

    public static Jid A0h(C18100vl r0) {
        return (Jid) r0.getValue();
    }

    public static AnonymousClass206 A0k(List list, int i) {
        return (AnonymousClass206) list.get(i);
    }

    public static C88214Yt A0l(AnonymousClass00H r0) {
        return (C88214Yt) r0.get();
    }

    public static C37721q1 A0m(AnonymousClass00H r0) {
        return (C37721q1) r0.get();
    }

    public static WDSButton A0q(View view, int i) {
        return (WDSButton) AnonymousClass1HF.A06(view, i);
    }

    public static WDSButton A0r(View view, int i) {
        return (WDSButton) view.findViewById(i);
    }

    public static String A0y(C18100vl r0) {
        return (String) r0.getValue();
    }

    public static List A10(AnonymousClass1DS r0) {
        return (List) r0.A06();
    }

    public static List A11(C18100vl r0) {
        return (List) r0.getValue();
    }

    public static Map A12(C18100vl r0) {
        return (Map) r0.getValue();
    }

    public static AnonymousClass1G4 A17(C18100vl r0) {
        return (AnonymousClass1G4) r0.getValue();
    }

    public static void A1O(Context context, int[] iArr, int i, int i2) {
        iArr[i2] = C19740yt.A00(context, i);
    }

    public static boolean A1Z(C18000vb r0) {
        return C18000vb.A00(r0).A06;
    }
}
