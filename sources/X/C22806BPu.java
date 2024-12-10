package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.BPu  reason: case insensitive filesystem */
public class C22806BPu extends DDR implements ED9 {
    public GestureDetector A00;
    public ScaleGestureDetector A01;
    public View.OnTouchListener A02;
    public View A03;
    public CSK A04;
    public CJQ A05;
    public CJR A06;
    public boolean A07;
    public final View.OnTouchListener A08 = new D55(this, 0);
    public final GestureDetector.SimpleOnGestureListener A09;
    public final ScaleGestureDetector.OnScaleGestureListener A0A;

    public C22892BUd BTg() {
        return ED9.A04;
    }

    public C22806BPu(C28592E9h e9h) {
        this.A00 = e9h;
        BH3 bh3 = new BH3(this, 0);
        this.A09 = bh3;
        BHB bhb = new BHB(this);
        this.A0A = bhb;
        EDI edi = (EDI) DDR.A09(this, EDI.A00);
        C25313CdJ cdJ = ED9.A01;
        Boolean A0i = AnonymousClass000.A0i();
        boolean A0B = DDR.A0B(this, cdJ, A0i);
        boolean A0B2 = DDR.A0B(this, ED9.A02, A0i);
        this.A07 = DDR.A0B(this, ED9.A03, A0i);
        if (A0B) {
            GestureDetector gestureDetector = new GestureDetector(DDR.A06(this), bh3, ((C22889BUa) edi).A00);
            this.A00 = gestureDetector;
            gestureDetector.setOnDoubleTapListener(bh3);
            this.A00.setIsLongpressEnabled(false);
        }
        if (A0B2) {
            this.A01 = new ScaleGestureDetector(DDR.A06(this), bhb, ((C22889BUa) edi).A00);
        }
    }
}
