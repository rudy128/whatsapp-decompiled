package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.07S  reason: invalid class name */
public final class AnonymousClass07S extends AnonymousClass0D1 {
    public Set A00;
    public final C17330uU A01;
    public final Set A02 = new LinkedHashSet();
    public final int A03;
    public final AnonymousClass0EH A04;
    public final boolean A05;
    public final boolean A06;
    public final /* synthetic */ AnonymousClass0VR A07;

    public AnonymousClass07S(AnonymousClass0VR r4, AnonymousClass0EH r5, int i, boolean z, boolean z2) {
        this.A07 = r4;
        this.A03 = i;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = r5;
        AnonymousClass084 A002 = AnonymousClass0ES.A00();
        C05750Vo A052 = AnonymousClass0Q9.A05();
        C18100vl r0 = AnonymousClass0GU.A01;
        this.A01 = new AnonymousClass08V(A052, A002);
    }

    public C17350uW A0S() {
        return (C17350uW) this.A01.getValue();
    }

    public void A0T() {
        AnonymousClass0VR r1 = this.A07;
        r1.A00--;
    }

    public void A0U() {
        this.A07.A00++;
    }

    public void A0V(C17130tn r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
        this.A02.add(r2);
    }

    public void A0W(C17130tn r4) {
        Set<Set> set = this.A00;
        if (set != null) {
            for (Set remove : set) {
                C18070vi.A0z(r4, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                remove.remove(((AnonymousClass0VR) r4).A0Y);
            }
        }
        C41681wt.A00(this.A02).remove(r4);
    }

    public C18560wh A0Y() {
        return this.A07.A0V.A0Y();
    }

    public void A0Z(C17250uM r3) {
        AnonymousClass0VR r0 = this.A07;
        AnonymousClass0D1 r1 = r0.A0V;
        r1.A0Z(r0.A0W);
        r1.A0Z(r3);
    }

    public void A0a(C17250uM r2) {
        this.A07.A0V.A0a(r2);
    }

    public void A0b(C17250uM r2) {
        this.A07.A0V.A0b(r2);
    }

    public void A0c(C17250uM r2, AnonymousClass1OS r3) {
        this.A07.A0V.A0c(r2, r3);
    }

    public void A0d(Set set) {
        Set set2 = this.A00;
        if (set2 == null) {
            set2 = new HashSet();
            this.A00 = set2;
        }
        set2.add(set);
    }

    public final void A0g() {
        Set<AnonymousClass0VR> set = this.A02;
        if (!set.isEmpty()) {
            Set<Set> set2 = this.A00;
            if (set2 != null) {
                for (AnonymousClass0VR r3 : set) {
                    for (Set remove : set2) {
                        remove.remove(r3.A0Y);
                    }
                }
            }
            set.clear();
        }
    }

    public int A0X() {
        return this.A03;
    }

    public boolean A0e() {
        return this.A05;
    }

    public boolean A0f() {
        return this.A06;
    }
}
