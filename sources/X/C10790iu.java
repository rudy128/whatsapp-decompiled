package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.0iu  reason: invalid class name and case insensitive filesystem */
public final class C10790iu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10790iu(C22821Di r2) {
        super(1);
        this.$block = r2;
    }

    /* renamed from: A00 */
    public final Snapshot invoke(C06400Ye r5) {
        Snapshot snapshot = (Snapshot) this.$block.invoke(r5);
        synchronized (C05200Qx.A08) {
            C05200Qx.A04 = C05200Qx.A04.A09(snapshot.A04());
        }
        return snapshot;
    }
}
