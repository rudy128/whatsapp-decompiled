package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: X.3rT  reason: invalid class name */
public class AnonymousClass3rT extends C75433hU {
    public final AnonymousClass4R6 A00;

    public String BO6() {
        return "ListConversationTitle";
    }

    public void A0I() {
        super.A0I();
        this.A00.A00();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A0C.setText(2131896771);
        A0E(new C90004dN(this, activity, 44));
        AnonymousClass1Y5.A02(this.A04, 2131886186);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        AnonymousClass4R6 r3 = this.A00;
        AnonymousClass49P r2 = r3.A00;
        if (r2 != null) {
            r2.A0B(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            r3.A00 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3rT(X.AnonymousClass01E r33, X.C42201xn r34, X.AnonymousClass1KB r35, X.AnonymousClass11S r36, X.C72043Kk r37, X.AnonymousClass4ZR r38, X.C39511tC r39, X.C35751mk r40, X.AnonymousClass1VW r41, X.C24671Lf r42, X.C24921Me r43, X.C27191Vc r44, X.C27171Va r45, X.C18000vb r46, X.AnonymousClass1Q1 r47, X.C25181Nf r48, X.AnonymousClass1E7 r49, X.AnonymousClass1KW r50, X.C18030ve r51, X.C25191Ng r52, X.AnonymousClass1LT r53, X.C47712Jo r54, X.AnonymousClass1PU r55, X.AnonymousClass1DC r56, X.AnonymousClass10I r57) {
        /*
            r32 = this;
            r19 = 0
            r16 = r44
            r15 = r43
            r14 = r42
            r13 = r41
            r12 = r40
            r11 = r39
            r10 = r38
            r9 = r37
            r8 = r36
            r7 = r35
            r6 = r34
            r5 = r33
            r4 = r32
            r2 = r57
            r29 = r56
            r28 = r55
            r3 = r54
            r26 = r53
            r25 = r52
            r24 = r51
            r23 = r50
            r22 = r49
            r21 = r48
            r20 = r47
            r18 = r46
            r17 = r45
            r27 = r3
            r30 = r2
            r31 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = 1
            X.4kW r1 = new X.4kW
            r1.<init>(r4, r0)
            X.4R6 r0 = new X.4R6
            r0.<init>(r15, r1, r3, r2)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3rT.<init>(X.01E, X.1xn, X.1KB, X.11S, X.3Kk, X.4ZR, X.1tC, X.1mk, X.1VW, X.1Lf, X.1Me, X.1Vc, X.1Va, X.0vb, X.1Q1, X.1Nf, X.1E7, X.1KW, X.0ve, X.1Ng, X.1LT, X.2Jo, X.1PU, X.1DC, X.10I):void");
    }
}
