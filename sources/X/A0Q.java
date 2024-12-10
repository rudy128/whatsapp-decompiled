package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

public class A0Q {
    public String A00;
    public final Context A01;
    public final AnonymousClass1QD A02;
    public final AnonymousClass1QS A03;
    public final C31071ey A04;
    public final AnonymousClass10I A05;
    public final Runnable A06;
    public final AnonymousClass1FR A07;
    public final AnonymousClass1KB A08;
    public final AnonymousClass11S A09;
    public final C24751Ln A0A;
    public final ALX A0B;
    public final AnonymousClass1QO A0C;
    public final AnonymousClass8FO A0D;
    public final Runnable A0E;
    public final boolean A0F;

    public void A01(AnonymousClass1BI r24, AnonymousClass206 r25, String str, String str2, int i, int i2, boolean z) {
        AnonymousClass1KB r2;
        Context context;
        int i3;
        int i4 = i;
        if (i4 == 5) {
            r2 = this.A08;
            context = this.A01;
            i3 = 2131893866;
        } else if (i4 == 3) {
            r2 = this.A08;
            context = this.A01;
            i3 = 2131893865;
        } else if (i4 == 1) {
            r2 = this.A08;
            context = this.A01;
            i3 = 2131893864;
        } else {
            AnonymousClass1KB r7 = this.A08;
            AnonymousClass1QS r9 = this.A03;
            Context context2 = this.A01;
            AnonymousClass8FO r10 = this.A0D;
            AnonymousClass1BI r16 = r24;
            AnonymousClass206 r17 = r25;
            String str3 = str;
            String str4 = str2;
            int i5 = i2;
            boolean z2 = z;
            A1K a1k = new A1K(context2, this.A07, r7, this.A0A, r9, r10, new C21393AjM(this, r16, r17, str3, str4, i5, 1, z2), new C21448AkF(this, 11), this.A0F, false);
            UserJid A002 = C22941Dw.A00(r16);
            if (A002 == null || !a1k.A02()) {
                A00(r16, this, r17, str3, str4, i5, z2);
                return;
            } else {
                a1k.A01(A002, new C20846AaO(this, 2), str4);
                return;
            }
        }
        r2.A0G(context.getString(i3), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r12.A09.A0O(r2.A0E) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1BI r11, X.A0Q r12, X.AnonymousClass206 r13, java.lang.String r14, java.lang.String r15, int r16, boolean r17) {
        /*
            if (r13 == 0) goto L_0x0019
            X.AW0 r2 = X.AnonymousClass25B.A00(r13)
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.A0J()
            if (r0 == 0) goto L_0x0019
            X.11S r1 = r12.A09
            com.whatsapp.jid.UserJid r0 = r2.A0E
            boolean r0 = r1.A0O(r0)
            r8 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            X.1QS r4 = r12.A03
            X.1Ln r7 = r12.A0A
            X.1QO r0 = r12.A0C
            X.ALX r2 = r12.A0B
            android.content.Context r3 = r12.A01
            java.lang.String r1 = r12.A00
            r5 = 0
            android.content.Intent r2 = r2.A00(r3, r8, r5)
            X.AnonymousClass8BR.A1D(r2, r15)
            java.lang.String r6 = "extra_payment_note"
            r2.putExtra(r6, r14)
            java.lang.String r10 = "upiHandle"
            java.lang.String r6 = "extra_payment_handle"
            if (r13 == 0) goto L_0x00cd
            java.lang.String r1 = "extra_conversation_message_type"
            r9 = 2
            r2.putExtra(r1, r9)
            X.1BI r1 = r13.A0H()
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r1)
            int r0 = X.AnonymousClass1R2.A00(r7, r1, r0)
            X.AW0 r7 = X.AnonymousClass25B.A00(r13)
            if (r0 != r9) goto L_0x006d
            java.lang.String r0 = "extra_receiver_jid"
            X.AnonymousClass3MY.A13(r2, r1, r0)
            if (r7 == 0) goto L_0x006d
            X.8pG r0 = r7.A0A
            if (r0 == 0) goto L_0x006d
            X.7Ik r9 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = r0.A0G()
            X.77e r0 = X.AnonymousClass8BR.A0Y(r9, r1, r0, r10)
            r2.putExtra(r6, r0)
        L_0x006d:
            long r0 = r13.A0x
            java.lang.String r6 = "extra_quoted_msg_row_id"
            r2.putExtra(r6, r0)
            if (r8 == 0) goto L_0x0093
            X.205 r0 = r13.A0v
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_request_message_key"
            r2.putExtra(r0, r1)
            X.C17960vV.A07(r7)
            X.1KN r0 = r7.A09
            X.C17960vV.A07(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_amount"
            r2.putExtra(r0, r1)
            r2.putExtra(r6, r5)
        L_0x0093:
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            r1 = r17
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_jid"
            X.AnonymousClass3MY.A12(r2, r11, r1)
            X.BD1 r0 = r4.A06()
            X.BCo r0 = r0.BPe()
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r0.CMA(r15)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = "extra_return_result_and_finish_on_send_money_complete"
            r0 = 1
            r2.putExtra(r1, r0)
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r3)
            r1 = r16
            r0.startActivityForResult(r2, r1)
        L_0x00be:
            java.lang.Runnable r0 = r12.A0E
            if (r0 == 0) goto L_0x00c5
            r0.run()
        L_0x00c5:
            return
        L_0x00c6:
            X.AnonymousClass3MY.A12(r2, r11, r1)
            r3.startActivity(r2)
            goto L_0x00be
        L_0x00cd:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0093
            X.77e r0 = X.AnonymousClass8BX.A0K(r1, r10)
            r2.putExtra(r6, r0)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Q.A00(X.1BI, X.A0Q, X.206, java.lang.String, java.lang.String, int, boolean):void");
    }

    public A0Q(Context context, AnonymousClass1FR r2, AnonymousClass1KB r3, AnonymousClass11S r4, C24751Ln r5, ALX alx, AnonymousClass1QD r7, AnonymousClass1QO r8, AnonymousClass1QS r9, C31071ey r10, AnonymousClass8FO r11, AnonymousClass10I r12, Runnable runnable, Runnable runnable2, boolean z) {
        this.A01 = context;
        this.A08 = r3;
        this.A09 = r4;
        this.A05 = r12;
        this.A07 = r2;
        this.A03 = r9;
        this.A0A = r5;
        this.A02 = r7;
        this.A0C = r8;
        this.A0D = r11;
        this.A0B = alx;
        this.A04 = r10;
        this.A0F = z;
        this.A0E = runnable;
        this.A06 = runnable2;
    }
}
