package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.CarText;
import androidx.compose.ui.Alignment;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.000  reason: invalid class name */
public abstract class AnonymousClass000 {
    public static float A00(float f, float f2, float f3, float f4) {
        return (f * f2) + (f3 * f4);
    }

    public static float A01(float f, float f2, float f3, float f4) {
        return (f * f2) - (f3 * f4);
    }

    public static int A09(int i) {
        return i != 0 ? 4 : 2;
    }

    public static int A0D(int i, int i2) {
        return ((i - i2) ^ -1) >>> 31;
    }

    public static int A0F(int i, int i2) {
        return 8 - (((i - i2) ^ -1) >>> 31);
    }

    public static AnonymousClass0XW A0d(C06970a9 r1, AnonymousClass0XW r2) {
        if (r2 == null) {
            return r2;
        }
        r1.A0F(r2);
        return null;
    }

    public static Boolean A0h() {
        return false;
    }

    public static Boolean A0i() {
        return true;
    }

    public static void A18(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A1D(AnonymousClass0XV r2) {
        r2.A0m(false, true);
    }

    public static void A1I(Throwable th) {
        th.setStackTrace(new StackTraceElement[0]);
    }

    public static boolean A1O(int i) {
        return i != 0;
    }

    public static boolean A1P(int i) {
        return i == 0;
    }

    public static boolean A1Q(int i) {
        return i >= 0;
    }

    public static boolean A1R(int i) {
        return i > 0;
    }

    public static boolean A1S(int i, int i2) {
        return i != i2;
    }

    public static boolean A1T(int i, int i2) {
        return i == i2;
    }

    public static boolean A1U(int i, int i2) {
        return i < i2;
    }

    public static boolean A1W(Object obj) {
        return obj != null;
    }

    public static boolean A1X(Object obj) {
        return obj == null;
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static float A02(long j) {
        return (float) ((int) (j >> 32));
    }

    public static float A03(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static float A04(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A06(int i) {
        return i != 0 ? 536870912 : 268435456;
    }

    public static int A07(int i) {
        return i != 0 ? 67108864 : 33554432;
    }

    public static int A08(int i) {
        if (i != 0) {
            return 16384;
        }
        return DefaultCrypto.BUFFER_SIZE;
    }

    public static int A0A(int i) {
        return i != 0 ? 32 : 16;
    }

    public static int A0E(int i, int i2) {
        return ((i - 7) & i2) + (i2 & 7);
    }

    public static int A0G(long j) {
        return (int) (j >> 32);
    }

    public static int A0I(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A0J(AnonymousClass0XJ r0) {
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public static int A0K(AnonymousClass0XJ r0) {
        if (r0 != null) {
            return r0.A01;
        }
        return 0;
    }

    public static int A0M(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A0P(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.hashCode(objArr);
    }

    public static int A0R(int[] iArr, int i) {
        return iArr[i + 1] & 67108863;
    }

    public static int A0S(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static long A0T(long j) {
        return j & (j - 1);
    }

    public static long A0U(long j) {
        return j & ((j ^ -1) << 6);
    }

    public static ColorStateList A0X(C007903o r0) {
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static PorterDuff.Mode A0Z(C007903o r0) {
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public static C17130tn A0b(Object obj, Object obj2) {
        C17130tn r0 = (C17130tn) obj;
        ((Number) obj2).intValue();
        return r0;
    }

    public static AnonymousClass0QY A0e(long j) {
        return new AnonymousClass0QY(j);
    }

    public static IllegalArgumentException A0k(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A0l() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0n(String str) {
        return new IllegalStateException(str);
    }

    public static Integer A0p(int i) {
        return Integer.valueOf(i & 14);
    }

    public static Integer A0q(int i) {
        return Integer.valueOf((i >> 3) & 112);
    }

    public static NullPointerException A0s(String str) {
        return new NullPointerException(str);
    }

    public static Object A0t(C17130tn r1) {
        return r1.BFh(AnonymousClass0OD.A06);
    }

    public static Object A0v(Object obj) {
        return AnonymousClass0PE.A00((C16860tL) obj);
    }

    public static Object A0x(Object[] objArr, int i, int i2) {
        return objArr[(i << 3) + i2];
    }

    public static String A0z(StringBuilder sb) {
        sb.append("]");
        return sb.toString();
    }

    public static StringBuilder A10() {
        return new StringBuilder();
    }

    public static StringBuilder A11(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static UnsupportedOperationException A12() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static ArrayList A13() {
        return new ArrayList();
    }

    public static void A1J(float[] fArr, float f, int i) {
        fArr[i] = fArr[i] * f;
    }

    public static void A1K(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static boolean A1Y(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static Object[] A1b(Object obj, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        return objArr;
    }

    public static int A05(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A0B(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A0C(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A0L(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A0N(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A0O(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A0Q(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static long A0V(C17330uU r1) {
        return ((C05100Qk) r1.getValue()).A00;
    }

    public static long A0W(C16300s2 r1) {
        return ((C05100Qk) r1.getValue()).A00;
    }

    public static Resources A0Y(View view) {
        return view.getContext().getResources();
    }

    public static IOnDoneCallback A0a(Parcel parcel) {
        return IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder());
    }

    public static Alignment A0c(C17130tn r1) {
        r1.COB(733328855);
        return AnonymousClass0MX.A08;
    }

    public static AnonymousClass0KX A0f(List list, int i) {
        return (AnonymousClass0KX) list.get(i);
    }

    public static C16860tL A0g(List list, int i) {
        return (C16860tL) list.get(i);
    }

    public static IllegalArgumentException A0j(Object obj) {
        return new IllegalArgumentException(obj.toString());
    }

    public static IllegalStateException A0m(Object obj) {
        return new IllegalStateException(obj.toString());
    }

    public static IllegalStateException A0o(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0r(C17130tn r1, int i) {
        Integer valueOf = Integer.valueOf(i);
        r1.CRH(valueOf);
        return valueOf;
    }

    public static Object A0u(C17130tn r0, int i) {
        r0.COB(i);
        return r0.CER();
    }

    public static Object A0w(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static String A0y(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList A14(List list) {
        return new ArrayList(list.size());
    }

    public static Iterator A15(Map map) {
        return map.entrySet().iterator();
    }

    public static Map.Entry A16(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A17(Drawable drawable, View view) {
        drawable.setState(view.getDrawableState());
    }

    public static void A19(IInterface iInterface, Parcel parcel, String str, String str2) {
        parcel.writeInterfaceToken(str);
        parcel.writeString(str2);
        parcel.writeStrongInterface(iInterface);
    }

    public static void A1A(View view) {
        AnonymousClass03T.A04(view.getContext(), view);
    }

    public static void A1B(CarText carText, StringBuilder sb) {
        sb.append(CarText.A00(carText));
    }

    public static void A1C(C17330uU r1, boolean z) {
        r1.setValue(Boolean.valueOf(z));
    }

    public static void A1E(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1F(StringBuilder sb, long j) {
        sb.append(C05100Qk.A08(j));
    }

    public static void A1G(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((Object) null);
    }

    public static void A1H(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(0.0f);
    }

    public static void A1L(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
    }

    public static void A1M(Object[] objArr, int i) {
        objArr[1] = Integer.valueOf(i);
    }

    public static void A1N(Object[] objArr, boolean z) {
        objArr[0] = Boolean.valueOf(z);
    }

    public static boolean A1V(C17130tn r0, Object obj, int i) {
        r0.COB(i);
        return r0.BEf(obj);
    }

    public static boolean A1a(List list) {
        return !list.isEmpty();
    }

    public static int A0H(long j) {
        return (int) (j & 4294967295L);
    }
}
