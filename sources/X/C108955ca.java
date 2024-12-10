package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.expressionstray.expression.avatars.AvatarStickersCategoriesView;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.io.ByteArrayOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.5ca  reason: invalid class name and case insensitive filesystem */
public abstract class C108955ca {
    public static int A02(Context context) {
        return AnonymousClass4Z9.A01(context, false);
    }

    public static int A06(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static AnonymousClass877 A0O(AvatarStickersCategoriesView avatarStickersCategoriesView) {
        C18070vi.A0d(avatarStickersCategoriesView, 0);
        return avatarStickersCategoriesView.A00;
    }

    public static AnonymousClass9EV A0c(AnonymousClass9N7 r1, Object obj) {
        C18070vi.A0d(obj, 1);
        return r1.A00;
    }

    public static Integer A0e() {
        return 7;
    }

    public static Object A0p(List list) {
        return list.get(0);
    }

    public static String A14(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static void A1Y(int[] iArr, Object[] objArr, int i) {
        iArr[0] = i;
        objArr[30] = iArr;
    }

    public static String[] A1b(List list) {
        return (String[]) list.toArray(new String[0]);
    }

    public static int A09(AnonymousClass1D6 r0) {
        return ((Number) r0.second).intValue();
    }

    public static ViewGroup A0H(Object obj) {
        C18070vi.A0z(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) obj;
    }

    public static C27183DXs A0I(AnonymousClass1OS r2, C23421Fz r3) {
        return new C27183DXs(r2, r3, 10);
    }

    public static CallHeaderStateHolder A0L(VoipActivityV2 voipActivityV2) {
        return (CallHeaderStateHolder) voipActivityV2.A1l.get();
    }

    public static C24661Le A0M(AnonymousClass10E r0) {
        return (C24661Le) r0.AAJ.get();
    }

    public static StickerExpressionsViewModel A0P(StickerExpressionsFragment stickerExpressionsFragment) {
        return (StickerExpressionsViewModel) stickerExpressionsFragment.A0f.getValue();
    }

    public static SearchFunStickersViewModel A0Q(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        return (SearchFunStickersViewModel) searchFunStickersBottomSheet.A0Y.getValue();
    }

    public static C1193567u A0S(Object obj) {
        C1193567u r1 = (C1193567u) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static C136986uj A0U(MediaComposerActivity mediaComposerActivity) {
        return (C136986uj) mediaComposerActivity.A1s.get();
    }

    public static C134146q7 A0V(MediaComposerActivity mediaComposerActivity) {
        return (C134146q7) mediaComposerActivity.A1A.get();
    }

    public static C31611fq A0X(AnonymousClass10E r0) {
        return (C31611fq) r0.A4Q.get();
    }

    public static C29591cX A0Y() {
        return new C29591cX("iq");
    }

    public static C39991ty A0Z(StatusesFragment statusesFragment) {
        return (C39991ty) statusesFragment.A10.get();
    }

    public static AnonymousClass84U A0a(Object obj) {
        AnonymousClass84U r1 = (AnonymousClass84U) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static C32021gV A0b(AnonymousClass10E r0) {
        return (C32021gV) r0.A6k.get();
    }

    public static Integer A0f() {
        return 9;
    }

    public static Integer A0g() {
        return 11;
    }

    public static Integer A0h() {
        return 12;
    }

    public static Integer A0i() {
        return 13;
    }

    public static Integer A0j() {
        return 32;
    }

    public static String A0v(C18020vd r1, int i) {
        String A01 = C18020vd.A01(C18040vf.A02, r1, i);
        C18070vi.A0X(A01);
        return A01;
    }

    public static String A0w(AnonymousClass206 r0) {
        String str = r0.A0v.A01;
        C18070vi.A0X(str);
        return str;
    }

    public static String A0y(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static String A13(byte[] bArr) {
        return new String(bArr, C26571Sq.A05);
    }

    public static void A19(Animator animator) {
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A1A(Animator animator) {
        animator.setInterpolator(new DecelerateInterpolator());
    }

    public static void A1I(View view, int i, ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A1K(View view, Object obj, int i) {
        AnonymousClass1HF.A0f(view, new C110945hX(obj, i));
    }

    public static void A1L(ImageView imageView, int i) {
        imageView.setImageDrawable(new ColorDrawable(i));
    }

    public static void A1N(AiImagineBottomSheet aiImagineBottomSheet, int i) {
        C28931bI r0 = aiImagineBottomSheet.A0W;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public static void A1O(C42601yR r0) {
        if (r0 != null) {
            r0.A00.A01();
        }
    }

    public static void A1R(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new C70623Bv(obj, obj2, i));
    }

    public static float A00(View view) {
        return (float) (view.getWidth() / 2);
    }

    public static int A01(Context context) {
        return C19740yt.A00(context, 2131102739);
    }

    public static int A03(C34141jz r0) {
        return r0.A02().length();
    }

    public static int A04(Enum enumR, int i) {
        C18070vi.A0d(enumR, i);
        return enumR.ordinal();
    }

    public static int A05(String str) {
        C18070vi.A0b(str);
        return str.length();
    }

    public static int A07(AbstractList abstractList, int i) {
        return ((C39611tM) abstractList.get(i)).A00;
    }

    public static int A08(List list, int i) {
        return Math.min(i, list.size());
    }

    public static Context A0A(Fragment fragment, AnonymousClass00H r1) {
        r1.get();
        return fragment.A14();
    }

    public static Intent A0B(Fragment fragment) {
        return fragment.A1D().getIntent();
    }

    public static SharedPreferences A0C(C18010vc r0, String str) {
        SharedPreferences A05 = r0.A05(str);
        C18070vi.A0X(A05);
        return A05;
    }

    public static Resources A0D(Context context) {
        Resources resources = context.getResources();
        C18070vi.A0X(resources);
        return resources;
    }

    public static Canvas A0E(Bitmap bitmap) {
        C18070vi.A0X(bitmap);
        return new Canvas(bitmap);
    }

    public static Uri A0F(String str) {
        Uri A01 = C26215Cuu.A01(str);
        C18070vi.A0X(A01);
        return A01;
    }

    public static View A0G(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C18070vi.A0b(inflate);
        return inflate;
    }

    public static AnonymousClass1IX A0J(C20125A8k a8k, Class cls, String str) {
        AnonymousClass1IX A0A = a8k.A0A(cls, str);
        C199610h.A04(A0A);
        return A0A;
    }

    public static AnonymousClass1K1 A0K(AnonymousClass009 r0) {
        return (AnonymousClass1K1) ((C006602x) r0.generatedComponent());
    }

    public static C179229Hb A0N(AnonymousClass181 r1, AUZ auz, Integer num, int i) {
        return auz.BMP(r1, num, Integer.valueOf(i));
    }

    public static C18030ve A0R(AnonymousClass00H r0) {
        return ((C24641Lc) r0.get()).A01;
    }

    public static UserJid A0T(CallInfo callInfo) {
        UserJid peerJid = callInfo.getPeerJid();
        C17960vV.A07(peerJid);
        return peerJid;
    }

    public static AnonymousClass1c4 A0W(AnonymousClass00H r0) {
        return (AnonymousClass1c4) r0.get();
    }

    public static AnonymousClass11B A0d(AnonymousClass11C r0) {
        AnonymousClass11B A0O = r0.A0O();
        C17960vV.A07(A0O);
        return A0O;
    }

    public static Integer A0k(Object obj, AbstractMap abstractMap, int i) {
        Integer valueOf = Integer.valueOf(i);
        abstractMap.put(obj, valueOf);
        return valueOf;
    }

    public static Integer A0l(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static Long A0m() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Object A0n(Object obj) {
        C30691eM.A01(obj);
        return ((C30671eK) obj).value;
    }

    public static Object A0o(AbstractList abstractList, int i) {
        return ((C39611tM) abstractList.get(i)).A01;
    }

    public static String A0q(int i, int i2, String str) {
        String substring = str.substring(i, i2);
        C18070vi.A0X(substring);
        return substring;
    }

    public static String A0r(Activity activity, String str) {
        return activity.getIntent().getStringExtra(str);
    }

    public static String A0s(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        C17960vV.A07(string);
        return string;
    }

    public static String A0t(C19830z4 r0) {
        String A0l = r0.A0l();
        C18070vi.A0X(A0l);
        return A0l;
    }

    public static String A0u(C19830z4 r0) {
        String A0n = r0.A0n();
        C18070vi.A0X(A0n);
        return A0n;
    }

    public static String A0x(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0z(String str, int i) {
        String substring = str.substring(i);
        C18070vi.A0X(substring);
        return substring;
    }

    public static String A10(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        return th.getMessage();
    }

    public static String A11(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        C18070vi.A0X(optString);
        return optString;
    }

    public static String A12(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        C18070vi.A0X(format);
        return format;
    }

    public static StringBuilder A15(Object obj) {
        C18070vi.A0X(obj);
        return new StringBuilder();
    }

    public static ArrayList A16(Object obj, int i) {
        C18070vi.A0d(obj, i);
        return new ArrayList();
    }

    public static Collection A17(AbstractMap abstractMap) {
        Collection values = abstractMap.values();
        C18070vi.A0X(values);
        return values;
    }

    public static ListIterator A18(List list) {
        return list.listIterator(list.size());
    }

    public static void A1B(Context context, View view, C1418377d r2) {
        view.setContentDescription(AnonymousClass73J.A00(context, r2));
    }

    public static void A1C(Context context, AnonymousClass1DS r1, int i) {
        r1.A0E(context.getString(i));
    }

    public static void A1D(Context context, C73203Rj r1, int i) {
        r1.A0S(context.getString(i));
    }

    public static void A1E(Context context, AnonymousClass11C r2, int i) {
        AnonymousClass1Y5.A00(context, r2, context.getString(i));
    }

    public static void A1F(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A1G(Menu menu, int i, int i2, int i3) {
        menu.add(i, i2, i, i3).setShowAsAction(i);
    }

    public static void A1H(View view, int i, int i2) {
        C23520Bik.A01(view, i, i2).A08();
    }

    public static void A1J(View view, Fragment fragment, int i) {
        view.setContentDescription(fragment.A1H(i));
    }

    public static void A1M(Fragment fragment) {
        fragment.A1D().finish();
    }

    public static void A1P(C29591cX r0, C29591cX r1) {
        r1.A05(r0.A03());
    }

    public static void A1Q(C20050A4v a4v, int i, int i2, int i3) {
        a4v.A02(Integer.valueOf(i), i2, i3);
    }

    public static void A1S(AnonymousClass00H r0) {
        C18070vi.A0X(r0.get());
    }

    public static void A1T(Object obj, String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(obj, str.getBytes(str2));
    }

    public static void A1U(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj.toString());
    }

    public static void A1V(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1W(String str, Locale locale, Object[] objArr) {
        C18070vi.A0X(String.format(locale, str, objArr));
    }

    public static void A1X(String str, Locale locale, Object[] objArr) {
        Log.i(String.format(locale, str, objArr));
    }

    public static boolean A1Z(String str, String str2) {
        return str2.startsWith(str);
    }

    public static byte[] A1a(Bitmap.CompressFormat compressFormat, Bitmap bitmap, ByteArrayOutputStream byteArrayOutputStream, int i) {
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
