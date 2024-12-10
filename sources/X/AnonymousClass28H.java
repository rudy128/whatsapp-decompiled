package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.28H  reason: invalid class name */
public final class AnonymousClass28H extends C38391rD {
    public int A00;
    public boolean A01 = true;
    public final ConversationFilterMenuHandler A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final CopyOnWriteArrayList A05;
    public final C18100vl A06 = new C18110vm(new AnonymousClass3HK(this));
    public final C18100vl A07;
    public final C18100vl A08 = new C18110vm(new AnonymousClass3HM(this));
    public final C18090vk A09;
    public final C51912a2 A0A;
    public final C18000vb A0B;

    public AnonymousClass28H(C51912a2 r3, ConversationFilterMenuHandler conversationFilterMenuHandler, C18000vb r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, List list, C18090vk r10) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(list, r7, r5);
        C18070vi.A0d(r8, 6);
        this.A04 = r7;
        this.A0B = r5;
        this.A03 = r8;
        this.A02 = conversationFilterMenuHandler;
        this.A09 = r10;
        this.A0A = r3;
        this.A05 = new CopyOnWriteArrayList(list);
        this.A07 = new C18110vm(new AnonymousClass3HL(r6));
    }

    public void Bmc(C42011xT r13, int i) {
        C64712vD r0;
        int i2;
        String valueOf;
        C18070vi.A0d(r13, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C41531wa r11 = (C41531wa) this.A05.get(i);
            C453028k r132 = (C453028k) r13;
            C18070vi.A0b(r11);
            int i3 = 0;
            boolean A1T = AnonymousClass000.A1T(i, this.A00);
            TextView textView = r132.A01;
            AnonymousClass00H r5 = this.A04;
            String A002 = r11.A00();
            Context context = r132.A0H.getContext();
            C18070vi.A0X(context);
            C18070vi.A0d(A002, 0);
            textView.setText(C43251zV.A05(context, ((C38501rO) r5.get()).A02, A002));
            if (((C38501rO) r5.get()).A08()) {
                TextView textView2 = r132.A02;
                boolean z = r11 instanceof C41541wb;
                if (z) {
                    i2 = ((C41541wb) r11).A00;
                } else {
                    i2 = ((C41551wc) r11).A00;
                }
                if (i2 == 0 || (z && C18070vi.A18(((C41541wb) r11).A02, "ALL_FILTER"))) {
                    i3 = 8;
                }
                textView2.setVisibility(i3);
                if (textView2.getVisibility() == 0) {
                    if (i2 > 99) {
                        valueOf = textView2.getResources().getString(2131891907);
                    } else {
                        valueOf = String.valueOf(i2);
                    }
                    textView2.setText(valueOf);
                }
            } else {
                r132.A02.setVisibility(8);
            }
            LinearLayout linearLayout = r132.A00;
            linearLayout.setSelected(A1T);
            linearLayout.setOnClickListener(new C90104dX(this, i, 17));
            if (A1T || ((C38501rO) r5.get()).A07()) {
                C28391a8 r1 = (C28391a8) this.A03.get();
                if (r1.A02()) {
                    if (C18020vd.A05(C18040vf.A01, r1.A01, 8840)) {
                        r0 = new C64712vD(linearLayout, this, i);
                        linearLayout.setOnLongClickListener(r0);
                        C43421zm.A04(textView);
                        textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        String string = textView.getResources().getString(2131891714, new Object[]{A002});
                        C18070vi.A0X(string);
                        r5.get();
                        textView.setContentDescription(string);
                        r5.get();
                        AnonymousClass1Y5.A07(textView, "Button");
                    }
                }
            }
            r0 = null;
            linearLayout.setOnLongClickListener(r0);
            C43421zm.A04(textView);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            String string2 = textView.getResources().getString(2131891714, new Object[]{A002});
            C18070vi.A0X(string2);
            r5.get();
            textView.setContentDescription(string2);
            r5.get();
            AnonymousClass1Y5.A07(textView, "Button");
        } else if (itemViewType != 1) {
            FrameLayout frameLayout = ((C452728h) r13).A00;
            frameLayout.setSelected(false);
            frameLayout.setOnClickListener(new C90014dO(this, frameLayout, 11));
            frameLayout.setOnLongClickListener((View.OnLongClickListener) null);
            String string3 = frameLayout.getResources().getString(2131886491);
            C18070vi.A0X(string3);
            AnonymousClass00H r02 = this.A04;
            r02.get();
            frameLayout.setContentDescription(string3);
            r02.get();
            AnonymousClass1Y5.A07(frameLayout, "Button");
        } else {
            ((C452828i) r13).A00.setOnClickListener(new C89924dF(this, 12));
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 0) {
            List list = C42011xT.A0I;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i != 2) {
                View inflate = from.inflate(2131624980, viewGroup, false);
                C18070vi.A0X(inflate);
                return new C452828i(inflate, this);
            }
            View inflate2 = from.inflate(2131624978, viewGroup, false);
            C18070vi.A0X(inflate2);
            return new C452728h(inflate2, this);
        }
        List list2 = C42011xT.A0I;
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(2131624979, viewGroup, false);
        C18070vi.A0X(inflate3);
        return new C453028k(inflate3, this);
    }

    public int A0Q() {
        int size;
        if (this.A01) {
            int A0M = AnonymousClass000.A0M(this.A06.getValue());
            C18100vl r2 = this.A07;
            if (A0M > AnonymousClass000.A0M(r2.getValue())) {
                size = AnonymousClass000.A0M(this.A08.getValue()) + AnonymousClass000.A0M(r2.getValue());
                return size + 1;
            }
        }
        if (!((C38501rO) this.A04.get()).A07()) {
            return this.A05.size();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
        if (copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        size = copyOnWriteArrayList.size();
        return size + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r6 == -1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0U(X.C41531wa r10) {
        /*
            r9 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.A05
            java.util.Iterator r8 = r0.iterator()
            r7 = 0
            r6 = 0
        L_0x0008:
            boolean r0 = r8.hasNext()
            r5 = -1
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r8.next()
            X.1wa r1 = (X.C41531wa) r1
            boolean r0 = r1 instanceof X.C41551wc
            if (r0 == 0) goto L_0x0035
            boolean r0 = r10 instanceof X.C41551wc
            if (r0 == 0) goto L_0x004d
            X.1wc r1 = (X.C41551wc) r1
            X.1x1 r0 = r1.A01
            long r3 = r0.A03
            r0 = r10
            X.1wc r0 = (X.C41551wc) r0
            X.1x1 r0 = r0.A01
            long r1 = r0.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
        L_0x002e:
            if (r6 == r5) goto L_0x0031
            r7 = r6
        L_0x0031:
            r9.A0V(r7)
            return r7
        L_0x0035:
            boolean r0 = r1 instanceof X.C41541wb
            if (r0 == 0) goto L_0x0050
            boolean r0 = r10 instanceof X.C41541wb
            if (r0 == 0) goto L_0x004d
            X.1wb r1 = (X.C41541wb) r1
            java.lang.String r1 = r1.A02
            r0 = r10
            X.1wb r0 = (X.C41541wb) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x004d
            goto L_0x002e
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0008
        L_0x0050:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28H.A0U(X.1wa):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        if (X.C18070vi.A18(((X.C41541wb) r5).A02, "ALL_FILTER") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0167, code lost:
        if (r0 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f6, code lost:
        r8.A00.CC7(X.C29561cU.A01(r17, r18, r0, r15));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(int r24) {
        /*
            r23 = this;
            r6 = r23
            X.2a2 r1 = r6.A0A
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A05
            r7 = r24
            java.lang.Object r5 = r0.get(r7)
            X.C18070vi.A0X(r5)
            X.1wa r5 = (X.C41531wa) r5
            com.whatsapp.conversationslist.ConversationsFragment r4 = r1.A00
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r4.A1k
            r0.A00 = r5
            X.5fx r0 = r4.A1e
            if (r0 == 0) goto L_0x002e
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r0.A04
            if (r0 == 0) goto L_0x002e
            r0.A00 = r5
            X.1wy r1 = r0.A0G
            boolean r0 = com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel.A05(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0F(r0)
        L_0x002e:
            X.1Gk r3 = r4.A27()
            boolean r2 = r5 instanceof X.C41541wb
            if (r2 == 0) goto L_0x0205
            r8 = r5
            X.1wb r8 = (X.C41541wb) r8
            long r15 = (long) r7
            X.1pG r1 = r4.A2L
            boolean r0 = X.C37281pG.A00(r1)
            if (r0 == 0) goto L_0x004a
            X.19U r1 = r1.A01
            r0 = 269615107(0x10120003, float:2.8793432E-29)
            r1.markerStart(r0)
        L_0x004a:
            X.1Gk r14 = r4.A27()
            r0 = 0
            r14.A03 = r0
            r14.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r14.A01 = r0
            java.util.Random r0 = r4.A4T
            long r0 = r0.nextLong()
            r14.A00 = r0
            java.lang.String r13 = r8.A02
            int r17 = r13.hashCode()
            java.lang.String r12 = "UNREAD_FILTER"
            java.lang.String r11 = "GROUP_FILTER"
            java.lang.String r10 = "FAVORITES_FILTER"
            java.lang.String r9 = "CONTACTS_FILTER"
            r8 = -1
            switch(r17) {
                case -1730152220: goto L_0x01e1;
                case -817912192: goto L_0x01c0;
                case -19153930: goto L_0x01ad;
                case 72525144: goto L_0x0197;
                case 1827283464: goto L_0x0181;
                default: goto L_0x0071;
            }
        L_0x0071:
            X.1pG r1 = r4.A2L
            boolean r0 = X.C37281pG.A00(r1)
            if (r0 == 0) goto L_0x0085
            X.19U r8 = r1.A01
            r1 = 269615107(0x10120003, float:2.8793432E-29)
            X.2Lb r0 = X.C48072Lb.A00
            java.lang.String r0 = r0.A00
            r8.markerAnnotate((int) r1, (java.lang.String) r0, (java.lang.String) r13)
        L_0x0085:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A03 = r0
            r4.BCQ(r3)
            android.view.View r1 = r4.A0B
            if (r1 == 0) goto L_0x011a
            r0 = 2131434971(0x7f0b1ddb, float:1.849177E38)
            android.widget.TextView r9 = X.C17880vN.A0E(r1, r0)
            if (r9 == 0) goto L_0x011a
            X.00H r0 = r4.A3J
            java.lang.Object r0 = r0.get()
            X.1rX r0 = (X.C38581rX) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00d6
            com.airbnb.lottie.LottieAnimationView r0 = r4.A0P
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.WaImageView r0 = r4.A0u
            if (r0 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x00c1
            r0 = r5
            X.1wb r0 = (X.C41541wb) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "ALL_FILTER"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r8 = 1
            if (r0 != 0) goto L_0x00c2
        L_0x00c1:
            r8 = 0
        L_0x00c2:
            com.airbnb.lottie.LottieAnimationView r3 = r4.A0P
            r1 = 0
            r0 = 8
            if (r8 == 0) goto L_0x00ca
            r0 = 0
        L_0x00ca:
            r3.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r4.A0u
            if (r8 == 0) goto L_0x00d3
            r1 = 8
        L_0x00d3:
            r0.setVisibility(r1)
        L_0x00d6:
            X.00H r0 = r4.A3T
            java.lang.Object r10 = r0.get()
            X.1rl r10 = (X.C38711rl) r10
            android.content.Context r8 = r4.A14()
            r3 = 0
            r1 = 1
            X.C18070vi.A0d(r5, r1)
            if (r2 == 0) goto L_0x016a
            X.1wb r5 = (X.C41541wb) r5
            java.lang.String r1 = r5.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x0125;
                case -817912192: goto L_0x012f;
                case -19153930: goto L_0x0139;
                case 72525144: goto L_0x0154;
                case 1827283464: goto L_0x015e;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            r1 = 2131895489(0x7f1224c1, float:1.9425812E38)
        L_0x00f7:
            java.lang.String r5 = r8.getString(r1)
        L_0x00fb:
            X.C18070vi.A0b(r5)
            X.00H r0 = r4.A3I
            java.lang.Object r2 = r0.get()
            X.1rO r2 = (X.C38501rO) r2
            android.content.Context r1 = r4.A1n()
            X.C18070vi.A0d(r5, r3)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1KW r0 = r2.A02
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r5)
            r9.setText(r0)
        L_0x011a:
            int r0 = r6.A00
            r6.A00 = r7
            r6.A0G(r7)
            r6.A0G(r0)
            return
        L_0x0125:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r1.equals(r0)
            r1 = 2131895476(0x7f1224b4, float:1.9425786E38)
            goto L_0x0167
        L_0x012f:
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = r1.equals(r0)
            r1 = 2131895482(0x7f1224ba, float:1.9425798E38)
            goto L_0x0167
        L_0x0139:
            java.lang.String r0 = "ALL_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f4
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.1rX r0 = (X.C38581rX) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00f4
            int r1 = r10.A00()
            goto L_0x00f7
        L_0x0154:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r1.equals(r0)
            r1 = 2131895485(0x7f1224bd, float:1.9425804E38)
            goto L_0x0167
        L_0x015e:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r1.equals(r0)
            r1 = 2131895527(0x7f1224e7, float:1.942589E38)
        L_0x0167:
            if (r0 != 0) goto L_0x00f7
            goto L_0x00f4
        L_0x016a:
            X.1rO r0 = r10.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00f4
            r2 = 2131889043(0x7f120b93, float:1.9412738E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r5.A00()
            java.lang.String r5 = X.C17880vN.A0q(r8, r0, r1, r3, r2)
            goto L_0x00fb
        L_0x0181:
            boolean r0 = r13.equals(r12)
            if (r0 == 0) goto L_0x0071
            r14.A01(r12)
            int r0 = r4.A01
            if (r0 != r8) goto L_0x0071
            X.1cU r8 = r4.A1b
            long r0 = r14.A00
            r17 = 1
            r18 = 2
            goto L_0x01f6
        L_0x0197:
            boolean r0 = r13.equals(r11)
            if (r0 == 0) goto L_0x0071
            r14.A01(r11)
            int r0 = r4.A01
            if (r0 != r8) goto L_0x0071
            X.1cU r8 = r4.A1b
            long r0 = r14.A00
            r17 = 2
            r18 = 3
            goto L_0x01f6
        L_0x01ad:
            java.lang.String r9 = "ALL_FILTER"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x0071
            int r9 = r4.A01
            if (r9 != r8) goto L_0x0071
            X.1cU r8 = r4.A1b
            r17 = 0
            r18 = 0
            goto L_0x01f6
        L_0x01c0:
            boolean r0 = r13.equals(r10)
            if (r0 == 0) goto L_0x0071
            r14.A01(r10)
            X.00H r0 = r4.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            r0.A00()
            int r0 = r4.A01
            if (r0 != r8) goto L_0x0071
            X.1cU r8 = r4.A1b
            long r0 = r14.A00
            r17 = 3
            r18 = 22
            goto L_0x01f6
        L_0x01e1:
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x0071
            r14.A01(r9)
            int r0 = r4.A01
            if (r0 != r8) goto L_0x0071
            X.1cU r8 = r4.A1b
            long r0 = r14.A00
            r17 = 5
            r18 = 10
        L_0x01f6:
            X.18K r8 = r8.A00
            r21 = r15
            r19 = r0
            X.2H5 r0 = X.C29561cU.A01(r17, r18, r19, r21)
            r8.CC7(r0)
            goto L_0x0071
        L_0x0205:
            boolean r0 = r5 instanceof X.C41551wc
            if (r0 == 0) goto L_0x0085
            r10 = r5
            X.1wc r10 = (X.C41551wc) r10
            r0 = 0
            r3.A03 = r0
            r3.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r3.A01 = r0
            java.lang.String r11 = r5.A00()
            java.lang.Integer r9 = X.AnonymousClass00R.A00
            r8 = 0
            X.C18070vi.A0d(r11, r8)
            r1 = 1
            java.util.List r0 = r3.A03
            if (r0 == 0) goto L_0x026a
            r0.clear()
            r0.add(r11)
        L_0x022a:
            r3.A03 = r0
            r3.A01 = r9
            java.util.Random r0 = r4.A4T
            long r8 = r0.nextLong()
            r3.A00 = r8
            X.1cU r14 = r4.A1b
            X.1x1 r0 = r10.A01
            long r0 = r0.A04
            java.lang.String r13 = r10.A02
            long r10 = (long) r7
            r12 = 2
            X.C18070vi.A0d(r13, r12)
            r15 = 0
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r17 = 5
            if (r12 <= 0) goto L_0x024d
            r17 = 4
        L_0x024d:
            X.18K r12 = r14.A00
            r18 = 21
            r21 = r10
            r19 = r8
            X.2H5 r9 = X.C29561cU.A01(r17, r18, r19, r21)
            r9.A09 = r13
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0265
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A06 = r0
        L_0x0265:
            r12.CC7(r9)
            goto L_0x0085
        L_0x026a:
            java.lang.String[] r0 = new java.lang.String[r1]
            r0[r8] = r11
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A06(r0)
            goto L_0x022a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28H.A0V(int):void");
    }
}
