package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2xf  reason: invalid class name and case insensitive filesystem */
public final class C66122xf implements AnonymousClass191 {
    public C30811eY A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final C18010vc A03;

    public void Blg() {
    }

    public void Blf() {
        if (C18020vd.A05(C18040vf.A02, this.A01, 6122)) {
            ArrayList A022 = this.A00.A02();
            if (C17880vN.A1X(A022)) {
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    C60082nM r1 = (C60082nM) it.next();
                    C18070vi.A0b(r1);
                    UserJid userJid = r1.A04;
                    C18070vi.A0W(userJid);
                    String str = r1.A08;
                    C18070vi.A0W(str);
                    ((A5T) this.A02.get()).A07(new AnonymousClass2DX(userJid, str, r1.A05, r1.A01, r1.A02, r1.A0A));
                }
                return;
            }
            return;
        }
        ArrayList A04 = ((A5T) this.A02.get()).A04();
        if (C17880vN.A1X(A04)) {
            Iterator it2 = A04.iterator();
            while (it2.hasNext()) {
                AnonymousClass2DX r3 = (AnonymousClass2DX) it2.next();
                C30811eY r2 = this.A00;
                C18070vi.A0b(r3);
                UserJid userJid2 = r3.A00;
                String str2 = r3.A03;
                String str3 = r3.A02;
                long j = r3.A00;
                C56112gv r5 = new C56112gv(userJid2, str2, str3, j, j);
                r5.A01 = r3.A01;
                r5.A05 = r3.A04;
                r2.A03(new C60082nM(r5));
            }
        }
    }

    public C66122xf(C18030ve r3, C18010vc r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A00 = new C30811eY(r4, "entry_point_conversions_for_sending");
    }

    public void Ba9() {
    }
}
