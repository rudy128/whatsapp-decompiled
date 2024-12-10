package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE7;
import X.BEA;
import java.nio.charset.Charset;
import java.util.List;

public final class zzhd implements zzkq {
    public final zzhc zza;
    public int zzb;
    public int zzc;
    public int zzd = 0;

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return BE6.A0D(this);
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzgw zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzkr zzkr, zzie zzie) {
        zzS(3);
        zzP(obj, zzkr, zzie);
    }

    public final void zzu(Object obj, zzkr zzkr, zzie zzie) {
        zzS(2);
        zzQ(obj, zzkr, zzie);
    }

    private final void zzP(Object obj, zzkr zzkr, zzie zzie) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzkr.zzh(obj, this, zzie);
            if (this.zzb != this.zzc) {
                throw BE6.A0Y("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzkr zzkr, zzie zzie) {
        zzhc zzhc = this.zza;
        int zzn = zzhc.zzn();
        if (zzhc.zza < zzhc.zzb) {
            zzhc zzhc2 = this.zza;
            int zze = zzhc2.zze(zzn);
            zzhc2.zza++;
            zzkr.zzh(obj, this, zzie);
            zzhc zzhc3 = this.zza;
            zzhc3.zzz(0);
            zzhc3.zza--;
            zzhc3.zzA(zze);
            return;
        }
        throw BE6.A0Y("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzS(int i) {
        if ((this.zzb & 7) != i) {
            throw BE7.A0J();
        }
    }

    public static final void zzT(int i) {
        if ((i & 3) != 0) {
            throw BE6.A0Y("Failed to parse the message.");
        }
    }

    public static final void zzU(int i) {
        if ((i & 7) != 0) {
            throw BE6.A0Y("Failed to parse the message.");
        }
    }

    public static zzhd zzq(zzhc zzhc) {
        zzhd zzhd = zzhc.zzc;
        if (zzhd == null) {
            return new zzhd(zzhc);
        }
        return zzhd;
    }

    public final void zzA(List list) {
        int i;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A0D = BE6.A0D(this);
                    zzU(A0D);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A0D;
                    do {
                        zzjt.zzg(zzhc.zzo());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                zzjt.zzg(this.zza.zzo());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A0D2 = BE6.A0D(this);
                    zzU(A0D2);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A0D2;
                    do {
                        BE7.A1S(list, zzhc2.zzo());
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                BE7.A1S(list, this.zza.zzo());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzB(List list) {
        int A0C;
        if (list instanceof zzil) {
            zzil zzil = (zzil) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzil.zze(this.zza.zzc());
                        if (!BE6.A1U(this)) {
                            A0C = BE6.A0C(this);
                        } else {
                            return;
                        }
                    } while (A0C == this.zzb);
                }
                throw BE7.A0J();
            }
            int A0D = BE6.A0D(this);
            zzT(A0D);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A0D;
            do {
                zzil.zze(zzhc.zzc());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!BE6.A1U(this)) {
                        A0C = BE6.A0C(this);
                    } else {
                        return;
                    }
                } while (A0C == this.zzb);
            }
            throw BE7.A0J();
        }
        int A0D2 = BE6.A0D(this);
        zzT(A0D2);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A0D2;
        do {
            list.add(Float.valueOf(zzhc2.zzc()));
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A0C;
    }

    @Deprecated
    public final void zzC(List list, zzkr zzkr, zzie zzie) {
        int A0C;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw BE7.A0J();
        }
        do {
            Object zze = zzkr.zze();
            zzP(zze, zzkr, zzie);
            zzkr.zzf(zze);
            list.add(zze);
            if (!BE6.A1U(this) && this.zzd == 0) {
                A0C = BE6.A0C(this);
            } else {
                return;
            }
        } while (A0C == i);
        this.zzd = A0C;
    }

    public final void zzD(List list) {
        int i;
        int A0A;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zziu.zzg(this.zza.zzh());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zziu.zzg(this.zza.zzh());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A11(this.zza.zzh(), list);
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A11(this.zza.zzh(), list);
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzE(List list) {
        int i;
        int A0A;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zzjt.zzg(this.zza.zzp());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zzjt.zzg(this.zza.zzp());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A1S(list, this.zza.zzp());
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A1S(list, this.zza.zzp());
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzF(List list, zzkr zzkr, zzie zzie) {
        int A0C;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw BE7.A0J();
        }
        do {
            Object zze = zzkr.zze();
            zzQ(zze, zzkr, zzie);
            zzkr.zzf(zze);
            list.add(zze);
            if (!BE6.A1U(this) && this.zzd == 0) {
                A0C = BE6.A0C(this);
            } else {
                return;
            }
        } while (A0C == i);
        this.zzd = A0C;
    }

    public final void zzG(List list) {
        int A0C;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zziu.zzg(this.zza.zzk());
                        if (!BE6.A1U(this)) {
                            A0C = BE6.A0C(this);
                        } else {
                            return;
                        }
                    } while (A0C == this.zzb);
                }
                throw BE7.A0J();
            }
            int A0D = BE6.A0D(this);
            zzT(A0D);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A0D;
            do {
                zziu.zzg(zzhc.zzk());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    BE7.A11(this.zza.zzk(), list);
                    if (!BE6.A1U(this)) {
                        A0C = BE6.A0C(this);
                    } else {
                        return;
                    }
                } while (A0C == this.zzb);
            }
            throw BE7.A0J();
        }
        int A0D2 = BE6.A0D(this);
        zzT(A0D2);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A0D2;
        do {
            BE7.A11(zzhc2.zzk(), list);
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A0C;
    }

    public final void zzH(List list) {
        int i;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A0D = BE6.A0D(this);
                    zzU(A0D);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A0D;
                    do {
                        zzjt.zzg(zzhc.zzt());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                zzjt.zzg(this.zza.zzt());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A0D2 = BE6.A0D(this);
                    zzU(A0D2);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A0D2;
                    do {
                        BE7.A1S(list, zzhc2.zzt());
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                BE7.A1S(list, this.zza.zzt());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzI(List list) {
        int i;
        int A0A;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zziu.zzg(this.zza.zzl());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zziu.zzg(this.zza.zzl());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A11(this.zza.zzl(), list);
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A11(this.zza.zzl(), list);
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzJ(List list) {
        int i;
        int A0A;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zzjt.zzg(this.zza.zzu());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zzjt.zzg(this.zza.zzu());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A1S(list, this.zza.zzu());
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A1S(list, this.zza.zzu());
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzK(java.util.List r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.zzb
            r1 = r0 & 7
            r0 = 2
            if (r1 != r0) goto L_0x0044
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzjm
            if (r0 == 0) goto L_0x0027
            if (r4 != 0) goto L_0x003f
            com.google.android.recaptcha.internal.zzjm r3 = (com.google.android.recaptcha.internal.zzjm) r3
        L_0x000f:
            com.google.android.recaptcha.internal.zzgw r0 = r2.zzp()
            r3.zzi(r0)
            boolean r0 = X.BE6.A1U(r2)
            if (r0 != 0) goto L_0x0026
            int r1 = X.BE6.A0C(r2)
            int r0 = r2.zzb
            if (r1 == r0) goto L_0x000f
        L_0x0024:
            r2.zzd = r1
        L_0x0026:
            return
        L_0x0027:
            if (r4 != 0) goto L_0x003f
            java.lang.String r0 = r2.zzr()
        L_0x002d:
            r3.add(r0)
            boolean r0 = X.BE6.A1U(r2)
            if (r0 != 0) goto L_0x0026
            int r1 = X.BE6.A0C(r2)
            int r0 = r2.zzb
            if (r1 == r0) goto L_0x0027
            goto L_0x0024
        L_0x003f:
            java.lang.String r0 = r2.zzs()
            goto L_0x002d
        L_0x0044:
            com.google.android.recaptcha.internal.zzjd r0 = X.BE7.A0J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhd.zzK(java.util.List, boolean):void");
    }

    public final void zzL(List list) {
        int i;
        int A0A;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zziu.zzg(BE6.A0D(this));
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zziu.zzg(BE6.A0D(this));
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A11(BE6.A0D(this), list);
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A11(BE6.A0D(this), list);
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzM(List list) {
        int i;
        int A0A;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zzjt.zzg(this.zza.zzv());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zzjt.zzg(this.zza.zzv());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A1S(list, this.zza.zzv());
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A1S(list, this.zza.zzv());
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc() {
        /*
            r3 = this;
            int r2 = r3.zzd
            if (r2 == 0) goto L_0x0013
            r3.zzb = r2
            r0 = 0
            r3.zzd = r0
        L_0x0009:
            int r1 = r3.zzc
            int r0 = r2 >>> 3
            if (r2 != r1) goto L_0x0012
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0012:
            return r0
        L_0x0013:
            int r2 = X.BE6.A0C(r3)
            r3.zzb = r2
            if (r2 == 0) goto L_0x000f
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhd.zzc():int");
    }

    public final void zzv(List list) {
        int i;
        int A0A;
        if (list instanceof zzgl) {
            zzgl zzgl = (zzgl) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zzgl.zze(this.zza.zzD());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zzgl.zze(this.zza.zzD());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzw(List list) {
        int A0C;
        if ((this.zzb & 7) != 2) {
            throw BE7.A0J();
        }
        do {
            list.add(zzp());
            if (!BE6.A1U(this)) {
                A0C = BE6.A0C(this);
            } else {
                return;
            }
        } while (A0C == this.zzb);
        this.zzd = A0C;
    }

    public final void zzx(List list) {
        int i;
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A0D = BE6.A0D(this);
                    zzU(A0D);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A0D;
                    do {
                        zzhy.zze(zzhc.zzb());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                zzhy.zze(this.zza.zzb());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A0D2 = BE6.A0D(this);
                    zzU(A0D2);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A0D2;
                    do {
                        list.add(Double.valueOf(zzhc2.zzb()));
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw BE7.A0J();
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzy(List list) {
        int i;
        int A0A;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A0A = BEA.A0A(this);
                    do {
                        zziu.zzg(this.zza.zzf());
                    } while (BE6.A0B(this) < A0A);
                }
                throw BE7.A0J();
            }
            do {
                zziu.zzg(this.zza.zzf());
                if (!BE6.A1U(this)) {
                    i = BE6.A0C(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A0A = BEA.A0A(this);
                do {
                    BE7.A11(this.zza.zzf(), list);
                } while (BE6.A0B(this) < A0A);
            }
            throw BE7.A0J();
        }
        do {
            BE7.A11(this.zza.zzf(), list);
            if (!BE6.A1U(this)) {
                i = BE6.A0C(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A0A);
    }

    public final void zzz(List list) {
        int A0C;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zziu.zzg(this.zza.zzg());
                        if (!BE6.A1U(this)) {
                            A0C = BE6.A0C(this);
                        } else {
                            return;
                        }
                    } while (A0C == this.zzb);
                }
                throw BE7.A0J();
            }
            int A0D = BE6.A0D(this);
            zzT(A0D);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A0D;
            do {
                zziu.zzg(zzhc.zzg());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    BE7.A11(this.zza.zzg(), list);
                    if (!BE6.A1U(this)) {
                        A0C = BE6.A0C(this);
                    } else {
                        return;
                    }
                } while (A0C == this.zzb);
            }
            throw BE7.A0J();
        }
        int A0D2 = BE6.A0D(this);
        zzT(A0D2);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A0D2;
        do {
            BE7.A11(zzhc2.zzg(), list);
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A0C;
    }

    public zzhd(zzhc zzhc) {
        Charset charset = zzjc.zza;
        this.zza = zzhc;
        zzhc.zzc = this;
    }

    private final void zzR(int i) {
        if (BE6.A0B(this) != i) {
            throw BE7.A0L();
        }
    }

    public final boolean zzO() {
        int i;
        if (BE6.A1U(this) || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }
}
