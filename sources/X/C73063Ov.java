package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Ov  reason: invalid class name and case insensitive filesystem */
public class C73063Ov extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C73063Ov(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.view.View r36, int r37) {
        /*
            r35 = this;
            r34 = r35
            r0 = r34
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r5 = r0.A02
            java.util.List r13 = r5.A0b
            r7 = r37
            java.lang.Object r4 = r13.get(r7)
            X.4Ua r4 = (X.C87034Ua) r4
            r0 = 2131435018(0x7f0b1e0a, float:1.8491866E38)
            r6 = r36
            android.view.View r2 = r6.findViewById(r0)
            r14 = 13
            r1 = 5
            r12 = 0
            r10 = 8
            r9 = 0
            if (r37 == 0) goto L_0x028a
            int r11 = r4.A00()
            int r0 = r37 + -1
            java.lang.Object r0 = r13.get(r0)
            X.4Ua r0 = (X.C87034Ua) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x028a
            java.lang.Integer r3 = r4.A02()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r0 == r3) goto L_0x028a
            r27 = 0
            r2.setVisibility(r10)
        L_0x0041:
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r26 = r6.findViewById(r0)
            r0 = 1
            int r0 = X.AnonymousClass3MX.A02(r13, r0)
            if (r7 == r0) goto L_0x027d
            int r0 = r37 + 1
            java.lang.Object r0 = r13.get(r0)
            X.4Ua r0 = (X.C87034Ua) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x027d
            r1 = 2131232772(0x7f080804, float:1.8081663E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r9)
        L_0x006f:
            r0 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.widget.ImageView r13 = X.AnonymousClass3MW.A0H(r6, r0)
            X.3Kk r1 = r5.A08
            r0 = 2131434061(0x7f0b1a4d, float:1.8489925E38)
            X.1xh r12 = X.C42141xh.A01(r6, r1, r0)
            r0 = 2131435002(0x7f0b1dfa, float:1.8491834E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0W(r6, r0)
            r0 = 2131434471(0x7f0b1be7, float:1.8490757E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r6, r0)
            r0 = 2131429800(0x7f0b09a8, float:1.8481283E38)
            android.view.View r10 = r6.findViewById(r0)
            r0 = 2131429809(0x7f0b09b1, float:1.8481301E38)
            android.view.View r8 = r6.findViewById(r0)
            r0 = 2131429806(0x7f0b09ae, float:1.8481295E38)
            android.view.View r9 = r6.findViewById(r0)
            r0 = 2131429803(0x7f0b09ab, float:1.848129E38)
            android.view.View r25 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 2131429799(0x7f0b09a7, float:1.848128E38)
            android.widget.TextView r24 = X.C17880vN.A0E(r6, r0)
            r0 = 2131429808(0x7f0b09b0, float:1.84813E38)
            android.widget.TextView r23 = X.C17880vN.A0E(r6, r0)
            r0 = 2131429805(0x7f0b09ad, float:1.8481293E38)
            android.widget.TextView r22 = X.C17880vN.A0E(r6, r0)
            r0 = 2131429802(0x7f0b09aa, float:1.8481287E38)
            android.widget.TextView r21 = X.AnonymousClass3MW.A0J(r6, r0)
            r0 = 2131429801(0x7f0b09a9, float:1.8481285E38)
            android.view.View r20 = r6.findViewById(r0)
            r0 = 2131429810(0x7f0b09b2, float:1.8481303E38)
            android.view.View r19 = r6.findViewById(r0)
            r0 = 2131429807(0x7f0b09af, float:1.8481297E38)
            android.view.View r18 = r6.findViewById(r0)
            r0 = 2131429804(0x7f0b09ac, float:1.8481291E38)
            android.view.View r17 = X.AnonymousClass1HF.A06(r6, r0)
            r14 = 8
            r10.setVisibility(r14)
            r8.setVisibility(r14)
            r9.setVisibility(r14)
            r0 = r25
            r0.setVisibility(r14)
            r0 = r20
            r0.setVisibility(r14)
            r0 = r19
            r0.setVisibility(r14)
            r0 = r18
            r0.setVisibility(r14)
            r0 = r17
            r0.setVisibility(r14)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r0 != r3) goto L_0x0139
            r0 = 0
            r2.setVisibility(r0)
            r13.setVisibility(r14)
            com.whatsapp.TextEmojiLabel r0 = r12.A01
            r0.setVisibility(r14)
            r1.setVisibility(r14)
            X.3vB r4 = (X.C79323vB) r4
            X.0vb r7 = r5.A00
            r5 = 2131755313(0x7f100131, float:1.9141502E38)
            int r1 = r4.A00
            long r3 = (long) r1
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.AnonymousClass000.A1L(r0, r1)
            java.lang.String r0 = r7.A0K(r0, r5, r3)
            r2.setText(r0)
            r2 = 0
            r6.setTag(r2)
        L_0x0133:
            r0 = r26
            r0.setOnClickListener(r2)
            return
        L_0x0139:
            X.1E7 r3 = r4.A01
            X.C17960vV.A07(r3)
            X.1Me r14 = r5.A0C
            X.206 r0 = r5.A0Q
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            int r0 = r14.A0B(r0)
            r14 = 8
            r2.setVisibility(r14)
            r14 = 0
            r13.setVisibility(r14)
            X.1pZ r2 = r5.A0D
            r2.A0C(r13, r3, r14)
            r2 = 0
            com.whatsapp.TextEmojiLabel r15 = r12.A01
            r15.setVisibility(r14)
            if (r27 == 0) goto L_0x0266
            com.whatsapp.jid.UserJid r14 = r4.A02
            X.11S r13 = r5.A02
            com.whatsapp.jid.PhoneUserJid r13 = X.AnonymousClass11S.A00(r13)
            boolean r13 = r14.equals(r13)
            r14 = 0
            if (r13 == 0) goto L_0x0252
            android.content.Context r13 = r12.A00
            r0 = 2131891558(0x7f121566, float:1.941784E38)
            java.lang.String r13 = r13.getString(r0)
        L_0x0178:
            r0 = 256(0x100, float:3.59E-43)
            r15.A0S(r13, r14, r0, r2)
            boolean r0 = r12.A0C(r3)
            r12.A03(r0)
        L_0x0184:
            java.lang.String r12 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x024b
            r1.setVisibility(r2)
            r1.A0R(r12)
        L_0x0192:
            X.1BI r1 = r3.A0J
            r0 = r34
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 5
            if (r1 == 0) goto L_0x020d
            long r0 = r4.A01(r0)
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01b6
            r11 = r24
            X.AnonymousClass3MY.A1F(r11, r5, r0)
            r10.setVisibility(r2)
            r0 = r20
            r0.setVisibility(r2)
        L_0x01b6:
            r0 = 13
            long r0 = r4.A01(r0)
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x01cd
            r10 = r23
            X.AnonymousClass3MY.A1F(r10, r5, r0)
            r8.setVisibility(r2)
            r0 = r19
            r0.setVisibility(r2)
        L_0x01cd:
            r0 = 8
            long r0 = r4.A01(r0)
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e4
            r8 = r22
            X.AnonymousClass3MY.A1F(r8, r5, r0)
            r9.setVisibility(r2)
            r0 = r18
            r0.setVisibility(r2)
        L_0x01e4:
            if (r27 == 0) goto L_0x01fd
            X.3vA r4 = (X.C79313vA) r4
            long r0 = r4.A00
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x01fd
            r4 = r21
            X.AnonymousClass3MY.A1F(r4, r5, r0)
            r0 = r25
            r0.setVisibility(r2)
        L_0x01f8:
            r0 = r17
            r0.setVisibility(r2)
        L_0x01fd:
            X.1BI r0 = r3.A0J
            r6.setTag(r0)
            r1 = 11
            X.78T r2 = new X.78T
            r0 = r34
            r2.<init>(r0, r7, r1, r6)
            goto L_0x0133
        L_0x020d:
            if (r11 == r0) goto L_0x023e
            r0 = 8
            if (r11 == r0) goto L_0x0231
            r0 = 13
            if (r11 != r0) goto L_0x0223
            long r0 = r4.A01(r0)
            r9 = r23
            X.AnonymousClass3MY.A1F(r9, r5, r0)
            r8.setVisibility(r2)
        L_0x0223:
            if (r27 == 0) goto L_0x01fd
            X.3vA r4 = (X.C79313vA) r4
            long r0 = r4.A00
            r4 = r21
            X.AnonymousClass3MY.A1F(r4, r5, r0)
            r17 = r25
            goto L_0x01f8
        L_0x0231:
            long r0 = r4.A01(r0)
            r8 = r22
            X.AnonymousClass3MY.A1F(r8, r5, r0)
            r9.setVisibility(r2)
            goto L_0x0223
        L_0x023e:
            long r0 = r4.A01(r0)
            r8 = r24
            X.AnonymousClass3MY.A1F(r8, r5, r0)
            r10.setVisibility(r2)
            goto L_0x0223
        L_0x024b:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0192
        L_0x0252:
            boolean r16 = r12.A0C(r3)
            X.1Me r13 = r12.A02
            if (r16 == 0) goto L_0x0260
            java.lang.String r13 = r13.A0W(r3, r2)
            goto L_0x0178
        L_0x0260:
            java.lang.String r13 = r13.A0U(r3, r0, r2)
            goto L_0x0178
        L_0x0266:
            X.1Me r13 = r12.A02
            X.1yg r29 = r13.A0D(r3, r0)
            r31 = 0
            boolean r33 = r12.A0C(r3)
            r28 = r12
            r30 = r3
            r32 = r0
            r28.A04(r29, r30, r31, r32, r33)
            goto L_0x0184
        L_0x027d:
            r1 = 2131232771(0x7f080803, float:1.808166E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r10)
            goto L_0x006f
        L_0x028a:
            r2.setVisibility(r9)
            r0 = 2131435024(0x7f0b1e10, float:1.8491878E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r6, r0)
            r0 = 2131435021(0x7f0b1e0d, float:1.8491872E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r6, r0)
            int r11 = r4.A00()
            if (r11 == r1) goto L_0x0378
            if (r11 == r10) goto L_0x0340
            if (r11 != r14) goto L_0x02d1
            X.206 r0 = r5.A0Q
            int r0 = r0.A0u
            if (r0 != 0) goto L_0x0332
            r1 = 2131892084(0x7f121774, float:1.9418906E38)
        L_0x02ae:
            r8.setText(r1)
            android.content.Context r14 = r6.getContext()
            r3 = 2131232656(0x7f080790, float:1.8081427E38)
            android.content.Context r15 = r6.getContext()
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131101887(0x7f0608bf, float:1.7816196E38)
            int r1 = X.AnonymousClass1YL.A00(r15, r1, r0)
        L_0x02c6:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r14, r3)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r14, r0, r1)
        L_0x02ce:
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
        L_0x02d1:
            java.lang.Integer r3 = r4.A02()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r27 = 0
            if (r0 != r3) goto L_0x0041
            r27 = 1
            X.206 r0 = r5.A0Q
            X.22A r0 = X.C63892tr.A02(r0)
            if (r0 == 0) goto L_0x02ea
            X.206 r0 = r5.A0Q
            X.C63892tr.A02(r0)
        L_0x02ea:
            X.206 r0 = r5.A0Q
            X.22A r0 = X.C63892tr.A02(r0)
            if (r0 == 0) goto L_0x030b
            X.1M9 r1 = r5.A0A
            com.whatsapp.jid.UserJid r0 = r0.A0I()
            X.1E7 r14 = r1.A0H(r0)
            X.206 r0 = r5.A0Q
            boolean r0 = X.C22971Dz.A0f(r0)
            int r1 = X.C72453Mb.A04(r0)
            X.1Me r0 = r5.A0C
            r0.A0U(r14, r1, r9)
        L_0x030b:
            X.118 r0 = r5.A0J
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131891556(0x7f121564, float:1.9417835E38)
            java.lang.String r0 = r1.getString(r0)
            r8.setText(r0)
            android.content.Context r8 = r6.getContext()
            r0 = 2131231723(0x7f0803eb, float:1.8079535E38)
            r1 = 2131101222(0x7f060626, float:1.7814848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r8, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r8, r0, r1)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
            goto L_0x0041
        L_0x0332:
            boolean r0 = X.AnonymousClass25A.A0I(r0)
            r1 = 2131892088(0x7f121778, float:1.9418914E38)
            if (r0 == 0) goto L_0x02ae
            r1 = 2131892089(0x7f121779, float:1.9418916E38)
            goto L_0x02ae
        L_0x0340:
            android.content.Context r14 = r6.getContext()
            X.206 r1 = r5.A0Q
            int r0 = r1.A0u
            boolean r0 = X.AnonymousClass25A.A0I(r0)
            if (r0 == 0) goto L_0x0360
            r0 = 2131892065(0x7f121761, float:1.9418868E38)
            r3 = 2131232657(0x7f080791, float:1.808143E38)
            r1 = 2131102856(0x7f060c88, float:1.7818162E38)
        L_0x0357:
            r8.setText(r0)
            android.content.Context r14 = r6.getContext()
            goto L_0x02c6
        L_0x0360:
            boolean r0 = r1 instanceof X.C440922c
            r3 = 2131232097(0x7f080561, float:1.8080294E38)
            if (r0 == 0) goto L_0x036a
            r3 = 2131232405(0x7f080695, float:1.8080918E38)
        L_0x036a:
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131101887(0x7f0608bf, float:1.7816196E38)
            int r1 = X.AnonymousClass1YL.A00(r14, r1, r0)
            r0 = 2131892071(0x7f121767, float:1.941888E38)
            goto L_0x0357
        L_0x0378:
            r0 = 2131892055(0x7f121757, float:1.9418847E38)
            r8.setText(r0)
            android.content.Context r3 = r6.getContext()
            r0 = 2131232656(0x7f080790, float:1.8081427E38)
            r1 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r3, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r3, r0, r1)
            goto L_0x02ce
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73063Ov.A00(android.view.View, int):void");
    }

    public static void A01(View view, C73063Ov r17, int i, boolean z) {
        int i2;
        int width;
        AlphaAnimation alphaAnimation;
        int width2;
        int width3;
        C73063Ov r3 = r17;
        MessageDetailsActivity messageDetailsActivity = r3.A02;
        int i3 = i;
        C87034Ua r2 = (C87034Ua) messageDetailsActivity.A0b.get(i3);
        View view2 = view;
        View findViewById = view2.findViewById(2131429799);
        View findViewById2 = view2.findViewById(2131429808);
        View findViewById3 = view2.findViewById(2131429805);
        View A06 = AnonymousClass1HF.A06(view2, 2131429801);
        TextView A0J = AnonymousClass3MW.A0J(view2, 2131429810);
        TextView A0J2 = AnonymousClass3MW.A0J(view2, 2131429807);
        View findViewById4 = view2.findViewById(2131429800);
        View findViewById5 = view2.findViewById(2131429809);
        View findViewById6 = view2.findViewById(2131429806);
        int i4 = messageDetailsActivity.A0Q.A0u;
        if (i4 == 0) {
            i2 = 2131892083;
        } else {
            i2 = 2131892087;
            if (AnonymousClass25A.A0I(i4)) {
                i2 = 2131892091;
            }
        }
        A0J.setText(i2);
        Context context = view2.getContext();
        int i5 = 2131892064;
        if (!AnonymousClass25A.A0I(messageDetailsActivity.A0Q.A0u)) {
            AnonymousClass1YL.A00(context, 2130970568, 2131101887);
            i5 = 2131892070;
        }
        A0J2.setText(i5);
        ArrayList A0z = C17880vN.A0z(6);
        int A002 = r2.A00();
        if (A002 == 5) {
            A0z.add(A06);
            if (AnonymousClass3MY.A1b(messageDetailsActivity.A00)) {
                if (z) {
                    width = findViewById.getWidth() - findViewById4.getWidth();
                } else {
                    width = A06.getWidth();
                }
                TranslateAnimation translateAnimation = new TranslateAnimation((float) width, 0.0f, 0.0f, 0.0f);
                C72463Mc.A17(translateAnimation, (long) r3.A01);
                findViewById.startAnimation(translateAnimation);
            }
        } else if (A002 == 8) {
            A0z.add(A0J2);
            A0z.add(findViewById5);
            A0z.add(A0J);
            A0z.add(findViewById4);
            A0z.add(A06);
            if (AnonymousClass3MY.A1b(messageDetailsActivity.A00)) {
                if (z) {
                    width2 = findViewById3.getWidth() - findViewById6.getWidth();
                } else {
                    width2 = A0J2.getWidth();
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation((float) width2, 0.0f, 0.0f, 0.0f);
                C72463Mc.A17(translateAnimation2, (long) r3.A01);
                findViewById3.startAnimation(translateAnimation2);
            }
        } else if (A002 == 13) {
            A0z.add(A0J);
            A0z.add(findViewById4);
            A0z.add(A06);
            if (AnonymousClass3MY.A1b(messageDetailsActivity.A00)) {
                if (z) {
                    width3 = findViewById2.getWidth() - findViewById5.getWidth();
                } else {
                    width3 = A0J.getWidth();
                }
                TranslateAnimation translateAnimation3 = new TranslateAnimation((float) width3, 0.0f, 0.0f, 0.0f);
                C72463Mc.A17(translateAnimation3, (long) r3.A01);
                findViewById2.startAnimation(translateAnimation3);
            }
        }
        Iterator it = A0z.iterator();
        while (it.hasNext()) {
            View A0E = AnonymousClass3MX.A0E(it);
            if (!z) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            int i6 = r3.A01;
            alphaAnimation.setDuration((long) i6);
            alphaAnimation.setStartOffset((long) (((float) i6) * 0.0f));
            A0E.startAnimation(alphaAnimation);
        }
        View findViewById7 = view2.findViewById(2131436205);
        int height = findViewById7.getHeight();
        r3.A00(view2, i3);
        C72473Md.A12(findViewById7, findViewById7.getWidth(), 1073741824);
        int measuredHeight = findViewById7.getMeasuredHeight();
        AnonymousClass3MX.A1F(findViewById7, height);
        AnonymousClass3OZ r22 = new AnonymousClass3OZ(findViewById7, r3, height, measuredHeight);
        r22.setDuration((long) r3.A01);
        findViewById7.startAnimation(r22);
    }

    public int getCount() {
        return this.A02.A0b.size();
    }

    public Object getItem(int i) {
        return this.A02.A0b.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AnonymousClass3MX.A09(this.A02.getLayoutInflater(), viewGroup, 2131626038);
        }
        A00(view, i);
        return view;
    }
}
