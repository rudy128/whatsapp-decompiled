package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08X  reason: invalid class name */
public final class AnonymousClass08X extends AnonymousClass0W5 implements C17270uO, Parcelable, C17260uN {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(16);
    public C013208a A00;

    public int describeContents() {
        return 0;
    }

    public float BRr() {
        return ((C013208a) C05200Qx.A0F(this, this.A00)).A00;
    }

    public C03460Ig Bjn(C03460Ig r5, C03460Ig r6, C03460Ig r7) {
        C18070vi.A0z(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        C18070vi.A0z(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        float f = ((C013208a) r6).A00;
        float f2 = ((C013208a) r7).A00;
        if ((Build.VERSION.SDK_INT >= 23 || ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) <= 2139095040 && (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) <= 2139095040)) && f == f2) {
            return r6;
        }
        return null;
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.A00 = (C013208a) r2;
    }

    public void CIw(float f) {
        Snapshot A01;
        C013208a r3 = (C013208a) C05200Qx.A0G(this.A00);
        float f2 = r3.A00;
        if ((Build.VERSION.SDK_INT < 23 && ((Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) > 2139095040 || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) > 2139095040)) || f2 != f) {
            C013208a r0 = this.A00;
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                ((C013208a) C05200Qx.A0A(A01, this, r0, r3)).A00 = f;
            }
            C05200Qx.A0V(A01, this);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableFloatState(value=");
        A10.append(((C013208a) C05200Qx.A0G(this.A00)).A00);
        return AnonymousClass0W5.A01(this, A10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0Ig, X.08a] */
    public AnonymousClass08X(float f) {
        ? r0 = new C03460Ig();
        r0.A00 = f;
        this.A00 = r0;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public C16290s1 BXD() {
        return AnonymousClass0Q9.A06();
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(BRr());
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        CIw(AnonymousClass000.A04(obj));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(BRr());
    }
}
