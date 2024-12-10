package X;

import android.graphics.Matrix;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.xml.sax.Attributes;

/* renamed from: X.Cx9  reason: case insensitive filesystem */
public class C26296Cx9 {
    public int A00;
    public E7L A01 = null;
    public C26262Cw7 A02 = null;
    public C0G A03 = null;
    public StringBuilder A04 = null;
    public StringBuilder A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;

    public static float A00(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CjV, java.lang.Object] */
    public static float A01(String str, int i) {
        float A002 = new Object().A00(str, 0, i);
        if (!Float.isNaN(A002)) {
            return A002;
        }
        throw E05.A00(AnonymousClass001.A1H("Invalid float value: ", str, AnonymousClass000.A10()));
    }

    public static int A02(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.BNk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v53, types: [X.BNk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v60, types: [X.BNk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v66, types: [X.BNk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, X.CMe] */
    public static C22747BNk A06(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int A022;
        long j;
        int i5;
        String str2 = str;
        int i6 = 5;
        if (str2.charAt(0) == '#') {
            int length = str2.length();
            C24836CMe cMe = null;
            if (1 < length) {
                long j2 = 0;
                int i7 = 1;
                while (true) {
                    int charAt = str2.charAt(i7);
                    if (charAt >= 48) {
                        if (charAt <= 57) {
                            j2 = (j2 * 16) + ((long) (charAt - 48));
                        } else if (charAt < 65) {
                            break;
                        } else {
                            if (charAt > 70) {
                                if (charAt < 97 || charAt > 102) {
                                    break;
                                }
                                j = j2 * 16;
                                i5 = charAt - 97;
                            } else {
                                j = j2 * 16;
                                i5 = charAt - 65;
                            }
                            j2 = j + ((long) i5) + 10;
                        }
                        if (j2 <= 4294967295L) {
                            i7++;
                            if (i7 >= length) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i7 != 1) {
                    ? obj = new Object();
                    obj.A01 = j2;
                    obj.A00 = i7;
                    cMe = obj;
                }
            }
            if (cMe != null) {
                int i8 = cMe.A00;
                if (i8 == 4) {
                    int i9 = (int) cMe.A01;
                    int i10 = i9 & 3840;
                    int i11 = i9 & 240;
                    int i12 = i9 & 15;
                    ? obj2 = new Object();
                    obj2.A00 = i12 | (i10 << 8) | -16777216 | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4);
                    return obj2;
                } else if (i8 == 5) {
                    int i13 = (int) cMe.A01;
                    int i14 = 61440 & i13;
                    int i15 = i13 & 3840;
                    int i16 = i13 & 240;
                    int i17 = i13 & 15;
                    ? obj3 = new Object();
                    obj3.A00 = (i17 << 24) | (i17 << 28) | (i14 << 8) | (i14 << 4) | (i15 << 4) | i15 | i16 | (i16 >> 4);
                    return obj3;
                } else if (i8 == 7) {
                    i = (int) cMe.A01;
                    i2 = i | -16777216;
                    ? obj4 = new Object();
                    obj4.A00 = i2;
                    return obj4;
                } else if (i8 == 9) {
                    int i18 = (int) cMe.A01;
                    i4 = i18 << 24;
                    i3 = i18 >>> 8;
                } else {
                    throw E05.A00(C17900vP.A0A("Bad hex colour value: ", str2));
                }
            } else {
                throw E05.A00(C17900vP.A0A("Bad hex colour value: ", str2));
            }
        } else {
            String A0n = AnonymousClass8BS.A0n(str2);
            boolean startsWith = A0n.startsWith("rgba(");
            if (!startsWith) {
                if (A0n.startsWith("rgb(")) {
                    i6 = 4;
                } else {
                    boolean startsWith2 = A0n.startsWith("hsla(");
                    if (!startsWith2) {
                        if (A0n.startsWith("hsl(")) {
                            i6 = 4;
                        } else {
                            Number A1E = C108945cZ.A1E(A0n, CEM.A00);
                            if (A1E != null) {
                                int intValue = A1E.intValue();
                                ? obj5 = new Object();
                                obj5.A00 = intValue;
                                return obj5;
                            }
                            throw E05.A00(AnonymousClass001.A1H("Invalid colour keyword: ", A0n, AnonymousClass000.A10()));
                        }
                    }
                    C25854CnG cnG = new C25854CnG(str2.substring(i6));
                    cnG.A0D();
                    float A032 = cnG.A03();
                    float A052 = cnG.A05(A032);
                    if (!Float.isNaN(A052)) {
                        cnG.A0F('%');
                    }
                    float A053 = cnG.A05(A052);
                    boolean isNaN = Float.isNaN(A053);
                    if (!isNaN) {
                        cnG.A0F('%');
                    }
                    if (startsWith2) {
                        float A054 = cnG.A05(A053);
                        cnG.A0D();
                        if (Float.isNaN(A054) || !cnG.A0F(')')) {
                            throw E05.A00(AnonymousClass001.A1H("Bad hsla() colour value: ", str2, AnonymousClass000.A10()));
                        }
                        i3 = A02(A054 * 256.0f) << 24;
                        i4 = A03(A032, A052, A053);
                    } else {
                        cnG.A0D();
                        if (isNaN || !cnG.A0F(')')) {
                            throw E05.A00(AnonymousClass001.A1H("Bad hsl() colour value: ", str2, AnonymousClass000.A10()));
                        }
                        i = A03(A032, A052, A053);
                        i2 = i | -16777216;
                        ? obj42 = new Object();
                        obj42.A00 = i2;
                        return obj42;
                    }
                }
            }
            C25854CnG cnG2 = new C25854CnG(str2.substring(i6));
            cnG2.A0D();
            float A033 = cnG2.A03();
            if (!Float.isNaN(A033) && cnG2.A0F('%')) {
                A033 = (A033 * 256.0f) / 100.0f;
            }
            float A055 = cnG2.A05(A033);
            if (!Float.isNaN(A055) && cnG2.A0F('%')) {
                A055 = (A055 * 256.0f) / 100.0f;
            }
            float A056 = cnG2.A05(A055);
            if (!Float.isNaN(A056) && cnG2.A0F('%')) {
                A056 = (A056 * 256.0f) / 100.0f;
            }
            if (startsWith) {
                float A057 = cnG2.A05(A056);
                cnG2.A0D();
                if (Float.isNaN(A057) || !cnG2.A0F(')')) {
                    throw E05.A00(AnonymousClass001.A1H("Bad rgba() colour value: ", str2, AnonymousClass000.A10()));
                }
                A022 = (A02(A057 * 256.0f) << 24) | (A02(A033) << 16);
            } else {
                cnG2.A0D();
                if (Float.isNaN(A056) || !cnG2.A0F(')')) {
                    throw E05.A00(AnonymousClass001.A1H("Bad rgb() colour value: ", str2, AnonymousClass000.A10()));
                }
                A022 = (A02(A033) << 16) | -16777216;
            }
            i3 = A022 | (A02(A055) << 8);
            i4 = A02(A056);
        }
        i2 = i3 | i4;
        ? obj422 = new Object();
        obj422.A00 = i2;
        return obj422;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x001b, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(X.C22744BNh r5, org.xml.sax.Attributes r6) {
        /*
            r4 = 0
            r3 = 0
        L_0x0002:
            int r0 = r6.getLength()
            if (r3 >= r0) goto L_0x00a2
            java.lang.String r0 = r6.getValue(r3)
            java.lang.String r2 = r0.trim()
            int r1 = A04(r6, r3)
            r0 = 26
            if (r1 == r0) goto L_0x0064
            switch(r1) {
                case 23: goto L_0x005d;
                case 24: goto L_0x0041;
                case 60: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0002
        L_0x001e:
            java.lang.String r0 = "pad"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x002b
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ IllegalArgumentException -> 0x0084 }
        L_0x0028:
            r5.A02 = r0     // Catch:{ IllegalArgumentException -> 0x0084 }
            goto L_0x001b
        L_0x002b:
            java.lang.String r0 = "reflect"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x0084 }
            goto L_0x0028
        L_0x0036:
            java.lang.String r0 = "repeat"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x007f
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ IllegalArgumentException -> 0x0084 }
            goto L_0x0028
        L_0x0041:
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0050
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x004d:
            r5.A01 = r0
            goto L_0x001b
        L_0x0050:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009b
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            goto L_0x004d
        L_0x005d:
            android.graphics.Matrix r0 = A05(r2)
            r5.A00 = r0
            goto L_0x001b
        L_0x0064:
            java.lang.String r1 = ""
            java.lang.String r0 = r6.getURI(r3)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = "http://www.w3.org/1999/xlink"
            java.lang.String r0 = r6.getURI(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
        L_0x007c:
            r5.A03 = r2
            goto L_0x001b
        L_0x007f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x0084 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0084 }
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.E05 r0 = X.E05.A00(r0)
            throw r0
        L_0x009b:
            java.lang.String r0 = "Invalid value for attribute gradientUnits"
            X.E05 r0 = X.E05.A00(r0)
            throw r0
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26296Cx9.A0F(X.BNh, org.xml.sax.Attributes):void");
    }

    public static void A0G(C28488E3s e3s, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            C0I c0i = (C0I) C0I.A00.get(attributes.getLocalName(i));
            if (c0i == null) {
                c0i = C0I.A03;
            }
            if (c0i == C0I.A1H) {
                e3s.CLC(A05(attributes.getValue(i)));
            }
        }
    }

    public static void A0I(EAF eaf, Attributes attributes) {
        HashSet hashSet;
        String str;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (A04(attributes, i)) {
                case 52:
                    C25854CnG cnG = new C25854CnG(trim);
                    HashSet A12 = C17880vN.A12();
                    while (!AnonymousClass000.A1T(cnG.A01, cnG.A00)) {
                        String A0C = cnG.A0C(' ', false);
                        if (A0C.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            str = A0C.substring(35);
                        } else {
                            str = "UNSUPPORTED";
                        }
                        A12.add(str);
                        cnG.A0D();
                    }
                    eaf.CKP(A12);
                    break;
                case 53:
                    eaf.CKO(trim);
                    break;
                case 54:
                    C25854CnG cnG2 = new C25854CnG(trim);
                    HashSet A122 = C17880vN.A12();
                    while (!AnonymousClass000.A1T(cnG2.A01, cnG2.A00)) {
                        A122.add(cnG2.A0C(' ', false));
                        cnG2.A0D();
                    }
                    eaf.CKR(A122);
                    break;
                case 55:
                    ArrayList A0D = A0D(trim);
                    if (A0D != null) {
                        hashSet = AnonymousClass8BR.A12(A0D);
                    } else {
                        hashSet = new HashSet(0);
                    }
                    eaf.CKQ(hashSet);
                    break;
                case 73:
                    C25854CnG cnG3 = new C25854CnG(trim);
                    HashSet A123 = C17880vN.A12();
                    while (!AnonymousClass000.A1T(cnG3.A01, cnG3.A00)) {
                        String A0C2 = cnG3.A0C(' ', false);
                        int indexOf = A0C2.indexOf(45);
                        if (indexOf != -1) {
                            A0C2 = A0C2.substring(0, indexOf);
                        }
                        A123.add(new Locale(A0C2, "", "").getLanguage());
                        cnG3.A0D();
                    }
                    eaf.CL1(A123);
                    break;
            }
        }
    }

    public static void A0J(C22761BNy bNy, Attributes attributes) {
        Boolean bool;
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID) || qName.equals("xml:id")) {
                bNy.A03 = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if (CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID.equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw E05.A00(AnonymousClass001.A1H("Invalid value for \"xml:space\" attribute: ", trim, AnonymousClass000.A10()));
                }
                bNy.A02 = bool;
                return;
            } else {
                i++;
            }
        }
    }

    public static void A0K(C22761BNy bNy, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int A042 = A04(attributes, i);
                if (A042 == 72) {
                    C25854CnG cnG = new C25854CnG(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String A0C = cnG.A0C(':', false);
                        cnG.A0D();
                        if (!cnG.A0F(':')) {
                            break;
                        }
                        cnG.A0D();
                        String A0C2 = cnG.A0C(';', true);
                        if (A0C2 == null) {
                            break;
                        }
                        cnG.A0D();
                        if (AnonymousClass000.A1T(cnG.A01, cnG.A00) || cnG.A0F(';')) {
                            DS2 ds2 = bNy.A01;
                            if (ds2 == null) {
                                ds2 = new DS2();
                                bNy.A01 = ds2;
                            }
                            A0H(ds2, A0C, A0C2);
                            cnG.A0D();
                        }
                    }
                } else if (A042 != 0) {
                    DS2 ds22 = bNy.A00;
                    if (ds22 == null) {
                        ds22 = new DS2();
                        bNy.A00 = ds22;
                    }
                    A0H(ds22, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C25854CnG cnG2 = new C25854CnG(trim.replaceAll("(?s)/\\*.*?\\*/", ""));
                    ArrayList arrayList = null;
                    while (!AnonymousClass000.A1T(cnG2.A01, cnG2.A00)) {
                        String A0C3 = cnG2.A0C(' ', false);
                        if (A0C3 != null) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass000.A13();
                            }
                            arrayList.add(A0C3);
                            cnG2.A0D();
                        }
                    }
                    bNy.A04 = arrayList;
                }
            }
        }
    }

    public static void A0M(C22752BNp bNp, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A042 = A04(attributes, i);
            if (A042 == 48) {
                A0L(bNp, trim);
            } else if (A042 == 80) {
                C25854CnG cnG = new C25854CnG(trim);
                cnG.A0D();
                float A032 = cnG.A03();
                cnG.A0E();
                float A033 = cnG.A03();
                cnG.A0E();
                float A034 = cnG.A03();
                cnG.A0E();
                float A035 = cnG.A03();
                if (Float.isNaN(A032) || Float.isNaN(A033) || Float.isNaN(A034) || Float.isNaN(A035)) {
                    throw E05.A00("Invalid viewBox definition - should have four numbers");
                } else if (A034 < 0.0f) {
                    throw E05.A00("Invalid viewBox. width cannot be negative");
                } else if (A035 >= 0.0f) {
                    bNp.A00 = new C25668Cjy(A032, A033, A034, A035);
                } else {
                    throw E05.A00("Invalid viewBox. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    public static void A0N(C22756BNt bNt, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A042 = A04(attributes, i);
            if (A042 == 82) {
                bNt.A02 = A0E(trim);
            } else if (A042 == 83) {
                bNt.A03 = A0E(trim);
            } else if (A042 == 9) {
                bNt.A00 = A0E(trim);
            } else if (A042 == 10) {
                bNt.A01 = A0E(trim);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 <= 0.5f) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L_0x0009
            float r5 = r5 + r1
        L_0x0009:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r6 = 0
        L_0x0017:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0055
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
        L_0x0028:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L_0x002a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A02(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A02(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A02(r3)
            r0 = r0 | r1
            return r0
        L_0x0055:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L_0x002a
        L_0x005b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26296Cx9.A03(float, float, float):int");
    }

    public static int A04(Attributes attributes, int i) {
        C7u c7u = C7u.$redex_init_class;
        C0I c0i = (C0I) C0I.A00.get(attributes.getLocalName(i));
        if (c0i == null) {
            c0i = C0I.A03;
        }
        return c0i.ordinal();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.DS0, java.lang.Object] */
    public static DS0 A07(C25854CnG cnG) {
        if (!cnG.A0G("auto")) {
            return cnG.A07();
        }
        ? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = AnonymousClass00R.A00;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.BNj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.BNj, java.lang.Object] */
    public static C27070DRv A09(String str) {
        C22746BNj bNj;
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            C27070DRv dRv = null;
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = BE6.A0p(indexOf, str).trim();
                if (trim2.length() > 0) {
                    if (trim2.equals("none")) {
                        dRv = C22747BNk.A02;
                    } else if (!trim2.equals("currentColor")) {
                        try {
                            dRv = A06(trim2);
                        } catch (E05 unused) {
                        }
                    } else {
                        dRv = C22748BNl.A00;
                    }
                }
                ? obj = new Object();
                obj.A01 = trim;
                bNj = obj;
            } else {
                String trim3 = str.substring(4).trim();
                ? obj2 = new Object();
                obj2.A01 = trim3;
                bNj = obj2;
            }
            bNj.A00 = dRv;
            return bNj;
        } else if (str.equals("none")) {
            return C22747BNk.A02;
        } else {
            if (str.equals("currentColor")) {
                return C22748BNl.A00;
            }
            try {
                return A06(str);
            } catch (E05 unused2) {
                return null;
            }
        }
    }

    public static String A0C(String str) {
        String substring;
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            substring = str.substring(4, str.length() - 1);
        } else {
            substring = str.substring(4);
        }
        return substring.trim();
    }

    public static ArrayList A0D(String str) {
        C25854CnG cnG = new C25854CnG(str);
        ArrayList arrayList = null;
        do {
            String A0B = cnG.A0B();
            if (A0B == null && (A0B = cnG.A0C(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = AnonymousClass000.A13();
            }
            arrayList.add(A0B);
            cnG.A0E();
        } while (!AnonymousClass000.A1T(cnG.A01, cnG.A00));
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.CYV, java.lang.Object] */
    public static void A0L(BNY bny, String str) {
        C25854CnG cnG = new C25854CnG(str);
        cnG.A0D();
        String A0C = cnG.A0C(' ', false);
        if ("defer".equals(A0C)) {
            cnG.A0D();
            A0C = cnG.A0C(' ', false);
        }
        C24304Bz1 bz1 = (C24304Bz1) CEL.A00.get(A0C);
        cnG.A0D();
        Integer num = null;
        if (!AnonymousClass000.A1T(cnG.A01, cnG.A00)) {
            String A0C2 = cnG.A0C(' ', false);
            if (A0C2.equals("meet")) {
                num = AnonymousClass00R.A00;
            } else if (A0C2.equals("slice")) {
                num = AnonymousClass00R.A01;
            } else {
                throw E05.A00(AnonymousClass001.A1H("Invalid preserveAspectRatio definition: ", str, AnonymousClass000.A10()));
            }
        }
        ? obj = new Object();
        obj.A00 = bz1;
        obj.A01 = num;
        bny.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.BNi, X.C5y] */
    public static void A0O(C26296Cx9 cx9, String str) {
        C24482C5y c5y;
        C22740BNd bNd = (C22740BNd) cx9.A01;
        int size = bNd.A01.size();
        if (size == 0) {
            c5y = null;
        } else {
            c5y = (C24482C5y) bNd.A01.get(size - 1);
        }
        if (c5y instanceof C22745BNi) {
            C22745BNi bNi = (C22745BNi) c5y;
            bNi.A00 = AnonymousClass001.A1H(bNi.A00, str, AnonymousClass000.A10());
            return;
        }
        E7L e7l = cx9.A01;
        ? obj = new Object();
        obj.A00 = str;
        e7l.BB4(obj);
    }

    public static Matrix A05(String str) {
        Matrix A0J = C108945cZ.A0J();
        String str2 = str;
        C25854CnG cnG = new C25854CnG(str2);
        cnG.A0D();
        while (!AnonymousClass000.A1T(cnG.A01, cnG.A00)) {
            int i = cnG.A01;
            String str3 = cnG.A03;
            int charAt = str3.charAt(i);
            while (true) {
                if (charAt >= 97) {
                    if (charAt <= 122) {
                        charAt = cnG.A06();
                    }
                } else if (charAt >= 65 && charAt <= 90) {
                    charAt = cnG.A06();
                }
            }
            int i2 = cnG.A01;
            while (C25854CnG.A02(charAt)) {
                charAt = cnG.A06();
            }
            if (charAt == 40) {
                cnG.A01++;
                String substring = str3.substring(i, i2);
                if (substring != null) {
                    char c = 65535;
                    switch (substring.hashCode()) {
                        case -1081239615:
                            if (substring.equals("matrix")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -925180581:
                            if (substring.equals("rotate")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 109250890:
                            if (substring.equals("scale")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 109493390:
                            if (substring.equals("skewX")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 109493391:
                            if (substring.equals("skewY")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1052832078:
                            if (substring.equals("translate")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            cnG.A0D();
                            float A032 = cnG.A03();
                            cnG.A0E();
                            float A033 = cnG.A03();
                            cnG.A0E();
                            float A034 = cnG.A03();
                            cnG.A0E();
                            float A035 = cnG.A03();
                            cnG.A0E();
                            float A036 = cnG.A03();
                            cnG.A0E();
                            float A037 = cnG.A03();
                            cnG.A0D();
                            if (!Float.isNaN(A037) && cnG.A0F(')')) {
                                Matrix A0J2 = C108945cZ.A0J();
                                A0J2.setValues(new float[]{A032, A034, A036, A033, A035, A037, 0.0f, 0.0f, 1.0f});
                                A0J.preConcat(A0J2);
                                break;
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                        case 1:
                            cnG.A0D();
                            float A038 = cnG.A03();
                            float A042 = cnG.A04();
                            float A043 = cnG.A04();
                            cnG.A0D();
                            if (Float.isNaN(A038) || !cnG.A0F(')')) {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            } else if (Float.isNaN(A042)) {
                                A0J.preRotate(A038);
                                break;
                            } else if (!Float.isNaN(A043)) {
                                A0J.preRotate(A038, A042, A043);
                                break;
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                        case 2:
                            cnG.A0D();
                            float A039 = cnG.A03();
                            float A044 = cnG.A04();
                            cnG.A0D();
                            if (!Float.isNaN(A039) && cnG.A0F(')')) {
                                if (!Float.isNaN(A044)) {
                                    A0J.preScale(A039, A044);
                                    break;
                                } else {
                                    A0J.preScale(A039, A039);
                                    break;
                                }
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                            break;
                        case 3:
                            cnG.A0D();
                            float A0310 = cnG.A03();
                            cnG.A0D();
                            if (!Float.isNaN(A0310) && cnG.A0F(')')) {
                                A0J.preSkew((float) Math.tan(Math.toRadians((double) A0310)), 0.0f);
                                break;
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                            break;
                        case 4:
                            cnG.A0D();
                            float A0311 = cnG.A03();
                            cnG.A0D();
                            if (!Float.isNaN(A0311) && cnG.A0F(')')) {
                                A0J.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) A0311)));
                                break;
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                            break;
                        case 5:
                            cnG.A0D();
                            float A0312 = cnG.A03();
                            float A045 = cnG.A04();
                            cnG.A0D();
                            if (!Float.isNaN(A0312) && cnG.A0F(')')) {
                                if (!Float.isNaN(A045)) {
                                    A0J.preTranslate(A0312, A045);
                                    break;
                                } else {
                                    A0J.preTranslate(A0312, 0.0f);
                                    break;
                                }
                            } else {
                                throw E05.A00(C17900vP.A0A("Invalid transform list: ", str2));
                            }
                            break;
                        default:
                            throw E05.A00(BEA.A0l("Invalid transform list fn: ", substring, AnonymousClass000.A10()));
                    }
                    if (AnonymousClass000.A1T(cnG.A01, cnG.A00)) {
                        return A0J;
                    }
                    cnG.A0E();
                }
            }
            throw E05.A00(AnonymousClass001.A1H("Bad transform function encountered in transform list: ", str2, AnonymousClass000.A10()));
        }
        return A0J;
    }

    public static DS0 A08(String str) {
        int length = str.length();
        if (length != 0) {
            Integer num = AnonymousClass00R.A00;
            int i = length - 1;
            char charAt = str.charAt(i);
            if (charAt == '%') {
                length = i;
                num = AnonymousClass00R.A18;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i2 = length - 2;
                if (Character.isLetter(str.charAt(i2))) {
                    length = i2;
                    try {
                        num = C24524C7t.A00(AnonymousClass8BS.A0n(str.substring(i2)));
                    } catch (IllegalArgumentException unused) {
                        throw E05.A00(AnonymousClass001.A1H("Invalid length unit specifier: ", str, AnonymousClass000.A10()));
                    }
                }
            }
            try {
                return new DS0(num, A01(str, length));
            } catch (NumberFormatException e) {
                throw new E05(AnonymousClass001.A1H("Invalid length value: ", str, AnonymousClass000.A10()), e);
            }
        } else {
            throw E05.A00("Invalid length value (empty string)");
        }
    }

    public static Float A0A(String str) {
        try {
            int length = str.length();
            if (length != 0) {
                float A012 = A01(str, length);
                if (A012 < 0.0f) {
                    A012 = 0.0f;
                } else if (A012 > 1.0f) {
                    A012 = 1.0f;
                }
                return Float.valueOf(A012);
            }
            throw E05.A00("Invalid float value (empty string)");
        } catch (E05 unused) {
            return null;
        }
    }

    public static Integer A0B(String str) {
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    return AnonymousClass00R.A0C;
                }
                return null;
            case -1178781136:
                if (str.equals("italic")) {
                    return AnonymousClass00R.A01;
                }
                return null;
            case -1039745817:
                if (str.equals("normal")) {
                    return AnonymousClass00R.A00;
                }
                return null;
            default:
                return null;
        }
    }

    public static ArrayList A0E(String str) {
        if (str.length() != 0) {
            ArrayList A0z = AnonymousClass8BT.A0z();
            C25854CnG cnG = new C25854CnG(str);
            cnG.A0D();
            while (!AnonymousClass000.A1T(cnG.A01, cnG.A00)) {
                float A032 = cnG.A03();
                if (!Float.isNaN(A032)) {
                    Integer A0A = cnG.A0A();
                    if (A0A == null) {
                        A0A = AnonymousClass00R.A00;
                    }
                    A0z.add(new DS0(A0A, A032));
                    cnG.A0E();
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Invalid length list value: ");
                    int i = cnG.A01;
                    int i2 = i;
                    while (!AnonymousClass000.A1T(i2, cnG.A00) && !C25854CnG.A02(cnG.A03.charAt(i2))) {
                        i2 = cnG.A01 + 1;
                        cnG.A01 = i2;
                    }
                    throw E05.A00(AnonymousClass000.A0y(cnG.A03.substring(i, cnG.A01), A10));
                }
            }
            return A0z;
        }
        throw E05.A00("Invalid length list (empty string)");
    }

    /* JADX WARNING: type inference failed for: r7v35, types: [X.C5W, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0501, code lost:
        r9.A00 = r2 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x051d, code lost:
        r9.A00 = r0 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0520, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x056b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        r9.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0113, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0115, code lost:
        r0 = r9.A00;
        r7 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0125, code lost:
        if (r11.equals(r0) == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0133, code lost:
        if (r11.equals(r0) == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0135, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(X.DS2 r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r5 = r11.length()
            if (r5 == 0) goto L_0x056c
            java.lang.String r0 = "inherit"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x056c
            X.C7u r0 = X.C7u.$redex_init_class
            java.util.Map r0 = X.C0I.A00
            java.lang.Object r0 = r0.get(r10)
            X.C0I r0 = (X.C0I) r0
            if (r0 != 0) goto L_0x001c
            X.C0I r0 = X.C0I.A03
        L_0x001c:
            int r4 = r0.ordinal()
            java.lang.String r3 = "none"
            java.lang.String r2 = "SVGParser"
            java.lang.String r0 = "currentColor"
            r1 = 124(0x7c, float:1.74E-43)
            switch(r4) {
                case 1: goto L_0x00a4;
                case 2: goto L_0x033e;
                case 4: goto L_0x0084;
                case 5: goto L_0x04e1;
                case 8: goto L_0x016c;
                case 14: goto L_0x039c;
                case 15: goto L_0x04c5;
                case 16: goto L_0x02ab;
                case 17: goto L_0x04b8;
                case 18: goto L_0x01d8;
                case 19: goto L_0x040d;
                case 20: goto L_0x0505;
                case 21: goto L_0x02cc;
                case 22: goto L_0x03fe;
                case 27: goto L_0x002c;
                case 28: goto L_0x03ed;
                case 29: goto L_0x03e0;
                case 30: goto L_0x03d3;
                case 31: goto L_0x03c6;
                case 35: goto L_0x0331;
                case 40: goto L_0x041b;
                case 42: goto L_0x0109;
                case 58: goto L_0x0317;
                case 59: goto L_0x0308;
                case 62: goto L_0x0358;
                case 63: goto L_0x034b;
                case 64: goto L_0x04ab;
                case 65: goto L_0x0427;
                case 66: goto L_0x04ec;
                case 67: goto L_0x027f;
                case 68: goto L_0x0253;
                case 69: goto L_0x04d2;
                case 70: goto L_0x049e;
                case 71: goto L_0x04f7;
                case 74: goto L_0x0138;
                case 75: goto L_0x0190;
                case 78: goto L_0x0062;
                case 88: goto L_0x02ee;
                case 89: goto L_0x02df;
                case 90: goto L_0x0370;
                default: goto L_0x002b;
            }
        L_0x002b:
            return
        L_0x002c:
            int r0 = r11.hashCode()
            switch(r0) {
                case -933002398: goto L_0x0057;
                case 3005871: goto L_0x004c;
                case 362741610: goto L_0x0041;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = 0
        L_0x0034:
            r9.A0Q = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x051d
        L_0x0041:
            java.lang.String r0 = "optimizeSpeed"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0034
        L_0x004c:
            java.lang.String r0 = "auto"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0034
        L_0x0057:
            java.lang.String r0 = "optimizeQuality"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0034
        L_0x0062:
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "non-scaling-stroke"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x007e
            r0 = 0
        L_0x0071:
            r9.A0V = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x051d
        L_0x007e:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0071
        L_0x0081:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0071
        L_0x0084:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0097
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x008e:
            r9.A0L = r0
            long r0 = r9.A00
            r7 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x051d
        L_0x0097:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00a2
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x008e
        L_0x00a2:
            r0 = 0
            goto L_0x008e
        L_0x00a4:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r11)
            r7 = 0
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "rect("
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 5
            java.lang.String r0 = r11.substring(r0)
            X.CnG r6 = new X.CnG
            r6.<init>(r0)
            r6.A0D()
            X.DS0 r5 = A07(r6)
            r6.A0E()
            X.DS0 r4 = A07(r6)
            r6.A0E()
            X.DS0 r3 = A07(r6)
            r6.A0E()
            X.DS0 r2 = A07(r6)
            r6.A0D()
            r0 = 41
            boolean r0 = r6.A0F(r0)
            if (r0 != 0) goto L_0x00fb
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x00fb
        L_0x00f0:
            r9.A01 = r7
            if (r7 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x051d
        L_0x00fb:
            X.C5W r7 = new X.C5W
            r7.<init>()
            r7.A03 = r5
            r7.A02 = r4
            r7.A00 = r3
            r7.A01 = r2
            goto L_0x00f0
        L_0x0109:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1217487446: goto L_0x012d;
                case -907680051: goto L_0x012a;
                case 3005871: goto L_0x011f;
                case 466743410: goto L_0x011c;
                default: goto L_0x0110;
            }
        L_0x0110:
            r0 = 0
        L_0x0111:
            r9.A0C = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 524288(0x80000, double:2.590327E-318)
            goto L_0x051d
        L_0x011c:
            java.lang.String r0 = "visible"
            goto L_0x0121
        L_0x011f:
            java.lang.String r0 = "auto"
        L_0x0121:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0111
        L_0x012a:
            java.lang.String r0 = "scroll"
            goto L_0x012f
        L_0x012d:
            java.lang.String r0 = "hidden"
        L_0x012f:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0111
        L_0x0138:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1074341483: goto L_0x0161;
                case 100571: goto L_0x0156;
                case 109757538: goto L_0x014b;
                default: goto L_0x013f;
            }
        L_0x013f:
            r0 = 0
        L_0x0140:
            r9.A0T = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 262144(0x40000, double:1.295163E-318)
            goto L_0x051d
        L_0x014b:
            java.lang.String r0 = "start"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0140
        L_0x0156:
            java.lang.String r0 = "end"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0140
        L_0x0161:
            java.lang.String r0 = "middle"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0140
        L_0x016c:
            java.lang.String r0 = "ltr"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = "rtl"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x018a
            r0 = 0
        L_0x017d:
            r9.A0M = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x051d
        L_0x018a:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x017d
        L_0x018d:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x017d
        L_0x0190:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1171789332: goto L_0x01cd;
                case -1026963764: goto L_0x01c2;
                case 3387192: goto L_0x01b9;
                case 93826908: goto L_0x01ae;
                case 529818312: goto L_0x01a3;
                default: goto L_0x0197;
            }
        L_0x0197:
            r0 = 0
        L_0x0198:
            r9.A0U = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 131072(0x20000, double:6.47582E-319)
            goto L_0x051d
        L_0x01a3:
            java.lang.String r0 = "overline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0198
        L_0x01ae:
            java.lang.String r0 = "blink"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x0198
        L_0x01b9:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0198
        L_0x01c2:
            java.lang.String r0 = "underline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0198
        L_0x01cd:
            java.lang.String r0 = "line-through"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0198
        L_0x01d8:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass8BW.A0l(r11, r0, r1)
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002b
            X.CnG r4 = new X.CnG
            r4.<init>(r11)
            r6 = 0
            r2 = r6
            r3 = r6
        L_0x01f3:
            r5 = 47
            r0 = 0
            java.lang.String r1 = r4.A0C(r5, r0)
            r4.A0D()
            if (r1 == 0) goto L_0x002b
            if (r6 == 0) goto L_0x0204
            if (r2 == 0) goto L_0x0204
            goto L_0x022c
        L_0x0204:
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01f3
            if (r6 != 0) goto L_0x0217
            java.util.Map r0 = X.AnonymousClass2VU.A00
            java.lang.Number r6 = X.C108945cZ.A1E(r1, r0)
            if (r6 == 0) goto L_0x0217
            goto L_0x01f3
        L_0x0217:
            if (r2 != 0) goto L_0x0220
            java.lang.Integer r2 = A0B(r1)
            if (r2 == 0) goto L_0x0220
            goto L_0x01f3
        L_0x0220:
            if (r3 != 0) goto L_0x022c
            java.lang.String r0 = "small-caps"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022c
            r3 = r1
            goto L_0x01f3
        L_0x022c:
            java.util.Map r0 = X.CEN.A00     // Catch:{ E05 -> 0x023b }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ E05 -> 0x023b }
            X.DS0 r3 = (X.DS0) r3     // Catch:{ E05 -> 0x023b }
            if (r3 != 0) goto L_0x023c
            X.DS0 r3 = A08(r1)     // Catch:{ E05 -> 0x023b }
            goto L_0x023c
        L_0x023b:
            r3 = 0
        L_0x023c:
            boolean r0 = r4.A0F(r5)
            if (r0 == 0) goto L_0x0524
            r4.A0D()
            r1 = 32
            r0 = 0
            java.lang.String r0 = r4.A0C(r1, r0)
            if (r0 == 0) goto L_0x0521
            A08(r0)     // Catch:{ E05 -> 0x002b }
            goto L_0x0521
        L_0x0253:
            java.lang.String r0 = "miter"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0267
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x025d:
            r9.A0S = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 128(0x80, double:6.32E-322)
            goto L_0x051d
        L_0x0267:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0272
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x025d
        L_0x0272:
            java.lang.String r0 = "bevel"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x027d
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x025d
        L_0x027d:
            r0 = 0
            goto L_0x025d
        L_0x027f:
            java.lang.String r0 = "butt"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0293
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x0289:
            r9.A0R = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 64
            goto L_0x051d
        L_0x0293:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029e
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0289
        L_0x029e:
            java.lang.String r0 = "square"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02a9
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0289
        L_0x02a9:
            r0 = 0
            goto L_0x0289
        L_0x02ab:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02bf
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x02b5:
            r9.A0N = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 2
            goto L_0x051d
        L_0x02bf:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02ca
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x02b5
        L_0x02ca:
            r0 = 0
            goto L_0x02b5
        L_0x02cc:
            java.util.Map r0 = X.AnonymousClass2VU.A00
            java.lang.Object r0 = r0.get(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0P = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 32768(0x8000, double:1.61895E-319)
            goto L_0x051d
        L_0x02df:
            java.lang.Float r0 = A0A(r11)
            r9.A0K = r0
            long r0 = r9.A00
            r7 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x051d
        L_0x02ee:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0301
            X.BNl r0 = X.C22748BNl.A00
            r9.A0A = r0
        L_0x02f8:
            long r0 = r9.A00
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x051d
        L_0x0301:
            X.BNk r0 = A06(r11)     // Catch:{ E05 -> 0x0562 }
            r9.A0A = r0     // Catch:{ E05 -> 0x0562 }
            goto L_0x02f8
        L_0x0308:
            java.lang.Float r0 = A0A(r11)
            r9.A0G = r0
            long r0 = r9.A00
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x051d
        L_0x0317:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x032a
            X.BNl r0 = X.C22748BNl.A00
            r9.A07 = r0
        L_0x0321:
            long r0 = r9.A00
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x051d
        L_0x032a:
            X.BNk r0 = A06(r11)     // Catch:{ E05 -> 0x0562 }
            r9.A07 = r0     // Catch:{ E05 -> 0x0562 }
            goto L_0x0321
        L_0x0331:
            java.lang.String r0 = A0C(r11)
            r9.A0a = r0
            long r0 = r9.A00
            r7 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x051d
        L_0x033e:
            java.lang.String r0 = A0C(r11)
            r9.A0W = r0
            long r0 = r9.A00
            r7 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x051d
        L_0x034b:
            java.lang.Float r0 = A0A(r11)
            r9.A0H = r0
            long r0 = r9.A00
            r7 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x051d
        L_0x0358:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0369
            X.BNl r0 = X.C22748BNl.A00
            r9.A08 = r0
        L_0x0362:
            long r0 = r9.A00
            r7 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x051d
        L_0x0369:
            X.BNk r0 = A06(r11)     // Catch:{ E05 -> 0x0562 }
            r9.A08 = r0     // Catch:{ E05 -> 0x0562 }
            goto L_0x0362
        L_0x0370:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x002b
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass8BW.A0l(r11, r0, r1)
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "visible"
            boolean r0 = r11.equals(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0D = r0
            long r0 = r9.A00
            r7 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x051d
        L_0x039c:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x002b
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass8BW.A0l(r11, r0, r1)
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r11.equals(r3)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            r9.A0B = r0
            long r0 = r9.A00
            r7 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x051d
        L_0x03c6:
            java.lang.String r0 = A0C(r11)
            r9.A0X = r0
            long r0 = r9.A00
            r7 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x051d
        L_0x03d3:
            java.lang.String r0 = A0C(r11)
            r9.A0Y = r0
            long r0 = r9.A00
            r7 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x051d
        L_0x03e0:
            java.lang.String r0 = A0C(r11)
            r9.A0Z = r0
            long r0 = r9.A00
            r7 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x051d
        L_0x03ed:
            java.lang.String r0 = A0C(r11)
            r9.A0Z = r0
            r9.A0Y = r0
            r9.A0X = r0
            long r0 = r9.A00
            r7 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x051d
        L_0x03fe:
            java.lang.Integer r0 = A0B(r11)
            r9.A0O = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 65536(0x10000, double:3.2379E-319)
            goto L_0x051d
        L_0x040d:
            java.util.ArrayList r0 = A0D(r11)
            r9.A0b = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 8192(0x2000, double:4.0474E-320)
            goto L_0x051d
        L_0x041b:
            java.lang.Float r0 = A0A(r11)
            r9.A0F = r0
            long r0 = r9.A00
            r7 = 2048(0x800, double:1.0118E-320)
            goto L_0x051d
        L_0x0427:
            boolean r0 = r3.equals(r11)
            r7 = 512(0x200, double:2.53E-321)
            if (r0 == 0) goto L_0x0436
            r0 = 0
            r9.A0c = r0
        L_0x0432:
            long r0 = r9.A00
            goto L_0x051d
        L_0x0436:
            X.CnG r6 = new X.CnG
            r6.<init>(r11)
            r6.A0D()
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0499
            X.DS0 r3 = r6.A07()
            if (r3 == 0) goto L_0x0499
            float r2 = r3.A00
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.C108975cc.A19(r1)
            if (r1 != 0) goto L_0x0499
            float r5 = r3.A00
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r4.add(r3)
        L_0x0463:
            int r2 = r6.A01
            int r1 = r6.A00
            boolean r1 = X.AnonymousClass000.A1T(r2, r1)
            if (r1 != 0) goto L_0x0488
            r6.A0E()
            X.DS0 r3 = r6.A07()
            if (r3 == 0) goto L_0x0499
            float r2 = r3.A00
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.C108975cc.A19(r1)
            if (r1 != 0) goto L_0x0499
            r4.add(r3)
            float r1 = r3.A00
            float r5 = r5 + r1
            goto L_0x0463
        L_0x0488:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0499
            int r0 = r4.size()
            X.DS0[] r0 = new X.DS0[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.DS0[] r0 = (X.DS0[]) r0
        L_0x0499:
            r9.A0c = r0
            if (r0 == 0) goto L_0x002b
            goto L_0x0432
        L_0x049e:
            java.lang.Float r0 = A0A(r11)
            r9.A0J = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 16
            goto L_0x051d
        L_0x04ab:
            X.DRv r0 = A09(r11)
            r9.A09 = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 8
            goto L_0x051d
        L_0x04b8:
            java.lang.Float r0 = A0A(r11)
            r9.A0E = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 4
            goto L_0x051d
        L_0x04c5:
            X.DRv r0 = A09(r11)
            r9.A06 = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 1
            goto L_0x051d
        L_0x04d2:
            float r0 = A01(r11, r5)     // Catch:{ E05 -> 0x002b }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ E05 -> 0x002b }
            r9.A0I = r0     // Catch:{ E05 -> 0x002b }
            long r2 = r9.A00     // Catch:{ E05 -> 0x002b }
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0501
        L_0x04e1:
            X.BNk r0 = A06(r11)     // Catch:{ E05 -> 0x002b }
            r9.A02 = r0     // Catch:{ E05 -> 0x002b }
            long r2 = r9.A00     // Catch:{ E05 -> 0x002b }
            r0 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0501
        L_0x04ec:
            X.DS0 r0 = A08(r11)     // Catch:{ E05 -> 0x002b }
            r9.A04 = r0     // Catch:{ E05 -> 0x002b }
            long r2 = r9.A00     // Catch:{ E05 -> 0x002b }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0501
        L_0x04f7:
            X.DS0 r0 = A08(r11)     // Catch:{ E05 -> 0x002b }
            r9.A05 = r0     // Catch:{ E05 -> 0x002b }
            long r2 = r9.A00     // Catch:{ E05 -> 0x002b }
            r0 = 32
        L_0x0501:
            long r2 = r2 | r0
            r9.A00 = r2     // Catch:{ E05 -> 0x002b }
            goto L_0x056b
        L_0x0505:
            java.util.Map r0 = X.CEN.A00     // Catch:{ E05 -> 0x0514 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ E05 -> 0x0514 }
            X.DS0 r0 = (X.DS0) r0     // Catch:{ E05 -> 0x0514 }
            if (r0 != 0) goto L_0x0515
            X.DS0 r0 = A08(r11)     // Catch:{ E05 -> 0x0514 }
            goto L_0x0515
        L_0x0514:
            r0 = 0
        L_0x0515:
            r9.A03 = r0
            if (r0 == 0) goto L_0x002b
            long r0 = r9.A00
            r7 = 16384(0x4000, double:8.0948E-320)
        L_0x051d:
            long r0 = r0 | r7
            r9.A00 = r0
            return
        L_0x0521:
            r4.A0D()
        L_0x0524:
            int r1 = r4.A01
            int r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x0555
            r0 = 0
        L_0x052f:
            java.util.ArrayList r0 = A0D(r0)
            r9.A0b = r0
            r9.A03 = r3
            if (r6 != 0) goto L_0x0550
            r0 = 400(0x190, float:5.6E-43)
        L_0x053b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0P = r0
            if (r2 != 0) goto L_0x0545
            java.lang.Integer r2 = X.AnonymousClass00R.A00
        L_0x0545:
            r9.A0O = r2
            long r2 = r9.A00
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r2 = r2 | r0
            r9.A00 = r2
            return
        L_0x0550:
            int r0 = r6.intValue()
            goto L_0x053b
        L_0x0555:
            int r1 = r4.A01
            int r0 = r4.A00
            r4.A01 = r0
            java.lang.String r0 = r4.A03
            java.lang.String r0 = r0.substring(r1)
            goto L_0x052f
        L_0x0562:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r2, r0)
            return
        L_0x056b:
            return
        L_0x056c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26296Cx9.A0H(X.DS2, java.lang.String, java.lang.String):void");
    }
}
