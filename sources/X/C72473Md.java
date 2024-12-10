package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsPasskeysEnabledFragment;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.File;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.3Md  reason: invalid class name and case insensitive filesystem */
public abstract class C72473Md {
    public static int A01(int i, int i2) {
        return AnonymousClass1Z2.A06(i2, (int) ((((float) i) / 100.0f) * 255.0f));
    }

    public static View A0I(int i, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        List list = C42011xT.A0I;
        C18070vi.A0b(inflate);
        return inflate;
    }

    public static AnimationSet A0J(Animation animation, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static C19993A2g A0W(AnonymousClass5WY r1, AnonymousClass1PY r2) {
        C18070vi.A0b(r1);
        C19993A2g A01 = r2.A01(r1);
        A01.A01 = true;
        A01.A02(C35021lW.A05);
        return A01;
    }

    public static Object A0e(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return C89424cR.CREATOR.createFromParcel(parcel);
    }

    public static String A0j(Context context, Object obj, int i) {
        return context.getString(i, new Object[]{obj});
    }

    public static String A0k(Resources resources, int i, int i2) {
        return resources.getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
    }

    public static C31781g7 A0m(C30391dr r3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r0 = new C31781g7(1, C30581eB.A02(r3));
        r0.A0F();
        return r0;
    }

    public static void A0q(Context context, AnonymousClass1L9 r3, AnonymousClass1LU r4, AbstractList abstractList) {
        r3.A09(context, r4.A1w(context, (AnonymousClass1BI) abstractList.get(0), 0));
    }

    public static void A0u(BaseBundle baseBundle, ImageView imageView, String str) {
        int i = baseBundle.getInt(str);
        C18070vi.A0d(imageView, 0);
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
    }

    public static void A0w(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public static void A0y(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A0z(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static void A10(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public static void A1F(WallPaperView wallPaperView) {
        wallPaperView.A03 = false;
        wallPaperView.setImageDrawable((Drawable) null);
        wallPaperView.invalidate();
    }

    public static void A1I(Object obj, Object obj2) {
        C18070vi.A0d(obj, 1);
        C18070vi.A0d(obj2, 3);
    }

    public static void A1J(Object obj, Object obj2) {
        C18070vi.A0d(obj, 5);
        C18070vi.A0d(obj2, 6);
    }

    public static void A1O(List list, Object[] objArr) {
        objArr[0] = list.get(0);
        objArr[1] = list.get(1);
    }

    public static float[] A1a(float f, float f2) {
        return new float[]{f, f2};
    }

    public static int A08(AnonymousClass4aY r0) {
        return r0.A2Q.getResources().getConfiguration().orientation;
    }

    public static Intent A0B(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), str);
        return intent;
    }

    public static Bitmap A0E(byte[] bArr) {
        return AnonymousClass204.A0C(new AnonymousClass25O(8000, 8000), bArr).A02;
    }

    public static Paint A0F(CircularRevealView circularRevealView) {
        if (!circularRevealView.A05) {
            circularRevealView.A05 = true;
            circularRevealView.generatedComponent();
        }
        circularRevealView.A02 = 300;
        return new Paint(1);
    }

    public static Bundle A0H(Jid jid) {
        Bundle bundle = new Bundle();
        bundle.putString("jid", jid.getRawString());
        return bundle;
    }

    public static AnonymousClass10E A0M(WaFragment waFragment, Object obj) {
        AnonymousClass10E r1 = ((C36241nZ) obj).A2Q;
        C34701kw.A00(waFragment, AnonymousClass10G.A8i(r1.A00));
        return r1;
    }

    public static AnonymousClass10E A0N(WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment, Object obj) {
        AnonymousClass10E r1 = ((C36241nZ) obj).A2Q;
        wDSBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r1.A00);
        return r1;
    }

    public static C88204Ys A0Q(AnonymousClass4aY r0) {
        return (C88204Ys) ((C56252hA) r0.A4u.get()).A0F.get();
    }

    public static AnonymousClass1UD A0R(AnonymousClass4aY r0) {
        return (AnonymousClass1UD) ((C56252hA) r0.A4u.get()).A0E.get();
    }

    public static C18000vb A0S(Object obj) {
        return (C18000vb) ((C27691Xc) obj).A10.ABz.get();
    }

    public static C85954Po A0V(InAppBugReportingActivity inAppBugReportingActivity) {
        AnonymousClass00H r0 = inAppBugReportingActivity.A0M;
        if (r0 != null) {
            Object obj = r0.get();
            C18070vi.A0X(obj);
            return (C85954Po) obj;
        }
        C18070vi.A11("supportLogger");
        throw null;
    }

    public static C191519mj A0Z(SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment) {
        C191519mj r0 = ((SettingsPasskeysViewModel) settingsPasskeysEnabledFragment.A04.getValue()).A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("logger");
        throw null;
    }

    public static AnonymousClass210 A0a(AnonymousClass1FY r4, AnonymousClass1BI r5, String str, boolean z) {
        return new AnonymousClass210(new AnonymousClass205(r5, str, z), AnonymousClass11P.A01(r4.A05));
    }

    public static Integer A0c(SelectedMediaFragmentBase selectedMediaFragmentBase) {
        return ((GalleryPickerViewModel) selectedMediaFragmentBase.A05.getValue()).A0T();
    }

    public static Object A0f(AnonymousClass4aY r3) {
        return AnonymousClass4aY.A8L.get(r3.A35.A06(AnonymousClass1BI.class));
    }

    public static C30391dr A0l(Object obj, Object obj2, C30411dt r2) {
        return r2.create(Integer.valueOf(((Number) obj).intValue()), (C30391dr) obj2);
    }

    public static void A0p(Activity activity, MaxHeightLinearLayout maxHeightLinearLayout, float f) {
        if (maxHeightLinearLayout != null) {
            maxHeightLinearLayout.setMaxHeight((int) (((float) AnonymousClass4aR.A00(activity)) * f));
        }
    }

    public static void A13(View view, DialogFragment dialogFragment) {
        Window window;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
            AnonymousClass6VM.A00(window, false);
            C123496Ur r0 = new C25932Cow(window.getDecorView(), window).A00;
            r0.A03(true);
            r0.A04(true);
            AnonymousClass1HF.A0g(view, new C91314fU(4));
        }
    }

    public static void A15(TextView textView, AnonymousClass11P r3, C18000vb r4, AnonymousClass206 r5) {
        textView.setText(A8I.A00(r4, r3.A09(r5.A0I)));
    }

    public static void A1A(Fragment fragment, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("ENTRY_POINT", i);
        fragment.A1R(bundle);
    }

    public static void A1C(WaTextView waTextView) {
        Rect rect = C39401t1.A0A;
        waTextView.setAccessibilityHelper(new C39411t2(waTextView, waTextView.getSystemServices()));
    }

    public static void A1E(AnonymousClass4aY r1) {
        C108645c3 r12 = r1.A4e;
        if (r12 != null && r12.BT1()) {
            r12.CBJ();
        }
    }

    public static void A1G(Object obj, int i, int i2) {
        WDSActionTile wDSActionTile;
        if ((obj instanceof WDSActionTile) && (wDSActionTile = (WDSActionTile) obj) != null) {
            wDSActionTile.setIcon(i);
            wDSActionTile.setText(i2);
        }
    }

    public static void A1H(Object obj, Object obj2) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) obj;
        if (obj2.equals(groupChatInfoActivity.A1K)) {
            GroupChatInfoActivity.A1F(groupChatInfoActivity);
        }
    }

    public static void A1K(Object obj, Object obj2) {
        C18070vi.A0d(obj, 9);
        C18070vi.A0d(obj2, 10);
    }

    public static void A1L(Object obj, Object obj2) {
        C18070vi.A0d(obj, 11);
        C18070vi.A0d(obj2, 12);
    }

    public static boolean A1U(ContactInfoActivity contactInfoActivity) {
        return ((C37551pj) contactInfoActivity.A1g.get()).A0P(contactInfoActivity.A4l());
    }

    public static boolean A1V(AnonymousClass4aY r0) {
        return ((C24001Il) r0.A64.get()).A07();
    }

    public static boolean A1W(GroupChatInfoActivity groupChatInfoActivity) {
        return ((C42211xo) groupChatInfoActivity.A0W.get()).A00(groupChatInfoActivity.A0u);
    }

    public static boolean A1X(GroupChatInfoActivity groupChatInfoActivity) {
        return ((C42211xo) groupChatInfoActivity.A0W.get()).A02(groupChatInfoActivity.A0u);
    }

    public static float A00(View view) {
        return view.getContext().getResources().getDisplayMetrics().density;
    }

    public static int A02(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C18070vi.A0z(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Number) animatedValue).intValue();
    }

    public static int A03(Context context) {
        if (AnonymousClass11E.A02(context)) {
            return 2131892440;
        }
        return 2131892439;
    }

    public static int A04(View view) {
        return (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A05(View view) {
        return AnonymousClass1YL.A00(view.getContext(), 2130971981, 2131101293);
    }

    public static int A06(View view) {
        return AnonymousClass1YL.A00(view.getContext(), 2130971957, 2131103410);
    }

    public static int A07(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static Intent A09(Context context) {
        return AnonymousClass1LU.A02(context.getApplicationContext()).addFlags(603979776);
    }

    public static Intent A0A(Context context, Jid jid, int i) {
        return AnonymousClass1LU.A0C(context, i).putExtra("jid", C22971Dz.A06(jid));
    }

    public static Intent A0C(AnonymousClass129 r1, String str) {
        Uri A03 = r1.A03(str);
        C18070vi.A0X(A03);
        return new Intent("android.intent.action.VIEW", A03);
    }

    public static Intent A0D(String str) {
        Uri parse = Uri.parse(str);
        C18070vi.A0X(parse);
        return new Intent("android.intent.action.VIEW", parse);
    }

    public static Drawable A0G(Reference reference, int i) {
        Context context = (Context) reference.get();
        if (context != null) {
            return AnonymousClass4aX.A01(context, i);
        }
        return null;
    }

    public static AnonymousClass1K1 A0K(AnonymousClass1FO r2) {
        AnonymousClass1K1 r1 = (AnonymousClass1K1) ((C006602x) r2.generatedComponent());
        r2.A01 = AnonymousClass1K1.A1X(r1);
        return r1;
    }

    public static AnonymousClass10E A0L(AnonymousClass1FO r2) {
        AnonymousClass1K1 r1 = (AnonymousClass1K1) ((C006602x) r2.generatedComponent());
        r2.A01 = AnonymousClass1K1.A1X(r1);
        return r1.AAQ;
    }

    public static AnonymousClass1FU A0O(View view) {
        return (AnonymousClass1FU) C18050vg.A01(view.getContext(), AnonymousClass1FU.class);
    }

    public static AnonymousClass4S8 A0P(Object obj, C18100vl r2) {
        return (AnonymousClass4S8) ((Map) r2.getValue()).get(obj);
    }

    public static C18030ve A0T(AnonymousClass10E r1, AnonymousClass10G r2, WaFragment waFragment) {
        C34701kw.A00(waFragment, AnonymousClass10G.A8i(r2));
        return (C18030ve) r1.A04.get();
    }

    public static C18030ve A0U(AnonymousClass10E r1, AnonymousClass10G r2, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        wDSBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r2);
        return (C18030ve) r1.A04.get();
    }

    public static Jid A0X(Iterator it) {
        return ((AnonymousClass1E7) it.next()).A06(UserJid.class);
    }

    public static AnonymousClass1EC A0Y(Intent intent, String str) {
        AnonymousClass1EC A02 = AnonymousClass1EC.A01.A02(intent.getStringExtra(str));
        C17960vV.A07(A02);
        return A02;
    }

    public static Float A0b(View view, int i) {
        return Float.valueOf((float) view.getResources().getDimensionPixelSize(i));
    }

    public static Integer A0d(AnonymousClass1E9 r1, AnonymousClass00H r2) {
        return Integer.valueOf(((AnonymousClass1MZ) r2.get()).A08.A0A(r1));
    }

    public static Object A0g(AnonymousClass00H r0) {
        return ((C216616x) r0.get()).A03.A06();
    }

    public static Object A0h(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static Object A0i(PriorityQueue priorityQueue) {
        if (priorityQueue.isEmpty()) {
            return null;
        }
        return priorityQueue.peek();
    }

    public static void A0n(ValueAnimator valueAnimator, long j) {
        valueAnimator.setDuration(j);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
    }

    public static void A0o(Activity activity) {
        C28281Zt.A05(activity, AnonymousClass1YL.A00(activity, 2130968626, 2131099689));
    }

    public static void A0r(Context context, C89494cY r2, C18100vl r3) {
        context.startActivity(AnonymousClass1LU.A17(context, (C29681ch) r3.getValue(), r2));
    }

    public static void A0s(Intent intent, Jid jid, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("chat_jid", C22971Dz.A06(jid));
    }

    public static void A0t(Resources.Theme theme, Resources resources, ImageView imageView, C43011z6 r5, AnonymousClass1VU r6) {
        imageView.setImageDrawable(AnonymousClass1VU.A00(theme, resources, r5, r6.A00, 2131233211));
    }

    public static void A0v(Bundle bundle, C692236j r2, AnonymousClass00H r3) {
        r2.A00(((AnonymousClass727) r3.get()).A02(bundle));
    }

    public static void A0x(SpannableStringBuilder spannableStringBuilder, Object obj, Object obj2) {
        spannableStringBuilder.setSpan(obj2, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), spannableStringBuilder.getSpanFlags(obj));
    }

    public static void A11(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void A12(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A14(View view, AnonymousClass00H r2) {
        view.setBackground(((C108355bZ) r2.get()).BQF());
    }

    public static void A16(C003401n r1) {
        C17960vV.A07(r1);
        C18070vi.A0X(r1);
        r1.A0W(true);
    }

    public static void A17(AnonymousClass01E r1) {
        C003401n supportActionBar = r1.getSupportActionBar();
        C17960vV.A07(supportActionBar);
        supportActionBar.A0W(true);
    }

    public static void A18(AnonymousClass01E r1) {
        C003401n supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
        }
    }

    public static void A19(C34001jj r4) {
        r4.A06(2130772012, 2130772013, 2130772011, 2130772014);
    }

    public static void A1B(C24490C6i c6i, C38391rD r1, Collection collection, List list) {
        C25734Cl4 A00 = C25367CeS.A00(c6i);
        list.clear();
        list.addAll(collection);
        A00.A02(r1);
    }

    public static void A1D(WaTextView waTextView) {
        waTextView.setMovementMethod(new C39441t5(waTextView.getAbProps()));
    }

    public static void A1M(Object obj, Object obj2, Object obj3, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 4);
        C18070vi.A0d(obj3, 5);
    }

    public static void A1N(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass1E7) it.next()).A06(AnonymousClass1BI.class));
    }

    public static void A1P(C18100vl r1) {
        ((Handler) r1.getValue()).removeCallbacksAndMessages((Object) null);
    }

    public static boolean A1Q(Uri uri) {
        return new File(uri.getPath()).exists();
    }

    public static boolean A1R(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1S(AnonymousClass01E r1) {
        C003401n supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
        }
        return true;
    }

    public static boolean A1T(AnonymousClass01E r1) {
        C003401n supportActionBar = r1.getSupportActionBar();
        C17960vV.A07(supportActionBar);
        supportActionBar.A0W(true);
        return true;
    }

    public static boolean A1Y(AnonymousClass00H r0) {
        return ((AnonymousClass1HV) r0.get()).A01.A2S();
    }

    public static boolean A1Z(C18140vp r0) {
        Object obj = r0.get();
        C18070vi.A0X(obj);
        return ((Boolean) obj).booleanValue();
    }

    public static URLSpan[] A1b(Spanned spanned, int i) {
        return (URLSpan[]) spanned.getSpans(i, spanned.length(), URLSpan.class);
    }
}
