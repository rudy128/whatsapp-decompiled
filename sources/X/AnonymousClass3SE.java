package X;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;

/* renamed from: X.3SE  reason: invalid class name */
public final class AnonymousClass3SE extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public AnonymousClass3SE(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3MW.A0s(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A05 = C99154sM.A01(this, 10);
        this.A04 = C99154sM.A01(this, 11);
        this.A03 = C99154sM.A01(this, 12);
        View.inflate(context, 2131625141, this);
        C72473Md.A0z(this);
        AnonymousClass3MY.A14(getResources(), this, 2131168777);
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final CheckBox getCheckBox() {
        return (CheckBox) AnonymousClass3MX.A14(this.A03);
    }

    private final WaTextView getSubtitle() {
        return (WaTextView) AnonymousClass3MX.A14(this.A04);
    }

    private final WaTextView getTitle() {
        return (WaTextView) AnonymousClass3MX.A14(this.A05);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    private final void setupCheckBox(C87084Uf r3) {
        C90874em.A00(getCheckBox(), r3, 8);
    }

    private final void setupSubTitle(C87084Uf r3) {
        getSubtitle().setText(r3.A01);
    }

    private final void setupTitle(C87084Uf r4) {
        String str;
        WaTextView title = getTitle();
        int i = r4.A00;
        if (i == 1) {
            str = "Crash Report";
        } else if (i == 2) {
            str = "Memory Report";
        } else if (i != 3) {
            str = "Slow Conversation Row Report";
        } else {
            str = "Ghost View Report";
        }
        title.setText(str);
    }

    private final void setupTitleSubtitleContainer(C87084Uf r3) {
        C90014dO.A00(findViewById(2131436241), this, r3, 19);
    }

    public static final void setupTitleSubtitleContainer$lambda$3(AnonymousClass3SE r4, C87084Uf r5, View view) {
        C18070vi.A0h(r4, r5);
        r4.getWaIntents().get();
        Context A042 = AnonymousClass3MY.A04(r4);
        int i = r5.A00;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(A042.getPackageName(), "com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity");
        A0A.putExtra("report_type", i);
        AnonymousClass3MY.A11(A0A, r4);
    }

    public final void A07(C87084Uf r1) {
        setupTitle(r1);
        setupSubTitle(r1);
        setupCheckBox(r1);
        setupTitleSubtitleContainer(r1);
    }
}
