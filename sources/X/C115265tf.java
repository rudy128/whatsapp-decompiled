package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5tf  reason: invalid class name and case insensitive filesystem */
public class C115265tf extends C167258fi {
    public final AnonymousClass206 A00;
    public final AnonymousClass68H A01;

    public /* bridge */ /* synthetic */ Object A0E() {
        List list;
        UserJid userJid;
        AnonymousClass1E7 A0E;
        AnonymousClass68H r3 = this.A01;
        AnonymousClass206 r11 = this.A00;
        List A02 = C62872s8.A02(r11, r3.A06);
        AnonymousClass73C r14 = null;
        if (A02 == null) {
            throw new C33281iZ(AnonymousClass206.A03(r11, "Couldn't load vcard for message ", AnonymousClass000.A10()));
        }
        ArrayList A0z = C17880vN.A0z(3);
        AnonymousClass73C r10 = null;
        int i = 0;
        int i2 = 0;
        while (i < A02.size() && i < 100 && i2 < 3) {
            try {
                AnonymousClass118 r9 = r3.A04;
                AnonymousClass1M9 r8 = r3.A01;
                AnonymousClass73Y r1 = new AnonymousClass73Y(r8, r3.A03, r9, r3.A05);
                r1.A05(C17880vN.A0w(A02, i));
                AnonymousClass73C r7 = r1.A04;
                if (r14 == null) {
                    r14 = r7;
                }
                byte[] bArr = r7.A0B;
                if (bArr == null || bArr.length <= 0) {
                    List list2 = r7.A06;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                UserJid userJid2 = ((C129926ib) it.next()).A01;
                                if (userJid2 != null && (A0E = r8.A0E(userJid2)) != null && r3.A02.A07(A0E)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    i++;
                }
                A0z.add(r7);
                if (r10 == null) {
                    r10 = r7;
                }
                i2++;
            } catch (C33281iZ e) {
                Log.e("Invalid VCard.", e);
            }
            i++;
        }
        String str = null;
        if (!(r14 == null || (list = r14.A06) == null || list.isEmpty() || (userJid = ((C129926ib) C108955ca.A0p(r14.A06)).A01) == null || !C42701yb.A01(userJid))) {
            str = r3.A00.A06(userJid);
        }
        if (r10 != null) {
            r14 = r10;
        }
        return new AnonymousClass4OY(r11, str, A0z, r14, A02.size());
    }

    public C115265tf(AnonymousClass206 r1, AnonymousClass68H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
