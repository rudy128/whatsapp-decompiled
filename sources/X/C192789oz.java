package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9oz  reason: invalid class name and case insensitive filesystem */
public final class C192789oz {
    public final C185569cn A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final Map A04 = C17880vN.A13();
    public final AnonymousClass1KB A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.AN6] */
    public final void A00(AnonymousClass1DT r9, A20 a20) {
        C18070vi.A0d(r9, 1);
        Map map = this.A04;
        C20501ANm aNm = (C20501ANm) map.get(a20);
        if (aNm == null) {
            aNm = new C20501ANm(this.A05, (C20114A7x) C18070vi.A0E(this.A02), this.A00, a20.A01, a20.A04);
            map.put(a20, aNm);
        }
        aNm.A02 = r9;
        int i = aNm.A01;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = C20501ANm.A00(aNm);
        AnonymousClass1DT r0 = aNm.A02;
        if (r0 != null) {
            r0.A0F(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.AN6] */
    /* JADX WARNING: type inference failed for: r0v44, types: [java.lang.Object, X.AN6] */
    public final void A01(A20 a20) {
        AN6 an6;
        int ceil;
        ArrayList A13;
        Map map = this.A04;
        A20 a202 = a20;
        C20501ANm aNm = (C20501ANm) map.get(a202);
        if (aNm == null) {
            aNm = new C20501ANm(this.A05, (C20114A7x) C18070vi.A0E(this.A02), this.A00, a202.A01, a202.A04);
            map.put(a202, aNm);
        }
        int i = aNm.A01;
        int i2 = 0;
        if (i != 0) {
            if (i != 5) {
                int i3 = aNm.A00;
                List list = aNm.A06;
                if (i3 < list.size()) {
                    C185569cn r5 = aNm.A04;
                    int size = list.size();
                    boolean A1P = AnonymousClass000.A1P(aNm.A00);
                    float f = (float) C108965cb.A08(r5.A01.A00).heightPixels;
                    float f2 = r5.A00;
                    if (f < f2) {
                        ceil = 1;
                    } else {
                        ceil = (int) Math.ceil((double) (f / f2));
                    }
                    if (!A1P || size >= ceil * 3) {
                        size = ceil * 2;
                    }
                    C18030ve r1 = r5.A02;
                    C18040vf r6 = C18040vf.A02;
                    int A002 = C18020vd.A00(r6, r1, 464);
                    if (A002 > size) {
                        A002 = size;
                    }
                    int i4 = aNm.A00;
                    int size2 = list.size();
                    int i5 = aNm.A00 + A002;
                    if (size2 > i5) {
                        size2 = i5;
                    }
                    if (i4 > size2) {
                        A13 = AnonymousClass000.A13();
                    } else {
                        List subList = list.subList(i4, size2);
                        aNm.A00 += A002;
                        A13 = AnonymousClass000.A13();
                        Iterator it = subList.iterator();
                        while (it.hasNext()) {
                            String A0v = C17880vN.A0v(it);
                            if (aNm.A03.A0A((UserJid) null, A0v) == null) {
                                A13.add(A0v);
                            }
                        }
                    }
                    if (!A13.isEmpty()) {
                        A20 a203 = new A20(a202.A00, a202.A01, a202.A03, a202.A02, A13);
                        UserJid userJid = a203.A01;
                        AnonymousClass00H r3 = this.A03;
                        if ((!((A5Q) r3.get()).A00.A0O(userJid) || !C18020vd.A05(r6, this.A01, 8799)) && (((A5Q) r3.get()).A00.A0O(userJid) || !C18020vd.A05(r6, this.A01, 1096))) {
                            A6T a6t = new A6T(this.A07, 1);
                            String str = a203.A03;
                            String str2 = a203.A02;
                            List list2 = a203.A04;
                            AnonymousClass10E r12 = ((C186449eD) this.A06.get()).A01.A00.A00;
                            C167868hu r62 = new C167868hu(AnonymousClass3MY.A0N(r12), AnonymousClass8BT.A0D(r12), aNm, a6t, userJid, (C19949A0g) r12.A4W.get(), AnonymousClass8BU.A0K(r12), (C183479Yk) r12.A0w.get(), str, str2, list2);
                            C20997Acp.A01(r62.A01, r62);
                            return;
                        }
                        ((A5Q) r3.get()).A04(a203, aNm);
                        return;
                    } else if (aNm.A00 < list.size()) {
                        ArrayList A132 = AnonymousClass000.A13();
                        ? obj = new Object();
                        obj.A00 = 1;
                        obj.A01 = A132;
                        an6 = obj;
                        aNm.CBu(an6);
                    }
                }
            }
            i2 = 5;
        }
        ? obj2 = new Object();
        obj2.A00 = i2;
        an6 = obj2;
        aNm.CBu(an6);
    }

    public C192789oz(AnonymousClass1KB r2, AnonymousClass118 r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r2, r3, r5, r6);
        C18070vi.A0l(r7, r8);
        this.A01 = r4;
        this.A05 = r2;
        this.A02 = r5;
        this.A07 = r6;
        this.A03 = r7;
        this.A06 = r8;
        this.A00 = new C185569cn(r3, r4);
    }
}
