package com.whatsapp.bot.botmemory;

import X.AnonymousClass00H;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C115745vg;
import X.C139776zQ;
import X.C18070vi;
import X.C30391dr;
import X.C34081jt;
import X.C41561wd;
import java.util.List;

public final class MemoryViewModel extends AnonymousClass1J2 {
    public Integer A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1G4 A03;
    public final AnonymousClass1G1 A04;

    public void A0S() {
        Integer num = this.A00;
        if (num != null) {
            ((C139776zQ) this.A01.get()).A01(num.intValue());
        }
    }

    public final void A0U(List list) {
        AnonymousClass1G4 r3 = this.A03;
        do {
        } while (!r3.BFK(r3.getValue(), new C115745vg(2131892187)));
        AnonymousClass3MX.A1Q(new MemoryViewModel$deleteMemories$2(this, list, (C30391dr) null), C41561wd.A00(this));
    }

    public MemoryViewModel(AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0j(r5, r6);
        this.A02 = r5;
        this.A01 = r6;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C115745vg(2131891979));
        this.A03 = A18;
        this.A04 = new C34081jt((AnonymousClass1OB) null, A18);
        do {
        } while (!A18.BFK(A18.getValue(), new C115745vg(2131891979)));
        AnonymousClass3MX.A1Q(new MemoryViewModel$getMemories$2(this, (C30391dr) null), C41561wd.A00(this));
    }

    public final void A0T() {
        AnonymousClass3MX.A1Q(new MemoryViewModel$backToLoadedState$1(this, (C30391dr) null), C41561wd.A00(this));
    }
}
