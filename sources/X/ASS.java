package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ASS implements B83, B85, C436820m {
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.APP_STATE_SYNC_KEY_REQUEST) {
            return null;
        }
        AnonymousClass23D r5 = new AnonymousClass23D(a6d.A0A, a6d.A03);
        AnonymousClass8XG r0 = C20077A6d.A00(a6d).appStateSyncKeyRequest_;
        if (r0 == null) {
            r0 = AnonymousClass8XG.DEFAULT_INSTANCE;
        }
        HashSet A12 = C17880vN.A12();
        for (AnonymousClass8XX r2 : r0.keyIds_) {
            C18070vi.A0b(r2);
            C19999A2n A00 = AnonymousClass9QT.A00(r2);
            if (A00 != null) {
                A12.add(A00);
            } else {
                C17900vP.A0X(r2, "FMessageAppStateSyncKeyRequest message missing fields for keyId: ", AnonymousClass000.A10());
            }
        }
        Set set = r5.A00;
        set.clear();
        set.addAll(A12);
        return r5;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C18070vi.A0h(r8, a2m);
        if (r8 instanceof AnonymousClass23D) {
            C23624Bmt A0N = AnonymousClass8XG.DEFAULT_INSTANCE.A0N();
            for (C19999A2n A01 : Collections.unmodifiableSet(((AnonymousClass23D) r8).A00)) {
                AnonymousClass8XX A012 = A01.A01();
                AnonymousClass8XG r2 = (AnonymousClass8XG) C17880vN.A0G(A0N);
                A012.getClass();
                EE9 ee9 = r2.keyIds_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r2.keyIds_ = ee9;
                }
                ee9.add(A012);
            }
            C163898Wt r22 = (C163898Wt) C166368cm.DEFAULT_INSTANCE.A0N();
            r22.A0G(C179839Kc.APP_STATE_SYNC_KEY_REQUEST);
            C166368cm A0H = AnonymousClass8BS.A0H(r22);
            AnonymousClass8XG r0 = (AnonymousClass8XG) A0N.A0C();
            r0.getClass();
            A0H.appStateSyncKeyRequest_ = r0;
            A0H.bitField0_ |= 64;
            a2m.A00.A0O((C166368cm) r22.A0C());
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Message type is not supported ");
        A10.append(r8.getClass());
        throw AnonymousClass000.A0j(A10);
    }
}
