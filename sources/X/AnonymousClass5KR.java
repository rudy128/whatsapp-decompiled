package X;

import com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5KR  reason: invalid class name */
public final class AnonymousClass5KR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GoogleSearchContentBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5KR(GoogleSearchContentBottomSheet googleSearchContentBottomSheet) {
        super(0);
        this.this$0 = googleSearchContentBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        List<Object> A11 = AnonymousClass3MW.A11(this.this$0.A09);
        ArrayList A0D = C29351c6.A0D(A11);
        for (Object obj : A11) {
            A0D.add(obj.getClass());
        }
        Set A12 = C29431cG.A12(A0D);
        int i2 = 1;
        if (A12.size() == 1) {
            Object A0X = C29431cG.A0X(A12);
            if (C18070vi.A18(A0X, AnonymousClass46p.class)) {
                i = 0;
            } else if (C18070vi.A18(A0X, AnonymousClass46o.class)) {
                return 2;
            } else {
                if (!C18070vi.A18(A0X, C1776399u.class)) {
                    return null;
                }
                return Integer.valueOf(i2);
            }
        } else {
            i2 = 3;
            if (C72463Mc.A0D(this.this$0.A09) == 2) {
                if (!A12.contains(AnonymousClass46p.class)) {
                    i = 5;
                } else {
                    if (A12.contains(AnonymousClass46o.class)) {
                        if (A12.contains(C1776399u.class)) {
                            return null;
                        }
                        i = 4;
                    }
                    return Integer.valueOf(i2);
                }
            } else if (A12.size() != 3) {
                return null;
            } else {
                i = 6;
            }
        }
        return Integer.valueOf(i);
    }
}
