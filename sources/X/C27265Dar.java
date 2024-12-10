package X;

import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;
import org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2;

/* renamed from: X.Dar  reason: case insensitive filesystem */
public abstract class C27265Dar extends AlgorithmParametersSpi {
    public static boolean A00(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        byte[] bArr;
        int i;
        Class cls2;
        AnonymousClass1By r0;
        byte[] bArr2;
        byte[] bArr3;
        if (cls != null) {
            if (this instanceof PBEPBKDF2.AlgParams) {
                PBEPBKDF2.AlgParams algParams = (PBEPBKDF2.AlgParams) this;
                if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                    C28315DxN dxN = algParams.A00;
                    return new PBEParameterSpec(dxN.A02.A00, new BigInteger(dxN.A00.A00).intValue());
                }
                throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
            }
            if (this instanceof AES.AlgParamsGCM) {
                AES.AlgParamsGCM algParamsGCM = (AES.AlgParamsGCM) this;
                if (cls == AlgorithmParameterSpec.class || C25455Cg7.A00 == cls) {
                    cls2 = C25455Cg7.A00;
                    if (cls2 != null) {
                        r0 = algParamsGCM.A00;
                        try {
                            C28287Dwv A01 = C28287Dwv.A01(r0.CP9());
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Integer.TYPE;
                            Constructor A0w = BE6.A0w(cls2, byte[].class, clsArr, 1);
                            Object[] objArr = new Object[2];
                            C17880vN.A1T(objArr, A01.A00 * 8, 0);
                            objArr[1] = AnonymousClass1C2.A02(A01.A01);
                            return (AlgorithmParameterSpec) A0w.newInstance(objArr);
                        } catch (NoSuchMethodException unused) {
                            throw new InvalidParameterSpecException("No constructor found!");
                        } catch (Exception e) {
                            throw new InvalidParameterSpecException(C17900vP.A0C("Construction failed: ", AnonymousClass000.A10(), e));
                        }
                    }
                } else if (cls != C27345DcH.class) {
                    if (cls == IvParameterSpec.class) {
                        bArr3 = algParamsGCM.A00.A01;
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("AlgorithmParameterSpec not recognized: ");
                        throw new InvalidParameterSpecException(AnonymousClass000.A0y(cls.getName(), A10));
                    }
                }
                bArr = AnonymousClass1C2.A02(algParamsGCM.A00.A01);
                i = algParamsGCM.A00.A00;
                return new C27345DcH(bArr, i * 8);
            } else if (this instanceof AES.AlgParamsCCM) {
                AES.AlgParamsCCM algParamsCCM = (AES.AlgParamsCCM) this;
                if (cls == AlgorithmParameterSpec.class || C25455Cg7.A00 == cls) {
                    cls2 = C25455Cg7.A00;
                    if (cls2 != null) {
                        r0 = algParamsCCM.A00;
                        C28287Dwv A012 = C28287Dwv.A01(r0.CP9());
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        Constructor A0w2 = BE6.A0w(cls2, byte[].class, clsArr2, 1);
                        Object[] objArr2 = new Object[2];
                        C17880vN.A1T(objArr2, A012.A00 * 8, 0);
                        objArr2[1] = AnonymousClass1C2.A02(A012.A01);
                        return (AlgorithmParameterSpec) A0w2.newInstance(objArr2);
                    }
                } else if (cls != C27345DcH.class) {
                    if (cls == IvParameterSpec.class) {
                        bArr3 = algParamsCCM.A00.A01;
                    } else {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("AlgorithmParameterSpec not recognized: ");
                        throw new InvalidParameterSpecException(AnonymousClass000.A0y(cls.getName(), A102));
                    }
                }
                bArr = AnonymousClass1C2.A02(algParamsCCM.A00.A01);
                i = algParamsCCM.A00.A00;
                return new C27345DcH(bArr, i * 8);
            } else {
                AES.AlgParams algParams2 = (AES.AlgParams) this;
                if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                    bArr2 = algParams2.A00;
                    return new IvParameterSpec(bArr2);
                }
                throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
            }
            bArr2 = AnonymousClass1C2.A02(bArr3);
            return new IvParameterSpec(bArr2);
        }
        throw AnonymousClass000.A0s("argument to getParameterSpec must not be null");
    }
}
