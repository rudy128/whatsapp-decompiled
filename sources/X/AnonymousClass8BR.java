package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BaseBundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import com.whatsapp.voipcalling.CallInfo;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BR  reason: invalid class name */
public abstract class AnonymousClass8BR {
    public static C23581BmB A0F(byte[] bArr, int i) {
        return DSQ.A01(bArr, i, bArr.length);
    }

    public static void A1F(C25021Mo r1, C25041Mq r2, String str) {
        r1.A02 = str;
        r1.A00 = r2;
        r1.A04 = true;
    }

    public static Object[] A1a() {
        return new Object[3];
    }

    public static String[] A1b() {
        return new String[3];
    }

    public static double A00(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static int A02(long j) {
        return (int) (j >>> 32);
    }

    public static int A03(C166388co r0) {
        return r0.messageStubParameters_.size();
    }

    public static long A05(C18020vd r1, int i) {
        return (long) C18020vd.A00(C18040vf.A02, r1, i);
    }

    public static Intent A07(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static SharedPreferences.Editor A08(AnonymousClass1FU r0) {
        return C19830z4.A00(r0.A0A);
    }

    public static TelephonyManager A09(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static C19760yx A0B(Object obj, Object obj2) {
        return new C19760yx(obj, obj2);
    }

    public static C24071It A0C(C24051Ir r1, AnonymousClass1FD r2) {
        return new C24071It(r1, r2);
    }

    public static VersionedCapability A0E(C179289Hj r4, XplatAssetType xplatAssetType, String str, int i, int i2) {
        return new VersionedCapability(str, i, r4, i2, xplatAssetType);
    }

    public static UserJid A0X(String str) {
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A03(str);
    }

    public static C1418477e A0Y(AnonymousClass87L r1, Class cls, Object obj, String str) {
        return new C1418477e(r1, cls, obj, str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7Ik] */
    public static C144717Ik A0Z() {
        return new Object();
    }

    public static C20285AEt A0g(Object obj) {
        return ((AnonymousClass21K) obj).BPK();
    }

    public static AnonymousClass1MD A0h(String str, String str2) {
        return new AnonymousClass1MD(str, str2);
    }

    public static C29621ca A0j(C29621ca r1) {
        return r1.A0K("account");
    }

    public static C29621ca A0k(String str, AnonymousClass1MD[] r2) {
        return new C29621ca(str, r2);
    }

    public static C29621ca A0l(String str, AnonymousClass1MD[] r2, C29621ca[] r3) {
        return new C29621ca(str, r2, r3);
    }

    public static C48392Mh A0n(AnonymousClass205 r1, int i, long j) {
        return new C48392Mh(r1, i, j);
    }

    public static C32711hd A0o(int i) {
        return new C32711hd(i);
    }

    public static C32711hd A0p(String str, int i) {
        return new C32711hd(i, str);
    }

    public static CallInfo A0r(A99 a99) {
        return a99.A29.BO3();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2rm] */
    public static C62672rm A0s() {
        return new Object();
    }

    public static File A0t(AnonymousClass118 r0) {
        return r0.A00.getFilesDir();
    }

    public static File A0u(String str, String str2) {
        return new File(str, str2);
    }

    public static AssertionError A0v(Object obj) {
        return new AssertionError(obj);
    }

    public static RuntimeException A0w(String str) {
        return new RuntimeException(str);
    }

    public static RuntimeException A0x(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0y(BaseBundle baseBundle) {
        return baseBundle.getString("referral_screen");
    }

    public static String A0z(AnonymousClass1FU r0) {
        return r0.A0A.A0f();
    }

    public static ArrayList A11(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return AnonymousClass1ZU.A06(objArr);
    }

    public static HashSet A12(Collection collection) {
        return new HashSet(collection);
    }

    public static Iterator A13(Object obj) {
        return ((List) obj).iterator();
    }

    public static LinkedList A14() {
        return new LinkedList();
    }

    public static List A15(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.asList(objArr);
    }

    public static ConcurrentHashMap A17() {
        return new ConcurrentHashMap();
    }

    public static Cipher A18() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    public static IvParameterSpec A19(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    public static JSONArray A1A() {
        return new JSONArray();
    }

    public static void A1D(Intent intent, String str) {
        intent.putExtra("referral_screen", str);
    }

    public static void A1E(TextView textView, Object obj) {
        textView.setText((CharSequence) obj);
    }

    public static void A1I(Object obj) {
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
    }

    public static void A1J(byte[] bArr, byte[] bArr2, int i, int i2) {
        bArr2[i2] = bArr[i & 63];
    }

    public static void A1K(Object[] objArr, int i, int i2, Object obj) {
        objArr[i] = obj;
        objArr[i2] = "#elementValue";
    }

    public static boolean A1M(AnonymousClass1FY r2) {
        if (r2.A07.A00(false) == 8) {
            return true;
        }
        return false;
    }

    public static boolean A1N(AnonymousClass1FY r2) {
        if (r2.A07.A00(false) == 15) {
            return true;
        }
        return false;
    }

    public static boolean A1O(AnonymousClass1FY r2) {
        if (r2.A07.A00(false) == 17) {
            return true;
        }
        return false;
    }

    public static boolean A1P(AnonymousClass91U r0) {
        return r0.A0K.A0D();
    }

    public static boolean A1Q(C29621ca r1, C62672rm r2) {
        return r2.A09(r1, "iq");
    }

    public static boolean A1R(C29621ca r1, C62672rm r2) {
        return r2.A09(r1, "error");
    }

    public static boolean A1U(String str) {
        return str.equals("sms");
    }

    public static boolean A1V(String str) {
        return str.equals("flash");
    }

    public static boolean A1W(String str) {
        return str.equals("wa_old");
    }

    public static boolean A1X(String str) {
        return str.equals("email_otp");
    }

    public static byte[] A1Z(String str) {
        return str.getBytes(C19620yd.A0A);
    }

    public static float A01(Context context, float f) {
        return (float) C62762rw.A01(context, f);
    }

    public static long A04(long j) {
        return System.currentTimeMillis() - j;
    }

    public static long A06(AbstractCollection abstractCollection) {
        return (long) abstractCollection.size();
    }

    public static LinearLayout A0A(View view, int i) {
        return (LinearLayout) view.findViewById(i);
    }

    public static A7W A0D(C18150vq r0) {
        return (A7W) r0.get();
    }

    public static DFL A0G(List list, int i) {
        return (DFL) list.get(i);
    }

    public static TextEmojiLabel A0H(AnonymousClass01E r0, int i) {
        return (TextEmojiLabel) r0.findViewById(i);
    }

    public static C19990A2d A0I(Iterator it) {
        return (C19990A2d) it.next();
    }

    public static C194209rM A0J(Iterator it) {
        return (C194209rM) it.next();
    }

    public static C20136A8x A0K(AnonymousClass00H r0) {
        return (C20136A8x) r0.get();
    }

    public static C195369tE A0L(AnonymousClass00H r0) {
        return (C195369tE) r0.get();
    }

    public static C32991i5 A0M(AnonymousClass00H r0) {
        return (C32991i5) r0.get();
    }

    public static C58842lL A0N(AnonymousClass00H r0) {
        return (C58842lL) r0.get();
    }

    public static AnonymousClass1QR A0O(AnonymousClass1QS r0) {
        AnonymousClass1QS.A00(r0);
        return r0.A04;
    }

    public static C20284AEs A0P(Iterator it) {
        return (C20284AEs) it.next();
    }

    public static C20284AEs A0Q(List list, int i) {
        return (C20284AEs) list.get(i);
    }

    public static AnonymousClass1KH A0R(AnonymousClass1QS r0) {
        AnonymousClass1QS.A00(r0);
        return r0.A05;
    }

    public static A5U A0S(AnonymousClass00H r0) {
        return (A5U) r0.get();
    }

    public static C172058si A0T(AnonymousClass00H r0) {
        return (C172058si) r0.get();
    }

    public static C172048sh A0U(AnonymousClass00H r0) {
        return (C172048sh) r0.get();
    }

    public static C20081A6h A0V(AnonymousClass00H r0) {
        return (C20081A6h) r0.get();
    }

    public static C192579od A0W(AnonymousClass00H r0) {
        return (C192579od) r0.get();
    }

    public static C33711jG A0a(AnonymousClass00H r0) {
        return (C33711jG) r0.get();
    }

    public static C194009r1 A0b(AnonymousClass00H r0) {
        return (C194009r1) r0.get();
    }

    public static A56 A0c(AnonymousClass00H r0) {
        return (A56) r0.get();
    }

    public static PollCreatorViewModel A0d(C18100vl r0) {
        return (PollCreatorViewModel) r0.getValue();
    }

    public static C166418cr A0e(C23624Bmt bmt) {
        return (C166418cr) bmt.A0C();
    }

    public static AnonymousClass8X7 A0f(C23577Bm6 bm6) {
        return (AnonymousClass8X7) bm6.A0O();
    }

    public static C194599rz A0i(AnonymousClass206 r0) {
        return r0.A0L().A00;
    }

    public static C29621ca A0m(AbstractList abstractList, int i) {
        return (C29621ca) abstractList.get(i);
    }

    public static A8V A0q(AnonymousClass00H r0) {
        return (A8V) r0.get();
    }

    public static String A10(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static Map A16(List list, int i) {
        return (Map) list.get(i);
    }

    public static JSONObject A1B(JSONArray jSONArray, int i) {
        return (JSONObject) jSONArray.get(i);
    }

    public static AnonymousClass8Do A1C(AbstractList abstractList, int i) {
        return (AnonymousClass8Do) abstractList.get(i);
    }

    public static void A1G(C171878sQ r1, int i) {
        r1.A0b = Integer.valueOf(i);
    }

    public static void A1H(C171858sO r1, Object obj) {
        r1.A0Z = obj.toString();
    }

    public static void A1L(Object[] objArr, int i, boolean z) {
        objArr[i] = Boolean.valueOf(z);
    }

    public static boolean A1S(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static boolean A1T(Object obj, Object obj2) {
        return !C18070vi.A18(obj, obj2);
    }

    public static boolean A1Y(Map map) {
        return !map.isEmpty();
    }
}
