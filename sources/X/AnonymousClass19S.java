package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19S  reason: invalid class name */
public class AnonymousClass19S implements Runnable {
    public final ConcurrentHashMap A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass00H A02;
    public final ArrayBlockingQueue A03;

    public void run() {
        ArrayBlockingQueue arrayBlockingQueue;
        int andIncrement = AnonymousClass19R.A09.getAndIncrement();
        int i = 0;
        while (true) {
            arrayBlockingQueue = this.A03;
            if (arrayBlockingQueue.isEmpty()) {
                break;
            }
            int i2 = i + 1;
            if (i >= 15) {
                break;
            }
            C223519o r3 = (C223519o) arrayBlockingQueue.poll();
            if (r3 != null) {
                AnonymousClass19T r6 = (AnonymousClass19T) this.A02.get();
                r6.markerStart(916783105, andIncrement);
                C222319c r7 = r3.A01;
                r6.markerAnnotate(916783105, andIncrement, "listener", r7.BU9());
                int i3 = r3.A00;
                r6.markerAnnotate(916783105, andIncrement, "event_type", i3);
                C223419n r32 = r3.A02;
                r6.markerAnnotate(916783105, andIncrement, "marker_id", r32.A00);
                if (i3 != 1) {
                    try {
                        r7.Bsc(r32);
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message != null) {
                            r6.markerAnnotate(916783105, andIncrement, "fail_reason", message);
                        }
                        r6.markerEnd(916783105, andIncrement, 3);
                    } catch (Throwable th) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.A00.get(Integer.valueOf(r32.A01));
                        if (atomicInteger != null) {
                            atomicInteger.decrementAndGet();
                        }
                        throw th;
                    }
                } else {
                    r7.C6D(r32);
                }
                r6.markerEnd(916783105, andIncrement, 2);
                AtomicInteger atomicInteger2 = (AtomicInteger) this.A00.get(Integer.valueOf(r32.A01));
                if (atomicInteger2 != null) {
                    atomicInteger2.decrementAndGet();
                }
                i = i2;
            } else {
                return;
            }
        }
        if (!arrayBlockingQueue.isEmpty()) {
            this.A01.CQ8();
        }
    }

    public AnonymousClass19S(AnonymousClass19A r1, AnonymousClass00H r2, ArrayBlockingQueue arrayBlockingQueue, ConcurrentHashMap concurrentHashMap) {
        this.A02 = r2;
        this.A03 = arrayBlockingQueue;
        this.A01 = r1;
        this.A00 = concurrentHashMap;
    }
}
