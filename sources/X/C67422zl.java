package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2zl  reason: invalid class name and case insensitive filesystem */
public final class C67422zl implements AnonymousClass1L0 {
    public final C24661Le A00;
    public final C18030ve A01;
    public final C32741hg A02;
    public final AnonymousClass00H A03;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        Long l;
        C18030ve r1 = this.A01;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 7705)) {
            C24651Ld r6 = (C24651Ld) this.A03.get();
            C46992Gr r5 = new C46992Gr();
            r5.A00 = C17880vN.A0n(r6.A00("num_statuses_received_key"));
            r5.A04 = C17880vN.A0n(r6.A00("num_statuses_viewed_key"));
            r5.A03 = C17880vN.A0n(r6.A01("contacts_with_statuses_key").size());
            r5.A07 = C17880vN.A0n(r6.A01("contacts_with_statuses_viewed_key").size());
            C18030ve r12 = r6.A02.A01;
            if (C18020vd.A05(r2, r12, 8729)) {
                r5.A01 = C17880vN.A0n(r6.A00("num_statuses_with_mentions_received_key"));
                r5.A02 = C17880vN.A0n(r6.A01("contacts_with_statuses_with_mentions_key").size());
                r5.A05 = C17880vN.A0n(r6.A00("num_statuses_viewed_with_mentions_key"));
                r5.A06 = C17880vN.A0n(r6.A01("contacts_with_statuses_with_mentions_viewed_key").size());
            }
            if (C18020vd.A05(r2, r12, 10187)) {
                r5.A08 = C17880vN.A0n(r6.A00("num_views_received_key"));
            }
            if (C18020vd.A05(r2, r12, 433)) {
                r5.A01 = null;
                r5.A05 = null;
            }
            Long l2 = r5.A00;
            if (l2 == null || l2.longValue() != 0 || ((l = r5.A08) != null && l.longValue() > 0)) {
                r6.A00.CC7(r5);
            }
            SharedPreferences A0C = C17880vN.A0C(r6.A03);
            if (A0C != null && (edit = A0C.edit()) != null && (clear = edit.clear()) != null) {
                clear.apply();
                return;
            }
            return;
        }
        C32741hg r52 = this.A02;
        ArrayList A09 = this.A00.A09();
        C46992Gr r4 = new C46992Gr();
        Long A0L = C17890vO.A0L();
        r4.A03 = A0L;
        r4.A07 = A0L;
        r4.A00 = A0L;
        r4.A04 = A0L;
        ArrayList<C63372sx> A13 = AnonymousClass000.A13();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C63372sx) next).A0A != AnonymousClass1E5.A00) {
                A13.add(next);
            }
        }
        for (C63372sx r62 : A13) {
            r4.A03 = C17880vN.A0o(C17900vP.A01(r4.A03), 1);
            if (r62.A00() != r62.A01()) {
                r4.A07 = C17880vN.A0o(C17900vP.A01(r4.A07), 1);
            }
            r4.A00 = C17880vN.A0o(C17900vP.A01(r4.A00), (long) r62.A00());
            r4.A04 = C17880vN.A0o(C17900vP.A01(r4.A04), (long) (r62.A00() - r62.A01()));
        }
        r52.A0C.CC7(r4);
    }

    public C67422zl(C24661Le r1, C18030ve r2, C32741hg r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
