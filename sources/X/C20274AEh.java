package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.AEh  reason: case insensitive filesystem */
public final class C20274AEh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final ARR A02;
    public final ARR A03;

    public static final C29621ca A00(C22565BDa bDa) {
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[3];
        r3[0] = new AnonymousClass1MD("value", bDa.getValue());
        ARR arr = (ARR) bDa;
        r3[1] = new AnonymousClass1MD("offset", arr.A00);
        C17890vO.A12("currency", AnonymousClass8BU.A0n(arr), r3);
        return AnonymousClass8BR.A0k("money", r3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20274AEh) {
                C20274AEh aEh = (C20274AEh) obj;
                if (this.A00 != aEh.A00 || this.A01 != aEh.A01 || !C18070vi.A18(this.A02, aEh.A02) || !C18070vi.A18(this.A03, aEh.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        ARR arr = this.A02;
        if (arr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arr.writeToParcel(parcel, i);
        }
        ARR arr2 = this.A03;
        if (arr2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        arr2.writeToParcel(parcel, i);
    }

    public C29621ca A01() {
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass8BT.A1T("max_count", A13, this.A00);
        AnonymousClass8BT.A1T("selected_count", A13, this.A01);
        ArrayList A132 = AnonymousClass000.A13();
        ARR arr = this.A02;
        if (arr != null) {
            AnonymousClass8BT.A1J(A00(arr), "due_amount", A132, new AnonymousClass1MD[0]);
        }
        ARR arr2 = this.A03;
        if (arr2 != null) {
            AnonymousClass8BT.A1J(A00(arr2), "interest", A132, new AnonymousClass1MD[0]);
        }
        return AnonymousClass8BR.A0l("installment", AnonymousClass8BT.A1b(A13, 0), C17890vO.A1Y(A132, 0));
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public C20274AEh(ARR arr, ARR arr2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = arr;
        this.A03 = arr2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstallmentTransactionData(maxOrderInstallmentCount=");
        A10.append(this.A00);
        A10.append(", selectedCount=");
        A10.append(this.A01);
        A10.append(", dueAmount=");
        A10.append(this.A02);
        A10.append(", interest=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
