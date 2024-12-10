package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.78r  reason: invalid class name and case insensitive filesystem */
public final class C1422378r implements View.OnTouchListener {
    public float A00;
    public final TabLayout A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C151377mC(this));
    public final C18000vb A03;
    public final C18090vk A04;

    public C1422378r(TabLayout tabLayout, C18000vb r3, C18090vk r4) {
        C18070vi.A0d(tabLayout, 1);
        this.A01 = tabLayout;
        this.A03 = r3;
        this.A04 = r4;
    }

    public final boolean A00(float f) {
        boolean z;
        if ((f >= 0.0f || !AnonymousClass3MY.A1b(this.A03)) && (f <= 0.0f || !AnonymousClass3MW.A1Z(this.A03))) {
            z = false;
        } else {
            z = true;
        }
        TabLayout tabLayout = this.A01;
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        int i = -1;
        if (z) {
            i = 1;
        }
        int i2 = selectedTabPosition + i;
        if (i2 >= 0 && i2 < C108945cZ.A07(tabLayout)) {
            C18090vk r0 = this.A04;
            if (r0 != null) {
                r0.invoke();
            }
            C108985cd.A16(tabLayout, i2);
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 1);
        if (!((GestureDetector) this.A02.getValue()).onTouchEvent(motionEvent)) {
            return true;
        }
        return A00(this.A00);
    }
}
