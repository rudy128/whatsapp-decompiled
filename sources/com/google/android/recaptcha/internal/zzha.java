package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.BEA;
import X.BEB;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public final class zzha extends zzhc {
    public final InputStream zze;
    public final byte[] zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public int zzk;
    public int zzl = Integer.MAX_VALUE;

    public /* synthetic */ zzha(InputStream inputStream, int i, zzgz zzgz) {
        super((zzhb) null);
        Charset charset = zzjc.zza;
        this.zze = inputStream;
        this.zzf = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzJ() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzh = i4;
            this.zzg = i - i4;
            return;
        }
        this.zzh = 0;
    }

    public final int zzd() {
        return this.zzk + this.zzi;
    }

    public final long zzs() {
        int i = 0;
        long j = 0;
        do {
            byte zza = zza();
            j |= ((long) (zza & Byte.MAX_VALUE)) << i;
            if ((zza & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw BE6.A0Y("CodedInputStream encountered a malformed varint.");
    }

    private final boolean zzL(int i) {
        int i2 = this.zzi;
        int i3 = i2 + i;
        int i4 = this.zzg;
        if (i3 > i4) {
            int i5 = this.zzk;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.zzl) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.zzk + i2;
                    this.zzk = i5;
                    i4 = this.zzg - i2;
                    this.zzg = i4;
                    this.zzi = 0;
                }
                try {
                    int read = this.zze.read(this.zzf, i4, BE6.A09(Integer.MAX_VALUE - i5, i4, 4096 - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        StringBuilder A11 = AnonymousClass000.A11(String.valueOf(this.zze.getClass()));
                        A11.append("#read(byte[]) returned invalid result: ");
                        A11.append(read);
                        throw AnonymousClass000.A0o("\nThe InputStream implementation is buggy.", A11);
                    } else if (read > 0) {
                        this.zzg += read;
                        zzJ();
                        if (this.zzg >= i) {
                            return true;
                        }
                        return zzL(i);
                    }
                } catch (zzje e) {
                    e.zzb = true;
                    throw e;
                }
            }
            return false;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("refillBuffer() called when ");
        A10.append(i);
        throw AnonymousClass000.A0o(" bytes were already available in buffer", A10);
    }

    private final byte[] zzN(int i) {
        if (i == 0) {
            return zzjc.zzd;
        }
        if (i >= 0) {
            int i2 = this.zzk;
            int i3 = this.zzi;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.zzl;
                if (i4 <= i5) {
                    int i6 = this.zzg - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzje e) {
                            e.zzb = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i6);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i6 < i) {
                        int read = this.zze.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.zzk += read;
                            i6 += read;
                        } else {
                            throw BE7.A0L();
                        }
                    }
                    return bArr;
                }
                zzB((i5 - i2) - i3);
                throw BE7.A0L();
            }
            throw BE6.A0Y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw BE7.A0K();
    }

    public final void zzA(int i) {
        this.zzl = i;
        zzJ();
    }

    public final void zzB(int i) {
        IllegalStateException illegalStateException;
        int i2 = this.zzg;
        int i3 = this.zzi;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.zzi = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.zzk;
            int i6 = i5 + i3;
            int i7 = this.zzl;
            if (i6 + i <= i7) {
                this.zzk = i6;
                this.zzg = 0;
                this.zzi = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.zze.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            }
                            i4 += (int) skip;
                        } else {
                            StringBuilder A11 = AnonymousClass000.A11(String.valueOf(this.zze.getClass()));
                            A11.append("#skip returned invalid result: ");
                            A11.append(skip);
                            illegalStateException = AnonymousClass000.A0o("\nThe InputStream implementation is buggy.", A11);
                            throw illegalStateException;
                        }
                    } catch (zzje e) {
                        e.zzb = true;
                        illegalStateException = e;
                    } catch (Throwable th) {
                        this.zzk += i4;
                        zzJ();
                        throw th;
                    }
                }
                this.zzk += i4;
                zzJ();
                if (i4 < i) {
                    int i8 = this.zzg;
                    int i9 = i8 - this.zzi;
                    this.zzi = i8;
                    while (true) {
                        zzK(1);
                        int i10 = i - i9;
                        int i11 = this.zzg;
                        if (i10 > i11) {
                            i9 += i11;
                            this.zzi = i11;
                        } else {
                            this.zzi = i10;
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                zzB((i7 - i5) - i3);
                throw BE7.A0L();
            }
        }
        throw BE7.A0K();
    }

    public final boolean zzC() {
        if (this.zzi != this.zzg || zzL(1)) {
            return false;
        }
        return true;
    }

    public final boolean zzE(int i) {
        int zzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            int i4 = 8;
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = zzj();
                } else if (i2 == 3) {
                    do {
                        zzm = zzm();
                        if (zzm == 0 || !zzE(zzm)) {
                            zzz(((i >>> 3) << 3) | 4);
                        }
                        zzm = zzm();
                        break;
                    } while (!zzE(zzm));
                    zzz(((i >>> 3) << 3) | 4);
                    return true;
                } else if (i2 == 4) {
                    return false;
                } else {
                    if (i2 == 5) {
                        zzB(4);
                    } else {
                        throw BE7.A0J();
                    }
                }
            }
            zzB(i4);
            return true;
        }
        int i5 = this.zzg;
        int i6 = this.zzi;
        if (i5 - i6 >= 10) {
            do {
                byte[] bArr = this.zzf;
                int i7 = i6;
                i6++;
                this.zzi = i6;
                if (bArr[i7] < 0) {
                    i3++;
                }
            } while (i3 < 10);
        } else {
            while (zza() < 0) {
                i3++;
                if (i3 >= 10) {
                }
            }
        }
        throw BE6.A0Y("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i = this.zzi;
        this.zzi = i + 1;
        return bArr[i];
    }

    public final int zze(int i) {
        if (i >= 0) {
            int i2 = this.zzk + this.zzi;
            int i3 = this.zzl;
            int i4 = i + i2;
            if (i4 <= i3) {
                this.zzl = i4;
                zzJ();
                return i3;
            }
            throw BE7.A0L();
        }
        throw BE7.A0K();
    }

    public final int zzi() {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzK(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return BEB.A09(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4[r2] < 0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 == r0) goto L_0x004d
            byte[] r4 = r5.zzf
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x0011
            r5.zzi = r2
            return r3
        L_0x0011:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0053
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x005f
        L_0x0022:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
        L_0x004d:
            long r1 = r5.zzs()
            int r0 = (int) r1
            return r0
        L_0x0053:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x0062
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x005e:
            r1 = r2
        L_0x005f:
            r5.zzi = r1
            return r3
        L_0x0062:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0022
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzha.zzj():int");
    }

    public final long zzq() {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzK(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        return BEB.A0H(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (((long) r5[r9]) >= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzr() {
        /*
            r10 = this;
            int r0 = r10.zzi
            int r2 = r10.zzg
            if (r2 == r0) goto L_0x00a8
            byte[] r5 = r10.zzf
            int r1 = r0 + 1
            byte r3 = r5[r0]
            if (r3 < 0) goto L_0x0012
            r10.zzi = r1
            long r0 = (long) r3
            return r0
        L_0x0012:
            int r2 = r2 - r1
            r0 = 9
            if (r2 < r0) goto L_0x00a8
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0026
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r3 = (long) r3
        L_0x0023:
            r10.zzi = r6
            return r3
        L_0x0026:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x0034
            r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L_0x0032:
            r6 = r9
            goto L_0x0023
        L_0x0034:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x0022
        L_0x0042:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            long r3 = (long) r3
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0055:
            long r3 = r3 ^ r0
            goto L_0x0032
        L_0x0057:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0069:
            long r3 = r3 ^ r0
            goto L_0x0023
        L_0x006b:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0055
        L_0x007e:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0069
        L_0x0091:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r3 = X.BEA.A0F(r0, r3)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            goto L_0x0023
        L_0x00a8:
            long r0 = r10.zzs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzha.zzr():long");
    }

    public final void zzz(int i) {
        if (this.zzj != i) {
            throw BE6.A0Y("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r6 = r6 - r1;
        r4.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List zzI(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x0004:
            if (r6 <= 0) goto L_0x002d
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = java.lang.Math.min(r6, r0)
            byte[] r3 = new byte[r0]
            r2 = 0
        L_0x000f:
            int r1 = r3.length
            if (r2 >= r1) goto L_0x0023
            java.io.InputStream r0 = r5.zze
            int r1 = r1 - r2
            int r1 = r0.read(r3, r2, r1)
            r0 = -1
            if (r1 == r0) goto L_0x0028
            int r0 = r5.zzk
            int r0 = r0 + r1
            r5.zzk = r0
            int r2 = r2 + r1
            goto L_0x000f
        L_0x0023:
            int r6 = r6 - r1
            r4.add(r3)
            goto L_0x0004
        L_0x0028:
            com.google.android.recaptcha.internal.zzje r0 = X.BE7.A0L()
            throw r0
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzha.zzI(int):java.util.List");
    }

    private final void zzK(int i) {
        if (zzL(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw BE6.A0Y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw BE7.A0L();
    }

    private final byte[] zzM(int i, boolean z) {
        byte[] zzN = zzN(i);
        if (zzN != null) {
            return zzN;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final boolean zzD() {
        return AnonymousClass000.A1O((zzr() > 0 ? 1 : (zzr() == 0 ? 0 : -1)));
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzf() {
        return zzj();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        return zzj();
    }

    public final int zzk() {
        return zzi();
    }

    public final int zzl() {
        int zzj2 = zzj();
        return (zzj2 >>> 1) ^ (-(zzj2 & 1));
    }

    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzj = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw BE6.A0Y("Protocol message contained an invalid tag (zero).");
    }

    public final int zzn() {
        return zzj();
    }

    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        return zzr();
    }

    public final long zzt() {
        return zzq();
    }

    public final long zzu() {
        return BEA.A0H(zzr());
    }

    public final long zzv() {
        return zzr();
    }

    public final zzgw zzw() {
        int zzj2 = zzj();
        int i = this.zzg;
        int i2 = this.zzi;
        if (zzj2 <= i - i2 && zzj2 > 0) {
            zzgw zzm = zzgw.zzm(this.zzf, i2, zzj2);
            this.zzi += zzj2;
            return zzm;
        } else if (zzj2 == 0) {
            return zzgw.zzb;
        } else {
            byte[] zzN = zzN(zzj2);
            if (zzN != null) {
                return zzgw.zzm(zzN, 0, zzN.length);
            }
            int i3 = this.zzi;
            int i4 = this.zzg;
            int i5 = i4 - i3;
            this.zzk += i4;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzI = zzI(zzj2 - i5);
            byte[] bArr = new byte[zzj2];
            System.arraycopy(this.zzf, i3, bArr, 0, i5);
            for (byte[] bArr2 : zzI) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return new zzgt(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzx() {
        /*
            r4 = this;
            int r3 = r4.zzj()
            if (r3 <= 0) goto L_0x001b
            int r0 = r4.zzg
            int r2 = r4.zzi
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0020
            byte[] r1 = r4.zzf
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zzb
            java.lang.String r1 = X.BE6.A0r(r0, r1, r2, r3)
        L_0x0015:
            int r0 = r4.zzi
            int r0 = r0 + r3
            r4.zzi = r0
            return r1
        L_0x001b:
            if (r3 != 0) goto L_0x0020
            java.lang.String r1 = ""
            return r1
        L_0x0020:
            int r0 = r4.zzg
            if (r3 > r0) goto L_0x0032
            r4.zzK(r3)
            byte[] r2 = r4.zzf
            int r1 = r4.zzi
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zzb
            java.lang.String r1 = X.BE6.A0r(r0, r2, r1, r3)
            goto L_0x0015
        L_0x0032:
            r0 = 0
            byte[] r1 = r4.zzM(r3, r0)
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zzb
            java.lang.String r1 = X.BE6.A0q(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzha.zzx():java.lang.String");
    }

    public final String zzy() {
        byte[] zzM;
        int zzj2 = zzj();
        int i = this.zzi;
        int i2 = this.zzg;
        if (zzj2 <= i2 - i && zzj2 > 0) {
            zzM = this.zzf;
            this.zzi = i + zzj2;
        } else if (zzj2 == 0) {
            return "";
        } else {
            i = 0;
            if (zzj2 <= i2) {
                zzK(zzj2);
                zzM = this.zzf;
                this.zzi = zzj2;
            } else {
                zzM = zzM(zzj2, false);
            }
        }
        return zzma.zzd(zzM, i, zzj2);
    }
}
