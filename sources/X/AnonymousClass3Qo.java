package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;

/* renamed from: X.3Qo  reason: invalid class name */
public final class AnonymousClass3Qo extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11C A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public AnonymousClass3Qo(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3Ma.A0a(AnonymousClass3MW.A0O(generatedComponent()));
        }
        Integer num = AnonymousClass00R.A0C;
        this.A05 = C43531zx.A02(this, num, 2131436208);
        this.A04 = C84074Ht.A00(this, num, 2131431496);
        this.A03 = C84074Ht.A00(this, num, 2131427466);
        LayoutInflater.from(context).inflate(2131623989, this, true);
        setGravity(17);
        setOrientation(0);
        setBackgroundResource(2131230986);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168776);
        int A052 = C72463Mc.A05(this);
        setPadding(dimensionPixelSize, A052, dimensionPixelSize, A052);
        setImportantForAccessibility(4);
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r5.BMQ() != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setViewState(X.C108745cE r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.WaTextView r1 = r4.getTitle()
            X.4ZN r0 = r5.BaT()
            X.AnonymousClass4ZN.A02(r4, r1, r0)
            com.whatsapp.WaTextView r3 = r4.getTitle()
            X.5Zi r2 = r5.BSd()
            if (r2 != 0) goto L_0x0021
            X.4ZN r1 = r5.BMQ()
            r0 = 17
            if (r1 == 0) goto L_0x0024
        L_0x0021:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x0024:
            r3.setGravity(r0)
            if (r2 == 0) goto L_0x0040
            X.0vl r0 = r4.A04
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            android.view.View r1 = r0.A02()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            android.graphics.drawable.Drawable r0 = r2.BQt(r0)
            r1.setImageDrawable(r0)
        L_0x0040:
            X.4ZN r0 = r5.BMJ()
            if (r0 == 0) goto L_0x0055
            android.content.Context r2 = r4.getContext()
            X.11C r1 = r4.getSystemServices()
            java.lang.CharSequence r0 = X.AnonymousClass4ZN.A00(r4, r0)
            X.AnonymousClass1Y5.A00(r2, r1, r0)
        L_0x0055:
            X.4ZN r1 = r5.BMQ()
            if (r1 == 0) goto L_0x0068
            X.0vl r0 = r4.A03
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0M(r0)
            X.AnonymousClass4ZN.A02(r4, r0, r1)
        L_0x0068:
            android.view.View$OnClickListener r0 = r5.BO5()
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Qo.setViewState(X.5cE):void");
    }

    private final C28931bI getAction() {
        return AnonymousClass3MX.A0v(this.A03);
    }

    private final C28931bI getIcon() {
        return AnonymousClass3MX.A0v(this.A04);
    }

    private final WaTextView getTitle() {
        return (WaTextView) this.A05.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }
}
