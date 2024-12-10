package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.text.format.Time;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8BX  reason: invalid class name */
public abstract class AnonymousClass8BX {
    public static int A03(C18020vd r2) {
        C18070vi.A0d(r2, 0);
        return C18020vd.A00(C18040vf.A02, r2, 4248);
    }

    public static int A04(C18020vd r2) {
        C18070vi.A0d(r2, 0);
        int A00 = C18020vd.A00(C18040vf.A02, r2, 3327);
        if (A00 == 0) {
            return SearchActionVerificationClientService.NOTIFICATION_ID;
        }
        return A00;
    }

    public static Message A0F(Object obj) {
        Message obtain = Message.obtain((Handler) null, 0, 206, 0, obj);
        C18070vi.A0X(obtain);
        return obtain;
    }

    public static View A0G(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C18070vi.A0d(inflate, 1);
        return inflate;
    }

    public static C000100c A0H(Context context) {
        C18070vi.A0d(context, 0);
        return (C000100c) AnonymousClass00E.A00(context, C000100c.class);
    }

    public static C29621ca A0P(AbstractCollection abstractCollection) {
        return new C29621ca("account", (AnonymousClass1MD[]) abstractCollection.toArray(new AnonymousClass1MD[0]));
    }

    public static AnonymousClass9CX A0S(C29621ca r3, Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            return new AnonymousClass9CX(r3, number.longValue());
        }
        return null;
    }

    public static File A0T(Context context) {
        C18070vi.A0d(context, 0);
        return new File(context.getFilesDir(), "key");
    }

    public static List A0n(int i) {
        String[] strArr = new String[2];
        strArr[0] = "false";
        strArr[i] = "true";
        List asList = Arrays.asList(strArr);
        C18070vi.A0X(asList);
        return asList;
    }

    public static List A0o(Object obj, Object obj2, int i, int i2) {
        String[] strArr = new String[i];
        strArr[0] = obj;
        strArr[i2] = obj2;
        List asList = Arrays.asList(strArr);
        C18070vi.A0X(asList);
        return asList;
    }

    public static void A0w(ProgressDialog progressDialog, Context context, int i) {
        progressDialog.setMessage(context.getString(i));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
    }

    public static void A10(Parcel parcel, AE1 ae1, int i) {
        if (ae1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        ae1.writeToParcel(parcel, i);
    }

    public static void A14(DSQ dsq, C693536w r4, byte[] bArr) {
        byte[] A06 = dsq.A06();
        r4.A09 = Base64.encodeToString(bArr, 2);
        r4.A06 = Base64.encodeToString(A06, 2);
    }

    public static void A1K(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static void A1M(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        C18070vi.A0b(next);
        C18070vi.A0d(next, 0);
        abstractCollection.add(next);
    }

    public static void A1P(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "encPayload_";
        objArr[3] = "encIv_";
    }

    public static void A1Q(Object[] objArr, Object obj) {
        objArr[2] = obj;
        objArr[3] = "fileSha256_";
        objArr[4] = "fileLength_";
    }

    public static boolean A1T(Long l) {
        return C29601cY.A03(l, 0, 9007199254740991L, true);
    }

    public static boolean A1U(Object obj, Object obj2, Object obj3) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(obj2, 1);
        C18070vi.A0d(obj3, 2);
        return true;
    }

    public static boolean A1V(String str, C18100vl r3) {
        Object value = r3.getValue();
        C18070vi.A0X(value);
        return AnonymousClass1YE.A0A(str, (String) value, false);
    }

    public static int A02(AnonymousClass1FU r2, List list) {
        if (C18020vd.A05(C18040vf.A02, r2.A0E, 2443)) {
            Collections.sort(list);
        }
        return 2443;
    }

    public static int A05(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C18070vi.A0d(obj2, 0);
        return intValue;
    }

    public static long A06(int i) {
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public static long A07(AnonymousClass1KN r1) {
        return r1.A00.scaleByPowerOfTen(3).longValue();
    }

    public static long A08(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        C18070vi.A0d(obj2, 0);
        return longValue;
    }

    public static long A09(String str) {
        Time time = new Time();
        time.parse3339(str);
        return time.toMillis(true);
    }

    public static Intent A0A(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.ChangeNumber");
        return intent;
    }

    public static Intent A0B(Context context) {
        Intent intent = new Intent(context, IndiaUpiPaymentsAccountSetupActivity.class);
        intent.putExtra("extra_setup_mode", 2);
        return intent;
    }

    public static Location A0D(LatLng latLng, String str) {
        Location location = new Location(str);
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        return location;
    }

    public static Bundle A0E(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        if (charSequence != null) {
            bundle.putCharSequence("message", charSequence);
        }
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.87L] */
    public static C1418477e A0K(Object obj, String str) {
        return new C1418477e(new Object(), String.class, obj, str);
    }

    public static BrazilAddPixKeyViewModel A0L(AnonymousClass1FD r2) {
        return (BrazilAddPixKeyViewModel) new C24071It(r2).A00(BrazilAddPixKeyViewModel.class);
    }

    public static PaymentIncentiveViewModel A0M(AnonymousClass1FD r2) {
        return (PaymentIncentiveViewModel) new C24071It(r2).A00(PaymentIncentiveViewModel.class);
    }

    public static C164458Yx A0N(C165858bs r0, int i) {
        C164458Yx r02 = ((C165228an) r0.buttons_.get(i)).nativeFlowInfo_;
        if (r02 == null) {
            return C164458Yx.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static VoipStanzaChildNode A0Q(String str, byte[] bArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(str);
        builder.setData(bArr);
        return builder.build();
    }

    public static AnonymousClass210 A0R(AnonymousClass205 r2, String str, long j) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass210 r0 = new AnonymousClass210(r2, j);
        r0.A0i(str);
        r0.A0l(arrayList);
        return r0;
    }

    public static String A0a(C18020vd r2, String str) {
        if (C18020vd.A05(C18040vf.A02, r2, 3178)) {
            return str;
        }
        return null;
    }

    public static StringBuilder A0f(AnonymousClass1QD r4) {
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A03().getString("payments_sent_payment_with_account", ""));
        return sb;
    }

    public static StringBuilder A0g(Object obj, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        sb.append(str2);
        return sb;
    }

    public static PublicKey A0h(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static ArrayList A0i(AJN ajn) {
        ArrayList arrayList = new ArrayList();
        Long l = ajn.A01;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public static ArrayList A0j(C29621ca r8, C62672rm r9, C22470B9c b9c, String[] strArr) {
        return r9.A08(r8, b9c, strArr, 0, 50);
    }

    public static ArrayList A0k(C29621ca r8, C62672rm r9, C22470B9c b9c, String[] strArr) {
        return r9.A08(r8, b9c, strArr, 0, Long.MAX_VALUE);
    }

    public static ArrayList A0l(C29621ca r8, C62672rm r9, C22470B9c b9c, String[] strArr) {
        return r9.A08(r8, b9c, strArr, 1, Long.MAX_VALUE);
    }

    public static SecretKey A0q() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return instance.generateKey();
    }

    public static SecretKey A0r() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    public static C31781g7 A0s(C30391dr r2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C31781g7.A04;
        C31781g7 r0 = new C31781g7(1, C30581eB.A02(r2));
        r0.A0F();
        return r0;
    }

    public static void A13(UserFlowLoggerImpl userFlowLoggerImpl, long j) {
        Set set = userFlowLoggerImpl.mOngoingFlows;
        Long valueOf = Long.valueOf(j);
        set.remove(valueOf);
        userFlowLoggerImpl.mOngoingBgCancellableFlows.remove(valueOf);
    }

    public static void A15(AnonymousClass1FU r4) {
        r4.A0A.A1K(System.currentTimeMillis() + 604800000);
    }

    public static void A17(C20005A2v a2v, UserJid userJid, Number number) {
        if (userJid != null && number != null) {
            a2v.A01.A00(userJid, number.intValue());
        }
    }

    public static void A19(C171858sO r1, Integer num, String str, int i) {
        r1.A0b = str;
        r1.A08 = Integer.valueOf(i);
        if (num != null) {
            r1.A07 = num;
        }
    }

    public static void A1E(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        PinBottomSheetDialogFragment.A00(pinBottomSheetDialogFragment, j * 1000, true);
    }

    public static void A1L(StringBuilder sb, String str) {
        if (!str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
    }

    public static void A1O(byte[] bArr, int i, int i2) {
        bArr[i + 2] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i] = (byte) (i2 >> 16);
    }

    public static boolean A1R(AnonymousClass92s r1, Object obj) {
        r1.A08.get();
        boolean A5q = r1.A5q();
        C18070vi.A0d(obj, 1);
        return A5q;
    }

    public static boolean A1W(String str, boolean z) {
        return C29601cY.A04(str, 1, 100, z);
    }

    public static byte[] A1Y() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static byte[] A1Z() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static int A00(int i) {
        int A03 = C200610r.A03(i);
        if (A03 < 16) {
            return 16;
        }
        return A03;
    }

    public static int A01(AnonymousClass1DS r0) {
        Number number = (Number) r0.A06();
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public static SharedPreferences.Editor A0C(AnonymousClass00H r0) {
        return ((C190139kR) r0.get()).A00().edit();
    }

    public static C20287AEv A0I(AnonymousClass00H r1, String str) {
        return ((C20114A7x) r1.get()).A0A((UserJid) null, str);
    }

    public static C191869nK A0J(AnonymousClass00H r0) {
        C191869nK A00 = ((C57052iS) r0.get()).A00();
        C17960vV.A07(A00);
        return A00;
    }

    public static C165638bW A0O(C23624Bmt bmt, C23624Bmt bmt2) {
        bmt.A0E();
        C165638bW r1 = (C165638bW) bmt.A00;
        C23577Bm6 A0C = bmt2.A0C();
        A0C.getClass();
        r1.media_ = A0C;
        return r1;
    }

    public static File A0U(String str, C18100vl r3) {
        return new File(((File) r3.getValue()).getAbsolutePath(), str);
    }

    public static IllegalArgumentException A0V(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0W(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalStateException(sb.toString());
    }

    public static NullPointerException A0X(RegisterName registerName) {
        registerName.A4g().A03();
        return new NullPointerException("logUserAction");
    }

    public static String A0Y(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getStringExtra("extra_referral_screen");
        }
        return null;
    }

    public static String A0Z(C18000vb r4, int i) {
        return r4.A0M().format(((double) i) / 100.0d);
    }

    public static String A0b(C166398cp r0, int i) {
        return ((AnonymousClass8Z3) r0.A0S().buttons_.get(i)).buttonParamsJson_;
    }

    public static String A0c(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static String A0d(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public static String A0e(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static Iterator A0m(AnonymousClass00H r0) {
        Object obj = r0.get();
        C18070vi.A0X(obj);
        return ((Iterable) obj).iterator();
    }

    public static Mac A0p(String str, byte[] bArr) {
        Mac instance = Mac.getInstance(str);
        instance.init(new SecretKeySpec(bArr, str));
        return instance;
    }

    public static JSONArray A0t(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return new JSONArray();
        }
        return optJSONArray;
    }

    public static void A0u(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
    }

    public static void A0v(Activity activity, C33841jT r2) {
        r2.A0A();
        activity.startActivity(AnonymousClass1LU.A01(activity));
        activity.finishAffinity();
    }

    public static void A0x(ProgressDialog progressDialog, CharSequence charSequence) {
        progressDialog.setMessage(charSequence);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
    }

    public static void A0y(Context context, View view) {
        view.setBackgroundColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970830, 2131102245)));
    }

    public static void A0z(SharedPreferences.Editor editor, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        editor.putString(sb.toString(), str3).apply();
    }

    public static void A11(AnonymousClass01E r1, CharSequence charSequence) {
        C003401n supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0S(charSequence);
        }
    }

    public static void A12(A5Z a5z, Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        a5z.A03(str2, sb.toString());
    }

    public static void A16(A8T a8t, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(C60322np.A00(a8t));
        Log.i(sb.toString());
    }

    public static void A18(A99 a99) {
        a99.A0h();
        a99.A34.setRequestedCamera2SupportLevel(a99.A2A.A03(), a99.A29);
    }

    public static void A1A(C171858sO r1, Object obj, JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            r1.A0Z = obj.toString();
        }
    }

    public static void A1B(AnonymousClass1QE r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.toString());
        r1.A05(sb.toString());
    }

    public static void A1C(AnonymousClass1QE r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A05(sb.toString());
    }

    public static void A1D(AnonymousClass1QE r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A1F(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0v);
        Log.w(sb.toString());
    }

    public static void A1G(AnonymousClass206 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0u);
        Log.w(sb.toString());
    }

    public static void A1H(AnonymousClass206 r0, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(r0.A0u);
        C17960vV.A0G(z, sb.toString());
    }

    public static void A1I(C29591cX r0, C29591cX r1, C29591cX r2) {
        r1.A05(r0.A03());
        r2.A05(r1.A03());
    }

    public static void A1J(Object obj, Object obj2, Object obj3, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 2);
        C18070vi.A0d(obj3, 3);
    }

    public static void A1N(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Jid) it.next()).getRawString());
    }

    public static boolean A1S(C29621ca r0, String str) {
        if (r0.A0K(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean A1X(Map map, Object obj) {
        Object obj2 = map.get(obj);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj2).booleanValue();
    }

    public static byte[] A1a(String str, String str2) {
        Charset forName = Charset.forName(str);
        C18070vi.A0X(forName);
        byte[] bytes = str2.getBytes(forName);
        C18070vi.A0X(bytes);
        return bytes;
    }

    public static byte[] A1b(String str, Random random) {
        byte[] bArr = new byte[Cipher.getInstance(str).getBlockSize()];
        random.nextBytes(bArr);
        return bArr;
    }
}
