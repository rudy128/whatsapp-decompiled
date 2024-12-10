package com.whatsapp.gallerypicker;

import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4FQ;
import X.AnonymousClass745;
import X.C003401n;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C20050A4v;
import X.C28281Zt;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C75223eC;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class MediaPicker extends C75223eC {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;

    public void C81(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C81(r2);
        C72463Mc.A0t(this);
    }

    public void C82(AnonymousClass02B r3) {
        C18070vi.A0d(r3, 0);
        super.C82(r3);
        C28281Zt.A0A(getWindow(), false);
        C72473Md.A0o(this);
    }

    public void onCreate(Bundle bundle) {
        A2r(5);
        if (AnonymousClass745.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            window.setEnterTransition(inflateTransition);
            window.setReturnTransition(inflateTransition2);
            A2Y();
        }
        C72463Mc.A0t(this);
        super.onCreate(bundle);
        setContentView(2131625968);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(AnonymousClass3Ma.A00(this, 2130969991, 2131101077));
        setTitle(2131890611);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(2131429510);
        ((ViewGroup) AnonymousClass3MY.A0C(this, 2131432242)).addView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
        if (bundle == null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            int id = frameLayout.getId();
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                A0H.A08((Fragment) r0.get(), id);
                A0H.A01();
                View view = new View(this);
                C72463Mc.A0v(view.getContext(), view.getContext(), view, 2130969386, 2131100378);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil((double) (AnonymousClass3Ma.A09(view).density / 2.0f))));
                frameLayout.addView(view);
                return;
            }
            C18070vi.A11("mediaPickerFragment");
            throw null;
        }
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0O = getSupportFragmentManager().A0O(2131429510);
        if (A0O != null) {
            A0O.A1w(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass745.A07(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((C20050A4v) r0.get()).A02(64, 1, 1);
            AnonymousClass4FQ.A00(this);
            return true;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }
}
