package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.4XY  reason: invalid class name */
public final class AnonymousClass4XY {
    public TextView A00;
    public SwitchCompat A01;
    public TextView A02;
    public final Context A03;
    public final C93754jU A04 = new C93754jU(this, 1);
    public final C93754jU A05 = new C93754jU(this, 2);
    public final C74793cj A06;
    public final AnonymousClass4VV A07;
    public final AnonymousClass1CJ A08;
    public final AnonymousClass1BI A09;
    public final AnonymousClass00H A0A;

    public static final void A00(AnonymousClass4XY r3, Integer num) {
        if (num == AnonymousClass00R.A0C) {
            C31191fA A0Y = AnonymousClass3MW.A0Y(r3.A0A);
            Activity A002 = AnonymousClass1L9.A00(r3.A03);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            A0Y.A0E((AnonymousClass1FY) A002, r3.A09);
        }
        SwitchCompat switchCompat = r3.A01;
        if (switchCompat != null) {
            C31191fA A0Y2 = AnonymousClass3MW.A0Y(r3.A0A);
            switchCompat.setChecked(A0Y2.A05.A0S(r3.A09));
        }
    }

    public final void A01() {
        AnonymousClass1CJ r0 = this.A08;
        AnonymousClass1BI r5 = this.A09;
        C29691ci A0A2 = r0.A0A(r5);
        C74793cj r1 = this.A06;
        if (r1 != null) {
            AnonymousClass00H r2 = this.A0A;
            if (AnonymousClass3MW.A0Y(r2).A0L() && A0A2 != null) {
                this.A02 = AnonymousClass3MW.A0J(r1, 2131432096);
                this.A00 = AnonymousClass3MW.A0J(r1, 2131432091);
                this.A01 = (SwitchCompat) r1.findViewById(2131429050);
                if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MW.A0Y(r2).A06, 5498) || C42701yb.A01(r5)) {
                    r1.setVisibility(8);
                    return;
                }
                Context context = this.A03;
                Activity A002 = AnonymousClass1L9.A00(context);
                C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                if (this.A01 == null) {
                    LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
                    WDSSwitch wDSSwitch = new WDSSwitch(context, (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
                    wDSSwitch.setId(2131429050);
                    wDSSwitch.setLayoutParams(A0D);
                    if (this.A01 == null) {
                        if (r1 instanceof ListItemWithLeftIcon) {
                            ((ListItemWithLeftIcon) r1).A08(wDSSwitch);
                        } else if (r1 instanceof ListItemWithRightIcon) {
                            AnonymousClass3MW.A0C(r1, 2131431981).addView(wDSSwitch);
                        }
                    }
                    this.A01 = wDSSwitch;
                }
                C825248h r22 = new C825248h(A002, this, 26);
                r1.setVisibility(0);
                r1.setOnClickListener(r22);
                SwitchCompat switchCompat = this.A01;
                if (switchCompat != null) {
                    switchCompat.setChecked(A0A2.A0m);
                }
                SwitchCompat switchCompat2 = this.A01;
                if (switchCompat2 != null) {
                    switchCompat2.setOnClickListener(r22);
                }
                TextView textView = this.A00;
                if (textView != null) {
                    textView.setText(2131888171);
                }
            }
        }
    }

    public AnonymousClass4XY(Context context, C74793cj r4, AnonymousClass4VV r5, AnonymousClass1CJ r6, AnonymousClass1BI r7, AnonymousClass00H r8) {
        C18070vi.A0w(r6, r5, r8, r7, context);
        this.A08 = r6;
        this.A07 = r5;
        this.A0A = r8;
        this.A09 = r7;
        this.A03 = context;
        this.A06 = r4;
    }
}
