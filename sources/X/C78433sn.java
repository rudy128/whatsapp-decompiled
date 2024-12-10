package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3sn  reason: invalid class name and case insensitive filesystem */
public class C78433sn extends AnonymousClass3uP {
    public AnonymousClass2UJ A00;
    public AnonymousClass1QO A01;
    public C85754Op A02;
    public A6X A03;
    public C70823Cq A04;
    public boolean A05;
    public final TextEmojiLabel A06;
    public final WaFrameLayout A07;
    public final ThumbnailButton A08 = ((ThumbnailButton) findViewById(2131436123));
    public final TextEmojiLabel A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final C28931bI A0C;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r2 == 3) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r6 = this;
            X.206 r5 = r6.A0I
            X.22U r5 = (X.AnonymousClass22U) r5
            r6.setThumbnail(r5)
            com.whatsapp.WaTextView r2 = r6.A0B
            X.0vb r0 = r6.A0D
            java.lang.String r1 = X.C63752td.A02(r0, r5)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r1, r0)
            android.content.Context r1 = r6.getContext()
            X.0vb r0 = r6.A0D
            java.lang.String r2 = X.C63752td.A01(r1, r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            com.whatsapp.WaTextView r1 = r6.A0A
            if (r0 == 0) goto L_0x006f
            r0 = 8
            r1.setVisibility(r0)
        L_0x002c:
            com.whatsapp.TextEmojiLabel r3 = r6.A06
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r6.getOrderMessageBtnTextForBuyer()
        L_0x0038:
            r3.setText(r0)
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x0044
            com.whatsapp.TextEmojiLabel r0 = r6.A09
            r6.setMessageText(r1, r0, r5)
        L_0x0044:
            X.4Op r0 = r6.A02
            X.0ve r2 = r0.A01
            r1 = 4893(0x131d, float:6.857E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0069
            X.1bI r0 = r6.A0C
            r0.A04(r4)
            int r2 = r5.A02
            r0 = 2
            if (r2 == r0) goto L_0x0060
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            r3.setEnabled(r1)
            com.whatsapp.WaFrameLayout r0 = r6.A07
            r0.setEnabled(r1)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r0 = r6.getOrderMessageBtnTextForSeller()
            goto L_0x0038
        L_0x006f:
            java.lang.CharSequence r0 = r6.A1p(r2)
            r1.setText(r0)
            r1.setVisibility(r4)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78433sn.A00():void");
    }

    private String getOrderMessageBtnTextForBuyer() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A02.A01, 4893);
        Context context = getContext();
        int i = 2131892067;
        if (A052) {
            i = 2131888290;
        }
        return context.getString(i);
    }

    private String getOrderMessageBtnTextForSeller() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A02.A01, 4893);
        Context context = getContext();
        int i = 2131892066;
        if (A052) {
            i = 2131892068;
        }
        return context.getString(i);
    }

    public void A1M() {
        if (!this.A05) {
            this.A05 = true;
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
            this.A00 = (AnonymousClass2UJ) r1.A3d.get();
            this.A02 = AnonymousClass1K1.A1R(A0n);
            this.A01 = (AnonymousClass1QO) r3.A8G.get();
            this.A03 = (A6X) r3.Abm.get();
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public AnonymousClass22U getFMessage() {
        return (AnonymousClass22U) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass22U);
        this.A0I = r2;
    }

    public C78433sn(Context context, C108875cR r9, AnonymousClass22U r10) {
        super(context, r9, r10);
        A1M();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(2131432683);
        this.A09 = textEmojiLabel;
        boolean A1A = C72483Me.A1A(textEmojiLabel, this.A0F);
        textEmojiLabel.setLongClickable(A1A);
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) findViewById(2131433327);
        this.A06 = textEmojiLabel2;
        this.A0B = (WaTextView) findViewById(2131433331);
        this.A0A = (WaTextView) findViewById(2131433330);
        WaFrameLayout waFrameLayout = (WaFrameLayout) findViewById(2131433328);
        this.A07 = waFrameLayout;
        this.A0C = C72453Mb.A0s(this, 2131433332);
        Activity A002 = C18050vg.A00(context);
        if (A002 instanceof AnonymousClass1F9) {
            Resources resources = context.getResources();
            C70823Cq r0 = new C70823Cq((int) resources.getDimension(2131167237), (int) resources.getDimension(2131167236));
            this.A04 = r0;
            ((AnonymousClass1DS) r0.A04).A0A((AnonymousClass1F9) A002, new C26618D6m(this, 1));
        }
        C825248h r02 = new C825248h(this, context, 42);
        textEmojiLabel2.setOnClickListener(r02);
        waFrameLayout.setOnClickListener(r02);
        waFrameLayout.setForeground(this.A09.BS0(AnonymousClass00R.A01, C72453Mb.A05(r10.A0v.A02 ? 1 : 0), A1A));
        A00();
    }

    private void setThumbnail(AnonymousClass22U r3) {
        C70823Cq r1;
        if (r3.A0O() != null && r3.A16() && (r1 = this.A04) != null) {
            synchronized (r1) {
                r1.A00 = r3;
            }
            this.A1X.CGF(r1);
        }
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public int getCenteredLayoutId() {
        return 2131624878;
    }

    public int getIncomingLayoutId() {
        return 2131624878;
    }

    public int getOutgoingLayoutId() {
        return 2131624882;
    }
}
