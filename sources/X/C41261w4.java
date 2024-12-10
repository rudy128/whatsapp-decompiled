package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.List;
import java.util.Set;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public final class C41261w4 extends C41251w3 {
    public C35401mB A00;
    public C35411mC A01;
    public C35421mD A02;
    public C35441mF A03;
    public C35451mG A04;
    public C35471mI A05;
    public C35481mJ A06;
    public C37451pZ A07;
    public C37451pZ A08;
    public Runnable A09;
    public Set A0A;
    public Set A0B;
    public C18090vk A0C;
    public C18090vk A0D;
    public C22821Di A0E;
    public final AnonymousClass11S A0F;
    public final C18030ve A0G;
    public final C41141vs A0H;
    public final C41151vt A0I;
    public final C41161vu A0J;
    public final C41171vv A0K;
    public final C41181vw A0L;
    public final C41191vx A0M;
    public final C41201vy A0N;
    public final C41211vz A0O;
    public final C41221w0 A0P;
    public final C41231w1 A0Q;
    public final C41241w2 A0R;
    public final C41301w8 A0S = ((C41301w8) AnonymousClass12Q.A02(AnonymousClass114.A00(), 3));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41261w4(C41141vs r3, C41151vt r4, C41161vu r5, C41171vv r6, C41181vw r7, C41191vx r8, C41201vy r9, C41211vz r10, C41221w0 r11, C41231w1 r12, C41241w2 r13, AnonymousClass11S r14, C18030ve r15) {
        super((C40411uf) new C41271w5());
        C18070vi.A0d(r15, 1);
        C18070vi.A0d(r14, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r6, 6);
        C18070vi.A0d(r7, 7);
        C18070vi.A0d(r8, 8);
        C18070vi.A0d(r9, 9);
        C18070vi.A0d(r10, 10);
        C18070vi.A0d(r11, 11);
        C18070vi.A0d(r12, 12);
        C18070vi.A0d(r13, 13);
        this.A0G = r15;
        this.A0F = r14;
        this.A0H = r3;
        this.A0I = r4;
        this.A0J = r5;
        this.A0K = r6;
        this.A0L = r7;
        this.A0M = r8;
        this.A0N = r9;
        this.A0O = r10;
        this.A0P = r11;
        this.A0Q = r12;
        this.A0R = r13;
        C25511Om r0 = C25511Om.A00;
        this.A0B = r0;
        this.A0A = r0;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r6;
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        Context context = viewGroup2.getContext();
        int i2 = i;
        switch (i) {
            case 0:
                C18030ve r4 = this.A0G;
                boolean z = false;
                if (r4 != null && C18020vd.A05(C18040vf.A01, r4, 11202)) {
                    z = true;
                }
                LayoutInflater from = LayoutInflater.from(context);
                if (!z) {
                    View inflate = from.inflate(2131624479, viewGroup2, false);
                    C18070vi.A0X(inflate);
                    inflate.setEnabled(false);
                    r6 = new C113595nL(inflate, this.A03);
                    break;
                } else {
                    View inflate2 = from.inflate(2131624480, viewGroup2, false);
                    C18070vi.A0X(inflate2);
                    inflate2.setEnabled(false);
                    r6 = new AnonymousClass2CX(this.A03, (WDSSectionHeader) inflate2);
                    break;
                }
            case 1:
                View inflate3 = LayoutInflater.from(context).inflate(2131624471, viewGroup2, false);
                C18070vi.A0X(inflate3);
                C41161vu r2 = this.A0J;
                C37451pZ r11 = this.A08;
                if (r11 != null) {
                    C35401mB r9 = this.A00;
                    List list = C42011xT.A0I;
                    AnonymousClass10E r1 = r2.A00.A02;
                    r6 = new AnonymousClass2CV(inflate3, (C72043Kk) r1.A00.A1j.get(), r9, (AnonymousClass1M9) r1.A2f.get(), r11, (C18030ve) r1.A04.get());
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 2:
                C18030ve r7 = this.A0G;
                C18040vf r5 = C18040vf.A02;
                if (C18020vd.A05(r5, r7, 8255)) {
                    int i3 = 2131624476;
                    if (C18020vd.A05(r5, r7, 10543)) {
                        AnonymousClass11S r3 = this.A0F;
                        if (C18020vd.A05(r5, r7, 9148) || C40811vJ.A0D(r3, r7)) {
                            i3 = 2131624477;
                        }
                    }
                    View inflate4 = LayoutInflater.from(context).inflate(i3, viewGroup2, false);
                    C18070vi.A0X(inflate4);
                    C41151vt r22 = this.A0I;
                    C37451pZ r52 = this.A08;
                    if (r52 != null) {
                        C37451pZ r62 = this.A07;
                        if (r62 != null) {
                            r6 = r22.A00(inflate4, this.A02, r52, r62, true);
                            break;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    View inflate5 = LayoutInflater.from(context).inflate(2131624470, viewGroup2, false);
                    C18070vi.A0X(inflate5);
                    C41151vt r42 = this.A0I;
                    C37451pZ r72 = this.A08;
                    if (r72 != null) {
                        C37451pZ r8 = this.A07;
                        if (r8 != null) {
                            r6 = r42.A00(inflate5, this.A02, r72, r8, false);
                            break;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            case 3:
                View inflate6 = LayoutInflater.from(context).inflate(2131625871, viewGroup2, false);
                C18070vi.A0X(inflate6);
                C41211vz r32 = this.A0O;
                C37451pZ r23 = this.A08;
                if (r23 != null) {
                    C35411mC r12 = this.A01;
                    List list2 = C42011xT.A0I;
                    r6 = new BMN(inflate6, (C72043Kk) r32.A00.A02.A00.A1j.get(), r12, r23);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 4:
                View inflate7 = LayoutInflater.from(context).inflate(2131625021, viewGroup2, false);
                C18070vi.A0X(inflate7);
                C41171vv r13 = this.A0K;
                List list3 = C42011xT.A0I;
                AnonymousClass10E r14 = r13.A00.A02;
                r6 = new C74243Zb(inflate7, (AnonymousClass1KB) r14.A4b.get(), (AnonymousClass11E) r14.A2X.get(), (C18030ve) r14.A04.get(), (AnonymousClass1DC) r14.A95.get());
                break;
            case 5:
                boolean A052 = C18020vd.A05(C18040vf.A02, this.A0G, 7724);
                LayoutInflater from2 = LayoutInflater.from(context);
                int i4 = 2131625153;
                if (A052) {
                    i4 = 2131625154;
                }
                View inflate8 = from2.inflate(i4, viewGroup2, false);
                C18070vi.A0X(inflate8);
                C41191vx r24 = this.A0M;
                Runnable runnable = this.A09;
                if (runnable != null) {
                    List list4 = C42011xT.A0I;
                    AnonymousClass10E r15 = r24.A00.A02;
                    C18030ve r25 = (C18030ve) r15.A04.get();
                    C36401np r73 = (C36401np) r15.A00.A30.get();
                    AnonymousClass11C r43 = (AnonymousClass11C) r15.AAp.get();
                    C18070vi.A0d(r25, 1);
                    C18070vi.A0d(r73, 2);
                    C18070vi.A0d(r43, 3);
                    r6 = new C42011xT(inflate8);
                    View A062 = AnonymousClass1HF.A06(inflate8, 2131430237);
                    C18070vi.A0X(A062);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A062;
                    String string = inflate8.getContext().getString(2131894505);
                    C18070vi.A0X(string);
                    textEmojiLabel.setLinkHandler(new C39441t5(r25));
                    textEmojiLabel.setText(r73.A06(textEmojiLabel.getContext(), runnable, string, "%s", AnonymousClass1YL.A00(textEmojiLabel.getContext(), 2130968627, 2131099690)), TextView.BufferType.SPANNABLE);
                    textEmojiLabel.setAccessibilityHelper(new C39411t2(textEmojiLabel, r43));
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 6:
                View inflate9 = LayoutInflater.from(context).inflate(2131625025, viewGroup2, false);
                C18070vi.A0X(inflate9);
                C41181vw r16 = this.A0L;
                List list5 = C42011xT.A0I;
                AnonymousClass10E r17 = r16.A00.A02;
                Object obj = r17.A04.get();
                Object obj2 = r17.A95.get();
                AnonymousClass00H A002 = C000200d.A00(r17.A00.A4R);
                C18070vi.A0d(obj, 1);
                C18070vi.A0d(obj2, 2);
                C18070vi.A0d(A002, 3);
                r6 = new C42011xT(inflate9);
                C43421zm.A04((TextView) AnonymousClass1HF.A06(inflate9, 2131429709));
                AnonymousClass1HF.A06(inflate9, 2131435885).setSelected(true);
                ((ImageView) AnonymousClass1HF.A06(inflate9, 2131431496)).setImageResource(2131231649);
                inflate9.setOnClickListener(new C90084dV(obj, (Object) A002, (Object) inflate9, 27));
                C42491yG.A02(inflate9);
                break;
            case 7:
                View inflate10 = LayoutInflater.from(context).inflate(2131626769, viewGroup2, false);
                C18070vi.A0X(inflate10);
                C41201vy r26 = this.A0N;
                C37451pZ r33 = this.A08;
                if (r33 != null) {
                    List list6 = C42011xT.A0I;
                    AnonymousClass10E r27 = r26.A00.A02;
                    r6 = new C76033mP(inflate10, (C72043Kk) r27.A00.A1j.get(), (AnonymousClass1M9) r27.A2f.get(), r33);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 8:
                View inflate11 = LayoutInflater.from(context).inflate(2131624471, viewGroup2, false);
                C18070vi.A0X(inflate11);
                C41141vs r28 = this.A0H;
                C37451pZ r132 = this.A08;
                if (r132 != null) {
                    C35401mB r112 = this.A00;
                    List list7 = C42011xT.A0I;
                    AnonymousClass10E r34 = r28.A00.A02;
                    AnonymousClass1M9 r122 = (AnonymousClass1M9) r34.A2f.get();
                    AnonymousClass11S r92 = (AnonymousClass11S) r34.A63.get();
                    r6 = new AnonymousClass2CW(inflate11, (C19880zA) r34.A7f.get(), r92, (C72043Kk) r34.A00.A1j.get(), r112, r122, r132, (AnonymousClass1CJ) r34.A2H.get(), (AnonymousClass1MZ) r34.A4t.get(), (C18030ve) r34.A04.get(), (AnonymousClass1LU) r34.ABd.get());
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 9:
                View inflate12 = LayoutInflater.from(context).inflate(2131624464, viewGroup2, false);
                C18070vi.A0X(inflate12);
                r6 = new C42011xT(inflate12);
                break;
            case 10:
                View inflate13 = LayoutInflater.from(context).inflate(2131624466, viewGroup2, false);
                C18070vi.A0X(inflate13);
                C41231w1 r18 = this.A0Q;
                List list8 = C42011xT.A0I;
                r6 = new AnonymousClass3Y2(inflate13, (AnonymousClass1V9) r18.A00.A02.A1e.get());
                break;
            case 11:
                View inflate14 = LayoutInflater.from(context).inflate(2131625735, viewGroup2, false);
                C18070vi.A0X(inflate14);
                C41241w2 r19 = this.A0R;
                C22821Di r113 = this.A0E;
                List list9 = C42011xT.A0I;
                AnonymousClass10E r110 = r19.A00.A02;
                AnonymousClass10G r111 = r110.A00;
                AnonymousClass733 r93 = (AnonymousClass733) r111.A2s.get();
                r6 = new AnonymousClass3ZJ(inflate14, (C72043Kk) r111.A1j.get(), r93, (C18000vb) r110.ABz.get(), r113);
                break;
            case 12:
                View inflate15 = LayoutInflater.from(context).inflate(2131624441, viewGroup2, false);
                C18070vi.A0X(inflate15);
                C41301w8 r35 = this.A0S;
                C35451mG r29 = this.A04;
                Context context2 = (Context) AnonymousClass114.A00.get();
                AnonymousClass114.A02(r35.A00.BYe().BSy());
                AnonymousClass12Q.A05(r35);
                try {
                    r6 = new C453428o(inflate15, r29);
                    break;
                } finally {
                    AnonymousClass12Q.A04();
                    AnonymousClass114.A02(context2);
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("callsHistoryAdapter/onCreateViewHolder type mismatch: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
        return r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0706, code lost:
        if (r14 == false) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0716, code lost:
        if (r13 != false) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0857, code lost:
        if (X.C29431cG.A18(r5.A0B, r2.A02()) == false) goto L_0x0859;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fa, code lost:
        if (r14 <= 1) goto L_0x01fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0749  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0793  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r23, int r24) {
        /*
            r22 = this;
            r1 = r23
            r3 = r24
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r5 = r22
            int r2 = r5.A0Q()
            if (r3 < r2) goto L_0x0025
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder no item exists at position "
        L_0x0017:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L_0x0021:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r0 = r5.A0U(r3)
            X.1vq r0 = (X.C41121vq) r0
            if (r0 != 0) goto L_0x0035
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder null item at position "
            goto L_0x0017
        L_0x0035:
            double r6 = (double) r3
            double r3 = (double) r2
            r8 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r3 = r3 * r8
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0062
            X.1mJ r2 = r5.A06
            if (r2 == 0) goto L_0x0062
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r2 = r2.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r2 = r2.A0C
            X.1vb r3 = r2.A0R
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x0062
            X.2PI r2 = r3.A02
            if (r2 != 0) goto L_0x0062
            X.2PI r4 = new X.2PI
            r4.<init>(r3)
            r3.A02 = r4
            X.10I r3 = r3.A0R
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]
            r3.CGM(r4, r2)
        L_0x0062:
            int r3 = r0.BTW()
            switch(r3) {
                case 0: goto L_0x09bf;
                case 1: goto L_0x0544;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00c6;
                case 4: goto L_0x09b9;
                case 5: goto L_0x0024;
                case 6: goto L_0x0024;
                case 7: goto L_0x0846;
                case 8: goto L_0x068a;
                case 9: goto L_0x00b5;
                case 10: goto L_0x00a4;
                case 11: goto L_0x065d;
                case 12: goto L_0x0071;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder failed to match type to bind: "
            goto L_0x0017
        L_0x0071:
            X.2yK r0 = (X.C66532yK) r0
            X.28o r1 = (X.C453428o) r1
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.9tr r4 = r0.A00
            X.276 r0 = r1.A00
            if (r0 != 0) goto L_0x0094
            android.view.View r3 = r1.A01
            android.content.Context r2 = r3.getContext()
            X.C18070vi.A0X(r2)
            X.276 r0 = new X.276
            r0.<init>(r2)
            r1.A00 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.addView(r0)
        L_0x0094:
            X.276 r0 = r1.A00
            if (r0 == 0) goto L_0x009d
            X.3iL r0 = r0.A07
            r0.A01(r4)
        L_0x009d:
            X.276 r0 = r1.A00
            if (r0 == 0) goto L_0x0024
            r0.A00 = r1
            return
        L_0x00a4:
            X.0vk r4 = r5.A0D
            if (r4 == 0) goto L_0x0024
            android.view.View r3 = r1.A0H
            r2 = 28
            X.4dM r0 = new X.4dM
            r0.<init>(r1, r4, r2)
            r3.setOnClickListener(r0)
            return
        L_0x00b5:
            X.0vk r3 = r5.A0C
            if (r3 == 0) goto L_0x0024
            android.view.View r2 = r1.A0H
            r1 = 24
            X.4dA r0 = new X.4dA
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            return
        L_0x00c6:
            X.BMN r1 = (X.BMN) r1
            X.2yI r0 = (X.C66512yI) r0
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            X.3Bg r5 = r0.A00
            X.C18070vi.A0X(r5)
            X.2lF r2 = r0.A01
            X.C18070vi.A0X(r2)
            java.util.List r3 = r5.A04
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x09c9
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/bindCall no calls registered"
            goto L_0x0021
        L_0x00e4:
            X.2yP r0 = (X.C66582yP) r0
            X.Bq2 r1 = (X.Bq2) r1
            java.util.Set r3 = r5.A0B
            X.3Bg r2 = r0.A01
            java.lang.String r2 = r2.A02()
            boolean r7 = X.C29431cG.A18(r3, r2)
            r6 = 0
            r1.A00 = r0
            X.2lG r8 = r0.A02
            X.C18070vi.A0X(r8)
            boolean r9 = r8.A0H
            boolean r5 = r1.A0T
            r4 = 8
            if (r5 == 0) goto L_0x0515
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x010a
            if (r9 != 0) goto L_0x012f
        L_0x010a:
            X.0vl r3 = r1.A0K
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            X.2yP r0 = r1.A00
            if (r0 == 0) goto L_0x0512
            X.2lG r0 = r0.A02
            if (r0 == 0) goto L_0x0512
            java.lang.String r0 = r0.A0D
        L_0x011c:
            X.AnonymousClass1Xr.A04(r2, r0)
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = r9 ^ 1
            r0 = 8
            if (r2 == 0) goto L_0x012c
            r0 = 0
        L_0x012c:
            r3.setVisibility(r0)
        L_0x012f:
            boolean r0 = r1.A03
            r2 = 0
            if (r0 == 0) goto L_0x0503
            X.0vl r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r9 != 0) goto L_0x0140
            r2 = 8
        L_0x0140:
            r0.setVisibility(r2)
        L_0x0143:
            java.lang.String r12 = "Required value was null."
            r10 = 1
            if (r9 == 0) goto L_0x045a
            X.0vl r11 = r1.A0J
            java.lang.Object r3 = r11.getValue()
            X.1xh r3 = (X.C42141xh) r3
            X.4ZN r2 = r8.A0B
            if (r2 == 0) goto L_0x0b36
            android.view.View r0 = r1.A0H
            android.content.Context r0 = r0.getContext()
            X.C18070vi.A0X(r0)
            java.lang.CharSequence r2 = r2.A03(r0)
            r0 = 0
            r3.A0B(r0, r2)
            X.0vl r3 = r1.A0M
            java.lang.Object r13 = r3.getValue()
            com.whatsapp.contact.photos.MultiContactThumbnail r13 = (com.whatsapp.contact.photos.MultiContactThumbnail) r13
            java.util.List r12 = r8.A0E
            X.C18070vi.A0X(r12)
            X.1pZ r9 = r1.A0C
            X.1VW r2 = r1.A0A
            X.4kE r0 = new X.4kE
            r0.<init>(r2)
            r13.A00(r0, r9, r12)
            X.0vl r2 = r1.A0N
            java.lang.Object r0 = r2.getValue()
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r2.getValue()
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r0 = r0.A02()
            r0.setVisibility(r4)
        L_0x0197:
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2
            r2.setImportantForAccessibility(r0)
        L_0x01a1:
            android.view.View r12 = r1.A0H
            r0 = 2
            X.1zB[] r9 = new X.C43061zB[r0]
            r3 = 16
            r2 = 2131887696(0x7f120650, float:1.9410006E38)
            X.1zB r0 = new X.1zB
            r0.<init>(r3, r2)
            r9[r6] = r0
            r3 = 32
            r2 = 2131887706(0x7f12065a, float:1.9410027E38)
            X.1zB r0 = new X.1zB
            r0.<init>(r3, r2)
            r9[r10] = r0
            X.AnonymousClass1Y5.A0B(r12, r9)
            java.lang.Object r3 = r11.getValue()
            X.1xh r3 = (X.C42141xh) r3
            android.content.Context r2 = r12.getContext()
            int r0 = r8.A05
            int r2 = X.C19740yt.A00(r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setTextColor(r2)
            X.0vb r0 = r1.A0F
            long r2 = r8.A09
            java.lang.String r2 = X.C64052u8.A08(r0, r2)
            X.C18070vi.A0X(r2)
            r8.A0C = r2
            X.0vl r0 = r1.A0L
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            int r14 = r8.A00
            int r13 = r8.A01
            int r9 = r8.A05
            if (r5 == 0) goto L_0x0407
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0407
            if (r14 > r10) goto L_0x0416
        L_0x01fc:
            X.0vl r9 = r1.A0I
            java.lang.Object r2 = r9.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r0 = r8.A03
            r2.setImageResource(r0)
            java.lang.Object r3 = r9.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r12.getContext()
            int r0 = r8.A04
            int r0 = X.C19740yt.A00(r2, r0)
            X.AnonymousClass4aX.A0D(r3, r0)
            java.lang.Object r3 = r9.getValue()
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r12.getContext()
            int r0 = r8.A02
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            int r10 = r8.A08
            int r9 = r8.A07
            int r3 = r8.A06
            if (r10 == 0) goto L_0x03f4
            X.0vl r2 = r1.A0P
            java.lang.Object r0 = r2.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r10)
            java.lang.Object r0 = r2.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
        L_0x024b:
            if (r9 == 0) goto L_0x03e1
            X.0vl r2 = r1.A0O
            java.lang.Object r0 = r2.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r9)
            java.lang.Object r0 = r2.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
        L_0x0261:
            if (r3 == 0) goto L_0x0316
            X.0vl r0 = r1.A0O
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            android.content.Context r0 = r12.getContext()
            java.lang.String r0 = r0.getString(r3)
        L_0x0273:
            r2.setContentDescription(r0)
            if (r5 != 0) goto L_0x0327
            boolean r2 = r8.A0G
            X.0vl r3 = r1.A0S
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass4aR.A09(r0, r2)
            X.0vl r9 = r1.A0R
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass4aR.A09(r0, r2)
            boolean r5 = r8.A0I
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            if (r5 == 0) goto L_0x029d
            r0 = 0
        L_0x029d:
            r2.setVisibility(r0)
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = r5 ^ 1
            if (r0 == 0) goto L_0x02ab
            r4 = 0
        L_0x02ab:
            r2.setVisibility(r4)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896297(0x7f1227e9, float:1.9427451E38)
            X.Bq2.A00(r2, r8, r0)
            if (r5 != 0) goto L_0x02f2
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            boolean r0 = r8.A0J
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            if (r0 == 0) goto L_0x02f6
            r0 = 2131893163(0x7f121bab, float:1.9421095E38)
            java.lang.String r0 = r4.getString(r0)
            r2.setContentDescription(r0)
            java.lang.Object r2 = r3.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
            r2.setImageResource(r0)
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896298(0x7f1227ea, float:1.9427453E38)
        L_0x02ef:
            X.Bq2.A00(r2, r8, r0)
        L_0x02f2:
            r1.A0D(r7, r6, r6)
            return
        L_0x02f6:
            r0 = 2131898713(0x7f123159, float:1.9432352E38)
            java.lang.String r0 = r4.getString(r0)
            r2.setContentDescription(r0)
            java.lang.Object r2 = r3.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            r2.setImageResource(r0)
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896291(0x7f1227e3, float:1.942744E38)
            goto L_0x02ef
        L_0x0316:
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x031c
            if (r5 != 0) goto L_0x0327
        L_0x031c:
            X.0vl r0 = r1.A0O
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            goto L_0x0273
        L_0x0327:
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x032f
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x0358
        L_0x032f:
            X.0vl r4 = r1.A0R
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r8.A0G
            X.AnonymousClass4aR.A09(r2, r0)
            java.lang.Object r3 = r4.getValue()
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r8.A0I
            r0 = 8
            if (r2 == 0) goto L_0x0349
            r0 = 0
        L_0x0349:
            r3.setVisibility(r0)
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896297(0x7f1227e9, float:1.9427451E38)
            X.Bq2.A00(r2, r8, r0)
        L_0x0358:
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0360
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x03b9
        L_0x0360:
            X.0vl r4 = r1.A0S
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r8.A0G
            X.AnonymousClass4aR.A09(r2, r0)
            java.lang.Object r3 = r4.getValue()
            android.view.View r3 = (android.view.View) r3
            boolean r0 = r8.A0I
            r2 = r0 ^ 1
            r0 = 8
            if (r2 == 0) goto L_0x037c
            r0 = 0
        L_0x037c:
            r3.setVisibility(r0)
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x03b9
            java.lang.Object r0 = r4.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r3 = r0.getContext()
            boolean r0 = r8.A0J
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            if (r0 == 0) goto L_0x03c1
            r0 = 2131893163(0x7f121bab, float:1.9421095E38)
            java.lang.String r0 = r3.getString(r0)
            r2.setContentDescription(r0)
            java.lang.Object r2 = r4.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
            r2.setImageResource(r0)
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896298(0x7f1227ea, float:1.9427453E38)
        L_0x03b6:
            X.Bq2.A00(r2, r8, r0)
        L_0x03b9:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x02f2
            if (r7 == 0) goto L_0x0024
            goto L_0x02f2
        L_0x03c1:
            r0 = 2131898713(0x7f123159, float:1.9432352E38)
            java.lang.String r0 = r3.getString(r0)
            r2.setContentDescription(r0)
            java.lang.Object r2 = r4.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            r2.setImageResource(r0)
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131896291(0x7f1227e3, float:1.942744E38)
            goto L_0x03b6
        L_0x03e1:
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x03e7
            if (r5 != 0) goto L_0x0261
        L_0x03e7:
            X.0vl r0 = r1.A0O
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            goto L_0x0261
        L_0x03f4:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x03fa
            if (r5 != 0) goto L_0x024b
        L_0x03fa:
            X.0vl r0 = r1.A0P
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            goto L_0x024b
        L_0x0407:
            if (r14 > r10) goto L_0x0416
            X.0vl r0 = r1.A0H
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            goto L_0x01fc
        L_0x0416:
            X.0vl r3 = r1.A0H
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            java.lang.Object r2 = r3.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r12.getContext()
            int r0 = X.C19740yt.A00(r0, r9)
            r2.setTextColor(r0)
            java.lang.Object r0 = r11.getValue()
            X.1xh r0 = (X.C42141xh) r0
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setEllipsize(r2)
            java.lang.Object r9 = r3.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r3 = r12.getContext()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2[r6] = r0
            java.lang.String r0 = r3.getString(r13, r2)
            r9.setText(r0)
            goto L_0x01fc
        L_0x045a:
            X.1E7 r13 = r8.A0A
            if (r13 == 0) goto L_0x0b3c
            X.1pZ r2 = r1.A0D
            X.0vl r12 = r1.A0K
            java.lang.Object r0 = r12.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A07(r0, r13)
            X.4ZN r2 = r8.A0B
            r14 = 0
            if (r2 == 0) goto L_0x0501
            android.view.View r0 = r1.A0H
            android.content.Context r0 = r0.getContext()
            X.C18070vi.A0X(r0)
            java.lang.CharSequence r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x0501
            java.lang.String r3 = r0.toString()
        L_0x0483:
            X.1Me r2 = r1.A0B
            r0 = 2131898919(0x7f123227, float:1.943277E38)
            java.lang.String r9 = X.C24921Me.A03(r2, r13, r0)
            X.2lf r2 = r13.A0H
            X.0vl r11 = r1.A0J
            java.lang.Object r0 = r11.getValue()
            X.1xh r0 = (X.C42141xh) r0
            if (r2 == 0) goto L_0x04d6
            r0.A0B(r14, r3)
        L_0x049b:
            X.0vl r2 = r1.A0N
            java.lang.Object r0 = r2.getValue()
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x04b2
            java.lang.Object r2 = r2.getValue()
            X.1bI r2 = (X.C28931bI) r2
            r0 = 8
        L_0x04af:
            r2.A04(r0)
        L_0x04b2:
            java.lang.Object r14 = r12.getValue()
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r0 = r12.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r9 = r0.getContext()
            r3 = 2131887795(0x7f1206b3, float:1.9410207E38)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r0 = r13.A0K()
            r2[r6] = r0
            java.lang.String r0 = r9.getString(r3, r2)
            r14.setContentDescription(r0)
            goto L_0x01a1
        L_0x04d6:
            r0.A0B(r14, r3)
            if (r9 == 0) goto L_0x049b
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x049b
            X.0vl r3 = r1.A0N
            java.lang.Object r0 = r3.getValue()
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r2 = r0.A02()
            r0 = 2131434236(0x7f0b1afc, float:1.849028E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r9)
            java.lang.Object r2 = r3.getValue()
            X.1bI r2 = (X.C28931bI) r2
            r0 = 0
            goto L_0x04af
        L_0x0501:
            r3 = r14
            goto L_0x0483
        L_0x0503:
            if (r9 == 0) goto L_0x0143
            X.0vl r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            goto L_0x0143
        L_0x0512:
            r0 = 0
            goto L_0x011c
        L_0x0515:
            X.0vl r3 = r1.A0K
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.String r0 = r8.A0D
            X.AnonymousClass1Xr.A04(r2, r0)
            X.0vl r0 = r1.A0M
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            if (r9 == 0) goto L_0x052f
            r0 = 0
        L_0x052f:
            r2.setVisibility(r0)
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = r9 ^ 1
            r0 = 8
            if (r2 == 0) goto L_0x053f
            r0 = 0
        L_0x053f:
            r3.setVisibility(r0)
            goto L_0x0143
        L_0x0544:
            X.2yM r0 = (X.C66552yM) r0
            java.util.Set r4 = r5.A0A
            com.whatsapp.jid.UserJid r3 = r0.A00
            java.lang.String r2 = r3.getRawString()
            boolean r6 = r4.contains(r2)
            X.2CV r1 = (X.AnonymousClass2CV) r1
            r1.A00 = r0
            X.1M9 r2 = r1.A02
            X.1E7 r8 = r2.A0H(r3)
            X.1pZ r3 = r1.A03
            X.0vl r7 = r1.A07
            java.lang.Object r2 = r7.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.A07(r2, r8)
            X.0vl r4 = r1.A06
            java.lang.Object r3 = r4.getValue()
            X.1xh r3 = (X.C42141xh) r3
            java.util.List r2 = r0.A01
            r3.A0A(r8, r2)
            android.view.View r5 = r1.A0H
            android.content.Context r2 = r5.getContext()
            X.C18070vi.A0X(r2)
            X.0ve r2 = X.AnonymousClass1J8.A00(r2)
            boolean r2 = X.AnonymousClass1J8.A09(r2)
            if (r2 != 0) goto L_0x0598
            boolean r3 = r0.A02
            java.lang.Object r2 = r4.getValue()
            X.1xh r2 = (X.C42141xh) r2
            com.whatsapp.TextEmojiLabel r2 = r2.A01
            if (r3 != 0) goto L_0x0658
            X.C43421zm.A04(r2)
        L_0x0598:
            X.C18070vi.A0b(r8)
            X.1mB r2 = r1.A01
            if (r2 != 0) goto L_0x05e0
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x05a4:
            r0 = 0
            r1.A0D(r6, r0, r0)
            X.0ve r3 = r1.A04
            X.0vf r2 = X.C18040vf.A01
            r0 = 11506(0x2cf2, float:1.6123E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0024
            X.0vl r3 = r1.A0A
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131169543(0x7f071107, float:1.795342E38)
            int r2 = r2.getDimensionPixelSize(r0)
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C42491yG.A08(r0, r2)
            X.0vl r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C42491yG.A08(r0, r2)
            return
        L_0x05e0:
            X.0vl r10 = r1.A0A
            java.lang.Object r3 = r10.getValue()
            android.view.View r3 = (android.view.View) r3
            X.0vl r4 = r1.A05
            java.lang.Object r2 = r4.getValue()
            X.2vF r2 = (X.C64732vF) r2
            r3.setOnTouchListener(r2)
            X.0vl r9 = r1.A09
            java.lang.Object r3 = r9.getValue()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r4.getValue()
            X.2vF r2 = (X.C64732vF) r2
            r3.setOnTouchListener(r2)
            r3 = 16
            X.48l r2 = new X.48l
            r2.<init>(r1, r3)
            r5.setOnClickListener(r2)
            java.lang.Object r4 = r10.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 25
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r8, (int) r3)
            r4.setOnClickListener(r2)
            java.lang.Object r4 = r9.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 26
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r8, (int) r3)
            r4.setOnClickListener(r2)
            java.lang.Object r4 = r7.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 21
            X.48h r2 = new X.48h
            r2.<init>(r0, r1, r3)
            r4.setOnClickListener(r2)
            java.lang.Object r3 = r7.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 3
            X.4do r0 = new X.4do
            r0.<init>(r1, r2)
            r3.setOnLongClickListener(r0)
            r2 = 4
            X.4do r0 = new X.4do
            r0.<init>(r1, r2)
            r5.setOnLongClickListener(r0)
            goto L_0x05a4
        L_0x0658:
            r2.A0L()
            goto L_0x0598
        L_0x065d:
            X.3ZJ r1 = (X.AnonymousClass3ZJ) r1
            X.2yL r0 = (X.C66542yL) r0
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.3Kk r3 = r1.A01
            android.view.View r5 = r1.A00
            r2 = 2131432903(0x7f0b15c7, float:1.8487577E38)
            X.1xh r4 = X.C42141xh.A01(r5, r3, r2)
            com.whatsapp.TextEmojiLabel r3 = r4.A01
            r2 = 2
            r3.setImportantForAccessibility(r2)
            X.C43421zm.A04(r3)
            X.1E7 r3 = r0.A00
            r2 = -1
            r4.A08(r3, r2)
            r3 = 26
            X.4dM r2 = new X.4dM
            r2.<init>(r0, r1, r3)
            r5.setOnClickListener(r2)
            return
        L_0x068a:
            X.2yN r0 = (X.C66562yN) r0
            java.util.Set r3 = r5.A0A
            com.whatsapp.jid.GroupJid r10 = r0.A00
            java.lang.String r2 = r10.getRawString()
            boolean r5 = r3.contains(r2)
            X.2CW r1 = (X.AnonymousClass2CW) r1
            r1.A00 = r0
            X.1M9 r2 = r1.A04
            X.1E7 r6 = r2.A0H(r10)
            X.1pZ r3 = r1.A05
            X.0vl r7 = r1.A0B
            java.lang.Object r2 = r7.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.A07(r2, r6)
            X.0vl r4 = r1.A0A
            java.lang.Object r3 = r4.getValue()
            X.1xh r3 = (X.C42141xh) r3
            java.util.List r2 = r0.A01
            r3.A0A(r6, r2)
            X.0ve r8 = r1.A08
            boolean r2 = X.AnonymousClass1J8.A09(r8)
            if (r2 != 0) goto L_0x06d3
            boolean r3 = r0.A02
            java.lang.Object r2 = r4.getValue()
            X.1xh r2 = (X.C42141xh) r2
            com.whatsapp.TextEmojiLabel r2 = r2.A01
            if (r3 != 0) goto L_0x0841
            X.C43421zm.A04(r2)
        L_0x06d3:
            X.0vl r11 = r1.A0F
            java.lang.Object r2 = r11.getValue()
            android.view.View r2 = (android.view.View) r2
            android.content.Context r4 = r2.getContext()
            X.11S r12 = r1.A02
            X.1MZ r9 = r1.A07
            X.1MW r2 = r9.A08
            int r3 = r2.A0A(r10)
            r2 = 0
            boolean r15 = X.C40811vJ.A0J(r12, r8, r3, r2)
            X.1CJ r3 = r1.A06
            X.0zA r2 = r1.A01
            r19 = r6
            r20 = r8
            r21 = r10
            r16 = r2
            r17 = r3
            r18 = r9
            boolean r14 = X.C63982u1.A07(r16, r17, r18, r19, r20, r21)
            r12 = 0
            if (r15 != 0) goto L_0x0708
            r13 = 1
            if (r14 != 0) goto L_0x0709
        L_0x0708:
            r13 = 0
        L_0x0709:
            java.lang.Object r3 = r11.getValue()
            android.view.View r3 = (android.view.View) r3
            X.C18070vi.A0X(r3)
            if (r15 != 0) goto L_0x0718
            r2 = 8
            if (r13 == 0) goto L_0x0719
        L_0x0718:
            r2 = 0
        L_0x0719:
            r3.setVisibility(r2)
            if (r15 == 0) goto L_0x0824
            java.lang.Object r3 = r11.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 2131893163(0x7f121bab, float:1.9421095E38)
            java.lang.String r2 = r4.getString(r2)
            r3.setContentDescription(r2)
            java.lang.Object r3 = r11.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2 = 2131233309(0x7f080a1d, float:1.8082752E38)
        L_0x0737:
            r3.setImageResource(r2)
        L_0x073a:
            X.0vl r10 = r1.A0E
            java.lang.Object r3 = r10.getValue()
            android.view.View r3 = (android.view.View) r3
            X.C18070vi.A0X(r3)
            r2 = 8
            if (r14 == 0) goto L_0x074a
            r2 = 0
        L_0x074a:
            r3.setVisibility(r2)
            X.0vl r9 = r1.A0C
            java.lang.Object r2 = r9.getValue()
            X.1bI r2 = (X.C28931bI) r2
            if (r13 != 0) goto L_0x0820
            if (r15 != 0) goto L_0x0820
        L_0x0759:
            r2.A04(r12)
            if (r14 == 0) goto L_0x0785
            X.0vf r3 = X.C18040vf.A01
            r2 = 11506(0x2cf2, float:1.6123E-41)
            boolean r2 = X.C18020vd.A05(r3, r8, r2)
            if (r2 == 0) goto L_0x0785
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131169543(0x7f071107, float:1.795342E38)
            int r3 = r3.getDimensionPixelSize(r2)
            java.lang.Object r2 = r11.getValue()
            android.view.View r2 = (android.view.View) r2
            X.C42491yG.A08(r2, r3)
            java.lang.Object r2 = r10.getValue()
            android.view.View r2 = (android.view.View) r2
            X.C42491yG.A08(r2, r3)
        L_0x0785:
            X.1mB r8 = r1.A03
            if (r8 != 0) goto L_0x0793
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x078e:
            r0 = 0
            r1.A0D(r5, r0, r0)
            return
        L_0x0793:
            java.lang.Object r3 = r11.getValue()
            android.view.View r3 = (android.view.View) r3
            X.0vl r4 = r1.A09
            java.lang.Object r2 = r4.getValue()
            X.2vF r2 = (X.C64732vF) r2
            r3.setOnTouchListener(r2)
            java.lang.Object r3 = r10.getValue()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r4.getValue()
            X.2vF r2 = (X.C64732vF) r2
            r3.setOnTouchListener(r2)
            java.lang.Object r4 = r11.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 28
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r6, (int) r3)
            r4.setOnClickListener(r2)
            java.lang.Object r4 = r10.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 29
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r6, (int) r3)
            r4.setOnClickListener(r2)
            java.lang.Object r4 = r9.getValue()
            X.1bI r4 = (X.C28931bI) r4
            r3 = 25
            X.4dM r2 = new X.4dM
            r2.<init>(r1, r6, r3)
            r4.A05(r2)
            android.view.View r6 = r1.A0H
            r3 = 18
            X.48l r2 = new X.48l
            r2.<init>(r1, r3)
            r6.setOnClickListener(r2)
            java.lang.Object r4 = r7.getValue()
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r7.getValue()
            com.whatsapp.components.button.ThumbnailButton r3 = (com.whatsapp.components.button.ThumbnailButton) r3
            X.C18070vi.A0X(r3)
            X.48k r2 = new X.48k
            r2.<init>(r0, r8, r1, r3)
            r4.setOnClickListener(r2)
            java.lang.Object r3 = r7.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 5
            X.4do r0 = new X.4do
            r0.<init>(r1, r2)
            r3.setOnLongClickListener(r0)
            r2 = 6
            X.4do r0 = new X.4do
            r0.<init>(r1, r2)
            r6.setOnLongClickListener(r0)
            goto L_0x078e
        L_0x0820:
            r12 = 8
            goto L_0x0759
        L_0x0824:
            if (r13 == 0) goto L_0x073a
            java.lang.Object r3 = r11.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 2131898713(0x7f123159, float:1.9432352E38)
            java.lang.String r2 = r4.getString(r2)
            r3.setContentDescription(r2)
            java.lang.Object r3 = r11.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2 = 2131231762(0x7f080412, float:1.8079614E38)
            goto L_0x0737
        L_0x0841:
            r2.A0L()
            goto L_0x06d3
        L_0x0846:
            X.3Bg r2 = r0.BO2()
            if (r2 == 0) goto L_0x0859
            java.util.Set r3 = r5.A0B
            java.lang.String r2 = r2.A02()
            boolean r2 = X.C29431cG.A18(r3, r2)
            r7 = 1
            if (r2 != 0) goto L_0x085a
        L_0x0859:
            r7 = 0
        L_0x085a:
            X.3mP r1 = (X.C76033mP) r1
            X.2yJ r0 = (X.C66522yJ) r0
            X.1mI r6 = r5.A05
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            X.2lB r4 = r0.A03
            X.C18070vi.A0X(r4)
            X.1M9 r3 = r1.A07
            X.1BI r2 = r0.A04
            X.1E7 r8 = r3.A0H(r2)
            r1.A05 = r8
            boolean r2 = r4.A09
            r1.A06 = r2
            long r2 = r0.A01
            r1.A01 = r2
            int r2 = r4.A01
            r1.A00 = r2
            X.3Bg r2 = r0.A02
            r1.A02 = r2
            r1.A03 = r0
            X.1pZ r2 = r1.A08
            java.lang.String r10 = "Required value was null."
            X.0vl r9 = r1.A0A
            java.lang.Object r0 = r9.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A07(r0, r8)
            android.view.View r8 = r1.A0H
            r0 = 2131434818(0x7f0b1d42, float:1.849146E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r8, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = r4.A07
            r2.setText(r0)
            X.0vl r0 = r1.A0B
            java.lang.Object r3 = r0.getValue()
            X.1xh r3 = (X.C42141xh) r3
            X.1E7 r2 = r1.A05
            if (r2 == 0) goto L_0x09b3
            r0 = -1
            r3.A08(r2, r0)
            int r3 = r1.A00
            r2 = 1
            X.0vl r0 = r1.A0C
            if (r3 != r2) goto L_0x096c
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            X.0vl r0 = r1.A0D
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            r2.setVisibility(r0)
        L_0x08d1:
            X.0vl r10 = r1.A09
            java.lang.Object r3 = r10.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r8.getContext()
            int r0 = r4.A04
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r2, r0)
            r3.setImageDrawable(r0)
            java.lang.Object r3 = r10.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r8.getContext()
            int r0 = r4.A05
            int r0 = X.C19740yt.A00(r2, r0)
            r3.setColorFilter(r0)
            java.lang.Object r3 = r10.getValue()
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r8.getContext()
            int r0 = r4.A03
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.String r0 = r4.A08
            X.AnonymousClass1Xr.A04(r2, r0)
            if (r6 != 0) goto L_0x0936
            r2 = 0
            r8.setOnClickListener(r2)
            r8.setOnLongClickListener(r2)
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setOnClickListener(r2)
            java.lang.Object r0 = r10.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setOnClickListener(r2)
        L_0x0932:
            r1.A0D(r7, r5, r5)
            return
        L_0x0936:
            r1.A04 = r6
            r2 = 20
            X.48l r0 = new X.48l
            r0.<init>(r1, r2)
            r8.setOnClickListener(r0)
            r2 = 3
            X.4dp r0 = new X.4dp
            r0.<init>(r6, r1, r2)
            r8.setOnLongClickListener(r0)
            java.lang.Object r3 = r9.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 19
            X.48l r0 = new X.48l
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            java.lang.Object r3 = r10.getValue()
            android.view.View r3 = (android.view.View) r3
            r2 = 27
            X.4dM r0 = new X.4dM
            r0.<init>(r1, r6, r2)
            r3.setOnClickListener(r0)
            goto L_0x0932
        L_0x096c:
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            r2.setVisibility(r0)
            X.0vl r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            r0 = 2131428638(0x7f0b051e, float:1.8478926E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r8, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r8.getContext()
            int r0 = r4.A00
            int r0 = X.C19740yt.A00(r2, r0)
            r3.setColorFilter(r0)
            r0 = 2131434817(0x7f0b1d41, float:1.8491459E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r8, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.4ZN r2 = r4.A06
            android.content.Context r0 = r8.getContext()
            X.C18070vi.A0X(r0)
            java.lang.CharSequence r0 = r2.A03(r0)
            r3.setText(r0)
            goto L_0x08d1
        L_0x09b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x09b9:
            X.3Zb r1 = (X.C74243Zb) r1
            r1.A0B()
            return
        L_0x09bf:
            X.5nL r1 = (X.C113595nL) r1
            X.1vr r0 = (X.C41131vr) r0
            X.0ve r2 = r5.A0G
            r1.A0B(r0, r2)
            return
        L_0x09c9:
            java.util.List r3 = r5.A03()
            java.lang.Object r7 = r3.get(r4)
            X.1E7 r6 = r0.A02
            if (r6 == 0) goto L_0x09e2
            X.1pZ r5 = r1.A01
            X.0vl r3 = r1.A04
            java.lang.Object r3 = r3.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.A07(r3, r6)
        L_0x09e2:
            android.view.View r8 = r1.A0H
            android.content.Context r3 = r8.getContext()
            X.4ZN r5 = r2.A05
            X.C18070vi.A0b(r3)
            java.lang.CharSequence r5 = r5.A03(r3)
            java.lang.String r6 = r5.toString()
            X.0vl r5 = r1.A02
            java.lang.Object r9 = r5.getValue()
            X.1xh r9 = (X.C42141xh) r9
            r5 = 0
            r9.A0B(r5, r6)
            X.4ZN r10 = r2.A06
            if (r10 == 0) goto L_0x0a14
            X.0vl r5 = r1.A06
            java.lang.Object r9 = r5.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r5 = r10.A03(r3)
            r9.setText(r5)
        L_0x0a14:
            X.0vl r9 = r1.A06
            java.lang.Object r10 = r9.getValue()
            com.whatsapp.wds.components.button.WDSButton r10 = (com.whatsapp.wds.components.button.WDSButton) r10
            int r5 = r2.A00
            r10.setIcon((int) r5)
            X.0vl r5 = r1.A07
            java.lang.Object r10 = r5.getValue()
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.4ZN r5 = r2.A07
            java.lang.CharSequence r5 = r5.A03(r3)
            r10.setText(r5)
            X.4ZN r11 = r2.A04
            r10 = 8
            if (r11 == 0) goto L_0x0aac
            X.0vl r13 = r1.A08
            java.lang.Object r5 = r13.getValue()
            X.1bI r5 = (X.C28931bI) r5
            r5.A04(r4)
            java.lang.Object r5 = r13.getValue()
            X.1bI r5 = (X.C28931bI) r5
            android.view.View r12 = r5.A02()
            X.C18070vi.A0X(r12)
            com.whatsapp.TextEmojiLabel r12 = (com.whatsapp.TextEmojiLabel) r12
            java.lang.CharSequence r11 = r11.A03(r3)
            r5 = 0
            r12.A0S(r11, r5, r4, r4)
            java.lang.Object r5 = r13.getValue()
            X.1bI r5 = (X.C28931bI) r5
            android.view.View r12 = r5.A02()
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11 = 2130971770(0x7f040c7a, float:1.7552288E38)
            r5 = 2131102896(0x7f060cb0, float:1.7818243E38)
            int r5 = X.AnonymousClass1YL.A00(r3, r11, r5)
            int r5 = X.C19740yt.A00(r3, r5)
            r12.setTextColor(r5)
        L_0x0a77:
            boolean r5 = r2.A0G
            if (r5 == 0) goto L_0x0ae7
            java.util.List r10 = r2.A0A
            X.C18070vi.A0X(r10)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r11 = r10.iterator()
        L_0x0a89:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x0ab8
            java.lang.Object r13 = r11.next()
            X.1E7 r13 = (X.AnonymousClass1E7) r13
            X.C18070vi.A0b(r13)
            r18 = 1
            r17 = -1
            java.lang.Integer r14 = X.AnonymousClass00R.A00
            r15 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iR r12 = new X.4iR
            r12.<init>(r13, r14, r15, r17, r18)
            r5.add(r12)
            goto L_0x0a89
        L_0x0aac:
            X.0vl r5 = r1.A08
            java.lang.Object r5 = r5.getValue()
            X.1bI r5 = (X.C28931bI) r5
            r5.A04(r10)
            goto L_0x0a77
        L_0x0ab8:
            X.4ZN r11 = r2.A08
            if (r11 == 0) goto L_0x0ad0
            r16 = 2131103234(0x7f060e02, float:1.7818928E38)
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r14 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iS r10 = new X.4iS
            r17 = r4
            r10.<init>(r11, r12, r14, r16, r17)
            r5.add(r10)
        L_0x0ad0:
            X.0vl r11 = r1.A03
            java.lang.Object r10 = r11.getValue()
            android.view.View r10 = (android.view.View) r10
            r10.setVisibility(r4)
            java.lang.Object r10 = r11.getValue()
            com.whatsapp.calling.PeerAvatarLayout r10 = (com.whatsapp.calling.PeerAvatarLayout) r10
            X.3WM r10 = r10.A05
            r10.A0W(r5)
            goto L_0x0af2
        L_0x0ae7:
            X.0vl r5 = r1.A03
            java.lang.Object r5 = r5.getValue()
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r10)
        L_0x0af2:
            int r10 = r2.A02
            int r5 = r2.A01
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r6
            java.lang.String r4 = r3.getString(r10, r2)
            java.lang.String r2 = r3.getString(r5)
            X.AnonymousClass4aR.A07(r8, r4, r2)
            X.1mC r2 = r1.A00
            if (r2 != 0) goto L_0x0b13
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/setEventListeners event listener empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0b0f:
            X.C42491yG.A02(r8)
            return
        L_0x0b13:
            X.0vl r2 = r1.A05
            java.lang.Object r4 = r2.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 30
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r7, (java.lang.Object) r0, (int) r3)
            r4.setOnClickListener(r2)
            java.lang.Object r4 = r9.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 31
            X.4dV r2 = new X.4dV
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r7, (java.lang.Object) r0, (int) r3)
            r4.setOnClickListener(r2)
            goto L_0x0b0f
        L_0x0b36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0b3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41261w4.Bmc(X.1xT, int):void");
    }
}
