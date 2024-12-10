package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.35P  reason: invalid class name */
public class AnonymousClass35P implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AnonymousClass35P(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass1VR r4 = (AnonymousClass1VR) obj;
                r4.A05(this.A02, (Integer) this.A01);
                return;
            case 1:
                String str = this.A02;
                C34171k3 r42 = (C34171k3) obj;
                C18070vi.A0d(r42, 2);
                r42.A01((UserJid) this.A01, str);
                return;
            case 2:
                AnonymousClass8B1 r43 = (AnonymousClass8B1) obj;
                C18070vi.A0d(r43, 2);
                r43.Bm2(this.A02, (Map) this.A01);
                return;
            case 3:
                ((C40981vc) obj).BAF((AnonymousClass1BI) this.A01, this.A02);
                return;
            default:
                String str2 = this.A02;
                AnonymousClass89O r44 = (AnonymousClass89O) obj;
                C18070vi.A0d(r44, 2);
                r44.CAG((List) this.A01, str2);
                return;
        }
    }
}
