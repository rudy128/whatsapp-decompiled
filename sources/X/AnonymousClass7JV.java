package X;

import android.database.ContentObserver;
import android.util.SparseArray;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.7JV  reason: invalid class name */
public class AnonymousClass7JV implements C160898Aj {
    public int A00;
    public int A01;
    public C109335dH A02;
    public C109335dH A03;
    public AnonymousClass6M3 A04;
    public AnonymousClass6M3 A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public AnonymousClass6M7 A09;
    public final ContentObserver A0A = new C109355dJ(this);
    public final SparseArray A0B;
    public final AnonymousClass1ST A0C;
    public final C18030ve A0D;
    public final AnonymousClass1BI A0E;
    public final MediaViewBaseFragment A0F;
    public final AnonymousClass21V A0G;
    public final AnonymousClass1W6 A0H;
    public final AnonymousClass10I A0I;

    public int BXL(AnonymousClass205 r6) {
        if (r6 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.A0B;
                if (i >= sparseArray.size()) {
                    break;
                }
                int keyAt = sparseArray.keyAt(i);
                AnonymousClass206 r0 = (AnonymousClass206) sparseArray.get(keyAt);
                if (r0 != null && r0.A0v.equals(r6)) {
                    return this.A00 + keyAt;
                }
                i++;
            }
        }
        return -2;
    }

    public void Byw() {
    }

    public void CNr() {
        C18030ve r3 = this.A0D;
        AnonymousClass1BI r4 = this.A0E;
        AnonymousClass21V r6 = this.A0G;
        AnonymousClass1W6 r7 = this.A0H;
        AnonymousClass6M7 r1 = new AnonymousClass6M7(this.A0C, r3, r4, this, r6, r7);
        this.A09 = r1;
        C17890vO.A0u(r1, this.A0I);
    }

    public void CQZ(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21V BUg(int r21) {
        /*
            r20 = this;
            r9 = r20
            int r0 = r9.A00
            int r1 = r21 - r0
            android.util.SparseArray r3 = r9.A0B
            java.lang.Object r0 = r3.get(r1)
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 != 0) goto L_0x0028
            r2 = 0
            java.lang.String r6 = " pos:"
            r0 = 0
            if (r1 >= 0) goto L_0x008d
            X.5dH r7 = r9.A02
            if (r7 == 0) goto L_0x0028
            int r4 = -r1
            int r5 = r4 + -1
            int r4 = r7.getCount()
            if (r5 < r4) goto L_0x0029
            X.5dH r1 = r9.A02
        L_0x0025:
            r1.getCount()
        L_0x0028:
            return r0
        L_0x0029:
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            boolean r4 = r4.moveToPosition(r5)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            if (r4 == 0) goto L_0x0028
            boolean r4 = r9.A07     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            if (r4 != 0) goto L_0x0086
            X.6M3 r4 = r9.A04     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            if (r4 != 0) goto L_0x0086
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r5 = r4.getPosition()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r4 = r4.getCount()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r4 = r4 / 2
            if (r5 <= r4) goto L_0x0086
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            java.lang.String r4 = "MediaMessagesNavigator/navigator/ start upgrade head cursor count:"
            r5.append(r4)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r4 = r4.getCount()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            r5.append(r4)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            r5.append(r6)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r4 = r4.getPosition()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.C17900vP.A0o(r5, r4)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.0ve r7 = r9.A0D     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.1W6 r10 = r9.A0H     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.1ST r6 = r9.A0C     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.1BI r8 = r9.A0E     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.21V r4 = r9.A0G     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            long r12 = r4.A0x     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.5dH r4 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            int r11 = r4.getPosition()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            r14 = 1
            X.6M3 r5 = new X.6M3     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            r9.A04 = r5     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.10I r4 = r9.A0I     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.AnonymousClass3MW.A1T(r5, r4, r2)     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
        L_0x0086:
            X.5dH r2 = r9.A02     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            X.21V r0 = r2.A01()     // Catch:{ CursorIndexOutOfBoundsException | NullPointerException -> 0x0114 }
            goto L_0x0091
        L_0x008d:
            if (r1 != 0) goto L_0x0097
            X.21V r0 = r9.A0G
        L_0x0091:
            if (r0 == 0) goto L_0x0028
            r3.put(r1, r0)
            return r0
        L_0x0097:
            X.5dH r4 = r9.A03
            if (r4 == 0) goto L_0x0028
            int r5 = r1 + -1
            int r4 = r4.getCount()
            if (r5 < r4) goto L_0x00a6
            X.5dH r1 = r9.A03
            goto L_0x0025
        L_0x00a6:
            X.5dH r4 = r9.A03
            boolean r4 = r4.moveToPosition(r5)
            if (r4 == 0) goto L_0x0028
            boolean r4 = r9.A08
            if (r4 != 0) goto L_0x0109
            X.6M3 r4 = r9.A05
            if (r4 != 0) goto L_0x0109
            X.5dH r4 = r9.A03
            if (r4 == 0) goto L_0x0109
            int r5 = r4.getPosition()
            X.5dH r4 = r9.A03
            int r4 = r4.getCount()
            int r4 = r4 / 2
            if (r5 <= r4) goto L_0x0109
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "MediaMessagesNavigator/navigator/ start upgrade tail cursor count:"
            r5.append(r4)
            X.5dH r4 = r9.A03
            int r4 = r4.getCount()
            r5.append(r4)
            r5.append(r6)
            X.5dH r4 = r9.A03
            int r4 = r4.getPosition()
            X.C17900vP.A0o(r5, r4)
            X.0ve r12 = r9.A0D
            X.1W6 r15 = r9.A0H
            X.1ST r11 = r9.A0C
            X.1BI r13 = r9.A0E
            X.21V r4 = r9.A0G
            long r4 = r4.A0x
            X.5dH r6 = r9.A03
            int r16 = r6.getPosition()
            X.6M3 r10 = new X.6M3
            r14 = r9
            r17 = r4
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            r9.A05 = r10
            X.10I r4 = r9.A0I
            X.AnonymousClass3MW.A1T(r10, r4, r2)
        L_0x0109:
            X.5dH r2 = r9.A03     // Catch:{ CursorIndexOutOfBoundsException -> 0x0110 }
            X.21V r0 = r2.A01()     // Catch:{ CursorIndexOutOfBoundsException -> 0x0110 }
            goto L_0x0091
        L_0x0110:
            r2 = move-exception
            java.lang.String r1 = "MediaMessagesNavigator/getMessageByRelativePosition/Error while getting the message for media view"
            goto L_0x0117
        L_0x0114:
            r2 = move-exception
            java.lang.String r1 = "MediaMessagesNavigator/Error parsing cursor tail."
        L_0x0117:
            com.whatsapp.util.Log.e(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JV.BUg(int):X.21V");
    }

    public void COX() {
        AnonymousClass6M7 r0 = this.A09;
        if (r0 != null && !C108945cZ.A1T(r0)) {
            this.A09.A0B(true);
        }
    }

    public int getCount() {
        return this.A00 + 1 + this.A01;
    }

    public AnonymousClass7JV(AnonymousClass1ST r3, C18030ve r4, AnonymousClass1BI r5, MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass21V r7, AnonymousClass1W6 r8, AnonymousClass10I r9) {
        SparseArray sparseArray = new SparseArray();
        this.A0B = sparseArray;
        this.A0D = r4;
        this.A0F = mediaViewBaseFragment;
        this.A0G = r7;
        this.A0I = r9;
        this.A0E = r5;
        this.A0H = r8;
        this.A0C = r3;
        sparseArray.put(0, r7);
    }

    public void close() {
        COX();
        C109335dH r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
        this.A02 = null;
        C109335dH r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
        this.A03 = null;
        boolean A1G = C108975cc.A1G(this.A04);
        this.A04 = null;
        AnonymousClass6M3 r03 = this.A05;
        if (r03 != null) {
            r03.A0B(A1G);
        }
        this.A05 = null;
        this.A07 = false;
        this.A08 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B.clear();
    }

    public void CId(Runnable runnable) {
        this.A06 = runnable;
    }
}
