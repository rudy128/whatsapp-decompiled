package com.whatsapp.wds.components.edittext;

import X.AnonymousClass03S;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Rn;
import X.AnonymousClass4DR;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C29261bv;
import X.C72453Mb;
import X.C99074sE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.Iterator;

public class WDSEditText extends AnonymousClass3Rn {
    public C18030ve A00;
    public AnonymousClass4DR A01;
    public final C18100vl A02;
    public final C18100vl A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969419);
        C18070vi.A0d(context, 1);
    }

    private final int getTextPaddingHorizontal() {
        return C72453Mb.A0I(this.A02);
    }

    private final int getTextPaddingVertical() {
        return C72453Mb.A0I(this.A03);
    }

    public final C18030ve getAbp() {
        return this.A00;
    }

    public final void setAbp(C18030ve r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18030ve r2;
        Object obj;
        C18070vi.A0d(context, 1);
        A0G();
        this.A02 = AnonymousClass1DF.A01(new C99074sE(context, 1));
        this.A03 = AnonymousClass1DF.A01(new C99074sE(context, 2));
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A08;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i2 = obtainStyledAttributes.getInt(0, -1);
            Iterator it = AnonymousClass4DR.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AnonymousClass4DR) obj).id == i2) {
                    break;
                }
            }
            AnonymousClass4DR r1 = (AnonymousClass4DR) obj;
            this.A01 = r1 == null ? AnonymousClass4DR.NONE : r1;
            obtainStyledAttributes.recycle();
        }
        if (this.A01 == AnonymousClass4DR.OUTLINE && (r2 = this.A00) != null && C18020vd.A05(C18040vf.A01, r2, 11695)) {
            setBackground(new InsetDrawable(AnonymousClass03S.A01(getContext(), 2131232947), getPaddingStart(), 0, getPaddingEnd(), 0));
            super.setPadding(C72453Mb.A0I(this.A02) + getPaddingStart(), C72453Mb.A0I(this.A03), C72453Mb.A0I(this.A02) + getPaddingEnd(), C72453Mb.A0I(this.A03));
            TypedValue typedValue = new TypedValue();
            AnonymousClass3Ma.A06(this).resolveAttribute(2130971534, typedValue, true);
            C29261bv.A08(this, typedValue.resourceId);
            setHintTextColor(C19740yt.A00(getContext(), 2131102506));
        }
    }

    public /* synthetic */ WDSEditText(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    public /* synthetic */ WDSEditText(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSEditText(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
