package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08Z  reason: invalid class name */
public final class AnonymousClass08Z extends AnonymousClass0W5 implements C17290uQ, Parcelable, C17260uN {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(18);
    public C013408c A00;

    public int describeContents() {
        return 0;
    }

    public long BUF() {
        return ((C013408c) C05200Qx.A0F(this, this.A00)).A00;
    }

    public C03460Ig Bjn(C03460Ig r6, C03460Ig r7, C03460Ig r8) {
        C18070vi.A0z(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        C18070vi.A0z(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((C013408c) r7).A00 != ((C013408c) r8).A00) {
            return null;
        }
        return r7;
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.A00 = (C013408c) r2;
    }

    public void CJN(long j) {
        Snapshot A01;
        C013408c r3 = (C013408c) C05200Qx.A0G(this.A00);
        if (r3.A00 != j) {
            C013408c r0 = this.A00;
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                ((C013408c) C05200Qx.A0A(A01, this, r0, r3)).A00 = j;
            }
            C05200Qx.A0V(A01, this);
        }
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        CJN(((Number) obj).longValue());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableLongState(value=");
        A10.append(((C013408c) C05200Qx.A0G(this.A00)).A00);
        return AnonymousClass0W5.A01(this, A10);
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public C16290s1 BXD() {
        return AnonymousClass0Q9.A06();
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(BUF());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(BUF());
    }
}
