package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.lists.view.ListTextInputView;
import java.util.List;

/* renamed from: X.3X7  reason: invalid class name */
public final class AnonymousClass3X7 extends C38391rD {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public String A01 = "";
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass4KB A04;
    public final KeyboardPopupLayout A05;
    public final C72043Kk A06;
    public final C37451pZ A07;
    public final EmojiSearchContainer A08;
    public final List A09 = AnonymousClass000.A13();
    public final C18090vk A0A;
    public final C22821Di A0B;

    public AnonymousClass3X7(AnonymousClass4KB r3, KeyboardPopupLayout keyboardPopupLayout, C72043Kk r5, C37451pZ r6, EmojiSearchContainer emojiSearchContainer, C18090vk r8, C22821Di r9) {
        C18070vi.A0e(keyboardPopupLayout, 1, emojiSearchContainer);
        this.A05 = keyboardPopupLayout;
        this.A08 = emojiSearchContainer;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A0A = r8;
        this.A0B = r9;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        int i2 = i;
        if (i2 == 2131625864) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup2).inflate(2131625864, viewGroup2, false);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.lists.view.ListTextInputView");
            ListTextInputView listTextInputView = (ListTextInputView) inflate;
            listTextInputView.setListName(this.A01);
            listTextInputView.setCursorPosition(this.A01.length());
            AnonymousClass4KB r3 = this.A04;
            KeyboardPopupLayout keyboardPopupLayout = this.A05;
            EmojiSearchContainer emojiSearchContainer = this.A08;
            AnonymousClass5T1 r0 = new AnonymousClass5T1(this);
            List list = C42011xT.A0I;
            AnonymousClass10E r32 = r3.A00.A02;
            AnonymousClass00H A002 = C000200d.A00(r32.A04);
            AnonymousClass10G r2 = r32.A00;
            return new C821142q(listTextInputView, keyboardPopupLayout, emojiSearchContainer, A002, C000200d.A00(r2.A2e), C000200d.A00(r32.A31), C000200d.A00(r32.A3d), C000200d.A00(r32.A9P), C000200d.A00(r32.AAp), C000200d.A00(r32.ABz), C000200d.A00(r2.A1c), C000200d.A00(r32.ABl), C000200d.A00(r32.A9s), C000200d.A00(r2.A1h), r0);
        } else if (i2 == 2131627208) {
            return new AnonymousClass42n(C72473Md.A0I(2131627208, viewGroup2));
        } else {
            if (i2 == 2131624130) {
                return new AnonymousClass42l(this.A0A, C72473Md.A0I(2131624130, viewGroup2));
            } else if (i2 == 2131624667) {
                View inflate2 = AnonymousClass3MZ.A0D(viewGroup2).inflate(2131624667, viewGroup2, false);
                List list2 = C42011xT.A0I;
                C37451pZ r6 = this.A07;
                boolean z = this.A02;
                C72043Kk r5 = this.A06;
                C18070vi.A0b(inflate2);
                return new C821042p(inflate2, r5, r6, new AnonymousClass5T2(this), z, this.A03);
            } else if (i2 == 2131625160) {
                return new AnonymousClass42m(C72473Md.A0I(2131625160, viewGroup2));
            } else {
                if (i2 == 2131625161) {
                    return new AnonymousClass42o(C72473Md.A0I(2131625161, viewGroup2));
                }
                if (i2 == 2131625159) {
                    View A0I = C72473Md.A0I(2131625159, viewGroup2);
                    C18070vi.A0d(A0I, 1);
                    return new C42011xT(A0I);
                }
                throw AnonymousClass000.A0n("Unsupported view type");
            }
        }
    }

    public int A0Q() {
        return this.A09.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0171, code lost:
        if (r12.A02 == false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r33, int r34) {
        /*
            r32 = this;
            r13 = r33
            X.3Xo r13 = (X.C73853Xo) r13
            r1 = 0
            X.C18070vi.A0d(r13, r1)
            r0 = r32
            java.util.List r0 = r0.A09
            r2 = r34
            java.lang.Object r12 = r0.get(r2)
            X.5Y3 r12 = (X.AnonymousClass5Y3) r12
            boolean r0 = r13 instanceof X.AnonymousClass42n
            if (r0 == 0) goto L_0x002c
            X.42n r13 = (X.AnonymousClass42n) r13
            X.C18070vi.A0d(r12, r1)
            X.0vp r0 = r13.A00
            java.lang.Object r1 = X.AnonymousClass3MY.A0l(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891319(0x7f121477, float:1.9417355E38)
        L_0x0028:
            r1.setText(r0)
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = r13 instanceof X.C821142q
            if (r0 == 0) goto L_0x0101
            X.42q r13 = (X.C821142q) r13
            X.4oH r12 = (X.C96704oH) r12
            X.C18070vi.A0d(r12, r1)
            android.view.View r0 = r13.A0H
            android.app.Activity r15 = X.AnonymousClass3Ma.A05(r0)
            X.00H r0 = r13.A06
            java.lang.Object r14 = r0.get()
            X.0ve r14 = (X.C18030ve) r14
            X.00H r0 = r13.A0B
            java.lang.Object r11 = r0.get()
            X.1L4 r11 = (X.AnonymousClass1L4) r11
            X.00H r0 = r13.A07
            java.lang.Object r10 = r0.get()
            X.190 r10 = (X.AnonymousClass190) r10
            X.00H r0 = r13.A08
            java.lang.Object r9 = r0.get()
            X.1KW r9 = (X.AnonymousClass1KW) r9
            X.00H r0 = r13.A0C
            java.lang.Object r8 = r0.get()
            X.67r r8 = (X.C1193267r) r8
            X.00H r0 = r13.A0E
            java.lang.Object r7 = r0.get()
            X.11C r7 = (X.AnonymousClass11C) r7
            X.00H r0 = r13.A0G
            java.lang.Object r6 = r0.get()
            X.0vb r6 = (X.C18000vb) r6
            X.00H r0 = r13.A09
            java.lang.Object r5 = r0.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r5 = (com.whatsapp.emoji.search.EmojiSearchProvider) r5
            X.00H r0 = r13.A0F
            java.lang.Object r4 = r0.get()
            X.0z4 r4 = (X.C19830z4) r4
            X.00H r0 = r13.A0D
            java.lang.Object r3 = r0.get()
            X.0vc r3 = (X.C18010vc) r3
            com.whatsapp.KeyboardPopupLayout r0 = r13.A00
            r18 = r0
            com.whatsapp.WaImageButton r0 = r13.A02
            r16 = r0
            com.whatsapp.WaEditText r2 = r13.A01
            r0 = 34
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            X.00H r0 = r13.A0A
            java.lang.Object r1 = r0.get()
            X.A59 r1 = (X.A59) r1
            r31 = 0
            X.3d3 r0 = new X.3d3
            r25 = r9
            r26 = r5
            r27 = r14
            r28 = r3
            r29 = r11
            r23 = r1
            r24 = r8
            r21 = r4
            r22 = r6
            r19 = r2
            r20 = r7
            r17 = r10
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = r13.A05
            X.4UI r5 = new X.4UI
            r5.<init>(r15, r0, r1)
            r1 = 9
            X.4gk r4 = new X.4gk
            r4.<init>(r2, r1)
            r3 = 6
            X.4n0 r1 = new X.4n0
            r1.<init>(r4, r3)
            r5.A00 = r1
            r0.A0J(r4)
            r3 = 48
            X.7Pd r1 = new X.7Pd
            r1.<init>(r15, r3)
            r0.A0E = r1
            r0 = 4
            X.C89554ce.A00(r2, r13, r0)
            com.whatsapp.WaTextView r3 = r13.A04
            boolean r2 = r12.A00
            r1 = 0
            int r0 = X.C72453Mb.A07(r2)
            r3.setVisibility(r0)
            com.whatsapp.WaTextView r0 = r13.A03
            if (r2 != 0) goto L_0x00fd
            r1 = 8
        L_0x00fd:
            r0.setVisibility(r1)
            return
        L_0x0101:
            boolean r0 = r13 instanceof X.AnonymousClass42m
            if (r0 == 0) goto L_0x0118
            X.42m r13 = (X.AnonymousClass42m) r13
            X.4oC r12 = (X.C96654oC) r12
            X.C18070vi.A0d(r12, r1)
            X.0vl r0 = r13.A00
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r12.A00
            goto L_0x0028
        L_0x0118:
            boolean r0 = r13 instanceof X.AnonymousClass42o
            if (r0 == 0) goto L_0x014d
            X.42o r13 = (X.AnonymousClass42o) r13
            X.4oD r12 = (X.C96664oD) r12
            X.C18070vi.A0d(r12, r1)
            X.1x1 r0 = r12.A00
            int r3 = r0.A02
            r0 = 3
            r2 = 2131897340(0x7f122bfc, float:1.9429567E38)
            r1 = 2131233470(0x7f080abe, float:1.8083078E38)
            if (r3 != r0) goto L_0x0136
            r2 = 2131890909(0x7f1212dd, float:1.9416523E38)
            r1 = 2131233314(0x7f080a22, float:1.8082762E38)
        L_0x0136:
            X.0vp r0 = r13.A01
            java.lang.Object r0 = X.AnonymousClass3MY.A0l(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            X.0vp r0 = r13.A00
            java.lang.Object r0 = X.AnonymousClass3MY.A0l(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r1)
            return
        L_0x014d:
            boolean r0 = r13 instanceof X.AnonymousClass42k
            if (r0 != 0) goto L_0x002b
            boolean r0 = r13 instanceof X.C821042p
            if (r0 == 0) goto L_0x002b
            X.42p r13 = (X.C821042p) r13
            X.4oE r12 = (X.C96674oE) r12
            X.C18070vi.A0d(r12, r1)
            X.0vp r3 = r13.A04
            android.view.View r2 = X.AnonymousClass3Ma.A0A(r3)
            X.C18070vi.A0X(r2)
            boolean r0 = r13.A07
            r4 = 0
            if (r0 == 0) goto L_0x0173
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x0173
            boolean r1 = r12.A02
            r0 = 0
            if (r1 != 0) goto L_0x0175
        L_0x0173:
            r0 = 8
        L_0x0175:
            r2.setVisibility(r0)
            java.lang.Object r2 = r3.get()
            android.view.View r2 = (android.view.View) r2
            r1 = 11
            X.4dr r0 = new X.4dr
            r0.<init>(r12, r13, r1)
            r2.setOnTouchListener(r0)
            X.0vp r3 = r13.A03
            android.view.View r1 = X.AnonymousClass3Ma.A0A(r3)
            X.C18070vi.A0X(r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x01c6
        L_0x0199:
            r1.setVisibility(r4)
            X.1pZ r2 = r13.A00
            X.1E7 r1 = r12.A00
            X.0vp r0 = r13.A02
            java.lang.Object r0 = X.AnonymousClass3MY.A0l(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A07(r0, r1)
            X.0vp r0 = r13.A01
            java.lang.Object r0 = X.AnonymousClass3MY.A0l(r0)
            X.1xh r0 = (X.C42141xh) r0
            r0.A05(r1)
            java.lang.Object r2 = r3.get()
            android.view.View r2 = (android.view.View) r2
            r1 = 4
            X.78K r0 = new X.78K
            r0.<init>(r12, r1)
            r2.setOnClickListener(r0)
            return
        L_0x01c6:
            r4 = 8
            goto L_0x0199
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3X7.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Object obj = this.A09.get(i);
        if (obj instanceof C96704oH) {
            return 2131625864;
        }
        if (obj instanceof C96644oB) {
            return 2131627208;
        }
        if (obj instanceof C96684oF) {
            return 2131624130;
        }
        if (obj instanceof C96674oE) {
            return 2131624667;
        }
        if (obj instanceof C96664oD) {
            return 2131625161;
        }
        if (obj instanceof C96654oC) {
            return 2131625160;
        }
        if (obj instanceof C96694oG) {
            return 2131625159;
        }
        throw AnonymousClass3MW.A14();
    }
}
