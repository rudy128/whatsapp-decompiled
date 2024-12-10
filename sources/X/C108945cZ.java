package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.bot.home.AiHomeViewModel;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.Reference;
import java.security.MessageDigest;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5cZ  reason: invalid class name and case insensitive filesystem */
public abstract class C108945cZ {
    public static float A00(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static float A01(float f, float f2, float f3) {
        return Math.min(f3, f / f2);
    }

    public static float A02(int i) {
        return ((float) i) / 2.0f;
    }

    public static int A05(int i, int i2) {
        return Math.abs(i - i2);
    }

    public static Long A1B(long j, long j2) {
        return Long.valueOf(j - j2);
    }

    public static float[] A1V() {
        return new float[2];
    }

    public static int[] A1W() {
        return new int[2];
    }

    public static int[] A1X(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[0] = iArr;
        return new int[i2];
    }

    public static int[] A1Y(int[] iArr, Object[] objArr, int i, int i2) {
        iArr[0] = i;
        objArr[i2] = iArr;
        return new int[i2];
    }

    public static Animator[] A1Z(Object obj, Object obj2, int i, int i2) {
        Animator[] animatorArr = new Animator[i];
        animatorArr[i2] = obj;
        animatorArr[1] = obj2;
        return animatorArr;
    }

    public static Object[] A1a(Object obj, Object obj2, int i, int i2) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        objArr[i2] = obj2;
        return objArr;
    }

    public static int A07(TabLayout tabLayout) {
        return tabLayout.A0h.size();
    }

    public static int A08(C20287AEv aEv) {
        return aEv.A0A.size();
    }

    public static AnimatorSet A0B() {
        return new AnimatorSet();
    }

    public static ObjectAnimator A0C(Property property, Object obj, float[] fArr, float f, int i) {
        fArr[i] = f;
        return ObjectAnimator.ofFloat(obj, property, fArr);
    }

    public static Context A0D(C42011xT r0) {
        return r0.A0H.getContext();
    }

    public static Context A0E(AnonymousClass118 r0) {
        Context context = r0.A00;
        C18070vi.A0X(context);
        return context;
    }

    public static Intent A0G(String str) {
        return new Intent(str);
    }

    public static Bitmap A0H(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Canvas A0I(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    public static Matrix A0J() {
        return new Matrix();
    }

    public static Paint A0K(int i) {
        return new Paint(i);
    }

    public static Path A0L() {
        return new Path();
    }

    public static Pair A0N(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static C22801Dg A0R() {
        return new C22801Dg();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1DT, X.1DS] */
    public static AnonymousClass1DT A0S() {
        return new AnonymousClass1DS();
    }

    public static C21159AfU A0W(Object obj, int i) {
        return new C21159AfU(obj, i);
    }

    public static C70583Br A0X(Object obj, int i) {
        return new C70583Br(obj, i);
    }

    public static AnonymousClass206 A0s(AnonymousClass205 r1, AnonymousClass1W6 r2) {
        return r2.A01.A05(r1);
    }

    public static C29591cX A0t(String str) {
        return new C29591cX(str);
    }

    public static AnonymousClass00H A14(AnonymousClass10E r0) {
        return C000200d.A00(r0.A0n);
    }

    public static ByteArrayOutputStream A15() {
        return new ByteArrayOutputStream();
    }

    public static File A16(AnonymousClass118 r0) {
        return r0.A00.getCacheDir();
    }

    public static File A17(String str) {
        return new File(str);
    }

    public static FileInputStream A18(File file) {
        return new FileInputStream(file);
    }

    public static FileOutputStream A19(File file) {
        return new FileOutputStream(file);
    }

    public static Boolean A1A(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static MessageDigest A1I() {
        return MessageDigest.getInstance("SHA-256");
    }

    public static AnonymousClass1IU A1J(Throwable th) {
        return new AnonymousClass1IU(th);
    }

    public static C147977gh A1K(Object obj, int i) {
        return new C147977gh(obj, i);
    }

    public static void A1L(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A1N(C29621ca r1) {
        C29621ca.A04(r1, "iq");
    }

    public static void A1P(Object obj) {
        ((Runnable) obj).run();
    }

    public static void A1Q(Object obj) {
        ((C18090vk) obj).invoke();
    }

    public static boolean A1S(AnonymousClass205 r0) {
        return C22971Dz.A0a(r0.A00);
    }

    public static boolean A1T(A34 a34) {
        return a34.A02.isCancelled();
    }

    public static Object[] A1b(Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return Arrays.copyOf(objArr, i2);
    }

    public static float A03(View view) {
        return (float) view.getWidth();
    }

    public static float A04(View view) {
        return (float) view.getHeight();
    }

    public static int A06(View view) {
        return view.getHeight() / 2;
    }

    public static int A09(String str, int i) {
        return i + str.hashCode();
    }

    public static int A0A(List list, int i) {
        return i + list.size();
    }

    public static Context A0F(Reference reference) {
        return (Context) reference.get();
    }

    public static Uri A0M(Iterator it) {
        return (Uri) it.next();
    }

    public static View A0O(Reference reference) {
        return (View) reference.get();
    }

    public static FrameLayout A0P(View view, int i) {
        return (FrameLayout) AnonymousClass1HF.A06(view, i);
    }

    public static AnonymousClass1DS A0Q(C18100vl r0) {
        return (AnonymousClass1DS) r0.getValue();
    }

    public static AnonymousClass1FD A0T(C18100vl r0) {
        return (AnonymousClass1FD) r0.getValue();
    }

    public static RecyclerView A0U(View view, int i) {
        return (RecyclerView) AnonymousClass1HF.A06(view, i);
    }

    public static C20125A8k A0V(Iterator it) {
        return (C20125A8k) it.next();
    }

    public static AnonymousClass1FU A0Y(Fragment fragment) {
        return (AnonymousClass1FU) fragment.A1D();
    }

    public static AnonymousClass1FU A0Z(Reference reference) {
        return (AnonymousClass1FU) reference.get();
    }

    public static AnonymousClass1KB A0a(AnonymousClass00H r0) {
        return (AnonymousClass1KB) r0.get();
    }

    public static AiHomeViewModel A0b(C18100vl r0) {
        return (AiHomeViewModel) r0.getValue();
    }

    public static C1408073d A0c(AnonymousClass00H r0) {
        return (C1408073d) r0.get();
    }

    public static A1P A0d(AnonymousClass00H r0) {
        return (A1P) r0.get();
    }

    public static A59 A0e(AnonymousClass00H r0) {
        return (A59) r0.get();
    }

    public static C34991lS A0f(AnonymousClass00H r0) {
        return (C34991lS) r0.get();
    }

    public static GalleryTabsViewModel A0g(C18100vl r0) {
        return (GalleryTabsViewModel) r0.getValue();
    }

    public static AnonymousClass1LU A0h(AnonymousClass00H r0) {
        return (AnonymousClass1LU) r0.get();
    }

    public static AnonymousClass1BI A0i(List list, int i) {
        return (AnonymousClass1BI) list.get(i);
    }

    public static C136906ub A0j(AnonymousClass00H r0) {
        return (C136906ub) r0.get();
    }

    public static C1409773u A0k(Iterator it) {
        return (C1409773u) it.next();
    }

    public static MediaViewOnceViewModel A0l(C18100vl r0) {
        return (MediaViewOnceViewModel) r0.getValue();
    }

    public static MetaAiVoiceViewModel A0m(C18100vl r0) {
        return (MetaAiVoiceViewModel) r0.getValue();
    }

    public static C111125iM A0n(C18100vl r0) {
        return (C111125iM) r0.getValue();
    }

    public static C27031Ul A0o(AnonymousClass00H r0) {
        return (C27031Ul) r0.get();
    }

    public static C136936ue A0p(AnonymousClass00H r0) {
        return (C136936ue) r0.get();
    }

    public static AnonymousClass70I A0q(AnonymousClass00H r0) {
        return (AnonymousClass70I) r0.get();
    }

    public static C135466sF A0r(AnonymousClass00H r0) {
        return (C135466sF) r0.get();
    }

    public static AnonymousClass727 A0u(AnonymousClass00H r0) {
        return (AnonymousClass727) r0.get();
    }

    public static C24641Lc A0v(AnonymousClass00H r0) {
        return (C24641Lc) r0.get();
    }

    public static C1193467t A0w(AnonymousClass00H r0) {
        return (C1193467t) r0.get();
    }

    public static C1418377d A0x(Iterator it) {
        return (C1418377d) it.next();
    }

    public static AnonymousClass725 A0y(Iterator it) {
        return (AnonymousClass725) it.next();
    }

    public static AnonymousClass72N A0z(AnonymousClass00H r0) {
        return (AnonymousClass72N) r0.get();
    }

    public static AnonymousClass73G A10(C18100vl r0) {
        return (AnonymousClass73G) r0.getValue();
    }

    public static C35511mM A11(AnonymousClass00H r0) {
        return (C35511mM) r0.get();
    }

    public static C41821x7 A12(AnonymousClass00H r0) {
        return (C41821x7) r0.get();
    }

    public static C30131dR A13(AnonymousClass00H r0) {
        return (C30131dR) r0.get();
    }

    public static Number A1C(AnonymousClass1DS r0) {
        return (Number) r0.A06();
    }

    public static Number A1D(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static Number A1E(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static String A1F(AnonymousClass1DS r0) {
        return (String) r0.A06();
    }

    public static String A1G(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A1H(AbstractList abstractList, int i) {
        return (String) abstractList.get(i);
    }

    public static void A1M(C47192Hl r1, int i) {
        r1.A02 = Integer.valueOf(i);
    }

    public static void A1O(C1418377d r1, File file) {
        r1.A0B = file.getAbsolutePath();
    }

    public static void A1R(String str, float[] fArr, Object[] objArr, int i) {
        objArr[i] = PropertyValuesHolder.ofFloat(str, fArr);
    }

    public static boolean A1U(Set set) {
        return !set.isEmpty();
    }
}
