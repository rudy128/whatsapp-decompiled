package androidx.fragment.app;

import X.AnonymousClass000;
import X.AnonymousClass79J;
import X.C17880vN;
import X.C21466AkX;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public abstract class ListFragment extends Fragment {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new AnonymousClass79J(this, 0);
    public final Runnable A09 = new C21466AkX((Object) this, 9);

    public static void A00(ListFragment listFragment) {
        if (listFragment.A04 == null) {
            View view = listFragment.A0B;
            if (view != null) {
                if (view instanceof ListView) {
                    listFragment.A04 = (ListView) view;
                } else {
                    TextView A0E = C17880vN.A0E(view, 16711681);
                    listFragment.A05 = A0E;
                    if (A0E == null) {
                        listFragment.A00 = view.findViewById(16908292);
                    } else {
                        A0E.setVisibility(8);
                    }
                    listFragment.A02 = view.findViewById(16711682);
                    listFragment.A01 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        listFragment.A04 = listView;
                        View view2 = listFragment.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                listFragment.A06 = true;
                listFragment.A04.setOnItemClickListener(listFragment.A08);
                ListAdapter listAdapter = listFragment.A03;
                if (listAdapter != null) {
                    listFragment.A03 = null;
                    listFragment.A25(listAdapter);
                } else if (listFragment.A02 != null) {
                    A00(listFragment);
                    View view3 = listFragment.A02;
                    if (view3 == null) {
                        throw AnonymousClass000.A0n("Can't be used with a custom content view");
                    } else if (listFragment.A06) {
                        listFragment.A06 = false;
                        view3.clearAnimation();
                        listFragment.A01.clearAnimation();
                        listFragment.A02.setVisibility(0);
                        listFragment.A01.setVisibility(8);
                    }
                }
                listFragment.A07.post(listFragment.A09);
                return;
            }
            throw AnonymousClass000.A0n("Content view not yet created");
        }
    }

    public void A1s() {
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        super.A1s();
    }

    public void A25(ListAdapter listAdapter) {
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(this.A03);
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !A1W) {
                if (A17().getWindowToken() != null) {
                    z = true;
                }
                A00(this);
                View view = this.A02;
                if (view == null) {
                    throw AnonymousClass000.A0n("Can't be used with a custom content view");
                } else if (!this.A06) {
                    this.A06 = true;
                    if (z) {
                        view.startAnimation(AnimationUtils.loadAnimation(A1n(), 17432577));
                        this.A01.startAnimation(AnimationUtils.loadAnimation(A1n(), 17432576));
                    } else {
                        view.clearAnimation();
                        this.A01.clearAnimation();
                    }
                    this.A02.setVisibility(8);
                    this.A01.setVisibility(0);
                }
            }
        }
    }
}
