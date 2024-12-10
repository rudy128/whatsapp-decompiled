package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;

/* renamed from: X.7AD  reason: invalid class name */
public final class AnonymousClass7AD implements C218317o {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ CsatSurveyBloksActivity A01;

    public AnonymousClass7AD(Fragment fragment, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        this.A00 = fragment;
        this.A01 = csatSurveyBloksActivity;
    }

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onFragmentDestroyed() {
        this.A00.A0L.A06(this);
        this.A01.finish();
    }
}
