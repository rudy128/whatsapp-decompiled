package X;

import android.os.Bundle;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4gH  reason: invalid class name and case insensitive filesystem */
public class C91804gH implements AnonymousClass1GI {
    public final int A00;
    public final Object A01;

    public C91804gH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Bundle CGk() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) obj;
            C18070vi.A0d(messageSelectionViewModel, 0);
            AnonymousClass4S9 r0 = (AnonymousClass4S9) messageSelectionViewModel.A00.A06();
            Bundle A0D = C17880vN.A0D();
            if (r0 == null) {
                return A0D;
            }
            Collection A002 = r0.A00();
            C18070vi.A0X(A002);
            ArrayList A0D2 = C29351c6.A0D(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                C72463Mc.A1L(A0D2, it);
            }
            AnonymousClass4aU.A0C(A0D, A0D2);
            return A0D;
        }
        BaseArEffectsViewModel.A05((BaseArEffectsViewModel) obj, AnonymousClass00R.A01);
        return C17880vN.A0D();
    }
}
