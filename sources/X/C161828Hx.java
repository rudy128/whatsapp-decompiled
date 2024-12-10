package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.8Hx  reason: invalid class name and case insensitive filesystem */
public class C161828Hx extends C38391rD implements AnonymousClass8AZ {
    public AnonymousClass9YJ A00 = null;
    public List A01;
    public final int A02;
    public final Context A03;
    public final B8b A04;
    public final C22374B5d A05;
    public final C193179pf A06;
    public final C18000vb A07;
    public final AnonymousClass122 A08;
    public final C58842lL A09;
    public final AnonymousClass1QE A0A;
    public final AnonymousClass1R2 A0B;

    public int A0Q() {
        return this.A01.size();
    }

    /* renamed from: A0U */
    public void Bma(AnonymousClass8IY r3, int i) {
        List list = C42011xT.A0I;
        r3.A00.setText(((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i).toString());
    }

    public int BPU(int i) {
        return ((C21601Amp) ((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i)).count;
    }

    public int BSM() {
        return ((PaymentTransactionHistoryActivity) this.A05).A0Y.size();
    }

    public long BSN(int i) {
        return -((Calendar) ((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i)).getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009a, code lost:
        if (r9.A01(((X.AW0) r12.A01.get(r14)).A05).equals(r9.A01(((X.AW0) r12.A01.get(r7)).A05)) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a2, code lost:
        if (r7 == r12.A01.size()) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a4, code lost:
        r2.findViewById(2131430073).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b0, code lost:
        r11 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r12.A05).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b6, code lost:
        if (r11 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b8, code lost:
        r0 = r12.A09.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00be, code lost:
        if (r0 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c0, code lost:
        r9 = r0.A0P();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c4, code lost:
        r10 = r12.A0B;
        r7 = r10.A0U(r3);
        r8 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d1, code lost:
        if (X.C20103A7h.A04(r8, r9, r11, true) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        r6.A0S(r9, ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e1, code lost:
        if (r12.A00 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        X.AFT.A00(r2, r12, r3, 22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ed, code lost:
        if (X.C20103A7h.A04(r8, r7, r11, true) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        r1 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r5.A0S(r7, r1, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        r7 = r10.A0T(r3);
        r1 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010a, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r13, int r14) {
        /*
            r12 = this;
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0010
            X.1QE r1 = r12.A0A
            java.lang.String r0 = "Transaction items size zero even when binding"
            r1.A05(r0)
        L_0x000f:
            return
        L_0x0010:
            java.util.List r0 = r12.A01
            java.lang.Object r3 = r0.get(r14)
            X.AW0 r3 = (X.AW0) r3
            X.C17960vV.A07(r3)
            boolean r0 = r13 instanceof X.AnonymousClass8II
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r13.A0H
            com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow r0 = (com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow) r0
            r0.BDE(r3)
            return
        L_0x0027:
            X.8Ii r13 = (X.C161938Ii) r13
            X.96T r2 = r13.A00
            com.whatsapp.TextEmojiLabel r5 = r2.A0D
            java.lang.String r8 = ""
            r5.setText(r8)
            android.content.Context r6 = r2.getContext()
            android.content.Context r4 = r2.getContext()
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0w(r4, r6, r5, r1, r0)
            com.whatsapp.TextEmojiLabel r6 = r2.A0C
            r6.setText(r8)
            com.whatsapp.TextEmojiLabel r4 = r2.A0B
            r4.setText(r8)
            r7 = 0
            r4.setVisibility(r7)
            android.view.View r0 = r2.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A09
            r0.setText(r8)
            r0.setVisibility(r7)
            com.whatsapp.WaImageView r0 = r2.A0F
            r0.setVisibility(r1)
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            X.AnonymousClass3MY.A1B(r2, r0, r7)
            r2.BDE(r3)
            int r7 = r14 + 1
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x009c
            java.util.List r0 = r12.A01
            java.lang.Object r1 = r0.get(r14)
            X.AW0 r1 = (X.AW0) r1
            java.util.List r0 = r12.A01
            java.lang.Object r10 = r0.get(r7)
            X.AW0 r10 = (X.AW0) r10
            X.9pf r9 = r12.A06
            long r0 = r1.A05
            X.Amp r8 = r9.A01(r0)
            long r0 = r10.A05
            X.Amp r0 = r9.A01(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a4
        L_0x009c:
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r7 != r0) goto L_0x00b0
        L_0x00a4:
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x00b0:
            X.B5d r0 = r12.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r11 = r0.A0M
            if (r11 == 0) goto L_0x00df
            X.2lL r0 = r12.A09
            X.206 r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x010a
            java.lang.String r9 = r0.A0P()
        L_0x00c4:
            X.1R2 r10 = r12.A0B
            java.lang.String r7 = r10.A0U(r3)
            X.0vb r8 = r12.A07
            r1 = 1
            boolean r0 = X.C20103A7h.A04(r8, r9, r11, r1)
            if (r0 == 0) goto L_0x00e9
            X.8Hx r0 = r13.A01
            X.B5d r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            r0 = 0
            r6.A0S(r9, r1, r0, r0)
        L_0x00df:
            X.9YJ r0 = r12.A00
            if (r0 == 0) goto L_0x000f
            r0 = 22
            X.AFT.A00(r2, r12, r3, r0)
            return
        L_0x00e9:
            boolean r0 = X.C20103A7h.A04(r8, r7, r11, r1)
            if (r0 == 0) goto L_0x00fc
            X.8Hx r0 = r13.A01
            X.B5d r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
        L_0x00f7:
            r0 = 0
            r5.A0S(r7, r1, r0, r0)
            goto L_0x00df
        L_0x00fc:
            java.lang.String r7 = r10.A0T(r3)
            X.8Hx r0 = r13.A01
            X.B5d r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            r5 = r4
            goto L_0x00f7
        L_0x010a:
            r9 = 0
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161828Hx.Bmc(X.1xT, int):void");
    }

    public /* bridge */ /* synthetic */ C42011xT BqT(ViewGroup viewGroup) {
        boolean z = this instanceof AnonymousClass93b;
        Context context = this.A03;
        LayoutInflater layoutInflater = AnonymousClass1L9.A00(context).getLayoutInflater();
        if (z) {
            View inflate = layoutInflater.inflate(2131625598, viewGroup, false);
            inflate.setClickable(false);
            AnonymousClass8BX.A0y(context, inflate);
            return new AnonymousClass93a(inflate);
        }
        View inflate2 = layoutInflater.inflate(2131627219, viewGroup, false);
        inflate2.setClickable(false);
        AnonymousClass8BX.A0y(context, inflate2);
        return new AnonymousClass8IY(inflate2);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 2000) {
            return new C42011xT(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626423));
        }
        return new C161938Ii(new AnonymousClass96T(this.A03, this.A04, this.A02), this);
    }

    public int getItemViewType(int i) {
        AW0 aw0 = (AW0) this.A01.get(i);
        if (aw0.A03 != 1000 || !aw0.A0P) {
            return 1000;
        }
        return 2000;
    }

    public C161828Hx(Context context, C18000vb r3, AnonymousClass122 r4, C58842lL r5, B8b b8b, AnonymousClass1QE r7, C22374B5d b5d, C193179pf r9, AnonymousClass1R2 r10, List list, int i) {
        this.A03 = context;
        this.A01 = C17880vN.A10(list);
        this.A04 = b8b;
        this.A0A = r7;
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r3;
        this.A0B = r10;
        this.A06 = r9;
        this.A05 = b5d;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ boolean C6y(MotionEvent motionEvent, C42011xT r3, int i) {
        return false;
    }
}
