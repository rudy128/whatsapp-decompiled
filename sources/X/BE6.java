package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzhd;
import com.google.android.recaptcha.internal.zzhh;
import com.google.android.recaptcha.internal.zzik;
import com.google.android.recaptcha.internal.zzin;
import com.google.android.recaptcha.internal.zzit;
import com.google.android.recaptcha.internal.zzje;
import com.google.android.recaptcha.internal.zzjf;
import com.google.android.recaptcha.internal.zzke;
import com.google.android.recaptcha.internal.zzkp;
import com.google.android.recaptcha.internal.zzkt;
import com.google.android.recaptcha.internal.zzl;
import com.google.android.recaptcha.internal.zzn;
import com.google.android.recaptcha.internal.zzp;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.X509Certificate;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class BE6 {
    public static byte A00(int i, long j, long j2) {
        return (byte) ((int) (j2 | (j << i)));
    }

    public static double A01(double d, double d2) {
        return Math.abs(d - d2);
    }

    public static int A04(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A06(int i, int i2) {
        return (i + i2) * 31 * 31;
    }

    public static int A09(int i, int i2, int i3) {
        return Math.min(i3, i - i2);
    }

    public static int A0A(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i;
        return i3 + 1;
    }

    public static int A0I(int[] iArr) {
        return iArr[0];
    }

    public static void A1B(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((int) (j >> i));
    }

    public static void A1D(C26378Cye cye, String str) {
        C26378Cye.A06(cye, str, new Object[0]);
    }

    public static void A1F(OutputStream outputStream, int i, int i2) {
        outputStream.write((byte) (i | i2));
    }

    public static void A1I(StringBuffer stringBuffer, long j, long j2) {
        stringBuffer.append((int) (j - j2));
    }

    public static void A1N(byte[] bArr, int i, int i2, int i3) {
        bArr[i3] = (byte) (i | i2);
    }

    public static void A1O(byte[] bArr, int i, int i2, int i3) {
        bArr[i3] = (byte) (i ^ i2);
    }

    public static int[] A1X() {
        return new int[1];
    }

    public static Object[] A1Z() {
        return new Object[0];
    }

    public static Object[] A1a() {
        return new Object[4];
    }

    public static float A03(float[] fArr, float f, float f2, int i) {
        return f2 + (fArr[i] * f);
    }

    public static int A05(int i) {
        return zzhh.zzy(i << 3);
    }

    public static int A08(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A0B(zzhd zzhd) {
        return zzhd.zza.zzd();
    }

    public static int A0C(zzhd zzhd) {
        return zzhd.zza.zzm();
    }

    public static int A0D(zzhd zzhd) {
        return zzhd.zza.zzn();
    }

    public static int A0F(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static int A0H(List list) {
        int i = zzkt.zza;
        return list.size();
    }

    public static int A0J(int[] iArr, int i, int i2, int i3) {
        return i3 + i2 + iArr[i];
    }

    public static int A0K(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i2] = i;
        int i5 = i3 ^ i;
        iArr[i4] = i5;
        return i5;
    }

    public static int A0L(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[i];
        return i + 1;
    }

    public static long A0N(long j, TimeUnit timeUnit) {
        return timeUnit.convert(j, TimeUnit.NANOSECONDS);
    }

    public static SparseArray A0Q() {
        return new SparseArray();
    }

    public static C26008CqP A0T(String str, String str2) {
        return new C26008CqP(str, str2);
    }

    public static zzae A0V(Throwable th, int i, int i2) {
        return new zzae(i, i2, th);
    }

    public static zzik A0W(zzjf zzjf, String str, int i, int i2) {
        return new zzik(str, i, i, i2, zzjf);
    }

    public static zzje A0Y(String str) {
        return new zzje(str);
    }

    public static zzkp A0Z(zzke zzke, String str, Object[] objArr) {
        return new zzkp(zzke, str, objArr);
    }

    public static zzl A0a(int i) {
        return new zzl(i);
    }

    public static zzp A0b(zzl zzl, zzn zzn, String str) {
        return new zzp(zzn, zzl, str);
    }

    public static AnonymousClass1PN A0c(String str) {
        return new AnonymousClass1PN(str);
    }

    public static ByteArrayInputStream A0h(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static EOFException A0i() {
        return new EOFException();
    }

    public static IllegalArgumentException A0j() {
        return new IllegalArgumentException();
    }

    public static IllegalStateException A0k() {
        return new IllegalStateException();
    }

    public static IndexOutOfBoundsException A0l(String str) {
        return new IndexOutOfBoundsException(str);
    }

    public static NullPointerException A0m() {
        return new NullPointerException();
    }

    public static Object A0n(C199029zJ r0, int i) {
        return r0.A00.get(i);
    }

    public static RuntimeException A0o(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static String A0p(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0q(Charset charset, byte[] bArr) {
        return new String(bArr, charset);
    }

    public static String A0r(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, charset);
    }

    public static StringBuffer A0s() {
        return new StringBuffer();
    }

    public static StringBuilder A0t(int i) {
        return new StringBuilder(i);
    }

    public static StringBuilder A0u(String str) {
        return new StringBuilder(str);
    }

    public static UnsupportedOperationException A0v(String str) {
        return new UnsupportedOperationException(str);
    }

    public static Constructor A0w(Class cls, Object obj, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getConstructor(clsArr);
    }

    public static Method A0x(Class cls, Object obj, String str, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getMethod(str, clsArr);
    }

    public static InvalidAlgorithmParameterException A0y(String str) {
        return new InvalidAlgorithmParameterException(str);
    }

    public static HashMap A10(Map map) {
        return new HashMap(map);
    }

    public static NoSuchElementException A14() {
        return new NoSuchElementException();
    }

    public static Set A15(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return C200410p.A0S(objArr);
    }

    public static AtomicBoolean A16(boolean z) {
        return new AtomicBoolean(z);
    }

    public static AnonymousClass1OY A18() {
        C18600wl r0 = C23871Hy.A00;
        return AnonymousClass1OW.A02(AnonymousClass1IN.A00);
    }

    public static AnonymousClass1C0 A19(String str) {
        return new AnonymousClass1C0(str);
    }

    public static void A1A(int i, int i2, int[] iArr, int[] iArr2) {
        iArr2[i] = i2 + iArr[i];
    }

    public static void A1E(C26381Cyh cyh, String str, int i) {
        C26381Cyh.A0E(cyh, str, new Object[i]);
    }

    public static void A1G(Appendable appendable, char[] cArr, int i) {
        appendable.append(cArr[i]);
    }

    public static void A1J(StringBuilder sb) {
        sb.append(" ");
    }

    public static void A1K(StringBuilder sb) {
        sb.append(",");
    }

    public static void A1P(byte[] bArr, byte[] bArr2, int i, int i2) {
        bArr2[i2] = bArr[i];
    }

    public static void A1Q(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr2[i3] = (byte) (i2 ^ bArr[i]);
    }

    public static void A1R(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static boolean A1U(zzhd zzhd) {
        return zzhd.zza.zzC();
    }

    public static boolean A1V(String str) {
        return str.endsWith("%");
    }

    public static Class[] A1Y(Object obj, int i) {
        Class[] clsArr = new Class[i];
        clsArr[0] = Object.class;
        clsArr[1] = obj;
        return clsArr;
    }

    public static float A02(Rect rect) {
        return (float) rect.width();
    }

    public static int A07(int i, int i2, int i3) {
        return C28851b7.A03(i, i2, i3) - i2;
    }

    public static int A0E(Enum enumR, int[] iArr) {
        return iArr[enumR.ordinal()];
    }

    public static int A0G(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static long A0M(int i) {
        return (long) (i & 1048575);
    }

    public static long A0O(Object obj) {
        return (long) obj.hashCode();
    }

    public static Paint A0P(C18100vl r0) {
        return (Paint) r0.getValue();
    }

    public static View A0R(AbstractList abstractList, int i) {
        return (View) abstractList.get(i);
    }

    public static C25227CbO A0S(List list, int i) {
        return (C25227CbO) list.get(i);
    }

    public static C28613EAh A0U(Iterator it) {
        return (C28613EAh) it.next();
    }

    public static zzit A0X(zzin zzin) {
        zzin.zzm();
        return zzin.zza;
    }

    public static DFL A0d(Iterator it) {
        return (DFL) it.next();
    }

    public static C25621Cj1 A0e(C18100vl r0) {
        return (C25621Cj1) r0.getValue();
    }

    public static C23807Bpz A0f(C18100vl r0) {
        return (C23807Bpz) r0.getValue();
    }

    public static C26257Cw2 A0g(C17130tn r0, AnonymousClass0OI r1) {
        return (C26257Cw2) r0.BFh(r1);
    }

    public static X509Certificate A0z(List list, int i) {
        return (X509Certificate) list.get(i);
    }

    public static List A11(CKI cki, C25632CjI cjI) {
        return (List) cjI.A02(cki);
    }

    public static List A12(Object obj, long j) {
        return (List) C26277CwW.A03(obj, j);
    }

    public static List A13(Object obj, String str) {
        C18070vi.A0z(obj, str);
        return (List) obj;
    }

    public static C28244Du5 A17(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        return (C28244Du5) atomicReferenceFieldUpdater.get(obj);
    }

    public static void A1C(View view, Object[] objArr, int i, int i2) {
        objArr[i2] = view.findViewById(i);
    }

    public static void A1H(Object obj, Object[] objArr, int i) {
        objArr[i] = obj.toString();
    }

    public static void A1L(StringBuilder sb, Object[] objArr) {
        sb.append(Arrays.toString(objArr));
    }

    public static void A1M(Throwable th, Object[] objArr, int i) {
        objArr[i] = th.getMessage();
    }

    public static void A1S(Object[] objArr, byte b, int i) {
        objArr[i] = Byte.valueOf(b);
    }

    public static void A1T(Object[] objArr, float f, int i) {
        objArr[i] = Float.valueOf(f);
    }

    public static byte[] A1W(Object obj, Map map) {
        return (byte[]) map.get(obj);
    }

    public static String[] A1b(AnonymousClass1LB r0, Object obj, String str, int i) {
        r0.A03(str, obj);
        return new String[i];
    }
}
