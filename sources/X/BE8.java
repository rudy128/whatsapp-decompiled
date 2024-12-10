package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzcj;
import com.google.android.recaptcha.internal.zzhi;
import com.google.android.recaptcha.internal.zzkh;
import com.google.android.recaptcha.internal.zzpq;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import org.w3c.dom.Node;
import org.whispersystems.curve25519.JavaCurve25519Provider;

public abstract class BE8 {
    public static int A03(float f, float f2) {
        return (int) Math.ceil((double) (f * f2));
    }

    public static int A04(int i, int i2) {
        return Math.max(0, i - i2);
    }

    public static int A08(int i, int i2, int i3) {
        return ((i2 ^ -1) & i3) | (i & i2);
    }

    public static long A0F(long j, long j2) {
        return (j * j2) / SearchActionVerificationClientService.MS_TO_NS;
    }

    public static zzae A0P() {
        return new zzae(4, 3, (Throwable) null);
    }

    public static zzae A0Q() {
        return new zzae(4, 5, (Throwable) null);
    }

    public static WeakReference A0m() {
        return new WeakReference((Object) null);
    }

    public static C26135Csy A0t() {
        return new C26135Csy(2);
    }

    public static void A0v(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    public static void A1M(Object[] objArr, int i) {
        objArr[2] = Integer.valueOf(i);
    }

    public static void A1N(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
    }

    public static boolean A1S(int i) {
        return i != 0;
    }

    public static boolean A1T(int i) {
        return i == 1;
    }

    public static boolean A1U(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1V(Parcel parcel) {
        parcel.writeInt(1);
        return false;
    }

    public static float A02(int[] iArr, float f, int i) {
        return Math.abs(f - ((float) iArr[i]));
    }

    public static int A05(int i, int i2) {
        return ((i << 28) + (i2 + 112)) >> 30;
    }

    public static int A09(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A0A(C04240Mk r0) {
        return r0.A03.A03.height();
    }

    public static int A0B(C04240Mk r0) {
        return r0.A03.A03.width();
    }

    public static long A0I(Object[] objArr, int i) {
        return objArr[i].longValue();
    }

    public static Bitmap A0J(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C18070vi.A0X(createBitmap);
        return createBitmap;
    }

    public static D3X A0L(C26539D3a d3a, int i) {
        return (D3X) d3a.A02.get(i);
    }

    public static C25107CYb A0M(Object obj) {
        C25107CYb cYb = (C25107CYb) obj;
        C18070vi.A0d(cYb, 0);
        return cYb;
    }

    public static D40 A0N(C26378Cye cye) {
        return (D40) cye.A0J.get();
    }

    public static C5T A0S(C25989Cq4 cq4, List list) {
        return (C5T) list.get(cq4.A00);
    }

    public static AnonymousClass2I0 A0T(Object obj) {
        AnonymousClass2I0 r1 = (AnonymousClass2I0) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static Object A0b(zzcj zzcj, zzpq[] zzpqArr, int i) {
        return zzcj.zze.zza(zzpqArr[i]);
    }

    public static Object A0c(C26299CxC cxC) {
        return cxC.A05[cxC.A01 - 1];
    }

    public static StringBuffer A0i(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer;
    }

    public static StringBuilder A0j(StringBuilder sb) {
        sb.append(10);
        return new StringBuilder();
    }

    public static Throwable A0l(Throwable th) {
        return new NoClassDefFoundError().initCause(th);
    }

    public static Map.Entry A0p(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C18070vi.A0d(entry, 0);
        return entry;
    }

    public static Map A0q() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static Set A0r(Object obj, Object obj2, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        objArr[i2] = obj2;
        return C200410p.A0S(objArr);
    }

    public static AnonymousClass5Af A0s(C17130tn r1, Object obj, int i) {
        AnonymousClass5Af r0 = new AnonymousClass5Af(obj, i);
        r1.CRH(r0);
        return r0;
    }

    public static AnonymousClass1C0 A0u(String str) {
        return new AnonymousClass1C0(str).A0K();
    }

    public static void A0x(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A10(zzhi zzhi, int i) {
        zzhi.zza.zzq((i << 3) | 2);
    }

    public static void A11(C36241nZ r0, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A2o = C000200d.A00(r0.A1d);
    }

    public static void A12(Appendable appendable, int i) {
        appendable.append("0123456789ABCDEF".charAt(i & 15));
    }

    public static void A1A(Object obj, Object[] objArr, int i, int i2, int i3) {
        objArr[i] = obj;
        objArr[i3] = Integer.valueOf(i2);
    }

    public static void A1B(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C26008CqP(str, str2));
    }

    public static void A1H(Charset charset, List list, byte[] bArr, int i, int i2) {
        list.add(new String(bArr, i, i2, charset));
    }

    public static void A1I(byte[] bArr, byte[] bArr2, int i) {
        bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
    }

    public static boolean A1R() {
        return C26294Cx6.A01.BfN(6);
    }

    public static boolean A1W(DRB drb) {
        return C18020vd.A05(C18040vf.A02, drb.A0C, 2831);
    }

    public static float A00(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static int A06(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static int A07(int i, int i2, int i3) {
        return Math.max(i3, Math.min(i, i2));
    }

    public static int A0C(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A0D(Matcher matcher, int i) {
        return Integer.parseInt(matcher.group(i));
    }

    public static long A0E(long j, long j2) {
        return Util.A06(j, SearchActionVerificationClientService.MS_TO_NS, j2);
    }

    public static long A0G(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A00(bArr, i) >>> i2) & 2097151;
    }

    public static long A0H(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A01(bArr, i) >>> i2) & 2097151;
    }

    public static Bundle A0K(Parcel parcel, Class cls) {
        return parcel.readBundle(cls.getClassLoader());
    }

    public static RecaptchaException A0O(RecaptchaErrorCode recaptchaErrorCode) {
        return new RecaptchaException(recaptchaErrorCode, recaptchaErrorCode.getErrorMessage());
    }

    public static DFL A0R(Iterator it) {
        DFL dfl = (DFL) it.next();
        C18070vi.A0b(dfl);
        return dfl;
    }

    public static ArrayIndexOutOfBoundsException A0U(String str, Object[] objArr) {
        return new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static Boolean A0V(Object obj, Set set) {
        return Boolean.valueOf(set.contains(obj));
    }

    public static IllegalArgumentException A0W(Object obj) {
        return new IllegalArgumentException(String.valueOf(obj));
    }

    public static IllegalArgumentException A0X(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalStateException A0Y(String str, Object[] objArr) {
        return new IllegalStateException(String.format(str, objArr));
    }

    public static Integer A0Z(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static Integer A0a(byte[] bArr) {
        return Integer.valueOf(Arrays.hashCode(bArr));
    }

    public static Object A0d(AnonymousClass10E r0) {
        return r0.A3d.get();
    }

    public static Object A0e(Object obj, Object obj2, Map map) {
        Object obj3 = map.get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public static RuntimeException A0f(Object obj) {
        return new RuntimeException(obj.toString());
    }

    public static String A0g(C25038CUr cUr, DSS dss) {
        byte[] A04 = dss.A04();
        return cUr.A00(A04, A04.length);
    }

    public static String A0h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Thread A0k() {
        return Looper.getMainLooper().getThread();
    }

    public static ArrayList A0n(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        return new ArrayList();
    }

    public static List A0o(zzkh zzkh, Object obj, int i) {
        return zzkh.zzm.zza(obj, (long) (i & 1048575));
    }

    public static void A0w(Canvas canvas, Paint paint, Path path, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.drawPath(path, paint);
    }

    public static void A0y(C17130tn r1, AnonymousClass04D r2, Object obj, Object obj2) {
        r2.invoke(obj, r1, obj2);
        r1.COB(2058660585);
    }

    public static void A0z(C26138Ct1 ct1, long j) {
        ct1.A04(System.nanoTime() - j);
    }

    public static void A13(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A14(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A15(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 3;
    }

    public static void A16(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 4;
    }

    public static void A17(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 5;
    }

    public static void A18(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 6;
    }

    public static void A19(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 7;
    }

    public static void A1C(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("x");
    }

    public static void A1D(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(", ");
    }

    public static void A1E(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('=');
    }

    public static void A1F(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(0);
    }

    public static void A1G(Buffer buffer, int i) {
        buffer.position(buffer.position() + i);
    }

    public static void A1J(Object[] objArr, float f) {
        objArr[1] = Float.valueOf(f);
    }

    public static void A1K(Object[] objArr, float f) {
        objArr[2] = Float.valueOf(f);
    }

    public static void A1L(Object[] objArr, int i) {
        objArr[12] = Integer.valueOf(i);
    }

    public static void A1O(Object[] objArr, boolean z) {
        objArr[1] = Boolean.valueOf(z);
    }

    public static void A1P(Object[] objArr, boolean z) {
        objArr[3] = Boolean.valueOf(z);
    }

    public static void A1Q(Object[] objArr, boolean z) {
        objArr[4] = Boolean.valueOf(z);
    }

    public static boolean A1X(CharSequence charSequence, char c, int i) {
        return Character.isSurrogatePair(c, charSequence.charAt(i));
    }

    public static boolean A1Y(Object obj, List list, int i) {
        return obj.equals(list.get(i));
    }

    public static boolean A1Z(String str, String str2) {
        return str2.equals(C26233CvQ.A04(str));
    }

    public static boolean A1a(String str, Node node) {
        return str.equals(node.getNamespaceURI());
    }

    public static boolean A1b(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
        return false;
    }
}
