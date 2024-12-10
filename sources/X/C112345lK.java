package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5lK  reason: invalid class name and case insensitive filesystem */
public class C112345lK extends C38391rD {
    public int A00;
    public AnonymousClass725 A01;
    public C126616d1 A02;
    public List A03;
    public boolean A04 = false;
    public final C18030ve A05;
    public final boolean A06;
    public final boolean A07;
    public final int A08;
    public final int A09;
    public final C24481Km A0A;
    public final C26631Sw A0B;
    public final AnonymousClass4VT A0C;

    public static void A02(C112345lK r7) {
        List<C135906sx> list = r7.A03;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        if (!list.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            for (C135906sx r0 : list) {
                A13.add(new C135906sx(r0.A03, r0.A00, r0.A02));
            }
            C25367CeS.A00(new C111465jl(list, A13)).A02(r7);
        }
    }

    public static void A03(C112345lK r1, int i, boolean z) {
        List list = r1.A03;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        if (i >= 0 && i < list.size()) {
            ((C135906sx) list.get(i)).A01 = z;
        }
    }

    private void A04(C113275mp r21, int i) {
        boolean z;
        C1418377d r7;
        String str;
        C113275mp r4 = r21;
        ImageView imageView = r4.A01;
        imageView.setImageResource(2131233062);
        List list = this.A03;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        int i2 = i;
        if (i < 0 || i2 >= list.size()) {
            z = false;
        } else {
            z = ((C135906sx) list.get(i2)).A00;
        }
        r4.A00.setVisibility(C72453Mb.A07(z ? 1 : 0));
        imageView.setAlpha(C108975cc.A00(z));
        AnonymousClass725 r0 = this.A01;
        if (r0 != null) {
            if (r0.A07.size() > i2) {
                r7 = (C1418377d) this.A01.A07.get(i2);
            } else {
                r7 = null;
            }
            AnonymousClass725 r1 = this.A01;
            if (r1.A0W || ((r1.A0I == null && !r1.A07.isEmpty()) || !(r7 == null || r7.A0B == null || (!this.A07 && r1.A02())))) {
                C26631Sw r12 = this.A0B;
                C17960vV.A07(r7);
                int i3 = this.A09;
                r12.A06(new C59842my(imageView, r7, new AnonymousClass7MP(imageView, r7, this, i2, 0), i3, i3, 1, i2, false, false, C137456vU.A01(this.A05)));
                return;
            }
            C18030ve r2 = this.A05;
            C18040vf r13 = C18040vf.A02;
            if (C18020vd.A05(r13, r2, 5693)) {
                str = C18020vd.A01(r13, r2, 6785);
            } else {
                str = null;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("https://static.whatsapp.net/sticker?img=");
            String A0y = AnonymousClass000.A0y(C17880vN.A0w(this.A01.A06, r4.A05()), A10);
            if (str != null) {
                A0y = C17900vP.A0A(A0y, str);
            }
            this.A0C.A02(imageView, new C145867Mx(this, r4), this.A0A.A01(A0y));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r11v0 int) = (r23v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private void A05(X.C113275mp r21, java.util.List r22, int r23) {
        /*
            r20 = this;
            r2 = r20
            X.725 r0 = r2.A01
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            r11 = r23
            if (r0 <= r11) goto L_0x006f
            X.725 r0 = r2.A01
            java.util.List r0 = r0.A07
            java.lang.Object r6 = r0.get(r11)
            X.77d r6 = (X.C1418377d) r6
            if (r6 == 0) goto L_0x006f
            r3 = r21
            android.view.View r0 = r3.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A01
            r0.setVisibility(r1)
            X.1bI r0 = r3.A02
            r13 = 0
            android.view.View r5 = X.AnonymousClass3MY.A0I(r0, r13)
            com.whatsapp.stickers.StickerView r5 = (com.whatsapp.stickers.StickerView) r5
            r2.A00(r5)
            r10 = 1
            r5.A02 = r10
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x0070
            X.1Sw r0 = r2.A0B
            X.C17960vV.A07(r6)
            int r8 = r2.A09
            X.7MP r7 = new X.7MP
            r14 = r7
            r15 = r5
            r16 = r6
            r18 = r11
            r19 = r10
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            X.2my r4 = new X.2my
            r9 = r8
            r12 = r10
            r14 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A06(r4)
        L_0x0060:
            android.view.View r1 = r3.A0H
            r0 = 34
            X.C90104dX.A00(r1, r2, r11, r0)
            X.4dk r0 = new X.4dk
            r0.<init>(r2, r11, r10)
            r1.setOnLongClickListener(r0)
        L_0x006f:
            return
        L_0x0070:
            android.content.Context r0 = r5.getContext()
            X.C108955ca.A1B(r0, r5, r6)
            A01(r5, r2, r11, r10)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112345lK.A05(X.5mp, java.util.List, int):void");
    }

    public static boolean A06(C112345lK r9, int i) {
        String str;
        if (r9.A02 == null) {
            return true;
        }
        List list = r9.A03;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        if (i < list.size() && ((C135906sx) list.get(i)).A00) {
            return true;
        }
        AnonymousClass725 r2 = r9.A01;
        C17960vV.A07(r2);
        if (r2.A07.size() <= i) {
            return false;
        }
        C126616d1 r1 = r9.A02;
        if (r1 == null) {
            return true;
        }
        C1418377d r6 = (C1418377d) r2.A07.get(i);
        C18070vi.A0d(r6, 0);
        r6.A05 = C17880vN.A0k();
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = r1.A00;
        if (C18020vd.A05(C18040vf.A02, stickerStorePackPreviewActivity.A0E, 8868)) {
            str = stickerStorePackPreviewActivity.A0U;
        } else {
            str = null;
        }
        if (stickerStorePackPreviewActivity.A09 != null) {
            stickerStorePackPreviewActivity.CMl(C124156Xg.A00((Uri) null, (AnonymousClass205) null, r6, C122606Ra.STICKER_STORE_PREVIEW, str, false, false));
            return true;
        }
        C18070vi.A11("stickerInfoDialogFactory");
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0P(C42011xT r2, List list, int i) {
        C113275mp r22 = (C113275mp) r2;
        if (this.A06) {
            A05(r22, list, i);
        } else {
            A04(r22, i);
        }
    }

    public int A0Q() {
        List list;
        AnonymousClass725 r1 = this.A01;
        if (r1 == null) {
            return 0;
        }
        if (r1.A0W || (r1.A0I == null && !r1.A07.isEmpty())) {
            list = this.A01.A07;
        } else {
            list = this.A01.A06;
        }
        int size = list.size();
        int i = this.A00;
        if (i > 0) {
            return Math.min(size, i);
        }
        return size;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C113275mp r22 = (C113275mp) r2;
        if (this.A06) {
            A05(r22, Collections.emptyList(), i);
        } else {
            A04(r22, i);
        }
    }

    public C112345lK(C18030ve r2, C24481Km r3, C26631Sw r4, AnonymousClass4VT r5, int i, int i2, boolean z, boolean z2) {
        this.A05 = r2;
        this.A0B = r4;
        this.A0C = r5;
        this.A09 = i;
        this.A08 = i2;
        this.A00 = 0;
        this.A06 = z;
        this.A07 = z2;
        this.A0A = r3;
    }

    private void A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.A09;
        layoutParams.height = i;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        int i2 = this.A08;
        view.setPadding(i2, i2, i2, i2);
    }

    public static void A01(StickerView stickerView, C112345lK r2, int i, boolean z) {
        A03(r2, i, z);
        if (r2.A04) {
            Drawable drawable = stickerView.getDrawable();
            if (drawable instanceof C38631rd) {
                C38631rd r1 = (C38631rd) drawable;
                if (r1.isRunning()) {
                    r1.A06();
                    return;
                }
            }
            if (drawable instanceof Animatable) {
                Animatable animatable = (Animatable) drawable;
                if (animatable.isRunning()) {
                    animatable.stop();
                    return;
                }
                return;
            }
            return;
        }
        stickerView.A06();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C113275mp r1 = new C113275mp(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627120));
        A00(r1.A01);
        A00(r1.A00);
        return r1;
    }
}
