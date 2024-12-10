package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.AIq  reason: case insensitive filesystem */
public class C20380AIq implements LightweightQuickPerformanceLogger {
    public final AtomicReference A00;
    public final Lock A01;
    public final Lock A02;

    public boolean isMarkerOn(int i, int i2, boolean z) {
        return z;
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        markerStartWithCancelPolicy(i, z, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }

    public static void A00(C20380AIq aIq, Object obj, Object obj2) {
        C183709Zh r2 = new C183709Zh(obj, obj2);
        Lock lock = aIq.A01;
        lock.lock();
        try {
            AnonymousClass9N1 r0 = (AnonymousClass9N1) aIq.A00.get();
            C26159CtX.A01(r0);
            r0.A00.add(r2);
        } finally {
            lock.unlock();
        }
    }

    public long currentMonotonicTimestamp() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    public EventBuilder markEventBuilder(int i, int i2, String str) {
        return new C20379AIp(this);
    }

    public void markerDrop(int i, int i2) {
        A00(this, "", (Object) null);
    }

    public void markerDropForUserFlow(int i, int i2) {
        A00(this, "", (Object) null);
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        A00(this, new AnonymousClass9UZ(map), (Object) null);
    }

    public void markerLinkPivot(int i, int i2, String str) {
        A00(this, "", (Object) null);
    }

    @Deprecated
    public void markerTag(int i, int i2, String str) {
        A00(this, "", (Object) null);
    }

    public MarkerEditor withMarker(int i, int i2) {
        return new AnonymousClass8QX(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9N1] */
    public C20380AIq() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ? obj = new Object();
        obj.A00 = concurrentLinkedQueue;
        this.A00 = new AtomicReference(obj);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A01 = reentrantReadWriteLock.readLock();
        this.A02 = reentrantReadWriteLock.writeLock();
    }

    public long currentMonotonicTimestampNanos() {
        return System.nanoTime();
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        A00(this, str, Integer.valueOf(i3));
    }

    public void markerEnd(int i, int i2, short s) {
        currentMonotonicTimestamp();
        A00(this, Short.valueOf(s), (Object) null);
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        currentMonotonicTimestamp();
        A00(this, Short.valueOf(s), (Object) null);
    }

    public void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        A00(this, Boolean.valueOf(z), Long.valueOf(j));
    }

    public boolean isMarkerOn(int i, boolean z) {
        return z;
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        A00(this, Double.valueOf(d), (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        A00(this, Integer.valueOf(i3), (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        A00(this, Long.valueOf(j), (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        A00(this, str2, (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        A00(this, Boolean.valueOf(z), (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        A00(this, dArr, (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        A00(this, iArr, (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        A00(this, jArr, (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        A00(this, strArr, (Object) null);
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        A00(this, zArr, (Object) null);
    }

    public void markerAnnotate(int i, String str, double d) {
        A00(this, Double.valueOf(d), (Object) null);
    }

    public void markerAnnotate(int i, String str, int i2) {
        A00(this, Integer.valueOf(i2), (Object) null);
    }

    public void markerAnnotate(int i, String str, long j) {
        A00(this, Long.valueOf(j), (Object) null);
    }

    public void markerAnnotate(int i, String str, String str2) {
        A00(this, str2, (Object) null);
    }

    public void markerAnnotate(int i, String str, boolean z) {
        A00(this, Boolean.valueOf(z), (Object) null);
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        A00(this, dArr, (Object) null);
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        A00(this, iArr, (Object) null);
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        A00(this, jArr, (Object) null);
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        A00(this, strArr, (Object) null);
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        A00(this, zArr, (Object) null);
    }

    public void markerPoint(int i, int i2, String str) {
        currentMonotonicTimestamp();
        A00(this, "", (Object) null);
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        A00(this, "", (Object) null);
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        currentMonotonicTimestamp();
        A00(this, str2, (Object) null);
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        A00(this, str2, (Object) null);
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        A00(this, str2, Integer.valueOf(i3));
    }

    public void markerPoint(int i, String str) {
        currentMonotonicTimestamp();
        A00(this, "", (Object) null);
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        A00(this, "", (Object) null);
    }

    public void markerPoint(int i, String str, String str2) {
        currentMonotonicTimestamp();
        A00(this, str2, (Object) null);
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        A00(this, str2, (Object) null);
    }

    public EventBuilder markEventBuilder(int i, String str) {
        return new C20379AIp(this);
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        A00(this, str, str2);
    }

    public void markerDrop(int i) {
        A00(this, "", (Object) null);
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A00(this, Short.valueOf(s), (Object) null);
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
        currentMonotonicTimestamp();
        A00(this, str, Short.valueOf(s));
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        A00(this, Boolean.TRUE, (Object) null);
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A00(this, Boolean.valueOf(z), Long.valueOf(j));
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A00(this, Boolean.valueOf(z), (Object) null);
    }

    @Deprecated
    public void markerTag(int i, String str) {
        A00(this, "", (Object) null);
    }

    public MarkerEditor withMarker(int i) {
        return new AnonymousClass8QX(this);
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A00(this, Short.valueOf(s), (Object) null);
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        A00(this, Integer.valueOf(i3), (Object) null);
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A00(this, Boolean.valueOf(z), (Object) null);
    }

    public void markerStartWithCancelPolicy(int i, boolean z) {
        markerStartWithCancelPolicy(i, z, 0);
    }

    public void markerEnd(int i, short s) {
        currentMonotonicTimestamp();
        A00(this, Short.valueOf(s), (Object) null);
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        A00(this, Boolean.valueOf(z), Long.valueOf(j));
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    public void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }

    public void markerStart(int i, int i2) {
        currentMonotonicTimestamp();
        A00(this, Boolean.TRUE, (Object) null);
    }

    public void markerStart(int i) {
        currentMonotonicTimestamp();
        A00(this, Boolean.TRUE, (Object) null);
    }
}
