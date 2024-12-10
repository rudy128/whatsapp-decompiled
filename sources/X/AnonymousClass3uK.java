package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import java.io.File;
import java.util.Collections;

/* renamed from: X.3uK  reason: invalid class name */
public class AnonymousClass3uK extends C78703tO {
    public FrameLayout A00;
    public AnonymousClass4KP A01;
    public C218617r A02;
    public C24771Lp A03;
    public AnonymousClass173 A04 = ((AnonymousClass173) AnonymousClass12Q.A03(AnonymousClass173.class));
    public AnonymousClass4N9 A05;
    public AnonymousClass4VQ A06;
    public AnonymousClass1SK A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09 = C221618v.A00(AnonymousClass170.class);
    public AnonymousClass00H A0A = C221618v.A00(AnonymousClass171.class);
    public AnonymousClass00H A0B = C221618v.A00(AnonymousClass168.class);
    public AnonymousClass00H A0C;
    public boolean A0D;
    public final View A0E;
    public final FrameLayout A0F;
    public final FrameLayout A0G;
    public final ImageView A0H;
    public final TextView A0I = C17880vN.A0E(this, 2131429541);
    public final TextView A0J;
    public final WaFrameLayout A0K;
    public final ConversationRowVideo$RowVideoView A0L;
    public final C38471rL A0M = new C825048f(this, 21);
    public final C28931bI A0N;
    public final C28931bI A0O;
    public final boolean A0P;
    public final View A0Q;
    public final TextView A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass3M2 A0T = new C98114qb(this, 7);

    private void A0E(boolean z) {
        View view = this.A0E;
        C28931bI r4 = this.A0O;
        C28931bI r5 = this.A0N;
        TextView textView = this.A0I;
        AnonymousClass3uL.A0Q(view, textView, r4, r5, true, !z, true, true);
        view.setVisibility(0);
        if (!A0G(getFMessage())) {
            this.A0L.setVisibility(0);
        }
        FrameLayout frameLayout = this.A0F;
        frameLayout.setVisibility(0);
        this.A0J.setVisibility(8);
        A03();
        C38471rL r0 = this.A0C;
        textView.setOnClickListener(r0);
        r4.A05(r0);
        frameLayout.setOnClickListener(r0);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
        A2l(conversationRowVideo$RowVideoView, conversationRowVideo$RowVideoView.getContext().getString(2131897859));
        conversationRowVideo$RowVideoView.setImportantForAccessibility(1);
    }

    public void A1u() {
        A0F(false);
        AnonymousClass3uP.A0h(this, false);
    }

    public boolean A2r() {
        return true;
    }

    private void A03() {
        boolean A002 = ((C86304Rc) this.A1t.get()).A00();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
        if (A002) {
            conversationRowVideo$RowVideoView.setOnTouchListener((View.OnTouchListener) this.A0S.get());
        } else {
            conversationRowVideo$RowVideoView.setOnClickListener(this.A0F);
        }
    }

    public static void A0A(AnonymousClass3uK r18) {
        AnonymousClass4VQ r0;
        File file;
        AnonymousClass4VQ r02;
        AnonymousClass3uK r2 = r18;
        boolean CLq = r2.A0l.CLq();
        boolean z = true;
        int i = 1;
        if (CLq) {
            i = 3;
        }
        AnonymousClass21Y fMessage = r2.getFMessage();
        AnonymousClass205 r7 = fMessage.A0v;
        AnonymousClass1BI r6 = r7.A00;
        if (C22971Dz.A0V(r6)) {
            C18030ve r3 = r2.A0F;
            C18040vf r4 = C18040vf.A02;
            if (C18020vd.A05(r4, r3, 7170) || C18020vd.A05(r4, r2.A0F, 8890)) {
                i = 6;
            }
        }
        if (r2.getFMessage().A09 != 14) {
            z = false;
        }
        Context context = r2.getContext();
        AnonymousClass77F r5 = null;
        int i2 = -1;
        int i3 = -1;
        C17960vV.A07(r6);
        boolean A1W = AnonymousClass000.A1W(C88404Zo.A02(r2));
        if (r2.A0G(fMessage)) {
            AnonymousClass170 r32 = (AnonymousClass170) r2.A09.get();
            r32.A03 = false;
            AnonymousClass3uK r03 = r32.A01;
            if (!(r03 == null || (r02 = r03.A06) == null)) {
                r02.A01();
            }
            AnonymousClass4VQ r04 = r2.A06;
            if (!(r04 == null || r04.A0E.A00.A02() == 4)) {
                i3 = r2.A06.A0E.A05();
            }
        }
        A05(r2);
        if (z) {
            r5 = r2.getTempFMessageMediaInfo();
        }
        if (C20120A8f.A06(fMessage)) {
            i2 = C20120A8f.A02(fMessage).intValue();
        }
        Intent A002 = AnonymousClass6WZ.A00(context, r5, r6, r7, 0, 1, i2, 12, i3, i, false, z, A1W, CLq, false);
        if (!(!((AnonymousClass1c4) r2.A2B.get()).A0B() || (r0 = r2.A06) == null || r0.A0E.A00.A02() == 4)) {
            Bitmap A082 = r2.A06.A0E.A08();
            C62572rc r05 = r2.getFMessage().A02;
            if (r05 != null) {
                file = r05.A0G;
            } else {
                file = null;
            }
            if (!(A082 == null || file == null)) {
                C32071ga A052 = r2.A03.A05();
                Uri fromFile = Uri.fromFile(file);
                C18070vi.A0d(fromFile, 0);
                A052.A0F(AnonymousClass000.A0y("-video_autoplay_view", C17890vO.A0f(fromFile)), A082);
                r2.setThumbnail(new BitmapDrawable(r2.getResources(), A082));
            }
        }
        C18030ve r33 = r2.A0F;
        Context context2 = r2.getContext();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r2.A0L;
        AnonymousClass745.A09(context2, A002, conversationRowVideo$RowVideoView, r33);
        AnonymousClass745.A08(r2.getContext(), A002, conversationRowVideo$RowVideoView, new AnonymousClass4ZR(r2.getContext()), AnonymousClass4W0.A01(fMessage));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0F, 3182) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r14 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r14 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r10 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r10 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r13 = r0.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r13 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r11 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r11 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        A03();
        r12 = r0.A00;
        r12.setOnClickListener(r0.A0F);
        X.AnonymousClass3uP.A0W(r12, r0);
        r5 = r0.A09;
        r4 = r0.A0K;
        r4.setForeground(r5.BS0(X.AnonymousClass00R.A01, X.C72453Mb.A05(r6.A0v.A02 ? 1 : 0), r4.isPressed()));
        A0B(r0);
        r2 = r0.A01;
        r26 = X.C28931bI.A00(r0, 2131432878);
        r27 = X.C28931bI.A00(r0, 2131435547);
        r25 = getFMessage();
        r7 = r0.A0L;
        r1 = r0.A0k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r1 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r15 = r1.getLifecycleOwner();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r6 = new X.C98784ri((java.lang.Object) r0, 34);
        r2 = r2.A00.A00;
        r1 = r2.A00;
        r21 = X.AnonymousClass10E.A8r(r2);
        r16 = X.AnonymousClass10E.A12(r2);
        r20 = X.AnonymousClass10E.A6Q(r2);
        r22 = X.AnonymousClass3Ma.A0g(r2);
        r30 = X.AnonymousClass3MZ.A1C(r2);
        r17 = r0;
        r0.A06 = new X.AnonymousClass4VQ(r10, r11, r12, r13, r14, r15, r16, r17, r7, (X.AnonymousClass4MQ) r1.A57.get(), r20, r21, r22, (X.AnonymousClass1c4) r2.A7C.get(), (X.C88634aG) r1.A3S.get(), r25, r26, r27, (X.C86034Px) r1.A58.get(), r6, r30, X.C27011Uj.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r6 = getFMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f2, code lost:
        if (A0G(r6) == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f4, code lost:
        r5 = ((X.AnonymousClass171) r0.A0A.get()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fe, code lost:
        if (r5 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0100, code lost:
        r2 = r6.A0v.A01;
        r1 = X.C1404171i.A06;
        r3 = new X.C129566i0(r6, (java.lang.Object) null, r2);
        r1 = X.C72483Me.A0A(r0.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0113, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011a, code lost:
        if (A0G(r6) == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = new X.AnonymousClass7BY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0125, code lost:
        X.AnonymousClass12Q.A04();
        X.AnonymousClass114.A02(r1);
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        if (r1 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012f, code lost:
        r1 = X.AnonymousClass000.A13();
        r3.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0135, code lost:
        r1.add(r2);
        r5.A03(r0.A0K, new X.C1404171i(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0143, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0144, code lost:
        X.AnonymousClass12Q.A04();
        X.AnonymousClass114.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014b, code lost:
        com.whatsapp.util.Log.e("conversation/row/video/viewpointManager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0150, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0152, code lost:
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0158, code lost:
        if (r1.A03 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015a, code lost:
        r1.A0H.A00.registerObserver(r1);
        r1.A03 = true;
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0D(X.AnonymousClass21Y r33, boolean r34) {
        /*
            r32 = this;
            r0 = r32
            if (r34 != 0) goto L_0x011d
            X.4VQ r1 = r0.A06
            if (r1 != 0) goto L_0x0167
            r1 = r33
            boolean r1 = r0.A0G(r1)
            if (r1 == 0) goto L_0x0167
            r8 = 1
        L_0x0011:
            X.4VQ r1 = r0.A06
            if (r1 == 0) goto L_0x001b
            r1.A03()
            r1 = 0
            r0.A06 = r1
        L_0x001b:
            X.21Y r6 = r0.getFMessage()
            X.12L r2 = r0.A17
            if (r6 == 0) goto L_0x0116
            X.205 r1 = r6.A0v
            X.1BI r1 = r1.A00
            boolean r1 = X.C42761yh.A01(r2, r1)
            if (r1 == 0) goto L_0x0116
            X.0ve r3 = r0.A0F
            r2 = 3182(0xc6e, float:4.459E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0116
        L_0x0039:
            android.widget.TextView r14 = r0.A0J
            if (r14 == 0) goto L_0x00ea
            android.view.View r10 = r0.A0E
            if (r10 == 0) goto L_0x00ea
            android.widget.ImageView r13 = r0.A0H
            if (r13 == 0) goto L_0x00ea
            android.widget.FrameLayout r11 = r0.A0G
            if (r11 == 0) goto L_0x00ea
            r0.A03()
            android.widget.FrameLayout r12 = r0.A00
            X.1rL r1 = r0.A0F
            r12.setOnClickListener(r1)
            X.AnonymousClass3uP.A0W(r12, r0)
            X.5bZ r5 = r0.A09
            com.whatsapp.WaFrameLayout r4 = r0.A0K
            X.205 r1 = r6.A0v
            boolean r1 = r1.A02
            int r3 = X.C72453Mb.A05(r1)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            boolean r1 = r4.isPressed()
            android.graphics.drawable.Drawable r1 = r5.BS0(r2, r3, r1)
            r4.setForeground(r1)
            A0B(r0)
            X.4KP r2 = r0.A01
            r1 = 2131432878(0x7f0b15ae, float:1.8487526E38)
            X.1bI r26 = X.C28931bI.A00(r0, r1)
            r1 = 2131435547(0x7f0b201b, float:1.849294E38)
            X.1bI r27 = X.C28931bI.A00(r0, r1)
            X.21Y r25 = r0.getFMessage()
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r7 = r0.A0L
            X.5cR r1 = r0.A0k
            if (r1 == 0) goto L_0x0113
            X.1F9 r15 = r1.getLifecycleOwner()
        L_0x0090:
            r1 = 34
            X.4ri r6 = new X.4ri
            r6.<init>((java.lang.Object) r0, (int) r1)
            X.1Xd r1 = r2.A00
            X.10E r2 = r1.A00
            X.10G r1 = r2.A00
            X.00S r3 = r1.A58
            java.lang.Object r5 = r3.get()
            X.4Px r5 = (X.C86034Px) r5
            X.0ve r21 = X.AnonymousClass10E.A8r(r2)
            X.1KB r16 = X.AnonymousClass10E.A12(r2)
            X.0vb r20 = X.AnonymousClass10E.A6Q(r2)
            X.00S r3 = r1.A57
            java.lang.Object r4 = r3.get()
            X.4MQ r4 = (X.AnonymousClass4MQ) r4
            X.18K r22 = X.AnonymousClass3Ma.A0g(r2)
            X.00S r3 = r2.A7C
            java.lang.Object r3 = r3.get()
            X.1c4 r3 = (X.AnonymousClass1c4) r3
            X.0wl r30 = X.AnonymousClass3MZ.A1C(r2)
            X.00S r1 = r1.A3S
            java.lang.Object r1 = r1.get()
            X.4aG r1 = (X.C88634aG) r1
            X.1Ho r31 = X.C27011Uj.A00()
            X.4VQ r9 = new X.4VQ
            r18 = r7
            r19 = r4
            r23 = r3
            r24 = r1
            r28 = r5
            r29 = r6
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A06 = r9
        L_0x00ea:
            X.21Y r6 = r0.getFMessage()
            boolean r1 = r0.A0G(r6)
            if (r1 == 0) goto L_0x0150
            X.00H r1 = r0.A0A
            java.lang.Object r1 = r1.get()
            X.171 r1 = (X.AnonymousClass171) r1
            X.A58 r5 = r1.A00
            if (r5 == 0) goto L_0x014b
            r4 = 0
            X.205 r1 = r6.A0v
            java.lang.String r2 = r1.A01
            X.71i r1 = X.C1404171i.A06
            X.6i0 r3 = new X.6i0
            r3.<init>(r6, r4, r2)
            X.173 r1 = r0.A04
            android.content.Context r1 = X.C72483Me.A0A(r1)
            goto L_0x0120
        L_0x0113:
            r15 = 0
            goto L_0x0090
        L_0x0116:
            boolean r1 = r0.A0G(r6)
            if (r1 != 0) goto L_0x0039
            goto L_0x00ea
        L_0x011d:
            r8 = 0
            goto L_0x0011
        L_0x0120:
            X.7BY r2 = new X.7BY     // Catch:{ all -> 0x0143 }
            r2.<init>(r0)     // Catch:{ all -> 0x0143 }
            X.AnonymousClass12Q.A04()
            X.AnonymousClass114.A02(r1)
            java.util.List r1 = r3.A01
            if (r1 != 0) goto L_0x0135
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r3.A01 = r1
        L_0x0135:
            r1.add(r2)
            X.71i r2 = new X.71i
            r2.<init>(r3)
            com.whatsapp.WaFrameLayout r1 = r0.A0K
            r5.A03(r1, r2)
            goto L_0x0150
        L_0x0143:
            r0 = move-exception
            X.AnonymousClass12Q.A04()
            X.AnonymousClass114.A02(r1)
            throw r0
        L_0x014b:
            java.lang.String r1 = "conversation/row/video/viewpointManager is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0150:
            if (r8 == 0) goto L_0x0167
            X.4VQ r1 = r0.A06
            if (r1 == 0) goto L_0x0167
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0167
            X.4MQ r0 = r1.A0H
            X.2Ku r0 = r0.A00
            r0.registerObserver(r1)
            r0 = 1
            r1.A03 = r0
            r1.A00()
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uK.A0D(X.21Y, boolean):void");
    }

    private void A0F(boolean z) {
        int i;
        int i2;
        AnonymousClass21Y fMessage = getFMessage();
        C62572rc A002 = AnonymousClass206.A00(fMessage);
        boolean z2 = z;
        if (z) {
            this.A0I.setTag(Collections.singletonList(fMessage));
        }
        A0D(fMessage, z2);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
        conversationRowVideo$RowVideoView.setKeepRatio(this.A0V);
        conversationRowVideo$RowVideoView.setInAlbum(this.A0V);
        conversationRowVideo$RowVideoView.setFullWidth(this.A0l.Bew(getFMessage()));
        conversationRowVideo$RowVideoView.setPortraitPreviewEnabled(A2q());
        boolean A062 = C20120A8f.A06(fMessage);
        conversationRowVideo$RowVideoView.A0A = A062;
        if (A062) {
            conversationRowVideo$RowVideoView.A01 = getResources().getDimensionPixelSize(2131165762);
            conversationRowVideo$RowVideoView.A00 = getResources().getDimensionPixelSize(2131165761);
        }
        AnonymousClass1Xr.A04(conversationRowVideo$RowVideoView, AnonymousClass4W0.A01(fMessage));
        AnonymousClass1Xr.A04(this.A0H, AnonymousClass4W0.A00(fMessage));
        ImageView imageView = this.A0D;
        if (imageView != null) {
            AnonymousClass1Xr.A04(imageView, AnonymousClass3uL.A0O(fMessage));
        }
        if (this.A0V) {
            i = (int) (C72463Mc.A00(getContext()) * 83.333336f);
            i2 = C32021gV.A00(fMessage, i);
            if (i2 <= 0) {
                i2 = (i * 9) / 16;
            }
        } else {
            i = A002.A08;
            i2 = A002.A06;
        }
        conversationRowVideo$RowVideoView.A03(i, i2, true);
        ImageView imageView2 = this.A0H;
        C38471rL r6 = this.A0F;
        imageView2.setOnClickListener(r6);
        FrameLayout frameLayout = this.A0G;
        frameLayout.setOnClickListener(r6);
        if (!A0G(fMessage)) {
            if (AnonymousClass25A.A11(getFMessage())) {
                A0E(z2);
            } else if (C79103uS.A1L(this)) {
                View view = this.A0E;
                C28931bI r10 = this.A0O;
                C28931bI r11 = this.A0N;
                TextView textView = this.A0I;
                AnonymousClass3uL.A0Q(view, textView, r10, r11, false, false, true, true);
                textView.setVisibility(8);
                if (!A0G(getFMessage())) {
                    conversationRowVideo$RowVideoView.setVisibility(0);
                }
                view.setVisibility(8);
                this.A0J.setVisibility(0);
                textView.setOnClickListener(r6);
                A03();
                A2l(conversationRowVideo$RowVideoView, C17880vN.A0q(AnonymousClass3MX.A04(this.A0F, conversationRowVideo$RowVideoView, 8), C64052u8.A02(this.A0D, fMessage.A0D, 0), new Object[1], 0, 2131897841));
                conversationRowVideo$RowVideoView.setImportantForAccessibility(1);
                if (A2s(fMessage)) {
                    A1s();
                }
            } else {
                View view2 = this.A0E;
                view2.setVisibility(0);
                TextView textView2 = this.A0I;
                textView2.setVisibility(0);
                FrameLayout frameLayout2 = this.A0F;
                frameLayout2.setVisibility(0);
                C28931bI r15 = this.A0N;
                r15.A04(8);
                this.A0J.setVisibility(8);
                if (!AnonymousClass4H3.A00(getFMessage())) {
                    textView2.setText(2131895332);
                    AnonymousClass3MY.A0w(getContext(), textView2, 2131895332);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(2131232383, 0, 0, 0);
                    C38471rL r62 = this.A0E;
                    textView2.setOnClickListener(r62);
                    frameLayout2.setOnClickListener(r62);
                    A03();
                    conversationRowVideo$RowVideoView.setContentDescription((CharSequence) null);
                    conversationRowVideo$RowVideoView.setImportantForAccessibility(2);
                } else {
                    A2E(textView2, (Integer) null, Collections.singletonList(fMessage), fMessage.A01);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(2131231869, 0, 0, 0);
                    C38471rL r63 = this.A0D;
                    textView2.setOnClickListener(r63);
                    frameLayout2.setOnClickListener(r63);
                    C38471rL r5 = this.A0M;
                    conversationRowVideo$RowVideoView.setOnClickListener(r5);
                    imageView2.setOnClickListener(r5);
                    frameLayout.setOnClickListener(r5);
                    A2l(conversationRowVideo$RowVideoView, conversationRowVideo$RowVideoView.getContext().getString(2131887592));
                    conversationRowVideo$RowVideoView.setImportantForAccessibility(1);
                }
                AnonymousClass3uL.A0Q(view2, textView2, this.A0O, r15, false, !z, true, true);
            }
            if (this.A0O.A01() == 8) {
                this.A0R.setVisibility(8);
            }
            A1y();
            this.A1X.CGS(new C98714rb(this, A002, fMessage, 13), "frame_visibility_serial_worker");
            TextView textView3 = this.A0J;
            if (textView3.getVisibility() == 0) {
                C18000vb r8 = this.A0D;
                AnonymousClass10I r7 = this.A1X;
                AnonymousClass4GI.A00(textView3, this.A0S, new AnonymousClass7EU(this, 0), r8, fMessage, r7);
            }
        }
        AnonymousClass3uP.A0W(conversationRowVideo$RowVideoView, this);
        conversationRowVideo$RowVideoView.A0C = fMessage.A0v.A02;
        ConversationRowVideo$RowVideoView.A01(conversationRowVideo$RowVideoView);
        C17960vV.A07(this.A1S);
        A2t(fMessage, this.A0D, z2);
        this.A0D = false;
        A2m(this.A0Q, getFMessage().A18());
        A2n(fMessage);
        if (!this.A0V) {
            A2P(fMessage);
            A2N(fMessage);
        }
    }

    /* access modifiers changed from: private */
    public void setThumbnail(Drawable drawable) {
        this.A0L.setImageDrawable(drawable);
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(getFMessage()) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public boolean A1Z() {
        if (!((C139546z1) this.A2O.get()).A02(getFMessage()) || getFMessage().A0v.A02) {
            return false;
        }
        return true;
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        if (!(r2 instanceof C442522s)) {
            boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
            super.A2V(r2, z);
            if (z || A1Z) {
                A0F(A1Z);
            }
        }
    }

    public void A2t(AnonymousClass206 r16, boolean z, boolean z2) {
        AnonymousClass206 r4 = r16;
        if (!z || z2) {
            if (r4.A0w()) {
                C62572rc A002 = AnonymousClass206.A00(getFMessage());
                AnonymousClass21Y fMessage = getFMessage();
                if (fMessage.A0w() && C60502o8.A00(fMessage) != null) {
                    if (C18020vd.A05(C18040vf.A02, AnonymousClass3MY.A0W(this.A2B), 11694) && C60502o8.A00(getFMessage()).A0A && !A002.A0V) {
                        C32021gV.A05((Bitmap.Config) null, this.A0L, r4, this.A0T, this.A1S, r4.A0v, 2000, false, false, false, false, true, true);
                        return;
                    }
                }
                if (!z2 || !((AnonymousClass1c4) this.A2B.get()).A0B()) {
                    return;
                }
            }
            this.A1S.A0D(this.A0L, r4, this.A0T);
            return;
        }
        this.A1S.A0G(this.A0L, r4, this.A0T, r4.A0v, false);
    }

    public AnonymousClass4VQ getConversationRowVideoAutoPlay() {
        return this.A06;
    }

    public AnonymousClass21Y getFMessage() {
        return (AnonymousClass21Y) ((AnonymousClass21V) this.A0I);
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return C88164Yo.A01(this.A0L.A08);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass21Y);
        super.setFMessage(r2);
    }

    public AnonymousClass3uK(Context context, C108875cR r6, AnonymousClass21Y r7) {
        super(context, r6, r7);
        A1M();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = (ConversationRowVideo$RowVideoView) AnonymousClass1HF.A06(this, 2131436123);
        this.A0L = conversationRowVideo$RowVideoView;
        C28931bI A002 = C28931bI.A00(this, 2131434181);
        this.A0O = A002;
        this.A0J = C17880vN.A0E(this, 2131431625);
        this.A0G = (FrameLayout) findViewById(2131433888);
        this.A0H = AnonymousClass3MW.A0H(this, 2131433885);
        this.A0N = C28931bI.A00(this, 2131428820);
        this.A0F = (FrameLayout) findViewById(2131431784);
        this.A0E = findViewById(2131429544);
        this.A0Q = findViewById(2131436057);
        this.A0K = (WaFrameLayout) AnonymousClass1HF.A06(this, 2131432381);
        this.A0R = AnonymousClass3MW.A0J(this, 2131432439);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(this, 2131436745);
        this.A00 = frameLayout;
        conversationRowVideo$RowVideoView.A06 = frameLayout;
        conversationRowVideo$RowVideoView.A05 = AnonymousClass1HF.A06(this, 2131435338);
        C98254qp.A00(A002, this, 25);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0F, 9600);
        this.A0P = A052;
        conversationRowVideo$RowVideoView.A0E = A052;
        this.A0S = C99054sC.A00(this, 11);
        A0F(true);
    }

    public static void A05(AnonymousClass3uK r4) {
        C691336a A002;
        AnonymousClass21Y fMessage = r4.getFMessage();
        if (fMessage.A0w()) {
            if (C18020vd.A05(C18040vf.A02, r4.A0F, 10585) && (A002 = C50382Uf.A00(fMessage)) != null) {
                A002.A06 = false;
                C98814rl.A00(r4.A1X, r4, fMessage, 36);
            }
        }
    }

    public static void A0B(AnonymousClass3uK r5) {
        AnonymousClass21Y fMessage = r5.getFMessage();
        int i = 2131232596;
        if (C63652tT.A00(r5.A0F, (C139506yx) r5.A2W.get(), fMessage)) {
            i = 2131231961;
        }
        Resources resources = r5.getResources();
        AnonymousClass21Y fMessage2 = r5.getFMessage();
        int i2 = 2131166313;
        if (C63652tT.A00(r5.A0F, (C139506yx) r5.A2W.get(), fMessage2)) {
            i2 = 2131166249;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        TextView textView = r5.A0J;
        C72463Mc.A14(textView, dimensionPixelSize, textView.getPaddingTop());
        if (AnonymousClass3MY.A1b(r5.A0D)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass3MZ.A0B(r5, i), (Drawable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass3uK r9) {
        /*
            X.21Y r3 = r9.getFMessage()
            X.2rc r5 = X.AnonymousClass206.A00(r3)
            int r1 = r5.A07
            r0 = 1
            if (r1 != r0) goto L_0x001a
            X.1KB r2 = r9.A0S
            r1 = 32
        L_0x0011:
            X.4ri r0 = new X.4ri
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.CGP(r0)
        L_0x0019:
            return
        L_0x001a:
            X.00H r0 = r9.A0B
            java.lang.Object r0 = r0.get()
            X.168 r0 = (X.AnonymousClass168) r0
            X.5ti r1 = r0.A00(r5)
            X.205 r0 = r3.A0v
            boolean r4 = r0.A02
            if (r4 != 0) goto L_0x0040
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            X.6ug r0 = r1.A0r
            if (r0 == 0) goto L_0x003b
        L_0x0036:
            X.1KB r2 = r9.A0S
            r1 = 33
            goto L_0x0011
        L_0x003b:
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x008b
            return
        L_0x0040:
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x008b
            boolean r0 = r5.A0U
            if (r0 != 0) goto L_0x008b
            java.lang.String r6 = r5.A0K
            r7 = 0
            if (r6 != 0) goto L_0x005a
            long r0 = r5.A0D
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x008b
            long r1 = r5.A0E
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
        L_0x005a:
            long r1 = r5.A0D
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            long r1 = r5.A0E
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
        L_0x0066:
            X.17r r0 = r9.A02
            java.io.File r0 = X.C26511Sk.A0H(r0, r6)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x008b
        L_0x0072:
            boolean r0 = X.AnonymousClass25A.A11(r3)
            r3 = 2131887920(0x7f120730, float:1.941046E38)
            if (r0 == 0) goto L_0x007e
            r3 = 2131887921(0x7f120731, float:1.9410463E38)
        L_0x007e:
            X.1KB r2 = r9.A0S
            r0 = 43
            X.7RP r1 = new X.7RP
            r1.<init>(r9, r3, r0)
        L_0x0087:
            r2.CGP(r1)
            return
        L_0x008b:
            java.io.File r0 = r5.A0G
            if (r0 == 0) goto L_0x00bf
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x00bf
            boolean r2 = X.C72473Md.A1Q(r1)
        L_0x009f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ViewMessage/from_me:"
            X.C79103uS.A1F(r5, r3, r0, r1, r4)
            if (r2 != 0) goto L_0x0036
            java.lang.String r0 = "ViewMessage/No file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r9.A2p()
            if (r0 != 0) goto L_0x0019
            X.1KB r2 = r9.A0S
            r0 = 35
            X.4rl r1 = new X.4rl
            r1.<init>(r9, r3, r0)
            goto L_0x0087
        L_0x00bf:
            r2 = 0
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uK.A0C(X.3uK):void");
    }

    private boolean A0G(AnonymousClass21Y r4) {
        if (!r4.A0w()) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MY.A0W(this.A2B), 7588)) {
            return false;
        }
        if (C79103uS.A1L(this)) {
            return true;
        }
        C26501Sj r1 = (C26501Sj) this.A08.get();
        if (!r4.A0w() || !AnonymousClass4H3.A00(r4) || ((AnonymousClass4RG) r1.A09.get()).A00(r4) || !AnonymousClass72Z.A02(r1.A03, r4) || (((C25125CYy) r1.A08.get()).A00() & 4) == 0 || !((C59792mt) r1.A07.get()).A01(r4)) {
            return false;
        }
        return true;
    }

    public boolean A1Y() {
        return A1f();
    }

    public void A1v() {
        AnonymousClass21Y fMessage = getFMessage();
        this.A0D = true;
        C32021gV r0 = this.A1S;
        C17960vV.A07(r0);
        r0.A0G(this.A0L, fMessage, this.A0T, fMessage.A0v, false);
    }

    public void A1y() {
        AnonymousClass21Y fMessage = getFMessage();
        if (A0G(fMessage)) {
            A0D(fMessage, false);
            return;
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0F, 1418);
        TextView textView = this.A0R;
        if (A052) {
            C88564a8.A02((ViewGroup) null, textView, this.A05, (C18000vb) null, this.A05, fMessage);
        } else {
            textView.setVisibility(8);
        }
        C62572rc r1 = getFMessage().A02;
        if (r1 != null && r1.A0f && !r1.A0d && this.A0O.A01() != 0) {
            A0E(false);
        }
        C28931bI r12 = this.A0O;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r12, C88564a8.A01(r0, fMessage, r12));
    }

    public void A20() {
        super.A20();
        if (this.A03 != null && !AnonymousClass74O.A0O(getContext(), this.A03)) {
            return;
        }
        if (C79103uS.A1J(this)) {
            C98784ri.A00(this.A1X, this, 31);
        } else {
            A0C(this);
        }
    }

    public boolean A2a() {
        return AnonymousClass3MZ.A1b(getFMessage());
    }

    public boolean A2o() {
        A05(this);
        return super.A2o();
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
        if (conversationRowVideo$RowVideoView != null && conversationRowVideo$RowVideoView.A0D != (isPressed = isPressed())) {
            conversationRowVideo$RowVideoView.A0D = isPressed;
            ConversationRowVideo$RowVideoView.A01(conversationRowVideo$RowVideoView);
            conversationRowVideo$RowVideoView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        if ((getFMessage() instanceof C438121a) || !AnonymousClass3MZ.A1b(getFMessage())) {
            return 2131231129;
        }
        return 2131231130;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A06 != null) {
            boolean A0G2 = A0G(getFMessage());
            AnonymousClass4VQ r1 = this.A06;
            if (!A0G2) {
                r1.A02();
            } else if (!r1.A03) {
                r1.A0H.A00.registerObserver(r1);
                r1.A03 = true;
                r1.A00();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A06 != null) {
            boolean A0G2 = A0G(getFMessage());
            AnonymousClass4VQ r1 = this.A06;
            if (!A0G2) {
                r1.A03();
            } else if (r1.A03) {
                r1.A0H.A00.unregisterObserver(r1);
                r1.A03 = false;
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 != null && !A0G(getFMessage())) {
            AnonymousClass4VQ r0 = this.A06;
            if (z) {
                r0.A02();
            } else {
                r0.A03();
            }
        }
    }

    public int getCenteredLayoutId() {
        return 2131624956;
    }

    public int getIncomingLayoutId() {
        return 2131624956;
    }

    public int getOutgoingLayoutId() {
        return 2131624957;
    }
}
