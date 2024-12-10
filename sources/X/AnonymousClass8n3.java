package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8n3  reason: invalid class name */
public final class AnonymousClass8n3 extends C60192nY {
    public final C20606ARq A00;
    public final AnonymousClass1S4 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1CJ A03;
    public final C26331Rs A04;
    public final AnonymousClass1Nb A05;
    public final C26371Rw A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1NN A08;
    public final C18140vp A09;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass1BI A022;
        C18070vi.A0d(a6u, 2);
        C166378cn r2 = a6u.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "lock") || strArr.length != 2 || !C18070vi.A18(a6u.A01, C62382rJ.A03) || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField1_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || (A022 = AnonymousClass1BI.A00.A02(strArr[1])) == null) {
            return null;
        }
        long j = r2.timestamp_;
        C19999A2n a2n = a6u.A02;
        AnonymousClass8Y9 r0 = r2.lockChatAction_;
        if (r0 == null) {
            r0 = AnonymousClass8Y9.DEFAULT_INSTANCE;
        }
        return new C170448ps(a2n, A022, str, j, z, r0.locked_);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A02(AnonymousClass8BW.A0q(this.A04, "lock"));
        A07(a8l);
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A02(AnonymousClass8BW.A0q(this.A04, "lock"));
        A08(a8l);
    }

    public boolean A0J() {
        return true;
    }

    public final C170448ps A0K(AnonymousClass1BI r9, boolean z) {
        C18070vi.A0d(r9, 0);
        return new C170448ps((C19999A2n) null, r9, (String) null, AnonymousClass11P.A01(this.A07), false, z);
    }

    private final void A01(AnonymousClass1BI r4, boolean z) {
        AnonymousClass1CJ r2 = this.A03;
        C29691ci A0A = r2.A0A(r4);
        if (A0A != null) {
            A0A.A0m = z;
            this.A02.A06(A0A);
            HashSet hashSet = r2.A01;
            if (z) {
                hashSet.add(r4);
            } else {
                hashSet.remove(r4);
            }
        }
        this.A08.A00();
        ((C32531hL) this.A09.get()).A03();
    }

    private final void A02(List list) {
        ArrayList A032 = C26331Rs.A03(this.A04, "lock", false);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            A00((C170448ps) it.next(), A13);
        }
        List<C170448ps> list2 = list;
        for (C170448ps A002 : list2) {
            A00(A002, A13);
        }
        Collection values = A13.values();
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : values) {
            if (((C170448ps) ((A24) next).A00).A00) {
                A132.add(next);
            }
        }
        List<A24> A003 = C21486Akr.A00(A132, 17);
        AnonymousClass1CJ r5 = this.A03;
        ArrayList A0G = r5.A0G();
        ArrayList A133 = AnonymousClass000.A13();
        Iterator it2 = A0G.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            AnonymousClass1BI A082 = ((C29691ci) next2).A08();
            C18070vi.A0X(A082);
            Iterator it3 = A003.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    A133.add(next2);
                    break;
                }
                A24 a24 = (A24) it3.next();
                if (!C18070vi.A18(a24.A02, A082)) {
                    if (C18070vi.A18(a24.A01, A082)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Iterator it4 = A133.iterator();
        while (it4.hasNext()) {
            AnonymousClass1BI A083 = ((C29691ci) it4.next()).A08();
            C18070vi.A0X(A083);
            A01(A083, false);
        }
        ArrayList A134 = AnonymousClass000.A13();
        for (Object next3 : A003) {
            AnonymousClass3MZ.A1V(next3, A134, r5.A0S(((A24) next3).A01) ? 1 : 0);
        }
        Iterator it5 = A134.iterator();
        while (it5.hasNext()) {
            A24 a242 = (A24) it5.next();
            AnonymousClass1BI r13 = a242.A01;
            A01(r13, true);
            if (r5.A0P(r13)) {
                C29691ci A0A = r5.A0A(r13);
                if (A0A != null && A0A.A0l) {
                    Log.i("LockChatHandler/setArchive - false");
                    A0A.A0l = false;
                    this.A02.A0J(A0A, true);
                    this.A00.A0I(C18070vi.A0P(new AnonymousClass8q1(this.A00.A02(r13, false), r13, a242.A00.A04, false)));
                }
                if (this.A05.A0y(r13)) {
                    Log.i("LockChatHandler/setPin - false");
                    this.A00.A0I(C18070vi.A0P(new C170468pu(r13, a242.A00.A04, false)));
                }
            }
        }
        ArrayList A0D = C29351c6.A0D(A003);
        for (A24 a243 : A003) {
            A0D.add(a243.A00);
        }
        list2.retainAll(A0D);
    }

    private final boolean A03(A24 a24, AnonymousClass1BI r10) {
        C170448ps r6 = (C170448ps) a24.A00;
        if (!r6.A00) {
            return false;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "archive";
        C17880vN.A1J(r10, A1Z, 1);
        String A002 = AnonymousClass9QR.A00(A1Z);
        String[] A1Z2 = C17880vN.A1Z();
        A1Z2[0] = "pin_v1";
        C17880vN.A1J(r10, A1Z2, 1);
        String A003 = AnonymousClass9QR.A00(A1Z2);
        C26331Rs r2 = this.A00;
        C20126A8l A0A = r2.A0A(A002);
        C20126A8l A0A2 = r2.A0A(A003);
        if (A04(r6, A0A) || A05(r6, A0A2)) {
            return true;
        }
        C20126A8l A092 = r2.A09(A002);
        C20126A8l A093 = r2.A09(A003);
        if (A04(r6, A092) || A05(r6, A093)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(C170448ps r6, C20126A8l a8l) {
        if (!(a8l instanceof AnonymousClass8q1)) {
            return false;
        }
        C166378cn A092 = a8l.A09();
        if (A092 != null) {
            AnonymousClass8ZV r0 = A092.archiveChatAction_;
            if ((r0 != null || (r0 = AnonymousClass8ZV.DEFAULT_INSTANCE) != null) && r0.archived_ && a8l.A04 > r6.A04) {
                return true;
            }
            return false;
        }
        throw C17880vN.A0g();
    }

    public static final boolean A05(C170448ps r6, C20126A8l a8l) {
        if (!(a8l instanceof C170468pu)) {
            return false;
        }
        C166378cn A092 = a8l.A09();
        if (A092 != null) {
            AnonymousClass8YE r0 = A092.pinAction_;
            if ((r0 != null || (r0 = AnonymousClass8YE.DEFAULT_INSTANCE) != null) && r0.pinned_ && a8l.A04 > r6.A04) {
                return true;
            }
            return false;
        }
        throw C17880vN.A0g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (A03(r5, r5.A02) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        A09(r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        A0B(r5.A00, r8);
        A02(X.AnonymousClass8BW.A0q(r6.A04, "lock"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r8 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r8.A04 < r5.A00.A04) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (A03(r5, r5.A01) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r5.A05 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r7, X.C20126A8l r8) {
        /*
            r6 = this;
            X.8qH r7 = (X.C170598qH) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.A24 r5 = X.C196619vM.A00(r7)
            if (r8 != 0) goto L_0x0017
            X.1Rs r0 = r6.A00
            X.C18070vi.A0W(r0)
            X.8qH r8 = X.C196619vM.A01(r5, r0)
            if (r8 == 0) goto L_0x0021
        L_0x0017:
            long r3 = r8.A04
            X.8qH r0 = r5.A00
            long r1 = r0.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0035
        L_0x0021:
            X.1BI r0 = r5.A01
            boolean r0 = r6.A03(r5, r0)
            if (r0 != 0) goto L_0x0035
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x003b
            X.1BI r0 = r5.A02
            boolean r0 = r6.A03(r5, r0)
            if (r0 == 0) goto L_0x003b
        L_0x0035:
            X.8qH r0 = r5.A00
            r6.A09(r0)
            return
        L_0x003b:
            X.8qH r0 = r5.A00
            r6.A0B(r0, r8)
            X.1Rs r1 = r6.A04
            java.lang.String r0 = "lock"
            java.util.ArrayList r0 = X.AnonymousClass8BW.A0q(r1, r0)
            r6.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8n3.A0I(X.A8l, X.A8l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8n3(C20606ARq aRq, C26371Rw r2, AnonymousClass1S4 r3, AnonymousClass11P r4, AnonymousClass1LW r5, AnonymousClass1CJ r6, AnonymousClass1NN r7, C26331Rs r8, AnonymousClass1Nb r9, C18140vp r10) {
        super(r8);
        C18070vi.A0w(r4, r5, r6, r2, r3);
        C18070vi.A0x(aRq, r9, r8, r7, r10);
        this.A07 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r2;
        this.A01 = r3;
        this.A00 = aRq;
        this.A05 = r9;
        this.A04 = r8;
        this.A08 = r7;
        this.A09 = r10;
    }

    private final void A00(C170448ps r8, Map map) {
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

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "lock";
    }

    public List A0F(boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A03.A0G().iterator();
        while (it.hasNext()) {
            C29691ci r1 = (C29691ci) it.next();
            try {
                long A012 = AnonymousClass11P.A01(this.A07);
                AnonymousClass1BI A082 = r1.A08();
                C18070vi.A0X(A082);
                A13.add(new C170448ps((C19999A2n) null, A082, (String) null, A012, false, true));
            } catch (NullPointerException e) {
                Log.e("LockChatHandler/createBootstrapMutations chatJid shouldn't be null", e);
            }
        }
        if (z) {
            A02(A13);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            C170598qH r2 = (C170598qH) it2.next();
            this.A06.A08(1);
            AnonymousClass1BI chatJid = r2.getChatJid();
            long j = r2.A04;
            A132.add(new AnonymousClass8q1(this.A00.A02(chatJid, false), chatJid, j, false));
            A132.add(new C170468pu(chatJid, j, false));
            A132.add(r2);
        }
        return A132;
    }
}
