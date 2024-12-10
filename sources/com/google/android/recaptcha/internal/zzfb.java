package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass1YE;
import X.C108955ca;
import X.C17880vN;
import X.C18070vi;
import X.C29351c6;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zzfb {
    public static final zzfb zza = new Object();
    public static final List zzb;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.recaptcha.internal.zzfb, java.lang.Object] */
    static {
        String[] strArr = new String[3];
        strArr[0] = "www.recaptcha.net";
        strArr[1] = "www.gstatic.com/recaptcha";
        zzb = zze(C18070vi.A0O("www.gstatic.cn/recaptcha", strArr, 2));
    }

    public static final boolean zzc(String str) {
        List list = zzb;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass1YE.A0A(str, C17880vN.A0v(it), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean zza(Uri uri) {
        if (!zzd(uri) || !zzc(uri.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean zzb(Uri uri) {
        return zzd(uri);
    }

    public static final boolean zzd(Uri uri) {
        if (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    public static final List zze(List list) {
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("https://");
            A10.append(A0v);
            A10.append("/");
            C108955ca.A1U(A10, A0D);
        }
        return A0D;
    }
}
