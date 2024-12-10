package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4nl  reason: invalid class name and case insensitive filesystem */
public final class C96384nl implements C108065b4 {
    public final C25161Nd A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1MW A02;
    public final AnonymousClass4DU A03 = AnonymousClass4DU.GROUPS_MEMBERSHIP_SUPERSET_GROUPS;
    public final AnonymousClass4QF A04;
    public final C84964Ln A05;

    public C86854Ti Bhf(Set set) {
        ArrayList A13;
        C18070vi.A0d(set, 1);
        if (!C18020vd.A05(C18040vf.A02, this.A05.A00, 9337)) {
            return new C86854Ti(C18460wS.A00);
        }
        C25161Nd r3 = this.A00;
        long A012 = AnonymousClass11P.A01(this.A01) - TimeUnit.DAYS.toMillis(60);
        AnonymousClass1CJ r6 = r3.A02;
        AnonymousClass1CJ.A01(r6);
        C25171Ne r5 = r3.A01;
        synchronized (r5) {
            A13 = AnonymousClass000.A13();
            Iterator it = r5.iterator();
            while (it.hasNext()) {
                C36311ng r32 = (C36311ng) it.next();
                if (r32.A00 < A012 || A13.size() >= 100) {
                    break;
                }
                AnonymousClass1BI r2 = r32.A01;
                C29691ci A0A = r6.A0A(r2);
                if (!(A0A == null || A0A.A03 == 3 || !(r2 instanceof AnonymousClass1EC))) {
                    A13.add((AnonymousClass1E9) r2);
                }
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupMemberSuggestionsBucketSupersetGroups/loadBucket groupsJids size: ");
        C17900vP.A0o(A10, A13.size());
        ArrayList A0D = C29351c6.A0D(A13);
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            A0D.add(this.A02.A0B((AnonymousClass1E9) it2.next()));
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : A0D) {
            C18070vi.A0X(next);
            C63872tp r22 = (C63872tp) next;
            if (r22.A06() <= 33 && r22.A07().containsAll(set)) {
                C199410f A07 = r22.A07();
                C18070vi.A0X(A07);
                A132.addAll(C29431cG.A0t(A07));
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("GroupMemberSuggestionsBucketSupersetGroups/loadBucket contactChatJids size: ");
        C17900vP.A0o(A102, A132.size());
        LinkedHashMap A133 = C17880vN.A13();
        Iterator it3 = A132.iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C86864Tj r1 = (C86864Tj) A133.get(next2);
            if (r1 != null) {
                r1.A00++;
            } else {
                r1 = new C86864Tj(i);
            }
            A133.put(next2, r1);
            i = i2;
        }
        ArrayList A002 = this.A04.A00(C29431cG.A0y(A133.keySet(), new C98954rz(new C98974s1((Map) A133, 13), A133, 2)), set);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("GroupMemberSuggestionsBucketSupersetGroups/loadBucket contactChatJidsResultRemoveIneligibleContacts size: ");
        C17900vP.A0o(A103, A002.size());
        return new C86854Ti(A002);
    }

    public AnonymousClass4DU BNn() {
        return this.A03;
    }

    public C96384nl(C25161Nd r2, AnonymousClass11P r3, AnonymousClass1MW r4, AnonymousClass4QF r5, C84964Ln r6) {
        C18070vi.A0o(r3, r2, r4);
        C18070vi.A0d(r6, 5);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
