package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BS  reason: invalid class name */
public abstract class AnonymousClass8BS {
    public static Object A0Y(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static String A0e(AnonymousClass11S r1, AnonymousClass11P r2) {
        return AnonymousClass1PP.A00(r1, r2, false);
    }

    public static String A0o(String str, int i) {
        return str.substring(0, i);
    }

    public static void A1A(C29621ca r2, String[] strArr) {
        C29601cY.A00(r2, strArr).get(0);
    }

    public static void A1B(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static boolean A1O(String str, long j, long j2) {
        return C29601cY.A04(str, j, j2, false);
    }

    public static Object[] A1R(int i) {
        Object[] objArr = new Object[i];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static String[] A1S(int i) {
        String[] strArr = new String[i];
        strArr[0] = "code";
        return strArr;
    }

    public static String[] A1T(int i) {
        String[] strArr = new String[i];
        strArr[0] = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        return strArr;
    }

    public static String[] A1U(int i) {
        String[] strArr = new String[i];
        strArr[0] = "text";
        return strArr;
    }

    public static String[] A1V(int i) {
        String[] strArr = new String[i];
        strArr[0] = "#elementValue";
        return strArr;
    }

    public static long A01(AnonymousClass1FY r1) {
        return AnonymousClass11P.A01(r1.A05);
    }

    public static Intent A03(Context context) {
        return new Intent(context, BrazilPayBloksActivity.class);
    }

    public static Intent A04(Context context) {
        return new Intent(context, IndiaUpiPaymentsAccountSetupActivity.class);
    }

    public static C170318pf A0C(AW0 aw0) {
        AnonymousClass8pG r0 = aw0.A0A;
        C17960vV.A07(r0);
        return (C170318pf) r0;
    }

    public static C166368cm A0I(C166418cr r0) {
        C166368cm r02 = r0.protocolMessage_;
        if (r02 == null) {
            return C166368cm.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static C165868bt A0K(C166348ck r0) {
        C165868bt r02 = r0.hydratedTemplate_;
        if (r02 == null) {
            return C165868bt.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static C29621ca A0Q(C29621ca r1, String[] strArr, int i) {
        return r1.A0K(strArr[i]);
    }

    public static C29591cX A0R() {
        return new C29591cX("account");
    }

    public static C29591cX A0S() {
        return new C29591cX("message");
    }

    public static Integer A0U() {
        return 10;
    }

    public static Integer A0V() {
        return 51;
    }

    public static String A0b(int i) {
        if (i != 0) {
            return "1";
        }
        return "0";
    }

    public static String A0f(AnonymousClass118 r0, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return r0.A02(i2, objArr);
    }

    public static String A0h(C1418477e r0) {
        Object obj = r0.A00;
        C17960vV.A07(obj);
        return (String) obj;
    }

    public static String A0j(Object obj) {
        String str = ((AnonymousClass1KL) obj).A06;
        C18070vi.A0W(str);
        return str;
    }

    public static String A0l(Object obj, String str, Object[] objArr, int i) {
        objArr[i] = obj;
        return String.format(str, objArr);
    }

    public static String A0n(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static SimpleDateFormat A0q(String str) {
        return new SimpleDateFormat(str, Locale.US);
    }

    public static SecretKeySpec A0v(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static void A18(C1193567u r1, Object obj, int i) {
        r1.A00 = new C21728Are(obj, i);
    }

    public static void A1H(String str, AnonymousClass1MD[] r2, Object[] objArr, int i) {
        objArr[i] = new C29621ca(str, r2);
    }

    public static boolean A1L(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 450);
    }

    public static boolean A1M(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 842);
    }

    public static boolean A1N(C18020vd r2) {
        return C18020vd.A05(C18040vf.A02, r2, 1319);
    }

    public static String[] A1W(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        return strArr;
    }

    public static String[] A1X(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = "to";
        return strArr;
    }

    public static String[] A1Y(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = "jid";
        return strArr;
    }

    public static String[] A1Z(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = "from";
        return strArr;
    }

    public static String[] A1a(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        return strArr;
    }

    public static String[] A1b(int i, int i2) {
        String[] strArr = new String[i];
        strArr[i2] = "error";
        return strArr;
    }

    public static int A00(String str) {
        C18070vi.A0X(str);
        return str.length();
    }

    public static Context A02(Context context) {
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        return applicationContext;
    }

    public static Intent A05(AnonymousClass1FY r0, int i) {
        r0.setContentView(i);
        return r0.getIntent();
    }

    public static View A06(View view) {
        return AnonymousClass1HF.A06(view, 2131429132);
    }

    public static C23624Bmt A07(C23577Bm6 bm6) {
        C23624Bmt A0O = bm6.A0O();
        A0O.A0E();
        return A0O;
    }

    public static C23624Bmt A08(C23577Bm6 bm6) {
        C23624Bmt A0N = bm6.A0N();
        A0N.A0E();
        return A0N;
    }

    public static C23577Bm6 A09(C23624Bmt bmt, C23624Bmt bmt2) {
        C23577Bm6 A0C = bmt.A0C();
        bmt2.A0E();
        return A0C;
    }

    public static AnonymousClass1NP A0A(AnonymousClass00H r0) {
        return (AnonymousClass1NP) r0.get();
    }

    public static C20287AEv A0B(Iterator it) {
        return (C20287AEv) it.next();
    }

    public static C166278cd A0D(C23624Bmt bmt) {
        bmt.A0E();
        return (C166278cd) bmt.A00;
    }

    public static C166138cP A0E(C23624Bmt bmt) {
        bmt.A0E();
        C166138cP r1 = (C166138cP) bmt.A00;
        int i = C166138cP.ACCESSIBILITY_LABEL_FIELD_NUMBER;
        return r1;
    }

    public static C166258cb A0F(C23624Bmt bmt) {
        bmt.A0E();
        return (C166258cb) bmt.A00;
    }

    public static C166268cc A0G(C23624Bmt bmt) {
        bmt.A0E();
        C166268cc r1 = (C166268cc) bmt.A00;
        int i = C166268cc.ACCESSIBILITY_LABEL_FIELD_NUMBER;
        return r1;
    }

    public static C166368cm A0H(C23624Bmt bmt) {
        bmt.A0E();
        return (C166368cm) bmt.A00;
    }

    public static C166218cX A0J(C23624Bmt bmt) {
        bmt.A0E();
        C166218cX r1 = (C166218cX) bmt.A00;
        int i = C166218cX.ACCESSIBILITY_LABEL_FIELD_NUMBER;
        return r1;
    }

    public static C166248ca A0L(C23624Bmt bmt) {
        bmt.A0E();
        C166248ca r1 = (C166248ca) bmt.A00;
        int i = C166248ca.ACCESSIBILITY_LABEL_FIELD_NUMBER;
        return r1;
    }

    public static C166418cr A0M(C23624Bmt bmt) {
        bmt.A0E();
        return (C166418cr) bmt.A00;
    }

    public static C166198cV A0N(C23624Bmt bmt) {
        bmt.A0E();
        return (C166198cV) bmt.A00;
    }

    public static C166378cn A0O(C23624Bmt bmt) {
        bmt.A0E();
        return (C166378cn) bmt.A00;
    }

    public static C166388co A0P(C23624Bmt bmt) {
        bmt.A0E();
        return (C166388co) bmt.A00;
    }

    public static File A0T(Iterator it) {
        return (File) it.next();
    }

    public static Object A0W(AnonymousClass1DS r0) {
        Object A06 = r0.A06();
        C17960vV.A07(A06);
        return A06;
    }

    public static Object A0X(Object obj, String str, Map map) {
        Object obj2 = map.get(obj);
        C18070vi.A0z(obj2, str);
        return obj2;
    }

    public static Object A0Z(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        C18070vi.A0X(obj);
        return obj;
    }

    public static Object A0a(C18140vp r0) {
        Object obj = r0.get();
        C18070vi.A0X(obj);
        return obj;
    }

    public static String A0c(Cursor cursor, int i) {
        String string = cursor.getString(i);
        C18070vi.A0X(string);
        return string;
    }

    public static String A0d(C23624Bmt bmt, Jid jid) {
        String rawString = jid.getRawString();
        bmt.A0E();
        return rawString;
    }

    public static String A0g(Jid jid, String str, StringBuilder sb) {
        sb.append(str);
        return jid.getRawString();
    }

    public static String A0i(File file) {
        String name = file.getName();
        C18070vi.A0X(name);
        return name;
    }

    public static String A0k(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static String A0m(String str) {
        String A01 = A5Z.A01(str);
        C18070vi.A0X(A01);
        return A01;
    }

    public static String A0p(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        return lowerCase;
    }

    public static Iterator A0r(List list) {
        C18070vi.A0X(list);
        return list.iterator();
    }

    public static Iterator A0s(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        C18070vi.A0X(keys);
        return keys;
    }

    public static List A0t(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static Map A0u(Object obj, Map map) {
        return (Map) map.get(obj);
    }

    public static JSONObject A0w(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        C18070vi.A0X(jSONObject2);
        return jSONObject2;
    }

    public static void A0x() {
        Thread.currentThread().interrupt();
    }

    public static void A0y(Animator.AnimatorListener animatorListener, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setListener(animatorListener).start();
    }

    public static void A0z(Activity activity, int i, int i2) {
        C110885hR.A0A(activity, i).setVisibility(i2);
    }

    public static void A10(Context context, ImageView imageView, int i) {
        AnonymousClass4aX.A0D(imageView, C19740yt.A00(context, i));
    }

    public static void A11(Context context, AnonymousClass4VU r1, int i) {
        r1.A04(context.getString(i));
    }

    public static void A12(Context context, AnonymousClass4VU r1, int i) {
        r1.A02(context.getString(i));
    }

    public static void A13(Intent intent, Intent intent2, String str) {
        intent2.putExtra(str, intent.getStringExtra(str));
    }

    public static void A14(Resources resources, TextView textView, int i) {
        textView.setTextColor(resources.getColor(i));
    }

    public static void A15(View view, CharSequence charSequence, int i) {
        C23520Bik.A02(view, charSequence, i).A08();
    }

    public static void A16(TextView textView, Fragment fragment, int i) {
        textView.setText(fragment.A14().getResources().getText(i));
    }

    public static void A17(AnonymousClass190 r1, String str, Throwable th, boolean z) {
        r1.A0G(str, th.getMessage(), z);
    }

    public static void A19(AnonymousClass1QE r1, Object obj) {
        r1.A06(obj.toString());
    }

    public static void A1C(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj.toString());
    }

    public static void A1D(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
    }

    public static void A1E(Object obj, Map map, Map map2) {
        map2.put(obj, map.get(obj));
    }

    public static void A1F(String str, String str2) {
        Log.e(AnonymousClass1QE.A01(str, str2));
    }

    public static void A1G(String str, String str2) {
        Log.i(AnonymousClass1QE.A01(str, str2));
    }

    public static void A1I(StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
    }

    public static void A1J(Iterator it, JSONArray jSONArray) {
        jSONArray.put(it.next());
    }

    public static void A1K(byte[] bArr) {
        C18070vi.A0X(Arrays.toString(bArr));
    }

    public static byte[] A1P(DSQ dsq) {
        byte[] A06 = dsq.A06();
        C18070vi.A0X(A06);
        return A06;
    }

    public static byte[] A1Q(Key key, AlgorithmParameterSpec algorithmParameterSpec, Cipher cipher, byte[] bArr, int i) {
        cipher.init(i, key, algorithmParameterSpec);
        return cipher.doFinal(bArr);
    }
}
