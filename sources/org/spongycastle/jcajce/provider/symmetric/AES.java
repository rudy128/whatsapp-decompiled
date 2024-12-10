package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Bk;
import X.AnonymousClass1Bs;
import X.AnonymousClass1Bz;
import X.AnonymousClass1C0;
import X.AnonymousClass1C2;
import X.AnonymousClass1C9;
import X.AnonymousClass1CG;
import X.AnonymousClass8BR;
import X.AnonymousClass8BW;
import X.BE6;
import X.BEA;
import X.C17880vN;
import X.C25455Cg7;
import X.C25735Cl5;
import X.C26181Cu4;
import X.C27193DYr;
import X.C27195DYu;
import X.C27196DYv;
import X.C27199DYy;
import X.C27200DYz;
import X.C27264Daq;
import X.C27265Dar;
import X.C27341DcD;
import X.C27342DcE;
import X.C27343DcF;
import X.C27344DcG;
import X.C27345DcH;
import X.C28286Dwu;
import X.C28287Dwv;
import X.C28327DxZ;
import X.C28342Dxo;
import X.C28379DyP;
import X.C28388DyY;
import X.C28389DyZ;
import X.C28401Dyl;
import X.C28408Dzr;
import X.C28600E9r;
import X.DU6;
import X.DYb;
import X.DYe;
import X.DZ0;
import X.DZ3;
import X.DZG;
import X.DZI;
import X.E03;
import X.E3O;
import X.E9Y;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

public final class AES {
    public static final Map A00;

    public class Mappings extends AnonymousClass1Bs {
        public static final String A00 = AES.class.getName();

        public void A02(AnonymousClass1Bk r37) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            sb.append(str);
            sb.append("$AlgParams");
            AnonymousClass1Bk r11 = r37;
            r11.BAv("AlgorithmParameters.AES", sb.toString());
            r11.BAv("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            r11.BAv("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            r11.BAv("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r35 = AnonymousClass1C9.A08;
            sb2.append(r35);
            r11.BAv(sb2.toString(), "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r34 = AnonymousClass1C9.A0G;
            sb3.append(r34);
            r11.BAv(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r33 = AnonymousClass1C9.A0O;
            sb4.append(r33);
            r11.BAv(sb4.toString(), "AES");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamsGCM");
            r11.BAv("AlgorithmParameters.GCM", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r32 = AnonymousClass1C9.A0C;
            sb6.append(r32);
            r11.BAv(sb6.toString(), "GCM");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r31 = AnonymousClass1C9.A0K;
            sb7.append(r31);
            r11.BAv(sb7.toString(), "GCM");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r6 = AnonymousClass1C9.A0S;
            sb8.append(r6);
            r11.BAv(sb8.toString(), "GCM");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append("$AlgParamsCCM");
            r11.BAv("AlgorithmParameters.CCM", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r3 = AnonymousClass1C9.A09;
            sb10.append(r3);
            r11.BAv(sb10.toString(), "CCM");
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r2 = AnonymousClass1C9.A0H;
            sb11.append(r2);
            r11.BAv(sb11.toString(), "CCM");
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass1C0 r1 = AnonymousClass1C9.A0P;
            sb12.append(r1);
            r11.BAv(sb12.toString(), "CCM");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append("$AlgParamGen");
            r11.BAv("AlgorithmParameterGenerator.AES", sb13.toString());
            r11.BAv("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            r11.BAv("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            r11.BAv("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb14.append(r35);
            r11.BAv(sb14.toString(), "AES");
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb15.append(r34);
            r11.BAv(sb15.toString(), "AES");
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb16.append(r33);
            r11.BAv(sb16.toString(), "AES");
            Map map = AES.A00;
            r11.BAy("Cipher.AES", map);
            StringBuilder sb17 = new StringBuilder();
            sb17.append(str);
            sb17.append("$ECB");
            r11.BAv("Cipher.AES", sb17.toString());
            r11.BAv("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            r11.BAv("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            r11.BAv("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            AnonymousClass1C0 r30 = AnonymousClass1C9.A0B;
            StringBuilder sb18 = new StringBuilder();
            sb18.append(str);
            sb18.append("$ECB");
            r11.BAw("Cipher", sb18.toString(), r30);
            AnonymousClass1C0 r29 = AnonymousClass1C9.A0J;
            StringBuilder sb19 = new StringBuilder();
            sb19.append(str);
            sb19.append("$ECB");
            r11.BAw("Cipher", sb19.toString(), r29);
            AnonymousClass1C0 r28 = AnonymousClass1C9.A0R;
            StringBuilder sb20 = new StringBuilder();
            sb20.append(str);
            sb20.append("$ECB");
            r11.BAw("Cipher", sb20.toString(), r28);
            StringBuilder sb21 = new StringBuilder();
            sb21.append(str);
            sb21.append("$CBC");
            r11.BAw("Cipher", sb21.toString(), r35);
            StringBuilder sb22 = new StringBuilder();
            sb22.append(str);
            sb22.append("$CBC");
            r11.BAw("Cipher", sb22.toString(), r34);
            StringBuilder sb23 = new StringBuilder();
            sb23.append(str);
            sb23.append("$CBC");
            r11.BAw("Cipher", sb23.toString(), r33);
            AnonymousClass1C0 r27 = AnonymousClass1C9.A0D;
            StringBuilder sb24 = new StringBuilder();
            sb24.append(str);
            sb24.append("$OFB");
            r11.BAw("Cipher", sb24.toString(), r27);
            AnonymousClass1C0 r26 = AnonymousClass1C9.A0L;
            StringBuilder sb25 = new StringBuilder();
            sb25.append(str);
            sb25.append("$OFB");
            r11.BAw("Cipher", sb25.toString(), r26);
            AnonymousClass1C0 r25 = AnonymousClass1C9.A0T;
            StringBuilder sb26 = new StringBuilder();
            sb26.append(str);
            sb26.append("$OFB");
            r11.BAw("Cipher", sb26.toString(), r25);
            AnonymousClass1C0 r24 = AnonymousClass1C9.A0A;
            StringBuilder sb27 = new StringBuilder();
            sb27.append(str);
            sb27.append("$CFB");
            r11.BAw("Cipher", sb27.toString(), r24);
            AnonymousClass1C0 r23 = AnonymousClass1C9.A0I;
            StringBuilder sb28 = new StringBuilder();
            sb28.append(str);
            sb28.append("$CFB");
            r11.BAw("Cipher", sb28.toString(), r23);
            AnonymousClass1C0 r22 = AnonymousClass1C9.A0Q;
            StringBuilder sb29 = new StringBuilder();
            sb29.append(str);
            sb29.append("$CFB");
            r11.BAw("Cipher", sb29.toString(), r22);
            r11.BAy("Cipher.AESWRAP", map);
            StringBuilder sb30 = new StringBuilder();
            sb30.append(str);
            sb30.append("$Wrap");
            r11.BAv("Cipher.AESWRAP", sb30.toString());
            AnonymousClass1C0 r21 = AnonymousClass1C9.A0E;
            r11.BAw("Alg.Alias.Cipher", "AESWRAP", r21);
            AnonymousClass1C0 r20 = AnonymousClass1C9.A0M;
            r11.BAw("Alg.Alias.Cipher", "AESWRAP", r20);
            AnonymousClass1C0 r19 = AnonymousClass1C9.A0U;
            r11.BAw("Alg.Alias.Cipher", "AESWRAP", r19);
            r11.BAv("Alg.Alias.Cipher.AESKW", "AESWRAP");
            r11.BAy("Cipher.AESWRAPPAD", map);
            StringBuilder sb31 = new StringBuilder();
            sb31.append(str);
            sb31.append("$WrapPad");
            r11.BAv("Cipher.AESWRAPPAD", sb31.toString());
            AnonymousClass1C0 r18 = AnonymousClass1C9.A0F;
            r11.BAw("Alg.Alias.Cipher", "AESWRAPPAD", r18);
            AnonymousClass1C0 r17 = AnonymousClass1C9.A0N;
            r11.BAw("Alg.Alias.Cipher", "AESWRAPPAD", r17);
            AnonymousClass1C0 r16 = AnonymousClass1C9.A0V;
            r11.BAw("Alg.Alias.Cipher", "AESWRAPPAD", r16);
            r11.BAv("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str);
            sb32.append("$RFC3211Wrap");
            r11.BAv("Cipher.AESRFC3211WRAP", sb32.toString());
            StringBuilder sb33 = new StringBuilder();
            sb33.append(str);
            sb33.append("$RFC5649Wrap");
            r11.BAv("Cipher.AESRFC5649WRAP", sb33.toString());
            StringBuilder sb34 = new StringBuilder();
            sb34.append(str);
            sb34.append("$AlgParamGenCCM");
            r11.BAv("AlgorithmParameterGenerator.CCM", sb34.toString());
            StringBuilder sb35 = new StringBuilder();
            sb35.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb35.append(r3);
            r11.BAv(sb35.toString(), "CCM");
            StringBuilder sb36 = new StringBuilder();
            sb36.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb36.append(r2);
            r11.BAv(sb36.toString(), "CCM");
            StringBuilder sb37 = new StringBuilder();
            sb37.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb37.append(r1);
            r11.BAv(sb37.toString(), "CCM");
            r11.BAy("Cipher.CCM", map);
            StringBuilder sb38 = new StringBuilder();
            sb38.append(str);
            sb38.append("$CCM");
            r11.BAv("Cipher.CCM", sb38.toString());
            r11.BAw("Alg.Alias.Cipher", "CCM", r3);
            r11.BAw("Alg.Alias.Cipher", "CCM", r2);
            r11.BAw("Alg.Alias.Cipher", "CCM", r1);
            StringBuilder sb39 = new StringBuilder();
            sb39.append(str);
            sb39.append("$AlgParamGenGCM");
            r11.BAv("AlgorithmParameterGenerator.GCM", sb39.toString());
            StringBuilder sb40 = new StringBuilder();
            sb40.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb40.append(r32);
            r11.BAv(sb40.toString(), "GCM");
            StringBuilder sb41 = new StringBuilder();
            sb41.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb41.append(r31);
            r11.BAv(sb41.toString(), "GCM");
            StringBuilder sb42 = new StringBuilder();
            sb42.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb42.append(r6);
            r11.BAv(sb42.toString(), "GCM");
            r11.BAy("Cipher.GCM", map);
            StringBuilder sb43 = new StringBuilder();
            sb43.append(str);
            sb43.append("$GCM");
            r11.BAv("Cipher.GCM", sb43.toString());
            r11.BAw("Alg.Alias.Cipher", "GCM", r32);
            r11.BAw("Alg.Alias.Cipher", "GCM", r31);
            r11.BAw("Alg.Alias.Cipher", "GCM", r6);
            StringBuilder sb44 = new StringBuilder();
            sb44.append(str);
            sb44.append("$KeyGen");
            r11.BAv("KeyGenerator.AES", sb44.toString());
            StringBuilder sb45 = new StringBuilder();
            sb45.append(str);
            sb45.append("$KeyGen128");
            r11.BAv("KeyGenerator.2.16.840.1.101.3.4.2", sb45.toString());
            StringBuilder sb46 = new StringBuilder();
            sb46.append(str);
            sb46.append("$KeyGen192");
            r11.BAv("KeyGenerator.2.16.840.1.101.3.4.22", sb46.toString());
            StringBuilder sb47 = new StringBuilder();
            sb47.append(str);
            sb47.append("$KeyGen256");
            r11.BAv("KeyGenerator.2.16.840.1.101.3.4.42", sb47.toString());
            StringBuilder sb48 = new StringBuilder();
            sb48.append(str);
            sb48.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb48.toString(), r30);
            StringBuilder sb49 = new StringBuilder();
            sb49.append(str);
            sb49.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb49.toString(), r35);
            StringBuilder sb50 = new StringBuilder();
            sb50.append(str);
            sb50.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb50.toString(), r27);
            StringBuilder sb51 = new StringBuilder();
            sb51.append(str);
            sb51.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb51.toString(), r24);
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str);
            sb52.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb52.toString(), r29);
            StringBuilder sb53 = new StringBuilder();
            sb53.append(str);
            sb53.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb53.toString(), r34);
            StringBuilder sb54 = new StringBuilder();
            sb54.append(str);
            sb54.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb54.toString(), r26);
            StringBuilder sb55 = new StringBuilder();
            sb55.append(str);
            sb55.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb55.toString(), r23);
            StringBuilder sb56 = new StringBuilder();
            sb56.append(str);
            sb56.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb56.toString(), r28);
            StringBuilder sb57 = new StringBuilder();
            sb57.append(str);
            sb57.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb57.toString(), r33);
            StringBuilder sb58 = new StringBuilder();
            sb58.append(str);
            sb58.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb58.toString(), r25);
            StringBuilder sb59 = new StringBuilder();
            sb59.append(str);
            sb59.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb59.toString(), r22);
            StringBuilder sb60 = new StringBuilder();
            sb60.append(str);
            sb60.append("$KeyGen");
            r11.BAv("KeyGenerator.AESWRAP", sb60.toString());
            StringBuilder sb61 = new StringBuilder();
            sb61.append(str);
            sb61.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb61.toString(), r21);
            StringBuilder sb62 = new StringBuilder();
            sb62.append(str);
            sb62.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb62.toString(), r20);
            StringBuilder sb63 = new StringBuilder();
            sb63.append(str);
            sb63.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb63.toString(), r19);
            StringBuilder sb64 = new StringBuilder();
            sb64.append(str);
            sb64.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb64.toString(), r32);
            StringBuilder sb65 = new StringBuilder();
            sb65.append(str);
            sb65.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb65.toString(), r31);
            StringBuilder sb66 = new StringBuilder();
            sb66.append(str);
            sb66.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb66.toString(), r6);
            StringBuilder sb67 = new StringBuilder();
            sb67.append(str);
            sb67.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb67.toString(), r3);
            StringBuilder sb68 = new StringBuilder();
            sb68.append(str);
            sb68.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb68.toString(), r2);
            StringBuilder sb69 = new StringBuilder();
            sb69.append(str);
            sb69.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb69.toString(), r1);
            StringBuilder sb70 = new StringBuilder();
            sb70.append(str);
            sb70.append("$KeyGen");
            r11.BAv("KeyGenerator.AESWRAPPAD", sb70.toString());
            StringBuilder sb71 = new StringBuilder();
            sb71.append(str);
            sb71.append("$KeyGen128");
            r11.BAw("KeyGenerator", sb71.toString(), r18);
            StringBuilder sb72 = new StringBuilder();
            sb72.append(str);
            sb72.append("$KeyGen192");
            r11.BAw("KeyGenerator", sb72.toString(), r17);
            StringBuilder sb73 = new StringBuilder();
            sb73.append(str);
            sb73.append("$KeyGen256");
            r11.BAw("KeyGenerator", sb73.toString(), r16);
            StringBuilder sb74 = new StringBuilder();
            sb74.append(str);
            sb74.append("$AESCMAC");
            r11.BAv("Mac.AESCMAC", sb74.toString());
            StringBuilder sb75 = new StringBuilder();
            sb75.append(str);
            sb75.append("$AESCCMMAC");
            r11.BAv("Mac.AESCCMMAC", sb75.toString());
            StringBuilder sb76 = new StringBuilder();
            sb76.append("Alg.Alias.Mac.");
            sb76.append(r3.A01);
            r11.BAv(sb76.toString(), "AESCCMMAC");
            StringBuilder sb77 = new StringBuilder();
            sb77.append("Alg.Alias.Mac.");
            sb77.append(r2.A01);
            r11.BAv(sb77.toString(), "AESCCMMAC");
            StringBuilder sb78 = new StringBuilder();
            sb78.append("Alg.Alias.Mac.");
            sb78.append(r1.A01);
            r11.BAv(sb78.toString(), "AESCCMMAC");
            AnonymousClass1C0 r212 = AnonymousClass1CG.A06;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            AnonymousClass1C0 r202 = AnonymousClass1CG.A07;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            AnonymousClass1C0 r192 = AnonymousClass1CG.A08;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            AnonymousClass1C0 r182 = AnonymousClass1CG.A0D;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            AnonymousClass1C0 r172 = AnonymousClass1CG.A0E;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            AnonymousClass1C0 r210 = AnonymousClass1CG.A0F;
            r11.BAw("Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            StringBuilder sb79 = new StringBuilder();
            sb79.append(str);
            sb79.append("$PBEWithSHA1AESCBC128");
            r11.BAv("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", sb79.toString());
            StringBuilder sb80 = new StringBuilder();
            sb80.append(str);
            sb80.append("$PBEWithSHA1AESCBC192");
            r11.BAv("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", sb80.toString());
            StringBuilder sb81 = new StringBuilder();
            sb81.append(str);
            sb81.append("$PBEWithSHA1AESCBC256");
            r11.BAv("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", sb81.toString());
            StringBuilder sb82 = new StringBuilder();
            sb82.append(str);
            sb82.append("$PBEWithSHA256AESCBC128");
            r11.BAv("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", sb82.toString());
            StringBuilder sb83 = new StringBuilder();
            sb83.append(str);
            sb83.append("$PBEWithSHA256AESCBC192");
            r11.BAv("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", sb83.toString());
            StringBuilder sb84 = new StringBuilder();
            sb84.append(str);
            sb84.append("$PBEWithSHA256AESCBC256");
            r11.BAv("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", sb84.toString());
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb85 = new StringBuilder();
            sb85.append(str);
            sb85.append("$PBEWithAESCBC");
            r11.BAv("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb85.toString());
            StringBuilder sb86 = new StringBuilder();
            sb86.append(str);
            sb86.append("$PBEWithAESCBC");
            r11.BAv("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb86.toString());
            StringBuilder sb87 = new StringBuilder();
            sb87.append(str);
            sb87.append("$PBEWithAESCBC");
            r11.BAv("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb87.toString());
            StringBuilder sb88 = new StringBuilder();
            sb88.append(str);
            sb88.append("$KeyFactory");
            r11.BAv("SecretKeyFactory.AES", sb88.toString());
            AnonymousClass1C0 r162 = AnonymousClass1C9.A00;
            StringBuilder sb89 = new StringBuilder();
            sb89.append(str);
            sb89.append("$KeyFactory");
            r11.BAw("SecretKeyFactory", sb89.toString(), r162);
            StringBuilder sb90 = new StringBuilder();
            sb90.append(str);
            sb90.append("$PBEWithMD5And128BitAESCBCOpenSSL");
            r11.BAv("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb90.toString());
            StringBuilder sb91 = new StringBuilder();
            sb91.append(str);
            sb91.append("$PBEWithMD5And192BitAESCBCOpenSSL");
            r11.BAv("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb91.toString());
            StringBuilder sb92 = new StringBuilder();
            sb92.append(str);
            sb92.append("$PBEWithMD5And256BitAESCBCOpenSSL");
            r11.BAv("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb92.toString());
            StringBuilder sb93 = new StringBuilder();
            sb93.append(str);
            sb93.append("$PBEWithSHAAnd128BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", sb93.toString());
            StringBuilder sb94 = new StringBuilder();
            sb94.append(str);
            sb94.append("$PBEWithSHAAnd192BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", sb94.toString());
            StringBuilder sb95 = new StringBuilder();
            sb95.append(str);
            sb95.append("$PBEWithSHAAnd256BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", sb95.toString());
            StringBuilder sb96 = new StringBuilder();
            sb96.append(str);
            sb96.append("$PBEWithSHA256And128BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", sb96.toString());
            StringBuilder sb97 = new StringBuilder();
            sb97.append(str);
            sb97.append("$PBEWithSHA256And192BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", sb97.toString());
            StringBuilder sb98 = new StringBuilder();
            sb98.append(str);
            sb98.append("$PBEWithSHA256And256BitAESBC");
            r11.BAv("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", sb98.toString());
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.BAv("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            r11.BAw("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.BAv("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            StringBuilder sb99 = new StringBuilder();
            sb99.append("Alg.Alias.AlgorithmParameters.");
            sb99.append(r212.A01);
            r11.BAv(sb99.toString(), "PKCS12PBE");
            StringBuilder sb100 = new StringBuilder();
            sb100.append("Alg.Alias.AlgorithmParameters.");
            sb100.append(r202.A01);
            r11.BAv(sb100.toString(), "PKCS12PBE");
            StringBuilder sb101 = new StringBuilder();
            sb101.append("Alg.Alias.AlgorithmParameters.");
            sb101.append(r192.A01);
            r11.BAv(sb101.toString(), "PKCS12PBE");
            StringBuilder sb102 = new StringBuilder();
            sb102.append("Alg.Alias.AlgorithmParameters.");
            sb102.append(r182.A01);
            r11.BAv(sb102.toString(), "PKCS12PBE");
            StringBuilder sb103 = new StringBuilder();
            sb103.append("Alg.Alias.AlgorithmParameters.");
            sb103.append(r172.A01);
            r11.BAv(sb103.toString(), "PKCS12PBE");
            StringBuilder sb104 = new StringBuilder();
            sb104.append("Alg.Alias.AlgorithmParameters.");
            sb104.append(r210.A01);
            r11.BAv(sb104.toString(), "PKCS12PBE");
            StringBuilder sb105 = new StringBuilder();
            sb105.append(str);
            sb105.append("$AESGMAC");
            String obj = sb105.toString();
            StringBuilder sb106 = new StringBuilder();
            sb106.append(str);
            sb106.append("$KeyGen128");
            String obj2 = sb106.toString();
            StringBuilder sb107 = new StringBuilder();
            sb107.append("Mac.");
            sb107.append("AES");
            sb107.append("-GMAC");
            r11.BAv(sb107.toString(), obj);
            StringBuilder sb108 = new StringBuilder();
            sb108.append("Alg.Alias.Mac.");
            sb108.append("AES");
            sb108.append("GMAC");
            String obj3 = sb108.toString();
            StringBuilder sb109 = new StringBuilder();
            sb109.append("AES");
            sb109.append("-GMAC");
            r11.BAv(obj3, sb109.toString());
            StringBuilder sb110 = new StringBuilder();
            sb110.append("KeyGenerator.");
            sb110.append("AES");
            sb110.append("-GMAC");
            r11.BAv(sb110.toString(), obj2);
            StringBuilder sb111 = new StringBuilder();
            sb111.append("Alg.Alias.KeyGenerator.");
            sb111.append("AES");
            sb111.append("GMAC");
            String obj4 = sb111.toString();
            StringBuilder sb112 = new StringBuilder();
            sb112.append("AES");
            sb112.append("-GMAC");
            r11.BAv(obj4, sb112.toString());
            StringBuilder sb113 = new StringBuilder();
            sb113.append(str);
            sb113.append("$Poly1305");
            String obj5 = sb113.toString();
            StringBuilder sb114 = new StringBuilder();
            sb114.append(str);
            sb114.append("$Poly1305KeyGen");
            String obj6 = sb114.toString();
            StringBuilder sb115 = new StringBuilder();
            sb115.append("Mac.POLY1305-");
            sb115.append("AES");
            r11.BAv(sb115.toString(), obj5);
            StringBuilder sb116 = new StringBuilder();
            sb116.append("Alg.Alias.Mac.POLY1305");
            sb116.append("AES");
            String obj7 = sb116.toString();
            StringBuilder sb117 = new StringBuilder();
            sb117.append("POLY1305-");
            sb117.append("AES");
            r11.BAv(obj7, sb117.toString());
            StringBuilder sb118 = new StringBuilder();
            sb118.append("KeyGenerator.POLY1305-");
            sb118.append("AES");
            r11.BAv(sb118.toString(), obj6);
            StringBuilder sb119 = new StringBuilder();
            sb119.append("Alg.Alias.KeyGenerator.POLY1305");
            sb119.append("AES");
            String obj8 = sb119.toString();
            StringBuilder sb120 = new StringBuilder();
            sb120.append("POLY1305-");
            sb120.append("AES");
            r11.BAv(obj8, sb120.toString());
        }
    }

    public class AESCCMMAC extends C27343DcF {

        public class CCMMac implements C28600E9r {
            public int A00 = 8;
            public final DZ0 A01 = new DZ0(new DYe());

            public int BUJ() {
                return this.A00;
            }

            public void BdA(E3O e3o) {
                DZ0 dz0 = this.A01;
                dz0.BdC(e3o, true);
                this.A00 = dz0.BUI().length;
            }

            public void update(byte[] bArr, int i, int i2) {
                this.A01.CCd(bArr, i, i2);
            }

            public void BJ5(byte[] bArr, int i) {
                try {
                    this.A01.BJ4(bArr, 0);
                } catch (C28379DyP e) {
                    throw AnonymousClass000.A0n(BEA.A0j(e, "exception on doFinal(): ", AnonymousClass000.A10()));
                }
            }

            public void CQK(byte b) {
                this.A01.A04.write(b);
            }

            public void reset() {
                DZ0 dz0 = this.A01;
                dz0.A02.reset();
                dz0.A04.reset();
                dz0.A05.reset();
            }
        }

        public AESCCMMAC() {
            this.A00 = new CCMMac();
        }
    }

    public class AESCMAC extends C27343DcF {
        public AESCMAC() {
            this.A00 = new C27195DYu(new DYe());
        }
    }

    public class AESGMAC extends C27343DcF {
        public AESGMAC() {
            this.A00 = new C27193DYr(new DZ3(new DYe()));
        }
    }

    public class AlgParamGen extends C27264Daq {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = C26181Cu4.A00();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("AES", ((DZI) this.A01).A00);
                instance.init(new IvParameterSpec(bArr));
                return instance;
            } catch (Exception e) {
                throw AnonymousClass8BR.A0w(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw BE6.A0y("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenCCM extends C27264Daq {
        /* JADX WARNING: type inference failed for: r1v1, types: [X.Dwu, java.lang.Object, X.1By] */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("CCM", ((DZI) this.A01).A00);
                ? obj = new Object();
                obj.A01 = AnonymousClass1C2.A02(bArr);
                obj.A00 = 12;
                instance.init(obj.A0B());
                return instance;
            } catch (Exception e) {
                throw AnonymousClass8BR.A0w(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw BE6.A0y("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenGCM extends C27264Daq {
        /* JADX WARNING: type inference failed for: r1v1, types: [X.Dwv, java.lang.Object, X.1By] */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("GCM", ((DZI) this.A01).A00);
                ? obj = new Object();
                obj.A01 = AnonymousClass1C2.A02(bArr);
                obj.A00 = 16;
                instance.init(obj.A0B());
                return instance;
            } catch (Exception e) {
                throw AnonymousClass8BR.A0w(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw BE6.A0y("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class CCM extends C28408Dzr {
        /* JADX WARNING: type inference failed for: r0v4, types: [X.DZH, java.lang.Object, X.EAE] */
        public CCM() {
            DZ0 dz0 = new DZ0(new DYe());
            Class[] clsArr = new Class[6];
            clsArr[0] = RC2ParameterSpec.class;
            C27341DcD.A04(this, clsArr);
            C27341DcD.A03(this);
            this.A05 = dz0.A02;
            this.A09 = false;
            this.A00 = 12;
            ? obj = new Object();
            obj.A00 = dz0;
            this.A08 = obj;
        }
    }

    public class CFB extends C28408Dzr {
        public CFB() {
            super(new C25735Cl5(new C28389DyZ(new DYe(), 128)));
        }
    }

    public class ECB extends C28408Dzr {
        public ECB() {
            AnonymousClass1 r3 = new Object() {
            };
            Class[] clsArr = new Class[6];
            clsArr[0] = RC2ParameterSpec.class;
            C27341DcD.A04(this, clsArr);
            C27341DcD.A03(this);
            this.A05 = new DYe();
            this.A07 = r3;
            this.A08 = new DZG(new DYe());
        }
    }

    public class GCM extends C28408Dzr {
        /* JADX WARNING: type inference failed for: r0v5, types: [X.DZH, java.lang.Object, X.EAE] */
        public GCM() {
            DZ3 dz3 = new DZ3(new DYe());
            Class[] clsArr = new Class[6];
            clsArr[0] = RC2ParameterSpec.class;
            C27341DcD.A04(this, clsArr);
            C27341DcD.A03(this);
            E9Y e9y = dz3.A03;
            this.A05 = e9y;
            this.A00 = e9y.BNR();
            ? obj = new Object();
            obj.A00 = dz3;
            this.A08 = obj;
        }
    }

    public class KeyFactory extends C27344DcG {
        public KeyFactory() {
            this.A00 = "AES";
            this.A01 = null;
        }
    }

    public class KeyGen extends C27342DcE {
        /* JADX WARNING: type inference failed for: r1v0, types: [X.CYU, java.lang.Object] */
        public KeyGen() {
            super("AES", new Object(), 192);
        }
    }

    public class KeyGen128 extends KeyGen {
        /* JADX WARNING: type inference failed for: r1v0, types: [X.CYU, java.lang.Object] */
        public KeyGen128() {
            super("AES", new Object(), 128);
        }
    }

    public class KeyGen192 extends KeyGen {
        /* JADX WARNING: type inference failed for: r1v0, types: [X.CYU, java.lang.Object] */
        public KeyGen192() {
            super("AES", new Object(), 192);
        }
    }

    public class KeyGen256 extends KeyGen {
        /* JADX WARNING: type inference failed for: r1v0, types: [X.CYU, java.lang.Object] */
        public KeyGen256() {
            super("AES", new Object(), 256);
        }
    }

    public class OFB extends C28408Dzr {
        public OFB() {
            super(new C25735Cl5(new C28388DyY(new DYe(), 128)));
        }
    }

    public class PBEWithMD5And128BitAESCBCOpenSSL extends E03 {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", 3, 0, 128, 128, true);
        }
    }

    public class PBEWithMD5And192BitAESCBCOpenSSL extends E03 {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", 3, 0, 192, 128, true);
        }
    }

    public class PBEWithMD5And256BitAESCBCOpenSSL extends E03 {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", 3, 0, 256, 128, true);
        }
    }

    public class PBEWithSHA256And128BitAESBC extends E03 {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", 2, 4, 128, 128, true);
        }
    }

    public class PBEWithSHA256And192BitAESBC extends E03 {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", 2, 4, 192, 128, true);
        }
    }

    public class PBEWithSHA256And256BitAESBC extends E03 {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", 2, 4, 256, 128, true);
        }
    }

    public class PBEWithSHAAnd128BitAESBC extends E03 {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", 2, 1, 128, 128, true);
        }
    }

    public class PBEWithSHAAnd192BitAESBC extends E03 {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", 2, 1, 192, 128, true);
        }
    }

    public class PBEWithSHAAnd256BitAESBC extends E03 {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", 2, 1, 256, 128, true);
        }
    }

    public class Poly1305 extends C27343DcF {
        public Poly1305() {
            this.A00 = new C27196DYv(new DYe());
        }
    }

    public class Poly1305KeyGen extends C27342DcE {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.CYU, java.lang.Object] */
        public Poly1305KeyGen() {
            super("Poly1305-AES", new Object(), 256);
        }
    }

    public class RFC3211Wrap extends C27341DcD {
        /* JADX WARNING: type inference failed for: r1v0, types: [X.DYx, java.lang.Object, X.E9M] */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public RFC3211Wrap() {
            /*
                r3 = this;
                X.DYe r2 = new X.DYe
                r2.<init>()
                X.DYx r1 = new X.DYx
                r1.<init>()
                X.DYb r0 = new X.DYb
                r0.<init>(r2)
                r1.A00 = r0
                r0 = 16
                r3.<init>(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.AES.RFC3211Wrap.<init>():void");
        }
    }

    public class RFC5649Wrap extends C27341DcD {
        public RFC5649Wrap() {
            super(new C27200DYz(new DYe()), 0);
        }
    }

    public class Wrap extends C27341DcD {
        public Wrap() {
            super(new C27199DYy(), 0);
        }
    }

    public class WrapPad extends C27341DcD {
        public WrapPad() {
            super(new C28401Dyl(), 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }

    public class AlgParams extends C27265Dar {
        public byte[] A00;

        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public byte[] engineGetEncoded(String str) {
            if (C27265Dar.A00(str)) {
                return new C28327DxZ(engineGetEncoded("RAW")).A0B();
            }
            if (str.equals("RAW")) {
                return AnonymousClass1C2.A02(this.A00);
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.A00 = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }

        public String engineToString() {
            return "AES IV";
        }

        public void engineInit(byte[] bArr, String str) {
            if (C27265Dar.A00(str)) {
                try {
                    engineInit(((C28342Dxo) AnonymousClass1Bz.A01(bArr)).A00);
                } catch (Exception e) {
                    throw C17880vN.A0f(AnonymousClass001.A1E(e, "Exception decoding: ", AnonymousClass000.A10()));
                }
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw C17880vN.A0f("Unknown parameters format in IV parameters object");
            }
        }

        public void engineInit(byte[] bArr) {
            int length = bArr.length;
            if (length % 8 != 0 && bArr[0] == 4 && bArr[1] == length - 2) {
                bArr = ((C28342Dxo) AnonymousClass1Bz.A01(bArr)).A00;
            }
            this.A00 = AnonymousClass1C2.A02(bArr);
        }
    }

    public class AlgParamsCCM extends C27265Dar {
        public C28286Dwu A00;

        public byte[] engineGetEncoded() {
            return this.A00.A0B();
        }

        public void engineInit(byte[] bArr) {
            this.A00 = C28286Dwu.A01(bArr);
        }

        public String engineToString() {
            return "CCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (C27265Dar.A00(str)) {
                return this.A00.A0B();
            }
            throw C17880vN.A0f("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            if (C27265Dar.A00(str)) {
                this.A00 = C28286Dwu.A01(bArr);
                return;
            }
            throw C17880vN.A0f("unknown format specified");
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [X.Dwu, java.lang.Object] */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C28286Dwu dwu;
            Class cls = C25455Cg7.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    dwu = C28286Dwu.A01((C28287Dwv) AccessController.doPrivileged(new DU6(algorithmParameterSpec)));
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C27345DcH) {
                C27345DcH dcH = (C27345DcH) algorithmParameterSpec;
                byte[] iv = dcH.getIV();
                int i = dcH.A00 / 8;
                ? obj = new Object();
                obj.A01 = AnonymousClass1C2.A02(iv);
                obj.A00 = i;
                dwu = obj;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AlgorithmParameterSpec class not recognized: ");
                AnonymousClass8BW.A1M(algorithmParameterSpec, A10);
                throw new InvalidParameterSpecException(A10.toString());
            }
            this.A00 = dwu;
        }
    }

    public class AlgParamsGCM extends C27265Dar {
        public C28287Dwv A00;

        public byte[] engineGetEncoded() {
            return this.A00.A0B();
        }

        public void engineInit(byte[] bArr) {
            this.A00 = C28287Dwv.A01(bArr);
        }

        public String engineToString() {
            return "GCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (C27265Dar.A00(str)) {
                return this.A00.A0B();
            }
            throw C17880vN.A0f("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            if (C27265Dar.A00(str)) {
                this.A00 = C28287Dwv.A01(bArr);
                return;
            }
            throw C17880vN.A0f("unknown format specified");
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [X.Dwv, java.lang.Object] */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C28287Dwv dwv;
            Class cls = C25455Cg7.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    dwv = (C28287Dwv) AccessController.doPrivileged(new DU6(algorithmParameterSpec));
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C27345DcH) {
                C27345DcH dcH = (C27345DcH) algorithmParameterSpec;
                byte[] iv = dcH.getIV();
                int i = dcH.A00 / 8;
                ? obj = new Object();
                obj.A01 = AnonymousClass1C2.A02(iv);
                obj.A00 = i;
                dwv = obj;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AlgorithmParameterSpec class not recognized: ");
                AnonymousClass8BW.A1M(algorithmParameterSpec, A10);
                throw new InvalidParameterSpecException(A10.toString());
            }
            this.A00 = dwv;
        }
    }

    public class CBC extends C28408Dzr {
        public CBC() {
            DYb A01 = C27341DcD.A01();
            Class[] clsArr = new Class[6];
            clsArr[0] = RC2ParameterSpec.class;
            C27341DcD.A04(this, clsArr);
            this.A04 = null;
            this.A03 = null;
            this.A02 = null;
            this.A05 = A01;
            this.A09 = true;
            this.A08 = new DZG(A01);
            this.A00 = 16;
        }
    }

    public class PBEWithAESCBC extends C28408Dzr {
        public PBEWithAESCBC() {
            DYb A01 = C27341DcD.A01();
            Class[] clsArr = new Class[6];
            clsArr[0] = RC2ParameterSpec.class;
            C27341DcD.A04(this, clsArr);
            C27341DcD.A03(this);
            this.A05 = A01;
            this.A08 = new DZG(A01);
        }
    }

    public class PBEWithSHA1AESCBC128 extends C28408Dzr {
        public PBEWithSHA1AESCBC128() {
            super(C27341DcD.A01(), 1, 128);
        }
    }

    public class PBEWithSHA1AESCBC192 extends C28408Dzr {
        public PBEWithSHA1AESCBC192() {
            super(C27341DcD.A01(), 1, 192);
        }
    }

    public class PBEWithSHA1AESCBC256 extends C28408Dzr {
        public PBEWithSHA1AESCBC256() {
            super(C27341DcD.A01(), 1, 256);
        }
    }

    public class PBEWithSHA256AESCBC128 extends C28408Dzr {
        public PBEWithSHA256AESCBC128() {
            super(C27341DcD.A01(), 4, 128);
        }
    }

    public class PBEWithSHA256AESCBC192 extends C28408Dzr {
        public PBEWithSHA256AESCBC192() {
            super(C27341DcD.A01(), 4, 192);
        }
    }

    public class PBEWithSHA256AESCBC256 extends C28408Dzr {
        public PBEWithSHA256AESCBC256() {
            super(C27341DcD.A01(), 4, 256);
        }
    }
}
