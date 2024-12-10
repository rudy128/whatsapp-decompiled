package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5l1  reason: invalid class name and case insensitive filesystem */
public final class C112155l1 extends C38391rD {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass1T1 A03;
    public final C25131Mz A04;
    public final C18000vb A05;
    public final AnonymousClass2E5 A06;
    public final AnonymousClass1KW A07;
    public final C18030ve A08;
    public final AnonymousClass73D A09;
    public final C136166tN A0A;
    public final C34501ka A0B;
    public final C25291Nq A0C;
    public final AnonymousClass7JS A0D;
    public final C131086kU A0E;
    public final AnonymousClass87N A0F;
    public final C26631Sw A0G;
    public final C26521Sl A0H;
    public final HashSet A0I;
    public final Set A0J = C17880vN.A14();

    public long A0M(int i) {
        return (long) this.A0D.A0C().get(i).hashCode();
    }

    public int A0Q() {
        return this.A0D.A0C().size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.891} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r20, int r21) {
        /*
            r19 = this;
            r5 = r20
            X.5m9 r5 = (X.C112855m9) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            android.view.View r15 = r5.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.thumbnails.ThumbnailView"
            X.C18070vi.A0z(r15, r0)
            X.69G r15 = (X.AnonymousClass69G) r15
            r3 = r19
            X.7JS r7 = r3.A0D
            int r0 = r7.A07()
            r8 = 0
            r4 = r21
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r15.setSelected(r0)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x002a
            r8 = 1
        L_0x002a:
            r6 = 0
            if (r8 == 0) goto L_0x0100
            android.content.Context r1 = r3.A02
            r0 = 2131231767(0x7f080417, float:1.8079624E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
        L_0x0036:
            r15.setOverlayIcon(r0)
            r0 = r6
            if (r8 == 0) goto L_0x0043
            r0 = 2131429907(0x7f0b0a13, float:1.84815E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0043:
            r15.setCustomId(r0)
            X.6tN r2 = r3.A0A
            java.lang.Object r1 = r15.getTag()
            boolean r0 = r1 instanceof X.AnonymousClass891
            if (r0 == 0) goto L_0x0053
            r6 = r1
            X.891 r6 = (X.AnonymousClass891) r6
        L_0x0053:
            r2.A01(r6)
            java.util.List r0 = r7.A0C()
            java.lang.Object r6 = r0.get(r4)
            android.net.Uri r6 = (android.net.Uri) r6
            X.73D r0 = r3.A09
            X.72S r12 = r0.A02(r6)
            r15.setItem(r12)
            r15.A06 = r5
            X.1ka r13 = r3.A0B
            int r1 = X.AnonymousClass72S.A00(r12, r13)
            r0 = 1
            if (r1 == r0) goto L_0x00f5
            r0 = 3
            if (r1 == r0) goto L_0x00e0
            r0 = 13
            if (r1 != r0) goto L_0x0092
            android.content.Context r1 = r15.getContext()
            r0 = 2131232594(0x7f080752, float:1.8081302E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            r15.A04 = r0
            android.content.Context r1 = r15.getContext()
            r0 = 2131889023(0x7f120b7f, float:1.9412698E38)
        L_0x008f:
            X.AnonymousClass3MY.A0w(r1, r15, r0)
        L_0x0092:
            if (r8 == 0) goto L_0x009a
            r0 = 2131895641(0x7f122559, float:1.942612E38)
            X.AnonymousClass1Y5.A02(r15, r0)
        L_0x009a:
            r0 = 21
            X.C90104dX.A00(r15, r3, r4, r0)
            r0 = 17
            X.C1422678u.A00(r15, r3, r0)
            X.0vb r8 = r3.A05
            X.1KW r10 = r3.A07
            X.1Sl r4 = r3.A0H
            X.1Sw r1 = r3.A0G
            X.2E5 r9 = r3.A06
            int r0 = r3.A01
            X.0ve r11 = r3.A08
            X.1Nq r14 = r3.A0C
            X.1T1 r7 = r3.A03
            X.7Ha r5 = new X.7Ha
            r16 = r1
            r17 = r4
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.Set r0 = r3.A0J
            r0.add(r5)
            r15.setTag(r5)
            X.1Mz r1 = r3.A04
            X.7Hh r3 = new X.7Hh
            r3.<init>(r1, r5, r15)
            java.lang.String r0 = r5.Ba8()
            java.lang.Object r1 = r1.A0A(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 != 0) goto L_0x0103
            r2.A02(r5, r3)
            return
        L_0x00e0:
            android.content.Context r1 = r15.getContext()
            r0 = 2131232596(0x7f080754, float:1.8081306E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            r15.A04 = r0
            android.content.Context r1 = r15.getContext()
            r0 = 2131889038(0x7f120b8e, float:1.9412728E38)
            goto L_0x008f
        L_0x00f5:
            r0 = 0
            r15.A04 = r0
            android.content.Context r1 = r15.getContext()
            r0 = 2131889027(0x7f120b83, float:1.9412706E38)
            goto L_0x008f
        L_0x0100:
            r0 = r6
            goto L_0x0036
        L_0x0103:
            r0 = 1
            r3.C7F(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112155l1.Bmc(X.1xT, int):void");
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        AnonymousClass69G r1;
        List list = C42011xT.A0I;
        boolean A002 = C138766xe.A00(this.A0D.A0A);
        Context context = this.A02;
        C131086kU r3 = this.A0E;
        HashSet hashSet = this.A0I;
        int i2 = this.A01;
        if (A002) {
            r1 = new AnonymousClass69G(context, r3, hashSet, 0.0f, i2);
        } else {
            r1 = new AnonymousClass69G(context, r3, hashSet, AnonymousClass3MW.A00(context.getResources(), 2131169023), i2);
        }
        return new C42011xT(r1);
    }

    public C112155l1(Context context, AnonymousClass1T1 r3, C25131Mz r4, C18000vb r5, AnonymousClass2E5 r6, AnonymousClass1KW r7, C18030ve r8, AnonymousClass73D r9, C136166tN r10, C34501ka r11, C25291Nq r12, AnonymousClass7JS r13, C131086kU r14, AnonymousClass87N r15, C26631Sw r16, C26521Sl r17, HashSet hashSet, int i) {
        this.A02 = context;
        this.A05 = r5;
        this.A07 = r7;
        this.A0G = r16;
        this.A0F = r15;
        this.A0E = r14;
        this.A0H = r17;
        this.A0B = r11;
        this.A0A = r10;
        this.A09 = r9;
        this.A0I = hashSet;
        this.A04 = r4;
        this.A0D = r13;
        this.A06 = r6;
        this.A01 = i;
        this.A08 = r8;
        this.A0C = r12;
        this.A03 = r3;
        this.A00 = !C138766xe.A00(r13.A0A);
    }
}
