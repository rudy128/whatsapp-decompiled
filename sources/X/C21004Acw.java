package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.Acw  reason: case insensitive filesystem */
public final class C21004Acw implements BDP {
    public C1774998v A00;
    public final AnonymousClass1KB A01;
    public final C23651Hc A02;
    public final C18030ve A03;
    public final C29771cq A04;
    public final AnonymousClass1V7 A05;

    public void BcI(C195319t9 r7, String str, Map map) {
        int A0G = C72453Mb.A0G(map, r7, 1);
        if (C28291Zu.A01) {
            this.A05.A00(new A69("start_foreground_service_from_push"));
        }
        Object obj = map.get("push_payload");
        if (obj != null && (obj instanceof C1774998v)) {
            C18030ve r3 = this.A03;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A00(r2, r3, 4116) >= A0G) {
                C1774998v r4 = (C1774998v) obj;
                String str2 = r4.A07;
                if (C18070vi.A18(str2, "voip_call_offer_1on1")) {
                    if (!C18020vd.A05(r2, r3, 6334)) {
                        A00(this, r4, r7);
                    } else {
                        this.A01.A0J(new C21434Ak1(this, r4, r7, 22));
                    }
                } else if (C18070vi.A18(str2, "call_terminate") && C28291Zu.A01 && C18020vd.A05(r2, r3, 6405)) {
                    this.A05.A00(new A69("handle_push_payload", (Object) new C194079r8(r4, r7)));
                }
            }
        }
    }

    public static final void A00(C21004Acw acw, C1774998v r8, C195319t9 r9) {
        Log.i("CallingIncomingPushObserver/postPushPayloadWithPing");
        C23651Hc r1 = acw.A02;
        if (r1.A07 && r1.A02()) {
            String str = r8.A06;
            C18030ve r2 = acw.A03;
            if (C18020vd.A05(C18040vf.A02, r2, 6005)) {
                Log.i("CallingIncomingPushObserver/sendPing");
                C29771cq r6 = acw.A04;
                C20964AcI acI = new C20964AcI(acw, str);
                long A052 = AnonymousClass8BR.A05(r2, 6006);
                if (1000 > A052 || A052 >= 32001) {
                    A052 = 8000;
                }
                r6.A0A(acI, A052);
            }
        }
        acw.A05.A00(new A69("handle_push_payload", (Object) new C194079r8(r8, r9)));
    }

    public boolean CLz(C180619Ng r3, Long l, String str) {
        String str2;
        if (!C28291Zu.A01) {
            if (r3 != null) {
                str2 = r3.A00();
            } else {
                str2 = null;
            }
            if (C18070vi.A18(str2, "voip_call_offer_1on1")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C21004Acw(AnonymousClass1KB r1, C23651Hc r2, AnonymousClass1V7 r3, C18030ve r4, C29771cq r5) {
        C18070vi.A0w(r4, r1, r2, r5, r3);
        this.A03 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r5;
        this.A05 = r3;
    }
}
