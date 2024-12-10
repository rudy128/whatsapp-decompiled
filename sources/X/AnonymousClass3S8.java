package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;

/* renamed from: X.3S8  reason: invalid class name */
public final class AnonymousClass3S8 extends ConstraintLayout implements C107805ac {
    public final Button A00 = ((Button) AnonymousClass1HF.A06(this, 2131434059));
    public final Button A01 = ((Button) AnonymousClass1HF.A06(this, 2131435001));
    public final WDSButtonGroup A02 = ((WDSButtonGroup) AnonymousClass1HF.A06(this, 2131428603));
    public final WaTextView A03 = AnonymousClass3MW.A0T(this, 2131430969);
    public final WDSHeader A04 = ((WDSHeader) AnonymousClass1HF.A06(this, 2131431358));

    public AnonymousClass3S8(Context context) {
        super(context, (AttributeSet) null);
        int A012 = AnonymousClass3MW.A01(context.getResources(), 2131169554);
        setPadding(A012, 0, A012, 0);
        setBackgroundColor(AnonymousClass3Ma.A00(context, 2130971948, 2131103048));
        View.inflate(context, 2131627186, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewState(X.AnonymousClass4CH r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.wds.components.internal.header.WDSHeader r1 = r4.A04
            X.4Uk r0 = r5.A02
            r1.setViewState(r0)
            java.lang.CharSequence r1 = r5.A03
            com.whatsapp.WaTextView r0 = r4.A03
            X.C43531zx.A04(r0, r1)
            r0.setText(r1)
            X.4Tx r3 = r5.A00
            X.4Tx r2 = r5.A01
            android.widget.Button r0 = r4.A00
            r1 = 4
            X.C84134Hz.A00(r0, r3, r1)
            android.widget.Button r0 = r4.A01
            X.C84134Hz.A00(r0, r2, r1)
            com.whatsapp.wds.components.button.WDSButtonGroup r1 = r4.A02
            if (r3 != 0) goto L_0x002c
            r0 = 8
            if (r2 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3S8.setViewState(X.4CH):void");
    }
}
