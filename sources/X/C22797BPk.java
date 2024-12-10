package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.BPk  reason: case insensitive filesystem */
public abstract class C22797BPk extends DAI {
    public static Thread A02;
    public static final BlockingQueue A03 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A04 = new AtomicBoolean();
    public static volatile C21334AiJ A05;
    public final AtomicLong A00 = new AtomicLong(0);
    public final AtomicLong A01 = new AtomicLong(0);

    public C22797BPk(Context context, int i) {
        super(i);
        if (AnonymousClass8BV.A1Z(A04)) {
            C22792BPf bPf = new C22792BPf(context, this);
            C27087DTm.A00(bPf);
            C27087DTm.A01(bPf, (String) null);
        }
    }
}
