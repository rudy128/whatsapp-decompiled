package X;

import com.facebook.stash.core.FileStash;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9AZ  reason: invalid class name */
public final class AnonymousClass9AZ extends C24741Lm {
    public FileStash A00;
    public final C200710s A01;
    public final Map A02 = AnonymousClass8BW.A0u();
    public final Map A03 = AnonymousClass8BW.A0u();
    public final AnonymousClass11P A04;
    public final C25655Cjl A05;

    public static final synchronized void A00(AnonymousClass9AZ r2) {
        synchronized (r2) {
            if (r2.A00 == null && !C22781De.A03()) {
                r2.A00 = r2.A05.A01(113);
            }
        }
    }

    public String BZc() {
        String A0t;
        Map map = this.A02;
        synchronized (map) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ar_effects:surfaces=");
            A10.append(map.keySet().size());
            A10.append(";categories=");
            Iterator A0l = C17890vO.A0l(map);
            int i = 0;
            while (A0l.hasNext()) {
                i += ((Map) A0l.next()).size();
            }
            A10.append(i);
            A10.append(";effects_in_list=");
            Iterator A0l2 = C17890vO.A0l(map);
            int i2 = 0;
            while (A0l2.hasNext()) {
                Iterator A0l3 = C17890vO.A0l((Map) A0l2.next());
                int i3 = 0;
                while (A0l3.hasNext()) {
                    i3 += ((C196119uU) A0l3.next()).A00.size();
                }
                i2 += i3;
            }
            A10.append(i2);
            A10.append(";single_effects=");
            A0t = C17880vN.A0t(A10, this.A03.size());
        }
        return A0t;
    }

    public void C9L(C122516Qr r2, boolean z) {
        this.A02.clear();
        this.A03.clear();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AZ(AnonymousClass11P r2, C25655Cjl cjl, C24571Kv r4, AnonymousClass10I r5) {
        super(r4);
        C18070vi.A0s(r5, r4, r2, cjl);
        this.A04 = r2;
        this.A05 = cjl;
        this.A01 = C200710s.A00(r5);
        A09();
    }
}
