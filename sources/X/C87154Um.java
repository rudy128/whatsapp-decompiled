package X;

import java.util.List;

/* renamed from: X.4Um  reason: invalid class name and case insensitive filesystem */
public final class C87154Um {
    public final C93464j1 A00;
    public final AnonymousClass5X0 A01;
    public final AnonymousClass4ZN A02;
    public final AnonymousClass4ZN A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87154Um) {
                C87154Um r5 = (C87154Um) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03)))));
    }

    public C87154Um(C93464j1 r2, AnonymousClass5X0 r3, AnonymousClass4ZN r4, AnonymousClass4ZN r5, List list) {
        C18070vi.A0j(r4, r5);
        C18070vi.A0g(list, 4, r3);
        this.A03 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A04 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallConfirmationSheetUiState(titleStringProvider=");
        A10.append(this.A03);
        A10.append(", subtitleStringProvider=");
        A10.append(this.A02);
        A10.append(", primaryButtonState=");
        A10.append(this.A00);
        A10.append(", headerContactPhotos=");
        A10.append(this.A04);
        A10.append(", secondaryButtonState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
