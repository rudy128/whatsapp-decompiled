package X;

import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;

/* renamed from: X.4oW  reason: invalid class name and case insensitive filesystem */
public class C96854oW implements C22515BAy {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C96854oW(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.4Qm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.1FU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.4Qm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.4Qm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BzD(X.C29681ch r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r13.A02
            X.1FU r4 = (X.AnonymousClass1FU) r4
            X.1KB r3 = r4.A05
            java.lang.Object r2 = r13.A01
            r1 = 45
        L_0x000f:
            X.AkP r0 = new X.AkP
            r0.<init>(r4, r2, r1)
            r3.A0J(r0)
            return
        L_0x0018:
            java.lang.Object r4 = r13.A02
            X.4Qm r4 = (X.C86164Qm) r4
            X.1KB r3 = r4.A01
            java.lang.Object r2 = r13.A01
            r1 = 28
            goto L_0x000f
        L_0x0023:
            r12 = 0
            X.C18070vi.A0d(r14, r12)
            java.lang.Object r5 = r13.A02
            X.4O9 r5 = (X.AnonymousClass4O9) r5
            java.lang.Object r4 = r13.A01
            android.view.View r4 = (android.view.View) r4
            X.1M9 r0 = r5.A01
            X.1E7 r8 = r0.A0E(r14)
            if (r8 == 0) goto L_0x005c
            X.1Vc r6 = r5.A02
            android.content.Context r7 = r4.getContext()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r4)
            r0 = 2131168063(0x7f070b3f, float:1.7950417E38)
            int r11 = r1.getDimensionPixelSize(r0)
            java.lang.String r9 = "NewsletterAdminInviteSheetPhotoLoader.getContactPhoto"
            r10 = 0
            android.graphics.Bitmap r3 = r6.A04(r7, r8, r9, r10, r11, r12)
        L_0x004f:
            X.1KB r2 = r5.A00
            r1 = 17
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r5, r3, r4, r1)
            r2.A0J(r0)
            return
        L_0x005c:
            r3 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96854oW.BzD(X.1ch):void");
    }

    public void onError(Throwable th) {
        C21598Amm amm;
        AnonymousClass1KB r3;
        Runnable ail;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(th, 0);
                C86164Qm r2 = (C86164Qm) this.A02;
                AnonymousClass3Ma.A1J(r2.A01, r2, 35);
                if (!(th instanceof C21598Amm) || (amm = (C21598Amm) th) == null || amm.code != 404) {
                    ((C108125bA) this.A01).Bt4(C18460wS.A00);
                    return;
                }
                NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) ((C96934oe) ((C108125bA) this.A01)).A02;
                r3 = newsletterAcceptAdminInviteSheet.A00;
                if (r3 != null) {
                    ail = new C21356Ail(newsletterAcceptAdminInviteSheet, 47);
                    break;
                } else {
                    AnonymousClass3MW.A1C();
                    throw null;
                }
            case 1:
                return;
            default:
                C18070vi.A0d(th, 0);
                AnonymousClass1FU r1 = (AnonymousClass1FU) this.A02;
                r3 = r1.A05;
                ail = new C21425Ajs((Object) r1, 4);
                break;
        }
        r3.A0J(ail);
    }
}
