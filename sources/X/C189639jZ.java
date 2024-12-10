package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9jZ  reason: invalid class name and case insensitive filesystem */
public final class C189639jZ {
    public C198179xu A00 = new C198179xu(new A2J((AW0) null, (UserJid) null, (C20281AEp) null, AnonymousClass9I2.NONE, (AnonymousClass21K) null, (Boolean) null, (String) null, (List) null, 0), (Throwable) null, 2);

    public final C198179xu A00(AW0 aw0, UserJid userJid, C20281AEp aEp, AnonymousClass9I2 r17, AnonymousClass21K r18, Boolean bool, String str, List list, int i) {
        int i2;
        C198179xu r2;
        List list2 = list;
        AnonymousClass9I2 r7 = r17;
        AW0 aw02 = aw0;
        AnonymousClass21K r8 = r18;
        C20281AEp aEp2 = aEp;
        UserJid userJid2 = userJid;
        Boolean bool2 = bool;
        String str2 = null;
        if (bool == null) {
            A2J a2j = (A2J) this.A00.A01;
            if (a2j != null) {
                bool2 = a2j.A06;
            } else {
                bool2 = null;
            }
        }
        if (userJid == null) {
            A2J a2j2 = (A2J) this.A00.A01;
            if (a2j2 != null) {
                userJid2 = a2j2.A02;
            } else {
                userJid2 = null;
            }
        }
        if (aEp == null) {
            A2J a2j3 = (A2J) this.A00.A01;
            if (a2j3 != null) {
                aEp2 = a2j3.A03;
            } else {
                aEp2 = null;
            }
        }
        if (r18 == null) {
            A2J a2j4 = (A2J) this.A00.A01;
            if (a2j4 != null) {
                r8 = a2j4.A05;
            } else {
                r8 = null;
            }
        }
        if (aw0 == null) {
            A2J a2j5 = (A2J) this.A00.A01;
            if (a2j5 != null) {
                aw02 = a2j5.A01;
            } else {
                aw02 = null;
            }
        }
        if (r17 == null) {
            A2J a2j6 = (A2J) this.A00.A01;
            if (a2j6 != null) {
                r7 = a2j6.A04;
            } else {
                r7 = null;
            }
        }
        if (list == null) {
            A2J a2j7 = (A2J) this.A00.A01;
            if (a2j7 != null) {
                list2 = a2j7.A08;
            } else {
                list2 = null;
            }
        }
        if (str == null) {
            A2J a2j8 = (A2J) this.A00.A01;
            if (a2j8 != null) {
                str2 = a2j8.A07;
            }
        } else {
            str2 = str;
        }
        A2J a2j9 = new A2J(aw02, userJid2, aEp2, r7, r8, bool2, str2, list2, i);
        if (a2j9.A03 != null) {
            r2 = new C198179xu(a2j9, new Throwable("An error occurred"), 1);
        } else {
            if (a2j9.A05 == null || (a2j9.A02 != null && a2j9.A04 == AnonymousClass9I2.NONE)) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            r2 = new C198179xu(a2j9, (Throwable) null, i2);
        }
        C18070vi.A0b(r2);
        this.A00 = r2;
        return r2;
    }
}
