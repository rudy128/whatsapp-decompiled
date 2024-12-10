package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.0f6  reason: invalid class name and case insensitive filesystem */
public final class C08440f6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1OX $$this$LaunchedEffect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08440f6(AnonymousClass1OX r2) {
        super(0);
        this.$$this$LaunchedEffect = r2;
    }

    /* renamed from: A00 */
    public final Float invoke() {
        return Float.valueOf(SuspendAnimationKt.A00(this.$$this$LaunchedEffect.getCoroutineContext()));
    }
}
