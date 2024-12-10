package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass1Bs;
import X.AnonymousClass1Bw;
import X.AnonymousClass1Bz;
import X.AnonymousClass1C0;
import X.AnonymousClass1C9;
import X.AnonymousClass3MC;
import X.AnonymousClass8BR;
import X.BEA;
import X.C17880vN;
import X.C1B;
import X.C24485C6c;
import X.C25896Co7;
import X.C27190DYo;
import X.C27265Dar;
import X.C27344DcG;
import X.C28292Dx0;
import X.C28315DxN;
import X.C28339Dxl;
import X.DWG;
import X.DWH;
import X.EBJ;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PBEPBKDF2 {
    public static final Map A00;

    public class Mappings extends AnonymousClass1Bs {
        public static final String A00 = PBEPBKDF2.class.getName();
    }

    public class AlgParams extends C27265Dar {
        public C28315DxN A00;

        public byte[] engineGetEncoded(String str) {
            if (C27265Dar.A00(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                C28292Dx0 dx0 = C28315DxN.A04;
                this.A00 = new C28315DxN(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        public byte[] engineGetEncoded() {
            try {
                return this.A00.A0C("DER");
            } catch (IOException e) {
                throw AnonymousClass8BR.A0w(BEA.A0j(e, "Oooops! ", AnonymousClass000.A10()));
            }
        }

        public void engineInit(byte[] bArr, String str) {
            if (C27265Dar.A00(str)) {
                engineInit(bArr);
                return;
            }
            throw C17880vN.A0f("Unknown parameters format in PBKDF2 parameters object");
        }

        public void engineInit(byte[] bArr) {
            C28315DxN dxN;
            AnonymousClass1Bz A01 = AnonymousClass1Bz.A01(bArr);
            C28292Dx0 dx0 = C28315DxN.A04;
            if (A01 != null) {
                dxN = new C28315DxN(C28339Dxl.A05(A01));
            } else {
                dxN = null;
            }
            this.A00 = dxN;
        }
    }

    public class BasePBKDF2 extends C27344DcG {
        public int A00;
        public int A01;

        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            C1B c1b;
            KeySpec keySpec2 = keySpec;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
                if (pBEKeySpec.getSalt() == null) {
                    char[] password = pBEKeySpec.getPassword();
                    if (this.A01 == 1) {
                        c1b = C1B.A00;
                    } else {
                        c1b = C1B.A01;
                    }
                    return new DWG(c1b, password);
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("positive iteration count required: ");
                    throw new InvalidKeySpecException(C17880vN.A0t(A10, pBEKeySpec.getIterationCount()));
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("positive key length required: ");
                    throw new InvalidKeySpecException(C17880vN.A0t(A102, pBEKeySpec.getKeyLength()));
                } else if (pBEKeySpec.getPassword().length != 0) {
                    int i = this.A00;
                    int keyLength = pBEKeySpec.getKeyLength();
                    int i2 = this.A01;
                    C24485C6c A012 = C25896Co7.A01(i2, i);
                    byte[] A02 = C25896Co7.A02(pBEKeySpec, i2);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A02;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    C27190DYo A013 = A012.A01(keyLength);
                    for (int i3 = 0; i3 != A02.length; i3++) {
                        A02[i3] = 0;
                    }
                    return new DWH(this.A00, pBEKeySpec, this.A01, A013, i2, i, keyLength, -1);
                } else {
                    throw AnonymousClass000.A0k("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public BasePBKDF2(int i, int i2) {
            AnonymousClass1C0 r0 = AnonymousClass1Bw.A0G;
            this.A00 = "PBKDF2";
            this.A01 = r0;
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(1, 1);
        }
    }

    public class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(5, 6);
        }
    }

    public class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(5, 7);
        }
    }

    public class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(5, 4);
        }
    }

    public class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(5, 8);
        }
    }

    public class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(5, 10);
        }
    }

    public class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(5, 11);
        }
    }

    public class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(5, 12);
        }
    }

    public class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(5, 13);
        }
    }

    public class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(5, 9);
        }
    }

    public class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super(5, 14);
        }
    }

    public class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(5, 1);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put(EBJ.A0J, 6);
        hashMap.put(AnonymousClass1Bw.A1E, 1);
        hashMap.put(AnonymousClass1Bw.A1G, 4);
        hashMap.put(AnonymousClass1Bw.A1F, 7);
        hashMap.put(AnonymousClass1Bw.A1H, 8);
        hashMap.put(AnonymousClass1Bw.A1I, 9);
        hashMap.put(AnonymousClass1C9.A0g, 11);
        hashMap.put(AnonymousClass1C9.A0f, 10);
        hashMap.put(AnonymousClass1C9.A0h, 12);
        hashMap.put(AnonymousClass1C9.A0i, 13);
        hashMap.put(AnonymousClass3MC.A00, 14);
    }
}
