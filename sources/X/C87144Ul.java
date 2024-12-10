package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ul  reason: invalid class name and case insensitive filesystem */
public final class C87144Ul {
    public final int A00;
    public final C107075Yh A01;
    public final C86714St A02;
    public final C86564Sd A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87144Ul) {
                C87144Ul r5 = (C87144Ul) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, (AnonymousClass000.A0L(this.A04) + this.A00) * 31)));
    }

    public C87144Ul(C107075Yh r6, C86714St r7, C86564Sd r8, List list, int i) {
        this.A04 = list;
        this.A00 = i;
        this.A02 = r7;
        this.A03 = r8;
        this.A01 = r6;
        int size = list.size();
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4V6 r0 = (AnonymousClass4V6) it.next();
            AnonymousClass1D6.A02(r0.A01, r0.A02, A0D);
        }
        C17960vV.A0F(AnonymousClass000.A1T(size, C29431cG.A12(A0D).size()), "The (category, effect) pair of each effect button must be unique");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsButtonHeaderConfiguration(effectButtons=");
        A10.append(this.A04);
        A10.append(", spacingBetweenButtons=");
        A10.append(this.A00);
        A10.append(", exitButton=");
        A10.append(this.A02);
        A10.append(", removeAllEffectsButton=");
        A10.append(this.A03);
        A10.append(", factory=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
