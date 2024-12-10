package X;

import java.util.List;

/* renamed from: X.0iO  reason: invalid class name and case insensitive filesystem */
public final class C10470iO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0V0 $headerItem;
    public final /* synthetic */ boolean $isLookingAhead;
    public final /* synthetic */ C17330uU $placementScopeInvalidator;
    public final /* synthetic */ List $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10470iO(AnonymousClass0V0 r2, C17330uU r3, List list, boolean z) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = r2;
        this.$isLookingAhead = z;
        this.$placementScopeInvalidator = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0QZ r6 = (AnonymousClass0QZ) obj;
        List list = this.$positionedItems;
        AnonymousClass0V0 r3 = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0V0 r0 = (AnonymousClass0V0) list.get(i);
            if (r0 != r3) {
                r0.A02(r6);
            }
        }
        AnonymousClass0V0 r02 = this.$headerItem;
        if (r02 != null) {
            r02.A02(r6);
        }
        this.$placementScopeInvalidator.getValue();
        return C27621Wu.A00;
    }
}
