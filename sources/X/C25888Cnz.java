package X;

import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.Cnz  reason: case insensitive filesystem */
public abstract class C25888Cnz {
    public static String A02(CharSequence... charSequenceArr) {
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < r8; i3++) {
            int length = charSequenceArr[i3].length();
            i += length;
            if (i2 != -2 && length > 0) {
                int i4 = i2;
                i2 = -2;
                if (i4 == -1) {
                    i2 = i3;
                }
            }
        }
        if (i == 0) {
            return "";
        }
        if (i2 > 0) {
            return charSequenceArr[i2].toString();
        }
        StringBuilder A0t = BE6.A0t(i);
        for (CharSequence append : charSequenceArr) {
            A0t.append(append);
        }
        return A0t.toString();
    }

    public static String A01(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringWriter stringWriter = new StringWriter(length);
        StringBuilder A0t = BE6.A0t(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z2) {
                A0t.append(charAt);
                if (A0t.length() == 4) {
                    try {
                        stringWriter.write((char) Integer.parseInt(A0t.toString(), 16));
                        A0t.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        throw new C27232DaC(AnonymousClass001.A1E(A0t, "Unable to parse unicode value: ", AnonymousClass000.A10()), e);
                    }
                }
            } else if (z) {
                int i2 = 34;
                if (charAt != '\"') {
                    i2 = 39;
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            i2 = 8;
                            if (charAt != 'b') {
                                i2 = 12;
                                if (charAt != 'f') {
                                    i2 = 10;
                                    if (charAt != 'n') {
                                        i2 = 13;
                                        if (charAt != 'r') {
                                            i2 = 9;
                                            if (charAt != 't') {
                                                if (charAt != 'u') {
                                                    stringWriter.write(charAt);
                                                } else {
                                                    z = false;
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            stringWriter.write(92);
                        }
                        z = false;
                    }
                }
                stringWriter.write(i2);
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                stringWriter.write(charAt);
            }
        }
        if (z) {
            stringWriter.write(92);
        }
        return stringWriter.toString();
    }

    public static String A00(Iterable iterable, String str, String str2) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        while (true) {
            A10.append(str2);
            A10.append(it.next());
            A10.append(str2);
            if (!it.hasNext()) {
                return A10.toString();
            }
            A10.append(str);
        }
    }
}
