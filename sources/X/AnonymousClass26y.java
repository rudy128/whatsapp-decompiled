package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.26y  reason: invalid class name */
public class AnonymousClass26y extends Handler {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass26y(Looper looper, C32521hK r3) {
        super(looper);
        this.A02 = r3;
        this.A01 = C17880vN.A11();
    }

    public void A00(AnonymousClass1BI r4, boolean z) {
        if (!hasMessages(0, r4) && !hasMessages(3, r4)) {
            if (!hasMessages(2, r4)) {
                C32521hK r1 = (C32521hK) this.A02;
                if (r1.A01.A07 && (z || hasMessages(5, r4))) {
                    C32521hK.A01(r1, r4);
                }
            }
            removeMessages(4, r4);
            removeMessages(5, r4);
        }
    }

    public void handleMessage(Message message) {
        Message message2;
        long j;
        C32521hK r3;
        if (this.A00 != 0) {
            boolean z = true;
            if (message.what == 1) {
                AnonymousClass1VQ r5 = (AnonymousClass1VQ) this.A01;
                C62172qu r4 = r5.A0g;
                C17900vP.A0Y(r4, "app/startOutgoingCall/WHAT_START_PENDING_INTENT ", AnonymousClass000.A10());
                if (r4 != null) {
                    long j2 = r5.A00;
                    if (j2 > 0) {
                        r4.A01 = SystemClock.elapsedRealtime() - j2;
                    }
                    Boolean bool = (Boolean) message.obj;
                    if (bool == null) {
                        z = false;
                    }
                    C17960vV.A0F(z, "isRejoin is null");
                    if (bool == null || !bool.booleanValue()) {
                        r5.A0M.CGF(new C21431Ajy(r5, r4, 35));
                    } else {
                        AnonymousClass1VQ.A08(r5, r4);
                    }
                    r5.A0g = null;
                    return;
                }
                return;
            }
            return;
        }
        int i = message.what;
        if (i == 0) {
            AnonymousClass1BI r11 = (AnonymousClass1BI) message.obj;
            int i2 = message.arg2;
            if (!hasMessages(1, r11) && !hasMessages(4, r11)) {
                removeMessages(0, r11);
                if (hasMessages(2, r11) || hasMessages(5, r11)) {
                    AbstractMap abstractMap = (AbstractMap) this.A01;
                    Number number = (Number) abstractMap.get(r11);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (number != null && currentTimeMillis - number.longValue() > 10000) {
                        r3 = (C32521hK) this.A02;
                        if (r3.A01.A07) {
                            C32521hK.A02(r3, r11, i2);
                            C17880vN.A1N(r11, abstractMap, currentTimeMillis);
                        }
                    }
                    removeMessages(2, r11);
                    message2 = obtainMessage(2, 0, 0, r11);
                    j = 2500;
                } else {
                    r3 = (C32521hK) this.A02;
                    if (r3.A01.A07) {
                        C32521hK.A02(r3, r11, i2);
                        C17880vN.A1N(r11, (AbstractMap) this.A01, System.currentTimeMillis());
                    }
                    removeMessages(2, r11);
                    message2 = obtainMessage(2, 0, 0, r11);
                    j = 2500;
                }
                r3.A03.A00(r11);
                AnonymousClass12M r42 = r3.A02;
                Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
                AnonymousClass1EC A002 = C42941yz.A00(r11);
                if (A002 != null) {
                    Map map = r42.A0D;
                    if (!map.containsKey(A002) || AnonymousClass11P.A01(r42.A02) - C17880vN.A05(map.get(A002)) > 43200000) {
                        if (C18020vd.A05(C18040vf.A02, r42.A03, 3644)) {
                            r42.A04.CGL(new C146507Pj(r42, A002, 4), "GroupXmppMethods/sendGetGroupWhenComposing");
                        }
                    }
                }
                removeMessages(2, r11);
                message2 = obtainMessage(2, 0, 0, r11);
                j = 2500;
            } else {
                return;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass1BI r2 = (AnonymousClass1BI) message.obj;
            if (!hasMessages(0, r2) && !hasMessages(3, r2) && !C42701yb.A01(r2)) {
                if (!hasMessages(5, r2)) {
                    C32521hK r1 = (C32521hK) this.A02;
                    if (r1.A01.A07) {
                        C32521hK.A01(r1, r2);
                    }
                }
                removeMessages(1, r2);
                removeMessages(2, r2);
                return;
            }
            return;
        } else if (i == 3) {
            AnonymousClass1BI r32 = (AnonymousClass1BI) message.obj;
            int i3 = message.arg2;
            if (!hasMessages(1, r32) && !hasMessages(4, r32)) {
                if (!hasMessages(2, r32)) {
                    C32521hK r12 = (C32521hK) this.A02;
                    if (r12.A01.A07) {
                        C32521hK.A02(r12, r32, i3);
                    }
                }
                message2 = obtainMessage(5, 0, 0, r32);
                j = C20113A7w.A0L;
            } else {
                return;
            }
        } else if (i == 4) {
            A00((AnonymousClass1BI) message.obj, false);
            return;
        } else if (i == 5) {
            A00((AnonymousClass1BI) message.obj, true);
            return;
        } else {
            return;
        }
        sendMessageDelayed(message2, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass26y(Looper looper, AnonymousClass1VQ r3, AnonymousClass11P r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
    }
}
