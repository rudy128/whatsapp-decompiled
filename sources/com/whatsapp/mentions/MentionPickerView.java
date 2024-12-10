package com.whatsapp.mentions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1IZ;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass28K;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3XO;
import X.AnonymousClass3XY;
import X.AnonymousClass4DV;
import X.AnonymousClass5Y5;
import X.AnonymousClass5a8;
import X.C18000vb;
import X.C18030ve;
import X.C22971Dz;
import X.C24751Ln;
import X.C24921Me;
import X.C27201Vd;
import X.C32091gc;
import X.C32951i1;
import X.C70813Cp;
import X.C72043Kk;
import X.C72463Mc;
import X.C77913rm;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class MentionPickerView extends C77913rm {
    public LinearLayoutManager A00;
    public RecyclerView A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11S A03;
    public C72043Kk A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C27201Vd A07;
    public C32951i1 A08;
    public AnonymousClass11P A09;
    public C18000vb A0A;
    public AnonymousClass1CJ A0B;
    public AnonymousClass122 A0C;
    public AnonymousClass1MZ A0D;
    public C24751Ln A0E;
    public AnonymousClass1BI A0F;
    public AnonymousClass1EC A0G;
    public AnonymousClass5a8 A0H;
    public C32091gc A0I;
    public AnonymousClass3XO A0J;
    public AnonymousClass10I A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public volatile boolean A0R;

    public static void A02(MentionPickerView mentionPickerView) {
        if (mentionPickerView.A0F != null) {
            int A1O = mentionPickerView.A00.A1O();
            int A1Q = mentionPickerView.A00.A1Q();
            while (A1O <= A1Q) {
                if (mentionPickerView.A0J.getItemViewType(A1O) != 8 || mentionPickerView.A0Q) {
                    A1O++;
                } else {
                    mentionPickerView.A08.A0D(mentionPickerView.A0F, AnonymousClass00R.A00);
                    mentionPickerView.A0Q = true;
                    return;
                }
            }
        }
    }

    public boolean BEB() {
        return this.A0N;
    }

    public void CMX() {
        A07(this.A0J.A06.size(), getResources().getDimensionPixelSize(2131167710));
    }

    public View getContentView() {
        return this.A01;
    }

    public AnonymousClass4DV getType() {
        return AnonymousClass4DV.MENTION;
    }

    public void setup(AnonymousClass5Y5 r19, Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass1BI A0f = C72463Mc.A0f(bundle2, "ARG_JID");
        boolean z = bundle2.getBoolean("ARG_IS_DARK_THEME");
        boolean z2 = bundle2.getBoolean("ARG_HIDE_END_DIVIDER");
        boolean z3 = bundle2.getBoolean("ARG_WITH_BACKGROUND");
        boolean z4 = bundle2.getBoolean("ARG_INCLUDE_BOT_CONTACTS");
        this.A0F = A0f;
        this.A0G = AnonymousClass3MW.A0i(A0f);
        this.A00 = new LinearLayoutManager(getContext());
        RecyclerView A0Q2 = AnonymousClass3MX.A0Q(this, 2131432069);
        this.A01 = A0Q2;
        A0Q2.setLayoutManager(this.A00);
        this.A01.A0t(new AnonymousClass3XY(this, 4));
        setVisibility(8);
        if (z3) {
            if (!z) {
                setBackgroundResource(2131231610);
            } else {
                AnonymousClass3MX.A1A(getContext(), this, 2131101862);
            }
        }
        AnonymousClass11P r9 = this.A09;
        C18030ve r11 = this.A04;
        Context context = getContext();
        AnonymousClass1KB r4 = this.A02;
        C32091gc r14 = this.A0I;
        AnonymousClass11S r5 = this.A03;
        C27201Vd r8 = this.A07;
        this.A0J = new AnonymousClass3XO(context, r4, r5, this.A04, this.A06, r8, r9, this.A0A, r11, A0f, r19, r14, this.A0L, z, z2);
        this.A0K.CGN(new C70813Cp(13, (Object) this, z4));
        this.A0J.CDq(new AnonymousClass28K(this, 8));
        this.A01.setAdapter(this.A0J);
    }

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A0N = false;
        this.A0Q = false;
        this.A0R = true;
    }

    private List getUserContacts() {
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1MZ r0 = this.A0D;
        AnonymousClass1IZ it = r0.A08.A0C(this.A0G).A07().iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (!this.A03.A0O(userJid)) {
                boolean A0I2 = this.A0D.A0I(this.A0G);
                if (!C22971Dz.A0Y(userJid) && (!C22971Dz.A0U(userJid) || !A0I2)) {
                    userJid = this.A0E.A0F(userJid);
                }
                if (userJid != null) {
                    AnonymousClass3MY.A1O(this.A05, userJid, A13);
                }
            }
        }
        return A13;
    }

    public void A09(boolean z) {
        super.A09(z);
        AnonymousClass5a8 r0 = this.A0H;
        if (r0 != null) {
            r0.Bo6(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (X.C18020vd.A05(r2, r6.A04, 3334) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r5 = r6.A0I.A04(r6.A0G).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r5.hasNext() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r3 = (X.C70503Bi) r5.next();
        r2 = r6.A05.A0H(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r2.A0n != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r2.A0R = r3.A01;
        r4.add(new X.C85154Mh(2, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A04, 4087) != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0A(boolean r7) {
        /*
            r6 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r7 == 0) goto L_0x0034
            X.00H r0 = r6.A0L
            java.lang.Object r1 = r0.get()
            X.1Pk r1 = (X.C25731Pk) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0034
            boolean r2 = r6.A0R
            X.00H r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.1z1 r1 = (X.C42961z1) r1
            if (r2 == 0) goto L_0x007e
            r1.A02()
        L_0x0023:
            X.1E7 r2 = r1.A08
            r0 = 0
            r6.A0R = r0
            if (r2 == 0) goto L_0x0034
            r1 = 8
            X.4Mh r0 = new X.4Mh
            r0.<init>(r1, r2)
            r4.add(r0)
        L_0x0034:
            X.1BI r1 = r6.A0F
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0087
            X.1CJ r0 = r6.A0B
            boolean r0 = r0.A0R(r1)
            if (r0 != 0) goto L_0x0087
            java.util.List r0 = r6.getUserContacts()
            java.util.Iterator r5 = r0.iterator()
        L_0x004c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0087
            X.1E7 r3 = X.C17880vN.A0O(r5)
            X.0ve r2 = r6.A04
            r1 = 6172(0x181c, float:8.649E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0074
            X.11P r1 = r6.A09
            android.content.Context r0 = r6.getContext()
            java.lang.String r0 = X.AnonymousClass72Y.A01(r0, r1, r3)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r1 = 16
            if (r0 == 0) goto L_0x0075
        L_0x0074:
            r1 = 2
        L_0x0075:
            X.4Mh r0 = new X.4Mh
            r0.<init>(r1, r3)
            r4.add(r0)
            goto L_0x004c
        L_0x007e:
            X.1E7 r0 = r1.A08
            if (r0 != 0) goto L_0x0023
            r0 = 0
            X.C42961z1.A00(r1, r0)
            goto L_0x0023
        L_0x0087:
            X.1BI r1 = r6.A0F
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x00e2
            X.1CJ r0 = r6.A0B
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 3
            if (r1 != r0) goto L_0x00e2
            X.0ve r1 = r6.A04
            r0 = 3097(0xc19, float:4.34E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00e2
            X.0ve r1 = r6.A04
            r0 = 3334(0xd06, float:4.672E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00e2
        L_0x00b0:
            X.1gc r1 = r6.A0I
            X.1EC r0 = r6.A0G
            java.util.ArrayList r0 = r1.A04(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r3 = r5.next()
            X.3Bi r3 = (X.C70503Bi) r3
            X.1M9 r1 = r6.A05
            X.1BI r0 = r3.A00
            X.1E7 r2 = r1.A0H(r0)
            boolean r0 = r2.A0n
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = r3.A01
            r2.A0R = r0
            r1 = 2
            X.4Mh r0 = new X.4Mh
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x00bc
        L_0x00e2:
            X.1BI r1 = r6.A0F
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0105
            X.1CJ r0 = r6.A0B
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 2
            if (r1 == r0) goto L_0x00f8
            r0 = 6
            if (r1 != r0) goto L_0x0105
        L_0x00f8:
            X.0ve r2 = r6.A04
            r1 = 4087(0xff7, float:5.727E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0105
            goto L_0x00b0
        L_0x0105:
            X.3XO r3 = r6.A0J
            r3.A05 = r4
            r3.A06 = r4
            X.1KB r2 = r3.A0B
            r1 = 29
            X.3Br r0 = new X.3Br
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionPickerView.A0A(boolean):void");
    }

    public void setVisibilityChangeListener(AnonymousClass5a8 r1) {
        this.A0H = r1;
    }

    public MentionPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A04();
    }

    public MentionPickerView(Context context) {
        super(context);
        A04();
        A04();
        this.A0N = false;
        this.A0Q = false;
        this.A0R = true;
    }
}
