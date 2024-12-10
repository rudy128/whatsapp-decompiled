package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3rU  reason: invalid class name */
public final class AnonymousClass3rU extends C75433hU {
    public boolean A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C101095Bh(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C101105Bi(this));
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        super.onActivityCreated(activity, bundle);
        A0E(new AnonymousClass78Q((Object) activity, (Object) this, 45));
    }

    public final void A0K(boolean z) {
        String A032;
        this.A00 = z;
        AnonymousClass6Qj A033 = ((AnonymousClass72E) this.A04.get()).A03();
        AnonymousClass6Qj r1 = AnonymousClass6Qj.PREMIUM;
        C25811Ps A0W = AnonymousClass3MW.A0W(this.A03);
        if (A033 == r1) {
            A032 = A0W.A04();
        } else {
            A032 = A0W.A03();
        }
        TextEmojiLabel A0A = A0A();
        AnonymousClass01E r2 = this.A0U;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = A032;
        AnonymousClass3MY.A0y(r2, A0A, A1a, 2131889016);
        boolean z2 = this.A00;
        ImageView A09 = A09();
        if (z2) {
            A09.setVisibility(8);
            C18100vl r22 = this.A02;
            View A0A2 = AnonymousClass3MW.A0A(r22);
            ViewGroup.LayoutParams layoutParams = A0A2.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(17);
                A0A2.setLayoutParams(layoutParams2);
                ((LinearLayout) r22.getValue()).setGravity(17);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        A09.setVisibility(0);
        C18100vl r3 = this.A02;
        View A0A3 = AnonymousClass3MW.A0A(r3);
        ViewGroup.LayoutParams layoutParams3 = A0A3.getLayoutParams();
        if (layoutParams3 != null) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.addRule(17, AnonymousClass3MW.A0A(this.A01).getId());
            A0A3.setLayoutParams(layoutParams4);
            ((LinearLayout) r3.getValue()).setGravity(8388611);
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public String BO6() {
        return "MetaAiConversationTitle";
    }

    public void A0B() {
        super.A0B();
        A0K(this.A00);
    }

    public void A0H(AnonymousClass1E7 r3) {
        super.A0H(r3);
        A0K(this.A00);
        A09().setOnClickListener(this.A0T);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3rU(X.AnonymousClass01E r44, X.C42201xn r45, X.AnonymousClass1KB r46, X.AnonymousClass11S r47, X.C72043Kk r48, X.AnonymousClass4ZR r49, X.C39511tC r50, X.C35751mk r51, X.AnonymousClass1VW r52, X.C24671Lf r53, X.C24921Me r54, X.C27191Vc r55, X.C27171Va r56, X.C18000vb r57, X.AnonymousClass1Q1 r58, X.C25181Nf r59, X.AnonymousClass1E7 r60, X.AnonymousClass1KW r61, X.C18030ve r62, X.C25191Ng r63, X.AnonymousClass1LT r64, X.AnonymousClass1BI r65, X.AnonymousClass1PU r66, X.AnonymousClass1DC r67, X.AnonymousClass10I r68, X.AnonymousClass00H r69, X.AnonymousClass00H r70) {
        /*
            r43 = this;
            r18 = r47
            r17 = r46
            r3 = r68
            r9 = r62
            r10 = r61
            r1 = r17
            r0 = r18
            X.C18070vi.A0w(r9, r1, r0, r3, r10)
            r25 = r54
            r23 = r52
            r16 = r45
            r4 = r67
            r5 = r66
            r2 = r23
            r1 = r16
            r0 = r25
            X.C18070vi.A0x(r2, r1, r5, r4, r0)
            r15 = r56
            r24 = r53
            r22 = r51
            r14 = r57
            r13 = r58
            r1 = r24
            r0 = r22
            X.C18070vi.A0y(r14, r15, r1, r0, r13)
            r26 = r55
            r21 = r50
            r8 = r63
            r12 = r59
            r1 = r21
            r0 = r26
            X.C18070vi.A0t(r1, r0, r12, r8)
            r19 = r48
            r6 = r65
            r7 = r64
            r11 = r60
            r0 = r19
            X.C18070vi.A0u(r0, r7, r6, r11)
            r1 = 25
            r42 = r44
            r0 = r42
            X.C18070vi.A0d(r0, r1)
            r0 = 26
            r2 = r69
            X.C18070vi.A0d(r2, r0)
            r0 = 27
            r1 = r70
            X.C18070vi.A0d(r1, r0)
            r29 = 0
            r0 = r43
            r20 = r49
            r30 = r13
            r31 = r12
            r32 = r11
            r33 = r10
            r34 = r9
            r35 = r8
            r36 = r7
            r37 = r6
            r38 = r5
            r39 = r4
            r40 = r3
            r41 = r29
            r27 = r15
            r28 = r14
            r14 = r0
            r15 = r42
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.A03 = r2
            r0.A04 = r1
            X.5Bh r1 = new X.5Bh
            r1.<init>(r0)
            X.0vm r1 = X.AnonymousClass1DF.A01(r1)
            r0.A01 = r1
            X.5Bi r1 = new X.5Bi
            r1.<init>(r0)
            X.0vm r1 = X.AnonymousClass1DF.A01(r1)
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3rU.<init>(X.01E, X.1xn, X.1KB, X.11S, X.3Kk, X.4ZR, X.1tC, X.1mk, X.1VW, X.1Lf, X.1Me, X.1Vc, X.1Va, X.0vb, X.1Q1, X.1Nf, X.1E7, X.1KW, X.0ve, X.1Ng, X.1LT, X.1BI, X.1PU, X.1DC, X.10I, X.00H, X.00H):void");
    }
}
