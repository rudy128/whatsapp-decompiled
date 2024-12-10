package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.4oq  reason: invalid class name and case insensitive filesystem */
public class C97054oq implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C97054oq(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass1E1 r1 = (AnonymousClass1E1) this.A03;
                C108035b1 r5 = (C108035b1) obj;
                C18070vi.A0d(r5, 3);
                r5.BwN((AnonymousClass1E1) this.A01, r1, (PhoneUserJid) this.A02);
                return;
            case 1:
                AnonymousClass1E1 r12 = (AnonymousClass1E1) this.A03;
                C108035b1 r52 = (C108035b1) obj;
                C18070vi.A0d(r52, 3);
                r52.BwO((AnonymousClass1E1) this.A01, r12, (PhoneUserJid) this.A02);
                return;
            case 2:
                ((C107295Zd) obj).C9k((UserJid) this.A01, (Set) this.A02, (Set) this.A03);
                return;
            case 3:
                C29681ch r2 = (C29681ch) this.A02;
                C108105b8 r53 = (C108105b8) obj;
                C18070vi.A0d(r53, 3);
                r53.Bkr(r2, (Integer) this.A01, (Throwable) this.A03);
                return;
            default:
                PhoneUserJid phoneUserJid = (PhoneUserJid) this.A02;
                C179509Ig r22 = (C179509Ig) this.A03;
                AnonymousClass3VS r54 = (AnonymousClass3VS) obj;
                C18070vi.A0d(r54, 3);
                if (!r54.A06.A0O(phoneUserJid) || r54.A0E) {
                    r54.A03.A0E(new C85174Mj(r22, phoneUserJid));
                    return;
                }
                return;
        }
    }
}
