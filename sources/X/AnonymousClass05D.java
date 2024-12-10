package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.05D  reason: invalid class name */
public final class AnonymousClass05D extends ViewGroup {
    public int A00;
    public final AnonymousClass0HO A01;
    public final List A02;
    public final int A03 = 5;
    public final List A04;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.059} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.059} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.059} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.059} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass059 A00(X.AnonymousClass07R r8) {
        /*
            r7 = this;
            X.0HO r5 = r7.A01
            java.util.Map r4 = r5.A01
            java.lang.Object r6 = r4.get(r8)
            X.059 r6 = (X.AnonymousClass059) r6
            if (r6 != 0) goto L_0x0044
            java.util.List r0 = r7.A02
            java.lang.Object r6 = X.C29401cD.A0I(r0)
            X.059 r6 = (X.AnonymousClass059) r6
            if (r6 != 0) goto L_0x003c
            int r2 = r7.A00
            java.util.List r1 = r7.A04
            int r0 = X.AnonymousClass1ZU.A04(r1)
            if (r2 <= r0) goto L_0x0045
            android.content.Context r0 = r7.getContext()
            X.059 r6 = new X.059
            r6.<init>(r0)
            r7.addView(r6)
            r1.add(r6)
        L_0x002f:
            int r2 = r7.A00
            int r0 = r7.A03
            int r1 = r0 + -1
            r0 = 0
            if (r2 >= r1) goto L_0x003a
            int r0 = r2 + 1
        L_0x003a:
            r7.A00 = r0
        L_0x003c:
            r4.put(r8, r6)
            java.util.Map r0 = r5.A00
            r0.put(r6, r8)
        L_0x0044:
            return r6
        L_0x0045:
            int r0 = r7.A00
            java.lang.Object r6 = r1.get(r0)
            X.059 r6 = (X.AnonymousClass059) r6
            java.util.Map r3 = r5.A00
            java.lang.Object r2 = r3.get(r6)
            X.07R r2 = (X.AnonymousClass07R) r2
            if (r2 == 0) goto L_0x002f
            r1 = 0
            X.0uU r0 = r2.A04
            r0.setValue(r1)
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0066
            r3.remove(r0)
        L_0x0066:
            r4.remove(r2)
            r6.A00()
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05D.A00(X.07R):X.059");
    }

    public AnonymousClass05D(Context context) {
        super(context);
        ArrayList A13 = AnonymousClass000.A13();
        this.A04 = A13;
        ArrayList A132 = AnonymousClass000.A13();
        this.A02 = A132;
        this.A01 = new AnonymousClass0HO();
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        A13.add(view);
        A132.add(view);
        this.A00 = 1;
        setTag(2131431452, true);
    }
}
