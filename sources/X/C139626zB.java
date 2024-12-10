package X;

import android.widget.EditText;
import com.whatsapp.contact.contactform.viewcontrollers.privacy.ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6zB  reason: invalid class name and case insensitive filesystem */
public final class C139626zB {
    public final AnonymousClass1KB A00;
    public final C26811To A01;
    public final AnonymousClass1M9 A02;
    public final C26781Tl A03;
    public final C133996pq A04;
    public final C1404471l A05;
    public final C116505xr A06;
    public final C160908Am A07;
    public final C18030ve A08;
    public final AnonymousClass10I A09;
    public final C18600wl A0A;
    public final AnonymousClass1OX A0B;
    public final C136756uL A0C;

    public final void A01(C59042lf r16, AnonymousClass1BI r17, Long l, String str, String str2, boolean z) {
        String str3;
        String str4 = str;
        C18070vi.A0d(str4, 1);
        C59042lf r3 = r16;
        boolean A1W = AnonymousClass000.A1W(r3);
        AnonymousClass1BI r1 = r17;
        if (r17 != null) {
            AnonymousClass1E7 r9 = new AnonymousClass1E7(r1);
            AnonymousClass1M9 r5 = this.A02;
            ArrayList A0N = r5.A04.A0N(r1);
            C1404471l r12 = this.A05;
            r9.A0T = C1404471l.A00(r12.A04);
            r9.A0S = C1404471l.A00(r12.A05);
            r9.A0R = r12.A02();
            EditText editText = r12.A00;
            if (editText != null) {
                str3 = C1404471l.A00(editText);
            } else {
                str3 = "";
            }
            r9.A0Q = str3;
            if (l != null) {
                r9.A0M(l.longValue());
            }
            if (this.A0C.A03()) {
                r9.A09 = 0;
            } else {
                r9.A09 = 1;
            }
            boolean z2 = z;
            if (!A1W) {
                r9.A0H = new C59042lf(-5, str4);
                A02(r9, A0N, z2);
                if (C18020vd.A05(C18040vf.A02, this.A08, 9930)) {
                    AnonymousClass3MW.A1X(this.A0A, new ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1(this, (C30391dr) null), this.A0B);
                    return;
                }
                return;
            }
            AnonymousClass1E7 r11 = null;
            if (str2 != null) {
                C116505xr r2 = this.A06;
                if (!AnonymousClass1YE.A09(r2.A01, r2.A04(), false)) {
                    if (l != null) {
                        AnonymousClass1E7 A0A2 = r5.A0A(l.longValue());
                        if (A0A2 != null) {
                            ArrayList A13 = AnonymousClass000.A13();
                            Iterator it = A0N.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (((AnonymousClass1E7) next).A0B()) {
                                    A13.add(next);
                                }
                            }
                            int size = A13.size();
                            AnonymousClass10I r32 = this.A09;
                            int i = 40;
                            if (size > 1) {
                                i = 39;
                            }
                            C108955ca.A1R(r32, this, A0A2, i);
                        }
                        r9.A0H = new C59042lf(-5, str4);
                        A02(r9, A0N, z2);
                        return;
                    }
                    return;
                }
            }
            r9.A0H = r3;
            if (!(l == null || (r11 = r5.A0A(l.longValue())) == null)) {
                r9.A01 = r11.A01;
            }
            Iterator it2 = A0N.iterator();
            while (it2.hasNext()) {
                if (A00(C17880vN.A0O(it2), r9)) {
                    if (!z) {
                        this.A07.C4L(C17880vN.A0A());
                        return;
                    }
                    return;
                }
            }
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it3 = A0N.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((AnonymousClass1E7) next2).A0J() != r9.A0J()) {
                    A132.add(next2);
                }
            }
            ArrayList A0m = C29431cG.A0m(A132);
            A0m.add(r9);
            this.A09.CGF(new C21437Ak4(r9, this, r11, A0m, 7, z2));
        }
    }

    public C139626zB(AnonymousClass1KB r1, C26811To r2, AnonymousClass1M9 r3, C26781Tl r4, C133996pq r5, C1404471l r6, C116505xr r7, C160908Am r8, C136756uL r9, C18030ve r10, AnonymousClass10I r11, C18600wl r12, AnonymousClass1OX r13) {
        C18070vi.A0w(r10, r1, r11, r2, r3);
        C18070vi.A0l(r12, r13);
        this.A08 = r10;
        this.A00 = r1;
        this.A09 = r11;
        this.A01 = r2;
        this.A02 = r3;
        this.A0A = r12;
        this.A0B = r13;
        this.A03 = r4;
        this.A07 = r8;
        this.A05 = r6;
        this.A0C = r9;
        this.A04 = r5;
        this.A06 = r7;
    }

    public static final boolean A00(AnonymousClass1E7 r4, AnonymousClass1E7 r5) {
        String str;
        String str2 = null;
        if (!AnonymousClass1YE.A09(r4.A0K(), r5.A0K(), false)) {
            return false;
        }
        C59042lf r0 = r4.A0H;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        C59042lf r02 = r5.A0H;
        if (r02 != null) {
            str2 = r02.A01;
        }
        if (AnonymousClass1YE.A09(str, str2, false)) {
            return true;
        }
        return false;
    }

    public final void A02(AnonymousClass1E7 r6, List list, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (A00(C17880vN.A0O(it), r6)) {
                this.A07.C4L(C17880vN.A0A());
                return;
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : list) {
            if (((AnonymousClass1E7) next).A0B()) {
                A132.add(next);
            }
        }
        r6.A01 = 0;
        A13.add(r6);
        A13.addAll(A132);
        this.A09.CGF(new AnonymousClass7RF(this, r6, 26, z));
    }
}
