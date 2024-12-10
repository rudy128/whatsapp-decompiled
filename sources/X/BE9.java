package X;

import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzcj;
import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzkr;
import com.google.android.recaptcha.internal.zzpq;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLException;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbTable;
import org.apache.xml.security.c14n.implementations.SymbMap;
import org.apache.xml.security.signature.XMLSignatureException;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class BE9 {
    public static double A00(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public static float A01(int i, int i2, int i3) {
        return ((float) (i - i2)) - (((float) i3) / 2.0f);
    }

    public static int A0K(byte[] bArr) {
        int length = bArr.length;
        return C26084Cs1.A00(length) + 1 + length;
    }

    public static long A0L(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static C25271CcJ A0Q(Collection collection) {
        return (C25271CcJ) new ArrayList(collection).get(0);
    }

    public static zzae A0S(int i) {
        return new zzae(4, i, (Throwable) null);
    }

    public static Integer A0g(C17130tn r2, AnonymousClass04D r3) {
        r3.invoke(new AnonymousClass0OT(r2), r2, 0);
        return 0;
    }

    public static Object A0m(Field[] fieldArr, int i) {
        Field field = fieldArr[i];
        field.setAccessible(true);
        return field.get((Object) null);
    }

    public static StringBuilder A0t(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        return sb;
    }

    public static Method A0v(Class cls, String str) {
        return cls.getMethod(str, new Class[]{Integer.TYPE});
    }

    public static XMLSignatureException A10(Throwable th, Object[] objArr) {
        objArr[1] = th.getLocalizedMessage();
        return new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr);
    }

    public static void A1N(float[] fArr, float f, float f2) {
        fArr[3] = f;
        fArr[4] = f2;
    }

    public static void A1O(Object[] objArr) {
        objArr[0] = "zzd";
        objArr[1] = "zze";
    }

    public static void A1P(Object[] objArr) {
        objArr[5] = "zzi";
        objArr[6] = "zzj";
    }

    public static boolean A1Q(int i) {
        return (i & 1) == 1;
    }

    public static float A02(C23518Bih bih, int i) {
        return bih.A0p.getResources().getDimension(i);
    }

    public static int A06(int i) {
        return (i << -8) | (i >>> 8);
    }

    public static int A07(int i, float f) {
        if (i != 0) {
            return Float.floatToIntBits(f);
        }
        return 0;
    }

    public static int A0C(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static long A0N(int[] iArr, int i) {
        return (long) (iArr[i + 1] & 1048575);
    }

    public static long A0O(int[] iArr, int i) {
        return (long) (iArr[i + 2] & 1048575);
    }

    public static EAC A0R(Object obj) {
        return C25659Cjp.A02.A00(obj.getClass());
    }

    public static zzkr A0T(Object obj) {
        return zzkn.zzb.zzb(obj.getClass());
    }

    public static EAO A0U(Object obj) {
        return C25661Cjr.A02.A00(obj.getClass());
    }

    public static C219718c A0b(String str, byte b) {
        return new C219718c(new SSLException(str), b);
    }

    public static C219718c A0c(String str, Throwable th, byte b) {
        return new C219718c(new SSLException(str, th), b);
    }

    public static C219718c A0d(Throwable th) {
        return new C219718c(new SSLException(th), (byte) 80);
    }

    public static Object A0k(zzcj zzcj, zzpq[] zzpqArr) {
        return zzcj.zze.zza(zzpqArr[0]);
    }

    public static String A0o(String str, String str2, int i) {
        if (i != 0) {
            return str.concat(str2);
        }
        return new String(str);
    }

    public static StringBuilder A0q() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        return sb;
    }

    public static StringBuilder A0r() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        return sb;
    }

    public static StringBuilder A0s(int i, char c) {
        StringBuilder sb = new StringBuilder(i);
        sb.append("Failed writing ");
        sb.append(c);
        return sb;
    }

    public static NameSpaceSymbEntry A0z(Object obj, NameSpaceSymbTable nameSpaceSymbTable) {
        SymbMap symbMap = nameSpaceSymbTable.a;
        return symbMap.b[symbMap.a(obj)];
    }

    public static AnonymousClass1Bz A12(AnonymousClass1Bx[] r0, int i) {
        return r0[i].CP9().A0E();
    }

    public static void A13() {
        if (AnonymousClass0O7.A01.A02()) {
            AnonymousClass0O7.A00();
        }
    }

    public static void A14(int i, int i2, char[] cArr, int i3) {
        cArr[i3] = (char) (((i & 31) << 6) | (i2 & 63));
    }

    public static void A18(C17130tn r1, Object obj, Object obj2) {
        AnonymousClass0EM.A00(r1, obj, C05030Qc.A02);
        AnonymousClass0EM.A00(r1, obj2, C05030Qc.A03);
    }

    public static void A1A(AnonymousClass2I3 r1, Class cls) {
        r1.A04 = new AnonymousClass20F(cls);
        r1.A03 = AnonymousClass00R.A01;
    }

    public static void A1B(Object obj, Object obj2, Object[] objArr) {
        objArr[10] = obj;
        objArr[11] = obj2;
    }

    public static void A1C(Object obj, Object obj2, Object[] objArr) {
        objArr[19] = obj;
        objArr[20] = obj2;
    }

    public static void A1D(Object obj, Object obj2, Object[] objArr) {
        objArr[65] = obj;
        objArr[66] = obj2;
    }

    public static void A1E(Object obj, Object obj2, Object[] objArr) {
        objArr[5] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1F(Object obj, Object obj2, Object[] objArr) {
        objArr[6] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1K(StringBuilder sb, int i) {
        sb.append("Length too large: ");
        sb.append(i);
        sb.append(i);
    }

    public static void A1L(CountDownLatch countDownLatch) {
        countDownLatch.await(5, TimeUnit.SECONDS);
    }

    public static int[] A1b(Object obj, int i, int i2) {
        int[] iArr = new int[((i / 2) + 1)];
        System.arraycopy(obj, 0, iArr, 0, i2);
        return iArr;
    }

    public static float A03(C23731Hk r0) {
        return ((Number) r0.get()).floatValue();
    }

    public static float A04(AbstractList abstractList, int i) {
        return ((Number) abstractList.get(i)).floatValue();
    }

    public static float A05(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A08(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A09(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0A(C17130tn r0, int i, int i2) {
        r0.CNR();
        if ((i & 4) != 0) {
            return i2 & -897;
        }
        return i2;
    }

    public static int A0B(CKI cki, C25632CjI cjI) {
        return ((Number) cjI.A02(cki)).intValue();
    }

    public static int A0D(Object obj, AbstractMap abstractMap) {
        return ((Number) abstractMap.get(obj)).intValue();
    }

    public static int A0E(Object obj, Map map) {
        return Integer.parseInt((String) map.get(obj));
    }

    public static int A0F(Object obj, Map map) {
        return ((Number) map.get(obj)).intValue();
    }

    public static int A0G(String str, int i, int i2) {
        return Integer.parseInt(str.substring(i, i2).trim());
    }

    public static int A0H(String str, StringBuilder sb, Object[] objArr, int i) {
        sb.append(str);
        int i2 = i + 1;
        sb.append(objArr[i]);
        return i2;
    }

    public static int A0I(AbstractList abstractList, int i) {
        return ((Number) abstractList.get(i)).intValue();
    }

    public static int A0J(Map.Entry entry) {
        return ((Number) entry.getValue()).intValue();
    }

    public static long A0M(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static C17090tj A0P(C17130tn r0, AnonymousClass0OI r1, C17090tj r2) {
        r0.BFh(r1);
        return AnonymousClass0Q7.A04(r2, 24.0f);
    }

    public static C199029zJ A0V(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C18070vi.A0X(singletonList);
        return new C199029zJ(singletonList);
    }

    public static AnonymousClass1VW A0W(AnonymousClass10E r0) {
        return (AnonymousClass1VW) r0.A2d.get();
    }

    public static AnonymousClass700 A0X(AnonymousClass10G r0) {
        return (AnonymousClass700) r0.AH6.get();
    }

    public static C27201Vd A0Y(AnonymousClass10E r0) {
        return (C27201Vd) r0.A2j.get();
    }

    public static AnonymousClass118 A0Z(AnonymousClass10E r0) {
        return (AnonymousClass118) r0.ABY.get();
    }

    public static AnonymousClass1LU A0a(AnonymousClass10E r0) {
        return (AnonymousClass1LU) r0.ABd.get();
    }

    public static IOException A0e(String str, StringBuilder sb) {
        sb.append(str);
        return new IOException(sb.toString());
    }

    public static Class A0f() {
        return Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    public static Integer A0h(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 11;
    }

    public static Integer A0i(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 12;
    }

    public static Object A0j(View view) {
        return view.getContext().getSystemService("input_method");
    }

    public static Object A0l(DOZ doz, DFL dfl) {
        Object A04 = C26272CwJ.A04(doz, dfl);
        C28111Yx.A02(A04);
        C18070vi.A0X(A04);
        return A04;
    }

    public static RuntimeException A0n(String str, StringBuilder sb) {
        sb.append(str);
        return new RuntimeException(sb.toString());
    }

    public static String A0p(String str, String str2, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static Throwable A0u(Throwable th) {
        if (th.getCause() != null) {
            return th.getCause();
        }
        return th;
    }

    public static ByteBuffer A0w(Image image, int i) {
        return image.getPlanes()[i].getBuffer();
    }

    public static X509Certificate A0x(CertPath certPath, int i) {
        return (X509Certificate) certPath.getCertificates().get(i);
    }

    public static ArrayList A0y(List list, int i) {
        return new ArrayList(list.size() + i);
    }

    public static JSONObject A11(JSONArray jSONArray) {
        return jSONArray.getJSONObject(jSONArray.length() - 1);
    }

    public static void A15(IInterface iInterface, Parcel parcel, String str) {
        parcel.writeInterfaceToken(str);
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void A16(View view, CharSequence charSequence) {
        if (view.getContentDescription() != charSequence) {
            view.setContentDescription(charSequence);
        }
    }

    public static void A17(C17130tn r2, AnonymousClass04D r3, Object obj) {
        r3.invoke(new AnonymousClass0OT(r2), r2, obj);
        r2.COB(2058660585);
    }

    public static void A19(C17130tn r1, AnonymousClass1OS r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        r1.CRH(valueOf);
        r1.BCJ(valueOf, r2);
    }

    public static void A1G(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass());
    }

    public static void A1H(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    public static void A1I(String str, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        log.debug(stringBuffer.toString());
    }

    public static void A1J(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(Integer.toHexString(i));
    }

    public static void A1M(AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        C28111Yx.A02(obj);
        ((CountDownLatch) obj).countDown();
    }

    public static boolean A1R(C17130tn r1, int i) {
        return C18070vi.A18(r1.CER(), Integer.valueOf(i));
    }

    public static boolean A1S(C25525ChN chN, EBS ebs) {
        return ((Boolean) ebs.BMB(chN)).booleanValue();
    }

    public static boolean A1T(CKI cki, C25632CjI cjI) {
        return ((Boolean) cjI.A02(cki)).booleanValue();
    }

    public static boolean A1U(AnonymousClass00H r0) {
        return ((Boolean) r0.get()).booleanValue();
    }

    public static boolean A1V(Method method) {
        C18070vi.A0X(method);
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean A1W(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean A1X(AtomicLongFieldUpdater atomicLongFieldUpdater, C27178DXn dXn) {
        return C27178DXn.A0I(dXn, atomicLongFieldUpdater.get(dXn), true);
    }

    public static boolean A1Y(C18090vk r0) {
        return ((Boolean) r0.invoke()).booleanValue();
    }

    public static byte[] A1Z(AnonymousClass1Bx r1) {
        return r1.CP9().A0C("DER");
    }

    public static int[] A1a(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            return C26288Cwo.A00;
        }
        return iArr;
    }
}
