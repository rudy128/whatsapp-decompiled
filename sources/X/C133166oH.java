package X;

import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6oH  reason: invalid class name and case insensitive filesystem */
public final class C133166oH {
    public final AnonymousClass11S A00;
    public final AnonymousClass1P3 A01;
    public final AnonymousClass1M4 A02;
    public final C24751Ln A03;
    public final AnonymousClass1RL A04;
    public final C58522kp A05;
    public final AnonymousClass1MR A06;
    public final C18030ve A07;
    public final C200710s A08;
    public final AnonymousClass00H A09;

    public final Set A00(Set set) {
        if (!C18020vd.A05(C18040vf.A02, this.A07, 7587)) {
            return set;
        }
        HashSet A12 = C17880vN.A12();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            if (A0S == null) {
                throw C17880vN.A0g();
            } else if (!C62832s4.A00(A0S)) {
                A12.add(A0S);
            }
        }
        return A12;
    }

    public C133166oH(AnonymousClass11S r2, AnonymousClass1P3 r3, AnonymousClass1M4 r4, C24751Ln r5, AnonymousClass1RL r6, C58522kp r7, AnonymousClass1MR r8, C18030ve r9, AnonymousClass10I r10, AnonymousClass00H r11) {
        C18070vi.A0w(r9, r2, r10, r11, r5);
        C18070vi.A0x(r3, r8, r7, r6, r4);
        this.A07 = r9;
        this.A00 = r2;
        this.A09 = r11;
        this.A03 = r5;
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = C200710s.A00(r10);
    }
}
