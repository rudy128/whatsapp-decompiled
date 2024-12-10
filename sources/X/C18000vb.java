package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0vb  reason: invalid class name and case insensitive filesystem */
public class C18000vb {
    public static final boolean A0C;
    public Context A00;
    public C27661Wz A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final AnonymousClass118 A07;
    public final AnonymousClass11O A08;
    public final Set A09 = new HashSet();
    public final Object A0A = new Object();
    public volatile Locale A0B;

    public String A0E(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return A09(resourceId);
        }
        return null;
    }

    public String[] A0R(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = A09(iArr[i]);
        }
        return strArr;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        }
        A0C = z;
    }

    public static C27661Wz A00(C18000vb r5) {
        C27661Wz r0;
        synchronized (r5.A0A) {
            if (r5.A01 == null) {
                Boolean bool = C17960vV.A01;
                AnonymousClass1Ez r3 = new AnonymousClass1Ez("WhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
                r5.A01 = new C27661Wz(r5.A00, r5.A04);
                r3.A02();
            }
            r0 = r5.A01;
        }
        return r0;
    }

    public static Locale A01(Configuration configuration) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        if (locale2 == null) {
            return Locale.US;
        }
        return locale2;
    }

    private void A02() {
        synchronized (this.A0A) {
            this.A01 = null;
        }
        this.A0B = null;
        this.A03 = null;
        this.A02 = null;
        AnonymousClass11X.A01 = null;
        AnonymousClass11X.A02 = null;
        AnonymousClass11X.A03 = null;
    }

    public static void A03(C18000vb r4) {
        Context baseContext;
        Context baseContext2;
        if (!r4.A00.getResources().getConfiguration().locale.equals(r4.A04)) {
            Context context = r4.A07.A00;
            Context context2 = context;
            while ((context2 instanceof ContextWrapper) && (baseContext2 = ((ContextWrapper) context2).getBaseContext()) != null) {
                context2 = baseContext2;
            }
            r4.A00 = context2;
            Resources resources = context2.getResources();
            Configuration configuration = resources.getConfiguration();
            if (A0C) {
                configuration.locale = r4.A04;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } else {
                Configuration configuration2 = new Configuration();
                configuration2.setLocale(r4.A04);
                configuration.updateFrom(configuration2);
                while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
                    context = baseContext;
                }
                r4.A00 = context.createConfigurationContext(configuration);
            }
            r4.A02();
        }
    }

    public String A06() {
        StringBuilder sb = new StringBuilder();
        sb.append(A05());
        sb.append("_");
        sb.append(A04());
        return sb.toString();
    }

    public String A0A(int i) {
        return this.A00.getResources().getString(i);
    }

    public Locale A0N() {
        if (this.A0B == null) {
            this.A0B = A01(this.A00.getResources().getConfiguration());
        }
        return this.A0B;
    }

    public void A0O() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A03(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a A[LOOP:0: B:9:0x0074->B:11:0x007a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "whatsapplocale/saveandapplylanguage/language to save: "
            r1.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "device default"
        L_0x0013:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0084
            java.util.Locale r1 = r3.A05
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            java.lang.String r0 = r1.toLanguageTag()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0084
            X.11O r0 = r3.A08
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forced_language"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)
            r0.apply()
            r0 = 1
            r3.A06 = r0
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r4)
        L_0x0049:
            r3.A04 = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "whatsapplocale/saveandapplylanguage/setting language "
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.getDisplayLanguage(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Locale r0 = r3.A04
            java.util.Locale.setDefault(r0)
            A03(r3)
            java.util.Set r0 = r3.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r1.next()
            X.11V r0 = (X.AnonymousClass11V) r0
            r0.BxE()
            goto L_0x0074
        L_0x0084:
            X.11O r0 = r3.A08
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forced_language"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            r0 = 0
            r3.A06 = r0
            java.util.Locale r2 = r3.A05
            goto L_0x0049
        L_0x009b:
            r0 = r4
            goto L_0x0013
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18000vb.A0Q(java.lang.String):void");
    }

    public C18000vb(AnonymousClass118 r3, AnonymousClass11O r4) {
        Context baseContext;
        this.A07 = r3;
        this.A08 = r4;
        Context context = r3.A00;
        while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.A00 = context;
        Locale A012 = A01(context.getResources().getConfiguration());
        this.A05 = A012;
        this.A04 = A012;
        AnonymousClass11X.A01 = null;
        AnonymousClass11X.A02 = null;
        AnonymousClass11X.A03 = null;
    }

    public String A04() {
        String country = A0N().getCountry();
        String[] strArr = AnonymousClass1X0.A04;
        if (country != null && AnonymousClass1X0.A03.matcher(country).matches()) {
            return country;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("verifynumber/requestcode/invalid-country '");
        sb.append(country);
        sb.append("'");
        Log.i(sb.toString());
        return "ZZ";
    }

    public String A05() {
        String language = A0N().getLanguage();
        String[] strArr = AnonymousClass1X0.A04;
        if (language != null && AnonymousClass1X0.A02.matcher(language).matches()) {
            return language;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("verifynumber/requestcode/invalid-language '");
        sb.append(language);
        sb.append("'");
        Log.i(sb.toString());
        return "zz";
    }

    public String A07() {
        String str = "ZZ";
        if (!A04().equalsIgnoreCase(str)) {
            return A06();
        }
        String A052 = A05();
        boolean A022 = AnonymousClass112.A02();
        HashMap hashMap = C25465CgK.A04;
        if (A022) {
            str = (String) hashMap.getOrDefault(A052, str);
        } else {
            String str2 = (String) hashMap.get(A052);
            if (str2 != null) {
                str = str2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A052);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    public String A08(int i) {
        AnonymousClass1XD r0 = A00(this).A02.A00;
        if (r0 != null) {
            return AnonymousClass1XC.A01(r0, i);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public String A09(int i) {
        AnonymousClass1XD r2;
        String A002;
        C27661Wz A003 = A00(this);
        if (!A003.A07 && (r2 = A003.A03.A00) != null && i >= 2131886080 && i <= 2131898608) {
            int i2 = (i - 2131886080) + 506;
            if (!(Integer.valueOf(i2) == null || (A002 = r2.A00(i2)) == null)) {
                return A002;
            }
        }
        return this.A00.getResources().getString(i);
    }

    public String A0B(int i, Object... objArr) {
        return String.format(A0N(), A08(i), objArr);
    }

    public String A0C(int i, Object... objArr) {
        return String.format(A0N(), A09(i), objArr);
    }

    public String A0D(long j, int i) {
        String A012;
        C27661Wz A002 = A00(this);
        if (A002.A07) {
            int i2 = 2;
            if (j == 1) {
                i2 = 1;
            }
            return this.A00.getResources().getQuantityString(i, i2);
        }
        C22761Dc r4 = A002.A03;
        Long valueOf = Long.valueOf(j);
        AnonymousClass1XD r2 = r4.A00;
        if (r2 != null && i >= 2131755008 && i <= 2131755513) {
            int i3 = i - 2131755008;
            if (!(Integer.valueOf(i3) == null || (A012 = r2.A01(r4.A01, valueOf, i3)) == null)) {
                return A012;
            }
        }
        return this.A00.getResources().getQuantityString(i, (int) j);
    }

    public String A0F(String str) {
        AnonymousClass1X3 r1 = A00(this).A01;
        AnonymousClass1X5 r0 = r1.A00;
        if (str == null) {
            return null;
        }
        return r1.A02(r0, str).toString();
    }

    public String A0G(String str) {
        AnonymousClass1X3 r1 = A00(this).A01;
        AnonymousClass1X5 r0 = AnonymousClass1X4.A04;
        if (str == null) {
            return null;
        }
        return r1.A02(r0, str).toString();
    }

    public String A0H(String str, Object[] objArr, int i) {
        String str2;
        Locale A0N = A0N();
        C27661Wz A002 = A00(this);
        int i2 = 1;
        if (A002.A07) {
            if (!str.equals("1")) {
                i2 = 2;
            }
            str2 = this.A00.getResources().getQuantityString(i, i2);
        } else {
            C22761Dc r3 = A002.A03;
            AnonymousClass1XD r2 = r3.A00;
            str2 = null;
            if (r2 != null) {
                int i3 = i - 2131755008;
                if (Integer.valueOf(i3) != null) {
                    str2 = r2.A01(r3.A01, str, i3);
                }
            }
            if (str2 == null) {
                try {
                    i2 = (int) Double.parseDouble(str);
                } catch (NumberFormatException unused) {
                }
                str2 = this.A00.getResources().getQuantityString(i, i2);
            }
        }
        return String.format(A0N, str2, objArr);
    }

    public String A0I(Map map) {
        String languageTag;
        Locale A0N = A0N();
        C18070vi.A0d(A0N, 0);
        String languageTag2 = A0N.toLanguageTag();
        Map map2 = CHW.A00;
        if (map2.containsKey(languageTag2)) {
            languageTag = (String) map2.get(languageTag2);
        } else {
            languageTag = A0N.toLanguageTag();
            Set set = CHW.A01;
            if (!set.contains(languageTag)) {
                List A012 = C22761Dc.A01(A0N, false);
                C18070vi.A0X(A012);
                if (!A012.isEmpty()) {
                    Iterator it = C29431cG.A0r(A012).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            languageTag = (String) it.next();
                            if (set.contains(languageTag)) {
                                break;
                            }
                        } else {
                            String language = Locale.forLanguageTag((String) A012.get(0)).getLanguage();
                            if (!(language == null || language.length() == 0)) {
                                if (language.equals("in")) {
                                    language = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                } else if (language.equals("iw")) {
                                    language = "he";
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object next : set) {
                                    String str = (String) next;
                                    C18070vi.A0d(str, 0);
                                    if (str.startsWith(language)) {
                                        arrayList.add(next);
                                    }
                                }
                                if (!arrayList.isEmpty() && arrayList.size() == 1) {
                                    languageTag = (String) arrayList.get(0);
                                }
                            }
                        }
                    }
                }
                languageTag = null;
            }
            C18070vi.A0b(languageTag2);
            map2.put(languageTag2, languageTag);
        }
        if (languageTag != null) {
            String replace = languageTag.replace("-", "_");
            if (map == null || !map.containsKey(replace)) {
                return replace;
            }
            String str2 = (String) map.get(replace);
            if (str2 != null) {
                return str2;
            }
        }
        return "en_US";
    }

    public String A0J(Object[] objArr, int i, long j) {
        return String.format(A0N(), A00(this).A02.A02(Long.valueOf(j), i), objArr);
    }

    public String A0K(Object[] objArr, int i, long j) {
        return String.format(A0N(), A0D(j, i), objArr);
    }

    public NumberFormat A0L() {
        return (NumberFormat) A00(this).A04.clone();
    }

    public NumberFormat A0M() {
        return (NumberFormat) A00(this).A05.clone();
    }

    public void A0P(Configuration configuration) {
        Locale A012 = A01(configuration);
        if (!this.A05.equals(A012)) {
            StringBuilder sb = new StringBuilder();
            sb.append("whatsapplocale/savedefaultlanguage/phone language changed to: ");
            String[] strArr = AnonymousClass1X0.A04;
            sb.append(A012.toLanguageTag());
            Log.i(sb.toString());
            this.A05 = A012;
            if (!this.A06) {
                this.A04 = A012;
                A02();
                for (AnonymousClass11V BxE : this.A09) {
                    BxE.BxE();
                }
            }
        }
    }
}
