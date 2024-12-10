package X;

import com.whatsapp.calling.callsuggestions.SuggestionRunBlockingCancelable$invoke$1;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: X.4Q1  reason: invalid class name */
public final class AnonymousClass4Q1 {
    public boolean A00 = true;
    public final AnonymousClass190 A01;

    public AnonymousClass4Q1(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final Object A00(AnonymousClass1OS r6) {
        try {
            return AnonymousClass4GT.A00(AnonymousClass1OR.A00, new SuggestionRunBlockingCancelable$invoke$1((C30391dr) null, r6));
        } catch (C99814tV unused) {
            if (this.A00) {
                Log.e("FrequentlyAddedToCallStore job timed out");
                this.A01.A0G("FrequentlyCalledStore/fetch", "{ timeout }", false);
                this.A00 = false;
                return null;
            }
            return null;
        } catch (CancellationException e) {
            C17900vP.A0X(e, "FrequentlyAddedToCallStore job was cancelled; reason: ", AnonymousClass000.A10());
            return null;
        }
    }
}
