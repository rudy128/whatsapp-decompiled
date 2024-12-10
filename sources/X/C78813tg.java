package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.3tg  reason: invalid class name and case insensitive filesystem */
public class C78813tg extends AnonymousClass3uK {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03 = false;
    public boolean A04;
    public final int A05;
    public final AnonymousClass1GP A06;
    public final InteractiveMessageButton A07;
    public final InteractiveMessageView A08;

    private void A01() {
        AnonymousClass21Y r3 = (AnonymousClass21Y) ((AnonymousClass21V) this.A0I);
        this.A08.A04(this, r3, AnonymousClass3uQ.A0k(this) - (getResources().getDimensionPixelSize(2131166256) * 2));
        this.A07.A01(this.A06, this, this.A0k, r3);
        if (!this.A03) {
            this.A03 = true;
            C18070vi.A0d(r3, 0);
            ((C63542tH) this.A01.get()).A02(r3, false);
        }
    }

    private boolean A02(C438121a r4) {
        C20285AEt aEt;
        C20277AEk aEk;
        if (!C18020vd.A05(C18040vf.A02, this.A0F, 11576) || (aEt = r4.A00) == null || (aEk = aEt.A06) == null || !aEk.A00()) {
            return false;
        }
        return true;
    }

    public void A1M() {
        if (!this.A04) {
            this.A04 = true;
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
            C78703tO.A00(r4, A0O, this);
            this.A00 = C000200d.A00(A0O.A0R);
            this.A02 = C000200d.A00(A0O.A0l);
            this.A01 = C000200d.A00(r4.AXn);
        }
    }

    public boolean A1V() {
        C20285AEt aEt = ((C438121a) ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I))).A00;
        if (aEt == null || aEt.A02 == null || aEt.A00 != 5 || !"review_and_pay_v2".equals(aEt.A00())) {
            return super.A1V();
        }
        return false;
    }

    public void A1v() {
        C438121a r3 = (C438121a) ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I));
        if (A02(r3)) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 9970) && C60502o8.A00(r3) != null && C60502o8.A00(r3).A0A) {
                A2t(r3, false, true);
                return;
            }
        }
        super.A1v();
    }

    public boolean A2o() {
        C438121a r2 = (C438121a) ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I));
        if (A02(r2)) {
            ((C63542tH) this.A01.get()).A02(r2, true);
        }
        return super.A2o();
    }

    public void A2t(AnonymousClass206 r16, boolean z, boolean z2) {
        C18030ve r1 = this.A0F;
        C18040vf r3 = C18040vf.A02;
        AnonymousClass206 r4 = r16;
        if (!C18020vd.A05(r3, r1, 9970) || C60502o8.A00(r4) == null || !C60502o8.A00(r4).A0A) {
            super.A2t(r4, z, z2);
            return;
        }
        boolean A052 = C18020vd.A05(r3, this.A0F, 9125);
        C32021gV r6 = this.A1S;
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
        AnonymousClass3M2 r5 = this.A0T;
        AnonymousClass205 r7 = r4.A0v;
        boolean z3 = !A02((C438121a) ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I)));
        boolean z4 = false;
        if (A052) {
            z4 = true;
        }
        C32021gV.A05((Bitmap.Config) null, conversationRowVideo$RowVideoView, r4, r5, r6, r7, 2000, false, false, false, z4, true, z3);
    }

    public C438121a getFMessage() {
        return (C438121a) ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I));
    }

    public C108675c7 getRowCustomizer() {
        if (!C20120A8f.A06((AnonymousClass21Y) ((AnonymousClass21V) this.A0I))) {
            return this.A0B.A0F;
        }
        return super.getRowCustomizer();
    }

    public void onMeasure(int i, int i2) {
        if (C20120A8f.A06((AnonymousClass21Y) ((AnonymousClass21V) this.A0I))) {
            i = BE7.A06(this.A05);
        }
        super.onMeasure(i, i2);
    }

    public C78813tg(Context context, AnonymousClass1GP r10, C108875cR r11, C438121a r12, int i) {
        super(context, r11, r12);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView;
        A1M();
        float A0E = this.A0F.A0E(5073);
        this.A06 = r10;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) AnonymousClass1HF.A06(this, 2131428578);
        this.A07 = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) AnonymousClass1HF.A06(this, 2131431755);
        this.A08 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r12.A0v.A02 ^ true ? 1 : 0);
        C88484Zw r7 = (C88484Zw) this.A00.get();
        r7.A04 = new C94894lM(this, 1);
        interactiveMessageView.A03(this.A2t, (AnonymousClass1GP) null, r7);
        interactiveMessageButton.A0L.A00 = r7;
        if (i > 0) {
            interactiveMessageView.setDescriptionMinLines(i);
        }
        this.A05 = getResources().getDimensionPixelSize(2131165762) + (getResources().getDimensionPixelSize(2131166347) * 2);
        A01();
        if (r7.A05 && (conversationRowVideo$RowVideoView = this.A0L) != null) {
            int A0k = AnonymousClass3uQ.A0k(this) - (AnonymousClass3Ma.A02(this, 2131166347) * 2);
            conversationRowVideo$RowVideoView.A0B = r7.A05;
            conversationRowVideo$RowVideoView.A03 = A0k;
            conversationRowVideo$RowVideoView.A02 = (int) (A0E * ((float) A0k));
            conversationRowVideo$RowVideoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            conversationRowVideo$RowVideoView.A04 = this.A09.BS0(AnonymousClass00R.A01, 2, false);
            View A062 = AnonymousClass1HF.A06(this, 2131432381);
            if (A062 != null) {
                A062.setPadding(AnonymousClass3Ma.A02(this, 2131166347), AnonymousClass3Ma.A02(this, 2131166347), AnonymousClass3Ma.A02(this, 2131166347), 0);
            }
        }
    }

    public C95874mw A1m(AnonymousClass206 r5) {
        int i;
        if (!(!AnonymousClass1EG.A0H(C20120A8f.A04(r5))) || C20120A8f.A06((AnonymousClass21Y) ((AnonymousClass21V) this.A0I)) || !"MARKETING".equals(AnonymousClass3uP.A0T((AnonymousClass21Y) ((AnonymousClass21V) this.A0I)))) {
            return super.A1m(r5);
        }
        C108875cR r0 = this.A0k;
        if (r0 != null) {
            i = r0.BW6(r5);
        } else {
            i = 0;
        }
        C108675c7 rowCustomizer = getRowCustomizer();
        int i2 = C95874mw.A06;
        return new C95874mw(i, rowCustomizer.BQ7(), rowCustomizer.BQ6());
    }

    public void A1u() {
        super.A1u();
        A01();
    }

    public void A2V(AnonymousClass206 r4, boolean z) {
        super.A2V(r4, z);
        boolean z2 = false;
        if (r4 != ((AnonymousClass21Y) ((AnonymousClass21V) this.A0I))) {
            z2 = true;
            this.A03 = false;
        }
        if (z || z2) {
            A01();
        }
    }

    public int getMainChildMaxWidth() {
        return AnonymousClass3uQ.A0k(this);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) this.A02.get()).A00((AnonymousClass21Y) ((AnonymousClass21V) this.A0I), i);
    }

    public int getCenteredLayoutId() {
        return 2131624954;
    }

    public int getIncomingLayoutId() {
        return 2131624954;
    }

    public int getOutgoingLayoutId() {
        return 2131624955;
    }
}
