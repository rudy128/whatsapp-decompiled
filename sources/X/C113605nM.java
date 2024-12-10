package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.5nM  reason: invalid class name and case insensitive filesystem */
public class C113605nM extends C42011xT {
    public int A00;
    public AnonymousClass737 A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final AnonymousClass1KW A04;
    public final AnonymousClass872 A05;
    public final C18010vc A06;

    public static void A00(C113605nM r7) {
        r7.A02.setImageDrawable(r7.A04.A08(r7.A0H.getResources(), new C117025z5(r7.A01.A00), 0.75f, -1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r5 = this;
            X.737 r0 = r5.A01
            r4 = 0
            if (r0 != 0) goto L_0x000b
            com.whatsapp.emoji.EmojiContainerView r0 = r5.A03
            r0.setOnClickListener(r4)
            return
        L_0x000b:
            android.view.View r2 = r5.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r1.height
            r1.width = r0
            r2.setLayoutParams(r1)
            com.whatsapp.emoji.EmojiContainerView r2 = r5.A03
            r1 = 15
            X.4dG r0 = new X.4dG
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            X.737 r0 = r5.A01
            int[] r0 = r0.A00
            boolean r3 = X.AnonymousClass74I.A03(r0)
            boolean r1 = X.AnonymousClass74I.A02(r0)
            if (r3 != 0) goto L_0x0035
            r0 = 0
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r2.A02 = r0
            if (r1 == 0) goto L_0x0069
            X.0vc r1 = r5.A06
            X.737 r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C1409873v.A05(r1, r0)
            X.737 r0 = new X.737
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 6
            X.78i r4 = new X.78i
            r4.<init>(r5, r0)
        L_0x0057:
            r2.setOnLongClickListener(r4)
        L_0x005a:
            android.widget.ImageView r1 = r5.A02
            X.737 r0 = r5.A01
            java.lang.String r0 = r0.toString()
            r1.setContentDescription(r0)
            A00(r5)
            return
        L_0x0069:
            if (r3 == 0) goto L_0x0057
            X.0vc r1 = r5.A06
            X.737 r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C1409873v.A06(r1, r0)
            X.737 r0 = new X.737
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 1
            X.7G8 r1 = new X.7G8
            r1.<init>(r5, r0)
            r0 = 7
            X.C1421578j.A00(r2, r1, r5, r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113605nM.A0B():void");
    }

    public C113605nM(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass1KW r7, AnonymousClass872 r8, C18010vc r9, int i) {
        super(layoutInflater.inflate(2131625193, viewGroup, false));
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        View view = this.A0H;
        C108975cc.A0v(view, i);
        EmojiContainerView emojiContainerView = (EmojiContainerView) view.findViewById(2131430332);
        this.A03 = emojiContainerView;
        this.A02 = AnonymousClass3MW.A0H(view, 2131430307);
        emojiContainerView.setVisibility(0);
    }
}
