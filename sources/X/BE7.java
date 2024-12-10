package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.StringTreeSet;
import com.google.android.recaptcha.internal.zzez;
import com.google.android.recaptcha.internal.zzjd;
import com.google.android.recaptcha.internal.zzje;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.apache.xml.security.signature.XMLSignatureException;

public abstract class BE7 {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static float A01(float f, float f2) {
        return (f * f2) / 100.0f;
    }

    public static int A03(double d, double d2) {
        return (int) Math.ceil(d / d2);
    }

    public static long A0C(int i) {
        return ((long) i) & 4294967295L;
    }

    public static C20046A4p A0Q(Object obj) {
        C20046A4p a4p = new C20046A4p();
        a4p.A03(obj, 0);
        return a4p;
    }

    public static Float A0W() {
        return Float.valueOf(0.0f);
    }

    public static Integer A0Z() {
        return -1;
    }

    public static String A0j(C18000vb r3, int i) {
        return C64052u8.A0D(r3, (String) null, (long) i);
    }

    public static String A0o(String str, Object[] objArr) {
        return String.format((Locale) null, str, objArr);
    }

    public static StringBuilder A0q(int i, int i2) {
        return new StringBuilder(i + i2);
    }

    public static CountDownLatch A0u() {
        return new CountDownLatch(1);
    }

    public static AtomicInteger A0v() {
        return new AtomicInteger(0);
    }

    public static void A12(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) i3;
    }

    public static void A13(RectF rectF, float f, int i) {
        rectF.set(0.0f, 0.0f, f, (float) i);
    }

    public static void A1F(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static void A1G(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
    }

    public static boolean A1X(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        return true;
    }

    public static Object[] A1b(Object obj) {
        return new Object[]{obj};
    }

    public static int A04(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A05(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int A06(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int A07(Object obj) {
        return ((Number) obj).intValue() & 3;
    }

    public static int A09(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 8);
    }

    public static int A0A(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 16);
    }

    public static int A0B(Object[] objArr, Object[] objArr2, int i, int i2) {
        int i3 = i2 + 1;
        objArr2[i + 1] = objArr[i2];
        return i3;
    }

    public static TextView A0H(Object obj) {
        TextView textView = (TextView) obj;
        C18070vi.A0d(textView, 1);
        return textView;
    }

    public static zzjd A0J() {
        return new zzjd("Protocol message tag had invalid wire type.");
    }

    public static zzje A0K() {
        return new zzje("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzje A0L() {
        return new zzje("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static AnonymousClass1PN A0M() {
        return new AnonymousClass1PN("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static AnonymousClass1PN A0N() {
        return new AnonymousClass1PN("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static DFL A0O(DFL dfl) {
        return dfl.A09(35);
    }

    public static DFL A0P(DFL dfl) {
        return dfl.A09(132);
    }

    public static C25618Ciy A0S(C17130tn r1) {
        return (C25618Ciy) r1.BFh(CGA.A00);
    }

    public static AnonymousClass2I3 A0T(Object obj) {
        AnonymousClass2I3 r1 = (AnonymousClass2I3) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static Class A0U(Class cls, String str, Class[] clsArr, int i) {
        Class cls2 = Long.TYPE;
        clsArr[i] = cls2;
        cls.getMethod(str, clsArr);
        return cls2;
    }

    public static IllegalArgumentException A0X() {
        return new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static Integer A0Y() {
        return -100;
    }

    public static NullPointerException A0a() {
        return new NullPointerException("zza");
    }

    public static String A0d(DFL dfl) {
        return dfl.A0D(35);
    }

    public static String A0e(DFL dfl) {
        return dfl.A0D(36);
    }

    public static String A0f(DFL dfl) {
        return dfl.A0D(38);
    }

    public static String A0g(DFL dfl) {
        return dfl.A0D(40);
    }

    public static String A0h(DFL dfl) {
        return dfl.A0D(41);
    }

    public static String A0i(DFL dfl) {
        return dfl.A0D(42);
    }

    public static Set A0t(C25996CqC cqC) {
        return (Set) cqC.A01.getValue();
    }

    public static C108935cY A0x(zzez zzez) {
        C108935cY r0 = zzez.zzb;
        if (r0 == null) {
            return null;
        }
        return r0;
    }

    public static XMLSignatureException A0y(Exception exc) {
        return new XMLSignatureException("empty", exc);
    }

    public static void A0z(int i, Parcel parcel) {
        parcel.writeInt(i | 262144);
    }

    public static void A15(EGLDisplay eGLDisplay) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    public static void A19(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C21471Akc(obj, obj2, i));
    }

    public static void A1A(C16890tO r1, C05050Qf r2) {
        r2.A0L(new AnonymousClass0Ij(r1, r2));
    }

    public static void A1D(AnonymousClass2I0 r1, Class cls) {
        r1.A01 = new AnonymousClass20F(cls);
    }

    public static void A1T(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128);
    }

    public static void A1U(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i & 63) | 128);
    }

    public static byte[] A1Z(Object obj, int i, int i2) {
        byte[] bArr = new byte[i];
        System.arraycopy(obj, i2, bArr, 0, i);
        return bArr;
    }

    public static byte[] A1a(String str) {
        return Base64.decode(str, 11);
    }

    public static float A02(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static int A08(List list) {
        C18070vi.A0X(list);
        return list.size();
    }

    public static Rect A0D(View view) {
        return ((C38491rN) view.getLayoutParams()).A03;
    }

    public static Drawable A0E(Drawable drawable) {
        return C27831Xu.A02(drawable).mutate();
    }

    public static Drawable A0F(View view, int i) {
        return AnonymousClass03S.A01(view.getContext(), i);
    }

    public static Looper A0G(HandlerThread handlerThread) {
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static C25092CXd A0I(E7q e7q, File file) {
        return e7q.BKv(Uri.fromFile(file));
    }

    public static C199029zJ A0R(C20046A4p a4p, Object obj, int i) {
        a4p.A03(obj, i);
        return a4p.A02();
    }

    public static Class A0V(ClassLoader classLoader, String str) {
        Class<?> loadClass = classLoader.loadClass(str);
        C18070vi.A0X(loadClass);
        return loadClass;
    }

    public static Object A0b(CKJ ckj, C25971Cpe cpe) {
        Object A04 = cpe.A04(ckj);
        C28111Yx.A02(A04);
        return A04;
    }

    public static Object A0c(AnonymousClass10E r0) {
        return r0.ABA.get();
    }

    public static String A0k(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static String A0l(Class cls) {
        return String.valueOf(cls.getName());
    }

    public static String A0m(String str, Object obj) {
        return str.concat(String.valueOf(obj));
    }

    public static String A0n(String str, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static String A0p(Throwable th) {
        return th.getCause().getMessage();
    }

    public static List A0r(DFL dfl) {
        List A0E = dfl.A0E();
        C18070vi.A0X(A0E);
        return A0E;
    }

    public static List A0s(DFL dfl, int i) {
        List A0G = dfl.A0G(i);
        C18070vi.A0X(A0G);
        return A0G;
    }

    public static Logger A0w(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A10(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
    }

    public static void A11(int i, List list) {
        list.add(Integer.valueOf(i));
    }

    public static void A14(CaptureRequest.Builder builder, CaptureRequest.Key key, int i) {
        builder.set(key, Integer.valueOf(i));
    }

    public static void A16(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A17(Handler handler, C26381Cyh cyh, Object obj, int i) {
        C26381Cyh.A08(handler.obtainMessage(i, obj), cyh);
    }

    public static void A18(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A1B(C27801Xq r1) {
        r1.onStateChange(r1.getState());
    }

    public static void A1C(C27801Xq r1, int i) {
        r1.A0F(ColorStateList.valueOf(i));
    }

    public static void A1E(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A1H(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(f));
    }

    public static void A1I(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, String.valueOf(j));
    }

    public static void A1J(Object obj, Map map, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static void A1K(String str, String str2, String str3) {
        Log.e(str3, str.concat(str2));
    }

    public static void A1L(String str, String str2, Object[] objArr) {
        Log.d(str2, String.format(str, objArr));
    }

    public static void A1M(String str, String str2, Object[] objArr) {
        Log.w(str2, String.format(str, objArr));
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(": ");
    }

    public static void A1O(StringBuilder sb, E9Y e9y) {
        sb.append(e9y.BMl());
    }

    public static void A1P(Buffer buffer) {
        buffer.position(buffer.limit());
    }

    public static void A1Q(AbstractCollection abstractCollection, float f) {
        abstractCollection.add(Float.valueOf(f));
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(it.next());
    }

    public static void A1S(List list, long j) {
        list.add(Long.valueOf(j));
    }

    public static boolean A1V(C17130tn r0, Object obj, int i) {
        r0.COB(i);
        return r0.BEh(obj);
    }

    public static boolean A1W(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }

    public static boolean A1Y(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }
}
