package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3tQ  reason: invalid class name */
public class AnonymousClass3tQ extends AnonymousClass3uL implements C108405be {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final C1407773a A05;

    public void A1u() {
        A00(false);
        AnonymousClass3uP.A0h(this, false);
    }

    public void A20() {
    }

    public void A25(int i, boolean z) {
    }

    public void CKk() {
        this.A03 = true;
        StickerView stickerView = this.A05.A0E;
        if (stickerView != null) {
            stickerView.A02 = true;
            stickerView.A07();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3tQ(Context context, C108875cR r24, C441322g r25, AnonymousClass70H r26, C26631Sw r27, C50522Ut r28) {
        super(context, r24, r25);
        C98784ri r3;
        A1M();
        if (((C86304Rc) this.A1t.get()).A01()) {
            r3 = new C98784ri((Object) this, 28);
        } else {
            r3 = null;
        }
        C18030ve r12 = this.A0F;
        C34531kd r7 = this.A0V;
        C33251iW r8 = this.A0a;
        C18000vb r11 = this.A0D;
        AnonymousClass1KB r6 = this.A0S;
        AnonymousClass00H r2 = this.A0O;
        AnonymousClass10I r1 = this.A1X;
        C32021gV r0 = this.A1S;
        this.A05 = new C1407773a(this, r6, r7, r8, this.A03, this.A0v, r11, r12, this.A05, this.A06, r26, r27, r28, r0, r1, r2, r3);
        this.A04 = findViewById(2131428460);
        A00(true);
    }

    private void A00(boolean z) {
        boolean z2;
        C441322g r3 = (C441322g) ((AnonymousClass21V) this.A0I);
        if (z) {
            C108875cR r0 = this.A0k;
            if (r0 != null) {
                z2 = r0.Bgo(r3);
                StickerView stickerView = this.A05.A0E;
                if (z2) {
                    stickerView.A01 = new C74363Zr(this, r3, 0);
                } else {
                    stickerView.A01 = null;
                }
            } else {
                z2 = false;
            }
            this.A05.A02 = z2;
        }
        C1407773a r2 = this.A05;
        View.OnLongClickListener onLongClickListener = this.A2t;
        StickerView stickerView2 = r2.A0E;
        stickerView2.setOnLongClickListener(onLongClickListener);
        stickerView2.A02 = this.A03;
        r2.A06(new AnonymousClass4LJ(this), r3, z);
        if (AnonymousClass25A.A11(getFMessage())) {
            r2.A04();
        } else if (C79103uS.A1L(this)) {
            r2.A05();
        } else {
            r2.A03();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166301);
        ViewGroup viewGroup = this.A06;
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(viewGroup);
        if (r3.A0K() == null && C60532oB.A00(r3) == null) {
            setDateWrapperBackground(getDateWrapperBackground());
        } else {
            setDateWrapperBackground((Drawable) null);
            dimensionPixelSize = -dimensionPixelSize;
        }
        A0B.topMargin = dimensionPixelSize;
        viewGroup.setLayoutParams(A0B);
        if (this.A0l.Bew(r3)) {
            View view = this.A04;
            if (view != null) {
                C42491yG.A08(view, -1);
            }
            View findViewById = findViewById(2131435760);
            if (findViewById != null) {
                C42491yG.A08(findViewById, -1);
            }
        }
        A1y();
        A2n(r3);
        if (C18020vd.A05(C18040vf.A02, this.A0F, 1396)) {
            A1z();
        }
    }

    private Drawable getDateWrapperBackground() {
        return this.A09.BZi(C72453Mb.A05(this.A0I.A0v.A02 ? 1 : 0));
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = this.A06;
        int dimensionPixelOffset = AnonymousClass000.A0Y(viewGroup).getDimensionPixelOffset(2131166299);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        viewGroup.setBackground(drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    public void A1M() {
        if (!this.A02) {
            this.A02 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            this.A01 = C000200d.A00(r4.Ak2);
            this.A00 = C000200d.A00(r2.A2J);
        }
    }

    public void A1R() {
        ((AnonymousClass10T) this.A01.get()).notifyAllObservers(new C96994ok(27));
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1d() {
        AnonymousClass73B r0;
        if (C18020vd.A05(C18040vf.A02, this.A0F, 1396)) {
            C441322g r1 = (C441322g) ((AnonymousClass21V) this.A0I);
            if (!r1.A0v.A02 && (r0 = r1.A05) != null) {
                return r0.A0F;
            }
        }
        return false;
    }

    public boolean A1e() {
        AnonymousClass73B r0;
        C133806pW r5 = (C133806pW) this.A00.get();
        C441322g r6 = (C441322g) ((AnonymousClass21V) this.A0I);
        C18070vi.A0d(r6, 0);
        AnonymousClass205 r1 = r6.A0v;
        AnonymousClass1BI r4 = r1.A00;
        if (r4 == null) {
            return false;
        }
        AnonymousClass1E7 A012 = r5.A02.A01(r4);
        if (r1.A02) {
            return false;
        }
        if ((r6.A1G() || ((r0 = r6.A05) != null && r0.A0B)) && !((C95684md) r5.A04.get()).A00(A012, r4) && r5.A00()) {
            return true;
        }
        return false;
    }

    public void A1v() {
        C1407773a r1 = this.A05;
        r1.A01 = true;
        C32021gV r2 = r1.A0G;
        C17960vV.A07(r2);
        AnonymousClass21V r4 = r1.A00;
        r2.A0G(r1.A0E, r4, r1.A0F, r4.A0v, false);
    }

    public void A1y() {
        C28931bI r2 = this.A05.A0I;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r2, C88564a8.A01(r0, (AnonymousClass21V) this.A0I, r2));
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00(A1Z);
        }
    }

    public boolean Be6() {
        return ((C441322g) ((AnonymousClass21V) this.A0I)).A03;
    }

    public void CNi() {
        this.A05.A0E.A07();
    }

    public void COV() {
        this.A05.A0E.A08();
    }

    public C441322g getFMessage() {
        return (C441322g) ((AnonymousClass21V) this.A0I);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C441322g);
        super.setFMessage(r2);
    }

    public boolean A1V() {
        if (!C79103uS.A1L(this) || !this.A0l.CMI() || ((C441322g) ((AnonymousClass21V) this.A0I)).A05 == null) {
            return false;
        }
        return true;
    }

    public boolean A1Y() {
        return A1f();
    }

    public Integer getForwardButtonAccessibilityResource() {
        return 2131890523;
    }

    public int getCenteredLayoutId() {
        return 2131624925;
    }

    public int getIncomingLayoutId() {
        return 2131624925;
    }

    public int getOutgoingLayoutId() {
        return 2131624931;
    }
}
