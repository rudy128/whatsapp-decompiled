package androidx.compose.runtime;

import X.C17300uR;
import X.C17330uU;
import X.C18560wh;

public final class ProduceStateScopeImpl implements C17330uU, C17300uR {
    public final C18560wh A00;
    public final /* synthetic */ C17330uU A01;

    public Object getValue() {
        return this.A01.getValue();
    }

    public void setValue(Object obj) {
        this.A01.setValue(obj);
    }

    public ProduceStateScopeImpl(C17330uU r1, C18560wh r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public C18560wh getCoroutineContext() {
        return this.A00;
    }
}
