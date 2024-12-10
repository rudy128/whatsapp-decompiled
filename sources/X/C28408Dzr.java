package X;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;

/* renamed from: X.Dzr  reason: case insensitive filesystem */
public class C28408Dzr extends C27341DcD {
    public static final Class A0F = AnonymousClass1Br.A00("javax.crypto.spec.GCMParameterSpec", C28408Dzr.class);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public PBEParameterSpec A04;
    public E9Y A05;
    public DYm A06;
    public AES.ECB.AnonymousClass1 A07;
    public EAE A08;
    public boolean A09;
    public Class[] A0A;
    public int A0B;
    public int A0C;
    public DYn A0D;
    public boolean A0E;

    public C28408Dzr(E9Y e9y, int i, int i2) {
        this.A0A = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, A0F, DUB.class, IvParameterSpec.class, PBEParameterSpec.class};
        C27341DcD.A03(this);
        this.A05 = e9y;
        this.A01 = 2;
        this.A0B = i;
        this.A0C = i2;
        this.A00 = 16;
        this.A08 = new DZG(e9y);
    }

    public static boolean A06(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    public int engineGetBlockSize() {
        E9Y e9y = this.A05;
        if (e9y == null) {
            return -1;
        }
        return e9y.BNR();
    }

    public int engineGetOutputSize(int i) {
        return this.A08.BVw(i);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        EAE eae = this.A08;
        int i3 = i2;
        int Bb2 = eae.Bb2(i2);
        byte[] bArr2 = bArr;
        int i4 = i;
        if (Bb2 > 0) {
            byte[] bArr3 = new byte[Bb2];
            int CCg = eae.CCg(bArr2, i4, i3, bArr3, 0);
            if (CCg == 0) {
                return null;
            }
            if (CCg == Bb2) {
                return bArr3;
            }
            byte[] bArr4 = new byte[CCg];
            System.arraycopy(bArr3, 0, bArr4, 0, CCg);
            return bArr4;
        }
        eae.CCg(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.A08.CQP(bArr, i, i2);
    }

    public static E3O A05(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, int i, int i2, int i3, int i4) {
        E3O A022;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw BE6.A0y("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        C24485C6c A012 = C25896Co7.A01(i, i2);
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A012.A01 = bArr;
        A012.A02 = salt;
        A012.A00 = iterationCount;
        if (i4 != 0) {
            A022 = A012.A03(i3, i4);
        } else {
            A022 = A012.A02(i3);
        }
        if (str.startsWith("DES")) {
            if (A022 instanceof DYm) {
                C28403Dyn.A00(((C27190DYo) ((DYm) A022).A00).A00);
            } else {
                C28403Dyn.A00(((C27190DYo) A022).A00);
                return A022;
            }
        }
        return A022;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        int BVw = this.A08.BVw(i2);
        byte[] bArr2 = new byte[BVw];
        if (i2 != 0) {
            i3 = this.A08.CCg(bArr, i, i4, bArr2, 0);
        } else {
            i3 = 0;
        }
        try {
            int BJ4 = i3 + this.A08.BJ4(bArr2, i3);
            if (BJ4 == BVw) {
                return bArr2;
            }
            if (BJ4 <= BVw) {
                byte[] bArr3 = new byte[BJ4];
                System.arraycopy(bArr2, 0, bArr3, 0, BJ4);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (C28387DyX e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public byte[] engineGetIV() {
        DYn dYn = this.A0D;
        if (dYn != null) {
            return AnonymousClass1C2.A02(dYn.A03);
        }
        DYm dYm = this.A06;
        if (dYm != null) {
            return dYm.A01;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Dwv, java.lang.Object, X.1By] */
    public AlgorithmParameters engineGetParameters() {
        if (this.A00 == null) {
            if (this.A04 != null) {
                try {
                    C27341DcD.A00(this.A03, this).init(this.A04);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A0D != null) {
                if (this.A05 == null) {
                    try {
                        C27341DcD.A00(AnonymousClass1Bw.A0r.A01, this).init(new C28327DxZ(AnonymousClass1C2.A02(this.A0D.A03)).A0B());
                    } catch (Exception e) {
                        throw BE8.A0f(e);
                    }
                } else {
                    try {
                        AlgorithmParameters A002 = C27341DcD.A00("GCM", this);
                        byte[] A022 = AnonymousClass1C2.A02(this.A0D.A03);
                        int i = this.A0D.A00 / 8;
                        ? obj = new Object();
                        obj.A01 = AnonymousClass1C2.A02(A022);
                        obj.A00 = i;
                        A002.init(obj.A0B());
                    } catch (Exception e2) {
                        throw BE8.A0f(e2);
                    }
                }
            } else if (this.A06 != null) {
                String BMl = this.A08.Bax().BMl();
                int indexOf = BMl.indexOf(47);
                if (indexOf >= 0) {
                    BMl = AnonymousClass8BS.A0o(BMl, indexOf);
                }
                try {
                    C27341DcD.A00(BMl, this).init(new IvParameterSpec(this.A06.A01));
                } catch (Exception e3) {
                    throw BE8.A0f(e3);
                }
            }
        }
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.DYo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: X.DYo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: X.DYn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: X.DYo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: X.DYm} */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.DYi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.DYh, X.E3O, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0398 A[Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:? A[Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r18, java.security.Key r19, java.security.spec.AlgorithmParameterSpec r20, java.security.SecureRandom r21) {
        /*
            r17 = this;
            r1 = r20
            r4 = 0
            r0 = r17
            r0.A04 = r4
            r0.A03 = r4
            r0.A00 = r4
            r0.A0D = r4
            r2 = r19
            boolean r3 = r2 instanceof javax.crypto.SecretKey
            if (r3 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Key for algorithm "
            r1.append(r0)
            if (r19 == 0) goto L_0x0022
            java.lang.String r4 = r2.getAlgorithm()
        L_0x0022:
            r1.append(r4)
            java.lang.String r0 = " not suitable for symmetric enryption."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.String r4 = "RC5-64"
            if (r20 != 0) goto L_0x004a
            X.E9Y r3 = r0.A05
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.BMl()
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = "RC5 requires an RC5ParametersSpec to be passed in."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x004a:
            int r9 = r0.A01
            r5 = 4
            java.lang.String r10 = "Algorithm requires a PBE key"
            r13 = 2
            r3 = 1
            if (r9 == r13) goto L_0x0114
            boolean r6 = r2 instanceof X.DWH
            if (r6 == 0) goto L_0x00e4
            r7 = r2
            X.DWH r7 = (X.DWH) r7
            X.DWH.A00(r7)
            X.1C0 r6 = r7.oid
            if (r6 == 0) goto L_0x00df
            X.DWH.A00(r7)
            X.1C0 r6 = r7.oid
            java.lang.String r6 = r6.A01
        L_0x0068:
            r0.A03 = r6
            X.DWH.A00(r7)
            X.E3O r6 = r7.param
            if (r6 == 0) goto L_0x00c7
            X.DWH.A00(r7)
            X.E3O r8 = r7.param
            boolean r6 = r8 instanceof X.DYm
            if (r6 == 0) goto L_0x00b3
            r6 = r8
            X.DYm r6 = (X.DYm) r6
            X.E3O r7 = r6.A00
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r6 = r6.getIV()
            X.DYm r8 = new X.DYm
            r8.<init>(r7, r6)
            r0.A06 = r8
        L_0x0091:
            boolean r6 = r8 instanceof X.DYm
            if (r6 == 0) goto L_0x009a
            r6 = r8
            X.DYm r6 = (X.DYm) r6
            r0.A06 = r6
        L_0x009a:
            boolean r6 = r1 instanceof X.C27345DcH
            if (r6 == 0) goto L_0x0180
            java.lang.String r2 = r0.A02
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x0311
            X.EAE r2 = r0.A08
            boolean r2 = r2 instanceof X.DZH
            if (r2 != 0) goto L_0x0311
            java.lang.String r0 = "AEADParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x00b3:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r7 = r6.getIV()
            X.DYm r6 = new X.DYm
            r6.<init>(r8, r7)
            r0.A06 = r6
            r8 = r6
            goto L_0x0091
        L_0x00c7:
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x03e3
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
            X.EAE r6 = r0.A08
            X.E9Y r6 = r6.Bax()
            java.lang.String r6 = r6.BMl()
            X.E3O r8 = X.C25896Co7.A00(r6, r1, r7)
            goto L_0x0091
        L_0x00df:
            java.lang.String r6 = r7.getAlgorithm()
            goto L_0x0068
        L_0x00e4:
            boolean r6 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r6 == 0) goto L_0x0106
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
            byte[] r8 = r2.getEncoded()
            int r10 = r0.A0B
            int r11 = r0.A0C
            int r6 = r0.A00
            int r12 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r7 = r0.A04
            X.EAE r6 = r0.A08
            java.lang.String r6 = r6.BMl()
            X.E3O r8 = A05(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0091
        L_0x0106:
            if (r9 == 0) goto L_0x03ea
            if (r9 == r3) goto L_0x03ea
            byte[] r6 = r2.getEncoded()
            X.DYo r8 = new X.DYo
            r8.<init>(r6)
            goto L_0x009a
        L_0x0114:
            r9 = r2
            javax.crypto.SecretKey r9 = (javax.crypto.SecretKey) r9     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x0120
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A04 = r6
        L_0x0120:
            boolean r11 = r9 instanceof javax.crypto.interfaces.PBEKey
            if (r11 == 0) goto L_0x0140
            javax.crypto.spec.PBEParameterSpec r6 = r0.A04
            if (r6 != 0) goto L_0x0140
            r7 = r9
            javax.crypto.interfaces.PBEKey r7 = (javax.crypto.interfaces.PBEKey) r7
            byte[] r6 = r7.getSalt()
            if (r6 == 0) goto L_0x03f0
            byte[] r8 = r7.getSalt()
            int r7 = r7.getIterationCount()
            javax.crypto.spec.PBEParameterSpec r6 = new javax.crypto.spec.PBEParameterSpec
            r6.<init>(r8, r7)
            r0.A04 = r6
        L_0x0140:
            javax.crypto.spec.PBEParameterSpec r6 = r0.A04
            if (r6 != 0) goto L_0x014c
            if (r11 != 0) goto L_0x014c
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x014c:
            boolean r6 = r2 instanceof X.DWH
            if (r6 == 0) goto L_0x0166
            r6 = r2
            X.DWH r6 = (X.DWH) r6
            X.DWH.A00(r6)
            X.E3O r8 = r6.param
            boolean r6 = r8 instanceof X.DYm
            if (r6 != 0) goto L_0x0091
            if (r8 == 0) goto L_0x0166
            java.lang.String r1 = "Algorithm requires a PBE key suitable for PKCS12"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0166:
            byte[] r12 = r9.getEncoded()
            int r14 = r0.A0B
            int r15 = r0.A0C
            int r6 = r0.A00
            int r16 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r11 = r0.A04
            X.EAE r6 = r0.A08
            java.lang.String r10 = r6.BMl()
            X.E3O r8 = A05(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0091
        L_0x0180:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x01dc
            int r2 = r0.A00
            if (r2 == 0) goto L_0x01c9
            javax.crypto.spec.IvParameterSpec r1 = (javax.crypto.spec.IvParameterSpec) r1
            byte[] r2 = r1.getIV()
            int r2 = r2.length
            int r4 = r0.A00
            if (r2 == r4) goto L_0x01b4
            X.EAE r2 = r0.A08
            boolean r2 = r2 instanceof X.DZH
            if (r2 != 0) goto L_0x01b4
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x01b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "IV must be "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " bytes long."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x01b4:
            boolean r2 = r8 instanceof X.DYm
            if (r2 == 0) goto L_0x01bc
            X.DYm r8 = (X.DYm) r8
            X.E3O r8 = r8.A00
        L_0x01bc:
            byte[] r2 = r1.getIV()
            X.DYm r1 = new X.DYm
            r1.<init>(r8, r2)
            r8 = r1
            r0.A06 = r1
            goto L_0x0203
        L_0x01c9:
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0203
            java.lang.String r1 = "ECB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0203
            java.lang.String r0 = "ECB mode does not use an IV"
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x01dc:
            boolean r6 = r1 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r6 == 0) goto L_0x023b
            javax.crypto.spec.RC2ParameterSpec r1 = (javax.crypto.spec.RC2ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getEffectiveKeyBits()
            X.Dym r4 = new X.Dym
            r4.<init>(r2)
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x0239
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0239
            byte[] r1 = r1.getIV()
            X.DYm r8 = new X.DYm
            r8.<init>(r4, r1)
        L_0x0201:
            r0.A06 = r8
        L_0x0203:
            int r1 = r0.A00
            r6 = 3
            r4 = r18
            r7 = r21
            if (r1 == 0) goto L_0x0350
            boolean r1 = r8 instanceof X.DYm
            if (r1 != 0) goto L_0x0350
            boolean r1 = r8 instanceof X.DYn
            if (r1 != 0) goto L_0x0350
            if (r21 != 0) goto L_0x0237
            java.security.SecureRandom r9 = X.C26181Cu4.A00()
        L_0x021a:
            if (r4 == r3) goto L_0x0341
            if (r4 == r6) goto L_0x0341
            X.EAE r1 = r0.A08
            X.E9Y r1 = r1.Bax()
            java.lang.String r2 = r1.BMl()
            java.lang.String r1 = "PGPCFB"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x0350
            java.lang.String r0 = "no IV set when one expected"
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x0237:
            r9 = r7
            goto L_0x021a
        L_0x0239:
            r8 = r4
            goto L_0x0203
        L_0x023b:
            boolean r6 = r1 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r6 == 0) goto L_0x02da
            javax.crypto.spec.RC5ParameterSpec r1 = (javax.crypto.spec.RC5ParameterSpec) r1
            byte[] r9 = r2.getEncoded()
            r1.getRounds()
            X.DYh r7 = new X.DYh
            r7.<init>()
            int r8 = r9.length
            r2 = 255(0xff, float:3.57E-43)
            if (r8 > r2) goto L_0x03d5
            byte[] r6 = new byte[r8]
            r7.A00 = r6
            r2 = 0
            java.lang.System.arraycopy(r9, r2, r6, r2, r8)
            X.E9Y r8 = r0.A05
            java.lang.String r6 = r8.BMl()
            java.lang.String r2 = "RC5"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x03ce
            java.lang.String r6 = r8.BMl()
            java.lang.String r2 = "RC5-32"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "."
            if (r2 == 0) goto L_0x0297
            int r4 = r1.getWordSize()
            r2 = 32
            if (r4 == r2) goto L_0x02c2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RC5 already set up for a word size of 32 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x0297:
            java.lang.String r2 = r8.BMl()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02c2
            int r4 = r1.getWordSize()
            r2 = 64
            if (r4 == r2) goto L_0x02c2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RC5 already set up for a word size of 64 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x02c2:
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x02d7
            int r2 = r0.A00
            if (r2 == 0) goto L_0x02d7
            byte[] r1 = r1.getIV()
            X.DYm r8 = new X.DYm
            r8.<init>(r7, r1)
            goto L_0x0201
        L_0x02d7:
            r8 = r7
            goto L_0x0203
        L_0x02da:
            java.lang.Class r2 = A0F
            if (r2 == 0) goto L_0x0334
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x0334
            java.lang.String r2 = r0.A02
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x02f9
            X.EAE r2 = r0.A08
            boolean r2 = r2 instanceof X.DZH
            if (r2 != 0) goto L_0x02f9
            java.lang.String r0 = "GCMParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x02f9:
            boolean r2 = r8 instanceof X.DYm
            if (r2 == 0) goto L_0x0301
            X.DYm r8 = (X.DYm) r8
            X.E3O r8 = r8.A00
        L_0x0301:
            X.DYo r8 = (X.C27190DYo) r8
            java.lang.Class r2 = X.C25455Cg7.A00
            X.DU7 r2 = new X.DU7     // Catch:{ Exception -> 0x03dc }
            r2.<init>(r1, r8)     // Catch:{ Exception -> 0x03dc }
            java.lang.Object r8 = java.security.AccessController.doPrivileged(r2)     // Catch:{ Exception -> 0x03dc }
            X.DYn r8 = (X.DYn) r8     // Catch:{ Exception -> 0x03dc }
            goto L_0x032e
        L_0x0311:
            X.DcH r1 = (X.C27345DcH) r1
            boolean r2 = r8 instanceof X.DYm
            if (r2 == 0) goto L_0x0332
            X.DYm r8 = (X.DYm) r8
            X.E3O r6 = r8.A00
        L_0x031b:
            X.DYo r6 = (X.C27190DYo) r6
            int r4 = r1.A00
            byte[] r2 = r1.getIV()
            byte[] r1 = r1.A01
            byte[] r1 = X.AnonymousClass1C2.A02(r1)
            X.DYn r8 = new X.DYn
            r8.<init>(r6, r2, r1, r4)
        L_0x032e:
            r0.A0D = r8
            goto L_0x0203
        L_0x0332:
            r6 = r8
            goto L_0x031b
        L_0x0334:
            if (r20 == 0) goto L_0x0203
            boolean r1 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r1 != 0) goto L_0x0203
            java.lang.String r0 = "unknown parameter type."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x0341:
            int r1 = r0.A00
            byte[] r2 = new byte[r1]
            r9.nextBytes(r2)
            X.DYm r1 = new X.DYm
            r1.<init>(r8, r2)
            r0.A06 = r1
            r8 = r1
        L_0x0350:
            if (r21 == 0) goto L_0x0362
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0362
            X.DYi r2 = new X.DYi
            r2.<init>()
            java.security.Permission r1 = X.C26181Cu4.A03
            r2.A00 = r7
            r2.A01 = r8
            r8 = r2
        L_0x0362:
            if (r4 == r3) goto L_0x0382
            if (r4 == r13) goto L_0x0388
            if (r4 == r6) goto L_0x0382
            if (r4 == r5) goto L_0x0388
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            java.lang.String r0 = "unknown opmode "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            java.lang.String r0 = " passed"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
        L_0x0382:
            X.EAE r1 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r1.BdC(r8, r3)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            goto L_0x038e
        L_0x0388:
            X.EAE r2 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r1 = 0
            r2.BdC(r8, r1)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
        L_0x038e:
            X.EAE r2 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            boolean r1 = r2 instanceof X.DZH     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            if (r1 == 0) goto L_0x03b7
            X.DYn r1 = r0.A0D     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            if (r1 != 0) goto L_0x03b7
            X.DZH r2 = (X.DZH) r2     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            java.lang.reflect.Constructor r1 = X.DZH.A01     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            X.EA8 r2 = r2.A00     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            X.DYm r1 = r0.A06     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            X.E3O r5 = r1.A00     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            X.DYo r5 = (X.C27190DYo) r5     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            byte[] r1 = r2.BUI()     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            int r1 = r1.length     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            int r4 = r1 * 8
            X.DYm r1 = r0.A06     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            byte[] r3 = r1.A01     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r2 = 0
            X.DYn r1 = new X.DYn     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r1.<init>(r5, r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
            r0.A0D = r1     // Catch:{ IllegalArgumentException -> 0x03c3, Exception -> 0x03b8 }
        L_0x03b7:
            return
        L_0x03b8:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.Das r2 = new X.Das
            r2.<init>(r0, r1)
            throw r2
        L_0x03c3:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            r2.<init>(r0, r1)
            throw r2
        L_0x03ce:
            java.lang.String r0 = "RC5 parameters passed to a cipher that is not RC5."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x03d5:
            java.lang.String r0 = "RC5 key length can be no greater than 255"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x03dc:
            java.lang.String r0 = "Cannot process GCMParameterSpec."
            java.security.InvalidAlgorithmParameterException r1 = X.BE6.A0y(r0)
            throw r1
        L_0x03e3:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x03ea:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x03f0:
            java.lang.String r0 = "PBEKey requires parameters to specify salt"
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x03f7:
            java.lang.String r0 = "PKCS12 requires a SecretKey/PBEKey"
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28408Dzr.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.DyZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: X.DyY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.DYb} */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.DZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, X.DZ1] */
    /* JADX WARNING: type inference failed for: r0v55, types: [X.DZH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Cl5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.DZG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v70, types: [X.DZG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.DYZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.DYa, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineSetMode(java.lang.String r6) {
        /*
            r5 = this;
            X.E9Y r3 = r5.A05
            if (r3 == 0) goto L_0x0276
            java.lang.String r2 = X.AnonymousClass1Bo.A01(r6)
            r5.A02 = r2
            java.lang.String r0 = "ECB"
            boolean r0 = r2.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r5.A00 = r1
            r2 = r3
        L_0x0016:
            X.DZG r0 = new X.DZG
            r0.<init>(r2)
        L_0x001b:
            r5.A08 = r0
            return
        L_0x001e:
            java.lang.String r0 = "CBC"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0032
            int r0 = r3.BNR()
            r5.A00 = r0
            X.DYb r2 = new X.DYb
            r2.<init>(r3)
            goto L_0x0016
        L_0x0032:
            java.lang.String r0 = "OFB"
            boolean r0 = r2.startsWith(r0)
            r4 = 3
            if (r0 == 0) goto L_0x005c
            int r1 = r3.BNR()
            r5.A00 = r1
            int r0 = r2.length()
            if (r0 == r4) goto L_0x018b
            java.lang.String r0 = r2.substring(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            X.DyY r2 = new X.DyY
            r2.<init>(r3, r0)
        L_0x0054:
            X.DZG r1 = new X.DZG
            r1.<init>(r2)
        L_0x0059:
            r5.A08 = r1
            return
        L_0x005c:
            java.lang.String r0 = "CFB"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x007e
            int r1 = r3.BNR()
            r5.A00 = r1
            int r0 = r2.length()
            if (r0 == r4) goto L_0x0194
            java.lang.String r0 = r2.substring(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            X.DyZ r2 = new X.DyZ
            r2.<init>(r3, r0)
            goto L_0x0054
        L_0x007e:
            java.lang.String r0 = "PGPCFB"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "PGPCFBWITHIV"
            boolean r4 = r2.equals(r0)
            if (r4 != 0) goto L_0x00a5
            int r1 = r2.length()
            r0 = 6
            if (r1 == r0) goto L_0x00a5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "no mode support for "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            int r0 = r3.BNR()
            r5.A00 = r0
            X.DYa r2 = new X.DYa
            r2.<init>()
            r2.A02 = r3
            r2.A03 = r4
            int r1 = r3.BNR()
            r2.A00 = r1
            byte[] r0 = new byte[r1]
            r2.A06 = r0
            byte[] r0 = new byte[r1]
            r2.A04 = r0
            byte[] r0 = new byte[r1]
            r2.A05 = r0
            byte[] r0 = new byte[r1]
            r2.A07 = r0
            goto L_0x0054
        L_0x00cb:
            java.lang.String r0 = "OPENPGPCFB"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f0
            r5.A00 = r1
            X.DYZ r2 = new X.DYZ
            r2.<init>()
            r2.A02 = r3
            int r1 = r3.BNR()
            r2.A00 = r1
            byte[] r0 = new byte[r1]
            r2.A05 = r0
            byte[] r0 = new byte[r1]
            r2.A03 = r0
            byte[] r0 = new byte[r1]
            r2.A04 = r0
            goto L_0x0016
        L_0x00f0:
            java.lang.String r0 = "SIC"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            int r2 = r3.BNR()
            r5.A00 = r2
            r0 = 16
            if (r2 < r0) goto L_0x024d
            r5.A09 = r1
            X.Dyc r0 = new X.Dyc
            r0.<init>(r3)
        L_0x0109:
            X.Cl5 r2 = new X.Cl5
            r2.<init>(r0)
        L_0x010e:
            X.DZG r0 = new X.DZG
            r0.<init>()
            r0.A00 = r2
            goto L_0x001b
        L_0x0117:
            java.lang.String r0 = "CTR"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013a
            int r0 = r3.BNR()
            r5.A00 = r0
            r5.A09 = r1
            X.Dyc r1 = new X.Dyc
            r1.<init>(r3)
            X.Cl5 r0 = new X.Cl5
            r0.<init>(r1)
            X.DZG r1 = new X.DZG
            r1.<init>()
            r1.A00 = r0
            goto L_0x0059
        L_0x013a:
            java.lang.String r0 = "GOFB"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014e
            int r0 = r3.BNR()
            r5.A00 = r0
            X.Dya r0 = new X.Dya
            r0.<init>(r3)
            goto L_0x0109
        L_0x014e:
            java.lang.String r0 = "GCFB"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0162
            int r0 = r3.BNR()
            r5.A00 = r0
            X.Dyb r0 = new X.Dyb
            r0.<init>(r3)
            goto L_0x0109
        L_0x0162:
            java.lang.String r0 = "CTS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x019d
            int r0 = r3.BNR()
            r5.A00 = r0
            X.DYb r0 = new X.DYb
            r0.<init>(r3)
            X.DyM r2 = new X.DyM
            r2.<init>()
            r2.A01 = r0
            X.E9Y r0 = r0.A01
            int r0 = r0.BNR()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
            r2.A04 = r0
            r2.A00 = r1
            goto L_0x010e
        L_0x018b:
            int r0 = r1 * 8
            X.DyY r2 = new X.DyY
            r2.<init>(r3, r0)
            goto L_0x0016
        L_0x0194:
            int r0 = r1 * 8
            X.DyZ r2 = new X.DyZ
            r2.<init>(r3, r0)
            goto L_0x0016
        L_0x019d:
            java.lang.String r0 = "CCM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01b9
            r0 = 12
            r5.A00 = r0
            java.lang.reflect.Constructor r0 = X.DZH.A01
            X.DZ0 r4 = new X.DZ0
            r4.<init>(r3)
        L_0x01b0:
            X.DZH r0 = new X.DZH
            r0.<init>()
            r0.A00 = r4
            goto L_0x001b
        L_0x01b9:
            java.lang.String r0 = "OCB"
            boolean r0 = r2.equals(r0)
            java.lang.String r1 = "can't support mode "
            if (r0 == 0) goto L_0x0201
            org.spongycastle.jcajce.provider.symmetric.AES$ECB$1 r0 = r5.A07
            if (r0 == 0) goto L_0x0262
            r0 = 15
            r5.A00 = r0
            java.lang.reflect.Constructor r0 = X.DZH.A01
            X.DYe r2 = new X.DYe
            r2.<init>()
            X.DZ1 r4 = new X.DZ1
            r4.<init>()
            r0 = 0
            r4.A0A = r0
            r0 = 24
            byte[] r0 = new byte[r0]
            r4.A0E = r0
            r1 = 16
            byte[] r0 = new byte[r1]
            r4.A0D = r0
            byte[] r0 = new byte[r1]
            r4.A0C = r0
            int r0 = r3.BNR()
            if (r0 != r1) goto L_0x025b
            java.lang.String r1 = r3.BMl()
            java.lang.String r0 = "AES"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0254
            r4.A06 = r3
            r4.A07 = r2
            goto L_0x01b0
        L_0x0201:
            java.lang.String r0 = "EAX"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0236
            int r2 = r3.BNR()
            r5.A00 = r2
            java.lang.reflect.Constructor r0 = X.DZH.A01
            X.DZ2 r4 = new X.DZ2
            r4.<init>()
            r4.A00 = r2
            X.DYu r1 = new X.DYu
            r1.<init>(r3)
            r4.A03 = r1
            byte[] r0 = new byte[r2]
            r4.A08 = r0
            int r1 = r1.A01
            byte[] r0 = new byte[r1]
            r4.A06 = r0
            byte[] r0 = new byte[r1]
            r4.A09 = r0
            X.Dyc r0 = new X.Dyc
            r0.<init>(r3)
            r4.A04 = r0
            goto L_0x01b0
        L_0x0236:
            java.lang.String r0 = "GCM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x026c
            int r0 = r3.BNR()
            r5.A00 = r0
            java.lang.reflect.Constructor r0 = X.DZH.A01
            X.DZ3 r4 = new X.DZ3
            r4.<init>(r3)
            goto L_0x01b0
        L_0x024d:
            java.lang.String r0 = "Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0254:
            java.lang.String r0 = "'hashCipher' and 'mainCipher' must be the same algorithm"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x025b:
            java.lang.String r0 = "'hashCipher' must have a block size of 16"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0262:
            java.lang.String r1 = X.C17900vP.A0A(r1, r6)
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            r0.<init>(r1)
            throw r0
        L_0x026c:
            java.lang.String r1 = X.C17900vP.A0A(r1, r6)
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            r0.<init>(r1)
            throw r0
        L_0x0276:
            java.lang.String r1 = "no mode supported for this algorithm"
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28408Dzr.engineSetMode(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: X.DZ9} */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cl5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v55, types: [X.E8w] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.DZG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.Cl5, java.lang.Object, X.DyN] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.DZG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v63 */
    /* JADX WARNING: type inference failed for: r0v65 */
    /* JADX WARNING: type inference failed for: r0v66 */
    /* JADX WARNING: type inference failed for: r0v67 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineSetPadding(java.lang.String r5) {
        /*
            r4 = this;
            X.E9Y r0 = r4.A05
            if (r0 == 0) goto L_0x014a
            java.lang.String r1 = X.AnonymousClass1Bo.A01(r5)
            java.lang.String r0 = "NOPADDING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            X.EAE r1 = r4.A08
            boolean r0 = r1.CSJ()
            if (r0 == 0) goto L_0x002a
            X.E9Y r0 = r1.Bax()
            X.Cl5 r2 = new X.Cl5
            r2.<init>(r0)
        L_0x0021:
            X.DZG r3 = new X.DZG
            r3.<init>()
            r3.A00 = r2
        L_0x0028:
            r4.A08 = r3
        L_0x002a:
            return
        L_0x002b:
            java.lang.String r0 = "WITHCTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "CTSPADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "CS3PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0103
            r0 = 1
            r4.A0E = r0
            java.lang.String r0 = r4.A02
            boolean r0 = A06(r0)
            if (r0 != 0) goto L_0x013b
            java.lang.String r0 = "PKCS5PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "PKCS7PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "ZEROBYTEPADDING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
            X.EAE r0 = r4.A08
            X.E9Y r2 = r0.Bax()
            X.DZ7 r0 = new X.DZ7
            r0.<init>()
        L_0x0071:
            X.DZG r3 = new X.DZG
            r3.<init>()
            X.DyN r1 = new X.DyN
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            int r0 = r2.BNR()
            byte[] r0 = new byte[r0]
            r1.A04 = r0
            r0 = 0
            r1.A00 = r0
            r3.A00 = r1
            goto L_0x0028
        L_0x008d:
            java.lang.String r0 = "ISO10126PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "ISO10126-2PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "X9.23PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "X923PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "ISO7816-4PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "ISO9797-1PADDING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "TBCPADDING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0123
            X.EAE r0 = r4.A08
            X.E9Y r2 = r0.Bax()
            X.DZ6 r0 = new X.DZ6
            r0.<init>()
            goto L_0x0071
        L_0x00d1:
            X.EAE r0 = r4.A08
            X.E9Y r2 = r0.Bax()
            X.DZ4 r0 = new X.DZ4
            r0.<init>()
            goto L_0x0071
        L_0x00dd:
            X.EAE r0 = r4.A08
            X.E9Y r2 = r0.Bax()
            X.DZ9 r0 = new X.DZ9
            r0.<init>()
            goto L_0x0071
        L_0x00e9:
            X.EAE r0 = r4.A08
            X.E9Y r2 = r0.Bax()
            X.DZ8 r0 = new X.DZ8
            r0.<init>()
            goto L_0x0071
        L_0x00f6:
            X.EAE r0 = r4.A08
            X.E9Y r0 = r0.Bax()
            X.DZG r3 = new X.DZG
            r3.<init>(r0)
            goto L_0x0028
        L_0x0103:
            X.EAE r0 = r4.A08
            X.E9Y r1 = r0.Bax()
            X.DyM r2 = new X.DyM
            r2.<init>()
            boolean r0 = r1 instanceof X.DYf
            if (r0 != 0) goto L_0x0143
            r2.A01 = r1
            int r0 = r1.BNR()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
            r2.A04 = r0
            r0 = 0
            r2.A00 = r0
            goto L_0x0021
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Padding "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " unknown."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            javax.crypto.NoSuchPaddingException r0 = new javax.crypto.NoSuchPaddingException
            r0.<init>(r1)
            throw r0
        L_0x013b:
            java.lang.String r1 = "Only NoPadding can be used with AEAD modes."
            javax.crypto.NoSuchPaddingException r0 = new javax.crypto.NoSuchPaddingException
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.lang.String r0 = "CTSBlockCipher can only accept ECB, or CBC ciphers"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x014a:
            java.lang.String r1 = "no padding supported for this algorithm"
            javax.crypto.NoSuchPaddingException r0 = new javax.crypto.NoSuchPaddingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28408Dzr.engineSetPadding(java.lang.String):void");
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        EAE eae = this.A08;
        int i4 = i2;
        int i5 = i3;
        byte[] bArr3 = bArr2;
        if (eae.Bb2(i2) + i3 <= bArr2.length) {
            try {
                return eae.CCg(bArr, i, i4, bArr3, i5);
            } catch (C28387DyX e) {
                throw AnonymousClass000.A0m(e);
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            BE7.A1P(byteBuffer);
        } else if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[512];
            do {
                int min = Math.min(512, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DZG, java.lang.Object, X.EAE] */
    public C28408Dzr(C25735Cl5 cl5) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        C27341DcD.A04(this, clsArr);
        C27341DcD.A03(this);
        this.A05 = cl5.A01;
        ? obj = new Object();
        obj.A00 = cl5;
        this.A08 = obj;
        this.A09 = true;
        this.A00 = 16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x002d
            java.lang.Class[] r2 = r3.A0A
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x001b
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r0 = r2.length
            if (r1 == r0) goto L_0x001e
            r0 = r2[r1]
            if (r0 == 0) goto L_0x0018
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "can't handle parameter "
            java.lang.String r0 = X.BEA.A0j(r6, r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        L_0x002d:
            r0 = 0
        L_0x002e:
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            r3.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28408Dzr.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = i2;
        byte[] bArr3 = bArr2;
        if (this.A08.BVw(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.A08.CCg(bArr, i, i6, bArr3, i5);
                } catch (C28380DyQ e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (C28387DyX e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.A08.BJ4(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }
}
