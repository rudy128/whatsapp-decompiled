package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.whatsapp.productinfra.avatar.ui.liveediting.AvatarLiveEditingView$onAttachedToWindow$1;
import java.util.concurrent.CancellationException;

public final class BIG extends FrameLayout {
    public C22699BLb A00;
    public C24883COb A01;
    public AnonymousClass1OB A02;
    public final C000100c A03;
    public final C18100vl A04;

    /* access modifiers changed from: private */
    public final CRE getPreviewProgressBar() {
        return (CRE) this.A04.getValue();
    }

    public BIG(Context context) {
        super(context);
        this.A03 = (C000100c) AnonymousClass00E.A00(context, C000100c.class);
        this.A04 = AnonymousClass1DF.A01(new C27834DmV(context, this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hashCode();
        C25014CTo A96 = AnonymousClass10G.A96(((AnonymousClass10E) this.A03).Ao8.A00);
        C24883COb cOb = this.A01;
        if (cOb == null) {
            C18070vi.A11("onEventReceived");
            throw null;
        }
        Object obj = A96.A06.get();
        C18070vi.A0X(obj);
        Object obj2 = A96.A08.get();
        C18070vi.A0X(obj2);
        Object obj3 = A96.A04.get();
        C18070vi.A0X(obj3);
        C24811CLe cLe = A96.A00;
        Object obj4 = A96.A05.get();
        C18070vi.A0X(obj4);
        Object obj5 = A96.A07.get();
        C18070vi.A0X(obj5);
        CT3 ct3 = (CT3) obj5;
        C24813CLg cLg = A96.A01;
        C65312wC r5 = A96.A02;
        C24997CSx cSx = A96.A03;
        C22699BLb bLb = new C22699BLb((C25724Cku) obj3, cLe, cLg, r5, cSx, ct3, (CT4) obj4, cOb, (C18600wl) obj, (C18600wl) obj2);
        this.A00 = bLb;
        CT4 ct4 = bLb.A0B;
        C55472fp r2 = ct4.A01;
        AnonymousClass3LX r1 = ct4.A00;
        C18070vi.A0d(r1, 0);
        r2.A03.add(r1);
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            this.A02 = AnonymousClass3MY.A0s(new AvatarLiveEditingView$onAttachedToWindow$1(A002, this, (C30391dr) null), AnonymousClass2SS.A00(A002));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hashCode();
        hashCode();
        AnonymousClass1OB r1 = this.A02;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        C22699BLb bLb = this.A00;
        if (bLb != null) {
            bLb.A0S();
            removeAllViews();
        }
    }

    public void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        while (true) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup == null) {
                break;
            }
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (!(viewGroup.getParent() instanceof ViewGroup)) {
                break;
            }
            parent = viewGroup.getParent();
        }
        super.onMeasure(i, i2);
    }
}
