package X;

import android.view.View;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4h8  reason: invalid class name and case insensitive filesystem */
public final class C92334h8 implements C108195bI {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ C107065Yg A01;
    public final /* synthetic */ BaseArEffectsViewModel A02;

    public C92334h8(View.OnClickListener onClickListener, C107065Yg r2, BaseArEffectsViewModel baseArEffectsViewModel) {
        this.A01 = r2;
        this.A02 = baseArEffectsViewModel;
        this.A00 = onClickListener;
    }

    public void Bsl() {
        Log.e("BaseArEffectsViewModel/doWithFlmConsentCheck/onError");
        C86214Qt r1 = (C86214Qt) this.A02.A0B.getValue();
        View.OnClickListener onClickListener = this.A00;
        C18070vi.A0d(onClickListener, 0);
        if (C72463Mc.A1a(r1.A04)) {
            r1.A03.setValue(new C92704hl(onClickListener));
        }
    }

    public void Bzd() {
        Log.i("BaseArEffectsViewModel/doWithFlmConsentCheck/onOptIn");
        C107065Yg r0 = this.A01;
        if (r0 != null) {
            r0.Bzd();
        }
    }

    public void onDismiss() {
        Log.i("BaseArEffectsViewModel/doWithFlmConsentCheck/onDismiss");
        C86214Qt r1 = (C86214Qt) this.A02.A0B.getValue();
        View.OnClickListener onClickListener = this.A00;
        C18070vi.A0d(onClickListener, 0);
        if (C72463Mc.A1a(r1.A04)) {
            r1.A03.setValue(new C92694hk(onClickListener));
        }
    }
}
