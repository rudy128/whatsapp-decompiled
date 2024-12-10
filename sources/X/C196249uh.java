package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import org.json.JSONObject;

/* renamed from: X.9uh  reason: invalid class name and case insensitive filesystem */
public abstract class C196249uh {
    public final UserFlowLogger A00;
    public final C48562My A01;

    public final void A03(long j, String str, int i, String str2) {
        C18070vi.A0d(str, 1);
        A04(j, "error_domain", str);
        C48562My r3 = this.A01;
        if (r3 != null) {
            r3.flowAnnotate(j, "error_code", i);
        } else {
            UserFlowLogger userFlowLogger = this.A00;
            if (userFlowLogger != null) {
                userFlowLogger.flowAnnotate(j, "error_code", i);
            } else {
                throw C17880vN.A0g();
            }
        }
        A04(j, "error_description", str2);
        JSONObject A15 = C17880vN.A15();
        A15.put("domain", str);
        A15.put("code", i);
        A04(j, "error_json", AnonymousClass8BV.A0r(str2, "message", A15));
        if (r3 != null) {
            r3.flowEndFail(j, "", "");
            return;
        }
        UserFlowLogger userFlowLogger2 = this.A00;
        if (userFlowLogger2 != null) {
            userFlowLogger2.flowEndFail(j, "", "");
            return;
        }
        throw C17880vN.A0g();
    }

    public final void A04(long j, String str, String str2) {
        C18070vi.A0d(str2, 2);
        C48562My r0 = this.A01;
        if (r0 != null) {
            r0.flowAnnotate(j, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowAnnotate(j, str, str2);
            return;
        }
        throw C17880vN.A0g();
    }

    public final long A00(int i, int i2) {
        if (this.A01 != null) {
            return AnonymousClass8BU.A06(i2, i);
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            return userFlowLogger.generateFlowId(i, i2);
        }
        throw C17880vN.A0g();
    }

    public final void A01(long j) {
        C48562My r0 = this.A01;
        if (r0 != null) {
            r0.flowEndCancel(j, CancelReason.USER_CANCELLED);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowEndCancel(j, CancelReason.USER_CANCELLED);
            return;
        }
        throw C17880vN.A0g();
    }

    public final void A02(long j) {
        C48562My r3 = this.A01;
        if (r3 != null) {
            r3.BLQ(new C58442kh("arfx", false), j);
            return;
        }
        UserFlowConfig build = new UserFlowConfig.UserFlowConfigBuilder("arfx", false).build();
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowStart(j, build);
            return;
        }
        throw C17880vN.A0g();
    }

    public final void A05(long j, String str, String str2) {
        C48562My r0 = this.A01;
        if (r0 != null) {
            int A02 = AnonymousClass8BR.A02(j);
            r0.A00.markerPoint((int) j, A02, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowMarkPoint(j, str, str2);
            return;
        }
        throw C17880vN.A0g();
    }

    public final void A06(A4D a4d, String str, String str2, long j) {
        String str3 = a4d.A00;
        C18070vi.A0X(str3);
        A04(j, "effect_session_id", str3);
        String str4 = a4d.A01;
        C18070vi.A0X(str4);
        A04(j, "delivery_session_id", str4);
        A04(j, "product_session_id", a4d.A04);
        A04(j, "product_name", a4d.A03);
        A04(j, "effect_id", str);
        if (str2 != null) {
            A04(j, "effect_instance_id", str2);
        }
    }

    public C196249uh(UserFlowLogger userFlowLogger, C48562My r4) {
        this.A01 = r4;
        this.A00 = userFlowLogger;
        if (AnonymousClass000.A1X(r4) == (userFlowLogger != null ? false : true)) {
            throw AnonymousClass000.A0n("Provide either userFlowLogger or fbUserFlowLogger!");
        }
    }
}
