package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.04W  reason: invalid class name */
public final class AnonymousClass04W extends RippleDrawable {
    public static Method A04;
    public static boolean A05;
    public C05100Qk A00;
    public Integer A01;
    public boolean A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass04W(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            r2 = 0
            if (r5 == 0) goto L_0x0015
            r1 = -1
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
        L_0x000f:
            r4.<init>(r3, r2, r0)
            r4.A03 = r5
            return
        L_0x0015:
            r0 = r2
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04W.<init>(boolean):void");
    }

    public final void A00(float f, long j) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long A052 = AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), f);
        C05100Qk r0 = this.A00;
        if (r0 == null || r0.A00 != A052) {
            this.A00 = new C05100Qk(A052);
            setColor(ColorStateList.valueOf(AnonymousClass0Oy.A00(A052)));
        }
    }

    public final void A01(int i) {
        Integer num = this.A01;
        if (num == null || num.intValue() != i) {
            Integer valueOf = Integer.valueOf(i);
            this.A01 = valueOf;
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!A05) {
                        A05 = true;
                        A04 = RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE});
                    }
                    Method method = A04;
                    if (method != null) {
                        method.invoke(this, new Object[]{valueOf});
                    }
                } catch (Exception unused) {
                }
            } else {
                AnonymousClass0EA.A00(this, i);
            }
        }
    }

    public Rect getDirtyBounds() {
        if (!this.A03) {
            this.A02 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.A02 = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.A02;
    }
}
