package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2sX  reason: invalid class name and case insensitive filesystem */
public final class C63122sX {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04;
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public volatile /* synthetic */ int consumerIndex$volatile;
    public volatile /* synthetic */ Object lastScheduledTask$volatile;
    public volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<C63122sX> cls = C63122sX.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        A03 = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public static final C30591eC A00(C63122sX r5) {
        C30591eC r2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i = atomicIntegerFieldUpdater.get(r5);
            r2 = null;
            if (i - A03.get(r5) == 0) {
                break;
            }
            int i2 = i & StringTreeSet.OFFSET_BASE_ENCODING;
            if (atomicIntegerFieldUpdater.compareAndSet(r5, i, i + 1) && (r2 = (C30591eC) r5.A00.getAndSet(i2, (Object) null)) != null) {
                if (r2.A01.A00 == 1) {
                    A01.decrementAndGet(r5);
                }
            }
        }
        return r2;
    }
}
