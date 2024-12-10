package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.Iterator;

/* renamed from: X.3sh  reason: invalid class name and case insensitive filesystem */
public final class C78373sh extends AnonymousClass3uP {
    public AnonymousClass87j A00;
    public boolean A01;
    public final LinearLayout A02 = ((LinearLayout) C18070vi.A05(this, 2131433939));
    public final TextEmojiLabel A03;
    public final WaTextView A04 = ((WaTextView) C18070vi.A05(this, 2131433926));

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof AnonymousClass24P);
        this.A0I = r2;
    }

    public final void setPollSnapshotOptionViewHolderFactory(AnonymousClass87j r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A00 = (AnonymousClass87j) A0O.A09.get();
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166274);
    }

    public final AnonymousClass87j getPollSnapshotOptionViewHolderFactory() {
        AnonymousClass87j r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pollSnapshotOptionViewHolderFactory");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78373sh(Context context, C108875cR r4, AnonymousClass24P r5) {
        super(context, r4, r5);
        C18070vi.A0j(context, r5);
        A1M();
        TextEmojiLabel A0c = C72453Mb.A0c(this, 2131433927);
        this.A03 = A0c;
        AnonymousClass3Ma.A1L(this.A0F, A0c);
        A0c.setAutoLinkMask(0);
        A0c.setLinksClickable(false);
        AnonymousClass3uP.A0W(A0c, this);
        A00();
    }

    private final void A00() {
        Object next;
        int i;
        AnonymousClass206 fMessage = getFMessage();
        C18070vi.A0z(fMessage, "null cannot be cast to non-null type com.whatsapp.pollresultsnapshot.fmessage.FMessagePollResultSnapshot");
        AnonymousClass24P r6 = (AnonymousClass24P) fMessage;
        setMessageText(r6.A00, this.A03, r6);
        Iterator it = r6.A01.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                long j = ((C59152lq) next).A00;
                do {
                    Object next2 = it.next();
                    long j2 = ((C59152lq) next2).A00;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        }
        C59152lq r7 = (C59152lq) next;
        if (r7 != null) {
            i = (int) r7.A00;
        } else {
            i = 0;
        }
        LinearLayout linearLayout = this.A02;
        linearLayout.removeAllViews();
        LayoutInflater A0D = AnonymousClass3MZ.A0D(this);
        for (C59152lq A042 : r6.A01) {
            View inflate = A0D.inflate(2131626496, (ViewGroup) null);
            AnonymousClass87j pollSnapshotOptionViewHolderFactory = getPollSnapshotOptionViewHolderFactory();
            C18070vi.A0b(inflate);
            pollSnapshotOptionViewHolderFactory.BGd(inflate).A04(A042, r6, getHighlightTerms(), i);
            linearLayout.addView(inflate);
        }
        WaTextView waTextView = this.A04;
        int i2 = 8;
        if (AnonymousClass9RY.A00(r6) != null) {
            i2 = 0;
        }
        waTextView.setVisibility(i2);
        A2P(r6);
        A2N(r6);
    }

    public boolean A1Y() {
        if (A1f()) {
            if (!C18020vd.A05(C18040vf.A02, this.A0F, 10412)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getCenteredLayoutId() {
        return 2131624899;
    }

    public int getIncomingLayoutId() {
        return 2131624899;
    }

    public int getOutgoingLayoutId() {
        return 2131624900;
    }
}
