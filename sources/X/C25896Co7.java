package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.Co7  reason: case insensitive filesystem */
public abstract class C25896Co7 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.DZM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.DZM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.DZM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.Dyf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.Dyg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.Dyh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.Dye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.Dyd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.DZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.DZK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.DZN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.Dyi} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.C6c, X.DyR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.DyU, X.C6c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object, X.DYp] */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.DyS, X.C6c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C24485C6c A01(int r3, int r4) {
        /*
            r2 = 5
            r1 = 1
            if (r3 == 0) goto L_0x0108
            r0 = 4
            if (r3 == r0) goto L_0x0108
            if (r3 == r1) goto L_0x008a
            if (r3 == r2) goto L_0x008a
            r0 = 2
            if (r3 != r0) goto L_0x0084
            switch(r4) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0036;
                case 2: goto L_0x0018;
                case 3: goto L_0x001e;
                case 4: goto L_0x003c;
                case 5: goto L_0x0024;
                case 6: goto L_0x002a;
                case 7: goto L_0x0042;
                case 8: goto L_0x0048;
                case 9: goto L_0x004e;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "unknown digest scheme for PBE encryption."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0018:
            X.Dyi r2 = new X.Dyi
            r2.<init>()
            goto L_0x0053
        L_0x001e:
            X.DZN r2 = new X.DZN
            r2.<init>()
            goto L_0x0053
        L_0x0024:
            X.DZK r2 = new X.DZK
            r2.<init>()
            goto L_0x0053
        L_0x002a:
            X.DZL r2 = new X.DZL
            r2.<init>()
            goto L_0x0053
        L_0x0030:
            X.Dye r2 = new X.Dye
            r2.<init>()
            goto L_0x0053
        L_0x0036:
            X.Dyh r2 = new X.Dyh
            r2.<init>()
            goto L_0x0053
        L_0x003c:
            X.Dyg r2 = new X.Dyg
            r2.<init>()
            goto L_0x0053
        L_0x0042:
            X.Dyf r2 = new X.Dyf
            r2.<init>()
            goto L_0x0053
        L_0x0048:
            X.Dyj r2 = new X.Dyj
            r2.<init>()
            goto L_0x0053
        L_0x004e:
            X.Dyk r2 = new X.Dyk
            r2.<init>()
        L_0x0053:
            X.DyS r1 = new X.DyS
            r1.<init>()
            r1.A02 = r2
            boolean r0 = r2 instanceof X.EEP
            if (r0 == 0) goto L_0x006d
            int r0 = r2.BQf()
            r1.A00 = r0
            X.EEP r2 = (X.EEP) r2
            int r0 = r2.BNv()
            r1.A01 = r0
            return r1
        L_0x006d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Digest "
            r1.append(r0)
            java.lang.String r0 = r2.BMl()
            r1.append(r0)
            java.lang.String r0 = " unsupported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x0084:
            X.DyT r1 = new X.DyT
            r1.<init>()
            return r1
        L_0x008a:
            switch(r4) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00de;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00e4;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00f0;
                case 10: goto L_0x0094;
                case 11: goto L_0x0097;
                case 12: goto L_0x009a;
                case 13: goto L_0x009d;
                case 14: goto L_0x00cc;
                default: goto L_0x008d;
            }
        L_0x008d:
            java.lang.String r0 = "unknown digest scheme for PBE PKCS5S2 encryption."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0094:
            r1 = 224(0xe0, float:3.14E-43)
            goto L_0x009f
        L_0x0097:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x009f
        L_0x009a:
            r1 = 384(0x180, float:5.38E-43)
            goto L_0x009f
        L_0x009d:
            r1 = 512(0x200, float:7.175E-43)
        L_0x009f:
            X.DYp r2 = new X.DYp
            r2.<init>()
            r0 = 25
            long[] r0 = new long[r0]
            r2.A05 = r0
            r0 = 192(0xc0, float:2.69E-43)
            byte[] r0 = new byte[r0]
            r2.A04 = r0
            X.C27191DYp.A02(r2, r1)
            goto L_0x00f5
        L_0x00b4:
            X.Dyi r2 = new X.Dyi
            r2.<init>()
            goto L_0x00f5
        L_0x00ba:
            X.DZN r2 = new X.DZN
            r2.<init>()
            goto L_0x00f5
        L_0x00c0:
            X.DZK r2 = new X.DZK
            r2.<init>()
            goto L_0x00f5
        L_0x00c6:
            X.DZL r2 = new X.DZL
            r2.<init>()
            goto L_0x00f5
        L_0x00cc:
            X.Dyd r2 = new X.Dyd
            r2.<init>()
            goto L_0x00f5
        L_0x00d2:
            X.Dye r2 = new X.Dye
            r2.<init>()
            goto L_0x00f5
        L_0x00d8:
            X.Dyh r2 = new X.Dyh
            r2.<init>()
            goto L_0x00f5
        L_0x00de:
            X.Dyg r2 = new X.Dyg
            r2.<init>()
            goto L_0x00f5
        L_0x00e4:
            X.Dyf r2 = new X.Dyf
            r2.<init>()
            goto L_0x00f5
        L_0x00ea:
            X.Dyj r2 = new X.Dyj
            r2.<init>()
            goto L_0x00f5
        L_0x00f0:
            X.Dyk r2 = new X.Dyk
            r2.<init>()
        L_0x00f5:
            X.DyU r1 = new X.DyU
            r1.<init>()
            X.DYt r0 = new X.DYt
            r0.<init>(r2)
            r1.A00 = r0
            int r0 = r0.A01
            byte[] r0 = new byte[r0]
            r1.A01 = r0
            return r1
        L_0x0108:
            if (r4 == 0) goto L_0x0121
            if (r4 == r1) goto L_0x011b
            if (r4 != r2) goto L_0x0127
            X.DZK r0 = new X.DZK
            r0.<init>()
        L_0x0113:
            X.DyR r1 = new X.DyR
            r1.<init>()
            r1.A00 = r0
            return r1
        L_0x011b:
            X.Dyh r0 = new X.Dyh
            r0.<init>()
            goto L_0x0113
        L_0x0121:
            X.Dye r0 = new X.Dye
            r0.<init>()
            goto L_0x0113
        L_0x0127:
            java.lang.String r0 = "PKCS5 scheme 1 only supports MD2, MD5 and SHA1."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25896Co7.A01(int, int):X.C6c");
    }

    public static byte[] A02(PBEKeySpec pBEKeySpec, int i) {
        int length;
        if (i == 2) {
            char[] password = pBEKeySpec.getPassword();
            int i2 = 0;
            if (password == null || (length = password.length) <= 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[((length + 1) * 2)];
            do {
                char c = password[i2];
                BE7.A12(c >>> 8, bArr, i2 * 2, c);
                i2++;
            } while (i2 != length);
            return bArr;
        } else if (i == 5 || i == 4) {
            char[] password2 = pBEKeySpec.getPassword();
            if (password2 != null) {
                return AnonymousClass1Bo.A04(password2);
            }
            return new byte[0];
        } else {
            char[] password3 = pBEKeySpec.getPassword();
            if (password3 == null) {
                return new byte[0];
            }
            int length2 = password3.length;
            byte[] bArr2 = new byte[length2];
            for (int i3 = 0; i3 != length2; i3++) {
                bArr2[i3] = (byte) password3[i3];
            }
            return bArr2;
        }
    }

    public static E3O A00(String str, AlgorithmParameterSpec algorithmParameterSpec, DWH dwh) {
        E3O A02;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass000.A0k("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        DWH.A00(dwh);
        int i = dwh.type;
        DWH.A00(dwh);
        C24485C6c A01 = A01(i, dwh.digest);
        byte[] encoded = dwh.getEncoded();
        if (dwh.tryWrong) {
            encoded = new byte[2];
        }
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A01.A01 = encoded;
        A01.A02 = salt;
        A01.A00 = iterationCount;
        DWH.A00(dwh);
        int i2 = dwh.ivSize;
        DWH.A00(dwh);
        if (i2 != 0) {
            int i3 = dwh.keySize;
            DWH.A00(dwh);
            A02 = A01.A03(i3, dwh.ivSize);
        } else {
            A02 = A01.A02(dwh.keySize);
        }
        if (str.startsWith("DES")) {
            if (A02 instanceof DYm) {
                C28403Dyn.A00(((C27190DYo) ((DYm) A02).A00).A00);
            } else {
                C28403Dyn.A00(((C27190DYo) A02).A00);
                return A02;
            }
        }
        return A02;
    }
}
