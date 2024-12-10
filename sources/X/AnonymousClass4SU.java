package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;

/* renamed from: X.4SU  reason: invalid class name */
public final class AnonymousClass4SU {
    public AnonymousClass21V A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1FY A03;
    public final C195529tU A04;
    public final C20114A7x A05;
    public final A8Q A06;
    public final C19957A0o A07;
    public final C219217x A08;
    public final AnonymousClass1BI A09;
    public final MediaCard A0A;
    public final C32021gV A0B;
    public final HashSet A0C = C17880vN.A12();
    public final C18000vb A0D;
    public final C107695aR A0E;

    public final void A00(View view) {
        Intent intent;
        AnonymousClass21V r0 = this.A00;
        if (r0 != null) {
            AnonymousClass205 r3 = r0.A0v;
            if (r3 != null) {
                AnonymousClass1FY r02 = this.A03;
                AnonymousClass1BI r2 = this.A09;
                C17960vV.A07(r2);
                intent = AnonymousClass6WZ.A00(r02, (AnonymousClass77F) null, r2, r3, 34, 1, -1, 0, -1, 5, false, false, false, false, false);
            } else {
                intent = null;
            }
            View view2 = view;
            if (view != null) {
                if (intent != null) {
                    AnonymousClass1FY r22 = this.A03;
                    AnonymousClass745.A08(r22, intent, view2, new AnonymousClass4ZR(r22), AnonymousClass4W0.A01(this.A00));
                }
            } else if (intent != null) {
                this.A03.startActivity(intent);
            }
        }
    }

    public AnonymousClass4SU(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1FY r4, C195529tU r5, C20114A7x a7x, A8Q a8q, C19957A0o a0o, C219217x r9, C18000vb r10, AnonymousClass1BI r11, MediaCard mediaCard, C32021gV r13) {
        C18070vi.A0w(r2, r10, a8q, r3, a7x);
        C18070vi.A0q(r13, r5, a0o);
        C18070vi.A0d(r9, 9);
        C72473Md.A1L(mediaCard, r4);
        this.A01 = r2;
        this.A0D = r10;
        this.A06 = a8q;
        this.A02 = r3;
        this.A05 = a7x;
        this.A0B = r13;
        this.A04 = r5;
        this.A07 = a0o;
        this.A08 = r9;
        this.A09 = r11;
        this.A0A = mediaCard;
        this.A03 = r4;
        C98004qQ r0 = new C98004qQ(this);
        this.A0E = r0;
        mediaCard.setSeeMoreClickListener(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r9 != 13) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r21) {
        /*
            r20 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r3 = r20
            if (r21 == 0) goto L_0x00df
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x00df
            java.util.Iterator r12 = r21.iterator()
        L_0x0012:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00df
            X.21V r6 = X.C17880vN.A0b(r12)
            java.lang.String r19 = X.AnonymousClass4W0.A01(r6)
            int r9 = r6.A0u
            r2 = 23
            r1 = 9
            r10 = 28
            java.lang.String r17 = " "
            r8 = 2
            r0 = 29
            r7 = 3
            r5 = 13
            if (r9 == r7) goto L_0x0078
            if (r9 == r8) goto L_0x0078
            if (r9 == r5) goto L_0x00ba
            if (r9 == r10) goto L_0x0078
            if (r9 == r0) goto L_0x00ba
            if (r9 == r1) goto L_0x0094
            r0 = 26
            if (r9 == r0) goto L_0x0094
            if (r9 != r2) goto L_0x00aa
            X.1FY r0 = r3.A03
            android.content.Context r7 = r0.getBaseContext()
            r5 = 2131232336(0x7f080650, float:1.8080778E38)
            android.content.Context r2 = r0.getBaseContext()
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass4aX.A04(r2, r7, r1, r0, r5)
        L_0x0059:
            r1 = 2131889032(0x7f120b88, float:1.9412716E38)
        L_0x005c:
            X.1FY r0 = r3.A03
            java.lang.String r18 = r0.getString(r1)
        L_0x0062:
            X.4qR r15 = new X.4qR
            r15.<init>(r3, r6)
            r1 = 3
            X.Ae6 r0 = new X.Ae6
            r0.<init>(r3, r6, r1)
            X.4Or r13 = new X.4Or
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r4.add(r13)
            goto L_0x0012
        L_0x0078:
            int r0 = r6.A0D
            X.0vb r11 = r3.A0D
            if (r0 == 0) goto L_0x008d
            int r0 = r6.A0D
            long r1 = (long) r0
            r0 = 0
            java.lang.String r17 = X.C64052u8.A0D(r11, r0, r1)
        L_0x0086:
            if (r9 == r7) goto L_0x00b4
            if (r9 == r10) goto L_0x00b4
            if (r9 == r5) goto L_0x00ba
            goto L_0x00a3
        L_0x008d:
            long r0 = r6.A01
            java.lang.String r17 = X.C88584aA.A02(r11, r0)
            goto L_0x0086
        L_0x0094:
            r2 = r6
            X.21i r2 = (X.C438921i) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00aa
            X.747 r1 = X.C62272r8.A04
            X.0vb r0 = r3.A0D
            java.lang.String r17 = r1.A09(r0, r2)
        L_0x00a3:
            r14 = 0
        L_0x00a4:
            if (r9 != r8) goto L_0x00c3
            r1 = 2131889017(0x7f120b79, float:1.9412686E38)
            goto L_0x005c
        L_0x00aa:
            r14 = 0
            r17 = 0
            r0 = 1
            if (r9 != r0) goto L_0x00a4
            r1 = 2131889027(0x7f120b83, float:1.9412706E38)
            goto L_0x005c
        L_0x00b4:
            X.1FY r1 = r3.A03
            r0 = 2131232596(0x7f080754, float:1.8081306E38)
            goto L_0x00bf
        L_0x00ba:
            X.1FY r1 = r3.A03
            r0 = 2131232594(0x7f080752, float:1.8081302E38)
        L_0x00bf:
            android.graphics.drawable.Drawable r14 = X.C24261Jm.A00(r1, r0)
        L_0x00c3:
            if (r9 == r7) goto L_0x00da
            r0 = 9
            if (r9 == r0) goto L_0x00d6
            if (r9 == r5) goto L_0x00d2
            r0 = 23
            if (r9 == r0) goto L_0x0059
            r18 = 0
            goto L_0x0062
        L_0x00d2:
            r1 = 2131889023(0x7f120b7f, float:1.9412698E38)
            goto L_0x005c
        L_0x00d6:
            r1 = 2131889022(0x7f120b7e, float:1.9412696E38)
            goto L_0x005c
        L_0x00da:
            r1 = 2131889038(0x7f120b8e, float:1.9412728E38)
            goto L_0x005c
        L_0x00df:
            com.whatsapp.ui.media.MediaCard r1 = r3.A0A
            X.5aR r0 = r3.A0E
            r1.setSeeMoreClickListener(r0)
            r0 = 12
            r1.A08(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SU.A01(java.util.List):void");
    }
}
