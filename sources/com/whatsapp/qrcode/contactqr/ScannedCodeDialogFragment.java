package com.whatsapp.qrcode.contactqr;

import X.AFD;
import X.AQ9;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass12E;
import X.AnonymousClass17K;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C107625aK;
import X.C132996o0;
import X.C137086ut;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C22941Dw;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C27201Vd;
import X.C36451nu;
import X.C37311pJ;
import X.C37451pZ;
import X.C37511pf;
import X.C37721q1;
import X.C42141xh;
import X.C43251zV;
import X.C57292iq;
import X.C72043Kk;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

public class ScannedCodeDialogFragment extends Hilt_ScannedCodeDialogFragment implements AnonymousClass86E {
    public int A00;
    public ImageView A01;
    public AnonymousClass11S A02;
    public C72043Kk A03;
    public AnonymousClass1M9 A04;
    public C24671Lf A05;
    public C37511pf A06;
    public AnonymousClass1PM A07;
    public C24921Me A08;
    public C37451pZ A09;
    public C27201Vd A0A;
    public C37311pJ A0B;
    public AnonymousClass12E A0C;
    public AnonymousClass11P A0D;
    public C18000vb A0E;
    public AnonymousClass1E7 A0F;
    public AnonymousClass1KW A0G;
    public C18030ve A0H;
    public UserJid A0I;
    public C132996o0 A0J;
    public C36451nu A0K;
    public AnonymousClass10I A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public C107625aK A0S;
    public final View.OnClickListener A0T = new AFD(this, 29);
    public final View.OnClickListener A0U = new AFD(this, 30);
    public final C23581Gv A0V = new AQ9(this, 5);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1LU, java.lang.Object] */
    public void A1w(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A0C.A0D((Integer) null);
                A1k(AnonymousClass1LU.A02(A1D()).addFlags(603979776));
                Intent A062 = AnonymousClass3MY.A06(A14(), new Object(), this.A0I);
                A062.putExtra("added_by_qr_code", true);
                C137086ut.A00(A062, this, this.A0D);
            }
            A28();
            ((C37721q1) this.A0M.get()).A02();
            return;
        }
        super.A1w(i, i2, intent);
    }

    public void A1K() {
        super.A1K();
        this.A05.unregisterObserver(this.A0V);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A062;
        int i;
        Bundle A15 = A15();
        this.A00 = A15.getInt("ARG_TYPE");
        this.A0I = C22941Dw.A02(A15.getString("ARG_JID"));
        this.A0Q = A15.getString("ARG_MESSAGE");
        this.A0P = A15.getString("ARG_SOURCE");
        this.A0R = A15.getString("ARG_QR_CODE_ID");
        AnonymousClass1M9 r1 = this.A04;
        UserJid userJid = this.A0I;
        C17960vV.A07(userJid);
        this.A0F = r1.A0H(userJid);
        boolean A0O2 = this.A02.A0O(this.A0I);
        View A0D2 = AnonymousClass3MY.A0D(A1D().getLayoutInflater(), 2131627379);
        TextView A0J2 = AnonymousClass3MW.A0J(A0D2, 2131436208);
        TextView A0J3 = AnonymousClass3MW.A0J(A0D2, 2131433997);
        this.A01 = AnonymousClass3MW.A0G(A0D2, 2131434167);
        View A063 = AnonymousClass1HF.A06(A0D2, 2131429412);
        TextView A0J4 = AnonymousClass3MW.A0J(A0D2, 2131434661);
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(A0D2, 2131434660);
        if (!this.A0F.A0A()) {
            A0J4.setText(this.A0E.A0G(AnonymousClass17K.A05(this.A0I)));
            String A0M2 = this.A08.A0M(this.A0F);
            if (A0M2 != null) {
                A0V2.A0R(A0M2);
            } else {
                A0V2.setVisibility(8);
            }
        } else {
            C42141xh A012 = C42141xh.A01(A063, this.A03, 2131434661);
            A0J4.setText(C43251zV.A03(A1n(), A0J4.getPaint(), this.A0G, this.A0F.A0L()));
            A012.A03(1);
            int i2 = 2131887562;
            if (C18020vd.A05(C18040vf.A02, ((C57292iq) this.A0N.get()).A00, 5846)) {
                i2 = 2131887563;
            }
            A0V2.setText(i2);
        }
        this.A09.A07(this.A01, this.A0F);
        int i3 = this.A00;
        if (i3 == 0) {
            A0J2.setText(2131894867);
            if (A0O2 || !(!this.A02.A0N())) {
                A0J3.setText(2131899286);
                A0J3.setOnClickListener(this.A0U);
                return A0D2;
            }
            int i4 = 2131888822;
            if (this.A0F.A0H != null) {
                i4 = 2131888823;
            }
            A0J3.setText(i4);
            A0J3.setOnClickListener(this.A0T);
            A062 = AnonymousClass1HF.A06(A0D2, 2131429955);
            i = 27;
        } else if (i3 == 1) {
            A28();
            return A0D2;
        } else if (i3 == 2) {
            A0J2.setText(2131894867);
            A0J3.setText(2131892073);
            A0J3.setOnClickListener(this.A0T);
            A062 = AnonymousClass1HF.A06(A0D2, 2131429955);
            i = 28;
        } else {
            throw AnonymousClass000.A0k("Unhandled type");
        }
        AnonymousClass3Ma.A1A(A062, this, i);
        return A0D2;
    }

    public void A1r() {
        super.A1r();
        this.A09.A02();
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof C107625aK) {
            this.A0S = (C107625aK) context;
        }
        this.A05.registerObserver(this.A0V);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A09 = this.A0A.A06(A14(), "scanned-code-dialog-fragment");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C107625aK r0 = this.A0S;
        if (r0 != null) {
            r0.C2J();
        }
    }
}
