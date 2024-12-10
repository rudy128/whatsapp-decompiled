package X;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

/* renamed from: X.DcD  reason: case insensitive filesystem */
public abstract class C27341DcD extends CipherSpi {
    public AlgorithmParameters A00;
    public E9M A01;
    public C24173Bwh A02;
    public Class[] A03;
    public int A04;
    public boolean A05;
    public byte[] A06;
    public final E3R A07 = A02(this);

    public static DZI A02(C27341DcD dcD) {
        dcD.A03 = new Class[]{DUC.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        dcD.A00 = null;
        dcD.A01 = null;
        dcD.A02 = null;
        return new DZI();
    }

    public static void A03(C28408Dzr dzr) {
        dzr.A09 = true;
        dzr.A04 = null;
        dzr.A03 = null;
        dzr.A02 = null;
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return AnonymousClass1C2.A02(this.A06);
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new C27266Das(e.getMessage(), e);
        }
    }

    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                E9M e9m = this.A01;
                return e9m == null ? engineDoFinal(encoded, 0, encoded.length) : e9m.CSI(encoded, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }

    public static AlgorithmParameters A00(String str, C27341DcD dcD) {
        AlgorithmParameters instance = AlgorithmParameters.getInstance(str, ((DZI) dcD.A07).A00);
        dcD.A00 = instance;
        return instance;
    }

    public static DYb A01() {
        return new DYb(new DYe());
    }

    public static void A04(C28408Dzr dzr, Class[] clsArr) {
        clsArr[1] = RC5ParameterSpec.class;
        clsArr[2] = C28408Dzr.A0F;
        clsArr[3] = DUB.class;
        clsArr[4] = IvParameterSpec.class;
        clsArr[5] = PBEParameterSpec.class;
        dzr.A0A = clsArr;
        dzr.A01 = -1;
        dzr.A00 = 0;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        Throwable th;
        byte[] bArr2;
        C24173Bwh bwh = this.A02;
        if (bwh != null) {
            if (bArr != null) {
                bwh.write(bArr, i, i2);
            }
            try {
                if (this.A05) {
                    E9M e9m = this.A01;
                    C24173Bwh bwh2 = this.A02;
                    bArr2 = e9m.CSI(bwh2.A01(), bwh2.size());
                } else {
                    try {
                        E9M e9m2 = this.A01;
                        C24173Bwh bwh3 = this.A02;
                        bArr2 = e9m2.CQG(bwh3.A01(), bwh3.size());
                    } catch (C28379DyP e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                this.A02.A00();
                return bArr2;
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A02.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass000.A0n("not supported in a wrapping mode");
        }
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A00 == null && this.A06 != null) {
            String BMl = this.A01.BMl();
            int indexOf = BMl.indexOf(47);
            if (indexOf >= 0) {
                BMl = AnonymousClass8BS.A0o(BMl, indexOf);
            }
            try {
                A00(BMl, this).init(new IvParameterSpec(this.A06));
            } catch (Exception e) {
                throw BE8.A0f(e);
            }
        }
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.DYm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.DYm} */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.Bwh, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.Bwh, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.DYi, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r10 != null) goto L_0x0043;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r7, java.security.Key r8, java.security.spec.AlgorithmParameterSpec r9, java.security.SecureRandom r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.DWH
            if (r0 == 0) goto L_0x006c
            X.DWH r8 = (X.DWH) r8
            boolean r0 = r9 instanceof javax.crypto.spec.PBEParameterSpec
            if (r0 == 0) goto L_0x005f
            X.E9M r0 = r6.A01
            java.lang.String r0 = r0.BMl()
            X.E3O r3 = X.C25896Co7.A00(r0, r9, r8)
        L_0x0014:
            boolean r0 = r9 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0026
            javax.crypto.spec.IvParameterSpec r9 = (javax.crypto.spec.IvParameterSpec) r9
            byte[] r1 = r9.getIV()
            r6.A06 = r1
            X.DYm r0 = new X.DYm
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0026:
            boolean r0 = r3 instanceof X.C27190DYo
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x005c
            int r0 = r6.A04
            if (r0 == 0) goto L_0x005c
            if (r7 == r5) goto L_0x0034
            if (r7 != r4) goto L_0x005c
        L_0x0034:
            byte[] r0 = new byte[r0]
            r6.A06 = r0
            r10.nextBytes(r0)
            byte[] r1 = r6.A06
            X.DYm r0 = new X.DYm
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0043:
            X.DYi r1 = new X.DYi
            r1.<init>()
            java.security.Permission r0 = X.C26181Cu4.A03
            r1.A00 = r10
            r1.A01 = r3
            r3 = r1
        L_0x004f:
            if (r7 == r4) goto L_0x0095
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x007e
            r1 = 0
            if (r7 == r5) goto L_0x00a2
            r0 = 4
            if (r7 != r0) goto L_0x0076
            goto L_0x008b
        L_0x005c:
            if (r10 == 0) goto L_0x004f
            goto L_0x0043
        L_0x005f:
            X.DWH.A00(r8)
            X.E3O r0 = r8.param
            if (r0 == 0) goto L_0x00b7
            X.DWH.A00(r8)
            X.E3O r3 = r8.param
            goto L_0x0014
        L_0x006c:
            byte[] r0 = r8.getEncoded()
            X.DYo r3 = new X.DYo
            r3.<init>(r0)
            goto L_0x0014
        L_0x0076:
            java.lang.String r1 = "Unknown mode parameter passed to init."
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00ac }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ac }
            throw r0     // Catch:{ Exception -> 0x00ac }
        L_0x007e:
            X.E9M r0 = r6.A01     // Catch:{ Exception -> 0x00ac }
            r0.BdC(r3, r2)     // Catch:{ Exception -> 0x00ac }
            X.Bwh r0 = new X.Bwh     // Catch:{ Exception -> 0x00ac }
            r0.<init>()     // Catch:{ Exception -> 0x00ac }
            r6.A02 = r0     // Catch:{ Exception -> 0x00ac }
            goto L_0x0092
        L_0x008b:
            X.E9M r0 = r6.A01     // Catch:{ Exception -> 0x00ac }
            r0.BdC(r3, r2)     // Catch:{ Exception -> 0x00ac }
            r6.A02 = r1     // Catch:{ Exception -> 0x00ac }
        L_0x0092:
            r6.A05 = r2     // Catch:{ Exception -> 0x00ac }
            return
        L_0x0095:
            X.E9M r0 = r6.A01     // Catch:{ Exception -> 0x00ac }
            r0.BdC(r3, r4)     // Catch:{ Exception -> 0x00ac }
            X.Bwh r0 = new X.Bwh     // Catch:{ Exception -> 0x00ac }
            r0.<init>()     // Catch:{ Exception -> 0x00ac }
            r6.A02 = r0     // Catch:{ Exception -> 0x00ac }
            goto L_0x00a9
        L_0x00a2:
            X.E9M r0 = r6.A01     // Catch:{ Exception -> 0x00ac }
            r0.BdC(r3, r4)     // Catch:{ Exception -> 0x00ac }
            r6.A02 = r1     // Catch:{ Exception -> 0x00ac }
        L_0x00a9:
            r6.A05 = r4     // Catch:{ Exception -> 0x00ac }
            return
        L_0x00ac:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.Das r0 = new X.Das
            r0.<init>(r1, r2)
            throw r0
        L_0x00b7:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.BE6.A0y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27341DcD.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.Dwn] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = X.AnonymousClass000.A0k("'publicKey' requires version v2(1) or later");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.Key engineUnwrap(byte[] r8, java.lang.String r9, int r10) {
        /*
            r7 = this;
            java.lang.String r2 = "Unknown key type "
            X.E9M r3 = r7.A01     // Catch:{ DyP -> 0x013d, BadPaddingException -> 0x0132, IllegalBlockSizeException -> 0x0127 }
            r1 = 0
            if (r3 != 0) goto L_0x000d
            int r0 = r8.length     // Catch:{ DyP -> 0x013d, BadPaddingException -> 0x0132, IllegalBlockSizeException -> 0x0127 }
            byte[] r3 = r7.engineDoFinal(r8, r1, r0)     // Catch:{ DyP -> 0x013d, BadPaddingException -> 0x0132, IllegalBlockSizeException -> 0x0127 }
            goto L_0x0012
        L_0x000d:
            int r0 = r8.length     // Catch:{ DyP -> 0x013d, BadPaddingException -> 0x0132, IllegalBlockSizeException -> 0x0127 }
            byte[] r3 = r3.CQG(r8, r0)     // Catch:{ DyP -> 0x013d, BadPaddingException -> 0x0132, IllegalBlockSizeException -> 0x0127 }
        L_0x0012:
            r0 = 3
            if (r10 != r0) goto L_0x001b
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            r0.<init>(r3, r9)
            return r0
        L_0x001b:
            java.lang.String r0 = ""
            boolean r0 = r9.equals(r0)
            r4 = 2
            if (r0 == 0) goto L_0x00d8
            if (r10 != r4) goto L_0x00d8
            boolean r0 = r3 instanceof X.C28279Dwn     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x0036
            X.Dwn r3 = (X.C28279Dwn) r3     // Catch:{ Exception -> 0x00d0 }
        L_0x002c:
            java.util.Map r0 = X.AnonymousClass1Bl.A00     // Catch:{ Exception -> 0x00d0 }
            X.Dx0 r0 = r3.A04     // Catch:{ Exception -> 0x00d0 }
            X.1C0 r0 = r0.A01     // Catch:{ Exception -> 0x00d0 }
            java.util.Map r1 = X.AnonymousClass1Bl.A00     // Catch:{ Exception -> 0x00d0 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x0090
        L_0x0036:
            X.Dxl r0 = X.C28339Dxl.A05(r3)     // Catch:{ Exception -> 0x00d0 }
            X.Dwn r3 = new X.Dwn     // Catch:{ Exception -> 0x00d0 }
            r3.<init>()     // Catch:{ Exception -> 0x00d0 }
            java.util.Enumeration r6 = r0.A0L()     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x00d0 }
            X.Dxj r0 = X.C28337Dxj.A02(r0)     // Catch:{ Exception -> 0x00d0 }
            r3.A01 = r0     // Catch:{ Exception -> 0x00d0 }
            int r5 = r0.A0K()     // Catch:{ Exception -> 0x00d0 }
            if (r5 < 0) goto L_0x00ad
            r4 = 1
            if (r5 > r4) goto L_0x00ad
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x00d0 }
            X.Dx0 r0 = X.C28292Dx0.A01(r0)     // Catch:{ Exception -> 0x00d0 }
            r3.A04 = r0     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x00d0 }
            X.Dxo r0 = X.C28342Dxo.A03(r0)     // Catch:{ Exception -> 0x00d0 }
            r3.A02 = r0     // Catch:{ Exception -> 0x00d0 }
            r2 = -1
        L_0x006b:
            boolean r0 = r6.hasMoreElements()     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x00d0 }
            X.Dxn r0 = (X.C28341Dxn) r0     // Catch:{ Exception -> 0x00d0 }
            int r1 = r0.A00     // Catch:{ Exception -> 0x00d0 }
            if (r1 <= r2) goto L_0x00a6
            if (r1 == 0) goto L_0x0088
            if (r1 != r4) goto L_0x009f
            if (r5 < r4) goto L_0x0098
            X.Dwd r0 = X.C28269Dwd.A03(r0)     // Catch:{ Exception -> 0x00d0 }
            r3.A00 = r0     // Catch:{ Exception -> 0x00d0 }
            goto L_0x008e
        L_0x0088:
            X.Dxm r0 = X.C28340Dxm.A03(r0)     // Catch:{ Exception -> 0x00d0 }
            r3.A03 = r0     // Catch:{ Exception -> 0x00d0 }
        L_0x008e:
            r2 = r1
            goto L_0x006b
        L_0x0090:
            r1.get(r0)     // Catch:{ all -> 0x0095 }
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x00b4
        L_0x0095:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x00cf
        L_0x0098:
            java.lang.String r0 = "'publicKey' requires version v2(1) or later"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00cf
        L_0x009f:
            java.lang.String r0 = "unknown optional field in private key info"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00cf
        L_0x00a6:
            java.lang.String r0 = "invalid optional field in private key info"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00cf
        L_0x00ad:
            java.lang.String r0 = "invalid version for private key info"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00cf
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = "algorithm "
            r1.append(r0)     // Catch:{ Exception -> 0x00d0 }
            X.Dx0 r0 = r3.A04     // Catch:{ Exception -> 0x00d0 }
            X.1C0 r0 = r0.A01     // Catch:{ Exception -> 0x00d0 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = " not supported"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x00d0 }
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException     // Catch:{ Exception -> 0x00d0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d0 }
        L_0x00cf:
            throw r0     // Catch:{ Exception -> 0x00d0 }
        L_0x00d0:
            java.lang.String r1 = "Invalid key encoding."
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            X.E3R r0 = r7.A07     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            X.DZI r0 = (X.DZI) r0     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            java.security.Provider r0 = r0.A00     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r9, r0)     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            r0 = 1
            if (r10 != r0) goto L_0x00ef
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            r0.<init>(r3)     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            java.security.PublicKey r0 = r1.generatePublic(r0)     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            return r0
        L_0x00ef:
            if (r10 != r4) goto L_0x00fb
            java.security.spec.PKCS8EncodedKeySpec r0 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            r0.<init>(r3)     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            java.security.PrivateKey r0 = r1.generatePrivate(r0)     // Catch:{ NoSuchProviderException -> 0x0118, InvalidKeySpecException -> 0x0109 }
            return r0
        L_0x00fb:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.AnonymousClass001.A1I(r2, r0, r10)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0109:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C17900vP.A0C(r2, r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0118:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C17900vP.A0C(r2, r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0127:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0132:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x013d:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27341DcD.engineUnwrap(byte[], java.lang.String, int):java.security.Key");
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        C24173Bwh bwh = this.A02;
        if (bwh != null) {
            bwh.write(bArr, i, i2);
            return null;
        }
        throw AnonymousClass000.A0n("not supported in a wrapping mode");
    }

    public C27341DcD(E9M e9m, int i) {
        this.A01 = e9m;
        this.A04 = i;
    }

    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(AnonymousClass001.A1H("can't support mode ", str, AnonymousClass000.A10()));
    }

    public void engineSetPadding(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Padding ");
        A10.append(str);
        throw new NoSuchPaddingException(AnonymousClass000.A0y(" unknown.", A10));
    }

    public C27341DcD() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x002d
            java.lang.Class[] r2 = r3.A03
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
            r3.A00 = r6
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27341DcD.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C24173Bwh bwh = this.A02;
        if (bwh != null) {
            bwh.write(bArr, i, i2);
            return 0;
        }
        throw AnonymousClass000.A0n("not supported in a wrapping mode");
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Throwable th;
        byte[] bArr3;
        C24173Bwh bwh = this.A02;
        if (bwh != null) {
            bwh.write(bArr, i, i2);
            try {
                if (this.A05) {
                    E9M e9m = this.A01;
                    C24173Bwh bwh2 = this.A02;
                    bArr3 = e9m.CSI(bwh2.A01(), bwh2.size());
                } else {
                    try {
                        E9M e9m2 = this.A01;
                        C24173Bwh bwh3 = this.A02;
                        bArr3 = e9m2.CQG(bwh3.A01(), bwh3.size());
                    } catch (C28379DyP e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                int length = bArr3.length;
                if (length + i3 <= bArr2.length) {
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    this.A02.A00();
                    return length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A02.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass000.A0n("not supported in a wrapping mode");
        }
    }
}
