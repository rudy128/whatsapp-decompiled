package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: X.Co6  reason: case insensitive filesystem */
public abstract class C25895Co6 {
    public static void A01(String str, StringBuffer stringBuffer, AnonymousClass1Bz r15) {
        StringBuilder A11;
        StringBuilder A112;
        byte[] bArr;
        String str2;
        StringBuilder A0H;
        String A02;
        String obj;
        String A0K;
        byte[] bArr2;
        StringBuilder A113;
        int i;
        String str3;
        String str4;
        AnonymousClass1Bz CP9;
        String str5;
        String str6;
        AnonymousClass1Bz CP92;
        String str7 = AnonymousClass1Bo.A00;
        if (r15 instanceof C28339Dxl) {
            Enumeration A0L = ((C28339Dxl) r15).A0L();
            String A0A = C17900vP.A0A(str, "    ");
            stringBuffer.append(str);
            if (r15 instanceof C28354Dy0) {
                str6 = "BER Sequence";
            } else if (r15 instanceof C28357Dy3) {
                str6 = "DER Sequence";
            } else {
                str6 = "Sequence";
            }
            stringBuffer.append(str6);
            while (true) {
                stringBuffer.append(str7);
                while (A0L.hasMoreElements()) {
                    Object nextElement = A0L.nextElement();
                    if (nextElement == null || nextElement.equals(C28273Dwh.A00)) {
                        stringBuffer.append(A0A);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement instanceof AnonymousClass1Bz) {
                            CP92 = (AnonymousClass1Bz) nextElement;
                        } else {
                            CP92 = ((AnonymousClass1Bx) nextElement).CP9();
                        }
                        A01(A0A, stringBuffer, CP92);
                    }
                }
                return;
            }
        } else if (r15 instanceof C28341Dxn) {
            String A0A2 = C17900vP.A0A(str, "    ");
            stringBuffer.append(str);
            if (r15 instanceof C28361Dy7) {
                str5 = "BER Tagged [";
            } else {
                str5 = "Tagged [";
            }
            stringBuffer.append(str5);
            C28341Dxn dxn = (C28341Dxn) r15;
            stringBuffer.append(Integer.toString(dxn.A00));
            stringBuffer.append(']');
            if (!dxn.A02) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str7);
            A01(A0A2, stringBuffer, C28341Dxn.A02(dxn));
        } else if (r15 instanceof C28340Dxm) {
            C27101DUf dUf = new C27101DUf((C28340Dxm) r15);
            String A0A3 = C17900vP.A0A(str, "    ");
            stringBuffer.append(str);
            if (r15 instanceof C28358Dy4) {
                str4 = "BER Set";
            } else if (r15 instanceof C28360Dy6) {
                str4 = "DER Set";
            } else {
                str4 = "Set";
            }
            stringBuffer.append(str4);
            while (true) {
                stringBuffer.append(str7);
                while (dUf.hasMoreElements()) {
                    Object nextElement2 = dUf.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(A0A3);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement2 instanceof AnonymousClass1Bz) {
                            CP9 = (AnonymousClass1Bz) nextElement2;
                        } else {
                            CP9 = ((AnonymousClass1Bx) nextElement2).CP9();
                        }
                        A01(A0A3, stringBuffer, CP9);
                    }
                }
                return;
            }
        } else {
            if (r15 instanceof C28342Dxo) {
                C28342Dxo dxo = (C28342Dxo) r15;
                boolean z = r15 instanceof C28328Dxa;
                A113 = AnonymousClass000.A10();
                if (z) {
                    A113.append(str);
                    str3 = "BER Constructed Octet String[";
                } else {
                    A113.append(str);
                    str3 = "DER Octet String[";
                }
                A113.append(str3);
                i = dxo.A00.length;
            } else {
                if (r15 instanceof AnonymousClass1C0) {
                    A0H = AnonymousClass000.A11(str);
                    A0H.append("ObjectIdentifier(");
                    A02 = ((AnonymousClass1C0) r15).A01;
                } else {
                    if (r15 instanceof C28336Dxi) {
                        A0H = AnonymousClass000.A11(str);
                        A0H.append("Boolean(");
                        A0H.append(AnonymousClass000.A1O(((C28336Dxi) r15).A00));
                    } else {
                        if (r15 instanceof C28337Dxj) {
                            A112 = AnonymousClass000.A11(str);
                            A112.append("Integer(");
                            bArr = ((C28337Dxj) r15).A00;
                        } else if (r15 instanceof C28269Dwd) {
                            C28367DyD dyD = (C28367DyD) r15;
                            A113 = AnonymousClass000.A11(str);
                            A113.append("DER Bit String[");
                            BE8.A1D(A113, dyD.A0K().length);
                            i = dyD.A00;
                        } else {
                            if (r15 instanceof C28353Dxz) {
                                A11 = AnonymousClass000.A11(str);
                                A11.append("IA5String(");
                                bArr2 = ((C28353Dxz) r15).A00;
                            } else {
                                if (r15 instanceof C28351Dxx) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("UTF8String(");
                                    A0K = ((C28351Dxx) r15).BZl();
                                } else if (r15 instanceof C28350Dxw) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("PrintableString(");
                                    bArr2 = ((C28350Dxw) r15).A00;
                                } else if (r15 instanceof C28349Dxv) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("VisibleString(");
                                    bArr2 = ((C28349Dxv) r15).A00;
                                } else if (r15 instanceof C28346Dxs) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("BMPString(");
                                    A0K = new String(((C28346Dxs) r15).A00);
                                } else if (r15 instanceof C28343Dxp) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("T61String(");
                                    bArr2 = ((C28343Dxp) r15).A00;
                                } else if (r15 instanceof C28344Dxq) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("GraphicString(");
                                    bArr2 = ((C28344Dxq) r15).A00;
                                } else if (r15 instanceof C28345Dxr) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("VideotexString(");
                                    bArr2 = ((C28345Dxr) r15).A00;
                                } else if (r15 instanceof C28332Dxe) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("UTCTime(");
                                    A0K = ((C28332Dxe) r15).A0K();
                                } else if (r15 instanceof C28338Dxk) {
                                    A11 = AnonymousClass000.A11(str);
                                    A11.append("GeneralizedTime(");
                                    A0K = ((C28338Dxk) r15).A0K();
                                } else {
                                    if (r15 instanceof C28266Dwa) {
                                        str2 = "BER";
                                    } else if (r15 instanceof C28267Dwb) {
                                        str2 = "";
                                    } else if (r15 instanceof C28335Dxh) {
                                        A112 = AnonymousClass000.A11(str);
                                        A112.append("DER Enumerated(");
                                        bArr = ((C28335Dxh) r15).A00;
                                    } else if (r15 instanceof C28333Dxf) {
                                        C28333Dxf dxf = (C28333Dxf) r15;
                                        stringBuffer.append(AnonymousClass001.A1H("External ", str7, AnonymousClass000.A11(str)));
                                        String A0A4 = C17900vP.A0A(str, "    ");
                                        AnonymousClass1C0 r2 = dxf.A02;
                                        if (r2 != null) {
                                            StringBuilder A114 = AnonymousClass000.A11(A0A4);
                                            A114.append("Direct Reference: ");
                                            stringBuffer.append(AnonymousClass001.A1H(r2.A01, str7, A114));
                                        }
                                        C28337Dxj dxj = dxf.A01;
                                        if (dxj != null) {
                                            StringBuilder A115 = AnonymousClass000.A11(A0A4);
                                            A115.append("Indirect Reference: ");
                                            stringBuffer.append(AnonymousClass001.A1H(dxj.toString(), str7, A115));
                                        }
                                        AnonymousClass1Bz r0 = dxf.A03;
                                        if (r0 != null) {
                                            A01(A0A4, stringBuffer, r0);
                                        }
                                        StringBuilder A116 = AnonymousClass000.A11(A0A4);
                                        A116.append("Encoding: ");
                                        A116.append(dxf.A00);
                                        stringBuffer.append(AnonymousClass000.A0y(str7, A116));
                                        A01(A0A4, stringBuffer, dxf.A04);
                                        return;
                                    } else {
                                        A11 = AnonymousClass000.A11(str);
                                        AnonymousClass8BS.A1D(r15, A11);
                                        obj = AnonymousClass000.A0y(str7, A11);
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    C28334Dxg A022 = C28334Dxg.A02(r15);
                                    StringBuffer A0s = BE6.A0s();
                                    if (A022.A01) {
                                        try {
                                            byte[] A0B = A022.A0B();
                                            int i2 = 1;
                                            if ((A0B[0] & 31) == 31) {
                                                i2 = 2;
                                                byte b = A0B[1] & 255;
                                                if ((b & Byte.MAX_VALUE) == 0) {
                                                    throw C17880vN.A0f("corrupted stream - invalid high tag number found");
                                                }
                                                while ((b & 128) != 0) {
                                                    b = A0B[i2] & 255;
                                                    i2++;
                                                }
                                            }
                                            int length = (A0B.length - i2) + 1;
                                            byte[] bArr3 = new byte[length];
                                            System.arraycopy(A0B, i2, bArr3, 1, length - 1);
                                            bArr3[0] = 16;
                                            if ((A0B[0] & 32) != 0) {
                                                bArr3[0] = 48;
                                            }
                                            C28339Dxl A05 = C28339Dxl.A05(AnonymousClass1Bz.A01(bArr3));
                                            StringBuilder A0H2 = C17900vP.A0H(str, str2, " ApplicationSpecific[");
                                            A0H2.append(A022.A00);
                                            A0s.append(AnonymousClass001.A1H("]", str7, A0H2));
                                            Enumeration A0L2 = A05.A0L();
                                            while (A0L2.hasMoreElements()) {
                                                A01(C17900vP.A0A(str, "    "), A0s, (AnonymousClass1Bz) A0L2.nextElement());
                                            }
                                        } catch (IOException e) {
                                            A0s.append(e);
                                        }
                                        obj = A0s.toString();
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    A0H = C17900vP.A0H(str, str2, " ApplicationSpecific[");
                                    A0H.append(A022.A00);
                                    A0H.append("] (");
                                    byte[] A023 = AnonymousClass1C2.A02(A022.A02);
                                    A02 = AnonymousClass1Bo.A02(C20073A5z.A02(A023, 0, A023.length));
                                }
                                A11.append(A0K);
                                A11.append(") ");
                                obj = AnonymousClass000.A0y(str7, A11);
                                stringBuffer.append(obj);
                                return;
                            }
                            A0K = AnonymousClass1Bo.A02(bArr2);
                            A11.append(A0K);
                            A11.append(") ");
                            obj = AnonymousClass000.A0y(str7, A11);
                            stringBuffer.append(obj);
                            return;
                        }
                        A0H.append(new BigInteger(bArr));
                    }
                    A11.append(")");
                    obj = AnonymousClass000.A0y(str7, A11);
                    stringBuffer.append(obj);
                    return;
                }
                A0H.append(A02);
                A11.append(")");
                obj = AnonymousClass000.A0y(str7, A11);
                stringBuffer.append(obj);
                return;
            }
            A113.append(i);
            stringBuffer.append(AnonymousClass000.A0y("] ", A113));
            stringBuffer.append(str7);
        }
    }

    public static void A02(StringBuffer stringBuffer, C24178Bwo bwo, AnonymousClass1C0 r4) {
        stringBuffer.append(r4.A01);
        stringBuffer.append(" value = ");
        stringBuffer.append(A00(bwo.A05()));
    }

    public static String A00(Object obj) {
        AnonymousClass1Bz CP9;
        StringBuffer A0s = BE6.A0s();
        if (obj instanceof AnonymousClass1Bz) {
            CP9 = (AnonymousClass1Bz) obj;
        } else if (!(obj instanceof AnonymousClass1Bx)) {
            return BEA.A0j(obj, "unknown object type ", AnonymousClass000.A10());
        } else {
            CP9 = ((AnonymousClass1Bx) obj).CP9();
        }
        A01("", A0s, CP9);
        return A0s.toString();
    }
}
