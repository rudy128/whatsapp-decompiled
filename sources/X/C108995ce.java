package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.companionmode.registration.RegisterAsCompanionActivity;
import com.whatsapp.consent.common.AgeCollectionFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5ce  reason: invalid class name and case insensitive filesystem */
public abstract class C108995ce {
    public static int A01(int i, int i2) {
        return (int) Math.ceil(((double) (i - i2)) / 2.0d);
    }

    public static int A02(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.bottomMargin;
    }

    public static ValueAnimator A0B(int i, int i2) {
        return ValueAnimator.ofInt(new int[]{i, i2});
    }

    public static Rect A0I(Bitmap bitmap) {
        return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static View A0K(int i, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C18070vi.A0X(inflate);
        return inflate;
    }

    public static C37471pb A0M(AnonymousClass10I r2) {
        return new C37471pb(new C200710s(r2, true));
    }

    public static C179229Hb A0N(AnonymousClass181 r4, URLConnection uRLConnection, int i) {
        return new C179229Hb(r4, uRLConnection.getInputStream(), (Integer) null, Integer.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.77I] */
    public static AnonymousClass77I A0P() {
        ? obj = new Object();
        obj.A01 = 0;
        obj.A00 = 0;
        obj.A02 = 0;
        obj.A03 = null;
        obj.A04 = false;
        obj.A05 = false;
        return obj;
    }

    public static C111255jJ A0S(AnonymousClass1FD r2, C34771l3 r3) {
        return (C111255jJ) new C24071It(new C65062vm(r3, true), r2).A00(C111255jJ.class);
    }

    public static Object A0V(Class cls, Object obj, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static String A0W(Intent intent, String str) {
        if (intent.hasExtra(str)) {
            return intent.getStringExtra(str);
        }
        return null;
    }

    public static String A0X(CharSequence charSequence, Iterable iterable) {
        return C29431cG.A0g(charSequence, "", "", iterable, (C22821Di) null);
    }

    public static List A0c(CharSequence charSequence) {
        return AnonymousClass1YF.A0S(charSequence, new String[]{","}, 0);
    }

    public static AnonymousClass1OY A0f(C18570wi r2) {
        return AnonymousClass1OW.A02(AnonymousClass1OQ.A03(r2, new AnonymousClass1OE((AnonymousClass1OB) null)));
    }

    public static AnonymousClass1OY A0g(C18560wh r2) {
        return AnonymousClass1OW.A02(new AnonymousClass1OE((AnonymousClass1OB) null).plus(r2));
    }

    public static C136406tl A0i(Object obj, AnonymousClass73C r3) {
        return (C136406tl) ((List) r3.A08.get(obj)).get(0);
    }

    public static void A0q(Path path, View view, int i) {
        path.lineTo((float) i, (float) ((view.getHeight() * 9) / 10));
    }

    public static void A0r(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(number.intValue());
    }

    public static void A0v(View view, int i, int i2) {
        view.measure(i, i2);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void A10(ImageView imageView, Object obj, Drawable[] drawableArr) {
        drawableArr[1] = obj;
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(150);
        imageView.setImageDrawable(transitionDrawable);
    }

    public static boolean A1Y(C18020vd r2) {
        C18070vi.A0d(r2, 0);
        return C18020vd.A05(C18040vf.A02, r2, 11628);
    }

    public static int A04(C18030ve r1) {
        if (C25291Nq.A04(r1, 9860)) {
            return 5;
        }
        return 4;
    }

    public static long A06(int i) {
        if (i != 0) {
            return 500;
        }
        return 5000;
    }

    public static long A07(C18020vd r2, int i) {
        return ((long) C18020vd.A00(C18040vf.A02, r2, i)) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static long A08(C18020vd r2, int i) {
        return ((long) C18020vd.A00(C18040vf.A02, r2, i)) * 1048576;
    }

    public static long A09(VideoComposerFragment videoComposerFragment) {
        C1405471x r0 = videoComposerFragment.A0T;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public static long A0A(C32741hg r1) {
        C56092gt r0 = r1.A00;
        if (r0 != null) {
            return r0.A06;
        }
        return 0;
    }

    public static Intent A0C(Context context) {
        Intent className = new Intent("android.intent.action.VIEW").setClassName(context.getPackageName(), "com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity");
        C18070vi.A0X(className);
        return className;
    }

    public static String A0Y(Object obj, String str, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        String format = String.format(str, Arrays.copyOf(objArr, i2));
        C18070vi.A0X(format);
        return format;
    }

    public static String A0Z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return sb.toString();
    }

    public static JSONObject A0h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        return jSONObject;
    }

    public static void A0l(Intent intent, ContactPickerFragment contactPickerFragment) {
        intent.putExtra("extra_deep_link_session_id", contactPickerFragment.A2v);
        intent.putExtra("ctwa_deeplink_content", contactPickerFragment.A1D.A00());
        ContactPickerFragment.A0E(intent, contactPickerFragment);
    }

    public static void A0n(Intent intent, Serializable serializable, Serializable serializable2) {
        intent.putExtra("send", serializable);
        intent.putExtra("skip_preview", serializable);
        intent.putExtra("message_types", serializable2);
    }

    public static void A0t(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A0w(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public static void A0x(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void A13(AnonymousClass1J2 r2, AnonymousClass1OS r3, C23421Fz r4) {
        C88604aC.A03(C41561wd.A00(r2), new C27183DXs(r3, r4, 10));
    }

    public static void A17(AnonymousClass1L9 r1, int i) {
        if (i == 0) {
            r1.A01.A08(2131886448, 0);
        }
    }

    public static void A19(AnonymousClass10G r0, AgeCollectionFragment ageCollectionFragment, C18030ve r2) {
        ageCollectionFragment.A0C = r2;
        ageCollectionFragment.A0A = (C125756bd) r0.A87.get();
    }

    public static void A1A(AnonymousClass1FU r1, int i) {
        if (i != 0) {
            r1.setResult(-1);
        } else {
            r1.A05.A08(2131888361, 1);
        }
    }

    public static void A1D(MediaComposerFragment mediaComposerFragment, C1409573s r2, String str) {
        AnonymousClass7JF r1 = mediaComposerFragment.A0J;
        if (r1 != null) {
            r1.A0P.setDoodle(r2);
            r1.A0V.A08(str);
        }
    }

    public static void A1E(C29591cX r3) {
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
    }

    public static void A1L(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(' ');
        sb.append(i);
        sb.append(" #");
        Log.i(sb.toString());
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str.replace('/', '-'));
    }

    public static boolean A1V(AiImagineBottomSheet aiImagineBottomSheet) {
        AnonymousClass00H r0 = aiImagineBottomSheet.A0f;
        if (r0 != null) {
            return C18020vd.A05(C18040vf.A01, ((AnonymousClass1UD) r0.get()).A00, 10851);
        }
        C18070vi.A11("botGatingLazy");
        throw null;
    }

    public static boolean A1W(RegisterAsCompanionActivity registerAsCompanionActivity) {
        AnonymousClass00H r0 = registerAsCompanionActivity.A0B;
        if (r0 != null) {
            return ((C58492km) r0.get()).A01();
        }
        C18070vi.A11("companionDeviceClassification");
        throw null;
    }

    public static boolean A1Z(MessageReplyActivity messageReplyActivity) {
        AnonymousClass1BI r1 = messageReplyActivity.A0h;
        C22941Dw r0 = UserJid.Companion;
        return ((C37551pj) messageReplyActivity.A1F.get()).A0P(C22941Dw.A01(r1));
    }

    public static boolean A1a(VoipActivityV2 voipActivityV2) {
        return ((Boolean) voipActivityV2.A23.get()).booleanValue();
    }

    public static float A00(View view, float f) {
        return (float) ((int) (f * ((float) (view.getResources().getDisplayMetrics().densityDpi / 160))));
    }

    public static int A03(View view) {
        return (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A05(AnonymousClass163 r0) {
        Object A00 = r0.A00();
        C17960vV.A07(A00);
        C18070vi.A0X(A00);
        return ((Number) A00).intValue();
    }

    public static Intent A0D(Fragment fragment) {
        AnonymousClass1FL A1B = fragment.A1B();
        if (A1B != null) {
            return A1B.getIntent();
        }
        return null;
    }

    public static SharedPreferences.Editor A0E(C18100vl r0) {
        Object value = r0.getValue();
        C18070vi.A0X(value);
        return ((SharedPreferences) value).edit();
    }

    public static SharedPreferences A0F(AnonymousClass00H r0) {
        return (SharedPreferences) ((C27031Ul) r0.get()).A01.getValue();
    }

    public static SharedPreferences A0G(AnonymousClass00H r0) {
        return (SharedPreferences) ((C38731rn) r0.get()).A01.getValue();
    }

    public static Bitmap A0H(View view) {
        return Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static Handler A0J(DoodleView doodleView) {
        doodleView.A03();
        doodleView.A03 = -65536;
        doodleView.A01 = 8.0f;
        doodleView.A02 = 8.0f;
        return new Handler();
    }

    public static ViewGroup.MarginLayoutParams A0L(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    public static C18030ve A0O(AnonymousClass10E r1, AnonymousClass10G r2, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        wDSBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r2);
        return (C18030ve) r1.A04.get();
    }

    public static AnonymousClass1EC A0Q(Activity activity) {
        return AnonymousClass1EC.A01.A02(activity.getIntent().getStringExtra("quoted_group_jid"));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations, androidx.recyclerview.widget.GridLayoutManager] */
    public static GridLayoutManagerNonPredictiveAnimations A0R(Fragment fragment) {
        return new GridLayoutManager(fragment.A14(), -1, 1, false);
    }

    public static Long A0T(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static Long A0U(Iterator it) {
        return Long.valueOf(((C63372sx) it.next()).A04());
    }

    public static StringBuilder A0a(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        StringBuilder sb = new StringBuilder();
        sb.append("Could not parse stanza into valid response class. Encountered the following errors for each possible response:\n");
        return sb;
    }

    public static LinkedHashMap A0b(Map map) {
        return new LinkedHashMap(C200610r.A03(map.size()));
    }

    public static List A0d(Iterable iterable) {
        return AnonymousClass1b2.A06(AnonymousClass1b2.A0C(C1591283i.A00, AnonymousClass1b2.A09(C1591183h.A00, C29431cG.A0V(iterable))));
    }

    public static AnonymousClass5WL A0e(Fragment fragment, C23421Fz r2) {
        C37801q9 A1G = fragment.A1G();
        A1G.A00();
        return AnonymousClass4FR.A00(C23401Fx.STARTED, A1G.A00, r2);
    }

    public static void A0j(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(C7H.A00(AnonymousClass00R.A19, C19740yt.A00(context, i)));
    }

    public static void A0k(Context context, TextView textView, AnonymousClass4VN r4) {
        textView.setTextSize(r4.A01(context.getTheme(), context.getResources()));
    }

    public static void A0m(Intent intent, Jid jid, boolean z) {
        intent.putExtra("chat_jid", C22971Dz.A06(jid));
        intent.putExtra("is_using_global_wallpaper", z);
    }

    public static void A0o(Paint paint, float f) {
        paint.setTextSize(f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(C43421zm.A03());
    }

    public static void A0p(Paint paint, int i, boolean z) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(z);
        paint.setDither(z);
    }

    public static void A0s(MenuItem menuItem, View view, int i) {
        Drawable A01 = AnonymousClass4aX.A01(view.getContext(), i);
        C18070vi.A0X(A01);
        menuItem.setIcon(A01);
    }

    public static void A0u(View view) {
        view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130971099, 2131102245));
    }

    public static void A0y(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A0z(ImageView imageView, int i, boolean z) {
        imageView.setImageResource(i);
        C28081Yu.A00(C19740yt.A03(imageView.getContext(), 2131102469), imageView);
        imageView.setSelected(z);
    }

    public static void A11(Fragment fragment) {
        ((AnonymousClass1FU) fragment.A1D()).BhQ(2131890601);
    }

    public static void A12(AnonymousClass1DS r2, boolean z) {
        Object A06 = r2.A06();
        Boolean valueOf = Boolean.valueOf(z);
        if (!C42171xk.A00(A06, valueOf)) {
            r2.A0F(valueOf);
        }
    }

    public static void A14(C37961qT r1, Object obj, List list) {
        list.remove(obj);
        if (!r1.A0F()) {
            r1.A07();
        }
    }

    public static void A15(BottomSheetBehavior bottomSheetBehavior, int i) {
        bottomSheetBehavior.A0V(i);
        bottomSheetBehavior.A0W(3);
        bottomSheetBehavior.A0h = true;
    }

    public static void A16(Chip chip) {
        chip.setChipBackgroundColorResource(AnonymousClass1YL.A00(chip.getContext(), 2130971087, 2131102418));
    }

    public static void A18(AnonymousClass10G r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        roundedBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r1);
        roundedBottomSheetDialogFragment.A00 = (C128116fT) r1.AAy.get();
    }

    public static void A1B(AnonymousClass1KB r4, Runnable runnable, long j) {
        r4.A0K(runnable, (A87.A01(j) - System.currentTimeMillis()) + 1000);
    }

    public static void A1C(AnonymousClass2HA r1, int i) {
        r1.A03 = Integer.valueOf(i);
        r1.A01 = 6;
    }

    public static void A1F(BkFragment bkFragment, ADL adl, Serializable serializable, String str) {
        BkFragment.A03(bkFragment);
        bkFragment.A15().putSerializable("screen_params", str);
        BkFragment.A03(bkFragment);
        bkFragment.A15().putParcelable("screen_cache_config", adl);
        BkFragment.A03(bkFragment);
        bkFragment.A15().putSerializable("qpl_params", serializable);
    }

    public static void A1G(C35511mM r1, C30131dR r2, Integer num) {
        r2.A02(Boolean.valueOf(r1.A06(num)), "is_account_linked");
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Object obj4) {
        C18070vi.A0b(obj);
        C18070vi.A0b(obj2);
        C18070vi.A0b(obj3);
        C18070vi.A0b(obj4);
    }

    public static void A1I(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 41);
        C18070vi.A0d(obj3, 42);
        C18070vi.A0d(obj4, 43);
    }

    public static void A1J(Object obj, String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString(), th);
    }

    public static void A1K(Object obj, StringBuilder sb) {
        sb.append(obj);
        C18070vi.A0d(sb.toString(), 0);
    }

    public static void A1M(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        Log.e(sb.toString());
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass8B2) it.next()).BLl());
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(((AnonymousClass206) it.next()).A0x));
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(String.valueOf(((Number) it.next()).longValue()));
    }

    public static void A1S(List list, C18100vl r3) {
        ((C40431uh) r3.getValue()).A00((Runnable) null, list);
    }

    public static void A1T(C18100vl r0, boolean z) {
        Object value = r0.getValue();
        C18070vi.A0X(value);
        ((CompoundButton) value).setChecked(z);
    }

    public static boolean A1U(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static boolean A1X(C160838Ad r1, C145777Mo r2) {
        return r1.BRX().A0v.equals(r2.A0K.A0v);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A1b(int[] r4, java.lang.Object[] r5) {
        /*
            r0 = 128512(0x1f600, float:1.80084E-40)
            r3 = 0
            r2 = 1
            r4[r3] = r0
            r5[r3] = r4
            int[] r1 = new int[r2]
            r0 = 128515(0x1f603, float:1.80088E-40)
            r1[r3] = r0
            r5[r2] = r1
            int[] r1 = new int[r2]
            r0 = 128516(0x1f604, float:1.80089E-40)
            r1[r3] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108995ce.A1b(int[], java.lang.Object[]):int[]");
    }
}
