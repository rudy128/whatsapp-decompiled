package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1RP  reason: invalid class name */
public class AnonymousClass1RP implements C201511a {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1P3 A02;
    public final AnonymousClass1MZ A03;
    public final C26111Qw A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass1MR A0B;
    public final AnonymousClass1RO A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public static int A00(AnonymousClass206 r5, Set set) {
        int size = C29421cF.A0R(AnonymousClass1E3.class, set).size();
        int size2 = C29421cF.A0R(AnonymousClass1EE.class, set).size();
        if (size > 0) {
            if (size2 <= 0) {
                return 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MessageDeviceTargetManager/getLookupMode/invalid device set: ");
            sb.append(r5.A0v);
            sb.append(": ");
            sb.append(size);
            sb.append(" <> ");
            sb.append(size2);
            Log.w(sb.toString());
        } else if (size2 > 0) {
            return 2;
        }
        return 0;
    }

    public static HashSet A02(AnonymousClass1RP r6, AnonymousClass1BI r7, int i) {
        HashSet A052;
        HashSet hashSet = new HashSet();
        if (i == 58) {
            AnonymousClass1MZ r3 = r6.A03;
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1E9 A002 = C50242Tr.A00(r7);
            C17960vV.A07(A002);
            hashSet.addAll(r3.A08.A0C(A002).A0N(r6.A01, r6.A05, (C63182se) r6.A06.get(), false));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (C62832s4.A00((Jid) it.next())) {
                    it.remove();
                }
            }
        } else {
            if (i == 69) {
                if (C22971Dz.A0d(r7)) {
                    hashSet.add(DeviceJid.Companion.A02(r7));
                    return hashSet;
                } else if (C22971Dz.A0e(r7) && r6.A0C.A04(r7)) {
                    A052 = A03(r6, r7, (AnonymousClass206) null);
                }
            } else if (i == 77 && C22971Dz.A0d(r7)) {
                A052 = r6.A05(r7);
            }
            hashSet.addAll(A052);
        }
        return hashSet;
    }

    public static HashSet A03(AnonymousClass1RP r5, AnonymousClass1BI r6, AnonymousClass206 r7) {
        Object obj;
        HashSet hashSet = new HashSet();
        if (!C22971Dz.A0d(r6)) {
            if (((C57502jB) r5.A07.get()).A00(r7)) {
                hashSet = new HashSet();
                AnonymousClass1IZ it = C199410f.copyOf(r5.A03.A08.A0C((AnonymousClass1E9) r6).A08.values()).iterator();
                while (it.hasNext()) {
                    C199410f copyOf = C199410f.copyOf((Collection) ((C63312sr) it.next()).A05.keySet());
                    C18070vi.A0X(copyOf);
                    hashSet.addAll(copyOf);
                }
                Iterator it2 = hashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Jid jid = (Jid) it2.next();
                    if (!C22971Dz.A0T(jid)) {
                        AnonymousClass190 r3 = r5.A00;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding a non lid device ");
                        sb.append(jid);
                        sb.append(" on lid messaging");
                        r3.A0G("FanOutLidMessagingPnDevice", sb.toString(), false);
                        break;
                    }
                }
                AnonymousClass11S r1 = r5.A01;
                r1.A0I();
                hashSet.remove(r1.A02);
                obj = r1.A08();
            } else if (r7 == null || !C63792th.A03(r6, r7.A0u)) {
                AnonymousClass1MZ r2 = r5.A03;
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass1E9 A002 = C50242Tr.A00(r6);
                C17960vV.A07(A002);
                AnonymousClass1IZ it3 = r2.A08.A0C(A002).A0B().iterator();
                while (it3.hasNext()) {
                    C199410f copyOf2 = C199410f.copyOf((Collection) ((C63312sr) it3.next()).A05.keySet());
                    C18070vi.A0X(copyOf2);
                    hashSet.addAll(copyOf2);
                }
                Iterator it4 = hashSet.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Jid jid2 = (Jid) it4.next();
                    if (C22971Dz.A0T(jid2)) {
                        AnonymousClass190 r32 = r5.A00;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding a lid device ");
                        sb2.append(jid2);
                        sb2.append(" on regular messaging");
                        r32.A0G("FanOutMessagingLidDevice", sb2.toString(), false);
                        break;
                    }
                }
                AnonymousClass11S r02 = r5.A01;
                r02.A0I();
                obj = r02.A02;
            } else {
                A51 a51 = ((AnonymousClass212) r7).A05;
                if (a51 == null) {
                    r6 = null;
                } else {
                    r6 = a51.A00;
                }
            }
            hashSet.remove(obj);
            return hashSet;
        }
        return r5.A05(r6);
    }

    public static HashSet A04(AnonymousClass1RP r4, AnonymousClass206 r5) {
        HashSet A092;
        AnonymousClass1BI r0;
        AnonymousClass1BI r1 = r5.A0v.A00;
        if (C63792th.A03(r1, r5.A0u)) {
            A51 a51 = ((AnonymousClass212) r5).A05;
            if (a51 == null) {
                r0 = null;
            } else {
                r0 = a51.A00;
            }
            return r4.A05(r0);
        } else if (r1 instanceof AnonymousClass1E9) {
            Set A022 = r4.A04.A02(r5);
            HashSet hashSet = new HashSet(A022);
            for (UserJid A0A2 : C22971Dz.A0D(r4.A00, A022)) {
                hashSet.addAll(r4.A0B.A0A(A0A2));
            }
            boolean A002 = ((C57502jB) r4.A07.get()).A00(r5);
            AnonymousClass1MR r02 = r4.A0B;
            if (A002) {
                A092 = r02.A08();
            } else {
                A092 = r02.A09();
            }
            hashSet.addAll(A092);
            AnonymousClass11S r12 = r4.A01;
            r12.A0I();
            hashSet.remove(r12.A02);
            hashSet.remove(r12.A08());
            return hashSet;
        } else if (C22971Dz.A0d(r1)) {
            return A03(r4, r1, r5);
        } else {
            return null;
        }
    }

    private HashSet A05(AnonymousClass1BI r6) {
        HashSet A092;
        Object obj;
        HashSet hashSet = new HashSet();
        boolean z = r6 instanceof AnonymousClass1E2;
        AnonymousClass1MR r1 = this.A0B;
        if (z) {
            A092 = r1.A08();
        } else {
            A092 = r1.A09();
        }
        hashSet.addAll(A092);
        if (!this.A01.A0O(r6)) {
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(r6);
            C17960vV.A07(A012);
            hashSet.addAll(r1.A0A(A012));
        }
        if (C18020vd.A05(C18040vf.A02, ((AnonymousClass1UD) ((AnonymousClass1PW) this.A0D.get()).A01.get()).A00, 11965)) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Jid jid = (Jid) obj;
                if (C42701yb.A02(jid.user) && !C22971Dz.A0M(jid)) {
                    break;
                }
            }
            Jid jid2 = (Jid) obj;
            if (jid2 != null) {
                hashSet.remove(jid2);
                DeviceJid A022 = DeviceJid.Companion.A02(C42701yb.A00(jid2));
                C17960vV.A07(A022);
                C18070vi.A0X(A022);
                hashSet.add(A022);
            }
        }
        return hashSet;
    }

    public HashSet A06(AnonymousClass206 r7) {
        AnonymousClass1BI r5 = r7.A0v.A00;
        if ((r7 instanceof C436420i) || !AnonymousClass25A.A0P(this.A01, r7)) {
            return null;
        }
        if ((!C22971Dz.A0d(r5) && !(r5 instanceof AnonymousClass1E9)) || r7.A0G != 0 || r7.A13 != null) {
            return null;
        }
        if (r7 instanceof C442522s) {
            return A02(this, r5, r7.A0u);
        }
        return A03(this, r5, r7);
    }

    public Set A07(AnonymousClass206 r11) {
        AnonymousClass205 r1 = r11.A0v;
        AnonymousClass1BI r7 = r1.A00;
        boolean A012 = C42701yb.A01(r11.A0H());
        AnonymousClass11S r8 = this.A01;
        if (!r1.A02 && !AnonymousClass25A.A0R(r8, r11) && ((r11.A0u != 83 || !r8.A0O(r11.A0K)) && !A012)) {
            return null;
        }
        HashSet A042 = A04(this, r11);
        if (A042 != null && (r7 instanceof AnonymousClass1E9)) {
            if (r11.A0G != 0 || AnonymousClass25A.A0R(r8, r11) || ((r11.A0u == 83 && r8.A0O(r11.A0K)) || A012)) {
                A042.addAll(A03(this, r7, r11));
            }
            if (A00(r11, A042) != 2 && ((C57502jB) this.A07.get()).A00(r11)) {
                return C29431cG.A12(((C24751Ln) this.A0A.get()).A0N(A042).keySet());
            }
        }
        return A042;
    }

    public void A08(AnonymousClass206 r9, Set set) {
        Integer valueOf;
        Integer valueOf2;
        AnonymousClass1BI r4 = r9.A0v.A00;
        C22931Dv r0 = AnonymousClass1BI.A00;
        AnonymousClass1E9 A002 = C50242Tr.A00(r4);
        if (A002 != null) {
            int A003 = ((C59742mo) this.A08.get()).A00(A002);
            C53512ce r2 = (C53512ce) this.A09.get();
            boolean z = true;
            if (!set.isEmpty()) {
                if (C18020vd.A05(C18040vf.A02, r2.A01, 4162)) {
                    if (A003 == 0 || (A003 == 1 && ((!(r9 instanceof AnonymousClass212) || !((AnonymousClass212) r9).A1C()) && !r9.A11(16777216)))) {
                        z = false;
                    }
                    int size = set.size();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        Jid jid = (Jid) it.next();
                        C18070vi.A0d(jid, 1);
                        if (z != C22971Dz.A0T(jid)) {
                            it.remove();
                        }
                    }
                    set.size();
                    if (size != set.size()) {
                        int size2 = set.size();
                        if (z) {
                            valueOf = Integer.valueOf(size2);
                            valueOf2 = Integer.valueOf(size - set.size());
                        } else {
                            valueOf = Integer.valueOf(size - size2);
                            valueOf2 = Integer.valueOf(set.size());
                        }
                        AnonymousClass190 r22 = r2.A00;
                        StringBuilder sb = new StringBuilder();
                        sb.append(valueOf.intValue());
                        sb.append(" lid participants & ");
                        sb.append(valueOf2.intValue());
                        sb.append(" pn participants");
                        r22.A0G("GroupLidInfra/outgoing_message", sb.toString(), false);
                    }
                }
            }
        }
        this.A0E.get();
        if (r4 != null && !set.isEmpty()) {
            set.size();
            if (C62832s4.A01(r4) || (r9 instanceof AnonymousClass219)) {
                C29401cD.A0M(set, AnonymousClass3J0.A00, true);
            }
            set.size();
        }
    }

    public AnonymousClass1RP(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass1P3 r3, AnonymousClass1MZ r4, C26111Qw r5, AnonymousClass1MR r6, C18030ve r7, AnonymousClass1RO r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A05 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A0D = r9;
        this.A08 = r10;
        this.A0C = r8;
        this.A0A = r11;
        this.A02 = r3;
        this.A0B = r6;
        this.A0E = r12;
        this.A04 = r5;
        this.A07 = r13;
        this.A03 = r4;
        this.A06 = r14;
        this.A09 = r15;
    }

    public static ArrayList A01(Set set) {
        ArrayList A062 = C63962tz.A06(set);
        ArrayList arrayList = new ArrayList();
        int size = A062.size() / 100;
        int size2 = A062.size() % 100;
        int i = 0;
        while (i < size) {
            int i2 = i * 100;
            i++;
            arrayList.add(A062.subList(i2, i * 100));
        }
        if (size2 > 0) {
            arrayList.add(A062.subList(A062.size() - size2, A062.size()));
        }
        return arrayList;
    }
}
