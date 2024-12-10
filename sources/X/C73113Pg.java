package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.3Pg  reason: invalid class name and case insensitive filesystem */
public class C73113Pg extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public AnonymousClass1VW A01;
    public AnonymousClass11P A02;
    public C25181Nf A03;
    public C27131Uv A04;
    public AnonymousClass689 A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public final View A08;
    public final FrameLayout A09;
    public final ThumbnailButton A0A;
    public final C37451pZ A0B;
    public final WaMapView A0C;

    private void setMessage(AnonymousClass219 r8) {
        long A0I;
        AnonymousClass1E7 A012;
        this.A09.setVisibility(0);
        C27131Uv r1 = this.A04;
        boolean z = r8.A0v.A02;
        if (z) {
            A0I = r1.A0J(r8);
        } else {
            A0I = r1.A0I(r8);
        }
        boolean A022 = C88254Yy.A02(this.A02, r8, A0I);
        WaMapView waMapView = this.A0C;
        AnonymousClass689 r12 = this.A05;
        waMapView.A03(r12, r8, A022);
        Context context = getContext();
        AnonymousClass11S r5 = this.A00;
        View.OnClickListener A002 = C88254Yy.A00(context, r5, r12, r8, A022);
        View view = this.A08;
        view.setOnClickListener(A002);
        AnonymousClass3MY.A0w(getContext(), view, 2131889012);
        ThumbnailButton thumbnailButton = this.A0A;
        AnonymousClass1VW r3 = this.A01;
        C37451pZ r2 = this.A0B;
        C25181Nf r13 = this.A03;
        if (z) {
            A012 = AnonymousClass3MZ.A0Q(r5);
        } else {
            UserJid A0I2 = r8.A0I();
            if (A0I2 != null) {
                A012 = r13.A01(A0I2);
            } else {
                r3.A09(thumbnailButton, 2131231047);
                return;
            }
        }
        r2.A07(thumbnailButton, A012);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public C73113Pg(Context context, C37451pZ r4) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A6O(A0O);
            this.A00 = AnonymousClass10E.A17(A0O);
            this.A05 = (AnonymousClass689) A0O.A5q.get();
            this.A01 = AnonymousClass3MZ.A0e(A0O);
            this.A04 = (C27131Uv) A0O.A5p.get();
            this.A03 = AnonymousClass3MZ.A0m(A0O);
        }
        this.A0B = r4;
        View.inflate(context, 2131626831, this);
        this.A0C = (WaMapView) AnonymousClass1HF.A06(this, 2131434918);
        this.A08 = AnonymousClass1HF.A06(this, 2131434920);
        this.A09 = (FrameLayout) AnonymousClass1HF.A06(this, 2131434915);
        this.A0A = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131434916);
    }

    public void setMessage(AnonymousClass218 r3) {
        this.A0C.setVisibility(0);
        if (r3 instanceof AnonymousClass21B) {
            setMessage((AnonymousClass21B) r3);
        } else {
            setMessage((AnonymousClass219) r3);
        }
    }

    private void setMessage(AnonymousClass21B r6) {
        this.A09.setVisibility(8);
        this.A0C.A04(this.A05, r6);
        if (r6.A01 != 0.0d || r6.A00 != 0.0d) {
            View view = this.A08;
            AnonymousClass3MY.A1E(view, this, r6, 22);
            AnonymousClass3MY.A0w(getContext(), view, 2131891804);
        }
    }
}
