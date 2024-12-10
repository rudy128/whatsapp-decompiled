package X;

import android.view.View;

/* renamed from: X.4FO  reason: invalid class name */
public final class AnonymousClass4FO {
    public int A00;
    public View A01;
    public View A02;
    public C82934Cs A03;
    public AnonymousClass1E7 A04;
    public C139106yE A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FO) {
                AnonymousClass4FO r5 = (AnonymousClass4FO) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, this.A00 * 31)) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClickEvent(position=");
        A10.append(this.A00);
        A10.append(", clickedItem=");
        A10.append(this.A03);
        A10.append(", contact=");
        A10.append(this.A04);
        A10.append(", transitionView=");
        A10.append(this.A02);
        A10.append(", containerView=");
        A10.append(this.A01);
        A10.append(", statusData=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
