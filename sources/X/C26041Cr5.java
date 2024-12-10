package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.Cr5  reason: case insensitive filesystem */
public final class C26041Cr5 {
    public static final C26041Cr5 A03 = new C26041Cr5(1, 1, false);
    public final int A00;
    public final int A01;
    public final boolean A02;

    public /* synthetic */ C26041Cr5(C24419C2s c2s, AnonymousClass1Y1 r2, int i, int i2, int i3, boolean z, boolean z2) {
        this(i2, i3, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26041Cr5) {
                C26041Cr5 cr5 = (C26041Cr5) obj;
                if (!(this.A02 == cr5.A02 && this.A01 == cr5.A01 && this.A00 == cr5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        return this.A00;
    }

    public final boolean A01() {
        return this.A02;
    }

    public int hashCode() {
        return ((((((AnonymousClass3MX.A03(this.A02) * 31) + 1231) * 31) + this.A01) * 31) + this.A00) * 31;
    }

    public C26041Cr5(int i, int i2, boolean z) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImeOptions(singleLine=");
        A10.append(this.A02);
        A10.append(", capitalization=");
        A10.append("None");
        C108975cc.A16(A10, ", autoCorrect=");
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
}
