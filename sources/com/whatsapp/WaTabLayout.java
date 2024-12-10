package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C108945cZ;
import X.C110915hU;
import X.C110945hX;
import X.C136836uU;
import X.C18000vb;
import X.C72473Md;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class WaTabLayout extends TabLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public void A0M(int i) {
        super.A0C(A00(this, i, false));
    }

    public void setTabsClickable(boolean z) {
        for (int i = 0; i < C108945cZ.A07(this); i++) {
            C136836uU A08 = A08(i);
            if (A08 != null) {
                A08.A02.setClickable(z);
            }
        }
    }

    public void setupTabsForAccessibility(View view) {
        View view2;
        AnonymousClass1HF.A0f(this, new C110945hX(this, 1));
        ArrayList arrayList = this.A0h;
        int size = arrayList.size() + 1;
        View[] viewArr = new View[size];
        viewArr[arrayList.size()] = view;
        for (int i = 0; i < arrayList.size(); i++) {
            C136836uU A0K = A0K(i);
            if (A0K != null) {
                viewArr[i] = A0K.A02;
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                view2 = null;
            } else {
                view2 = viewArr[i2 - 1];
            }
            AnonymousClass1HF.A0f(viewArr[i2], new C110915hU(view2, this, i2));
        }
    }

    public C136836uU A0K(int i) {
        if (i < 0 || i >= C108945cZ.A07(this)) {
            return null;
        }
        return super.A08(A00(this, i, false));
    }

    public void A0L() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (viewPager == null || (viewPager instanceof WaViewPager)) {
            TabLayout.A06(viewPager, this, false);
            return;
        }
        throw AnonymousClass000.A0k("WaTabLayout should only be setup with WaViewPager");
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0L();
        setLayoutDirection(0);
    }

    public static int A00(WaTabLayout waTabLayout, int i, boolean z) {
        int A07 = (z ? 1 : 0) + C108945cZ.A07(waTabLayout);
        if (i < 0 || i >= A07) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Tab index ");
            A10.append(i);
            A10.append(" is out of range [0, ");
            A10.append(A07);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0y(")", A10));
        } else if (!AnonymousClass3MY.A1b(waTabLayout.A00)) {
            return (A07 - i) - 1;
        } else {
            return i;
        }
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0L();
    }

    public WaTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0L();
        setLayoutDirection(0);
    }

    public WaTabLayout(Context context) {
        super(context, (AttributeSet) null);
        A0L();
        setLayoutDirection(0);
    }
}
