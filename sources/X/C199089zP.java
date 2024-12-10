package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.9zP  reason: invalid class name and case insensitive filesystem */
public class C199089zP {
    public final A05 A00;
    public final /* synthetic */ A65 A01;

    public C199089zP(A05 a05, A65 a65) {
        this.A01 = a65;
        this.A00 = a05;
    }

    private A05 A00(A05 a05) {
        A65 a65 = this.A01;
        Queue queue = a65.A07;
        if (queue.isEmpty()) {
            if (a65.A00 != a05) {
                throw new IllegalStateException();
            }
        } else if (!((A05) queue.peek()).A01) {
            if (a65.A00 == a05) {
                Map map = a65.A05;
                if (((CancelableToken) map.get(a05)).cancel()) {
                    a05.A00(AnonymousClass00R.A0C);
                    map.remove(a05);
                    a65.A00 = null;
                    queue.offer(a05);
                    return a05;
                }
            } else if (queue.remove(a05)) {
                queue.offer(a05);
                return null;
            } else {
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public void A01(boolean z) {
        A05 a05;
        IllegalStateException illegalStateException;
        A65 a65 = this.A01;
        synchronized (a65.A03) {
            A05 a052 = this.A00;
            Integer num = a052.A00;
            if (num != AnonymousClass00R.A0N && num != AnonymousClass00R.A0Y && z != a052.A01) {
                a052.A01 = z;
                if (z) {
                    a05 = A00(a052);
                } else {
                    A05 a053 = a65.A00;
                    if (a053 != a052) {
                        if (a053 != null) {
                            Queue queue = a65.A07;
                            if (queue.remove(a052)) {
                                queue.offer(a052);
                                A05 a054 = a65.A00;
                                if (a054.A01) {
                                    a05 = A00(a054);
                                }
                            } else {
                                illegalStateException = new IllegalStateException();
                            }
                        } else {
                            illegalStateException = new IllegalStateException();
                        }
                        throw illegalStateException;
                    }
                    A65.A01(a65);
                    ArrayList A002 = A65.A00(a65);
                    A65.A02(a65, A002);
                }
                if (a05 != null) {
                    a65.A04.add(new C21471Akc((Object) this, (Object) a05, 49));
                }
                A65.A01(a65);
                ArrayList A0022 = A65.A00(a65);
                A65.A02(a65, A0022);
            }
        }
    }
}
