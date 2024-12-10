package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08V  reason: invalid class name */
public final class AnonymousClass08V extends AnonymousClass0W5 implements Parcelable, C17260uN {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R4();
    public C013508d A00;
    public final C16290s1 A01;

    public int describeContents() {
        return 0;
    }

    public C03460Ig Bjn(C03460Ig r4, C03460Ig r5, C03460Ig r6) {
        C18070vi.A0z(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        C18070vi.A0z(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        if (!this.A01.BKT(((C013508d) r5).A00, ((C013508d) r6).A00)) {
            return null;
        }
        return r5;
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (C013508d) r2;
    }

    public Object getValue() {
        return ((C013508d) C05200Qx.A0F(this, this.A00)).A00;
    }

    public void setValue(Object obj) {
        Snapshot A012;
        C013508d r3 = (C013508d) C05200Qx.A0G(this.A00);
        if (!this.A01.BKT(r3.A00, obj)) {
            C013508d r0 = this.A00;
            synchronized (C05200Qx.A08) {
                A012 = C05200Qx.A01();
                ((C013508d) C05200Qx.A0A(A012, this, r0, r3)).A00 = obj;
            }
            C05200Qx.A0V(A012, this);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableState(value=");
        A10.append(((C013508d) C05200Qx.A0G(this.A00)).A00);
        return AnonymousClass0W5.A01(this, A10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Ig, X.08d] */
    public AnonymousClass08V(C16290s1 r2, Object obj) {
        this.A01 = r2;
        ? r0 = new C03460Ig();
        r0.A00 = obj;
        this.A00 = r0;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public C16290s1 BXD() {
        return this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C16290s1 r1 = this.A01;
        if (C18070vi.A18(r1, AnonymousClass0Q9.A00())) {
            i2 = 0;
        } else if (C18070vi.A18(r1, AnonymousClass0Q9.A06())) {
            i2 = 1;
        } else if (C18070vi.A18(r1, AnonymousClass0Q9.A05())) {
            i2 = 2;
        } else {
            throw AnonymousClass000.A0n("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
