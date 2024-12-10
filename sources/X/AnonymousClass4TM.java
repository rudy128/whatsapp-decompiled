package X;

import android.content.DialogInterface;

/* renamed from: X.4TM  reason: invalid class name */
public final class AnonymousClass4TM {
    public final int A00;
    public final DialogInterface.OnClickListener A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TM) {
                AnonymousClass4TM r5 = (AnonymousClass4TM) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4TM(DialogInterface.OnClickListener onClickListener, int i) {
        this.A00 = i;
        this.A01 = onClickListener;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (((((1664183883 + this.A00) * 31) + 2131898874) * 31) + 2131898766) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeleteContactData(title=");
        A10.append(2131893333);
        A10.append(", message=");
        A10.append(this.A00);
        A10.append(", positiveButton=");
        A10.append(2131898874);
        A10.append(", negativeButton=");
        A10.append(2131898766);
        A10.append(", positiveButtonListener=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
