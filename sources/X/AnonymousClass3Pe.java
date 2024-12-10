package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.bot.commands.BotCommandsPickerView;
import com.whatsapp.conversation.ctwa.QualitySurveyView;
import com.whatsapp.ctwa.icebreaker.IceBreakerPickerView;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.3Pe  reason: invalid class name */
public abstract class AnonymousClass3Pe extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A01(WaFrameLayout waFrameLayout) {
        waFrameLayout.A01 = 0;
        waFrameLayout.A00 = 0;
        waFrameLayout.A03 = 0;
        waFrameLayout.A02 = 0;
        waFrameLayout.A04 = false;
    }

    public static void A00(AnonymousClass10E r1, C27691Xc r2, C77913rm r3) {
        r3.A04 = (C18030ve) r1.A04.get();
        r3.A02 = (AnonymousClass4ZT) r2.A0z.A9g.get();
        r3.A03 = (AnonymousClass11C) r1.AAp.get();
    }

    public void A04() {
        if (this instanceof QualitySurveyView) {
            QualitySurveyView qualitySurveyView = (QualitySurveyView) this;
            if (!qualitySurveyView.A04) {
                qualitySurveyView.A04 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(qualitySurveyView);
                qualitySurveyView.A03 = AnonymousClass10E.A8r(A0X);
                qualitySurveyView.A00 = AnonymousClass10E.A12(A0X);
                qualitySurveyView.A01 = AnonymousClass3Ma.A0L(A0X);
                qualitySurveyView.A02 = AnonymousClass3Ma.A0a(A0X);
            }
        } else if (this instanceof AnonymousClass3go) {
            AnonymousClass3go r1 = (AnonymousClass3go) this;
            if (!r1.A01) {
                r1.A01 = true;
                r1.A00 = AnonymousClass10E.A8r(((C27691Xc) AnonymousClass3MX.A0T(r1)).A10);
            }
        } else if (this instanceof AnonymousClass3gm) {
            AnonymousClass3gm r2 = (AnonymousClass3gm) this;
            if (r2 instanceof MentionPickerView) {
                MentionPickerView mentionPickerView = (MentionPickerView) r2;
                if (!mentionPickerView.A0P) {
                    mentionPickerView.A0P = true;
                    C27691Xc A0O = AnonymousClass3MY.A0O(mentionPickerView);
                    AnonymousClass10E r12 = A0O.A10;
                    A00(r12, A0O, mentionPickerView);
                    mentionPickerView.A09 = AnonymousClass10E.A6O(r12);
                    mentionPickerView.A02 = AnonymousClass10E.A12(r12);
                    mentionPickerView.A0I = (C32091gc) r12.A6G.get();
                    mentionPickerView.A03 = AnonymousClass10E.A17(r12);
                    mentionPickerView.A0K = AnonymousClass10E.AL1(r12);
                    mentionPickerView.A0B = AnonymousClass3Ma.A0d(r12);
                    mentionPickerView.A07 = AnonymousClass3MZ.A0i(r12);
                    mentionPickerView.A05 = AnonymousClass10E.A4z(r12);
                    mentionPickerView.A06 = AnonymousClass3MZ.A0g(r12);
                    mentionPickerView.A0A = AnonymousClass10E.A6Q(r12);
                    mentionPickerView.A0C = AnonymousClass3MZ.A0n(r12);
                    mentionPickerView.A0M = AnonymousClass3MX.A12(r12);
                    mentionPickerView.A0E = AnonymousClass3MZ.A0q(r12);
                    mentionPickerView.A08 = AnonymousClass3Ma.A0U(r12);
                    mentionPickerView.A0L = C000200d.A00(r12.AFb);
                    mentionPickerView.A0D = AnonymousClass3MY.A0V(r12);
                    mentionPickerView.A04 = AnonymousClass3MZ.A0T(r12.A00);
                }
            } else if (r2 instanceof IceBreakerPickerView) {
                IceBreakerPickerView iceBreakerPickerView = (IceBreakerPickerView) r2;
                if (!iceBreakerPickerView.A00) {
                    iceBreakerPickerView.A00 = true;
                    C27691Xc A0O2 = AnonymousClass3MY.A0O(iceBreakerPickerView);
                    A00(A0O2.A10, A0O2, iceBreakerPickerView);
                }
            } else if (r2 instanceof C77873rd) {
                C77873rd r22 = (C77873rd) r2;
                if (!r22.A04) {
                    r22.A04 = true;
                    C27691Xc A0O3 = AnonymousClass3MY.A0O(r22);
                    AnonymousClass10E r13 = A0O3.A10;
                    A00(r13, A0O3, r22);
                    r22.A00 = (C106625Wo) A0O3.A0J.get();
                    r22.A02 = (C24771Lp) r13.A0o.get();
                    r22.A03 = AnonymousClass3Ma.A0a(r13);
                }
            } else if (r2 instanceof C77863rc) {
                C77863rc r23 = (C77863rc) r2;
                if (!r23.A00) {
                    r23.A00 = true;
                    AnonymousClass033 A0T = AnonymousClass3MX.A0T(r23);
                    BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) r23;
                    C27691Xc r14 = (C27691Xc) A0T;
                    AnonymousClass10E r0 = r14.A10;
                    A00(r0, r14, botCommandsPickerView);
                    botCommandsPickerView.A01 = AnonymousClass3Ma.A0U(r0);
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                C27691Xc r15 = (C27691Xc) AnonymousClass3MX.A0T(r2);
                A00(r15.A10, r15, (C77913rm) r2);
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3Pe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
    }
}
