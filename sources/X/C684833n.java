package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.33n  reason: invalid class name and case insensitive filesystem */
public final class C684833n implements C22511BAs {
    public final AnonymousClass00H A00;

    public C684833n(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void C1B(C193069pU r1, C166388co r2, AnonymousClass206 r3) {
    }

    public void C1A(C195629te r10, AnonymousClass8X1 r11, AnonymousClass206 r12) {
        C18070vi.A0h(r12, r11);
        Set entrySet = ((AnonymousClass1WX) this.A00.get()).A00(r12).A00.entrySet();
        C18070vi.A0X(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            C62452rQ r6 = (C62452rQ) A16.getValue();
            C23624Bmt A0N = C165768bj.DEFAULT_INSTANCE.A0N();
            String rawString = ((Jid) A16.getKey()).getRawString();
            C165768bj r1 = (C165768bj) C17880vN.A0G(A0N);
            rawString.getClass();
            r1.bitField0_ |= 1;
            r1.userJid_ = rawString;
            C165768bj r13 = (C165768bj) C17880vN.A0G(A0N);
            r13.bitField0_ |= 2;
            r13.receiptTimestamp_ = r6.A00 / 1000;
            C165768bj r14 = (C165768bj) C17880vN.A0G(A0N);
            r14.bitField0_ |= 4;
            r14.readTimestamp_ = r6.A02 / 1000;
            C165768bj r15 = (C165768bj) C17880vN.A0G(A0N);
            r15.bitField0_ |= 8;
            r15.playedTimestamp_ = r6.A01 / 1000;
            C166388co r3 = (C166388co) C17880vN.A0G(r11);
            C23577Bm6 A0C = A0N.A0C();
            C166388co r0 = C166388co.DEFAULT_INSTANCE;
            A0C.getClass();
            EE9 ee9 = r3.userReceipt_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r3.userReceipt_ = ee9;
            }
            ee9.add(A0C);
        }
    }
}
