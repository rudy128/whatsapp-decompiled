package X;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.11W  reason: invalid class name */
public class AnonymousClass11W implements AnonymousClass11V {
    public static final String A07 = "2.24.24.78".replace(' ', '_');
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass118 A05;
    public final C18000vb A06;

    public synchronized String A02() {
        String str;
        str = this.A02;
        if (str == null) {
            str = A00(this.A05, this, "2.24.24.78");
            this.A02 = str;
        }
        return str;
    }

    public synchronized String A03() {
        String str;
        String str2;
        String str3;
        str = this.A04;
        if (str == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("FBAN", "WhatsAppAndroid");
            hashMap.put("FBAV", A07);
            hashMap.put("FBLC", this.A06.A06());
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append(" [");
            for (Object next : C61122pA.A00) {
                Object[] objArr = new Object[2];
                objArr[0] = next;
                String str4 = (String) hashMap.get(next);
                if (TextUtils.isEmpty(str4) || str4 == null) {
                    str3 = "null";
                } else {
                    str3 = C61122pA.A00(str4).replace("/", "-").replace(";", "-");
                }
                objArr[1] = str3;
                sb.append(String.format((Locale) null, "%s/%s;", objArr));
            }
            for (Object next2 : C61122pA.A01) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = next2;
                String str5 = (String) hashMap.get(next2);
                if (TextUtils.isEmpty(str5) || str5 == null) {
                    str2 = "null";
                } else {
                    str2 = C61122pA.A00(str5).replace("/", "-").replace(";", "-");
                }
                objArr2[1] = str2;
                sb.append(String.format((Locale) null, "%s/%s;", objArr2));
            }
            sb.append("]");
            str = sb.toString();
            this.A04 = str;
        }
        return str;
    }

    public synchronized String A04(Map map) {
        String str;
        str = this.A03;
        if (str == null) {
            str = A01(this, map);
            this.A03 = str;
        }
        return str;
    }

    public void BxE() {
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public static String A00(AnonymousClass118 r11, AnonymousClass11W r12, String str) {
        String str2;
        String str3;
        String str4 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(' ', '_'));
        sb.append("");
        String obj = sb.toString();
        String replace = "Android".replace(' ', '_');
        Boolean bool = C17970vW.A03;
        synchronized (r12) {
        }
        String replace2 = r11.A00.getString(2131898700).replace(' ', '_');
        try {
            str2 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e) {
            Log.e("app/user-agent/release", e);
            str2 = str4;
        }
        try {
            str3 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/manufacturer", e2);
            str3 = str4;
        }
        try {
            str4 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/model", e3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace2);
        sb2.append("/");
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(replace);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" Device/");
        sb2.append(str3);
        sb2.append("-");
        sb2.append(str4);
        sb2.append("");
        return sb2.toString();
    }

    public static String A01(AnonymousClass11W r9, Map map) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("FBBR", Build.BOARD);
        hashMap.put("FBBD", Build.BRAND);
        hashMap.put("FBDM", Resources.getSystem().getDisplayMetrics().toString());
        hashMap.put("FBSV", Build.VERSION.RELEASE);
        hashMap.put("FBCA", String.format((Locale) null, "%s:%s", new Object[]{Build.CPU_ABI, Build.CPU_ABI2}));
        String A022 = r9.A02();
        hashMap.put("FBAN", "WhatsAppAndroid");
        hashMap.put("FBAV", A07);
        hashMap.put("FBBV", String.valueOf(242478021));
        hashMap.put("FBLC", r9.A06.A0I(map));
        hashMap.put("FBPN", r9.A05.A00.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append(A022);
        sb.append(" [");
        for (Object next : C61122pA.A00) {
            Object[] objArr = new Object[2];
            objArr[0] = next;
            String str3 = (String) hashMap.get(next);
            if (TextUtils.isEmpty(str3) || str3 == null) {
                str2 = "null";
            } else {
                str2 = C61122pA.A00(str3).replace("/", "-").replace(";", "-");
            }
            objArr[1] = str2;
            sb.append(String.format((Locale) null, "%s/%s;", objArr));
        }
        for (Object next2 : C61122pA.A01) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = next2;
            String str4 = (String) hashMap.get(next2);
            if (TextUtils.isEmpty(str4) || str4 == null) {
                str = "null";
            } else {
                str = C61122pA.A00(str4).replace("/", "-").replace(";", "-");
            }
            objArr2[1] = str;
            sb.append(String.format((Locale) null, "%s/%s;", objArr2));
        }
        sb.append("]");
        return sb.toString();
    }

    public AnonymousClass11W(AnonymousClass118 r1, C18000vb r2) {
        this.A05 = r1;
        this.A06 = r2;
    }
}
