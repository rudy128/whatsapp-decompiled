package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8mm  reason: invalid class name and case insensitive filesystem */
public class C169718mm extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass00H A02;

    public boolean A0J() {
        return true;
    }

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        String[] strArr = a6u.A06;
        C62382rJ r3 = a6u.A01;
        C166378cn r2 = a6u.A03;
        if (strArr.length != 1 || !AnonymousClass8BU.A1a("setting_pushName", strArr) || !C62382rJ.A03.equals(r3) || r2 == null || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField0_ & 64) == 0) {
            return null;
        }
        AnonymousClass8YJ r0 = r2.pushNameSetting_;
        AnonymousClass8YJ r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8YJ.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null) {
            r1 = AnonymousClass8YJ.DEFAULT_INSTANCE;
        }
        return new AnonymousClass8q6(a6u.A02, str, r1.name_, r2.timestamp_);
    }

    public List A0F(boolean z) {
        return Collections.singletonList(new AnonymousClass8q6((C19999A2n) null, (String) null, this.A00.A0D(), AnonymousClass11P.A01(this.A01)));
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8q6 r6 = (AnonymousClass8q6) a8l;
        AnonymousClass11S r0 = this.A00;
        String str = r6.A00;
        r0.A0L(str);
        C17880vN.A0U(this.A02).A0M(Message.obtain((Handler) null, 0, 3, 0, str));
        A08(r6);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        AnonymousClass8q6 r6 = (AnonymousClass8q6) a8l;
        if (a8l2 == null || a8l2.A04 < r6.A04) {
            String str = r6.A00;
            if (!str.isEmpty()) {
                this.A00.A0L(str);
                C17880vN.A0U(this.A02).A0M(Message.obtain((Handler) null, 0, 3, 0, str));
            } else {
                Log.e("PushNameSettingHandler/handleMutation/invalid: push name is empty.");
            }
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public C169718mm(AnonymousClass11S r1, AnonymousClass11P r2, C26331Rs r3, AnonymousClass00H r4) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public String A0D() {
        return "critical_block";
    }

    public String A0E() {
        return "setting_pushName";
    }
}
