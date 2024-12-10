package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0vO  reason: invalid class name and case insensitive filesystem */
public abstract class C17890vO {
    public static int A00(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, 0);
    }

    public static long A03(int i) {
        return ((long) i) * 1000;
    }

    public static ContentValues A08() {
        return new ContentValues(2);
    }

    public static Boolean A0J(int i) {
        if (i != 0) {
            return false;
        }
        return null;
    }

    public static void A0o(AnonymousClass3LB r2, Object obj, int i) {
        r2.CAe(Message.obtain((Handler) null, 0, i, 0, obj));
    }

    public static void A0p(AnonymousClass3LB r2, Object obj, int i) {
        r2.CAe(Message.obtain((Handler) null, 0, i, 0, obj));
    }

    public static void A0u(A34 a34, AnonymousClass10I r2) {
        r2.CGD(a34, new Void[0]);
    }

    public static boolean A1R(int i) {
        return i == 1;
    }

    public static Object[] A1a(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        return objArr;
    }

    public static long A04(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, -1);
    }

    public static long A05(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, 0);
    }

    public static SharedPreferences A0B(C19830z4 r0) {
        return (SharedPreferences) r0.A00.get();
    }

    public static Pair A0G(Object obj, Collection collection) {
        return new Pair(obj, new ArrayList(collection));
    }

    public static C000100c A0H(Context context) {
        return (C000100c) AnonymousClass00E.A00(context, C000100c.class);
    }

    public static File A0I(File file, String str, boolean z) {
        File file2 = new File(file, str);
        C218617r.A07(file2, z);
        return file2;
    }

    public static IllegalArgumentException A0K() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static Long A0L() {
        return 0L;
    }

    public static String A0R(Context context, Object obj, int i, int i2, int i3) {
        Object[] objArr = new Object[i];
        objArr[i2] = obj;
        return context.getString(i3, objArr);
    }

    public static String A0W(String str) {
        return str.length() > 0 ? ", " : "";
    }

    public static String A0b(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static StringBuilder A0d() {
        StringBuilder sb = new StringBuilder();
        sb.append("; jid=");
        return sb;
    }

    public static StringBuilder A0e() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        return sb;
    }

    public static StringBuilder A0f(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static void A0n(Jid jid, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass1MD(jid, str));
    }

    public static void A0q(AnonymousClass10T r1, int i) {
        r1.notifyAllObservers(new C96994ok(i));
    }

    public static void A0r(AnonymousClass10T r1, Object obj, int i) {
        r1.notifyAllObservers(new C97014om(obj, i));
    }

    public static void A0s(AnonymousClass10T r1, Object obj, int i) {
        r1.notifyAllObservers(new C20723AWd(obj, i));
    }

    public static void A0t(A34 a34) {
        if (a34 != null) {
            a34.A0B(true);
        }
    }

    public static void A0v(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21425Ajs(obj, i));
    }

    public static void A0x(Object obj, Object obj2, Object[] objArr) {
        objArr[8] = obj;
        objArr[9] = obj2;
    }

    public static void A0y(Object obj, Object obj2, Object[] objArr) {
        objArr[29] = obj;
        objArr[30] = obj2;
    }

    public static void A11(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass1MD(str, str2));
    }

    public static void A12(String str, String str2, Object[] objArr) {
        objArr[2] = new AnonymousClass1MD(str, str2);
    }

    public static boolean A1W(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass1MD(str, str2);
        return false;
    }

    public static C29621ca[] A1Y(AbstractCollection abstractCollection, int i) {
        return (C29621ca[]) abstractCollection.toArray(new C29621ca[i]);
    }

    public static Object[] A1Z(int i) {
        Object[] objArr = new Object[i];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static String[] A1b(AbstractCollection abstractCollection, int i) {
        return (String[]) abstractCollection.toArray(new String[i]);
    }

    public static int A01(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static int A02(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static long A06(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    public static long A07(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static SharedPreferences.Editor A09(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str);
    }

    public static SharedPreferences.Editor A0A(C18100vl r0) {
        return ((SharedPreferences) r0.getValue()).edit();
    }

    public static Uri A0C(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Handler A0D() {
        return new Handler(Looper.getMainLooper());
    }

    public static Pair A0E(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static Pair A0F(Object obj, int i) {
        return Pair.create(obj, Integer.valueOf(i));
    }

    public static Long A0M(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public static Long A0N(Number number) {
        return Long.valueOf((long) number.intValue());
    }

    public static Object A0O(int i) {
        return AnonymousClass12Q.A02(AnonymousClass114.A00(), i);
    }

    public static Object A0P(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static String A0Q() {
        return UUID.randomUUID().toString();
    }

    public static String A0S(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static String A0T(AnonymousClass00H r0) {
        return ((AnonymousClass1OZ) r0.get()).A0B();
    }

    public static String A0U(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0V(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0X(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" AND ");
        return " AND ";
    }

    public static String A0Y(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" WHERE ");
        return " WHERE ";
    }

    public static String A0Z(String str, StringBuilder sb, char c) {
        sb.append(c);
        sb.append(str);
        return sb.toString();
    }

    public static String A0a(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A0c(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static Collection A0g(C18100vl r0) {
        return ((Map) r0.getValue()).values();
    }

    public static Iterator A0h(AnonymousClass00H r0) {
        return ((Set) r0.get()).iterator();
    }

    public static Iterator A0i(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A0j(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Iterator A0k(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static Iterator A0l(Map map) {
        return map.values().iterator();
    }

    public static void A0m(C1409673t r0, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        r0.A0G(z);
        r0.A0E(charSequence);
        r0.A0D(charSequence2);
    }

    public static void A0w(Object obj) {
        Log.e(obj.toString());
    }

    public static void A0z(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A10(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A13(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.w(sb.toString(), th);
    }

    public static void A14(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(abstractCollection.size());
    }

    public static void A15(String str, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(list.size());
    }

    public static void A16(StringBuilder sb, long j) {
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A17(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" ON ");
    }

    public static void A18(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" WHERE ");
    }

    public static void A19(StringBuilder sb, String str) {
        sb.append(str);
        Log.e(sb.toString());
    }

    public static void A1A(StringBuilder sb, String str) {
        sb.append(str);
        Log.i(sb.toString());
    }

    public static void A1B(StringBuilder sb, String str) {
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A1C(StringBuilder sb, byte[] bArr) {
        sb.append(Arrays.toString(bArr));
    }

    public static void A1D(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1E(C18100vl r0) {
        ((Map) r0.getValue()).clear();
    }

    public static void A1F(Object[] objArr, int i) {
        objArr[0] = String.valueOf(i);
    }

    public static void A1G(Object[] objArr, int i) {
        objArr[3] = Integer.valueOf(i);
    }

    public static void A1H(Object[] objArr, int i) {
        objArr[6] = Integer.valueOf(i);
    }

    public static void A1I(Object[] objArr, int i) {
        objArr[7] = Integer.valueOf(i);
    }

    public static void A1J(Object[] objArr, long j) {
        objArr[0] = String.valueOf(j);
    }

    public static void A1K(Object[] objArr, long j) {
        objArr[1] = String.valueOf(j);
    }

    public static void A1L(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
    }

    public static void A1M(Object[] objArr, long j) {
        objArr[1] = Long.valueOf(j);
    }

    public static void A1N(Object[] objArr, long j) {
        objArr[2] = Long.valueOf(j);
    }

    public static void A1O(Object[] objArr, long j) {
        objArr[3] = Long.valueOf(j);
    }

    public static void A1P(Object[] objArr, long j) {
        objArr[4] = Long.valueOf(j);
    }

    public static void A1Q(Object[] objArr, long j) {
        objArr[5] = Long.valueOf(j);
    }

    public static boolean A1S(Intent intent, String str) {
        return str.equals(intent.getAction());
    }

    public static boolean A1T(Uri uri, String str) {
        return str.equals(uri.getScheme());
    }

    public static boolean A1U(Uri uri, String str) {
        return str.equals(uri.getHost());
    }

    public static boolean A1V(Object obj, XmlPullParser xmlPullParser) {
        return xmlPullParser.getName().equals(obj);
    }

    public static byte[] A1X(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
