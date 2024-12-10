package com.google.android.recaptcha.internal;

import X.BE6;
import X.BEB;

public abstract class zzlg {
    public static String zza(zzgw zzgw) {
        String str;
        StringBuilder A0t = BE6.A0t(zzgw.zzd());
        for (int i = 0; i < zzgw.zzd(); i++) {
            int zza = zzgw.zza(i);
            if (zza != 34) {
                if (zza == 39) {
                    str = "\\'";
                } else if (zza != 92) {
                    switch (zza) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (zza < 32 || zza > 126) {
                                BEB.A1M(A0t, zza);
                                zza = (zza & 7) + 48;
                            }
                            A0t.append((char) zza);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0t.append(str);
            } else {
                str = "\\\"";
                A0t.append(str);
            }
        }
        return A0t.toString();
    }
}
