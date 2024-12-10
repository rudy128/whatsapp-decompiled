package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7P9  reason: invalid class name */
public final class AnonymousClass7P9 implements C22486B9s {
    public AnonymousClass1Nb A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1TG A02;
    public final C24661Le A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;

    public boolean BCL(C186309dz r19, C22484B9q b9q, AnonymousClass5YR r21) {
        C136546tz r0;
        Long l;
        Long l2;
        Integer valueOf;
        C186309dz r8 = r19;
        C22484B9q b9q2 = b9q;
        boolean A16 = C18070vi.A16(r21, r8);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = this.A02.A04((UserJid) null, -1).iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            UserJid A0I = A0Y.A0I();
            long A012 = AnonymousClass11P.A01(this.A01);
            Map map = r8.A01;
            String A0s = C17880vN.A0s("first", map);
            if (A0s != null) {
                l = Long.valueOf(Long.parseLong(A0s) * 60000);
            } else {
                l = null;
            }
            String A0s2 = C17880vN.A0s("second", map);
            if (A0s2 != null) {
                l2 = Long.valueOf(Long.parseLong(A0s2) * 60000);
            } else {
                l2 = null;
            }
            C22931Dv r02 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(A0I);
            if (!(A0I == null || A0I == AnonymousClass1E5.A00 || C72463Mc.A1U(A0I, this.A05))) {
                if (this.A03.A0K(A0Y, C18020vd.A05(C18040vf.A02, this.A04, 8880)) && !((A002 != null && this.A00.A0a(A002).A0U) || l == null || l2 == null)) {
                    long j = A0Y.A0I;
                    if (j >= A012 - l2.longValue() || j <= A012 - l.longValue()) {
                        if (A13.containsKey(A0I)) {
                            Number A1D = C108945cZ.A1D(A0I, A13);
                            if (A1D != null) {
                                valueOf = Integer.valueOf(A1D.intValue() + 1);
                            }
                            i++;
                        } else {
                            valueOf = Integer.valueOf(A16 ? 1 : 0);
                        }
                        A13.put(A0I, valueOf);
                        i++;
                    }
                }
            }
        }
        if ((b9q2 instanceof AnonymousClass7P5) && (r0 = ((AnonymousClass7P5) b9q2).A00) != null) {
            r0.A08 = A13;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass7P9(AnonymousClass11P r2, AnonymousClass1TG r3, C24661Le r4, C18030ve r5, AnonymousClass1Nb r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r5, r4, r7, r6);
        C18070vi.A0d(r3, 6);
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r7;
        this.A00 = r6;
        this.A02 = r3;
    }
}
