package com.whatsapp.calling.participantlist.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass10J;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1TB;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3VX;
import X.AnonymousClass4XN;
import X.AnonymousClass4YS;
import X.C131796lg;
import X.C175258yP;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18030ve;
import X.C18140vp;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C27621Wu;
import X.C41111vp;
import X.C41731wy;
import X.C72463Mc;
import X.C86534Sa;
import X.C94164k9;
import android.os.CountDownTimer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ParticipantsListViewModel extends AnonymousClass3VX {
    public C131796lg A00;
    public Runnable A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11S A05;
    public final C175258yP A06;
    public final AnonymousClass4YS A07;
    public final AnonymousClass4XN A08;
    public final AnonymousClass1V9 A09;
    public final AnonymousClass1M9 A0A;
    public final C24921Me A0B;
    public final AnonymousClass1TB A0C;
    public final AnonymousClass1MW A0D;
    public final C18030ve A0E;
    public final C41111vp A0F;
    public final C41731wy A0G;
    public final C41731wy A0H;
    public final C41731wy A0I;
    public final AnonymousClass10I A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final Map A0M;
    public final Set A0N = C17880vN.A12();
    public final C18140vp A0O;
    public final AnonymousClass1DT A0P;
    public final AnonymousClass1DT A0Q;
    public final C23581Gv A0R;
    public final C24671Lf A0S;
    public final AnonymousClass1DC A0T;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4RJ] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.4RJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r1 = (X.C76533nV) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (r10.A00 != 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C76533nV A03(X.C135656sY r10, com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r11, boolean r12, boolean r13) {
        /*
            com.whatsapp.jid.UserJid r7 = r10.A01
            X.1M9 r0 = r11.A0A
            X.1E7 r6 = r0.A0H(r7)
            X.0vp r0 = r11.A0O
            boolean r9 = X.C72463Mc.A1Z(r0)
            X.1vp r0 = r11.A0F
            boolean r8 = X.C72463Mc.A1O(r0)
            r5 = 1
            r4 = 0
            if (r9 == 0) goto L_0x001f
            if (r8 != 0) goto L_0x001f
            int r0 = r10.A00
            r3 = 1
            if (r0 == r5) goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            X.1DT r1 = r11.A02
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x007f
            java.util.List r0 = X.AnonymousClass3MW.A10(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r2.next()
            X.4Sg r1 = (X.C86594Sg) r1
            boolean r0 = r1 instanceof X.C76533nV
            if (r0 == 0) goto L_0x0030
            X.3nV r1 = (X.C76533nV) r1
            X.1BI r0 = r1.A03
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0030
            X.4RJ r2 = new X.4RJ
            r2.<init>()
            r2.A00(r1)
            r2.A04 = r4
            r2.A03 = r7
            r2.A05 = r12
            r2.A02 = r6
            int r0 = r10.A00
            r2.A00 = r0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            r5 = 0
        L_0x0065:
            r2.A07 = r5
            r2.A06 = r3
        L_0x0069:
            boolean r7 = r2.A04
            X.1BI r4 = r2.A03
            boolean r8 = r2.A05
            X.1E7 r3 = r2.A02
            int r5 = r2.A00
            boolean r9 = r2.A07
            boolean r10 = r2.A06
            int r6 = r2.A01
            X.3nV r2 = new X.3nV
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L_0x007f:
            X.4RJ r2 = new X.4RJ
            r2.<init>()
            r2.A04 = r4
            r2.A03 = r7
            r2.A05 = r12
            r2.A02 = r6
            int r0 = r10.A00
            r2.A00 = r0
            if (r8 != 0) goto L_0x0095
            if (r9 != 0) goto L_0x0095
            r5 = 0
        L_0x0095:
            r2.A07 = r5
            r2.A06 = r3
            if (r13 == 0) goto L_0x009e
            if (r12 == 0) goto L_0x009e
            r4 = 2
        L_0x009e:
            r2.A01 = r4
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.A03(X.6sY, com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel, boolean, boolean):X.3nV");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.4RJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r1 = (X.C76533nV) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A04(com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r12, X.AnonymousClass1BI r13, int r14) {
        /*
            X.1DT r0 = r12.A02
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()
            X.4Sg r4 = (X.C86594Sg) r4
            boolean r0 = r4 instanceof X.C76533nV
            if (r0 == 0) goto L_0x0049
            r1 = r4
            X.3nV r1 = (X.C76533nV) r1
            X.1BI r0 = r1.A03
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0049
            X.4RJ r0 = new X.4RJ
            r0.<init>()
            r0.A00(r1)
            r8 = r14
            r0.A01 = r14
            boolean r9 = r0.A04
            X.1BI r6 = r0.A03
            boolean r10 = r0.A05
            X.1E7 r5 = r0.A02
            int r7 = r0.A00
            boolean r11 = r0.A07
            boolean r12 = r0.A06
            X.3nV r4 = new X.3nV
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0049:
            r2.add(r4)
            goto L_0x000e
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.A04(com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel, X.1BI, int):java.util.ArrayList");
    }

    public void A0S() {
        this.A06.unregisterObserver(this);
        this.A0S.unregisterObserver(this.A0R);
        Iterator A0l = C17890vO.A0l(this.A0M);
        while (A0l.hasNext()) {
            ((CountDownTimer) A0l.next()).cancel();
        }
        Runnable runnable = this.A01;
        if (runnable != null && (this.A0J instanceof AnonymousClass10J)) {
            AnonymousClass10J.A08.remove(runnable);
        }
    }

    public void A0T() {
        if (C72463Mc.A1Z(this.A0O)) {
            this.A07.A02(C27621Wu.A00);
        }
        C175258yP r2 = this.A06;
        C86534Sa A072 = r2.A07();
        if (A072.A0D == null) {
            C17960vV.A0F(false, "CallDataSource/updateShareCallLinkOption/ call link token is null");
        } else {
            C17890vO.A0r(r2, A072, 2);
        }
    }

    public ParticipantsListViewModel(AnonymousClass190 r6, AnonymousClass11S r7, C175258yP r8, AnonymousClass4XN r9, AnonymousClass1V9 r10, AnonymousClass1M9 r11, C24671Lf r12, C24921Me r13, AnonymousClass1TB r14, AnonymousClass1MW r15, C18030ve r16, AnonymousClass1DC r17, AnonymousClass10I r18, AnonymousClass00H r19, AnonymousClass00H r20, C18140vp r21) {
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M((Object) null);
        this.A03 = A0M2;
        this.A02 = AnonymousClass3MW.A0L();
        this.A0F = AnonymousClass3MW.A0n(false);
        this.A0I = AnonymousClass3MW.A0o();
        this.A0G = AnonymousClass3MW.A0o();
        C94164k9 r2 = new C94164k9(this, 4);
        this.A0R = r2;
        this.A0H = new C41731wy((Object) null);
        this.A07 = new AnonymousClass4YS(false);
        this.A0Q = AnonymousClass3MW.A0M((Object) null);
        this.A0P = AnonymousClass3MW.A0M((Object) null);
        this.A0M = C17880vN.A11();
        this.A01 = null;
        this.A0E = r16;
        this.A04 = r6;
        this.A05 = r7;
        this.A0J = r18;
        this.A0C = r14;
        this.A06 = r8;
        this.A0A = r11;
        this.A0B = r13;
        this.A0T = r17;
        this.A0K = r19;
        this.A0S = r12;
        this.A0L = r20;
        this.A0D = r15;
        this.A09 = r10;
        C18140vp r0 = r21;
        this.A0O = r0;
        this.A08 = r9;
        r8.registerObserver(this);
        AnonymousClass3VX.A00(r8, this);
        r12.registerObserver(r2);
        if (!C72463Mc.A1Z(r0)) {
            A0M2.A0F(AnonymousClass3MX.A0t(2131898039));
        }
    }
}
