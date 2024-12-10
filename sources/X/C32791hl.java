package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1hl  reason: invalid class name and case insensitive filesystem */
public class C32791hl {
    public final AnonymousClass11P A00;
    public final AnonymousClass1Nb A01;
    public final AnonymousClass00H A02;
    public final C19880zA A03;
    public final AnonymousClass1KB A04;
    public final C28721an A05;
    public final C19830z4 A06;
    public final C22621Co A07;
    public final AnonymousClass1CJ A08;
    public final AnonymousClass1NN A09;
    public final AnonymousClass1R3 A0A;
    public final C18030ve A0B;
    public final C32291gx A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public void A00(AnonymousClass1BI r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        A01(r9, i, i2, z, z2, false, z3);
    }

    public void A03(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass1BI r3 = (AnonymousClass1BI) it.next();
                if (!C22971Dz.A0c(r3)) {
                    boolean z = false;
                    if (collection.size() > 1) {
                        z = true;
                    }
                    A01(r3, 3, 4, true, true, true, z);
                }
            } else {
                this.A0C.A08();
                return;
            }
        }
    }

    public void A01(AnonymousClass1BI r21, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C22621Co r5 = this.A07;
        AnonymousClass1BI r6 = r21;
        boolean z5 = false;
        if (r5.A0B(r6)) {
            int i3 = this.A08.A0B(r6).A00;
            if (i3 > 0) {
                A74 a74 = (A74) this.A0E.get();
                if (C42761yh.A01(a74.A01, r6)) {
                    a74.A03.CGF(new C21470Akb((Object) a74, i3, 10, (Object) r6));
                }
            }
            if (z2) {
                this.A0C.A09(r6);
            }
            this.A0C.A0A(r6, (AnonymousClass206) null);
            int i4 = i;
            boolean z6 = z4;
            if (i4 == 3) {
                this.A0D.CGF(new AnonymousClass7RR(this, r6, i2, 5, z6));
            }
            C22621Co.A00(r5, r6, (AnonymousClass206) null, 0, 0, i4, z, z3, z6);
            C19830z4 r1 = this.A06;
            C19830z4.A00(r1).putLong("last_read_conversation_time", AnonymousClass11P.A01(this.A00)).apply();
            z5 = true;
        }
        if (C18020vd.A05(C18040vf.A02, this.A0B, 11087)) {
            this.A0D.CGF(new C146497Pi(this, r6, 32));
        }
        this.A0G.get();
        if (z5) {
            this.A04.A0K(new C70773Cl(this.A09, r6, this.A05, 18), 300);
        }
    }

    public void A02(AnonymousClass1BI r9, boolean z) {
        StringBuilder sb;
        C22621Co r3 = this.A07;
        AnonymousClass00H r2 = r3.A01;
        AnonymousClass1BI r4 = r9;
        ((C28771as) r2.get()).A01.A00(r9, 8);
        C29691ci A0A2 = r3.A00.A0A(r9);
        if (A0A2 == null) {
            sb.append("ChatManager/setchatunseen/nochat ");
            sb.append(r9);
            Log.i(sb.toString());
        } else {
            sb = new StringBuilder();
            sb.append("ChatManager/setchatunseen ");
            sb.append(r9);
            sb.append("/");
            sb.append(A0A2.A0B());
            Log.i(sb.toString());
            A0A2.A0K(-1, 0, 0, 0);
            ((C31931gM) ((C28771as) r2.get()).A0L.get()).A01(new AnonymousClass7RT(r3, r4, A0A2, 22, z), 1);
        }
        this.A09.A02(r9);
    }

    public C32791hl(C19880zA r2, AnonymousClass1KB r3, C28721an r4, AnonymousClass11P r5, C19830z4 r6, C22621Co r7, AnonymousClass1CJ r8, AnonymousClass1NN r9, AnonymousClass1R3 r10, C18030ve r11, C32291gx r12, AnonymousClass1Nb r13, AnonymousClass10I r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A00 = r5;
        this.A0B = r11;
        this.A04 = r3;
        this.A0D = r14;
        this.A08 = r8;
        this.A07 = r7;
        this.A0E = r15;
        this.A05 = r4;
        this.A0F = r16;
        this.A0A = r10;
        this.A01 = r13;
        this.A0C = r12;
        this.A0G = r17;
        this.A06 = r6;
        this.A09 = r9;
        this.A03 = r2;
        this.A02 = r18;
    }
}
