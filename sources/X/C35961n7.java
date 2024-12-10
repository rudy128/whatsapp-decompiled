package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1n7  reason: invalid class name and case insensitive filesystem */
public final class C35961n7 extends C35951n6 {
    public final /* synthetic */ AtomicReferenceArray A00 = new AtomicReferenceArray(C35971n8.A01);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SemaphoreSegment[id=");
        sb.append(this.A00);
        sb.append(", hashCode=");
        sb.append(hashCode());
        sb.append(']');
        return sb.toString();
    }

    public C35961n7(C35961n7 r3, int i, long j) {
        super(r3, i, j);
    }
}
