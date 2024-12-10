package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.17x  reason: invalid class name and case insensitive filesystem */
public class C219217x {
    public final AnonymousClass118 A00;
    public final C19830z4 A01;
    public final AnonymousClass12L A02;

    public static ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_PHONE_STATE");
        if (AnonymousClass112.A07()) {
            arrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        return arrayList;
    }

    public static boolean A01(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.checkPermission(str, "com.whatsapp.w4b") != 0) {
            return false;
        }
        return true;
    }

    public int A02(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        int A012 = C19740yt.A01(this.A00.A00, str);
        if (A012 == 0) {
            boolean A05 = C18020vd.A05(C18040vf.A02, this.A02.A00, 11348);
            C19830z4 r1 = this.A01;
            if (!A05 || ((SharedPreferences) r1.A00.get()).contains(str)) {
                C19830z4.A00(r1).remove(str).apply();
            }
        }
        return A012;
    }

    public int A03(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        return C19740yt.A01(this.A00.A00, str);
    }

    public int A04(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (String A022 : strArr) {
                int A023 = A02(A022);
                if (A023 != 0) {
                    return A023;
                }
            }
        }
        return 0;
    }

    public boolean A06() {
        if (A02("android.permission.ACCESS_COARSE_LOCATION") == 0 || A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public boolean A07() {
        if (A02("android.permission.NEARBY_WIFI_DEVICES") == 0) {
            return true;
        }
        return false;
    }

    public boolean A08() {
        AnonymousClass00H r3 = this.A01.A00;
        if (!"scoped".equals(((SharedPreferences) r3.get()).getString("external_storage_type", (String) null))) {
            return false;
        }
        int i = ((SharedPreferences) r3.get()).getInt("reg_skip_storage_perm", 0);
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        if (A02("android.permission.READ_CALL_LOG") == 0) {
            return true;
        }
        return false;
    }

    public boolean A0B() {
        if (A02("android.permission.ANSWER_PHONE_CALLS") != 0 || !A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        Log.i("Inquiring mic permission.");
        if (Build.VERSION.SDK_INT < 23 && this.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        if (!AnonymousClass112.A01() || A02("android.permission.RECORD_AUDIO") != 0) {
            return false;
        }
        return true;
    }

    public boolean A0F() {
        Log.i("Inquiring mic permission.");
        if (Build.VERSION.SDK_INT < 23 && this.A00.A00.checkCallingOrSelfPermission("android.permission.MODIFY_AUDIO_SETTINGS") == 0) {
            return true;
        }
        if (!AnonymousClass112.A01() || A02("android.permission.MODIFY_AUDIO_SETTINGS") != 0) {
            return false;
        }
        return true;
    }

    public boolean A0H() {
        if (this.A00.A00.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        return false;
    }

    public boolean A0K(String str) {
        if (!"mounted".equals(str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30 || A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public C219217x(AnonymousClass118 r1, C19830z4 r2, AnonymousClass12L r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (A04(r1) == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A05() {
        /*
            r4 = this;
            java.lang.String[] r1 = X.AnonymousClass73I.A02()
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x0032
            r0 = 0
            r0 = r1[r0]
            int r0 = r4.A02(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0015
            r3 = 1
        L_0x0015:
            r0 = 1
            r0 = r1[r0]
            int r0 = r4.A02(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            r0 = 2
            r0 = r1[r0]
            int r1 = r4.A02(r0)
            r0 = 0
            if (r1 != 0) goto L_0x002b
            r0 = 1
        L_0x002b:
            if (r3 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0039
        L_0x002f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x0032:
            int r0 = r4.A04(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x002f
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        L_0x003e:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219217x.A05():java.lang.Integer");
    }

    public boolean A09() {
        if (!A0E() || !A0F()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        String str;
        if (!AnonymousClass112.A05()) {
            str = "android.permission.CALL_PHONE";
        } else if (A02("android.permission.ANSWER_PHONE_CALLS") != 0) {
            return false;
        } else {
            str = "android.permission.READ_CALL_LOG";
        }
        if (A02(str) != 0 || !A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        if (AnonymousClass112.A07() || A04(AnonymousClass73I.A02()) == 0) {
            return true;
        }
        return false;
    }

    public boolean A0G() {
        if (A04(AnonymousClass73I.A04()) == 0) {
            return true;
        }
        return false;
    }

    public boolean A0I() {
        Iterator it = A00().iterator();
        boolean z = true;
        while (it.hasNext()) {
            boolean z2 = false;
            if (A02((String) it.next()) == 0) {
                z2 = true;
            }
            z &= z2;
        }
        return z;
    }

    public boolean A0J() {
        if (!AnonymousClass112.A08() || A02("android.permission.READ_PHONE_STATE") != -1) {
            return false;
        }
        return true;
    }
}
