package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BU  reason: invalid class name */
public abstract class AnonymousClass8BU {
    public static int A00(int i) {
        return i != 0 ? 2 : 0;
    }

    public static int A01(int i) {
        return i != 0 ? 2 : 3;
    }

    public static long A06(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public static C23581BmB A0A(C23624Bmt bmt, byte[] bArr, int i) {
        C23581BmB A01 = DSQ.A01(bArr, i, bArr.length);
        bmt.A0E();
        return A01;
    }

    public static AnonymousClass1T8 A0b(Integer num) {
        return new AnonymousClass1T8(num, (String) null);
    }

    public static String A0o(C29621ca r1) {
        if (r1 != null) {
            return r1.A0M();
        }
        return null;
    }

    public static void A1B(C60192nY r1, C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        r1.A08(a8l);
    }

    public static void A1C(BD4 bd4, Integer num, String str, String str2) {
        C17960vV.A07(bd4);
        bd4.BiL(num, str, str2, 1);
    }

    public static void A1J(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C29621ca(str, str2, (AnonymousClass1MD[]) null));
    }

    public static void A1L(Throwable th, Object[] objArr) {
        objArr[3] = th.getMessage();
        objArr[4] = "instance_key";
    }

    public static void A1O(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "id_";
    }

    public static void A1P(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "bitField0_";
    }

    public static boolean A1T(C29621ca r1, String str, String str2) {
        return str2.equals(r1.A0Q(str, (String) null));
    }

    public static boolean A1X(Object obj) {
        C18070vi.A0d(obj, 2);
        return true;
    }

    public static boolean A1a(String str, String[] strArr) {
        return str.equals(strArr[0]);
    }

    public static int A02(AnonymousClass1FY r1) {
        return r1.A07.A00(false);
    }

    public static AnonymousClass1NP A0B(RestoreFromBackupActivity restoreFromBackupActivity) {
        return (AnonymousClass1NP) restoreFromBackupActivity.A0d.get();
    }

    public static C20114A7x A0C(AnonymousClass10E r0) {
        return (C20114A7x) r0.A1q.get();
    }

    public static A8Q A0D(AnonymousClass10E r0) {
        return (A8Q) r0.A1p.get();
    }

    public static AnonymousClass12E A0E(AnonymousClass10E r0) {
        return (AnonymousClass12E) r0.A2k.get();
    }

    public static C24521Kq A0F(AnonymousClass10E r0) {
        return (C24521Kq) r0.ABc.get();
    }

    public static C32991i5 A0G(AnonymousClass10E r0) {
        return (C32991i5) r0.A7T.get();
    }

    public static AnonymousClass1KN A0H(Object obj, BigDecimal bigDecimal) {
        return new AnonymousClass1KN(bigDecimal, ((AnonymousClass1KK) obj).A01);
    }

    public static ARR A0I(JSONObject jSONObject) {
        return new C62222r3(jSONObject).A00();
    }

    public static AW0 A0J(AnonymousClass1QR r2, String str, String str2) {
        return r2.A0N(str, str2, -1);
    }

    public static AnonymousClass1OZ A0K(AnonymousClass10E r0) {
        return (AnonymousClass1OZ) r0.A6N.get();
    }

    public static AnonymousClass1XN A0L(AnonymousClass10G r0) {
        return (AnonymousClass1XN) r0.A0d.get();
    }

    public static C20752AXh A0M(AnonymousClass10G r0) {
        return (C20752AXh) r0.A2m.get();
    }

    public static C33711jG A0P(AnonymousClass91q r0) {
        return (C33711jG) r0.A0U.get();
    }

    public static AnonymousClass1QD A0Q(AnonymousClass10E r0) {
        return (AnonymousClass1QD) r0.A89.get();
    }

    public static C31061ex A0R(AnonymousClass10E r0) {
        return (C31061ex) r0.A8E.get();
    }

    public static A27 A0S(AnonymousClass10E r0) {
        return (A27) r0.A82.get();
    }

    public static AZ6 A0T(AnonymousClass10E r0) {
        return (AZ6) r0.A5D.get();
    }

    public static AZ9 A0U(AnonymousClass1QS r1) {
        AZ9 A05 = r1.A05("UPI");
        C17960vV.A07(A05);
        return A05;
    }

    public static AnonymousClass1R2 A0V(AnonymousClass10E r0) {
        return (AnonymousClass1R2) r0.A8L.get();
    }

    public static C166418cr A0W(C163988Xc r0) {
        C166418cr r02 = r0.message_;
        if (r02 == null) {
            return C166418cr.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static C166418cr A0X(Object obj) {
        C166418cr r1 = (C166418cr) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static C33841jT A0c(AnonymousClass10E r0) {
        return (C33841jT) r0.A9T.get();
    }

    public static A8V A0d(VerifyPhoneNumber verifyPhoneNumber) {
        return (A8V) verifyPhoneNumber.A18.get();
    }

    public static AnonymousClass11W A0e(AnonymousClass10E r0) {
        return (AnonymousClass11W) r0.ABB.get();
    }

    public static String A0n(ARR arr) {
        String str = ((AnonymousClass1KL) arr.A01).A06;
        C18070vi.A0W(str);
        return str;
    }

    public static String A0p(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static String A0q(StringBuilder sb) {
        sb.append(")");
        return sb.toString();
    }

    public static String A0r(DateFormat dateFormat, long j) {
        return dateFormat.format(new Date(j));
    }

    public static String A0s(Map map) {
        return new JSONObject(map).toString();
    }

    public static ArrayList A0u(C29621ca r6, C62672rm r7, C22470B9c b9c, String[] strArr) {
        return r7.A08(r6, b9c, strArr, 1, 1);
    }

    public static ArrayList A0v(File file, String str, List list) {
        return A8L.A01(new File(file, str), list);
    }

    public static List A0y(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static C18110vm A10(Object obj, int i) {
        return AnonymousClass1DF.A01(new C21727Ard(obj, i));
    }

    public static C27621Wu A11(C1193567u r1, Object obj, int i) {
        r1.A01 = new C21728Are(obj, i);
        return C27621Wu.A00;
    }

    public static JSONObject A12(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static void A1D(AnonymousClass21V r1, String str) {
        r1.A04 = AnonymousClass1EG.A0E(str, 65536);
    }

    public static void A1E(AnonymousClass10I r1, Object obj, Object obj2, String str, int i) {
        r1.CGF(new C146887Qz(obj, obj2, str, i));
    }

    public static void A1G(Object obj) {
        ((C23570Bly) obj).A03((Object) null);
    }

    public static void A1K(String str, AbstractCollection abstractCollection, AnonymousClass1MD[] r3, C29621ca[] r4) {
        abstractCollection.add(new C29621ca(str, r3, r4));
    }

    public static boolean A1R(AnonymousClass1QN r2) {
        return C18020vd.A05(C18040vf.A02, r2.A02, 7238);
    }

    public static boolean A1U(CallInfo callInfo, String str) {
        return str.equals(callInfo.callWaitingInfo.A04);
    }

    public static int A03(Object obj) {
        C18070vi.A0X(obj);
        return ((Number) obj).intValue();
    }

    public static int A04(String str, int i) {
        return Character.getNumericValue(str.charAt(i));
    }

    public static int A05(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(jSONArray.getString(i));
        return i + 1;
    }

    public static SharedPreferences.Editor A07(AnonymousClass1QD r0) {
        return r0.A03().edit();
    }

    public static SharedPreferences.Editor A08(C18010vc r0, String str) {
        return r0.A05(str).edit();
    }

    public static SpannableString A09(Context context, int i) {
        return new SpannableString(context.getString(i));
    }

    public static AnonymousClass8pS A0N(AnonymousClass1QE r0, Object obj, String str) {
        C17960vV.A08(obj, r0.A03(str));
        return (AnonymousClass8pS) obj;
    }

    public static C196079uQ A0O(AnonymousClass1QS r0) {
        return r0.A06().BWi();
    }

    public static C166408cq A0Y(C23624Bmt bmt) {
        C166408cq r0 = (C166408cq) bmt.A0C();
        r0.getClass();
        return r0;
    }

    public static C166408cq A0Z(C23624Bmt bmt, C23624Bmt bmt2) {
        C166408cq r0 = (C166408cq) bmt.A0C();
        bmt2.A0E();
        return r0;
    }

    public static C32711hd A0a(String str, int i) {
        Log.e(str);
        return new C32711hd(i);
    }

    public static File A0f(Context context, String str) {
        return new File(context.getFilesDir(), str);
    }

    public static Boolean A0g(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static Double A0h(String str, JSONObject jSONObject) {
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static Long A0k(BaseBundle baseBundle, String str) {
        return Long.valueOf(baseBundle.getLong(str));
    }

    public static Long A0l(AnonymousClass11P r1) {
        return Long.valueOf(AnonymousClass11P.A01(r1));
    }

    public static Long A0m(Date date) {
        return Long.valueOf(date.getTime());
    }

    public static ArrayList A0t(AnonymousClass1QS r0) {
        AnonymousClass1QS.A00(r0);
        return r0.A05.A0B();
    }

    public static ArrayList A0w(String str) {
        Log.i(str);
        return new ArrayList();
    }

    public static Iterator A0x(Map map) {
        return map.keySet().iterator();
    }

    public static Matcher A0z(CharSequence charSequence, String str) {
        return Pattern.compile(str).matcher(charSequence);
    }

    public static void A13(Intent intent, AnonymousClass1FU r2, String str, String str2) {
        intent.putExtra(str, str2);
        r2.A3q(intent, true);
    }

    public static void A14(Parcel parcel, Iterator it, int i) {
        parcel.writeParcelable((Parcelable) it.next(), i);
    }

    public static void A15(View view, int i, int i2) {
        AnonymousClass4aX.A0D((ImageView) view.findViewById(i), i2);
    }

    public static void A16(View view, View view2, View view3, int i) {
        view.setVisibility(i);
        view2.setVisibility(i);
        view3.setVisibility(i);
    }

    public static void A17(C003401n r1, int i) {
        r1.A0M(i);
        r1.A0W(true);
    }

    public static void A18(AnonymousClass01E r0, int i) {
        ((ViewStub) r0.findViewById(i)).inflate();
    }

    public static void A19(C34001jj r1, String str) {
        r1.A0H(str);
        r1.A00(false);
    }

    public static void A1A(C73203Rj r2) {
        r2.A0X((DialogInterface.OnClickListener) null, 2131898766);
    }

    public static void A1F(AnonymousClass00H r0) {
        ((C58712l8) r0.get()).A00();
    }

    public static void A1H(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 7);
    }

    public static void A1I(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 18);
    }

    public static void A1M(AbstractList abstractList, int i) {
        ((View) abstractList.get(i)).requestFocus();
    }

    public static void A1N(AbstractMap abstractMap, int i) {
        abstractMap.put("error_code", String.valueOf(i));
    }

    public static void A1Q(Object[] objArr, boolean z) {
        objArr[2] = Boolean.valueOf(z);
    }

    public static boolean A1S(C20285AEt aEt, String str) {
        return str.equals(aEt.A00());
    }

    public static boolean A1V(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }

    public static boolean A1W(Object obj) {
        C18070vi.A0b(obj);
        C18070vi.A0d(obj, 0);
        return false;
    }

    public static boolean A1Y(String str, int i) {
        return Character.isDigit(str.charAt(i));
    }

    public static boolean A1b(Object[] objArr, int i) {
        objArr[1] = Integer.valueOf(i);
        return true;
    }

    public static Long A0i() {
        return -9007199254740991L;
    }

    public static Long A0j() {
        return 9007199254740991L;
    }

    public static boolean A1Z(String str, long j, boolean z) {
        return C29601cY.A04(str, j, 9007199254740991L, z);
    }
}
