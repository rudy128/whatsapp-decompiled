package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3u7  reason: invalid class name */
public abstract class AnonymousClass3u7 extends C79003u8 {
    public int A00;
    public AnonymousClass4Xe A01;
    public C57662jR A02;
    public AnonymousClass192 A03;
    public C32861hs A04;
    public C32431hB A05;
    public C139246yW A06;
    public C136906ub A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass4MO A0A;
    public final C28931bI A0B;
    public final ArrayList A0C;
    public final TextView A0D;
    public final AnonymousClass4MP A0E;
    public final ConversationRowImageAndVideoAlbumGridFrame A0F;
    public final C38471rL A0G = new C825048f(this, 4);
    public final C38471rL A0H = new C825048f(this, 5);
    public final C38471rL A0I = new C825048f(this, 6);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3u7(android.content.Context r27, X.C108875cR r28, X.AnonymousClass206 r29) {
        /*
            r26 = this;
            r12 = 1
            r11 = 2
            r10 = r26
            r2 = r27
            r0 = r28
            r13 = r29
            r10.<init>(r2, r0, r13)
            r10.A1M()
            r10.A1M()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            r10.A0C = r9
            X.4MO r0 = new X.4MO
            r0.<init>(r2, r10)
            r10.A0A = r0
            r8 = 4
            X.48f r0 = new X.48f
            r0.<init>(r10, r8)
            r10.A0G = r0
            r1 = 6
            X.48f r0 = new X.48f
            r0.<init>(r10, r1)
            r10.A0I = r0
            r1 = 5
            X.48f r0 = new X.48f
            r0.<init>(r10, r1)
            r10.A0H = r0
            X.4MP r0 = new X.4MP
            r0.<init>(r2, r10)
            r10.A0E = r0
            r0 = 2131432397(0x7f0b13cd, float:1.848655E38)
            android.view.View r0 = X.C18070vi.A05(r10, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame r0 = (com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame) r0
            r10.A0F = r0
            r0 = 2131432784(0x7f0b1550, float:1.8487335E38)
            android.widget.TextView r0 = X.C72453Mb.A0W(r10, r0)
            r10.A0D = r0
            boolean r0 = X.C79103uS.A1I(r10)
            r2 = 3
            int r7 = X.C72453Mb.A05(r0)
            r3 = 0
            r6 = 0
        L_0x005e:
            X.5bZ r1 = r10.A09
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            android.graphics.drawable.Drawable r1 = r1.BS0(r0, r7, r3)
            if (r6 == 0) goto L_0x00da
            if (r6 == r12) goto L_0x00d6
            if (r6 == r11) goto L_0x00d2
            if (r6 != r2) goto L_0x00de
            r0 = 2131436128(0x7f0b2260, float:1.8494118E38)
        L_0x0071:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00de
            int r0 = r0.intValue()
            android.view.View r5 = X.C18070vi.A05(r10, r0)
            com.whatsapp.WaFrameLayout r5 = (com.whatsapp.WaFrameLayout) r5
            r5.setForeground(r1)
            X.11P r0 = r10.A0u
            r16 = r0
            X.C18070vi.A0W(r16)
            X.0ve r15 = r10.A0F
            X.C18070vi.A0W(r15)
            X.00H r0 = r10.A2W
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.6yx r4 = (X.C139506yx) r4
            X.6ub r21 = r10.getImageQuality()
            X.0vb r14 = r10.A0D
            X.C18070vi.A0W(r14)
            X.1gV r3 = r10.A1S
            X.C18070vi.A0W(r3)
            android.view.View$OnLongClickListener r2 = r10.A2t
            X.C18070vi.A0W(r2)
            X.4MP r1 = r10.A0E
            boolean r25 = r10.A2m()
            X.4Xb r0 = new X.4Xb
            r23 = r3
            r24 = r6
            r22 = r4
            r20 = r15
            r19 = r14
            r18 = r16
            r17 = r1
            r16 = r5
            r15 = r2
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.add(r0)
            int r6 = r6 + 1
            r2 = 3
            r3 = 0
            if (r6 >= r8) goto L_0x00de
            goto L_0x005e
        L_0x00d2:
            r0 = 2131436127(0x7f0b225f, float:1.8494116E38)
            goto L_0x0071
        L_0x00d6:
            r0 = 2131436126(0x7f0b225e, float:1.8494114E38)
            goto L_0x0071
        L_0x00da:
            r0 = 2131436125(0x7f0b225d, float:1.8494112E38)
            goto L_0x0071
        L_0x00de:
            java.util.ArrayList r0 = r10.A0C
            int r0 = r0.size()
            if (r8 != r0) goto L_0x00e7
            r3 = 1
        L_0x00e7:
            java.lang.String r0 = "wrong number of views"
            X.C17960vV.A0F(r3, r0)
            r0 = 2131432383(0x7f0b13bf, float:1.8486522E38)
            X.1bI r1 = X.C28931bI.A00(r10, r0)
            r10.A0B = r1
            X.4ql r0 = new X.4ql
            r0.<init>(r10, r13, r2)
            r1.A07(r0)
            r10.A2l(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u7.<init>(android.content.Context, X.5cR, X.206):void");
    }

    public static final void A01(AnonymousClass3u7 r6) {
        C57662jR albumMediaDownloadHelper = r6.getAlbumMediaDownloadHelper();
        List albumMessages = r6.getAlbumMessages();
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : albumMessages) {
            AnonymousClass3MZ.A1V(next, A13, r6.A02((AnonymousClass21V) next) ? 1 : 0);
        }
        albumMediaDownloadHelper.A00(AnonymousClass3MY.A04(r6), A13, true);
    }

    public void A1T(AnonymousClass205 r6) {
        C18070vi.A0d(r6, 0);
        super.A1T(r6);
        ArrayList A0k = C29431cG.A0k(getRevokedAlbumMessages(), getAlbumMessages());
        if (C17880vN.A1X(A0k)) {
            Iterator it = A0k.iterator();
            int i = 0;
            while (it.hasNext() && !r6.equals(AnonymousClass3MZ.A10(it))) {
                i++;
            }
            getConversationRowAlbumUtils();
            Context A042 = AnonymousClass3MY.A04(this);
            AnonymousClass206 fMessage = getFMessage();
            C18070vi.A0X(fMessage);
            Intent A002 = AnonymousClass4Xe.A00(A042, fMessage, A0k);
            if (A002 != null) {
                if (AnonymousClass745.A00) {
                    A002.putExtra("start_index", i);
                }
                A042.startActivity(A002);
            }
        }
    }

    public void A1u() {
        A2l(false);
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2k(List list, boolean z) {
        boolean z2 = !AnonymousClass3Ma.A1a(getFMessage(), list, 0);
        List albumMessages = getAlbumMessages();
        if (!z) {
            if (!albumMessages.isEmpty() && albumMessages.size() == list.size()) {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (!AnonymousClass3Ma.A1a(albumMessages.get(i), list, i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        setAlbumMessages(list);
        super.A2V(AnonymousClass3MW.A0k(list, 0), z);
        if (z2 || z) {
            A2l(z2);
        }
    }

    public boolean A2m() {
        return false;
    }

    public abstract List getAlbumMessages();

    public int getMaxAlbumSize() {
        return 102;
    }

    public int getMinAlbumSize() {
        return 4;
    }

    public abstract List getRevokedAlbumMessages();

    public final void setAlbumMediaDownloadHelper(C57662jR r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public abstract void setAlbumMessages(List list);

    public final void setConversationRowAlbumUtils(AnonymousClass4Xe r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCrashLogsImpl(AnonymousClass192 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setImageQuality(C136906ub r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setMediaDownloadManager(C32431hB r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setMediaFileFindManager(C139246yW r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setSendMediaMessageManager(C32861hs r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r16 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if ((r11 instanceof X.C440021t) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (X.C63652tT.A00(r10.A0D, r10.A0F, r11) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0258, code lost:
        if (r0 != false) goto L_0x025a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2l(boolean r29) {
        /*
            r28 = this;
            r17 = 0
            r5 = r28
            if (r29 == 0) goto L_0x0019
            X.1bI r1 = r5.A0B
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = r1.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A02
            r0 = r17
            r1.setTag(r0)
        L_0x0019:
            java.util.List r4 = r5.getAlbumMessages()
            int r3 = r4.size()
            java.util.ArrayList r0 = r5.A0C
            r27 = r0
            int r0 = r27.size()
            r6 = 1
            r2 = 0
            r16 = 0
            if (r3 <= r0) goto L_0x0031
            r16 = 1
        L_0x0031:
            r12 = 0
        L_0x0032:
            r10 = 4
            r8 = 3
            if (r12 >= r10) goto L_0x0282
            if (r12 >= r3) goto L_0x027e
            java.lang.Object r11 = r4.get(r12)
            X.21V r11 = (X.AnonymousClass21V) r11
        L_0x003e:
            r0 = r27
            java.lang.Object r10 = r0.get(r12)
            X.4Xb r10 = (X.C87804Xb) r10
            if (r12 != r8) goto L_0x004b
            r7 = 1
            if (r16 != 0) goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            r9 = 8
            android.view.View r0 = r10.A05
            if (r11 != 0) goto L_0x005e
            r0.setVisibility(r9)
            android.widget.ImageView r1 = r10.A07
            r0 = 0
            r1.setImageBitmap(r0)
        L_0x005b:
            int r12 = r12 + 1
            goto L_0x0032
        L_0x005e:
            r0.setVisibility(r2)
            X.2rc r0 = r11.A02
            boolean r1 = r11 instanceof X.AnonymousClass21Y
            if (r1 != 0) goto L_0x006c
            boolean r1 = r11 instanceof X.C440021t
            r15 = 0
            if (r1 == 0) goto L_0x006d
        L_0x006c:
            r15 = 1
        L_0x006d:
            boolean r1 = r11 instanceof X.C438421d
            if (r7 != 0) goto L_0x0092
            if (r0 == 0) goto L_0x0092
            if (r1 == 0) goto L_0x0086
            X.6ub r14 = r10.A0E
            int r13 = r0.A08
            int r7 = r0.A06
            X.6r5 r0 = new X.6r5
            r0.<init>(r13, r7)
            boolean r0 = r14.A02(r0, r2)
            if (r0 == 0) goto L_0x0092
        L_0x0086:
            if (r15 == 0) goto L_0x023a
            X.6yx r7 = r10.A0F
            X.0ve r0 = r10.A0D
            boolean r0 = X.C63652tT.A00(r0, r7, r11)
            if (r0 != 0) goto L_0x023a
        L_0x0092:
            int r1 = r11.A0C()
            r0 = 1
            if (r6 == r1) goto L_0x009a
            r0 = 0
        L_0x009a:
            r14 = 2
            r7 = 4
            if (r0 == 0) goto L_0x00dc
            android.widget.ImageView r0 = r10.A00
            if (r0 != 0) goto L_0x00dc
            android.content.Context r0 = r10.A04
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r0)
            r10.A00 = r1
            r15 = 2131891555(0x7f121563, float:1.9417833E38)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168790(0x7f070e16, float:1.7951892E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C87804Xb.A00(r13, r10, r15, r0)
            android.view.ViewGroup r1 = r10.A06
            android.view.View[] r0 = new android.view.View[r7]
            android.widget.ImageView r15 = r10.A02
            r0[r2] = r15
            r0[r6] = r13
            android.widget.ImageView r15 = r10.A01
            r0[r14] = r15
            r15 = 0
            r0[r8] = r15
            int r0 = X.C87424Vn.A00(r0, r6)
            r1.addView(r13, r0)
            r1.setClipChildren(r2)
        L_0x00dc:
            android.widget.ImageView r13 = r10.A00
            int r0 = r11.A0C()
            if (r6 != r0) goto L_0x0233
            if (r13 == 0) goto L_0x00f5
            android.content.Context r0 = r10.A04
            X.C18070vi.A0W(r0)
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r6, r6)
            r13.setImageDrawable(r0)
            r13.setVisibility(r2)
        L_0x00f5:
            boolean r0 = r11.A0q
            if (r0 == 0) goto L_0x0130
            android.widget.ImageView r0 = r10.A02
            if (r0 != 0) goto L_0x0130
            android.content.Context r0 = r10.A04
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r0)
            r10.A02 = r1
            android.content.res.Resources r15 = r0.getResources()
            r0 = 2131168790(0x7f070e16, float:1.7951892E38)
            int r15 = r15.getDimensionPixelSize(r0)
            r0 = 2131896285(0x7f1227dd, float:1.9427427E38)
            X.C87804Xb.A00(r1, r10, r0, r15)
            android.view.ViewGroup r15 = r10.A06
            android.view.View[] r0 = new android.view.View[r7]
            r0[r2] = r1
            r0[r6] = r13
            android.widget.ImageView r13 = r10.A01
            r0[r14] = r13
            r13 = 0
            r0[r8] = r13
            int r0 = X.C87424Vn.A00(r0, r2)
            r15.addView(r1, r0)
            r15.setClipChildren(r2)
        L_0x0130:
            android.widget.ImageView r1 = r10.A02
            boolean r0 = r11.A0q
            if (r0 == 0) goto L_0x022c
            if (r1 == 0) goto L_0x0147
            android.content.Context r0 = r10.A04
            X.C18070vi.A0W(r0)
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r2, r6)
            r1.setImageDrawable(r0)
            r1.setVisibility(r2)
        L_0x0147:
            android.widget.ImageView r13 = r10.A01
            int r0 = X.C63892tr.A00(r11)
            if (r0 != r6) goto L_0x0225
            if (r13 != 0) goto L_0x0158
            android.content.Context r0 = r10.A04
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
        L_0x0158:
            android.widget.ImageView r0 = r10.A01
            if (r0 != 0) goto L_0x018c
            r10.A01 = r13
            r15 = 2131894560(0x7f122120, float:1.9423928E38)
            android.content.Context r0 = r10.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168790(0x7f070e16, float:1.7951892E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C87804Xb.A00(r13, r10, r15, r0)
            android.view.ViewGroup r1 = r10.A06
            android.view.View[] r0 = new android.view.View[r7]
            android.widget.ImageView r15 = r10.A02
            r0[r2] = r15
            android.widget.ImageView r15 = r10.A00
            r0[r6] = r15
            r0[r14] = r13
            r15 = 0
            r0[r8] = r15
            int r0 = X.C87424Vn.A00(r0, r14)
            r1.addView(r13, r0)
            r1.setClipChildren(r2)
        L_0x018c:
            android.content.Context r0 = r10.A04
            X.C18070vi.A0W(r0)
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r14, r6)
            r13.setImageDrawable(r0)
            r13.setVisibility(r2)
        L_0x019b:
            X.4MP r0 = r10.A0A
            X.3u7 r8 = r0.A01
            r1 = 2131427740(0x7f0b019c, float:1.8477105E38)
            r0 = 2131231130(0x7f08019a, float:1.8078332E38)
            r8.A2U(r11, r1, r0)
            X.1gV r13 = r10.A0H
            android.widget.ImageView r8 = r10.A07
            X.3M2 r1 = r10.A0G
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()
            java.lang.String r0 = "album-"
            r14.append(r0)
            X.205 r0 = r11.A0v
            java.lang.String r22 = X.C17890vO.A0V(r0, r14)
            r23 = 100
            r25 = r2
            r19 = r8
            r20 = r11
            r21 = r1
            r24 = r2
            r26 = r6
            r18 = r13
            r18.A0F(r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01f4
            android.widget.ImageView r13 = r10.A08
            if (r13 == 0) goto L_0x01f4
            int r1 = r11.A0D()
            r0 = 13
            boolean r14 = X.C446824j.A02(r1, r0)
            r0 = 2131232628(0x7f080774, float:1.808137E38)
            if (r14 != 0) goto L_0x01f1
            r0 = 5
            boolean r0 = X.C446824j.A02(r1, r0)
            if (r0 == 0) goto L_0x021c
            r0 = 2131232632(0x7f080778, float:1.8081379E38)
        L_0x01f1:
            r13.setImageResource(r0)
        L_0x01f4:
            java.lang.String r0 = X.AnonymousClass4W0.A01(r11)
            X.AnonymousClass1Xr.A04(r8, r0)
            boolean r0 = r10.A0J
            if (r0 != 0) goto L_0x0270
            android.widget.TextView r7 = r10.A09
            X.0vb r1 = r10.A0C
            X.11P r0 = r10.A0B
            X.C72473Md.A15(r7, r0, r1, r11)
            java.lang.String r0 = X.AnonymousClass4W0.A00(r11)
            X.AnonymousClass1Xr.A04(r7, r0)
            android.widget.ImageView r1 = r10.A08
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = X.AnonymousClass3uL.A0O(r11)
            X.AnonymousClass1Xr.A04(r1, r0)
            goto L_0x005b
        L_0x021c:
            r0 = 2131232641(0x7f080781, float:1.8081397E38)
            if (r1 != r7) goto L_0x01f1
            r0 = 2131232630(0x7f080776, float:1.8081375E38)
            goto L_0x01f1
        L_0x0225:
            if (r13 == 0) goto L_0x019b
            r13.setVisibility(r9)
            goto L_0x019b
        L_0x022c:
            if (r1 == 0) goto L_0x0147
            r1.setVisibility(r9)
            goto L_0x0147
        L_0x0233:
            if (r13 == 0) goto L_0x00f5
            r13.setVisibility(r9)
            goto L_0x00f5
        L_0x023a:
            boolean r0 = X.AnonymousClass25A.A12(r11)
            if (r0 == 0) goto L_0x0092
            X.1bI r13 = r10.A0I
            if (r13 == 0) goto L_0x0092
            if (r1 == 0) goto L_0x025a
            X.205 r0 = r11.A0v
            boolean r1 = r0.A02
            X.6ub r0 = r10.A0E
            if (r1 == 0) goto L_0x026b
            X.0ve r7 = r0.A02
            r1 = 2653(0xa5d, float:3.718E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
        L_0x0258:
            if (r0 == 0) goto L_0x0092
        L_0x025a:
            X.0ve r7 = r10.A0D
            r1 = 4048(0xfd0, float:5.672E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x0092
            r13.A04(r2)
            goto L_0x0092
        L_0x026b:
            boolean r0 = r0.A04(r2)
            goto L_0x0258
        L_0x0270:
            android.widget.TextView r0 = r10.A09
            r0.setVisibility(r9)
            android.widget.ImageView r0 = r10.A08
            if (r0 == 0) goto L_0x005b
            r0.setVisibility(r9)
            goto L_0x005b
        L_0x027e:
            r11 = r17
            goto L_0x003e
        L_0x0282:
            if (r3 < r10) goto L_0x04e7
            X.4DD r1 = X.AnonymousClass4DD.FOUR_ITEMS
        L_0x0286:
            com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame r0 = r5.A0F
            r0.setAlbumGridLayout(r1)
            boolean r15 = r5.A2m()
            r0 = r27
            java.lang.Object r1 = r0.get(r8)
            X.C18070vi.A0X(r1)
            X.4Xb r1 = (X.C87804Xb) r1
            r9 = 8
            android.widget.TextView r13 = r5.A0D
            if (r16 == 0) goto L_0x04c5
            android.content.Context r12 = X.AnonymousClass3MX.A04(r13, r5, r2)
            r11 = 2131894632(0x7f122168, float:1.9424074E38)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r14 = r4.size()
            int r0 = r27.size()
            int r14 = r14 - r0
            int r0 = r14 + 1
            X.C17880vN.A1T(r7, r0, r2)
            X.AnonymousClass3MY.A0y(r12, r13, r7, r11)
            if (r15 != 0) goto L_0x02c8
            android.widget.TextView r0 = r1.A09
            r0.setVisibility(r9)
            android.widget.ImageView r0 = r1.A08
            if (r0 == 0) goto L_0x02c8
            r0.setVisibility(r9)
        L_0x02c8:
            int r13 = X.AnonymousClass3MX.A02(r4, r10)
            android.widget.ImageView r12 = r1.A07
            r0 = 2131886436(0x7f120164, float:1.940745E38)
            X.AnonymousClass1Y5.A02(r12, r0)
            X.0vb r11 = r5.A0D
            r10 = 2131755299(0x7f100123, float:1.9141473E38)
            long r0 = (long) r13
            java.lang.Object[] r7 = new java.lang.Object[r6]
            X.C17880vN.A1T(r7, r13, r2)
            java.lang.String r0 = r11.A0K(r7, r10, r0)
            r12.setContentDescription(r0)
        L_0x02e6:
            java.util.List r0 = r5.getAlbumMessages()
            java.util.Iterator r1 = r0.iterator()
        L_0x02ee:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0347
            X.21V r0 = X.C17880vN.A0b(r1)
            X.2rc r0 = X.AnonymousClass3Ma.A0M(r0)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x02ee
            X.1bI r7 = r5.A0B
            r7.A04(r2)
            r1 = r29 ^ 1
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass3uL.A0R(r0, r6, r1)
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.1bI r0 = r0.A04
            X.1rL r1 = r5.A0G
            r0.A05(r1)
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.view.View r0 = r0.A00
            r0.setOnClickListener(r1)
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.1bI r0 = r0.A05
            r0.A05(r1)
        L_0x0333:
            r5.A1y()
            if (r3 <= 0) goto L_0x0346
            X.206 r0 = X.AnonymousClass3MW.A0k(r4, r2)
            r5.A2P(r0)
            X.206 r0 = X.AnonymousClass3MW.A0k(r4, r2)
            r5.A2N(r0)
        L_0x0346:
            return
        L_0x0347:
            java.util.List r0 = r5.getAlbumMessages()
            java.util.Iterator r7 = r0.iterator()
        L_0x034f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x037a
            X.21V r0 = X.C17880vN.A0b(r7)
            X.2rc r1 = X.AnonymousClass3Ma.A0M(r0)
            boolean r0 = r5.A02(r0)
            if (r0 != 0) goto L_0x034f
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x034f
            r0 = 0
        L_0x0368:
            X.1bI r7 = r5.A0B
            if (r0 == 0) goto L_0x037c
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L_0x0333
            android.view.View r0 = X.AnonymousClass3MY.A0I(r7, r9)
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass3uL.A0R(r0, r2, r2)
            goto L_0x0333
        L_0x037a:
            r0 = 1
            goto L_0x0368
        L_0x037c:
            r7.A04(r2)
            r1 = r29 ^ 1
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.AnonymousClass3uL.A0R(r0, r2, r1)
            java.util.Iterator r12 = r4.iterator()
            r11 = 0
            r10 = 0
        L_0x0390:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03b1
            X.21V r9 = X.C17880vN.A0b(r12)
            X.2rc r1 = X.AnonymousClass3Ma.A0M(r9)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0390
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0390
            boolean r0 = X.AnonymousClass4H3.A00(r9)
            if (r0 == 0) goto L_0x03ae
            int r10 = r10 + 1
        L_0x03ae:
            int r11 = r11 + 1
            goto L_0x0390
        L_0x03b1:
            if (r11 == r10) goto L_0x03f1
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r9 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r9 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r9
            android.content.Context r1 = r5.getContext()
            r0 = 2131895332(0x7f122424, float:1.9425494E38)
            java.lang.String r8 = X.C18070vi.A0F(r1, r0)
            X.1rL r7 = r5.A0I
            r6 = 2131232381(0x7f08067d, float:1.808087E38)
            r0 = 3
            X.C18070vi.A0d(r7, r0)
            android.widget.TextView r1 = r9.A02
            r1.setText(r8)
            r0 = 2132083177(0x7f1501e9, float:1.9806489E38)
            X.C29261bv.A08(r1, r0)
            android.widget.ImageView r0 = r9.A01
            r0.setImageResource(r6)
            android.view.View r0 = r9.A00
            r0.setOnClickListener(r7)
            goto L_0x0333
        L_0x03f1:
            r5.A00 = r2
            r5.A09 = r2
            r5.A08 = r2
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r4.iterator()
            r14 = 0
        L_0x0401:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x043e
            X.21V r10 = X.C17880vN.A0b(r11)
            X.2rc r1 = X.AnonymousClass3Ma.A0M(r10)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0401
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0401
            boolean r0 = r5.A02(r10)
            if (r0 != 0) goto L_0x0401
            r9.add(r10)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            long r0 = r10.A01
            long r14 = r14 + r0
            boolean r1 = r5.A08
            int r10 = r10.A0u
            boolean r0 = X.AnonymousClass000.A1T(r10, r6)
            r1 = r1 | r0
            r5.A08 = r1
            boolean r1 = r5.A09
            boolean r0 = X.AnonymousClass000.A1T(r10, r8)
            r0 = r0 | r1
            r5.A09 = r0
            goto L_0x0401
        L_0x043e:
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r0.setTag(r9)
            android.view.View r11 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r11 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r11
            X.1rL r10 = r5.A0H
            java.lang.String r8 = ""
            r6 = 2131231867(0x7f08047b, float:1.8079827E38)
            r0 = 3
            X.C18070vi.A0d(r10, r0)
            android.widget.TextView r1 = r11.A02
            r1.setText(r8)
            r0 = 2132083176(0x7f1501e8, float:1.9806487E38)
            X.C29261bv.A08(r1, r0)
            android.widget.ImageView r0 = r11.A01
            r0.setImageResource(r6)
            android.view.View r0 = r11.A00
            r0.setOnClickListener(r10)
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r12 = 0
            r10 = r5
            r11 = r0
            r13 = r9
            r10.A2E(r11, r12, r13, r14)
            int r10 = r5.A00
            if (r10 != 0) goto L_0x0491
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0333
        L_0x0491:
            boolean r0 = r5.A08
            r6 = 1
            if (r0 != 0) goto L_0x04b8
            X.0vb r9 = r5.A0D
            r8 = 2131755302(0x7f100126, float:1.914148E38)
        L_0x049b:
            long r0 = (long) r10
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.C17880vN.A1T(r6, r10, r2)
            java.lang.String r1 = r9.A0K(r6, r8, r0)
            X.C18070vi.A0X(r1)
            android.view.View r0 = r7.A02()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A03
            r0.setText(r1)
            r0.setVisibility(r2)
            goto L_0x0333
        L_0x04b8:
            boolean r0 = r5.A09
            X.0vb r9 = r5.A0D
            r8 = 2131755295(0x7f10011f, float:1.9141465E38)
            if (r0 != 0) goto L_0x049b
            r8 = 2131755299(0x7f100123, float:1.9141473E38)
            goto L_0x049b
        L_0x04c5:
            r13.setVisibility(r9)
            if (r15 != 0) goto L_0x04d6
            android.widget.TextView r0 = r1.A09
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.A08
            if (r0 == 0) goto L_0x04d6
            r0.setVisibility(r2)
        L_0x04d6:
            android.widget.ImageView r7 = r1.A07
            android.content.Context r1 = r5.getContext()
            r0 = 2131886435(0x7f120163, float:1.9407449E38)
            X.AnonymousClass3MY.A0w(r1, r7, r0)
            X.AnonymousClass1Y5.A01(r7)
            goto L_0x02e6
        L_0x04e7:
            if (r3 != r8) goto L_0x050d
            java.lang.Object r0 = r4.get(r2)
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0509
            int r9 = r0.A08
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            int r1 = r0.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r7 == 0) goto L_0x0509
            if (r0 == 0) goto L_0x0509
            if (r9 <= r1) goto L_0x0509
            X.4DD r1 = X.AnonymousClass4DD.THREE_ITEMS_FIRST_LANDSCAPE
            goto L_0x0286
        L_0x0509:
            X.4DD r1 = X.AnonymousClass4DD.THREE_ITEMS_FIRST_PORTRAIT
            goto L_0x0286
        L_0x050d:
            r0 = 2
            if (r3 != r0) goto L_0x0534
            java.lang.Object r0 = r4.get(r2)
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0530
            int r9 = r0.A08
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            int r1 = r0.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r7 == 0) goto L_0x0530
            if (r0 == 0) goto L_0x0530
            if (r9 <= r1) goto L_0x0530
            X.4DD r1 = X.AnonymousClass4DD.TWO_ITEMS_LANDSCAPE
            goto L_0x0286
        L_0x0530:
            X.4DD r1 = X.AnonymousClass4DD.TWO_ITEMS_PORTRAIT
            goto L_0x0286
        L_0x0534:
            X.4DD r1 = X.AnonymousClass4DD.ONE_ITEM
            goto L_0x0286
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u7.A2l(boolean):void");
    }

    public final C57662jR getAlbumMediaDownloadHelper() {
        C57662jR r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("albumMediaDownloadHelper");
        throw null;
    }

    public final AnonymousClass4Xe getConversationRowAlbumUtils() {
        AnonymousClass4Xe r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationRowAlbumUtils");
        throw null;
    }

    public final AnonymousClass192 getCrashLogsImpl() {
        AnonymousClass192 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("crashLogsImpl");
        throw null;
    }

    public final C136906ub getImageQuality() {
        C136906ub r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imageQuality");
        throw null;
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return C88264Yz.A01(getContext(), 72);
    }

    public final C32431hB getMediaDownloadManager() {
        C32431hB r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaDownloadManager");
        throw null;
    }

    public final C139246yW getMediaFileFindManager() {
        C139246yW r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaFileFindManager");
        throw null;
    }

    public AnonymousClass8BG getMessageReactions() {
        AnonymousClass206 A0k;
        C29681ch r11;
        long j;
        boolean z;
        boolean z2;
        getRowCustomizer();
        List parentAndChildMessages = getParentAndChildMessages();
        if (parentAndChildMessages.isEmpty()) {
            return null;
        }
        Iterator it = parentAndChildMessages.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            C63272sn r2 = this.A0c;
            if (r2.A03(A0Y, 56)) {
                r2.A02.execute(new C21470Akb(r2, A0Y));
            }
        }
        AnonymousClass4MZ r0 = C1409073n.A02;
        AnonymousClass11S r10 = this.A0U;
        C18070vi.A0W(r10);
        if (!AnonymousClass000.A1a(parentAndChildMessages) || (A0k = AnonymousClass3MW.A0k(parentAndChildMessages, 0)) == null || !A0k.A0w()) {
            AnonymousClass7CA r3 = new AnonymousClass7CA(r10, C18460wS.A00);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it2 = parentAndChildMessages.iterator();
            while (it2.hasNext()) {
                AnonymousClass8BG A012 = C63892tr.A01(C17880vN.A0Y(it2));
                if (A012 != null) {
                    A13.add(A012.BMv());
                }
            }
            Iterator it3 = C29351c6.A0F(A13).iterator();
            while (it3.hasNext()) {
                AnonymousClass212 r02 = (AnonymousClass212) it3.next();
                C18070vi.A0b(r02);
                r3.BBg(r02);
            }
            return r3;
        }
        AnonymousClass205 r1 = A0k.A0v;
        if (r1 != null) {
            AnonymousClass25J r03 = C29681ch.A03;
            AnonymousClass1BI r112 = r1.A00;
            if (!(r112 instanceof C29681ch) || (r11 = (C29681ch) r112) == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            }
            LinkedHashMap A132 = C17880vN.A13();
            Iterator it4 = parentAndChildMessages.iterator();
            while (it4.hasNext()) {
                AnonymousClass206 A0Y2 = C17880vN.A0Y(it4);
                if (C63892tr.A01(A0Y2) instanceof AnonymousClass7C9) {
                    AnonymousClass8BG A013 = C63892tr.A01(A0Y2);
                    C18070vi.A0z(A013, "null cannot be cast to non-null type com.whatsapp.newsletter.data.NewsletterMessageReactions");
                    Iterator BMh = ((AnonymousClass7C9) A013).BMh();
                    while (BMh.hasNext()) {
                        C115125tR r5 = (C115125tR) BMh.next();
                        String A022 = C1409073n.A02(r5.A02);
                        if (A022 != null) {
                            if (A132.containsKey(A022)) {
                                Object obj = A132.get(A022);
                                if (obj != null) {
                                    C115125tR r04 = (C115125tR) obj;
                                    j = r04.A00;
                                    z = r04.A01;
                                } else {
                                    throw AnonymousClass000.A0n("Required value was null.");
                                }
                            } else {
                                j = 0;
                                z = false;
                            }
                            long j2 = r5.A00 + j;
                            if (!z) {
                                z2 = false;
                                if (!r5.A01) {
                                    A132.put(A022, new C115125tR(r10, r11, A022, j2, A0Y2.A0x, z2));
                                }
                            }
                            z2 = true;
                            A132.put(A022, new C115125tR(r10, r11, A022, j2, A0Y2.A0x, z2));
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                    continue;
                }
            }
            return new AnonymousClass7C9(C29431cG.A0m(A132.values()));
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public final C32861hs getSendMediaMessageManager() {
        C32861hs r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sendMediaMessageManager");
        throw null;
    }

    private final boolean A02(AnonymousClass21V r5) {
        C62572rc A0M = AnonymousClass3Ma.A0M(r5);
        if (r5.A0u != 1 || !getImageQuality().A01(A0M, false)) {
            return false;
        }
        getImageQuality();
        if (A0M.A01()) {
            return true;
        }
        return false;
    }

    public static final void setAlbumMessages$lambda$5(List list, AnonymousClass3u7 r3, View view) {
        C18070vi.A0h(list, r3);
        if (!list.isEmpty()) {
            list.size();
            r3.getFMessage();
            C19880zA r1 = r3.A0O;
            if (r1.A07()) {
                r1.A03();
                throw AnonymousClass000.A0s("logEntryPointTap");
            }
            String A0F2 = C18070vi.A0F(r3.getContext(), 2131891797);
            ProgressDialog progressDialog = r3.A04;
            if (progressDialog == null) {
                progressDialog = new ProgressDialog(r3.getContext());
                r3.A04 = progressDialog;
            }
            progressDialog.setTitle(A0F2);
            r3.A04.show();
            C98814rl.A00(r3.A1X, C17880vN.A10(r3.getAlbumMessages()), r3, 15);
        }
    }

    public List getParentAndChildMessages() {
        return getAlbumMessages();
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(2131168780);
    }

    public int getTopAttributeTextAnchorId() {
        return 2131432381;
    }
}
