package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.4op  reason: invalid class name and case insensitive filesystem */
public class C97044op implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C97044op(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                ((C41011vf) obj).A00((AnonymousClass1EC) this.A01);
                return;
            case 1:
                C34201k6 r4 = (C34201k6) obj;
                C18070vi.A0d(r4, 2);
                r4.A06((GroupJid) this.A01, (List) this.A02);
                return;
            default:
                C29681ch r1 = (C29681ch) this.A02;
                C108105b8 r42 = (C108105b8) obj;
                C18070vi.A0d(r42, 2);
                r42.Bkv(r1, (Integer) this.A01);
                return;
        }
    }
}
