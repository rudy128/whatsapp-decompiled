package X;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.001  reason: invalid class name */
public abstract class AnonymousClass001 {
    public static float A07(float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static float A08(float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static float A09(float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static int A0A(int i) {
        if (i != 0) {
            return -1 >>> (32 - i);
        }
        return 0;
    }

    public static int A0B(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static Integer A14(int i) {
        return Integer.valueOf((i >> 3) & 112);
    }

    public static void A1N(IBinder iBinder, Parcel parcel) {
        iBinder.transact(2, parcel, (Parcel) null, 1);
    }

    public static void A1O(IBinder iBinder, Parcel parcel) {
        iBinder.transact(3, parcel, (Parcel) null, 1);
    }

    public static void A1Q(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1R(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static void A1U(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[4] = f;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f4;
    }

    public static float A00(float f, float f2, float f3) {
        return ((1.0f - f) * f2) + (f * f3);
    }

    public static float A02(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A0C(int i) {
        if (i <= 0) {
            return 0;
        }
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        return Math.max(7, -1 >>> Integer.numberOfLeadingZeros(i));
    }

    public static int A0F(int i, int i2) {
        return i2 | (i & 112) | (i & 896) | (i & 7168);
    }

    public static int A0I(long j) {
        C02540Ek r0 = C05100Qk.A06;
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A0J(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A0K(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A0M(long j, long j2) {
        return ((int) (j >> 32)) + ((int) (j2 >> 32));
    }

    public static int A0O(C17130tn r1, int i) {
        int i2 = ((i << 9) & 7168) | 6;
        r1.COE();
        return i2;
    }

    public static int A0k(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0l(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A0m(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static long A0o() {
        return 1 | (1 << 32);
    }

    public static long A0q(long j) {
        return ((-1 ^ j) << 7) & j;
    }

    public static long A0r(long j) {
        return j << 32;
    }

    public static long A0s(long j) {
        return (j ^ -1) << 7;
    }

    public static long A0t(long j) {
        return j & ((-1 ^ j) << 7) & -9187201950435737472L;
    }

    public static long A0v(C17130tn r1) {
        return ((C05100Qk) r1.BFh(AnonymousClass0G4.A00)).A00;
    }

    public static long A0x(long[] jArr, int i) {
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static C06970a9 A0z(C06970a9 r1) {
        if (r1 == null) {
            return new C06970a9(new AnonymousClass0XW[16]);
        }
        return r1;
    }

    public static C06970a9 A10(C06970a9 r1) {
        if (r1 == null) {
            return new C06970a9(new AnonymousClass0XW[16]);
        }
        return r1;
    }

    public static C03710Kf A11(long j) {
        return C03090Go.A0K[(int) (j & 63)];
    }

    public static Integer A17(Object obj, Object obj2) {
        return Integer.valueOf(((C16860tL) obj).Bj9(((Number) obj2).intValue()));
    }

    public static Integer A18(Object obj, Object obj2) {
        return Integer.valueOf(((C16860tL) obj).BjC(((Number) obj2).intValue()));
    }

    public static String A1J(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static StringBuilder A1M(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Size(");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        return sb;
    }

    public static void A1S(StringBuilder sb, int i, int i2) {
        if (i < i2) {
            sb.append(',');
            sb.append(' ');
        }
    }

    public static void A1V(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        fArr[15] = f4;
    }

    public static float A03(long j, long j2) {
        return AnonymousClass0QY.A01(j) + AnonymousClass0QG.A02(j2);
    }

    public static float A04(long j, long j2) {
        return AnonymousClass0QY.A02(j) + AnonymousClass0QG.A00(j2);
    }

    public static float A05(C17330uU r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static float A06(C16300s2 r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A0D(int i) {
        int i2 = -862048943 * i;
        return i2 ^ (i2 << 16);
    }

    public static int A0E(int i) {
        int i2 = i * -862048943;
        return i2 ^ (i2 << 16);
    }

    public static int A0G(int i, int i2) {
        return i2 | (57344 & i) | (458752 & i) | (3670016 & i) | (i & 29360128);
    }

    public static int A0H(int i, int i2, long j) {
        return ((Long.numberOfTrailingZeros(j) >> 3) + i) & i2;
    }

    public static int A0N(C17130tn r0, int i) {
        if (r0.BEd(i)) {
            return 8388608;
        }
        return 4194304;
    }

    public static int A0P(C17130tn r0, long j) {
        if (r0.BEe(j)) {
            return 256;
        }
        return 128;
    }

    public static int A0Q(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 4;
        }
        return 2;
    }

    public static int A0R(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 32;
        }
        return 16;
    }

    public static int A0S(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 256;
        }
        return 128;
    }

    public static int A0T(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public static int A0U(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 16384;
        }
        return DefaultCrypto.BUFFER_SIZE;
    }

    public static int A0V(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return A7Y.A0F;
        }
        return 65536;
    }

    public static int A0W(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 1048576;
        }
        return 524288;
    }

    public static int A0X(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 8388608;
        }
        return 4194304;
    }

    public static int A0Y(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 67108864;
        }
        return 33554432;
    }

    public static int A0Z(C17130tn r0, Object obj) {
        if (r0.BEf(obj)) {
            return 4;
        }
        return 2;
    }

    public static int A0a(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 4;
        }
        return 2;
    }

    public static int A0b(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 32;
        }
        return 16;
    }

    public static int A0c(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 256;
        }
        return 128;
    }

    public static int A0d(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public static int A0e(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return A7Y.A0F;
        }
        return 65536;
    }

    public static int A0f(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 1048576;
        }
        return 524288;
    }

    public static int A0g(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 8388608;
        }
        return 4194304;
    }

    public static int A0h(C17130tn r0, Object obj) {
        if (r0.BEh(obj)) {
            return 536870912;
        }
        return 268435456;
    }

    public static int A0i(C17130tn r0, boolean z) {
        if (r0.BEg(z)) {
            return 256;
        }
        return 128;
    }

    public static int A0j(C17130tn r0, boolean z) {
        if (r0.BEg(z)) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public static int A0n(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static long A0p(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static long A0u(KeyEvent keyEvent) {
        return ((long) keyEvent.getKeyCode()) << 32;
    }

    public static long A0w(C17130tn r1, Integer num) {
        return AnonymousClass0Oy.A03(A11(AnonymousClass0QB.A05(r1, num)), C05100Qk.A04(AnonymousClass0QB.A05(r1, num)), C05100Qk.A03(AnonymousClass0QB.A05(r1, num)), C05100Qk.A02(AnonymousClass0QB.A05(r1, num)), 0.38f);
    }

    public static Drawable A0y(View view, int i) {
        return AnonymousClass02D.A03().A09(view.getContext(), i);
    }

    public static IllegalArgumentException A12(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A13(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static Integer A15(C17130tn r1, int i) {
        r1.COB(2058660585);
        return Integer.valueOf((i >> 21) & 14);
    }

    public static Integer A16(Integer num, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.compareTo(num) > 0) {
            return valueOf;
        }
        return num;
    }

    public static Object A19(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A1A(C17130tn r1) {
        r1.COB(-492369756);
        return r1.CER();
    }

    public static Object A1B(C17130tn r1) {
        r1.COB(-1323940314);
        return r1.BFh(AnonymousClass0OD.A01);
    }

    public static Object A1C(C17130tn r1, int i) {
        r1.COB(i);
        r1.COB(-492369756);
        return r1.CER();
    }

    public static Object A1D(C17130tn r1, AnonymousClass0OI r2) {
        r1.COB(-1323940314);
        return r1.BFh(r2);
    }

    public static String A1E(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A1F(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A1G(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public static String A1H(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A1I(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A1K(StringBuilder sb, float f) {
        sb.append(f);
        sb.append(')');
        return sb.toString();
    }

    public static String A1L(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static void A1P(AnonymousClass0t6 r1, long j) {
        r1.BOJ().CFz();
        r1.CKn(j);
    }

    public static void A1T(AbstractCollection abstractCollection, List list, int i, long j) {
        abstractCollection.add(((C17500ul) list.get(i)).Bjb(j));
    }

    public static boolean A1W(Parcel parcel, AnonymousClass0RM r3, String str) {
        parcel.writeInterfaceToken(str);
        if (r3 != null) {
            parcel.writeInt(1);
            r3.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static boolean A1X(C17130tn r1, Object obj) {
        r1.COB(1157296644);
        return r1.BEf(obj);
    }

    public static boolean A1Y(C17130tn r2, Object obj, Object obj2) {
        r2.COB(511388516);
        return r2.BEf(obj) | r2.BEf(obj2);
    }

    public static boolean A1Z(C17130tn r2, Object obj, Object obj2) {
        r2.COB(511388516);
        return r2.BEf(obj2) | r2.BEf(obj);
    }

    public static boolean A1a(C17130tn r0, Object obj, Object obj2, int i) {
        r0.COB(i);
        return r0.BEf(obj) | r0.BEf(obj2);
    }

    public static boolean A1b(C17330uU r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static float A01(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int A0L(long j, long j2) {
        return ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
    }
}
