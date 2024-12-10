package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.4qc  reason: invalid class name and case insensitive filesystem */
public class C98124qc implements AnonymousClass3M2 {
    public final int A00;
    public final Object A01;

    public C98124qc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int BZK() {
        switch (this.A00) {
            case 0:
                return 96;
            case 1:
                return C88264Yz.A01(((View) this.A01).getContext(), 72);
            default:
                return ((AnonymousClass3tR) this.A01).A0A.getWidth();
        }
    }

    public /* synthetic */ void BuW() {
        if (1 - this.A00 == 0) {
            ((AnonymousClass3uL) this.A01).A2p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r1.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0.setImageBitmap(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CMa(android.graphics.Bitmap r7, android.view.View r8, X.AnonymousClass206 r9) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A01
            X.3tR r1 = (X.AnonymousClass3tR) r1
            if (r7 == 0) goto L_0x0067
            r0 = 1
            r1.A05 = r0
            com.whatsapp.WaImageView r0 = r1.A0A
        L_0x0010:
            r0.setImageBitmap(r7)
        L_0x0013:
            return
        L_0x0014:
            r5 = 0
            java.lang.Object r0 = r6.A01
            X.3tP r0 = (X.C78713tP) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r4 = r0.A02
            if (r7 == 0) goto L_0x0035
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r7)
            r4.setImageDrawable(r0)
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
        L_0x0031:
            r4.A03(r1, r0, r5)
            return
        L_0x0035:
            android.content.Context r3 = r0.getContext()
            android.content.Context r2 = r0.getContext()
            r1 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            int r1 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setImageDrawable(r0)
            boolean r0 = r9 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0013
            X.21V r9 = (X.AnonymousClass21V) r9
            X.2rc r0 = r9.A02
            if (r0 == 0) goto L_0x0013
            int r1 = r0.A08
            int r0 = r0.A06
            goto L_0x0031
        L_0x005e:
            java.lang.Object r1 = r6.A01
            X.3sG r1 = (X.C78143sG) r1
            if (r7 == 0) goto L_0x0070
            android.widget.ImageView r0 = r1.A00
            goto L_0x0010
        L_0x0067:
            r0 = 0
            r1.A05 = r0
            com.whatsapp.WaImageView r1 = r1.A0A
            r0 = 2131233051(0x7f08091b, float:1.8082229E38)
            goto L_0x0079
        L_0x0070:
            boolean r0 = r1 instanceof X.C78133sE
            android.widget.ImageView r1 = r1.A00
            if (r0 == 0) goto L_0x007d
            r0 = 2131231056(0x7f080150, float:1.8078182E38)
        L_0x0079:
            r1.setImageResource(r0)
            return
        L_0x007d:
            r0 = 2131231053(0x7f08014d, float:1.8078176E38)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98124qc.CMa(android.graphics.Bitmap, android.view.View, X.206):void");
    }

    public void CN4(View view) {
        int i;
        switch (this.A00) {
            case 0:
                C78143sG r1 = (C78143sG) this.A01;
                boolean z = r1 instanceof C78133sE;
                ImageView imageView = r1.A00;
                if (z) {
                    i = 2131231056;
                } else {
                    i = 2131231053;
                }
                imageView.setImageResource(i);
                return;
            case 1:
                ((C78713tP) this.A01).A02.setBackgroundColor(-7829368);
                return;
            default:
                return;
        }
    }
}
