package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.DxQ  reason: case insensitive filesystem */
public class C28318DxQ extends AnonymousClass1By {
    public static final Hashtable A06;
    public static final Hashtable A07;
    public static final Hashtable A08;
    public static final Hashtable A09;
    public static final Hashtable A0A;
    public static final Hashtable A0B;
    public static final AnonymousClass1C0 A0C;
    public static final AnonymousClass1C0 A0D;
    public static final AnonymousClass1C0 A0E;
    public static final AnonymousClass1C0 A0F;
    public static final AnonymousClass1C0 A0G;
    public static final AnonymousClass1C0 A0H;
    public static final AnonymousClass1C0 A0I;
    public static final AnonymousClass1C0 A0J = BE6.A19("2.5.4.54");
    public static final AnonymousClass1C0 A0K;
    public static final AnonymousClass1C0 A0L;
    public static final AnonymousClass1C0 A0M;
    public static final AnonymousClass1C0 A0N;
    public static final AnonymousClass1C0 A0O;
    public static final AnonymousClass1C0 A0P;
    public static final AnonymousClass1C0 A0Q;
    public static final AnonymousClass1C0 A0R;
    public static final AnonymousClass1C0 A0S;
    public static final AnonymousClass1C0 A0T;
    public static final AnonymousClass1C0 A0U;
    public static final AnonymousClass1C0 A0V;
    public static final AnonymousClass1C0 A0W;
    public static final AnonymousClass1C0 A0X;
    public static final AnonymousClass1C0 A0Y;
    public static final AnonymousClass1C0 A0Z;
    public static final AnonymousClass1C0 A0a;
    public static final AnonymousClass1C0 A0b;
    public static final AnonymousClass1C0 A0c;
    public static final AnonymousClass1C0 A0d;
    public static final AnonymousClass1C0 A0e;
    public static final AnonymousClass1C0 A0f;
    public static final AnonymousClass1C0 A0g;
    public static final AnonymousClass1C0 A0h;
    public static final AnonymousClass1C0 A0i;
    public static final AnonymousClass1C0 A0j;
    public static final AnonymousClass1C0 A0k;
    public static final Boolean A0l = new Boolean(false);
    public static final Boolean A0m = new Boolean(true);
    public Vector A00 = new Vector();
    public Vector A01 = new Vector();
    public Vector A02 = new Vector();
    public int A03;
    public C28339Dxl A04;
    public boolean A05;

    public int hashCode() {
        if (!this.A05) {
            this.A05 = true;
            int i = 0;
            while (true) {
                Vector vector = this.A01;
                if (i == vector.size()) {
                    break;
                }
                String A022 = A02(A01((String) this.A02.elementAt(i)));
                int hashCode = this.A03 ^ vector.elementAt(i).hashCode();
                this.A03 = hashCode;
                this.A03 = A022.hashCode() ^ hashCode;
                i++;
            }
        }
        return this.A03;
    }

    static {
        AnonymousClass1C0 A19 = BE6.A19("2.5.4.6");
        A0D = A19;
        AnonymousClass1C0 A192 = BE6.A19("2.5.4.10");
        A0U = A192;
        AnonymousClass1C0 A193 = BE6.A19("2.5.4.11");
        A0V = A193;
        AnonymousClass1C0 A194 = BE6.A19("2.5.4.12");
        A0f = A194;
        AnonymousClass1C0 A195 = BE6.A19("2.5.4.3");
        A0E = A195;
        AnonymousClass1C0 A196 = BE6.A19("2.5.4.5");
        A0b = A196;
        AnonymousClass1C0 A197 = BE6.A19("2.5.4.9");
        A0d = A197;
        A0a = A196;
        AnonymousClass1C0 A198 = BE6.A19("2.5.4.7");
        A0R = A198;
        AnonymousClass1C0 A199 = BE6.A19("2.5.4.8");
        A0c = A199;
        AnonymousClass1C0 A1910 = BE6.A19("2.5.4.4");
        A0e = A1910;
        AnonymousClass1C0 A1911 = BE6.A19("2.5.4.42");
        A0P = A1911;
        AnonymousClass1C0 A1912 = BE6.A19("2.5.4.43");
        A0Q = A1912;
        AnonymousClass1C0 A1913 = BE6.A19("2.5.4.44");
        A0O = A1913;
        AnonymousClass1C0 A1914 = BE6.A19("2.5.4.45");
        A0i = A1914;
        AnonymousClass1C0 A1915 = BE6.A19("2.5.4.15");
        A0C = A1915;
        AnonymousClass1C0 A1916 = BE6.A19("2.5.4.17");
        A0Y = A1916;
        AnonymousClass1C0 A1917 = BE6.A19("2.5.4.46");
        A0K = A1917;
        AnonymousClass1C0 A1918 = BE6.A19("2.5.4.65");
        A0Z = A1918;
        AnonymousClass1C0 A1919 = BE6.A19("1.3.6.1.5.5.7.9.1");
        A0H = A1919;
        AnonymousClass1C0 A1920 = BE6.A19("1.3.6.1.5.5.7.9.2");
        A0W = A1920;
        AnonymousClass1C0 A1921 = BE6.A19("1.3.6.1.5.5.7.9.3");
        A0N = A1921;
        AnonymousClass1C0 A1922 = BE6.A19("1.3.6.1.5.5.7.9.4");
        A0F = A1922;
        AnonymousClass1C0 A1923 = BE6.A19("1.3.6.1.5.5.7.9.5");
        A0G = A1923;
        AnonymousClass1C0 A1924 = BE6.A19("1.3.36.8.3.14");
        A0T = A1924;
        AnonymousClass1C0 A1925 = BE6.A19("2.5.4.16");
        A0X = A1925;
        AnonymousClass1C0 r29 = EBH.A09;
        A0g = r29;
        AnonymousClass1C0 r28 = EBH.A07;
        A0S = r28;
        AnonymousClass1C0 r4 = AnonymousClass1Bw.A1u;
        A0M = r4;
        AnonymousClass1C0 r27 = AnonymousClass1Bw.A24;
        A0k = r27;
        AnonymousClass1C0 r26 = AnonymousClass1Bw.A23;
        A0j = r26;
        A0L = r4;
        AnonymousClass1C0 A1926 = BE6.A19("0.9.2342.19200300.100.1.25");
        A0I = A1926;
        AnonymousClass1C0 A1927 = BE6.A19("0.9.2342.19200300.100.1.1");
        A0h = A1927;
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        A0A = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        A09 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        A06 = hashtable4;
        A08 = hashtable;
        A0B = hashtable4;
        hashtable.put(A19, "C");
        hashtable.put(A192, "O");
        hashtable.put(A194, "T");
        hashtable.put(A193, "OU");
        hashtable.put(A195, "CN");
        hashtable.put(A198, "L");
        hashtable.put(A199, "ST");
        hashtable.put(A196, "SERIALNUMBER");
        hashtable.put(r4, "E");
        hashtable.put(A1926, "DC");
        hashtable.put(A1927, "UID");
        hashtable.put(A197, "STREET");
        hashtable.put(A1910, "SURNAME");
        hashtable.put(A1911, "GIVENNAME");
        hashtable.put(A1912, "INITIALS");
        hashtable.put(A1913, "GENERATION");
        hashtable.put(r26, "unstructuredAddress");
        hashtable.put(r27, "unstructuredName");
        hashtable.put(A1914, "UniqueIdentifier");
        hashtable.put(A1917, "DN");
        hashtable.put(A1918, "Pseudonym");
        hashtable.put(A1925, "PostalAddress");
        hashtable.put(A1924, "NameAtBirth");
        hashtable.put(A1922, "CountryOfCitizenship");
        hashtable.put(A1923, "CountryOfResidence");
        hashtable.put(A1921, "Gender");
        hashtable.put(A1920, "PlaceOfBirth");
        hashtable.put(A1919, "DateOfBirth");
        hashtable.put(A1916, "PostalCode");
        hashtable.put(A1915, "BusinessCategory");
        hashtable.put(r29, "TelephoneNumber");
        hashtable.put(r28, "Name");
        hashtable2.put(A19, "C");
        hashtable2.put(A192, "O");
        hashtable2.put(A193, "OU");
        hashtable2.put(A195, "CN");
        hashtable2.put(A198, "L");
        hashtable2.put(A199, "ST");
        hashtable2.put(A197, "STREET");
        hashtable2.put(A1926, "DC");
        hashtable2.put(A1927, "UID");
        hashtable3.put(A19, "C");
        hashtable3.put(A192, "O");
        hashtable3.put(A193, "OU");
        hashtable3.put(A195, "CN");
        hashtable3.put(A198, "L");
        hashtable3.put(A199, "ST");
        hashtable3.put(A197, "STREET");
        hashtable4.put("c", A19);
        hashtable4.put("o", A192);
        hashtable4.put("t", A194);
        hashtable4.put("ou", A193);
        hashtable4.put("cn", A195);
        hashtable4.put("l", A198);
        hashtable4.put("st", A199);
        hashtable4.put("sn", A196);
        hashtable4.put("serialnumber", A196);
        hashtable4.put("street", A197);
        hashtable4.put("emailaddress", r4);
        hashtable4.put("dc", A1926);
        hashtable4.put("e", r4);
        hashtable4.put("uid", A1927);
        hashtable4.put("surname", A1910);
        hashtable4.put("givenname", A1911);
        hashtable4.put("initials", A1912);
        hashtable4.put("generation", A1913);
        hashtable4.put("unstructuredaddress", r26);
        hashtable4.put("unstructuredname", r27);
        hashtable4.put("uniqueidentifier", A1914);
        hashtable4.put("dn", A1917);
        hashtable4.put("pseudonym", A1918);
        hashtable4.put("postaladdress", A1925);
        hashtable4.put("nameofbirth", A1924);
        hashtable4.put("countryofcitizenship", A1922);
        hashtable4.put("countryofresidence", A1923);
        hashtable4.put("gender", A1921);
        hashtable4.put("placeofbirth", A1920);
        hashtable4.put("dateofbirth", A1919);
        hashtable4.put("postalcode", A1916);
        hashtable4.put("businesscategory", A1915);
        hashtable4.put("telephonenumber", r29);
        hashtable4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r28);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dy6, X.1Bx, X.Dxm] */
    public AnonymousClass1Bz CP9() {
        C28339Dxl dxl = this.A04;
        if (dxl != null) {
            return dxl;
        }
        C26135Csy csy = new C26135Csy();
        C26135Csy csy2 = new C26135Csy();
        Vector vector = this.A01;
        if (0 != vector.size()) {
            BE8.A0t().A02((AnonymousClass1By) vector.elementAt(0));
            this.A02.elementAt(0);
            throw AnonymousClass000.A0s("getConvertedValue");
        }
        ? dxm = new C28340Dxm(csy2, true);
        dxm.A00 = -1;
        C28357Dy3 A072 = C28339Dxl.A07(dxm, csy);
        this.A04 = A072;
        return A072;
    }

    public boolean equals(Object obj) {
        C28318DxQ dxQ;
        Object obj2 = obj;
        if (obj2 != this) {
            boolean z = obj2 instanceof C28318DxQ;
            if (z || (obj2 instanceof C28339Dxl)) {
                if (!CP9().A0J(((AnonymousClass1Bx) obj2).CP9())) {
                    if (z) {
                        try {
                            dxQ = (C28318DxQ) obj2;
                        } catch (IllegalArgumentException unused) {
                            return false;
                        }
                    } else {
                        if (obj2 instanceof C28324DxW) {
                            obj2 = ((C28324DxW) obj2).A00;
                        } else if (obj == null) {
                            dxQ = null;
                        }
                        dxQ = new C28318DxQ(C28339Dxl.A05(obj2));
                    }
                    Vector vector = this.A01;
                    int size = vector.size();
                    Vector vector2 = dxQ.A01;
                    if (size == vector2.size()) {
                        boolean[] zArr = new boolean[size];
                        int i = size - 1;
                        int i2 = -1;
                        int i3 = -1;
                        if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                            i2 = size;
                            i = 0;
                            i3 = 1;
                        }
                        while (i != i2) {
                            AnonymousClass1Bz r4 = (AnonymousClass1Bz) vector.elementAt(i);
                            String str = (String) this.A02.elementAt(i);
                            for (int i4 = 0; i4 < size; i4++) {
                                if (!zArr[i4] && r4.A0J((AnonymousClass1Bz) vector2.elementAt(i4))) {
                                    String A012 = A01(str);
                                    String A013 = A01((String) dxQ.A02.elementAt(i4));
                                    if (A012.equals(A013) || A02(A012).equals(A02(A013))) {
                                        zArr[i4] = true;
                                        i += i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        Hashtable hashtable = A07;
        StringBuffer A0s = BE6.A0s();
        Vector vector = new Vector();
        StringBuffer stringBuffer = null;
        int i = 0;
        while (true) {
            Vector vector2 = this.A01;
            if (i >= vector2.size()) {
                break;
            }
            if (AnonymousClass000.A1Y(this.A00.elementAt(i))) {
                stringBuffer.append('+');
                A03((String) this.A02.elementAt(i), stringBuffer, hashtable, (AnonymousClass1C0) vector2.elementAt(i));
            } else {
                stringBuffer = BE6.A0s();
                A03((String) this.A02.elementAt(i), stringBuffer, hashtable, (AnonymousClass1C0) vector2.elementAt(i));
                vector.addElement(stringBuffer);
            }
            i++;
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                A0s.append(',');
            }
            A0s.append(vector.elementAt(i2).toString());
        }
        return A0s.toString();
    }

    public C28318DxQ(C28339Dxl dxl) {
        Boolean bool;
        Vector vector;
        this.A04 = dxl;
        Enumeration A0L2 = dxl.A0L();
        while (A0L2.hasMoreElements()) {
            C28340Dxm A022 = C28340Dxm.A02(((AnonymousClass1Bx) A0L2.nextElement()).CP9());
            int i = 0;
            while (true) {
                AnonymousClass1Bx[] r1 = A022.A00;
                if (i < r1.length) {
                    C28339Dxl A052 = C28339Dxl.A05(r1[i].CP9());
                    if (A052.A0K() == 2) {
                        this.A01.addElement(AnonymousClass1C0.A02(A052.A0M(0)));
                        AnonymousClass1Bx A042 = C28339Dxl.A04(A052);
                        if (!(A042 instanceof E74) || (A042 instanceof C28352Dxy)) {
                            try {
                                Vector vector2 = this.A02;
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("#");
                                byte[] A1Z = BE9.A1Z(A042);
                                byte[] A023 = C20073A5z.A02(A1Z, 0, A1Z.length);
                                int length = A023.length;
                                char[] cArr = new char[length];
                                for (int i2 = 0; i2 != length; i2++) {
                                    cArr[i2] = (char) (A023[i2] & 255);
                                }
                                vector2.addElement(AnonymousClass000.A0y(new String(cArr), A10));
                            } catch (IOException unused) {
                                throw AnonymousClass000.A0k("cannot encode value");
                            }
                        } else {
                            String BZl = ((E74) A042).BZl();
                            if (BZl.length() <= 0 || BZl.charAt(0) != '#') {
                                vector = this.A02;
                            } else {
                                vector = this.A02;
                                BZl = AnonymousClass001.A1H("\\", BZl, AnonymousClass000.A10());
                            }
                            vector.addElement(BZl);
                        }
                        Vector vector3 = this.A00;
                        if (i != 0) {
                            bool = A0m;
                        } else {
                            bool = A0l;
                        }
                        vector3.addElement(bool);
                        i++;
                    } else {
                        throw AnonymousClass000.A0k("badly sized pair");
                    }
                }
            }
        }
    }

    private String A01(String str) {
        String A002 = AnonymousClass1Bo.A00(str.trim());
        int length = A002.length();
        if (length <= 0 || BE7.A00(A002) != '#') {
            return A002;
        }
        try {
            AnonymousClass1Bz A012 = AnonymousClass1Bz.A01(C20073A5z.A01(A002, length - 1));
            if (A012 instanceof E74) {
                return AnonymousClass1Bo.A00(((E74) A012).BZl().trim());
            }
            return A002;
        } catch (IOException e) {
            throw BEA.A0c(e, "unknown encoding in name: ", AnonymousClass000.A10());
        }
    }

    public static String A02(String str) {
        StringBuffer A0s = BE6.A0s();
        int length = str.length();
        if (length != 0) {
            char A002 = BE7.A00(str);
            A0s.append(A002);
            int i = 1;
            while (i < length) {
                char charAt = str.charAt(i);
                if (A002 != ' ' || charAt != ' ') {
                    A0s.append(charAt);
                }
                i++;
                A002 = charAt;
            }
        }
        return A0s.toString();
    }

    public static void A03(String str, StringBuffer stringBuffer, Hashtable hashtable, AnonymousClass1C0 r9) {
        int i;
        String str2 = (String) hashtable.get(r9);
        if (str2 == null) {
            str2 = r9.A01;
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && BE7.A00(str) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i < length2 && stringBuffer.charAt(i) == ' ') {
            stringBuffer.insert(i, "\\");
            length = i + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (i <= length2) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length2++;
        }
    }

    public C28318DxQ() {
    }
}
