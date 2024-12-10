package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4VX  reason: invalid class name */
public final class AnonymousClass4VX {
    public int A00;
    public int A01;
    public C107635aL A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final List A0B;
    public final C18000vb A0C;
    public final AnonymousClass19D A0D;

    public final void A03(LinearLayout linearLayout, C107635aL r19, int i, boolean z) {
        WaEditText waEditText;
        C89604cj r7;
        TextView waEditText2;
        LinearLayout linearLayout2 = linearLayout;
        C18070vi.A0d(linearLayout2, 1);
        this.A02 = r19;
        this.A03 = z;
        List list = this.A0B;
        list.clear();
        linearLayout2.removeAllViews();
        int i2 = i;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                boolean A1T = AnonymousClass000.A1T(i3, i / 2);
                boolean A1T2 = AnonymousClass000.A1T(i3, i2);
                if (A1T) {
                    waEditText2 = new WaTextView(this.A0A);
                    waEditText2.setBackgroundResource(2131233005);
                } else {
                    Context context = this.A0A;
                    waEditText2 = new WaEditText(new ContextThemeWrapper(context, 2132083741));
                    waEditText2.setBackgroundResource(2131233002);
                    waEditText2.setWidth(this.A08);
                    waEditText2.setHeight(this.A05);
                    waEditText2.setGravity(17);
                    waEditText2.getContext();
                    waEditText2.setTypeface(C43421zm.A00());
                    Resources resources = context.getResources();
                    int i4 = this.A07;
                    int i5 = 2131755478;
                    if (i4 == 1) {
                        i5 = 2131755477;
                    }
                    Object[] A1b = AnonymousClass3MW.A1b();
                    C17880vN.A1T(A1b, i2, 0);
                    C17880vN.A1T(A1b, list.size() + 1, 1);
                    waEditText2.setContentDescription(resources.getQuantityString(i5, i2, A1b));
                    if (i4 == 1) {
                        waEditText2.setInputType(ZipDecompressor.UNZIP_BUFFER_SIZE);
                    }
                    list.add(waEditText2);
                }
                waEditText2.setPadding(0, 0, 0, 0);
                linearLayout2.addView(waEditText2);
                boolean z2 = !A1T2;
                boolean z3 = !A1T;
                ViewGroup.LayoutParams layoutParams = waEditText2.getLayoutParams();
                C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (z2) {
                    layoutParams2.setMargins(this.A00, 0, this.A01, 0);
                }
                if (z3) {
                    layoutParams2.weight = this.A04;
                }
                layoutParams2.gravity = 17;
                waEditText2.setLayoutParams(layoutParams2);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (list.isEmpty()) {
            Log.i("CodeInputBoxManager/init/empty codeInputBoxes");
            return;
        }
        if (AnonymousClass3MW.A1Z(this.A0C)) {
            Collections.reverse(list);
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            WaEditText waEditText3 = null;
            if (i6 == 0) {
                waEditText = null;
            } else {
                waEditText = (WaEditText) list.get(i6 - 1);
            }
            WaEditText waEditText4 = (WaEditText) list.get(i6);
            if (i6 != AnonymousClass3MX.A01(list)) {
                waEditText3 = (WaEditText) list.get(i6 + 1);
            }
            boolean z4 = this.A03;
            C107635aL r11 = this.A02;
            int i7 = this.A07;
            if (z4) {
                C18070vi.A0d(waEditText4, 0);
                waEditText4.setTag(2131436093, r7);
                waEditText4.addTextChangedListener(r7);
                waEditText4.setTag(2131436093, r7);
                waEditText4.setOnKeyListener(new C90164dd(waEditText4, 3));
                new C90154dc(list);
            } else {
                r7 = new C89604cj(waEditText, waEditText4, waEditText3, r11, this, list, i6, i2, i7);
                waEditText4.addTextChangedListener(r7);
                waEditText4.setOnKeyListener(new C90164dd(waEditText4, 4));
            }
        }
        ((View) list.get(0)).requestFocus();
        ((WaEditText) list.get(0)).A0I(false);
        Boolean bool = C17970vW.A03;
    }

    public final void A01() {
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass3MW.A1S((TextView) list.get(i));
        }
        ((View) list.get(0)).requestFocus();
        ((WaEditText) list.get(0)).A0I(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            java.util.List r0 = r3.A0B
            java.util.Iterator r2 = r0.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.next()
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x001e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0006
        L_0x001e:
            r1.requestFocus()
            r0 = 0
            r1.A0I(r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VX.A02():void");
    }

    public final void A04(String str) {
        if (str == null || (r5 = str.length()) == 0) {
            A01();
            return;
        }
        List<TextView> list = this.A0B;
        for (TextView A1S : list) {
            AnonymousClass3MW.A1S(A1S);
        }
        int size = list.size();
        int i = 0;
        while (i < size && i < r5) {
            ((TextView) list.get(i)).setText(String.valueOf(str.charAt(i)));
            i++;
        }
    }

    public final void A05(boolean z) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            AnonymousClass3MX.A0E(it).setEnabled(z);
        }
    }

    public final boolean A06() {
        return AnonymousClass000.A1O(C18020vd.A05(C18040vf.A02, this.A0D, 9003) ? 1 : 0);
    }

    public final boolean A07() {
        return AnonymousClass000.A1O(C18020vd.A05(C18040vf.A02, this.A0D, 9570) ? 1 : 0);
    }

    public AnonymousClass4VX(Context context, C18000vb r5, AnonymousClass19D r6, C83894Hb r7) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int i;
        C18070vi.A0o(context, r5, r6);
        this.A0A = context;
        this.A0C = r5;
        this.A0D = r6;
        if (r7 != null) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168758);
        }
        this.A09 = dimensionPixelSize;
        this.A06 = context.getResources().getDimensionPixelSize(2131168754);
        if (r7 != null) {
            dimensionPixelSize2 = 0;
        } else {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168757);
        }
        this.A08 = dimensionPixelSize2;
        this.A05 = context.getResources().getDimensionPixelSize(2131168753);
        int i2 = 0;
        if (AnonymousClass3MY.A1b(r5)) {
            dimensionPixelSize3 = 0;
        } else {
            dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131168755);
        }
        this.A00 = dimensionPixelSize3;
        if (AnonymousClass3MY.A1b(r5)) {
            i = context.getResources().getDimensionPixelSize(2131168755);
        } else {
            i = 0;
        }
        this.A01 = i;
        this.A04 = r7 != null ? 1.0f : 0.0f;
        this.A07 = r7 != null ? 1 : i2;
        this.A0B = AnonymousClass000.A13();
    }

    public final String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Editable text = ((EditText) list.get(i)).getText();
            if (!(text == null || text.length() == 0)) {
                A10.append(AnonymousClass3MZ.A17((EditText) list.get(i)));
            }
        }
        return C18070vi.A0H(A10);
    }
}
