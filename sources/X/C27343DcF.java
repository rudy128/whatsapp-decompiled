package X;

import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* renamed from: X.DcF  reason: case insensitive filesystem */
public abstract class C27343DcF extends MacSpi {
    public static final Class A01 = AnonymousClass1Br.A00("javax.crypto.spec.GCMParameterSpec", C27343DcF.class);
    public C28600E9r A00;

    public int engineGetMacLength() {
        return this.A00.BUJ();
    }

    public void engineReset() {
        this.A00.reset();
    }

    public void engineUpdate(byte b) {
        this.A00.CQK(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    public byte[] engineDoFinal() {
        C28600E9r e9r = this.A00;
        byte[] bArr = new byte[e9r.BUJ()];
        e9r.BJ5(bArr, 0);
        return bArr;
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        E3O dYo;
        if (key != null) {
            if (key instanceof DWH) {
                DWH dwh = (DWH) key;
                DWH.A00(dwh);
                if (dwh.param != null) {
                    DWH.A00(dwh);
                    dYo = dwh.param;
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw BE6.A0y("PBE requires PBE parameters to be set.");
                } else if (algorithmParameterSpec != null) {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    DWH.A00(dwh);
                    int i = dwh.type;
                    DWH.A00(dwh);
                    C24485C6c A012 = C25896Co7.A01(i, dwh.digest);
                    byte[] encoded = dwh.getEncoded();
                    byte[] salt = pBEParameterSpec.getSalt();
                    int iterationCount = pBEParameterSpec.getIterationCount();
                    A012.A01 = encoded;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    DWH.A00(dwh);
                    dYo = A012.A01(dwh.keySize);
                } else {
                    throw AnonymousClass000.A0k("Need a PBEParameter spec with a PBE key.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                dYo = new C27190DYo(key.getEncoded());
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("inappropriate parameter type: ");
                AnonymousClass8BW.A1M(algorithmParameterSpec, A10);
                throw BE6.A0y(A10.toString());
            }
            E3O e3o = dYo;
            if (dYo instanceof DYm) {
                e3o = ((DYm) e3o).A00;
            }
            C27190DYo dYo2 = (C27190DYo) e3o;
            if (algorithmParameterSpec instanceof C27345DcH) {
                C27345DcH dcH = (C27345DcH) algorithmParameterSpec;
                dYo = new DYn(dYo2, dcH.getIV(), AnonymousClass1C2.A02(dcH.A01), dcH.A00);
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                dYo = new DYm(dYo2, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                byte[] bArr = dYo2.A00;
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC2ParameterSpec.getEffectiveKeyBits();
                dYo = new DYm(new C27190DYo(bArr), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec == null) {
                dYo = new C27190DYo(key.getEncoded());
            } else {
                Class cls = A01;
                if (cls != null && BE7.A1W(cls, algorithmParameterSpec)) {
                    Class cls2 = C25455Cg7.A00;
                    try {
                        dYo = (DYn) AccessController.doPrivileged(new DU7(algorithmParameterSpec, dYo2));
                    } catch (Exception unused) {
                        throw BE6.A0y("Cannot process GCMParameterSpec.");
                    }
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("unknown parameter type: ");
                    AnonymousClass8BW.A1M(algorithmParameterSpec, A102);
                    throw BE6.A0y(A102.toString());
                }
            }
            try {
                this.A00.BdA(dYo);
            } catch (Exception e) {
                throw BE6.A0y(C17900vP.A0C("cannot initialize MAC: ", AnonymousClass000.A10(), e));
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }
}
