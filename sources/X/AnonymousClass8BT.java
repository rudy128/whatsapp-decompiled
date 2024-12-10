package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Base64;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.net.HttpURLConnection;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BT  reason: invalid class name */
public abstract class AnonymousClass8BT {
    public static int A01(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, -1);
    }

    public static int A02(Calendar calendar) {
        return calendar.get(5);
    }

    public static C29621ca A0Z(C29621ca r1, Object obj, String[] strArr) {
        strArr[0] = obj;
        return r1.A0K(strArr[0]);
    }

    public static C32711hd A0b() {
        return new C32711hd(0);
    }

    public static ArrayList A0z() {
        return new ArrayList(1);
    }

    public static List A10(Object obj) {
        return Arrays.asList(new String[]{obj});
    }

    public static byte[] A1a(String str) {
        return Base64.decode(str, 2);
    }

    public static int A03(JSONObject jSONObject) {
        return jSONObject.optString("__typename").hashCode();
    }

    public static AnonymousClass190 A09(C218817t r1) {
        AnonymousClass190 r12 = r1.A01;
        C18070vi.A0d(r12, 1);
        return r12;
    }

    public static C132216mP A0A(AnonymousClass10G r0) {
        return (C132216mP) r0.A4S.get();
    }

    public static C22416B6y A0B(AnonymousClass10E r0) {
        return (C22416B6y) r0.A8s.get();
    }

    public static AnonymousClass1NP A0C(SettingsGoogleDrive settingsGoogleDrive) {
        return (AnonymousClass1NP) settingsGoogleDrive.A0h.get();
    }

    public static C26911Ty A0D(AnonymousClass10E r0) {
        return (C26911Ty) r0.A1J.get();
    }

    public static AM5 A0E(AnonymousClass10G r0) {
        return (AM5) r0.A1V.get();
    }

    public static A2R A0F(C20135A8w a8w) {
        return (A2R) a8w.A0I.get();
    }

    public static AM6 A0G(C20135A8w a8w) {
        return (AM6) a8w.A0H.get();
    }

    public static AnonymousClass1KN A0H(Object obj, String str) {
        return AnonymousClass2TQ.A00(str, ((AnonymousClass1KK) obj).A01);
    }

    public static AnonymousClass1KI A0I(AnonymousClass10E r0) {
        return (AnonymousClass1KI) r0.A80.get();
    }

    public static AnonymousClass1D9 A0J(AnonymousClass10E r0) {
        return (AnonymousClass1D9) r0.A0n.get();
    }

    public static UserJid A0K(AnonymousClass206 r1) {
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r1.A0v.A00);
    }

    public static C1418477e A0L(AnonymousClass87L r3, Object obj) {
        return new C1418477e(r3, String.class, obj, "upiHandle");
    }

    public static AnonymousClass1OZ A0M(AnonymousClass91U r0) {
        return (AnonymousClass1OZ) r0.A0f.get();
    }

    public static C20029A3y A0N(A8W a8w) {
        return (C20029A3y) a8w.A0I.get();
    }

    public static AnonymousClass7CB A0O(AnonymousClass10G r0) {
        return (AnonymousClass7CB) r0.A0e.get();
    }

    public static C20131A8r A0P(AnonymousClass10E r0) {
        return (C20131A8r) r0.A7I.get();
    }

    public static AXS A0Q(AnonymousClass10E r0) {
        return (AXS) r0.A5F.get();
    }

    public static AnonymousClass1QL A0R(AnonymousClass10E r0) {
        return (AnonymousClass1QL) r0.A7z.get();
    }

    public static C33711jG A0S(AnonymousClass91U r0) {
        return (C33711jG) r0.A0g.get();
    }

    public static BD4 A0T(AnonymousClass10G r0) {
        return (BD4) r0.A0V.get();
    }

    public static C30931ek A0V(AnonymousClass10E r0) {
        return (C30931ek) r0.A81.get();
    }

    public static C20004A2u A0W(AnonymousClass10E r0) {
        return (C20004A2u) r0.A0v.get();
    }

    public static C29621ca A0a(C29621ca r2, AnonymousClass1MD[] r3) {
        return new C29621ca(r2, "iq", r3);
    }

    public static C32711hd A0c() {
        return new C32711hd(13);
    }

    public static C32711hd A0d() {
        return new C32711hd(16);
    }

    public static A8V A0e(AnonymousClass99S r0) {
        return (A8V) r0.A0U.get();
    }

    public static Object A0q(C1418477e r0) {
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static String A0t(C199029zJ r0, int i) {
        return (String) r0.A00.get(i);
    }

    public static String A0v(Object obj) {
        C18070vi.A0d(obj, 2);
        return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
    }

    public static String A0x(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static GCMParameterSpec A11(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    public static void A14(Context context, Uri uri, String str) {
        context.startActivity(new Intent(str, uri));
    }

    public static void A16(Context context, Class cls) {
        context.startActivity(new Intent(context, cls));
    }

    public static void A19(C23736Boh boh, E8A e8a, List list) {
        C25974Cph.A00(boh, new C199029zJ(list), e8a);
    }

    public static void A1A(RestoreFromBackupActivity restoreFromBackupActivity, String str) {
        restoreFromBackupActivity.A0j = str;
        restoreFromBackupActivity.invalidateOptionsMenu();
        restoreFromBackupActivity.A4f();
    }

    public static void A1B(AnonymousClass5ZL r1, String str, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C85524Ns(r1, str, i, z));
    }

    public static void A1C(C171228rN r1, Integer num, int i) {
        r1.A00 = num;
        r1.A01 = Integer.valueOf(i);
    }

    public static void A1E(Jid jid, C29591cX r2, String str) {
        r2.A04(new AnonymousClass1MD(jid, str));
    }

    public static void A1J(C29621ca r1, String str, AbstractCollection abstractCollection, AnonymousClass1MD[] r4) {
        abstractCollection.add(new C29621ca(r1, str, r4));
    }

    public static void A1K(AnonymousClass10I r1, Object obj, String str, int i) {
        r1.CGF(new C146817Qs(i, str, obj));
    }

    public static void A1L(C006302u r1) {
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public static void A1P(Object obj, C30391dr r2) {
        r2.resumeWith(new C30671eK(obj));
    }

    public static void A1Q(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C20245ADd(str, str2));
    }

    public static void A1R(String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(str, new ADJ(str, str2));
    }

    public static void A1S(String str, String str2, List list) {
        list.add(new AnonymousClass1MD(str, str2));
    }

    public static void A1T(String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass1MD(str, i));
    }

    public static void A1U(String str, AbstractCollection abstractCollection, long j) {
        abstractCollection.add(new AnonymousClass1MD(str, j));
    }

    public static boolean A1X(AnonymousClass91U r2) {
        return "p2m".equals(r2.A0t);
    }

    public static AnonymousClass1MD[] A1b(AbstractCollection abstractCollection, int i) {
        return (AnonymousClass1MD[]) abstractCollection.toArray(new AnonymousClass1MD[i]);
    }

    public static int A00(int i, double d) {
        return (i + AnonymousClass000.A0I(Double.doubleToLongBits(d))) * 31;
    }

    public static SharedPreferences.Editor A04(AnonymousClass1NP r0) {
        return r0.A07().edit();
    }

    public static SharedPreferences.Editor A05(C190139kR r0) {
        return r0.A00().edit();
    }

    public static Uri A06(Activity activity) {
        return activity.getIntent().getData();
    }

    public static E8A A07(List list, int i) {
        return ((C25488Cgj) list.get(i)).A00;
    }

    public static E8A A08(List list, int i) {
        Object obj = list.get(i);
        if (obj == null) {
            return null;
        }
        return ((C25488Cgj) obj).A00;
    }

    public static BD4 A0U(AnonymousClass1QS r0) {
        return r0.A06().BRb();
    }

    public static C166208cW A0X(C23624Bmt bmt) {
        bmt.A0E();
        C166208cW r1 = (C166208cW) bmt.A00;
        int i = C166208cW.CAPTION_FIELD_NUMBER;
        return r1;
    }

    public static C166298cf A0Y(C23624Bmt bmt) {
        bmt.A0E();
        return (C166298cf) bmt.A00;
    }

    public static AnonymousClass00H A0f(AnonymousClass10E r0) {
        return C000200d.A00(r0.A2n);
    }

    public static AnonymousClass00H A0g(AnonymousClass10E r0) {
        return C000200d.A00(r0.A08);
    }

    public static AnonymousClass00H A0h(AnonymousClass10E r0) {
        return C000200d.A00(r0.A74);
    }

    public static Integer A0i(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }

    public static Integer A0j(String str) {
        return Integer.valueOf(str.length());
    }

    public static Integer A0k(String str, JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(str));
    }

    public static Integer A0l(List list) {
        return Integer.valueOf(list.size());
    }

    public static Long A0m() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }

    public static Long A0n(AnonymousClass1Ez r1) {
        return Long.valueOf(r1.A02());
    }

    public static Long A0o(Number number) {
        return Long.valueOf(number.longValue());
    }

    public static Long A0p(TimeUnit timeUnit, long j) {
        return Long.valueOf(timeUnit.toSeconds(j));
    }

    public static Object A0r(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static Object A0s(Stack stack) {
        Object peek = stack.peek();
        C18070vi.A0X(peek);
        return peek;
    }

    public static String A0u(C29621ca r0, String str, String str2) {
        String A0Q = r0.A0Q(str, str2);
        C17960vV.A07(A0Q);
        return A0Q;
    }

    public static String A0w(HttpURLConnection httpURLConnection) {
        return AnonymousClass1EY.A00(httpURLConnection.getErrorStream());
    }

    public static StringBuilder A0y(String str, StringBuilder sb) {
        sb.append(str);
        return new StringBuilder();
    }

    public static JSONArray A12(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return new JSONArray();
    }

    public static void A13(ContentValues contentValues, String str, boolean z) {
        contentValues.put(str, Boolean.valueOf(z));
    }

    public static void A15(Context context, C73203Rj r1, Object[] objArr, int i) {
        r1.A0S(context.getString(i, objArr));
    }

    public static void A17(Handler handler, int i) {
        handler.obtainMessage(i).sendToTarget();
    }

    public static void A18(TextView textView, Fragment fragment, Object[] objArr, int i) {
        textView.setText(fragment.A1I(i, objArr));
    }

    public static void A1D(C436020e r1) {
        r1.A00();
        r1.A00 = true;
    }

    public static void A1F(C22941Dw r0, AnonymousClass206 r1, String str) {
        r1.A0d(r0.A04(str));
    }

    public static void A1G(AnonymousClass1QD r1, Object obj) {
        r1.A03().edit().putString("payments_setup_country_specific_info", obj.toString()).apply();
    }

    public static void A1H(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0v);
    }

    public static void A1I(C29621ca r1, Object obj, int i) {
        C18070vi.A0d(obj, i);
        C29621ca.A04(r1, "iq");
    }

    public static void A1M(Object obj) {
        Log.w(obj.toString());
    }

    public static void A1N(Object obj, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.put(str, obj);
        jSONObject2.put("variables", jSONObject);
    }

    public static void A1O(Object obj, Map map, long j) {
        map.put(obj, Long.valueOf(j));
    }

    public static void A1V(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", ");
    }

    public static void A1W(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", name=");
    }

    public static boolean A1Y(String str) {
        return str.equals(Voip.getCurrentCallId());
    }

    public static byte[] A1Z(C23624Bmt bmt) {
        return bmt.A0C().A0M();
    }
}
