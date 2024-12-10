package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.ArrayList;

/* renamed from: X.81b  reason: invalid class name and case insensitive filesystem */
public final class C1585381b extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C112365lM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1585381b(C112365lM r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        ViewTreeObserver viewTreeObserver;
        C38251qy layoutManager;
        int i;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        UpdatesFragment updatesFragment = this.this$0.A0Z;
        UpdatesViewModel updatesViewModel = updatesFragment.A0P;
        if (A1Y) {
            if (updatesViewModel != null) {
                updatesViewModel.A0B = true;
                C22801Dg r1 = updatesViewModel.A0N;
                AnonymousClass72J r0 = (AnonymousClass72J) r1.A06();
                if (r0 != null) {
                    r0.A02 = true;
                }
                C137196v4.A00(r1);
            }
            ObservableRecyclerView observableRecyclerView = updatesFragment.A0C;
            if (observableRecyclerView == null || (layoutManager = observableRecyclerView.getLayoutManager()) == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass000.A13();
                int A0J = layoutManager.A0J();
                for (int i2 = 0; i2 < A0J; i2++) {
                    View A0P = layoutManager.A0P(i2);
                    if (A0P != null) {
                        Object tag = A0P.getTag();
                        if ((tag instanceof AnonymousClass6JB) && ((AnonymousClass6JB) tag).A01.A01() == 0) {
                            arrayList.add(A0P);
                            UpdatesViewModel updatesViewModel2 = updatesFragment.A0P;
                            if (updatesViewModel2 == null) {
                                continue;
                            } else {
                                AnonymousClass72J r02 = (AnonymousClass72J) updatesViewModel2.A0N.A06();
                                if (r02 != null) {
                                    i = r02.A07.size();
                                } else {
                                    i = 0;
                                }
                                if (i == arrayList.size()) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            ObservableRecyclerView observableRecyclerView2 = updatesFragment.A0C;
            if (!(observableRecyclerView2 == null || (viewTreeObserver = observableRecyclerView2.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnPreDrawListener(new AnonymousClass797(arrayList, updatesFragment, 4));
            }
        } else if (updatesViewModel != null) {
            updatesViewModel.A0B = false;
            C22801Dg r12 = updatesViewModel.A0N;
            AnonymousClass72J r03 = (AnonymousClass72J) r12.A06();
            if (r03 != null) {
                r03.A02 = false;
            }
            C137196v4.A00(r12);
        }
        return C27621Wu.A00;
    }
}
