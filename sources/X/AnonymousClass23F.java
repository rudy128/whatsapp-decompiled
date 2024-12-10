package X;

import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.23F  reason: invalid class name */
public class AnonymousClass23F extends AnonymousClass231 {
    public AnonymousClass2B3 A00;
    public boolean A01;

    public HashMap A17() {
        C59062lh r1;
        AnonymousClass2B3 r0 = this.A00;
        C17960vV.A07(r0);
        HashMap hashMap = new HashMap();
        for (AnonymousClass2B5 r12 : r0.keys_) {
            C18070vi.A0d(r12, 0);
            AnonymousClass8XX r02 = r12.keyId_;
            if (r02 == null) {
                r02 = AnonymousClass8XX.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r02);
            C19999A2n A002 = AnonymousClass9QT.A00(r02);
            if (A002 != null) {
                if ((r12.bitField0_ & 2) != 0) {
                    AnonymousClass2BF r2 = r12.keyData_;
                    if (r2 == null) {
                        r2 = AnonymousClass2BF.DEFAULT_INSTANCE;
                    }
                    C18070vi.A0X(r2);
                    int i = r2.bitField0_;
                    if ((i & 4) != 0 || (i & 2) != 0 || (i & 1) != 0) {
                        C165148af r03 = r2.fingerprint_;
                        if (r03 == null) {
                            r03 = C165148af.DEFAULT_INSTANCE;
                        }
                        C18070vi.A0X(r03);
                        C195959uE A003 = AnonymousClass9QS.A00(r03);
                        if (A003 != null) {
                            byte[] A06 = r2.keyData_.A06();
                            C18070vi.A0X(A06);
                            r1 = new C59062lh(new C59372mC(A003, A06, r2.timestamp_), A002);
                        }
                    }
                    throw new C26831Tq((C59372mC) null, (C19999A2n) null, (String) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 57);
                }
                r1 = null;
                Pair pair = new Pair(A002, r1);
                hashMap.put(pair.first, pair.second);
            } else {
                throw new C26831Tq((C59372mC) null, (C19999A2n) null, (String) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 53);
            }
        }
        return hashMap;
    }
}
