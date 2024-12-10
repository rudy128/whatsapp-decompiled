package com.whatsapp;

import X.A8Q;
import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass4ZR;
import X.AnonymousClass745;
import X.AnonymousClass7A1;
import X.C003401n;
import X.C108945cZ;
import X.C111935kf;
import X.C112595lj;
import X.C112685ls;
import X.C114815s2;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19740yt;
import X.C20005A2v;
import X.C20287AEv;
import X.C22632BGs;
import X.C28281Zt;
import X.C72453Mb;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;

public final class CatalogImageListActivity extends C114815s2 {
    public int A00;
    public int A01;
    public C20287AEv A02;
    public A8Q A03;
    public C20005A2v A04;
    public UserJid A05;

    public void onCreate(Bundle bundle) {
        int A08;
        boolean z = AnonymousClass745.A00;
        if (z) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        AnonymousClass4ZR r4 = new AnonymousClass4ZR(this);
        if (z) {
            Window window2 = getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds.excludeTarget(r4.A02(2131899525), true);
            changeBounds.excludeTarget(r4.A02(2131899524), true);
            changeBounds2.excludeTarget(r4.A02(2131899525), true);
            changeBounds2.excludeTarget(r4.A02(2131899524), true);
            C22632BGs bGs = new C22632BGs(this, r4, true);
            C22632BGs bGs2 = new C22632BGs(this, r4, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220);
            transitionSet.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(bGs);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(bGs2);
            window2.setSharedElementEnterTransition(transitionSet);
            window2.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(2131427474, true);
            fade.excludeTarget(2131428896, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(2131427474, true);
            fade2.excludeTarget(2131428896, true);
            fade.setDuration(220);
            fade2.setDuration(240);
            window2.setEnterTransition(fade);
            window2.setReturnTransition(fade2);
            if (bundle == null) {
                A2Y();
            }
        }
        AnonymousClass3MZ.A0F(this).setSystemUiVisibility(1792);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
        UserJid A042 = UserJid.Companion.A04(getIntent().getStringExtra("cached_jid"));
        if (A042 != null) {
            this.A05 = A042;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("product");
            if (parcelableExtra != null) {
                this.A02 = (C20287AEv) parcelableExtra;
                this.A00 = getIntent().getIntExtra("image_index", 0);
                setContentView(2131624373);
                RecyclerView recyclerView = (RecyclerView) findViewById(2131428894);
                C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) findViewById(2131428896));
                if (A0K != null) {
                    A0K.A0W(true);
                    C20287AEv aEv = this.A02;
                    if (aEv != null) {
                        A0K.A0S(aEv.A08);
                        C111935kf r0 = new C111935kf(this, new AnonymousClass4ZR(this));
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                        recyclerView.setAdapter(r0);
                        recyclerView.setLayoutManager(linearLayoutManager);
                        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 10691);
                        C20287AEv aEv2 = this.A02;
                        if (A052) {
                            if (aEv2 != null) {
                                int A082 = C108945cZ.A08(aEv2);
                                C20287AEv aEv3 = this.A02;
                                if (aEv3 != null) {
                                    A08 = C108945cZ.A0A(aEv3.A0B, A082);
                                }
                            }
                        } else if (aEv2 != null) {
                            A08 = C108945cZ.A08(aEv2);
                        }
                        C112595lj r12 = new C112595lj(A08, getResources().getDimensionPixelSize(2131165285));
                        recyclerView.A0r(r12);
                        AnonymousClass1HF.A0g(recyclerView, new AnonymousClass7A1(linearLayoutManager, r12, this));
                        recyclerView.A0t(new C112685ls(A0K, linearLayoutManager, r12, this, C19740yt.A00(this, AnonymousClass4Z9.A01(this, false)), AnonymousClass3Ma.A00(this, 2130968976, 2131100035), C19740yt.A00(this, AnonymousClass4Z9.A01(this, false))));
                        return;
                    }
                    C18070vi.A11("product");
                    throw null;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void onDestroy() {
        C20005A2v a2v = this.A04;
        if (a2v != null) {
            a2v.A02();
            super.onDestroy();
            return;
        }
        C18070vi.A11("loadSession");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
