package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.os.Parcelable;
import android.security.KeyPairGeneratorSpec;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.community.sync.CommunityOneTimeSyncJob;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.Hilt_IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.MGF1ParameterSpec;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.8BY  reason: invalid class name */
public abstract class AnonymousClass8BY {
    public static int A01(BE4 be4, A2t a2t) {
        be4.BD9(7, a2t.A05);
        be4.BD9(8, a2t.A06);
        be4.BD9(9, a2t.A04);
        be4.BD9(10, (long) a2t.A02);
        return a2t.A0E.intValue();
    }

    public static int A05(byte[] bArr, int[] iArr, int i) {
        return (iArr[bArr[i] & 255] << 18) | (iArr[bArr[i + 1] & 255] << 12) | (iArr[bArr[i + 2] & 255] << 6) | iArr[bArr[i + 3] & 255];
    }

    public static SpannableString A0B(Object obj, String str) {
        SpannableString spannableString = new SpannableString(obj.toString());
        spannableString.setSpan(new StyleSpan(1), 0, str.length() + 2, 33);
        return spannableString;
    }

    public static TranslateAnimation A0D(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) i, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(120);
        return translateAnimation;
    }

    public static ImageView A0E(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, true);
        ((TextView) AnonymousClass1HF.A06(inflate, 2131436044)).setText(2131888706);
        return (ImageView) AnonymousClass1HF.A06(inflate, 2131431496);
    }

    public static zzw A0G(C26126Cso cso, List list) {
        C23083Bay bay = new C23083Bay((C23071Bam) null, list, false, false);
        C25069CWc A00 = C25558Chw.A00();
        A00.A01 = new DIN(bay);
        A00.A00 = 2426;
        zzw A02 = C26126Cso.A02(cso, A00.A00(), 0);
        C18070vi.A0X(A02);
        return A02;
    }

    public static CatalogAllCategoryFragment A0I(Parcelable parcelable, Enum enumR, String str) {
        C18070vi.A0d(parcelable, 1);
        Bundle bundle = new Bundle();
        bundle.putString("parent_category_id", str);
        bundle.putParcelable("category_biz_id", parcelable);
        bundle.putString("category_display_context", enumR.name());
        CatalogAllCategoryFragment catalogAllCategoryFragment = new CatalogAllCategoryFragment();
        catalogAllCategoryFragment.A1R(bundle);
        return catalogAllCategoryFragment;
    }

    public static UserJid A0L(C29621ca r8, C62672rm r9, String[] strArr) {
        return (UserJid) r9.A05(r8, UserJid.class, -9007199254740991L, 9007199254740991L, (Object) null, strArr, false);
    }

    public static AnonymousClass9DC A0Q(C29621ca r19, C62672rm r20, Object obj) {
        C29621ca r5 = r19;
        C18070vi.A0d(r5, 1);
        C62672rm r4 = r20;
        C18070vi.A0d(r4, 2);
        if (!r4.A09(r5, "notification")) {
            return null;
        }
        Class cls = Long.TYPE;
        Number number = (Number) r4.A05(r5, cls, 0L, 9007199254740991L, (Object) null, new String[]{"t"}, false);
        if (number == null) {
            return null;
        }
        long longValue = number.longValue();
        C62672rm r12 = r4;
        C29621ca r13 = r5;
        String str = (String) r12.A05(r13, String.class, -9007199254740991L, 9007199254740991, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (str == null) {
            return null;
        }
        return new AnonymousClass9DC(r5, (Long) r4.A05(r5, cls, 0L, 1024L, (Object) null, new String[]{"offline"}, false), str, longValue);
    }

    public static Number A0T(C29621ca r8, C62672rm r9, String[] strArr) {
        return (Number) r9.A05(r8, Long.TYPE, 0L, 9007199254740991L, (Object) null, strArr, false);
    }

    public static Object A0U(C29621ca r8, C62672rm r9, Object obj, String[] strArr) {
        strArr[0] = obj;
        return r9.A05(r8, String.class, -9007199254740991L, 9007199254740991L, "405", strArr, false);
    }

    public static Object A0V(C29621ca r8, C62672rm r9, Object obj, String[] strArr) {
        strArr[0] = obj;
        return r9.A05(r8, String.class, -9007199254740991L, 9007199254740991L, "500", strArr, false);
    }

    public static String A0X(C29621ca r7, C62672rm r8, String[] strArr, int i) {
        strArr[i] = "#elementValue";
        return (String) r8.A04(r7, String.class, 1L, 20L, (Object) null, strArr);
    }

    public static BigDecimal A0Z(A6S a6s, C29621ca r3) {
        String A0M;
        if (r3 == null || (A0M = r3.A0M()) == null || a6s == null) {
            return null;
        }
        return C197309wU.A00(a6s, Long.parseLong(A0M));
    }

    public static ArrayList A0a(Cursor cursor, AbstractMap abstractMap) {
        ArrayList arrayList = (ArrayList) abstractMap.get(cursor.getString(0));
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public static void A0g(Cursor cursor, AbstractMap abstractMap) {
        String string = cursor.getString(0);
        if (((ArrayList) abstractMap.get(string)) == null) {
            abstractMap.put(string, new ArrayList());
        }
    }

    public static void A0v(AnonymousClass1FU r5) {
        C134126q5 r3 = new C134126q5(r5);
        r3.A01 = 2131231834;
        r3.A01(new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
        r3.A02 = 2131894309;
        r3.A03 = 2131894308;
        r5.CNh(r3.A00(), 150);
    }

    public static void A15(C29591cX r8, String str) {
        if (C29601cY.A04(str, 0, 9007199254740991L, false)) {
            r8.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
    }

    public static void A1O(int[] iArr) {
        iArr[0] = 2131895864;
        iArr[1] = 2131895862;
        iArr[2] = 2131895861;
        iArr[3] = 2131895865;
        iArr[4] = 2131895863;
    }

    public static void A1P(Object[] objArr) {
        objArr[4] = "NRE";
        objArr[5] = "NRO";
        objArr[6] = "OD_SECURED";
        objArr[7] = "OD_UNSECURED";
        objArr[8] = "SAVINGS";
    }

    public static void A1Q(Object[] objArr) {
        objArr[0] = "CREDIT";
        objArr[1] = "CREDIT_LINE";
        objArr[2] = "CURRENT";
        objArr[3] = "DEFAULT";
    }

    public static void A1R(Object[] objArr) {
        objArr[1] = "key_";
        objArr[2] = "text_";
        objArr[3] = "groupingKey_";
        objArr[4] = "senderTimestampMs_";
    }

    public static void A1S(Object[] objArr) {
        objArr[1] = "url_";
        objArr[2] = "fileSha256_";
        objArr[3] = "fileEncSha256_";
        objArr[4] = "mediaKey_";
        objArr[5] = "mimetype_";
        objArr[6] = "height_";
        objArr[7] = "width_";
        objArr[8] = "directPath_";
        objArr[9] = "fileLength_";
    }

    public static void A1T(Object[] objArr, int i) {
        objArr[0] = "active";
        objArr[i] = "active_pending";
        objArr[2] = "active_status_pending";
        objArr[3] = "available";
        objArr[4] = "available_pending";
        objArr[5] = "available_status_pending";
        objArr[6] = "blocked";
        objArr[7] = "deregistered";
        objArr[8] = "deregistered_pending";
        objArr[9] = "inactive";
        objArr[10] = "inactive_pending";
        objArr[11] = "inactive_status_pending";
    }

    public static void A1U(Object[] objArr, Object obj) {
        objArr[7] = obj;
        objArr[8] = "fileEncSha256_";
        objArr[9] = "directPath_";
        objArr[10] = "mediaKeyTimestamp_";
    }

    public static void A1V(Object[] objArr, Object obj) {
        objArr[13] = new AnonymousClass1D6("overwrite_first_screen_presentation", obj);
        objArr[14] = new AnonymousClass1D6("action_name", "galaxy_message");
        objArr[15] = new AnonymousClass1D6("is_modal_on_screen", true);
    }

    public static String[] A1Z(int i) {
        String[] strArr = new String[9];
        strArr[0] = "ACCOUNT_PENDING_LINKING";
        strArr[i] = "ACTIVE";
        strArr[2] = "EXTERNALLY_DISABLED";
        strArr[3] = "HARD_BLOCKED";
        strArr[4] = "INACTIVE";
        strArr[5] = "INITED";
        strArr[6] = "INTEGRITY_BLOCKED";
        strArr[7] = "PENDING";
        return strArr;
    }

    public static int A02(BE4 be4, A2t a2t, int i) {
        be4.BD9(11, (long) i);
        be4.BD9(12, a2t.A03);
        be4.BD9(13, a2t.A07);
        be4.BD9(14, a2t.A08);
        be4.BD9(15, a2t.A0A);
        be4.BD9(16, a2t.A0J ? 1 : 0);
        return a2t.A0F.intValue();
    }

    public static Intent A08(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity");
        intent.putExtra("extra_show_updated_tos", z);
        return intent;
    }

    public static Bundle A09(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 17);
        bundle.putString("title", context.getString(2131890788));
        return bundle;
    }

    public static AnonymousClass1EC A0K(CommunityOneTimeSyncJob communityOneTimeSyncJob, StringBuilder sb) {
        sb.append("persistentId=");
        sb.append(communityOneTimeSyncJob.A01);
        sb.append("; groupJid=");
        return AnonymousClass1EC.A01.A02(communityOneTimeSyncJob.parentGroupRawJid);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.whatsapp.payments.ui.Hilt_IndiaUpiPinPrimerDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment] */
    public static IndiaUpiPinPrimerDialogFragment A0M(Parcelable parcelable, BBQ bbq) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_bank_account", parcelable);
        ? hilt_IndiaUpiPinPrimerDialogFragment = new Hilt_IndiaUpiPinPrimerDialogFragment();
        hilt_IndiaUpiPinPrimerDialogFragment.A1R(bundle);
        hilt_IndiaUpiPinPrimerDialogFragment.A06 = bbq;
        return hilt_IndiaUpiPinPrimerDialogFragment;
    }

    public static C29591cX A0O() {
        C29591cX r3 = new C29591cX("iq");
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        return r3;
    }

    public static IllegalStateException A0R(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Account ");
        sb.append(C60322np.A01(str));
        sb.append(" directory does not exist");
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0S(int i) {
        if (i == 0) {
            return AnonymousClass00R.A0j;
        }
        if (i == 1) {
            return AnonymousClass00R.A00;
        }
        if (i == 2) {
            return AnonymousClass00R.A01;
        }
        if (i == 3) {
            return AnonymousClass00R.A0C;
        }
        if (i == 4) {
            return AnonymousClass00R.A0N;
        }
        if (i != 5) {
            return null;
        }
        return AnonymousClass00R.A0Y;
    }

    public static Object A0W(C29621ca r5, C62672rm r6, Object obj, String[] strArr, boolean z) {
        return r6.A05(r5, String.class, -9007199254740991L, 9007199254740991L, obj, strArr, z);
    }

    public static String A0Y(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset charset = C19620yd.A0C;
        C18070vi.A0Z(charset);
        byte[] bytes = str.getBytes(charset);
        C18070vi.A0X(bytes);
        instance.update(bytes);
        return Base64.encodeToString(instance.digest(), 2);
    }

    public static C122776Rw A0b() {
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("Not yet implemented");
        return new C122776Rw(sb.toString());
    }

    public static void A0k(ListPreference listPreference, ListPreference listPreference2) {
        listPreference2.A0J(listPreference.A0J);
        listPreference2.A0R = listPreference.A0R;
        listPreference2.A0G = listPreference.A00;
        listPreference2.A0T(listPreference.A01);
        listPreference2.A02 = listPreference.A02;
        listPreference2.A0H(listPreference.A04());
        listPreference2.A0I(listPreference.A0F);
        int i = listPreference.A02;
        if (i != listPreference2.A02) {
            listPreference2.A02 = i;
            listPreference2.A06();
        }
    }

    public static void A0n(DSQ dsq, C23624Bmt bmt, C693536w r5) {
        C166208cW r1 = (C166208cW) bmt.A00;
        r1.bitField0_ |= 16384;
        r1.thumbnailEncSha256_ = dsq;
        int i = r5.A01;
        if (i > 0 && r5.A00 > 0) {
            bmt.A0E();
            C166208cW r2 = (C166208cW) bmt.A00;
            r2.bitField0_ |= 262144;
            r2.thumbnailWidth_ = i;
            int i2 = r5.A00;
            bmt.A0E();
            C166208cW r22 = (C166208cW) bmt.A00;
            r22.bitField0_ |= A7Y.A0F;
            r22.thumbnailHeight_ = i2;
        }
    }

    public static void A0o(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, BusinessProductListBaseFragment businessProductListBaseFragment) {
        businessProductListBaseFragment.A01 = (C22417B6z) r1.A2N.get();
        businessProductListBaseFragment.A0C = C000200d.A00(r2.A1o);
        businessProductListBaseFragment.A02 = (B7A) r1.A2T.get();
        businessProductListBaseFragment.A0D = C000200d.A00(r2.AGs);
        businessProductListBaseFragment.A03 = (A8Q) r2.A1p.get();
        businessProductListBaseFragment.A0E = C000200d.A00(r2.A1q);
        businessProductListBaseFragment.A04 = (C20005A2v) r1.A0X.get();
        businessProductListBaseFragment.A09 = (AnonymousClass2UJ) r3.A3d.get();
        businessProductListBaseFragment.A0F = C000200d.A00(r2.A8o);
    }

    public static void A0p(AnonymousClass10E r1, AnonymousClass10G r2, C18030ve r3, ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment) {
        confirmLegalNameBottomSheetFragment.A08 = r3;
        confirmLegalNameBottomSheetFragment.A0B = (AnonymousClass1L4) r2.A2e.get();
        confirmLegalNameBottomSheetFragment.A0C = (C36401np) r2.A30.get();
        confirmLegalNameBottomSheetFragment.A09 = (A2C) r2.AEZ.get();
        confirmLegalNameBottomSheetFragment.A07 = (AnonymousClass11C) r1.AAp.get();
        confirmLegalNameBottomSheetFragment.A06 = (AnonymousClass1LC) r2.A5B.get();
        confirmLegalNameBottomSheetFragment.A0D = (AnonymousClass10I) r1.AC1.get();
    }

    public static void A0s(AnonymousClass10E r1, PasswordInputFragment passwordInputFragment, C18030ve r3) {
        passwordInputFragment.A0A = r3;
        passwordInputFragment.A0C = C000200d.A00(r1.A5j);
        passwordInputFragment.A08 = (AnonymousClass11C) r1.AAp.get();
        passwordInputFragment.A09 = (C18000vb) r1.ABz.get();
    }

    public static void A0t(AnonymousClass10E r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A02 = (C18030ve) r1.A04.get();
        C63402t1.A03(waDialogFragment, (AnonymousClass10I) r1.AC1.get());
        waDialogFragment.A01 = (C18000vb) r1.ABz.get();
    }

    public static void A0u(AnonymousClass10E r1, PaymentSettingsFragment paymentSettingsFragment, Object obj) {
        paymentSettingsFragment.A0Y = (AnonymousClass1QJ) obj;
        paymentSettingsFragment.A0s = C000200d.A00(r1.A84);
        paymentSettingsFragment.A0b = (C33651jA) r1.A8B.get();
        paymentSettingsFragment.A0U = (C31051ew) r1.Ace.get();
        paymentSettingsFragment.A0q = C000200d.A00(r1.AcC);
        paymentSettingsFragment.A0u = C000200d.A00(r1.A8C);
        paymentSettingsFragment.A0S = (C33301ib) r1.A6m.get();
        paymentSettingsFragment.A0p = C000200d.A00(r1.A74);
        paymentSettingsFragment.A0V = (C33311ic) r1.A88.get();
        paymentSettingsFragment.A0N = (AnonymousClass1QR) r1.A8D.get();
        paymentSettingsFragment.A0J = (C27201Vd) r1.A2j.get();
        paymentSettingsFragment.A0M = (C26021Qn) r1.A7o.get();
        paymentSettingsFragment.A0r = C000200d.A00(r1.AcD);
    }

    public static void A0w(AnonymousClass9j7 r2, AnonymousClass8oS r3, AnonymousClass206 r4) {
        int i = r4.A0u;
        if (72 != i && 73 != i) {
            r2.A01(r3);
        }
    }

    public static void A0x(ADC adc, JSONArray jSONArray, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, adc.A04);
        jSONObject.put("address_line1", adc.A00);
        jSONObject.put("address_line2", adc.A01);
        jSONObject.put("city", adc.A02);
        jSONObject.put("state", adc.A06);
        jSONObject.put("country", adc.A03);
        jSONObject.put("postal_code", adc.A05);
        jSONArray.put(jSONObject);
    }

    public static void A0y(C18020vd r2, C63622tQ r3) {
        if (!C18020vd.A05(C18040vf.A01, r2, 6175)) {
            r3.A05(4);
        }
    }

    public static void A11(C29621ca r2, C62672rm r3, String[] strArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("required child ");
        sb.append(strArr[i]);
        sb.append(" missing for tag ");
        sb.append(r2.A00);
        r3.A00 = sb.toString();
    }

    public static void A12(C29621ca r1, StringBuilder sb, String[] strArr, int i) {
        sb.append("required child ");
        sb.append(strArr[i]);
        sb.append(" missing for tag ");
        sb.append(r1.A00);
    }

    public static void A13(C29591cX r3) {
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        r3.A04(new AnonymousClass1MD("xmlns", "w:pay"));
        r3.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
    }

    public static void A14(C29591cX r8, String str) {
        if (C29601cY.A04(str, 1, 1000, true)) {
            r8.A04(new AnonymousClass1MD("device_ssid", str));
        }
    }

    public static void A16(C29591cX r3, String str) {
        r3.A04(new AnonymousClass1MD("xmlns", str));
        r3.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
    }

    public static void A17(C29591cX r3, String str) {
        r3.A04(new AnonymousClass1MD("xmlns", str));
        r3.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
    }

    public static void A18(C29591cX r7, String str, String str2) {
        if (C29601cY.A04(str, 0, 9007199254740991L, false)) {
            r7.A04(new AnonymousClass1MD(str2, str));
        }
    }

    public static void A19(C29591cX r3, String str, String str2) {
        r3.A04(new AnonymousClass1MD(str, str2));
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
    }

    public static void A1A(C29591cX r7, String str, String str2, String str3, String str4) {
        r7.A04(new AnonymousClass1MD(str, str2));
        if (C29601cY.A04(str3, 0, 9007199254740991L, false)) {
            r7.A04(new AnonymousClass1MD(str4, str3));
        }
    }

    public static void A1B(C29591cX r8, String str, boolean z) {
        if (C29601cY.A04(str, 1, 200, z)) {
            r8.A04(new AnonymousClass1MD("credential-id", str));
        }
    }

    public static void A1C(C29591cX r8, String str, boolean z) {
        if (C29601cY.A04(str, 1, 255, z)) {
            r8.A04(new AnonymousClass1MD("device-id", str));
        }
    }

    public static void A1F(Object obj, Object obj2) {
        C168578j9 r2 = (C168578j9) obj;
        if (C18070vi.A18(r2.A4f(), obj2) && !r2.A02.A0O(r2.A4f())) {
            C167938i1 A4d = r2.A4d();
            List list = A4d.A00;
            if (list.size() > 0 && (list.get(0) instanceof C168668jU)) {
                A4d.A0G(0);
            }
        }
    }

    public static void A1J(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append("Invalid number of children '");
        sb.append(str);
        sb.append("'. Received ");
        sb.append(abstractCollection.size());
        sb.append(" children but the maximum value specified in the spec is ");
    }

    public static void A1K(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append("Invalid number of children '");
        sb.append(str);
        sb.append("'. Received ");
        sb.append(abstractCollection.size());
        sb.append(" children but the minimum value specified in the spec is ");
    }

    public static void A1L(String str, byte[] bArr, int i) {
        int i2 = i * 2;
        bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
    }

    public static boolean A1W(C36801oU r10, C36841oY r11, A7X a7x) {
        long j = r11.A06.get();
        long j2 = r11.A07.get();
        long j3 = r11.A05.get();
        return C36801oU.A00(r10, a7x, r11.A04.get(), j3, j, j2);
    }

    public static boolean A1X(C29591cX r8, String str) {
        if (C29601cY.A04(str, 0, 9007199254740991L, false)) {
            r8.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        return false;
    }

    public static byte[] A1Y(Key key, byte[] bArr) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
        instance.init(1, key, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        return instance.doFinal(bArr);
    }

    public static int A00(View view) {
        return C19740yt.A00(view.getContext(), AnonymousClass1YL.A00(view.getContext(), 2130971195, 2131102531));
    }

    public static int A03(C171858sO r1, A7B a7b, int i) {
        r1.A0B = Integer.valueOf(i);
        if (a7b == null) {
            return 1;
        }
        r1.A0S = String.valueOf(a7b.A00);
        r1.A0T = a7b.A07;
        return 2;
    }

    public static int A04(AbstractList abstractList, s sVar, int i) {
        if (!((View) abstractList.get(i)).isShown()) {
            return sVar.A00;
        }
        boolean z = sVar.A06;
        int i2 = sVar.A00;
        if (z) {
            return i2 - 1;
        }
        return i2;
    }

    public static long A07(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime();
    }

    public static KeyPairGeneratorSpec.Builder A0A(KeyPairGeneratorSpec.Builder builder, BigInteger bigInteger, Calendar calendar, Calendar calendar2) {
        return builder.setSerialNumber(bigInteger).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime());
    }

    public static MenuItem A0C(Context context, Menu menu, int i) {
        return menu.add(0, i, 0, context.getString(2131899369)).setIcon(2131232271);
    }

    public static AnonymousClass1FL A0F(Fragment fragment) {
        Activity A00 = AnonymousClass1L9.A00(fragment.A1n());
        C18070vi.A0z(A00, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return (AnonymousClass1FL) new WeakReference(A00).get();
    }

    public static EE9 A0H(C23624Bmt bmt, C166068cI r3) {
        bmt.A0E();
        C164598Zl r1 = (C164598Zl) bmt.A00;
        r3.getClass();
        r1.currentSession_ = r3;
        r1.bitField0_ |= 1;
        bmt.A0E();
        C164598Zl r2 = (C164598Zl) bmt.A00;
        EE9 ee9 = r2.previousSessions_;
        if (((C27296DbR) ee9).A00) {
            return ee9;
        }
        EE9 A09 = C23577Bm6.A09(ee9);
        r2.previousSessions_ = A09;
        return A09;
    }

    public static C134126q5 A0J(Fragment fragment) {
        C134126q5 r3 = new C134126q5(fragment.A1D());
        r3.A01 = 2131232061;
        r3.A01(C27091Ur.A09);
        r3.A0B = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
        r3.A03 = 2131894344;
        return r3;
    }

    public static AnonymousClass1UI A0N(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not parse stanza into valid response class. Encountered the following errors for each possible response:\n");
        sb2.append(C29431cG.A0g("\n", "", "", abstractCollection, (C22821Di) null));
        return new AnonymousClass1UI(sb2.toString());
    }

    public static AnonymousClass4VT A0P(Context context, AnonymousClass1KB r7, AnonymousClass181 r8, AnonymousClass1D9 r9, AnonymousClass10I r10) {
        return new C86284Ra(r7, r8, r9, r10, new File(context.getCacheDir(), "BankLogos"), "india-upi-method-list").A00();
    }

    public static JSONObject A0c(AnonymousClass1QD r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A0d(Context context, C003401n r2, int i) {
        r2.A0O(AnonymousClass4aX.A08(context.getResources().getDrawable(2131231814), i));
    }

    public static void A0e(Context context, C86284Ra r2) {
        r2.A00 = context.getResources().getDimensionPixelSize(2131165426);
        r2.A01 = 16777216;
    }

    public static void A0f(Resources resources, C1409673t r2, AnonymousClass6Fx r3, int i, int i2) {
        r2.A0E(resources.getString(i));
        r3.A06(r2.A05(), (Integer) null, i2, 31);
    }

    public static void A0h(AudioEffect audioEffect, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(audioEffect.getEnabled());
        sb.append(" on session id ");
        sb.append(i);
    }

    public static void A0i(MenuItem menuItem) {
        menuItem.setActionView(2131626015);
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            AnonymousClass1Y5.A07(actionView, "Button");
        }
    }

    public static void A0j(AnonymousClass1FL r1) {
        DialogFragment dialogFragment = (DialogFragment) r1.getSupportFragmentManager().A0Q("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A29();
        }
    }

    public static void A0l(Preference preference, TwoStatePreference twoStatePreference, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        B6V b6v = preference.A0A;
        if (b6v != null) {
            b6v.C1R(preference, valueOf);
        }
        twoStatePreference.A0S(z);
    }

    public static void A0m(C23570Bly bly, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        bly.A04(new RuntimeException(sb.toString()));
    }

    public static void A0q(AnonymousClass10E r1, AnonymousClass10G r2, PaymentSettingsFragment paymentSettingsFragment, C34691kv r4) {
        C63402t1.A02(paymentSettingsFragment, r4);
        paymentSettingsFragment.A0C = (AnonymousClass11S) r1.A63.get();
        paymentSettingsFragment.A0R = (AnonymousClass1LU) r1.ABd.get();
        paymentSettingsFragment.A0F = (AnonymousClass181) r1.AA9.get();
        paymentSettingsFragment.A0D = (C132216mP) r2.A4S.get();
        paymentSettingsFragment.A0l = (AnonymousClass1R2) r1.A8L.get();
        paymentSettingsFragment.A0H = (AnonymousClass1M9) r1.A2f.get();
        paymentSettingsFragment.A0I = (C24921Me) r1.ABX.get();
        paymentSettingsFragment.A0O = (C24751Ln) r1.ABe.get();
        paymentSettingsFragment.A0t = C000200d.A00(r1.A87);
        paymentSettingsFragment.A0G = (AnonymousClass1VW) r1.A2d.get();
        paymentSettingsFragment.A0K = (AnonymousClass11P) r1.AAv.get();
    }

    public static void A0r(AnonymousClass10E r1, AnonymousClass10G r2, PaymentSettingsFragment paymentSettingsFragment, C18140vp r4) {
        paymentSettingsFragment.A0m = (C36401np) r4.get();
        paymentSettingsFragment.A0n = (AnonymousClass10I) r1.AC1.get();
        paymentSettingsFragment.A0E = (AnonymousClass18O) r1.A9p.get();
        paymentSettingsFragment.A0P = r1.ACi();
        paymentSettingsFragment.A0k = (C192479oS) r2.AES.get();
        paymentSettingsFragment.A0a = (AnonymousClass1QS) r1.A8J.get();
        paymentSettingsFragment.A0W = (AnonymousClass1QD) r1.A89.get();
        paymentSettingsFragment.A0o = C000200d.A00(r1.A2b);
        paymentSettingsFragment.A0Q = (AnonymousClass1D9) r1.A0n.get();
        paymentSettingsFragment.A0T = (AnonymousClass1QL) r1.A7z.get();
        paymentSettingsFragment.A0X = (C31061ex) r1.A8E.get();
        paymentSettingsFragment.A0Z = (AnonymousClass1QO) r1.A8G.get();
    }

    public static void A0z(AnonymousClass206 r1, Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("; message.senderJid=");
        sb.append(r1.A0H());
        Log.w(sb.toString());
    }

    public static void A10(AnonymousClass206 r1, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r1.A0v);
        sb.append("; media_wa_type=");
        sb.append(r1.A0u);
        Log.w(sb.toString());
    }

    public static void A1D(CallInfo callInfo, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(callInfo.getInitialPeerJid());
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; callId=");
        sb.append(callInfo.callId);
        sb.append("; transactionId=");
        sb.append(callInfo.initialGroupTransactionId);
    }

    public static void A1E(File file, InputStream inputStream, ZipOutputStream zipOutputStream) {
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        C64062u9.A00(inputStream, zipOutputStream);
        zipOutputStream.closeEntry();
    }

    public static void A1G(Object obj, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(obj.getClass());
        C17960vV.A0G(z, sb.toString());
    }

    public static void A1H(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(C41361wE.A08(str2));
        Log.i(sb.toString());
    }

    public static void A1I(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
    }

    public static void A1M(AbstractMap abstractMap, Iterator it) {
        AnonymousClass1E7 r1 = (AnonymousClass1E7) it.next();
        AnonymousClass1BI r0 = r1.A0J;
        if (r0 != null) {
            abstractMap.put(r0.getRawString(), r1);
        }
    }

    public static void A1N(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        C18070vi.A0z(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
        C41681wt.A02(entry).setValue(Integer.valueOf(((C98474rD) entry.getValue()).element));
    }

    public static long A06(long j) {
        return (C28851b7.A05(j, -4611686018427387903L, 4611686018427387903L) << 1) + 1;
    }
}
