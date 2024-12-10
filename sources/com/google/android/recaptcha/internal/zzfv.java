package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.BE6;

public final class zzfv extends zzfx {
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        zzff.zzd(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            BE6.A1G(appendable, this.zzb.zzf, b >>> 18);
            BE6.A1G(appendable, this.zzb.zzf, (b >>> 12) & 63);
            BE6.A1G(appendable, this.zzb.zzf, (b >>> 6) & 63);
            BE6.A1G(appendable, this.zzb.zzf, b & 63);
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            zzf(appendable, bArr, i3, i2 - i3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzfv(java.lang.String r3, java.lang.String r4, java.lang.Character r5) {
        /*
            r2 = this;
            char[] r1 = r4.toCharArray()
            com.google.android.recaptcha.internal.zzft r0 = new com.google.android.recaptcha.internal.zzft
            r0.<init>(r3, r1)
            r2.<init>(r0, r5)
            char[] r0 = r0.zzf
            int r1 = r0.length
            r0 = 64
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            com.google.android.recaptcha.internal.zzff.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfv.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzft zzft = this.zzb;
        if (zzft.zzh[length % zzft.zzc]) {
            int i = 0;
            int i2 = 0;
            while (i < zze.length()) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                int zzb = (this.zzb.zzb(zze.charAt(i)) << 18) | (this.zzb.zzb(zze.charAt(i3)) << 12);
                i = BE6.A0A(zzb >>> 16, bArr, i2, i3);
                if (i < zze.length()) {
                    int i5 = i + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zze.charAt(i)) << 6);
                    i2 = i4 + 1;
                    bArr[i4] = (byte) ((zzb2 >>> 8) & 255);
                    if (i5 < zze.length()) {
                        i = i5 + 1;
                        bArr[i2] = (byte) ((zzb2 | this.zzb.zzb(zze.charAt(i5))) & 255);
                        i2++;
                    } else {
                        i = i5;
                    }
                } else {
                    i2 = i4;
                }
            }
            return i2;
        }
        throw new zzfw(AnonymousClass001.A1I("Invalid input length ", AnonymousClass000.A10(), zze.length()));
    }
}
