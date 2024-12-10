package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1;
import com.whatsapp.status.viewmodels.StatusesViewModel$runOnEntries$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jJ  reason: invalid class name and case insensitive filesystem */
public final class C111255jJ extends AnonymousClass1J2 implements AnonymousClass1GC, AnonymousClass884 {
    public AnonymousClass6MY A00;
    public C116685yS A01;
    public Set A02 = C25511Om.A00;
    public AnonymousClass1OB A03;
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final AnonymousClass7M3 A06 = new AnonymousClass7M3(this, 1);
    public final AnonymousClass7FT A07 = new AnonymousClass7FT(this);
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);
    public final C18100vl A0J = AnonymousClass7S4.A02(this, 21);
    public final C18600wl A0K;
    public final C35911n2 A0L = new C35921n3();
    public final boolean A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;

    private final void A03() {
        AnonymousClass00H r4 = this.A0B;
        C18030ve A0R = C108955ca.A0R(r4);
        C18040vf r3 = C18040vf.A01;
        if (!C18020vd.A05(r3, A0R, 7341)) {
            C17890vO.A0t(this.A00);
            C130936kF r1 = (C130936kF) this.A0N.get();
            boolean A072 = A07(this);
            AnonymousClass1Nb r7 = r1.A03;
            WfalManager wfalManager = (WfalManager) C18070vi.A0E(r1.A08);
            AnonymousClass1TG r32 = r1.A00;
            C32741hg r9 = r1.A05;
            AnonymousClass6MY r12 = new AnonymousClass6MY(wfalManager, r32, r1.A01, r1.A02, (CY4) C18070vi.A0E(r1.A06), r7, r1.A04, r9, this, (C30141dS) C18070vi.A0E(r1.A09), r1.A07, r1.A0A, A072);
            C17890vO.A0u(r12, AnonymousClass3MX.A0x(this.A0H));
            this.A00 = r12;
            return;
        }
        if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(r4), 11917)) {
            ((C200710s) this.A0G.get()).execute(AnonymousClass7RI.A00(this, 7));
            return;
        }
        boolean z = false;
        if (!(this.A03 == null || ((long) C18020vd.A00(r3, C108955ca.A0R(r4), 8126)) == 0)) {
            z = true;
        }
        C30391dr A0j = C108975cc.A0j(this.A03);
        AnonymousClass1OX A002 = C41561wd.A00(this);
        this.A03 = C30451dy.A02(AnonymousClass00R.A00, this.A0K, new StatusesViewModel$refreshStatuses$1(this, A0j, z), A002);
    }

    public C139106yE A0T(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        Map map = (Map) this.A04.A06();
        if (map != null) {
            return (C139106yE) map.get(userJid);
        }
        return null;
    }

    public void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        int A042 = C108955ca.A04(r5, 1);
        if (A042 == 2) {
            if (this.A0M) {
                C17880vN.A0V(this.A09).registerObserver(this.A07);
                C17880vN.A0V(this.A0D).registerObserver(this.A06);
            }
            this.A0I.set(false);
            A03();
        } else if (A042 == 3) {
            if (!C18020vd.A05(C18040vf.A01, C108955ca.A0R(this.A0B), 7341)) {
                AnonymousClass6MY r0 = this.A00;
                if (r0 != null) {
                    r0.A0B(true);
                }
                C108955ca.A1O(this.A01);
            }
            if (this.A0M) {
                C17880vN.A0V(this.A09).unregisterObserver(this.A07);
                C17880vN.A0V(this.A0D).unregisterObserver(this.A06);
            }
        }
    }

    public static final String A00(C111255jJ r2) {
        C139186yN r0 = (C139186yN) r2.A05.A06();
        if (r0 != null) {
            Map map = r0.A05;
            if (!map.isEmpty()) {
                return C200410p.A0I(",", "", "", map.keySet().toArray(new String[0]));
            }
        }
        return null;
    }

    public static void A05(C111255jJ r1, Collection collection) {
        Set A11 = C29431cG.A11(r1.A02);
        A11.addAll(collection);
        r1.A02 = A11;
    }

    public static final void A06(C111255jJ r3, C18090vk r4, boolean z) {
        if (!C18020vd.A05(C18040vf.A02, C108955ca.A0R(r3.A0B), 11917)) {
            AnonymousClass3MX.A1Q(new StatusesViewModel$runOnEntries$2(r3, (C30391dr) null, r4), C41561wd.A00(r3));
        } else if (!z) {
            r4.invoke();
        } else {
            ((C200710s) r3.A0G.get()).execute(AnonymousClass7RI.A00(r4, 8));
        }
    }

    public static final boolean A07(C111255jJ r9) {
        AnonymousClass00H r3 = r9.A0B;
        C18030ve A0R = C108955ca.A0R(r3);
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, A0R, 7266)) {
            int A002 = C18020vd.A00(r2, C108955ca.A0R(r3), 8023);
            AnonymousClass00H r6 = r9.A0P;
            if (AnonymousClass11P.A01((AnonymousClass11P) r9.A0O.get()) - C17880vN.A0K(r6).A0W("pref_regenerate_status_info_last_timestamp") > C17890vO.A03(A002)) {
                C17880vN.A0K(r6).A1i("pref_regenerate_status_info_last_timestamp");
                return true;
            }
        }
        return false;
    }

    public void A0V(AnonymousClass2HK r8, boolean z) {
        AnonymousClass1DT r2 = this.A05;
        C139186yN r5 = (C139186yN) r2.A06();
        if (r5 != null) {
            AnonymousClass00H r4 = this.A0F;
            ((C32741hg) r4.get()).A0E(true);
            C139186yN r6 = (C139186yN) r2.A06();
            if (r6 != null) {
                Map map = r6.A04;
                Map map2 = ((C32741hg) r4.get()).A0P;
                map2.clear();
                map2.putAll(map);
                C56092gt r1 = ((C32741hg) r4.get()).A00;
                if (r1 != null && !r1.A05 && r1.A08) {
                    ((C32741hg) r4.get()).A0H(r6.A05, r6.A02.size());
                }
            }
            ((C32741hg) r4.get()).A09(r8, r5, z, true);
        }
    }

    public final void A0W(AnonymousClass1BI r16, Integer num, Integer num2, boolean z) {
        UserJid A002;
        String str;
        C139186yN r3 = (C139186yN) this.A05.A06();
        if (r3 != null && (A002 = C22941Dw.A00(r16)) != null) {
            AnonymousClass00H r5 = this.A0F;
            r5.get();
            boolean z2 = true;
            Integer num3 = num;
            Integer num4 = num2;
            if (num != null) {
                int intValue = num3.intValue();
                if (!(intValue == 4 || intValue == 1 || intValue == 3 || intValue == 2)) {
                    z2 = false;
                }
                int i = 0;
                if (!z2) {
                    ((C32741hg) r5.get()).A0E(false);
                }
                if (num3.intValue() == 17) {
                    C32741hg r0 = (C32741hg) r5.get();
                    if (num2 != null) {
                        i = num4.intValue();
                    }
                    AnonymousClass71S r1 = r0.A01;
                    if (r1 != null) {
                        r1.A01 = 17;
                        r1.A02 = Integer.valueOf(i);
                    }
                }
            }
            if (!z) {
                C32741hg r6 = (C32741hg) r5.get();
                List list = r3.A02;
                List list2 = r3.A03;
                List list3 = r3.A01;
                Map map = null;
                if (z2) {
                    map = r3.A05;
                    str = A00(this);
                } else {
                    str = null;
                }
                r6.A0A(A002, num3, num4, str, list, list2, list3, map);
            }
        }
    }

    public void C6m(C139186yN r6) {
        this.A05.A0E(r6);
        List list = r6.A01;
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108985cd.A1N(A0D2, it);
        }
        Set A12 = C29431cG.A12(A0D2);
        C108955ca.A1O(this.A01);
        C116685yS r3 = new C116685yS(this);
        ((C37471pb) this.A0J.getValue()).A00(new C143627Ed(A12, this, 1), r3);
        this.A01 = r3;
    }

    public C111255jJ(AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, C18600wl r17, boolean z) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18070vi.A0x(r9, r10, r11, r12, r13);
        AnonymousClass00H r2 = r16;
        C18070vi.A0r(r14, r15, r2);
        C18600wl r1 = r17;
        C18070vi.A0d(r1, 14);
        this.A0O = r4;
        this.A0H = r5;
        this.A0E = r6;
        this.A09 = r7;
        this.A0C = r8;
        this.A0D = r9;
        this.A0P = r10;
        this.A0F = r11;
        this.A0N = r12;
        this.A0A = r13;
        this.A08 = r14;
        this.A0B = r15;
        this.A0G = r2;
        this.A0K = r1;
        this.A0M = z;
    }

    public static final void A04(Jid jid, C111255jJ r4) {
        UserJid A002 = C22941Dw.A00(jid);
        if (A002 != null) {
            if (C18020vd.A05(C18040vf.A01, C108955ca.A0R(r4.A0B), 7341)) {
                A06(r4, new AnonymousClass7S0(A002, r4, 14), true);
            } else {
                synchronized (r4) {
                    A05(r4, C18070vi.A0M(A002));
                }
            }
        }
        r4.A03();
    }

    public List A0U() {
        C98494rF A002 = C98494rF.A00();
        if (C18020vd.A05(C18040vf.A01, C108955ca.A0R(this.A0B), 7341)) {
            A002.element = C17880vN.A10(this.A02);
            A06(this, new AnonymousClass7S0(A002, this, 15), true);
        } else {
            synchronized (this) {
                A002.element = C17880vN.A10(this.A02);
                this.A02 = C25511Om.A00;
            }
        }
        return (List) A002.element;
    }
}
