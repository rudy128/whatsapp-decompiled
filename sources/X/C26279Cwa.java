package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Cwa  reason: case insensitive filesystem */
public class C26279Cwa {
    public Set A00 = C17880vN.A12();
    public Set A01 = C17880vN.A12();
    public Set A02 = C17880vN.A12();
    public Set A03 = C17880vN.A12();
    public Set A04 = C17880vN.A12();
    public Set A05 = C17880vN.A12();
    public Set A06;
    public Set A07;
    public Set A08;
    public Set A09;
    public Set A0A;
    public Set A0B;

    public static int A00(Collection collection) {
        int i = 0;
        if (collection != null) {
            for (Object next : collection) {
                i += next instanceof byte[] ? AnonymousClass1C2.A00((byte[]) next) : next.hashCode();
            }
        }
        return i;
    }

    public static boolean A06(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] A052 = AnonymousClass1Bo.A05(str2);
        String[] A053 = AnonymousClass1Bo.A05(str);
        int length = A053.length;
        int length2 = A052.length;
        if (length > length2) {
            int i = length - length2;
            int i2 = -1;
            while (!A053[i - 1].equals("")) {
                while (true) {
                    i2++;
                    if (i2 >= length2) {
                        return true;
                    }
                    if (i2 != -1) {
                        if (!A052[i2].equalsIgnoreCase(A053[i2 + i])) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean A07(Collection collection, Collection collection2) {
        boolean equals;
        if (collection != collection2) {
            if (!(collection == null || collection2 == null || collection.size() != collection2.size())) {
                for (Object next : collection) {
                    for (Object next2 : collection2) {
                        if (next != next2) {
                            if (!(next == null || next2 == null)) {
                                if (!(next instanceof byte[]) || !(next2 instanceof byte[])) {
                                    equals = next.equals(next2);
                                } else {
                                    equals = Arrays.equals((byte[]) next, (byte[]) next2);
                                }
                                if (equals) {
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

    public static boolean A09(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26279Cwa)) {
            return false;
        }
        C26279Cwa cwa = (C26279Cwa) obj;
        return A07(cwa.A00, this.A00) && A07(cwa.A01, this.A01) && A07(cwa.A02, this.A02) && A07(cwa.A03, this.A03) && A07(cwa.A05, this.A05) && A07(cwa.A04, this.A04) && A07(cwa.A06, this.A06) && A07(cwa.A07, this.A07) && A07(cwa.A08, this.A08) && A07(cwa.A09, this.A09) && A07(cwa.A0B, this.A0B) && A07(cwa.A0A, this.A0A);
    }

    public int hashCode() {
        return A00(this.A00) + A00(this.A01) + A00(this.A02) + A00(this.A03) + A00(this.A05) + A00(this.A04) + A00(this.A06) + A00(this.A07) + A00(this.A08) + A00(this.A09) + A00(this.A0B) + A00(this.A0A);
    }

    public static boolean A04(String str, String str2) {
        boolean A062;
        String A0p = BE6.A0p(str.indexOf(64), str);
        if (str2.indexOf(64) != -1) {
            if (!str.equalsIgnoreCase(str2)) {
                A062 = A0p.equalsIgnoreCase(str2.substring(1));
            }
            return true;
        } else if (str2.charAt(0) != '.') {
            A062 = A0p.equalsIgnoreCase(str2);
        } else {
            A062 = A06(A0p, str2);
        }
        if (!A062) {
            return false;
        }
        return true;
    }

    public static boolean A05(String str, String str2) {
        boolean A062;
        String A0p = BE6.A0p(str.indexOf(58), str);
        int indexOf = A0p.indexOf("//");
        if (indexOf != -1) {
            A0p = A0p.substring(indexOf + 2);
        }
        int lastIndexOf = A0p.lastIndexOf(58);
        if (lastIndexOf != -1) {
            A0p = A0p.substring(0, lastIndexOf);
        }
        String A0p2 = BE6.A0p(A0p.indexOf(58), A0p);
        String A0p3 = BE6.A0p(A0p2.indexOf(64), A0p2);
        int indexOf2 = A0p3.indexOf(47);
        if (indexOf2 != -1) {
            A0p3 = A0p3.substring(0, indexOf2);
        }
        if (!str2.startsWith(".")) {
            A062 = A0p3.equalsIgnoreCase(str2);
        } else {
            A062 = A06(A0p3, str2);
        }
        if (A062) {
            return true;
        }
        return false;
    }

    public void A0A(C28324DxW dxW) {
        Set<C28339Dxl> set = this.A00;
        C28339Dxl A052 = C28339Dxl.A05(dxW);
        if (!set.isEmpty()) {
            for (C28339Dxl A082 : set) {
                if (A08(A052, A082)) {
                    throw new C1m("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    public void A0B(C28324DxW dxW) {
        Set<C28339Dxl> set = this.A06;
        C28339Dxl A052 = C28339Dxl.A05(dxW.A00);
        if (set == null) {
            return;
        }
        if (!set.isEmpty() || A052.A0K() != 0) {
            for (C28339Dxl A082 : set) {
                if (A08(A052, A082)) {
                    return;
                }
            }
            throw new C1m("Subject distinguished name is not from a permitted subtree");
        }
    }

    private String A01(Set set) {
        int length;
        int i;
        StringBuilder A0q = BE9.A0q();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (A0q.length() > 1) {
                BE6.A1K(A0q);
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder A10 = AnonymousClass000.A10();
            int i2 = 0;
            while (true) {
                length = bArr.length;
                i = length / 2;
                if (i2 >= i) {
                    break;
                }
                if (A10.length() > 0) {
                    A10.append(".");
                }
                A10.append(Integer.toString(bArr[i2] & 255));
                i2++;
            }
            A10.append("/");
            boolean z = true;
            while (i < length) {
                if (z) {
                    z = false;
                } else {
                    A10.append(".");
                }
                A10.append(Integer.toString(bArr[i] & 255));
                i++;
            }
            AnonymousClass8BS.A1D(A10, A0q);
        }
        return AnonymousClass000.A0z(A0q);
    }

    public static String A02(Set set) {
        StringBuilder A0q = BE9.A0q();
        for (Object A012 : set) {
            if (A0q.length() > 1) {
                BE6.A1K(A0q);
            }
            C28310DxI A013 = C28310DxI.A01(A012);
            A0q.append(A013.A01.A01);
            A0q.append(":");
            try {
                byte[] A0B2 = A013.A00.CP9().A0B();
                A0q.append(AnonymousClass1Bo.A02(C20073A5z.A02(A0B2, 0, A0B2.length)));
            } catch (IOException e) {
                AnonymousClass8BS.A1D(e, A0q);
            }
        }
        return AnonymousClass000.A0z(A0q);
    }

    public static final void A03(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(AnonymousClass1Bo.A00);
    }

    public static boolean A08(C28339Dxl dxl, C28339Dxl dxl2) {
        boolean A062;
        if (dxl2.A0K() >= 1 && dxl2.A0K() <= dxl.A0K()) {
            C28307DxF A012 = C28307DxF.A01(dxl2.A0M(0));
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < dxl.A0K()) {
                    if (C26254Cvu.A06(A012, C28307DxF.A01(dxl.A0M(i)))) {
                        break;
                    }
                    i2 = i;
                    i++;
                } else {
                    i = i2;
                    break;
                }
            }
            if (dxl2.A0K() <= dxl.A0K() - i) {
                int i3 = 0;
                while (i3 < dxl2.A0K()) {
                    C28307DxF A013 = C28307DxF.A01(dxl2.A0M(i3));
                    C28307DxF A014 = C28307DxF.A01(dxl.A0M(i + i3));
                    if (A013.A00.A00.length == A014.A00.A00.length && A013.A0D().A01.A0J(A014.A0D().A01)) {
                        if (A013.A00.A00.length != 1 || !A013.A0D().A01.A0J(C28372DyI.A0W)) {
                            A062 = C26254Cvu.A06(A013, A014);
                        } else {
                            A062 = A014.A0D().A00.toString().startsWith(A013.A0D().A00.toString());
                        }
                        if (A062) {
                            i3++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A03(A10, "permitted:");
        Set set = this.A06;
        if (set != null) {
            A03(A10, "DN:");
            A03(A10, set.toString());
        }
        Set set2 = this.A07;
        if (set2 != null) {
            A03(A10, "DNS:");
            A03(A10, set2.toString());
        }
        Set set3 = this.A08;
        if (set3 != null) {
            A03(A10, "Email:");
            A03(A10, set3.toString());
        }
        Set set4 = this.A0B;
        if (set4 != null) {
            A03(A10, "URI:");
            A03(A10, set4.toString());
        }
        Set set5 = this.A09;
        if (set5 != null) {
            A03(A10, "IP:");
            A03(A10, A01(set5));
        }
        Set set6 = this.A0A;
        if (set6 != null) {
            A03(A10, "OtherName:");
            A03(A10, A02(set6));
        }
        A03(A10, "excluded:");
        if (!this.A00.isEmpty()) {
            A03(A10, "DN:");
            A03(A10, this.A00.toString());
        }
        if (!this.A01.isEmpty()) {
            A03(A10, "DNS:");
            A03(A10, this.A01.toString());
        }
        if (!this.A02.isEmpty()) {
            A03(A10, "Email:");
            A03(A10, this.A02.toString());
        }
        if (!this.A05.isEmpty()) {
            A03(A10, "URI:");
            A03(A10, this.A05.toString());
        }
        if (!this.A03.isEmpty()) {
            A03(A10, "IP:");
            A03(A10, A01(this.A03));
        }
        if (!this.A04.isEmpty()) {
            A03(A10, "OtherName:");
            A03(A10, A02(this.A04));
        }
        return A10.toString();
    }
}
