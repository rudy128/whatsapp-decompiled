package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.5lG  reason: invalid class name and case insensitive filesystem */
public final class C112305lG extends C38391rD {
    public final /* synthetic */ NewsletterReactionsSheet A00;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r20, int r21) {
        /*
            r19 = this;
            r8 = 0
            r0 = r20
            X.C18070vi.A0d(r0, r8)
            android.view.View r1 = r0.A0H
            X.C18070vi.A0W(r1)
            r0 = 2131434373(0x7f0b1b85, float:1.8490558E38)
            com.whatsapp.WaTextView r3 = X.AnonymousClass3MW.A0U(r1, r0)
            r0 = 2131434371(0x7f0b1b83, float:1.8490554E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.AnonymousClass3MX.A0Q(r1, r0)
            r0 = 2131434372(0x7f0b1b84, float:1.8490556E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1 = r19
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r0 = r1.A00
            android.content.Context r7 = r0.A1n()
            if (r7 == 0) goto L_0x0035
            r6 = 1
            com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager r5 = new com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager
            r5.<init>(r7, r6, r8)
            r4.setLayoutManager(r5)
        L_0x0035:
            java.util.List r5 = r1.A00()
            r6 = r21
            java.lang.Object r5 = r5.get(r6)
            X.6RL r5 = (X.AnonymousClass6RL) r5
            int r5 = r5.ordinal()
            java.lang.String r9 = "reaction_senders_list_photo_loader"
            java.lang.String r10 = "viewModel"
            if (r5 == r8) goto L_0x00b5
            r7 = 1
            if (r5 != r7) goto L_0x009f
            X.5iq r6 = r0.A09
            if (r6 == 0) goto L_0x0118
            java.util.List r5 = r0.A0C
            int r5 = r5.size()
            r18 = 1
            if (r5 > r7) goto L_0x005e
            r18 = 0
        L_0x005e:
            X.1q9 r12 = r0.A1G()
            X.1Vd r7 = r0.A07
            if (r7 == 0) goto L_0x0115
            android.content.Context r5 = r0.A14()
            X.1pZ r15 = r7.A06(r5, r9)
            X.00H r5 = r0.A0A
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = X.C18070vi.A0E(r5)
            X.6nc r5 = (X.C132806nc) r5
            X.1Me r14 = r0.A06
            if (r14 == 0) goto L_0x0109
            X.1L9 r13 = r0.A04
            if (r13 == 0) goto L_0x011c
            X.6Ba r11 = new X.6Ba
            r17 = r6
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r4.setAdapter(r11)
            X.5iq r4 = r0.A09
            if (r4 == 0) goto L_0x0118
            X.1DT r6 = r4.A02
            X.1q9 r5 = r0.A1G()
            X.82w r4 = new X.82w
            r4.<init>(r3, r11, r1)
        L_0x009b:
            r3 = 4
            X.AnonymousClass7AS.A00(r5, r6, r4, r3)
        L_0x009f:
            X.5iq r4 = r0.A09
            if (r4 == 0) goto L_0x0118
            X.1pm r3 = X.AnonymousClass3MZ.A0G(r0)
            r10 = 0
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1 r5 = new com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1
            r8 = r0
            r9 = r4
            r7 = r1
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass3MX.A1Q(r5, r3)
            return
        L_0x00b5:
            X.5iq r8 = r0.A09
            if (r8 == 0) goto L_0x0118
            java.util.List r5 = r0.A0C
            int r5 = r5.size()
            r7 = 1
            if (r5 > r7) goto L_0x00c3
            r7 = 0
        L_0x00c3:
            X.1q9 r12 = r0.A1G()
            X.1Vd r6 = r0.A07
            if (r6 == 0) goto L_0x0115
            android.content.Context r5 = r0.A14()
            X.1pZ r13 = r6.A06(r5, r9)
            X.00H r5 = r0.A0A
            if (r5 == 0) goto L_0x0112
            java.lang.Object r6 = X.C18070vi.A0E(r5)
            X.6nc r6 = (X.C132806nc) r6
            X.0vb r14 = r0.A08
            if (r14 == 0) goto L_0x010f
            X.00H r5 = r0.A0B
            if (r5 == 0) goto L_0x010c
            java.lang.Object r15 = X.C18070vi.A0E(r5)
            X.1c4 r15 = (X.AnonymousClass1c4) r15
            X.6BZ r11 = new X.6BZ
            r18 = r7
            r17 = r8
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r4.setAdapter(r11)
            X.5iq r4 = r0.A09
            if (r4 == 0) goto L_0x0118
            X.1DT r6 = r4.A00
            X.1q9 r5 = r0.A1G()
            X.82v r4 = new X.82v
            r4.<init>(r3, r11, r1)
            goto L_0x009b
        L_0x0109:
            java.lang.String r0 = "waContactNames"
            goto L_0x011e
        L_0x010c:
            java.lang.String r0 = "newsletterConfig"
            goto L_0x011e
        L_0x010f:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x011e
        L_0x0112:
            java.lang.String r0 = "anonymousProfilePicLoader"
            goto L_0x011e
        L_0x0115:
            java.lang.String r0 = "contactPhotos"
            goto L_0x011e
        L_0x0118:
            X.C18070vi.A11(r10)
            goto L_0x0121
        L_0x011c:
            java.lang.String r0 = "activityUtils"
        L_0x011e:
            X.C18070vi.A11(r0)
        L_0x0121:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112305lG.Bmc(X.1xT, int):void");
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C113005mO(AnonymousClass3MY.A0E(LayoutInflater.from(this.A00.A1n()), viewGroup, 2131626241), this);
    }

    public C112305lG(NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A00 = newsletterReactionsSheet;
    }

    private final List A00() {
        C111205iq r0 = this.A00.A09;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        C134856rG r02 = (C134856rG) r0.A04.A06();
        if (r02 != null) {
            return r02.A01;
        }
        return C18460wS.A00;
    }

    public static final void A01(WaTextView waTextView, C112305lG r10, long j) {
        String str;
        Resources resources;
        Context context = waTextView.getContext();
        int i = 1;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            long j2 = j;
            if (j > 100) {
                j2 = 100;
            }
            str = resources.getQuantityString(2131755275, (int) j2, new Object[]{waTextView.getWhatsAppLocale().A0L().format(j)});
        }
        waTextView.setText(str);
        C43421zm.A04(waTextView);
        boolean z = true;
        if (r10.A00().size() > 1) {
            z = false;
            i = 8388611;
        }
        waTextView.setGravity(i | 16);
        Resources resources2 = waTextView.getResources();
        int i2 = 2131169432;
        if (z) {
            i2 = 2131168037;
        }
        waTextView.setTextSize(0, resources2.getDimension(i2));
    }

    public int A0Q() {
        return A00().size();
    }
}
