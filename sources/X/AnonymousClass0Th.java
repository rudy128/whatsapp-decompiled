package X;

import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.model.TabCallbackDelegateImpl;

/* renamed from: X.0Th  reason: invalid class name */
public class AnonymousClass0Th implements C15970rV {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AnonymousClass0Th(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void BIx() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((InputCallbackDelegateImpl.OnInputCallbackStub) obj).m11lambda$onInputTextChanged$1$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(this.A02);
                break;
            case 1:
                ((InputCallbackDelegateImpl.OnInputCallbackStub) obj).m10lambda$onInputSubmitted$0$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(this.A02);
                break;
            case 2:
                ((SearchCallbackDelegateImpl.SearchCallbackStub) obj).m17lambda$onSearchSubmitted$1$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(this.A02);
                break;
            case 3:
                ((SearchCallbackDelegateImpl.SearchCallbackStub) obj).m18lambda$onSearchTextChanged$0$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(this.A02);
                break;
            default:
                ((TabCallbackDelegateImpl.TabCallbackStub) obj).m19lambda$onTabSelected$0$androidxcarappmodelTabCallbackDelegateImpl$TabCallbackStub(this.A02);
                break;
        }
        throw null;
    }
}
