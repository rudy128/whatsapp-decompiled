package X;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0QX  reason: invalid class name */
public final class AnonymousClass0QX {
    public final int A00;
    public final C04940Pp A01;
    public final AnonymousClass0NN A02;
    public final C05120Qm A03;
    public final boolean A04;
    public final AnonymousClass0H4 A05;
    public final C16230rv A06;
    public final AnonymousClass0H5 A07;
    public final EBT A08;
    public final C26224CvE A09;
    public final C22821Di A0A;
    public final boolean A0B;

    public /* synthetic */ AnonymousClass0QX(AnonymousClass0H4 r14, C16230rv r15, C04940Pp r16, AnonymousClass0NN r17, C05120Qm r18, AnonymousClass0H5 r19, EBT ebt, C26224CvE cvE, C22821Di r22, AnonymousClass1Y1 r23, int i, boolean z, boolean z2) {
        this(r14, r15, r16, r17, r18, r19, ebt, cvE, r22, i, z, z2);
    }

    public static final void A03(AnonymousClass0QX r4, List list) {
        C25146CZx A072 = r4.A01.A07();
        ArrayList A0m = C29431cG.A0m(list);
        A0m.add(0, new C26604D5u());
        r4.A0A.invoke(A072.A01(A0m));
    }

    private final void A05(C22821Di r8) {
        C26224CvE cvE = this.A09;
        AnonymousClass0Qt r5 = new AnonymousClass0Qt(C04940Pp.A02(this.A01), this.A07, this.A08, cvE);
        r8.invoke(r5);
        if (r5.A00 != cvE.A01() || !C18070vi.A18(r5.A0L(), cvE.A02())) {
            this.A0A.invoke(r5.A0N());
        }
    }

    public AnonymousClass0QX(AnonymousClass0H4 r1, C16230rv r2, C04940Pp r3, AnonymousClass0NN r4, C05120Qm r5, AnonymousClass0H5 r6, EBT ebt, C26224CvE cvE, C22821Di r9, int i, boolean z, boolean z2) {
        this.A01 = r3;
        this.A03 = r5;
        this.A09 = cvE;
        this.A0B = z;
        this.A04 = z2;
        this.A07 = r6;
        this.A08 = ebt;
        this.A02 = r4;
        this.A05 = r1;
        this.A06 = r2;
        this.A0A = r9;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = r0.intValue();
        r0 = X.AnonymousClass000.A10();
        r0.appendCodePoint(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return new X.D60(r0.toString(), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (java.lang.Character.isISOControl(r5.getUnicodeChar()) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.D60 A00(android.view.KeyEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x0011
            int r0 = r5.getUnicodeChar()
            boolean r1 = java.lang.Character.isISOControl(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 0
            if (r0 == 0) goto L_0x002a
            X.0H4 r1 = r4.A05
            int r2 = r5.getUnicodeChar()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x002b
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
        L_0x002a:
            return r3
        L_0x002b:
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0041
            r1.A00 = r3
            int r0 = r0.intValue()
            int r1 = android.view.KeyCharacterMap.getDeadChar(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0041
            if (r0 != 0) goto L_0x0047
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x002a
        L_0x0047:
            int r1 = r0.intValue()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.appendCodePoint(r1)
            java.lang.String r2 = r0.toString()
            r1 = 1
            X.D60 r0 = new X.D60
            r0.<init>((java.lang.String) r2, (int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QX.A00(android.view.KeyEvent):X.D60");
    }

    /* access modifiers changed from: private */
    public final void A04(E3W e3w) {
        A03(this, AnonymousClass1ZT.A00(e3w));
    }

    public final boolean A06(KeyEvent keyEvent) {
        AnonymousClass0CV Bii;
        D60 A002 = A00(keyEvent);
        if (A002 != null) {
            if (!this.A0B) {
                return false;
            }
            A04(A002);
            this.A07.A00 = null;
            return true;
        } else if (C02580Eo.A00(keyEvent) != 2 || (Bii = this.A06.Bii(keyEvent)) == null || (Bii.editsText && !this.A0B)) {
            return false;
        } else {
            C22811Dh r1 = new C22811Dh();
            r1.element = true;
            A05(new C11220jg(Bii, this, r1));
            AnonymousClass0NN r0 = this.A02;
            if (r0 != null) {
                r0.A01 = true;
            }
            return r1.element;
        }
    }

    public /* synthetic */ AnonymousClass0QX(AnonymousClass0H4 r15, C04940Pp r16, AnonymousClass0NN r17, C05120Qm r18, AnonymousClass0H5 r19, EBT ebt, C26224CvE cvE, C22821Di r22, int i, boolean z, boolean z2) {
        this(r15, C02940Fz.A00, r16, r17, r18, r19, ebt, cvE, r22, (AnonymousClass1Y1) null, i, z, z2);
    }
}
