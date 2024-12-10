package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4RT  reason: invalid class name */
public final class AnonymousClass4RT {
    public final AnonymousClass1KB A00;
    public final C33251iW A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1NN A05;
    public final AnonymousClass126 A06;
    public final AnonymousClass12M A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public final void A00(List list, int i, int i2, int i3, int i4) {
        long j;
        int i5 = i;
        if (i5 != -1) {
            AnonymousClass11E r2 = this.A02;
            if (!r2.A09()) {
                this.A00.A08(2131888361, 0);
                return;
            }
            List list2 = list;
            Iterator it = list2.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                AnonymousClass1CJ r1 = this.A04;
                AnonymousClass1M9 r0 = this.A03;
                C18070vi.A0b(A0Q);
                if (C43391zj.A00(r0, r1, A0Q) == 0) {
                    i6++;
                }
                if (!r2.A09()) {
                    this.A00.A08(2131889932, 1);
                } else {
                    C17960vV.A07(A0Q);
                    boolean A0d = C22971Dz.A0d(A0Q);
                    if (!A0d || !AnonymousClass3MW.A0V(this.A08).A0P((UserJid) A0Q)) {
                        if (C22971Dz.A0W(A0Q)) {
                            C18070vi.A0b(A0Q);
                            AnonymousClass12M r12 = this.A07;
                            C18070vi.A0z(A0Q, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                            AnonymousClass1EC r15 = (AnonymousClass1EC) A0Q;
                            r12.A0F(new C75033dN(this.A05, this.A06, r15, (String) null, (List) null, 224), r15, i5, 3);
                        } else if (A0d) {
                            C72453Mb.A1R(A0Q);
                            this.A01.A0Z((UserJid) A0Q, true, i5, 3);
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Ephemeral not supported for this type of jid, type=");
                            C18070vi.A0b(A0Q);
                            A10.append(A0Q.getType());
                            C17890vO.A0w(A10);
                        }
                        AnonymousClass4S2 r10 = (AnonymousClass4S2) this.A09.get();
                        C18070vi.A0d(A0Q, 0);
                        C81533zO r9 = new C81533zO();
                        r9.A02 = C17880vN.A0n(i5);
                        int i7 = i2;
                        if (i7 == -1) {
                            j = 0;
                        } else {
                            j = (long) i7;
                        }
                        r9.A03 = Long.valueOf(j);
                        r9.A00 = C17880vN.A0k();
                        r9.A04 = AnonymousClass3Ma.A14(r10.A03, A0Q);
                        if (C22971Dz.A0W(A0Q)) {
                            AnonymousClass1MZ r02 = r10.A00;
                            C199410f A082 = r02.A08.A0C(AnonymousClass3MY.A0b(A0Q)).A08();
                            C18070vi.A0X(A082);
                            r9.A01 = Integer.valueOf(C64002u3.A02(A082.size()));
                        }
                        r10.A02.CC7(r9);
                    } else {
                        int i8 = 2131889947;
                        if (i == 0) {
                            i8 = 2131889946;
                        }
                        this.A00.A08(i8, 1);
                    }
                }
            }
            AnonymousClass00H r13 = this.A09;
            int i9 = i4;
            ((AnonymousClass4S2) r13.get()).A01(list2, 3, i5, i6, i3, i9);
            if (list2.size() > 0) {
                ((AnonymousClass4S2) r13.get()).A00(2, i9);
            }
        }
    }

    public AnonymousClass4RT(AnonymousClass1KB r1, C33251iW r2, AnonymousClass11E r3, AnonymousClass1M9 r4, AnonymousClass1CJ r5, AnonymousClass1NN r6, AnonymousClass126 r7, AnonymousClass12M r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r1, r5, r2, r4, r9);
        C18070vi.A0x(r7, r8, r6, r10, r3);
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A09 = r10;
        this.A02 = r3;
    }
}
