package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class CZY {
    public static Hashtable A00(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public AnonymousClass1C0 A03(String str) {
        Hashtable hashtable = ((C28374DyK) this).A00;
        if (AnonymousClass1Bo.A01(str).startsWith("OID.")) {
            str = str.substring(4);
        } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            AnonymousClass1C0 r0 = (AnonymousClass1C0) hashtable.get(AnonymousClass1Bo.A00(str));
            if (r0 != null) {
                return r0;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unknown object id - ");
            A10.append(str);
            throw AnonymousClass001.A12(" - passed to distinguished name", A10);
        }
        return BE6.A19(str);
    }

    public String A01(C28324DxW dxW) {
        StringBuffer stringBuffer;
        if (this instanceof C28372DyI) {
            C28372DyI dyI = (C28372DyI) this;
            stringBuffer = BE6.A0s();
            C28307DxF[] A0D = dxW.A0D();
            boolean z = true;
            for (int length = A0D.length - 1; length >= 0; length--) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                C26254Cvu.A05(stringBuffer, dyI.A01, A0D[length]);
            }
        } else {
            C28374DyK dyK = (C28374DyK) this;
            stringBuffer = BE6.A0s();
            C28307DxF[] A0D2 = dxW.A0D();
            boolean z2 = true;
            for (C28307DxF A05 : A0D2) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                C26254Cvu.A05(stringBuffer, dyK.A01, A05);
            }
        }
        return stringBuffer.toString();
    }

    public AnonymousClass1Bx A02(String str, AnonymousClass1C0 r8) {
        AnonymousClass1C0 r0;
        int length = str.length();
        if (length != 0) {
            if (str.charAt(0) == '#') {
                try {
                    int i = (length - 1) / 2;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 != i; i2++) {
                        int i3 = (i2 * 2) + 1;
                        BE6.A1N(bArr, C26254Cvu.A00(str.charAt(i3)) << 4, C26254Cvu.A00(str.charAt(i3 + 1)), i2);
                    }
                    return AnonymousClass1Bz.A01(bArr);
                } catch (IOException unused) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("can't recode value for oid ");
                    throw new C24415C2o(AnonymousClass000.A0y(r8.A01, A10));
                }
            } else if (str.charAt(0) == '\\') {
                str = str.substring(1);
            }
        }
        if (this instanceof C28372DyI) {
            if (!r8.A0J(C28372DyI.A05)) {
                if (!r8.A0J(C28372DyI.A03) && !r8.A0J(C28372DyI.A0W) && !r8.A0J(C28372DyI.A09)) {
                    r0 = C28372DyI.A0a;
                }
                return new C28350Dxw(str);
            }
            return new C28353Dxz(str);
        }
        if (!r8.A0J(C28374DyK.A0D) && !r8.A0J(C28374DyK.A08)) {
            if (r8.A0J(C28374DyK.A07)) {
                return new C28338Dxk(str);
            }
            if (!r8.A0J(C28374DyK.A03) && !r8.A0J(C28374DyK.A0U) && !r8.A0J(C28374DyK.A0B)) {
                r0 = C28374DyK.A0Z;
            }
            return new C28350Dxw(str);
        }
        return new C28353Dxz(str);
        if (!r8.A0J(r0)) {
            return new C28351Dxx(str);
        }
        return new C28350Dxw(str);
    }
}
