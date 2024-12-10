package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

public class A1J {
    public final C188979iJ A00;
    public final C18030ve A01;
    public final C57402j1 A02;
    public final String A03;
    public final AtomicInteger A04 = new AtomicInteger((int) (Math.random() * 2.147483647E9d));
    public final C22487B9t A05;
    public final boolean A06;
    public final C34961lO A07;
    public final AnonymousClass11C A08;
    public final C139576z4 A09;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9iJ, java.lang.Object] */
    public A1J(C34961lO r6, AnonymousClass11C r7, AnonymousClass118 r8, C18030ve r9, C139576z4 r10, String str, C22487B9t b9t, boolean z) {
        ? obj = new Object();
        this.A05 = b9t;
        this.A00 = obj;
        this.A01 = r9;
        this.A09 = r10;
        this.A08 = r7;
        this.A07 = r6;
        this.A03 = str;
        this.A06 = z;
        this.A02 = new C57402j1(r7, r8, new C178049Bp());
    }

    public static ContentProviderClient A00(Context context, A1J a1j, Enum enumR, Integer num, String str, C192589oe r17) {
        String str2;
        boolean z;
        String A0I;
        String str3;
        String str4;
        try {
            PackageManager packageManager = context.getPackageManager();
            C192589oe r2 = r17;
            if (packageManager != null) {
                try {
                    if (!packageManager.getApplicationInfo(r2.A01, 0).enabled && (enumR instanceof AnonymousClass9IX)) {
                        C188979iJ r22 = a1j.A00;
                        String[] strArr = new String[4];
                        strArr[0] = "resolver_name";
                        if (num.intValue() != 0) {
                            str4 = "LITE_PROVIDER";
                        } else {
                            str4 = "LEGACY_PROVIDER";
                        }
                        strArr[1] = str4;
                        strArr[2] = "instance_key";
                        strArr[3] = str;
                        r22.A00(strArr);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    if (!(enumR instanceof AnonymousClass9IX)) {
                        return null;
                    }
                    C188979iJ r3 = a1j.A00;
                    String[] strArr2 = new String[6];
                    strArr2[0] = "resolver_name";
                    if (num.intValue() != 0) {
                        str3 = "LITE_PROVIDER";
                    } else {
                        str3 = "LEGACY_PROVIDER";
                    }
                    strArr2[1] = str3;
                    strArr2[2] = "failure_reason";
                    strArr2[3] = e.getMessage();
                    strArr2[4] = "instance_key";
                    strArr2[5] = str;
                    r3.A00(strArr2);
                    return null;
                }
            }
            Uri uri = r2.A00;
            String str5 = a1j.A03;
            Boolean bool = C17970vW.A01;
            if (!TextUtils.isEmpty(str5)) {
                if (a1j.A06) {
                    A0I = "{\"client_cache\":[\"wa_android_waffle\",\"whatsapp_android_waffle_cache_general_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\",\"whatsapp_android_access_library_general_waffle\"]}";
                } else {
                    A0I = a1j.A01.A0I(1010);
                }
                if (!TextUtils.isEmpty(A0I)) {
                    try {
                        C17960vV.A07(A0I);
                        JSONArray jSONArray = C17880vN.A16(A0I).getJSONArray("access_library");
                        int i = 0;
                        while (true) {
                            if (i >= jSONArray.length()) {
                                break;
                            }
                            try {
                                if (str5.equalsIgnoreCase(jSONArray.getString(i))) {
                                    z = true;
                                    break;
                                }
                                i++;
                            } catch (JSONException e2) {
                                C17960vV.A0B(e2);
                            }
                        }
                    } catch (JSONException e3) {
                        C17960vV.A0B(e3);
                    }
                }
            }
            z = false;
            if (z) {
                return a1j.A02.A00(context, uri);
            }
            return null;
        } catch (SecurityException e4) {
            if (!(enumR instanceof AnonymousClass9IX)) {
                return null;
            }
            C188979iJ r32 = a1j.A00;
            String[] strArr3 = new String[6];
            strArr3[0] = "resolver_name";
            if (num.intValue() != 0) {
                str2 = "LITE_PROVIDER";
            } else {
                str2 = "LEGACY_PROVIDER";
            }
            strArr3[1] = str2;
            strArr3[2] = "failure_reason";
            strArr3[3] = e4.getMessage();
            strArr3[4] = "instance_key";
            strArr3[5] = str;
            r32.A00(strArr3);
            return null;
        }
    }

    public List A01(Context context, Set set) {
        ArrayList arrayList;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A0y = AnonymousClass8BV.A0y(AnonymousClass9UI.A0C);
        while (A0y.hasNext()) {
            C192589oe r1 = (C192589oe) A0y.next();
            if (set.contains(r1.A03)) {
                A132.add(r1);
            }
        }
        Iterator it = A132.iterator();
        while (it.hasNext()) {
            C192589oe r11 = (C192589oe) it.next();
            String num = Integer.toString(this.A04.incrementAndGet());
            C188979iJ r9 = this.A00;
            AnonymousClass9IX r24 = AnonymousClass9IX.ACTIVE_ACCOUNT;
            Integer num2 = AnonymousClass00R.A00;
            r9.A00("resolver_name", "LEGACY_PROVIDER", "caller_name", null, "instance_key", num);
            Context context2 = context;
            String str = num;
            C192589oe r27 = r11;
            ContentProviderClient A002 = A00(context2, this, r24, num2, str, r27);
            if (A002 != null) {
                this.A05.C66(r11);
                try {
                    C18070vi.A0d(context2, 0);
                    C18070vi.A0d(r11, 2);
                    C18070vi.A0d(num, 6);
                    Cursor A003 = C197419wf.A00(A002, r9, r24, num2, str, r27);
                    if (A003 != null) {
                        arrayList = AnonymousClass000.A13();
                        C24360Bzv bzv = r11.A03;
                        C18070vi.A0X(bzv);
                        BCK bck = (BCK) CGT.A00.get(bzv);
                        if (bck == null) {
                            try {
                                throw new C21582AmW(AnonymousClass001.A1E(bzv, "Can't find corresponding transformer for SsoSource =", AnonymousClass000.A10()));
                            } catch (C21582AmW e) {
                                String[] A1b = C17880vN.A1b("resolver_name", "LEGACY_PROVIDER", 6, 1);
                                A1b[2] = "failure_reason";
                                AnonymousClass8BU.A1L(e, A1b);
                                A1b[5] = num;
                                r9.A00(A1b);
                                A003.close();
                            } catch (Throwable th) {
                                A003.close();
                                throw th;
                            }
                        } else {
                            while (A003.moveToNext()) {
                                A0y CPi = bck.CPi(context2, A003);
                                if (CPi != null) {
                                    arrayList.add(new C192339oD(r11, CPi));
                                }
                            }
                            A003.close();
                            arrayList.isEmpty();
                            String[] A1b2 = C17880vN.A1b("resolver_name", "LEGACY_PROVIDER", 4, 1);
                            A1b2[2] = "instance_key";
                            A1b2[3] = num;
                            r9.A00(A1b2);
                            A13.addAll(arrayList);
                            A002.release();
                        }
                    }
                    arrayList = AnonymousClass000.A13();
                    arrayList.isEmpty();
                    String[] A1b22 = C17880vN.A1b("resolver_name", "LEGACY_PROVIDER", 4, 1);
                    A1b22[2] = "instance_key";
                    A1b22[3] = num;
                    r9.A00(A1b22);
                    A13.addAll(arrayList);
                    A002.release();
                } catch (RemoteException | SecurityException e2) {
                    String[] A1b3 = C17880vN.A1b("resolver_name", "LEGACY_PROVIDER", 6, 1);
                    A1b3[2] = "failure_reason";
                    AnonymousClass8BU.A1L(e2, A1b3);
                    A1b3[5] = num;
                    r9.A00(A1b3);
                }
            }
        }
        return Collections.unmodifiableList(A13);
    }

    public List A02(Context context, C24360Bzv bzv) {
        ArrayList arrayList;
        A0y a0y;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A0y = AnonymousClass8BV.A0y(AnonymousClass9UI.A0B);
        while (A0y.hasNext()) {
            C192589oe r1 = (C192589oe) A0y.next();
            if (bzv == r1.A03) {
                A132.add(r1);
            }
        }
        Iterator it = A132.iterator();
        while (it.hasNext()) {
            C192589oe r12 = (C192589oe) it.next();
            AnonymousClass9IX r23 = AnonymousClass9IX.ACTIVE_ACCOUNT;
            String num = Integer.toString(this.A04.incrementAndGet());
            C188979iJ r10 = this.A00;
            Integer num2 = AnonymousClass00R.A01;
            r10.A00("resolver_name", "LITE_PROVIDER", "caller_name", null, "instance_key", num);
            Context context2 = context;
            String str = num;
            C192589oe r26 = r12;
            ContentProviderClient A002 = A00(context2, this, r23, num2, str, r26);
            if (A002 != null) {
                try {
                    C18070vi.A0d(context2, 0);
                    C18070vi.A0d(r12, 2);
                    C18070vi.A0d(num, 5);
                    Cursor A003 = C197419wf.A00(A002, r10, r23, num2, str, r26);
                    if (A003 != null) {
                        arrayList = AnonymousClass000.A13();
                        C24360Bzv bzv2 = r12.A03;
                        C18070vi.A0X(bzv2);
                        BCK bck = (BCK) CGT.A00.get(bzv2);
                        if (bck == null) {
                            try {
                                throw new C21582AmW(AnonymousClass001.A1E(bzv2, "Can't find corresponding transformer for SsoSource =", AnonymousClass000.A10()));
                            } catch (C21582AmW e) {
                                String[] A1b = C17880vN.A1b("resolver_name", "LITE_PROVIDER", 6, 1);
                                A1b[2] = "failure_reason";
                                AnonymousClass8BU.A1L(e, A1b);
                                A1b[5] = num;
                                r10.A00(A1b);
                                A003.close();
                            } catch (Throwable th) {
                                A003.close();
                                throw th;
                            }
                        } else {
                            while (A003.moveToNext()) {
                                if (bzv2 == C24360Bzv.FACEBOOK || bzv2 == C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER) {
                                    a0y = bck.CPk(context2, A003);
                                } else {
                                    a0y = bck.CPi(context2, A003);
                                }
                                if (a0y != null) {
                                    arrayList.add(new C192339oD(r12, a0y));
                                }
                            }
                            A003.close();
                            arrayList.isEmpty();
                            String[] A1b2 = C17880vN.A1b("resolver_name", "LITE_PROVIDER", 4, 1);
                            A1b2[2] = "instance_key";
                            A1b2[3] = num;
                            r10.A00(A1b2);
                            A13.addAll(arrayList);
                            A002.release();
                        }
                    }
                    arrayList = AnonymousClass000.A13();
                    arrayList.isEmpty();
                    String[] A1b22 = C17880vN.A1b("resolver_name", "LITE_PROVIDER", 4, 1);
                    A1b22[2] = "instance_key";
                    A1b22[3] = num;
                    r10.A00(A1b22);
                    A13.addAll(arrayList);
                    A002.release();
                } catch (RemoteException e2) {
                    String[] A1b3 = C17880vN.A1b("resolver_name", "LITE_PROVIDER", 6, 1);
                    A1b3[2] = "failure_reason";
                    AnonymousClass8BU.A1L(e2, A1b3);
                    A1b3[5] = num;
                    r10.A00(A1b3);
                }
            }
        }
        return Collections.unmodifiableList(A13);
    }
}
