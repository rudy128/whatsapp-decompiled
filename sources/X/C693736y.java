package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.36y  reason: invalid class name and case insensitive filesystem */
public class C693736y implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;

    public C693736y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrD(String str) {
        String str2;
        switch (this.A00) {
            case 1:
                str2 = AnonymousClass001.A1H("BroadcastXmppMethods/sendGetBroadcastLists/onDeliveryFailure: iq=", str, AnonymousClass000.A10());
                break;
            case 2:
                Log.i("marketing_disclosure/SetMMDisclosureAcceptanceRequest delivery fail");
                ((C132066m8) this.A01).A00();
                return;
            case 4:
                str2 = "SpamXmppMethods/failed to deliver spam report";
                break;
            case 5:
                ((C72373Lr) this.A01).BrA();
                return;
            default:
                return;
        }
        Log.e(str2);
    }

    public void Bt9(C29621ca r7, String str) {
        String str2;
        StringBuilder sb;
        SharedPreferences sharedPreferences;
        int A002;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                sb = AnonymousClass000.A10();
                sb.append("BroadcastXmppMethods/sendGetBroadcastLists/onError: iq=");
                sb.append(str);
                break;
            case 2:
                C18070vi.A0d(r7, 1);
                C17900vP.A0i("marketing_disclosure/SetMMDisclosureAcceptanceRequest/", AnonymousClass000.A10(), C60482o6.A00(r7));
                ((C132066m8) this.A01).A00();
                return;
            case 3:
                int A003 = C60482o6.A00(r7);
                AnonymousClass19F r5 = ((C57962jv) this.A01).A02;
                r5.A06(A003);
                if (A003 != 207 && A003 != 304 && (A003 < 400 || A003 > 503)) {
                    sb = AnonymousClass000.A10();
                    sb.append("ABPropsManager/onABPropError; unknown error code: ");
                    sb.append(A003);
                    break;
                } else {
                    synchronized (r5) {
                        sharedPreferences = r5.A00;
                        A002 = C17890vO.A00(sharedPreferences, "ab_props:sys:fetch_attemp_count");
                    }
                    int i = A002 + 1;
                    r5.A05(i);
                    if (i >= 3) {
                        long A012 = AnonymousClass11P.A01(r5.A01);
                        synchronized (r5) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong("ab_props:sys:last_refresh_time", A012);
                            edit.apply();
                        }
                        r5.A05(0);
                        return;
                    }
                    return;
                }
            case 4:
                str2 = "SpamXmppMethods/bad spam report";
                break;
            case 5:
                C18070vi.A0h(str, r7);
                ((C72373Lr) this.A01).Bsu(new C122936Sm(r7, str));
                return;
            default:
                JniBridge.jvidispatchIOO(2, str, r7);
                return;
        }
        str2 = sb.toString();
        Log.e(str2);
    }

    public void C7Z(C29621ca r22, String str) {
        SharedPreferences.Editor editor;
        boolean z;
        SharedPreferences sharedPreferences;
        AnonymousClass016 r12;
        String str2;
        C29621ca r4 = r22;
        String str3 = str;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r4, 1);
                C29621ca A0I = r4.A0I();
                C18070vi.A0X(A0I);
                C29621ca.A04(A0I, "disappearing_mode");
                ((C26281Rn) this.A01).A04.A05(A0I.A0B(A0I.A0P("duration"), "duration"), A0I.A0E(A0I.A0P("t"), "t") * 1000);
                return;
            case 1:
                C17900vP.A0f("BroadcastXmppMethods/sendGetBroadcastLists/onSuccess: iq=", str3, AnonymousClass000.A10());
                C29621ca A0K = r4.A0K("lists");
                if (A0K != null) {
                    Iterator A03 = C29621ca.A03(A0K, "list");
                    while (A03.hasNext()) {
                        C29621ca A0a = C17880vN.A0a(A03);
                        C47712Jo r10 = (C47712Jo) A0a.A0F(C47712Jo.class, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String A02 = C29621ca.A02(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        List A0R = A0a.A0R("recipient");
                        Object[] objArr = new UserJid[A0R.size()];
                        Iterator it = A0R.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            objArr[i] = C17880vN.A0a(it).A0F(UserJid.class, "jid");
                            i++;
                        }
                        C63862to r2 = (C63862to) ((C26221Rh) this.A01).A00.get();
                        List asList = Arrays.asList(objArr);
                        C18070vi.A0d(r10, 0);
                        C18070vi.A0e(A02, 1, asList);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("BroadcastListManager/onParticipatingList/jid:");
                        A10.append(r10);
                        A10.append("/name:");
                        A10.append(A02);
                        A10.append("/recipients:");
                        C17890vO.A1A(A10, C200210n.A01(asList.toArray(new UserJid[0])));
                        if (r2.A05.A0P(r10) || r2.A07.A05.containsKey(r10)) {
                            StringBuilder A11 = AnonymousClass000.A11("BroadcastListManager/onParticipatingList/jid:");
                            A11.append(r10);
                            C17890vO.A1A(A11, " already exists");
                        } else {
                            r2.A0B.BcH(C63862to.A00(r2, r10, asList), 1);
                        }
                        AnonymousClass1M9 r9 = r2.A03;
                        if (r9.A0E(r10) == null) {
                            r9.A0C(r10, A02, "pn", System.currentTimeMillis());
                        }
                    }
                }
                Log.i("BroadcastListManager/onParticipatingList/onParticipatingListsComplete");
                editor = C19830z4.A00(((C63862to) ((C26221Rh) this.A01).A00.get()).A04).putBoolean("refresh_broadcast_lists", false);
                break;
            case 2:
                C132066m8 r0 = (C132066m8) this.A01;
                AnonymousClass73F r3 = r0.A01;
                AnonymousClass73F.A01(r3, new AnonymousClass7S0(r0.A00, r3, 10));
                return;
            case 3:
                C29621ca A0K2 = r4.A0K("props");
                C29621ca A0K3 = r4.A0K("erid");
                if (A0K2 != null) {
                    C57962jv r92 = (C57962jv) this.A01;
                    C20099A7c.A01(A0K2.A0Q("protocol", (String) null), 1);
                    String A0Q = A0K2.A0Q("ab_key", (String) null);
                    String A0Q2 = A0K2.A0Q("hash", (String) null);
                    long A04 = C20099A7c.A04(A0K2.A0Q("refresh", (String) null), 86400) * 1000;
                    int A0A = A0K2.A0A("refresh_id", 0);
                    SparseArray sparseArray = new SparseArray();
                    List A0R2 = A0K2.A0R("prop");
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    Iterator it2 = A0R2.iterator();
                    while (it2.hasNext()) {
                        C29621ca A0a2 = C17880vN.A0a(it2);
                        if (!TextUtils.isEmpty(A0a2.A0Q("config_code", (String) null))) {
                            sparseArray.append(A0a2.A0B(A0a2.A0P("config_code"), "config_code"), Pair.create(A0a2.A0P("config_value"), A0a2.A0Q("config_expo_key", (String) null)));
                        } else {
                            sparseIntArray.append(A0a2.A0B(A0a2.A0P("event_code"), "event_code"), A0a2.A0B(A0a2.A0P("sampling_weight"), "sampling_weight"));
                        }
                    }
                    AnonymousClass19F r6 = r92.A02;
                    AnonymousClass11P r20 = r92.A01;
                    synchronized (r6) {
                        try {
                            SharedPreferences sharedPreferences2 = r6.A00;
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            if (!TextUtils.isEmpty(A0Q2) && ((AnonymousClass18O) ((C218117m) ((C219117w) r6.A04.A00.get()).A01(C218117m.class)).A00.get()).A09(AnonymousClass18O.A0I)) {
                                SharedPreferences A05 = r6.A07.A05("ab-props-backup");
                                C17900vP.A0J(A05);
                                Map<String, ?> all = sharedPreferences2.getAll();
                                if (!all.isEmpty()) {
                                    SharedPreferences.Editor edit2 = A05.edit();
                                    Iterator A15 = AnonymousClass000.A15(all);
                                    while (A15.hasNext()) {
                                        Map.Entry A16 = AnonymousClass000.A16(A15);
                                        String A0x = C17880vN.A0x(A16);
                                        Object value = A16.getValue();
                                        if (value != null) {
                                            Class<?> cls = value.getClass();
                                            if (cls.equals(Boolean.class)) {
                                                edit2.putBoolean(A0x, AnonymousClass000.A1Y(value));
                                            } else if (cls.equals(Float.class)) {
                                                edit2.putFloat(A0x, ((Float) value).floatValue());
                                            } else if (cls.equals(Integer.class)) {
                                                edit2.putInt(A0x, ((Integer) value).intValue());
                                            } else if (cls.equals(Long.class)) {
                                                edit2.putLong(A0x, ((Long) value).longValue());
                                            } else if (cls.equals(String.class)) {
                                                edit2.putString(A0x, (String) value);
                                            } else if (Set.class.isAssignableFrom(cls)) {
                                                edit2.putStringSet(A0x, (Set) value);
                                            }
                                        }
                                    }
                                    edit2.commit();
                                }
                            }
                            long max = Math.max(A04, 600000);
                            edit.putLong("ab_props:sys:refresh", max);
                            if (!TextUtils.isEmpty(A0Q2)) {
                                HashMap A112 = C17880vN.A11();
                                Set<String> stringSet = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                                sharedPreferences2.getAll();
                                edit.clear();
                                edit.putLong("ab_props:sys:refresh", max);
                                edit.putStringSet("ab_props:sys:last_exposure_keys", stringSet);
                                C139576z4 r1 = (C139576z4) r6.A08.get();
                                synchronized (r1) {
                                    try {
                                        r1.A01 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                                AnonymousClass10U r13 = r6.A03;
                                r13.notifyAllObservers(new AnonymousClass35V(r13, 48));
                                int i2 = 0;
                                while (i2 < sparseArray.size()) {
                                    try {
                                        int keyAt = sparseArray.keyAt(i2);
                                        Pair pair = (Pair) sparseArray.valueAt(i2);
                                        String str4 = (String) pair.second;
                                        if (AnonymousClass19F.A00(edit, r6, (String) pair.first, keyAt) && !TextUtils.isEmpty(str4)) {
                                            StringBuilder A102 = AnonymousClass000.A10();
                                            A102.append(keyAt);
                                            edit.putString(AnonymousClass000.A0y("_expo_key", A102), str4);
                                        }
                                        i2++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                Set<String> stringSet2 = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                                if (stringSet2 == null) {
                                    r12 = new AnonymousClass016(0);
                                } else {
                                    r12 = new AnonymousClass016((Collection) stringSet2);
                                }
                                AnonymousClass016 r11 = new AnonymousClass016(0);
                                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                                    Pair pair2 = (Pair) sparseArray.valueAt(i3);
                                    if (pair2 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = (String) pair2.second;
                                    }
                                    if (r12.contains(str2)) {
                                        r11.add(str2);
                                    }
                                }
                                C18020vd r02 = r6.A05;
                                r02.A0L(edit, r11);
                                r02.A0K();
                                A112.isEmpty();
                                z = true;
                            } else {
                                z = false;
                            }
                            edit.putString("ab_props:sys:config_key", A0Q);
                            if (!C18020vd.A05(C18040vf.A02, r6.A05, 12390)) {
                                AnonymousClass188 r5 = r6.A06;
                                C18070vi.A0d(r5, 0);
                                r5.CHx(A0Q, 4473, 0);
                                r5.CHx(A0Q, 4473, 1);
                            }
                            if (!TextUtils.isEmpty(A0Q2)) {
                                edit.putString("ab_props:sys:config_hash", A0Q2);
                            }
                            edit.putLong("ab_props:sys:last_refresh_time", AnonymousClass11P.A01(r20));
                            edit.putInt("ab_props:sys:last_version", A0A);
                            edit.apply();
                            if (z) {
                                AnonymousClass10U r23 = r6.A03;
                                r23.notifyAllObservers(new AnonymousClass35V(r23, 47));
                            }
                            r6.A06(0);
                            r6.A05(0);
                            File A0e = C17880vN.A0e(r6.A02.A00.getFilesDir(), "crash_counter");
                            if (A0e.exists()) {
                                A0e.delete();
                            }
                            try {
                            } catch (AnonymousClass1UI e) {
                                r92.A00.A0E("AbPropProtocolHelper/onReceiveABProps", "failed to parse response", e);
                                throw e;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                    if (!TextUtils.isEmpty(A0Q2)) {
                        AnonymousClass18E r24 = r92.A04;
                        synchronized (r24) {
                            try {
                                sharedPreferences = r24.A00;
                                if (sharedPreferences == null) {
                                    sharedPreferences = r24.A01.A05("field-stats-events-sampling");
                                    r24.A00 = sharedPreferences;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        edit3.clear();
                        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                            int keyAt2 = sparseIntArray.keyAt(i4);
                            edit3.putInt(String.valueOf(keyAt2), sparseIntArray.valueAt(i4));
                        }
                        edit3.apply();
                    }
                }
                if (A0K3 != null) {
                    String encodeToString = Base64.encodeToString(A0K3.A01, 2);
                    C53442cX r14 = ((C57962jv) this.A01).A03;
                    C18070vi.A0d(encodeToString, 0);
                    AnonymousClass00H r42 = r14.A01;
                    String A0d = C17880vN.A0K(r42).A0d();
                    C18070vi.A0X(A0d);
                    C18020vd r25 = r14.A00;
                    C18040vf r15 = C18040vf.A02;
                    if (!C18020vd.A05(r15, r25, 3664)) {
                        if (C18020vd.A05(r15, r25, 6084) && !A0d.equals(encodeToString)) {
                            editor = C19830z4.A00(C17880vN.A0K(r42)).putString("encrypted_rid", encodeToString);
                            break;
                        } else {
                            return;
                        }
                    } else if (A0d.length() != 0) {
                        editor = C19830z4.A00(C17880vN.A0K(r42)).remove("encrypted_rid");
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 4:
                Log.i("SpamXmppMethods/success");
                return;
            case 5:
                C18070vi.A0d(r4, 1);
                ((C72373Lr) this.A01).C7l(new C134676qy((C129006h6) null, r4));
                return;
            default:
                JniBridge.jvidispatchIOO(2, str3, r4);
                return;
        }
        editor.apply();
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
