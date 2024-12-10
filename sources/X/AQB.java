package X;

import android.content.Context;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Set;

public class AQB implements C23581Gv, C23971Ii {
    public final int A00;
    public final Object A01;

    public AQB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bkk(UserJid userJid) {
        if (this.A00 == 0) {
            BlockList.A0y((BlockList) this.A01);
        }
    }

    public void Bmh(Collection collection) {
        if (this.A00 == 0) {
            BlockList blockList = (BlockList) this.A01;
            AnonymousClass00H r0 = blockList.A0F;
            if (r0 != null) {
                Set A0B = AnonymousClass3MW.A0V(r0).A0B();
                synchronized (blockList.A0R) {
                    Set set = blockList.A0U;
                    set.clear();
                    set.addAll(A0B);
                    C21445AkC.A00(blockList.A05, blockList, 18);
                    C21445AkC.A00(blockList.A05, blockList, 19);
                }
                return;
            }
            C18070vi.A11("blockListManager");
            throw null;
        }
    }

    public void Bq1(Collection collection) {
        if (this.A00 == 0) {
            BlockList.A0y((BlockList) this.A01);
        }
    }

    public void Brx(UserJid userJid) {
        if (this.A00 == 0) {
            BlockList.A0y((BlockList) this.A01);
        }
    }

    public void C1w(AnonymousClass1BI r6) {
        C29681ch r0;
        C194489ro r02;
        if (this.A00 != 0) {
            C18070vi.A0d(r6, 0);
            A2O a2o = (A2O) this.A01;
            C194489ro r03 = a2o.A00;
            if (r03 != null) {
                r0 = r03.A00;
            } else {
                r0 = null;
            }
            if (r6.equals(r0)) {
                Context A0E = C108945cZ.A0E(a2o.A09);
                AnonymousClass1E7 A0H = a2o.A05.A0H(r6);
                int dimensionPixelSize = A0E.getResources().getDimensionPixelSize(17104901);
                if (a2o.A08.A03(A0E, A0H, dimensionPixelSize, dimensionPixelSize) != null && (r02 = a2o.A00) != null) {
                    a2o.A03(r02.A00, r02.A01, r02.A02);
                    return;
                }
                return;
            }
            return;
        }
        BlockList.A0y((BlockList) this.A01);
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq0(Collection collection) {
    }

    public /* synthetic */ void Bq3(Collection collection) {
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void BtU(UserJid userJid) {
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }
}
