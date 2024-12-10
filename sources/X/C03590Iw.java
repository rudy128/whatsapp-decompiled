package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: X.0Iw  reason: invalid class name and case insensitive filesystem */
public class C03590Iw {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CheckedTextView A05;

    public void A00() {
        CheckedTextView checkedTextView = this.A05;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.A02 || this.A03) {
            Drawable mutate = C27831Xu.A02(checkMarkDrawable).mutate();
            if (this.A02) {
                C27831Xu.A03(this.A00, mutate);
            }
            if (this.A03) {
                C27831Xu.A07(this.A01, mutate);
            }
            if (mutate.isStateful()) {
                AnonymousClass000.A17(mutate, checkedTextView);
            }
            checkedTextView.setCheckMarkDrawable(mutate);
        }
    }

    public C03590Iw(CheckedTextView checkedTextView) {
        this.A05 = checkedTextView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.util.AttributeSet r10) {
        /*
            r9 = this;
            r8 = 2130969039(0x7f0401cf, float:1.7546749E38)
            android.widget.CheckedTextView r6 = r9.A05
            android.content.Context r0 = r6.getContext()
            int[] r7 = X.C002501d.A0B
            r1 = 0
            r5 = r10
            X.01c r2 = X.C002401c.A00(r0, r10, r7, r8, r1)
            android.content.Context r3 = r6.getContext()
            android.content.res.TypedArray r4 = r2.A02
            X.AnonymousClass1HF.A0K(r3, r4, r5, r6, r7, r8)
            r0 = 1
            boolean r0 = r4.hasValue(r0)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0030
            r0 = 1
            int r0 = r4.getResourceId(r0, r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0030
            android.graphics.drawable.Drawable r0 = X.AnonymousClass001.A0y(r6, r0)     // Catch:{ NotFoundException -> 0x0030 }
            r6.setCheckMarkDrawable(r0)     // Catch:{ NotFoundException -> 0x0030 }
            goto L_0x0043
        L_0x0030:
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0043
            int r0 = r4.getResourceId(r1, r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = X.AnonymousClass001.A0y(r6, r0)     // Catch:{ all -> 0x006a }
            r6.setCheckMarkDrawable(r0)     // Catch:{ all -> 0x006a }
        L_0x0043:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0051
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x006a }
            r6.setCheckMarkTintList(r0)     // Catch:{ all -> 0x006a }
        L_0x0051:
            r0 = 3
            boolean r0 = r4.hasValue(r0)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0066
            r1 = 3
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch:{ all -> 0x006a }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C005902p.A00(r0, r1)     // Catch:{ all -> 0x006a }
            r6.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x006a }
        L_0x0066:
            r4.recycle()
            return
        L_0x006a:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03590Iw.A01(android.util.AttributeSet):void");
    }
}
