package X;

import com.whatsapp.areffects.arclass.ArClassManager;
import com.whatsapp.areffects.util.ArEffectsGatingUtil;

/* renamed from: X.4Qs  reason: invalid class name and case insensitive filesystem */
public final class C86204Qs {
    public final ArClassManager A00;
    public final ArEffectsGatingUtil A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;

    public final C88544a4 A00(C107855aj r9, C92384hD r10) {
        C107855aj r2 = r9;
        C92384hD r3 = r10;
        C18070vi.A0h(r9, r10);
        boolean Be7 = r9.BUq().Be7();
        AnonymousClass11P r5 = this.A02;
        C18030ve r6 = this.A03;
        AnonymousClass18K r7 = this.A04;
        ArClassManager arClassManager = this.A00;
        ArEffectsGatingUtil arEffectsGatingUtil = this.A01;
        if (Be7) {
            return new C23804Bpt(arClassManager, r2, r3, arEffectsGatingUtil, r5, r6, r7);
        }
        return new C23803Bps(arClassManager, r2, r3, arEffectsGatingUtil, r5, r6, r7);
    }

    public C86204Qs(ArClassManager arClassManager, ArEffectsGatingUtil arEffectsGatingUtil, AnonymousClass11P r3, C18030ve r4, AnonymousClass18K r5) {
        C18070vi.A0s(r3, r4, r5, arClassManager);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = arClassManager;
        this.A01 = arEffectsGatingUtil;
    }
}
