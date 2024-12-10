package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6oL  reason: invalid class name and case insensitive filesystem */
public final class C133206oL {
    public final AnonymousClass1TG A00;
    public final C24631Lb A01;
    public final C24641Lc A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C24661Le A08;
    public final AnonymousClass1Nb A09;
    public final C32741hg A0A;

    public final C139186yN A00() {
        int i;
        int i2;
        C441822l r12;
        AnonymousClass19Y r8 = this.A0A.A0E;
        r8.markerStart(453128091, 2);
        r8.markerPoint(453128091, 2, "REFRESH_TASK_START");
        ArrayList A092 = this.A08.A09();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        LinkedHashMap A134 = C17880vN.A13();
        LinkedHashMap A135 = C17880vN.A13();
        LinkedHashMap A136 = C17880vN.A13();
        Iterator it = A092.iterator();
        C63372sx r18 = null;
        while (it.hasNext()) {
            C63372sx r1 = (C63372sx) it.next();
            C18070vi.A0b(r1);
            AnonymousClass1TG r11 = this.A00;
            UserJid userJid = r1.A0A;
            AnonymousClass206 A032 = r11.A03(userJid);
            if ((A032 instanceof C441822l) && (r12 = (C441822l) A032) != null) {
                ((CY4) this.A03.get()).A01(r12);
            }
            if (userJid == AnonymousClass1E5.A00) {
                if (C108985cd.A1a(this.A06)) {
                    C62422rN.A00((C62422rN) this.A07.get());
                }
                if (WfalManager.A00((WfalManager) this.A05.get(), false)) {
                    AnonymousClass738.A02((AnonymousClass738) this.A04.get());
                }
                r18 = r1;
            } else if (this.A09.A0a(userJid).A0U) {
                A133.add(r1);
            } else if (r1.A01() > 0) {
                A13.add(r1);
            } else {
                A132.add(r1);
            }
            if (C22971Dz.A0Z(userJid)) {
                Iterator it2 = r11.A04(userJid, -1).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C18070vi.A0X(next);
                    AnonymousClass206 r13 = (AnonymousClass206) next;
                    String str = this.A01.A00(r13).A04;
                    if (str != null) {
                        String A0w = C108955ca.A0w(r13);
                        int i3 = 0;
                        if (A135.get(A0w) == null) {
                            if (A136.containsKey(str)) {
                                i = C72463Mc.A0B(C108945cZ.A1D(str, A136));
                                i2 = i + 1;
                            } else {
                                i = 0;
                                i2 = 1;
                            }
                            C17880vN.A1P(str, A136, i2);
                            C17880vN.A1P(A0w, A135, i);
                        }
                        boolean containsKey = A134.containsKey(str);
                        int A0E = r1.A0E(r13, C18020vd.A05(C18040vf.A02, this.A02.A01, 8880));
                        if (containsKey) {
                            if (A0E != 0) {
                                Number A1D = C108945cZ.A1D(str, A134);
                                if (A1D != null) {
                                    i3 = A1D.intValue();
                                }
                                A0E = i3 + 1;
                            }
                        }
                        C17880vN.A1P(str, A134, A0E);
                    }
                }
            }
        }
        r8.markerPoint(453128091, 2, "REFRESH_TASK_POPULATED");
        r8.markerEnd(453128091, 2, 2);
        return new C139186yN(r18, A13, A132, A133, A134, A135);
    }

    public C133206oL(AnonymousClass1TG r2, C24631Lb r3, C24661Le r4, AnonymousClass1Nb r5, C24641Lc r6, C32741hg r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r6, r4, r8, r5, r9);
        C18070vi.A0x(r2, r7, r3, r10, r11);
        C18070vi.A0d(r12, 11);
        this.A02 = r6;
        this.A08 = r4;
        this.A06 = r8;
        this.A09 = r5;
        this.A05 = r9;
        this.A00 = r2;
        this.A0A = r7;
        this.A01 = r3;
        this.A03 = r10;
        this.A04 = r11;
        this.A07 = r12;
    }
}
