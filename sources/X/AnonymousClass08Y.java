package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08Y  reason: invalid class name */
public final class AnonymousClass08Y extends AnonymousClass0W5 implements C17280uP, Parcelable, C17260uN {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(17);
    public C013308b A00;

    public int describeContents() {
        return 0;
    }

    public int BT8() {
        return ((C013308b) C05200Qx.A0F(this, this.A00)).A00;
    }

    public C03460Ig Bjn(C03460Ig r3, C03460Ig r4, C03460Ig r5) {
        C18070vi.A0z(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((C013308b) r4).A00 != ((C013308b) r5).A00) {
            return null;
        }
        return r4;
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (C013308b) r2;
    }

    public void CJC(int i) {
        Snapshot A01;
        C013308b r3 = (C013308b) C05200Qx.A0G(this.A00);
        if (r3.A00 != i) {
            C013308b r0 = this.A00;
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                ((C013308b) C05200Qx.A0A(A01, this, r0, r3)).A00 = i;
            }
            C05200Qx.A0V(A01, this);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableIntState(value=");
        A10.append(((C013308b) C05200Qx.A0G(this.A00)).A00);
        return AnonymousClass0W5.A01(this, A10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Ig, X.08b] */
    public AnonymousClass08Y(int i) {
        ? r0 = new C03460Ig();
        r0.A00 = i;
        this.A00 = r0;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public C16290s1 BXD() {
        return AnonymousClass0Q9.A06();
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(BT8());
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        CJC(AnonymousClass000.A0M(obj));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(BT8());
    }
}
