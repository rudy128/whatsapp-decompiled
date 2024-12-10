package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.4ZF  reason: invalid class name */
public final class AnonymousClass4ZF {
    public static final CoroutineExceptionHandler A02 = new C99864ta(CoroutineExceptionHandler.A00);
    public AnonymousClass1OX A00;
    public final AsyncTypefaceCache A01;

    public AnonymousClass4ZF(AsyncTypefaceCache asyncTypefaceCache, C18560wh r5) {
        this.A01 = asyncTypefaceCache;
        this.A00 = AnonymousClass1OW.A02(A02.plus(AnonymousClass4I9.A00).plus(r5).plus(new AnonymousClass1OE((AnonymousClass1OB) r5.get(AnonymousClass1OB.A00))));
    }

    public AnonymousClass4ZF() {
        this(new AsyncTypefaceCache(), AnonymousClass1OR.A00);
    }
}
