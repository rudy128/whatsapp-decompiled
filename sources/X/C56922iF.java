package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.2iF  reason: invalid class name and case insensitive filesystem */
public final class C56922iF {
    public final C18030ve A00;

    public C56922iF(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final String A00(Collection collection) {
        int[] iArr = new int[6];
        if (collection != null) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 9656)) {
                LinkedHashMap A13 = C17880vN.A13();
                Iterator it = collection.iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    DeviceJid A0R = C17880vN.A0R(it);
                    UserJid userJid = A0R.userJid;
                    int device = A0R.getDevice();
                    boolean z = false;
                    if (device == 0) {
                        z = true;
                    }
                    boolean z2 = !z;
                    Number number = (Number) A13.get(userJid);
                    if (z2) {
                        if (number != null) {
                            i = number.intValue();
                        }
                        i++;
                    } else if (number != null) {
                        i = number.intValue();
                    }
                    C17880vN.A1P(userJid, A13, i);
                }
                Iterator A15 = AnonymousClass000.A15(A13);
                while (A15.hasNext()) {
                    int A0M = AnonymousClass000.A0M(C17890vO.A0P(A15));
                    if (A0M == 0) {
                        iArr[0] = iArr[0] + 1;
                    } else {
                        char c = 4;
                        if (A0M <= 4) {
                            iArr[1] = iArr[1] + 1;
                        } else {
                            if (A0M <= 10) {
                                c = 2;
                            } else if (A0M <= 15) {
                                c = 3;
                            } else if (A0M > 20) {
                                c = 5;
                            }
                            iArr[c] = iArr[c] + 1;
                        }
                    }
                }
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("");
        int i2 = 0;
        int i3 = 0;
        do {
            int i4 = iArr[i2];
            i3++;
            if (i3 > 1) {
                A10.append(",");
            }
            A10.append(String.valueOf(i4));
            i2++;
        } while (i2 < 6);
        A10.append("");
        return C18070vi.A0H(A10);
    }
}
