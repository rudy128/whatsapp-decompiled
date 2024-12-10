package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8n1  reason: invalid class name */
public final class AnonymousClass8n1 extends C60192nY {
    public final C20606ARq A00;
    public final AnonymousClass1S4 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass1NN A04;
    public final C26331Rs A05;
    public final AnonymousClass1Nb A06;
    public final C26371Rw A07;
    public final AnonymousClass11P A08;

    public /* bridge */ /* synthetic */ C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        String[] strArr = a6u.A06;
        C62382rJ r4 = a6u.A01;
        C166378cn r3 = a6u.A03;
        if (strArr.length != 2 || !AnonymousClass8BU.A1a("pin_v1", strArr)) {
            return null;
        }
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(strArr[1]);
        if (A022 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("pin-chat-mutation/from-key-value unable to create chat jid from ");
            C17890vO.A19(A10, strArr[1]);
            return null;
        } else if (!C62382rJ.A03.equals(r4) || r3 == null || !AnonymousClass8BW.A1Q(r3.bitField0_) || (r3.bitField0_ & 16) == 0) {
            return null;
        } else {
            AnonymousClass8YE r0 = r3.pinAction_;
            AnonymousClass8YE r1 = r0;
            if (r0 == null) {
                r0 = AnonymousClass8YE.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 1) == 0) {
                return null;
            }
            if (r1 == null) {
                r1 = AnonymousClass8YE.DEFAULT_INSTANCE;
            }
            boolean z2 = r1.pinned_;
            return new C170468pu(a6u.A02, A022, str, r3.timestamp_, z2, z);
        }
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A01(AnonymousClass8BW.A0q(this.A05, "pin_v1"));
        A07(a8l);
        this.A04.A00();
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A01(AnonymousClass8BW.A0q(this.A05, "pin_v1"));
        A08(a8l);
        this.A04.A00();
    }

    public boolean A0J() {
        return true;
    }

    public final C170468pu A0K(AnonymousClass1BI r4, boolean z) {
        C18070vi.A0d(r4, 0);
        this.A07.A08(1);
        return new C170468pu(r4, AnonymousClass11P.A01(this.A08), z);
    }

    private final void A01(List list) {
        C29691ci A0A;
        ArrayList A032 = C26331Rs.A03(this.A05, "pin_v1", false);
        HashMap A11 = C17880vN.A11();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            A00((C170468pu) it.next(), A11);
        }
        List<C170468pu> list2 = list;
        for (C170468pu A002 : list2) {
            A00(A002, A11);
        }
        ArrayList A10 = C17880vN.A10(A11.values());
        C29401cD.A0N(A10, B27.A00);
        List<A24> A0v = C29431cG.A0v(C21486Akr.A00(A10, 18), Math.min(A10.size(), 3));
        AnonymousClass1Nb r4 = this.A06;
        Set A0f = r4.A0f();
        ArrayList A0t = C108965cb.A0t(A0f);
        for (Object next : A0f) {
            C18070vi.A0b(next);
            Iterator it2 = A0v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    A0t.add(next);
                    break;
                }
                A24 a24 = (A24) it2.next();
                if (!C18070vi.A18(a24.A02, next)) {
                    if (C18070vi.A18(a24.A01, next)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Iterator it3 = A0t.iterator();
        while (it3.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it3);
            this.A07.A08(2);
            C18070vi.A0b(A0Q);
            r4.A0b(A0Q);
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next2 : A0v) {
            A24 a242 = (A24) next2;
            if (!A0f.contains(a242.A02) && !A0f.contains(a242.A01)) {
                A13.add(next2);
            }
        }
        Iterator it4 = A13.iterator();
        while (it4.hasNext()) {
            A24 a243 = (A24) it4.next();
            AnonymousClass1BI r13 = a243.A01;
            long j = a243.A00.A04;
            r4.A0c(r13, j);
            AnonymousClass1CJ r1 = this.A03;
            if (r1.A0P(r13) && (A0A = r1.A0A(r13)) != null && A0A.A0l) {
                Log.i("PinChatHandler/setArchive - false");
                A0A.A0l = false;
                this.A02.A0J(A0A, true);
                this.A00.A0I(C18070vi.A0P(new AnonymousClass8q1(this.A00.A02(r13, false), r13, j, false)));
            }
        }
        ArrayList A0D = C29351c6.A0D(A0v);
        for (A24 a244 : A0v) {
            A0D.add(a244.A00);
        }
        list2.retainAll(A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r6.A05 != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (A02(r6, r6.A02) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        A09(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        A0B(r3, r9);
        A01(X.AnonymousClass8BW.A0q(r7.A05, "pin_v1"));
        r7.A04.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r9 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r4 < r3.A04) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r3 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (((X.C170468pu) r3).A00 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (A02(r6, r6.A01) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r8, X.C20126A8l r9) {
        /*
            r7 = this;
            X.8qH r8 = (X.C170598qH) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.A24 r6 = X.C196619vM.A00(r8)
            if (r9 != 0) goto L_0x0017
            X.1Rs r0 = r7.A00
            X.C18070vi.A0W(r0)
            X.8qH r9 = X.C196619vM.A01(r6, r0)
            if (r9 == 0) goto L_0x0021
        L_0x0017:
            long r4 = r9.A04
            X.8qH r3 = r6.A00
            long r1 = r3.A04
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
        L_0x0021:
            X.8qH r3 = r6.A00
            r0 = r3
            X.8pu r0 = (X.C170468pu) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0042
            X.1BI r0 = r6.A01
            boolean r0 = r7.A02(r6, r0)
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0042
            X.1BI r0 = r6.A02
            boolean r0 = r7.A02(r6, r0)
            if (r0 == 0) goto L_0x0042
        L_0x003e:
            r7.A09(r3)
            return
        L_0x0042:
            r7.A0B(r3, r9)
            X.1Rs r1 = r7.A05
            java.lang.String r0 = "pin_v1"
            java.util.ArrayList r0 = X.AnonymousClass8BW.A0q(r1, r0)
            r7.A01(r0)
            X.1NN r0 = r7.A04
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8n1.A0I(X.A8l, X.A8l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8n1(C20606ARq aRq, C26371Rw r3, AnonymousClass1S4 r4, AnonymousClass11P r5, AnonymousClass1LW r6, AnonymousClass1CJ r7, AnonymousClass1NN r8, C26331Rs r9, AnonymousClass1Nb r10) {
        super(r9);
        C18070vi.A0w(r5, r6, r7, aRq, r3);
        C18070vi.A0q(r4, r10, r9);
        C18070vi.A0d(r8, 9);
        this.A08 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A00 = aRq;
        this.A07 = r3;
        this.A01 = r4;
        this.A06 = r10;
        this.A05 = r9;
        this.A04 = r8;
    }

    private final void A00(C170468pu r8, Map map) {
        String str;
        C170598qH r5;
        A24 A002 = C196619vM.A00(r8);
        if (!A002.A05) {
            String str2 = A002.A04;
            if (map.containsKey(str2) || map.containsKey(A002.A03)) {
                AnonymousClass1BI r0 = A002.A02;
                AnonymousClass1BI chatJid = r8.getChatJid();
                C170598qH r6 = null;
                if (C18070vi.A18(r0, chatJid)) {
                    r5 = r8;
                } else {
                    A24 a24 = (A24) map.get(str2);
                    if (a24 != null) {
                        r5 = a24.A00;
                    } else {
                        r5 = null;
                    }
                }
                if (C18070vi.A18(A002.A01, chatJid)) {
                    r6 = r8;
                } else {
                    A24 a242 = (A24) map.get(A002.A03);
                    if (a242 != null) {
                        r6 = a242.A00;
                    }
                }
                if (!(r5 == null || r6 == null)) {
                    if (r5.A04 > r6.A04) {
                        map.remove(r6.A0A());
                        str = r6.A0A();
                        A002 = C196619vM.A00(r5);
                    } else {
                        map.remove(r5.A0A());
                        str = r6.A0A();
                        A002 = C196619vM.A00(r6);
                    }
                    map.put(str, A002);
                }
            }
        }
        str = r8.A0A();
        map.put(str, A002);
    }

    private final boolean A02(A24 a24, AnonymousClass1BI r11) {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "archive";
        C17880vN.A1J(r11, A1Z, 1);
        String A002 = AnonymousClass9QR.A00(A1Z);
        C26331Rs r7 = this.A00;
        C20126A8l A0A = r7.A0A(A002);
        if (A0A != null) {
            C166378cn A09 = A0A.A09();
            if (A09 != null) {
                AnonymousClass8ZV r0 = A09.archiveChatAction_;
                if (r0 == null) {
                    r0 = AnonymousClass8ZV.DEFAULT_INSTANCE;
                }
                if (r0.archived_ && A0A.A04 > a24.A00.A04) {
                    return true;
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
        C20126A8l A092 = r7.A09(A002);
        if (A092 == null) {
            return false;
        }
        C166378cn A093 = A092.A09();
        if (A093 != null) {
            AnonymousClass8ZV r02 = A093.archiveChatAction_;
            if (r02 == null) {
                r02 = AnonymousClass8ZV.DEFAULT_INSTANCE;
            }
            if (!r02.archived_ || A092.A04 <= a24.A00.A04) {
                return false;
            }
            return true;
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "pin_v1";
    }

    public List A0F(boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A15 = AnonymousClass000.A15(AnonymousClass1Nb.A05(this.A06, true));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            AnonymousClass1BI r3 = (AnonymousClass1BI) A16.getKey();
            Number number = (Number) A16.getValue();
            C18070vi.A0b(r3);
            C18070vi.A0b(number);
            A13.add(new C170468pu(r3, number.longValue(), true));
        }
        if (z) {
            A01(A13);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C170598qH r1 = (C170598qH) it.next();
            this.A07.A08(1);
            AnonymousClass1BI chatJid = r1.getChatJid();
            A132.add(new AnonymousClass8q1(this.A00.A02(chatJid, false), chatJid, AnonymousClass11P.A01(this.A08), false));
            A132.add(r1);
        }
        return A132;
    }
}
