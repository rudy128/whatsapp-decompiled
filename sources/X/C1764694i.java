package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.94i  reason: invalid class name and case insensitive filesystem */
public class C1764694i extends A5V {
    public final AnonymousClass1QS A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1764694i(X.AnonymousClass1KB r21, X.AnonymousClass11S r22, X.AnonymousClass1FY r23, X.AnonymousClass11P r24, X.AnonymousClass1QG r25, X.AnonymousClass1QL r26, X.C33331ie r27, X.C33711jG r28, X.AnonymousClass1QD r29, X.C31061ex r30, X.C20110A7s r31, X.AnonymousClass1QS r32, X.C191529mk r33, X.A54 r34, X.BD4 r35, X.A5H r36, X.C195929uA r37, X.BBX r38, X.AnonymousClass10I r39) {
        /*
            r20 = this;
            r12 = r31
            r11 = r30
            r10 = r29
            r9 = r28
            r8 = r27
            r7 = r26
            r19 = r39
            r18 = r38
            r6 = r25
            r17 = r37
            r5 = r24
            r16 = r36
            r4 = r23
            r15 = r35
            r3 = r22
            r14 = r34
            r2 = r21
            r13 = r33
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r32
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764694i.<init>(X.1KB, X.11S, X.1FY, X.11P, X.1QG, X.1QL, X.1ie, X.1jG, X.1QD, X.1ex, X.A7s, X.1QS, X.9mk, X.A54, X.BD4, X.A5H, X.9uA, X.BBX, X.10I):void");
    }

    public void A05(C70513Bj r7) {
        AD9 ad9;
        List list = this.A03;
        String str = r7.A06;
        list.add(str);
        ADT adt = r7.A03;
        this.A02 = adt;
        if (adt != null && (ad9 = adt.A00) != null && ad9.A00.equals("WEBVIEW")) {
            if (((C1762490b) ad9).A01) {
                this.A0E.CGD(new C177849Av(this.A05, this.A00, new C20825Aa2(this, str)), new AnonymousClass1F9[0]);
            } else {
                A06((PinBottomSheetDialogFragment) null, (C29621ca) null);
            }
        }
    }
}
