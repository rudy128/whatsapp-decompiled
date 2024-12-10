package X;

/* renamed from: X.4U4  reason: invalid class name */
public final class AnonymousClass4U4 {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U4) {
                AnonymousClass4U4 r5 = (AnonymousClass4U4) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public AnonymousClass4U4(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PendingGroupsDialogUiState(dialogId=");
        A10.append(this.A01);
        A10.append(", availableCapacity=");
        A10.append(this.A00);
        A10.append(", pendingSuggestionsCount=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
