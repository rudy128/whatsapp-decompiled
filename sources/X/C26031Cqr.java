package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.Cqr  reason: case insensitive filesystem */
public abstract class C26031Cqr {
    public volatile int A00 = -1;

    public C26031Cqr A02() {
        return (C26031Cqr) super.clone();
    }

    public void A03(C26133Csw csw) {
        C23322BfA bfA = (C23322BfA) this;
        long j = bfA.A01;
        if (j != 0) {
            C26133Csw.A01(csw, 8);
            csw.A04(j);
        }
        C23321Bf9[] bf9Arr = bfA.A0B;
        int i = 0;
        if (bf9Arr != null && bf9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C23321Bf9[] bf9Arr2 = bfA.A0B;
                if (i2 >= bf9Arr2.length) {
                    break;
                }
                C23321Bf9 bf9 = bf9Arr2[i2];
                if (bf9 != null) {
                    C26133Csw.A01(csw, 26);
                    if (bf9.A00 < 0) {
                        bf9.A00 = bf9.A04();
                    }
                    C26133Csw.A02(csw, bf9.A00);
                    bf9.A03(csw);
                }
                i2++;
            }
        }
        byte[] bArr = bfA.A07;
        byte[] bArr2 = CHC.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            csw.A03(4, bArr);
        }
        if (!Arrays.equals(bfA.A08, bArr2)) {
            csw.A03(6, bfA.A08);
        }
        C23311Bez bez = bfA.A04;
        if (bez != null) {
            csw.A05(bez, 9);
        }
        int i3 = bfA.A00;
        if (i3 != 0) {
            C26133Csw.A01(csw, 88);
            C26133Csw.A02(csw, i3);
        }
        long j2 = bfA.A03;
        if (j2 != 180000) {
            C26133Csw.A01(csw, 120);
            csw.A04(BE9.A0L(j2));
        }
        long j3 = bfA.A02;
        if (j3 != 0) {
            C26133Csw.A02(csw, 136);
            csw.A04(j3);
        }
        byte[] bArr3 = bfA.A09;
        if (!Arrays.equals(bArr3, bArr2)) {
            csw.A03(18, bArr3);
        }
        int[] iArr = bfA.A0A;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = bfA.A0A;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                C26133Csw.A02(csw, 160);
                if (i4 >= 0) {
                    C26133Csw.A02(csw, i4);
                } else {
                    csw.A04((long) i4);
                }
                i++;
            }
        }
        C23310Bey bey = bfA.A05;
        if (bey != null) {
            csw.A05(bey, 23);
        }
        if (bfA.A06) {
            C26133Csw.A02(csw, 200);
            ByteBuffer byteBuffer = csw.A02;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put((byte) 1);
                return;
            }
            throw new C24196Bx6(byteBuffer.position(), byteBuffer.limit());
        }
    }

    public /* synthetic */ Object clone() {
        throw AnonymousClass04E.createAndThrow();
    }

    public static void A01(Object obj, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        String str3;
        if (obj != null) {
            if (obj instanceof C26031Cqr) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(A00(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            A01(obj2, name, stringBuffer, stringBuffer2);
                        } else if (obj2 != null) {
                            int length2 = Array.getLength(obj2);
                            for (int i = 0; i < length2; i++) {
                                A01(Array.get(obj2, i), name, stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (AnonymousClass000.A1Y(C108995ce.A0V(cls, obj, BEB.A0e("has", substring)))) {
                                A01(C108995ce.A0V(cls, obj, BEB.A0e("get", substring)), substring, stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    str2 = ">\n";
                } else {
                    return;
                }
            } else {
                String A002 = A00(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(A002);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str4 = (String) obj;
                    if (!str4.startsWith("http") && str4.length() > 200) {
                        str4 = String.valueOf(str4.substring(0, 200)).concat("[...]");
                    }
                    int length3 = str4.length();
                    StringBuilder A0t = BE6.A0t(length3);
                    for (int i2 = 0; i2 < length3; i2++) {
                        char charAt = str4.charAt(i2);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            Object[] objArr = new Object[1];
                            C17880vN.A1T(objArr, charAt, 0);
                            A0t.append(String.format("\\u%04x", objArr));
                        } else {
                            A0t.append(charAt);
                        }
                    }
                    String obj3 = A0t.toString();
                    str3 = "\"";
                    stringBuffer2.append(str3);
                    stringBuffer2.append(obj3);
                } else {
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        if (bArr == null) {
                            str3 = "\"\"";
                        } else {
                            stringBuffer2.append('\"');
                            for (byte b : bArr) {
                                byte b2 = b & 255;
                                if (b2 == 92 || b2 == 34) {
                                    stringBuffer2.append('\\');
                                } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                                    Object[] objArr2 = new Object[1];
                                    C17880vN.A1T(objArr2, b2, 0);
                                    stringBuffer2.append(String.format("\\%03o", objArr2));
                                }
                                stringBuffer2.append((char) b2);
                            }
                            stringBuffer2.append('\"');
                        }
                    } else {
                        stringBuffer2.append(obj);
                    }
                    str2 = "\n";
                }
                stringBuffer2.append(str3);
                str2 = "\n";
            }
            stringBuffer2.append(str2);
        }
    }

    public String toString() {
        StringBuffer A0s = BE6.A0s();
        try {
            A01(this, (String) null, BE6.A0s(), A0s);
            return A0s.toString();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return BEB.A0e("Error printing proto: ", e.getMessage());
        }
    }

    public static String A00(String str) {
        StringBuffer A0s = BE6.A0s();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                charAt = Character.toLowerCase(charAt);
            } else if (Character.isUpperCase(charAt)) {
                A0s.append('_');
                A0s.append(Character.toLowerCase(charAt));
            }
            A0s.append(charAt);
        }
        return A0s.toString();
    }
}
