package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.preference.Preference;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BV  reason: invalid class name */
public abstract class AnonymousClass8BV {
    public static Object A0m(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        return C200510q.A01(obj, map);
    }

    public static Calendar A0x(long j) {
        Calendar A07 = A8Y.A07((Calendar) null);
        A07.setTimeInMillis(j);
        return A07;
    }

    public static short A0z(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 0;
    }

    public static short A10(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 1;
    }

    public static void A16(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        parcel.readInt();
    }

    public static void A1A(DSQ dsq, C693536w r3) {
        r3.A09 = Base64.encodeToString(dsq.A06(), 2);
    }

    public static boolean A1T(Object obj, Object obj2, int i) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(obj2, i);
        return false;
    }

    public static boolean A1U(String str, long j) {
        return C29601cY.A04(str, j, 35, false);
    }

    public static boolean A1Z(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    public static Object[] A1b(Object obj) {
        return new Object[]{obj};
    }

    public static int A00(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static C20114A7x A0B(C168648jP r0) {
        AnonymousClass00H r02 = r0.A0n;
        if (r02 != null) {
            return (C20114A7x) r02.get();
        }
        C18070vi.A11("catalogCacheManager");
        throw null;
    }

    public static AnonymousClass1CJ A0C(AnonymousClass10E r0) {
        return (AnonymousClass1CJ) r0.A2H.get();
    }

    public static C63262sm A0E() {
        return new C63262sm("group_response", 3);
    }

    public static C693536w A0M(C49572Qz r3) {
        return new C693536w(r3, -1);
    }

    public static AnonymousClass1PQ A0N(AnonymousClass10E r0) {
        return (AnonymousClass1PQ) r0.AAn.get();
    }

    public static Double A0Q() {
        return Double.valueOf(0.0d);
    }

    public static Long A0a() {
        return -1L;
    }

    public static Long A0b() {
        return 10L;
    }

    public static Long A0c() {
        return 20L;
    }

    public static Long A0d() {
        return 32L;
    }

    public static Long A0e() {
        return 50L;
    }

    public static Long A0f() {
        return 100L;
    }

    public static Long A0g() {
        return 200L;
    }

    public static Long A0h() {
        return 400L;
    }

    public static Long A0i() {
        return 500L;
    }

    public static Long A0j() {
        return 1000L;
    }

    public static Long A0k() {
        return 1024L;
    }

    public static Long A0l() {
        return 10000L;
    }

    public static String A0s(String str, String str2) {
        return AnonymousClass1YE.A07(str, str2, "", false);
    }

    public static String A0t(String str, JSONArray jSONArray, int i) {
        return ((JSONObject) jSONArray.get(i)).optString(str, "");
    }

    public static URLConnection A0v(String str) {
        return new URL(str).openConnection();
    }

    public static Iterator A0y(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static void A1C(A6Z a6z, C22515BAy bAy) {
        if (bAy != null) {
            bAy.onError(C181499Qs.A00(a6z));
        }
    }

    public static void A1G(C29591cX r1, C178749Eh r2) {
        if (r2 != null) {
            r1.A06((C29621ca) r2.A00);
        }
    }

    public static void A1M(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass1MD(str, str2);
    }

    public static void A1N(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass1MD(str, str2);
    }

    public static void A1O(String str, String str2, Object[] objArr) {
        objArr[3] = new AnonymousClass1MD(str, str2);
    }

    public static void A1P(DateFormat dateFormat) {
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static boolean A1V(String str, long j, boolean z) {
        return C29601cY.A04(str, j, 10, z);
    }

    public static boolean A1W(String str, long j, boolean z) {
        return C29601cY.A04(str, j, 100, z);
    }

    public static boolean A1X(String str, long j, boolean z) {
        return C29601cY.A04(str, j, 255, z);
    }

    public static boolean A1Y(String str, long j, boolean z) {
        return C29601cY.A04(str, j, 1000, z);
    }

    public static byte[] A1a(int i) {
        byte[] bArr = new byte[i];
        C22691Cv.A00().nextBytes(bArr);
        return bArr;
    }

    public static int A01(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static int A02(AnonymousClass00H r0) {
        return ((AnonymousClass1NP) r0.get()).A03();
    }

    public static int A03(Number number) {
        C17960vV.A07(number);
        C18070vi.A0X(number);
        return number.intValue();
    }

    public static int A04(Map.Entry entry) {
        return ((Number) entry.getKey()).intValue();
    }

    public static long A05(AnonymousClass00H r1) {
        return ((AnonymousClass11Z) r1.get()).A02();
    }

    public static SharedPreferences.Editor A06(AnonymousClass00H r0) {
        return ((SharedPreferences) r0.get()).edit();
    }

    public static View A07(AnonymousClass01E r0, int i) {
        return ((ViewStub) r0.findViewById(i)).inflate();
    }

    public static C19760yx A08(Object obj, int i) {
        return new C19760yx(Integer.valueOf(i), obj);
    }

    public static LatLng A09(Number number, double d) {
        return new LatLng(d, number.doubleValue());
    }

    public static C19880zA A0A(AnonymousClass10E r0) {
        return (C19880zA) r0.A7g.get();
    }

    public static C171858sO A0D(BD4 bd4, int i) {
        C171858sO BHN = bd4.BHN();
        BHN.A08 = Integer.valueOf(i);
        return BHN;
    }

    public static UserJid A0F(UserJid userJid, AnonymousClass00H r2) {
        return ((AnonymousClass4S5) r2.get()).A00(userJid);
    }

    public static AnonymousClass1QJ A0G(AnonymousClass10E r0) {
        return (AnonymousClass1QJ) r0.A8F.get();
    }

    public static C189549jQ A0H(AnonymousClass10E r0) {
        return (C189549jQ) r0.ATO.get();
    }

    public static C165898bw A0I(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C165898bw r0 = (C165898bw) bmt.A00;
        obj.getClass();
        return r0;
    }

    public static C166418cr A0J(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C166418cr r0 = (C166418cr) bmt.A00;
        obj.getClass();
        return r0;
    }

    public static AnonymousClass206 A0K(C20077A6d a6d, AnonymousClass00H r2) {
        return ((AnonymousClass12N) r2.get()).A00(a6d);
    }

    public static AnonymousClass205 A0L(AnonymousClass205 r1, AnonymousClass00H r2) {
        return ((C59392mE) r2.get()).A01(r1);
    }

    public static A6X A0O(AnonymousClass10E r0) {
        return (A6X) r0.Abm.get();
    }

    public static WDSTextLayout A0P(Activity activity) {
        return (WDSTextLayout) C110885hR.A0A(activity, 2131431182);
    }

    public static Integer A0R(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 26;
    }

    public static Integer A0S(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 27;
    }

    public static Integer A0T(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 28;
    }

    public static Integer A0U(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 29;
    }

    public static Integer A0V(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 32;
    }

    public static Integer A0W(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 33;
    }

    public static Integer A0X(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 34;
    }

    public static Integer A0Y(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 35;
    }

    public static Integer A0Z(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 36;
    }

    public static Object A0n(Object obj, C18100vl r2) {
        return ((Map) r2.getValue()).get(obj);
    }

    public static String A0o(Activity activity) {
        return activity.getIntent().getStringExtra("referral_screen");
    }

    public static String A0p(Activity activity) {
        return activity.getIntent().getStringExtra("extra_referral_screen");
    }

    public static String A0q(Context context, Object[] objArr, int i, int i2, int i3) {
        objArr[i2] = context.getString(i);
        return context.getString(i3, objArr);
    }

    public static String A0r(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        String obj2 = jSONObject.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }

    public static String A0u(StringBuilder sb, char c, long j) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static ArrayList A0w(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static void A11(Activity activity) {
        activity.getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
    }

    public static void A12(Activity activity, int i) {
        C110885hR.A0A(activity, i).setVisibility(8);
    }

    public static void A13(Context context, AnonymousClass1L9 r3, String str) {
        r3.CGU(context, Uri.parse(str), (AnonymousClass206) null);
    }

    public static void A14(Context context, PaymentMethodRow paymentMethodRow, int i) {
        paymentMethodRow.A03.setText(context.getString(i));
    }

    public static void A15(Handler handler, VoiceServiceEventCallback voiceServiceEventCallback, int i) {
        handler.removeMessages(i);
        voiceServiceEventCallback.voiceService.A0H.sendEmptyMessage(i);
    }

    public static void A17(C003401n r1, CharSequence charSequence) {
        r1.A0S(charSequence);
        r1.A0W(true);
    }

    public static void A18(C34001jj r1, Fragment fragment, String str) {
        r1.A0B(fragment, str);
        r1.A00(true);
    }

    public static void A19(Preference preference) {
        preference.A0L(preference.A0P());
        preference.A05();
    }

    public static void A1B(C19998A2m a2m, AnonymousClass206 r2, AnonymousClass00H r3) {
        ((AnonymousClass12N) r3.get()).A01(a2m, r2);
    }

    public static void A1D(AnonymousClass1QE r1, Object obj, StringBuilder sb) {
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A1E(AnonymousClass1QE r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A06(sb.toString());
    }

    public static void A1F(AnonymousClass1QE r1, StringBuilder sb, int i) {
        sb.append(i);
        r1.A06(sb.toString());
    }

    public static void A1H(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void A1I(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.length());
    }

    public static void A1J(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getName());
    }

    public static void A1K(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(C60322np.A01(str2));
    }

    public static void A1L(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(C41361wE.A08(str2));
    }

    public static void A1Q(Calendar calendar, int i, int i2) {
        calendar.set(i, i2);
        calendar.set(13, i2);
    }

    public static boolean A1R(AnonymousClass206 r2) {
        return r2.A11(131072);
    }

    public static boolean A1S(AnonymousClass00H r0) {
        return ((C29491cN) r0.get()).A0E();
    }
}
