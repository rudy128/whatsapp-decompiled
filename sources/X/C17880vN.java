package X;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0vN  reason: invalid class name and case insensitive filesystem */
public abstract class C17880vN {
    public static float A00(float f, float f2, float f3) {
        return f2 + (f3 * (f - f2));
    }

    public static int A02(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static AnonymousClass205 A0Z(AnonymousClass1BI r1, AnonymousClass1PP r2) {
        return r2.A01(r1, true);
    }

    public static Integer A0h() {
        return 1;
    }

    public static Integer A0i() {
        return 2;
    }

    public static Integer A0j() {
        return 3;
    }

    public static Integer A0k() {
        return 4;
    }

    public static Integer A0l() {
        return 5;
    }

    public static Integer A0m() {
        return 6;
    }

    public static Long A0n(int i) {
        return Long.valueOf((long) i);
    }

    public static Long A0o(long j, long j2) {
        return Long.valueOf(j + j2);
    }

    public static String A0r(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    public static boolean A1W(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static String[] A1Y() {
        return new String[1];
    }

    public static String[] A1Z() {
        return new String[2];
    }

    public static String[] A1a(Object obj, int i) {
        String[] strArr = new String[1];
        strArr[i] = obj;
        return strArr;
    }

    public static String[] A1b(Object obj, Object obj2, int i, int i2) {
        String[] strArr = new String[i];
        strArr[0] = obj;
        strArr[i2] = obj2;
        return strArr;
    }

    public static int A01(int i, boolean z) {
        int i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return i + i2;
    }

    public static long A04(long j) {
        return j / 1000;
    }

    public static long A05(Object obj) {
        return ((Number) obj).longValue();
    }

    public static PendingIntent A06(Context context, Intent intent, int i) {
        return C1408573i.A01(context, i, intent, 134217728);
    }

    public static PendingIntent A07(Context context, Intent intent, int i) {
        return C1408573i.A00(context, i, intent, 134217728);
    }

    public static ContentValues A08() {
        return new ContentValues();
    }

    public static ContentValues A09(int i) {
        return new ContentValues(i);
    }

    public static Intent A0A() {
        return new Intent();
    }

    public static Bundle A0D() {
        return new Bundle();
    }

    public static DNE A0F(C23577Bm6 bm6) {
        return new DNE(bm6);
    }

    public static File A0e(File file, String str) {
        return new File(file, str);
    }

    public static IOException A0f(String str) {
        return new IOException(str);
    }

    public static IllegalStateException A0g() {
        return new IllegalStateException("Required value was null.");
    }

    public static Object A0p() {
        return new Object();
    }

    public static String A0q(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return context.getString(i2, objArr);
    }

    public static UnsupportedOperationException A0y() {
        return new UnsupportedOperationException();
    }

    public static ArrayList A0z(int i) {
        return new ArrayList(i);
    }

    public static ArrayList A10(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashMap A11() {
        return new HashMap();
    }

    public static HashSet A12() {
        return new HashSet();
    }

    public static LinkedHashMap A13() {
        return new LinkedHashMap();
    }

    public static LinkedHashSet A14() {
        return new LinkedHashSet();
    }

    public static JSONObject A15() {
        return new JSONObject();
    }

    public static JSONObject A16(String str) {
        return new JSONObject(str);
    }

    public static XmlPullParserException A17(String str) {
        return new XmlPullParserException(str);
    }

    public static void A1I(Jid jid, String str, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1MD(jid, str);
    }

    public static void A1L(Object obj, Object obj2, Object[] objArr) {
        objArr[19] = obj;
        objArr[20] = obj2;
    }

    public static void A1Q(String str, String str2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1MD(str, str2);
    }

    public static int A03(String str) {
        return str.hashCode() * 31;
    }

    public static SharedPreferences A0B(AnonymousClass00H r0) {
        return (SharedPreferences) r0.get();
    }

    public static SharedPreferences A0C(C18100vl r0) {
        return (SharedPreferences) r0.getValue();
    }

    public static TextView A0E(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    public static C23577Bm6 A0G(C23624Bmt bmt) {
        bmt.A0E();
        return bmt.A00;
    }

    public static AnonymousClass11S A0H(AnonymousClass00H r0) {
        return (AnonymousClass11S) r0.get();
    }

    public static C29491cN A0I(AnonymousClass00H r0) {
        return (C29491cN) r0.get();
    }

    public static C64012u4 A0J(AnonymousClass00H r0) {
        return (C64012u4) r0.get();
    }

    public static C19830z4 A0K(AnonymousClass00H r0) {
        return (C19830z4) r0.get();
    }

    public static C31931gM A0L(AnonymousClass00H r0) {
        return (C31931gM) r0.get();
    }

    public static C28771as A0M(AnonymousClass00H r0) {
        return (C28771as) r0.get();
    }

    public static AnonymousClass1RR A0N(AnonymousClass00H r0) {
        return (AnonymousClass1RR) r0.get();
    }

    public static AnonymousClass1E7 A0O(Iterator it) {
        return (AnonymousClass1E7) it.next();
    }

    public static C18020vd A0P(AnonymousClass00H r0) {
        return (C18020vd) r0.get();
    }

    public static AnonymousClass1BI A0Q(Iterator it) {
        return (AnonymousClass1BI) it.next();
    }

    public static DeviceJid A0R(Iterator it) {
        return (DeviceJid) it.next();
    }

    public static Jid A0S(Iterator it) {
        return (Jid) it.next();
    }

    public static UserJid A0T(Iterator it) {
        return (UserJid) it.next();
    }

    public static AnonymousClass1OZ A0U(AnonymousClass00H r0) {
        return (AnonymousClass1OZ) r0.get();
    }

    public static AnonymousClass10T A0V(AnonymousClass00H r0) {
        return (AnonymousClass10T) r0.get();
    }

    public static AnonymousClass2BZ A0W(C23624Bmt bmt) {
        bmt.A0E();
        return (AnonymousClass2BZ) bmt.A00;
    }

    public static C166388co A0X(C23624Bmt bmt) {
        bmt.A0E();
        C166388co r1 = (C166388co) bmt.A00;
        C166388co r0 = C166388co.DEFAULT_INSTANCE;
        return r1;
    }

    public static AnonymousClass206 A0Y(Iterator it) {
        return (AnonymousClass206) it.next();
    }

    public static C29621ca A0a(Iterator it) {
        return (C29621ca) it.next();
    }

    public static AnonymousClass21V A0b(Iterator it) {
        return (AnonymousClass21V) it.next();
    }

    public static AnonymousClass1W6 A0c(AnonymousClass00H r0) {
        return (AnonymousClass1W6) r0.get();
    }

    public static AnonymousClass11A A0d(AnonymousClass00H r0) {
        return (AnonymousClass11A) r0.get();
    }

    public static String A0s(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0t(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static String A0u(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static String A0v(Iterator it) {
        return (String) it.next();
    }

    public static String A0w(List list, int i) {
        return (String) list.get(i);
    }

    public static String A0x(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static void A18(ContentValues contentValues, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
    }

    public static void A19(ContentValues contentValues, String str, long j) {
        contentValues.put(str, Long.valueOf(j));
    }

    public static void A1A(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A1B(SharedPreferences.Editor editor, String str) {
        editor.remove(str).apply();
    }

    public static void A1C(SharedPreferences.Editor editor, String str, int i) {
        editor.putInt(str, i).apply();
    }

    public static void A1D(SharedPreferences.Editor editor, String str, long j) {
        editor.putLong(str, j).apply();
    }

    public static void A1E(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A1F(SharedPreferences.Editor editor, String str, boolean z) {
        editor.putBoolean(str, z).apply();
    }

    public static void A1G(C1409673t r2) {
        r2.A08.icon = 2131231578;
    }

    public static void A1H(C20043A4m a4m, AbstractCollection abstractCollection) {
        abstractCollection.add(a4m.A00());
    }

    public static void A1J(Jid jid, Object[] objArr, int i) {
        objArr[i] = jid.getRawString();
    }

    public static void A1K(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(Pair.create(obj, obj2));
    }

    public static void A1M(Object obj, Throwable th) {
        Log.e(obj.toString(), th);
    }

    public static void A1N(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1O(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A1P(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1R(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static void A1S(Object[] objArr, int i, int i2) {
        objArr[i2] = String.valueOf(i);
    }

    public static void A1T(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }

    public static void A1U(Object[] objArr, int i, long j) {
        objArr[i] = Long.toString(j);
    }

    public static void A1V(Object[] objArr, int i, long j) {
        objArr[i] = String.valueOf(j);
    }

    public static boolean A1X(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }
}
