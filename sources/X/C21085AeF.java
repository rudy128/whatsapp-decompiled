package X;

import android.view.View;

/* renamed from: X.AeF  reason: case insensitive filesystem */
public class C21085AeF implements AnonymousClass3M2 {
    public final int A00;
    public final Object A01;

    public C21085AeF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = 2131167237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = 2131168182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        return r1.getDimensionPixelSize(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BZK() {
        /*
            r2 = this;
            int r1 = r2.A00
            java.lang.Object r0 = r2.A01
            switch(r1) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0017;
                case 2: goto L_0x002a;
                case 3: goto L_0x002f;
                case 4: goto L_0x0034;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1xT r0 = (X.C42011xT) r0
            android.view.View r0 = r0.A0H
            android.content.res.Resources r1 = r0.getResources()
        L_0x000f:
            r0 = 2131168182(0x7f070bb6, float:1.7950659E38)
        L_0x0012:
            int r0 = r1.getDimensionPixelSize(r0)
            return r0
        L_0x0017:
            X.8nf r0 = (X.C169848nf) r0
            X.8f0 r0 = r0.A00
            if (r0 == 0) goto L_0x0057
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0057
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0057
            goto L_0x003e
        L_0x002a:
            X.8ni r0 = (X.C169878ni) r0
            android.content.res.Resources r1 = r0.A01
            goto L_0x000f
        L_0x002f:
            X.8nh r0 = (X.C169868nh) r0
            android.content.res.Resources r1 = r0.A01
            goto L_0x003e
        L_0x0034:
            X.8ng r0 = (X.C169858ng) r0
            X.8ex r0 = r0.A00
            if (r0 == 0) goto L_0x0057
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
        L_0x003e:
            r0 = 2131167237(0x7f070805, float:1.7948742E38)
            goto L_0x0012
        L_0x0042:
            X.8ne r0 = (X.C169838ne) r0
            X.8ez r0 = r0.A00
            if (r0 == 0) goto L_0x0057
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0057
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165410(0x7f0700e2, float:1.7945036E38)
            if (r1 != 0) goto L_0x0012
        L_0x0057:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21085AeF.BZK():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r0.setImageBitmap(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4 == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        ((android.widget.ImageView) r5).setImageBitmap(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CMa(android.graphics.Bitmap r4, android.view.View r5, X.AnonymousClass206 r6) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 2: goto L_0x0036;
                case 3: goto L_0x002a;
                case 4: goto L_0x0009;
                case 5: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
        L_0x0009:
            if (r4 == 0) goto L_0x0011
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5.setImageBitmap(r4)
            return
        L_0x0011:
            r0 = 8
            r5.setVisibility(r0)
            return
        L_0x0017:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r3.A01
            X.94e r1 = (X.C1764294e) r1
            if (r4 == 0) goto L_0x0026
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.WaImageView r0 = r1.A01
            goto L_0x0044
        L_0x0026:
            X.C1764294e.A00(r1)
            return
        L_0x002a:
            java.lang.Object r0 = r3.A01
            X.8nh r0 = (X.C169868nh) r0
            com.whatsapp.WaImageView r1 = r0.A00
            if (r4 == 0) goto L_0x0048
            r1.setImageBitmap(r4)
            return
        L_0x0036:
            java.lang.Object r2 = r3.A01
            X.8ni r2 = (X.C169878ni) r2
            com.whatsapp.WaImageView r1 = r2.A00
            if (r4 == 0) goto L_0x0048
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r2.A00
        L_0x0044:
            r0.setImageBitmap(r4)
            return
        L_0x0048:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21085AeF.CMa(android.graphics.Bitmap, android.view.View, X.206):void");
    }

    public void CN4(View view) {
        switch (this.A00) {
            case 2:
                AnonymousClass3MX.A1B(view.getContext(), ((C169878ni) this.A01).A00, 2131233414);
                return;
            case 3:
                ((C169868nh) this.A01).A00.setVisibility(8);
                return;
            case 4:
                break;
            case 5:
                C1764294e.A00((C1764294e) this.A01);
                return;
            default:
                C18070vi.A0d(view, 0);
                break;
        }
        view.setVisibility(8);
    }

    public /* synthetic */ void BuW() {
    }
}
