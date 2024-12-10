package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InvalidObjectException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0vP  reason: invalid class name and case insensitive filesystem */
public abstract class C17900vP {
    public static C23581BmB A03(C23624Bmt bmt, byte[] bArr) {
        C23581BmB A01 = DSQ.A01(bArr, 0, bArr.length);
        bmt.A0E();
        return A01;
    }

    public static void A0O(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
    }

    public static void A0P(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
        objArr[7] = obj4;
    }

    public static C129536hx[] A0s(AbstractCollection abstractCollection, int i) {
        if (i == 0) {
            return (C129536hx[]) abstractCollection.toArray(new C129536hx[abstractCollection.size()]);
        }
        return null;
    }

    public static String[] A0t(long j) {
        return new String[]{String.valueOf(j)};
    }

    public static int A00(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static long A01(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public static NullPointerException A07(Class cls) {
        new AnonymousClass20F(cls);
        return new NullPointerException("onProcessorExecuted");
    }

    public static String A08(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String A0A(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder A0G() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        return sb;
    }

    public static StringBuilder A0H(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashSet A0I(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return new HashSet(Arrays.asList(objArr));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    public static void A0L(C1409673t r1, CharSequence charSequence) {
        ? r0 = new AnonymousClass72G();
        r0.A07(charSequence);
        r1.A0B(r0);
    }

    public static void A0Q(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[10] = obj;
        objArr[11] = obj2;
        objArr[12] = obj3;
        objArr[13] = obj4;
    }

    public static void A0R(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[15] = obj;
        objArr[16] = obj2;
        objArr[17] = obj3;
        objArr[18] = obj4;
    }

    public static void A0S(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[21] = obj;
        objArr[22] = obj2;
        objArr[23] = obj3;
        objArr[24] = obj4;
    }

    public static void A0T(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[25] = obj;
        objArr[26] = obj2;
        objArr[27] = obj3;
        objArr[28] = obj4;
    }

    public static void A0U(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[31] = obj;
        objArr[32] = obj2;
        objArr[33] = obj3;
        objArr[34] = obj4;
    }

    public static void A0V(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[36] = obj;
        objArr[37] = obj2;
        objArr[38] = obj3;
        objArr[39] = obj4;
    }

    public static void A0p(StringBuilder sb, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(str);
        sb.append(sb2.toString());
    }

    public static void A0q(StringBuilder sb, Job job) {
        sb.append("; persistentId=");
        sb.append(job.A01);
    }

    public static SharedPreferences A02(AnonymousClass00H r0) {
        return (SharedPreferences) ((C19830z4) r0.get()).A00.get();
    }

    public static C000100c A04(Context context) {
        return (C000100c) AnonymousClass00E.A00(context.getApplicationContext(), C000100c.class);
    }

    public static BD1 A05(Object obj, Map map) {
        C18140vp r0 = (C18140vp) map.get(obj);
        r0.getClass();
        return (BD1) r0.get();
    }

    public static InvalidObjectException A06(String str, StringBuilder sb) {
        sb.append(str);
        return new InvalidObjectException(sb.toString());
    }

    public static String A09(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public static String A0B(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static String A0C(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static String A0D(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        return sb.toString();
    }

    public static String A0E(StringBuilder sb, long j) {
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public static String A0F(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    public static void A0J(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A0K(Cursor cursor, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Long.valueOf(cursor.getLong(i)));
    }

    public static void A0M(C19830z4 r0, String str, int i) {
        C19830z4.A00(r0).putInt(str, i).apply();
    }

    public static void A0N(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getAbsolutePath());
    }

    public static void A0W(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append("; participant=");
    }

    public static void A0X(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString());
    }

    public static void A0Y(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A0Z(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static void A0a(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getSimpleName());
    }

    public static void A0b(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A0c(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A0d(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append('/');
    }

    public static void A0e(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A0f(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A0g(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString());
    }

    public static void A0h(String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString(), th);
    }

    public static void A0i(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A0j(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A0k(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A0l(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.e(sb.toString());
    }

    public static void A0m(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A0n(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A0o(StringBuilder sb, int i) {
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A0r(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.i(sb.toString());
    }
}
