package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.3tE  reason: invalid class name and case insensitive filesystem */
public class C78623tE extends AnonymousClass3u3 {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public InteractiveMessageView A05 = null;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final AnonymousClass1GP A09;
    public final InteractiveMessageButton A0A;
    public final C28931bI A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (X.AnonymousClass3u3.A0N(r7) == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r7 = this;
            X.206 r3 = r7.A0I
            X.21V r3 = (X.AnonymousClass21V) r3
            X.21d r3 = (X.C438421d) r3
            X.21e r3 = (X.C438521e) r3
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.A4R r0 = (X.A4R) r0
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            X.4Uq r0 = r0.A02(r3)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r4 = 1
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r2 = r7.A09
            if (r0 == 0) goto L_0x0081
            r2.setPaddingOnTopOnly(r4)
        L_0x0024:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r6 = r7.A05
            if (r6 == 0) goto L_0x005b
            int r5 = X.AnonymousClass3uQ.A0k(r7)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166256(0x7f070430, float:1.7946752E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r5 = r5 - r0
            r6.A04(r7, r3, r5)
            com.whatsapp.conversation.conversationrow.InteractiveMessageButton r5 = r7.A0A
            X.5cR r1 = r7.A0k
            X.1GP r0 = r7.A09
            r5.A01(r0, r7, r1, r3)
            r7.A02(r3)
            boolean r0 = A03(r7, r3)
            if (r0 == 0) goto L_0x005c
            android.view.View r1 = r7.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x0056:
            r0 = 14
            X.C90074dU.A01(r2, r7, r3, r0)
        L_0x005b:
            return
        L_0x005c:
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0056
            X.00H r0 = r7.A02
            java.lang.Object r1 = r0.get()
            X.2tH r1 = (X.C63542tH) r1
            r0 = 0
            boolean r0 = r1.A02(r3, r0)
            if (r0 == 0) goto L_0x0056
            r7.A06 = r4
            android.widget.FrameLayout r0 = r7.A04
            if (r0 == 0) goto L_0x007c
            boolean r1 = X.AnonymousClass3u3.A0N(r7)
            r0 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r7.A2u(r3, r4, r0)
            goto L_0x0056
        L_0x0081:
            r2.A0K = r4
            X.00H r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.4Zw r0 = (X.C88484Zw) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0024
            r2.setPaddingOnTopOnly(r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78623tE.A00():void");
    }

    public static void A01(C78623tE r5, C438521e r6) {
        int i;
        int i2;
        C20277AEk aEk;
        C87194Uq A022 = ((A4R) r5.A03.get()).A02(r6);
        C20285AEt aEt = r6.A00;
        if (aEt == null || (aEk = aEt.A06) == null) {
            i = 0;
        } else {
            i = aEk.A03.size();
        }
        if (A022 != null && (i2 = A022.A00) < i) {
            ((C86314Rd) r5.A00.get()).A01(r5.getContext(), new AnonymousClass7EX(12, 12), r6, i2);
        }
    }

    private void A02(C438521e r9) {
        if (this.A05 == null) {
            return;
        }
        if (A04(this, r9)) {
            C87194Uq A022 = ((A4R) this.A03.get()).A02(r9);
            C28931bI r2 = this.A0B;
            C90074dU.A01(r2.A02(), this, r9, 13);
            TextView A0E = C17880vN.A0E(r2.A02(), 2131436590);
            TextView A0E2 = C17880vN.A0E(r2.A02(), 2131436588);
            TextView A0E3 = C17880vN.A0E(r2.A02(), 2131436589);
            String str = A022.A04;
            if (!TextUtils.isEmpty(str)) {
                A0E.setText(str);
                A0E.setVisibility(0);
            } else {
                A0E.setVisibility(8);
            }
            String str2 = A022.A02;
            if (!TextUtils.isEmpty(str2)) {
                A0E2.setText(str2);
                A0E2.setVisibility(0);
            } else {
                A0E2.setVisibility(8);
            }
            String str3 = A022.A03;
            if (!TextUtils.isEmpty(str3)) {
                A0E3.setVisibility(0);
                A0E3.setText(str3);
                return;
            }
            A0E3.setVisibility(8);
            return;
        }
        C28931bI r1 = this.A0B;
        if (r1.A00 != null) {
            r1.A02().setVisibility(8);
            r1.A02().setOnClickListener((View.OnClickListener) null);
        }
    }

    public static boolean A03(C78623tE r2, AnonymousClass206 r3) {
        if (!C18020vd.A05(C18040vf.A02, r2.A0F, 9970) || C60502o8.A00(r3) == null || !C60502o8.A00(r3).A0A) {
            return false;
        }
        return true;
    }

    public static boolean A04(C78623tE r2, C438521e r3) {
        C18070vi.A0d(r3, 0);
        if (((A4R) r2.A03.get()).A02(r3) == null) {
            return false;
        }
        if (!r2.A06 || A03(r2, r3)) {
            return true;
        }
        C62572rc r0 = r3.A02;
        if (r0 == null || !r0.A0V) {
            return false;
        }
        return true;
    }

    public void A1M() {
        if (!this.A07) {
            this.A07 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r5 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r5, A0O, this);
            AnonymousClass10G r2 = r5.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r5, r2, this);
            AnonymousClass3uQ.A12(r5, r2, this);
            AnonymousClass3uQ.A0y(A0n, r5, this, BE8.A0d(r5));
            AnonymousClass3uQ.A13(r5, r2, this, r5.ABq);
            AnonymousClass3uQ.A0x(A0n, r5, r2, this, r5.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r5, r2, A0O, this);
            AnonymousClass3uQ.A11(r5, r2, this);
            AnonymousClass3uQ.A15(r5, this);
            AnonymousClass3uQ.A0s(r1, A0n, r5, r2, this);
            AnonymousClass3uQ.A0u(r1, r5, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r5, A0O, this);
            AnonymousClass3uQ.A10(r5, r2, this);
            AnonymousClass3uQ.A0z(r5, r2, A0O, this, AnonymousClass3uQ.A0o(r5));
            AnonymousClass3tU.A08(r1, r5, r2, this);
            C78693tN.A05(r1, r5, this);
            this.A01 = C000200d.A00(A0O.A0R);
            this.A04 = C000200d.A00(A0O.A0l);
            this.A02 = C000200d.A00(r5.AXn);
            this.A03 = C000200d.A00(A0O.A0j);
            this.A00 = C000200d.A00(A0O.A0Q);
        }
    }

    public boolean A1V() {
        C20285AEt aEt = ((C438521e) ((C438421d) ((AnonymousClass21V) this.A0I))).A00;
        if (aEt == null || aEt.A02 == null || aEt.A00 != 5 || !"review_and_pay_v2".equals(aEt.A00())) {
            return super.A1V();
        }
        return false;
    }

    public void A2V(AnonymousClass206 r3, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r3, (C438421d) ((AnonymousClass21V) this.A0I));
        super.A2V(r3, z);
        if (A1Z) {
            this.A06 = false;
        }
        if (z || A1Z) {
            A00();
        }
    }

    public void A2t(AnonymousClass206 r19, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        A02((C438521e) ((C438421d) ((AnonymousClass21V) this.A0I)));
        AnonymousClass206 r7 = r19;
        if (A03(this, r7)) {
            this.A02.setVisibility(8);
            C18030ve r1 = this.A0F;
            C18040vf r3 = C18040vf.A02;
            boolean A052 = C18020vd.A05(r3, r1, 9125);
            Bitmap.Config config = null;
            C32021gV r9 = this.A1S;
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
            AnonymousClass3M2 r8 = this.A0K;
            AnonymousClass205 r10 = r7.A0v;
            boolean A053 = C18020vd.A05(r3, this.A0F, 10306);
            if (A052) {
                if (A053) {
                    config = Bitmap.Config.RGB_565;
                }
                z2 = false;
                i = 2000;
                z4 = true;
                z3 = true;
            } else {
                if (A053) {
                    config = Bitmap.Config.RGB_565;
                }
                z2 = false;
                i = 2000;
                z3 = true;
                z4 = false;
            }
            C32021gV.A05(config, conversationRowImage$RowImageView, r7, r8, r9, r10, i, z2, z2, z2, z4, z3, z3);
            return;
        }
        super.A2t(r7, z);
    }

    public C438521e getFMessage() {
        return (C438521e) ((C438421d) ((AnonymousClass21V) this.A0I));
    }

    public C108675c7 getRowCustomizer() {
        if (!C20120A8f.A06((C438421d) ((AnonymousClass21V) this.A0I))) {
            return this.A0B.A0E;
        }
        return super.getRowCustomizer();
    }

    public void onMeasure(int i, int i2) {
        if (C20120A8f.A06((C438421d) ((AnonymousClass21V) this.A0I))) {
            i = BE7.A06(this.A08);
        }
        super.onMeasure(i, i2);
    }

    public C78623tE(Context context, AnonymousClass1GP r9, C108875cR r10, C438521e r11, int i) {
        super(context, r10, r11);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        A1M();
        float A0E = this.A0F.A0E(5073);
        this.A06 = false;
        this.A09 = r9;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) AnonymousClass1HF.A06(this, 2131428578);
        this.A0A = interactiveMessageButton;
        this.A0B = C28931bI.A00(this, 2131431541);
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) AnonymousClass1HF.A06(this, 2131431755);
        this.A05 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r11.A0v.A02 ^ true ? 1 : 0);
        C88484Zw r6 = (C88484Zw) this.A01.get();
        r6.A04 = new C94894lM(this, 0);
        this.A05.A03(this.A2t, (AnonymousClass1GP) null, r6);
        interactiveMessageButton.A0L.A00 = r6;
        if (i > 0) {
            this.A05.setDescriptionMinLines(i);
        }
        this.A08 = getResources().getDimensionPixelSize(2131165762) + (getResources().getDimensionPixelSize(2131166347) * 2);
        A00();
        if (r6.A05 && (conversationRowImage$RowImageView = this.A09) != null) {
            int A0k = AnonymousClass3uQ.A0k(this) - (AnonymousClass3Ma.A02(this, 2131166347) * 2);
            conversationRowImage$RowImageView.A0H = r6.A05;
            conversationRowImage$RowImageView.A03 = A0k;
            conversationRowImage$RowImageView.A02 = (int) (A0E * ((float) A0k));
            conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.MATRIX);
            conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        }
    }

    public C95874mw A1m(AnonymousClass206 r5) {
        int i;
        if (!(!AnonymousClass1EG.A0H(C20120A8f.A04(r5))) || C20120A8f.A06((C438421d) ((AnonymousClass21V) this.A0I)) || !"MARKETING".equals(AnonymousClass3uP.A0T((C438421d) ((AnonymousClass21V) this.A0I)))) {
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
        A00();
    }

    public int getMainChildMaxWidth() {
        return AnonymousClass3uQ.A0k(this);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) this.A04.get()).A00((C438421d) ((AnonymousClass21V) this.A0I), i);
    }

    public int getCenteredLayoutId() {
        return 2131624848;
    }

    public int getIncomingLayoutId() {
        return 2131624848;
    }

    public int getOutgoingLayoutId() {
        return 2131624849;
    }
}
