package X;

import android.os.Handler;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.6Aq  reason: invalid class name and case insensitive filesystem */
public final class C119966Aq extends C113535nF implements AnonymousClass8AE, C1601887m {
    public C1418277c A00;
    public WaImageView A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass7S3.A00(this, 42);
    public final C22821Di A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r2.length() == 0) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C1418277c r9) {
        /*
            r8 = this;
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            super.A0B(r9)
            r8.A00 = r9
            android.view.View r6 = r8.A02
            r0 = 2131432870(0x7f0b15a6, float:1.848751E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r6, r0)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = r9.A05
            r1.setText(r0)
        L_0x0019:
            r0 = 2131432861(0x7f0b159d, float:1.8487491E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r6, r0)
            if (r4 == 0) goto L_0x002e
            java.lang.Long r0 = r9.A02
            java.lang.String r2 = X.C124066Wx.A00(r0)
            if (r2 != 0) goto L_0x00b2
            r0 = 0
        L_0x002b:
            r4.setText(r0)
        L_0x002e:
            r0 = 2131432864(0x7f0b15a0, float:1.8487497E38)
            X.1bI r1 = X.C72453Mb.A0s(r6, r0)
            java.lang.Boolean r0 = r9.A00
            r4 = 1
            boolean r0 = X.C18070vi.A19(r0, r4)
            r7 = 8
            int r0 = X.C72453Mb.A07(r0)
            r1.A04(r0)
            r0 = 2131432874(0x7f0b15aa, float:1.8487518E38)
            com.whatsapp.WaImageView r5 = X.AnonymousClass3MW.A0S(r6, r0)
            r8.A01 = r5
            java.lang.String r2 = r9.A0A
            if (r2 == 0) goto L_0x0059
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            r0 = r0 ^ 1
            if (r5 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0061
            r7 = 0
        L_0x0061:
            r5.setVisibility(r7)
        L_0x0064:
            if (r2 == 0) goto L_0x0070
            r1 = 13
            X.AFV r0 = new X.AFV
            r0.<init>(r1, r2, r8)
            r6.setOnClickListener(r0)
        L_0x0070:
            r0 = 2131432866(0x7f0b15a2, float:1.8487502E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x007e
            r0 = 29
            X.AnonymousClass3MZ.A1O(r1, r8, r9, r0)
        L_0x007e:
            X.00H r0 = r8.A02
            java.lang.Object r2 = r0.get()
            X.73N r2 = (X.AnonymousClass73N) r2
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r8)
            r2.A05 = r0
            X.6Kw r0 = r2.A02
            if (r0 == 0) goto L_0x00be
            android.media.MediaPlayer r0 = r0.A01
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L_0x00be
            X.77c r0 = r8.A00
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = r0.A0A
        L_0x009e:
            java.lang.String r0 = r2.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00be
            A00(r8, r4)
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r8)
            r2.A06 = r0
            return
        L_0x00b0:
            r1 = 0
            goto L_0x009e
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = " · "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            goto L_0x002b
        L_0x00be:
            A00(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119966Aq.A0B(X.77c):void");
    }

    public void Bqe(int i, boolean z) {
    }

    public void Byn(C123166Tj r4) {
        C18070vi.A0d(r4, 0);
        C108945cZ.A0a(this.A05).A0G(this.A02.getContext().getString(2131892355), 1);
    }

    public void Byo() {
    }

    public void C0t() {
        C0u(false);
    }

    public static final void A00(C119966Aq r3, boolean z) {
        WaImageView waImageView;
        int i;
        WaTextView waTextView = r3.A00;
        if (z) {
            if (waTextView != null) {
                AnonymousClass3MX.A1C(waTextView.getContext(), waTextView, 2131103150);
            }
            waImageView = r3.A01;
            if (waImageView != null) {
                i = 2131233388;
            } else {
                return;
            }
        } else {
            if (waTextView != null) {
                AnonymousClass3MX.A1C(waTextView.getContext(), waTextView, 2131103049);
            }
            waImageView = r3.A01;
            if (waImageView != null) {
                i = 2131233402;
            } else {
                return;
            }
        }
        waImageView.setImageResource(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119966Aq(View view, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, C18090vk r6, C22821Di r7) {
        super(view, r4, r5, r6);
        C18070vi.A0p(r7, r6, r3);
        C72473Md.A1J(r4, r5);
        this.A04 = r7;
        this.A02 = r3;
        this.A05 = r5;
    }

    public void C0u(boolean z) {
        int i;
        long j;
        int i2;
        Long l;
        A00(this, z);
        C18100vl r5 = this.A03;
        ((Handler) r5.getValue()).removeMessages(0);
        if (z) {
            C1418277c r0 = this.A00;
            if (r0 != null) {
                i = r0.A01();
            } else {
                i = 0;
            }
            long j2 = ((long) i) + C20113A7w.A0L;
            C1418277c r02 = this.A00;
            if (r02 == null || (l = r02.A02) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            long min = Math.min(j2, j);
            C121626Kw r03 = ((AnonymousClass73N) this.A02.get()).A02;
            if (r03 != null) {
                i2 = r03.A01.getCurrentPosition();
            } else {
                i2 = 0;
            }
            ((Handler) r5.getValue()).sendEmptyMessageDelayed(0, min - ((long) i2));
        }
    }
}
