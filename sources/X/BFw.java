package X;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

public class BFw extends Handler {
    public final /* synthetic */ C26669D8s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BFw(Looper looper, C26669D8s d8s) {
        super(looper);
        this.A00 = d8s;
    }

    public void handleMessage(Message message) {
        List<C26669D8s> list;
        int i = message.what;
        if (i == 0) {
            C26669D8s d8s = this.A00;
            Object obj = message.obj;
            int i2 = d8s.A01;
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                if (obj instanceof Exception) {
                    Exception exc = (Exception) obj;
                    list = d8s.A0A.A05;
                    for (C26669D8s A02 : list) {
                        C26669D8s.A02(A02, exc, 3);
                    }
                } else {
                    try {
                        d8s.A0B.A09((byte[]) obj);
                        list = d8s.A0A.A05;
                        for (C26669D8s d8s2 : list) {
                            if (C26669D8s.A04(d8s2, false)) {
                                C26669D8s.A03(d8s2, true);
                            }
                        }
                    } catch (Exception e) {
                        list = d8s.A0A.A05;
                        for (C26669D8s A022 : list) {
                            C26669D8s.A02(A022, e, 1);
                        }
                    }
                }
                list.clear();
            }
        } else if (i == 1) {
            C26669D8s d8s3 = this.A00;
            Object obj2 = message.obj;
            int i3 = d8s3.A01;
            if (i3 == 3 || i3 == 4) {
                if (obj2 instanceof Exception) {
                    Exception exc2 = (Exception) obj2;
                    if (!(exc2 instanceof NotProvisionedException)) {
                        C26669D8s.A02(d8s3, exc2, 1);
                        return;
                    }
                } else {
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (C24736CHy.A00.equals(d8s3.A0D)) {
                            bArr = C82.A00(bArr);
                        }
                        byte[] A0C = d8s3.A0B.A0C(d8s3.A07, bArr);
                        if (!(d8s3.A06 == null || A0C == null || A0C.length == 0)) {
                            d8s3.A06 = A0C;
                        }
                        d8s3.A01 = 4;
                        Iterator it = d8s3.A09.A00.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass000.A0s("listener");
                        }
                        return;
                    } catch (Exception e2) {
                        if (!(e2 instanceof NotProvisionedException)) {
                            C26669D8s.A02(d8s3, e2, 1);
                            return;
                        }
                    }
                }
                d8s3.A0A.A01(d8s3);
            }
        }
    }
}
