package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Queue;

public class BG1 extends Handler {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06;
    public final Queue A07 = AnonymousClass8BR.A14();
    public final Queue A08 = AnonymousClass8BR.A14();

    public void handleMessage(Message message) {
        int i;
        Object remove;
        CT6 ct6 = (CT6) message.obj;
        if (ct6 != null) {
            C28611EAf eAf = ct6.A04;
            if (eAf != null) {
                boolean z = false;
                switch (message.what) {
                    case 3:
                        eAf.BKU((String) ct6.A05);
                        break;
                    case 4:
                        Object obj = ct6.A05;
                        C28111Yx.A02(obj);
                        eAf.C9V((Exception) obj);
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        long j = ct6.A03;
                        Object obj2 = ct6.A05;
                        C28111Yx.A02(obj2);
                        eAf.CAP(j, (Throwable) obj2);
                        break;
                    case 9:
                        this.A04 = false;
                        this.A03 = false;
                        this.A02 = -1;
                        this.A01 = -1;
                        this.A00 = ct6.A02;
                        eAf.Bpg(ct6.A03);
                        break;
                    case 10:
                        eAf.Bpf(ct6.A03);
                        break;
                    case 11:
                        this.A04 = true;
                        this.A03 = true;
                        this.A07.clear();
                        eAf.Bph(ct6.A03);
                        break;
                    case 12:
                        if (this.A04) {
                            long j2 = ct6.A03;
                            Object obj3 = ct6.A05;
                            C28111Yx.A02(obj3);
                            eAf.Bpd((C25556Chu) obj3, j2);
                            break;
                        }
                        break;
                    case 13:
                        long j3 = ct6.A03;
                        Object obj4 = ct6.A05;
                        C28111Yx.A02(obj4);
                        eAf.Bpe(j3, (Throwable) obj4);
                        break;
                    case 14:
                        this.A03 = false;
                        this.A02 = ct6.A02;
                        eAf.C8A(ct6.A03);
                        break;
                    case 15:
                        this.A03 = true;
                        break;
                    case 16:
                        long j4 = ct6.A03;
                        Object obj5 = ct6.A05;
                        C28111Yx.A02(obj5);
                        eAf.C89(j4, (Throwable) obj5);
                        break;
                    case 17:
                        eAf.C88(ct6.A03);
                        break;
                    case 18:
                        if (this.A03) {
                            if (!this.A06) {
                                long j5 = this.A02;
                                if (j5 == -1) {
                                    j5 = this.A00;
                                }
                                eAf.Bui((int) (ct6.A02 - j5), ct6.A03, ct6.A01);
                                break;
                            } else {
                                this.A06 = false;
                                break;
                            }
                        } else {
                            return;
                        }
                    case 19:
                        this.A07.add(Long.valueOf(ct6.A02));
                        break;
                    case 20:
                        Queue queue = this.A07;
                        if (!queue.isEmpty() && (remove = queue.remove()) != null) {
                            this.A08.add(remove);
                            break;
                        }
                    case 21:
                        this.A06 = true;
                        Queue queue2 = this.A08;
                        if (!queue2.isEmpty()) {
                            queue2.remove();
                            break;
                        }
                        break;
                    case 22:
                        Queue queue3 = this.A08;
                        if (!queue3.isEmpty()) {
                            queue3.remove();
                        }
                        this.A06 = true;
                        break;
                    case 23:
                        this.A05 = false;
                        this.A01 = ct6.A02;
                        i = 23;
                        break;
                    case 24:
                        this.A05 = true;
                        this.A07.clear();
                        i = 24;
                        break;
                    case 25:
                        if (this.A05) {
                            this.A06 = false;
                            long j6 = ct6.A03;
                            if (message.arg1 == 1) {
                                z = true;
                            }
                            eAf.Brn(j6, z);
                            break;
                        }
                        break;
                    case 26:
                        long j7 = ct6.A03;
                        Object obj6 = ct6.A05;
                        C28111Yx.A02(obj6);
                        eAf.Brm(j7, (Throwable) obj6);
                        break;
                    case 27:
                        Object obj7 = ct6.A05;
                        C28111Yx.A02(obj7);
                        Pair pair = (Pair) obj7;
                        eAf.BnU((String) pair.first, (String) pair.second);
                        break;
                    case 28:
                    case 29:
                        C28111Yx.A02(ct6.A05);
                        break;
                    case 30:
                        i = 30;
                        break;
                    case 31:
                        i = 31;
                        break;
                    case 32:
                        i = 32;
                        break;
                    case 33:
                        i = 33;
                        break;
                    case 34:
                        eAf.Bng(ct6.A03, message.arg1);
                        break;
                    case 35:
                        eAf.Bnf(ct6.A03, message.arg1);
                        break;
                    case 36:
                        long j8 = ct6.A03;
                        int i2 = message.arg1;
                        Object obj8 = ct6.A05;
                        C28111Yx.A02(obj8);
                        eAf.Bne((Throwable) obj8, i2, j8);
                        break;
                    case 37:
                        i = 37;
                        break;
                    case 38:
                        i = 38;
                        break;
                    case 39:
                        i = 39;
                        break;
                    case 40:
                        i = 40;
                        break;
                    case 41:
                        i = 41;
                        break;
                    case 42:
                        i = 42;
                        break;
                    case 43:
                        i = 43;
                        break;
                    case 44:
                        i = 44;
                        break;
                }
                eAf.Bi8(i, ct6.A03);
                synchronized (CT6.A08) {
                    ct6.A04 = null;
                    ct6.A05 = null;
                    int i3 = CT6.A06;
                    if (i3 < 5) {
                        ct6.A00 = CT6.A07;
                        CT6.A07 = ct6;
                        CT6.A06 = i3 + 1;
                    }
                }
                return;
            }
            throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(message, "Null camera event logger found when processing message:", AnonymousClass000.A10()));
        }
        throw AnonymousClass000.A0n("LoggerEventData must not be null");
    }

    public BG1(Looper looper) {
        super(looper);
    }
}
