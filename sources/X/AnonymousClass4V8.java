package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.4V8  reason: invalid class name */
public final class AnonymousClass4V8 {
    public final C29691ci A00;
    public final AnonymousClass1E7 A01;
    public final GroupJid A02;
    public final C22821Di A03;
    public final C22821Di A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass4V8(C29691ci r2, AnonymousClass1E7 r3, GroupJid groupJid, C22821Di r5, C22821Di r6, boolean z, boolean z2) {
        C18070vi.A0g(r5, 4, r6);
        this.A00 = r2;
        this.A02 = groupJid;
        this.A06 = z;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = z2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V8) {
                AnonymousClass4V8 r5 = (AnonymousClass4V8) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || this.A06 != r5.A06 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || this.A05 != r5.A05 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)), this.A06))), this.A05) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParentViewItemUiState(chatInfo=");
        A10.append(this.A00);
        A10.append(", parentJid=");
        A10.append(this.A02);
        A10.append(", isSuspended=");
        A10.append(this.A06);
        A10.append(", onClick=");
        A10.append(this.A03);
        A10.append(", onLongClick=");
        A10.append(this.A04);
        A10.append(", isSelected=");
        A10.append(this.A05);
        A10.append(", contact=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
