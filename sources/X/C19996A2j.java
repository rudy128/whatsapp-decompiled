package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.A2j  reason: case insensitive filesystem */
public abstract class C19996A2j {
    public int A00;
    public long A01 = -1;
    public AnonymousClass22H A02;
    public List A03 = AnonymousClass000.A13();
    public List A04;
    public Map A05 = C17880vN.A13();
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1M9 A07;
    public final C24921Me A08;
    public final AnonymousClass118 A09;
    public final C18030ve A0A;
    public final AnonymousClass10I A0B;

    public final AnonymousClass22H A01() {
        AnonymousClass22H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pollMessage");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        if (r13 <= 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r19 = this;
            r4 = r19
            boolean r0 = r4 instanceof X.AnonymousClass96o
            if (r0 == 0) goto L_0x0019
            X.96o r4 = (X.AnonymousClass96o) r4
            X.10I r1 = r4.A02
            r0 = 23
            X.C21448AkF.A00(r1, r4, r0)
            java.lang.String r0 = "all_options"
            r4.A01 = r0
            r0 = 24
            X.C21448AkF.A00(r1, r4, r0)
            return
        L_0x0019:
            X.96n r4 = (X.C1769696n) r4
            X.22H r11 = r4.A01()
            java.util.List r0 = r4.A04
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            if (r0 != 0) goto L_0x00a6
            java.util.List r0 = r11.A07
            X.C18070vi.A0X(r0)
            r9.addAll(r0)
            X.Alu r2 = new X.Alu
            r2.<init>()
            r1 = 10
            X.Akk r0 = new X.Akk
            r0.<init>(r2, r1)
            X.C29391cC.A0H(r9, r0)
        L_0x003e:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A03 = r0
            r4.A04 = r9
            X.22H r0 = r4.A01()
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x00ee
            X.22H r0 = r4.A01()
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            boolean r6 = X.C22971Dz.A0e(r0)
            if (r6 == 0) goto L_0x00dc
            X.1MZ r2 = r4.A00
            X.22H r0 = r4.A01()
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r1, r0)
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r2.A08
            int r5 = r0.A09(r1)
            X.22H r0 = r4.A01()
            java.util.List r0 = r0.A17()
            if (r0 == 0) goto L_0x00dd
            java.util.HashSet r3 = X.C17880vN.A12()
            java.util.Iterator r2 = r0.iterator()
        L_0x0087:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r1 = r2.next()
            X.212 r1 = (X.AnonymousClass212) r1
            r0 = r1
            X.22E r0 = (X.AnonymousClass22E) r0
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0087
            X.1BI r0 = r1.A0H()
            r3.add(r0)
            goto L_0x0087
        L_0x00a6:
            java.util.Iterator r10 = r0.iterator()
        L_0x00aa:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r8 = r10.next()
            X.A18 r8 = (X.A18) r8
            java.util.List r0 = r11.A07
            java.util.Iterator r7 = X.AnonymousClass8BS.A0r(r0)
        L_0x00bc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r3 = r7.next()
            r0 = r3
            X.A18 r0 = (X.A18) r0
            long r5 = r0.A01
            long r1 = r8.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00aa
            r9.add(r3)
            goto L_0x00aa
        L_0x00d7:
            int r3 = r3.size()
            goto L_0x00de
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            r3 = 0
        L_0x00de:
            java.util.List r2 = r4.A03
            X.22H r0 = r4.A01()
            java.lang.String r1 = r0.A05
            X.Aax r0 = new X.Aax
            r0.<init>(r5, r3, r1, r6)
            r2.add(r0)
        L_0x00ee:
            X.22H r0 = r4.A01()
            java.util.List r0 = r0.A07
            X.C18070vi.A0X(r0)
            int r0 = A00(r0)
            long r0 = (long) r0
            java.util.Iterator r10 = r9.iterator()
        L_0x0100:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r5 = r10.next()
            X.A18 r5 = (X.A18) r5
            java.util.List r8 = r4.A03
            long r15 = r5.A01
            java.lang.String r12 = r5.A04
            X.C18070vi.A0X(r12)
            int r13 = r5.A00
            int r14 = r4.A00
            long r2 = (long) r13
            r7 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0123
            r17 = 1
            if (r13 > 0) goto L_0x0125
        L_0x0123:
            r17 = 0
        L_0x0125:
            X.Aay r11 = new X.Aay
            r18 = r7
            r11.<init>(r12, r13, r14, r15, r17, r18)
            r8.add(r11)
            java.util.Map r6 = r4.A05
            long r2 = r5.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r9 = X.AnonymousClass8BS.A0t(r2, r6)
            if (r9 == 0) goto L_0x0100
            java.util.Iterator r6 = r9.iterator()
        L_0x0141:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r3 = r6.next()
            r2 = 5
            if (r7 < r2) goto L_0x015f
            java.util.List r8 = r4.A03
            long r5 = r5.A01
            int r3 = X.AnonymousClass3MX.A02(r9, r7)
            X.Aav r2 = new X.Aav
            r2.<init>(r5, r3)
            r8.add(r2)
            goto L_0x0100
        L_0x015f:
            java.util.List r2 = r4.A03
            r2.add(r3)
            int r7 = r7 + 1
            goto L_0x0141
        L_0x0167:
            X.1DT r1 = r4.A06
            java.util.List r0 = r4.A03
            r1.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19996A2j.A02():void");
    }

    public void A03() {
        Object obj;
        if (this instanceof AnonymousClass96o) {
            AnonymousClass96o r4 = (AnonymousClass96o) this;
            if (C18070vi.A18(r4.A01, "all_options")) {
                r4.A02();
                return;
            }
            String str = r4.A01;
            if (str != null) {
                Iterator A0r = AnonymousClass8BS.A0r(r4.A01().A07);
                while (true) {
                    if (!A0r.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = A0r.next();
                    if (C18070vi.A18(((A18) obj).A02, str)) {
                        break;
                    }
                }
                A18 a18 = (A18) obj;
                if (a18 != null) {
                    r4.A04(a18.A01);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r7 <= 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(long r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass96o
            if (r0 == 0) goto L_0x003d
            r6 = r13
            X.96o r6 = (X.AnonymousClass96o) r6
            X.10I r5 = r6.A02
            r0 = 23
            X.C21448AkF.A00(r5, r6, r0)
            X.22H r0 = r6.A01()
            java.util.List r0 = r0.A07
            java.util.Iterator r4 = X.AnonymousClass8BS.A0r(r0)
        L_0x0018:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.A18 r0 = (X.A18) r0
            long r1 = r0.A01
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
        L_0x002b:
            X.A18 r3 = (X.A18) r3
            if (r3 == 0) goto L_0x003a
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x003a
            r6.A01 = r1
            r0 = 48
            X.AnonymousClass8BT.A1K(r5, r6, r1, r0)
        L_0x003a:
            return
        L_0x003b:
            r3 = 0
            goto L_0x002b
        L_0x003d:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r13.A03 = r0
            X.22H r0 = r13.A01()
            java.util.List r0 = r0.A07
            X.C18070vi.A0X(r0)
            int r2 = A00(r0)
            X.22H r0 = r13.A01()
            java.util.List r0 = r0.A07
            java.util.ArrayList r6 = X.C108965cb.A0t(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x005e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.A18 r0 = (X.A18) r0
            long r3 = r0.A01
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            r6.add(r1)
            goto L_0x005e
        L_0x0075:
            java.util.Iterator r4 = r6.iterator()
        L_0x0079:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r4.next()
            X.A18 r1 = (X.A18) r1
            java.util.List r0 = r13.A03
            long r9 = r1.A01
            java.lang.String r6 = r1.A04
            X.C18070vi.A0X(r6)
            int r7 = r1.A00
            int r8 = r13.A00
            if (r2 != r7) goto L_0x0097
            r11 = 1
            if (r7 > 0) goto L_0x0098
        L_0x0097:
            r11 = 0
        L_0x0098:
            r12 = 1
            X.Aay r5 = new X.Aay
            r5.<init>(r6, r7, r8, r9, r11, r12)
            r0.add(r5)
            java.util.Map r3 = r13.A05
            long r0 = r1.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r3.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x003a
            java.util.List r0 = r13.A03
            r0.addAll(r1)
            goto L_0x0079
        L_0x00b7:
            X.1DT r1 = r13.A06
            java.util.List r0 = r13.A03
            r1.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19996A2j.A04(long):void");
    }

    public C19996A2j(AnonymousClass1M9 r3, C24921Me r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass10I r7) {
        this.A09 = r5;
        this.A0A = r6;
        this.A07 = r3;
        this.A08 = r4;
        this.A0B = r7;
    }

    public static final int A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = ((A18) it.next()).A00;
            while (it.hasNext()) {
                int i2 = ((A18) it.next()).A00;
                if (i < i2) {
                    i = i2;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }
}
