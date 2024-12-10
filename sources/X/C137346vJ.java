package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6vJ  reason: invalid class name and case insensitive filesystem */
public abstract class C137346vJ {
    public static boolean A00(C18030ve r6, AnonymousClass18K r7, AnonymousClass19T r8, String str) {
        String str2;
        boolean z;
        C18040vf r1 = C18040vf.A02;
        String A01 = C18020vd.A01(r1, r6, 1854);
        String str3 = "";
        if (A01 != null) {
            str2 = A01.trim();
        } else {
            str2 = str3;
        }
        String A012 = C18020vd.A01(r1, r6, 1855);
        if (A012 != null) {
            str3 = A012.trim();
        }
        HashSet A12 = C17880vN.A12();
        if (!TextUtils.isEmpty(str2)) {
            A12.addAll(Arrays.asList(str2.split(",")));
        }
        HashSet A122 = C17880vN.A12();
        if (!TextUtils.isEmpty(str3)) {
            A122.addAll(Arrays.asList(str3.split(",")));
        }
        if (A12.isEmpty() && A122.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet(A12);
        hashSet.addAll(A122);
        r8.markerStart(185477621);
        r8.markerAnnotate(185477621, "categories", hashSet.toString());
        r8.markerAnnotate(185477621, "checkLocation", str);
        HashMap A11 = C17880vN.A11();
        if (!A12.isEmpty()) {
            Iterator it = A12.iterator();
            z = true;
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                try {
                    A11.put(A0v, Boolean.valueOf(A01(A0v)));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    z = false;
                }
            }
            AnonymousClass62Y r12 = new AnonymousClass62Y();
            r12.A02 = str;
            r12.A01 = (Boolean) A11.get("su_exists");
            r12.A00 = (Boolean) A11.get("rw_paths");
            r7.CC7(r12);
        } else {
            z = true;
        }
        Iterator it2 = A122.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            String A0v2 = C17880vN.A0v(it2);
            if (!A11.containsKey(A0v2) || !Boolean.TRUE.equals(A11.get(A0v2))) {
                try {
                    if (A01(A0v2)) {
                    }
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    z = false;
                }
            }
            z2 = true;
        }
        short s = 576;
        if (z) {
            s = 575;
        }
        r8.markerEnd(185477621, s);
        return z2;
    }

    public static boolean A01(String str) {
        BufferedReader bufferedReader;
        if (str.equals("rw_paths")) {
            return C137636vm.A00();
        }
        if (str.equals("su_exists")) {
            Process process = null;
            try {
                Runtime runtime = Runtime.getRuntime();
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = "which";
                boolean z = true;
                A1Z[1] = "su";
                Process exec = runtime.exec(A1Z);
                if (exec == null) {
                    return false;
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(exec.getInputStream());
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        if (bufferedReader.readLine() == null) {
                            z = false;
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        exec.destroy();
                        return z;
                    } catch (Throwable th) {
                        inputStreamReader.close();
                        throw th;
                    }
                } catch (Exception unused) {
                    exec.destroy();
                    return false;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            } catch (Throwable unused2) {
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unknown check category: ");
            throw AnonymousClass001.A12(str, A10);
        }
        throw th;
    }
}
