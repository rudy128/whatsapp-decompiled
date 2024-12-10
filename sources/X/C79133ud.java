package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.reels.ReelsPreviewView;

/* renamed from: X.3ud  reason: invalid class name and case insensitive filesystem */
public final class C79133ud extends C79153uk {
    public C218617r A00;
    public C18030ve A01;
    public AnonymousClass18K A02;
    public C28931bI A03;
    public final int A04;
    public final int A05 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166294);
    public final ReelsPreviewView A06;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setFMessageIO(C218617r r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWamRuntime(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C218617r getFMessageIO() {
        C218617r r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageIO");
        throw null;
    }

    public C28931bI getSelectionView() {
        return this.A03;
    }

    public final AnonymousClass18K getWamRuntime() {
        AnonymousClass18K r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public C79133ud(Context context, C108875cR r4, int i) {
        super(context, r4);
        A01();
        this.A04 = i;
        View.inflate(context, 2131626694, this);
        this.A03 = C72453Mb.A0s(this, 2131435134);
        this.A06 = (ReelsPreviewView) C18070vi.A05(this, 2131434433);
        C42491yG.A05(this, AnonymousClass3MW.A00(AnonymousClass000.A0Y(this), 2131166259));
        getOutlineProvider();
    }

    public void A02(AnonymousClass210 r4) {
        String str;
        super.A02(r4);
        if (r4.A01 == 4) {
            this.A06.A04(AnonymousClass4GJ.A00());
            return;
        }
        ReelsPreviewView reelsPreviewView = this.A06;
        reelsPreviewView.A03();
        reelsPreviewView.setTitle(r4.A06);
        reelsPreviewView.A05(r4, this.A05);
        C692136i A002 = AnonymousClass2UX.A00(r4);
        if (A002 != null) {
            str = A002.A04;
        } else {
            str = null;
        }
        reelsPreviewView.A07(str, true);
        AnonymousClass1HF.A0f(this, new AnonymousClass3SS(this, 6));
        if (r4.A07 != null) {
            C90074dU.A00(this, r4, 40);
        }
    }
}
