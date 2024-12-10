package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.35Z  reason: invalid class name */
public final class AnonymousClass35Z implements AnonymousClass3MB {
    public final C24681Lg A00;
    public final AnonymousClass1KB A01;
    public final C18030ve A02;
    public final AnonymousClass1W6 A03;

    public /* synthetic */ void BCg(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public int BVp() {
        return 4;
    }

    public void CRg(AnonymousClass206 r4, AnonymousClass206 r5) {
        if (!C18070vi.A18(r4.A0v.A00, r5.A0v.A00) || !C18070vi.A18(r4.A0H(), r5.A0H())) {
            throw new C32711hd(0);
        }
    }

    public void CRh(C20077A6d a6d, C166048cG r4, AnonymousClass206 r5) {
        if (!(!(r5 instanceof AnonymousClass210) || (a6d.A08.bitField0_ & 32) == 0 || (r4.bitField0_ & 64) == 0)) {
            C166118cN r0 = r4.botMetadata_;
            if (r0 == null) {
                r0 = C166118cN.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 4) != 0) {
                return;
            }
        }
        throw new C32711hd(0);
    }

    public boolean CM5() {
        return C18020vd.A05(C18040vf.A02, this.A02, 7075);
    }

    public void CRA(AnonymousClass206 r4, Integer num, long j) {
        C692836p r0;
        Class<C692836p> cls = C692836p.class;
        if (C18070vi.A09(r4, cls).A03 && (r0 = (C692836p) AnonymousClass206.A01(r4, cls)) != null) {
            if (!C29401cD.A0N(r0.A00, new AnonymousClass3ID(j))) {
                Log.e("BotPluginAssociationTypeProvider/parent message doesn't contain the child that is deleted");
            } else {
                this.A01.A0J(new C21451AkI(this, r4, 36));
            }
        }
    }

    public void CRB(AnonymousClass206 r4, AnonymousClass206 r5) {
        ArrayList A13;
        if (r4 instanceof AnonymousClass210) {
            Class<C692836p> cls = C692836p.class;
            C692836p r0 = (C692836p) AnonymousClass206.A01(r5, cls);
            if (r0 != null) {
                A13 = r0.A00;
            } else {
                A13 = AnonymousClass000.A13();
            }
            A13.add(r4);
            C18070vi.A09(r5, cls).A02(new C692836p(A13));
        }
        if (!r5.A0z(256)) {
            r5.A0V(256);
            this.A03.A05(r5, -1);
        }
        this.A01.A0J(new C21451AkI(this, r5, 37));
    }

    public AnonymousClass35Z(AnonymousClass1KB r1, C24681Lg r2, C18030ve r3, AnonymousClass1W6 r4) {
        C18070vi.A0s(r3, r1, r2, r4);
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r4;
    }

    public AnonymousClass6RT BNA() {
        return AnonymousClass6RT.BOT_PLUGINS;
    }

    public Integer BOc() {
        return AnonymousClass00R.A00;
    }

    public /* synthetic */ Integer BOd() {
        return AnonymousClass00R.A00;
    }

    public /* synthetic */ Integer BOe() {
        return AnonymousClass00R.A00;
    }

    public /* synthetic */ C49382Qg BOg() {
        return C49382Qg.REVOKE_CHILD_ON_PARENT_REVOKE;
    }

    public /* synthetic */ boolean CM8() {
        return false;
    }
}
