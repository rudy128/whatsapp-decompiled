package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;

/* renamed from: X.4oV  reason: invalid class name and case insensitive filesystem */
public class C96844oV implements C22515BAy {
    public final int A00;
    public final Object A01;

    public C96844oV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        X.AnonymousClass3Ma.A1J(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BzD(X.C29681ch r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x001b;
                case 2: goto L_0x0041;
                case 3: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r3.A01
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r2 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r2
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A03(r2, r0, r1)
            return
        L_0x0012:
            java.lang.Object r1 = r3.A01
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r1 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r1
            r0 = 1
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A0Q(r1, r0)
            return
        L_0x001b:
            java.lang.Object r2 = r3.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.1KB r1 = r2.A05
            r0 = 21
            goto L_0x003d
        L_0x0024:
            java.lang.Object r2 = r3.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            com.whatsapp.newsletter.NewsletterInfoActivity.A16(r2)
            X.3oU r0 = r2.A0g
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "newsletterInfoViewModel"
            goto L_0x0062
        L_0x0032:
            X.4Ca r1 = X.C82774Ca.Verify
            X.1DT r0 = r0.A06
            r0.A0E(r1)
            X.1KB r1 = r2.A05
            r0 = 18
        L_0x003d:
            X.AnonymousClass3Ma.A1J(r1, r2, r0)
            return
        L_0x0041:
            java.lang.Object r2 = r3.A01
            com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity r2 = (com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity) r2
            X.1KB r1 = r2.A05
            r0 = 44
            X.AnonymousClass3Ma.A1J(r1, r2, r0)
            X.00H r0 = r2.A03
            if (r0 == 0) goto L_0x0060
            r0.get()
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r2)
            java.lang.String r0 = X.C28901bF.A03
            r1.setAction(r0)
            r2.startActivity(r1)
            return
        L_0x0060:
            java.lang.String r0 = "waIntents"
        L_0x0062:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96844oV.BzD(X.1ch):void");
    }

    public void onError(Throwable th) {
        AnonymousClass1FU r2;
        AnonymousClass1KB r1;
        int i;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(th, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
                NewsletterInfoActivity.A16(newsletterInfoActivity);
                r1 = newsletterInfoActivity.A05;
                i = 19;
                r2 = newsletterInfoActivity;
                break;
            case 1:
                C18070vi.A0d(th, 0);
                AnonymousClass1FU r22 = (AnonymousClass1FU) this.A01;
                r1 = r22.A05;
                i = 20;
                r2 = r22;
                break;
            case 2:
                AnonymousClass1FU r23 = (AnonymousClass1FU) this.A01;
                r1 = r23.A05;
                i = 45;
                r2 = r23;
                break;
            case 3:
                NewsletterTransferOwnershipActivity.A0Q((NewsletterTransferOwnershipActivity) this.A01, false);
                return;
            default:
                NewsletterTransferOwnershipActivity.A03((NewsletterTransferOwnershipActivity) this.A01, AnonymousClass000.A0h(), true);
                return;
        }
        AnonymousClass3Ma.A1J(r1, r2, i);
    }
}
