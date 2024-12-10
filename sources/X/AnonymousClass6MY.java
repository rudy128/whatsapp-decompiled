package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6MY  reason: invalid class name */
public final class AnonymousClass6MY extends A34 {
    public boolean A00;
    public final WfalManager A01;
    public final AnonymousClass1TG A02;
    public final C24631Lb A03;
    public final C24661Le A04;
    public final CY4 A05;
    public final AnonymousClass1Nb A06;
    public final C24641Lc A07;
    public final C32741hg A08;
    public final AnonymousClass884 A09;
    public final C30141dS A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public AnonymousClass6MY(WfalManager wfalManager, AnonymousClass1TG r3, C24631Lb r4, C24661Le r5, CY4 cy4, AnonymousClass1Nb r7, C24641Lc r8, C32741hg r9, AnonymousClass884 r10, C30141dS r11, AnonymousClass00H r12, AnonymousClass00H r13, boolean z) {
        C18070vi.A0g(r11, 3, wfalManager);
        C18070vi.A0d(cy4, 9);
        this.A04 = r5;
        this.A07 = r8;
        this.A0A = r11;
        this.A06 = r7;
        this.A01 = wfalManager;
        this.A02 = r3;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = cy4;
        this.A0B = r12;
        this.A0C = r13;
        this.A09 = r10;
        this.A00 = z;
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj) {
        this.A08.A0E.markerEnd(453128091, 2, 4);
    }

    public void A0E() {
        this.A08.A0E.markerEnd(453128091, 2, 4);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        int i2;
        C441822l r11;
        AnonymousClass19Y r3 = this.A08.A0E;
        r3.markerStart(453128091, 2);
        r3.markerPoint(453128091, 2, "REFRESH_TASK_START");
        if (this.A00) {
            this.A02.A05();
        }
        ArrayList A092 = this.A04.A09();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        LinkedHashMap A134 = C17880vN.A13();
        LinkedHashMap A135 = C17880vN.A13();
        LinkedHashMap A136 = C17880vN.A13();
        Iterator it = A092.iterator();
        C63372sx r17 = null;
        while (it.hasNext()) {
            C63372sx r1 = (C63372sx) it.next();
            C18070vi.A0b(r1);
            AnonymousClass1TG r10 = this.A02;
            UserJid userJid = r1.A0A;
            AnonymousClass206 A032 = r10.A03(userJid);
            if ((A032 instanceof C441822l) && (r11 = (C441822l) A032) != null) {
                this.A05.A01(r11);
            }
            if (userJid == AnonymousClass1E5.A00) {
                if (this.A0A.A00()) {
                    C62422rN.A00((C62422rN) this.A0C.get());
                }
                if (WfalManager.A00(this.A01, false)) {
                    AnonymousClass738.A02((AnonymousClass738) this.A0B.get());
                }
                r17 = r1;
            } else if (this.A06.A0a(userJid).A0U) {
                A133.add(r1);
            } else if (r1.A01() > 0) {
                A13.add(r1);
            } else {
                A132.add(r1);
            }
            if (C22971Dz.A0Z(userJid)) {
                Iterator it2 = r10.A04(userJid, -1).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C18070vi.A0X(next);
                    AnonymousClass206 r12 = (AnonymousClass206) next;
                    String str = this.A03.A00(r12).A04;
                    if (str != null) {
                        String A0w = C108955ca.A0w(r12);
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
                        int A0E = r1.A0E(r12, C18020vd.A05(C18040vf.A02, this.A07.A01, 8880));
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
        return new C139186yN(r17, A13, A132, A133, A134, A135);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C139186yN r5 = (C139186yN) obj;
        C18070vi.A0d(r5, 0);
        AnonymousClass19Y r3 = this.A08.A0E;
        r3.markerPoint(453128091, 2, "REFRESH_TASK_END");
        AnonymousClass884 r0 = (AnonymousClass884) A0A(StatusesFragment.class);
        if (!(r0 == null && (r0 = this.A09) == null)) {
            r0.C6m(r5);
        }
        r3.markerPoint(453128091, 2, "REFRESH_TASK_POPULATED");
        r3.markerEnd(453128091, 2, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6MY(WfalManager wfalManager, AnonymousClass1TG r4, C24631Lb r5, C24661Le r6, CY4 cy4, AnonymousClass1Nb r8, C24641Lc r9, StatusesFragment statusesFragment, C32741hg r11, C30141dS r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        super(statusesFragment, true);
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r9, r12, r8);
        C18070vi.A0d(wfalManager, 5);
        C18070vi.A0x(r4, r11, r5, cy4, r13);
        C18070vi.A0d(r14, 11);
        this.A04 = r6;
        this.A07 = r9;
        this.A0A = r12;
        this.A01 = wfalManager;
        this.A06 = r8;
        this.A02 = r4;
        this.A08 = r11;
        this.A03 = r5;
        this.A05 = cy4;
        this.A0B = r13;
        this.A0C = r14;
        this.A09 = null;
    }
}
