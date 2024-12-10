package X;

import java.util.Collections;
import java.util.Set;

public final class ASR implements B83, B85, C436820m {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.23H, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.APP_STATE_FATAL_EXCEPTION_NOTIFICATION) {
            return null;
        }
        C164448Yw r1 = C20077A6d.A00(a6d).appStateFatalExceptionNotification_;
        if (r1 == null) {
            r1 = C164448Yw.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r7 = a6d.A0A;
        long j = a6d.A03;
        Set unmodifiableSet = Collections.unmodifiableSet(AnonymousClass8BR.A12(r1.collectionNames_));
        long j2 = r1.timestamp_;
        ? r0 = new AnonymousClass206(r7, 50, j);
        r0.A01 = unmodifiableSet;
        r0.A00 = j2;
        return r0;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        C18070vi.A0h(r7, a2m);
        if (r7 instanceof AnonymousClass23H) {
            C23624Bmt A0N = C164448Yw.DEFAULT_INSTANCE.A0N();
            AnonymousClass23H r72 = (AnonymousClass23H) r7;
            Set set = r72.A01;
            C164448Yw r2 = (C164448Yw) C17880vN.A0G(A0N);
            EE9 ee9 = r2.collectionNames_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.collectionNames_ = ee9;
            }
            DND.A09(set, ee9);
            long j = r72.A00;
            C164448Yw r1 = (C164448Yw) C17880vN.A0G(A0N);
            r1.bitField0_ |= 1;
            r1.timestamp_ = j;
            C163898Wt r22 = (C163898Wt) C166368cm.DEFAULT_INSTANCE.A0N();
            r22.A0G(C179839Kc.APP_STATE_FATAL_EXCEPTION_NOTIFICATION);
            C166368cm A0H = AnonymousClass8BS.A0H(r22);
            C164448Yw r0 = (C164448Yw) A0N.A0C();
            r0.getClass();
            A0H.appStateFatalExceptionNotification_ = r0;
            A0H.bitField0_ |= 256;
            a2m.A00.A0O((C166368cm) r22.A0C());
            return;
        }
        throw AnonymousClass000.A0k("FMessageReactionSerializer/not supported message");
    }
}
