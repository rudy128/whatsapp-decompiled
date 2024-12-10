package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass1YE;
import X.AnonymousClass3Gr;
import X.AnonymousClass8BS;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C21351Aig;
import X.C21489Aky;
import X.C22821Di;
import X.C29351c6;
import X.C29431cG;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzy implements zzh {
    public final Context zza;
    public final String zzb = "rce_";
    public final zzad zzc;

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File name : listFiles) {
                if (C18070vi.A18(name.getName(), C17900vP.A0A(this.zzb, str))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String zza(String str) {
        File A0e = C17880vN.A0e(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (A0e.exists()) {
            return new String(AnonymousClass3Gr.A02(A0e), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (File file : listFiles) {
                    if (AnonymousClass1YE.A0A(file.getName(), this.zzb, false)) {
                        A13.add(file);
                    }
                }
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    AnonymousClass8BS.A0T(it).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        C21351Aig aig = new C21351Aig();
        ArrayList A0D = C29351c6.A0D(aig);
        Iterator it = aig.iterator();
        while (it.hasNext()) {
            C21489Aky aky = (C21489Aky) it;
            int i = aky.A00;
            if (i != aky.A02) {
                aky.A00 = aky.A03 + i;
            } else if (aky.A01) {
                aky.A01 = false;
            } else {
                throw new NoSuchElementException();
            }
            A0D.add(Character.valueOf((char) i));
        }
        List A0u = C29431cG.A0u(A0D);
        Collections.shuffle(A0u);
        String A0g = C29431cG.A0g("", "", "", A0u.subList(0, 8), (C22821Di) null);
        File A0e = C17880vN.A0e(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(A0g)));
        zzad.zzb(A0e, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        A0e.renameTo(C17880vN.A0e(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }
}
