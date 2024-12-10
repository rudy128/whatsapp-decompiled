package X;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ctw  reason: case insensitive filesystem */
public abstract class C26178Ctw {
    public static final Map A00;
    public static final C28331Dxd A01 = C28273Dwh.A00;

    public static void A02(String str, StringBuffer stringBuffer, byte[] bArr) {
        byte[] A02;
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(AnonymousClass1Bo.A02(C20073A5z.A02(bArr, 0, 20)));
            stringBuffer.append(str);
            int i = 20;
            do {
                int i2 = length - 20;
                stringBuffer.append("                       ");
                if (i < i2) {
                    A02 = C20073A5z.A02(bArr, i, 20);
                } else {
                    A02 = C20073A5z.A02(bArr, i, length - i);
                }
                stringBuffer.append(AnonymousClass1Bo.A02(A02));
                stringBuffer.append(str);
                i += 20;
            } while (i < length);
            return;
        }
        stringBuffer.append(AnonymousClass1Bo.A02(C20073A5z.A02(bArr, 0, length)));
        stringBuffer.append(str);
    }

    public static String A00(AnonymousClass1C0 r4) {
        String A0s = C17880vN.A0s(r4, CGV.A00);
        if (A0s == null) {
            A0s = r4.A01;
        }
        int indexOf = A0s.indexOf(45);
        if (indexOf <= 0 || A0s.startsWith("SHA3")) {
            return A0s;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass8BS.A0o(A0s, indexOf));
        return AnonymousClass000.A0y(BE6.A0p(indexOf, A0s), A10);
    }

    public static String A01(C28292Dx0 dx0) {
        C28331Dxd dxd;
        StringBuilder A10;
        String str;
        AnonymousClass1Bx r2 = dx0.A00;
        if (!(r2 == null || (dxd = A01) == r2 || dxd.A0I(r2.CP9()))) {
            AnonymousClass1C0 r1 = dx0.A01;
            if (r1.A0J(AnonymousClass1Bw.A0I)) {
                C28316DxO A012 = C28316DxO.A01(r2);
                A10 = AnonymousClass000.A10();
                A10.append(A00(A012.A02.A01));
                str = "withRSAandMGF1";
            } else if (r1.A0J(EBM.A0Y)) {
                C28339Dxl A05 = C28339Dxl.A05(r2);
                A10 = AnonymousClass000.A10();
                A10.append(A00((AnonymousClass1C0) C28339Dxl.A03(A05)));
                str = "withECDSA";
            }
            return AnonymousClass000.A0y(str, A10);
        }
        Map map = A00;
        AnonymousClass1C0 r6 = dx0.A01;
        String A0s = C17880vN.A0s(r6, map);
        if (A0s != null) {
            return A0s;
        }
        Provider provider = Security.getProvider("SC");
        if (provider != null) {
            String property = provider.getProperty(AnonymousClass001.A1E(r6, "Alg.Alias.Signature.", AnonymousClass000.A10()));
            if (property != null) {
                return property;
            }
            String property2 = provider.getProperty(AnonymousClass001.A1E(r6, "Alg.Alias.Signature.OID.", AnonymousClass000.A10()));
            if (property2 != null) {
                return property2;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2) {
                String property3 = provider2.getProperty(AnonymousClass001.A1E(r6, "Alg.Alias.Signature.", AnonymousClass000.A10()));
                if (property3 != null) {
                    return property3;
                }
                String property4 = provider2.getProperty(AnonymousClass001.A1E(r6, "Alg.Alias.Signature.OID.", AnonymousClass000.A10()));
                if (property4 != null) {
                    return property4;
                }
            }
        }
        return r6.A01;
    }

    public static void A03(Signature signature, AnonymousClass1Bx r4) {
        C28331Dxd dxd;
        if (r4 != null && (dxd = A01) != r4 && !dxd.A0I(r4.CP9())) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r4.CP9().A0B());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException(C17900vP.A0C("Exception extracting parameters: ", AnonymousClass000.A10(), e));
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException(C17900vP.A0C("IOException decoding parameters: ", AnonymousClass000.A10(), e2));
            }
        }
    }

    static {
        HashMap A11 = C17880vN.A11();
        A00 = A11;
        A11.put(EB5.A00, "Ed25519");
        A11.put(EB5.A01, "Ed448");
        A11.put(AnonymousClass1C6.A05, "SHA1withDSA");
        A11.put(EBM.A0g, "SHA1withDSA");
    }
}
