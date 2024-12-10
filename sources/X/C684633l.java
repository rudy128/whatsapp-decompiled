package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.33l  reason: invalid class name and case insensitive filesystem */
public final class C684633l implements C22511BAs {
    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        Set<Object> set;
        Set<Object> set2;
        boolean A16 = C18070vi.A16(r7, r6);
        C692236j A02 = C63672tV.A02(r7);
        boolean z = false;
        if (A02 != null && A02.A02() == A16) {
            z = true;
        }
        C166388co A0X = C17880vN.A0X(r6);
        A0X.bitField1_ |= 65536;
        A0X.isMentionedInStatus_ = z;
        C692236j A022 = C63672tV.A02(r7);
        if (!(A022 == null || (set2 = A022.A05) == null)) {
            ArrayList A0E = C29351c6.A0E(set2);
            for (Object obj : set2) {
                A0E.add(obj.toString());
            }
            ((C166388co) C17880vN.A0G(r6)).statusMentions_ = C23579Bm9.A02;
            C166388co r2 = (C166388co) C17880vN.A0G(r6);
            EE9 ee9 = r2.statusMentions_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.statusMentions_ = ee9;
            }
            DND.A09(A0E, ee9);
        }
        C692236j A023 = C63672tV.A02(r7);
        if (A023 != null && (set = A023.A04) != null) {
            ArrayList A0E2 = C29351c6.A0E(set);
            for (Object obj2 : set) {
                A0E2.add(obj2.toString());
            }
            ((C166388co) C17880vN.A0G(r6)).statusMentionSources_ = C23579Bm9.A02;
            C166388co r22 = (C166388co) C17880vN.A0G(r6);
            EE9 ee92 = r22.statusMentionSources_;
            if (!((C27296DbR) ee92).A00) {
                ee92 = C23577Bm6.A09(ee92);
                r22.statusMentionSources_ = ee92;
            }
            DND.A09(A0E2, ee92);
        }
    }

    public void C1B(C193069pU r6, C166388co r7, AnonymousClass206 r8) {
        C18070vi.A0h(r7, r8);
        EE9 ee9 = r7.statusMentions_;
        C18070vi.A0X(ee9);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = ee9.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1BI A00 = C22931Dv.A00(Jid.Companion.A02(A0v));
            if (A00 != null) {
                A13.add(A00);
            }
        }
        Set A12 = C29431cG.A12(A13);
        EE9 ee92 = r7.statusMentionSources_;
        C18070vi.A0X(ee92);
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = ee92.iterator();
        while (it2.hasNext()) {
            String A0v2 = C17880vN.A0v(it2);
            C22931Dv r02 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(Jid.Companion.A02(A0v2));
            if (A002 != null) {
                A132.add(A002);
            }
        }
        Set A122 = C29431cG.A12(A132);
        if (r7.isMentionedInStatus_ || (!A12.isEmpty())) {
            C692236j A01 = C63672tV.A01(r8);
            A01.A09 = r7.isMentionedInStatus_;
            A01.A05 = A12;
            A01.A04 = A122;
        }
    }
}
