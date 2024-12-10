package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.0AU  reason: invalid class name */
public final class AnonymousClass0AU extends C014308l implements C17630uy, C17580ut, C17610uw, C17560ur {
    public AnonymousClass0t9 A00;
    public C16080rg A01;
    public AnonymousClass0CI A02;
    public C16840tJ A03;
    public C17210uI A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass092 A07;
    public final AnonymousClass0US A08;
    public final C015008t A09;
    public final AnonymousClass0AS A0A;
    public final ScrollableNestedScrollConnection A0B;
    public final ScrollingLogic A0C;
    public final NestedScrollDispatcher A0D;

    public void BCR(C16700sr r2) {
        r2.CIF(false);
    }

    public boolean C1L(KeyEvent keyEvent) {
        return false;
    }

    public static final AnonymousClass0Tv A00(C28644ECa eCa) {
        return new AnonymousClass0Tv(new AnonymousClass0U3(eCa));
    }

    private final void A01() {
        this.A08.A01 = A00((C28644ECa) C02690Ez.A00(AnonymousClass0OD.A01, this));
    }

    public boolean BwR(KeyEvent keyEvent) {
        long A0p;
        if (!this.A05) {
            return false;
        }
        if (((((long) keyEvent.getKeyCode()) << 32) != AnonymousClass0ND.A0A && (((long) keyEvent.getKeyCode()) << 32) != AnonymousClass0ND.A0B) || C02580Eo.A00(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        ScrollingLogic scrollingLogic = this.A0C;
        AnonymousClass0CI r3 = this.A02;
        AnonymousClass0CI r2 = AnonymousClass0CI.Vertical;
        long j = this.A07.A00;
        if (r3 == r2) {
            float A0H = (float) AnonymousClass000.A0H(j);
            if (!AnonymousClass000.A1P(((((long) keyEvent.getKeyCode()) << 32) > AnonymousClass0ND.A0B ? 1 : ((((long) keyEvent.getKeyCode()) << 32) == AnonymousClass0ND.A0B ? 0 : -1)))) {
                A0H = -A0H;
            }
            A0p = AnonymousClass001.A0p(0.0f, A0H);
        } else {
            float f = (float) ((int) (j >> 32));
            if (!AnonymousClass000.A1P(((((long) keyEvent.getKeyCode()) << 32) > AnonymousClass0ND.A0B ? 1 : ((((long) keyEvent.getKeyCode()) << 32) == AnonymousClass0ND.A0B ? 0 : -1)))) {
                f = -f;
            }
            A0p = AnonymousClass001.A0p(f, 0.0f);
        }
        long j2 = AnonymousClass0QY.A03;
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new ScrollableNode$onKeyEvent$1$1(scrollingLogic, (C30391dr) null, A0p), A0B(), 3);
        return true;
    }

    public void A0L() {
        A01();
        AnonymousClass0F7.A00(this, new C07850e9(this));
    }

    public void BzO() {
        A01();
    }

    public AnonymousClass0AU(AnonymousClass0t9 r13, C17010ta r14, C16080rg r15, AnonymousClass0CI r16, C16840tJ r17, C17210uI r18, boolean z, boolean z2) {
        AnonymousClass0US r7 = r15;
        C16840tJ r9 = r17;
        this.A03 = r9;
        AnonymousClass0CI r8 = r16;
        this.A02 = r8;
        AnonymousClass0t9 r6 = r13;
        this.A00 = r13;
        this.A05 = z;
        boolean z3 = z2;
        this.A06 = z3;
        this.A01 = r15;
        this.A04 = r18;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0D = nestedScrollDispatcher;
        AnonymousClass0US r0 = new AnonymousClass0US(A00(ScrollableKt.A02));
        this.A08 = r0;
        ScrollingLogic scrollingLogic = new ScrollingLogic(r6, r15 == null ? r0 : r7, r8, r9, nestedScrollDispatcher, z3);
        this.A0C = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.A05);
        this.A0B = scrollableNestedScrollConnection;
        AnonymousClass092 r2 = new AnonymousClass092(r14, this.A02, this.A03, this.A06);
        A0N(r2);
        this.A07 = r2;
        C015008t r02 = new C015008t(this.A05);
        A0N(r02);
        this.A09 = r02;
        A0N(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        A0N(new C015408x());
        A0N(new AnonymousClass07N(r2));
        A0N(new C015108u(new C09510gp(this)));
        AnonymousClass0AS r1 = new AnonymousClass0AS(this.A02, scrollingLogic, this.A04, nestedScrollDispatcher, this.A05);
        A0N(r1);
        this.A0A = r1;
    }
}
