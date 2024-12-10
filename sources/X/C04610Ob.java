package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.0Ob  reason: invalid class name and case insensitive filesystem */
public final class C04610Ob {
    public static final C04610Ob A02 = new C04610Ob();
    public final int A00;
    public final int A01;

    public /* synthetic */ C04610Ob(int i) {
        this.A01 = 3;
        this.A00 = i;
    }

    public final C26041Cr5 A00(boolean z) {
        return new C26041Cr5((C24419C2s) null, (AnonymousClass1Y1) null, 0, this.A01, this.A00, z, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C04610Ob) {
                C04610Ob r5 = (C04610Ob) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((38161 + this.A01) * 31) + this.A00) * 31;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyboardOptions(capitalization=");
        A10.append("None");
        A10.append(", autoCorrect=");
        A10.append(true);
        A10.append(", keyboardType=");
        int i = this.A01;
        if (i == 1) {
            str = "Text";
        } else if (i == 2) {
            str = "Ascii";
        } else {
            str = "Number";
        }
        A10.append(str);
        A10.append(", imeAction=");
        A10.append(ImeAction.A01(this.A00));
        A10.append(", platformImeOptions=");
        return AnonymousClass001.A1F((Object) null, A10);
    }

    public /* synthetic */ C04610Ob() {
        this.A01 = 1;
        this.A00 = 1;
    }
}
