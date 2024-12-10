package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.spamreport.ReportSpamDialogFragment;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.userban.ui.fragment.BanAppealBaseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.5cd  reason: invalid class name and case insensitive filesystem */
public abstract class C108985cd {
    public static C199029zJ A0K(Object obj) {
        C20046A4p a4p = new C20046A4p();
        a4p.A03(obj, 0);
        return new C199029zJ(a4p.A00);
    }

    public static C1418377d A0a() {
        return new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
    }

    public static List A0s(CharSequence charSequence, int i) {
        String[] strArr = new String[i];
        strArr[0] = ",";
        return AnonymousClass1YF.A0S(charSequence, strArr, 0);
    }

    public static JSONObject A0u(Object obj) {
        C18070vi.A0d(obj, 0);
        return new JSONObject();
    }

    public static void A10(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A19(C25931Qe r2, AnonymousClass206 r3, Class cls, AnonymousClass25F[] r5) {
        AnonymousClass25F A0M = r3.A0M(cls);
        C18070vi.A0X(A0M);
        r5[0] = A0M;
        r2.A0A(r5);
    }

    public static void A1D(Object obj, Object obj2) {
        C18070vi.A0d(obj, 3);
        C18070vi.A0d(obj2, 4);
    }

    public static void A1Q(AbstractList abstractList, Object[] objArr) {
        objArr[0] = abstractList.get(0);
        objArr[1] = abstractList.get(1);
    }

    public static long A09(C1418477e r1) {
        Object obj = r1.A00;
        C17960vV.A07(obj);
        return ((Number) obj).longValue();
    }

    public static AnimatorSet A0A(AnimatorSet animatorSet, Object obj, Animator[] animatorArr, int i) {
        animatorArr[i] = obj;
        animatorSet.playTogether(animatorArr);
        return new AnimatorSet();
    }

    public static JsonReader A0E(InputStream inputStream) {
        return new JsonReader(new InputStreamReader(inputStream));
    }

    public static AlphaAnimation A0H() {
        return new AlphaAnimation(1.0f, 0.0f);
    }

    public static C20046A4p A0J(Object obj) {
        C20046A4p a4p = new C20046A4p();
        a4p.A03(obj, 0);
        return a4p;
    }

    public static C36361nl A0N(AnonymousClass10E r0) {
        return (C36361nl) r0.A5h.get();
    }

    public static C29491cN A0O(BanAppealBaseFragment banAppealBaseFragment) {
        AnonymousClass00H r0 = banAppealBaseFragment.A05;
        if (r0 != null) {
            return (C29491cN) r0.get();
        }
        C18070vi.A11("accountSwitcher");
        throw null;
    }

    public static C29491cN A0P(WfacBanBaseFragment wfacBanBaseFragment) {
        AnonymousClass00H r0 = wfacBanBaseFragment.A09;
        if (r0 != null) {
            return (C29491cN) r0.get();
        }
        C18070vi.A11("accountSwitcher");
        throw null;
    }

    public static C24921Me A0R(AnonymousClass10E r0) {
        return (C24921Me) r0.ABX.get();
    }

    public static C61562pt A0U(ReportSpamDialogFragment reportSpamDialogFragment) {
        AnonymousClass00H r0 = reportSpamDialogFragment.A0K;
        if (r0 != null) {
            return (C61562pt) r0.get();
        }
        C18070vi.A11("reportFunnelLogger");
        throw null;
    }

    public static C60162nU A0X(C32741hg r0) {
        return ((C57602jL) r0.A0M.get()).A00;
    }

    public static C127796ew A0Y(StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment) {
        AnonymousClass00H r0 = statusPrivacyBottomSheetDialogFragment.A0G;
        if (r0 != null) {
            return (C127796ew) r0.get();
        }
        C18070vi.A11("statusQplLoggerLazy");
        throw null;
    }

    public static Long A0d(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static Object A0e(Object obj) {
        if (obj == C31751g4.COROUTINE_SUSPENDED) {
            return obj;
        }
        return new C30671eK(obj);
    }

    public static String A0g(int i, int i2, String str) {
        return str.subSequence(i2, i + 1).toString();
    }

    public static String A0l(AnonymousClass1E7 r0) {
        AnonymousClass1BI r02 = r0.A0J;
        C17960vV.A07(r02);
        return r02.getRawString();
    }

    public static String A0m(C1418477e r0) {
        Object obj = r0.A00;
        C17960vV.A07(obj);
        C18070vi.A0X(obj);
        return (String) obj;
    }

    public static String A0n(ReportSpamDialogFragment reportSpamDialogFragment) {
        String str = (String) reportSpamDialogFragment.A0T.getValue();
        C18070vi.A0X(str);
        return str;
    }

    public static String A0o(CharSequence charSequence, String str) {
        return new C41661wr(str).A00(charSequence, "");
    }

    public static JSONObject A0v(JSONObject jSONObject) {
        return new JSONObject(jSONObject.getString("data"));
    }

    public static void A0y(Message message, DeepLinkActivity deepLinkActivity, int i) {
        message.arg1 = i;
        deepLinkActivity.A00.sendMessageDelayed(message, 500);
    }

    public static void A11(View view, Animation animation) {
        animation.setDuration(300);
        view.startAnimation(animation);
    }

    public static void A15(Fragment fragment, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        fragment.A1R(bundle);
    }

    public static void A18(C87894Xm r2, int i) {
        r2.A01(new C91254fO(i), 107);
    }

    public static void A1G(Object obj, Object obj2, Object[] objArr) {
        objArr[1] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1J(Object obj, JSONObject jSONObject) {
        jSONObject.put("client_pub_key", obj);
        jSONObject.put("client_pub_key_type", "RSA 2048");
    }

    public static void A1K(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(str2);
        sb.append(' ');
        sb.append(i);
    }

    public static void A1P(AbstractCollection abstractCollection, AnonymousClass1OS r3, AnonymousClass1OX r4) {
        abstractCollection.add(C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, r3, r4));
    }

    public static boolean A1U(int i) {
        return "gif".equals(AnonymousClass25A.A0B(i));
    }

    public static boolean A1V(C18020vd r2) {
        return C39761tb.A0D(C18020vd.A01(C18040vf.A02, r2, 2917));
    }

    public static boolean A1X(SearchFragment searchFragment) {
        return ((C38581rX) searchFragment.A0y.get()).A01();
    }

    public static boolean A1Y(C30141dS r2) {
        return C18020vd.A05(C18040vf.A01, r2.A01, 10406);
    }

    public static float A00(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static float A01(View view) {
        return view.getResources().getDimension(2131169436);
    }

    public static int A02(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        C18070vi.A0X(nextString);
        return Integer.parseInt(nextString);
    }

    public static int A03(View view) {
        return C19740yt.A00(view.getContext(), 2131101222);
    }

    public static int A04(View view) {
        return C62762rw.A01(view.getContext(), 2.0f);
    }

    public static int A05(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A06(View view, int i) {
        return i + view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A07(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A08(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static Intent A0B(Context context) {
        return AnonymousClass1LU.A02(context).setAction(C28901bF.A02);
    }

    public static SharedPreferences.Editor A0C(SharedPreferences sharedPreferences, C19830z4 r1, AnonymousClass1L1 r2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C18070vi.A0X(edit);
        r2.A00(r1);
        return edit;
    }

    public static Uri A0D(Uri.Builder builder, String str, String str2) {
        return builder.appendPath(str).appendPath(str2).build();
    }

    public static ViewPropertyAnimator A0F(View view) {
        return view.animate().alpha(0.0f);
    }

    public static ViewPropertyAnimator A0G(View view) {
        return view.animate().alpha(1.0f);
    }

    public static C20125A8k A0I(C20125A8k a8k, Class cls, String str) {
        C20125A8k A09 = a8k.A09(cls, str);
        C199610h.A04(A09);
        C18070vi.A0X(A09);
        return A09;
    }

    public static AnonymousClass1FU A0L(Context context) {
        Activity A00 = AnonymousClass1L9.A00(context);
        C18070vi.A0z(A00, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return (AnonymousClass1FU) A00;
    }

    public static AnonymousClass1FU A0M(Fragment fragment) {
        AnonymousClass1FL A1B = fragment.A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return (AnonymousClass1FU) A1B;
    }

    public static C139786zR A0Q(AnonymousClass00H r0) {
        return ((WfalManager) r0.get()).A01();
    }

    public static C28791au A0S(AnonymousClass00H r0) {
        return ((C24801Ls) r0.get()).A06();
    }

    public static C1193267r A0T(AnonymousClass10E r0) {
        return (C1193267r) r0.A9P.get();
    }

    public static AnonymousClass1c4 A0V(AnonymousClass6BJ r0) {
        return (AnonymousClass1c4) r0.A4d().get();
    }

    public static C111265jP A0W(NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity) {
        return (C111265jP) newsletterSelectToUpgradeMVActivity.A4b().get();
    }

    public static C127806ex A0Z(StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment) {
        return (C127806ex) statusAudienceSelectorShareSheetFragment.A2K().get();
    }

    public static C20050A4v A0b(GalleryTabHostFragment galleryTabHostFragment) {
        return (C20050A4v) galleryTabHostFragment.A27().get();
    }

    public static A2X A0c(AnonymousClass00H r0, String str) {
        return ((A2V) r0.get()).A02(str);
    }

    public static String A0f() {
        String obj = UUID.randomUUID().toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static String A0h(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0i(Fragment fragment) {
        return fragment.A15().getString("jid");
    }

    public static String A0j(AnonymousClass11S r0) {
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C18070vi.A0b(phoneUserJid);
        return phoneUserJid.getRawString();
    }

    public static String A0k(AnonymousClass86W r1) {
        return r1.BM2().A0D(36);
    }

    public static String A0p(KeyPair keyPair) {
        String A01 = C20059A5i.A01(keyPair.getPublic());
        C18070vi.A0X(A01);
        return A01;
    }

    public static StringBuilder A0q(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
        return new StringBuilder();
    }

    public static Iterator A0r(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static List A0t(Iterable iterable, ListIterator listIterator) {
        return C29431cG.A0v(iterable, listIterator.nextIndex() + 1);
    }

    public static void A0w(Canvas canvas, RectF rectF, float f) {
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
    }

    public static void A0x(PointF pointF, MotionEvent motionEvent) {
        pointF.set(motionEvent.getX(), motionEvent.getY());
    }

    public static void A0z(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i);
    }

    public static void A12(Animation animation, long j) {
        animation.setDuration(j);
        animation.setStartOffset(100);
    }

    public static void A13(Animation animation, Interpolator interpolator) {
        animation.setInterpolator(interpolator);
        animation.setDuration(100);
    }

    public static void A14(AnonymousClass01E r0, int i, int i2) {
        View findViewById = r0.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public static void A16(TabLayout tabLayout, int i) {
        C136836uU A08 = tabLayout.A08(i);
        if (A08 != null) {
            A08.A00();
        }
    }

    public static void A17(C25661Pc r2, Integer num, Integer num2, int i) {
        C25661Pc.A00(r2, num, num2, Integer.valueOf(i), (Integer) null);
    }

    public static void A1A(C29591cX r0, C29591cX r1, String str) {
        r0.A07(str);
        r1.A05(r0.A03());
    }

    public static void A1B(C1418377d r2, File file) {
        r2.A0B = file.getAbsolutePath();
        r2.A01 = 1;
    }

    public static void A1C(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A1E(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1F(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.contains(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1H(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append("; host=");
    }

    public static void A1I(Object obj, AbstractCollection abstractCollection) {
        if (!abstractCollection.contains(obj)) {
            abstractCollection.add(obj);
        }
    }

    public static void A1L(String str, StringBuilder sb, StringBuilder sb2) {
        sb.append(str);
        sb2.append(sb.toString());
    }

    public static void A1M(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.e(sb.toString(), th);
    }

    public static void A1N(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C63372sx) it.next()).A0A);
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof AnonymousClass6B5) {
            abstractCollection.add(next);
        }
    }

    public static void A1R(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static void A1S(List list, Object[] objArr, int i) {
        objArr[i] = Integer.valueOf(list.size());
    }

    public static void A1T(Map.Entry entry, Map map) {
        map.put(entry.getKey(), entry.getValue());
    }

    public static boolean A1W(GalleryRecentsFragment galleryRecentsFragment, AnonymousClass8B2 r3) {
        return GalleryRecentsFragment.A02(r3.BLl(), galleryRecentsFragment, r3.BQD());
    }

    public static boolean A1Z(AnonymousClass00H r0) {
        return ((C56972iK) r0.get()).A00();
    }

    public static boolean A1a(AnonymousClass00H r0) {
        return ((C30141dS) r0.get()).A00();
    }

    public static boolean A1b(AnonymousClass00H r0) {
        return ((AnonymousClass1c4) r0.get()).A06();
    }
}
