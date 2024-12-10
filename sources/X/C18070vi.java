package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.view.View;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.0vi  reason: invalid class name and case insensitive filesystem */
public class C18070vi {
    public static int A00(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int A01(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1Mo, java.lang.Object] */
    public static C25021Mo A06(Object obj) {
        A0d(obj, 0);
        return new Object();
    }

    public static AnonymousClass206 A08(AnonymousClass25F r1) {
        A0d(r1, 0);
        return r1.A00;
    }

    public static C29621ca A0A(C29621ca r1) {
        A0d(r1, 0);
        return r1.A0K("meta");
    }

    public static AnonymousClass11A A0B(AnonymousClass1Q1 r1, Object obj) {
        A0d(obj, 0);
        return (AnonymousClass11A) r1.A00.get();
    }

    public static StringBuilder A0K(Object obj) {
        A0d(obj, 0);
        return new StringBuilder();
    }

    public static void A0S(View view, AnonymousClass724 r3, AnonymousClass206 r4) {
        A0d(r4, 0);
        A0d(view, 1);
        A0d(r3, 3);
        r3.A03(view, r4, false);
    }

    public static void A0h(Object obj, Object obj2) {
        A0d(obj, 0);
        A0d(obj2, 1);
    }

    public static void A0i(Object obj, Object obj2) {
        A0d(obj, 0);
        A0d(obj2, 2);
    }

    public static void A0j(Object obj, Object obj2) {
        A0d(obj, 1);
        A0d(obj2, 2);
    }

    public static void A0k(Object obj, Object obj2) {
        A0d(obj, 2);
        A0d(obj2, 3);
    }

    public static void A0l(Object obj, Object obj2) {
        A0d(obj, 6);
        A0d(obj2, 7);
    }

    public static void A0n(Object obj, Object obj2, Object obj3) {
        A0d(obj, 0);
        A0d(obj2, 1);
        A0d(obj3, 2);
    }

    public static void A0o(Object obj, Object obj2, Object obj3) {
        A0d(obj, 1);
        A0d(obj2, 2);
        A0d(obj3, 3);
    }

    public static void A0p(Object obj, Object obj2, Object obj3) {
        A0d(obj, 2);
        A0d(obj2, 3);
        A0d(obj3, 4);
    }

    public static void A0q(Object obj, Object obj2, Object obj3) {
        A0d(obj, 6);
        A0d(obj2, 7);
        A0d(obj3, 8);
    }

    public static void A0s(Object obj, Object obj2, Object obj3, Object obj4) {
        A0d(obj, 1);
        A0d(obj2, 2);
        A0d(obj3, 3);
        A0d(obj4, 4);
    }

    public static void A0w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        A0d(obj, 1);
        A0d(obj2, 2);
        A0d(obj3, 3);
        A0d(obj4, 4);
        A0d(obj5, 5);
    }

    public static void A0x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        A0d(obj, 6);
        A0d(obj2, 7);
        A0d(obj3, 8);
        A0d(obj4, 9);
        A0d(obj5, 10);
    }

    public static boolean A15(Object obj, Object obj2) {
        A0d(obj, 0);
        A0d(obj2, 1);
        return false;
    }

    public static boolean A16(Object obj, Object obj2) {
        A0d(obj, 0);
        A0d(obj2, 1);
        return true;
    }

    public static boolean A17(Object obj, Object obj2) {
        A0d(obj, 0);
        A0d(obj2, 1);
        return true;
    }

    public static C178119Bw A0C(C70483Bg r0) {
        List list = r0.A04;
        A0W(list);
        return (C178119Bw) C29431cG.A0c(list);
    }

    public static List A0N(Object obj, Object obj2, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        objArr[i2] = obj2;
        List asList = Arrays.asList(objArr);
        A0X(asList);
        return asList;
    }

    public static List A0O(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        List asList = Arrays.asList(objArr);
        A0X(asList);
        return asList;
    }

    public static C23791Hq A0Q(C18400wL r2, Class cls) {
        Object BMC = r2.BMC(new C18350wG(cls, Executor.class));
        A0X(BMC);
        return new C23791Hq((Executor) BMC);
    }

    public static void A0R() {
        AnonymousClass2RW r0 = new AnonymousClass2RW();
        A13(r0);
        throw r0;
    }

    public static void A0T(Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("INVOKE_RETURN");
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            A13(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void A0U(Object obj) {
        if (obj == null) {
            A10("ARRAY_ELEMENT");
            throw null;
        }
    }

    public static void A0V(Object obj) {
        if (obj == null) {
            A10("CHECK_CAST");
            throw null;
        }
    }

    public static void A0W(Object obj) {
        if (obj == null) {
            A10("INSTANCE_FIELD");
            throw null;
        }
    }

    public static void A0X(Object obj) {
        if (obj == null) {
            A10("INVOKE_RETURN");
            throw null;
        }
    }

    public static void A0Y(Object obj) {
        if (obj == null) {
            A10("LOAD_PARAM");
            throw null;
        }
    }

    public static void A0Z(Object obj) {
        if (obj == null) {
            A10("STATIC_FIELD");
            throw null;
        }
    }

    public static void A0a(Object obj) {
        if (obj == null) {
            A10("UNKNOWN");
            throw null;
        }
    }

    public static void A0b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A13(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0c(Object obj, int i) {
        if (obj == null) {
            String num = Integer.toString(i);
            StringBuilder sb = new StringBuilder();
            sb.append("param at index = ");
            sb.append(num);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(A0I(sb.toString()));
            A13(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static void A0d(Object obj, int i) {
        if (obj == null) {
            String num = Integer.toString(i);
            StringBuilder sb = new StringBuilder();
            sb.append("param at index = ");
            sb.append(num);
            NullPointerException nullPointerException = new NullPointerException(A0I(sb.toString()));
            A13(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0m(Object obj, Object obj2) {
        A0d(obj, 16);
        A0d(obj2, 17);
    }

    public static void A0r(Object obj, Object obj2, Object obj3) {
        A0d(obj, 11);
        A0d(obj2, 12);
        A0d(obj3, 13);
    }

    public static void A0t(Object obj, Object obj2, Object obj3, Object obj4) {
        A0d(obj, 16);
        A0d(obj2, 17);
        A0d(obj3, 18);
        A0d(obj4, 19);
    }

    public static void A0u(Object obj, Object obj2, Object obj3, Object obj4) {
        A0d(obj, 20);
        A0d(obj2, 21);
        A0d(obj3, 22);
        A0d(obj4, 23);
    }

    public static void A0v(Object obj, Object obj2, Object obj3, Object obj4) {
        A0d(obj, 24);
        A0d(obj2, 25);
        A0d(obj3, 26);
        A0d(obj4, 27);
    }

    public static void A0y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        A0d(obj, 11);
        A0d(obj2, 12);
        A0d(obj3, 13);
        A0d(obj4, 14);
        A0d(obj5, 15);
    }

    public static void A0z(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            A13(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A10(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        NullPointerException nullPointerException = new NullPointerException(sb.toString());
        A13(nullPointerException);
        throw nullPointerException;
    }

    public static void A11(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        AnonymousClass3EY r0 = new AnonymousClass3EY(sb.toString());
        A13(r0);
        throw r0;
    }

    public static void A13(Throwable th) {
        A12(C18070vi.class.getName(), th);
    }

    public static boolean A18(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static SharedPreferences.Editor A02(C35051lZ r0) {
        SharedPreferences.Editor edit = C35051lZ.A00(r0).edit();
        A0X(edit);
        return edit;
    }

    public static SharedPreferences A03(C18100vl r0) {
        Object value = r0.getValue();
        A0X(value);
        return (SharedPreferences) value;
    }

    public static Cursor A04(C23141Ev r0, String str, String str2, String[] strArr) {
        Cursor A0A = r0.A0A(str, str2, strArr);
        A0X(A0A);
        return A0A;
    }

    public static View A05(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        A0X(A06);
        return A06;
    }

    public static C690335q A07(AnonymousClass118 r0, int i) {
        String A01 = r0.A01(i);
        A0X(A01);
        return new C690335q(A01);
    }

    public static AnonymousClass25F A09(AnonymousClass206 r0, Class cls) {
        AnonymousClass25F A0M = r0.A0M(cls);
        A0X(A0M);
        return A0M;
    }

    public static CharSequence A0D(Context context, Paint paint, int i) {
        CharSequence A03 = C72813Np.A03(paint, AnonymousClass12F.A00(context, 2131232408), context.getString(i));
        A0X(A03);
        return A03;
    }

    public static Object A0E(AnonymousClass00H r0) {
        Object obj = r0.get();
        A0X(obj);
        return obj;
    }

    public static String A0F(Context context, int i) {
        String string = context.getString(i);
        A0X(string);
        return string;
    }

    public static String A0G(AnonymousClass118 r0, int i) {
        String A01 = r0.A01(i);
        A0X(A01);
        return A01;
    }

    public static String A0H(Object obj) {
        String obj2 = obj.toString();
        A0X(obj2);
        return obj2;
    }

    public static String A0I(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C18070vi.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    public static String A0J(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        A0X(string);
        return string;
    }

    public static List A0L(AnonymousClass118 r0, int i) {
        String A01 = r0.A01(i);
        A0X(A01);
        List singletonList = Collections.singletonList(A01);
        A0X(singletonList);
        return singletonList;
    }

    public static List A0M(Object obj) {
        List singletonList = Collections.singletonList(obj);
        A0X(singletonList);
        return singletonList;
    }

    public static Set A0P(Object obj) {
        Set singleton = Collections.singleton(obj);
        A0X(singleton);
        return singleton;
    }

    public static void A0e(Object obj, int i, Object obj2) {
        A0d(obj, i);
        A0d(obj2, 2);
    }

    public static void A0f(Object obj, int i, Object obj2) {
        A0d(obj, i);
        A0d(obj2, 4);
    }

    public static void A0g(Object obj, int i, Object obj2) {
        A0d(obj, i);
        A0d(obj2, 5);
    }

    public static void A12(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static boolean A14(Object obj, Object obj2) {
        return A18(obj.getClass(), obj2.getClass());
    }

    public static boolean A19(Object obj, boolean z) {
        return A18(obj, Boolean.valueOf(z));
    }

    public static byte[] A1A(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        A0X(bytes);
        return bytes;
    }
}
