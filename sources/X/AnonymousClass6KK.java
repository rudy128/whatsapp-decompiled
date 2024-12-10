package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.status.ContactStatusThumbnail;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6KK  reason: invalid class name */
public abstract class AnonymousClass6KK extends C113585nK {
    public final C37451pZ A00;
    public final AQC A01;
    public final AnonymousClass1VW A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(android.widget.ImageView r11, X.AnonymousClass6J8 r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r1 = r12
            r0 = 1
            r6 = r11
            X.C18070vi.A0d(r11, r0)
            r9 = r13
            if (r13 == 0) goto L_0x0107
            X.206 r7 = r12.A03()
        L_0x000d:
            if (r7 == 0) goto L_0x005c
            if (r14 == 0) goto L_0x001c
            boolean r0 = r12 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x0101
            X.6JC r1 = (X.AnonymousClass6JC) r1
            boolean r0 = r1.A07
        L_0x0019:
            r1 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            boolean r0 = r7 instanceof X.C441822l
            if (r0 == 0) goto L_0x005d
            X.00H r0 = r10.A03
            if (r0 == 0) goto L_0x0119
            java.lang.Object r2 = r0.get()
            X.6d6 r2 = (X.C126666d6) r2
            if (r2 == 0) goto L_0x0119
            X.22l r7 = (X.C441822l) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            android.content.Context r1 = r11.getContext()
            java.lang.String r0 = ""
            r11.setTag(r0)
            X.C18070vi.A0b(r1)
            int r4 = X.C124106Xb.A00(r1, r7)
            if (r13 == 0) goto L_0x010d
            r0 = 2131233310(0x7f080a1e, float:1.8082754E38)
            android.graphics.drawable.Drawable r3 = X.C24261Jm.A00(r1, r0)
            X.00H r0 = r2.A00
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 48
            X.3Cu r0 = new X.3Cu
            r0.<init>(r11, r4, r1, r3)
            r2.A0J(r0)
        L_0x005c:
            return
        L_0x005d:
            boolean r0 = r7 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x008a
            X.00H r0 = r10.A04
            if (r0 == 0) goto L_0x0120
            java.lang.Object r3 = r0.get()
            X.6j4 r3 = (X.C130216j4) r3
            if (r3 == 0) goto L_0x0120
            if (r1 == 0) goto L_0x007a
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.6q4 r0 = (X.C134116q4) r0
            r0.A00(r7)
        L_0x007a:
            X.10I r0 = r3.A04
            r5 = 41
            X.7RT r1 = new X.7RT
            r2 = r7
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGN(r1)
            return
        L_0x008a:
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x012e
            X.00H r0 = r10.A05
            if (r0 == 0) goto L_0x0127
            java.lang.Object r3 = r0.get()
            X.71M r3 = (X.AnonymousClass71M) r3
            if (r3 == 0) goto L_0x0127
            X.210 r7 = (X.AnonymousClass210) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = ""
            r11.setTag(r0)
            android.content.Context r4 = r11.getContext()
            android.graphics.drawable.Drawable r5 = r11.getDrawable()
            X.0ve r2 = r3.A01
            r1 = 7899(0x1edb, float:1.1069E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00cc
            X.C18070vi.A0b(r4)
            X.00H r0 = r3.A04
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            r8 = 6
            X.7QF r2 = new X.7QF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.CGF(r2)
            return
        L_0x00cc:
            X.C18070vi.A0b(r4)
            boolean r0 = X.AnonymousClass71M.A01(r7, r3)
            if (r0 == 0) goto L_0x00e9
            X.00H r0 = r3.A03
            java.lang.Object r1 = r0.get()
            X.1gV r1 = (X.C32021gV) r1
            X.00H r0 = r3.A00
            java.lang.Object r0 = r0.get()
            X.3M2 r0 = (X.AnonymousClass3M2) r0
            r1.A0D(r11, r7, r0)
            return
        L_0x00e9:
            X.5dW r2 = X.AnonymousClass71M.A00(r4, r5, r7, r3, r13)
            if (r2 == 0) goto L_0x005c
            boolean r0 = r11 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r0 == 0) goto L_0x00fd
            r0 = r6
            com.whatsapp.components.button.ThumbnailButton r0 = (com.whatsapp.components.button.ThumbnailButton) r0
            float r1 = r0.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.A00 = r1
        L_0x00fd:
            r11.setImageDrawable(r2)
            return
        L_0x0101:
            X.6JB r1 = (X.AnonymousClass6JB) r1
            boolean r0 = r1.A06
            goto L_0x0019
        L_0x0107:
            X.206 r7 = r12.A02()
            goto L_0x000d
        L_0x010d:
            android.graphics.drawable.LayerDrawable r0 = X.C124116Xc.A00(r1, r4)
            android.graphics.Bitmap r0 = X.C124246Xp.A00(r0)
            r11.setImageBitmap(r0)
            return
        L_0x0119:
            java.lang.String r0 = "Audio status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0120:
            java.lang.String r0 = "Media status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0127:
            java.lang.String r0 = "Text status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Class type not supported: "
            r1.append(r0)
            java.lang.String r0 = X.C108955ca.A0x(r7)
            X.C17890vO.A19(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KK.A0E(android.widget.ImageView, X.6J8, boolean, boolean):void");
    }

    public final void A0G(ContactStatusThumbnail contactStatusThumbnail, AnonymousClass6J8 r10) {
        int i;
        int i2;
        C18070vi.A0d(contactStatusThumbnail, 1);
        C63372sx A002 = r10.A00();
        int i3 = 0;
        if (A002 != null) {
            i = A002.A01();
            i3 = A002.A00();
        } else {
            i = 0;
        }
        Map map = contactStatusThumbnail.A05;
        map.clear();
        contactStatusThumbnail.A07(i, i3);
        if (r10 instanceof AnonymousClass6JC) {
            C132706nQ r0 = ((AnonymousClass6JC) r10).A05;
            C132696nP r4 = r0.A02;
            Context context = contactStatusThumbnail.getContext();
            int i4 = 0;
            for (Object next : r0.A03) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                Set set = r4.A01;
                AnonymousClass205 r1 = ((AnonymousClass206) next).A0v;
                if (set.contains(r1)) {
                    i2 = AnonymousClass1YL.A00(context, 2130971379, 2131102602);
                } else if (r4.A02.contains(r1)) {
                    i2 = 2131102611;
                } else {
                    i4 = i5;
                }
                C17880vN.A1P(Integer.valueOf(i4), map, C19740yt.A00(context, i2));
                i4 = i5;
            }
        }
    }

    public AnonymousClass6KK(View view, AnonymousClass1VW r2, C37451pZ r3, AQC aqc, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        super(view);
        this.A00 = r3;
        this.A01 = aqc;
        this.A02 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r7;
    }

    public final void A0D(ImageView imageView, AnonymousClass1E7 r5) {
        boolean A1Z = C72453Mb.A1Z(imageView);
        if (C22971Dz.A0Z(r5.A0J)) {
            this.A02.A0C(imageView, r5);
        } else {
            this.A00.A05(imageView, this.A01, r5, A1Z);
        }
    }

    public final void A0F(C18000vb r10, AnonymousClass6J8 r11, String str) {
        C63372sx A002 = r11.A00();
        if (A002 != null) {
            View view = this.A0H;
            long A012 = (long) A002.A01();
            Object[] objArr = new Object[2];
            objArr[0] = str;
            C17880vN.A1T(objArr, A002.A01(), 1);
            String A0K = r10.A0K(objArr, 2131755008, A012);
            C18070vi.A0X(A0K);
            view.setContentDescription(A0K);
        }
    }
}
