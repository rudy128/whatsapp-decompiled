package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.text.Format;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BW  reason: invalid class name */
public abstract class AnonymousClass8BW {
    public static int A01(C29621ca r1) {
        C18070vi.A0d(r1, 1);
        return C60482o6.A00(r1);
    }

    public static C25031Mp A0H(C25021Mo r1, C25041Mq r2, String str) {
        r1.A02 = str;
        r1.A00 = r2;
        r1.A0E(0);
        return r1.A0B();
    }

    public static C29621ca A0Q(C29621ca r2, Object obj, AnonymousClass1MD[] r4) {
        r4[4] = obj;
        return new C29621ca(r2, "iq", r4);
    }

    public static String A0d(Jid jid) {
        C18070vi.A0d(jid, 0);
        return jid.getRawString();
    }

    public static String A0e(C29621ca r2, String str) {
        C29621ca A0K = r2.A0K(str);
        if (A0K != null) {
            return A0K.A0M();
        }
        return null;
    }

    public static String A0f(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static ArrayList A0q(C26331Rs r1, String str) {
        return C29431cG.A0m(C26331Rs.A03(r1, str, true));
    }

    public static Map A0v(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public static void A1K(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static void A1P(List list, List list2, int i, int i2) {
        list2.addAll(list.subList(0, Math.min(i, i2)));
    }

    public static boolean A1Q(int i) {
        return (i & 1) != 0;
    }

    public static Object[] A1X() {
        Object[] objArr = new Object[2];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1Y() {
        Object[] objArr = new Object[3];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1Z() {
        Object[] objArr = new Object[4];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1a() {
        Object[] objArr = new Object[5];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1b() {
        Object[] objArr = new Object[6];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static int A02(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static long A05() {
        return TimeUnit.DAYS.toMillis(1);
    }

    public static long A06(C185759d6 r0, int i, long j) {
        if (i == 0) {
            return -1;
        }
        return j - r0.A01;
    }

    public static long A07(C18020vd r2, int i) {
        return ((long) C18020vd.A00(C18040vf.A02, r2, i)) * 60000;
    }

    public static Intent A09(Context context, Parcelable parcelable, Class cls) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_bank_account", parcelable);
        return intent;
    }

    public static SharedPreferences.Editor A0A(VoiceServiceEventCallback voiceServiceEventCallback) {
        return AnonymousClass1VE.A00(voiceServiceEventCallback.voiceService.A2A).edit();
    }

    public static AnonymousClass190 A0C(AnonymousClass10E r0) {
        return (AnonymousClass190) r0.A31.get();
    }

    public static CatalogManager A0F(C168648jP r0) {
        AnonymousClass00H r02 = r0.A0q;
        if (r02 != null) {
            return (CatalogManager) r02.get();
        }
        C18070vi.A11("catalogManager");
        throw null;
    }

    public static C171788sH A0J(int i) {
        C171788sH r1 = new C171788sH();
        r1.A0C = Integer.valueOf(i);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.87L] */
    public static C1418477e A0K(Object obj, String str) {
        return new C1418477e(new Object(), String.class, obj, str);
    }

    public static C165638bW A0M(C23624Bmt bmt) {
        C165638bW r0 = ((C166398cp) bmt.A00).header_;
        if (r0 == null) {
            return C165638bW.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public static C42661yX A0P(C29621ca r1) {
        return A8d.A04(r1, r1.A0K("description"));
    }

    public static A8V A0U(RegisterName registerName) {
        AnonymousClass00H r0 = registerName.A1E;
        if (r0 != null) {
            return (A8V) r0.get();
        }
        C18070vi.A11("funnelLogger");
        throw null;
    }

    public static BufferedReader A0V(File file) {
        return new BufferedReader(new FileReader(file));
    }

    public static BufferedReader A0W(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static Long A0Z(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return -9007199254740991L;
    }

    public static String A0c(AnonymousClass1FY r3) {
        return AnonymousClass1PP.A00(r3.A02, r3.A05, false);
    }

    public static String A0h(String str) {
        if (str.equals("")) {
            return null;
        }
        return str;
    }

    public static String A0i(String str) {
        Locale locale = Locale.US;
        C18070vi.A0Z(locale);
        String lowerCase = str.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        return lowerCase;
    }

    public static String A0j(String str) {
        Locale locale = Locale.US;
        C18070vi.A0Z(locale);
        String upperCase = str.toUpperCase(locale);
        C18070vi.A0X(upperCase);
        return upperCase;
    }

    public static String A0m(Map map) {
        String obj = new JSONObject(map).toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static StringBuilder A0n(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0o(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static List A0t(String str) {
        return Arrays.asList(str.split(","));
    }

    public static Map A0u() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C18070vi.A0X(synchronizedMap);
        return synchronizedMap;
    }

    public static JSONObject A0x(byte[] bArr) {
        return new JSONObject(new String(bArr, DefaultCrypto.UTF_8));
    }

    public static void A14(AnonymousClass01C r1, C006302u r2) {
        if (r2.A00 == null) {
            r2.A00 = r1.BQQ();
        }
    }

    public static void A1B(AnonymousClass1OZ r7, AnonymousClass1O5 r8, C29621ca r9, String str) {
        r7.A0I(r8, r9, str, 204, 0);
    }

    public static void A1C(C31061ex r6, AnonymousClass1O5 r7, C29621ca r8) {
        r6.A0I(r7, r8, "get", 0);
    }

    public static void A1E(C29591cX r1, C178759Ei r2) {
        if (r2 != null) {
            r1.A06((C29621ca) r2.A00);
        }
    }

    public static void A1F(C29591cX r1, String str, String str2, int i) {
        if (i != 0) {
            r1.A04(new AnonymousClass1MD(str, str2));
        }
    }

    public static void A1H(Object obj, Object obj2) {
        C18070vi.A0d(obj, 10);
        C18070vi.A0d(obj2, 11);
    }

    public static void A1I(Object obj, Object obj2) {
        C18070vi.A0d(obj, 13);
        C18070vi.A0d(obj2, 14);
    }

    public static void A1J(Object obj, Object obj2) {
        C18070vi.A0d(obj, 20);
        C18070vi.A0d(obj2, 21);
    }

    public static void A1L(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = new AnonymousClass1D6(obj, obj2);
    }

    public static void A1O(Key key, Cipher cipher, byte[] bArr) {
        cipher.init(2, key, new IvParameterSpec(bArr));
    }

    public static boolean A1R(UserFlowLoggerImpl userFlowLoggerImpl, long j) {
        return userFlowLoggerImpl.mOngoingFlows.contains(Long.valueOf(j));
    }

    public static boolean A1S(C1418477e r0) {
        Object obj = r0.A00;
        C17960vV.A07(obj);
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1U(Object obj, Object obj2) {
        return C18070vi.A18(((C20253ADl) obj).A01.A02, obj2);
    }

    public static double A00(AtomicReference atomicReference) {
        return ((Number) atomicReference.get()).doubleValue();
    }

    public static int A03(String str, int i, int i2) {
        return (i2 + str.hashCode() + i) * 31;
    }

    public static int A04(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        String string = jSONArray.getString(i);
        C18070vi.A0X(string);
        abstractCollection.add(string);
        return i + 1;
    }

    public static long A08(String str) {
        return Long.parseLong(str) * 1000;
    }

    public static C23581BmB A0B(C23624Bmt bmt, String str, int i) {
        byte[] decode = Base64.decode(str, i);
        C23581BmB A01 = DSQ.A01(decode, i, decode.length);
        bmt.A0E();
        return A01;
    }

    public static C73203Rj A0D(Context context) {
        C73203Rj A00 = AnonymousClass4a6.A00(context);
        A00.A0E(2131886637);
        return A00;
    }

    public static C73203Rj A0E(Context context) {
        C73203Rj A00 = AnonymousClass4a6.A00(context);
        A00.A0T(false);
        return A00;
    }

    public static A6S A0G(A6S a6s, String str) {
        if (!TextUtils.isEmpty(str)) {
            return new A6S(str);
        }
        return a6s;
    }

    public static PromptDialogFragment A0I(Context context, AnonymousClass4VU r1, int i) {
        r1.A03(context.getString(i));
        return r1.A00();
    }

    public static C166278cd A0L(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C166278cd r0 = (C166278cd) bmt.A00;
        obj.getClass();
        return r0;
    }

    public static C165828bp A0N(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C165828bp r0 = (C165828bp) bmt.A00;
        obj.getClass();
        return r0;
    }

    public static C166378cn A0O(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C166378cn r1 = (C166378cn) bmt.A00;
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        obj.getClass();
        return r1;
    }

    public static C29621ca A0R(Iterator it, int i) {
        C29621ca r0 = (C29621ca) it.next();
        C18070vi.A0b(r0);
        C18070vi.A0d(r0, i);
        return r0;
    }

    public static AnonymousClass1T8 A0S(int i) {
        return new AnonymousClass1T8(Integer.valueOf(i), (String) null);
    }

    public static C33641j9 A0T(AnonymousClass10E r0) {
        return (C33641j9) r0.Am6.get();
    }

    public static File A0X(File file, String str, StringBuilder sb) {
        sb.append(str);
        return new File(file, sb.toString());
    }

    public static Double A0Y(double d) {
        return Double.valueOf(d);
    }

    public static NullPointerException A0a(C19880zA r1) {
        r1.A03();
        return new NullPointerException("logOnboardingClickEvent");
    }

    public static String A0b(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static String A0g(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static String A0k(String str, StringBuilder sb) {
        sb.append(str);
        return AnonymousClass1Y7.A01(sb.toString());
    }

    public static String A0l(String str, StringBuilder sb, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static AbstractMap A0p(Activity activity) {
        return (AbstractMap) activity.getIntent().getSerializableExtra("screen_params");
    }

    public static Iterator A0r(C29621ca r0, String str) {
        List A0R = r0.A0R(str);
        C18070vi.A0X(A0R);
        return A0R.iterator();
    }

    public static Iterator A0s(C18100vl r0) {
        return ((List) r0.getValue()).iterator();
    }

    public static JSONObject A0w(String str, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new JSONObject();
        }
        return optJSONObject;
    }

    public static void A0y(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
    }

    public static void A0z(Context context, Resources resources, TextView textView, int i, int i2) {
        textView.setTextColor(resources.getColor(AnonymousClass1YL.A00(context, i, i2)));
    }

    public static void A10(Context context, ImageView imageView, int i) {
        C28081Yu.A00(ColorStateList.valueOf(C19740yt.A00(context, i)), imageView);
    }

    public static void A11(Context context, AnonymousClass4VU r1, int i) {
        r1.A00.putString("title", context.getString(i));
    }

    public static void A12(SharedPreferences sharedPreferences, String str, long j) {
        sharedPreferences.edit().putLong(str, j).apply();
    }

    public static void A13(TextView textView, Format format, long j) {
        textView.setText(format.format(Long.valueOf(j)));
    }

    public static void A15(ListPreference listPreference, String str) {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        listPreference.A0S(str);
        int A0R = listPreference.A0R(listPreference.A00);
        if (A0R < 0 || (charSequenceArr = listPreference.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr[A0R];
        }
        listPreference.A0H(charSequence);
    }

    public static void A16(A5Z a5z, String str, String str2, StringBuilder sb) {
        sb.append(str);
        a5z.A03(str2, sb.toString());
    }

    public static void A17(AnonymousClass1LC r0, String str, Object[] objArr, int i) {
        objArr[i] = r0.A00(str).toString();
    }

    public static void A18(C62562rb r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(C49842Sd.A00(r0));
    }

    public static void A19(C73203Rj r1) {
        r1.A0E(2131897425);
        r1.A0D(2131897424);
    }

    public static void A1A(B86 b86, AbstractCollection abstractCollection, JSONObject jSONObject, long j) {
        Object BFs = b86.BFs(jSONObject, j);
        if (BFs != null) {
            abstractCollection.add(BFs);
        }
    }

    public static void A1D(AnonymousClass1QE r1, StringBuilder sb, boolean z) {
        sb.append(z);
        r1.A06(sb.toString());
    }

    public static void A1G(OutputStream outputStream, Object obj) {
        outputStream.write(obj.toString().getBytes());
    }

    public static void A1M(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getName());
    }

    public static void A1N(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static boolean A1T(AnonymousClass00H r0) {
        return C20134A8u.A07((AnonymousClass1NP) r0.get());
    }

    public static boolean A1V(C18100vl r0) {
        return ((File) r0.getValue()).exists();
    }

    public static byte[] A1W(byte[] bArr, String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }
}
