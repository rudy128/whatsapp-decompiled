package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public final class C09500go extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09500go(AbstractDraggableNode abstractDraggableNode) {
        super(1);
        this.this$0 = abstractDraggableNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0KX r6 = (AnonymousClass0KX) obj;
        return Boolean.valueOf(!AnonymousClass000.A1P((((AnonymousClass07C) this.this$0).A04.BDl(AnonymousClass0QY.A04(r6.A06, r6.A07)) > 0.0f ? 1 : (((AnonymousClass07C) this.this$0).A04.BDl(AnonymousClass0QY.A04(r6.A06, r6.A07)) == 0.0f ? 0 : -1))));
    }
}
