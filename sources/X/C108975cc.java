package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.music.musiceditor.ui.MusicEditorDialog;
import com.whatsapp.registration.sendsmstowa.SendSmsToWa;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment;
import java.io.File;
import java.lang.ref.Reference;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONObject;

/* renamed from: X.5cc  reason: invalid class name and case insensitive filesystem */
public abstract class C108975cc {
    public static float A01(int i) {
        return i != 0 ? 1.0f : 0.0f;
    }

    public static Object A0Z(Reference reference) {
        C18070vi.A0d(reference, 0);
        return reference.get();
    }

    public static String A0b(Context context, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        return context.getString(i, objArr);
    }

    public static C30391dr A0j(AnonymousClass1OB r1) {
        if (r1 == null) {
            return null;
        }
        r1.BEM((CancellationException) null);
        return null;
    }

    public static short A0m(int i) {
        return i != 0 ? (short) -1 : 1;
    }

    public static void A0p(Menu menu, int i, int i2) {
        MenuItem add = menu.add(0, i, 0, i2);
        C18070vi.A0X(add);
        add.setShowAsAction(0);
    }

    public static void A0w(View view, C37961qT r2, C42011xT r3) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        r2.A08(r3);
    }

    public static void A0y(TextView textView, C18000vb r2, long j) {
        textView.setText(C64052u8.A0D(r2, (String) null, j));
    }

    public static void A12(Object obj, Object obj2, int i) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(obj2, i);
    }

    public static boolean A19(int i) {
        return i < 0;
    }

    public static boolean A1A(int i) {
        return i <= 0;
    }

    public static boolean A1B(int i) {
        return i == 1;
    }

    public static boolean A1C(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1D(int i, int i2) {
        return i > i2;
    }

    public static boolean A1G(A34 a34) {
        if (a34 != null) {
            a34.A0B(true);
        }
        return true;
    }

    public static boolean A1J(Object obj) {
        C18070vi.A0d(obj, 2);
        return false;
    }

    public static boolean A1K(Object obj) {
        C18070vi.A0d(obj, 3);
        return true;
    }

    public static boolean A1N(String str, String str2) {
        C18070vi.A0d(str, 1);
        return str2.startsWith(str);
    }

    public static int[] A1P(int[] iArr, Object[] objArr, int i) {
        iArr[0] = i;
        objArr[25] = iArr;
        return new int[1];
    }

    public static int[] A1Q(int[] iArr, Object[] objArr, int i) {
        iArr[0] = i;
        objArr[26] = iArr;
        return new int[1];
    }

    public static int[] A1R(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[11] = iArr;
        return new int[i2];
    }

    public static int[] A1S(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[22] = iArr;
        return new int[i2];
    }

    public static int[] A1T(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[23] = iArr;
        return new int[i2];
    }

    public static int[] A1U(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[24] = iArr;
        return new int[i2];
    }

    public static int[] A1V(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[27] = iArr;
        return new int[i2];
    }

    public static int[] A1W(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[28] = iArr;
        return new int[i2];
    }

    public static int[] A1X(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[29] = iArr;
        return new int[i2];
    }

    public static int[] A1Y(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[31] = iArr;
        return new int[i2];
    }

    public static int[] A1Z(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[32] = iArr;
        return new int[i2];
    }

    public static int[] A1a(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[36] = iArr;
        return new int[i2];
    }

    public static String[] A1b(Object obj) {
        return new String[]{obj};
    }

    public static float A00(int i) {
        return i != 0 ? 0.0f : 1.0f;
    }

    public static int A03(AnonymousClass1FU r2) {
        return C18020vd.A00(C18040vf.A02, r2.A0E, 2614);
    }

    public static int A04(C28931bI r1) {
        if (r1 != null) {
            r1.A04(8);
        }
        return 8;
    }

    public static long A05(Intent intent, String str) {
        return intent.getLongExtra(str, -1);
    }

    public static long A06(Intent intent, String str) {
        return intent.getLongExtra(str, 0);
    }

    public static AnonymousClass74J A0G(TextStatusComposerFragment textStatusComposerFragment) {
        AnonymousClass00H r0 = textStatusComposerFragment.A11;
        if (r0 != null) {
            return (AnonymousClass74J) r0.get();
        }
        C18070vi.A11("expressionsTrayController");
        throw null;
    }

    public static AnonymousClass73N A0M(MusicEditorDialog musicEditorDialog) {
        AnonymousClass00H r0 = musicEditorDialog.A0H;
        if (r0 != null) {
            return (AnonymousClass73N) r0.get();
        }
        C18070vi.A11("musicPlayer");
        throw null;
    }

    public static AnonymousClass1L4 A0P(AnonymousClass10G r0) {
        return (AnonymousClass1L4) r0.A2e.get();
    }

    public static C133456om A0Q(WfacBanBaseFragment wfacBanBaseFragment) {
        AnonymousClass00H r0 = wfacBanBaseFragment.A0A;
        if (r0 != null) {
            return (C133456om) r0.get();
        }
        C18070vi.A11("wfacLogger");
        throw null;
    }

    public static Class A0R(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static Long A0X() {
        return 1L;
    }

    public static String A0c(Uri uri, C26521Sl r2) {
        return C26511Sk.A0M(uri, r2.A01.A0O());
    }

    public static String A0d(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C18070vi.A0X(lowerCase);
        return lowerCase;
    }

    public static String A0e(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        C18070vi.A0X(upperCase);
        return upperCase;
    }

    public static String A0f(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public static Map A0h(Object obj, Object obj2) {
        return C200610r.A04(new AnonymousClass1D6(obj, obj2));
    }

    public static C71053Dp A0k(C30391dr r1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C71053Dp.A01;
        return new C71053Dp(C30581eB.A02(r1));
    }

    public static void A0q(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A0r(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static void A0s(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static void A0z(C192519oX r1, A7K a7k, String str) {
        a7k.A00.A02().A06(r1, str);
    }

    public static boolean A1E(AnonymousClass1FU r2) {
        return C18020vd.A05(C18040vf.A02, r2.A0E, 8826);
    }

    public static boolean A1F(WaDialogFragment waDialogFragment) {
        return C18020vd.A05(C18040vf.A02, waDialogFragment.A02, 8616);
    }

    public static boolean A1L(Object obj, Object obj2) {
        return C18070vi.A18(obj2, ((C22841Dk) obj).BS6());
    }

    public static boolean A1M(String str) {
        return new File(str).exists();
    }

    public static byte[] A1O(String str) {
        byte[] bytes = str.getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        return bytes;
    }

    public static int A02(AnonymousClass1DS r0) {
        return ((List) r0.A06()).size();
    }

    public static long A07(AnonymousClass00H r1) {
        return ((AnonymousClass11Z) r1.get()).A01();
    }

    public static BitmapDrawable A08(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static Uri A09(List list, int i) {
        return ((AnonymousClass8B2) list.get(i)).BLl();
    }

    public static TextPaint A0A(TextView textView, Object obj) {
        C18070vi.A0X(obj);
        TextPaint paint = textView.getPaint();
        C18070vi.A0X(paint);
        return paint;
    }

    public static ImageView A0B(View view, int i) {
        View findViewById = view.findViewById(i);
        C18070vi.A0X(findViewById);
        return (ImageView) findViewById;
    }

    public static TextView A0C(View view) {
        return (TextView) view.findViewById(2131436208);
    }

    public static C140026zp A0D(AnonymousClass1DS r0) {
        Object A06 = r0.A06();
        C18070vi.A0b(A06);
        return (C140026zp) A06;
    }

    public static C32071ga A0E(AnonymousClass00H r0) {
        return ((C24771Lp) r0.get()).A03();
    }

    public static C28781at A0F(AnonymousClass00H r0) {
        return ((C24801Ls) r0.get()).get();
    }

    public static C139496yw A0H(AnonymousClass00H r0) {
        Object obj = r0.get();
        C18070vi.A0X(obj);
        return (C139496yw) obj;
    }

    public static C129006h6 A0I(AnonymousClass00H r0, String str, X509Certificate x509Certificate) {
        return ((A0V) r0.get()).A01(str, x509Certificate);
    }

    public static C19993A2g A0J(AnonymousClass5WY r1, AnonymousClass00H r2) {
        return ((AnonymousClass1PY) r2.get()).A01(r1);
    }

    public static C1418477e A0K(C122646Re r1, AnonymousClass00H r2) {
        return ((WfalManager) r2.get()).A03(r1);
    }

    public static C136936ue A0L(AnonymousClass00H r0) {
        Object obj = r0.get();
        C18070vi.A0X(obj);
        return (C136936ue) obj;
    }

    public static A8V A0N(SendSmsToWa sendSmsToWa) {
        return (A8V) sendSmsToWa.A4c().get();
    }

    public static AnonymousClass129 A0O(AnonymousClass10E r0) {
        return (AnonymousClass129) r0.A4I.get();
    }

    public static Integer A0S(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 2;
    }

    public static Integer A0T(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 3;
    }

    public static Integer A0U(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 25;
    }

    public static Integer A0V(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 30;
    }

    public static Integer A0W(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 31;
    }

    public static Long A0Y(List list) {
        return Long.valueOf((long) list.size());
    }

    public static Object A0a(C18100vl r0) {
        return ((AnonymousClass1DS) r0.getValue()).A06();
    }

    public static ArrayList A0g(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static AnonymousClass1D6 A0i(Object obj, boolean z) {
        return new AnonymousClass1D6(obj, Boolean.valueOf(z));
    }

    public static JSONObject A0l(C129006h6 r0, A0V a0v, PrivateKey privateKey) {
        return new JSONObject(a0v.A02(r0, privateKey));
    }

    public static void A0n(Context context, DialogInterface.OnClickListener onClickListener, C73203Rj r3, int i) {
        r3.A00.A0J(onClickListener, context.getString(i));
    }

    public static void A0o(Bitmap bitmap, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(bitmap.getWidth());
    }

    public static void A0t(View view, int i) {
        view.findViewById(i).setVisibility(8);
    }

    public static void A0u(View view, int i) {
        view.setVisibility(i);
        view.setAlpha(1.0f);
    }

    public static void A0v(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A0x(ImageView imageView, int i) {
        imageView.setBackgroundColor(i);
        imageView.setImageDrawable((Drawable) null);
    }

    public static void A10(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 12);
    }

    public static void A11(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 25);
    }

    public static void A13(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (C18070vi.A18(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A14(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(':');
    }

    public static void A15(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A16(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(true);
    }

    public static void A17(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((String) null);
    }

    public static void A18(C18100vl r0) {
        ((C37451pZ) r0.getValue()).A02();
    }

    public static boolean A1H(AnonymousClass00H r2) {
        return C18020vd.A05(C18040vf.A01, ((C24641Lc) r2.get()).A01, 7436);
    }

    public static boolean A1I(AnonymousClass00H r0) {
        return ((C27021Uk) r0.get()).A01();
    }
}
